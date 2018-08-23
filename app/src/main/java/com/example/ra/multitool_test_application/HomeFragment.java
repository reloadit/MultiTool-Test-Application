package com.example.ra.multitool_test_application;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        HomeFragment f = new HomeFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        System.out.println(((TextView) v.findViewById(R.id.homeTextView)).getText());
        return v;
    }
}
