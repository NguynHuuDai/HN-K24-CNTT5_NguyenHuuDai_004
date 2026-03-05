package Bai2;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        // Nhap lich su
        System.out.println("Nhap lich su: ");
        String history = sc.nextLine();

        // Dua ve chu thuong
        history = history.toLowerCase();

        // Tach chuoi theo dau phay
        String[] arr = history.split(",");

        // Dem so lan xuat hien
        for(int i = 0; i < arr.length; i++){
            String vehicle = arr[i].trim(); // bo khoang trang

            Integer value = map.get(vehicle);

            if(value == null){
                map.put(vehicle, 1);
            } else {
                map.put(vehicle, value + 1);
            }
        }

        // In danh sach thong ke
        System.out.println("Thong ke:");
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        // Tra cuu
        System.out.println("Nhap ten phuong tien muon tra cuu:");
        String search = sc.nextLine().toLowerCase().trim();

        Integer result = map.get(search);

        if(result == null){
            System.out.println("Khong co trong lich su");
        } else {
            System.out.println("So luot ra vao: " + result);
        }
    }
}
