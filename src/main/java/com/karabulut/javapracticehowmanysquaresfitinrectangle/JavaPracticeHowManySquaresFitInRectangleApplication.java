package com.karabulut.javapracticehowmanysquaresfitinrectangle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaPracticeHowManySquaresFitInRectangleApplication {


	public static void main(String[] args) {
		SpringApplication.run(JavaPracticeHowManySquaresFitInRectangleApplication.class, args);
		System.out.println(howManySquaresFitInRectangle(3,2));//3 (2-1-1)
		System.out.println(howManySquaresFitInRectangle(11,13));//5 (11-4-2-1-1)
	}

	public static int howManySquaresFitInRectangle(int length, int width)
	{
		//main focus is always working with the shortest side
		int result = 0,shortSide=0;

		int totalAreaOfRectangle = length*width;

		while(totalAreaOfRectangle>0){
			shortSide = length > width ?  width : length;
			totalAreaOfRectangle = totalAreaOfRectangle - (shortSide*shortSide);
			length = length-shortSide>0 ? length-shortSide : length;
			width = width-shortSide>0 ? width-shortSide : width;
			result++;
		}

		return result;
	}


}
