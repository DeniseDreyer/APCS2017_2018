//Denise Dreyer
//October 26, 2017

import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		String[] arr="I like apples!".split(" ");  //putting the result from split in an array
		System.out.println(Arrays.toString(arr));  //using toString to print the array
		
		System.out.println(Arrays.toString("I like apples!".split(" ")));  //Example 1
		System.out.println(Arrays.toString("I really like really red apples".split("really")));  //Example 2
		System.out.println(Arrays.toString("I really like reallyreally red apples".split("really"))); //testing 2 "really"s together
		System.out.println(Arrays.toString("really like really red apples".split("really"))); // testing a "really" at the beginning
		System.out.println(Arrays.toString("I really like really red apples,really".split("really"))); //testing "really" at the end
	
	
	
	//Call code for part 1 and 2
	
		getTheFilling("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		getTheFilling("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
		getTheFilling("apples pineapples bread lettus tomato bacon mayo ham ");
		getTheFilling("apples pineapples lettus tomato bacon mayo ham  ");
		getTheFilling("bread");
		getTheFilling("breadbread");
		getTheFilling("applesbreadpineapplesbreadlettustomatobaconmayohambreadcheese");
	
	}
	public static void getTheFilling(String everything) {
		//Your task Part 1:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	
		
//		String[] parts ="breadlettustomatobaconmayohambreadcheese".split("bread");
		String[] parts =everything.split("bread");
		String filling="";
		
		//test to see if there are two pieces of bread
		if (everything.indexOf("bread") <=0 ) {
			filling = "\"" + everything + "\"" + "is not a sandwich";
		}
		else if (everything.substring(everything.indexOf("bread")).indexOf("bread")<0) {
			filling = "\"" + everything + "\"" + "is not a sandwich";
		}
		else {
			 filling ="\"" + everything + "\"" + parts[1];
		}
//		String[] parts ="applespineapplesbreadlettustomatobaconmayohambreadcheese".split("bread");
		//System.out.println(Arrays.toString(parts));
	
		
		System.out.println(filling);
	}	
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
// added line -----
		

	}


