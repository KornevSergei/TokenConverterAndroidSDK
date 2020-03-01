package com.example.tokenconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }


    //описываем кнопу Регистрации
    public void signIn(View view){
        Toast.makeText(getApplicationContext(), "В данный момент регистрация недоступна!", Toast.LENGTH_SHORT).show();
    }
}
