import java.util.*;
//←”，“→”，“↑”，“↓”



public class Tcs{
	public static void main(String[] args){
		int num=10;
		Scanner input =new Scanner(System.in);
		
		Random rand = new Random();
		
		int rawAddressx= rand.nextInt(num);
		int rawAddressy= rand.nextInt(num);
		//初始化背景
		String[][] backGruand=new String[num][num];
		
		for(int i = 0; i<backGruand.length; i++){
			for(int j=0; j<backGruand[i].length; j++){
				//System.out.print( "* ");
				backGruand[i][j]="* ";
			}
			System.out.println();
		}
		//随机生成初始位置
		backGruand[rawAddressx][rawAddressy]="↑";

		Print1(backGruand);
		System.out.println("使用WASD来控制方向");
		
		while(true){
			int w=1;
			int a=1;
			int s=1;
			int d=1;
			
			
			String ctl=input.next();
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
				System.out.println("请使用WASD来控制方向");
			}
			
			
			if(ctl.equals("q")){
				break;
			}
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
}

