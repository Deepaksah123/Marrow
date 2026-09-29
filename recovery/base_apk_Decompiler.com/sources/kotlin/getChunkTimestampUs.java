package kotlin;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class getChunkTimestampUs extends advanceCurrentChunk {
    private static float IconCompatParcelizer(float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    private static float AudioAttributesCompatParcelizer(float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.advanceCurrentChunk
    public final void AudioAttributesCompatParcelizer(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fIconCompatParcelizer;
        float fAudioAttributesCompatParcelizer;
        RectF rectF = read(tabLayout, view);
        RectF rectF2 = read(tabLayout, view2);
        if (rectF.left < rectF2.left) {
            fIconCompatParcelizer = AudioAttributesCompatParcelizer(f);
            fAudioAttributesCompatParcelizer = IconCompatParcelizer(f);
        } else {
            fIconCompatParcelizer = IconCompatParcelizer(f);
            fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f);
        }
        drawable.setBounds(BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer((int) rectF.left, (int) rectF2.left, fIconCompatParcelizer), drawable.getBounds().top, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer((int) rectF.right, (int) rectF2.right, fAudioAttributesCompatParcelizer), drawable.getBounds().bottom);
    }
}
