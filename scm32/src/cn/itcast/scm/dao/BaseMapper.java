package cn.itcast.scm.dao;

import java.util.List;

import cn.itcast.scm.entity.Page;

public interface BaseMapper<T> {
	// ע����������Ҫ����applicationContext��xml�����������򣬷����ȡ����
	// ��ӵ�������
	int insert(T entity);

	// �޸ĵ�������
	int updata(T entity);

	// ɾ����������
	int delete(T entity);

	//ͨ����������ɾ������
	int deleteList(String[] pks);
	
	// ��ѯ��������
	T select(T entity);
	
	//ͨ���ټ��ӷ�ҳ��ѯ�����б�
	List<T> selectPageList(Page<T> page);
	 
	//ͨ���ؼ��ַ�ҳ��ѯ�������ܼ�¼��
	Integer selecPageCount(Page<T> page);
	
	//ͨ���ؼ��ַ�ҳ��ѯ�����б�
	
	
	List<T> selectPageListUseDyc(Page<T> page);
	//ͨ���ؼ��ַ�ҳ��ѯ���Ż��ܼ�¼��
	Integer selectPageCountUseDyc(Page<T> page);
}
