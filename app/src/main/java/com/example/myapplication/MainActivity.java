package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapter.SvAdapter;
import com.example.myapplication.model.sinhvien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SvAdapter svAdapter;
    private RecyclerView rcvSv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvSv = findViewById(R.id.rcv_sv);
        svAdapter = new SvAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvSv.setLayoutManager(linearLayoutManager);

        svAdapter.setData(getListSv());
    }

    private List<sinhvien> getListSv() {
        List<sinhvien> list = new ArrayList<>();
        list.add(new sinhvien(1, "Vũ Văn Long", 2001, "Hà Nam", 2));

        return list;
    }
}
