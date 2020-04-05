package com.example.coronavirusapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {
    Button application_button;
    LinearLayout home_button;
    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_3, container, false);

        home_button = v.findViewById(R.id.ll_back);
        application_button = v.findViewById(R.id.application_btn);

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

        application_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebviewFragment2 webviewFragment2 = new WebviewFragment2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, webviewFragment2);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        return v;
    }
}
