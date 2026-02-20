package Biweekly;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RearrangeWord {

	public static void main(String[] args) {
		
		String s= "Me makes happy leetcode";
		System.out.println(rearrangeWords(s));
	}  public static String rearrangeWords(String s) {
		String result=Arrays.stream(s.split(" ")).sorted((a,b)->a.length()-b.length())
				.collect(Collectors.joining(" "));
		result=result.substring(0,1).toUpperCase()+result.substring(1).toLowerCase();
		return result;
    }
}
