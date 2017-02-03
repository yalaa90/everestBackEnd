package com.hrms.response.core;

@SuppressWarnings("rawtypes")
public class SuccessResponse<T> extends BaseResponse{

	private static final long serialVersionUID = 5325162000326880859L;
	
	private T data ;
	
	public SuccessResponse(T data) {
		super(Boolean.TRUE);
		this.data = data ;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


}
