package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/lambdadecreaseDeviceVolume26;", "", "<init>", "(Ljava/lang/String;I)V", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdadecreaseDeviceVolume26 {
    private static final /* synthetic */ lambdadecreaseDeviceVolume26[] AudioAttributesCompatParcelizer;
    public static final lambdadecreaseDeviceVolume26 write = new lambdadecreaseDeviceVolume26("ENCRYPTED_AES", 0);
    public static final lambdadecreaseDeviceVolume26 RemoteActionCompatParcelizer = new lambdadecreaseDeviceVolume26("ENCRYPTED_AES_GCM", 1);
    public static final lambdadecreaseDeviceVolume26 IconCompatParcelizer = new lambdadecreaseDeviceVolume26("PLAIN_TEXT", 2);

    private lambdadecreaseDeviceVolume26(String str, int i) {
    }

    static {
        lambdadecreaseDeviceVolume26[] lambdadecreasedevicevolume26ArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer = lambdadecreasedevicevolume26ArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(lambdadecreasedevicevolume26ArrAudioAttributesCompatParcelizer);
    }

    public static lambdadecreaseDeviceVolume26 valueOf(String str) {
        return (lambdadecreaseDeviceVolume26) Enum.valueOf(lambdadecreaseDeviceVolume26.class, str);
    }

    public static lambdadecreaseDeviceVolume26[] values() {
        return (lambdadecreaseDeviceVolume26[]) AudioAttributesCompatParcelizer.clone();
    }

    private static final /* synthetic */ lambdadecreaseDeviceVolume26[] AudioAttributesCompatParcelizer() {
        return new lambdadecreaseDeviceVolume26[]{write, RemoteActionCompatParcelizer, IconCompatParcelizer};
    }
}
