package com.example.tablayoutapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentQuiz extends Fragment {

    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view=inflater.inflate(R.layout.quiz_fragment,container,false);
       recyclerView=view.findViewById(R.id.recyclerViewQuiz);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        String[] languages={"Java","C#","C","Python","Javascript","C++","Php","Java","DotNet"};
        recyclerView.setAdapter(new MyAdapter(languages));

        return view;
    }


}
