package kotlin;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class moveToPosition extends getCount implements Iterable<getCount> {
    private final ArrayList<getCount> IconCompatParcelizer = new ArrayList<>();

    public final void IconCompatParcelizer(getCount getcount) {
        if (getcount == null) {
            getcount = DefaultDownloaderFactory.read;
        }
        this.IconCompatParcelizer.add(getcount);
    }

    @Override // java.lang.Iterable
    public final Iterator<getCount> iterator() {
        return this.IconCompatParcelizer.iterator();
    }

    private getCount RatingCompat() {
        int size = this.IconCompatParcelizer.size();
        if (size == 1) {
            return this.IconCompatParcelizer.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size ".concat(String.valueOf(size)));
    }

    @Override // kotlin.getCount
    public final Number write() {
        return RatingCompat().write();
    }

    @Override // kotlin.getCount
    public final String AudioAttributesImplApi26Parcelizer() {
        return RatingCompat().AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.getCount
    public final double AudioAttributesCompatParcelizer() {
        return RatingCompat().AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getCount
    public final long RemoteActionCompatParcelizer() {
        return RatingCompat().RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getCount
    public final int IconCompatParcelizer() {
        return RatingCompat().IconCompatParcelizer();
    }

    @Override // kotlin.getCount
    public final boolean read() {
        return RatingCompat().read();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof moveToPosition) && ((moveToPosition) obj).IconCompatParcelizer.equals(this.IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }
}
