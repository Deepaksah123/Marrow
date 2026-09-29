package kotlin;

import android.content.Context;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class onUnderrun {
    public final Context write;

    public onUnderrun(Context context) {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            Context applicationContext = context.getApplicationContext();
            toMagicModuleMetaRepoModel.write(applicationContext);
            obj = C0177getRfBanners.read(applicationContext);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        this.write = (Context) setForHeaderData.read(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj), context);
    }
}
