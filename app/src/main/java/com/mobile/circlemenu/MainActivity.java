package com.mobile.circlemenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {


    String arrayName[] = {"Nome 1","Nome 2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circleMenu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.logo_prototype, R.drawable.repertorio_icon)
        .addSubMenu(Color.parseColor("#CDCDCD"), R.drawable.logo_prototype)
         .addSubMenu(Color.parseColor("#CDCDCD"), R.drawable.logo_prototype).setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {
                Toast.makeText(getBaseContext(), "foi selecionado o item "+1, Toast.LENGTH_LONG).show();
            }
        });


    }
}
