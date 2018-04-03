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

import com.teamshab.kvl.fragments.NonStudentHome;
import com.teamshab.kvl.fragments.NonStudentReadLater;

import com.teamshab.kvl.nonstudent.NonStudentAboutActivity;
import com.teamshab.kvl.nonstudent.NonStudentForumActivity;
import com.teamshab.kvl.nonstudent.NonStudentProfileActivity;
import com.teamshab.kvl.nonstudent.NonStudentSettingsActivity;
import com.teamshab.kvl.nonstudent.NonStudentSuggestionsActivity;

public class NonStudentHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mBottomNavigation;
    private FrameLayout mFrameLayout;
    private NonStudentHome nonStudentHome;
    private NonStudentReadLater nonStudentReadLater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_student_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mBottomNavigation = (BottomNavigationView) findViewById(R.id.non_student_bottom_navigation);
        mFrameLayout = (FrameLayout) findViewById(R.id.non_student_framelayout);

        nonStudentHome = new NonStudentHome();
        nonStudentReadLater = new NonStudentReadLater();

        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.non_student_home_view){

                    getSupportFragmentManager().beginTransaction().replace(R.id.non_student_framelayout, NonStudentHome.getInstance()).commit();

                } else if (id == R.id.non_student_readlater_view){

                    getSupportFragmentManager().beginTransaction().replace(R.id.non_student_framelayout, NonStudentReadLater.getInstance()).commit();

                }

                return true;
            }
        });

        displayInitialFragment();
    }

    private void displayInitialFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.non_student_framelayout, NonStudentHome.getInstance()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.non_student_home, menu);
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

            Intent intent = new Intent(NonStudentHomeActivity.this, NonStudentProfileActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_discussion) {

            Intent intent = new Intent(NonStudentHomeActivity.this, NonStudentForumActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_suggestion) {

            Intent intent = new Intent(NonStudentHomeActivity.this, NonStudentSuggestionsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_about) {

            Intent intent = new Intent(NonStudentHomeActivity.this, NonStudentAboutActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_settings) {

            Intent intent = new Intent(NonStudentHomeActivity.this, NonStudentSettingsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
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

import com.teamshab.kvl.fragments.NonStudentHome;
import com.teamshab.kvl.fragments.NonStudentReadLater;

import com.teamshab.kvl.nonstudent.NonStudentAboutActivity;
import com.teamshab.kvl.nonstudent.NonStudentProfileActivity;
import com.teamshab.kvl.nonstudent.NonStudentSettingsActivity;

public class NonStudentHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mBottomNavigation;
    private FrameLayout mFrameLayout;
    private NonStudentHome nonStudentHome;
    private NonStudentReadLater nonStudentReadLater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_student_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mBottomNavigation = (BottomNavigationView) findViewById(R.id.non_student_bottom_navigation);
        mFrameLayout = (FrameLayout) findViewById(R.id.non_student_framelayout);

        nonStudentHome = new NonStudentHome();
        nonStudentReadLater = new NonStudentReadLater();

        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.non_student_home_view){

                    getSupportFragmentManager().beginTransaction().replace(R.id.non_student_framelayout, NonStudentHome.getInstance()).commit();

                } else if (id == R.id.non_student_readlater_view){

                    getSupportFragmentManager().beginTransaction().replace(R.id.non_student_framelayout, NonStudentReadLater.getInstance()).commit();

                }

                return true;
            }
        });

        displayInitialFragment();
    }

    private void displayInitialFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.non_student_framelayout, NonStudentHome.getInstance()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

        Intent intent = new Intent(NonStudentHomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.non_student_home, menu);
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

            Intent intent = new Intent(NonStudentHomeActivity.this, NonStudentProfileActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_about) {

            Intent intent = new Intent(NonStudentHomeActivity.this, NonStudentAboutActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_settings) {

            Intent intent = new Intent(NonStudentHomeActivity.this, NonStudentSettingsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
}
