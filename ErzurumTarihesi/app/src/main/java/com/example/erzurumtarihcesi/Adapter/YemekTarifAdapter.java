package com.example.erzurumtarihcesi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.erzurumtarihcesi.Model.TarifModel;
import com.example.erzurumtarihcesi.R;
import com.example.erzurumtarihcesi.TarihceActivity;

import java.util.ArrayList;

public class YemekTarifAdapter extends BaseAdapter {
    ArrayList<TarifModel> arrayList;
    Context context;

    public YemekTarifAdapter(ArrayList<TarifModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View layout = LayoutInflater.from(context).inflate(R.layout.list_view_satiri,viewGroup,false);
        TextView text = layout.findViewById(R.id.textView);
        text.setText(arrayList.get(position).getBaslik());
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String baslik = arrayList.get(position).getBaslik();
                Intent intent = new Intent(context, TarihceActivity.class);
                if(baslik.equals("Cağ Kebabı")){
                    intent.putExtra("selected_yemek",arrayList.get(position));
                } else if (baslik.equals("Kesme Çorbası")) {
                    intent.putExtra("selected_yemek",arrayList.get(position));
                }else if (baslik.equals("Ayran Aşı")){
                    intent.putExtra("selected_yemek",arrayList.get(position));
                }
                context.startActivity(intent);
            }
        });
        return layout;
    }
}
