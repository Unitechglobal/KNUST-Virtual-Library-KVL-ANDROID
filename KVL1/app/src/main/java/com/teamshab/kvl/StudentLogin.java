
package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class StudentLogin extends AppCompatActivity {

    Button mLoginButton;
    Button mForgotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Student");*/

        mLoginButton = (Button) findViewById(R.id.student_login_button);
        mForgotButton = (Button) findViewById(R.id.student_forgot_password);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StudentLogin.this, StudentReference.class);
                startActivity(intent);
            }
        });
    }
}
}
