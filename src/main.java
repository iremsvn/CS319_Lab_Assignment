import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayOrganizer arr = new ArrayOrganizer();
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(100);
        list1.add(500);
        list1.add(900);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(800);
        list2.add(600);
        list2.add(300);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(400);
        list3.add(700);
        list3.add(200);
        res = arr.concatAndSort(list1, list2,list3);
        for(int i = 0; i < res.size(); i++)
            System.out.print(" " + res.get(i));

    }
}