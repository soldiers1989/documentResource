package com.huateng.scf.nbas.prd.model;

import java.io.Serializable;
import java.util.Date;

public class BPrdFlowVO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String inpDt;
    private String productName;
	private String modelName;
	
	public String getInpDt() {
		return inpDt;
	}

	public void setInpDt(String inpDt) {
		this.inpDt = inpDt;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

    public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
     * VARCHAR(32) 必填<br>
     * 主键
     */
    private String id;

    /**
     * VARCHAR(10) 必填<br>
     * 产品ID
     */
    private String productId;

    /**
     * VARCHAR(10)<br>
     * 调用阶段
     */
    private String invokPhase;

    /**
     * VARCHAR(250) 必填<br>
     * 模板名
     */
    private String modelId;

    /**
     * CHAR(1) 默认值['0'
      ]<br>
     * 启用状态：0.未启用，1.启用
     */
    private String status;

    /**
     * VARCHAR(150) 必填<br>
     * 调用路径（实现类）
     */
    private String callerClasspath;

    /**
     * VARCHAR(250)<br>
     * 跳转路径
     */
    private String url;

    /**
     * VARCHAR(20)<br>
     * 备注1
     */
    private String ext1;

    /**
     * VARCHAR(20)<br>
     * 备注2
     */
    private String ext2;

    /**
     * VARCHAR(20)<br>
     * 备注3
     */
    private String ext3;

    /**
     * VARCHAR(20)<br>
     * 备注4
     */
    private String ext4;

    /**
     * VARCHAR(20)<br>
     * 备注5
     */
    private String ext5;

    /**
     * VARCHAR(32) 必填<br>
     * 创建人
     */
    private String tlrcd;

    /**
     * TIMESTAMP(11,6) 必填<br>
     * 创建时间
     */
    private Date crtTime;

    /**
     * VARCHAR(20) 必填<br>
     * 经办机构
     */
    private String brcode;

    /**
     * VARCHAR(32)<br>
     * 最后更新操作员
     */
    private String lastUpdTlrcd;

    /**
     * TIMESTAMP(11,6)<br>
     * 最后更新时间
     */
    private Date lastUpdTime;

    /**
     * VARCHAR(20)<br>
     * 最后更新机构
     */
    private String lastUpdBrcode;

    /**
     * VARCHAR(32) 必填<br>
     * 获得 主键
     */
    public String getId() {
        return id;
    }

    /**
     * VARCHAR(32) 必填<br>
     * 设置 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * VARCHAR(10) 必填<br>
     * 获得 产品ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * VARCHAR(10) 必填<br>
     * 设置 产品ID
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * VARCHAR(10)<br>
     * 获得 调用阶段
     */
    public String getInvokPhase() {
        return invokPhase;
    }

    /**
     * VARCHAR(10)<br>
     * 设置 调用阶段
     */
    public void setInvokPhase(String invokPhase) {
        this.invokPhase = invokPhase == null ? null : invokPhase.trim();
    }

    /**
     * VARCHAR(250) 必填<br>
     * 获得 模板名
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * VARCHAR(250) 必填<br>
     * 设置 模板名
     */
    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    /**
     * CHAR(1) 默认值['0'
      ]<br>
     * 获得 启用状态：0.未启用，1.启用
     */
    public String getStatus() {
        return status;
    }

    /**
     * CHAR(1) 默认值['0'
      ]<br>
     * 设置 启用状态：0.未启用，1.启用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * VARCHAR(150) 必填<br>
     * 获得 调用路径（实现类）
     */
    public String getCallerClasspath() {
        return callerClasspath;
    }

    /**
     * VARCHAR(150) 必填<br>
     * 设置 调用路径（实现类）
     */
    public void setCallerClasspath(String callerClasspath) {
        this.callerClasspath = callerClasspath == null ? null : callerClasspath.trim();
    }

    /**
     * VARCHAR(250)<br>
     * 获得 跳转路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * VARCHAR(250)<br>
     * 设置 跳转路径
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 备注1
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 备注1
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 备注2
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 备注2
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 备注3
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 备注3
     */
    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 备注4
     */
    public String getExt4() {
        return ext4;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 备注4
     */
    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 备注5
     */
    public String getExt5() {
        return ext5;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 备注5
     */
    public void setExt5(String ext5) {
        this.ext5 = ext5 == null ? null : ext5.trim();
    }

    /**
     * VARCHAR(32) 必填<br>
     * 获得 创建人
     */
    public String getTlrcd() {
        return tlrcd;
    }

    /**
     * VARCHAR(32) 必填<br>
     * 设置 创建人
     */
    public void setTlrcd(String tlrcd) {
        this.tlrcd = tlrcd == null ? null : tlrcd.trim();
    }

    /**
     * TIMESTAMP(11,6) 必填<br>
     * 获得 创建时间
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * TIMESTAMP(11,6) 必填<br>
     * 设置 创建时间
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * VARCHAR(20) 必填<br>
     * 获得 经办机构
     */
    public String getBrcode() {
        return brcode;
    }

    /**
     * VARCHAR(20) 必填<br>
     * 设置 经办机构
     */
    public void setBrcode(String brcode) {
        this.brcode = brcode == null ? null : brcode.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 最后更新操作员
     */
    public String getLastUpdTlrcd() {
        return lastUpdTlrcd;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 最后更新操作员
     */
    public void setLastUpdTlrcd(String lastUpdTlrcd) {
        this.lastUpdTlrcd = lastUpdTlrcd == null ? null : lastUpdTlrcd.trim();
    }

    /**
     * TIMESTAMP(11,6)<br>
     * 获得 最后更新时间
     */
    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    /**
     * TIMESTAMP(11,6)<br>
     * 设置 最后更新时间
     */
    public void setLastUpdTime(Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    /**
     * VARCHAR(20)<br>
     * 获得 最后更新机构
     */
    public String getLastUpdBrcode() {
        return lastUpdBrcode;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 最后更新机构
     */
    public void setLastUpdBrcode(String lastUpdBrcode) {
        this.lastUpdBrcode = lastUpdBrcode == null ? null : lastUpdBrcode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", invokPhase=").append(invokPhase);
        sb.append(", modelId=").append(modelId);
        sb.append(", status=").append(status);
        sb.append(", callerClasspath=").append(callerClasspath);
        sb.append(", url=").append(url);
        sb.append(", ext1=").append(ext1);
        sb.append(", ext2=").append(ext2);
        sb.append(", ext3=").append(ext3);
        sb.append(", ext4=").append(ext4);
        sb.append(", ext5=").append(ext5);
        sb.append(", tlrcd=").append(tlrcd);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", brcode=").append(brcode);
        sb.append(", lastUpdTlrcd=").append(lastUpdTlrcd);
        sb.append(", lastUpdTime=").append(lastUpdTime);
        sb.append(", lastUpdBrcode=").append(lastUpdBrcode);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BPrdFlowVO other = (BPrdFlowVO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getInvokPhase() == null ? other.getInvokPhase() == null : this.getInvokPhase().equals(other.getInvokPhase()))
            && (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCallerClasspath() == null ? other.getCallerClasspath() == null : this.getCallerClasspath().equals(other.getCallerClasspath()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getExt1() == null ? other.getExt1() == null : this.getExt1().equals(other.getExt1()))
            && (this.getExt2() == null ? other.getExt2() == null : this.getExt2().equals(other.getExt2()))
            && (this.getExt3() == null ? other.getExt3() == null : this.getExt3().equals(other.getExt3()))
            && (this.getExt4() == null ? other.getExt4() == null : this.getExt4().equals(other.getExt4()))
            && (this.getExt5() == null ? other.getExt5() == null : this.getExt5().equals(other.getExt5()))
            && (this.getTlrcd() == null ? other.getTlrcd() == null : this.getTlrcd().equals(other.getTlrcd()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getBrcode() == null ? other.getBrcode() == null : this.getBrcode().equals(other.getBrcode()))
            && (this.getLastUpdTlrcd() == null ? other.getLastUpdTlrcd() == null : this.getLastUpdTlrcd().equals(other.getLastUpdTlrcd()))
            && (this.getLastUpdTime() == null ? other.getLastUpdTime() == null : this.getLastUpdTime().equals(other.getLastUpdTime()))
            && (this.getLastUpdBrcode() == null ? other.getLastUpdBrcode() == null : this.getLastUpdBrcode().equals(other.getLastUpdBrcode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getInvokPhase() == null) ? 0 : getInvokPhase().hashCode());
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCallerClasspath() == null) ? 0 : getCallerClasspath().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getExt1() == null) ? 0 : getExt1().hashCode());
        result = prime * result + ((getExt2() == null) ? 0 : getExt2().hashCode());
        result = prime * result + ((getExt3() == null) ? 0 : getExt3().hashCode());
        result = prime * result + ((getExt4() == null) ? 0 : getExt4().hashCode());
        result = prime * result + ((getExt5() == null) ? 0 : getExt5().hashCode());
        result = prime * result + ((getTlrcd() == null) ? 0 : getTlrcd().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getBrcode() == null) ? 0 : getBrcode().hashCode());
        result = prime * result + ((getLastUpdTlrcd() == null) ? 0 : getLastUpdTlrcd().hashCode());
        result = prime * result + ((getLastUpdTime() == null) ? 0 : getLastUpdTime().hashCode());
        result = prime * result + ((getLastUpdBrcode() == null) ? 0 : getLastUpdBrcode().hashCode());
        return result;
    }
}