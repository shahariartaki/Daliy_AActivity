package com.example.daliyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    Button login,register;
    CircleImageView imageView;
    TextInputEditText email,password;
    String a="taki@gmail.com";
    String b="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.Login);
        register=findViewById(R.id.Registration);
        imageView=findViewById(R.id.profile_image);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Register.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //email.getText().toString();
                //password.getText().toString();

                String mail=email.getText().toString();
                String pas=password.getText().toString();
                //String a="admin";
                //String b="123456";
                //(mail.contains("admin") && pas.contains("123456"))
                if (mail.contains("@") && mail.equals(a) && pas.equals(b)){
                    Intent intent = new Intent(MainActivity.this,User.class);
                    Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }

                else {
                    Toast.makeText(MainActivity.this,"email or password incorrect",Toast.LENGTH_LONG).show();
                    email.setError("Email is not valid");
                    email.requestFocus();
                    password.setError("password is not valid");
                    password.requestFocus();
                }

            }
        });
    }
}
