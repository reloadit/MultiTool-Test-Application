package com.example.ra.multitool_test_application;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

        selectedCalenderDateTextView = v.findViewById(R.id.selectedCalenderDateTextView);
        calendarView = v.findViewById(R.id.calandarView);

        calendarView.setDate(System.currentTimeMillis());
        calendarView.setOnDateChangeListener(this);

        return v;
    }

    private AlertDialog displayDialogWithList(String title, String[] listItems){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setItems(listItems, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                    }
                });
        return builder.create();
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
        String selectedDate = "selected Date: " + String.valueOf(dayOfMonth) + "." + String.valueOf(month + 1) + "." + String.valueOf(year);

        String[] listItems = {
                "show details",
                "add birthday",
                "add reminder"
        };

        displayDialogWithList(selectedDate, listItems).show();
    }
}
