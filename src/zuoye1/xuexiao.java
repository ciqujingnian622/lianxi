/**
 * 
 */
package zuoye1;

import zuoye.Graduate;
import zuoye.StudentManageInterface;
import zuoye.TeacherManageInterface;

interface StudentManageInterface{
	//interface 接口名
	public abstract void setFree(double fee);
	//抽象方法
	public abstract double getFree();
	}
	interface TeacherManageInterface{
	public abstract double getPay();
	public abstract void setPay(double pay);
	}
	class Graduate implements StudentManageInterface,TeacherManageInterface{
	//接口的实现implements
	private String name,sex;
	private int age;
	private double fee,pay;
	Graduate(){    
	}
	Graduate(String name,String sex,int age,double fee,double pay){
	this.name=name;
	this.sex=sex;
	this.age=age;
	this.fee=fee;
	this.pay=pay;
	}
	public String getName(){
	return name;
	}
	public String getSex(){
	return sex;
	}
	public int getAge(){
	return age;
	}
	public void setFree(double fee){
	this.fee=fee;
	}
	public double getFree(){
	return fee;
	}
	public void setPay(double pay){
	this.pay=pay;
	}
	public double getPay(){
		//对接口的抽象方法必须重写
	return pay;
	}    
	}
	public class xuexiao {
	public static void main(String[] args){
	Graduate gr=new Graduate("zhangsan","男",23,8000,3000);
	judgeLoan(gr);
	}
	public static void judgeLoan(Graduate gr){
		//对象作形参
	if(gr.getPay()*12-gr.getFree()*2<2000){
	System.out.println(  "provide a loan  需要贷款！");
	}
	else 
	System.out.println("don't need a loan  不需要贷款！");
	}
	}

