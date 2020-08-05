package com.zula.zulahaber.ui.karakterler;

public class getKarakter {
    String karakterTur;
    String karakterAdi;

    public getKarakter(String karakterTur, String karakterAdi) {
        this.karakterTur = karakterTur;
        this.karakterAdi = karakterAdi;
    }

    public String getKarakterTur() {
        return karakterTur;
    }

    public void setKarakterTur(String karakterTur) {
        this.karakterTur = karakterTur;
    }

    public String getKarakterAdi() {
        return karakterAdi;
    }

    public void setKarakterAdi(String karakterAdi) {
        this.karakterAdi = karakterAdi;
    }
}
