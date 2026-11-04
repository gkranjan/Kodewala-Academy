package com.oops.noArgument.constructor;

public class BoxParmeterizedConstructor {

	int x;
	int y;

	public BoxParmeterizedConstructor(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	BoxParmeterizedConstructor() {
		this(10, 20);
	}

}
