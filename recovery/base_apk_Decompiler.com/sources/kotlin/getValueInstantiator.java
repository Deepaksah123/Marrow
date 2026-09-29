package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\n\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\t"}, d2 = {"", "Lo/findProperty;", "p0", "", "IconCompatParcelizer", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "", "p1", "write", "(II)J", "(I)J", "AudioAttributesCompatParcelizer", "(JII)J", "", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getValueInstantiator {
    public static final String IconCompatParcelizer(CharSequence charSequence, long j) {
        return charSequence.subSequence(findProperty.MediaBrowserCompatCustomActionResultReceiver(j), findProperty.AudioAttributesImplApi26Parcelizer(j)).toString();
    }

    public static final long write(int i, int i2) {
        return findProperty.IconCompatParcelizer(RemoteActionCompatParcelizer(i, i2));
    }

    public static final long IconCompatParcelizer(int i) {
        return write(i, i);
    }

    public static final long AudioAttributesCompatParcelizer(long j, int i, int i2) {
        int iAudioAttributesImplBaseParcelizer = findProperty.AudioAttributesImplBaseParcelizer(j);
        if (iAudioAttributesImplBaseParcelizer < i) {
            iAudioAttributesImplBaseParcelizer = i;
        }
        if (iAudioAttributesImplBaseParcelizer > i2) {
            iAudioAttributesImplBaseParcelizer = i2;
        }
        int i3 = findProperty.read(j);
        if (i3 >= i) {
            i = i3;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (iAudioAttributesImplBaseParcelizer == findProperty.AudioAttributesImplBaseParcelizer(j) && i2 == findProperty.read(j)) ? j : write(iAudioAttributesImplBaseParcelizer, i2);
    }

    private static final long RemoteActionCompatParcelizer(int i, int i2) {
        if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("start and end cannot be negative. [start: ");
            sb.append(i);
            sb.append(", end: ");
            sb.append(i2);
            sb.append(']');
            withStackTrace.read(sb.toString());
        }
        long j = -1;
        return (((long) i2) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) i) << 32);
    }
}
