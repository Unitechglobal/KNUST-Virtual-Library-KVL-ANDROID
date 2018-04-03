
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

import com.teamshab.kvl.fragments.LibrarianHome;
import com.teamshab.kvl.librarian.LibrarianAboutActivity;
import com.teamshab.kvl.librarian.LibrarianForumActivity;
import com.teamshab.kvl.librarian.LibrarianProfileActivity;
import com.teamshab.kvl.librarian.LibrarianSettingsActivity;
import com.teamshab.kvl.librarian.LibrarianSuggestionsActivity;
import com.teamshab.kvl.librarian.LibrarianUploadBookActivity;

public class LibrarianHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarian_home);
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

        Intent intent = new Intent(LibrarianHomeActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.librarian_home, menu);
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

            Intent intent = new Intent(LibrarianHomeActivity.this, LibrarianProfileActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_discussion) {

            Intent intent = new Intent(LibrarianHomeActivity.this, LibrarianForumActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_upload) {

            Intent intent = new Intent(LibrarianHomeActivity.this, LibrarianUploadBookActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_suggestion) {

            Intent intent = new Intent(LibrarianHomeActivity.this, LibrarianSuggestionsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_about) {

            Intent intent = new Intent(LibrarianHomeActivity.this, LibrarianAboutActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_settings) {

            Intent intent = new Intent(LibrarianHomeActivity.this, LibrarianSettingsActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
}
