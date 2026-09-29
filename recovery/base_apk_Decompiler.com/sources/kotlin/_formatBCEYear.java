package kotlin;

import com.google.android.exoplayer2.C;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class _formatBCEYear {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void RemoteActionCompatParcelizer(kotlin.isLenient r11, o.withTimeZone.RemoteActionCompatParcelizer r12, kotlin.TypeSerializer<kotlin.pad3> r13) {
        /*
            long r0 = r12.IconCompatParcelizer
            int r0 = AudioAttributesCompatParcelizer(r11, r0)
            long r1 = r12.IconCompatParcelizer
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3f
            int r1 = r11.RemoteActionCompatParcelizer()
            if (r0 >= r1) goto L3f
            long r3 = r12.IconCompatParcelizer
            java.util.List r6 = r11.read(r3)
            long r3 = r11.write(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3f
            long r7 = r12.IconCompatParcelizer
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3f
            o.pad3 r1 = new o.pad3
            long r7 = r12.IconCompatParcelizer
            long r9 = r12.IconCompatParcelizer
            long r9 = r3 - r9
            r5 = r1
            r5.<init>(r6, r7, r9)
            r13.read(r1)
            r1 = 1
            goto L40
        L3f:
            r1 = r2
        L40:
            r3 = r0
        L41:
            int r4 = r11.RemoteActionCompatParcelizer()
            if (r3 >= r4) goto L4d
            read(r11, r3, r13)
            int r3 = r3 + 1
            goto L41
        L4d:
            boolean r3 = r12.RemoteActionCompatParcelizer
            if (r3 == 0) goto L7a
            if (r1 == 0) goto L55
            int r0 = r0 + (-1)
        L55:
            if (r2 >= r0) goto L5d
            read(r11, r2, r13)
            int r2 = r2 + 1
            goto L55
        L5d:
            if (r1 == 0) goto L7a
            long r1 = r12.IconCompatParcelizer
            java.util.List r4 = r11.read(r1)
            long r5 = r11.write(r0)
            long r1 = r12.IconCompatParcelizer
            o.pad3 r12 = new o.pad3
            long r7 = r11.write(r0)
            long r7 = r1 - r7
            r3 = r12
            r3.<init>(r4, r5, r7)
            r13.read(r12)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._formatBCEYear.RemoteActionCompatParcelizer(o.isLenient, o.withTimeZone$RemoteActionCompatParcelizer, o.TypeSerializer):void");
    }

    private static int AudioAttributesCompatParcelizer(isLenient islenient, long j) {
        if (j == C.TIME_UNSET) {
            return 0;
        }
        int iRemoteActionCompatParcelizer = islenient.RemoteActionCompatParcelizer(j);
        if (iRemoteActionCompatParcelizer == -1) {
            iRemoteActionCompatParcelizer = islenient.RemoteActionCompatParcelizer();
        }
        if (iRemoteActionCompatParcelizer <= 0) {
            return iRemoteActionCompatParcelizer;
        }
        int i = iRemoteActionCompatParcelizer - 1;
        return islenient.write(i) == j ? i : iRemoteActionCompatParcelizer;
    }

    private static void read(isLenient islenient, int i, TypeSerializer<pad3> typeSerializer) {
        long jWrite = islenient.write(i);
        List<getDefaultImpl> list = islenient.read(jWrite);
        if (list.isEmpty()) {
            return;
        }
        if (i == islenient.RemoteActionCompatParcelizer() - 1) {
            throw new IllegalStateException();
        }
        long jWrite2 = islenient.write(i + 1) - islenient.write(i);
        if (jWrite2 > 0) {
            typeSerializer.read(new pad3(list, jWrite, jWrite2));
        }
    }
}
