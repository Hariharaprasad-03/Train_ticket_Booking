package com.zsgs.trainticketbooking.payload;

public class SignUpRequest {

    private String userNmae ;
    private String userMobileNumer ;
    private String password ;
    private String confirmPassword ;

    public SignUpRequest() {
    }

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }

    public String getUserMobileNumer() {
        return userMobileNumer;
    }

    public void setUserMobileNumer(String userMobileNumer) {
        this.userMobileNumer = userMobileNumer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
