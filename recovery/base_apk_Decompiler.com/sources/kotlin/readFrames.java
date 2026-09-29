package kotlin;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
public final class readFrames {
    private static final int[] write = {R.attr.theme, calculateNextSearchBytePosition.IconCompatParcelizer.theme};
    private static final int[] IconCompatParcelizer = {calculateNextSearchBytePosition.IconCompatParcelizer.materialThemeOverlay};

    public static Context IconCompatParcelizer(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3 = read(context, attributeSet, i, i2);
        boolean z = (context instanceof initializeViewTreeOwners) && ((initializeViewTreeOwners) context).IconCompatParcelizer() == i3;
        if (i3 == 0 || z) {
            return context;
        }
        initializeViewTreeOwners initializeviewtreeowners = new initializeViewTreeOwners(context, i3);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, attributeSet);
        if (iRemoteActionCompatParcelizer != 0) {
            initializeviewtreeowners.getTheme().applyStyle(iRemoteActionCompatParcelizer, true);
        }
        return initializeviewtreeowners;
    }

    private static int RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, write);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int read(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IconCompatParcelizer, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
