package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007\"\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u001a\u0010\n\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\n\u0010\u0007\"\u001a\u0010\u0005\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\t\u0010\u0007"}, d2 = {"", "p0", "Lo/extractScalarFromObject;", "read", "(I)Lo/extractScalarFromObject;", "AudioAttributesCompatParcelizer", "Lo/extractScalarFromObject;", "()Lo/extractScalarFromObject;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findNonContextualValueDeserializer {
    private static final extractScalarFromObject AudioAttributesCompatParcelizer = new findCoercionFromBlankString(1000);
    private static final extractScalarFromObject IconCompatParcelizer = new findCoercionFromBlankString(AnalyticsListener.EVENT_AUDIO_ENABLED);
    private static final extractScalarFromObject RemoteActionCompatParcelizer = new findCoercionFromBlankString(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
    private static final extractScalarFromObject read = new findCoercionFromBlankString(1002);

    public static final extractScalarFromObject read(int i) {
        return new findCoercionFromBlankString(i);
    }

    public static final extractScalarFromObject read() {
        return AudioAttributesCompatParcelizer;
    }

    public static final extractScalarFromObject AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static final extractScalarFromObject write() {
        return RemoteActionCompatParcelizer;
    }

    public static final extractScalarFromObject IconCompatParcelizer() {
        return read;
    }
}
