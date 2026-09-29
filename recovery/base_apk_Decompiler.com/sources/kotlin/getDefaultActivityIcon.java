package kotlin;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class getDefaultActivityIcon {
    private static final ViewGroup.MarginLayoutParams write;
    private LinearLayoutManager read;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        write = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    getDefaultActivityIcon(LinearLayoutManager linearLayoutManager) {
        this.read = linearLayoutManager;
    }

    final boolean AudioAttributesCompatParcelizer() {
        return (!IconCompatParcelizer() || this.read.onPlay() <= 1) && write();
    }

    private boolean IconCompatParcelizer() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int iOnPlay = this.read.onPlay();
        if (iOnPlay == 0) {
            return true;
        }
        boolean z = this.read.MediaBrowserCompatSearchResultReceiver() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iOnPlay, 2);
        for (int i3 = 0; i3 < iOnPlay; i3++) {
            View viewMediaBrowserCompatCustomActionResultReceiver = this.read.MediaBrowserCompatCustomActionResultReceiver(i3);
            if (viewMediaBrowserCompatCustomActionResultReceiver == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewMediaBrowserCompatCustomActionResultReceiver.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = write;
            }
            int[] iArr2 = iArr[i3];
            if (z) {
                top = viewMediaBrowserCompatCustomActionResultReceiver.getLeft();
                i = marginLayoutParams.leftMargin;
            } else {
                top = viewMediaBrowserCompatCustomActionResultReceiver.getTop();
                i = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i;
            int[] iArr3 = iArr[i3];
            if (z) {
                bottom = viewMediaBrowserCompatCustomActionResultReceiver.getRight();
                i2 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewMediaBrowserCompatCustomActionResultReceiver.getBottom();
                i2 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i2;
        }
        Arrays.sort(iArr, new Comparator<int[]>() { // from class: o.getDefaultActivityIcon.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(int[] iArr4, int[] iArr5) {
                return RemoteActionCompatParcelizer(iArr4, iArr5);
            }

            private static int RemoteActionCompatParcelizer(int[] iArr4, int[] iArr5) {
                return iArr4[0] - iArr5[0];
            }
        });
        for (int i4 = 1; i4 < iOnPlay; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        return i6 <= 0 && iArr[iOnPlay - 1][1] >= i5 - i6;
    }

    private boolean write() {
        int iOnPlay = this.read.onPlay();
        for (int i = 0; i < iOnPlay; i++) {
            if (read(this.read.MediaBrowserCompatCustomActionResultReceiver(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean read(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (read(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
