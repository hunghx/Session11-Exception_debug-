import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // yêu cầu tạo mảng các phần tử
        System.out.println("Hãy nhập số lượng phần tử ");
        int count = Integer.parseInt(scanner.nextLine());
        // tạo mảng lưu trữ
        String[] arrStr= new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập giá trị phânf tử thứ "+(i+1));
            arrStr[i] = scanner.nextLine();
        }

        // kiểm tra nhưng phần tử  nào là số và tính tổng
        int sum = 0;
        for (int i = 0; i < arrStr.length; i++) {
            try {
                int num = Integer.parseInt(arrStr[i]); // đang tiến hành ép kiểu có thể phát sinh lỗi
                sum+=num;
            }catch (NumberFormatException e){
                System.err.println("Giá trị "+arrStr[i]+ " không phải là số");
            }
        }
        System.out.println("Tổng các phần tử là số trong mảng là "+sum);
    }
}
