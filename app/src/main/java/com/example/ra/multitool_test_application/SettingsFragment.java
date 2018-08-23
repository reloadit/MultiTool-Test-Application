package com.example.ra.multitool_test_application;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SettingsFragment extends Fragment {

    public static SettingsFragment newInstance() {
        SettingsFragment f = new SettingsFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_settings, container, false);

        System.out.println(((TextView) v.findViewById(R.id.settingsTextView)).getText());
        return v;
    }
}
