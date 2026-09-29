package kotlin;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public class advanceCurrentChunk {
    private static RectF write(TabLayout.TabView tabView) {
        int iRemoteActionCompatParcelizer = tabView.RemoteActionCompatParcelizer();
        int iAudioAttributesCompatParcelizer = tabView.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = (int) checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(tabView.getContext(), 24);
        if (iRemoteActionCompatParcelizer < iAudioAttributesCompatParcelizer2) {
            iRemoteActionCompatParcelizer = iAudioAttributesCompatParcelizer2;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i = iRemoteActionCompatParcelizer / 2;
        return new RectF(left - i, top - (iAudioAttributesCompatParcelizer / 2), i + left, top + (left / 2));
    }

    static RectF read(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.RemoteActionCompatParcelizer() && (view instanceof TabLayout.TabView)) {
            return write((TabLayout.TabView) view);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void AudioAttributesCompatParcelizer(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectF = read(tabLayout, view);
        drawable.setBounds((int) rectF.left, drawable.getBounds().top, (int) rectF.right, drawable.getBounds().bottom);
    }

    public void AudioAttributesCompatParcelizer(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectF = read(tabLayout, view);
        RectF rectF2 = read(tabLayout, view2);
        drawable.setBounds(BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer((int) rectF.left, (int) rectF2.left, f), drawable.getBounds().top, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer((int) rectF.right, (int) rectF2.right, f), drawable.getBounds().bottom);
    }
}
