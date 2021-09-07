package com.codegym;


import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        int choice;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    showProducts(productManagement);
                    break;
                }
                case 2: {
                    addNewProduct(productManagement);
                    break;
                }
                case 3: {
                    updateProduct(productManagement);
                    break;
                }
                case 4: {
                    deleteProduct(productManagement);
                    break;
                }
                case 5: {
                    System.out.println(" 5. Sắp xếp sản phẩm theo tên !!!");



                    }
                case 0: {
                    System.exit(0);
                }





            }
        } while (choice != 0);


    }



    private static void deleteProduct(ProductManagement productManagement) {
        System.out.println(" 4. Xóa sản phẩm !!!! ");
        scanner.nextLine();
        System.out.println("Nhập mã sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        int index = productManagement.findProductById(id);
        if(index != -1){
            productManagement.deleteProduct(id);
        }else{
            System.out.println("Mã sản phẩm không hợp lệ !!!!");
        }
    }

    private static void updateProduct(ProductManagement productManagement) {
        System.out.println("3. Cập nhật thông tin sản phẩm !!");
        scanner.nextLine();
        System.out.println(" Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        int index = productManagement.findProductById(id);
        if (index != -1) {
            Product product = inputProduct();
            productManagement.updateProduct(id, product);
        } else {
            System.out.println("Không tìm thấy mã sản phẩm này !!!!");
        }
    }

    private static void addNewProduct(ProductManagement productManagement) {
        Product product = inputProduct();
        productManagement.addNewProduct(product);
    }

    private static Product inputProduct() {
        System.out.println("2. Thêm mới sản phẩm !! ");
        scanner.nextLine();
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập số lượng: ");
        String quantity = scanner.nextLine();
        System.out.println("Điền ghi chú: ");
        String note = scanner.nextLine();
        return new Product(id, name, price, quantity, note);
    }

    private static void showProducts(ProductManagement productManagement) {
        System.out.println("1. Hiển thị danh sách sản phẩm !! ");
        productManagement.showAll();
    }


    private static void menu() {
        System.out.println("----------Menu---------");
        System.out.println("1. Xem danh sách sản phẩm ");
        System.out.println("2. Thêm mới sản phẩm ");
        System.out.println("3. Cập nhật thông tin sản phẩm ");
        System.out.println("4. Xóa sản phẩm ");
        System.out.println("5. Sắp xếp sản phẩm ");
        System.out.println("6. Tìm sản phẩm có giá đắt nhất ");
        System.out.println("7. Đọc từ file ");
        System.out.println("8. Ghi vào file ");
        System.out.println("0. Exit");
    }
}
