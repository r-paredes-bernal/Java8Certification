package com.acn.java8.oca.lesson1;

public class Question11 {
	void method() {}
}

// fix scope and then which keyword inserted there fix the compiling issue 
// 1) abstract, 2) final, 3) private, 4) default, 5) int
class child extends Question11 {
	final void method(){}
}

