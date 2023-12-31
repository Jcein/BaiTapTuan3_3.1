package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1 = new Contact( "Nguyen Van Tuan", "0985263644","RED");
        Contact contact2 = new Contact( "Nguyen Van Hai",  "0985263645", "RED");
        Contact contact3 = new Contact( "Nguyen Van Anh", "0985263646","RED");
        Contact contact4 = new Contact( "Nguyen Van Dund", "0985263647", "RED");
        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);
        arrContact.add(contact4);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.item_listview,arrContact);
        lvContact.setAdapter(adapter);
    }
}