package kotlin;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setMediaItemsInternal {
    private final List<isLoadingPossible> AudioAttributesCompatParcelizer;
    private PointF IconCompatParcelizer;
    private boolean read;

    public setMediaItemsInternal(PointF pointF, boolean z, List<isLoadingPossible> list) {
        this.IconCompatParcelizer = pointF;
        this.read = z;
        this.AudioAttributesCompatParcelizer = new ArrayList(list);
    }

    public setMediaItemsInternal() {
        this.AudioAttributesCompatParcelizer = new ArrayList();
    }

    public final void AudioAttributesCompatParcelizer(float f, float f2) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new PointF();
        }
        this.IconCompatParcelizer.set(f, f2);
    }

    public final PointF RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void read(boolean z) {
        this.read = z;
    }

    public final boolean write() {
        return this.read;
    }

    public final List<isLoadingPossible> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void read(setMediaItemsInternal setmediaitemsinternal, setMediaItemsInternal setmediaitemsinternal2, float f) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new PointF();
        }
        this.read = setmediaitemsinternal.write() || setmediaitemsinternal2.write();
        if (setmediaitemsinternal.AudioAttributesCompatParcelizer().size() != setmediaitemsinternal2.AudioAttributesCompatParcelizer().size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(setmediaitemsinternal.AudioAttributesCompatParcelizer().size());
            sb.append("\tShape 2: ");
            sb.append(setmediaitemsinternal2.AudioAttributesCompatParcelizer().size());
            access3000.AudioAttributesCompatParcelizer(sb.toString());
        }
        int iMin = Math.min(setmediaitemsinternal.AudioAttributesCompatParcelizer().size(), setmediaitemsinternal2.AudioAttributesCompatParcelizer().size());
        if (this.AudioAttributesCompatParcelizer.size() < iMin) {
            for (int size = this.AudioAttributesCompatParcelizer.size(); size < iMin; size++) {
                this.AudioAttributesCompatParcelizer.add(new isLoadingPossible());
            }
        } else if (this.AudioAttributesCompatParcelizer.size() > iMin) {
            for (int size2 = this.AudioAttributesCompatParcelizer.size() - 1; size2 >= iMin; size2--) {
                List<isLoadingPossible> list = this.AudioAttributesCompatParcelizer;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFRemoteActionCompatParcelizer = setmediaitemsinternal.RemoteActionCompatParcelizer();
        PointF pointFRemoteActionCompatParcelizer2 = setmediaitemsinternal2.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(setColorInfo.RemoteActionCompatParcelizer(pointFRemoteActionCompatParcelizer.x, pointFRemoteActionCompatParcelizer2.x, f), setColorInfo.RemoteActionCompatParcelizer(pointFRemoteActionCompatParcelizer.y, pointFRemoteActionCompatParcelizer2.y, f));
        for (int size3 = this.AudioAttributesCompatParcelizer.size() - 1; size3 >= 0; size3--) {
            isLoadingPossible isloadingpossible = setmediaitemsinternal.AudioAttributesCompatParcelizer().get(size3);
            isLoadingPossible isloadingpossible2 = setmediaitemsinternal2.AudioAttributesCompatParcelizer().get(size3);
            PointF pointFIconCompatParcelizer = isloadingpossible.IconCompatParcelizer();
            PointF pointFAudioAttributesCompatParcelizer = isloadingpossible.AudioAttributesCompatParcelizer();
            PointF pointF = isloadingpossible.read();
            PointF pointFIconCompatParcelizer2 = isloadingpossible2.IconCompatParcelizer();
            PointF pointFAudioAttributesCompatParcelizer2 = isloadingpossible2.AudioAttributesCompatParcelizer();
            PointF pointF2 = isloadingpossible2.read();
            this.AudioAttributesCompatParcelizer.get(size3).write(setColorInfo.RemoteActionCompatParcelizer(pointFIconCompatParcelizer.x, pointFIconCompatParcelizer2.x, f), setColorInfo.RemoteActionCompatParcelizer(pointFIconCompatParcelizer.y, pointFIconCompatParcelizer2.y, f));
            this.AudioAttributesCompatParcelizer.get(size3).IconCompatParcelizer(setColorInfo.RemoteActionCompatParcelizer(pointFAudioAttributesCompatParcelizer.x, pointFAudioAttributesCompatParcelizer2.x, f), setColorInfo.RemoteActionCompatParcelizer(pointFAudioAttributesCompatParcelizer.y, pointFAudioAttributesCompatParcelizer2.y, f));
            this.AudioAttributesCompatParcelizer.get(size3).AudioAttributesCompatParcelizer(setColorInfo.RemoteActionCompatParcelizer(pointF.x, pointF2.x, f), setColorInfo.RemoteActionCompatParcelizer(pointF.y, pointF2.y, f));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.AudioAttributesCompatParcelizer.size());
        sb.append("closed=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}
