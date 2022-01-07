package com.example.android1lesso4.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesso4.R;
import com.example.android1lesso4.interfaces.OnClick;
import com.example.android1lesso4.model.BookModel;

import java.util.ArrayList;

public class AdapterBook extends RecyclerView.Adapter<AdapterBook.HolderBook> {

    ArrayList<BookModel> list;
    private OnClick onClick;

    public void setOnClick(OnClick onClick) {

        this.onClick = onClick;
    }

    public AdapterBook(ArrayList<BookModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterBook.HolderBook onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_holder_book, parent, false);
        return new HolderBook(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBook.HolderBook holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HolderBook extends RecyclerView.ViewHolder {
        TextView tvNameBook;

        public HolderBook(@NonNull View itemView) {
            super(itemView);
            tvNameBook = itemView.findViewById(R.id.tv_name_book);
        }

        public void onBind(BookModel bookModel) {
            tvNameBook.setText(bookModel.getName());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClick.OnClickItem(bookModel);

                }
            });
        }
    }
}