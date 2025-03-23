
class KarakterGame {
    protected String nama;
    protected int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.nama);
    }

    public void tampilkanStatus() {
        System.out.println(nama + " memiliki kesehatan: " + kesehatan);
    }
}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.nama + " menggunakan Orbital Strike!");
        target.kesehatan -= 20;
    }
}

class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.nama + " menggunakan Snake Bite!");
        target.kesehatan -= 15;
    }
}

public class Pertempuran {
    public static void main(String[] args) {
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        brimstone.tampilkanStatus();
        viper.tampilkanStatus();

        brimstone.serang(viper);
        viper.tampilkanStatus();

        viper.serang(brimstone);
        brimstone.tampilkanStatus();
    }
}
