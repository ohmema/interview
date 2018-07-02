package recursive;

public class Recursiv {

	public static void telephoneWords(int number){
		char[] num=new char[7];
		int index=6;
		int nu;
		while(index != -1){
			nu=number%10;
			number/=10;
			num[index--] = (char)(nu+'0');
			
			
		}
		
		for( int j=0;j<num.length;j++)
			System.out.printf("%c",num[j]);
		System.out.println();
		
		wordPermu(num,0);
	}
	
	public static void wordPermu(char[] num, int index){

		if(index == num.length){
			for( int j=0;j<num.length;j++)
				System.out.printf("%c",num[j]);
			System.out.println();
			return;
		}
		
		if(num[index]=='2'){
			char[] num1 = Recursive.swap(num,index,index);
			num1[index]='A';
			wordPermu(num1,index+1);
			
			char[] num2 = Recursive.swap(num,index,index);
			num2[index]='B';
			wordPermu(num2,index+1);
			
			char[] num3 = Recursive.swap(num,index,index);
			num3[index]='C';
			wordPermu(num3,index+1);
			
		}
	
		

		else if(num[index]=='3'){
			char[] num1 = Recursive.swap(num,index,index);
			num1[index]='D';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='E';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='F';
			wordPermu(num1,index+1);
		}	
		

		else if(num[index]=='4'){
			char[] num1 = Recursive.swap(num,index,index);
			num1[index]='G';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='H';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='I';
			wordPermu(num1,index+1);
		}	
		

		else if(num[index]=='5'){
			char[] num1 = Recursive.swap(num,index,index);
			num1[index]='J';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='K';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='L';
			wordPermu(num1,index+1);
		}	
		

		else if(num[index]=='6'){
			char[] num1 = Recursive.swap(num,index,index);
			num1[index]='M';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='N';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='O';
			wordPermu(num1,index+1);
		}	
		

		else if(num[index]=='7'){
			char[] num1 = Recursive.swap(num,index,index);
			num1[index]='P';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='R';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='S';
			wordPermu(num1,index+1);
		}	
		

		else if(num[index]=='8'){
			char[] num1 = Recursive.swap(num,index,index);
			num1[index]='T';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='U';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='V';
			wordPermu(num1,index+1);
		}	
		

		else if(num[index]=='9'){
			char[] num1 = Recursive.swap(num,index,index);
			num1[index]='W';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='X';
			wordPermu(num1,index+1);
			
			num1 = Recursive.swap(num,index,index);
			num1[index]='Y';
			wordPermu(num1,index+1);
		}	
		else
			wordPermu(num,index+1);
	}
	public static void main(String[] args) {
		
		int number= 1234567;
  		
  		 telephoneWords(number);
  	
  		//char[] num = {'1','2','3','4','5','6','7'};
  		
  		//wordPermu(num,0);
	}

}
