package kotlin;

import in.juspay.hyper.constants.LogCategory;
import kotlin.CurrentQuery;
import kotlin.Metadata;
import kotlin.getPlatform;
import kotlin.getPlaybackInterval;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0017J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\u0010\u001a\u00060\u0012j\u0002`\u0011H&¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\u0010\u001a\u00060\u0012j\u0002`\u0011H\u0017¢\u0006\u0002\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016J\u0012\u0010\u0019\u001a\u00020\u000f2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0016J\u0011\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u001c\u001a\u00020\rH\u0016¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "<init>", "()V", "isDispatchNeeded", "", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "limitedParallelism", "parallelism", "", "name", "", "dispatch", "", "block", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "releaseInterceptedContinuation", "plus", "other", "toString", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getPlatform extends getUnderrunThreshold implements getPlaybackInterval {
    public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer(null);

    public boolean IconCompatParcelizer(CurrentQuery currentQuery) {
        return true;
    }

    public abstract void RemoteActionCompatParcelizer(CurrentQuery currentQuery, Runnable runnable);

    @Override // kotlin.getUnderrunThreshold, o.CurrentQuery.write, kotlin.CurrentQuery
    public <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) getPlaybackInterval.DefaultImpls.get(this, iconCompatParcelizer);
    }

    @Override // kotlin.getUnderrunThreshold, o.CurrentQuery.write, kotlin.CurrentQuery
    public CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return getPlaybackInterval.DefaultImpls.minusKey(this, iconCompatParcelizer);
    }

    public getPlatform() {
        super(getPlaybackInterval.INSTANCE);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/getPlatform$AudioAttributesCompatParcelizer;", "Lo/PlaybackSettingsCompanion;", "Lo/getPlaybackInterval;", "Lo/getPlatform;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends PlaybackSettingsCompanion<getPlaybackInterval, getPlatform> {
        private AudioAttributesCompatParcelizer() {
            super(getPlaybackInterval.INSTANCE, new getAnswerMap() { // from class: o.TestSubjectStat
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getPlatform.AudioAttributesCompatParcelizer.read((CurrentQuery.write) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getPlatform read(CurrentQuery.write writeVar) {
            if (writeVar instanceof getPlatform) {
                return (getPlatform) writeVar;
            }
            return null;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static /* synthetic */ getPlatform write(getPlatform getplatform, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return getplatform.read(i, str);
    }

    public getPlatform read(int i, String str) {
        setPbSessionId.AudioAttributesCompatParcelizer(i);
        return new setPauseCount(this, i, str);
    }

    @getRenewGrpId
    public /* synthetic */ getPlatform IconCompatParcelizer(int i) {
        return read(i, null);
    }

    public void AudioAttributesCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        RemoteActionCompatParcelizer(currentQuery, runnable);
    }

    @Override // kotlin.getPlaybackInterval
    public final <T> SampleVideos<T> RemoteActionCompatParcelizer(SampleVideos<? super T> sampleVideos) {
        return new setInternetConnected(this, sampleVideos);
    }

    @Override // kotlin.getPlaybackInterval
    public final void AudioAttributesCompatParcelizer(SampleVideos<?> sampleVideos) {
        toMagicModuleMetaRepoModel.read(sampleVideos, "");
        ((setInternetConnected) sampleVideos).read();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isVerified.read(this));
        sb.append('@');
        sb.append(isVerified.IconCompatParcelizer(this));
        return sb.toString();
    }
}
