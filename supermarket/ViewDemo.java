package supermarket;
import java.util.Scanner;
public class ViewDemo {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);           //����Scanner����sc
		String adminword="admin";                   //Ĭ���û�������adminword
		String password="88888888";                //Ĭ�����볣��password
		while(true){                    //�׽���
			System.out.println("=====================market_v1======================");
			System.out.println("1.��¼");
			System.out.println("2.�˳�");
			System.out.println("----------------------------------------------------");
			System.out.println("��ѡ��");
			int choose1=sc.nextInt();//����û�����
			//ѡ���½����
			if(choose1==1) {            //��¼����            
				System.out.println("��ѡ����ǵ�¼����!");
				System.out.println("=====================market_v1[��¼]======================");
				System.out.println("�������˺ţ�");
				String adminword1=sc.next();          //��������洢�û��˺�adminword1
				System.out.println("���������룺");      //��������洢�û�����password1
				String password1=sc.next();
				System.out.println("----------------------------------------------------");
				//�����˺ź�������ȷ����¼�ɹ�
				  if(adminword.equals(adminword1)&&password.equals(password1)){
					System.out.println("����¼�ɹ���");
					while(true){                        //��������
						System.out.println("=====================market_v1[����]======================");
						System.out.println("1.����Ա����");
						System.out.println("2.��Ʒ����");
						System.out.println("3.��������");
						System.out.println("4.������ҳ");
						System.out.println("5.�˳�ϵͳ");
						System.out.println("----------------------------------------------------");
						System.out.println("��ѡ��");
						int choose2=sc.nextInt();
						if(choose2==1){//����Ա����
							
						}else if(choose2==2){//��Ʒ����
							
						}else if(choose2==3){//��������
							
						}else if(choose2==4){//������ҳ
							continue;
						}else if(choose2==5){
							System.out.println("�����˳�ϵͳ��");
							System.exit(0);//�˳�ϵͳ
						}else{
							System.out.println("����������,���������룡");
						}
					}
					
				  }
				//������˺�������󣬷���������
				  else{                                
					System.out.println("���˺Ż�����������󣬵�¼ʧ�ܣ�");
					continue;
				  }
				  
				}
			//ѡ���˳�����
			else if(choose1==2) {   
				System.out.println("�����˳�ϵͳ��");
				System.exit(0);
			}
			//����������ʾ��������
			else {
			System.out.println("��������������������!");
			}
		}
	}
}
