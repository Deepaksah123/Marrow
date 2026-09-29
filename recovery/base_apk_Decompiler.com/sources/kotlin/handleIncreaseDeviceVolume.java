package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lo/handleIncreaseDeviceVolume;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class handleIncreaseDeviceVolume {
    private static final /* synthetic */ handleIncreaseDeviceVolume[] AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;
    public static final handleIncreaseDeviceVolume AudioAttributesImplApi26Parcelizer = new handleIncreaseDeviceVolume("STRING", 0, "string");
    public static final handleIncreaseDeviceVolume IconCompatParcelizer = new handleIncreaseDeviceVolume("BOOLEAN", 1, "boolean");
    public static final handleIncreaseDeviceVolume AudioAttributesCompatParcelizer = new handleIncreaseDeviceVolume("NUMBER", 2, "number");
    public static final handleIncreaseDeviceVolume read = new handleIncreaseDeviceVolume("FILE", 3, "file");
    public static final handleIncreaseDeviceVolume write = new handleIncreaseDeviceVolume("ACTION", 4, "action");

    private handleIncreaseDeviceVolume(String str, int i, String str2) {
        this.RemoteActionCompatParcelizer = str2;
    }

    static {
        handleIncreaseDeviceVolume[] handleincreasedevicevolumeArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesImplApi21Parcelizer = handleincreasedevicevolumeArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(handleincreasedevicevolumeArrAudioAttributesCompatParcelizer);
        INSTANCE = new Companion(null);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.RemoteActionCompatParcelizer;
    }

    public static handleIncreaseDeviceVolume valueOf(String str) {
        return (handleIncreaseDeviceVolume) Enum.valueOf(handleIncreaseDeviceVolume.class, str);
    }

    public static handleIncreaseDeviceVolume[] values() {
        return (handleIncreaseDeviceVolume[]) AudioAttributesImplApi21Parcelizer.clone();
    }

    private static final /* synthetic */ handleIncreaseDeviceVolume[] AudioAttributesCompatParcelizer() {
        return new handleIncreaseDeviceVolume[]{AudioAttributesImplApi26Parcelizer, IconCompatParcelizer, AudioAttributesCompatParcelizer, read, write};
    }
}
