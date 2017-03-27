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
	@Test
	public void test9() {
		assertEquals("IX", convert(9));
	}
	@Test
	public void test10() {
		assertEquals("X", convert(10));
	}
	@Test
	public void test11() {
		assertEquals("XI", convert(11));
	}
	@Test
	public void test12() {
		assertEquals("XII", convert(12));
	}
	@Test
	public void test15() {
		assertEquals("XV", convert(15));
	}
	@Test
	public void test16() {
		assertEquals("XVI", convert(16));
	}
	@Test
	public void test19() {
		assertEquals("XIX", convert(19));
	}
	@Test
	public void test20() {
		assertEquals("XX", convert(20));
	}
	@Test
	public void test23() {
		assertEquals("XXIII", convert(23));
	}
	@Test
	public void test35() {
		assertEquals("XXXV", convert(35));
	}
	@Test
	public void test45() {
		assertEquals("XLV", convert(45));
	}
	@Test
	public void test65() {
		assertEquals("LXV", convert(65));
	}


	private String convert(int i) {
			String s = "";
			
			do {
				if (i>=50) {
					s = s.concat("L");
					i = i - 50;
				}
				if (i>=40) {
					s = s.concat("XL");
					i = i - 40;
				}
				if (i>=10) {
					s = s.concat("X");
					i = i - 10;
				}
				else if (i < 10) {
					if (i>=1 && i<4) {
						s = ciclo(0, i, s);
					}
					else if (i>=4 && i<9) {
						if (i==4) {
							s = s.concat("I");
						}
						s = s.concat("V");
						s = ciclo(5, i, s);
					}
					else if (i==9)
						s = s.concat("IX");
					i = 0;
				}
				
			} while (i>0);
			return s;
	}
	
	private String ciclo(int inicial, int i, String s) {
		int j;
		for (j=inicial;j<i;j++){
			s = s.concat("I");
		}
		return s;
	}

}
