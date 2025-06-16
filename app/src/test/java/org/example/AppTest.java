package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // You can put your JUnit tests here
  // Feel free to create other files, as needed, to organize your tests
 @Test
    public void testNoOvertime_FewDependents() {
        Payroll p = new Payroll(40, 2);
        p.calculate();
        assertEquals(671.20, p.grossPay, 0.01);
        assertEquals(40.27, p.socSec, 0.01);
        assertEquals(93.97, p.fedTax, 0.01);
        assertEquals(33.56, p.stTax, 0.01);
        assertEquals(10.00, p.union, 0.01);
        assertEquals(15.00, p.ins, 0.01);
        assertEquals(478.40, p.netPay, 0.01);
    } 

@Test
public void testOvertime_ThreeDependents() {
    Payroll p = new Payroll(45, 3);
    p.calculate();

    assertEquals(797.05, p.grossPay, 0.01);
    assertEquals(47.82, p.socSec, 0.01);
    assertEquals(111.59, p.fedTax, 0.01);
    assertEquals(39.85, p.stTax, 0.01);
    assertEquals(10.00, p.union, 0.01);
    assertEquals(35.00, p.ins, 0.01);
    assertEquals(552.79, p.netPay, 0.01);
}

  @Test
  void itWorks() {
    assertEquals(true, true);
  }
}
