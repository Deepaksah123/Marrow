package kotlin;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getInstalledApplications extends ViewPager2.write {
    private final List<ViewPager2.write> AudioAttributesCompatParcelizer = new ArrayList(3);

    public final void RemoteActionCompatParcelizer(ViewPager2.write writeVar) {
        this.AudioAttributesCompatParcelizer.add(writeVar);
    }

    public final void write(ViewPager2.write writeVar) {
        this.AudioAttributesCompatParcelizer.remove(writeVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.write
    public final void AudioAttributesCompatParcelizer(int i, float f, int i2) {
        try {
            Iterator<ViewPager2.write> it = this.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                it.next().AudioAttributesCompatParcelizer(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            RemoteActionCompatParcelizer(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.write
    public final void RemoteActionCompatParcelizer(int i) {
        try {
            Iterator<ViewPager2.write> it = this.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                it.next().RemoteActionCompatParcelizer(i);
            }
        } catch (ConcurrentModificationException e) {
            RemoteActionCompatParcelizer(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.write
    public final void AudioAttributesCompatParcelizer(int i) {
        try {
            Iterator<ViewPager2.write> it = this.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                it.next().AudioAttributesCompatParcelizer(i);
            }
        } catch (ConcurrentModificationException e) {
            RemoteActionCompatParcelizer(e);
        }
    }

    private static void RemoteActionCompatParcelizer(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
