package patternprograms;

public class P5 {
public static void main(String[] args) {
	int n=5,num=1;
	char ch='A';
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j>=n-1) {
				if(i%2==0) {
					System.out.print(num+++" ");
				}else {
					System.out.print(ch+++" ");
				}
				
			}else {
				System.out.print(" ");
			}
		}
		ch='A';
		num=1;
		System.out.println();
	}
}
}
