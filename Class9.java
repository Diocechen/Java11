package Java11;

interface Math2{
	public void show();
	public abstract void add(int a,int b);
	public abstract void sub(int a,int b);
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
}

interface AdvancedMath{
	public void mod(int a,int b);
	public void fac(int a);
	public void pow(int a,int b);
}

class Compute2 implements Math2,AdvancedMath{
	int ans;
	public void show() {
		System.out.println("ans="+ans);
	}
	public void add(int a,int b){
		ans = a + b;
	}
	public void sub(int a,int b){
		ans = a - b;
	}
	public void mul(int a,int b){
		ans = a * b;
	}
	public void div(int a,int b){
		ans = a / b;
	}
	
	public void mod(int a,int b) {
		ans = a % b;
	}
	public void fac(int a){
		int tem = 1;
		for(int i = a;i > 0;i--) {
			tem *= i;
		}
		ans = tem;
	}
	public void pow(int a,int b){
		int tem = a;
		for(int i = 0;i < b;i++) {
			tem *= a;
		}
		ans = tem;
	}
}

public class Class9 {

	public static void main(String[] args) {
		Compute2 cmp = new Compute2();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	
	}

}
