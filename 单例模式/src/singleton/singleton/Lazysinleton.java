package singleton.singleton;

/**
 * 懒汉式实现单例
 */
public class Lazysinleton {
	/**
	 * 定义一个变量来存储创建好的类实例
	 */
	private static Lazysinleton uniqueInstance = null;

	/**
	 * 私有化构造方法，可以在内部控制创建实例的数目
	 */
	private Lazysinleton() {
	}

	/**
	 * 定义一个方法来为客户端提供类实例
	 *
	 * @return 一个Singleton的实例
	 */
	public static synchronized Lazysinleton getInstance() {
		//判断存储实例的变量是否有值
		if (uniqueInstance == null) {
			uniqueInstance = new Lazysinleton();
		}
		return uniqueInstance;
	}

	/**
	 * 示意方法，单例可以有自己的操作
	 */
	public void singletonOperation() {
		//功能处理
	}

	/**
	 * 示意属性，单例可以有自己的属性
	 */
	private String singletonData;

	/**
	 * 示意方法，让外部通过这些方法来访问属性的值
	 */
	public String getSingletonData() {
		return singletonData;
	}
}
