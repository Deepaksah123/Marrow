package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class setPauseTouchCount {
    private static final boolean RemoteActionCompatParcelizer;

    static {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        RemoteActionCompatParcelizer = C0177getRfBanners.write(obj);
    }

    public static final boolean IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }
}
