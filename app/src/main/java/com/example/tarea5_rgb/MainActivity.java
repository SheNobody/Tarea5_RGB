package com.example.tarea5_rgb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    SeekBar seekBar;
    View view;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    SeekBar seekBar2;
    SeekBar seekBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        view = findViewById(R.id.view);

        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar0, int i, boolean b) {
                textView.setText("R:" + i);
            String hexValue= "#" + ColorUtils.decimalToHex(seekBar.getProgress()) + ColorUtils.decimalToHex(seekBar2.getProgress()) + ColorUtils.decimalToHex(seekBar3.getProgress());
               textView4.setText(hexValue);
               view.setBackgroundColor(Color.parseColor(hexValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar0, int i, boolean b) {
                textView2.setText("G:" + i);
                String hexValue= "#" + ColorUtils.decimalToHex(seekBar.getProgress()) + ColorUtils.decimalToHex(seekBar2.getProgress()) + ColorUtils.decimalToHex(seekBar3.getProgress());
                textView4.setText(hexValue);
                view.setBackgroundColor(Color.parseColor(hexValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar3 = findViewById(R.id.seekBar3);
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar0, int i, boolean b) {
                textView3.setText("B:" + i);
                String hexValue= "#" + ColorUtils.decimalToHex(seekBar.getProgress()) + ColorUtils.decimalToHex(seekBar2.getProgress()) + ColorUtils.decimalToHex(seekBar3.getProgress());
                textView4.setText(hexValue);
                view.setBackgroundColor(Color.parseColor(hexValue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





    }
}
