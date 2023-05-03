package com.example.erzurumtarihcesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.erzurumtarihcesi.Adapter.YemekTarifAdapter;
import com.example.erzurumtarihcesi.Model.TarifModel;
import com.example.erzurumtarihcesi.databinding.ActivityTarihceBinding;

import java.util.ArrayList;

public class YemekTariifi extends AppCompatActivity {
    ListView listView;
    ArrayList<TarifModel> modelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_tariifi);
        listView = findViewById(R.id.list_view3);
        modelArrayList = new ArrayList<>();
        liste_doldur();
    }
    private void liste_doldur(){
        TarifModel t1 = new TarifModel(R.drawable.yemek1,"Cağ Kebabı","Erzurum'un en ünlü yemeklerinden biridir. Dövülmüş etin şişe geçirilerek mangalda pişirilmesiyle hazırlanır. Servis edilirken ekşi mayalı ekmek, közlenmiş patlıcan ve biberle birlikte sunulur.");
        TarifModel t2 = new TarifModel(R.drawable.yemek2,"Kesme Çorbası"," Erzurum'un soğuk kış günlerinde sıcak sıcak içilen bir çorbasıdır. İnce kesilmiş hamur parçaları, et suyu, tereyağı ve baharatlarla hazırlanır. Genellikle üzerine kırmızı pul biber serpilerek servis edilir.");
        TarifModel t3 = new TarifModel(R.drawable.yemek3,"Ayran Aşı","Erzurum'un diğer bir ünlü çorbasıdır. Yoğurt, un ve su karışımı ile hazırlanır. Çorba kaynatıldıktan sonra üzerine tereyağı ve kırmızı pul biber eklenir. Genellikle kuru nane ve ekşi mayalı ekmekle birlikte servis edilir.");
        modelArrayList.add(t1);
        modelArrayList.add(t2);
        modelArrayList.add(t3);
        YemekTarifAdapter adapter = new YemekTarifAdapter(modelArrayList,this);
        listView.setAdapter(adapter);
    }
}