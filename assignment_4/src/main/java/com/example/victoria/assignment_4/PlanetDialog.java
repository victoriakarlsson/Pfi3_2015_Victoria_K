package com.example.victoria.assignment_4;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by victoria on 2015-04-23.
 */
public class PlanetDialog extends DialogFragment  {



        public PlanetDialog() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_dialog, container, false);
        }


}


