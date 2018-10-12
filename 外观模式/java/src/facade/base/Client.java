package facade.base;

public class Client {
	public static void main(String[] args) {
		//没有配置文件，直接使用默认配置，正常情况下，三层都应该生成
		//也就是客户端必须对这些模块都有了解，才能正确使用他们

		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}
