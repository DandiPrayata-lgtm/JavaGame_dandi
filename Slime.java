public class Slime extends Musuh {
    public Slime() {
// memanggil class slime
    super("slime gendut", 60); 
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "melompat dan menyembur player -15 HP");
    }
    public void suaraMusuh(){
        System.out.println("KLECEK KLECEK PLUSS PLUSS");
    }
}
