package EntityController;

import Entity.Nasabah;

public class NasabahController {
    public Nasabah head, tail;
    public int size;
    public NasabahController () {
        this.head = this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty () {
        return size == 0;
    }

    public void Enqueue (Nasabah newNasabah) {
        if (isEmpty()) {
            this.head = this.tail = newNasabah;
        } else {
            Nasabah current = this.head;
            while (current.next != null) {
                current = current.next;
            }

            newNasabah.prev = current;
            current.next = newNasabah;

        }

        size++;
    }

    public Nasabah Dequeue() {
        Nasabah temp = null;
        if (isEmpty()) {
            System.out.println("Tidak terdapat Nasabah, tidak dapat menghapus");
        } else {
            temp = this.head;
            if (temp.next == null) {
                this.head = this.tail = null;
            }

            if (temp.next != null) {
                this.head.next.prev = null;
                this.head = this.head.next;
            }
        }

        size--;
        return temp;
    }
}
