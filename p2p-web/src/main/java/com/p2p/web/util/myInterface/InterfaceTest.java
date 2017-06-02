package com.p2p.web.util.myInterface;

public class InterfaceTest {

	@MyInterfaceTest2("apple")
	private String name;
	@MyInterfaceTest(defaultcolor = com.p2p.web.util.myInterface.MyInterfaceTest.color.blue)
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "InterfaceTest [name=" + name + ", color=" + color + "]";
	}

}
