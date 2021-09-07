package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();

    //hiển thị danh sách sp
    public void showAll() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    //Thêm
    public void addNewProduct(Product product) {
        this.products.add(product);
    }

    //get
    public List<Product> getProducts() {
        return products;
    }

    //tìm sp theo id
    public int findProductById(String id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (id.equals(products.get(i).getId())) {
                index = i;
                break;
            }
        }
        return index;
    }


    //update: sửa theo id
    public boolean updateProduct(String id, Product product) {
        boolean isUpdate = false;
        int index = findProductById(id);
        if (index != -1) {
            isUpdate = true;
            products.set(index, product);
        }
        return isUpdate;
    }

    // xóa sản phẩm
    public boolean deleteProduct(String id) {
        boolean isDelete = false;
        int index = findProductById(id);
        if (index != -1) {
            isDelete = true;
            products.remove(index);
        }
        return isDelete;
    }

    public void sortProduct() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                }
                return 1;
            }
        });
    }


    public void findMaxProduct() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                }
                return 1;
            }
        });
        Product maxProduct = products.get(0);
        System.out.println("Sản phẩm có giá cao nhất là: \n" + maxProduct);
    }

    public  void writeProductToFile() {
        try {
            FileWriter fw = new FileWriter("sanpham.csv",true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product product : products) {
                bw.write(String.valueOf(product));
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ghi thành công !!!!");

    }
    public  void readProductFromFile(){
        try {
            FileReader fileReader = new FileReader("sanpham.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while (true){
                if(line== null){
                    break;
                }
                line =bufferedReader.readLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
