package com.example.erzurumtarihcesi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.erzurumtarihcesi.Model.AnaMenuModel;
import com.example.erzurumtarihcesi.R;
import com.example.erzurumtarihcesi.TarihceActivity;
import com.example.erzurumtarihcesi.TarihiYerlerActivity;
import com.example.erzurumtarihcesi.TatlilarActivity;
import com.example.erzurumtarihcesi.YemekTariifi;

import java.util.ArrayList;

public class AnaMenuAdapter extends BaseAdapter {
    ArrayList<AnaMenuModel> arrayList;
    Context context;

    public AnaMenuAdapter(ArrayList<AnaMenuModel> arrayList,Context context) {
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
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View layout = LayoutInflater.from(context).inflate(R.layout.list_view_satiri,viewGroup,false);
        TextView textView = layout.findViewById(R.id.textView);
        textView.setText(arrayList.get(i).getBaslık());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String baslik = arrayList.get(i).getBaslık();
                if (baslik.equals("Erzurum Tarihçesi")){
                   Intent intent = new Intent(context, TarihceActivity.class);
                   context.startActivity(intent);
                }else if (baslik.equals("Erzurumda Bulunan Tarihi Yerler")){
                    Intent intent = new Intent(context, TarihiYerlerActivity.class);
                    context.startActivity(intent);
                }else if (baslik.equals("Erzurum Yöresel Yemekleri")){
                   Intent intent = new Intent(context, YemekTariifi.class);
                   context.startActivity(intent);
                } else if (baslik.equals("Erzurum Yöresel Tatlıları")) {
                    Intent intent = new Intent(context, TatlilarActivity.class);
                    context.startActivity(intent);                }
            }
        });
        return layout;
    }
}
