package cn.itcast.scm.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//�������ݿ��ʵ����
public class Page<T> implements Serializable {

	private static final long serialVersionUID = 337297181251071639L;
	private Integer page;// ��ǰҳ��
	private Integer rows;// ҳ��С
	private Integer totalRecord;// �ܼ�¼��
	private List<T> list;// ҳ�������б�
	private String keyWord;// ��ѯ�ؼ���
	private T paramEntity;// ��������ѯ
	private Integer start;// ��Ҫ�������
	private Map<String, Object> pageMap = new HashMap<String, Object>();
	//ע�͵��Ĳ���Ϊ�Ż���Ĵ��룬��ֹ�ظ���д


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
