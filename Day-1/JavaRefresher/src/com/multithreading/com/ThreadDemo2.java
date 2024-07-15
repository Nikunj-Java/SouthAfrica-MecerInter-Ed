package com.multithreading.com;

public class ThreadDemo2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=1; i<10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000); //1000 millisecond=1 Second
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadDemo2 inst1=new ThreadDemo2();
		ThreadDemo2 inst2=new ThreadDemo2();
		ThreadDemo2 inst3=new ThreadDemo2();
		
		Thread t1=new Thread(inst1);
		Thread t2=new Thread(inst2);
		Thread t3=new Thread(inst3);
		t1.start();
		t2.start();
		t3.start();
	}

}
