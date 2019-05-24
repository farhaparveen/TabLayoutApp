package com.example.tablayoutapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    String[] data;
    MyAdapter(String[] data)
    {
        this.data=data;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View v=inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
String title=data[i];
myHolder.textView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class MyHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public MyHolder(@NonNull View view) {
            super(view);
            imageView=view.findViewById(R.id.imgId);
            textView=view.findViewById(R.id.textid);
        }
    }


}
