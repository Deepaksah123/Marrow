package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\b\u001a\u00020\u0002*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/PropertyValueAny;", "p0", "", "p1", "Lo/paramName;", "p2", "", "p3", "read", "(JZIF)J", "", "write", "(JZIF)I", "IconCompatParcelizer", "(ZII)I", "AudioAttributesCompatParcelizer", "(I)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class startRearDisplayPresentationSession {
    public static final long read(long j, boolean z, int i, float f) {
        return PropertyValueAny.INSTANCE.IconCompatParcelizer(0, write(j, z, i, f), 0, PropertyValueAny.AudioAttributesImplApi21Parcelizer(j));
    }

    public static final int write(long j, boolean z, int i, float f) {
        int iAudioAttributesImplBaseParcelizer = ((z || AudioAttributesCompatParcelizer(i)) && PropertyValueAny.RemoteActionCompatParcelizer(j)) ? PropertyValueAny.AudioAttributesImplBaseParcelizer(j) : Integer.MAX_VALUE;
        return PropertyValueAny.MediaBrowserCompatItemReceiver(j) == iAudioAttributesImplBaseParcelizer ? iAudioAttributesImplBaseParcelizer : getQues.write(MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(f), PropertyValueAny.MediaBrowserCompatItemReceiver(j), iAudioAttributesImplBaseParcelizer);
    }

    public static final int IconCompatParcelizer(boolean z, int i, int i2) {
        if (z || !AudioAttributesCompatParcelizer(i)) {
            return getQues.write(i2, 1);
        }
        return 1;
    }

    public static final boolean AudioAttributesCompatParcelizer(int i) {
        return paramName.write(i, paramName.INSTANCE.read()) || paramName.write(i, paramName.INSTANCE.AudioAttributesCompatParcelizer()) || paramName.write(i, paramName.INSTANCE.write());
    }
}
