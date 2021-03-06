package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] cities = {"Mumbai","Lahore","Bangok","London","Paris","Dubai","Singapore",
    "New York","Kuala Lumpur","Tokyo","Istanbul"};
    int id[] = {R.drawable.mumbai,R.drawable.bankok,R.drawable.london,R.drawable.paris,R.drawable.dubai,R.drawable.singapore,
                    R.drawable.kauala,R.drawable.istanbul,R.drawable.tok  };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,cities);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Clicked"+cities[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}