package com.eqdd.actionsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.create.library.ChooseSheetUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChooseSheetUtil.getBottomChoose(this, "title", new String[]{"1", "2", "3", "4", "5", "6", "7"}, new ChooseSheetUtil.OnItemClickListener() {
            @Override
            public void onItemClick(Object o, int position) {
                System.out.println(position);
            }
        }).show();
    }
}
