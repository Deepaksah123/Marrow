package kotlin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
final class _enumClass<T> implements Runnable {
    private final setStateRank<T> AudioAttributesCompatParcelizer;
    private final Mp4ExtractorExternalSyntheticLambda0<T> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public _enumClass(Mp4ExtractorExternalSyntheticLambda0<T> mp4ExtractorExternalSyntheticLambda0, setStateRank<? super T> setstaterank) {
        toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) mp4ExtractorExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) setstaterank, "");
        this.IconCompatParcelizer = mp4ExtractorExternalSyntheticLambda0;
        this.AudioAttributesCompatParcelizer = setstaterank;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.IconCompatParcelizer.isCancelled()) {
            try {
                setStateRank<T> setstaterank = this.AudioAttributesCompatParcelizer;
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                setstaterank.resumeWith(C0177getRfBanners.read(DateDeserializersDateDeserializer.AudioAttributesCompatParcelizer((Future) this.IconCompatParcelizer)));
                return;
            } catch (ExecutionException e) {
                setStateRank<T> setstaterank2 = this.AudioAttributesCompatParcelizer;
                Throwable th = deserializerForCreator.read(e);
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                setstaterank2.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(th)));
                return;
            }
        }
        this.AudioAttributesCompatParcelizer.write((Throwable) null);
    }
}
