package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getMetadataCopyWithAppendedEntriesFrom;
import kotlin.peekId3Data;
import kotlin.setFromComment;

/* JADX INFO: loaded from: classes3.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int RemoteActionCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_CircularProgressIndicator;

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    final /* synthetic */ getMetadataCopyWithAppendedEntriesFrom RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        return AudioAttributesCompatParcelizer(context, attributeSet);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, RemoteActionCompatParcelizer);
        IconCompatParcelizer();
    }

    private static CircularProgressIndicatorSpec AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    private void IconCompatParcelizer() {
        setIndeterminateDrawable(peekId3Data.AudioAttributesCompatParcelizer(getContext(), (CircularProgressIndicatorSpec) this.read));
        setProgressDrawable(setFromComment.read(getContext(), (CircularProgressIndicatorSpec) this.read));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.read).write();
    }

    public void setIndicatorInset(int i) {
        if (((CircularProgressIndicatorSpec) this.read).MediaBrowserCompatItemReceiver != i) {
            ((CircularProgressIndicatorSpec) this.read).MediaBrowserCompatItemReceiver = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, RemoteActionCompatParcelizer() << 1);
        if (((CircularProgressIndicatorSpec) this.read).AudioAttributesImplApi26Parcelizer != iMax) {
            ((CircularProgressIndicatorSpec) this.read).AudioAttributesImplApi26Parcelizer = iMax;
            ((CircularProgressIndicatorSpec) this.read).write();
            invalidate();
        }
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.read).AudioAttributesImplBaseParcelizer = i;
        invalidate();
    }
}
