package com.mall.entity;


import java.util.List;

/**
 * 分页对象
 * @param <E>
 * @author 小书包
 */
public class PageBean<E> {

	private int firstPage = 1;
	private int prePage;
	private int nextPage;
	private int totalPage;
	private int currentPage;
	private int totalCount;
	private int pageSize = 10;
	private List<E> list;

	public void setList(List<E> list) {
		this.list = list;
	}

	public int getFirstPage() {
		return this.firstPage;
	}

	/**
	 * 如果当前页==第一页，那么上一页就是1，否则为currentPage-1；
	 *
	 * @return
	 */
	public int getPrePage() {
		return this.getCurrentPage() == this.getFirstPage()
				? 1
				: this.getCurrentPage() - 1;
	}

	/**
	 * 如果当前页==最后一页，那么下一页就是自己，否则为currentPage+1；
	 *
	 * @return
	 */
	public int getNextPage() {
		return this.getCurrentPage() == this.getTotalPage()
				? this.getCurrentPage()
				: this.getCurrentPage() + 1;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	/**
	 * 总记录%记录数==0，则为总记录/记录数，否则为总记录/记录数+1
	 *
	 * @return
	 */
	public int getTotalPage() {
		return this.getTotalCount() % this.getPageSize() == 0
				? this.getTotalCount() / this.getPageSize()
				: this.getTotalCount() / this.getPageSize() + 1;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
