package kotlin;

import java.util.concurrent.ExecutionException;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
final class onAudioFocusChange<T> implements Runnable {
    private final Mp4ExtractorExternalSyntheticLambda0<T> AudioAttributesCompatParcelizer;
    private final setStateRank<T> read;

    /* JADX WARN: Multi-variable type inference failed */
    public onAudioFocusChange(Mp4ExtractorExternalSyntheticLambda0<T> mp4ExtractorExternalSyntheticLambda0, setStateRank<? super T> setstaterank) {
        toMagicModuleMetaRepoModel.write(mp4ExtractorExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(setstaterank, "");
        this.AudioAttributesCompatParcelizer = mp4ExtractorExternalSyntheticLambda0;
        this.read = setstaterank;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.AudioAttributesCompatParcelizer.isCancelled()) {
            this.read.write((Throwable) null);
            return;
        }
        try {
            setStateRank<T> setstaterank = this.read;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterank.resumeWith(C0177getRfBanners.read(pause.write(this.AudioAttributesCompatParcelizer)));
        } catch (ExecutionException e) {
            setStateRank<T> setstaterank2 = this.read;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            setstaterank2.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(pause.write(e))));
        }
    }
}
