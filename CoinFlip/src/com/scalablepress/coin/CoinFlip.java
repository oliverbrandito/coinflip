package com.scalablepress.coin;

import com.scalablepress.exceptions.FlipNotValidException;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
	
	public static int randomNumber = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FlipNotValidException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of flips: ");
        int number = scanner.nextInt();
        randomNumber = number;
        
        System.out.println("Random value - " + randomNumber(number));

	}
	
	private static int randomNumber(int number) throws FlipNotValidException {
        if (number > 1000000 || number <= 0) {
        	throw new FlipNotValidException("Error: Flip not valid.");
        }
        return flip();
    }
	
	private static int flip() {
		Random rand = new Random();
		return rand.nextInt(randomNumber);
	}

}