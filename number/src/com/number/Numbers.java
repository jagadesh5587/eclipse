package com.number;

public class Numbers {
	int i = 1, j = 2, m = 6;
	public int z() {
		return m;
	}

	public void addition() {
		int p = i * 8;
		System.out.println(+p);
		System.out.println(i + j);
	}

	public void subraction() {
		System.out.println(m - j);
	}

	public static void main(String[] args) {
		Numbers a;
		a = new Numbers();
		a.addition();
		a.subraction();
		System.out.println(a.i);
		int q = a.m - a.i;
		System.out.println(+q);
		System.out.println(a.z());

	}

}
