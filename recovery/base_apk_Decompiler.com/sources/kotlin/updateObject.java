package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/updateObject;", "Lo/DateDeserializersCalendarDeserializer;", "Lo/_skipWSOrEnd;", "p0", "Lo/hasReferringProperties;", "p1", "<init>", "(Lo/_skipWSOrEnd;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/appendReferring;", "Lo/getKey;", "Lo/tryToResolveUnresolved;", "p2", "p3", "AudioAttributesCompatParcelizer", "(Lo/appendReferring;JLo/tryToResolveUnresolved;J)J", "RemoteActionCompatParcelizer", "Lo/_skipWSOrEnd;", "read", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updateObject implements DateDeserializersCalendarDeserializer {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _skipWSOrEnd AudioAttributesCompatParcelizer;
    private final long read;

    private updateObject(_skipWSOrEnd _skipwsorend, long j) {
        this.AudioAttributesCompatParcelizer = _skipwsorend;
        this.read = j;
    }

    @Override // kotlin.DateDeserializersCalendarDeserializer
    public final long AudioAttributesCompatParcelizer(appendReferring p0, long p1, tryToResolveUnresolved p2, long p3) {
        long j = -1;
        return hasReferringProperties.AudioAttributesCompatParcelizer(hasReferringProperties.AudioAttributesCompatParcelizer(hasReferringProperties.AudioAttributesCompatParcelizer(p0.AudioAttributesImplBaseParcelizer(), this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getKey.INSTANCE.RemoteActionCompatParcelizer(), p0.MediaBrowserCompatCustomActionResultReceiver(), p2)), hasReferringProperties.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getKey.INSTANCE.RemoteActionCompatParcelizer(), p3, p2))), hasReferringProperties.read((((long) (hasReferringProperties.IconCompatParcelizer(this.read) * (p2 == tryToResolveUnresolved.write ? 1 : -1))) << 32) | (((long) hasReferringProperties.AudioAttributesCompatParcelizer(this.read)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
    }

    public /* synthetic */ updateObject(_skipWSOrEnd _skipwsorend, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(_skipwsorend, j);
    }
}
