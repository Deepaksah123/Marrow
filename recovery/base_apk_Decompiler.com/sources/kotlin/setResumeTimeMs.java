package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class setResumeTimeMs {
    public static final <R, T> void AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super R, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, R r, SampleVideos<? super T> sampleVideos) {
        try {
            SampleVideos sampleVideosIconCompatParcelizer = getYear.IconCompatParcelizer(getYear.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, r, sampleVideos));
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setEncryptedPlaybackVersion.read(sampleVideosIconCompatParcelizer, C0177getRfBanners.read(getShowPopup.INSTANCE));
        } catch (Throwable th) {
            IconCompatParcelizer(sampleVideos, th);
        }
    }

    public static final void read(SampleVideos<? super getShowPopup> sampleVideos, SampleVideos<?> sampleVideos2) throws Throwable {
        try {
            SampleVideos sampleVideosIconCompatParcelizer = getYear.IconCompatParcelizer(sampleVideos);
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setEncryptedPlaybackVersion.read(sampleVideosIconCompatParcelizer, C0177getRfBanners.read(getShowPopup.INSTANCE));
        } catch (Throwable th) {
            IconCompatParcelizer(sampleVideos2, th);
        }
    }

    private static final void IconCompatParcelizer(SampleVideos<?> sampleVideos, Throwable th) throws Throwable {
        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
        sampleVideos.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(th)));
        throw th;
    }
}
