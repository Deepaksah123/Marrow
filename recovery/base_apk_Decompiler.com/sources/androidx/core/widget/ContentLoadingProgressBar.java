package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    private final Runnable AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private boolean RemoteActionCompatParcelizer;
    private boolean read;
    private final Runnable write;

    public final /* synthetic */ void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = -1L;
        setVisibility(8);
    }

    public final /* synthetic */ void write() {
        this.RemoteActionCompatParcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = System.currentTimeMillis();
        setVisibility(0);
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.MediaBrowserCompatCustomActionResultReceiver = -1L;
        this.IconCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = false;
        this.read = false;
        this.AudioAttributesCompatParcelizer = new Runnable() { // from class: o.getAnnotations
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
        };
        this.write = new Runnable() { // from class: o._fields
            @Override // java.lang.Runnable
            public final void run() {
                this.write.write();
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IconCompatParcelizer();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        removeCallbacks(this.AudioAttributesCompatParcelizer);
        removeCallbacks(this.write);
    }
}
