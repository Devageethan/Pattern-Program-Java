package patternprograms;

public class P2 {
			public static void main(String[] args) {
			int n=5;
			int num=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i+j>=n-1) {
						System.out.print(num+++" ");
					}else {
						System.out.print(" ");
					}
					
				}
				num=1;
				System.out.println();
			}
			}
}
			