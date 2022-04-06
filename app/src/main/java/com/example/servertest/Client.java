package com.example.servertest;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.net.Socket;
import android.os.AsyncTask;
import android.util.PrintWriterPrinter;
import android.widget.EditText;

import java.io.*;
import java.util.Locale;

public class Client extends AsyncTask<String,Void,Void> {

    Socket s;
    PrintWriter pw;
    DataOutputStream out;
    InputStreamReader isr;
    BufferedReader in;
    String line;
    String r;
    public AsyncResponse ar = null;



    @Override
    protected Void doInBackground(String... strings) {
        line = strings[0];
        try {
            s = new Socket("192.168.1.115", 5566);
            isr = new InputStreamReader(s.getInputStream());
            out = new DataOutputStream(s.getOutputStream());
            in = new BufferedReader(isr);
            out.writeUTF(line);
            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }



}

