package com.example.severyn.onedayjob4;

        import android.app.Activity;
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

public class Main2Activity extends Activity {
    ListView list;
    String[] web = {
            "Visage\n" +
                    "Olena Perush\n" + "Lviv",
            "Cooking\n" + "Stepan Neptun\n" + "Kyiv",
            "Photography\n" + "Yaryna Markevych\n" + "Lviv",
            "Watering the law\n" + "Kate Nikson\n" + "Kharkow",
            "House repairing\n" + "Oleg Riga\n" + "Lviv",
            "Electricity\n" + "Petro Skyba\n" + "Dnipro",
            "Programing\n" + "Yura Korol\n" + "Stryi",
            "House cleaning\n" + "Mariya Markiv\n" + "Lviv",
            "Car washing\n" + "Mykola Martyniv\n" + "Kharkiv",
            "House design\n" + "Yulia Ivashkiv\n" + "Kyiv"

    } ;
    Integer[] imageId = {
            R.drawable.visge,
            R.drawable.cook,
            R.drawable.camera,
            R.drawable.grass,
            R.drawable.house,
            R.drawable.electric,
            R.drawable.program,
            R.drawable.clean,
            R.drawable.car,
            R.drawable.design

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CustomList listAdapter = new
                CustomList(Main2Activity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(listAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Main2Activity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.navigation_scheduler:
                        Intent intent0 = new Intent(Main2Activity.this, Deal_Scheduler.class);
                        startActivity(intent0);
                        break;

                    case R.id.navigation_profile:
                        Intent intent1 = new Intent(Main2Activity.this, Profile.class);
                        startActivity(intent1);
                        break;

                    case R.id.navigation_add_deal:
                        Intent intent2 = new Intent(Main2Activity.this, Add.class);
                        startActivity(intent2);
                        break;

                    case R.id.navigation_list:

                        break;


                    case R.id.navigation_active_deal:
                        Intent intent4 = new Intent(Main2Activity.this, Active_Deals.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }

}
