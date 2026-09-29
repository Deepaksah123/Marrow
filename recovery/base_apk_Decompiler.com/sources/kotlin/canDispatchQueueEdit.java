package kotlin;

import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.getSeekMap;

/* JADX INFO: loaded from: classes5.dex */
public final class canDispatchQueueEdit {
    private final getMediaSessionPlaybackState AudioAttributesCompatParcelizer;
    private final Executor IconCompatParcelizer;
    private final invalidateMediaSessionQueue RemoteActionCompatParcelizer;
    private final getSeekMap read;

    @setSdkPayload
    canDispatchQueueEdit(Executor executor, invalidateMediaSessionQueue invalidatemediasessionqueue, getMediaSessionPlaybackState getmediasessionplaybackstate, getSeekMap getseekmap) {
        this.IconCompatParcelizer = executor;
        this.RemoteActionCompatParcelizer = invalidatemediasessionqueue;
        this.AudioAttributesCompatParcelizer = getmediasessionplaybackstate;
        this.read = getseekmap;
    }

    public final void write() {
        this.IconCompatParcelizer.execute(new Runnable() { // from class: o.canDispatchPlaybackAction
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer() {
        this.read.read(new getSeekMap.RemoteActionCompatParcelizer() { // from class: o.canDispatchToPlaybackPreparer
            @Override // o.getSeekMap.RemoteActionCompatParcelizer
            public final Object RemoteActionCompatParcelizer() {
                return this.write.RemoteActionCompatParcelizer();
            }
        });
    }

    final /* synthetic */ Object RemoteActionCompatParcelizer() {
        Iterator<ExoMediaDrmProvider> it = this.RemoteActionCompatParcelizer.read().iterator();
        while (it.hasNext()) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(it.next(), 1);
        }
        return null;
    }
}
