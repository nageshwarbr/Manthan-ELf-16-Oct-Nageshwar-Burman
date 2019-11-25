package com.testyantra.student.qspiders;

import com.testyantra.student.jspiders.Angular;
import com.testyantra.student.jspiders.React;

public class TestA {
	public static void main(String[] args) {
		Qtp q=new Qtp();
		q.teachQtp();
		Selenium selenium=new Selenium();
		selenium.teachSelenium();
		Angular angular=new Angular();
		angular.teachAngular();
		React react=new React();
		react.teachReact();
	}
}
