/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nhatlinh.mathutil.core;

import static com.nhatlinh.mathutil.core.MathUtil.getFactorial;
//import static danh cho nhung ham static
//goi ham ma bo qua ten class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Nhat Linh
 */
public class MathUtilTest {
    //choi DDT, tach data ra khoi cau lenh kiem thu, tham so hoa data nay
    //vao trong cau lenh kiem thu
    
    
    //chuan bi bo data
    public static Object[][] initData() {
        return new Integer[][] {
            {1, 1},
            {2, 2},
            {5, 120},
            {6, 120}
        };
    }
    @ParameterizedTest
    @MethodSource(value = "initData") //ten ham cung cap data, ngam dinh thu tu cua mang, map vao
    //tham so ham
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
    //Bat ngoai le khi dua data sai
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        //xai bieu thuc lamda;
        //ham nhan tham so thu 2 la 1 cai object co code impement cai functional interface ten la Executable - co 1 ham duy nhat
        // khong code ten la execute();
        //choi cham
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };

//        Executable exObject = () ->  { getFactorial(-5);};
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5)); 
    }
    
}
