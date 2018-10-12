package facade.facade;

/**
 * 示意配置描述的数据Model
 *
 */
public class ConfigModel {
	/**
	 * 是否生成表现层，默认是true
	 */
	private boolean needGenPresentation = true;
	/**
	 * 是否生成逻辑层，默认是true
	 */
	private boolean needGenBusiness = true;
	/**
	 * 是否生成Dao层，默认是true
	 */
	private boolean needGenDAO = true;

	public boolean isNeedGenPresentation(){
		return needGenPresentation;
	}
	public boolean isNeedGenBusiness(){
		return needGenBusiness;
	}

	public boolean isNeedGenDAO(){
		return needGenDAO;
	}

	public void setNeedGenPresentation(boolean needGenBusiness){
		this.needGenBusiness = needGenBusiness;
	}

	public void setNeedGenBusiness(boolean needGenBusiness) {
		this.needGenBusiness = needGenBusiness;
	}

	public void setNeedGenDAO(boolean needGenDAO) {
		this.needGenDAO = needGenDAO;
	}
}
