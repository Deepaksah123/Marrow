package in.juspay.hypersdk.mystique;

import android.widget.AbsListView;
import in.juspay.hypersdk.core.DuiCallback;

/* JADX INFO: loaded from: classes5.dex */
public class OnScroll implements AbsListView.OnScrollListener {
    private final DuiCallback duiCallback;
    private String scrollCallback;
    private String scrollChangeCallback;

    public OnScroll(DuiCallback duiCallback) {
        this.duiCallback = duiCallback;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        DuiCallback duiCallback = this.duiCallback;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(this.scrollCallback);
        sb.append("','");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append("');");
        duiCallback.addJsToWebView(sb.toString());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        DuiCallback duiCallback = this.duiCallback;
        StringBuilder sb = new StringBuilder("window.callUICallback('");
        sb.append(this.scrollChangeCallback);
        sb.append("',");
        sb.append(i);
        sb.append(");");
        duiCallback.addJsToWebView(sb.toString());
    }

    public void setScrollCallback(String str) {
        this.scrollCallback = str;
    }

    public void setScrollChangeCallback(String str) {
        this.scrollChangeCallback = str;
    }
}
