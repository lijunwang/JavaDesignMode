package com.design.mode.common;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static final String RootPath = "H:/android_workspace_wt02_5.1/JavaDesignMode/src/com/design/mode/";

	public static Object getBean() {
		return getBean("config.xml");
	}

	// �÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean(String path) {
		try {
			// �����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			// new
			// File("H:/android_workspace_wt02_5.1/JavaDesignMode/src/com/design/mode/abstract_factory/config.xml")
			doc = builder.parse(new File(path));

			// ��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = classNode.getNodeValue();

			// ͨ����������ʵ�����󲢽��䷵��
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getBean Exception ... " + e.getMessage());
			return null;
		}
	}
}
