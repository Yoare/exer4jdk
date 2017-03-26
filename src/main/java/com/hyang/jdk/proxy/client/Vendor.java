package com.hyang.jdk.proxy.client;

import com.hyang.jdk.proxy.iface.Sell;

/**
 * Created by hyang on 2017/3/26.
 */
public class Vendor implements Sell {
    @Override
    public void doAd() {
        System.out.println("do ad in vendor");
    }

    @Override
    public void doSell() {
        System.out.println("do sell in vendor");
    }
}
