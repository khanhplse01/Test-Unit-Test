/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.test;

import org.junit.Test;
import static org.junit.Assert.*;
import util.MyToys;

/**
 *
 * @author kimik
 */
public class MyToysDevideTest {

    // đây là 1 class sinh ra để test class chính mytoys, 
    // thay vì dùng sout thì xài hàm của class này nè :)) - junit
    // để nhìn màu sắc đoán đúng - sai
    // mỗi hàm trong class này - xem như main
    // chạy hàm @test => run
    @Test(expected = NumberFormatException.class)
    public void testNormalCase() throws Exception {
        assertEquals(3, MyToys.devide(10, Integer.parseInt("ahuhu")));
    }

    @Test
    public void exceptCase() {

    }
    // exception k phải là 1 value để ước lượng
}
