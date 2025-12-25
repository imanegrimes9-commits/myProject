package com.l3.gl.controller;

import com.l3.gl.model.Product;
import com.l3.gl.view.Ui;

public class MainController {
    public static void main(String[] args) {
        // 1. إنشاء البيانات (Model)
        Product myProduct = new Product("Computer", 1500.0);
        
        // 2. إنشاء الواجهة (View)
        Ui myView = new Ui();
        
        // 3. عرض الواجهة وطباعة اسم المنتج للتأكد
        System.out.println("Displaying product: " + myProduct.getName());
        myView.show();
    }
}