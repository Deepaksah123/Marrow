package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/BandwidthMeter;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "read", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BandwidthMeter {
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static final /* synthetic */ BandwidthMeter[] RemoteActionCompatParcelizer;
    public static final BandwidthMeter write;
    public static final BandwidthMeter AudioAttributesCompatParcelizer = new BandwidthMeter("CRITICAL", 0);
    public static final BandwidthMeter read = new BandwidthMeter("BLOCKING", 1);

    private BandwidthMeter(String str, int i) {
    }

    static {
        BandwidthMeter bandwidthMeter = new BandwidthMeter("NORMAL", 2);
        int i = MediaBrowserCompatCustomActionResultReceiver;
        int i2 = (i ^ 121) + ((i & 121) << 1);
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        write = bandwidthMeter;
        BandwidthMeter[] bandwidthMeterArrIconCompatParcelizer = IconCompatParcelizer();
        if (i3 == 0) {
            RemoteActionCompatParcelizer = bandwidthMeterArrIconCompatParcelizer;
            throw null;
        }
        RemoteActionCompatParcelizer = bandwidthMeterArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(bandwidthMeterArrIconCompatParcelizer);
        int i4 = AudioAttributesImplApi26Parcelizer;
        int i5 = (i4 ^ 113) + ((i4 & 113) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final /* synthetic */ BandwidthMeter[] IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = ((i2 ^ 9) | (i2 & 9)) << 1;
        int i4 = -(((~i2) & 9) | (i2 & (-10)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        IconCompatParcelizer = i6;
        int i7 = i5 % 2;
        BandwidthMeter bandwidthMeter = AudioAttributesCompatParcelizer;
        BandwidthMeter bandwidthMeter2 = read;
        BandwidthMeter bandwidthMeter3 = write;
        BandwidthMeter[] bandwidthMeterArr = new BandwidthMeter[3];
        int i8 = i6 & 43;
        int i9 = i8 + ((i6 ^ 43) | i8);
        AudioAttributesImplApi21Parcelizer = i9 % 128;
        if (i9 % 2 == 0) {
            bandwidthMeterArr[0] = bandwidthMeter;
            bandwidthMeterArr[1] = bandwidthMeter2;
            bandwidthMeterArr[2] = bandwidthMeter3;
        } else {
            bandwidthMeterArr[0] = bandwidthMeter;
            bandwidthMeterArr[1] = bandwidthMeter2;
            bandwidthMeterArr[2] = bandwidthMeter3;
        }
        int i10 = ((i6 & (-114)) | ((~i6) & 113)) + ((i6 & 113) << 1);
        AudioAttributesImplApi21Parcelizer = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 94 / 0;
        }
        return bandwidthMeterArr;
    }

    public static BandwidthMeter valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        BandwidthMeter bandwidthMeter = (BandwidthMeter) Enum.valueOf(BandwidthMeter.class, str);
        if (i3 != 0) {
            return bandwidthMeter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BandwidthMeter[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = (i2 & 105) + (i2 | 105);
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        BandwidthMeter[] bandwidthMeterArr = RemoteActionCompatParcelizer;
        if (i4 != 0) {
            return (BandwidthMeter[]) bandwidthMeterArr.clone();
        }
        throw null;
    }
}
