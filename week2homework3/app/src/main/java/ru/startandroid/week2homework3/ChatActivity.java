package ru.startandroid.week2homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        ListView listView = findViewById(R.id.list_view);
        List<ModuleListView> list = new ArrayList<>();
        MyListAdapter myListAdapter = new MyListAdapter(this,
                R.layout.layout_for_listvew_for_chat,
                list);
        int photoId = getIntent().getIntExtra("KEY1", 0);
        String name = getIntent().getStringExtra("KEY2");
        String status = getIntent().getStringExtra("KEY3");
        ImageView imageView = findViewById(R.id.image_chat);
        TextView nameUser = findViewById(R.id.name_user);
        TextView statusM = findViewById(R.id.status_user);
        imageView.setImageResource(photoId);
        nameUser.setText(name);
        statusM.setText(status);
        list.add(new ModuleListView());
    }
}
