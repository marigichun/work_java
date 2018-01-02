package com.koitt.java.class01;

public class Teacher extends Person{

	/*Animal과 Person의 필드값을 상속받기 때문에
	 * 중복으로 작성하지 않아도 된다.
	 */
	private String subject;		//담당과목
	private int year;			//강의 경력
	private String group;		//소속


	//메소드(method)
	public String getSubject() {
		//return sanghoon.subject;
		return this.subject;
	}
	public void setSubject(String subject) {
		//sanghoon.subject ="프로그래밍";
		this.subject = subject;
	}
	//메소드(method)
	public int getYear() {
		//return sanghoon.year;
		return this.year;
	}
	public void setYear(int year) {
		//sanghoon.year =1;
		this.year = year;
	}
	//메소드(method)
	public String getGroup() {
		//return sanghoon.group;
		return this.group;
	}
	public void setGroup(String group) {
		//sanghoon.group ="한국아이티인재개발학원";
		this.group = group;
	}
}
