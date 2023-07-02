package com.example.collegeschedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SubjectAdaptor extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private List<Subject> subjects;

    private TextView tvNumber;
    private TextView tvTime;
    private TextView tvTitle;
    private TextView tvTeacherAndCabinet;
    private TextView tvType;

    public SubjectAdaptor(Context context, List<Subject> subjects) {
        this.context = context;
        this.subjects = subjects;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return subjects.size();
    }

    @Override
    public Object getItem(int position) {
        return subjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.subject_item, parent, false);
        }

        Subject subject = getSubject(position);

        tvNumber = view.findViewById(R.id.textViewNumberSubject);
        tvTime = view.findViewById(R.id.textViewTimeSubject);
        tvTitle = view.findViewById(R.id.textViewTitleSubject);
        tvTeacherAndCabinet = view.findViewById(R.id.textViewNameTeacher);
        tvType = view.findViewById(R.id.textViewTypeSubject);

        tvNumber.setText(subject.getNumberLesson());
        tvTitle.setText(subject.getTitleLesson());
        tvTeacherAndCabinet.setText(subject.getTeacherLesson() + " " + subject.getCabinetLesson());
        tvType.setText(subject.getTypeLesson());

        switch (tvNumber.getText().toString()){
            case "1":
                tvTime.setText("9:25-10:45");
                break;
            case "2":
                tvTime.setText("10:55-12:15");
                break;
            case "3":
                tvTime.setText("12:40-14:00");
                break;
            case "4":
                tvTime.setText("14:10-15:35");
                break;
            case "5":
                tvTime.setText("15:45-17:05");
                break;
        }



        return view;
    }

    private Subject getSubject(int position) {
        return (Subject) getItem(position);
    }
}
