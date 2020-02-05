package com.example.bloodlife;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageSelect extends AppCompatActivity {

    private ListView language;
    private LanguageSelectCustomAdapter mCustomAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);

         //int[] allcheckbox={R.drawable.uncheck,R.drawable.uncheck,R.drawable.uncheck,R.drawable.uncheck,R.drawable.uncheck,
              //   R.drawable.uncheck,R.drawable.uncheck};

         int[] alllanguages={R.string.english,R.string.hindi,R.string.gujrati,R.string.kannada,
                 R.string.tamil,R.string.telugu,R.string.french,R.string.spanish};


        language=(ListView)findViewById(R.id.listViewLanguage);
       // language.setSelector(android.R.color.transparent);
      //  language.setDivider(null);
        mCustomAdapter=new LanguageSelectCustomAdapter(LanguageSelect.this,alllanguages);

        language.setAdapter(mCustomAdapter);

        language.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CheckBox checkBox=findViewById(R.id.checkbox);
                checkBox.setChecked(true);
            }
        });


    }


}
