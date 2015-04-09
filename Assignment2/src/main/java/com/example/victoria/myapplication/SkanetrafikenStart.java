package com.example.victoria.myapplication;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SkanetrafikenStart extends Fragment  implements View.OnClickListener{


    public SkanetrafikenStart() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_skanetrafiken_start, container, false);
        View myButtonView = v.findViewById(R.id.imageButton3);
        //Button myButton = (Button) myButtonView;
        myButtonView.setOnClickListener(this);
        return v;
    }
    @Override
    public void onClick(View v) {
        Skanetrafiken a = (Skanetrafiken) getActivity();
        Toast t = Toast.makeText(getActivity(),"sök resa",Toast.LENGTH_LONG);
        t.show();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        SkanetrafikenRese bf = new SkanetrafikenRese();
        ft.replace(R.id.activity_skanetrafiken,bf);
        ft.commit();

        //getFragmentManager().beginTransaction().replace(R.id.RelativeMenu,new ListFragment()).commit();
    }




}
