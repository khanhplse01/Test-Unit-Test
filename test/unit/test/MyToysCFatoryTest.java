 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kimik
 */
public class MyToysCFatoryTest {

//    public MyToysCFatoryTest() {
//    }
    // ta vẫn xài mytoys nhưng test hàm compute factory
    //th1: số âm
    //th2: số k âm
    @Test
    public void normalCases() throws IllegalAccessException {
        assertEquals(120, util.MyToys.computeFactory(5)); // da thay doi gia tri test
        assertEquals(720, util.MyToys.computeFactory(6));
        assertEquals(1, util.MyToys.computeFactory(1));
    }
    @Test(expected = IllegalAccessException.class)
    public void exceptCases() throws IllegalAccessException{
        util.MyToys.computeFactory(-1000);
    }
}
