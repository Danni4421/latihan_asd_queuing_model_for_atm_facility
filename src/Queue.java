import Entity.Nasabah;
import Entity.Worker;
import EntityController.NasabahController;
import EntityController.WorkerController;

public class Queue {
    protected NasabahController nController;
    protected WorkerController wController;
    protected Nasabah cTeller, cCs, cAtm;
    public int maxTeller, maxCs, maxAtm;
    public Queue (int maxTeller, int maxCs, int maxAtm, NasabahController nController, WorkerController wController) {
        this.maxTeller = maxTeller;
        this.maxCs = maxCs;
        this.maxAtm = maxAtm;
        this.nController = nController;
        this.wController = wController;
    }

    // Teller Function
    public boolean isTellerAvailable () {
        return this.maxTeller != 0;
    }

    public void useTeller() {
        this.maxTeller--;
    }

    public void addToTeller() {
        if (isTellerAvailable()) {
            Nasabah current = nController.head;
            while (isTellerAvailable() && current != null) {
                current = current.next;
                useTeller();
            }

            cTeller = current;

        } else {
            System.out.println("Antrian sedang penuh untuk saat ini!, mohon menunggu pada kursi tunggu :)");
        }
    }

    public Nasabah dropFromTeller() {
        Nasabah droppedNasabah = null;
        if (this.maxTeller == 2) {
            System.out.println("Tidak terdapat antrian sekarang pada teller!");
        } else {
            droppedNasabah = nController.Dequeue();
            if (cTeller.next != null) {
                cTeller = cTeller.next;
            } else {
                maxTeller++;
            }
        }

        return droppedNasabah;
    }

    // Customer Service Function

    // ATM Function
}
