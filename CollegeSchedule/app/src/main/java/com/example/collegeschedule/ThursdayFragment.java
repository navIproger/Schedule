package com.example.collegeschedule;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.List;

public class ThursdayFragment extends Fragment {

    private List<List<Subject>> subject;
    private List<Subject> monday;
    private int numberDay = 4;
    private MainActivity mainActivity;

    private ListView listView;
    private String title;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monday, container, false);
        mainActivity = new MainActivity();

        listView = view.findViewById(R.id.listViewMonday);
        subject = mainActivity.getListSubject(title);
        monday = subject.get(numberDay - 1);
        BaseAdapter adapter = new SubjectAdaptor(getContext(), monday);
        listView.setAdapter(adapter);

        return view;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ScheduleActivity) {
            ScheduleActivity activity = (ScheduleActivity) context;
            setTitle(activity.getTitleGroup());
        }
    }
}