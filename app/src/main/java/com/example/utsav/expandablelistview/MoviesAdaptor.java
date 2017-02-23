package com.example.utsav.expandablelistview;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by utsav on 23/2/17.
 */

public class MoviesAdaptor extends BaseExpandableListAdapter {

    private Context cxt;
    private HashMap<String, List<String>> Movies_category;
    private List<String> movies_list;

    public MoviesAdaptor(Context cxt, HashMap<String, List<String>> Movies_category, List<String> movies_list)
    {
        this.cxt=cxt;
        this.Movies_category=Movies_category;
        this.movies_list=movies_list;
    }
    @Override
    public int getGroupCount() {
        return movies_list.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return Movies_category.get(movies_list.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return movies_list.get(groupPosition);
    }

    @Override
    public Object getChild(int parent, int child) {
        return Movies_category.get(movies_list.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int parent, int child) {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentview) {
        String group_title=(String)getGroup(parent);

        if(convertView==null)
        {
            LayoutInflater inflator = (LayoutInflater) cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.parent_layout,parentview,false);
        }
        TextView group_textview = (TextView) convertView.findViewById(R.id.parent_txt);
        group_textview.setTypeface(null, Typeface.BOLD);
        group_textview.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean isLastChild, View convertView, ViewGroup parentview) {
        String child_title=(String)getChild(parent,child);
        if(convertView==null)
        {
           LayoutInflater inflator = (LayoutInflater) cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.child_layout,parentview,false);
        }
        TextView child_textview = (TextView) convertView.findViewById(R.id.child_txt);
        child_textview.setText(child_title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {

        return true;
    }
}
