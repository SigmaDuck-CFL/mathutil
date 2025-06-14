package com.giaolang.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    public void verifyFactorialGivenRightArg3RunWell() {
        // 4! CÓ LÀ 1 HAY KO
        assertEquals(6, MathUtil.getFactorial(3));
    }

    @Test
    public void verifyFactorialGivenRightArg1RunWell() {
        // 1! CÓ LÀ 1 HAY KO
        assertEquals(1, MathUtil.getFactorial(1));
    }

    @Test // @TEST TƯƠNG ĐƯƠNG HÀM MAIN , CODE TRONG HÀM NÀY SẼ RUN NHƯ HAM MAIN
    //BIÊN MỖI TEST CASE THÀNH TEST RUN THÀNH MAIN() ĐỂ CHẠY
    public void verifyFactorialGivenRightArg0RunWell() {
        // 0! CÓ LÀ 1 HAY KO
        assertEquals(1, MathUtil.getFactorial(0));
    }
    

}