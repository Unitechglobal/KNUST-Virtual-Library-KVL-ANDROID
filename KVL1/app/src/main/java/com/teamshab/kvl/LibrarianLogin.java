package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LibrarianLogin extends AppCompatActivity {

    Button mLoginButton;
    Button mForgotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarian_login);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Libarian");*/

        mLoginButton = (Button) findViewById(R.id.libarian_login_button);
        mForgotButton = (Button) findViewById(R.id.libarian_forgot_password);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LibrarianLogin.this, LibrarianReference.class);
                startActivity(intent);
            }
        });
    }
}
