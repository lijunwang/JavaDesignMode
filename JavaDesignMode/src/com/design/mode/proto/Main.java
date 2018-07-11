package com.design.mode.proto;

public class Main {
	public static void main(String[] args) {

		System.out.println("----------------FAR----------------");
		ProtoManager manager = ProtoManager.getInstace();
		FAR far1, far2, far3;
		far1 = (FAR) manager.getProto(FAR.class);
		far2 = (FAR) manager.getProto(FAR.class);
		far3 = (FAR) manager.getProto(FAR.class);
		far1.display();
		far2.display();
		far3.display();
		System.out.println(far1 == far2);
		System.out.println(far2 == far3);
		System.out.println(far1 == far3);

		System.out.println("----------------SRS----------------");
		SRS srs1, srs2, srs3;
		srs1 = (SRS) manager.getProto(SRS.class);
		srs2 = (SRS) manager.getProto(SRS.class);
		srs3 = (SRS) manager.getProto(SRS.class);
		srs1.display();
		srs2.display();
		srs3.display();
		System.out.println(srs1 == srs2);
		System.out.println(srs1 == srs3);
		System.out.println(srs3 == srs2);
		

		System.out.println("----------------PPR----------------");
		PPR ppr1, ppr2, ppr3;
		ppr1 = (PPR) manager.getProto(PPR.class);
		ppr2 = (PPR) manager.getProto(PPR.class);
		ppr3 = (PPR) manager.getProto(PPR.class);
		ppr1.display();
		ppr2.display();
		ppr3.display();
		System.out.println(ppr1 == ppr2);
		System.out.println(ppr1 == ppr3);
		System.out.println(ppr2 == ppr3);
	}
}
