package Entity;

public class Worker {
    public Worker prev, next;
    public String id, name, job;
    public int age;

    public Worker (Worker prev, String id, String name, String job, int age, Worker next) {
        this.prev = prev;
        this.id = id;
        this.name = name;
        this.job = job;
        this.age = age;
        this.next = next;
    }
}
