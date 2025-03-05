package at.cihan.projects.objektorientierung.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Camera cam = new Camera();
        Sim sim = new Sim(123, "0650");
        SDCard card = new SDCard(14000);

        Phone phone = new Phone(sim, cam, card);
        phone.doCall("+436763618357");

        phone.takePicture();
    }
}
