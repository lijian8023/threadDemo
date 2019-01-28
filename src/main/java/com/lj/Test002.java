package com.lj;

class Thread002 implements Runnable {

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("子线程i:"+i);
		}

	}

}

/**
 * 实现runable接口
 *  主线程与子线程交替执行，互不干扰，争夺cpu的资源
 * @author Administrator
 *
 */
public class Test002 {

	public static void main(String[] args) {
		System.out.println("主线程执行开始。。。。");
		//
		Thread002 thread002 = new Thread002();
		Thread t1 = new Thread(thread002);
		t1.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("主线程i:"+i);
		}
		System.out.println("主线程执行开始。。。。");
	}
}
