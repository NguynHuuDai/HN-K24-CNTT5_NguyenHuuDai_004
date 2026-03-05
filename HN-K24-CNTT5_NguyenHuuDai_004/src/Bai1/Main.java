package Bai1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.err.println("So luong sinh vien khong hop le");
            return;
        }

        List<Double> list = new ArrayList<Double>();

        // Nhap diem
        for (int i = 0; i < n; i++) {

            double score;

            do {
                System.out.print("Nhap diem sinh vien thu " + (i + 1) + " (0-10): ");
                score = sc.nextDouble();
            } while (score < 0 || score > 10);

            list.add(score);
        }

        // Bubble Sort (sap xep tang dan)
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {

                if (list.get(j) > list.get(j + 1)) {

                    double temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        // Tim max va min
        double min = list.get(0);
        double max = list.get(list.size() - 1);

        // Tinh tong + trung binh
        double sum = 0;
        int gioiCount = 0;

        for (int i = 0; i < list.size(); i++) {

            sum = sum + list.get(i);

            if (list.get(i) > 8) {
                gioiCount++;
            }
        }

        double average = sum / list.size();

        // Set loc diem khong trung
        Set<Double> set = new TreeSet<Double>();

        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }

        // In ket qua
        System.out.println("\nDanh sach diem sau khi sap xep:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n\nDanh sach diem tang dan :");
        for (Double score : set) {
            System.out.print(score + " ");
        }

        System.out.println("\n\nDiem cao nhat: " + max);
        System.out.println("Diem thap nhat: " + min);
        System.out.println("Tong diem: " + sum);
        System.out.println("Diem trung binh: " + average);
        System.out.println("So sinh vien gioi (>8): " + gioiCount);

        sc.close();
    }
}
