package MyHashMap;

public class MyHashMapApp {
    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        map.printNodes(); // (1,10)(2,20)(3,30)
        int param = map.get(3);
        System.out.println(param); // 3
        int param2 = map.get(30);
        System.out.println(param2); // -1
        map.put(4, 40);
        map.printNodes(); // (1,10)(2,20)(3,30)(4,40)
        map.remove(3);
        map.printNodes(); // (1,10)(2,20)(4,40)
    }
}
