package base;

import org.apache.commons.lang3.StringUtils;

public class TestStringUtils {

	public static void main(String[] args) {
		String s1 = "1234";
		System.out.println(StringUtils.isNumeric(s1));
		
		String s2 = "2aaaaa22222d111";
		System.out.println(StringUtils.countMatches(s2, 'a'));
		
		

	}

}
