package com.teamshab.kvl.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teamshab.kvl.R;

public class LecturerCourseMaterial extends Fragment {

    public static LecturerCourseMaterial getInstance() {
        // Required empty public constructor
        LecturerCourseMaterial fragment = new LecturerCourseMaterial();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lecturer_course_material, container, false);
    }

}
