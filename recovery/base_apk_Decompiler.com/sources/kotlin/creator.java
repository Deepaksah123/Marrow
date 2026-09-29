package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/CreatorCandidate;", "p0", "p1", "", "p2", "AudioAttributesCompatParcelizer", "(Lo/CreatorCandidate;Lo/CreatorCandidate;F)Lo/CreatorCandidate;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class creator {
    public static final CreatorCandidate AudioAttributesCompatParcelizer(CreatorCandidate creatorCandidate, CreatorCandidate creatorCandidate2, float f) {
        return new CreatorCandidate(AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(creatorCandidate.getRemoteActionCompatParcelizer(), creatorCandidate2.getRemoteActionCompatParcelizer(), f), AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(creatorCandidate.getRead(), creatorCandidate2.getRead(), f));
    }
}
