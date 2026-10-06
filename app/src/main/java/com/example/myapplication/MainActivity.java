package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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
    TextView textViewWynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinnerKolor = findViewById(R.id.spinner);
        seekBarRozmiarCzcionki = findViewById(R.id.seekBar);
        buttonZamien= findViewById(R.id.button);
        textViewWynik= findViewById(R.id.textView2);

        buttonZamien.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int rozmiarCzcionki = seekBarRozmiarCzcionki.getProgress();
                        textViewWynik.setTextSize(rozmiarCzcionki);
                        int dzialanie = spinnerKolor.getSelectedItemPosition();
                        switch (dzialanie) {
                            case 1:
                                textViewWynik.setTextColor(Color.parseColor("green"));
                                break;
                            case 2:
                                textViewWynik.setTextColor(Color.parseColor("blue"));
                        }
                    }
                }
        );


    }
}