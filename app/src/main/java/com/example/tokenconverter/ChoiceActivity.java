package com.example.tokenconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChoiceActivity extends AppCompatActivity {

    int quantityToken = 0;
    int quantityOne = 0;
    int quantityTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    // создаём действие кнопки Плюс
    public void increaseQuantityToken(View view) {
        quantityToken++;
        TextView counter1 = findViewById(R.id.initialToConvert);
        counter1.setText("" + quantityToken);
    }

    // создаём действие кнопки Минус
    public void decreaseQuantityToken(View view) {
        //блокируем на уход в минус
        quantityToken--;
        if (quantityToken < 0) {
            quantityToken = 0;
        }
        TextView counter1 = findViewById(R.id.initialToConvert);
        counter1.setText("" + quantityTwo);
    }

    // создаём действие кнопки Плюс и выводим сразу результат
    public void increaseQuantityOne(View view) {
        quantityOne++;
        TextView counter1 = findViewById(R.id.initialToProduct1);
        counter1.setText("" + quantityOne);
        //сразу меняем значение цены при нажатии
//        TextView priceTextView = findViewById(R.id.tokenAmount);
//        priceTextView.setText("" + quantityOne * price);
    }

    // создаём действие кнопки Минус и выводим сразу результат
    public void decreaseQuantityOne(View view) {
        //блокируем на уход в минус
        quantityOne--;
        if (quantityOne < 0) {
            quantityOne = 0;
        }
        TextView counter1 = findViewById(R.id.initialToProduct1);
        counter1.setText("" + quantityOne);
        //сразу меняем значение цены при нажатии
//        TextView priceTextView = findViewById(R.id.tokenAmount);
//        priceTextView.setText("" + quantityOne * price);

    }

    // создаём действие кнопки Плюс
    public void increaseQuantityTwo(View view) {
        quantityTwo++;
        TextView counter1 = findViewById(R.id.initialToProduct2);
        counter1.setText("" + quantityTwo);
    }

    // создаём действие кнопки Минус
    public void decreaseQuantityTwo(View view) {
        //блокируем на уход в минус
        quantityTwo--;
        if (quantityTwo < 0) {
            quantityTwo = 0;
        }
        TextView counter1 = findViewById(R.id.initialToProduct2);
        counter1.setText("" + quantityTwo);
    }
}

