package com.teamshab.kvl.student;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.teamshab.kvl.R;
import com.teamshab.kvl.StudentHomeActivity;

public class StudentAboutActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_about);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

        Intent intent = new Intent(StudentAboutActivity.this, StudentHomeActivity.class);
        startActivity(intent);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            Intent intent = new Intent(StudentAboutActivity.this, StudentHomeActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_profile) {

            Intent intent = new Intent(StudentAboutActivity.this, StudentProfileActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_discussion) {

            Intent intent = new Intent(StudentAboutActivity.this, StudentForumActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_other) {

            Intent intent = new Intent(StudentAboutActivity.this, StudentOtherCollegeActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_suggestion) {

            Intent intent = new Intent(StudentAboutActivity.this, StudentSuggestionsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_about) {

        } else if (id == R.id.nav_settings) {

            Intent intent = new Intent(StudentAboutActivity.this, StudentSettingsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_time_table){

            Intent intent = new Intent(StudentAboutActivity.this, StudentTimeTableActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
