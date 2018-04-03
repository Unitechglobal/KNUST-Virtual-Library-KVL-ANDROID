
package com.teamshab.kvl;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    /*String circleMenuArray []= {"Student","Lecturer","Libarian","Non-student"};*/

    Button mRegister;
    TextView mClickOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRegister = (Button) findViewById(R.id.non_student_register);
        mClickOn = (TextView) findViewById(R.id.click_on_plus);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.main_circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.icons8_plus_math_40,R.drawable.icons8_delete_40)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.icons8_students_64)
                .addSubMenu(Color.parseColor("#6D4C41"),R.drawable.icons8_books_48)
                .addSubMenu(Color.parseColor("#FF0000"), R.drawable.icons8_staff_48)
                .addSubMenu(Color.parseColor("#03A9F4"),R.drawable.icons8_reading_48)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {


                        if ( i == 0){

                            Intent intent = new Intent(MainActivity.this, StudentLogin.class);
                            startActivity(intent);

                        }else if ( i == 1){

                            Intent intent = new Intent(MainActivity.this, LibrarianLogin.class);
                            startActivity(intent);

                        }else if ( i == 2){

                            Intent intent = new Intent(MainActivity.this, LecturerLogin.class);
                            startActivity(intent);

                        }else if ( i == 3){

                            Intent intent = new Intent(MainActivity.this, NonStudentLogin.class);
                            startActivity(intent);

                        }
                        else {


                        }

                    }
                });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NonStudentRegister.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
}
