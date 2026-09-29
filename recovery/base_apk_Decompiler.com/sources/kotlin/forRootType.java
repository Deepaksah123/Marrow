package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/forRootType;", "Lo/Module;", "Lo/DeserializationContext;", "p0", "Lo/_shapeForToken;", "p1", "Lo/getKey;", "p2", "", "write", "(Lo/DeserializationContext;Lo/_shapeForToken;J)V", "MediaBrowserCompatMediaItem", "()V", "", "k_", "()Z", "h_", "e_", "g_", "Lo/withNulls;", "f_", "()J", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface forRootType extends Module {
    void MediaBrowserCompatMediaItem();

    default boolean h_() {
        return false;
    }

    default boolean k_() {
        return false;
    }

    void write(DeserializationContext p0, _shapeForToken p1, long p2);

    default void e_() {
        MediaBrowserCompatMediaItem();
    }

    default void g_() {
        MediaBrowserCompatMediaItem();
    }

    default long f_() {
        return withNulls.INSTANCE.RemoteActionCompatParcelizer();
    }
}
