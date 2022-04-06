package com.example.servertest;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.Locale;


public class MainActivity extends AppCompatActivity  {
    String l;
    EditText el;
    TextView r;


    TextView tv;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        el = (EditText) findViewById(R.id.editTextTextPersonName2);


    }



    public void send(View v) throws IOException {
        Client c = new Client();
        String msg =el.getText().toString();
        c.execute(msg);
        Toast.makeText(this, msg.toUpperCase(Locale.ROOT), Toast.LENGTH_SHORT).show();

    }



}












