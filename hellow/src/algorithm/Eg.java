package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Eg {
	public static void main(String[] args) {
		String into = "I am a student";

		System.out.println(reverse(into));

	}

	public static String reverse(String into) {
		String[] split = into.split(" ");// ��������ַ������зָ ����һ������

		StringBuilder sb = new StringBuilder();// ���ڵ��̣߳�StringBuilderЧ�ʽϸߣ����ڲ��ϵ�����ַ���

		for (int i = split.length - 1; i >= 0; i--) {
			if (i == 0) {
				sb.append(split[i]);// ���������һ�����ʣ�����ӿո�

			} else {
				sb.append(split[i] + " ");

			}

		}

		return sb.toString();// ����һ���ַ���

	}
}
