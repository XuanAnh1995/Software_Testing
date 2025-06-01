/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luuviet.mathutil.main;

import com.luuviet.mathutil.core.MathUtil;

/**
 *
 * @author luuvi
 */
public class Main {

    public static void main(String[] args) {
        // Thử nghiệm hàm tính giai thừa coi chạy đúng thiết kế hay không
        // ta phải đưa các tình huống sử dụng hàm trong thực tế

        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        
        System.out.println("5! = " + expected +" expected");
        System.out.println("5! = " + actual + " actual");
    }
}
