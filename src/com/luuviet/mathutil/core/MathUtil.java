/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luuviet.mathutil.core;

/**
 *
 * @author luuvi
 */
public class MathUtil {
    
    // Trong class này cung cấp cho ai đó nhiều hàm xử lý toán học
    // clone class Math của JDK
    // Hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái / giá trị chọn thiết kế là hàm static
    
    // Hàm tính giai thừa
    // n! = 1.2.3.4...n
    // ko có giai thừa cho số âm
    // 0! = 1! = 1 Quy ước
    // Giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    // 20! có 18 con số 0, vừa kịp đủ cho kiểu long của Java
    // 21! tràn kiểu long
    // Bài này quy ước tính n! trong khoảng từ 0 ... 20
    
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw  new IllegalArgumentException("Invalid argument, N must be between 0 ... 20");
        } 
        
        if(n == 0 || n == 1){
            return 1;
        }
        
        long product = 1; // Tích nhân dồn
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
        
    }
}
