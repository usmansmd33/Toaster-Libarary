package com.example.toasterlibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

    public static void letsStart (Context c) {
        c.startActivity(new Intent(c, Calculator.class));
    }

    public static void display(Context c, int result) {
        s(c,"The Result is : "+result);
    }
}
