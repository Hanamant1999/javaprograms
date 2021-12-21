package com.xworkz.stream;

import java.security.AccessControlContext;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountNumber {

	public static void main(String[] args) {
		
		Stream<Long> accountNumberstream = Stream.of(45450002494L,4523615485L,4528913252L,6532148952L,5623254125L,7852641325L,4937812546L,4528617541L,4523215456L,4251214521L,7854213265L,5241369874L,7845212356L,7845123265L,5645122521L);
	     List<Long> accountNumberList = accountNumberstream.collect(Collectors.toList());
		 accountNumberList.forEach((a)->System.out.println(a));
	}
}
