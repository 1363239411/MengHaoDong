package com.example.administrator.my_text;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.gjiazhe.wavesidebar.WaveSideBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//上传
        WaveSideBar waveSideBar = (WaveSideBar) findViewById(R.id.side_bar);
        waveSideBar.setTextColor(Color.BLACK);
        waveSideBar.setMaxOffset(50);//字母偏移量
        waveSideBar.setPosition(WaveSideBar.POSITION_RIGHT);//侧边栏在左边还是右边
        waveSideBar.setLazyRespond(true);//false:列表随侧边栏的滚动滚动

        waveSideBar.setOnSelectIndexItemListener(new WaveSideBar.OnSelectIndexItemListener() {
            @Override
            public void onSelectIndexItem(String index) {

                Toast.makeText(MainActivity.this, index, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,OneActivity.class));
            }
        });
    }
}
