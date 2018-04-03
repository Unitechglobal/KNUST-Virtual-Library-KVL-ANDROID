
package com.teamshab.kvl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LibrarianReference extends AppCompatActivity {

    Button mReferenceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarian_reference);

        mReferenceButton = (Button) findViewById(R.id.libarian_reference_button);
        mReferenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LibrarianReference.this, LibrarianHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
}
