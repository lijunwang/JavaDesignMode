package com.design.mode.proto;

import java.util.Hashtable;
public class ProtoManager {
	
	public static ProtoManager mInstance;
	private Hashtable<String, ProtoType> mProtos = new Hashtable<>();
	private ProtoManager(){
	}
	
	public static ProtoManager getInstace(){
		return Holder.getInstance();
	}
	
	public void addProto(ProtoType proto){
		mProtos.put(proto.getClass().getSimpleName(), proto);
	}
	
	public ProtoType getProto(Class<? extends ProtoType> type) {
		if (mProtos.get(type.getClass().getSimpleName()) == null) {
			try {
				mProtos.put(type.getSimpleName(), type.newInstance());
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
				System.out.println("getProto InstantiationException IllegalAccessException ... ");
			}
		}
		return mProtos.get(type.getSimpleName());
	}
	
	private static class Holder{
		private static ProtoManager protoManager = new ProtoManager();
		public static ProtoManager getInstance(){
			return protoManager;
		}
	}
}
