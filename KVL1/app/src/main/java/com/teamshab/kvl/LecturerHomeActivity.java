
package com.teamshab.kvl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.teamshab.kvl.lecturer.LecturerAboutActivity;
import com.teamshab.kvl.lecturer.LecturerForumActivity;
import com.teamshab.kvl.lecturer.LecturerProfileActivity;
import com.teamshab.kvl.lecturer.LecturerSettingsActivity;
import com.teamshab.kvl.lecturer.LecturerSuggestionsActivity;
import com.teamshab.kvl.lecturer.LecturerUploadCourseMaterialActivity;

public class LecturerHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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

        Intent intent = new Intent(LecturerHomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.lecturer_home, menu);
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

            Intent intent = new Intent(LecturerHomeActivity.this, LecturerProfileActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_discussion) {

            Intent intent = new Intent(LecturerHomeActivity.this, LecturerForumActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_upload) {

            Intent intent = new Intent(LecturerHomeActivity.this, LecturerUploadCourseMaterialActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_suggestion) {

            Intent intent = new Intent(LecturerHomeActivity.this, LecturerSuggestionsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_about) {

            Intent intent = new Intent(LecturerHomeActivity.this, LecturerAboutActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_settings) {

            Intent intent = new Intent(LecturerHomeActivity.this, LecturerSettingsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

