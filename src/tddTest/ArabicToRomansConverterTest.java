package tddTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomansConverterTest {

	@Test
	public void test1() {
		assertEquals("I", convert(1));
	}
	@Test
	public void test2() {
		assertEquals("II", convert(2));
	}
	@Test
	public void test3() {
		assertEquals("III", convert(3));
	}
	@Test
	public void test4() {
		assertEquals("IV", convert(4));
	}
	@Test
	public void test5() {
		assertEquals("V", convert(5));
	}
	@Test
	public void test6() {
		assertEquals("VI", convert(6));
	}
	@Test
	public void test7() {
		assertEquals("VII", convert(7));
	}
	@Test
	public void test8() {
		assertEquals("VIII", convert(8));
	}
	public void test9() {
		assertEquals("IX", convert(9));
	}
	public void test10() {
		assertEquals("X", convert(10));
	}
	public void test11() {
		assertEquals("XI", convert(11));
	}
	public void test12() {
		assertEquals("XII", convert(12));
	}
	public void test15() {
		assertEquals("XV", convert(15));
	}
	public void test16() {
		assertEquals("XVI", convert(16));
	}


	private String convert(int i) {
			String s = "";
			Integer j;
			do {
				if (i < 10) {
					if (i>=1 && i<4) {
						for (j=0;j<i;j++){
							s = s.concat("I");
						}
					}
					else if (i==4)
						s = "IV";
					else if (i>=5 && i<9) {
						s = "V";
						for (j=5;j<i;j++){
							s = s.concat("I");
						}
					}
					else if (i==9)
						s = "IX";
					else if (i==10)
						s = "X";
					i = 0;
				}
				else if (i>10) {
					s = "X";
					i = i - 10;
				}
			} while (i>0);

			//ejemplo
			return s;
	}

}
