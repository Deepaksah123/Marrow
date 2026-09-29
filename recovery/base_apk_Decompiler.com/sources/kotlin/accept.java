package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/ReadableObjectIdReferring;", "p0", "IconCompatParcelizer", "(JJ)J", "write", "J", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class accept {
    private static final long write = setResolver.RemoteActionCompatParcelizer(14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IconCompatParcelizer(long j, long j2) {
        if (ReadableObjectIdReferring.MediaBrowserCompatCustomActionResultReceiver(j2)) {
            if (ReadableObjectIdReferring.MediaBrowserCompatCustomActionResultReceiver(j)) {
                StringBuilder sb = new StringBuilder("Cannot convert Em to Px when style.fontSize is Em (");
                sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(j2));
                sb.append("). Please declare the style.fontSize with Sp units instead.");
                throw new IllegalStateException(sb.toString());
            }
            if (ReadableObjectIdReferring.RemoteActionCompatParcelizer(j) == 0) {
                long j3 = write;
                float fAudioAttributesCompatParcelizer = ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j2);
                setResolver.RemoteActionCompatParcelizer(j3);
                return setResolver.IconCompatParcelizer(ReadableObjectIdReferring.RemoteActionCompatParcelizer(j3), ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j3) * fAudioAttributesCompatParcelizer);
            }
            float fAudioAttributesCompatParcelizer2 = ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j2);
            setResolver.RemoteActionCompatParcelizer(j);
            return setResolver.IconCompatParcelizer(ReadableObjectIdReferring.RemoteActionCompatParcelizer(j), ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j) * fAudioAttributesCompatParcelizer2);
        }
        StringBuilder sb2 = new StringBuilder("The multiplier must be in em, but was ");
        sb2.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(j2));
        sb2.append('.');
        throw new IllegalArgumentException(sb2.toString());
    }
}
