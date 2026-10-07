package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        seekBarRozmiarCzcionki.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        textViewWynik.setTextSize(Float.parseFloat(String.valueOf(i)));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
        spinnerKolor.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        String kolor = spinnerKolor.getSelectedItem().toString();
                        if(kolor.equals("Zielony")) {
                            textViewWynik.setTextColor(Color.parseColor("green"));
                        } else if(kolor.equals("Niebieski")) {
                            textViewWynik.setTextColor(Color.parseColor("blue"));
                        } else if(kolor.equals("Czerwony")) {
                            textViewWynik.setTextColor(Color.parseColor("red"));
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                }
        );
//        spinnerKolor.setOnItemClickListener(
//                new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                        String kolor = spinnerKolor.getSelectedItem().toString();
//                        if(kolor.equals("Zielony")) {
//                            textViewWynik.setTextColor(Color.parseColor("green"));
//                        } else if(kolor.equals("Niebieski")) {
//                            textViewWynik.setTextColor(Color.parseColor("blue"));
//                        } else if(kolor.equals("Czerwony")) {
//                            textViewWynik.setTextColor(Color.parseColor("red"));
//                        }
//                    }
//                }
//        );


//        buttonZamien.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        int rozmiarCzcionki = seekBarRozmiarCzcionki.getProgress();
//                        textViewWynik.setTextSize(rozmiarCzcionki);
//                        String color = spinnerKolor.getSelectedItem().toString();
//                        if(color.equals("Zielony")) {
//                            textViewWynik.setTextColor(Color.parseColor("green"));
//                        } else if(color.equals("Niebieski")) {
//                            textViewWynik.setTextColor(Color.parseColor("blue"));
//                        } else if(color.equals("Czerwony")) {
//                            textViewWynik.setTextColor(Color.parseColor("red"));
//                        }
//                    }
//                }
//        );


    }
}