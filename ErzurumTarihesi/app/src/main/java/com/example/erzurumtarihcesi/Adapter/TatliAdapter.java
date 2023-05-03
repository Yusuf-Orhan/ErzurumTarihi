package com.example.erzurumtarihcesi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.erzurumtarihcesi.Model.TatliModel;
import com.example.erzurumtarihcesi.R;
import com.example.erzurumtarihcesi.TarihceActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TatliAdapter extends BaseAdapter {
    ArrayList<TatliModel> arrayList;
    Context context;

    public TatliAdapter(ArrayList<TatliModel> arrayList, Context context) {
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        View layout = LayoutInflater.from(context).inflate(R.layout.list_view_satiri,viewGroup,false);
        TextView textView = layout.findViewById(R.id.textView);
        textView.setText(arrayList.get(i).getBaslik());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String baslik = arrayList.get(i).getBaslik();
                Intent intent = new Intent(context, TarihceActivity.class);
                if (baslik.equals("Kayısı Dolması")){
                    intent.putExtra("selected_tatli",arrayList.get(i));
                } else if (baslik.equals("Şıllık Tatlısı")) {
                    intent.putExtra("selected_tatli",arrayList.get(i));
                } else if (baslik.equals("Cevizli Baklava")) {
                    intent.putExtra("selected_tatli",arrayList.get(i));
                }
                context.startActivity(intent);
            }
        });
        return layout;
    }
}
