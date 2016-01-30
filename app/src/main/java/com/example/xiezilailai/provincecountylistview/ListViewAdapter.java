package com.example.xiezilailai.provincecountylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 蝎子莱莱123 on 2016/1/29.
 */
public class ListViewAdapter extends BaseAdapter {
    private List<String>list;
    private Context context;

    public ListViewAdapter(List<String>list,Context context){
        this.list=list;
        this.context=context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public  String getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1= LayoutInflater.from(context).inflate(R.layout.list_item_view,null);
        TextView textView= (TextView) view1.findViewById(R.id.item_text);
        textView.setText(getItem(i));
        return view1;
    }
}
