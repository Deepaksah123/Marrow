package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.os.Build;
import android.util.TypedValue;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001e¢\u0006\u0004\b\u0018\u0010\u001fR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0011\u0010!\u001a\u00020%8\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010&R\"\u0010'\u001a\u00020\u001e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010\u001f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "<init>", "(Landroid/content/Context;IIIID)V", "(Landroid/content/Context;IIII)V", "", "onMeasure", "(II)V", "read", "()V", "(I)I", "RemoteActionCompatParcelizer", "()I", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "write", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "Lo/r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4;", "setJavaScriptInterface", "(Lo/r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4;)V", "", "(Z)V", "Landroid/content/Context;", "AudioAttributesImplBaseParcelizer", "I", "AudioAttributesImplApi26Parcelizer", "D", "Landroid/graphics/Point;", "Landroid/graphics/Point;", "isFullscreen", "Z", "()Z", "setFullscreen"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CTInAppWebView extends WebView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private final Context IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final Point AudioAttributesImplBaseParcelizer;
    private boolean isFullscreen;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final double MediaBrowserCompatItemReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTInAppWebView(Context context, int i, int i2, int i3, int i4, double d) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.read = i3;
        this.AudioAttributesCompatParcelizer = i4;
        this.MediaBrowserCompatItemReceiver = d;
        this.AudioAttributesImplBaseParcelizer = new Point();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setOverScrollMode(2);
        setBackgroundColor(0);
        getSettings().setTextZoom(100);
        setId(188293);
    }

    /* JADX INFO: renamed from: isFullscreen, reason: from getter */
    public final boolean getIsFullscreen() {
        return this.isFullscreen;
    }

    public final void setFullscreen(boolean z) {
        this.isFullscreen = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CTInAppWebView(Context context, int i, int i2, int i3, int i4) {
        this(context, i, i2, i3, i4, -1.0d);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final void onMeasure(int p0, int p1) {
        super.onMeasure(p0, p1);
        read();
        setMeasuredDimension(this.AudioAttributesImplBaseParcelizer.x, this.AudioAttributesImplBaseParcelizer.y);
    }

    public final void read() {
        int iRemoteActionCompatParcelizer;
        int iAudioAttributesCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        if (i > 0) {
            iRemoteActionCompatParcelizer = read(i);
        } else {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        }
        int i2 = this.write;
        if (i2 > 0) {
            iAudioAttributesCompatParcelizer = read(i2);
        } else {
            double d = this.MediaBrowserCompatItemReceiver;
            iAudioAttributesCompatParcelizer = (d == -1.0d || d <= 0.0d) ? AudioAttributesCompatParcelizer() : (int) (((double) iRemoteActionCompatParcelizer) / d);
        }
        this.AudioAttributesImplBaseParcelizer.x = iRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer.y = iAudioAttributesCompatParcelizer;
    }

    private final int read(int p0) {
        return (int) TypedValue.applyDimension(1, p0, getResources().getDisplayMetrics());
    }

    private final int RemoteActionCompatParcelizer() {
        if (Build.VERSION.SDK_INT >= 30) {
            return AudioAttributesImplApi21Parcelizer();
        }
        return MediaBrowserCompatItemReceiver();
    }

    private final int AudioAttributesCompatParcelizer() {
        if (Build.VERSION.SDK_INT >= 30) {
            return write();
        }
        return IconCompatParcelizer();
    }

    private final int AudioAttributesImplApi21Parcelizer() {
        int iWidth;
        Object systemService = this.IconCompatParcelizer.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            return MediaBrowserCompatItemReceiver();
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(currentWindowMetrics, "");
        if (this.isFullscreen) {
            iWidth = currentWindowMetrics.getBounds().width();
        } else {
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(insetsIgnoringVisibility, "");
            iWidth = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
        }
        return (int) ((iWidth * this.read) / 100.0f);
    }

    private final int write() {
        int iHeight;
        Object systemService = this.IconCompatParcelizer.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null) {
            return IconCompatParcelizer();
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(currentWindowMetrics, "");
        if (this.isFullscreen) {
            iHeight = currentWindowMetrics.getBounds().height();
        } else {
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(insetsIgnoringVisibility, "");
            iHeight = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
        }
        return (int) ((iHeight * this.AudioAttributesCompatParcelizer) / 100.0f);
    }

    private final int MediaBrowserCompatItemReceiver() {
        return (int) ((getResources().getDisplayMetrics().widthPixels * this.read) / 100.0f);
    }

    private final int IconCompatParcelizer() {
        return (int) ((getResources().getDisplayMetrics().heightPixels * this.AudioAttributesCompatParcelizer) / 100.0f);
    }

    public final void setJavaScriptInterface(r8lambdaY6x1WIS9rGRZELX3_b0HE2QA1H4 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        addJavascriptInterface(p0, "CleverTap");
    }

    public final void write(boolean p0) {
        removeAllViews();
        destroyDrawingCache();
        loadUrl("about:blank");
        if (p0) {
            removeJavascriptInterface("CleverTap");
        }
        clearHistory();
        destroy();
    }
}
