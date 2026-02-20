package Biweekly;
import java.util.*;
import java.util.Map.Entry;
public class CroakingFrogs {
	
	public static void main(String[] args) {
		
		String s="crocraakok";
		System.out.println(minNumberOfFrogs(s));
	} public static int minNumberOfFrogs(String s) {
		int c=0,r=0,o=0,a=0,k=0;
		int max=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			switch(ch) {
			case 'c'->{
				c++;
				max=Math.max(max, c-k);
			}case 'r'->{
				if(c<=r) {
					return -1;
				}
				r++;
			}case 'o'->{
				if(r<=o) {
					return -1;
				}
				o++;
			}case 'a'->{
				if(o<=a) {
					return -1;
				}
				a++;
			}case 'k'->{
				if(a<=k) {
				return -1;	
				}
				k++;
			}
			}
		}
		if(c==r && r==o && o==a && a==k) {
			return max;
		}
		return -1;
		
    }
	}