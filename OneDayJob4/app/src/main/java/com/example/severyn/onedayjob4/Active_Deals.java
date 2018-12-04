package com.example.severyn.onedayjob4;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Active_Deals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active__deals);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.navigation_scheduler:
                        Intent intent0 = new Intent(Active_Deals.this, Deal_Scheduler.class);
                        startActivity(intent0);
                        break;

                    case R.id.navigation_profile:
                        Intent intent1 = new Intent(Active_Deals.this, Profile.class);
                        startActivity(intent1);
                        break;

                    case R.id.navigation_add_deal:
                        Intent intent2 = new Intent(Active_Deals.this, Add.class);
                        startActivity(intent2);
                        break;


                    case R.id.navigation_list:
                        Intent intent3 = new Intent(Active_Deals.this, Main2Activity.class);
                        startActivity(intent3);
                        break;

                    case R.id.navigation_active_deal:

                        break;
                }


                return false;
            }
        });
    }
}
