package com.example.ra.multitool_test_application;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalanderFragment extends Fragment implements CalendarView.OnDateChangeListener {

    private CalendarView calendarView;
    private TextView selectedCalenderDateTextView;

    public static CalanderFragment newInstance() {
        CalanderFragment f = new CalanderFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_calander, container, false);

        calendarView = v.findViewById(R.id.calandarView);
        calendarView.setDate(System.currentTimeMillis());
        selectedCalenderDateTextView = v.findViewById(R.id.selectedCalenderDateTextView);
        calendarView.setOnDateChangeListener(this);
        return v;
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
        String selectedDate = "selected Date: " + String.valueOf(dayOfMonth) + "." + String.valueOf(month + 1) + "." + String.valueOf(year);
        selectedCalenderDateTextView.setText(selectedDate);
    }
}
