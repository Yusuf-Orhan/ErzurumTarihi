package com.example.erzurumtarihcesi.Model;

import android.content.Intent;

import java.io.Serializable;

public class TarifModel implements Serializable {
    private Integer resim;
    private String baslik;
    private String tarif;

    public Integer getResim() {
        return resim;
    }

    public void setResim(Integer resim) {
        this.resim = resim;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public TarifModel(Integer resim, String baslik, String tarif) {
        this.resim = resim;
        this.baslik = baslik;
        this.tarif = tarif;
    }
}
