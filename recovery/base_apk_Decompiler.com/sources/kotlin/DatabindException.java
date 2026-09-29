package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\f\u0010\rJ \u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH¦@¢\u0006\u0004\b\t\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/DatabindException;", "", "Lo/getReferencedType;", "p0", "Lo/findCoercionAction;", "p1", "read", "(JI)J", "p2", "IconCompatParcelizer", "(JJI)J", "Lo/UnsupportedTypeDeserializer;", "write", "(JLo/SampleVideos;)Ljava/lang/Object;", "(JJLo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DatabindException {
    default long read(long p0, int p1) {
        return getReferencedType.INSTANCE.write();
    }

    default long IconCompatParcelizer(long p0, long p1, int p2) {
        return getReferencedType.INSTANCE.write();
    }

    static /* synthetic */ Object write(DatabindException databindException, long j, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
        return UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(UnsupportedTypeDeserializer.INSTANCE.write());
    }

    static /* synthetic */ Object read(DatabindException databindException, long j, long j2, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
        return UnsupportedTypeDeserializer.RemoteActionCompatParcelizer(UnsupportedTypeDeserializer.INSTANCE.write());
    }

    default Object IconCompatParcelizer(long j, long j2, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
        return read(this, j, j2, sampleVideos);
    }

    default Object write(long j, SampleVideos<? super UnsupportedTypeDeserializer> sampleVideos) {
        return write(this, j, sampleVideos);
    }
}
