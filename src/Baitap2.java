import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhập vào ngày, tháng, năm
        System.out.println("Nhập vào ngày");
        int day = scanner.nextInt();
        System.out.println("Nhập vào tháng");
        int month = scanner.nextInt();
        System.out.println("Nhập vào năm");
        int year = scanner.nextInt();
        try {
            if (year <= 0) {
                throw new DateFormatException("Năm phải lớn hơn 0");
            }
            if (month < 1 || month > 12) {
                throw new DateFormatException("Tháng phải từ 1-12");
            }
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (day < 1 || day > 31) {
                        throw new DateFormatException("ngày trong tháng phải từ 1-31 ngày");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    if (day < 1 || day > 30) {
                        throw new DateFormatException("ngày trong tháng phải từ 1-30 ngày");
                    }
                    break;
                case 2:
                    if (day < 1 || day > 28) {
                        throw new DateFormatException("ngày tháng 2 phải từ 1-28 ngày");
                    }
                    break;
            }

            System.out.println("Ngày bạn vừa nhập là : "+day+"-"+month+"-"+year);
        }catch (DateFormatException e){
            System.err.println("Ngày tháng năm bạn nhập không hợp lê : "+e.getMessage());
        }

    }
}
