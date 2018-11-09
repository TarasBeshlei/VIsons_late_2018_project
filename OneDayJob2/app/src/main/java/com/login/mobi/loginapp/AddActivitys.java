package com.login.mobi.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

public class AddActivitys extends AppCompatActivity {


    private Button btnAddButton;
    private EditText adtNameOfDeal;
    private EditText edtDescription;


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("items");

    @IgnoreExtraProperties
    static class Item implements Serializable {
       public String nameOfDeal1;
       public String description12;

       public Item(){

       }

        Item(String nameOfDeal1, String descriptions12) {
            this.nameOfDeal1 = nameOfDeal1;
            this.description12 = descriptions12;
        }


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);


        adtNameOfDeal = findViewById(R.id.name_of_deal);
        btnAddButton = findViewById(R.id.add_button);
        edtDescription = findViewById(R.id.description_info);

        btnAddButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Item item = new Item(adtNameOfDeal.getText().toString(), edtDescription.getText().toString());
                myRef.setValue(item);

            }
        });

    }
}
