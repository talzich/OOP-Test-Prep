package Design_Patterns.MVC.Model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class represents the Model part of the MVC design pattern
 * It consists of a collection of strings representing phones.
 */
public class PhoneDB implements Iterable<String>{

    private ArrayList<String> phones;

    // Simple constructor
    public PhoneDB(){
        phones = new ArrayList<>();
    }

    /**
     * Allows user to add a phone to this data base
     * @param phone - the phone user wants to be added to this data base
     */
    public void addPhone(String phone){
        phones.add(phone);
    }


    /**
     * Allows user to remove a phone from this data base
     * @param phone - the phone user wants to be removed from this data base
     * @return phone - the phone removed from the data base
     */
    public String removePhone(String phone){
        String removed = phones.get(phones.indexOf(phone));
        phones.remove(phone);
        return removed;
    }

    @Override
    public Iterator<String> iterator() {
        return phones.iterator();
    }
}
