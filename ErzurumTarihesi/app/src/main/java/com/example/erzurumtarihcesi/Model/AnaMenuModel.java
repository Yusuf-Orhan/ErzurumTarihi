package com.example.erzurumtarihcesi.Model;

import java.io.Serializable;

public class AnaMenuModel implements Serializable {
    public String getBaslık() {
        return baslık;
    }

    public void setBaslık(String baslık) {
        this.baslık = baslık;
    }

    private String baslık;

    public AnaMenuModel(String baslık) {
        this.baslık = baslık;
    }
}
