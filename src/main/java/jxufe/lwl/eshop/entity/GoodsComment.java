package jxufe.lwl.eshop.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * goods_comment
 * @author 
 */
public class GoodsComment implements Serializable {
    /**
     * 评论id
     */
    private Integer scommId;

    /**
     * 评论的商品ID
     */
    private Integer goodisId;

    /**
     * 评论内容
     */
    private String scommContent;

    /**
     * 会员id
     */
    private Integer scommMemberid;

    /**
     * 会员名称
     */
    private String scommMembername;

    /**
     * 会员头像
     */
    private String scommMemberavatar;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 评论时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date scommTime;

    private static final long serialVersionUID = 1L;

    public Integer getScommId() {
        return scommId;
    }

    public void setScommId(Integer scommId) {
        this.scommId = scommId;
    }

    public Integer getGoodisId() {
        return goodisId;
    }

    public void setGoodisId(Integer goodisId) {
        this.goodisId = goodisId;
    }

    public String getScommContent() {
        return scommContent;
    }

    public void setScommContent(String scommContent) {
        this.scommContent = scommContent;
    }

    public Integer getScommMemberid() {
        return scommMemberid;
    }

    public void setScommMemberid(Integer scommMemberid) {
        this.scommMemberid = scommMemberid;
    }

    public String getScommMembername() {
        return scommMembername;
    }

    public void setScommMembername(String scommMembername) {
        this.scommMembername = scommMembername;
    }

    public String getScommMemberavatar() {
        return scommMemberavatar;
    }

    public void setScommMemberavatar(String scommMemberavatar) {
        this.scommMemberavatar = scommMemberavatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getScommTime() {
        return scommTime;
    }

    public void setScommTime(Date scommTime) {
        this.scommTime = scommTime;
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
        GoodsComment other = (GoodsComment) that;
        return (this.getScommId() == null ? other.getScommId() == null : this.getScommId().equals(other.getScommId()))
            && (this.getGoodisId() == null ? other.getGoodisId() == null : this.getGoodisId().equals(other.getGoodisId()))
            && (this.getScommContent() == null ? other.getScommContent() == null : this.getScommContent().equals(other.getScommContent()))
            && (this.getScommMemberid() == null ? other.getScommMemberid() == null : this.getScommMemberid().equals(other.getScommMemberid()))
            && (this.getScommMembername() == null ? other.getScommMembername() == null : this.getScommMembername().equals(other.getScommMembername()))
            && (this.getScommMemberavatar() == null ? other.getScommMemberavatar() == null : this.getScommMemberavatar().equals(other.getScommMemberavatar()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getScommTime() == null ? other.getScommTime() == null : this.getScommTime().equals(other.getScommTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScommId() == null) ? 0 : getScommId().hashCode());
        result = prime * result + ((getGoodisId() == null) ? 0 : getGoodisId().hashCode());
        result = prime * result + ((getScommContent() == null) ? 0 : getScommContent().hashCode());
        result = prime * result + ((getScommMemberid() == null) ? 0 : getScommMemberid().hashCode());
        result = prime * result + ((getScommMembername() == null) ? 0 : getScommMembername().hashCode());
        result = prime * result + ((getScommMemberavatar() == null) ? 0 : getScommMemberavatar().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getScommTime() == null) ? 0 : getScommTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scommId=").append(scommId);
        sb.append(", goodisId=").append(goodisId);
        sb.append(", scommContent=").append(scommContent);
        sb.append(", scommMemberid=").append(scommMemberid);
        sb.append(", scommMembername=").append(scommMembername);
        sb.append(", scommMemberavatar=").append(scommMemberavatar);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", scommTime=").append(scommTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}