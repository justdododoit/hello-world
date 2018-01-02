package supermarket;
import java.util.Scanner;
public class ViewDemo {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);           //引入Scanner变量sc
		String adminword="admin";                   //默认用户名常量adminword
		String password="88888888";                //默认密码常量password
		while(true){                    //首界面
			System.out.println("=====================market_v1======================");
			System.out.println("1.登录");
			System.out.println("2.退出");
			System.out.println("----------------------------------------------------");
			System.out.println("请选择：");
			int choose1=sc.nextInt();//获得用户输入
			//选择登陆功能
			if(choose1==1) {            //登录界面            
				System.out.println("您选择的是登录功能!");
				System.out.println("=====================market_v1[登录]======================");
				System.out.println("请输入账号：");
				String adminword1=sc.next();          //引入变量存储用户账号adminword1
				System.out.println("请输入密码：");      //引入变量存储用户密码password1
				String password1=sc.next();
				System.out.println("----------------------------------------------------");
				//输入账号和密码正确，登录成功
				  if(adminword.equals(adminword1)&&password.equals(password1)){
					System.out.println("您登录成功！");
					while(true){                        //操作界面
						System.out.println("=====================market_v1[操作]======================");
						System.out.println("1.收银员管理");
						System.out.println("2.商品管理");
						System.out.println("3.收银结算");
						System.out.println("4.返回首页");
						System.out.println("5.退出系统");
						System.out.println("----------------------------------------------------");
						System.out.println("请选择：");
						int choose2=sc.nextInt();
						if(choose2==1){//收银员管理
							
						}else if(choose2==2){//商品管理
							
						}else if(choose2==3){//收银结算
							
						}else if(choose2==4){//返回首页
							continue;
						}else if(choose2==5){
							System.out.println("您已退出系统！");
							System.exit(0);//退出系统
						}else{
							System.out.println("您输入有误,请重新输入！");
						}
					}
					
				  }
				//密码或账号输入错误，返回主界面
				  else{                                
					System.out.println("您账号或密码输入错误，登录失败！");
					continue;
				  }
				  
				}
			//选择退出界面
			else if(choose1==2) {   
				System.out.println("您已退出系统！");
				System.exit(0);
			}
			//输入有误，提示重新输入
			else {
			System.out.println("您输入有误，请重新输入!");
			}
		}
	}
}
