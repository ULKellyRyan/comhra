package com.github.ulkellyryan.comhra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NewsFeed extends Fragment {

    public NewsFeed() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static NewsFeed newInstance(String param1, String param2) {
        NewsFeed fragment = new NewsFeed();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_feed, container, false);
    }
}