package kotlin;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lambdastatic1 extends computeSeeker implements Set {
    private transient maybeReadSeekFrame AudioAttributesCompatParcelizer;

    lambdastatic1() {
    }

    public static lambdastatic1 IconCompatParcelizer() {
        return readInternal.AudioAttributesCompatParcelizer;
    }

    public final maybeReadSeekFrame MediaBrowserCompatItemReceiver() {
        maybeReadSeekFrame maybereadseekframe = this.AudioAttributesCompatParcelizer;
        if (maybereadseekframe != null) {
            return maybereadseekframe;
        }
        maybeReadSeekFrame maybereadseekframeMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        this.AudioAttributesCompatParcelizer = maybereadseekframeMediaBrowserCompatCustomActionResultReceiver;
        return maybereadseekframeMediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lambdastatic1) {
            ((lambdastatic1) obj).AudioAttributesImplApi26Parcelizer();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // kotlin.computeSeeker, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    maybeReadSeekFrame MediaBrowserCompatCustomActionResultReceiver() {
        throw null;
    }

    boolean AudioAttributesImplApi26Parcelizer() {
        throw null;
    }
}
