package com.example.erzurumtarihcesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.erzurumtarihcesi.Model.T_Yerler_Model;
import com.example.erzurumtarihcesi.Model.TarifModel;
import com.example.erzurumtarihcesi.Model.TatliModel;
import com.example.erzurumtarihcesi.databinding.ActivityTarihceBinding;

public class TarihceActivity extends AppCompatActivity {
    ActivityTarihceBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTarihceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        TatliModel tatliModel = (TatliModel) intent.getSerializableExtra("selected_tatli");
        TarifModel tarifModel = (TarifModel) intent.getSerializableExtra("selected_yemek");
        T_Yerler_Model selectedModel = (T_Yerler_Model) intent.getSerializableExtra("selected_yer");
        if (selectedModel != null){
            binding.imageView.setImageResource(selectedModel.getResim());
            binding.textView2.setText(selectedModel.getBaslik());
            binding.textView3.setText(selectedModel.getTanitim());
        } else if (tarifModel != null) {
            binding.imageView.setImageResource(tarifModel.getResim());
            binding.textView2.setText(tarifModel.getBaslik());
            binding.textView3.setText(tarifModel.getTarif());
        } else if(tatliModel != null){
            binding.imageView.setImageResource(tatliModel.getResim());
            binding.textView2.setText(tatliModel.getBaslik());
            binding.textView3.setText(tatliModel.getTanitim());
        } else{
            Toast.makeText(getApplicationContext(), "Boş Geldi", Toast.LENGTH_SHORT).show();
        }
    }
}