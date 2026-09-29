package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\rJ!\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0017"}, d2 = {"Lo/withUseInput;", "T", "Lo/copyFrom;", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "IconCompatParcelizer", "(Ljava/lang/Object;)F", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;)Z", "(F)Ljava/lang/Object;", "p1", "(FZ)Ljava/lang/Object;", "write", "()F", "read", "", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class withUseInput<T> implements copyFrom<T> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<T, Float> write;

    public withUseInput(Map<T, Float> map) {
        this.write = map;
    }

    @Override // kotlin.copyFrom
    public final float IconCompatParcelizer(T p0) {
        Float f = this.write.get(p0);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    @Override // kotlin.copyFrom
    public final boolean RemoteActionCompatParcelizer(T p0) {
        return this.write.containsKey(p0);
    }

    @Override // kotlin.copyFrom
    public final T IconCompatParcelizer(float p0) {
        T next;
        Iterator<T> it = this.write.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(p0 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(p0 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // kotlin.copyFrom
    public final T IconCompatParcelizer(float p0, boolean p1) {
        T next;
        Iterator<T> it = this.write.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f = p1 ? fFloatValue - p0 : p0 - fFloatValue;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    f = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f2 = p1 ? fFloatValue2 - p0 : p0 - fFloatValue2;
                    if (f2 < BitmapDescriptorFactory.HUE_RED) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f, f2) > 0) {
                        next = next2;
                        f = f2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // kotlin.copyFrom
    public final float write() {
        Float fOnCustomAction = IntermediateLoginResponseBody.onCustomAction(this.write.values());
        if (fOnCustomAction != null) {
            return fOnCustomAction.floatValue();
        }
        return Float.NaN;
    }

    @Override // kotlin.copyFrom
    public final float read() {
        Float fMediaBrowserCompatMediaItem = IntermediateLoginResponseBody.MediaBrowserCompatMediaItem(this.write.values());
        if (fMediaBrowserCompatMediaItem != null) {
            return fMediaBrowserCompatMediaItem.floatValue();
        }
        return Float.NaN;
    }

    @Override // kotlin.copyFrom
    public final int RemoteActionCompatParcelizer() {
        return this.write.size();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof withUseInput) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((withUseInput) p0).write);
        }
        return false;
    }

    public final int hashCode() {
        return this.write.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapDraggableAnchors(");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
