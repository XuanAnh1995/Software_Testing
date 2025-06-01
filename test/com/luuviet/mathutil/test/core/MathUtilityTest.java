/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.luuviet.mathutil.test.core;

import com.luuviet.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 * UNIT TEST: Developer phải có trách nghiệm đảm bảo chất lượng của các hàm, các calss do mình viết ra
 * hàm nhận đầu vào , xử lý, ra kết quả ACTUAL khớp với EXPECTED
 * 
 * Đảm bảo chất lượng code = cách
 * - Kỹ thuật trâu bò: main(), log file, pop-up, window form, web page
 *      Dùng mắt luận đúng sai trên nhiều case - tình huống xài hàm
 * 
 * - Kỹ thuật xịn sò: Test AUTOMATION/ Viết code test để test code chính
 *      Xài dùng một framework / bộ thư viện viết đoạn ngắn gọi hàm cần test, viết code này cho các case xài hàm tình huống xài hàm
 * 
 * SAU ĐÓ KẾT LUẬN CHUNG CHO MỌI CASE 1 CÁCH TỰ ĐỘNG
 * MẮT LÚC NÀY CHỈ NHÌN 2 MÀU XANH ĐỎ CHO TẤT CẢ CÁC TEST
 */

public class MathUtilityTest {
    
    // Đây là class sẽ  sử dụng các hàm của thư viện/ framework JUnit
    // Để kiểm thử / kiểm tra code chính - hàm tính giai thừa bên class core.MathUtil
    // Viết code để test code chính bên kia!
    
    
    // Có nhiều quy tắc đặt tên hàm kiểm thử
    // nhưng thường sẽ nói lên mục đích của các case/tình huống kiểm thử
    // tình huống xài hàm theo kiểu thành công và thất bại
    
    // Hàm dưới đây là tính huống test hàm chạy thành công , trả về ngon
    // Ta sẽ xài hàm kiểu well - đưa 5!, 6! , hok chơi đưa -5!, 30!
    
    // @Test JUnit sẽ phối hợp với JVM để chạy hàm này
    // @Test phía hậu trường chính là public static void main()
    // Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0;  // test thử tình huống tử tế đầu vào, mày phải chạy đúng
        
        long expected = 1; 
        long actual = MathUtil.getFactorial(n);
        
        // so sánh expected vs actual dùng xanh xanh đỏ đỏ , framework
        Assert.assertEquals(expected, actual);
        
        // Gộp thêm vài case thành công / đưa đầu vào ngon 
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
        
        
    }   // Hàm giúp so sánh 2 giá trị nào đó có giống nhau hay không
        // Nếu giống nhau -> thay màu xanh đèn đường - đường thông , code ngon
        //                  ít nhất cho case đang test
        // Nếu KO GIỐNG NHAU -> thay màu đỏ 
    
    
    // QUY ƯỚC XANH ĐỎ CỦA UNIT TEST NÓI CHUNG , JUNIT NÓI RIÊNG
    // Bạn liệt kê các case cần test - hàm cần test có những tình huống nào để xài - các đầu vào là gì!!!
    //                               - liệt kê các đầu vào cần test cho hàm, tính trước các expected
    
    // Viết code để test code cho các case - gọi hàm với các đầu vào khác nhau đã liệt kê
    // RUN
    //      - Nếu tất cả các cây đều ngon - EXPECTED === ACTUAL , 1 Màu xanh cho tất cả
    //      - Nếu CÓ ÍT NHẤT 1 case tạch - EXPECTED !== ACTUAL  cho ít nhất 1 case - 1 MÀU ĐỎ CHO TẤT CẢ!!!
    
    // NGHỆ THUẬT ĐẢM BẢO CHẤT LƯỢNG CODE CỦA DÂN DEV , DÂN QC/ TESTER
    // Cố gắng tưởng tượng , liệt kê ra các CASE sử dụng app, sử dụng hàm 1 cách bao quát, bao sân tốt nhất
    // các tình huống!!!, CẦN XANH CHO TẤT CẢ CÁC CASE ĐÃ LIỆT KÊ
    
    // Liệt kê thiếu sót case, chuyện lớn kiểu khác
    // Đã đưa ra các case, chúng phải xanh hết
    
    // Hàm getF() ta thiết kê có 2 tình huống xử lý
    // 1. đưa data tử tế trong vòng [0...20] -> tính đúng n! - done
    // 2. đưa data vào cà chớn , âm, > 20 -> THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    // TAO KỲ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    // rất mong ngoại lệ xuất hiện với n cà chớn này
    
    // MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ CÓ NÉM RA NGOẠI LỆ THỰC SỰ
    //              NHƯNG KO PHẢI LÀ NGOẠI LỆ NHƯ KỲ VỌNG - THỰC SỰ KỲ VỌNG SAI
    //              KO PHẢI NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5);
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    
    // cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn
    // xài Lambda
    // Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    // tôi cần thấy màu xanh khi chơi với 21! 
    @Test()
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
//        Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh,
//                            tham số 2: đoạn code chạy văng ra ngoài runable)

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathUtil.getFactorial(21);
        });
    }
    
    // Bắt ngoại lệ , xem hàm có ném về ngoại lệ hay ko khi n cà chớn
    // có ném, tức là hàm chạy đúng thiết kê, xanh
    @Test()
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        // chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(201);
        } catch (Exception e) {
            // bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
            // nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko???
            // có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện
            
            Assert.assertEquals("Invalid argument, N must be between 0 ... 20", e.getMessage());
        }
       
    }
    
    
}
