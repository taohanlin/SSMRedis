package org.thl.entity;

import java.util.Date;

/**
 * @author: ${TaoHanLin}  Date: 2016/7/21 0021 Time: 18:08
 */
public class Income {
    private Integer id;

    private Integer gameId;

    private String gameName;

    private Integer gameServer;

    private String playerAccount;

    private Double playerRecharge;

    private Double proportion;

    private String proportionPercent;

    private Double income;

    private Date incomeTime;

    private Integer userId;

    private String account;

    public Income(Integer id, Integer gameId, String gameName, Integer gameServer, String playerAccount, Double playerRecharge, Double proportion, String proportionPercent, Double income, Date incomeTime, Integer userId, String account) {
        this.id = id;
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameServer = gameServer;
        this.playerAccount = playerAccount;
        this.playerRecharge = playerRecharge;
        this.proportion = proportion;
        this.proportionPercent = proportionPercent;
        this.income = income;
        this.incomeTime = incomeTime;
        this.userId = userId;
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public Integer getGameId() {
        return gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public Integer getGameServer() {
        return gameServer;
    }

    public String getPlayerAccount() {
        return playerAccount;
    }

    public Double getPlayerRecharge() {
        return playerRecharge;
    }

    public Double getProportion() {
        return proportion;
    }

    public String getProportionPercent() {
        return proportionPercent;
    }

    public Double getIncome() {
        return income;
    }

    public Date getIncomeTime() {
        return incomeTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAccount() {
        return account;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGameServer(Integer gameServer) {
        this.gameServer = gameServer;
    }

    public void setPlayerAccount(String playerAccount) {
        this.playerAccount = playerAccount;
    }

    public void setPlayerRecharge(Double playerRecharge) {
        this.playerRecharge = playerRecharge;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public void setProportionPercent(String proportionPercent) {
        this.proportionPercent = proportionPercent;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameServer=" + gameServer +
                ", playerAccount='" + playerAccount + '\'' +
                ", playerRecharge=" + playerRecharge +
                ", proportion=" + proportion +
                ", proportionPercent='" + proportionPercent + '\'' +
                ", income=" + income +
                ", incomeTime=" + incomeTime +
                ", userId=" + userId +
                ", account='" + account + '\'' +
                '}';
    }
}
