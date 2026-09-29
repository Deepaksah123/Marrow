package kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.Metadata;
import kotlin.setMap;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/setPreviousActionIconResourceId;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "courseId", "Ljava/lang/String;", "configHash"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setPreviousActionIconResourceId {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    @JsonProperty("config_hash")
    private final String configHash;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private final String courseId;

    public static /* synthetic */ Object read(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i3) | i7 | i6);
        int i9 = (~i6) | i7;
        int i10 = i8 | (~(i9 | i3)) | (~(i | i3 | i6));
        int i11 = ~i9;
        int i12 = (~(i6 | i)) | i3 | i11;
        int i13 = (~(i7 | i3)) | i11;
        int i14 = i + i3 + i5 + (933655473 * i4) + ((-1037598838) * i2);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i) - 925892608) + (470833381 * i3) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i5) + ((-1691877376) * i4) + ((-393216000) * i2) + ((-1633878016) * i15);
        int i17 = ((i * (-727610197)) - 1081761860) + (i3 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i5 * (-727609241)) + (i4 * 1532828727) + (i2 * (-747900794)) + (i15 * 556466176);
        return i16 + ((i17 * i17) * (-1911357440)) != 1 ? IconCompatParcelizer(objArr) : read(objArr);
    }

    public setPreviousActionIconResourceId(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.courseId = str;
        this.configHash = str2;
    }

    public final boolean equals(Object p0) {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        int i2 = setMap.AudioAttributesCompatParcelizer.read();
        return ((Boolean) read(new Object[]{this, p0}, -1881959368, setMap.AudioAttributesCompatParcelizer.read(), 1881959368, setMap.AudioAttributesCompatParcelizer.read(), i2, i)).booleanValue();
    }

    public final int hashCode() {
        int i = setMap.AudioAttributesCompatParcelizer.read();
        int i2 = setMap.AudioAttributesCompatParcelizer.read();
        return ((Integer) read(new Object[]{this}, -1446374056, setMap.AudioAttributesCompatParcelizer.read(), 1446374057, setMap.AudioAttributesCompatParcelizer.read(), i2, i)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.courseId;
        String str2 = this.configHash;
        StringBuilder sb = new StringBuilder("setPreviousActionIconResourceId(courseId=");
        int i2 = RemoteActionCompatParcelizer;
        int i3 = ((i2 ^ 35) | (i2 & 35)) << 1;
        int i4 = -(((~i2) & 35) | (i2 & (-36)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        sb.append(str);
        sb.append(", configHash=");
        sb.append(str2);
        int i7 = RemoteActionCompatParcelizer;
        int i8 = i7 & 37;
        int i9 = (i7 | 37) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        IconCompatParcelizer = i11 % 128;
        int i12 = i11 % 2;
        sb.append(")");
        if (i12 == 0) {
            sb.toString();
            throw null;
        }
        String string = sb.toString();
        int i13 = IconCompatParcelizer;
        int i14 = i13 ^ 113;
        int i15 = -(-((i13 & 113) << 1));
        int i16 = (i14 & i15) + (i15 | i14);
        RemoteActionCompatParcelizer = i16 % 128;
        int i17 = i16 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e8, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ef, code lost:
    
        return java.lang.Boolean.valueOf(!r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f3, code lost:
    
        if ((!(r14 instanceof kotlin.setPreviousActionIconResourceId)) == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f5, code lost:
    
        r6 = r2.courseId;
        r7 = ((kotlin.setPreviousActionIconResourceId) r14).courseId;
        r8 = kotlin.setPreviousActionIconResourceId.RemoteActionCompatParcelizer;
        r9 = (r8 & 121) + (r8 | 121);
        kotlin.setPreviousActionIconResourceId.IconCompatParcelizer = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010c, code lost:
    
        if ((!kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((java.lang.Object) r6, (java.lang.Object) r7)) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0117, code lost:
    
        if ((!kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((java.lang.Object) r2.configHash, (java.lang.Object) r14.configHash)) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0119, code lost:
    
        r14 = kotlin.setPreviousActionIconResourceId.IconCompatParcelizer;
        r1 = (r14 & 123) + (r14 | 123);
        kotlin.setPreviousActionIconResourceId.RemoteActionCompatParcelizer = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0125, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0127, code lost:
    
        r14 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012b, code lost:
    
        r14 = kotlin.setPreviousActionIconResourceId.IconCompatParcelizer;
        r0 = r14 & 45;
        r0 = r0 + ((r14 ^ 45) | r0);
        r14 = r0 % 128;
        kotlin.setPreviousActionIconResourceId.RemoteActionCompatParcelizer = r14;
        r0 = r0 % 2;
        r0 = (r14 & (-84)) | ((~r14) & 83);
        r14 = (r14 & 83) << 1;
        r2 = (r0 & r14) + (r14 | r0);
        kotlin.setPreviousActionIconResourceId.IconCompatParcelizer = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014a, code lost:
    
        if ((r2 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x014c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x014d, code lost:
    
        r14 = null;
        r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0151, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0152, code lost:
    
        r14 = kotlin.setPreviousActionIconResourceId.IconCompatParcelizer;
        r0 = r14 & 105;
        r14 = -(-((r14 ^ 105) | r0));
        r2 = ((r0 | r14) << 1) - (r14 ^ r0);
        r14 = r2 % 128;
        kotlin.setPreviousActionIconResourceId.RemoteActionCompatParcelizer = r14;
        r2 = r2 % 2;
        r14 = r14 + 89;
        kotlin.setPreviousActionIconResourceId.IconCompatParcelizer = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x016c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x016d, code lost:
    
        r14 = kotlin.setPreviousActionIconResourceId.RemoteActionCompatParcelizer;
        r2 = r14 + 119;
        kotlin.setPreviousActionIconResourceId.IconCompatParcelizer = r2 % 128;
        r2 = r2 % 2;
        r2 = r14 & 109;
        r14 = (r14 | 109) & (~r2);
        r2 = -(-(r2 << 1));
        r3 = (r14 & r2) + (r14 | r2);
        kotlin.setPreviousActionIconResourceId.IconCompatParcelizer = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0188, code lost:
    
        if ((r3 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018a, code lost:
    
        r14 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00d8, code lost:
    
        if (r2 == r14) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00db, code lost:
    
        if (r2 == r14) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00dd, code lost:
    
        r14 = kotlin.setPreviousActionIconResourceId.RemoteActionCompatParcelizer + 11;
        kotlin.setPreviousActionIconResourceId.IconCompatParcelizer = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00e6, code lost:
    
        if ((r14 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPreviousActionIconResourceId.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        setPreviousActionIconResourceId setpreviousactioniconresourceid = (setPreviousActionIconResourceId) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = (i2 & 119) + (i2 | 119);
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = setpreviousactioniconresourceid.courseId.hashCode() * 31;
        int i5 = RemoteActionCompatParcelizer;
        int i6 = ((i5 | 11) << 1) - (i5 ^ 11);
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        int iHashCode2 = iHashCode + setpreviousactioniconresourceid.configHash.hashCode();
        int i8 = RemoteActionCompatParcelizer;
        int i9 = ((i8 & (-116)) | ((~i8) & 115)) + ((i8 & 115) << 1);
        IconCompatParcelizer = i9 % 128;
        int i10 = i9 % 2;
        return Integer.valueOf(iHashCode2);
    }
}
