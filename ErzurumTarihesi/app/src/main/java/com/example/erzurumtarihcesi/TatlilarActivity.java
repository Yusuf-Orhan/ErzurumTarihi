package com.example.erzurumtarihcesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.erzurumtarihcesi.Adapter.TatliAdapter;
import com.example.erzurumtarihcesi.Model.TatliModel;

import java.awt.font.TextAttribute;
import java.util.ArrayList;

public class TatlilarActivity extends AppCompatActivity {
    ArrayList<TatliModel> arrayList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatlilar);
        arrayList = new ArrayList<>();
        listView = findViewById(R.id.list_view4);
        liste_doldur();
    }
    public void liste_doldur(){
        TatliModel tatliModel = new TatliModel(R.drawable.tatli1,"Kayısı Dolması"," Erzurum'da yetişen lezzetli kayısılarla yapılan bir tatlıdır. Kayısıların çekirdekleri çıkarıldıktan sonra, ceviz, şeker ve baharatlarla doldurulur ve kaynatılır. Ardından soğutularak servis edilir.");
        TatliModel tatliModel2 = new TatliModel(R.drawable.tali2,"Şıllık Tatlısı","Erzurum'un en meşhur tatlılarından biridir. İnce hamurlar açılarak, peynir, ceviz ve şeker karışımıyla doldurulur ve kızartılır. Şerbet ile servis edilir.");
        TatliModel tatliModel3 = new TatliModel(R.drawable.tatli3,"Cevizli Baklava","Erzurum'da da oldukça yaygın olan baklava, yufka, ceviz, şeker ve tereyağından yapılan bir tatlıdır. Üstüne pudra şekeri serpilerek servis edilir. Erzurum baklavası, diğer bölgelerdeki baklavalarla karşılaştırıldığında daha ince yufkaları ve daha az şerbetiyle bilinir.");
        arrayList.add(tatliModel);
        arrayList.add(tatliModel2);
        arrayList.add(tatliModel3);
        TatliAdapter adapter = new TatliAdapter(arrayList,this);
        listView.setAdapter(adapter);
    }
}