package com.lj;

/**
 * ʹ�������ڲ���ķ�ʽ
 * 
 * @author Administrator
 *
 */
public class Test003 {

	public static void main(String[] args) {
		System.out.println("���߳�ִ�п�ʼ��������");
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("���߳�i:"+i);
				}
			}
		}).start();;
		for (int i = 0; i < 20; i++) {
			System.out.println("���߳�i:" + i);
		}
		System.out.println("���߳�ִ�п�ʼ��������");
	}
}
