package com.teamshab.kvl.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teamshab.kvl.R;

public class LibrarianHome extends Fragment {

    public static LibrarianHome getInstance() {
        // Required empty public constructor
        LibrarianHome fragment = new LibrarianHome();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_librarian_home, container, false);
    }

}
