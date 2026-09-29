package kotlin;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface invalidateMediaSessionQueue extends Closeable {
    void AudioAttributesCompatParcelizer(Iterable<setCustomActionProviders> iterable);

    Iterable<setCustomActionProviders> IconCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider);

    void IconCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider, long j);

    setCustomActionProviders RemoteActionCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider, ExoMediaDrmOnEventListener exoMediaDrmOnEventListener);

    void RemoteActionCompatParcelizer(Iterable<setCustomActionProviders> iterable);

    long read(ExoMediaDrmProvider exoMediaDrmProvider);

    Iterable<ExoMediaDrmProvider> read();

    int write();

    boolean write(ExoMediaDrmProvider exoMediaDrmProvider);
}
