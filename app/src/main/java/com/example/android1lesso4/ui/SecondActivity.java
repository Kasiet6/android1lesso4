package com.example.android1lesso4.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android1lesso4.Constans.Constans.Constans;
import com.example.android1lesso4.R;
import com.example.android1lesso4.model.BookModel;

public class SecondActivity extends AppCompatActivity {
    TextView tvActorsNick, tvActorsDeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        tvActorsNick = findViewById(R.id.tv_drivers_nick);
        tvActorsDeck = findViewById(R.id.tv_drivers_deck);

        getData();
    }

    private void getData() {
        BookModel bookModel = (BookModel) getIntent().getSerializableExtra(Constans.KEY);
        tvActorsNick.setText(bookModel.getName());
        tvActorsDeck.setText(bookModel.getDescription());

    }
}
