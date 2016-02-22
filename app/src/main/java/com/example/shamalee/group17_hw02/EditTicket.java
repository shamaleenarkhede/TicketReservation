package com.example.shamalee.group17_hw02;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class EditTicket extends AppCompatActivity {

    public EditText etdate;
    public DatePicker frmdate;
    public SimpleDateFormat dateFormatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_ticket);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        findViewById(R.id.et_date).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etdate = (EditText) findViewById(R.id.et_date);
                etdate.setInputType(InputType.TYPE_NULL);
                etdate.requestFocus();

                final Calendar newCalendar = Calendar.getInstance();
                frmdate = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        Calendar newDate = Calendar.getInstance();
                        newDate.set(year, monthOfYear, dayOfMonth);
                        etdate.setText(dateFormatter.format(newDate.getTime()));


                }
            }
        });


    }
}
