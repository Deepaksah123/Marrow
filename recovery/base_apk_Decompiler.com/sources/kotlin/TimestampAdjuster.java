package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampAdjuster {
    public static final popFirst RemoteActionCompatParcelizer(toBundleList tobundlelist) {
        toMagicModuleMetaRepoModel.write(tobundlelist, "");
        return new popFirst(tobundlelist.getRead(), tobundlelist.getRemoteActionCompatParcelizer(), tobundlelist.getAudioAttributesCompatParcelizer(), tobundlelist.getWrite(), tobundlelist.getIconCompatParcelizer(), tobundlelist.getMediaBrowserCompatItemReceiver(), tobundlelist.getAudioAttributesImplApi21Parcelizer(), tobundlelist.getAudioAttributesImplApi26Parcelizer(), tobundlelist.getAudioAttributesImplBaseParcelizer());
    }

    public static final toBundleList IconCompatParcelizer(popFirst popfirst) {
        toMagicModuleMetaRepoModel.write(popfirst, "");
        int write = popfirst.getWrite();
        long audioAttributesCompatParcelizer = popfirst.getAudioAttributesCompatParcelizer();
        String remoteActionCompatParcelizer = popfirst.getRemoteActionCompatParcelizer();
        String iconCompatParcelizer = popfirst.getIconCompatParcelizer();
        String read = popfirst.getRead();
        String audioAttributesImplApi21Parcelizer = popfirst.getAudioAttributesImplApi21Parcelizer();
        String mediaBrowserCompatItemReceiver = popfirst.getMediaBrowserCompatItemReceiver();
        String str = mediaBrowserCompatItemReceiver == null ? "" : mediaBrowserCompatItemReceiver;
        String audioAttributesImplApi26Parcelizer = popfirst.getAudioAttributesImplApi26Parcelizer();
        return new toBundleList(write, audioAttributesCompatParcelizer, remoteActionCompatParcelizer, iconCompatParcelizer, read, audioAttributesImplApi21Parcelizer, str, audioAttributesImplApi26Parcelizer == null ? "" : audioAttributesImplApi26Parcelizer, popfirst.getMediaBrowserCompatCustomActionResultReceiver());
    }
}
