package kotlin;

import android.os.Trace;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "", "p1", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;J)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AtomicIntegerDeserializer {
    public static final void AudioAttributesCompatParcelizer(String str, long j) {
        Trace.setCounter(str, j);
    }
}
