package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class unregisterCommandReceiver implements FrameworkMediaDrmExternalSyntheticLambda3<canDispatchQueueEdit> {
    private final setDescriptionList<invalidateMediaSessionQueue> AudioAttributesCompatParcelizer;
    private final setDescriptionList<Executor> IconCompatParcelizer;
    private final setDescriptionList<getSeekMap> RemoteActionCompatParcelizer;
    private final setDescriptionList<getMediaSessionPlaybackState> write;

    private unregisterCommandReceiver(setDescriptionList<Executor> setdescriptionlist, setDescriptionList<invalidateMediaSessionQueue> setdescriptionlist2, setDescriptionList<getMediaSessionPlaybackState> setdescriptionlist3, setDescriptionList<getSeekMap> setdescriptionlist4) {
        this.IconCompatParcelizer = setdescriptionlist;
        this.AudioAttributesCompatParcelizer = setdescriptionlist2;
        this.write = setdescriptionlist3;
        this.RemoteActionCompatParcelizer = setdescriptionlist4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public canDispatchQueueEdit get() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer.get(), this.AudioAttributesCompatParcelizer.get(), this.write.get(), this.RemoteActionCompatParcelizer.get());
    }

    public static unregisterCommandReceiver IconCompatParcelizer(setDescriptionList<Executor> setdescriptionlist, setDescriptionList<invalidateMediaSessionQueue> setdescriptionlist2, setDescriptionList<getMediaSessionPlaybackState> setdescriptionlist3, setDescriptionList<getSeekMap> setdescriptionlist4) {
        return new unregisterCommandReceiver(setdescriptionlist, setdescriptionlist2, setdescriptionlist3, setdescriptionlist4);
    }

    private static canDispatchQueueEdit AudioAttributesCompatParcelizer(Executor executor, invalidateMediaSessionQueue invalidatemediasessionqueue, getMediaSessionPlaybackState getmediasessionplaybackstate, getSeekMap getseekmap) {
        return new canDispatchQueueEdit(executor, invalidatemediasessionqueue, getmediasessionplaybackstate, getseekmap);
    }
}
