package com.example.recyclerviewdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment
{
    private RecyclerView mRecyclerView;
    private  View mView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mView=inflater.inflate(R.layout.main_fragment, container, false);
        initView();
        setValue();
        return mView;
    }

    private void setValue() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerAdapter mAdapter = new RecyclerAdapter(loadData(), getActivity());
        mRecyclerView.setAdapter(mAdapter);

    }

    private void initView() {
        mRecyclerView=mView.findViewById(R.id.rv);
    }
    private List<MovieDetails> loadData() {


        List<MovieDetails> mList = new ArrayList<>();
        mList.add(new MovieDetails("Baby", 3.5, R.drawable.baby));
        mList.add(new MovieDetails("IT", 3.4, R.drawable.it));
        mList.add(new MovieDetails("A star is born", 2.5, R.drawable.star));
        mList.add(new MovieDetails("After", 4.5, R.drawable.after));
        mList.add(new MovieDetails("Archer", 3.1, R.drawable.archer));
        mList.add(new MovieDetails("Joker", 3.3, R.drawable.joker));
        mList.add(new MovieDetails("Movie", 3.9, R.drawable.movie));
        mList.add(new MovieDetails("Pamhir", 4.0, R.drawable.pamhir));
        mList.add(new MovieDetails("Replicas", 1.5, R.drawable.replicas));
        mList.add(new MovieDetails("Enormity", 2.8, R.drawable.enormity));
        return mList;
    }

}
