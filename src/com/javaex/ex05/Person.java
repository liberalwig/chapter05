/*2021.12.9(목)14:40

[연습문제]
1) PhoneDB.txt 파일에 있는 정보를 읽어 변수에 담아 출력하세요.
2) PhoneDB.txt 에 자신의 정보를 추가해 보세요.

*/

package com.javaex.ex05;

public class Person {

	// 필드
	private String name;
	private String hp;
	private String company;

	// 생성자
	public Person() {
	}

	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	// 메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("핸드폰: " + hp);
		System.out.println("회사: " + company);
		System.out.println("");
	}
}