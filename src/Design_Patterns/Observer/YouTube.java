package Design_Patterns.Observer;

public class YouTube {

    public static void main(String[] args) {
        Subscriber zich = new Subscriber();
        Channel lew = new Channel();
        lew.addSubscriber(zich);
        lew.newVideo();
        lew.newVideo();
        lew.newVideo();
    }
}
