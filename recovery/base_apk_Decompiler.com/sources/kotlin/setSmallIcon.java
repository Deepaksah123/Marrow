package kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.Metadata;
import kotlin.setPreferImmediatelyAvailableCredentials;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/setSmallIcon;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "courseId", "Ljava/lang/String;", "configHash"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setSmallIcon {
    private static int AudioAttributesCompatParcelizer = 0;
    private static int write = 1;

    @JsonProperty("config_hash")
    public String configHash;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    public String courseId;

    public static /* synthetic */ Object write(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i) | i7);
        int i9 = ~i3;
        int i10 = ~(i9 | i6);
        int i11 = ~(i7 | i3);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i);
        int i14 = (~(i | i7)) | i10 | i11;
        int i15 = i3 + i6 + i4 + (2052055731 * i5) + (1687666023 * i2);
        int i16 = i15 * i15;
        int i17 = (i3 * (-1966771951)) + 1000013824 + ((-1966771951) * i6) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i4) + (632946688 * i5) + ((-741212160) * i2) + (2121465856 * i16);
        int i18 = (i3 * 1533266457) + 1248777597 + (i6 * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * ResponseError.NO_INTERNET_ERROR) + (i4 * 1533266057) + (i5 * 706030027) + (i2 * 1023530015) + (i16 * (-2088042496));
        return i17 + ((i18 * i18) * 1434255360) != 1 ? read(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    public setSmallIcon(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.courseId = str;
        this.configHash = str2;
    }

    public final boolean equals(Object p0) {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i2 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i3 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return ((Boolean) write(i, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), new Object[]{this, p0}, -1348660612, i2, i3, 1348660613)).booleanValue();
    }

    public final int hashCode() {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i2 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        int i3 = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return ((Integer) write(i, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), new Object[]{this}, 2002028264, i2, i3, -2002028264)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.courseId;
        String str2 = this.configHash;
        StringBuilder sb = new StringBuilder("setSmallIcon(courseId=");
        int i2 = write + 31;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        sb.append(str);
        sb.append(", configHash=");
        sb.append(str2);
        sb.append(")");
        int i4 = AudioAttributesCompatParcelizer;
        int i5 = (i4 | 55) << 1;
        int i6 = -(((~i4) & 55) | (i4 & (-56)));
        int i7 = (i5 & i6) + (i6 | i5);
        write = i7 % 128;
        int i8 = i7 % 2;
        String string = sb.toString();
        int i9 = write;
        int i10 = ((i9 | 41) << 1) - (i9 ^ 41);
        AudioAttributesCompatParcelizer = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        setSmallIcon setsmallicon = (setSmallIcon) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = (i2 & 42) + (i2 | 42);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        write = i4 % 128;
        int iHashCode = i4 % 2 == 0 ? setsmallicon.courseId.hashCode() * 65 : setsmallicon.courseId.hashCode() * 31;
        int i5 = -(-setsmallicon.configHash.hashCode());
        int i6 = iHashCode ^ i5;
        int i7 = (i5 & iHashCode) << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = AudioAttributesCompatParcelizer;
        int i10 = i9 ^ 17;
        int i11 = (i9 & 17) << 1;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        write = i12 % 128;
        if (i12 % 2 != 0) {
            return Integer.valueOf(i8);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r5 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r5 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r9 = kotlin.setSmallIcon.AudioAttributesCompatParcelizer;
        r1 = (r9 ^ 95) + ((r9 & 95) << 1);
        kotlin.setSmallIcon.write = r1 % 128;
        r1 = r1 % 2;
        r9 = r9 + 43;
        kotlin.setSmallIcon.write = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if ((!kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((java.lang.Object) r1.configHash, (java.lang.Object) r9.configHash)) == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        r9 = kotlin.setSmallIcon.AudioAttributesCompatParcelizer;
        r9 = (-2) - ((((r9 | 70) << 1) - (r9 ^ 70)) ^ (-1));
        kotlin.setSmallIcon.write = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        r9 = kotlin.setSmallIcon.AudioAttributesCompatParcelizer;
        r1 = r9 & 101;
        r3 = -(-((r9 ^ 101) | r1));
        r5 = (r1 & r3) + (r1 | r3);
        kotlin.setSmallIcon.write = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if ((r5 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        r1 = ((r9 | 62) << 1) - (r9 ^ 62);
        r9 = (r1 ^ (-1)) + (r1 << 1);
        kotlin.setSmallIcon.write = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSmallIcon.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }
}
