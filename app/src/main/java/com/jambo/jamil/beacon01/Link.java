package com.jambo.jamil.beacon01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Link extends AppCompatActivity {
private Button login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        login = (Button) findViewById(R.id.button_login);
        password = (EditText) findViewById(R.id.edit_password);



    }



    public void Login(View view) {
        ASCIIToHex.main();


//        // Если введенные логин и пароль будут словом "admin",
//        // показываем Toast сообщение об успешном входе:
//        if (password.getText().toString().equals(ASCIIToHex.main())) {
//            Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();
//
////            // Выполняем переход на другой экран:
            Intent intent = new Intent(Link.this,MainActivity.class);
            startActivity(intent);
//      }
////
////        // В другом случае выдаем сообщение с ошибкой:
//        else {
//                Toast.makeText(getApplicationContext(), "Неправильные данные!",Toast.LENGTH_SHORT).show();
//
//            }
    }
    public static class ASCIIToHex {

        public static String main() {
            myName.loginname.main();
            String ascii = myName.loginname.main();

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

