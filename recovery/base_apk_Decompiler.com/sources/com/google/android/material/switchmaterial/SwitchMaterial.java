package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.DefaultExtractorsFactoryExtensionLoaderConstructorSupplier;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.createExtractors;
import kotlin.readFrames;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {
    private static final int AudioAttributesCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_CompoundButton_Switch;
    private static final int[][] write = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private ColorStateList MediaBrowserCompatItemReceiver;
    private final DefaultExtractorsFactoryExtensionLoaderConstructorSupplier RemoteActionCompatParcelizer;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesCompatParcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.RemoteActionCompatParcelizer = new DefaultExtractorsFactoryExtensionLoaderConstructorSupplier(context2);
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.SwitchMaterial, i, i2, new int[0]);
        this.AudioAttributesImplBaseParcelizer = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayWrite.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.AudioAttributesImplBaseParcelizer && write() == null) {
            setThumbTintList(MediaBrowserCompatItemReceiver());
        }
        if (this.AudioAttributesImplBaseParcelizer && MediaBrowserCompatCustomActionResultReceiver() == null) {
            setTrackTintList(AudioAttributesImplBaseParcelizer());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
        if (z) {
            setThumbTintList(MediaBrowserCompatItemReceiver());
            setTrackTintList(AudioAttributesImplBaseParcelizer());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    private ColorStateList MediaBrowserCompatItemReceiver() {
        if (this.MediaBrowserCompatItemReceiver == null) {
            int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface);
            int iRemoteActionCompatParcelizer2 = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorControlActivated);
            float dimension = getResources().getDimension(calculateNextSearchBytePosition.write.mtrl_switch_thumb_elevation);
            if (this.RemoteActionCompatParcelizer.write()) {
                dimension += checkAndPeekStreamMarker.write(this);
            }
            int iRemoteActionCompatParcelizer3 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, dimension);
            int[][] iArr = write;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = createExtractors.write(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, 1.0f);
            iArr2[1] = iRemoteActionCompatParcelizer3;
            iArr2[2] = createExtractors.write(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, 0.38f);
            iArr2[3] = iRemoteActionCompatParcelizer3;
            this.MediaBrowserCompatItemReceiver = new ColorStateList(iArr, iArr2);
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    private ColorStateList AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            int[][] iArr = write;
            int[] iArr2 = new int[iArr.length];
            int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface);
            int iRemoteActionCompatParcelizer2 = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorControlActivated);
            int iRemoteActionCompatParcelizer3 = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorOnSurface);
            iArr2[0] = createExtractors.write(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, 0.54f);
            iArr2[1] = createExtractors.write(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, 0.32f);
            iArr2[2] = createExtractors.write(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, 0.12f);
            iArr2[3] = createExtractors.write(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, 0.12f);
            this.AudioAttributesImplApi21Parcelizer = new ColorStateList(iArr, iArr2);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }
}
