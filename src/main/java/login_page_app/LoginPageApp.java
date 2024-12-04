package login_page_app;
    /*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
                             email ve şifre birer listede tutulur.
                             aynı email kabul edilmez.

         giriş(login): email ve şifre girilir.
                       email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
*/

import java.util.Scanner;

public class LoginPageApp {
    public static void main(String[] args) {
        start();
    }
    //1.adım
    private static void start(){

        Scanner scanner = new Scanner(System.in);
        int select ; //ÇIKIŞ için 0 seçiniz

        UserService userService = new UserService();

        //menü
        do {

            System.out.println(" === TECHPRO EDUCATION ===");
            System.out.println("1- Üye Ol");
            System.out.println("2- Giriş Yap ");
            System.out.println("Çıkış Yap");
            System.out.println("Seçiminiz : ");

            select= scanner.nextInt(); // 1 girerse 2 girerse 0 girerse

            switch (select){
                case 1 :
                    // üye olma methodu oluşturulacak ve çağrılacak
                    userService.register();
                    break;
                case 2 :
                    //giriş yapma methodu oluşturulacak ve çağrılacak
                    userService.login();
                    break;
                case 0:
                    System.out.println("İyi günler dileriz");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
                    break;
            }

        }while (select != 0 );


    }
}
