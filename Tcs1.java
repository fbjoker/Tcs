import java.util.*;
//����������������������������
//1.0�汾
/* ����ʳ�ʵ�ֳ�ʳ�����ӳ��ȵĹ���
�������ƶ��Ĺ���

������ͷβ����˳�����
�����뵽ʳ��Ĳ����������ٲ�ʳ�����ʧ
 */


public class Tcs1{
	public static void main(String[] args){
		int num=15;
		Scanner input =new Scanner(System.in);
		
		Random rand = new Random();
		
		//��ʼ����ͷ��λ��
		int rawAddressx= rand.nextInt(num);
		int rawAddressy= rand.nextInt(num);
		//��ʼ��ʵ���λ��
		int eatAddressx= rand.nextInt(num);
		int eatAddressy= rand.nextInt(num);
		
		//��ʼ������
		String[][] backGruand=new String[num][num];
		
		Arrays.fill(backGruand,"* ")
		
		/* for(int i = 0; i<backGruand.length; i++){
			for(int j=0; j<backGruand[i].length; j++){
				//System.out.print( "* ");
				backGruand[i][j]="* ";
			}
			System.out.println();
		} */
		//���������ͷ��ʵ��ĳ�ʼλ��
		backGruand[rawAddressx][rawAddressy]="��";
		backGruand[eatAddressx][eatAddressy]="��";
		
		//�ж��Ƿ�Ե�ʳ��
		boolean eat=false;

		Print1(backGruand);
		System.out.println("ʹ��WASD�����Ʒ���");
		
		
		while(true){
			int w=1;
			int a=1;
			int s=1;
			int d=1;
			
			
			String ctl=input.next();
			
			CtrlMove(ctl);
			
			
		}
	}
	
	
	
	
	public static void Print1(String[][] backGruand){
			for(int i = 0; i<backGruand.length; i++){
				for(int j=0; j<backGruand[i].length; j++){
					System.out.print( backGruand[i][j]);
					
				}
				System.out.println();
			}
	}
	
	public static void CtrlMove(String ctl){
		if(ctl.equals("w")){
				backGruand[rawAddressx][rawAddressy]="* ";
				rawAddressx=rawAddressx-w;
				
				backGruand[rawAddressx][rawAddressy]="��";
				
				Print1(backGruand);
				w++;
			}else if(ctl.equals("s")){
				backGruand[rawAddressx][rawAddressy]="* ";
				
				rawAddressx=rawAddressx+s;
				backGruand[rawAddressx][rawAddressy]="��";
				
				Print1(backGruand);
				s++;
			}else if(ctl.equals("a")){
				backGruand[rawAddressx][rawAddressy]="* ";
				
				rawAddressy=rawAddressy-a;
				backGruand[rawAddressx][rawAddressy]="��";
				Print1(backGruand);
				a++;
			}else if(ctl.equals("d")){
				backGruand[rawAddressx][rawAddressy]="* ";
				
				rawAddressy=rawAddressy+d;
				backGruand[rawAddressx][rawAddressy]="��";
				Print1(backGruand);
				d++;
			}else{
				if(ctl.equals("q")){
					System.out.println("�˳���Ϸ������");
				break;
				}
				System.out.println("��ʹ��WASD�����Ʒ���");
			}
	}
}

