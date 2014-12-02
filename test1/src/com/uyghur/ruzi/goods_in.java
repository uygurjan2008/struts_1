package com.uyghur.ruzi;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class goods_in {
	private String name;
	private String price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String save() {
		System.out.println("save action in /test "+this);
		
		ValueStack valueStack=ActionContext.getContext().getValueStack();
		test object=new test();
		object.setName("okoko");
		object.setPrice("nonono");
		valueStack.push(object);
		

		
		return "success";
	}

}
