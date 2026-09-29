package kotlin;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018"}, d2 = {"Lo/seekToNextMediaItem;", "", "Lo/CctBackendFactory;", "p0", "Lo/getCurrentWindowIndex;", "p1", "", "p2", "<init>", "(Lo/CctBackendFactory;Lo/getCurrentWindowIndex;J)V", "Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;", "", "IconCompatParcelizer", "(Lo/lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;)V", "AudioAttributesCompatParcelizer", "Lo/CctBackendFactory;", "write", "read", "Lo/getCurrentWindowIndex;", "J", "RemoteActionCompatParcelizer", "Ljava/lang/Object;", "", "Ljava/lang/Runnable;", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class seekToNextMediaItem {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final CctBackendFactory write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Map<lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener, Runnable> IconCompatParcelizer;
    private final getCurrentWindowIndex read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer;

    private seekToNextMediaItem(CctBackendFactory cctBackendFactory, getCurrentWindowIndex getcurrentwindowindex, long j) {
        toMagicModuleMetaRepoModel.write(cctBackendFactory, "");
        toMagicModuleMetaRepoModel.write(getcurrentwindowindex, "");
        this.write = cctBackendFactory;
        this.read = getcurrentwindowindex;
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = new Object();
        this.IconCompatParcelizer = new LinkedHashMap();
    }

    public /* synthetic */ seekToNextMediaItem(CctBackendFactory cctBackendFactory, getCurrentWindowIndex getcurrentwindowindex, long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(cctBackendFactory, getcurrentwindowindex, (i & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(seekToNextMediaItem seektonextmediaitem, lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener) {
        seektonextmediaitem.read.write(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistener, 3);
    }

    public final void IconCompatParcelizer(final lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Runnable runnable = new Runnable() { // from class: o.seekForward
            @Override // java.lang.Runnable
            public final void run() {
                seekToNextMediaItem.write(this.IconCompatParcelizer, p0);
            }
        };
        synchronized (this.AudioAttributesCompatParcelizer) {
            this.IconCompatParcelizer.put(p0, runnable);
        }
        this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer, runnable);
    }

    public final void AudioAttributesCompatParcelizer(lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener p0) {
        Runnable runnableRemove;
        toMagicModuleMetaRepoModel.write(p0, "");
        synchronized (this.AudioAttributesCompatParcelizer) {
            runnableRemove = this.IconCompatParcelizer.remove(p0);
        }
        if (runnableRemove != null) {
            this.write.read(runnableRemove);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public seekToNextMediaItem(CctBackendFactory cctBackendFactory, getCurrentWindowIndex getcurrentwindowindex) {
        this(cctBackendFactory, getcurrentwindowindex, 0L, 4, null);
        toMagicModuleMetaRepoModel.write(cctBackendFactory, "");
        toMagicModuleMetaRepoModel.write(getcurrentwindowindex, "");
    }
}
