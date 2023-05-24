package Entity;

public class Nasabah {
    public Nasabah prev, next;
    String name, address;
    int age;
    public Nasabah (Nasabah prev, String name, String address, int age, Nasabah next) {
        this.prev = prev;
        this.name = name;
        this.address = address;
        this.age = age;
        this.next = next;
    }
}
