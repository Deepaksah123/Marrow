package kotlin;

import kotlin.Metadata;
import kotlin.StreamReadCapability;
import kotlin.getParent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000e"}, d2 = {"Lo/writeObjectEntrySeparator;", "", "<init>", "()V", "", "p0", "Lo/writeObjectEntrySeparator$RemoteActionCompatParcelizer;", "AudioAttributesImplApi26Parcelizer", "(I)Lo/writeObjectEntrySeparator$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "read", "AudioAttributesImplBaseParcelizer", "Lo/writeObjectEntrySeparator$IconCompatParcelizer;", "AudioAttributesImplApi21Parcelizer", "(I)Lo/writeObjectEntrySeparator$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class writeObjectEntrySeparator {
    public static final writeObjectEntrySeparator INSTANCE = new writeObjectEntrySeparator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/writeObjectEntrySeparator$IconCompatParcelizer;", "", "Lo/appendReferring;", "p0", "Lo/getKey;", "p1", "", "p2", "write", "(Lo/appendReferring;JI)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface IconCompatParcelizer {
        int write(appendReferring p0, long p1, int p2);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/writeObjectEntrySeparator$RemoteActionCompatParcelizer;", "", "Lo/appendReferring;", "p0", "Lo/getKey;", "p1", "", "p2", "Lo/tryToResolveUnresolved;", "p3", "write", "(Lo/appendReferring;JILo/tryToResolveUnresolved;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {
        int write(appendReferring p0, long p1, int p2, tryToResolveUnresolved p3);
    }

    private writeObjectEntrySeparator() {
    }

    public final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer(int p0) {
        return new getParent.read(_skipWSOrEnd.INSTANCE.RatingCompat(), _skipWSOrEnd.INSTANCE.RatingCompat(), p0);
    }

    public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int p0) {
        return new getParent.read(_skipWSOrEnd.INSTANCE.AudioAttributesImplBaseParcelizer(), _skipWSOrEnd.INSTANCE.AudioAttributesImplBaseParcelizer(), p0);
    }

    public final RemoteActionCompatParcelizer read(int p0) {
        return new StreamReadCapability.RemoteActionCompatParcelizer(_skipColon.INSTANCE.write(), p0);
    }

    public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer(int p0) {
        return new StreamReadCapability.RemoteActionCompatParcelizer(_skipColon.INSTANCE.IconCompatParcelizer(), p0);
    }

    public final IconCompatParcelizer AudioAttributesImplApi21Parcelizer(int p0) {
        return new getParent.IconCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), _skipWSOrEnd.INSTANCE.write(), p0);
    }

    public final IconCompatParcelizer AudioAttributesCompatParcelizer(int p0) {
        return new getParent.IconCompatParcelizer(_skipWSOrEnd.INSTANCE.write(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), p0);
    }

    public final IconCompatParcelizer write(int p0) {
        return new getParent.IconCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), _skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), p0);
    }

    public final IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(int p0) {
        return new StreamReadCapability.IconCompatParcelizer(_skipWSOrEnd.INSTANCE.MediaBrowserCompatMediaItem(), p0);
    }

    public final IconCompatParcelizer IconCompatParcelizer(int p0) {
        return new StreamReadCapability.IconCompatParcelizer(_skipWSOrEnd.INSTANCE.write(), p0);
    }
}
