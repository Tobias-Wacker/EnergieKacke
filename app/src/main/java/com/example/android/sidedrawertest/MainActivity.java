package com.example.android.sidedrawertest;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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

import com.example.android.sidedrawertest.data.DevicesContract;
import com.example.android.sidedrawertest.data.DevicesContract.DeviceEntry;
import com.example.android.sidedrawertest.data.DevicesDbHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private DevicesDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView =findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        //Rotating Burger Symbol

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DevicesFragment()).commit();

            navigationView.setCheckedItem(R.id.navDevices);
        }


        mDbHelper = new DevicesDbHelper(this);
    }

    //Consumer[] allDevices = new Consumer[1000];
    //int m = 0;
    //ArrayList<Consumer> allDevicesList = new ArrayList<Consumer>();



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

    public void addConsumer(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DevicesFragment()).commit();


    }
        /*EditText ConsumerName = (EditText)findViewById(R.id.device_name);
        String name = ConsumerName.getText().toString();

        EditText ConsumerWatt = (EditText)findViewById(R.id.device_watt);
        String watt1 = ConsumerWatt.getText().toString();
        int watt = Integer.parseInt(watt1);

        Consumer test = new Consumer(name, watt, 2, 1);


        TextView anzeige = (TextView)findViewById(R.id.anzeiger);


<<<<<<< HEAD

        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        //ContentValues dbValues = new ContentValues();
        //dbValues.put(DeviceEntry.COLLUMN_DEVICE_NAME, name);
        //dbValues.put(DeviceEntry.COLLUMN_DEVICE_CONSUMPTION, watt);
        //dbValues.put(DeviceEntry.COLLUMN_DEVICE_TYPE, 1);

       // long newRowID = db.insert(DeviceEntry.TABLE_NAME, null, dbValues);

        anzeige.setText(test.getConsumerName() + test.getConsumerWatt());
=======
    }
>>>>>>> a7abbbb9671afe0cea987b63d0edbef25cd5e46d







    }*/

}

