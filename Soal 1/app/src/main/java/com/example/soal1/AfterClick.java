package com.example.soal1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AfterClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_click); // Pastikan ini sesuai dengan nama XML Anda

        // Cari tombol dari XML
        Button buttonClick = findViewById(R.id.button_click);
        Button buttonClear = findViewById(R.id.button_clear);

        // Pindah ke MainActivity saat tombol diklik
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AfterClick.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Tambahkan fungsi Clear (Opsional)
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kosongkan fungsi atau tambahkan aksi lainnya
            }
        });
    }
}