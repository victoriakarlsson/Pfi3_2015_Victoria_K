package com.example.victoria.assignment_4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by victoria on 2015-04-23.
 */
    public class PlanetAdapter extends ArrayAdapter<Planet> {

        ArrayList<Planet> planetList;
        Context c;

        public PlanetAdapter(Context context, ArrayList<Planet> planetList) {
            super(context, 0, planetList);
            this.planetList = planetList;
            this.c = context;
        }



        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Log.i("PlanetAdapter", "Called for position: " + position);
            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item,null);
            Planet p = planetList.get(position);


            TextView tv1 = (TextView) convertView.findViewById(R.id.listName);
            ImageView iv1 = (ImageView) convertView.findViewById(R.id.listImage);
            tv1.setText(p.getName());
            iv1.setImageDrawable(p.getImage());



            return convertView;
        }
    }


