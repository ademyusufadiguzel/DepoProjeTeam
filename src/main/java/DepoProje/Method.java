package DepoProje;


import java.util.*;


public class Method {


    static Scanner input = new Scanner(System.in);

    static Map<String, UrunlerPojo> urunlerListesi = new HashMap<>();

    static Set<Map.Entry<String, UrunlerPojo>> urunDetaylari = urunlerListesi.entrySet();

    static Set<String> idNumaralari = urunlerListesi.keySet();



    public static void urunTanimlama() {
        System.out.println("-".repeat(20) + "Urun Tanimlama Sayfasi" + "-".repeat(20));

        System.out.println("Eklemek Istediginiz urunun id numarasini 5 haneli olarak giriniz.");
        String id = input.next();
        if (id.matches("[0-9]{5}")) {
            System.out.println("Eklemek istediginiz urunun Ismini giriniz");
            String urunIsmi = input.next();
            System.out.println("Eklemek istediginiz urunun  Ureticisini giriniz");
            String uretici = input.next();
            System.out.println("Eklemek istediginiz urunun  miktarini giriniz");
            int miktar = input.nextInt();
            System.out.println("Eklemek istediginiz urunun  birimini giriniz");
            String birim = input.next();

            String raf = " 3 ";

            boolean scim1 = true;
            do {
                switch (birim) {
                    case "Litre":
                        raf = "1";
                        scim1 = false;
                        break;
                    case "Kilogram":
                        raf = "2";
                        scim1 = false;
                        break;
                    case "Metre":
                        raf = "3";
                        scim1 = false;
                        break;
                    default:
                        System.out.println("Girmis oldugunuz urun birimi ile ilgili depoya urun alinmamamktadir\n" +
                                "Depomuzda urunler Kilogram,Litre ve Metre olarak muhafaza edilmektedir\n" +
                                "Bilgilerinizi kontrol ederek tekrar deneyiniz");
                        birim = input.next();
                }
            } while (scim1);


            UrunlerPojo urunObje = new UrunlerPojo(id, urunIsmi, uretici, miktar, birim, raf);
            urunlerListesi.put(id, urunObje);


            System.out.println("Urununuz depoya basari ile eklenmistir.\n" +
                    "Urun eklemeye devam etmek icin 1'e basiniz\n " +
                    "Depo gris paneline girmek icin 2'ye basiniz\n");

            String tercih = input.next();
            if (tercih.equals("1")) {
                urunTanimlama();
            } else {
                Depo_Giris_Paneli.girisPaneli();
            }

        } else {
            System.out.println("Yanlis id numarasi girdiniz.Tekrar deneyiniz");
            urunTanimlama();
        }
    }

//    public static void miktarGuncelleme() {
//        for (Map.Entry<String, UrunlerPojo> w : urunDetaylari) {
//            String key = w.getKey();
//        }
//        System.out.println("-".repeat(20) + "Miktar Guncelleme Sayfasi" + "-".repeat(20));
//        System.out.println("Eklemek Istediginiz urunun id numarasini  giriniz.");
//        String girilenId = input.next();
//        System.out.println("id" + "-".repeat(20) + "Urun Ismi" + "-".repeat(20) + "uretici" + "-".repeat(20) +
//                "miktar" + "-".repeat(20) + "birim" + "-".repeat(20) + "raf\n" + "-".repeat(150));
//
//        if (idNumaralari.contains(girilenId)) {
//            UrunlerPojo urun = urunlerListesi.get(girilenId);
//            System.out.println(urun);
//
//            System.out.println("Ekleme yapmak istediginiz urun miktarini giriniz");
//            int eklenecekMiktar= input.nextInt();
//            if (eklenecekMiktar>0) {
//                urunDetaylari.add()
//
//            }
//
//        } else {
//            System.out.println("Ekleme yapmak istediginiz urune ait id depomuzda bulunmamaktadir.");
//            System.out.println("Urun Miktar Guncellemeye devam etmek icin 1'e basiniz\n " +
//                    "Depo gris paneline girmek icin 2'ye basiniz\n");
//            String sss = input.next();
//            if (sss.equals("1")) {
//                miktarGuncelleme();
//            } else {
//                Depo_Giris_Paneli.girisPaneli();
//            }
//        }
//    }


//        public static void rafGuncelleme () {
//            System.out.println("-".repeat(20) + "Miktar Guncelleme Sayfasi" + "-".repeat(20));
//            System.out.println("Eklemek Istediginiz urun miktarini giriniz.");
//            String id = input.next();
//        }
//



//        public static void urunCikisi () {
//            System.out.println("-".repeat(20) + "Miktar Guncelleme Sayfasi" + "-".repeat(20));
//            System.out.println("Eklemek Istediginiz urun miktarini giriniz.");
//            String id = input.next();
//        }
//
        public static void urunListeleme () {
            System.out.println("-".repeat(20) + "Urunler Listesi" + "-".repeat(20));

            for (Map.Entry<String, UrunlerPojo> w : urunDetaylari) {
                String key = w.getKey();

                System.out.println(key);
             //   System.out.println(key + "-".repeat(20) + urunDetaylari.get(key).getUrunIsmi() + "-".repeat(20) + "uretici" + "-".repeat(20) +
              //          "miktar" + "-".repeat(20) + "birim" + "-".repeat(20) + "raf\n" + "-".repeat(150));


            }

        }
}



//
//            System.out.println(key + "-".repeat(20) + "Urun Ismi" + "-".repeat(20) + "uretici" + "-".repeat(20) +
//                "miktar" + "-".repeat(20) + "birim" + "-".repeat(20) + "raf\n" + "-".repeat(150));
//
//        }
//

