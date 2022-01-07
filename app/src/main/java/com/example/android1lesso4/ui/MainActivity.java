package com.example.android1lesso4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.android1lesso4.Constans.Constans.Constans;
import com.example.android1lesso4.Data.BookClient;
import com.example.android1lesso4.R;
import com.example.android1lesso4.adapter.AdapterBook;
import com.example.android1lesso4.interfaces.OnClick;
import com.example.android1lesso4.model.BookModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    AdapterBook adapterBook;
    ArrayList<BookModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        clicklisteners();
    }

    private void initialization() {
        recyclerView = findViewById(R.id.recycler_view);
        list = BookClient.getBook();
        adapterBook = new AdapterBook(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterBook);

    }


    private void clicklisteners() {
        adapterBook.setOnClick(new OnClick() {
            @Override
            public void OnClickItem(BookModel bookModel) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(Constans.KEY, bookModel);
                startActivity(intent);

            }
        });


    }

}