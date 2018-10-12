package facade.base;

/**
 * 生成逻辑层的模块
 */
public class Business {
	public void generate() {
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if (cm.isNeedGenBusiness()) {
			System.out.println("正在生成逻辑层代码...");
		}
	}
}
