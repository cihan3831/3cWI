package at.cihan.projects.objektorientierung.MobilePhone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void saveFiles(PhoneFile file) {
        files.add(file);
    }

    public int getCapacity() {
        return capacity;
    }


    public int getFreeSpace(){
        int sum = 0;
        for (PhoneFile phoneFile : files) {
            sum += phoneFile.getSize();
        }
        return capacity - sum;
    }
}
