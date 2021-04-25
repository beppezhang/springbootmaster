package com.beppe.entity.DB1;

import java.util.Date;

public class Customer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.phone_num
     *
     * @mbggenerated
     */
    private String phoneNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.coin
     *
     * @mbggenerated
     */
    private Integer coin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.id
     *
     * @return the value of customer.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.id
     *
     * @param id the value for customer.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.name
     *
     * @return the value of customer.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.name
     *
     * @param name the value for customer.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.phone_num
     *
     * @return the value of customer.phone_num
     *
     * @mbggenerated
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.phone_num
     *
     * @param phoneNum the value for customer.phone_num
     *
     * @mbggenerated
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.create_time
     *
     * @return the value of customer.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.create_time
     *
     * @param createTime the value for customer.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.coin
     *
     * @return the value of customer.coin
     *
     * @mbggenerated
     */
    public Integer getCoin() {
        return coin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.coin
     *
     * @param coin the value for customer.coin
     *
     * @mbggenerated
     */
    public void setCoin(Integer coin) {
        this.coin = coin;
    }
}