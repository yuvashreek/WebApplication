package com.yuvashree;

public class NumberClass {
	private Integer num1;
	private Integer num2;
	private Integer ans;
	
	public Integer getAns() {
		return ans;
	}
	public void setAns(Integer ans) {
		this.ans = ans;
	}
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	public Integer getNum2() {
		return num2;
	}
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "NumberClass [num1=" + num1 + ", num2=" + num2 + ", ans=" + ans + "]";
	}
	

}