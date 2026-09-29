package kotlin;

import kotlin.Metadata;
import kotlin.switchToNext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/switchToNext;", "", "read", "(J)J", "Lo/switchToNext$AudioAttributesCompatParcelizer;", "p0", "AudioAttributesCompatParcelizer", "(Lo/switchToNext$AudioAttributesCompatParcelizer;J)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BufferRecyclers {
    public static final long read(long j) {
        long j2 = 63 & j;
        return Long.compareUnsigned(setClientId.RemoteActionCompatParcelizer(j2), 16L) < 0 ? j : setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(j & setClientId.RemoteActionCompatParcelizer(-64L)) | setClientId.RemoteActionCompatParcelizer(setClientId.RemoteActionCompatParcelizer(j2) - 1));
    }

    public static final long AudioAttributesCompatParcelizer(switchToNext.Companion companion, long j) {
        long j2 = 63 & j;
        if (j2 >= 16) {
            j = (j & (-64)) | (j2 + 1);
        }
        return switchToNext.AudioAttributesCompatParcelizer(setClientId.RemoteActionCompatParcelizer(j));
    }
}
