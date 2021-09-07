package com.codegym;

import java.util.ArrayList;
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
//
//    // sắp xếp sản phẩm theo id
//    public ProductManagement sortProduct() {
//
//        for (int i = 0; i < products.size()- 1; i++) {
//            for (int j = products.size() - 1; j > i; j--) {
//                if (products.get(i).getPrice() > products.get(j).getPrice() ) {
//                    Product temp = products.get(i);
//                    products.get(i) = products.get(j);
//
//
//                }
//            }
//        }
//    }

}
