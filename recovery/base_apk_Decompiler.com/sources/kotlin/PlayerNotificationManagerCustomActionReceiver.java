package kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/PlayerNotificationManagerCustomActionReceiver;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "courseId", "Ljava/lang/String;", "configHash"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlayerNotificationManagerCustomActionReceiver {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    @JsonProperty("config_hash")
    private final String configHash;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private final String courseId;

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i6 | i7;
        int i9 = (~(i5 | i3)) | i6;
        int i10 = ~i5;
        int i11 = (~(i3 | i5 | i6)) | (~(i7 | i10)) | (~((~i6) | i10));
        int i12 = i5 + i6 + i + (1609234610 * i4) + (1307081305 * i2);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i5) - 1772093440) + (1576585830 * i6) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i) + ((-2101346304) * i4) + (23068672 * i2) + ((-2103967744) * i13);
        int i15 = (i5 * 273352028) + 245730370 + (i6 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i * 273352337) + (i4 * (-770635566)) + (i2 * (-73506199)) + (i13 * (-2011693056));
        return i14 + ((i15 * i15) * 1080557568) != 1 ? read(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    public PlayerNotificationManagerCustomActionReceiver(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.courseId = str;
        this.configHash = str2;
    }

    public final boolean equals(Object p0) {
        int iRemoteActionCompatParcelizer = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
        return ((Boolean) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, new Object[]{this, p0}, -2118524772, 2118524772)).booleanValue();
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
        return ((Integer) AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, new Object[]{this}, 177633284, -177633283)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.courseId;
        String str2 = this.configHash;
        StringBuilder sb = new StringBuilder("PlayerNotificationManagerCustomActionReceiver(courseId=");
        int i2 = IconCompatParcelizer;
        int i3 = i2 & 103;
        int i4 = i3 + ((i2 ^ 103) | i3);
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        sb.append(str);
        sb.append(", configHash=");
        if (i5 == 0) {
            sb.append(str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sb.append(str2);
        int i6 = IconCompatParcelizer;
        int i7 = ((i6 ^ 10) + ((i6 & 10) << 1)) - 1;
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        sb.append(")");
        String string = sb.toString();
        int i9 = RemoteActionCompatParcelizer;
        int i10 = i9 & 7;
        int i11 = (i9 ^ 7) | i10;
        int i12 = (i10 & i11) + (i11 | i10);
        IconCompatParcelizer = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 16 / 0;
        }
        return string;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        PlayerNotificationManagerCustomActionReceiver playerNotificationManagerCustomActionReceiver = (PlayerNotificationManagerCustomActionReceiver) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = (i2 & 99) + (i2 | 99);
        int i4 = i3 % 128;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (playerNotificationManagerCustomActionReceiver == obj) {
            int i6 = i4 + 81;
            IconCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ((i4 ^ 29) - (~(-(-((i4 & 29) << 1))))) - 1;
            IconCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        Object obj2 = null;
        if (!(obj instanceof PlayerNotificationManagerCustomActionReceiver)) {
            int i10 = i4 & 77;
            int i11 = (i4 ^ 77) | i10;
            int i12 = (i10 & i11) + (i10 | i11);
            IconCompatParcelizer = i12 % 128;
            int i13 = i12 % 2;
            int i14 = (((i4 | 76) << 1) - (i4 ^ 76)) - 1;
            IconCompatParcelizer = i14 % 128;
            if (i14 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        PlayerNotificationManagerCustomActionReceiver playerNotificationManagerCustomActionReceiver2 = (PlayerNotificationManagerCustomActionReceiver) obj;
        String str = playerNotificationManagerCustomActionReceiver.courseId;
        String str2 = playerNotificationManagerCustomActionReceiver2.courseId;
        int i15 = (i4 & (-88)) | ((~i4) & 87);
        int i16 = -(-((i4 & 87) << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        IconCompatParcelizer = i17 % 128;
        if (i17 % 2 != 0) {
            toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2);
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
            int i18 = RemoteActionCompatParcelizer;
            int i19 = (i18 & 23) + (i18 | 23);
            IconCompatParcelizer = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i18 & 55;
            int i22 = (i18 ^ 55) | i21;
            int i23 = (i21 & i22) + (i22 | i21);
            IconCompatParcelizer = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 58 / 0;
            }
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) playerNotificationManagerCustomActionReceiver.configHash, (Object) playerNotificationManagerCustomActionReceiver2.configHash)) {
            int i25 = IconCompatParcelizer;
            int i26 = ((i25 & 50) + (i25 | 50)) - 1;
            RemoteActionCompatParcelizer = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 81 / 0;
            }
            return true;
        }
        int i28 = IconCompatParcelizer;
        int i29 = i28 & 45;
        int i30 = (~i29) & (i28 | 45);
        int i31 = i29 << 1;
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        RemoteActionCompatParcelizer = i32 % 128;
        int i33 = i32 % 2;
        int i34 = i28 & 67;
        int i35 = ((((i28 ^ 67) | i34) << 1) - (~(-((i28 | 67) & (~i34))))) - 1;
        RemoteActionCompatParcelizer = i35 % 128;
        if (i35 % 2 == 0) {
            int i36 = 58 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        int i;
        int i2;
        PlayerNotificationManagerCustomActionReceiver playerNotificationManagerCustomActionReceiver = (PlayerNotificationManagerCustomActionReceiver) objArr[0];
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode = playerNotificationManagerCustomActionReceiver.courseId.hashCode() * 31;
        String str = playerNotificationManagerCustomActionReceiver.configHash;
        int i6 = IconCompatParcelizer;
        int i7 = i6 & 47;
        int i8 = (i6 | 47) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 & i9) + (i8 | i9);
        RemoteActionCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode2 = str.hashCode();
        if (i11 == 0) {
            int i12 = -(-iHashCode2);
            i = ((~i12) & iHashCode) | ((~iHashCode) & i12);
            i2 = -(-((i12 & iHashCode) << 1));
        } else {
            i = iHashCode ^ iHashCode2;
            i2 = (iHashCode2 & iHashCode) << 1;
        }
        return Integer.valueOf((i - (~i2)) - 1);
    }
}
