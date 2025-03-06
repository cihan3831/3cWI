package at.cihan.projects.objektorientierung.MobilePhone;

import java.util.Date;
import java.util.List;

public class Phone {
    private SDCard card;
    private Sim sim;
    private Camera cam;

    public Phone(Sim sim, Camera cam, SDCard card) {
        this.cam = cam;
        this.sim = sim;
        this.card = card;
    }

    public void takePicture() {
        PhoneFile file = this.cam.takePicture();
        this.card.save(file);
    }

    public void doCall(String number) {
        this.sim.doCall(number);
    }

    public int getFreeSpace() {
        return this.card.getFreeSpace();
    }

    public List getAllFiles() {
        return this.card.getFiles();
    }

}
