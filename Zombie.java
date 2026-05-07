public class Zombie extends Musuh{
    public Zombie () {
    super("Zombie HIV", 150);
    }

    @Override
    public void serangPemain(){
    System.out.println(this.namaMusuh + " Menggigit Leher! Hebat Juga Kamu");
    }
    public void suaraMusuh(){
        System.out.println("BAYU GANTENG");
    }
}
