package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Id3Peeker;
import kotlin.InvalidTypeIdException;
import kotlin.PositionHolder;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getMetadataCopyWithAppendedEntriesFrom;
import kotlin.peekId3Data;
import kotlin.setFromComment;

/* JADX INFO: loaded from: classes5.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int IconCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_LinearProgressIndicator;

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    final /* synthetic */ getMetadataCopyWithAppendedEntriesFrom RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        return AudioAttributesCompatParcelizer(context, attributeSet);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, IconCompatParcelizer);
        IconCompatParcelizer();
    }

    private static LinearProgressIndicatorSpec AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.read;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) this.read).AudioAttributesImplApi21Parcelizer != 1 && ((InvalidTypeIdException.MediaBrowserCompatMediaItem(this) != 1 || ((LinearProgressIndicatorSpec) this.read).AudioAttributesImplApi21Parcelizer != 2) && (InvalidTypeIdException.MediaBrowserCompatMediaItem(this) != 0 || ((LinearProgressIndicatorSpec) this.read).AudioAttributesImplApi21Parcelizer != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.AudioAttributesImplApi26Parcelizer = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        peekId3Data<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        setFromComment<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    private void IconCompatParcelizer() {
        setIndeterminateDrawable(peekId3Data.AudioAttributesCompatParcelizer(getContext(), (LinearProgressIndicatorSpec) this.read));
        setProgressDrawable(setFromComment.read(getContext(), (LinearProgressIndicatorSpec) this.read));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.read).write();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.read).write();
        invalidate();
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.read).AudioAttributesImplBaseParcelizer == i) {
            return;
        }
        if (read() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) this.read).AudioAttributesImplBaseParcelizer = i;
        ((LinearProgressIndicatorSpec) this.read).write();
        if (i == 0) {
            getIndeterminateDrawable().read(new Id3Peeker((LinearProgressIndicatorSpec) this.read));
        } else {
            getIndeterminateDrawable().read(new PositionHolder(getContext(), (LinearProgressIndicatorSpec) this.read));
        }
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((LinearProgressIndicatorSpec) this.read).AudioAttributesImplApi21Parcelizer = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.read;
        boolean z = true;
        if (i != 1 && ((InvalidTypeIdException.MediaBrowserCompatMediaItem(this) != 1 || ((LinearProgressIndicatorSpec) this.read).AudioAttributesImplApi21Parcelizer != 2) && (InvalidTypeIdException.MediaBrowserCompatMediaItem(this) != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.AudioAttributesImplApi26Parcelizer = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
        if (this.read != 0 && ((LinearProgressIndicatorSpec) this.read).AudioAttributesImplBaseParcelizer == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }
}
