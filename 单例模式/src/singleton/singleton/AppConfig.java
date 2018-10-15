package singleton.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

	private static AppConfig appConfig = new AppConfig();

	public static AppConfig getInstance() {
		return appConfig;
	}
	private String parameterA;
	private String parameterB;

	public String getParameterA() {
		return parameterA;
	}
	public String getParameterB() {
		return parameterB;
	}
	//私有化构造方法
	private AppConfig() {
		readConfig();
	}

	private void readConfig() {
		Properties p = new Properties();
		InputStream in = null;
		in = AppConfig.class.getResourceAsStream("AppConfig.properties");
		try {
			p.load(in);
			this.parameterA = p.getProperty("paramA");
			this.parameterB = p.getProperty("paramB");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
