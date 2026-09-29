package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentResetResponse {
    private static final boolean AudioAttributesCompatParcelizer;

    static {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        if (C0177getRfBanners.write(obj)) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
            obj = Boolean.TRUE;
        }
        Object obj2 = C0177getRfBanners.read(obj);
        if (C0177getRfBanners.RemoteActionCompatParcelizer(obj2)) {
            obj2 = Boolean.FALSE;
        }
        AudioAttributesCompatParcelizer = ((Boolean) obj2).booleanValue();
    }

    public static final <V> refreshSubscription<V> RemoteActionCompatParcelizer(getAnswerMap<? super Class<?>, ? extends V> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return AudioAttributesCompatParcelizer ? new getBookmark<>(getanswermap) : new getLesson<>(getanswermap);
    }
}
