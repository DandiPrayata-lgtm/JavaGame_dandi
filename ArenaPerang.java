import java.util.Scanner;

public class ArenaPerang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Musuh[] gelombangMusuh = new Musuh[3];
        gelombangMusuh[0] = new Slime();
        gelombangMusuh[1] = new Naga();
        gelombangMusuh[2] = new Zombie();

        System.out.println("===============================");
        System.out.println("Selamat Datang Di Arena Perang ");
        System.out.println("===============================\n");
        System.out.println("AWAS! Ada Monster Menghandang");
        
        boolean isBermain = true;

        while(isBermain) {
            System.out.println("\n---MONSTER NIH BOSS LAWAN DONGG!---");
            for (int i = 0; i < gelombangMusuh.length; i++){
                System.out.println((i + 1) + ". " + gelombangMusuh[i].namaMusuh + " (HP: " + gelombangMusuh[i].healthPoint + ")");
            }
            System.out.print("\nPilih terget monster yang mau di serang (1/2/3) atau 4 kabur: ");
            int pilihTarget = input.nextInt();

            if (pilihTarget == 4){
                System.out.println("Kamu Cupu Malah Lari....");
                isBermain = false;
                continue;
            }
            if (pilihTarget < 1 || pilihTarget > 3){
                System.out.println("Pilihan tidak valid! Aanda membuang giliran");
            }else {
                System.out.println("Seberapa Kuat Kamu (10-100):");
                int power = input.nextInt();

                System.out.println("\n>>>> Hasil Serangan Anda <<<<");
                int indeksMonster = pilihTarget - 1;
                gelombangMusuh[indeksMonster].terimaDamage(power);
            }

        System.out.println("\n <<<< Monster Menyerang >>>>");
        for (int i = 0; i < gelombangMusuh.length; i++){
            if (gelombangMusuh[i].healthPoint > 0){
                System.out.println();
                gelombangMusuh[i].suaraMusuh();
                System.out.println();
                gelombangMusuh[i].serangPemain(); 
            }else {
                System.out.println(gelombangMusuh[i].namaMusuh + " telah Mati, Hebat Juga Kamu. ");
            }
        }
        System.out.println(".............................................");
        }
        input.close();
        System.out.println("Dah Suud Kamu NOOB");
    }
}