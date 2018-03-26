package com.teamshab.kvl.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teamshab.kvl.R;

public class StudentCourseMaterial extends Fragment {

    public static StudentCourseMaterial getInstance() {
        // Required empty public constructor
        StudentCourseMaterial fragment = new StudentCourseMaterial();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_course_material, container, false);
    }

}
