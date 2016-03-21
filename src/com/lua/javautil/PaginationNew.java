package com.lua.javautil;


import java.util.List;

/**
 * ͨ�÷�ҳ��
 * @author Administrator
 *
 */
public class PaginationNew {
	//��ǰҳ��
	private int pageNumNew;
	//��¼����
	private int rowCountNew;
	//��������
	private List listNew;
	//ҳ����ʾ��¼�ĸ���
	private int sizeNew;
	//��ҳ��
	private int pageCountNew;
	
	//��ҳ��ʼ��¼
	private int startRowNew;
	
	//ҳ�ŵ���
	private int firstNew = 1;//��һҳ ҳ��
	private int lastNew;//���ҳ ҳ��
	private int previousNew;  //��һҳ
	private int nextNew;  //��һҳ
	
	private int startNavNew;  //������ʼҳ��
	private int endNavNew;  //��������ҳ��
	private int navCountNew = 10;//ҳ��ʽ����, �����ʾҳ������
	
	public  PaginationNew(String str_pageNumNew, int rowCountNew, int sizeNew){
		this.pageNumNew = (str_pageNumNew==null)?1:(Integer.parseInt(str_pageNumNew));
		this.rowCountNew = rowCountNew;
		this.sizeNew = sizeNew;
		
		this.pageCountNew  =  (int) Math.ceil((double)this.rowCountNew/this.sizeNew);
		this.pageNumNew  = Math.min(this.pageNumNew , pageCountNew);
		this.pageNumNew  = Math.max(1, this.pageNumNew);
		
		this.startRowNew = (this.pageNumNew-1) * sizeNew ;
		
		this.lastNew = this.pageCountNew;
		
		this.previousNew = Math.max(1 , this.pageNumNew-1);
		this.nextNew = Math.min( this.pageCountNew, this.pageNumNew+1);
		
		//��������
		this.startNavNew = (this.pageNumNew-navCountNew/2<1)?1:this.pageNumNew-navCountNew/2;
		this.endNavNew = this.startNavNew+this.navCountNew;
		this.endNavNew = Math.min(this.endNavNew, this.pageCountNew);
		
		if(this.endNavNew-this.startNavNew  < this.navCountNew){
			this.startNavNew = Math.max(this.endNavNew-this.navCountNew, 1);
		}
	}
	
	public PaginationNew() {
	}

	public int getPageNumNew() {
		return pageNumNew;
	}

	public void setPageNumNew(int pageNumNew) {
		this.pageNumNew = pageNumNew;
	}

	public int getRowCountNew() {
		return rowCountNew;
	}

	public void setRowCountNew(int rowCountNew) {
		this.rowCountNew = rowCountNew;
	}

	public List getListNew() {
		return listNew;
	}

	public void setListNew(List listNew) {
		this.listNew = listNew;
	}

	public int getSizeNew() {
		return sizeNew;
	}

	public void setSizeNew(int sizeNew) {
		this.sizeNew = sizeNew;
	}

	public int getPageCountNew() {
		return pageCountNew;
	}

	public void setPageCountNew(int pageCountNew) {
		this.pageCountNew = pageCountNew;
	}

	public int getStartRowNew() {
		return startRowNew;
	}

	public void setStartRowNew(int startRowNew) {
		this.startRowNew = startRowNew;
	}

	public int getFirstNew() {
		return firstNew;
	}

	public void setFirstNew(int firstNew) {
		this.firstNew = firstNew;
	}

	public int getLastNew() {
		return lastNew;
	}

	public void setLastNew(int lastNew) {
		this.lastNew = lastNew;
	}

	public int getPreviousNew() {
		return previousNew;
	}

	public void setPreviousNew(int previousNew) {
		this.previousNew = previousNew;
	}

	public int getNextNew() {
		return nextNew;
	}

	public void setNextNew(int nextNew) {
		this.nextNew = nextNew;
	}

	public int getStartNavNew() {
		return startNavNew;
	}

	public void setStartNavNew(int startNavNew) {
		this.startNavNew = startNavNew;
	}

	public int getEndNavNew() {
		return endNavNew;
	}

	public void setEndNavNew(int endNavNew) {
		this.endNavNew = endNavNew;
	}

	public int getNavCountNew() {
		return navCountNew;
	}

	public void setNavCountNew(int navCountNew) {
		this.navCountNew = navCountNew;
	}
	
}
