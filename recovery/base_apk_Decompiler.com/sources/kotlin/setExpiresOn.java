package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class setExpiresOn extends ArrayList<setPermanent> implements getValueInt {
    public setExpiresOn(int i) {
        super(i);
    }

    private boolean AudioAttributesCompatParcelizer(setPermanent setpermanent) {
        return super.contains(setpermanent);
    }

    private boolean IconCompatParcelizer(setPermanent setpermanent) {
        return super.remove(setpermanent);
    }

    private int read() {
        return super.size();
    }

    private int read(setPermanent setpermanent) {
        return super.indexOf(setpermanent);
    }

    private int write(setPermanent setpermanent) {
        return super.lastIndexOf(setpermanent);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof setPermanent) {
            return AudioAttributesCompatParcelizer((setPermanent) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof setPermanent) {
            return read((setPermanent) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof setPermanent) {
            return write((setPermanent) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        if (obj instanceof setPermanent) {
            return IconCompatParcelizer((setPermanent) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return read();
    }
}
