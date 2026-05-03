public class Sampleprogram {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "C");
        hm.put(2, "C++");
        hm.put(3, "Java");
        hm.put(4, "Python");
        System.out.println(hm);
        System.out.println(hm.get(1));
        if (hm.containsKey(5)) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }
        // display.data
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
