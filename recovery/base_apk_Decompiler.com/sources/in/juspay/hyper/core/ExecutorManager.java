package in.juspay.hyper.core;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001c\u001a\u0006*\u00020\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0006*\u00020\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010\u001f\u001a\u0006*\u00020\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0006*\u00020\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0018\u0010$\u001a\u0006*\u00020\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0018\u0010%\u001a\u0006*\u00020\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0018\u0010&\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\""}, d2 = {"Lin/juspay/hyper/core/ExecutorManager;", "", "<init>", "()V", "V", "Ljava/util/concurrent/Callable;", "p0", "Ljava/util/concurrent/Future;", "doAsync", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "", "Ljava/lang/Runnable;", "p1", "", "postOnMainThread", "(JLjava/lang/Runnable;)V", "runOnBackgroundThread", "(Ljava/lang/Runnable;)V", "runOnLogPusherThread", "runOnLogSessioniserThread", "runOnLogsPool", "runOnMainThread", "runOnRemoteAssetsPool", "runOnSdkTrackerPool", "setLogsThreadId", "(J)V", "setTrackerThreadId", "Ljava/util/concurrent/ExecutorService;", "logPusherPool", "Ljava/util/concurrent/ExecutorService;", "logSessioniserPool", "logsPool", "", "logsThreadId", "Ljava/lang/String;", "remoteAssetsPool", "sdkTrackerPool", "sharedPool", "trackerThreadId"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExecutorManager {
    private static String logsThreadId;
    private static String trackerThreadId;
    public static final ExecutorManager INSTANCE = new ExecutorManager();
    private static final ExecutorService logsPool = Executors.newSingleThreadExecutor();
    private static final ExecutorService remoteAssetsPool = Executors.newSingleThreadExecutor();
    private static final ExecutorService sharedPool = Executors.newFixedThreadPool(4);
    private static final ExecutorService sdkTrackerPool = Executors.newSingleThreadExecutor();
    private static final ExecutorService logSessioniserPool = Executors.newSingleThreadExecutor();
    private static final ExecutorService logPusherPool = Executors.newSingleThreadExecutor();

    private ExecutorManager() {
    }

    @getMagicModuleMeta
    public static final void setLogsThreadId(long p0) {
        logsThreadId = String.valueOf(p0);
    }

    @getMagicModuleMeta
    public static final void setTrackerThreadId(long p0) {
        trackerThreadId = String.valueOf(p0);
    }

    @getMagicModuleMeta
    public static final void postOnMainThread(long p0, Runnable p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        new Handler(Looper.getMainLooper()).postDelayed(p1, p0);
    }

    @getMagicModuleMeta
    public static final void runOnMainThread(Runnable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(p0);
        } else {
            p0.run();
        }
    }

    @getMagicModuleMeta
    public static final void runOnBackgroundThread(Runnable p0) {
        sharedPool.execute(p0);
    }

    @getMagicModuleMeta
    public static final <V> Future<V> doAsync(Callable<V> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Future<V> futureSubmit = sharedPool.submit(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(futureSubmit, "");
        return futureSubmit;
    }

    @getMagicModuleMeta
    public static final void runOnLogsPool(Runnable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) logsThreadId, (Object) String.valueOf(Thread.currentThread().getId()))) {
            p0.run();
        } else {
            logsPool.execute(p0);
        }
    }

    @getMagicModuleMeta
    public static final void runOnSdkTrackerPool(Runnable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) trackerThreadId, (Object) String.valueOf(Thread.currentThread().getId()))) {
            p0.run();
        } else {
            sdkTrackerPool.execute(p0);
        }
    }

    @getMagicModuleMeta
    public static final void runOnLogSessioniserThread(Runnable p0) {
        logSessioniserPool.execute(p0);
    }

    @getMagicModuleMeta
    public static final void runOnLogPusherThread(Runnable p0) {
        logPusherPool.execute(p0);
    }

    public final void runOnRemoteAssetsPool(Runnable p0) {
        remoteAssetsPool.execute(p0);
    }
}
