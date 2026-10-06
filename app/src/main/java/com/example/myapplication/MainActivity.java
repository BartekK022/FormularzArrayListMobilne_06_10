package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerKolor;
    SeekBar seekBarRozmiarCzcionki;
    Button buttonZamien;
    TextView textViewPrzykladowyTekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinnerKolor = findViewById(R.id.spinner);
        seekBarRozmiarCzcionki = findViewById(R.id.seekBar);
        buttonZamien= findViewById(R.id.button);
        textViewPrzykladowyTekst = findViewById(R.id.textView2);

    }
}