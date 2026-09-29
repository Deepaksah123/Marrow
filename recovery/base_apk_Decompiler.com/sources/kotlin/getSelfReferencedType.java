package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getSelfReferencedType extends CollectionLikeType {
    public final long MediaBrowserCompatMediaItem;

    public abstract boolean write();

    public getSelfReferencedType(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, C0170format c0170format, int i, Object obj, long j, long j2, long j3) {
        super(_hastyperesolver, subTypeValidator, 1, c0170format, i, obj, j, j2);
        this.MediaBrowserCompatMediaItem = j3;
    }

    public long C_() {
        long j = this.MediaBrowserCompatMediaItem;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }
}
