package com.channelize.apisdk.network.response;


import com.google.gson.annotations.SerializedName;

public class UserBlockStatusResponse implements GenericResponse {


    @SerializedName("loginUserBlockedRecipient")
    private boolean loginUserBlockedRecipient;
    @SerializedName("recipientblockedLoginUser")
    private boolean recipientBlockedLoginUser;

    public boolean isLoginUserBlockedRecipient() {
        return loginUserBlockedRecipient;
    }

    public void setLoginUserBlockedRecipient(boolean loginUserBlockedRecipient) {
        this.loginUserBlockedRecipient = loginUserBlockedRecipient;
    }

    public boolean isRecipientBlockedLoginUser() {
        return recipientBlockedLoginUser;
    }

    public void setRecipientBlockedLoginUser(boolean recipientBlockedLoginUser) {
        this.recipientBlockedLoginUser = recipientBlockedLoginUser;
    }
}
