package login_page_app;

//3- Adım user ile ilgili methodlar

import java.util.*;

public class UserService {

    Scanner scanner = new Scanner(System.in);

    // List<User> users = new ArrayList<>();--> practice yap bunu

    Map<String, String> userInfos = new HashMap<>();// k:email V : password

    //4 -Adım kullanıcıdan alınan ad soyad email password bilgileri ile üye olma methodu

    public void register() {

        System.out.println("Ad Soyad giriniz : ");

        String name = scanner.nextLine();

        // email geçersiz ise tekrar girilmeli

        String email;

        boolean isValid; //T geçerli F geçerli değil

        do {

            System.out.println("Email giriniz : ");
            email = scanner.nextLine();//asdada@gmail.com

            //e mail geçerli mi
            isValid = validateEmail(email);//T

            // bu email ile kayıtlı kullanııc var mı ?
            boolean isExistEmail = this.userInfos.containsKey(email);//T

            if (isExistEmail) {
                System.out.println("Bu email ile kaıtlı kullanıcı zaten vae!");
                isValid = false;
            }


        } while (isValid);
        //geçerli bir password oluşturma
        String password;
        boolean isValidPassword;

        do {
            System.out.println("Parolayı oluşturunuz");
            password = scanner.nextLine();

            //geçerli mi
            isValidPassword = validatePassword(password);


        } while (isValidPassword);

        //user oluşturalım

        User user = new User(name, email, password);


        //e mail ve password bilgisini userinfosa ekleyelim

        this.userInfos.put(user.getEmail(), user.getPassword());

        System.out.println("Sayın  " + user.getName() + " Tebrikler kayıt olma işlemini başarıyla tamamladınız");
        System.out.println("Email ve şifreniz ile sisteme girebilrisiniz");


    }
    // 7 -Adım sisteme giriş yapma methodu

    public void login() {
        System.out.println("Email giriniz : ");
        String email = scanner.nextLine();

        //kullanıcı kaydı var mı
        if (this.userInfos.containsKey(email)) { //kullanıcı var
            //şifre soralım

            boolean isSucces = false;//false ise döngü devam etmeli
            int counter = 3;

            while (!isSucces && counter > 0) {
                System.out.println("Parolayı giriniz : ");
                String password = scanner.nextLine();


                //email ile password eşleşiyor mu?
                if (this.userInfos.get(email).equals(password)) { // şifre doğru


                } else {
                    //şifre hatalı
                    counter--; // 2 1 0
                    if (counter == 0) {
                        System.out.println("3 kez hatalı giriş yaptınız, ana menüye yönlediriyorsunuz");
                        //giriş başarılı
                        System.out.println("Harika, sisteme giriş yaptınız :)");
                        isSucces = true;
                    } else {
                        System.out.println("Şifreniz yanlış, tekrar deneyiniz, kalan hak" + counter);
                    }
                }
            }

        } else {//kullanıcı yok
            System.out.println("Sisteme kayıtlı kullanıcı bulunamadı");
            System.out.println("Üyeyseniz bilgilerinizi kontrol ediniz , değilseniz lütfen üye olunuz");


        }


    }


    //5- Adım email doğrulama ödev

    private boolean validateEmail(String email) {

        if (!email.contains("@")) {
            System.out.println("E posta '@' sembolü içermelidir");

        }


        return false;
    }

    //6- Adım password doğrulama ödev
    private boolean validatePassword(String password) {
        return true;

    }


}
















