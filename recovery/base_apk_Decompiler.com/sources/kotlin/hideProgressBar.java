package kotlin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.lesson.McqHighYieldRecord;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lo/hideProgressBar;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "courseId", "Ljava/lang/String;", "configHash"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class hideProgressBar {
    private static int AudioAttributesCompatParcelizer = 0;
    private static int IconCompatParcelizer = 1;

    @JsonProperty("config_hash")
    public String configHash;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    public String courseId;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i3) | i5);
        int i8 = ~((~i5) | i2);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i2) | i5));
        int i11 = i5 + i2 + i6 + (762724209 * i) + (1201824936 * i4);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i5) + 43253760 + (1339426419 * i2) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i6) + (1302855680 * i) + (1514143744 * i4) + (1905524736 * i12);
        int i14 = ((i5 * 162561953) - 555857873) + (i2 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i6 * 162560975) + (i * 701011807) + (i4 * 237771736) + (i12 * (-223608832));
        return i13 + ((i14 * i14) * 703332352) != 1 ? IconCompatParcelizer(objArr) : read(objArr);
    }

    public hideProgressBar(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.courseId = str;
        this.configHash = str2;
    }

    public final boolean equals(Object p0) {
        int iAudioAttributesCompatParcelizer = McqHighYieldRecord.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = McqHighYieldRecord.AudioAttributesCompatParcelizer();
        return ((Boolean) RemoteActionCompatParcelizer(McqHighYieldRecord.AudioAttributesCompatParcelizer(), -1501320415, iAudioAttributesCompatParcelizer, McqHighYieldRecord.AudioAttributesCompatParcelizer(), new Object[]{this, p0}, 1501320416, iAudioAttributesCompatParcelizer2)).booleanValue();
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = McqHighYieldRecord.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = McqHighYieldRecord.AudioAttributesCompatParcelizer();
        return ((Integer) RemoteActionCompatParcelizer(McqHighYieldRecord.AudioAttributesCompatParcelizer(), -1948439932, iAudioAttributesCompatParcelizer, McqHighYieldRecord.AudioAttributesCompatParcelizer(), new Object[]{this}, 1948439932, iAudioAttributesCompatParcelizer2)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.courseId;
        String str2 = this.configHash;
        StringBuilder sb = new StringBuilder("hideProgressBar(courseId=");
        int i2 = IconCompatParcelizer + 11;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        sb.append(str);
        sb.append(", configHash=");
        if (i3 != 0) {
            sb.append(str2);
            int i4 = 5 / 0;
        } else {
            sb.append(str2);
        }
        int i5 = AudioAttributesCompatParcelizer;
        int i6 = i5 & 85;
        int i7 = (i5 ^ 85) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        IconCompatParcelizer = i8 % 128;
        int i9 = i8 % 2;
        sb.append(")");
        if (i9 != 0) {
            return sb.toString();
        }
        sb.toString();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i;
        hideProgressBar hideprogressbar = (hideProgressBar) objArr[0];
        int i2 = 2 % 2;
        int i3 = AudioAttributesCompatParcelizer;
        int i4 = i3 & 57;
        int i5 = ((i3 ^ 57) | i4) << 1;
        int i6 = -((i3 | 57) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        IconCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        int iHashCode = hideprogressbar.courseId.hashCode();
        int i9 = i8 == 0 ? iHashCode >> 84 : iHashCode * 31;
        int iHashCode2 = hideprogressbar.configHash.hashCode();
        int i10 = IconCompatParcelizer;
        int i11 = (i10 & (-22)) | ((~i10) & 21);
        int i12 = -(-((i10 & 21) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        AudioAttributesCompatParcelizer = i13 % 128;
        if (i13 % 2 != 0) {
            i = i9 >> iHashCode2;
        } else {
            int i14 = -(-iHashCode2);
            int i15 = i9 & i14;
            i = (((i9 ^ i14) | i15) << 1) - ((i14 | i9) & (~i15));
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if ((r10 instanceof kotlin.hideProgressBar) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r0 = r2.courseId;
        r7 = ((kotlin.hideProgressBar) r10).courseId;
        r6 = r6 + 57;
        kotlin.hideProgressBar.IconCompatParcelizer = r6 % 128;
        r6 = r6 % 2;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if ((!kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((java.lang.Object) r0, (java.lang.Object) r7)) == true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if ((!kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((java.lang.Object) r2.configHash, (java.lang.Object) r10.configHash)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        r10 = kotlin.hideProgressBar.IconCompatParcelizer;
        r0 = ((r10 ^ 38) + ((r10 & 38) << 1)) - 1;
        r10 = r0 % 128;
        kotlin.hideProgressBar.AudioAttributesCompatParcelizer = r10;
        r0 = r0 % 2;
        r10 = r10 + 61;
        kotlin.hideProgressBar.IconCompatParcelizer = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        if ((r10 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        r10 = kotlin.hideProgressBar.IconCompatParcelizer;
        r0 = ((r10 | 20) << 1) - (r10 ^ 20);
        r10 = (r0 ^ (-1)) + (r0 << 1);
        kotlin.hideProgressBar.AudioAttributesCompatParcelizer = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if ((r10 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r10 = kotlin.hideProgressBar.IconCompatParcelizer;
        r2 = r10 & 81;
        r0 = ((r10 ^ 81) | r2) << 1;
        r2 = -((~r2) & (r10 | 81));
        r3 = (r0 & r2) + (r0 | r2);
        kotlin.hideProgressBar.AudioAttributesCompatParcelizer = r3 % 128;
        r3 = r3 % 2;
        r10 = r10 + 53;
        kotlin.hideProgressBar.AudioAttributesCompatParcelizer = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if ((r10 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ce, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        r10 = (r7 ^ 19) + ((r7 & 19) << 1);
        kotlin.hideProgressBar.AudioAttributesCompatParcelizer = r10 % 128;
        r10 = r10 % 2;
        r10 = ((r7 | 27) << 1) - ((r7 & (-28)) | ((~r7) & 27));
        kotlin.hideProgressBar.AudioAttributesCompatParcelizer = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        if (r2 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r2 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        r10 = (r7 & (-18)) | ((~r7) & 17);
        r0 = -(-((r7 & 17) << 1));
        r1 = (r10 ^ r0) + ((r10 & r0) << 1);
        kotlin.hideProgressBar.AudioAttributesCompatParcelizer = r1 % 128;
        r1 = r1 % 2;
        r10 = r7 & 27;
        r10 = r10 + ((r7 ^ 27) | r10);
        kotlin.hideProgressBar.AudioAttributesCompatParcelizer = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r10) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hideProgressBar.read(java.lang.Object[]):java.lang.Object");
    }
}
