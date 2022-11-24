public class Kisi {
    private String isim;
    private String soyad;

    private String kimlikNo;
    private int yas;

    public Kisi() {
    }

    public Kisi(String isim, String soyad, String kimlikNo, int yas) {
        this.isim = isim;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (!(yas<0)) {
            this.yas = yas;
        }
    }


    @Override
    public String toString() {
        return "Kisi {" +
                "isim:'" + isim + '\'' +
                ", soyad:'" + soyad + '\'' +
                ", kimlikNo:'" + kimlikNo + '\'' +
                ", yas:" + yas +
                '}';
    }
}
