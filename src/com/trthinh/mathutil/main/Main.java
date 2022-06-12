/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trthinh.mathutil.main;

import com.trthinh.mathutil.core.MathUtil;

/**
 *
 * @author Tri Thinh
 */
public class Main {
    public static void main(String[] args) {
        
        // thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        // ta phải đa7 các tình huống sử dụng hàm trong thực tế
        // ví dụ: -5 coi tính đc hok
        // 0 coi tính mấy
        // 20 coi tính mấy
        // 21 coi tính ra mấy !!!
        // TEST CASE:  tình huống hàm/app/màn hình/tính nang đc đưa vào sử dụng
        // giả lập hành vi sai của ai đó !!
        
        //TEST CASE: là 1 tình huống sử dụng, xài app hoặc hàm mà nó bao gồm
        // INPUT: data đầu vào cụ thể nào đó
        // OUTPUT: đầu ra ứng với xử lý của hàm/chức năng của appp, dĩ nhiên dùng đầu
        // vào để xử lý
        // KÌ VỌNG: Mong hàm sẽ trả bề value nào đó ung61 với input ở trên
        // so sánh đê xem kết quả có như kì vọng hay ko
        
        long expected = 120; // ki vong ham oi ve 120 khi tinh 5!
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = "+expected+" expected");
        System.out.println("5! = "+ actual+" actual");
        
        
    }
}
