

public class hashCodeAndEquals {
	public static void main(String[] args) {
		//effective �ڹٿ��� hashcode�� �������̵����شٸ�, eqauls���� �������̵�������Ѵٴ� ���� �а� ����.
		//effective java 3/e pg.67~
	
		
		/*String�̶�� wrapper class�� ������ü�� �������� ���� �ְ�, �����ڸ� ����ؼ� ��������ִ�.
		���� ���� �ʱ�ȭ���ִ� ���� ������ ���� �����ϴ�.*/
		
		System.out.println("*String using hashcode()");
		String s = "hello";
		String a = "hello";
		String c = new String("abcd");
		String d = new String("abcd");
		
		//hashcode �Լ� ���θ� ���� hashfunction�� �������ֱ� ������, �� ���� ������ �ƴ��� �˼��ִ�.
		//*����! hashfunc�� ���� �˰����� ���� �ּҰ��� ����ϴ� ���� �ƴϴ�.
		System.out.println(s.hashCode());//hello�� ���� hashfunc
		System.out.println(a.hashCode());//hello�� ���� hashfunc
		
		System.out.println(c.hashCode());//abcd�� ���� hashfunc
		System.out.println(d.hashCode());//abcd�� ���� hashfunc
		
		
		System.out.println("----------");
		System.out.println();
	
		
		/* �Ʒ��� ���� Wrapper Ŭ������ �˾Ƽ�, ĳ���� �Ǳ� ������
		 1. �ʱ�ȭ�� ��밡��(boxing unboxing ����)
		 2. �����ڷε� �ʱ�ȭ �� ���̶� ���� ���� ��µȴ�. 
		 */
		
		System.out.println("*Integer using hashcode()");
		Integer wrapper1 = 10;
		Integer wrapper2 = 10;
		Integer wrapper3 = new Integer("10");
		Integer wrapper4 = new Integer("10");
		
		System.out.println(wrapper1.hashCode());
		System.out.println(wrapper2.hashCode());
		System.out.println(wrapper3.hashCode());
		System.out.println(wrapper4.hashCode());
		
		System.out.println("----------");
		System.out.println();

		//equals�� ���� �Լ��� ��Ʈ������, object������ �Ǵ��Ͽ�, object�� ��� true ���, �ƴϸ� string�̸� �Ѱ��� char�� �� �� ���
		//wrapper class�� ���� ���� �����Ǿ� �ִ�.
		//equals ���ζ���, String�� ��� char�� �ѿ��Ҿ� Ȯ���� ���ְ� �Ǿ��ִ�.
		//hashcode�� �ؽ�function�� ����ؼ� ���� ������Ʈ Ȯ��
		
		System.out.println("*String Using Eqauls");

		System.out.println(s.equals(a));//���� valueüũ true
		System.out.println(s==a);//���� value�� ���Ƽ� true
		System.out.println(c==d);//������ �񱳸� �Ҷ��� ��ġ�� ��, �ν��Ͻ�(new�� ������ ��ġ)�� �ٸ��� ������ false
		System.out.println(c.equals(d));//���� �� ���ϴ°� �̶� true
		
		
		
		
		//����
		/*
		1. ������(new)�� �ʱ�ȭ�� ���ٰ��, ���Ҷ� ���� �ּҰ��� �Ǿ� false�� ����
		2. �ʱ�ȭ���� "11"�̷������� �����Ÿ� �������ָ�, ���Ҷ� ���� ���� ���Ͽ� true�� ����
		3. Wrapper Ŭ������ boxing unboxing casting���信 ���� ���� �� �� ����
		4. hashcode(),�Լ��� �ּҰ��� �ƴ϶�, �ȿ� ����ִ� ���ΰ��� �ؽ��� ����Ѵ�.(int�� �ؽ�func�� ���� hashcode���)
		5. eqauls�� ���ΰ��� �����ش�. String�� ��� char�� ������ �ɰ��� ���ΰ��� ������
		*/
	}
}
