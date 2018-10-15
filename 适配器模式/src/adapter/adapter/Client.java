package adapter.adapter;

import adapter.adapter.adapter.adapter.adaptee.LogFileOperate;
import adapter.adapter.adapter.adapter.adaptee.LogFileOperateApi;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		LogModel lml = new LogModel();
		lml.setLogId("001");
		lml.setOperateUser("admin");
		lml.setOperateTime("2018-03-02 10:08:18");
		lml.setLogContent("test");
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lml);

		//创建操作日志文件的对象
		LogFileOperateApi logFileApi = new LogFileOperate();
		LogDbOperateApi api = new Adapter(logFileApi);
		api.createLog(lml);
		//读取日志文件的内容
		List<LogModel> alllog = api.getAllLog();
		System.out.println("allLog=" + alllog);
	}
}
