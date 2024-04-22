package exercise;
import java.util.*;

public class FindMaxContinuousString {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = myScanner.nextLine();
        findMaxContinuousCharacterString(input);
    }

    private static void findMaxContinuousCharacterString(String input) {
        ArrayList<Character> maxLength = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            ArrayList<Character> list = new ArrayList<>();
            list.add(input.charAt(i));
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) > list.get(list.size() - 1)){
                    list.add(input.charAt(j));
                } else {
                    break;
                }
            }
            // Thay thế các phần tử trong 'maxLength' bằng các phần tử trong 'list'
            if (list.size() > maxLength.size()){
                maxLength.clear();
                maxLength.addAll(list);
            }
            list.clear();
        }
        // Hiển thị chuỗi ký tự liên tục có độ dài tối đa
        for (Character ch : maxLength){
            System.out.print(ch);
        }
        System.out.println();
    }
}
