import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(15);
        list.add(29);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(18);
        int x = 8;
        System.out.println("Số lần xuất hiện là"+findById(x,list));
    }
    public static int findById(int x, List<Integer> list){
        int count =0;
        for (int i = 0; i <list.size(); i++) {
            if (x == list.get(i)){
                count++;
            }
        }
        return count;
    }

}

