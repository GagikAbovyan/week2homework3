package ru.startandroid.week2homework3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Gagik on 07.07.2018.
 */

public class MyListAdapter extends ArrayAdapter {

    Context context;
    List<ModuleListView> list;
    int recource;

    public MyListAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.list = objects;
        this.recource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.layout_for_listvew_for_chat, parent, false);
        }

        return super.getView(position, convertView, parent);
    }
}
