package com.lj;

/**
 * 使用匿名内部类的方式
 * 
 * @author Administrator
 *
 */
public class Test003 {

	public static void main(String[] args) {
		System.out.println("主线程执行开始。。。。");
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("子线程i:"+i);
				}
			}
		}).start();;
		for (int i = 0; i < 20; i++) {
			System.out.println("主线程i:" + i);
		}
		System.out.println("主线程执行开始。。。。");
	}
}
