package Demo121;

public interface Inter {

	void show();
	default void method() {
		System.out.println("InterĬ�Ϸ���");
	}
	static void text() {
		System.out.println("Inter��̬����");
	}
}
