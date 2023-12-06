package com.example.ujianandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lvNama = findViewById(R.id.lvNama);

        // Mendapatkan daftar nama dari Intent
        ArrayList<String> daftar_nama = getIntent().getStringArrayListExtra("daftar_nama");

        // Menyiapkan daftar angka ganjil dan nama yang sama
        ArrayList<String> combinedList = new ArrayList<>();
        for (int i = 1; i <= 20; i += 2) {
            combinedList.add(i + ". " + (daftar_nama.isEmpty() ? "Nama Kosong" : daftar_nama.get(0)));
        }

        ArrayAdapter<String> ad_nama = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, combinedList);

        lvNama.setAdapter(ad_nama);
}
}