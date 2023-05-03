package com.example.erzurumtarihcesi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.erzurumtarihcesi.MainActivity;
import com.example.erzurumtarihcesi.Model.AnaMenuModel;
import com.example.erzurumtarihcesi.Model.T_Yerler_Model;
import com.example.erzurumtarihcesi.R;
import com.example.erzurumtarihcesi.TarihceActivity;
import com.example.erzurumtarihcesi.TarihiYerlerActivity;

import java.util.ArrayList;

public class TarihceAdapter extends BaseAdapter {
    ArrayList<T_Yerler_Model> arrayList;
    Context context;

    public TarihceAdapter(ArrayList<T_Yerler_Model> anaMenuModelArrayList, Context context) {
        this.arrayList = anaMenuModelArrayList;
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
        textView.setText(arrayList.get(i).getBaslik());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = arrayList.get(i).getBaslik();
                Intent intent = new Intent(context, TarihceActivity.class);

                if (text.equals("Yakutiye Medresesi")){
                    intent.putExtra("selected_yer",arrayList.get(i));
                } else if (text.equals("Çifte Minareli Medrese")) {
                    intent.putExtra("selected_yer",arrayList.get(i));

                } else if (text.equals("Erzurum Kalesi")) {
                    intent.putExtra("selected_yer",arrayList.get(i));

                } else if (text.equals("Üç Kümbetler")) {
                    intent.putExtra("selected_yer",arrayList.get(i));

                } else if (text.equals("Erzurum Eyaleti Binası")) {
                    intent.putExtra("selected_yer",arrayList.get(i));
                }
                context.startActivity(intent);
            }
        });
        return layout;
    }
}
