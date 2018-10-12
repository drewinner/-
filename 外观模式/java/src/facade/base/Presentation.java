package facade.base;

/**
 * 生成表现层的模块
 */
public class Presentation {
	public void generate() {
		//1,从配置管理里获取相应的配置信息
		ConfigModel cm = ConfigManager.getInstance().getConfigData();

		if (cm.isNeedGenPresentation()) {
			System.out.println("正在生成表现层代码文件");
		}
	}
}
