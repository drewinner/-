package singleton.singleton;

public class HungrySingleton {
	/**
	 * 定义一个变量来存储创建好的实例，直接在这里创建类实例，只能创建一次
	 */
	private static HungrySingleton uniqueInstance = new HungrySingleton();

	/**
	 * 私有化构造方法，可以再内部控制创建实例的数目
	 */
	private HungrySingleton() {
	}

	/**
	 * 定义一个方法来为客户端提供类实例
	 *
	 * @return 一个HungrySingleton 实例
	 */
	public static HungrySingleton getInstance() {
		return uniqueInstance;
	}

	/**
	 * 示意方法，单例可以有自己的操作
	 */
	public void singletonOperate() {
		//操作
	}

	//示意方法，单例可以有自己的属性
	private String singleData;

	public String getSingleData() {
		return singleData;
	}
}
