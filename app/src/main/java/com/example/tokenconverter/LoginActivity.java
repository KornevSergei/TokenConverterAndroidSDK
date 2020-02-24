package com.example.tokenconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {


    //обьявляем переменные
    private EditText username;
    private EditText password;
    private ImageView login;
    private ImageView signIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //связываем
        username = findViewById(R.id.nameView);
        password = findViewById(R.id.passwordView);
        login = findViewById(R.id.toComeIn);
        signIn = findViewById(R.id.signUp);


    }

    //описываем кнопку Войти
    public void login(View view) {
        //делаем проверку на логин и пароль, если всё ок - выводим линный Тост и открываем новую активити
        if (username.getText().toString().equals("Sergei") &&
                password.getText().toString().equals("0000")) {
            Toast.makeText(getApplicationContext(), "Вход выполнен", Toast.LENGTH_SHORT).show();

            //выполняем переход на другой экран
            Intent intent = new Intent(LoginActivity.this, ChoiceActivity.class);
            startActivity(intent);

            //если данные введены неверное - выводим длинный тост с уведовмлением
        } else {
            Toast.makeText(getApplicationContext(), "Неверные данные!", Toast.LENGTH_SHORT).show();

        }
    }

    //описываем кнопку Регистрации, открываем новое окно при нажатии
    public void signIn(View view) {
        Intent intent = new Intent(LoginActivity.this, SignInActivity.class);
        startActivity(intent);
    }
}