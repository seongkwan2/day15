package day15;

import java.io.Serializable;

public class TestClass06 implements Serializable {
		private String name;
		private int age;
		
		
		public TestClass06() {}	//기본생성자
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
}
