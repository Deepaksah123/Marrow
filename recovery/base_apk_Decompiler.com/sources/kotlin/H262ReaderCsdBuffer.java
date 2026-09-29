package kotlin;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class H262ReaderCsdBuffer implements onData, onStartCode {
    private CountDownLatch AudioAttributesCompatParcelizer;
    private final H263Reader IconCompatParcelizer;
    private final TimeUnit RemoteActionCompatParcelizer;
    private final Object read = new Object();
    private boolean write = false;
    private final int AudioAttributesImplBaseParcelizer = 500;

    public H262ReaderCsdBuffer(H263Reader h263Reader, TimeUnit timeUnit) {
        this.IconCompatParcelizer = h263Reader;
        this.RemoteActionCompatParcelizer = timeUnit;
    }

    @Override // kotlin.onStartCode
    public final void write(String str, Bundle bundle) {
        synchronized (this.read) {
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Logging event ");
            sb.append(str);
            sb.append(" to Firebase Analytics with params ");
            sb.append(bundle);
            dvbSubtitleReader.AudioAttributesCompatParcelizer(sb.toString());
            this.AudioAttributesCompatParcelizer = new CountDownLatch(1);
            this.write = false;
            this.IconCompatParcelizer.write(str, bundle);
            DvbSubtitleReader.read().AudioAttributesCompatParcelizer("Awaiting app exception callback from Analytics...");
            try {
                if (this.AudioAttributesCompatParcelizer.await(this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer)) {
                    this.write = true;
                    DvbSubtitleReader.read().AudioAttributesCompatParcelizer("App exception callback received from Analytics listener.");
                } else {
                    DvbSubtitleReader.read().read("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                DvbSubtitleReader.read().RemoteActionCompatParcelizer("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    @Override // kotlin.onData
    public final void IconCompatParcelizer(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.AudioAttributesCompatParcelizer;
        if (countDownLatch == null || !"_ae".equals(str)) {
            return;
        }
        countDownLatch.countDown();
    }
}
