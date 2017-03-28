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
	@Test
	public void test96() {
		assertEquals("XCVI", convert(96));
	}
	@Test
	public void test99() {
		assertEquals("IC", convert(99));
	}
	@Test
	public void test100() {
		assertEquals("C", convert(100));
	}



	private String convert(int i) {
			String s = "";
			String[] arrArabic = {"I","IV","V","IX","X","XL","L","XC","IC","C","D","M"};
			int[] arrDecimal = {1,4,5,9,10,40,50,90,99,100,500,1000};
			int j = arrDecimal.length - 1;
			do {
				if (i >= arrDecimal[j]) {
						i = i - arrDecimal[j];
						return String.valueOf(arrArabic[j]) + convert(i);
				}
				j--;
			} while (i>0);
			return "";
	}

}
