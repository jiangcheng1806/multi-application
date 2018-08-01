package com.jiangcheng.theory.designpattern.observer;

public class ObserverTest {

	public static void main(String[] args) {
		
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}
}