package com.neusoft.exam.pojo;

import java.util.List;

public class UserTable {
    private Integer userId;

    private String userPassword;

    private String userName;

    private Integer userType;

    private String userPhone;

    private String userEmail;

    private String userAddress;
    
    //Ò»¶Ô¶à
    private List<ExamTable> examTables;
    
    public List<ExamTable> getExamTables() {
		return examTables;
	}

	public void setExamTables(List<ExamTable> examTables) {
		this.examTables = examTables;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

	@Override
	public String toString() {
		return "UserTable [userId=" + userId + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userType=" + userType
				+ ", userPhone=" + userPhone + ", userEmail=" + userEmail
				+ ", userAddress=" + userAddress + ", examTables=" + examTables
				+ "]";
	}
    
}