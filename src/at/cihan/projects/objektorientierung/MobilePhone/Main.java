package at.cihan.projects.objektorientierung.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Camera cam = new Camera();
        Sim sim = new Sim(123, "0650");
        SDCard card = new SDCard(5000);

        Phone phone = new Phone(sim, cam, card);
        PhoneGUI gui = new PhoneGUI(phone);
        gui.run();

        phone.doCall("+436763618357");

        phone.takePicture();
        phone.takePicture();

        phone.getAllFiles();

        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());
    }
}
