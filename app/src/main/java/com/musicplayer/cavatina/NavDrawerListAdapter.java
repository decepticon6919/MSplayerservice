package com.musicplayer.cavatina;

import java.util.ArrayList;

import com.musicplayer.cavatina.R;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NavDrawerListAdapter extends BaseAdapter {	
	private Context context;
	private ArrayList<NavDrawerItem> navDrawerItems;
	
	public NavDrawerListAdapter(Context context, ArrayList<NavDrawerItem> navDrawerItems){
		this.context = context;
		this.navDrawerItems = navDrawerItems;
	}
	
	public int getCount() {
		return navDrawerItems.size();
	}

	public Object getItem(int position) {		
		return navDrawerItems.get(position);
	}

	
	public long getItemId(int position) {
		return position;
	}


	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)LayoutInflater.from(context);
            convertView = mInflater.inflate(R.layout.drawer_list_item, null);
        }         
        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
        Typeface t= Typeface.createFromAsset(context.getAssets(), "fonts/constanz.ttf");
        txtTitle.setTypeface(t);
        imgIcon.setImageResource(navDrawerItems.get(position).getIcon());        
        txtTitle.setText(navDrawerItems.get(position).getTitle());
       return convertView;
	}

}

