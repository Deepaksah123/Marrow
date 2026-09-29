package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mayHandleBuffer {
    public static final DefaultAudioSinkApi31 RemoteActionCompatParcelizer(DefaultAudioSinkApi31 defaultAudioSinkApi31) throws Throwable {
        Object obj;
        if (defaultAudioSinkApi31 instanceof Ac4Util) {
            obj = null;
        } else {
            if (!(defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            obj = ((codecNeedsDiscardChannelsWorkaround) defaultAudioSinkApi31).IconCompatParcelizer;
        }
        Throwable th = (Throwable) obj;
        if (th == null || !(th instanceof InterruptedException)) {
            return defaultAudioSinkApi31;
        }
        throw th;
    }
}
