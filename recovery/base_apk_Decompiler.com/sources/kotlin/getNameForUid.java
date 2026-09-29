package kotlin;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class getNameForUid extends ViewPager2.write {
    private ViewPager2.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private final LinearLayoutManager write;

    @Override // androidx.viewpager2.widget.ViewPager2.write
    public final void AudioAttributesCompatParcelizer(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.write
    public final void RemoteActionCompatParcelizer(int i) {
    }

    public getNameForUid(LinearLayoutManager linearLayoutManager) {
        this.write = linearLayoutManager;
    }

    public final ViewPager2.AudioAttributesCompatParcelizer write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void read(ViewPager2.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.write
    public final void AudioAttributesCompatParcelizer(int i, float f, int i2) {
        if (this.AudioAttributesCompatParcelizer != null) {
            for (int i3 = 0; i3 < this.write.onPlay(); i3++) {
                View viewMediaBrowserCompatCustomActionResultReceiver = this.write.MediaBrowserCompatCustomActionResultReceiver(i3);
                if (viewMediaBrowserCompatCustomActionResultReceiver == null) {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.write.onPlay())));
                }
                LinearLayoutManager.MediaDescriptionCompat(viewMediaBrowserCompatCustomActionResultReceiver);
            }
        }
    }
}
