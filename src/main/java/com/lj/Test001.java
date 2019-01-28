package com.lj;

class Thread001 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("子线程：i:"+i);
		}
	}
}


/**
 * //继承Thread类的方式
 * 主线程与子线程交替执行，互不干扰，争夺cpu的资源
 * @author lj
 *
 */
public class Test001 {

	public static void main(String[] args) {
		System.out.println("主线程执行开始。。。");
		Thread001 thread001 = new Thread001();
		thread001.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("主线程：i:"+i);
		}
		System.out.println("主线程执行结束。。。");
	}
}
