package com.example.noemphearak.applibrary.model;

/**
 * Created by Noem Phearak on 5/23/2018.
 */

public class Reciver {
    private int re_id;
    private String re_name;
    private String re_address;
    private String re_phone;

    public Reciver(int re_id, String re_name, String re_address, String re_phone) {
        this.re_id = re_id;
        this.re_name = re_name;
        this.re_address = re_address;
        this.re_phone = re_phone;
    }

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }

    public String getRe_name() {
        return re_name;
    }

    public void setRe_name(String re_name) {
        this.re_name = re_name;
    }

    public String getRe_address() {
        return re_address;
    }

    public void setRe_address(String re_address) {
        this.re_address = re_address;
    }

    public String getRe_phone() {
        return re_phone;
    }

    public void setRe_phone(String re_phone) {
        this.re_phone = re_phone;
    }

    @Override
    public String toString() {
        return "Reciver{" +
                "re_id=" + re_id +
                ", re_name='" + re_name + '\'' +
                ", re_address='" + re_address + '\'' +
                ", re_phone='" + re_phone + '\'' +
                '}';
    }
}
