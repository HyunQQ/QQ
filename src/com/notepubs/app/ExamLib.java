package com.notepubs.app;
public class ExamLib {
	public static int total(Exam exam) {
		// TODO Auto-generated method stub
		return total(exam.eng, exam.math, exam.sci);
	}

	public static int total(int math, int eng, int sci) {
		// TODO Auto-generated method stub

		return math + eng + sci;
	}
}
