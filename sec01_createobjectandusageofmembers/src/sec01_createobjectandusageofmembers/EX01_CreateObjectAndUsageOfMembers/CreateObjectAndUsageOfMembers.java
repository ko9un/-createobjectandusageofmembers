package sec01_createobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;


class A{
	int m = 3 ;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}

public class CreateObjectAndUsageOfMembers {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.m);
		
		a.print();
	}
	


}
