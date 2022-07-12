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
		String[] split = into.split(" ");// 对输入的字符串进行分割， 返回一个数组

		StringBuilder sb = new StringBuilder();// 由于单线程，StringBuilder效率较高，用于不断地添加字符串

		for (int i = split.length - 1; i >= 0; i--) {
			if (i == 0) {
				sb.append(split[i]);// 若已是最后一个单词，则不添加空格

			} else {
				sb.append(split[i] + " ");

			}

		}

		return sb.toString();// 返回一个字符串

	}
}
