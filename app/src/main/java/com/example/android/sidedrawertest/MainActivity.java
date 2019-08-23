package com.example.android.sidedrawertest;

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
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView =findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drwaer_open, R.string.navigation_drwaer_close);

        //Rotating Burger Symbol

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DevicesFragment()).commit();

            navigationView.setCheckedItem(R.id.navDevices);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id. navDevices:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DevicesFragment()).commit();
                break;

            case R.id. navAdd:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new NewDeviceFragment()).commit();
                break;

            case R.id. navCharts:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ChartFragment()).commit();
                break;

            case R.id. navSettings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id. navInfo:
                Toast.makeText(this, "Info", Toast.LENGTH_SHORT).show();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //BackButton closes Sidedrawer and not the Activity

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


        //Intent phrasesIntent = new Intent(MainActivity.this, DevicesFragment.class);

        // Start the new activity
        //startActivity(phrasesIntent);
}

