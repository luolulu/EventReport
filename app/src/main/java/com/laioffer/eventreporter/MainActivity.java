package com.laioffer.eventreporter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Get ListView object from xml.
            ListView eventListView = (ListView) findViewById(R.id.event_list);


            EventAdapter adapter = new EventAdapter(this);

            // Assign adapter to ListView.
            eventListView.setAdapter(adapter);
        }


 }

