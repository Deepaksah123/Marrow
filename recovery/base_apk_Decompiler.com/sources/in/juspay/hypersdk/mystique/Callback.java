package in.juspay.hypersdk.mystique;

/* JADX INFO: loaded from: classes4.dex */
public interface Callback {
    void onError(String str, String str2);

    void onException(String str, String str2, Throwable th);

    void onRenderProcessGone(boolean z);

    void webViewLoaded(Exception exc);
}
