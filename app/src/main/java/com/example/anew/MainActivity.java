package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       String [] listOfProducts = {"Афобазол", "Валерьянка", "Анальгин", "Парацетомол",
               "Нашатырь", "Уголь", "Но-шпа", "Аспаркам", "Аскофен", "Серената"};

        //String [] listOfProducts = getResources().getStringArray(R.array.listOfProduct);

                ListView listView = findViewById(R.id.list);
                TextView textView = findViewById(R.id.text);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listOfProducts
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(listOfProducts[i]);
            }

        });
    }
}