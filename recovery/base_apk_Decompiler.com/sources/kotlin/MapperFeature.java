package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/MapperFeature;", "Lo/makeChild;", "<init>", "()V", "", "MediaBrowserCompatMediaItem", "()Z", "", "MediaMetadataCompat", "write", "Ljava/lang/Boolean;", "RemoteActionCompatParcelizer", "p0", "IconCompatParcelizer", "read", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class MapperFeature implements makeChild {
    public static final MapperFeature INSTANCE = new MapperFeature();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static Boolean RemoteActionCompatParcelizer;

    private MapperFeature() {
    }

    @Override // kotlin.makeChild
    public final boolean IconCompatParcelizer() {
        Boolean bool = RemoteActionCompatParcelizer;
        if (bool == null) {
            reportWrongTokenException.write("canFocus is read before it is written");
            throw new PlanDetailsCreator();
        }
        return bool.booleanValue();
    }

    @Override // kotlin.makeChild
    public final void read(boolean z) {
        RemoteActionCompatParcelizer = Boolean.valueOf(z);
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return RemoteActionCompatParcelizer != null;
    }

    public final void MediaMetadataCompat() {
        RemoteActionCompatParcelizer = null;
    }
}
