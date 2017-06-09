package com.example.rajesh.sqlitedata;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       Cursor cursor= getContentResolver().query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null);
//        while (cursor.moveToNext()){
//            int nameIndex=cursor.getColumnIndex();
//

       // }
    }

    public void  insert(View view) {
        Datbaseone db = new Datbaseone(this);

        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("rajesh", "9100000000"));
        db.addContact(new Contact("majoj", "9199999999"));
        db.addContact(new Contact("bharat", "9522222222"));
        db.addContact(new Contact("michal", "9533333333"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);

        }
    }


    public void  getUser(View view){




    }
    public void  getadress(View view){}
    public void  getName(View view){}
    public void  getid(View view){}
}
