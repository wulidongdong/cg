package scut.legend.cg.po;

import java.io.Serializable;
import java.math.BigInteger;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CheckWarehouseProductRecord implements Serializable{
	private Integer id;//产品清仓记录id
	private String checkNum;//产品清仓编号
	//多对一
	private Integer staffId;//登记者id
	private String staffName;//登记者名字
	//多对一
	private Product product;//产品
	private Long checkDate;//清仓日期
	private Float productInventory;//产品数量
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCheckNum() {
		return checkNum;
	}
	public void setCheckNum(String checkNum) {
		this.checkNum = checkNum;
	}
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Long getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Long checkDate) {
		this.checkDate = checkDate;
	}
	public Float getProductInventory() {
		return productInventory;
	}
	public void setProductInventory(Float productInventory) {
		this.productInventory = productInventory;
	}
}