import java.io.PrintStream;
import java.util.*;

public class YonetimPaneli extends Runner{
    public static Scanner scan=new Scanner(System.in);
    public static String kisituru;
    public static List<Kisi> ogrenciIsım=new ArrayList<>();
    public static List<Kisi> ogretmenIsım=new ArrayList<>();

    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";


    public static void panel(){
        System.out.println(sari+"====================================\n" +
                "     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "    ====================================\n" +
                "     1- ÖĞRENCİ İŞLEMLERİ\n" +
                "     2- ÖĞRETMEN İŞLEMLERİ\n" +
                "     Q- ÇIKIŞ");
        System.out.println();

        System.out.println(sari+"Lütfen bir tercih yapınız");
        String tercih=scan.next().toLowerCase();
        switch (tercih){
            case "1":
                kisituru="ogrenci";
                islemler();
                break;
            case "2":
                kisituru="ogretmen";
                islemler();
                break;
            case "q":
                System.out.println(kirmizi+"Çıkış yaptınız");
                break;
            default:
                System.out.println(kirmizi+"Lütfen geçerli tercih yapınız");
                panel();
        }
    }
    public static void islemler(){
        System.out.println(sari+"============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n"+
                "         5-ANA MENÜ\n" +
                "         Q-ÇIKIŞ");
        System.out.println();

        System.out.println(sari+"Lütfen bir işlem seçiniz");
        String tercih2=scan.next().toLowerCase();
        switch (tercih2){
            case "1":
                ekleme();
                break;
            case "2":
                arama();
                break;
            case "3":
                listeleme();
                break;
            case "4":
                silme();
                break;
            case "5":
                panel();
                break;
            case "q":
                cıkıs();
                break;
            default:
                System.out.println(kirmizi+"Gerçerli Tercih Yapınız");
        }
    }
    private static void listeleme() {
        System.out.println(sari+"Ogrenci Listesi için 1'e Öğretmen Listesi için 2'ye basın");
        String girilen= scan.next();
        if (girilen.equals("1")) {
            for (Kisi w:ogrenciIsım
                 ) {
                System.out.println(mavi+"Ogrenci-İsim Soyad:"+w.getIsim()+" "+w.getSoyad());
            }{

            }

        }else if (girilen.equals("2")) {
            for (Kisi w : ogretmenIsım
            ) {
                System.out.println(mavi+"Ogretmen-İsim Soyad:" + w.getIsim() + " " + w.getSoyad());
            }
        }else {System.out.println(kirmizi+"Geçerli Tercih Yapınız");
        }
        islemler();
    }


    private static void cıkıs() {
        System.out.println(kirmizi+"Çıkış yaptınız");

    }
    private static void silme() {
        System.out.println(sari+"Ogrenci Silmek için 1'e Öğretmen Silmek için 2'ye basın");
        String arayacagımız= scan.next();
            if (arayacagımız.equals("1")) {
                System.out.println("Silmek istediginiz kisinin kimlik numarasi");
                String aranan = scan.next();
                try {
                    for (Kisi w : ogrenciIsım) {
                        if (w.getKimlikNo().equals(aranan)) {
                            System.out.println("Silmek istediğiniz Öğrenci: " + w.getIsim() + " " + w.getSoyad());
                            ogrenciIsım.remove(w);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("İşlem Gerçekleşti");
                }
            }else if (arayacagımız.equals("2")){
                System.out.println("Silmek istediginiz Ogretmenin Sicil numarasi");
                String arananOgretmen = scan.next();
                try {
                    for (Kisi w : ogretmenIsım) {
                        if (w.getKimlikNo().equals(arananOgretmen)) {
                            System.out.println("Silmek istediğiniz Ogretmen: " + w.getIsim() + " " + w.getSoyad());
                            ogretmenIsım.remove(w);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("İşlem Gerçekleşti");
                }

            }else {
                System.out.println(kirmizi+"Geçerli Tercih Yapınız");
            }
          islemler();
    }

    private static void arama() {
        System.out.println("Aramak istediginiz kisinin kimlik numarasi");
        String arama = scan.next();
        for (Kisi w : ogrenciIsım) {
            if ( w.getKimlikNo().equals(arama)){
                System.out.println("Aradığınız Öğrenci: "+w.getIsim()+" "+w.getSoyad());
            }
        }
        for (Kisi w : ogretmenIsım) {
            if (w.getKimlikNo().equals(arama)){
            }
            System.out.println("Arama Ogretmen: "+w.getIsim()+" "+w.getSoyad());
        }
        islemler();
    }


    public static void ekleme() {

          if (kisituru=="ogrenci") {
              System.out.println("Eklemek istediğiniz Öğrencinin adı");
              String isim= scan.next();//nextLine yazdığımızda isim konteynırı boş kalıyor
              scan.nextLine();
              System.out.println("Eklemek istediğiniz Öğrencinin soyadı");
              String soyad= scan.next();

              System.out.println("Eklemek istediğiniz Öğrencinin kimlik numarası");
              String kimlikNo= scan.next();
              System.out.println("Eklemek istediğiniz Öğrencinin yaşı");
              int yas= scan.nextInt();
              System.out.println("Eklemek istediğiniz Öğrencinin numarası");
              String ogrenciNo = scan.next();
              scan.nextLine();

              System.out.println("Sınıf bilgisi");
              String sınıfBilgisi = scan.next();
              scan.nextLine();

              Ogrenci eklenenOgrenci = new Ogrenci(isim, soyad, kimlikNo, yas, ogrenciNo,sınıfBilgisi);
              ogrenciIsım.add(eklenenOgrenci);
              System.out.println(kirmizi+"Girdiğiniz Öğrenci Eklenmiştir");
              panel();

          } if (kisituru=="ogretmen") {
            System.out.println("Eklemek istediğiniz Öğretmenin adı");
            String isim= scan.next();
            scan.nextLine();
            System.out.println("Eklemek istediğiniz Öğretmenin soyadı");
            String soyad= scan.next();
            scan.nextLine();
            System.out.println("Eklemek istediğiniz Öğretmenin kimlik numarası");
            String kimlikNo= scan.next();
            System.out.println("Eklemek istediğiniz Öğretmenin yaşı");
            int yas= scan.nextInt();
              System.out.println("Bölüm İsmi");
              String bolum= scan.next();
              System.out.println("Lütfen Sicil Numaranızı Giriniz");
              String sicilNo= scan.next();

              Ogretmen eklenenOgretmen= new Ogretmen(isim, soyad, kimlikNo, yas,bolum,sicilNo);
              ogretmenIsım.add(eklenenOgretmen);
            System.out.println(kirmizi+"Girdiğiniz Öğretmen Eklenmiştir");
              panel();
          }



    }
}
