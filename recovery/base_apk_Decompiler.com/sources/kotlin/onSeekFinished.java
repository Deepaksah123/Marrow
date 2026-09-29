package kotlin;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes5.dex */
public final class onSeekFinished {
    public static void AudioAttributesCompatParcelizer(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static void IconCompatParcelizer(BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeeker, View view, FrameLayout frameLayout) {
        write(binarySearchSeekerTimestampSeeker, view, frameLayout);
        if (binarySearchSeekerTimestampSeeker.write() != null) {
            binarySearchSeekerTimestampSeeker.write().setForeground(binarySearchSeekerTimestampSeeker);
        } else {
            view.getOverlay().add(binarySearchSeekerTimestampSeeker);
        }
    }

    public static void RemoteActionCompatParcelizer(BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeeker, View view) {
        if (binarySearchSeekerTimestampSeeker == null) {
            return;
        }
        if (binarySearchSeekerTimestampSeeker.write() != null) {
            binarySearchSeekerTimestampSeeker.write().setForeground(null);
        } else {
            view.getOverlay().remove(binarySearchSeekerTimestampSeeker);
        }
    }

    public static void write(BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeeker, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        binarySearchSeekerTimestampSeeker.setBounds(rect);
        binarySearchSeekerTimestampSeeker.write(view, frameLayout);
    }

    public static ParcelableSparseArray IconCompatParcelizer(SparseArray<BinarySearchSeekerTimestampSeeker> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeekerValueAt = sparseArray.valueAt(i);
            parcelableSparseArray.put(iKeyAt, binarySearchSeekerTimestampSeekerValueAt != null ? binarySearchSeekerTimestampSeekerValueAt.IconCompatParcelizer() : null);
        }
        return parcelableSparseArray;
    }

    public static SparseArray<BinarySearchSeekerTimestampSeeker> AudioAttributesCompatParcelizer(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BinarySearchSeekerTimestampSeeker> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int iKeyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            sparseArray.put(iKeyAt, state != null ? BinarySearchSeekerTimestampSeeker.write(context, state) : null);
        }
        return sparseArray;
    }
}
