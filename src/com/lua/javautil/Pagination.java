package com.lua.javautil;


import java.util.List;

/**
 * ͨ�÷�ҳ��
 * @author Administrator
 *
 */
public class Pagination {
	//��ǰҳ��
	private int pageNum;
	//��¼����
	private int rowCount;
	//��������
	private List list;
	//ҳ����ʾ��¼�ĸ���
	private int size;
	//��ҳ��
	private int pageCount;
	
	//��ҳ��ʼ��¼
	private int startRow;
	
	//ҳ�ŵ���
	private int first = 1;//��һҳ ҳ��
	private int last;//���ҳ ҳ��
	private int previous;  //��һҳ
	private int next;  //��һҳ
	
	private int startNav;  //������ʼҳ��
	private int endNav;  //��������ҳ��
	private int navCount = 10;//ҳ��ʽ����, �����ʾҳ������
	
	public  Pagination(String str_pageNum, int rowCount, int size){
		this.pageNum = (str_pageNum==null)?1:(Integer.parseInt(str_pageNum));
		this.rowCount = rowCount;
		this.size = size;
		
		this.pageCount  =  (int) Math.ceil((double)this.rowCount/this.size);
		this.pageNum  = Math.min(this.pageNum , pageCount);
		this.pageNum  = Math.max(1, this.pageNum);
		
		this.startRow = (this.pageNum-1) * size ;
		
		this.last = this.pageCount;
		
		this.previous = Math.max(1 , this.pageNum-1);
		this.next = Math.min( this.pageCount, this.pageNum+1);
		
		//��������
		this.startNav = (this.pageNum-navCount/2<1)?1:this.pageNum-navCount/2;
		this.endNav = this.startNav+this.navCount;
		this.endNav = Math.min(this.endNav, this.pageCount);
		
		if(this.endNav-this.startNav  < this.navCount){
			this.startNav = Math.max(this.endNav-this.navCount, 1);
		}
	}
	
	public Pagination() {
	}
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	public int getPrevious() {
		return previous;
	}

	public void setPrevious(int previous) {
		this.previous = previous;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getStartNav() {
		return startNav;
	}

	public void setStartNav(int startNav) {
		this.startNav = startNav;
	}

	public int getEndNav() {
		return endNav;
	}

	public void setEndNav(int endNav) {
		this.endNav = endNav;
	}

	public int getNavCount() {
		return navCount;
	}

	public void setNavCount(int navCount) {
		this.navCount = navCount;
	}
}
