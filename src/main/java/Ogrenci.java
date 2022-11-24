public class Ogrenci extends Kisi{
    private String no;
    private String sinif;

    public Ogrenci(){

    }

    public Ogrenci(String no, String sinif) {
        this.no = no;
        this.sinif = sinif;
    }

    public Ogrenci(String isim, String soyad, String kimlikNo, int yas, String no, String sinif) {
        super(isim, soyad, kimlikNo, yas);
        this.no = no;
        this.sinif = sinif;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "no:'" + no + '\'' +
                ", sinif:'" + sinif + '\'' +
                '}'
                +super.toString();
    }
}
