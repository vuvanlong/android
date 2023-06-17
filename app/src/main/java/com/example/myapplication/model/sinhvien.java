package com.example.myapplication.model;

public class sinhvien {
    private int id;
    private String name;
    private int namsinh;
    private String quequan;
    private int namhoc;

    public sinhvien(int id, String name, int namsinh, String quequan, int namhoc) {
        this.id = id;
        this.name = name;
        this.namsinh = namsinh;
        this.quequan = quequan;
        this.namhoc = namhoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(int namhoc) {
        this.namhoc = namhoc;
    }
}
