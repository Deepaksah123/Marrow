package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class moveMediaItemsInternal<T> {
    private T AudioAttributesCompatParcelizer;
    private T IconCompatParcelizer;

    public final void RemoteActionCompatParcelizer(T t, T t2) {
        this.AudioAttributesCompatParcelizer = t;
        this.IconCompatParcelizer = t2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StringArrayDeserializer)) {
            return false;
        }
        StringArrayDeserializer stringArrayDeserializer = (StringArrayDeserializer) obj;
        return IconCompatParcelizer(stringArrayDeserializer.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer) && IconCompatParcelizer(stringArrayDeserializer.IconCompatParcelizer, this.IconCompatParcelizer);
    }

    private static boolean IconCompatParcelizer(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.AudioAttributesCompatParcelizer;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.IconCompatParcelizer;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(" ");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }
}
