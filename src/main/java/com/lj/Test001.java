package com.lj;

class Thread001 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("���̣߳�i:"+i);
		}
	}
}


/**
 * //�̳�Thread��ķ�ʽ
 * ���߳������߳̽���ִ�У��������ţ�����cpu����Դ
 * @author lj
 *
 */
public class Test001 {

	public static void main(String[] args) {
		System.out.println("���߳�ִ�п�ʼ������");
		Thread001 thread001 = new Thread001();
		thread001.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("���̣߳�i:"+i);
		}
		System.out.println("���߳�ִ�н���������");
	}
}
