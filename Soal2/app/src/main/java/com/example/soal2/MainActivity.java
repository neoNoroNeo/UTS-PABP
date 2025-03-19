package com.example.soal2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editLength, editWidth;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        editLength = findViewById(R.id.edit_length);
        editWidth = findViewById(R.id.edit_width);
        textResult = findViewById(R.id.text_result);
        Button buttonCalculate = findViewById(R.id.button_calculate);
        Button buttonClear = findViewById(R.id.button_clear);

        // Calculate button action
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });

        // Clear button action
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editLength.setText("");
                editWidth.setText("");
                textResult.setText("Luas =");
            }
        });
    }

    private void calculateArea() {
        String lengthStr = editLength.getText().toString();
        String widthStr = editWidth.getText().toString();

        if (!lengthStr.isEmpty() && !widthStr.isEmpty()) {
            double length = Double.parseDouble(lengthStr);
            double width = Double.parseDouble(widthStr);
            double area = length * width;

            textResult.setText("Luas = " + area);
        } else {
            textResult.setText("Masukkan panjang dan lebar!");
        }
    }
}
