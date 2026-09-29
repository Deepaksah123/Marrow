package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import kotlin.InvalidTypeIdException;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    private final Rect AudioAttributesCompatParcelizer;
    private TypedValue AudioAttributesImplBaseParcelizer;
    private TypedValue IconCompatParcelizer;
    private TypedValue MediaBrowserCompatCustomActionResultReceiver;
    private TypedValue MediaBrowserCompatItemReceiver;
    private read RemoteActionCompatParcelizer;
    private TypedValue read;
    private TypedValue write;

    public interface read {
        void IconCompatParcelizer();

        void read();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AudioAttributesCompatParcelizer = new Rect();
    }

    public void setAttachListener(read readVar) {
        this.RemoteActionCompatParcelizer = readVar;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.AudioAttributesCompatParcelizer.set(i, i2, i3, i4);
        if (InvalidTypeIdException.onSeekTo(this)) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public TypedValue read() {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new TypedValue();
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    public TypedValue MediaBrowserCompatCustomActionResultReceiver() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = new TypedValue();
        }
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public TypedValue AudioAttributesCompatParcelizer() {
        if (this.read == null) {
            this.read = new TypedValue();
        }
        return this.read;
    }

    public TypedValue write() {
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new TypedValue();
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    public TypedValue IconCompatParcelizer() {
        if (this.write == null) {
            this.write = new TypedValue();
        }
        return this.write;
    }

    public TypedValue RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new TypedValue();
        }
        return this.IconCompatParcelizer;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            readVar.IconCompatParcelizer();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        read readVar = this.RemoteActionCompatParcelizer;
        if (readVar != null) {
            readVar.read();
        }
    }
}
