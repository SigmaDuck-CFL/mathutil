package com.giaolang.util;

import com.giaolang.util.mathutil.core.MathUtil;

import javax.swing.*;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArg0RunWell();
        verifyFactorialGivenRightArg1RunWell();
        verifyFactorialGivenRightArg2RunWell();
    }

    // TEST THỬ HÀM TÍNH GIAI THỪA, GỌI TRONG MAIN()
    // MUỐN TEST GÌ ĐÓ THÌ PHẢI CÓ TEST CASE
    // TEST CASE #1 : VERIFY THE GETFACTORIAL() WITH N = 0
    // STEPS:
    //      GIVEN n = 0;
    //      CALL getFactorial(n = 0)
    // EXPECTED RESULT:
    //      the method returns 1 as the result of 0! = 1
    // STATUS: PASSED / FAILED PHẢI CHỜ
    public static void verifyFactorialGivenRightArg0RunWell() {
        int n = 0;
        long expected = 1; // hy vọng 1 trả về nếu 0!
        long actual = MathUtil.getFactorial(n);
        // test là so sánh
        if (actual == expected) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        System.out.println("Expected: " + expected + " Actual: " + actual);
    }

    // TEST CASE #2 : VERIFY THE GETFACTORIAL() WITH N = 1
    public static void verifyFactorialGivenRightArg1RunWell() {
//        int n = 1;
//        long expected = 1; // hy vọng 1 trả về nếu 1!
//        long actual = MathUtil.getFactorial(n);
//
//        // test so sánh
//        System.out.println("Expected: " + expected + " Actual: " + actual);

        System.out.println("4! = expected: " + "expected" + " actual: " + MathUtil.getFactorial(4));

    }

    // TEST CASE #3 : VERIFY THE GETFACTORIAL() WITH N = 2
    public static void verifyFactorialGivenRightArg2RunWell() {
        int n = 2;
        long expected = 2; // 2! = 2
        long actual = MathUtil.getFactorial(n);
        System.out.println("2! = expected: " + expected + " actual: " + actual);
    }


}

// KĨ THUẬT VỪA VIẾT CODE VỪA GÕ TEST CASE, TEST RUN ĐC GỌI LÀ
// TDD (ĐƯA VÀO CV) TEST DRIVEN DEVELOPMENT
