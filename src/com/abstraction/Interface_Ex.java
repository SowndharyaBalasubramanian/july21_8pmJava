package com.abstraction;

public class Interface_Ex {

	public static void main(String[] args) {
		
		Vehicle v = new Car();
		v.start();
		v.stop();
	}

}

interface Vehicle{
	void start();
	void stop();
}

interface Transport extends Vehicle{
	void colour();
}

class Car implements Vehicle, Transport{
	public void start() {
		System.out.println("Car starts");
	}
	
	public void stop() {
		System.out.println("Car stops");
	}
	
	public void colour() {
		System.out.println("car colour");
	}
}
