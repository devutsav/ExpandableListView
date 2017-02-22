package com.example.utsav.expandablelistview;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    HashMap<String, List<String>> Movies_category;
    List<String> movies_list; 
    ExpandableListView exp;

    MoviesAdaptor mv_adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);



        exp = (ExpandableListView) findViewById(R.id.exp_list);
        Movies_category = DataProvider.getInfo();
        movies_list = new ArrayList<String>(Movies_category.keySet());

        mv_adaptor=new MoviesAdaptor(this, Movies_category, movies_list);

        exp.setAdapter(mv_adaptor);

    }

}
