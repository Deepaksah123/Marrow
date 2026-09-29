package kotlin;

import java.util.List;
import kotlin.DefaultDrmSessionExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDrmSessionUnexpectedDrmSessionException extends acquireSession<preacquireSession> {
    private DefaultDrmSessionRequestTask IconCompatParcelizer;

    public DefaultDrmSessionUnexpectedDrmSessionException(preacquireSession preacquiresession, releaseAllKeepaliveSessions releaseallkeepalivesessions) {
        super(preacquiresession);
        this.IconCompatParcelizer = releaseallkeepalivesessions.write() == null ? null : new DefaultDrmSessionRequestTask(releaseallkeepalivesessions);
    }

    @Override // kotlin.acquireSession
    protected final List<createAndAcquireSessionWithRetry> IconCompatParcelizer(float f, float f2, float f3) {
        this.read.clear();
        List<onMediaDrmEvent> listAudioAttributesCompatParcelizer = ((preacquireSession) this.write).MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer();
        for (int i = 0; i < listAudioAttributesCompatParcelizer.size(); i++) {
            onMediaDrmEvent onmediadrmevent = listAudioAttributesCompatParcelizer.get(i);
            DefaultDrmSessionRequestTask defaultDrmSessionRequestTask = this.IconCompatParcelizer;
            if (defaultDrmSessionRequestTask != null && (onmediadrmevent instanceof getCryptoConfig)) {
                createAndAcquireSessionWithRetry createandacquiresessionwithretryRemoteActionCompatParcelizer = defaultDrmSessionRequestTask.RemoteActionCompatParcelizer(f2, f3);
                if (createandacquiresessionwithretryRemoteActionCompatParcelizer != null) {
                    createandacquiresessionwithretryRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i);
                    this.read.add(createandacquiresessionwithretryRemoteActionCompatParcelizer);
                }
            } else {
                int i2 = onmediadrmevent.read();
                for (int i3 = 0; i3 < i2; i3++) {
                    setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeysRemoteActionCompatParcelizer = listAudioAttributesCompatParcelizer.get(i).RemoteActionCompatParcelizer(i3);
                    if (setplayclearsampleswithoutkeysRemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                        for (createAndAcquireSessionWithRetry createandacquiresessionwithretry : IconCompatParcelizer(setplayclearsampleswithoutkeysRemoteActionCompatParcelizer, i3, f, DefaultDrmSessionExternalSyntheticLambda0.IconCompatParcelizer.CLOSEST)) {
                            createandacquiresessionwithretry.AudioAttributesCompatParcelizer(i);
                            this.read.add(createandacquiresessionwithretry);
                        }
                    }
                }
            }
        }
        return this.read;
    }
}
