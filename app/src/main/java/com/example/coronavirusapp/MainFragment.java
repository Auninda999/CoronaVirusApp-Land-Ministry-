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
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    LinearLayout ll_1, ll_2, ll_3, ll_4, ll_5, ll_6, ll_7, ll_8, ll_9;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        ll_1 = v.findViewById(R.id.ll_1);
        ll_2 = v.findViewById(R.id.ll_2);
        ll_3 = v.findViewById(R.id.ll_3);
        ll_4 = v.findViewById(R.id.ll_4);
        ll_6 = v.findViewById(R.id.ll_6);
        ll_7 = v.findViewById(R.id.ll_7);
        ll_8 = v.findViewById(R.id.ll_8);
        ll_9 = v.findViewById(R.id.ll_9);


        ll_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1 = new Fragment1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ll_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1 = new Fragment1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ll_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 = new Fragment2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ll_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 fragment3 = new Fragment3();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment3);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ll_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebviewFragment3 webviewFragment3 = new WebviewFragment3();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, webviewFragment3);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ll_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment4 Fragment4 = new Fragment4();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, Fragment4);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ll_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1 = new Fragment1();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        ll_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebviewFragment4 webviewFragment4 = new WebviewFragment4();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, webviewFragment4);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        return v;
    }
}
