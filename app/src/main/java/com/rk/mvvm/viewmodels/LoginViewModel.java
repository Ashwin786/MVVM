package com.rk.mvvm.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;
import android.util.Patterns;

import com.rk.mvvm.BR;
import com.rk.mvvm.models.User;

/**
 * Created by user1 on 25/6/19.
 */

public class LoginViewModel extends BaseObservable {
    private User user;


    private String successMessage = "Login was successful";
    private String errorMessage = "Email or Password not valid";

    @Bindable
    private String toastMessage = null;
    private String email =null;

    @Bindable
    private String userName = null;
    @Bindable
    private String userCall = null;

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }
    public void setUserEmail(String email) {
        this.email=email;
        user.setEmail(email);
//        this.userName =email;
//        user.setMsg(email);
//        notifyPropertyChanged(BR.userEmail);
        notifyPropertyChanged(BR.userName);
    }

    public void setUserName(String msg) {
        this.userName =msg;
        user.setMsg(msg);
//        notifyPropertyChanged(BR.userName);
    }
    @Bindable
    public String getUserEmail() {
        return user.getEmail();
    }
    @Bindable
    public String getUserPassword() {
        return user.getPassword();
    }

    @Bindable
    public String getUserName(){
        return user.getMsg();
    }

    public void setUserPassword(String password) {
        user.setPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

    public LoginViewModel() {
        user = new User("","");
    }
    public void onLoginClicked() {
        if (isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getUserEmail()) && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() && getUserPassword().length() > 5;
    }

    public String getUserCall() {
        return userCall;
    }

    public void setUserCall(String userCall) {
        this.userCall = userCall;
    }
}
