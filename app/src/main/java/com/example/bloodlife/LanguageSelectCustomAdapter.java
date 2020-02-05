package com.example.bloodlife;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LanguageSelectCustomAdapter extends BaseAdapter {

    Context context;
    private final int[] languages;


    public LanguageSelectCustomAdapter(Activity context, int[] languages) {
        this.languages = languages;

        this.context=context;
    }

    @Override
    public int getCount() {
        return languages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // convertView.setBackgroundResource(R.drawable.customshape);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.list_view_language_custom_adapter, parent, false);

        TextView textView = (TextView) convertView.findViewById(R.id.language_text);

        textView.setText(languages[position]);


        return convertView;
    }
}
