package com.xworkz.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPinCode {

			public static void main(String[] args) {
				
			Stream<Integer>  rollNumberstream = 	Stream.of(0506,1428,1964,1543,5247,1964,7521,1523,2546,2846,1537,2496,5434,1527,4682,6423,3512,7598,8957,8458);
			
			   List<Integer> atmList =  rollNumberstream.filter((p)->p>1000).collect(Collectors.toList());
			   atmList.forEach((pin)->System.out.println(pin));
			   
			   
			   
	}
}
