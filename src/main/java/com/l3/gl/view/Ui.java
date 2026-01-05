package com.l3.gl.view;

import javax.swing.*;
import java.awt.*;

public class Ui {
    private JFrame frame;

    public Ui() {
        // تم تعديل العنوان ليشمل اسم مروة (الطالب الثاني)
        frame = new JFrame("Simple UI - Multi-Student Project (Modified by Marwa)");
        frame.setSize(450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // الزر الأصلي للطالب الأول
        JButton button = new JButton("start game");
        panel.add(button);

        // --- التعديلات المضافة من طرف الطالبة: مروة ---
        // زر للمسح وزر لإظهار رسالة ترحيب
        JButton clearButton = new JButton("Clear text");
        JButton student2Btn = new JButton("Action Student 2");
        
        // تغيير لون الأزرار الجديدة لتبرز
        clearButton.setBackground(Color.LIGHT_GRAY);
        student2Btn.setBackground(Color.CYAN);

        panel.add(clearButton);
        panel.add(student2Btn);
        
        // l إضافة منطقة نصية بسيطة لتجربة الأزرار
        JTextField textField = new JTextField(20);
        panel.add(textField);
        // ------------------------------------------

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.show();
    }
}