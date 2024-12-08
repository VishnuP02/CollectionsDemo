import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add("Paul");
        arrayList.add("George");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Paul");
        System.out.println("ArrayList after removal: " + arrayList);

        // LinkedList Example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("John");
        linkedList.add("Paul");
        linkedList.add("George");
        System.out.println("\nLinkedList: " + linkedList);
        linkedList.addFirst("Ringo");
        System.out.println("LinkedList after adding at first: " + linkedList);

        // HashMap Example
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Bass", "Paul");
        hashMap.put("Guitar", "George");
        hashMap.put("Drums", "Ringo");
        System.out.println("\nHashMap: " + hashMap);
        hashMap.remove("Guitar");
        System.out.println("HashMap after removal: " + hashMap);
    }
}