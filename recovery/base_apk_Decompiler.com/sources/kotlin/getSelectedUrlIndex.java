package kotlin;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class getSelectedUrlIndex {
    public static final void AudioAttributesCompatParcelizer(CurrentQuery currentQuery, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = getPrepareTimestampMs.IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(currentQuery, th);
            } catch (setDecoderName unused) {
                return;
            } catch (Throwable th2) {
                getPrepareTimestampMs.read(YearItem.write(th, th2));
            }
        }
        try {
            getPlanName.IconCompatParcelizer(th, new setFirstFrameRenderedTimestampMs(currentQuery));
        } catch (Throwable unused2) {
        }
        getPrepareTimestampMs.read(th);
    }
}
