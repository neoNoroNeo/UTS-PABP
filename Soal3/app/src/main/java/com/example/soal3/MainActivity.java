package com.example.soal3;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText etNama, etNim, etProdi, etAlamat;
    private Button btnAlertDialog, btnToast, btnChangeBg, btnReset, btnExit;
    private RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        etNama = findViewById(R.id.etNama);
        etNim = findViewById(R.id.etNim);
        etProdi = findViewById(R.id.etProdi);
        etAlamat = findViewById(R.id.etAlamat);
        btnAlertDialog = findViewById(R.id.btnAlertDialog);
        btnToast = findViewById(R.id.btnToast);
        btnChangeBg = findViewById(R.id.btnChangeBg);
        btnReset = findViewById(R.id.btnReset);
        btnExit = findViewById(R.id.btnExit);
        mainLayout = findViewById(R.id.mainLayout);

        // Alert Dialog Button
        btnAlertDialog.setOnClickListener(view -> showAlertDialog());

        // Toast Button
        btnToast.setOnClickListener(view ->
                Toast.makeText(MainActivity.this, "Ini adalah Toast Message!", Toast.LENGTH_SHORT).show()
        );

        // Change Background Color Button
        btnChangeBg.setOnClickListener(view -> changeBackgroundColor());

        // Reset Button
        btnReset.setOnClickListener(view -> resetFields());

        // Exit Button
        btnExit.setOnClickListener(view -> finish());
    }

    // Show Alert Dialog with inputted data
    private void showAlertDialog() {
        String nama = etNama.getText().toString();
        String nim = etNim.getText().toString();
        String prodi = etProdi.getText().toString();
        String alamat = etAlamat.getText().toString();

        String message = nama + "\n" + nim + "\n" + prodi + "\n" + alamat;

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Pesan Dalam Kotak Dialog")
                .setMessage(message)
                .setNeutralButton("Neutral", null)
                .setNegativeButton("Negative", null)
                .setPositiveButton("Positive", null)
                .show();
    }

    // Change Background Color Randomly
    private void changeBackgroundColor() {
        Random random = new Random();
        int color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        mainLayout.setBackgroundColor(color);
    }

    // Reset Input Fields
    private void resetFields() {
        etNama.setText("");
        etNim.setText("");
        etProdi.setText("");
        etAlamat.setText("");
        mainLayout.setBackgroundColor(Color.WHITE);
    }
}
