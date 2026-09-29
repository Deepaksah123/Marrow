package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.calculateNextSearchBytePosition;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes3.dex */
public class TabItem extends View {
    public final CharSequence IconCompatParcelizer;
    public final Drawable RemoteActionCompatParcelizer;
    public final int write;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTitle settitleIconCompatParcelizer = setTitle.IconCompatParcelizer(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.TabItem);
        this.IconCompatParcelizer = settitleIconCompatParcelizer.AudioAttributesImplBaseParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TabItem_android_text);
        this.RemoteActionCompatParcelizer = settitleIconCompatParcelizer.IconCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.TabItem_android_icon);
        this.write = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(calculateNextSearchBytePosition.MediaMetadataCompat.TabItem_android_layout, 0);
        settitleIconCompatParcelizer.write();
    }
}
