package com.hlag.customerdata;

import java.util.stream.IntStream;

public class ThreadDemo {

	public static void main(String[] args) {
		Runnable runnable = () -> {

			IntStream.range(1, 10).forEach((e) -> {
				;
				try {
					Thread.sleep(1000);
					System.out.println(e + Thread.currentThread().getName());
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			});
		};
		Thread thread = new Thread(runnable);
		thread.setPriority(1);
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.start();


		Thread thread2 = new Thread(runnable);
		thread.setPriority(5);
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		Thread thread3 = new Thread(runnable);
		thread.setPriority(10);
		try {
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread3.start();

		Thread.getAllStackTraces().forEach((k, v) -> {
			System.out.println(k);
		});
	};
}
