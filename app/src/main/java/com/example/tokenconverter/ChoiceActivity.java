package com.example.tokenconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ChoiceActivity extends AppCompatActivity {

    //значение начальных переменных для кнопок
    private int quantityToken = 0;
    private int quantityOne = 0;
    private int quantityTwo = 0;
    private int amount = 1000;


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
        //ызываем метод конвертации только на плюс
        tokenConversion();
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

        tokenConversion();
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
        TextView tokenAmount = findViewById(R.id.tokenAmount);//результат
        //Приводим Стринг к Инт
        int a = Integer.parseInt(String.valueOf(quantityOne));//начальное значение
        int b = Integer.parseInt(String.valueOf(quantityTwo));//второе значение
        //считаем сумму и приводим к строке
        tokenAmount.setText("" + (a + (b * 2)));
    }


    //передаём преждварительный результат в токены
    public void tokenConversion() {

        TextView getInitialTokens = findViewById(R.id.getInitialTokens);
        //Приводим Стринг к Инт
        int c = Integer.parseInt(String.valueOf(amount));//начальное значение 1000р
        int d = Integer.parseInt(String.valueOf(quantityToken));//количетсво введенных токенов
        if (d * 250 > c) {
            Toast.makeText(getApplicationContext(), "Недостаточно средств", Toast.LENGTH_SHORT).show();
        } else {
            getInitialTokens.setText("" + d);
        }
    }

    //получили токены из переведнных средств
    public void convert(View view) {
        TextView initialTokens = findViewById(R.id.initialTokens);
        TextView getInitialTokens = findViewById(R.id.getInitialTokens);
        initialTokens.setText(getInitialTokens.getText());

    }

    public void toFormQR(View view) {
            Intent intent = new Intent(ChoiceActivity.this, QRActivity.class);
            startActivity(intent);
    }

    public void replenishAccount(View view) {
    }
}




