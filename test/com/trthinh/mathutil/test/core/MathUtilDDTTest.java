/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trthinh.mathutil.test.core;

import com.trthinh.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Tri Thinh
 */

//cau lenh nay cua JUnit bao hieu rang se can loop qua tap data de
//lay cap data input/expected nhoi vao ham test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    // ta se tra ve mang 2 chieu gom nhieu cap ExpectedInput
    @Parameterized.Parameters  //JUnit se ngam chay loop qua tung dong
                                // cua mang se lay ra dc cap data input/expected
    //ten ham ko quna trong, quan trong la @
    public static Object[][] initData() {
        return new Integer [][]{
                        {0,1},
                        {1,1},
                        {2,2},
                        {3,6},
                        {4,24},            
                        {6,720},            
        };
    }
    
    
    //gia su loop qua tung dong cua mang, ta van can gan tung value cua cot
    //vao bien tuong ung input, expected de lat hoi feed cho ham
    
    @Parameterized.Parameter(value = 0) //value = 0 la map voi mang data
    public int n;   //bien map voi value cua cot 0 cua mang
    @Parameterized.Parameter(value = 1)
    public long expected;  //kieu long vi gia tri tra ve cua ham getF()
                            // la long
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals( expected, MathUtil.getFactorial(n));
    }
}
