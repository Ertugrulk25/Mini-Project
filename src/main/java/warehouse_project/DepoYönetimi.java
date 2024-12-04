package warehouse_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DepoYönetimi {
/*ürünler adını verdiğin bu Map, depo sistemindeki ürünleri ID numaralarına göre saklayacak.
ID (bir int) anahtar olacak, ürünün diğer tüm bilgilerini (isim, üretici, miktar vb.)
 ise PojoUrun nesnesi olarak değer kısmında tutacak. */
    private Map<Integer, PojoUrun> ürünler;
    public Scanner scanner;

    //Constructor
    public DepoYönetimi() {

        ürünler = new HashMap<>();
        scanner = new Scanner(System.in);

    }

//Ürün Tanımlama Methodu

    public void ürünTanımlama() {

        System.out.println("Ürün ID si giriniz");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ürün ismini giriniz");
        String ürünİsmi = scanner.nextLine();

        System.out.println("Üreticiyi giriniz");
        String üretici = scanner.nextLine();

        System.out.println("Birimini Giriniz");
        String birim = scanner.nextLine();

        //yeni ürün oluşturma

        PojoUrun yeniÜrün = new PojoUrun(id, ürünİsmi, üretici, 0, birim, null);
        ürünler.put(id, yeniÜrün);
        System.out.println("Ürün tanımlama başarılı");
        /*ürünler.put(id, yeniÜrün);: Bu satır, id değişkenini anahtar olarak ve yeniÜrün nesnesini
        değer olarak ürünler Map'ine ekler.
        put metodu, belirtilen anahtar (ID) ile bir değer (ürün nesnesi) ekler. Bu noktada,
        id değişkeninin anahtar olarak kullanılacağına karar veriyorsun.*/
    }

    //Ürün giriş methodu
    public void ürünEkleme() {

        System.out.println("Lütfen ürün ID'sini giriniz: ");
        int ürünİd = scanner.nextInt();

        PojoUrun ürün = ürünler.get(ürünİd);

        if (ürün == null) {
            System.out.println("Ürün bulunamadı! ");
            return;

        }
        System.out.println("Ekleme istediğiniz miktarı giriniz: ");
        int miktar = scanner.nextInt();
        ürün.setMiktar(ürün.getMiktar() + miktar);

        System.out.println("Ürün girişi başarılı yeni miktar: " + ürün.getMiktar());


    }
//Ürün çıkış methodu

    public void ürünÇıkış() {

        System.out.println("Ürün ID'sini giriniz");
        int ürünId = scanner.nextInt();

        PojoUrun ürün = ürünler.get(ürünId);

        if (ürün == null) {
            System.out.println("Ürün bulunamadı");
            return;

        }
        System.out.println("Çıkış yapmak istediğiniz ürün miktarını giriniz");

        int miktar = scanner.nextInt();
        if (miktar > ürün.getMiktar()) {
            System.out.println("Yeterli ürün yok");
            return;

        }
        ürün.setMiktar(ürün.getMiktar() - miktar);
        System.out.println("Ürün çıkışı başarılı kalan miktar: " + ürün.getMiktar());
    }
//Ürün Listeleme Methodu

    public void ürünListeleme() {
        /*%-10s: Bu, format belirleyicisidir. Her biri için ayrı ayrı:

%: Format belirleyicisinin başladığını gösterir.
-: Soldan hizalama (default sağdan hizalamadır) sağlar.
10: Alanın genişliği. Eğer metin 10 karakterden kısa ise, boşluklar ile doldurulur.
s: String türünde bir veriyi temsil eder.
Örneğin, "ID" metni 10 karakterlik bir alana yazılacak, eğer "ID" 10 karakterden kısaysa, sağında boşluk bırakılacak.*/
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "ID", "İsim", "Üretici", "Miktar", "Birim", "Raf");
        System.out.println("------------------------------------------------------------");

        for (PojoUrun w : ürünler.values()) {
            System.out.println(w.getId() + "       " + w.getÜrünİsmi() + "        " +
                    w.getÜretici() + "         " + w.getMiktar() + "        " +
                    w.getBirim() + "        " + (w.getRaf() != null ? w.getRaf() : "null"));

        }
    }
}









