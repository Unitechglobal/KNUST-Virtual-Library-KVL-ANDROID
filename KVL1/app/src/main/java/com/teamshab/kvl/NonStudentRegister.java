package com.teamshab.kvl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NonStudentRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_student_register);
    }
package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class NonStudentRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_student_register);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(NonStudentRegister.this, MainActivity.class);
        startActivity(intent);
    }
}
}
