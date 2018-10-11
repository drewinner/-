interface Api {
	public void test(String s);
}

class Impl implements Api {
	public void test(String s ){
		System.out.println(s);
	}
}

public class Api_Normal {
	public static void main(String[] args){
		Api api = new Impl();
		api.test("test");
	}
}