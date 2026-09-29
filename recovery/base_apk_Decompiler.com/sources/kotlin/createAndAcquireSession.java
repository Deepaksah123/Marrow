package kotlin;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.DefaultDrmSessionExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class createAndAcquireSession extends DefaultDrmSessionRequestTask {
    public createAndAcquireSession(releaseAllKeepaliveSessions releaseallkeepalivesessions) {
        super(releaseallkeepalivesessions);
    }

    @Override // kotlin.DefaultDrmSessionRequestTask, kotlin.acquireSession, kotlin.getSchemeDatas
    public final createAndAcquireSessionWithRetry RemoteActionCompatParcelizer(float f, float f2) {
        getCryptoConfig getcryptoconfigWrite = ((releaseAllKeepaliveSessions) this.write).write();
        drmKeysRemoved drmkeysremovedAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f2, f);
        createAndAcquireSessionWithRetry createandacquiresessionwithretryWrite = write((float) drmkeysremovedAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, f2, f);
        if (createandacquiresessionwithretryWrite == null) {
            return null;
        }
        setLoadErrorHandlingPolicy setloaderrorhandlingpolicy = (setLoadErrorHandlingPolicy) getcryptoconfigWrite.RemoteActionCompatParcelizer(createandacquiresessionwithretryWrite.RemoteActionCompatParcelizer());
        if (setloaderrorhandlingpolicy.onRemoveQueueItemAt()) {
            return read(createandacquiresessionwithretryWrite, setloaderrorhandlingpolicy, (float) drmkeysremovedAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, (float) drmkeysremovedAudioAttributesCompatParcelizer.IconCompatParcelizer);
        }
        drmKeysRemoved.IconCompatParcelizer(drmkeysremovedAudioAttributesCompatParcelizer);
        return createandacquiresessionwithretryWrite;
    }

    @Override // kotlin.acquireSession
    protected final List<createAndAcquireSessionWithRetry> IconCompatParcelizer(setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeys, int i, float f, DefaultDrmSessionExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer) {
        Entry entry;
        ArrayList arrayList = new ArrayList();
        List<Entry> list = setplayclearsampleswithoutkeys.read(f);
        if (list.size() == 0 && (entry = setplayclearsampleswithoutkeys.read(f, Float.NaN, iconCompatParcelizer)) != null) {
            list = setplayclearsampleswithoutkeys.read(entry.MediaBrowserCompatCustomActionResultReceiver());
        }
        if (list.size() != 0) {
            for (Entry entry2 : list) {
                drmKeysRemoved drmkeysremovedRemoteActionCompatParcelizer = ((releaseAllKeepaliveSessions) this.write).write(setplayclearsampleswithoutkeys.IconCompatParcelizer()).RemoteActionCompatParcelizer(entry2.read(), entry2.MediaBrowserCompatCustomActionResultReceiver());
                arrayList.add(new createAndAcquireSessionWithRetry(entry2.MediaBrowserCompatCustomActionResultReceiver(), entry2.read(), (float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer, (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, i, setplayclearsampleswithoutkeys.IconCompatParcelizer()));
            }
        }
        return arrayList;
    }

    @Override // kotlin.DefaultDrmSessionRequestTask, kotlin.acquireSession
    protected final float RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }
}
