package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**app displays an order form to order coffee.*/
public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**method is called when the increment (+) button is clicked*/
    public void increment(View view) {
        quantity++;
        display(quantity);
    }

    /**method is called when the decrement (-) button is clicked*/
    public void decrement(View view) {
        quantity--;
        display(quantity);
    }

    /**method is called when the order button is clicked*/
    public void submitOrder(View view) {
        String message;
        if (quantity > 0) {
            message = "Total: $" + (quantity * 5) + "\nThank you!";
        } else {
            message = "No coffee for you!!";
        }
        displayMessage(message);
        //displayPrice(quantity*5);
    }

    /**method displays the given quantity value on the screen*/
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**method displays the given price value on the screen*/
    private void displayPrice(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**method displays a given message on the screen*/
    private void displayMessage(String msg) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(msg);
    }
}