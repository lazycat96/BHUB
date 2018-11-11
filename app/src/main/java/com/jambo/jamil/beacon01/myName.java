package com.jambo.jamil.beacon01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class myName extends AppCompatActivity {
    public static EditText username;

    public Button done;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_name);
        done = (Button) findViewById(R.id.done);
        username = (EditText) findViewById(R.id.username);
       // ASCIIToHex.main();

    }
    public   void done(View view) {
        loginname.main();
        Intent intent = new Intent(myName.this, Link.class);
        startActivity(intent);
    }
    public static class loginname {

        public static String main() {
            String myusername = username.getText().toString();
            return myusername;


    }}

//    public static class ASCIIToHex {
//
//        public static String main() {
//           loginname.main();
//            String ascii = myName.loginname.main();
//
//            // Step-1 - Convert ASCII string to char array
//            char[] ch = ascii.toCharArray();
//
//            // Step-2 Iterate over char array and cast each element to Integer.
//            StringBuilder builder = new StringBuilder();
//
//            for (char c : ch) {
//                int i = (int) c;
//                // Step-3 Convert integer value to hex using toHexString() method.
//                builder.append(Integer.toHexString(i).toUpperCase());
//            }
//            SimpleDateFormat dateFormat = new SimpleDateFormat("HHmm");
//            dateFormat.format( new Date() );
//            System.out.println(dateFormat.format(new Date()));
//            String name = dateFormat.format(new Date()) + builder.toString();
//
//            System.out.println("ASCII = " + ascii);
//            System.out.println("Hex = " + builder.toString());
//            System.out.println(dateFormat.format(new Date()) + builder.toString());
//            return name;
//        }
//    }
}
