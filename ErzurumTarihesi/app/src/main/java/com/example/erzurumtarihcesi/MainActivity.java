package com.example.erzurumtarihcesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.erzurumtarihcesi.Adapter.AnaMenuAdapter;
import com.example.erzurumtarihcesi.Model.AnaMenuModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<AnaMenuModel> anaMenuModelArrayList;
    ListView listView;
    AnaMenuAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view3);
        anaMenuModelArrayList = new ArrayList<AnaMenuModel>();
        listeDoldur();
    }
    private void listeDoldur(){
        AnaMenuModel anaMenuModel = new AnaMenuModel("Erzurum Tarihçesi");
        AnaMenuModel anaMenuMode2 = new AnaMenuModel("Erzurumda Bulunan Tarihi Yerler");
        AnaMenuModel anaMenuMode3 = new AnaMenuModel("Erzurum Yöresel Yemekleri");
        AnaMenuModel anaMenuMode4 = new AnaMenuModel("Erzurum Yöresel Tatlıları");
        anaMenuModelArrayList.add(anaMenuModel);
        anaMenuModelArrayList.add(anaMenuMode2);
        anaMenuModelArrayList.add(anaMenuMode3);
        anaMenuModelArrayList.add(anaMenuMode4);
        adapter = new AnaMenuAdapter(anaMenuModelArrayList,this);
        listView.setAdapter(adapter);
    }
}