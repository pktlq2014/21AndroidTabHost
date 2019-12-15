package com.example.a21androidtabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("Tab 1");
        tabSpec1.setIndicator("Tab 1");
        tabSpec1.setContent(R.id.tab1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("Tab 2");
        tabSpec2.setIndicator("Tab 2");
        tabSpec2.setContent(R.id.tab2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("Tab 3");
        tabSpec3.setIndicator("Tab 3");
        tabSpec3.setContent(R.id.tab3);

        tabHost.addTab(tabSpec1);
        tabHost.addTab(tabSpec2);
        tabHost.addTab(tabSpec3);
    }
}
