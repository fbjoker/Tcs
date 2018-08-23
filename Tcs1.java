import java.util.*;
//←”，“→”，“↑”，“↓”
//1.0版本
/* 加入食物，实现吃食物增加长度的功能
加入蛇移动的功能

待加入头尾相接退出功能
待加入到食物的步数超过多少步食物就消失
 */


public class Tcs1{
	public static void main(String[] args){
		int num=15;
		Scanner input =new Scanner(System.in);
		
		Random rand = new Random();
		
		//初始化蛇头的位置
		int rawAddressx= rand.nextInt(num);
		int rawAddressy= rand.nextInt(num);
		//初始化实物的位置
		int eatAddressx= rand.nextInt(num);
		int eatAddressy= rand.nextInt(num);
		
		//初始化背景
		String[][] backGruand=new String[num][num];
		
		Arrays.fill(backGruand,"* ")
		
		/* for(int i = 0; i<backGruand.length; i++){
			for(int j=0; j<backGruand[i].length; j++){
				//System.out.print( "* ");
				backGruand[i][j]="* ";
			}
			System.out.println();
		} */
		//随机生成蛇头和实物的初始位置
		backGruand[rawAddressx][rawAddressy]="↑";
		backGruand[eatAddressx][eatAddressy]="￥";
		
		//判断是否吃到食物
		boolean eat=false;

		Print1(backGruand);
		System.out.println("使用WASD来控制方向");
		
		
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
				
				backGruand[rawAddressx][rawAddressy]="↑";
				
				Print1(backGruand);
				w++;
			}else if(ctl.equals("s")){
				backGruand[rawAddressx][rawAddressy]="* ";
				
				rawAddressx=rawAddressx+s;
				backGruand[rawAddressx][rawAddressy]="↓";
				
				Print1(backGruand);
				s++;
			}else if(ctl.equals("a")){
				backGruand[rawAddressx][rawAddressy]="* ";
				
				rawAddressy=rawAddressy-a;
				backGruand[rawAddressx][rawAddressy]="←";
				Print1(backGruand);
				a++;
			}else if(ctl.equals("d")){
				backGruand[rawAddressx][rawAddressy]="* ";
				
				rawAddressy=rawAddressy+d;
				backGruand[rawAddressx][rawAddressy]="→";
				Print1(backGruand);
				d++;
			}else{
				if(ctl.equals("q")){
					System.out.println("退出游戏！！！");
				break;
				}
				System.out.println("请使用WASD来控制方向");
			}
	}
}

