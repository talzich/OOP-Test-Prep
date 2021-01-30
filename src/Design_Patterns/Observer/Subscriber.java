package Design_Patterns.Observer;

public class Subscriber implements Observer{

    int unwatchedVideos = 0;

    @Override
    public void update() {
        this.unwatchedVideos++;
        System.out.println("There are " +unwatchedVideos+ " new videos you didn't watch!");
    }
}
