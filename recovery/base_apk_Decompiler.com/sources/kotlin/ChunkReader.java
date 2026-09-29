package kotlin;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class ChunkReader extends advanceCurrentChunk {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.advanceCurrentChunk
    public final void AudioAttributesCompatParcelizer(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fRemoteActionCompatParcelizer;
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectF = read(tabLayout, view);
        if (f < 0.5f) {
            fRemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, f);
        } else {
            fRemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) rectF.left, drawable.getBounds().top, (int) rectF.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fRemoteActionCompatParcelizer * 255.0f));
    }
}
