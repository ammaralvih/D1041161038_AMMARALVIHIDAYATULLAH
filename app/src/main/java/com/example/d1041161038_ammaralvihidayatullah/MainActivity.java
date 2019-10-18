package com.example.d1041161038_ammaralvihidayatullah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HalamanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(HalamanActivity.this,HalamanActivity.class);
        startActivity(intent);
    }
}
