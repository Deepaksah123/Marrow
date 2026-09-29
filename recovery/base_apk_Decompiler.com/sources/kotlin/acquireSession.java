package kotlin;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.DefaultDrmSessionExternalSyntheticLambda0;
import kotlin.getError;
import kotlin.maybeAcquirePlaceholderSession;

/* JADX INFO: loaded from: classes4.dex */
public class acquireSession<T extends maybeAcquirePlaceholderSession> implements getSchemeDatas {
    protected List<createAndAcquireSessionWithRetry> read = new ArrayList();
    protected T write;

    public acquireSession(T t) {
        this.write = t;
    }

    @Override // kotlin.getSchemeDatas
    public createAndAcquireSessionWithRetry RemoteActionCompatParcelizer(float f, float f2) {
        drmKeysRemoved drmkeysremovedAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f, f2);
        float f3 = (float) drmkeysremovedAudioAttributesCompatParcelizer.IconCompatParcelizer;
        drmKeysRemoved.IconCompatParcelizer(drmkeysremovedAudioAttributesCompatParcelizer);
        return write(f3, f, f2);
    }

    protected final drmKeysRemoved AudioAttributesCompatParcelizer(float f, float f2) {
        return this.write.write(getError.write.LEFT).IconCompatParcelizer(f, f2);
    }

    protected final createAndAcquireSessionWithRetry write(float f, float f2, float f3) {
        List<createAndAcquireSessionWithRetry> listIconCompatParcelizer = IconCompatParcelizer(f, f2, f3);
        if (listIconCompatParcelizer.isEmpty()) {
            return null;
        }
        return AudioAttributesCompatParcelizer(listIconCompatParcelizer, f2, f3, IconCompatParcelizer(listIconCompatParcelizer, f3, getError.write.LEFT) < IconCompatParcelizer(listIconCompatParcelizer, f3, getError.write.RIGHT) ? getError.write.LEFT : getError.write.RIGHT, this.write.onSetShuffleMode());
    }

    private static float IconCompatParcelizer(List<createAndAcquireSessionWithRetry> list, float f, getError.write writeVar) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            createAndAcquireSessionWithRetry createandacquiresessionwithretry = list.get(i);
            if (createandacquiresessionwithretry.AudioAttributesCompatParcelizer() == writeVar) {
                float fAbs = Math.abs(AudioAttributesCompatParcelizer(createandacquiresessionwithretry) - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }

    private static float AudioAttributesCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        return createandacquiresessionwithretry.AudioAttributesImplApi21Parcelizer();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.setPlayClearSamplesWithoutKeys] */
    protected List<createAndAcquireSessionWithRetry> IconCompatParcelizer(float f, float f2, float f3) {
        this.read.clear();
        onMediaDrmEvent onmediadrmeventIconCompatParcelizer = IconCompatParcelizer();
        if (onmediadrmeventIconCompatParcelizer == null) {
            return this.read;
        }
        int i = onmediadrmeventIconCompatParcelizer.read();
        for (int i2 = 0; i2 < i; i2++) {
            ?? RemoteActionCompatParcelizer = onmediadrmeventIconCompatParcelizer.RemoteActionCompatParcelizer(i2);
            if (RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                this.read.addAll(IconCompatParcelizer(RemoteActionCompatParcelizer, i2, f, DefaultDrmSessionExternalSyntheticLambda0.IconCompatParcelizer.CLOSEST));
            }
        }
        return this.read;
    }

    protected List<createAndAcquireSessionWithRetry> IconCompatParcelizer(setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeys, int i, float f, DefaultDrmSessionExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer) {
        Entry entry;
        ArrayList arrayList = new ArrayList();
        List<Entry> list = setplayclearsampleswithoutkeys.read(f);
        if (list.size() == 0 && (entry = setplayclearsampleswithoutkeys.read(f, Float.NaN, iconCompatParcelizer)) != null) {
            list = setplayclearsampleswithoutkeys.read(entry.MediaBrowserCompatCustomActionResultReceiver());
        }
        if (list.size() != 0) {
            for (Entry entry2 : list) {
                drmKeysRemoved drmkeysremovedRemoteActionCompatParcelizer = this.write.write(setplayclearsampleswithoutkeys.IconCompatParcelizer()).RemoteActionCompatParcelizer(entry2.MediaBrowserCompatCustomActionResultReceiver(), entry2.read());
                arrayList.add(new createAndAcquireSessionWithRetry(entry2.MediaBrowserCompatCustomActionResultReceiver(), entry2.read(), (float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer, (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, i, setplayclearsampleswithoutkeys.IconCompatParcelizer()));
            }
        }
        return arrayList;
    }

    private createAndAcquireSessionWithRetry AudioAttributesCompatParcelizer(List<createAndAcquireSessionWithRetry> list, float f, float f2, getError.write writeVar, float f3) {
        createAndAcquireSessionWithRetry createandacquiresessionwithretry = null;
        for (int i = 0; i < list.size(); i++) {
            createAndAcquireSessionWithRetry createandacquiresessionwithretry2 = list.get(i);
            if (writeVar == null || createandacquiresessionwithretry2.AudioAttributesCompatParcelizer() == writeVar) {
                float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(f, f2, createandacquiresessionwithretry2.AudioAttributesImplBaseParcelizer(), createandacquiresessionwithretry2.AudioAttributesImplApi21Parcelizer());
                if (fRemoteActionCompatParcelizer < f3) {
                    createandacquiresessionwithretry = createandacquiresessionwithretry2;
                    f3 = fRemoteActionCompatParcelizer;
                }
            }
        }
        return createandacquiresessionwithretry;
    }

    protected float RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f - f3, f2 - f4);
    }

    protected onMediaDrmEvent IconCompatParcelizer() {
        return this.write.AudioAttributesImplBaseParcelizer();
    }
}
