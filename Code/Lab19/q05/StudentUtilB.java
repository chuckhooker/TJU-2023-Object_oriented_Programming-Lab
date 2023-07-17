package com.huawei.classroom.student.h19.q05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentUtilB {

	public List<String> sort(String fileName) {
		List<Student> students = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(",");
				String name = parts[0];
				String subject = parts[1];
				int score = Integer.parseInt(parts[2].replace(";", ""));
				
				Student s = null;
				// Check if student already exists
				for (Student student : students) {
					if (student.getName().equals(name)) {
						s = student;
						break;
					}
				}
				if (s == null) {
					s = new Student(name);
					students.add(s);
				}
				if (subject.equals("语文")) {
					s.setChinese(score);
				} else if (subject.equals("数学")) {
					s.setMath(score);
				} else if (subject.equals("英语")) {
					s.setEnglish(score);
				} else {
					s.setOther(score);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		


		// 按总成绩降序排列
	    Comparator<Student> totalComparator = new Comparator<Student>() {
	        public int compare(Student s1, Student s2) {
	            return s2.getTotal() - s1.getTotal();
	        }
	    };
	    Collections.sort(students, totalComparator);
	   

	    // 如果总成绩相同,则按语文成绩降序排列
	    Comparator<Student> chineseComparator = new Comparator<Student>() {
	        public int compare(Student s1, Student s2) {
	            if (s1.getTotal() == s2.getTotal()) {
	                return s2.getChinese() - s1.getChinese();
	            }
	            return s2.getTotal() - s1.getTotal();
	        }
	    };
	    Collections.sort(students, chineseComparator);
	    
	    // 如果语文成绩也相同,则按数学成绩降序排列
	    Comparator<Student> mathComparator = new Comparator<Student>() {
	        public int compare(Student s1, Student s2) {
	            if (s1.getTotal() == s2.getTotal() && s1.getChinese() == s2.getChinese()) {
	                return s2.getMath() - s1.getMath();
	            }
	            return s2.getTotal() - s1.getTotal();
	        }
	    };
	    Collections.sort(students, mathComparator);

	    // 如果数学成绩也相同,则按英语成绩降序排列
	    Comparator<Student> englishComparator = new Comparator<Student>() {
	        public int compare(Student s1, Student s2) {
	            if (s1.getTotal() == s2.getTotal() && s1.getChinese() == s2.getChinese() 
	                    && s1.getMath() == s2.getMath()) {
	                return s2.getEnglish() - s1.getEnglish();
	            }
	            return s2.getTotal() - s1.getTotal();
	        }
	    };
	    Collections.sort(students, englishComparator);
	    

		// Get student names in sorted order
		List<String> names = new ArrayList<>();
		for (Student s : students) {
			names.add(s.getName());
		}
		return names;
	}
	
	class Student {
		private String name;
		private int chinese;
		private int math;
		private int english;
		private int other;

		public Student(String name) {
			this.name = name;
		}

		public void setChinese(int chinese) {
			this.chinese = chinese;
		}

		public void setMath(int math) {
			this.math = math;
		}

		public void setEnglish(int english) {
			this.english = english;
		}
		
		public void setOther(int other) {
			this.other = other;
		}

		public String getName() {
			// TODO Auto-generated method stub
			return this.name;
		}

		public int getTotal() {
			// TODO Auto-generated method stub
			return chinese+math+english+other;
		}

		public int getChinese() {
			// TODO Auto-generated method stub
			return chinese;
		}

		public int getMath() {
			// TODO Auto-generated method stub
			return math;
		}

		public int getEnglish() {
			// TODO Auto-generated method stub
			return english;
		}

	}
}