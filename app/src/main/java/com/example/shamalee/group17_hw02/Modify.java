package com.example.shamalee.group17_hw02;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Modify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

        findViewById(R.id.name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // @Override
                // public Dialog onCreateDialog(Bundle savedInstanceState) {
                //   AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                // builder.setTitle(R.string.pick_color)
                //       .setItems(R.array.colors_array, new DialogInterface.OnClickListener() {
                //         public void onClick(DialogInterface dialog, int which) {
                // The 'which' argument contains the index position
                // of the selected item
                //       }
                // });
                // return builder.create();            }
                //});

            }
        }
    }
}
