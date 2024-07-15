package com.multithreading.com;

public class ThreadDemo1 extends Thread {
	
	public void run() {
		System.out.println("Thread Started");
	}
	public static void main(String[] args) {
		ThreadDemo1 t1= new ThreadDemo1();
		ThreadDemo1 t2= new ThreadDemo1();
		
		t1.start();
		t2.start();
	}

}
