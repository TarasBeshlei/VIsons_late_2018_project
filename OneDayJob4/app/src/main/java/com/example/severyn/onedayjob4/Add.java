package com.example.severyn.onedayjob4;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.navigation_scheduler:
                        Intent intent0 = new Intent(Add.this, Deal_Scheduler.class);
                        startActivity(intent0);
                        break;

                    case R.id.navigation_profile:
                        Intent intent1 = new Intent(Add.this, Profile.class);
                        startActivity(intent1);
                        break;

                    case R.id.navigation_add_deal:

                        break;

                    case R.id.navigation_list:
                        Intent intent3 = new Intent(Add.this, Main2Activity.class);
                        startActivity(intent3);
                        break;

                    case R.id.navigation_active_deal:
                        Intent intent4 = new Intent(Add.this, Active_Deals.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }
}
