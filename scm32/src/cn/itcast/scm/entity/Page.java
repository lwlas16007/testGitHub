package cn.itcast.scm.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//用于数据库的实体类
public class Page<T> implements Serializable {

	private static final long serialVersionUID = 337297181251071639L;
	private Integer page;// 当前页面
	private Integer rows;// 页大小
	private Integer totalRecord;// 总记录数
	private List<T> list;// 页面数据列表
	private String keyWord;// 查询关键字
	private T paramEntity;// 多条件查询
	private Integer start;// 需要这里计算
	private Map<String, Object> pageMap = new HashMap<String, Object>();
	//注释掉的部分为优化后的代码，防止重复编写


	@Override
	public String toString() {
		return "Page [page=" + page + ", rows=" + rows + ", totalRecord="
				+ totalRecord + ", list=" + list + ", keyWord=" + keyWord
				+ ", paramEntity=" + paramEntity + ", start=" + start
				+ ", map=" + pageMap + "]";
	}

	public T getParaEntity() {
		return paramEntity;
	}

	public void setParaEntity(T paramEntity) {
		this.paramEntity = paramEntity;
	}

	

	public Map<String, Object> getPageMap() {
		return pageMap;
	}

	/*public void setPageMap(Map<String, Object> pageMap) {
		this.pageMap = pageMap;
	}*/

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	/*public Integer getTotalRecord() {
		return totalRecord;
	}*/

	public void setTotalRecord(Integer totalRecord) {
		pageMap.put("total", totalRecord);
		this.totalRecord = totalRecord;
	}

	/*public List<T> getList() {
		return list;
	}
*/
	public void setList(List<T> list) {
		pageMap.put("rows", list);
		this.list = list;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Integer getStart() {
		this.start = (page - 1) * rows;
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

}
