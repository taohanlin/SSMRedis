package org.thl.entity;

import java.util.Date;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:08
 */
public class Log {
    private Integer id;

    private String operator;

    private String operate;

    private String logDescribe;

    private String ip;

    private Date logDate;

    public Log(Integer id, String operator, String operate, String logDescribe, String ip, Date logDate) {
        this.id = id;
        this.operator = operator;
        this.operate = operate;
        this.logDescribe = logDescribe;
        this.ip = ip;
        this.logDate = logDate;
    }

    public Integer getId() {
        return id;
    }

    public String getOperator() {
        return operator;
    }

    public String getOperate() {
        return operate;
    }

    public String getLogDescribe() {
        return logDescribe;
    }

    public String getIp() {
        return ip;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public void setLogDescribe(String logDescribe) {
        this.logDescribe = logDescribe;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", operator='" + operator + '\'' +
                ", operate='" + operate + '\'' +
                ", logDescribe='" + logDescribe + '\'' +
                ", ip='" + ip + '\'' +
                ", logDate=" + logDate +
                '}';
    }
}
