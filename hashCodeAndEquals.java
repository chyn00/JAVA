

public class hashCodeAndEquals {
	public static void main(String[] args) {
		//effective 자바에서 hashcode를 오버라이딩해준다면, eqauls또한 오버라이딩해줘야한다는 것을 읽고 정리.
		//effective java 3/e pg.67~
	
		
		/*String이라는 wrapper class는 변수자체를 저장해줄 수도 있고, 생성자를 사용해서 만들수도있다.
		들어가는 값은 초기화해주는 값과 생성자 값이 동일하다.*/
		
		System.out.println("*String using hashcode()");
		String s = "hello";
		String a = "hello";
		String c = new String("abcd");
		String d = new String("abcd");
		
		//hashcode 함수 내부를 보면 hashfunction을 실행해주기 때문에, 그 값이 같은지 아닌지 알수있다.
		//*주의! hashfunc을 보면 알겠지만 절대 주소값을 출력하는 것이 아니다.
		System.out.println(s.hashCode());//hello에 대한 hashfunc
		System.out.println(a.hashCode());//hello에 대한 hashfunc
		
		System.out.println(c.hashCode());//abcd에 대한 hashfunc
		System.out.println(d.hashCode());//abcd에 대한 hashfunc
		
		
		System.out.println("----------");
		System.out.println();
	
		
		/* 아래를 보면 Wrapper 클래스는 알아서, 캐스팅 되기 때문에
		 1. 초기화로 사용가능(boxing unboxing 개념)
		 2. 생성자로도 초기화 한 값이랑 같은 값이 출력된다. 
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

		//equals는 내부 함수가 스트링인지, object인지를 판단하여, object인 경우 true 출력, 아니면 string이면 한개씩 char로 비교 후 출력
		//wrapper class에 따라 각각 구현되어 있다.
		//equals 내부또한, String의 경우 char로 한원소씩 확인을 해주게 되어있다.
		//hashcode는 해시function을 사용해서 내부 오브젝트 확인
		
		System.out.println("*String Using Eqauls");

		System.out.println(s.equals(a));//내부 value체크 true
		System.out.println(s==a);//내부 value가 같아서 true
		System.out.println(c==d);//생성자 비교를 할때는 위치로 비교, 인스턴스(new로 생성된 위치)가 다르기 때문에 false
		System.out.println(c.equals(d));//내부 값 비교하는것 이라 true
		
		
		
		
		//정리
		/*
		1. 생성자(new)로 초기화를 해줄경우, 비교할때 값이 주소값이 되어 false가 나옴
		2. 초기화에서 "11"이런식으로 같은거를 구현해주면, 비교할때 내부 값을 비교하여 true가 나옴
		3. Wrapper 클래스의 boxing unboxing casting개념에 대해 공부 할 수 있음
		4. hashcode(),함수는 주소값이 아니라, 안에 들어있는 내부값을 해쉬로 출력한다.(int로 해쉬func을 거쳐 hashcode출력)
		5. eqauls는 내부값을 비교해준다. String의 경우 char로 일일이 쪼개서 내부값을 비교해줌
		*/
	}
}
