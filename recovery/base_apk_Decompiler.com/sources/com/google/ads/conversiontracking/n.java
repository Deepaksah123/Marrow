package com.google.ads.conversiontracking;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class n implements ServiceConnection {
    boolean a = false;
    private final BlockingQueue<IBinder> b = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    public IBinder a() throws InterruptedException {
        if (this.a) {
            throw new IllegalStateException();
        }
        this.a = true;
        return this.b.take();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.b.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }
}
