package com.lj;

class Thread002 implements Runnable {

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("���߳�i:"+i);
		}

	}

}

/**
 * ʵ��runable�ӿ�
 *  ���߳������߳̽���ִ�У��������ţ�����cpu����Դ
 * @author Administrator
 *
 */
public class Test002 {

	public static void main(String[] args) {
		System.out.println("���߳�ִ�п�ʼ��������");
		//
		Thread002 thread002 = new Thread002();
		Thread t1 = new Thread(thread002);
		t1.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("���߳�i:"+i);
		}
		System.out.println("���߳�ִ�п�ʼ��������");
	}
}
