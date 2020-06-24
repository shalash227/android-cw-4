package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);


        final EditText first = findViewById (R.id.first);
        final EditText second = findViewById (R.id.second);

        FloatingActionButton plus = findViewById (R.id.plus);
        FloatingActionButton minus = findViewById (R.id.minus);





        plus.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                 int firstdigit = Integer.parseInt (first.getText ().toString ());

                 int seconddigit = Integer.parseInt (second.getText ().toString ());

                int plustotal= firstdigit+seconddigit;

                Toast.makeText (MainActivity.this, "The answer is " + plustotal, Toast.LENGTH_LONG).show ();
            }
        });


        minus.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                 int firstdigit = Integer.parseInt (first.getText ().toString ());

                 int seconddigit = Integer.parseInt (second.getText ().toString ());

                int minustotal= firstdigit+seconddigit;

                Toast.makeText (MainActivity.this, "The answer is " + minustotal, Toast.LENGTH_LONG).show ();
            }
        });



    }
}