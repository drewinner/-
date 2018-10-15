//1,Product定义的示例代码
public interface Product{
	//可以定义Product的属性和方法。
}

//2，Product实现对象的示例代码
public class ConcreteProduct implements Product {
	//实现Product要求的方法
}

//3，创建器，声明工厂方法
public abstract class Creator {
	//创建Product的工厂方法，@return Product对象
	protected abstract Product factoryMethod();

	/**
	*	示意方法，实现某些功能的方法
	*/
	public void someOperation(){
		//通常在这些方法实现中需要调用工厂方法类获取Product对象。
		Product product = factoryMethod();
	}
}

//4,创建器实现对象的示例代码
/**
*	具体的创建器实现对象
*/
public class ConcreteCreator extends Concretor {
	protected Product factoryMethod(){
		//重新定义工厂方法，返回一个具体的Product对象
		return new ConcreteProduct();
	}
}