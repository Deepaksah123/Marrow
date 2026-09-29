package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/addAfterInterceptorCallback;", "Lo/DateDeserializersCalendarDeserializer;", "Lo/_skipWSOrEnd;", "p0", "Lo/addInterceptor;", "p1", "<init>", "(Lo/_skipWSOrEnd;Lo/addInterceptor;)V", "Lo/appendReferring;", "Lo/getKey;", "Lo/tryToResolveUnresolved;", "p2", "p3", "Lo/hasReferringProperties;", "AudioAttributesCompatParcelizer", "(Lo/appendReferring;JLo/tryToResolveUnresolved;J)J", "IconCompatParcelizer", "Lo/_skipWSOrEnd;", "write", "Lo/addInterceptor;", "Lo/getReferencedType;", "read", "J", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addAfterInterceptorCallback implements DateDeserializersCalendarDeserializer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final _skipWSOrEnd write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private long RemoteActionCompatParcelizer = getReferencedType.INSTANCE.write();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final addInterceptor IconCompatParcelizer;

    public addAfterInterceptorCallback(_skipWSOrEnd _skipwsorend, addInterceptor addinterceptor) {
        this.write = _skipwsorend;
        this.IconCompatParcelizer = addinterceptor;
    }

    @Override // kotlin.DateDeserializersCalendarDeserializer
    public final long AudioAttributesCompatParcelizer(appendReferring p0, long p1, tryToResolveUnresolved p2, long p3) {
        long j = this.IconCompatParcelizer.read();
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = this.RemoteActionCompatParcelizer;
        }
        this.RemoteActionCompatParcelizer = j;
        return hasReferringProperties.AudioAttributesCompatParcelizer(hasReferringProperties.AudioAttributesCompatParcelizer(p0.AudioAttributesImplBaseParcelizer(), referringProperties.AudioAttributesCompatParcelizer(j)), this.write.IconCompatParcelizer(p3, getKey.INSTANCE.RemoteActionCompatParcelizer(), p2));
    }
}
