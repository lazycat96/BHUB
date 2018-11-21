package com.example.qr_readerexample;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class myName extends AppCompatActivity {
    public static EditText username;
   public SharedPreferences sPref;
    public Button done, done2;

    final String SAVED_TEXT = "saved_text";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_name);
        done = (Button) findViewById(R.id.done);
        done2 = (Button) findViewById(R.id.done2);
        username = (EditText) findViewById(R.id.username);
        SharedPreferences pref = getSharedPreferences("main", MODE_PRIVATE);
        String text = pref.getString("my_string", "").toString();
        username.setText(text);
       // ASCIIToHex.main();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem myItem = menu.findItem(R.id.nnn);
         myItem.setTitle(myName.username.getText().toString());
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.mast :
                Intent intent = new Intent(myName.this,Identify.class);
                startActivity(intent);
                return true;
            case R.id.gst:
                return true;
            case R.id.qr:
                intent = new Intent(myName.this,DecoderActivity.class);
                startActivity(intent);
                return true;
            case R.id.nnn :
                intent = new Intent(myName.this,MainActivity.class);
                startActivity(intent);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
    public   void done(View view) {
        Intent intent = new Intent(myName.this, MainActivity.class);
        startActivity(intent);
        String text = username.getText().toString();
        SharedPreferences pref = getSharedPreferences("main", MODE_PRIVATE);
        SharedPreferences.Editor editPref = pref.edit();
        editPref.putString("my_string", text);
        editPref.commit();

    }
    public   void done2(View view) {
        Intent intent = new Intent(myName.this, Identify.class);
        startActivity(intent);
            }


    public static class ASCIIToHex {

        public static String main() {


            String ascii = username.getText().toString();


            // Step-1 - Convert ASCII string to char array
            char[] ch = ascii.toCharArray();

            // Step-2 Iterate over char array and cast each element to Integer.
            StringBuilder builder = new StringBuilder();

            for (char c : ch) {
                int i = (int) c;
                // Step-3 Convert integer value to hex using toHexString() method.
                builder.append(Integer.toHexString(i).toUpperCase());
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("HHmm");
            dateFormat.format( new Date() );
            System.out.println(dateFormat.format(new Date()));
            String name = dateFormat.format(new Date()) + builder.toString();

            System.out.println("ASCII = " + ascii);
            System.out.println("Hex = " + builder.toString());
            System.out.println(dateFormat.format(new Date()) + builder.toString());
            return name;
        }
    }
}
