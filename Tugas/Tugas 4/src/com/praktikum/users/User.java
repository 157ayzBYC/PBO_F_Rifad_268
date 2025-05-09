package com.praktikum.users;

public abstract class User {
    protected String nama;
    protected String id;

    public User(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public abstract boolean login(String username, String password);
    public abstract void displayAppMenu();
}
