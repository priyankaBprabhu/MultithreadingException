package com.bl.multithreading;

public class SynchronizdKeyword {
	private int count = 100;

	public synchronized void increment(int value) {
		this.count += value;
		System.out.println("increment : " + this.count);
	}

	public synchronized void decrement(int value) {
		this.count -= value;
		System.out.println("increment : " + this.count);

	}
	public static  void main(String[] args) {
		SynchronizdKeyword sk = new SynchronizdKeyword();
		sk.decrement(52);
		sk.increment(13);
	
	}

}
