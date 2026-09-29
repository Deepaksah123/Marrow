package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.PrivateMaxEntriesMapKeySet;
import kotlin.computeNext;
import kotlin.getDefaultImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {
    private float AudioAttributesCompatParcelizer;
    private View AudioAttributesImplApi21Parcelizer;
    private computeNext AudioAttributesImplApi26Parcelizer;
    private IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private float RemoteActionCompatParcelizer;
    private List<getDefaultImpl> read;
    private boolean write;

    interface IconCompatParcelizer {
        void write(List<getDefaultImpl> list, computeNext computenext, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = Collections.emptyList();
        this.AudioAttributesImplApi26Parcelizer = computeNext.IconCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = 0;
        this.RemoteActionCompatParcelizer = 0.0533f;
        this.AudioAttributesCompatParcelizer = 0.08f;
        this.IconCompatParcelizer = true;
        this.write = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.AudioAttributesImplBaseParcelizer = canvasSubtitleOutput;
        this.AudioAttributesImplApi21Parcelizer = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.MediaBrowserCompatCustomActionResultReceiver = 1;
    }

    public final void setCues(List<getDefaultImpl> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.read = list;
        IconCompatParcelizer();
    }

    public final void setViewType(int i) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == i) {
            return;
        }
        if (i == 1) {
            IconCompatParcelizer(new CanvasSubtitleOutput(getContext()));
        } else if (i == 2) {
            IconCompatParcelizer(new WebViewSubtitleOutput(getContext()));
        } else {
            throw new IllegalArgumentException();
        }
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    private <T extends View & IconCompatParcelizer> void IconCompatParcelizer(T t) {
        removeView(this.AudioAttributesImplApi21Parcelizer);
        View view = this.AudioAttributesImplApi21Parcelizer;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).AudioAttributesCompatParcelizer();
        }
        this.AudioAttributesImplApi21Parcelizer = t;
        this.AudioAttributesImplBaseParcelizer = t;
        addView(t);
    }

    public final void setFixedTextSize(int i, float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        read(2, TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    public final void setUserDefaultTextSize() {
        setFractionalTextSize(RemoteActionCompatParcelizer() * 0.0533f);
    }

    public final void setFractionalTextSize(float f) {
        setFractionalTextSize(f, false);
    }

    public final void setFractionalTextSize(float f, boolean z) {
        read(z ? 1 : 0, f);
    }

    private void read(int i, float f) {
        this.MediaBrowserCompatItemReceiver = i;
        this.RemoteActionCompatParcelizer = f;
        IconCompatParcelizer();
    }

    public final void setApplyEmbeddedStyles(boolean z) {
        this.IconCompatParcelizer = z;
        IconCompatParcelizer();
    }

    public final void setApplyEmbeddedFontSizes(boolean z) {
        this.write = z;
        IconCompatParcelizer();
    }

    public final void setUserDefaultStyle() {
        setStyle(AudioAttributesCompatParcelizer());
    }

    public final void setStyle(computeNext computenext) {
        this.AudioAttributesImplApi26Parcelizer = computenext;
        IconCompatParcelizer();
    }

    public final void setBottomPaddingFraction(float f) {
        this.AudioAttributesCompatParcelizer = f;
        IconCompatParcelizer();
    }

    private float RemoteActionCompatParcelizer() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private computeNext AudioAttributesCompatParcelizer() {
        if (isInEditMode()) {
            return computeNext.IconCompatParcelizer;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            return computeNext.RemoteActionCompatParcelizer(captioningManager.getUserStyle());
        }
        return computeNext.IconCompatParcelizer;
    }

    private void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.write(write(), this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesCompatParcelizer);
    }

    private List<getDefaultImpl> write() {
        if (this.IconCompatParcelizer && this.write) {
            return this.read;
        }
        ArrayList arrayList = new ArrayList(this.read.size());
        for (int i = 0; i < this.read.size(); i++) {
            arrayList.add(RemoteActionCompatParcelizer(this.read.get(i)));
        }
        return arrayList;
    }

    private getDefaultImpl RemoteActionCompatParcelizer(getDefaultImpl getdefaultimpl) {
        getDefaultImpl.write writeVarAudioAttributesCompatParcelizer = getdefaultimpl.AudioAttributesCompatParcelizer();
        if (!this.IconCompatParcelizer) {
            PrivateMaxEntriesMapKeySet.RemoteActionCompatParcelizer(writeVarAudioAttributesCompatParcelizer);
        } else if (!this.write) {
            PrivateMaxEntriesMapKeySet.AudioAttributesCompatParcelizer(writeVarAudioAttributesCompatParcelizer);
        }
        return writeVarAudioAttributesCompatParcelizer.write();
    }
}
