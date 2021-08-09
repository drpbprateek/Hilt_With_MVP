
package com.example.daggermvptry.base;

public interface IPresenter {

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void onLogoutReceived(int reason, String msg);

    void onEventReceived(String eventSource, String event);
}
