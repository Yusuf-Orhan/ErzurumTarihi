package com.example.erzurumtarihcesi.Model;

import java.io.Serializable;

public class TatliModel implements Serializable {
    int resim;
    String baslik;
    String tanitim;

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getTanitim() {
        return tanitim;
    }

    public void setTanitim(String tanitim) {
        this.tanitim = tanitim;
    }

    public TatliModel(int resim, String baslik, String tanitim) {
        this.resim = resim;
        this.baslik = baslik;
        this.tanitim = tanitim;
    }
}
