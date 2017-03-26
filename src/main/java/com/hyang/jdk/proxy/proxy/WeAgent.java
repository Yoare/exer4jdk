package com.hyang.jdk.proxy.proxy;

import com.hyang.jdk.proxy.iface.Sell;

/**
 * Created by hyang on 2017/3/26.
 */
public class WeAgent implements Sell {

    private Sell vendor;

    @Override
    public void doSell() {
        //筛选目标用户
        if(isStudent()) {
            vendor.doSell();
        }
    }

    @Override
    public void doAd() {

    }

    private boolean isStudent() {
        return true;
    }
}
