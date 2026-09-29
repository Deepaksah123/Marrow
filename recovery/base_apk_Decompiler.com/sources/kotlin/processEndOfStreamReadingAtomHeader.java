package kotlin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class processEndOfStreamReadingAtomHeader extends processMoovAtom {
    public static <V> void AudioAttributesCompatParcelizer(Mp4ExtractorExternalSyntheticLambda0<V> mp4ExtractorExternalSyntheticLambda0, maybeAdjustSeekOffset<? super V> maybeadjustseekoffset, Executor executor) {
        mp4ExtractorExternalSyntheticLambda0.IconCompatParcelizer(new read(mp4ExtractorExternalSyntheticLambda0, maybeadjustseekoffset), executor);
    }

    static final class read<V> implements Runnable {
        private maybeAdjustSeekOffset<? super V> AudioAttributesCompatParcelizer;
        private Future<V> read;

        read(Future<V> future, maybeAdjustSeekOffset<? super V> maybeadjustseekoffset) {
            this.read = future;
            this.AudioAttributesCompatParcelizer = maybeadjustseekoffset;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable thAudioAttributesCompatParcelizer;
            Future<V> future = this.read;
            if ((future instanceof nameToDataType) && (thAudioAttributesCompatParcelizer = checkForSefData.AudioAttributesCompatParcelizer((nameToDataType) future)) != null) {
                this.AudioAttributesCompatParcelizer.write(thAudioAttributesCompatParcelizer);
                return;
            }
            try {
                processEndOfStreamReadingAtomHeader.AudioAttributesCompatParcelizer(this.read);
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            } catch (ExecutionException e) {
                this.AudioAttributesCompatParcelizer.write(e.getCause());
            } catch (Throwable th) {
                this.AudioAttributesCompatParcelizer.write(th);
            }
        }

        public final String toString() {
            return parseStbl.AudioAttributesCompatParcelizer(this).read(this.AudioAttributesCompatParcelizer).toString();
        }
    }

    public static <V> V AudioAttributesCompatParcelizer(Future<V> future) throws ExecutionException {
        parseStsd.read(future.isDone(), "Future was expected to be done: %s", future);
        return (V) PsshAtomUtilPsshAtom.IconCompatParcelizer(future);
    }
}
