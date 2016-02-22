package com.example.shamalee.group17_hw02;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Collections;
import java.util.LinkedList;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // LinkedList llticket = new LinkedList();

       // Intent createticketintent = new Intent();
       // createticketintent.putExtra("", llticket);
       // startActivity(createticketintent);



        findViewById(R.id.btneditticket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editticketintent = new Intent(MainActivity.this,EditTicket.class);
                startActivity(editticketintent);
            }
        });


        // Phone Call Intent

        findViewById(R.id.btn_phonecall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone = "+9999999999";
                Intent phonecallintent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(phonecallintent);
            }
        });

    }
}
