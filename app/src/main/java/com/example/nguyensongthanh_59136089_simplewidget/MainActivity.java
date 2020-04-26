package com.example.nguyensongthanh_59136089_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    TextView vanban1, vanban2, vanban3, vanban4, vanban5;
    EditText suaten, suangay, suasothich;
    RadioGroup radi;
    CheckBox xemphim, nghenhac,  caphe, onha, nauan;
    Button nut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews() {
        suaten = findViewById(R.id.suaten);
        suangay = findViewById(R.id.suangay);
        suasothich = findViewById(R.id.suasothich);
        radi = findViewById(R.id.radi);
        xemphim = findViewById(R.id.xemphim);
        nghenhac = findViewById(R.id.nghenhac);
        caphe = findViewById(R.id.caphe);
        onha = findViewById(R.id.onha);
        nauan = findViewById(R.id.nauan);
        nut = findViewById(R.id.nut);
    }
    private void addEvents() {
        nut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }
    private void show() {
        String mesage = suaten.getText()+"\n"+"Ngày sinh: "+suangay.getText()+"\n";
        switch (radi.getCheckedRadioButtonId()) {
            case R.id.nam:
                mesage = mesage + "Giới tính: Nam"+"\n"+"Sở thích: ";
                break;
            case R.id.nu:
                mesage = mesage + "Giới tính: Nữ"+"\n"+"Sở thích: ";
                break;
        }
        if(xemphim.isChecked()) {
            mesage = mesage + xemphim.getText() + "; ";
        }
        if(nghenhac.isChecked()) {
            mesage = mesage + nghenhac.getText() + "; ";
        }
        if(caphe.isChecked()) {
            mesage = mesage + caphe.getText() + "; ";
        }
        if(onha.isChecked()) {
            mesage = mesage + onha.getText() + "; ";
        }
        if(nauan.isChecked()) {
            mesage = mesage + nauan.getText() + "; ";
        }
        mesage = mesage + suasothich.getText();
        Toast toast=Toast.makeText(getApplicationContext(),mesage,Toast.LENGTH_LONG);
        View view=toast.getView();
        TextView view1 =(TextView)view.findViewById(android.R.id.message);
        view1.setTextColor(Color.WHITE);
        view.setBackgroundResource(R.color.colorMessage);
        toast.show();

    }
}
