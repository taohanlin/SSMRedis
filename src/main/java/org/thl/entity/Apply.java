package org.thl.entity;

import java.util.Date;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:07
 */
public class Apply {
    private Integer id;

    private Double amount;

    private Integer userId;

    private String account;

    private Date applyTime;

    private Date dealtTime;

    private Integer status;

    public Apply(Integer id, Double amount, Integer userId, String account, Date applyTime, Date dealtTime, Integer status) {
        this.id = id;
        this.amount = amount;
        this.userId = userId;
        this.account = account;
        this.applyTime = applyTime;
        this.dealtTime = dealtTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAccount() {
        return account;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public Date getDealtTime() {
        return dealtTime;
    }

    public Integer getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "id=" + id +
                ", amount=" + amount +
                ", userId=" + userId +
                ", account='" + account + '\'' +
                ", applyTime=" + applyTime +
                ", dealtTime=" + dealtTime +
                ", status=" + status +
                '}';
    }
}
