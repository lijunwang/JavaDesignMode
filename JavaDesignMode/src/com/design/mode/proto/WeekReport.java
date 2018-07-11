package com.design.mode.proto;

public class WeekReport implements Cloneable {
	private String name;
	private String date;
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	protected WeekReport clone() {
		try {
			Object object = super.clone();
			return (WeekReport) object;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	protected WeekReport cloneMySelf() {
		WeekReport report = new WeekReport();
		report.setName(name);
		report.setDate(date);
		report.setContent(content);
		return report;
	}
	
	@Override
	public String toString() {
		return "name:" + name + ",date:" + date + ",content:" + content;
	}
	
	public static void main(String[] args) {
		WeekReport report = new WeekReport();
		report.setName("WangLijun");
		report.setDate("2018年7月10日");
		report.setContent("淫荡的一天又过去了，啥淫荡的事都没干");
		System.out.println(report);
		WeekReport reportClone = report.clone();
		System.out.println("-----------------------Clone------------------------");
		System.out.println(reportClone);
		System.out.println("-----------------------cloneMySelf------------------------");
		WeekReport reportCloneMySelf = report.cloneMySelf();
		System.out.println(reportCloneMySelf);
		
		System.out.println("report:" + report.hashCode());
		System.out.println("reportClone:" + reportClone.hashCode());
		System.out.println("reportCloneMySelf:" + reportCloneMySelf.hashCode());
		
//		System.out.println(report == reportClone);
//		System.out.println(report == reportCloneMySelf);
//		System.out.println(reportClone == reportCloneMySelf);
		System.out.println(report.getName().hashCode());
		System.out.println(reportClone.getName().hashCode());
		
		reportCloneMySelf.setName("wlj");
		reportClone.setName("wwww");
		System.out.println(reportCloneMySelf);
		System.out.println(reportClone);
		System.out.println(report);
		
		System.out.println(" ------------- ");
		String a = "12345";
		String b = a;
		System.out.println(a == b);
		
		b = "abcd";
		System.out.println(a);
		System.out.println(a == b);
		
	}
}
