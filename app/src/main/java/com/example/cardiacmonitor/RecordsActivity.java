package com.example.cardiacmonitor;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.List;

public class RecordsActivity extends AppCompatActivity {

    MyDatabaseHelper myDatabaseHelper;

    ListView listView;
    TextView no_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);


        myDatabaseHelper = new MyDatabaseHelper(RecordsActivity.this);
        SQLiteDatabase sqLiteDatabase =  myDatabaseHelper.getWritableDatabase();

        listView = findViewById(R.id.list_view);

        SimpleCursorAdapter simpleCursorAdapter = myDatabaseHelper.populateListViewFromDB();
        listView.setAdapter(simpleCursorAdapter);

//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//
//
//
//                return true;
//            }
//        });


    }
}