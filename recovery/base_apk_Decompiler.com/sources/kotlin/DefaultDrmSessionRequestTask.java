package kotlin;

import com.github.mikephil.charting.data.BarEntry;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultDrmSessionRequestTask extends acquireSession<releaseAllKeepaliveSessions> {
    public DefaultDrmSessionRequestTask(releaseAllKeepaliveSessions releaseallkeepalivesessions) {
        super(releaseallkeepalivesessions);
    }

    @Override // kotlin.acquireSession, kotlin.getSchemeDatas
    public createAndAcquireSessionWithRetry RemoteActionCompatParcelizer(float f, float f2) {
        createAndAcquireSessionWithRetry createandacquiresessionwithretryRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(f, f2);
        if (createandacquiresessionwithretryRemoteActionCompatParcelizer == null) {
            return null;
        }
        drmKeysRemoved drmkeysremovedAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f, f2);
        setLoadErrorHandlingPolicy setloaderrorhandlingpolicy = (setLoadErrorHandlingPolicy) ((releaseAllKeepaliveSessions) this.write).write().RemoteActionCompatParcelizer(createandacquiresessionwithretryRemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        if (setloaderrorhandlingpolicy.onRemoveQueueItemAt()) {
            return read(createandacquiresessionwithretryRemoteActionCompatParcelizer, setloaderrorhandlingpolicy, (float) drmkeysremovedAudioAttributesCompatParcelizer.IconCompatParcelizer, (float) drmkeysremovedAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        }
        drmKeysRemoved.IconCompatParcelizer(drmkeysremovedAudioAttributesCompatParcelizer);
        return createandacquiresessionwithretryRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final createAndAcquireSessionWithRetry read(createAndAcquireSessionWithRetry createandacquiresessionwithretry, setLoadErrorHandlingPolicy setloaderrorhandlingpolicy, float f, float f2) {
        BarEntry barEntry = (BarEntry) setloaderrorhandlingpolicy.read(f, f2);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.AudioAttributesCompatParcelizer() == null) {
            return createandacquiresessionwithretry;
        }
        initPlaybackLooper[] initplaybacklooperArrWrite = barEntry.write();
        if (initplaybacklooperArrWrite.length <= 0) {
            return null;
        }
        int i = read(initplaybacklooperArrWrite, f2);
        drmKeysRemoved drmkeysremovedRemoteActionCompatParcelizer = ((releaseAllKeepaliveSessions) this.write).write(setloaderrorhandlingpolicy.IconCompatParcelizer()).RemoteActionCompatParcelizer(createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver(), initplaybacklooperArrWrite[i].write);
        createAndAcquireSessionWithRetry createandacquiresessionwithretry2 = new createAndAcquireSessionWithRetry(barEntry.MediaBrowserCompatCustomActionResultReceiver(), barEntry.read(), (float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer, (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, createandacquiresessionwithretry.RemoteActionCompatParcelizer(), i, createandacquiresessionwithretry.AudioAttributesCompatParcelizer());
        drmKeysRemoved.IconCompatParcelizer(drmkeysremovedRemoteActionCompatParcelizer);
        return createandacquiresessionwithretry2;
    }

    private static int read(initPlaybackLooper[] initplaybacklooperArr, float f) {
        if (initplaybacklooperArr != null && initplaybacklooperArr.length != 0) {
            int i = 0;
            for (initPlaybackLooper initplaybacklooper : initplaybacklooperArr) {
                if (initplaybacklooper.IconCompatParcelizer(f)) {
                    return i;
                }
                i++;
            }
            int iMax = Math.max(initplaybacklooperArr.length - 1, 0);
            if (f > initplaybacklooperArr[iMax].write) {
                return iMax;
            }
        }
        return 0;
    }

    @Override // kotlin.acquireSession
    protected float RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    @Override // kotlin.acquireSession
    protected final onMediaDrmEvent IconCompatParcelizer() {
        return ((releaseAllKeepaliveSessions) this.write).write();
    }
}
