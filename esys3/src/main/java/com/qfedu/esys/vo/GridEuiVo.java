package com.qfedu.esys.vo;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class GridEuiVo<T>{
	private final static Logger LOG = LogManager.getLogger(GridEuiVo.class);
	
	private long total;
	
	private List<T> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public GridEuiVo(long total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	
}
