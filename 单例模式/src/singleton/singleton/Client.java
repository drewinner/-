package singleton.singleton;

public class Client {
	public static void main(String[] args) {
		AppConfig appConfig = AppConfig.getInstance();
		String paramA = appConfig.getParameterA();
		String paramB = appConfig.getParameterB();
		//System.out.println(appConfig.toString()+"---"+appConfig1.toString());
		System.out.println("paramA = " + paramA + ",paramB=" + paramB);
	}
}
