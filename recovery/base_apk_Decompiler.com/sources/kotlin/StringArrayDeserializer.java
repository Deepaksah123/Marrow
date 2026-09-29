package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public class StringArrayDeserializer<F, S> {
    public final S IconCompatParcelizer;
    public final F RemoteActionCompatParcelizer;

    public StringArrayDeserializer(F f, S s) {
        this.RemoteActionCompatParcelizer = f;
        this.IconCompatParcelizer = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StringArrayDeserializer)) {
            return false;
        }
        StringArrayDeserializer stringArrayDeserializer = (StringArrayDeserializer) obj;
        return configureFromStringCreator.RemoteActionCompatParcelizer(stringArrayDeserializer.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer) && configureFromStringCreator.RemoteActionCompatParcelizer(stringArrayDeserializer.IconCompatParcelizer, this.IconCompatParcelizer);
    }

    public int hashCode() {
        F f = this.RemoteActionCompatParcelizer;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.IconCompatParcelizer;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(" ");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public static <A, B> StringArrayDeserializer<A, B> RemoteActionCompatParcelizer(A a, B b) {
        return new StringArrayDeserializer<>(a, b);
    }
}
