package TicketRezervationApp;

import warehouse_project.DepoYönetimi;

public class DepoRunner {
    public static void main(String[] args) {

        DepoYönetimi d = new DepoYönetimi();/*new DepoYönetimi() ifadesi,
        DepoYönetimi sınıfının yapıcısını (constructor) çağırır. Bu yapıcı, sınıfın içindeki tüm başlangıç
        ayarlarını ve nesne için gerekli alanları başlatır.
        DepoYönetimi sınıfında daha önce oluşturduğunuz ürünler Map ve scanner nesnesi gibi alanlar,
        yapıcı metot içinde başlatılır. Yani, bu satır d nesnesi üzerinden depo yönetim işlevlerini
        çağırabilmeni sağlar.*/
        boolean seçenekler = true;

        while (seçenekler){
            System.out.println("1. Ürün Tanımlama");
            System.out.println("2. Ürün Girişi");
            System.out.println("3. Ürün Çıkışı");
            System.out.println("4. Ürün Listelem");
            System.out.println("5.Çıkış");
            System.out.println("Seçiminizi Yapın");
            int seçim = d.scanner.nextInt();

            switch (seçim){
                case 1:
                    d.ürünTanımlama();
                    break;
                case 2:
                    d.ürünEkleme();
                    break;
                case 3:
                    d.ürünÇıkış();
                    break;
                case 4:
                    d.ürünListeleme();
                    break;
                case 5:
                    seçenekler = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim! ");

            }
        }
        System.out.println("Programdan çıkılıyor... ");


    }
}
