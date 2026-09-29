package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public abstract class setCustomActionProviders {
    public abstract long IconCompatParcelizer();

    public abstract ExoMediaDrmProvider read();

    public abstract ExoMediaDrmOnEventListener write();

    public static setCustomActionProviders RemoteActionCompatParcelizer(long j, ExoMediaDrmProvider exoMediaDrmProvider, ExoMediaDrmOnEventListener exoMediaDrmOnEventListener) {
        return new registerCommandReceiver(j, exoMediaDrmProvider, exoMediaDrmOnEventListener);
    }
}
