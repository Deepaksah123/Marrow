package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class findMapLikeSerializer {
    public final C0170format AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final C0170format write;

    public findMapLikeSerializer(String str, C0170format c0170format, C0170format c0170format2, int i, int i2) {
        buildTypeSerializer.IconCompatParcelizer(i == 0 || i2 == 0);
        this.read = buildTypeSerializer.write(str);
        this.write = (C0170format) buildTypeSerializer.IconCompatParcelizer(c0170format);
        this.AudioAttributesCompatParcelizer = (C0170format) buildTypeSerializer.IconCompatParcelizer(c0170format2);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        findMapLikeSerializer findmaplikeserializer = (findMapLikeSerializer) obj;
        return this.RemoteActionCompatParcelizer == findmaplikeserializer.RemoteActionCompatParcelizer && this.IconCompatParcelizer == findmaplikeserializer.IconCompatParcelizer && this.read.equals(findmaplikeserializer.read) && this.write.equals(findmaplikeserializer.write) && this.AudioAttributesCompatParcelizer.equals(findmaplikeserializer.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        return ((((((((i + 527) * 31) + i2) * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }
}
