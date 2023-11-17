import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hãy nhập vào tuổi của bạn");
//        int age =Integer.parseInt(sc.nextLine()); // lỗi eps kiểu từ String về int
//        System.out.println("Tuổi cuả bạn là "+ age);

//        int[] array = new int[2];
//        array[2]=100; // lỗi truy cập phần tử mảng không hợp lệ
//        System.out.println(array[2]);

        // lỗi chia cho không
//        int a= 5;
//        int b= 0;
//        int c= a/b;
//        System.out.println("Giá trị c = "+c);


        // xử lí ngoại lệ ở đây
//
//        try {
//            // khối code có thể sinh ra ngoại lệ
//            getFile("student.txt");
//            System.out.println("Nếu không có lỗi xỷ ra thì chạy tiếp");
//        }catch (FileNotFoundException f){
//            // xử lí ngoại lệ file notfound
//            System.err.println("không tìm thây file");
//        }catch (IOException e){
//            // khối code xử lí nếu xảy ra lỗi
//            e.printStackTrace();
//        }finally {
//            // khối code thực thi dù có lỗi hay ko có lỗi xảy ra
//            System.out.println("Khối lệnh finaly");
//        }
//        System.out.println("Tiép tục thực tthi các chức năng khác");


//        // ứng dụng vào bài toán number format
//        boolean flag = true;
//        while (flag) {
//            // yêu cầu người dùng nhập 1 số
//            try {
//                int a = Integer.parseInt(sc.nextLine()); // có thể ném ra ngoại lệ IllegalAgumentException
//             // nếu phát sinh lỗi thì sẽ không thực thi 2 dòng code bên dưới
//                System.out.println("Giá trị bạn vừa nhập là "+a);
//                flag = false;
//            }catch (InputMismatchException e){
//                System.err.println("Xin hãy nhập lại, giá trị vừa nhập không phải số");
//            }
//        }
        // ví dụ bài toan kiểm tra tính đúng đắn của 1 tam giác
        // điều  kiện để tạo thành 1 tam giác :
        // 2 cạnh bất kì có tổng lớn hơn cạnh còn hơn, các canh phải >0

        // tự tạo ra ngoại lệ
        try {
            System.out.println("Hãy nhập vào cạnh a");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Hãy nhập vào cạnh b");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Hãy nhập vào cạnh c");
            int c = Integer.parseInt(sc.nextLine());
            // kiểm tra điều kiện ko phải là 1 tâm giác
            if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
                // ko là 1 tam giác
                throw new TriangleAgumentException("Không phải là 1 tam giác");
            }
        }catch (TriangleAgumentException e){
            System.err.println(e.getMessage());
        }


    }

    public static void getFile(String filename) throws IOException {
        // né ngoại lệ tức là không xử lí lỗi ở vị trí đang đứng
        File file = new File(filename);
        // kiểm tra xem file có tồn tại không
        Files.copy(new FileInputStream(file), Paths.get("source.txt"));
        // copy nội dung của 1 file đến 1 file khác
    }
}