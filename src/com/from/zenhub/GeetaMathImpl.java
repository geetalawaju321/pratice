package com.from.zenhub;

public class GeetaMathImpl implements GeetaMath {

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int subtract(int n1, int n2) {
		return n1 - n2;
	}
	
	@Override
	public int max(int n1, int n2) {
		if (n1 > n2){
			return n1;
		}
		return n2;
	}

	@Override
	public int min(int n1, int n2) {
		if (n1 < n2){
			return n1;
		}
		return n2;
	}

	@Override
	public int abs(int n1) {
		if (n1 < 0){
			n1 = n1*(-1);
		}
		return n1;
	}
}