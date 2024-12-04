package login_page_app;

//2. adım user objesini hazırlayalım

//POJO:Plain Old Java Objects
//fieldlar:private
//construction
//getter-setter
//toString

public class User {

    //ad soyad, email, password

    private String name;

    private String email;

    private String password;
//user objesi olıuşturulduğunda fieldleri set edilmiş olsun parametreli constructor
    //getter setter


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
