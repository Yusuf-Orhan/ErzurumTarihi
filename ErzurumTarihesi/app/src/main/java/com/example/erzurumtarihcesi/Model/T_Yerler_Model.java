package com.example.erzurumtarihcesi.Model;

import java.io.Serializable;
import java.sql.DataTruncation;

public class T_Yerler_Model implements Serializable {
    private String baslik;
    private String tanitim;
    private int resim;

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

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
    }

    public T_Yerler_Model(String baslik, String tanitim, int resim) {
        this.baslik = baslik;
        this.tanitim = tanitim;
        this.resim = resim;
    }
}
