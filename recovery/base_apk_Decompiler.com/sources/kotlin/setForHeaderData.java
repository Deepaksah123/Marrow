package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setForHeaderData {
    public static final Object read(DefaultAudioSinkApi31 defaultAudioSinkApi31) {
        if (defaultAudioSinkApi31 instanceof Ac4Util) {
            return ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer;
        }
        if (defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround) {
            return null;
        }
        throw new RenewEligibleCreator();
    }

    public static final Object read(DefaultAudioSinkApi31 defaultAudioSinkApi31, Object obj) {
        if (defaultAudioSinkApi31 instanceof Ac4Util) {
            return ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer;
        }
        if (defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround) {
            return obj;
        }
        throw new RenewEligibleCreator();
    }
}
