package com.example.victoria.assignment_4;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlanetFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_planet, container, false);
        Log.i("PlanetFragment", "Planet chosen");

        Bundle b = getArguments();
        Planet planet = (Planet) b.getSerializable("planet");

        TextView planetName = (TextView) v.findViewById(R.id.textViewPlanetName);
        planetName.setText(planet.getName());
        ImageView planetImage = (ImageView) v.findViewById(R.id.imageViewPlanet);
        planetImage.setImageDrawable(planet.getImage());
        TextView planetRadius = (TextView) v.findViewById(R.id.textViewPlanetInfo1);
        planetRadius.setText(planet.getRadius());
        TextView planetTemp = (TextView) v.findViewById(R.id.textViewPlanetInfo2);
        planetTemp.setText(planet.getTemp());
        TextView planetText = (TextView) v.findViewById(R.id.textViewPlanetText);
        planetText.setText(planet.getText());
        return v;
    }


}
