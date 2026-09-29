package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public class getPlayingPeriod extends notifyQueueUpdate<getPlayingPeriod> {
    public static getPlayingPeriod AudioAttributesCompatParcelizer(setDrmSessionForClearTypes setdrmsessionforcleartypes) {
        return new getPlayingPeriod().IconCompatParcelizer(setdrmsessionforcleartypes);
    }

    public static getPlayingPeriod write(onVolumeChanged onvolumechanged) {
        return new getPlayingPeriod().IconCompatParcelizer(onvolumechanged);
    }

    public static getPlayingPeriod RemoteActionCompatParcelizer(Class<?> cls) {
        return new getPlayingPeriod().write(cls);
    }

    @Override // kotlin.notifyQueueUpdate
    public boolean equals(Object obj) {
        return (obj instanceof getPlayingPeriod) && super.equals(obj);
    }

    @Override // kotlin.notifyQueueUpdate
    public int hashCode() {
        return super.hashCode();
    }
}
