package warehouse_project;

public class PojoUrun {
//Bu class ürüne ait verileri saklar.

    private int id;
    private String ürünİsmi;
    private String üretici;
    private int miktar;
    private String birim;
    private String raf;

    //Constructor
    public  PojoUrun (int id, String ürünİsmi, String üretici, int miktar, String birim, String raf) {

        this.id = id;
        this.ürünİsmi = ürünİsmi;
        this.üretici = üretici;
        this.miktar = 0;
        this.birim = birim;
        this.raf = raf;
    }

    //Getter Setter(verilere erişmek için )

    public int getId() {
        return id;
    }

    public String getÜrünİsmi() {
        return ürünİsmi;
    }

    public String getÜretici() {
        return üretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getBirim() {
        return birim;
    }

    public String getRaf() {
        return raf;
    }

    //Setter (verileri güncellemek için)
    public void setId(int id) {
        this.id = id;
    }

    public void setÜrünİsmi(String ürünİsmi) {
        this.ürünİsmi = ürünİsmi;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }
}
