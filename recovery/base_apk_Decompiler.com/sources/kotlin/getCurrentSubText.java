package kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/getCurrentSubText;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "courseId", "Ljava/lang/String;", "configHash"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getCurrentSubText {
    private static int read = 1;
    private static int write;

    @JsonProperty("config_hash")
    private final String configHash;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private final String courseId;

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~(i | i5);
        int i11 = i9 | i10;
        int i12 = ~i;
        int i13 = i9 | (~(i12 | i6)) | i10;
        int i14 = (~(i5 | i | i6)) | (~(i7 | i12 | i8));
        int i15 = i + i6 + i2 + (1322235619 * i4) + (440487356 * i3);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i) - 2100690944) + ((-281430247) * i6) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i2) + ((-942931968) * i4) + ((-1410334720) * i3) + (1251606528 * i16);
        int i18 = (i * 157034417) + 1376579869 + (i6 * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i2 * 157035401) + (i4 * (-982187909)) + (i3 * (-1869533796)) + (i16 * (-899022848));
        return i17 + ((i18 * i18) * (-511311872)) != 1 ? read(objArr) : write(objArr);
    }

    public getCurrentSubText(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.courseId = str;
        this.configHash = str2;
    }

    public final boolean equals(Object p0) {
        int i = SideSheetBehavior.read();
        int i2 = SideSheetBehavior.read();
        int i3 = SideSheetBehavior.read();
        return ((Boolean) AudioAttributesCompatParcelizer(-783887514, i2, SideSheetBehavior.read(), i3, i, 783887514, new Object[]{this, p0})).booleanValue();
    }

    public final int hashCode() {
        int i = SideSheetBehavior.read();
        int i2 = SideSheetBehavior.read();
        int i3 = SideSheetBehavior.read();
        return ((Integer) AudioAttributesCompatParcelizer(-550533031, i2, SideSheetBehavior.read(), i3, i, 550533032, new Object[]{this})).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.courseId;
        String str2 = this.configHash;
        StringBuilder sb = new StringBuilder("getCurrentSubText(courseId=");
        int i2 = read;
        int i3 = (i2 & (-102)) | ((~i2) & 101);
        int i4 = -(-((i2 & 101) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        write = i5 % 128;
        int i6 = i5 % 2;
        sb.append(str);
        sb.append(", configHash=");
        sb.append(str2);
        sb.append(")");
        System.identityHashCode(this);
        System.identityHashCode(this);
        String string = sb.toString();
        int i7 = write;
        int i8 = ((i7 ^ 2) + ((i7 & 2) << 1)) - 1;
        read = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        getCurrentSubText getcurrentsubtext = (getCurrentSubText) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = write;
        int i3 = (i2 & (-114)) | ((~i2) & 113);
        int i4 = (i2 & 113) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        read = i6;
        int i7 = i5 % 2;
        if (getcurrentsubtext == obj) {
            int i8 = (i6 & (-22)) | ((~i6) & 21);
            int i9 = (i6 & 21) << 1;
            int i10 = ((i8 | i9) << 1) - (i8 ^ i9);
            write = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        Object obj2 = null;
        if (!(obj instanceof getCurrentSubText)) {
            int i12 = i6 & 61;
            int i13 = (i6 ^ 61) | i12;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            write = i14 % 128;
            int i15 = i14 % 2;
            int i16 = (i6 ^ 17) + ((i6 & 17) << 1);
            write = i16 % 128;
            if (i16 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        getCurrentSubText getcurrentsubtext2 = (getCurrentSubText) obj;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getcurrentsubtext.courseId, (Object) getcurrentsubtext2.courseId)) {
            int i17 = read;
            int i18 = i17 & 37;
            int i19 = i17 | 37;
            int i20 = (i18 & i19) + (i18 | i19);
            write = i20 % 128;
            int i21 = i20 % 2;
            int i22 = i17 & 17;
            int i23 = i22 + ((i17 ^ 17) | i22);
            write = i23 % 128;
            if (i23 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getcurrentsubtext.configHash, (Object) getcurrentsubtext2.configHash)) {
            int i24 = read + 75;
            write = i24 % 128;
            if (i24 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i25 = read;
        int i26 = ((i25 & 12) + (i25 | 12)) - 1;
        int i27 = i26 % 128;
        write = i27;
        boolean z = i26 % 2 != 0;
        int i28 = i27 & 17;
        int i29 = -(-((i27 ^ 17) | i28));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        read = i30 % 128;
        if (i30 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getCurrentSubText getcurrentsubtext = (getCurrentSubText) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 & 79;
        int i4 = (i2 | 79) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        write = i6 % 128;
        int i7 = i6 % 2;
        int iHashCode = getcurrentsubtext.courseId.hashCode();
        int i8 = i7 != 0 ? iHashCode >> 117 : iHashCode * 31;
        int i9 = -(-getcurrentsubtext.configHash.hashCode());
        int i10 = i8 & i9;
        int i11 = i10 + ((i9 ^ i8) | i10);
        int i12 = write + 62;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        read = i13 % 128;
        int i14 = i13 % 2;
        return Integer.valueOf(i11);
    }
}
