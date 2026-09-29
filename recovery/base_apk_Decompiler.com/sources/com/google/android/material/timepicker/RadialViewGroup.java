package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.InvalidTypeIdException;
import kotlin.ReferenceTypeDeserializer;
import kotlin.calculateNextSearchBytePosition;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.maybeOutputFormat;

/* JADX INFO: loaded from: classes5.dex */
public class RadialViewGroup extends ConstraintLayout {
    private int AudioAttributesCompatParcelizer;
    private final Runnable RemoteActionCompatParcelizer;
    private frameSizeBytesByTypeNb read;

    public RadialViewGroup(Context context) {
        this(context, null);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.material_radial_view_group, this);
        InvalidTypeIdException.read(this, RemoteActionCompatParcelizer());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.RadialViewGroup, i, 0);
        this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.RadialViewGroup_materialCircleRadius, 0);
        this.RemoteActionCompatParcelizer = new Runnable() { // from class: o.AudioTagPayloadReader
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.write();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable RemoteActionCompatParcelizer() {
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb();
        this.read = framesizebytesbytypenb;
        framesizebytesbytypenb.write(new maybeOutputFormat(0.5f));
        this.read.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(-1));
        return this.read;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.read.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(InvalidTypeIdException.read());
        }
        IconCompatParcelizer();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.RemoteActionCompatParcelizer);
            handler.post(this.RemoteActionCompatParcelizer);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        write();
    }

    public void write() {
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        referenceTypeDeserializer.RemoteActionCompatParcelizer(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.circle_center && !RemoteActionCompatParcelizer(childAt)) {
                int i2 = (Integer) childAt.getTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            write((List) entry.getValue(), referenceTypeDeserializer, RemoteActionCompatParcelizer(((Integer) entry.getKey()).intValue()));
        }
        referenceTypeDeserializer.write(this);
    }

    private static void write(List<View> list, ReferenceTypeDeserializer referenceTypeDeserializer, int i) {
        Iterator<View> it = list.iterator();
        float size = BitmapDescriptorFactory.HUE_RED;
        while (it.hasNext()) {
            referenceTypeDeserializer.IconCompatParcelizer(it.next().getId(), calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.circle_center, i, size);
            size += 360.0f / list.size();
        }
    }

    public void setRadius(int i) {
        this.AudioAttributesCompatParcelizer = i;
        write();
    }

    public final int read() {
        return this.AudioAttributesCompatParcelizer;
    }

    private int RemoteActionCompatParcelizer(int i) {
        int i2 = this.AudioAttributesCompatParcelizer;
        return i == 2 ? Math.round(i2 * 0.66f) : i2;
    }

    private static boolean RemoteActionCompatParcelizer(View view) {
        return "skip".equals(view.getTag());
    }
}
