package com.hrms.dao.core;

import java.io.Serializable;
import java.util.List;

public interface IBaseDetailDAO  <T,pk extends Serializable> extends IBaseDAO<T,pk> {
	List<T> getDetail();
}
