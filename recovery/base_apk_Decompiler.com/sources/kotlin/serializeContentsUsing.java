package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class serializeContentsUsing {
    public final String AudioAttributesCompatParcelizer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public serializeContentsUsing(String str, String str2, String str3, String str4, String str5) {
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.read = str4;
        this.IconCompatParcelizer = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof serializeContentsUsing)) {
            return false;
        }
        serializeContentsUsing serializecontentsusing = (serializeContentsUsing) obj;
        return LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, serializecontentsusing.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.write, serializecontentsusing.write) && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, serializecontentsusing.AudioAttributesCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.read, serializecontentsusing.read) && LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, serializecontentsusing.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.AudioAttributesCompatParcelizer;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        return ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }
}
