package Design_Patterns.Observer;

import java.util.ArrayList;

public class Channel {

    int videos;

    private ArrayList<Subscriber> subsrcibers;

    public Channel(){
        subsrcibers = new ArrayList<>();
        videos = 0;
    }

    public void addSubscriber(Subscriber sub){
        subsrcibers.add(sub);
    }

    public void removeSubscriber(Subscriber sub){
        int index = subsrcibers.indexOf(sub);
        subsrcibers.remove(index);
    }

    public void newVideo(){
        videos++;
        notifySubscribers();
    }

    private void notifySubscribers(){

        for(Subscriber sub : subsrcibers){
            sub.update();
        }
    }
}
