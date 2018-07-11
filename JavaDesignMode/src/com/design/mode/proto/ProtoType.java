package com.design.mode.proto;

public abstract class ProtoType implements Cloneable{
	public abstract void display();
	@Override
	public Object clone(){
		ProtoType type = null;
		try {
			type = (ProtoType) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("ProtoType CloneNotSupportedException ... " + e.getMessage());
		}
		return type;
	}
}
