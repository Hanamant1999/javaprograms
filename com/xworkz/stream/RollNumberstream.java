package com.xworkz.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNumberstream {
public static void main(String[] args) {
	
   Stream<Integer> rollnNumberStream=   Stream.of(100,101,102,103,104,105,106,201,202,204,203,205,205,207,209,210);
   List<Integer> rollNumberList =  rollnNumberStream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
   System.out.println("Roll Numbers In Desending order ");
   rollNumberList.forEach((roll)->System.out.println(roll));
	
}
}
