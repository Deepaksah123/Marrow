package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class isVerified {
    public static final String IconCompatParcelizer(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String AudioAttributesCompatParcelizer(SampleVideos<?> sampleVideos) {
        Object string;
        if (sampleVideos instanceof setInternetConnected) {
            return ((setInternetConnected) sampleVideos).toString();
        }
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append(sampleVideos);
            sb.append('@');
            sb.append(IconCompatParcelizer(sampleVideos));
            string = C0177getRfBanners.read(sb.toString());
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            string = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        if (C0177getRfBanners.IconCompatParcelizer(string) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sampleVideos.getClass().getName());
            sb2.append('@');
            sb2.append(IconCompatParcelizer(sampleVideos));
            string = sb2.toString();
        }
        return (String) string;
    }

    public static final String read(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
