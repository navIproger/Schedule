package com.example.collegeschedule;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerGroup;
    private Button buttonSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }

        spinnerGroup = findViewById(R.id.spinnerGroup);
        buttonSelect = findViewById(R.id.btn_select);
    }

    public void showSchedule(View view) {
        String group = spinnerGroup.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(), group, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(), ScheduleActivity.class);
        intent.putExtra("nameGroup", group);
        startActivity(intent);
    }

    public List<List<Subject>> getListSubject(String nameGroup) {

        switch (nameGroup) {
            case "31-КІ":
                Subject FirstMonKE = new Subject("1", "Діагностика КС", "Лобур О.І", "каб.31", "Лекція");
                Subject SecondMonKE = new Subject("2", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject ThirdMonKE = new Subject("3", "Моделювання КС", "Терехов В.В", "каб.31", "Лекція");
                Subject FirstTueKE = new Subject("1", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лекція");
                Subject SecondTueKE = new Subject("2", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лабораторна");
                Subject ThirdTueKE = new Subject("3", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.43", "Лекція");
                Subject FirstWedKE = new Subject("1", "ООП", "Овечків", "каб.23", "Лабораторна");
                Subject SecondWedKE = new Subject("2", "ООП", "Овечкін", "каб.41", "Лекція");
                Subject FirstThuKE = new Subject("1", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject SecondThuKE = new Subject("2", "Фізичне виховання", "Наконечний А.І", "Спортзал", "Практичне заняття");
                Subject ThirdThuKE = new Subject("3", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.31", "Лабораторна");
                Subject FirstFriKE = new Subject("1", "Організація Баз даних", "Заяць М.М", "каб.23", "Лабораторна");
                Subject SecondFriKE = new Subject("2", "Організація Баз даних", "Заяць М.М", "каб.36", "Лекція");
                Subject ThirdFriKE = new Subject("3", "Англійська мова", "Притула Г.Б", "каб.31", "Практичне заняття");

                List<Subject> MonKE = new ArrayList<>();
                MonKE.add(FirstMonKE);
                MonKE.add(SecondMonKE);
                MonKE.add(ThirdMonKE);
                List<Subject> TueKE = new ArrayList<>();
                TueKE.add(FirstTueKE);
                TueKE.add(SecondTueKE);
                TueKE.add(ThirdTueKE);
                List<Subject> WedKE = new ArrayList<>();
                WedKE.add(FirstWedKE);
                WedKE.add(SecondWedKE);
                List<Subject> ThuKE = new ArrayList<>();
                ThuKE.add(FirstThuKE);
                ThuKE.add(SecondThuKE);
                ThuKE.add(ThirdThuKE);
                List<Subject> FriKE = new ArrayList<>();
                FriKE.add(FirstFriKE);
                FriKE.add(SecondFriKE);
                FriKE.add(ThirdFriKE);

                List<List<Subject>> scheduleKE = new ArrayList<>();
                scheduleKE.add(MonKE);
                scheduleKE.add(TueKE);
                scheduleKE.add(WedKE);
                scheduleKE.add(ThuKE);
                scheduleKE.add(FriKE);

                return scheduleKE;

            case "32-ПЗ":
                Subject FirstMonSP2 = new Subject("2", "Діагностика КС", "Лобур О.І", "каб.31", "Лекція");
                Subject SecondMonSP2 = new Subject("3", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject ThirdMonSP2 = new Subject("4", "Моделювання КС", "Терехов В.В", "каб.31", "Лекція");
                Subject FirstTueSP2 = new Subject("2", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лекція");
                Subject SecondTueSP2 = new Subject("3", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лабораторна");
                Subject ThirdTueSP2 = new Subject("4", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.43", "Лекція");
                Subject FirstWedSP2 = new Subject("2", "ООП", "Овечків", "каб.23", "Лабораторна");
                Subject SecondWedSP2 = new Subject("3", "ООП", "Овечкін", "каб.41", "Лекція");
                Subject FirstThuSP2 = new Subject("2", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject SecondThuSP2 = new Subject("3", "Фізичне виховання", "Наконечний А.І", "Спортзал", "Практичне заняття");
                Subject ThirdThuSP2 = new Subject("4", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.31", "Лабораторна");
                Subject FirstFriSP2 = new Subject("2", "Організація Баз даних", "Заяць М.М", "каб.23", "Лабораторна");
                Subject SecondFriSP2 = new Subject("3", "Організація Баз даних", "Заяць М.М", "каб.36", "Лекція");
                Subject ThirdFriSP2 = new Subject("4", "Англійська мова", "Притула Г.Б", "каб.31", "Практичне заняття");

                List<Subject> MonSP2 = new ArrayList<>();
                MonSP2.add(FirstMonSP2);
                MonSP2.add(SecondMonSP2);
                MonSP2.add(ThirdMonSP2);
                List<Subject> TueSP2 = new ArrayList<>();
                TueSP2.add(FirstTueSP2);
                TueSP2.add(SecondTueSP2);
                TueSP2.add(ThirdTueSP2);
                List<Subject> WedSP2 = new ArrayList<>();
                WedSP2.add(FirstWedSP2);
                WedSP2.add(SecondWedSP2);
                List<Subject> ThuSP2 = new ArrayList<>();
                ThuSP2.add(FirstThuSP2);
                ThuSP2.add(SecondThuSP2);
                ThuSP2.add(ThirdThuSP2);
                List<Subject> FriSP2 = new ArrayList<>();
                FriSP2.add(FirstFriSP2);
                FriSP2.add(SecondFriSP2);
                FriSP2.add(ThirdFriSP2);

                List<List<Subject>> scheduleSP2 = new ArrayList<>();
                scheduleSP2.add(MonSP2);
                scheduleSP2.add(TueSP2);
                scheduleSP2.add(WedSP2);
                scheduleSP2.add(ThuSP2);
                scheduleSP2.add(FriSP2);

                return scheduleSP2;

            case "31-ПЗ":
                Subject FirstMonSP1 = new Subject("1", "Діагностика КС", "Лобур О.І", "каб.31", "Лекція");
                Subject SecondMonSP1 = new Subject("3", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject ThirdMonSP1 = new Subject("4", "Моделювання КС", "Терехов В.В", "каб.31", "Лекція");
                Subject FirstTueSP1 = new Subject("1", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лекція");
                Subject SecondTueSP1 = new Subject("3", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лабораторна");
                Subject ThirdTueSP1 = new Subject("4", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.43", "Лекція");
                Subject FirstWedSP1 = new Subject("1", "ООП", "Овечків", "каб.23", "Лабораторна");
                Subject SecondWedSP1 = new Subject("3", "ООП", "Овечкін", "каб.41", "Лекція");
                Subject FirstThuSP1 = new Subject("1", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject SecondThuSP1 = new Subject("3", "Фізичне виховання", "Наконечний А.І", "Спортзал", "Практичне заняття");
                Subject ThirdThuSP1 = new Subject("4", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.31", "Лабораторна");
                Subject FirstFriSP1 = new Subject("1", "Організація Баз даних", "Заяць М.М", "каб.23", "Лабораторна");
                Subject SecondFriSP1 = new Subject("3", "Організація Баз даних", "Заяць М.М", "каб.36", "Лекція");
                Subject ThirdFriSP1 = new Subject("4", "Англійська мова", "Притула Г.Б", "каб.31", "Практичне заняття");

                List<Subject> MonSP1 = new ArrayList<>();
                MonSP1.add(FirstMonSP1);
                MonSP1.add(SecondMonSP1);
                MonSP1.add(ThirdMonSP1);
                List<Subject> TueSP1 = new ArrayList<>();
                TueSP1.add(FirstTueSP1);
                TueSP1.add(SecondTueSP1);
                TueSP1.add(ThirdTueSP1);
                List<Subject> WedSP1 = new ArrayList<>();
                WedSP1.add(FirstWedSP1);
                WedSP1.add(SecondWedSP1);
                List<Subject> ThuSP1 = new ArrayList<>();
                ThuSP1.add(FirstThuSP1);
                ThuSP1.add(SecondThuSP1);
                ThuSP1.add(ThirdThuSP1);
                List<Subject> FriSP1 = new ArrayList<>();
                FriSP1.add(FirstFriSP1);
                FriSP1.add(SecondFriSP1);
                FriSP1.add(ThirdFriSP1);

                List<List<Subject>> scheduleSP1 = new ArrayList<>();
                scheduleSP1.add(MonSP1);
                scheduleSP1.add(TueSP1);
                scheduleSP1.add(WedSP1);
                scheduleSP1.add(ThuSP1);
                scheduleSP1.add(FriSP1);

                return scheduleSP1;

            case "31-АП":
                Subject FirstMonEPI = new Subject("1", "Діагностика КС", "Лобур О.І", "каб.31", "Лекція");
                Subject SecondMonEPI = new Subject("2", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject ThirdMonEPI = new Subject("4", "Моделювання КС", "Терехов В.В", "каб.31", "Лекція");
                Subject FirstTueEPI = new Subject("1", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лекція");
                Subject SecondTueEPI = new Subject("2", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лабораторна");
                Subject ThirdTueEPI = new Subject("4", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.43", "Лекція");
                Subject FirstWedEPI = new Subject("1", "ООП", "Овечків", "каб.23", "Лабораторна");
                Subject SecondWedEPI = new Subject("2", "ООП", "Овечкін", "каб.41", "Лекція");
                Subject FirstThuEPI = new Subject("1", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject SecondThuEPI = new Subject("2", "Фізичне виховання", "Наконечний А.І", "Спортзал", "Практичне заняття");
                Subject ThirdThuEPI = new Subject("4", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.31", "Лабораторна");
                Subject FirstFriEPI = new Subject("1", "Організація Баз даних", "Заяць М.М", "каб.23", "Лабораторна");
                Subject SecondFriEPI = new Subject("2", "Організація Баз даних", "Заяць М.М", "каб.36", "Лекція");
                Subject ThirdFriEPI = new Subject("4", "Англійська мова", "Притула Г.Б", "каб.31", "Практичне заняття");

                List<Subject> MonEPI = new ArrayList<>();
                MonEPI.add(FirstMonEPI);
                MonEPI.add(SecondMonEPI);
                MonEPI.add(ThirdMonEPI);
                List<Subject> TueEPI = new ArrayList<>();
                TueEPI.add(FirstTueEPI);
                TueEPI.add(SecondTueEPI);
                TueEPI.add(ThirdTueEPI);
                List<Subject> WedEPI = new ArrayList<>();
                WedEPI.add(FirstWedEPI);
                WedEPI.add(SecondWedEPI);
                List<Subject> ThuEPI = new ArrayList<>();
                ThuEPI.add(FirstThuEPI);
                ThuEPI.add(SecondThuEPI);
                ThuEPI.add(ThirdThuEPI);
                List<Subject> FriEPI = new ArrayList<>();
                FriEPI.add(FirstFriEPI);
                FriEPI.add(SecondFriEPI);
                FriEPI.add(ThirdFriEPI);

                List<List<Subject>> scheduleEPI = new ArrayList<>();
                scheduleEPI.add(MonEPI);
                scheduleEPI.add(TueEPI);
                scheduleEPI.add(WedEPI);
                scheduleEPI.add(ThuEPI);
                scheduleEPI.add(FriEPI);

                return scheduleEPI;

            case "31-АКТ":
                Subject FirstMonACT = new Subject("1", "Діагностика КС", "Лобур О.І", "каб.31", "Лекція");
                Subject SecondMonACT = new Subject("2.Ч", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject ThirdMonACT = new Subject("2.З", "Моделювання КС", "Терехов В.В", "каб.31", "Лекція");
                Subject FirstTueACT = new Subject("1", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лекція");
                Subject SecondTueACT = new Subject("2.Ч", "Мікросхемотехніка", "Гасько Л.З", "каб.44", "Лабораторна");
                Subject ThirdTueACT = new Subject("2.З", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.43", "Лекція");
                Subject FirstWedACT = new Subject("1", "ООП", "Овечків", "каб.23", "Лабораторна");
                Subject SecondWedACT = new Subject("2", "ООП", "Овечкін", "каб.41", "Лекція");
                Subject FirstThuACT = new Subject("1", "Дискретна матиматика", "Мохонько В.Д", "каб.31", "Лекція");
                Subject SecondThuACT = new Subject("2.Ч", "Фізичне виховання", "Наконечний А.І", "Спортзал", "Практичне заняття");
                Subject ThirdThuACT = new Subject("2.З", "Комп'ютерна схемотехніка та архітектура компютера", "Терехов В.В", "каб.31", "Лабораторна");
                Subject FirstFriACT = new Subject("1.Ч", "Організація Баз даних", "Заяць М.М", "каб.23", "Лабораторна");
                Subject SecondFriACT = new Subject("1.З", "Організація Баз даних", "Заяць М.М", "каб.36", "Лекція");
                Subject ThirdFriACT = new Subject("2", "Англійська мова", "Притула Г.Б", "каб.31", "Практичне заняття");

                List<Subject> MonACT = new ArrayList<>();
                MonACT.add(FirstMonACT);
                MonACT.add(SecondMonACT);
                MonACT.add(ThirdMonACT);
                List<Subject> TueACT = new ArrayList<>();
                TueACT.add(FirstTueACT);
                TueACT.add(SecondTueACT);
                TueACT.add(ThirdTueACT);
                List<Subject> WedACT = new ArrayList<>();
                WedACT.add(FirstWedACT);
                WedACT.add(SecondWedACT);
                List<Subject> ThuACT = new ArrayList<>();
                ThuACT.add(FirstThuACT);
                ThuACT.add(SecondThuACT);
                ThuACT.add(ThirdThuACT);
                List<Subject> FriACT = new ArrayList<>();
                FriACT.add(FirstFriACT);
                FriACT.add(SecondFriACT);
                FriACT.add(ThirdFriACT);

                List<List<Subject>> scheduleACT = new ArrayList<>();
                scheduleACT.add(MonACT);
                scheduleACT.add(TueACT);
                scheduleACT.add(WedACT);
                scheduleACT.add(ThuACT);
                scheduleACT.add(FriACT);

                return scheduleACT;

            default:
                return null;
        }
    }
}