package com.movieapps.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;
    ContactAdapter adapter;

    ArrayList<Contact> allData = new ArrayList<>();

    int[] images ={R.drawable.man1,R.drawable.man2,R.drawable.m3,R.drawable.m4,R.drawable.m5,R.drawable.m6,R.drawable.m7,
    R.drawable.m8,R.drawable.m9,R.drawable.m10,R.drawable.m11,R.drawable.m12,R.drawable.m13,R.drawable.m14};

    String[] name;
    String[] email;
    String[] phoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        name = getResources().getStringArray(R.array.personName);
        email = getResources().getStringArray(R.array.personEmail);
        phoneNo = getResources().getStringArray(R.array.personPhone);
        for(int i = 0;i<name.length;i++) {
            Contact personContact = new Contact(images[i],name[i],email[i],phoneNo[i]);
            allData.add(personContact);
        }

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ContactAdapter(allData);
        recyclerView.setAdapter(adapter);

    }
}
