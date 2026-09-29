package kotlin;

import com.marrow.data.models.common.NetworkStat;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getVariantWithAudioGroup implements getSubjectTitle {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    private /* synthetic */ NetworkStat read;

    public /* synthetic */ getVariantWithAudioGroup(NetworkStat networkStat) {
        this.read = networkStat;
    }

    public static int IconCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 8326528;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        IconCompatParcelizer = iMaxMemory;
        return iMaxMemory;
    }

    @Override // kotlin.getSubjectTitle
    public final Object apply(Object obj) {
        return getPlaylistProtectionSchemes.RemoteActionCompatParcelizer(this.read);
    }
}
