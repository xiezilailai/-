package com.example.xiezilailai.provincecountylistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    private ListView listView;
    private List<String>list;
    private String[] s={"北京市","天津市","重庆市","上海市","河北省","山西省","辽宁省","吉林省","黑龙江省","江苏省","浙江省","安徽省","福建省","江西省","山东省","河南省","湖北省","湖南省","广东省","海南省","四川省","贵州省","云南省","陕西省","甘肃省","青海省","内蒙古自治区","广西壮族自治区","西藏自治区","宁夏回族自治区","新疆维吾尔族自治区","台湾省","香港","澳门"};
    private ListViewAdapter listViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_view);

        list=new ArrayList<>();
        for(int i=0;i<s.length;i++){
            list.add(s[i]);
        }
        listView=(ListView)findViewById(R.id.listView);
        listViewAdapter=new ListViewAdapter(list,FirstActivity.this);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==32||i==33||i==34){
                    Intent intent=new Intent(FirstActivity.this,MainActivity.class);
                    intent.putExtra("place",list.get(i));
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                    intent.putExtra("code",i+"");
                    startActivity(intent);
                }

            }
        });
    }
}
