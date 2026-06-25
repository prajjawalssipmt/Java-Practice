package HashTable;


import java.util.Hashtable;

public class TestHashTable {
    static void main() {

        long l = System.currentTimeMillis();
        Hashtable<Integer,String> table = new Hashtable<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                table.put(i,"Thread "+i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                table.put(i,"Thread "+i);
            }
        });

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Total Size : "+table.size());
        long e = System.currentTimeMillis();

        System.out.println("Total Time : "+(e-l));

    }
}
