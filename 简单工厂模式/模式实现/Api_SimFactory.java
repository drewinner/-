interface Api {
	public void operation(String s);
}

class ImplA implements Api {
	public void operation(String s){
		System.out.println("ImlA s == " +s );
	}
}


class ImplB implements Api {
	public void operation(String s){
		System.out.println("ImplB s == " +s );
	}
}

class Factory {
	
	public static Api createApi(int condition){
		Api api = null;

		if(condition == 1){
			api = new ImplA();
		}else{
			api = new ImplB();
		}
		return api;
	}
}

public class Api_SimFactory {
	public static void main(String[] args){
		Api api = Factory.createApi(1);
		api.operation("simple factory !");
	}
}