package org.thl.entity;

import java.util.Date;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:08
 */
public class Info {
    private Integer id;

    private Integer userId;

    private String account;

    private Integer gameId;

    private String gameName;

    private Double proportion;

    private Date proportionUpdateTime;

    public Info(Integer id, Integer userId, String account, Integer gameId, String gameName, Double proportion, Date proportionUpdateTime) {
        this.id = id;
        this.userId = userId;
        this.account = account;
        this.gameId = gameId;
        this.gameName = gameName;
        this.proportion = proportion;
        this.proportionUpdateTime = proportionUpdateTime;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAccount() {
        return account;
    }

    public Integer getGameId() {
        return gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public Double getProportion() {
        return proportion;
    }

    public Date getProportionUpdateTime() {
        return proportionUpdateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public void setProportionUpdateTime(Date proportionUpdateTime) {
        this.proportionUpdateTime = proportionUpdateTime;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", userId=" + userId +
                ", account='" + account + '\'' +
                ", gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", proportion=" + proportion +
                ", proportionUpdateTime=" + proportionUpdateTime +
                '}';
    }
}
