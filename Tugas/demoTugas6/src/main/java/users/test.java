package users;

public class test {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Rifadz", "202410370110268");
        Admin adm = new Admin("admin", "admin123");

        System.out.println("Mahasiswa login (benar): " + mhs.login("Rifadz", "202410370110268"));
        System.out.println("Mahasiswa login (salah): " + mhs.login("Rifadz", "0000"));

        System.out.println("Admin login (benar): " + adm.login("admin", "admin123"));
        System.out.println("Admin login (salah): " + adm.login("admin", "wrong"));
    }
}

