package com.teamshab.kvl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.teamshab.kvl.fragments.StudentCourseMaterial;
import com.teamshab.kvl.fragments.StudentHome;
import com.teamshab.kvl.fragments.StudentReadLater;
import com.teamshab.kvl.student.StudentAboutActivity;
import com.teamshab.kvl.student.StudentForumActivity;
import com.teamshab.kvl.student.StudentOtherCollegeActivity;
import com.teamshab.kvl.student.StudentProfileActivity;
import com.teamshab.kvl.student.StudentSettingsActivity;
import com.teamshab.kvl.student.StudentSuggestionsActivity;
import com.teamshab.kvl.student.StudentTimeTableActivity;

public class StudentHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mBottomNavigation;
    private FrameLayout mFrameLayout;
    private StudentHome studentHome;
    private StudentCourseMaterial studentCourseMaterial;
    private StudentReadLater studentReadLater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mBottomNavigation = (BottomNavigationView) findViewById(R.id.student_bottom_navigation);
        mFrameLayout = (FrameLayout) findViewById(R.id.student_framelayout);


        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.student_home_view){

                    getSupportFragmentManager().beginTransaction().replace(R.id.student_framelayout, StudentHome.getInstance()).commit();


                } else if (id == R.id.student_coursematerial_view){

                    getSupportFragmentManager().beginTransaction().replace(R.id.student_framelayout, StudentCourseMaterial.getInstance()).commit();

                } else if (id == R.id.student_readlater_view){

                    getSupportFragmentManager().beginTransaction().replace(R.id.student_framelayout, StudentReadLater.getInstance()).commit();

                }

                return true;
            }
        });
        
        displayInitialFragment();
    }

    private void displayInitialFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.student_framelayout, StudentHome.getInstance() ).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

        Intent intent = new Intent(StudentHomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.student_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_logout) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_home) {

        } else if (id == R.id.nav_profile) {

            Intent intent = new Intent(StudentHomeActivity.this, StudentProfileActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_discussion) {

            Intent intent = new Intent(StudentHomeActivity.this, StudentForumActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_other) {

            Intent intent = new Intent(StudentHomeActivity.this, StudentOtherCollegeActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_suggestion) {

            Intent intent = new Intent(StudentHomeActivity.this, StudentSuggestionsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_about) {

            Intent intent = new Intent(StudentHomeActivity.this, StudentAboutActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_time_table){

            Intent intent = new Intent(StudentHomeActivity.this, StudentTimeTableActivity.class);
            startActivity(intent);


        } else if (id == R.id.nav_settings) {

            Intent intent = new Intent(StudentHomeActivity.this, StudentSettingsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
