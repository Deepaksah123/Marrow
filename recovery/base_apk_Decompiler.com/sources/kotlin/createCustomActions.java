package kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.Metadata;
import kotlin.getDownloadRequest;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/createCustomActions;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "courseId", "Ljava/lang/String;", "configHash"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class createCustomActions {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int read;

    @JsonProperty("config_hash")
    private final String configHash;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private final String courseId;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = i8 | i5;
        int i10 = (~(i7 | i8)) | (~(i7 | i5)) | (~i9);
        int i11 = ~i5;
        int i12 = (~(i3 | i11 | i)) | (~(i7 | i11 | i8)) | (~(i9 | i));
        int i13 = ~(i8 | i11 | i);
        int i14 = i5 + i + i4 + ((-973178360) * i6) + (1542423572 * i2);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i5) - 1073741824) + ((-187520530) * i) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i4) + (1207959552 * i6) + ((-1275068416) * i2) + (196542464 * i15);
        int i17 = (i5 * (-490823948)) + 944362368 + (i * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i4 * (-490822951)) + (i6 * 2145288392) + (i2 * 779328756) + (i15 * (-1138819072));
        return i16 + ((i17 * i17) * 1440284672) != 1 ? read(objArr) : IconCompatParcelizer(objArr);
    }

    public createCustomActions(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.courseId = str;
        this.configHash = str2;
    }

    public final boolean equals(Object p0) {
        int iRemoteActionCompatParcelizer = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        return ((Boolean) RemoteActionCompatParcelizer(943159266, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, -943159266, new Object[]{this, p0}, iRemoteActionCompatParcelizer3)).booleanValue();
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        return ((Integer) RemoteActionCompatParcelizer(2101420253, getDownloadRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, -2101420252, new Object[]{this}, iRemoteActionCompatParcelizer3)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.courseId;
        String str2 = this.configHash;
        StringBuilder sb = new StringBuilder("createCustomActions(courseId=");
        int i2 = read;
        int i3 = i2 ^ 73;
        int i4 = -(-((i2 & 73) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        AudioAttributesCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        sb.append(str);
        sb.append(", configHash=");
        sb.append(str2);
        int i7 = AudioAttributesCompatParcelizer;
        int i8 = i7 ^ 103;
        int i9 = -(-((i7 & 103) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        read = i10 % 128;
        int i11 = i10 % 2;
        sb.append(")");
        if (i11 != 0) {
            sb.toString();
            throw null;
        }
        String string = sb.toString();
        int i12 = read;
        int i13 = ((i12 & 48) + (i12 | 48)) - 1;
        AudioAttributesCompatParcelizer = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        createCustomActions createcustomactions = (createCustomActions) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 77;
        int i4 = i3 % 128;
        AudioAttributesCompatParcelizer = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (createcustomactions == obj) {
            int i5 = i2 + 65;
            AudioAttributesCompatParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
            return true;
        }
        if (!(obj instanceof createCustomActions)) {
            int i7 = i2 & 109;
            int i8 = (~i7) & (i2 | 109);
            int i9 = -(-(i7 << 1));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            AudioAttributesCompatParcelizer = i10 % 128;
            boolean z = i10 % 2 == 0;
            int i11 = i2 & 119;
            int i12 = -(-((i2 ^ 119) | i11));
            int i13 = (i11 & i12) + (i11 | i12);
            AudioAttributesCompatParcelizer = i13 % 128;
            int i14 = i13 % 2;
            return Boolean.valueOf(z);
        }
        createCustomActions createcustomactions2 = (createCustomActions) obj;
        String str = createcustomactions.courseId;
        String str2 = createcustomactions2.courseId;
        int i15 = (i4 | 51) << 1;
        int i16 = -(((~i4) & 51) | (i4 & (-52)));
        int i17 = (i15 & i16) + (i16 | i15);
        read = i17 % 128;
        if (i17 % 2 != 0) {
            toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2);
            obj2.hashCode();
            throw null;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2)) {
            int i18 = read;
            int i19 = (i18 ^ 53) + ((i18 & 53) << 1);
            AudioAttributesCompatParcelizer = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((i18 ^ 34) + ((i18 & 34) << 1)) - 1;
            AudioAttributesCompatParcelizer = i21 % 128;
            if (i21 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) createcustomactions.configHash, (Object) createcustomactions2.configHash)) {
            int i22 = read;
            int i23 = i22 & 39;
            int i24 = (i22 | 39) & (~i23);
            int i25 = i23 << 1;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            AudioAttributesCompatParcelizer = i26 % 128;
            int i27 = i26 % 2;
            return true;
        }
        int i28 = read;
        int i29 = i28 & 15;
        int i30 = i29 + ((i28 ^ 15) | i29);
        AudioAttributesCompatParcelizer = i30 % 128;
        int i31 = i30 % 2;
        int i32 = i28 ^ 41;
        int i33 = (i28 & 41) << 1;
        int i34 = (i32 & i33) + (i33 | i32);
        AudioAttributesCompatParcelizer = i34 % 128;
        if (i34 % 2 == 0) {
            int i35 = 89 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        createCustomActions createcustomactions = (createCustomActions) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 ^ 9;
        int i4 = -(-((i2 & 9) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        int iHashCode = createcustomactions.courseId.hashCode();
        int i7 = i6 == 0 ? iHashCode >>> 113 : iHashCode * 31;
        int i8 = -(-createcustomactions.configHash.hashCode());
        int i9 = ((((~i8) & i7) | ((~i7) & i8)) - (~((i8 & i7) << 1))) - 1;
        int i10 = read;
        int i11 = ((i10 & (-40)) | ((~i10) & 39)) + ((i10 & 39) << 1);
        AudioAttributesCompatParcelizer = i11 % 128;
        int i12 = i11 % 2;
        return Integer.valueOf(i9);
    }
}
