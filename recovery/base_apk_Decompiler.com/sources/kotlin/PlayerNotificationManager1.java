package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/PlayerNotificationManager1;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "write", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlayerNotificationManager1 {
    private static final /* synthetic */ PlayerNotificationManager1[] AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int AudioAttributesImplBaseParcelizer = 1;
    public static final PlayerNotificationManager1 IconCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;
    public static final PlayerNotificationManager1 RemoteActionCompatParcelizer = new PlayerNotificationManager1("UNDEFINED", 0);
    public static final PlayerNotificationManager1 write = new PlayerNotificationManager1("LOW", 1);
    public static final PlayerNotificationManager1 read = new PlayerNotificationManager1("MEDIUM", 2);

    private PlayerNotificationManager1(String str, int i) {
    }

    static {
        PlayerNotificationManager1 playerNotificationManager1 = new PlayerNotificationManager1("HD", 3);
        int i = AudioAttributesImplBaseParcelizer;
        int i2 = (((i & (-78)) | ((~i) & 77)) - (~((i & 77) << 1))) - 1;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer = playerNotificationManager1;
        PlayerNotificationManager1[] playerNotificationManager1Arr = read();
        if (i3 != 0) {
            AudioAttributesCompatParcelizer = playerNotificationManager1Arr;
            getMagicModuleTimeline.IconCompatParcelizer(playerNotificationManager1Arr);
            throw null;
        }
        AudioAttributesCompatParcelizer = playerNotificationManager1Arr;
        getMagicModuleTimeline.IconCompatParcelizer(playerNotificationManager1Arr);
        int i4 = MediaBrowserCompatItemReceiver;
        int i5 = i4 ^ 49;
        int i6 = ((((i4 & 49) | i5) << 1) - (~(-i5))) - 1;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        int i8 = ((i4 & (-38)) | ((~i4) & 37)) + ((i4 & 37) << 1);
        AudioAttributesImplBaseParcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 19 / 0;
        }
    }

    private static final /* synthetic */ PlayerNotificationManager1[] read() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = (i2 & 73) + (i2 | 73);
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        PlayerNotificationManager1 playerNotificationManager1 = RemoteActionCompatParcelizer;
        PlayerNotificationManager1 playerNotificationManager12 = write;
        PlayerNotificationManager1 playerNotificationManager13 = read;
        PlayerNotificationManager1 playerNotificationManager14 = IconCompatParcelizer;
        int i4 = ((i2 ^ 8) + ((i2 & 8) << 1)) - 1;
        int i5 = i4 % 128;
        AudioAttributesImplApi21Parcelizer = i5;
        int i6 = i4 % 2;
        int i7 = ((i5 | 126) << 1) - (i5 ^ 126);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        AudioAttributesImplApi26Parcelizer = i8 % 128;
        int i9 = i8 % 2;
        PlayerNotificationManager1[] playerNotificationManager1Arr = {playerNotificationManager1, playerNotificationManager12, playerNotificationManager13, playerNotificationManager14};
        int i10 = i5 ^ 115;
        int i11 = ((i5 & 115) | i10) << 1;
        int i12 = -i10;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        AudioAttributesImplApi26Parcelizer = i13 % 128;
        if (i13 % 2 != 0) {
            return playerNotificationManager1Arr;
        }
        obj.hashCode();
        throw null;
    }

    public static PlayerNotificationManager1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 89;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        PlayerNotificationManager1 playerNotificationManager1 = (PlayerNotificationManager1) Enum.valueOf(PlayerNotificationManager1.class, str);
        int i4 = (-2) - ((AudioAttributesImplApi21Parcelizer + 80) ^ (-1));
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return playerNotificationManager1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PlayerNotificationManager1[] values() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 & 53;
        int i4 = (i2 ^ 53) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        PlayerNotificationManager1[] playerNotificationManager1Arr = (PlayerNotificationManager1[]) AudioAttributesCompatParcelizer.clone();
        int i7 = AudioAttributesImplApi21Parcelizer;
        int i8 = (((i7 ^ 71) | (i7 & 71)) << 1) - (((~i7) & 71) | (i7 & (-72)));
        AudioAttributesImplApi26Parcelizer = i8 % 128;
        if (i8 % 2 != 0) {
            return playerNotificationManager1Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
