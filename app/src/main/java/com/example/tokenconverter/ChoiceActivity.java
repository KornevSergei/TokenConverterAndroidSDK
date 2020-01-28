package com.example.tokenconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChoiceActivity extends AppCompatActivity {

    //значение начальных переменных для кнопок
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
        TextView counter = findViewById(R.id.initialToConvert);
        counter.setText("" + quantityToken);
    }

    // создаём действие кнопки Плюс и выводим сразу результат
    public void increaseQuantityOne(View view) {
        quantityOne++;
        TextView counter1 = findViewById(R.id.initialToProduct1);
        counter1.setText("" + quantityOne);
        //вызываем метод для общей суммы
        orderPrice();
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
        orderPrice();
    }

    // создаём действие кнопки Плюс
    public void increaseQuantityTwo(View view) {
        quantityTwo++;
        TextView counter2 = findViewById(R.id.initialToProduct2);
        counter2.setText("" + quantityTwo);
        orderPrice();
    }

    // создаём действие кнопки Минус
    public void decreaseQuantityTwo(View view) {
        //блокируем на уход в минус
        quantityTwo--;
        if (quantityTwo < 0) {
            quantityTwo = 0;
        }
        TextView counter2 = findViewById(R.id.initialToProduct2);
        counter2.setText("" + quantityTwo);
        orderPrice();
    }

    public void orderPrice() {
//   сразу меняем значение цены при нажатии
        TextView tokenAmount = findViewById(R.id.tokenAmount);
        //Приводимс тринг к Инт
        int a = Integer.parseInt(String.valueOf(quantityOne));
        int b = Integer.parseInt(String.valueOf(quantityTwo));
//        tokenAmount.setText("" + quantityOne + "" + quantityTwo);
        //считаем сумму и приводим к строке
        tokenAmount.setText("" + (a + (b * 2)));


    }

}

