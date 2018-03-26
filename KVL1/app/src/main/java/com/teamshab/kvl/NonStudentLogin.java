package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class NonStudentLogin extends AppCompatActivity {

    Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_student_login);

        mLoginButton = (Button) findViewById(R.id.non_student_login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NonStudentLogin.this, NonStudentHomeActivity.class);
                startActivity(intent);
            }
        });


    }
}
