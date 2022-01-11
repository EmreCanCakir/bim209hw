package edu.estu.entities;

public class Card {
    private int id;
    private String name;
    private int age;
    private String Tckn;
    /* Thıs class keep persons card attributes*/
    public Card(int id, String name, int age, String tckn) {
        this.id = id;
        this.name = name;
        this.age = age;
        Tckn = tckn;
    }
    public Card(){

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTckn() {
        return Tckn;
    }

    public void setTckn(String tckn) {
        Tckn = tckn;
    }

}
