package kotlin;

import kotlin.Metadata;
import kotlin.getRelatedModuleAdapter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u00158\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014"}, d2 = {"Lo/setConnectionMonitor;", "", "<init>", "()V", "", "p0", "p1", "", "IconCompatParcelizer", "(II)Ljava/lang/String;", "RemoteActionCompatParcelizer", "(I)Ljava/lang/String;", "", "p2", "p3", "p4", "AudioAttributesCompatParcelizer", "(ZIIII)Ljava/lang/String;", "", "write", "[Ljava/lang/String;", "Lo/getRelatedModuleAdapter;", "Lo/getRelatedModuleAdapter;", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class setConnectionMonitor {
    public static final getRelatedModuleAdapter AudioAttributesCompatParcelizer;
    public static final setConnectionMonitor INSTANCE = new setConnectionMonitor();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final String[] IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final String[] RemoteActionCompatParcelizer;
    private static final String[] write;

    private setConnectionMonitor() {
    }

    static {
        getRelatedModuleAdapter.Companion companion = getRelatedModuleAdapter.INSTANCE;
        AudioAttributesCompatParcelizer = getRelatedModuleAdapter.Companion.RemoteActionCompatParcelizer("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        IconCompatParcelizer = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        RemoteActionCompatParcelizer = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(binaryString, "");
            strArr[i] = TestGroupLSModel.AudioAttributesCompatParcelizer(FirebaseDataModule.read("%8s", binaryString), ' ', '0', false);
        }
        write = strArr;
        String[] strArr2 = RemoteActionCompatParcelizer;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        StringBuilder sb = new StringBuilder();
        sb.append(strArr2[i2]);
        sb.append("|PADDED");
        strArr2[i2 | 8] = sb.toString();
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = RemoteActionCompatParcelizer;
            int i6 = i5 | i4;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i5]);
            sb2.append('|');
            sb2.append(strArr3[i4]);
            strArr3[i6] = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strArr3[i5]);
            sb3.append('|');
            sb3.append(strArr3[i4]);
            sb3.append("|PADDED");
            strArr3[i6 | 8] = sb3.toString();
        }
        int length = RemoteActionCompatParcelizer.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = RemoteActionCompatParcelizer;
            if (strArr4[i7] == null) {
                strArr4[i7] = write[i7];
            }
        }
    }

    public static String AudioAttributesCompatParcelizer(boolean p0, int p1, int p2, int p3, int p4) {
        return FirebaseDataModule.read("%s 0x%08x %5d %-13s %s", p0 ? "<<" : ">>", Integer.valueOf(p1), Integer.valueOf(p2), RemoteActionCompatParcelizer(p3), IconCompatParcelizer(p3, p4));
    }

    public static String RemoteActionCompatParcelizer(int p0) {
        String[] strArr = IconCompatParcelizer;
        return p0 < strArr.length ? strArr[p0] : FirebaseDataModule.read("0x%02x", Integer.valueOf(p0));
    }

    private static String IconCompatParcelizer(int p0, int p1) {
        String str;
        if (p1 == 0) {
            return "";
        }
        if (p0 != 2 && p0 != 3) {
            if (p0 == 4 || p0 == 6) {
                return p1 == 1 ? "ACK" : write[p1];
            }
            if (p0 != 7 && p0 != 8) {
                String[] strArr = RemoteActionCompatParcelizer;
                if (p1 < strArr.length) {
                    str = strArr[p1];
                    toMagicModuleMetaRepoModel.write((Object) str);
                } else {
                    str = write[p1];
                }
                if (p0 != 5 || (p1 & 4) == 0) {
                    return (p0 != 0 || (p1 & 32) == 0) ? str : TestGroupLSModel.read(str, "PRIORITY", "COMPRESSED", false);
                }
                return TestGroupLSModel.read(str, "HEADERS", "PUSH_PROMISE", false);
            }
        }
        return write[p1];
    }
}
