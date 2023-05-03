package com.example.erzurumtarihcesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.erzurumtarihcesi.Adapter.TarihceAdapter;
import com.example.erzurumtarihcesi.Model.AnaMenuModel;
import com.example.erzurumtarihcesi.Model.T_Yerler_Model;

import java.util.ArrayList;

public class TarihiYerlerActivity extends AppCompatActivity {
    ArrayList<T_Yerler_Model> tarihi_yerler_list = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihi_yerler);
        listView = findViewById(R.id.listview2);
        liste_doldur();
    }
    public void liste_doldur(){
        T_Yerler_Model t1 = new T_Yerler_Model("Yakutiye Medresesi","14. yüzyılda inşa edilmiş olan Yakutiye Medresesi, Selçuklu mimarisiyle inşa edilmiştir. İçindeki avlu, zemin katı, üst katı ve kubbesiyle dönemin en büyük medreselerinden biridir.",R.drawable.yakutiyemedresesi);
        T_Yerler_Model t2 = new T_Yerler_Model("Çifte Minareli Medrese","13. yüzyılda İlhanlı hükümdarı Sultan Keyhüsrev tarafından yaptırılan medrese, 2 adet minaresiyle dikkat çekmektedir. Selçuklu ve İslam sanatının en önemli örneklerinden biridir.",R.drawable.cift_minareli_medrese);
        T_Yerler_Model t3 = new T_Yerler_Model("Erzurum Kalesi","Şehrin en yüksek noktasında yer alan kale, Urartular döneminden kalma bir yapıdır. Kale, Osmanlı Devleti döneminde genişletilmiştir ve bugün de ziyaretçiler tarafından ilgiyle gezilmektedir.",R.drawable.erzurum_kalesi);
        T_Yerler_Model t4 = new T_Yerler_Model("Üç Kümbetler","12. yüzyılda Selçuklu hükümdarı tarafından yaptırılan yapı, 3 adet kubbesiyle dikkat çekmektedir. İslam sanatının önemli örneklerinden biridir.",R.drawable.uc);
        T_Yerler_Model t5 = new T_Yerler_Model("Erzurum Eyaleti Binası"," Osmanlı Devleti döneminde valilik olarak kullanılan bina, 1918 yılında Rus işgali sırasında büyük bir yangın sonucu tamamen yanmıştır. Daha sonra restore edilmiştir ve günümüzde Erzurum Müzesi olarak hizmet vermektedir..",R.drawable.eyalet_binasi);
        tarihi_yerler_list.add(t1);
        tarihi_yerler_list.add(t2);
        tarihi_yerler_list.add(t3);
        tarihi_yerler_list.add(t4);
        tarihi_yerler_list.add(t5);
        TarihceAdapter adapter  = new TarihceAdapter(tarihi_yerler_list,this);
        listView.setAdapter(adapter);
    }
}