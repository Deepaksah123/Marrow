package kotlin;

import kotlin.Metadata;

/* JADX INFO: renamed from: o.invalidTypeIdException, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "Lo/_quotedString;", "AudioAttributesCompatParcelizer", "(I)J", "write", "(J)I", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0180invalidTypeIdException {
    public static final int write(long j) {
        return (int) (j >> 32);
    }

    public static final long AudioAttributesCompatParcelizer(int i) {
        return _quotedString.write(((long) i) << 32);
    }
}
