package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Equipment implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 设备类型id
     */
    private Integer modelid;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备内存
     */
    private String memory;

    /**
     * 机身颜色
     */
    private String color;

    /**
     * 价格
     */
    private Double price;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createtime;

    @Transient
    private Model model;
    
    public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取设备类型id
     *
     * @return modelid - 设备类型id
     */
    public Integer getModelid() {
        return modelid;
    }

    /**
     * 设置设备类型id
     *
     * @param modelid 设备类型id
     */
    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    /**
     * 获取设备名称
     *
     * @return name - 设备名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置设备名称
     *
     * @param name 设备名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取设备内存
     *
     * @return memory - 设备内存
     */
    public String getMemory() {
        return memory;
    }

    /**
     * 设置设备内存
     *
     * @param memory 设备内存
     */
    public void setMemory(String memory) {
        this.memory = memory == null ? null : memory.trim();
    }

    /**
     * 获取机身颜色
     *
     * @return color - 机身颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置机身颜色
     *
     * @param color 机身颜色
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
	public String toString() {
		return "Equipment [id=" + id + ", modelid=" + modelid + ", name=" + name + ", memory=" + memory + ", color="
				+ color + ", price=" + price + ", status=" + status + ", createtime=" + createtime + ", model=" + model
				+ "]";
	}
}