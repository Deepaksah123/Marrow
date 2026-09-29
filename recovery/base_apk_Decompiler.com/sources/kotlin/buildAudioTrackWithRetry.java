package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public abstract class buildAudioTrackWithRetry {
    public static final Long RemoteActionCompatParcelizer() {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        return (Long) setForHeaderData.read(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj));
    }
}
