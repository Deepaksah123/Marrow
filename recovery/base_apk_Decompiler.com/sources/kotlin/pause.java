package kotlin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class pause {
    private static final String write;

    static {
        String strWrite = n.write("WorkerWrapper");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        write = strWrite;
    }

    public static final <T> Object read(Mp4ExtractorExternalSyntheticLambda0<T> mp4ExtractorExternalSyntheticLambda0, j jVar, SampleVideos<? super T> sampleVideos) throws Throwable {
        try {
            if (mp4ExtractorExternalSyntheticLambda0.isDone()) {
                return write(mp4ExtractorExternalSyntheticLambda0);
            }
            setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
            setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
            setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
            mp4ExtractorExternalSyntheticLambda0.IconCompatParcelizer(new onAudioFocusChange(mp4ExtractorExternalSyntheticLambda0, setstatesolvedcount2), g.write);
            setstatesolvedcount2.write((getAnswerMap<? super Throwable, getShowPopup>) new read(jVar, mp4ExtractorExternalSyntheticLambda0));
            Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
            if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objAudioAttributesCompatParcelizer;
        } catch (ExecutionException e) {
            throw write(e);
        }
    }

    static final class read implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ Mp4ExtractorExternalSyntheticLambda0<T> RemoteActionCompatParcelizer;
        final /* synthetic */ j read;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            read(th);
            return getShowPopup.INSTANCE;
        }

        private void read(Throwable th) {
            if (th instanceof isCurrentMediaItemLive) {
                this.read.AudioAttributesCompatParcelizer(((isCurrentMediaItemLive) th).write());
            }
            this.RemoteActionCompatParcelizer.cancel(false);
        }

        read(j jVar, Mp4ExtractorExternalSyntheticLambda0<T> mp4ExtractorExternalSyntheticLambda0) {
            this.read = jVar;
            this.RemoteActionCompatParcelizer = mp4ExtractorExternalSyntheticLambda0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V write(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable write(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        toMagicModuleMetaRepoModel.write((Object) cause);
        return cause;
    }
}
