package users;

import actions.AdminActions;

public class Admin extends User implements AdminActions {
    public Admin(String nama, String id) {
        super(nama, id);
    }

    public boolean login(String inputNama, String inputId) {
        return this.nama.equalsIgnoreCase(inputNama) && this.id.equals(inputId);
    }

    @Override
    public void kelolaData() {
        System.out.println("Admin dapat mengelola semua data laporan.");
    }
}

