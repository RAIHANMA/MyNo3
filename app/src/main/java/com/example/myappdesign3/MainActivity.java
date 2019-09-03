package com.example.myappdesign3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerviewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        setData();
    }

    private void setData() {
        Contact dataBadoo = new Contact("Raihan MA", "Danbo","12.30", "Kamu terlah berhasil login",R.drawable.badoo);
        Contact dataFacebook = new Contact("Fajar Laksana", "Facebook","11.30","Kamu terlah berhasil login", R.drawable.facebook);
        Contact dataGoogle = new Contact("IrvanPebrian", "google", "12.30","Kamu terlah berhasil login", R.drawable.google);
        Contact dataIntragram = new Contact("Riksa", "Instagram", "13.45","Kamu terlah berhasil login", R.drawable.instagram);
        Contact dataPath = new Contact("Indra Gunawan", "Path", "12.50", "Kamu terlah berhasil login", R.drawable.pinterest);

        contactList.add(dataBadoo);
        contactList.add(dataFacebook);
        contactList.add(dataGoogle);
        contactList.add(dataIntragram);
        contactList.add(dataPath);

        mAdapter = new RecyclerviewAdapter(contactList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }
}