package com.teamshab.kvl.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teamshab.kvl.R;

public class NonStudentHome extends Fragment {

    public static NonStudentHome getInstance() {
        // Required empty public constructor
        NonStudentHome fragment = new NonStudentHome();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_non_student_home, container, false);
    }

}
