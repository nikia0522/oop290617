package net.hanbit.oop.controller;
import java.util.Scanner;

import net.hanbit.oop.service.CalcService;
import net.hanbit.oop.service.HelloService;
import net.hanbit.oop.service.LeapYearService;
import net.hanbit.oop.service.LoginService;
import net.hanbit.oop.service.SSNService;
import net.hanbit.oop.service.TaxService;
public class Controller{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		CalcService s1=new CalcService();
		TaxService s2=new TaxService();
		LeapYearService s3=new LeapYearService();
		LoginService s5=new LoginService();
		SSNService s6=new SSNService();
				
		while (true) {
			System.out.println("1.Calculator\t 2.Tax\t 3.Leap Year\t 4.Hello\t 5.로그인 \t 6.SSN\t 8. 0.End \n");
			switch (s.next()) {

			case "1":
				System.out.print("나의 체질량지수(BMI)는?\n");
				System.out.print("Height?\n");
				double height=s.nextDouble();
				System.out.print("Weight?\n");
				double weight=s.nextDouble();
				String state=s1.calcBMI(height, weight);
				System.out.print("나의 체질량지수(BMI):"+state+"입니다\n");
				
			case "2":
				System.out.print("Enter Name\n");
				String name=s.next();		
				System.out.print("Enter Salary\n");
				int salary=s.nextInt();
				String[] result=s2.execute(name, salary);
				System.out.print("***********************************\n");
				System.out.print("  이름    |  연봉    |  세율    |   납부할 세금\n");
				System.out.print("-----------------------------------\n");
				System.out.print(String.format("%s  |  %d   |  %f  |  %d  만원", name,salary,result[0], result[1]));
				System.out.print("***********************************\n");
				break;
			
			case "3":
				System.out.print("연도를 입력하세요\n");
				int leapYear=s.nextInt();
				String LYresult=s3.execute(leapYear);
				System.out.print(LYresult+"\n");
				break;
			
			case "4":
				System.out.print("What's your name?");
				String helloname=s.next();
				System.out.println("Hello !!"+helloname+"\n");
				break;
				
			case "5":
				System.out.print("로그인\n");
				System.out.print("Enter ID");
				String id=s.next();
				System.out.print("Enter PASSWORD");
				String pass=s.next();
				String loginresult=s5.execute(id, pass);
				System.out.print(loginresult);
				break;
				
			case "6":
				String ssn
				String sYear=ssn.substring(0,2);
				int year=Integer.parseInt(sYear);
				char ch=ssn.charAt(7);
				System.out.print("이름을 입력하세요\n");
				String ssnname=s.next();
				System.out.print("주민등록번호를 입력하세요\n");
				String ssn=s.next();
				
				System.out.print("****************\n");
				System.out.print("이름   나이    성별\n");
				System.out.print("-----------------\\n");
				String gender=s6.execute(ssnname);
				System.out.print(String.format("&s   %d세    &s", ssnname, (17-year>=0)?18-year:(101-year)+17,gender));
				break;
				
			case "7":
				System.out.print("###### 성적 랭킹 ######\n");
				
			case "8":
			
			case "9":
				
			case "0":
				System.out.println("End");
				return;

			}
		}
	}
}