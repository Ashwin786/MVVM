package com.rk.mvvm.views;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rk.mvvm.R;
import com.rk.mvvm.databinding.ActivityMainBinding;
import com.rk.mvvm.viewmodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    private static TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activitymainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activitymainBinding.setViewModel(new LoginViewModel());
        activitymainBinding.executePendingBindings();
        textview = (TextView)findViewById(R.id.userMsg);
//        ((TextView)findViewById(R.id.userMsg)).setText("Ramesh");
    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null) {
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();

        }
    }

    @BindingAdapter({"userMessage"})
    public static void updateEdit(View view, String message) {
        if (message != null) {
//            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
            textview.setText(message);
        }
    }
}

