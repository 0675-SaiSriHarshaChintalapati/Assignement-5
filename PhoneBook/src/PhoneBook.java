import java.util.*;
public class PhoneBook {
    public TreeMap<String, String> phoneBook;
    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }
    public void addContact(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println(phoneBook);
    }
    public void removeContact(String name) {
        phoneBook.remove(name);
    }
    public String searchContact(String name) {
        return phoneBook.get(name);
    }
    public void display(){
        for(Map.Entry<String,String> e:phoneBook.entrySet()){
            System.out.println(e.getValue()+" "+e.getKey());
        }
    }

    public static void main(String[] args) {
        PhoneBook phone = new PhoneBook();
        phone.addContact("Har", "9347623658");
        phone.addContact("sha", "8985686489");
        phone.searchContact("Har");
        phone.display();
    }
}
