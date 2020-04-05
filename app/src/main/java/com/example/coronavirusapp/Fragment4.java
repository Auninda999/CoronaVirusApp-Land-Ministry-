package com.example.coronavirusapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4 extends Fragment {



    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_4, container, false);

        LinearLayout home_button = (LinearLayout) v.findViewById(R.id.ll_back);
        LinearLayout playstore = (LinearLayout) v.findViewById(R.id.ll_playstore);
        ImageView mobile_in_hand = (ImageView) v.findViewById(R.id.mobile_in_hand);


        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragment mainFragment = new MainFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, mainFragment );
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        playstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebviewFragment5 webviewFragment5 = new WebviewFragment5();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, webviewFragment5);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        mobile_in_hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebviewFragment5 webviewFragment5 = new WebviewFragment5();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, webviewFragment5);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return v;
    }
}
