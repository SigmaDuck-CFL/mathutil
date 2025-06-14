package com.giaolang.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
    //Chuẩn bị bộ DATA để riêng - DD - DATA DRIVEN
    // Lát hồi FILL vào hàm so sánh T TESTING
    // FILL VÀO QUA THAM SỐ HÀM - HÀM làm việc với nhiều DATA
    // DDT còn gọi tên khác: PARAMETERIZED TESTING -> Kiểm Thử theo kiểu tham số hóa.

    // Bộ DATA: nằm trong hàm STATIC - TĨNH 1 chỗ để các nơi vào lấy
    // Bộ DATA: Thường là mảng 2 chiều, giá trị đầu vo và giá trị kì vọng
    public static Object[][] initData(){
        //int[] a = {5, 10, 15, 20}; // Mang 1 chieu
        return new Object[][]{  {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,720}};
                        //n expected
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n,long expected){
        assertEquals(expected, MathUtil.getFactorial(n));
    }

}