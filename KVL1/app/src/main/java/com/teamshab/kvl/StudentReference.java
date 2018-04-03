package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentReference extends AppCompatActivity {

    Button mReferenceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_reference);

        mReferenceButton = (Button) findViewById(R.id.student_reference_button);
        mReferenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StudentReference.this, StudentHomeActivity.class);
                startActivity(intent);
            }
        });
    }
package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentReference extends AppCompatActivity {

    Button mReferenceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_reference);

        mReferenceButton = (Button) findViewById(R.id.student_reference_button);
        mReferenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StudentReference.this, StudentHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
}
