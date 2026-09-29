package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class downloadLicense implements FrameworkMediaDrmExternalSyntheticLambda3<MediaDrmCallbackException> {
    private final setDescriptionList<isCryptoSchemeSupported> AudioAttributesCompatParcelizer;
    private final setDescriptionList<Executor> IconCompatParcelizer;
    private final setDescriptionList<getSeekMap> RemoteActionCompatParcelizer;
    private final setDescriptionList<invalidateMediaSessionQueue> read;
    private final setDescriptionList<getMediaSessionPlaybackState> write;

    private downloadLicense(setDescriptionList<Executor> setdescriptionlist, setDescriptionList<isCryptoSchemeSupported> setdescriptionlist2, setDescriptionList<getMediaSessionPlaybackState> setdescriptionlist3, setDescriptionList<invalidateMediaSessionQueue> setdescriptionlist4, setDescriptionList<getSeekMap> setdescriptionlist5) {
        this.IconCompatParcelizer = setdescriptionlist;
        this.AudioAttributesCompatParcelizer = setdescriptionlist2;
        this.write = setdescriptionlist3;
        this.read = setdescriptionlist4;
        this.RemoteActionCompatParcelizer = setdescriptionlist5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public MediaDrmCallbackException get() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer.get(), this.AudioAttributesCompatParcelizer.get(), this.write.get(), this.read.get(), this.RemoteActionCompatParcelizer.get());
    }

    public static downloadLicense AudioAttributesCompatParcelizer(setDescriptionList<Executor> setdescriptionlist, setDescriptionList<isCryptoSchemeSupported> setdescriptionlist2, setDescriptionList<getMediaSessionPlaybackState> setdescriptionlist3, setDescriptionList<invalidateMediaSessionQueue> setdescriptionlist4, setDescriptionList<getSeekMap> setdescriptionlist5) {
        return new downloadLicense(setdescriptionlist, setdescriptionlist2, setdescriptionlist3, setdescriptionlist4, setdescriptionlist5);
    }

    private static MediaDrmCallbackException AudioAttributesCompatParcelizer(Executor executor, isCryptoSchemeSupported iscryptoschemesupported, getMediaSessionPlaybackState getmediasessionplaybackstate, invalidateMediaSessionQueue invalidatemediasessionqueue, getSeekMap getseekmap) {
        return new MediaDrmCallbackException(executor, iscryptoschemesupported, getmediasessionplaybackstate, invalidatemediasessionqueue, getseekmap);
    }
}
