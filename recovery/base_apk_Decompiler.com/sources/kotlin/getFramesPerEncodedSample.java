package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getFramesPerEncodedSample {
    public static final void read(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
    }

    public static final Object read(final maybeUpdateLatency maybeupdatelatency) {
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            getMeanPlayAndWaitTimeMs.RemoteActionCompatParcelizer.submit(new Runnable() { // from class: o.drainToEndOfStream
                @Override // java.lang.Runnable
                public final void run() {
                    getFramesPerEncodedSample.read(maybeupdatelatency);
                }
            });
            return C0177getRfBanners.read(getShowPopup.INSTANCE);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            return C0177getRfBanners.read(SdkPayloadData.write(th));
        }
    }
}
