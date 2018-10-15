package adapter.adapter;

import adapter.adapter.adapter.adapter.adaptee.LogFileOperateApi;

import java.util.List;

public class Adapter implements LogDbOperateApi {

	//持有需要适配的接口对象
	private LogFileOperateApi adaptee;

	/**
	 * 构造方法，传入需要被适配的对象
	 * @param adaptee 需要被适配的对象
	 */
	public Adapter(LogFileOperateApi adaptee){
		this.adaptee = adaptee;
	}

	@Override
	public void createLog(LogModel lm) {
		List<LogModel> list = adaptee.readLogFile();
		list.add(lm);
		adaptee.writeLogFile(list);
	}

	@Override
	public void updateLog(LogModel lm) {
		List<LogModel> list = adaptee.readLogFile();
		for(int i = 0 ;i < list.size();i++){
			if (list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i,lm);
				break;
			}
		}
		adaptee.writeLogFile(list);
	}

	@Override
	public void removeLog(LogModel lm) {
		List<LogModel> list = adaptee.readLogFile();
		list.remove(lm);
		adaptee.writeLogFile(list);
	}

	@Override
	public List<LogModel> getAllLog() {
		return adaptee.readLogFile();
	}
}
