package com.example.ra.multitool_test_application;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MusicFragment extends Fragment {

    public static MusicFragment newInstance() {
        MusicFragment f = new MusicFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_music, container, false);

        System.out.println(((TextView) v.findViewById(R.id.musicTextView)).getText());
        return v;
    }
}
