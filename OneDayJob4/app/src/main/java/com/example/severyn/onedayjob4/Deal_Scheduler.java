package com.example.severyn.onedayjob4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class Deal_Scheduler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deal_scheduler);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.navigation_scheduler:

                        break;

                    case R.id.navigation_profile:
                        Intent intent1 = new Intent(Deal_Scheduler.this, Profile.class);
                        startActivity(intent1);
                        break;

                    case R.id.navigation_add_deal:
                        Intent intent2 = new Intent(Deal_Scheduler.this, Add.class);
                        startActivity(intent2);
                        break;

                    case R.id.navigation_list:
                        Intent intent3 = new Intent(Deal_Scheduler.this, Main2Activity.class);
                        startActivity(intent3);
                        break;


                    case R.id.navigation_active_deal:
                        Intent intent4 = new Intent(Deal_Scheduler.this, Active_Deals.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }
}
