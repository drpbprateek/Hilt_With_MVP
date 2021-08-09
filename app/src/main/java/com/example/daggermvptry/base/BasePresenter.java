package com.example.daggermvptry.base;

import androidx.annotation.NonNull;


public abstract class BasePresenter<V extends BaseView> implements IPresenter {

    protected V mView;

    public BasePresenter(@NonNull V view) {
        mView = view;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onEventReceived(String eventSource, String event) {

    }

    @Override
    public void onLogoutReceived(int reason, String msg) {

    }

    public V getView() {
        return mView;
    }

    protected String getString(int resId) {
        return mView.getStr(resId);
    }

}
