package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonValueFormatVisitor {
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public JsonValueFormatVisitor(String str, String str2) {
        this.RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.read(str);
        this.write = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JsonValueFormatVisitor jsonValueFormatVisitor = (JsonValueFormatVisitor) obj;
        return LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, jsonValueFormatVisitor.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.write, jsonValueFormatVisitor.write);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
    }
}
