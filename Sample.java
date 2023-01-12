package practices;

public class Sample {
	
	public void toFindCount(String word) {
		char[] c=word.toCharArray();
		int w=0;
		int x=0;
		int y=0;
		int z=0;
		for(int i=0;i<c.length;i++) {
			
		    if(c[i]>='0'&& c[i]<='9') {
				z++;
			 }
		    else  if(c[i]>='A'&& c[i]<='Z'){
				w++;
			}
			else if(c[i]>='a' && c[i]<='z') {
				x++;
			}
			else {
				y++;
			}
			
		
		}
		System.out.println("Count Up="+w+" Count Low="+x+" Count Special="+y+" Count num="+z);
	}
	
	
	public void pyramid(int num) {
		String k="";
		for(int i=1;i<=num;i++) {
			k=k+i;
			System.out.println(k); 
		}
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
