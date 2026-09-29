package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class removeMediaSourceRange {
    private Class<?> AudioAttributesCompatParcelizer;
    private Class<?> RemoteActionCompatParcelizer;
    private Class<?> write;

    public removeMediaSourceRange() {
    }

    public removeMediaSourceRange(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        IconCompatParcelizer(cls, cls2, cls3);
    }

    public final void IconCompatParcelizer(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.RemoteActionCompatParcelizer = cls;
        this.AudioAttributesCompatParcelizer = cls2;
        this.write = cls3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiClassKey{first=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", second=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        removeMediaSourceRange removemediasourcerange = (removeMediaSourceRange) obj;
        return this.RemoteActionCompatParcelizer.equals(removemediasourcerange.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer.equals(removemediasourcerange.AudioAttributesCompatParcelizer) && moveMediaSourceRange.IconCompatParcelizer(this.write, removemediasourcerange.write);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        Class<?> cls = this.write;
        return (((iHashCode * 31) + iHashCode2) * 31) + (cls != null ? cls.hashCode() : 0);
    }
}
