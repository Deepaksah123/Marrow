package kotlin;

import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public class getShowEditors {
    private static final byte[] $$a;
    private static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    public static final Map onCustomAction;
    private static byte[] onFastForward;
    private static Object onMediaButtonEvent;
    public static final Map onPause;
    private static Object onPlay;
    private static byte[] onPlayFromMediaId;
    private static long onPlayFromSearch;
    private static int onPrepareFromMediaId;
    private static long onPrepareFromSearch;
    private static int onPrepareFromUri;
    private static int onRemoveQueueItem;
    private static int onRemoveQueueItemAt;
    private static boolean onRewind;
    private static int onSeekTo;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, int r9, short r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = 36 - r8
            byte[] r2 = kotlin.getShowEditors.$$a
            int r9 = r9 + 4
            int r10 = 119 - r10
            byte[] r1 = new byte[r1]
            int r8 = 35 - r8
            r3 = 0
            if (r2 != 0) goto L1e
            int r4 = kotlin.getShowEditors.$16
            int r4 = r4 + 115
            int r5 = r4 % 128
            kotlin.getShowEditors.$17 = r5
            int r4 = r4 % r0
            r4 = r8
            r5 = r3
            goto L37
        L1e:
            r4 = r3
        L1f:
            byte r5 = (byte) r10
            r1[r4] = r5
            int r5 = r4 + 1
            if (r4 != r8) goto L2c
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r3)
            return r8
        L2c:
            r4 = r2[r9]
            int r6 = kotlin.getShowEditors.$17
            int r6 = r6 + 57
            int r7 = r6 % 128
            kotlin.getShowEditors.$16 = r7
            int r6 = r6 % r0
        L37:
            int r9 = r9 + 1
            int r10 = r10 + r4
            int r10 = r10 + 1
            r4 = r5
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getShowEditors.$$c(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x051e A[Catch: Exception -> 0x020c, TryCatch #2 {Exception -> 0x020c, blocks: (B:120:0x04d2, B:124:0x04ee, B:126:0x04f2, B:135:0x050f, B:134:0x050c, B:143:0x0518, B:145:0x051e, B:146:0x051f, B:152:0x052a, B:154:0x0531, B:155:0x0532, B:162:0x053e, B:164:0x0545, B:165:0x0546, B:175:0x0559, B:177:0x0560, B:178:0x0561, B:121:0x04d7, B:130:0x0506), top: B:195:0x04d2, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x051f A[Catch: Exception -> 0x020c, TryCatch #2 {Exception -> 0x020c, blocks: (B:120:0x04d2, B:124:0x04ee, B:126:0x04f2, B:135:0x050f, B:134:0x050c, B:143:0x0518, B:145:0x051e, B:146:0x051f, B:152:0x052a, B:154:0x0531, B:155:0x0532, B:162:0x053e, B:164:0x0545, B:165:0x0546, B:175:0x0559, B:177:0x0560, B:178:0x0561, B:121:0x04d7, B:130:0x0506), top: B:195:0x04d2, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0545 A[Catch: Exception -> 0x020c, TryCatch #2 {Exception -> 0x020c, blocks: (B:120:0x04d2, B:124:0x04ee, B:126:0x04f2, B:135:0x050f, B:134:0x050c, B:143:0x0518, B:145:0x051e, B:146:0x051f, B:152:0x052a, B:154:0x0531, B:155:0x0532, B:162:0x053e, B:164:0x0545, B:165:0x0546, B:175:0x0559, B:177:0x0560, B:178:0x0561, B:121:0x04d7, B:130:0x0506), top: B:195:0x04d2, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0546 A[Catch: Exception -> 0x020c, TryCatch #2 {Exception -> 0x020c, blocks: (B:120:0x04d2, B:124:0x04ee, B:126:0x04f2, B:135:0x050f, B:134:0x050c, B:143:0x0518, B:145:0x051e, B:146:0x051f, B:152:0x052a, B:154:0x0531, B:155:0x0532, B:162:0x053e, B:164:0x0545, B:165:0x0546, B:175:0x0559, B:177:0x0560, B:178:0x0561, B:121:0x04d7, B:130:0x0506), top: B:195:0x04d2, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0560 A[Catch: Exception -> 0x020c, TryCatch #2 {Exception -> 0x020c, blocks: (B:120:0x04d2, B:124:0x04ee, B:126:0x04f2, B:135:0x050f, B:134:0x050c, B:143:0x0518, B:145:0x051e, B:146:0x051f, B:152:0x052a, B:154:0x0531, B:155:0x0532, B:162:0x053e, B:164:0x0545, B:165:0x0546, B:175:0x0559, B:177:0x0560, B:178:0x0561, B:121:0x04d7, B:130:0x0506), top: B:195:0x04d2, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0561 A[Catch: Exception -> 0x020c, TRY_LEAVE, TryCatch #2 {Exception -> 0x020c, blocks: (B:120:0x04d2, B:124:0x04ee, B:126:0x04f2, B:135:0x050f, B:134:0x050c, B:143:0x0518, B:145:0x051e, B:146:0x051f, B:152:0x052a, B:154:0x0531, B:155:0x0532, B:162:0x053e, B:164:0x0545, B:165:0x0546, B:175:0x0559, B:177:0x0560, B:178:0x0561, B:121:0x04d7, B:130:0x0506), top: B:195:0x04d2, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.URL RemoteActionCompatParcelizer(java.lang.String r21, android.content.pm.ApplicationInfo r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getShowEditors.RemoteActionCompatParcelizer(java.lang.String, android.content.pm.ApplicationInfo):java.net.URL");
    }

    private getShowEditors() {
    }

    public static Object RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = $11 + 99;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = onRemoveQueueItemAt;
            Integer.valueOf(((~i) & i4) | ((~i4) & i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map map = onPause;
        int i5 = onRemoveQueueItemAt;
        Object obj2 = map.get(Integer.valueOf((i | i5) & (~(i & i5))));
        int i6 = $11;
        int i7 = (i6 & 43) + (i6 | 43);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x04b2, code lost:
    
        if (((java.lang.Boolean) r5.getMethod($$c(r8, (short) (r8 | 355), r31[46]), null).invoke(r14, null)).booleanValue() == false) goto L1057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x1c7a, code lost:
    
        r7 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x1c81, code lost:
    
        r1 = r48.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        kotlin.getShowEditors.onMediaButtonEvent = r1.newInstance(r2, java.lang.Boolean.valueOf(!r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1caa, code lost:
    
        if (r7 == 0) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1cac, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1cb0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1cb1, code lost:
    
        r1 = r0;
        r4 = r47;
        r40 = r40;
        r51 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x1cb8, code lost:
    
        if (r47 == 0) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x1cba, code lost:
    
        r4 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x1cbe, code lost:
    
        if (r4 < 26) goto L777;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x1cc5, code lost:
    
        r4 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x1cc8, code lost:
    
        r2 = new java.lang.Object[]{-1707357945, -2070413536};
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(1344538224);
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x1ce5, code lost:
    
        if (r1 != null) goto L786;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x1ce7, code lost:
    
        r1 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
        r1 = (char) ((r1 ^ 46412) + ((r1 & 46412) << 1));
        r3 = android.widget.ExpandableListView.getPackedPositionGroup(0) + 12869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x1d06, code lost:
    
        r5 = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
        r55 = ((r5 | 28) << 1) - (r5 ^ 28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x1d16, code lost:
    
        r5 = kotlin.getShowEditors.$$a;
        r1 = kotlin.startForeground.read(r1, r3, r55, 778945253, false, $$c(r5[549(0x225, float:7.7E-43)], (short) 1051, r5[204(0xcc, float:2.86E-43)]), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x1d40, code lost:
    
        r5 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x1d46, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1d4c, code lost:
    
        r9 = true;
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x1d54, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x1d56, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x1d59, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x1d5a, code lost:
    
        r2 = r1.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x1d5e, code lost:
    
        if (r2 != null) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x1d60, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x1d61, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x1d62, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1266:? A[Catch: all -> 0x1f94, SYNTHETIC, TryCatch #73 {all -> 0x1f94, blocks: (B:913:0x1f60, B:914:0x1f63, B:794:0x1d5a, B:796:0x1d60, B:797:0x1d61, B:916:0x1f65, B:918:0x1f7a, B:919:0x1f7b, B:921:0x1f7d, B:923:0x1f92, B:924:0x1f93, B:382:0x0d42, B:282:0x0958), top: B:1070:0x0d42, inners: #44, #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1294 A[Catch: all -> 0x1296, Exception -> 0x129b, TryCatch #55 {Exception -> 0x129b, blocks: (B:489:0x128e, B:491:0x1294, B:492:0x1295), top: B:1092:0x128e }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x1295 A[Catch: all -> 0x1296, Exception -> 0x129b, TRY_LEAVE, TryCatch #55 {Exception -> 0x129b, blocks: (B:489:0x128e, B:491:0x1294, B:492:0x1295), top: B:1092:0x128e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x1f49 A[Catch: all -> 0x1f4b, TryCatch #25 {all -> 0x1f4b, blocks: (B:819:0x1da9, B:824:0x1e10, B:826:0x1e16, B:827:0x1e17, B:805:0x1d80, B:807:0x1d86, B:808:0x1d87, B:833:0x1e2b, B:835:0x1e3e, B:836:0x1e3f, B:841:0x1e56, B:843:0x1e5f, B:844:0x1e60, B:853:0x1e84, B:855:0x1e8f, B:856:0x1e90, B:864:0x1eae, B:866:0x1eb9, B:867:0x1eba, B:876:0x1ee4, B:878:0x1eeb, B:879:0x1eec, B:881:0x1eee, B:883:0x1f00, B:884:0x1f01, B:889:0x1f11, B:891:0x1f1e, B:892:0x1f1f, B:900:0x1f40, B:902:0x1f49, B:903:0x1f4a, B:631:0x173e, B:403:0x0e4a, B:820:0x1de2, B:821:0x1e0d), top: B:1000:0x173e, inners: #5, #105, #117 }] */
    /* JADX WARN: Removed duplicated region for block: B:903:0x1f4a A[Catch: all -> 0x1f4b, TRY_LEAVE, TryCatch #25 {all -> 0x1f4b, blocks: (B:819:0x1da9, B:824:0x1e10, B:826:0x1e16, B:827:0x1e17, B:805:0x1d80, B:807:0x1d86, B:808:0x1d87, B:833:0x1e2b, B:835:0x1e3e, B:836:0x1e3f, B:841:0x1e56, B:843:0x1e5f, B:844:0x1e60, B:853:0x1e84, B:855:0x1e8f, B:856:0x1e90, B:864:0x1eae, B:866:0x1eb9, B:867:0x1eba, B:876:0x1ee4, B:878:0x1eeb, B:879:0x1eec, B:881:0x1eee, B:883:0x1f00, B:884:0x1f01, B:889:0x1f11, B:891:0x1f1e, B:892:0x1f1f, B:900:0x1f40, B:902:0x1f49, B:903:0x1f4a, B:631:0x173e, B:403:0x0e4a, B:820:0x1de2, B:821:0x1e0d), top: B:1000:0x173e, inners: #5, #105, #117 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:913:0x1f60 A[Catch: all -> 0x1f94, TRY_ENTER, TryCatch #73 {all -> 0x1f94, blocks: (B:913:0x1f60, B:914:0x1f63, B:794:0x1d5a, B:796:0x1d60, B:797:0x1d61, B:916:0x1f65, B:918:0x1f7a, B:919:0x1f7b, B:921:0x1f7d, B:923:0x1f92, B:924:0x1f93, B:382:0x0d42, B:282:0x0958), top: B:1070:0x0d42, inners: #44, #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:940:0x1fc4 A[Catch: Exception -> 0x208b, TRY_ENTER, TRY_LEAVE, TryCatch #97 {Exception -> 0x208b, blocks: (B:13:0x00f7, B:15:0x010f, B:17:0x0126, B:41:0x0231, B:969:0x2082, B:971:0x2089, B:972:0x208a, B:54:0x0309, B:62:0x0374, B:64:0x037a, B:65:0x037b, B:66:0x037c, B:68:0x03d0, B:69:0x03e0, B:83:0x042f, B:87:0x0438, B:91:0x0441, B:96:0x0456, B:102:0x0461, B:940:0x1fc4, B:943:0x1fd8, B:956:0x2052, B:944:0x1fe2, B:945:0x1fe6, B:950:0x2029, B:952:0x202f, B:953:0x2030, B:46:0x027f, B:959:0x206e, B:961:0x2075, B:962:0x2076, B:964:0x2078, B:966:0x207f, B:967:0x2080, B:946:0x1ff8, B:947:0x2026, B:48:0x02ca, B:56:0x031d, B:58:0x0330, B:47:0x0291, B:42:0x024f), top: B:1164:0x00f7, inners: #3, #49, #51, #57, #63 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0455  */
    /* JADX WARN: Type inference failed for: r11v138, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r12v125, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r13v57, types: [int, short] */
    /* JADX WARN: Type inference failed for: r3v192, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r40v40 */
    /* JADX WARN: Type inference failed for: r4v187, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r51v1 */
    /* JADX WARN: Type inference failed for: r51v10 */
    /* JADX WARN: Type inference failed for: r51v11 */
    /* JADX WARN: Type inference failed for: r51v12 */
    /* JADX WARN: Type inference failed for: r51v13 */
    /* JADX WARN: Type inference failed for: r51v14 */
    /* JADX WARN: Type inference failed for: r51v15 */
    /* JADX WARN: Type inference failed for: r51v16 */
    /* JADX WARN: Type inference failed for: r51v17 */
    /* JADX WARN: Type inference failed for: r51v18 */
    /* JADX WARN: Type inference failed for: r51v19 */
    /* JADX WARN: Type inference failed for: r51v2 */
    /* JADX WARN: Type inference failed for: r51v20 */
    /* JADX WARN: Type inference failed for: r51v21 */
    /* JADX WARN: Type inference failed for: r51v22 */
    /* JADX WARN: Type inference failed for: r51v23 */
    /* JADX WARN: Type inference failed for: r51v24 */
    /* JADX WARN: Type inference failed for: r51v25 */
    /* JADX WARN: Type inference failed for: r51v26 */
    /* JADX WARN: Type inference failed for: r51v27 */
    /* JADX WARN: Type inference failed for: r51v28 */
    /* JADX WARN: Type inference failed for: r51v29 */
    /* JADX WARN: Type inference failed for: r51v3 */
    /* JADX WARN: Type inference failed for: r51v30 */
    /* JADX WARN: Type inference failed for: r51v31 */
    /* JADX WARN: Type inference failed for: r51v32 */
    /* JADX WARN: Type inference failed for: r51v33 */
    /* JADX WARN: Type inference failed for: r51v34 */
    /* JADX WARN: Type inference failed for: r51v35 */
    /* JADX WARN: Type inference failed for: r51v36 */
    /* JADX WARN: Type inference failed for: r51v37 */
    /* JADX WARN: Type inference failed for: r51v38 */
    /* JADX WARN: Type inference failed for: r51v39 */
    /* JADX WARN: Type inference failed for: r51v4 */
    /* JADX WARN: Type inference failed for: r51v40 */
    /* JADX WARN: Type inference failed for: r51v41 */
    /* JADX WARN: Type inference failed for: r51v44 */
    /* JADX WARN: Type inference failed for: r51v45 */
    /* JADX WARN: Type inference failed for: r51v46 */
    /* JADX WARN: Type inference failed for: r51v47 */
    /* JADX WARN: Type inference failed for: r51v48 */
    /* JADX WARN: Type inference failed for: r51v49 */
    /* JADX WARN: Type inference failed for: r51v5 */
    /* JADX WARN: Type inference failed for: r51v50 */
    /* JADX WARN: Type inference failed for: r51v6 */
    /* JADX WARN: Type inference failed for: r51v7 */
    /* JADX WARN: Type inference failed for: r51v8 */
    /* JADX WARN: Type inference failed for: r51v9 */
    /* JADX WARN: Type inference failed for: r6v76, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v115, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r7v131 */
    /* JADX WARN: Type inference failed for: r7v150, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v157, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v158 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v170 */
    /* JADX WARN: Type inference failed for: r7v179 */
    /* JADX WARN: Type inference failed for: r7v185 */
    /* JADX WARN: Type inference failed for: r7v189 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r7v211 */
    /* JADX WARN: Type inference failed for: r7v212 */
    /* JADX WARN: Type inference failed for: r7v214 */
    /* JADX WARN: Type inference failed for: r7v215 */
    /* JADX WARN: Type inference failed for: r7v216 */
    /* JADX WARN: Type inference failed for: r7v217 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r8v103, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v95, types: [java.lang.Class] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        /*
            Method dump skipped, instruction units count: 8374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getShowEditors.<clinit>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r7 = java.lang.Integer.valueOf(r19);
        r9 = kotlin.getShowEditors.onMediaButtonEvent;
        r10 = kotlin.getShowEditors.$11 + 113;
        kotlin.getShowEditors.$10 = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if ((r10 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        r10 = new java.lang.Object[4];
        r10[2] = java.lang.Integer.valueOf(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r10 = new java.lang.Object[3];
        r10[2] = java.lang.Integer.valueOf(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        r10[1] = java.lang.Character.valueOf(r17);
        r10[0] = java.lang.Integer.valueOf(r16);
        r12 = kotlin.getShowEditors.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r13 = kotlin.getShowEditors.$10 + 57;
        kotlin.getShowEditors.$11 = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        r4 = $$c(r12[136(0x88, float:1.9E-43)], (short) 617, r12[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        r13 = kotlin.getShowEditors.$10;
        r14 = (r13 ^ 11) + ((r13 & 11) << 1);
        kotlin.getShowEditors.$11 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if ((r14 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        r4 = java.lang.Class.forName(r4, true, (java.lang.ClassLoader) kotlin.getShowEditors.onPlay);
        r13 = r12[56];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        r4 = java.lang.Class.forName(r4, true, (java.lang.ClassLoader) kotlin.getShowEditors.onPlay);
        r13 = r12[16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        r13 = r13;
        r12 = $$c(r13, (short) ((r13 ^ org.apache.commons.compress.archivers.tar.TarConstants.LF_CONTIG) | (r13 & org.apache.commons.compress.archivers.tar.TarConstants.LF_CONTIG)), r12[334(0x14e, float:4.68E-43)]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        r13 = kotlin.getShowEditors.$10;
        r14 = (r13 ^ 107) + ((r13 & 107) << 1);
        kotlin.getShowEditors.$11 = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if ((r14 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r13 = new java.lang.Class[3];
        r13[0] = java.lang.Integer.TYPE;
        r13[0] = java.lang.Character.TYPE;
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        r13 = new java.lang.Class[3];
        r13[0] = java.lang.Integer.TYPE;
        r13[1] = java.lang.Character.TYPE;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        r13[r8] = java.lang.Integer.TYPE;
        r4 = (java.lang.Class) r4.getMethod(r12, r13).invoke(r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f2, code lost:
    
        if (r21 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        if ((!r20) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        r0 = r4.getConstructor(r22);
        r1 = kotlin.getShowEditors.$11;
        r2 = (r1 & 3) + (r1 | 3);
        r1 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
    
        kotlin.getShowEditors.$10 = r1;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0107, code lost:
    
        r0 = kotlin.getShowEditors.$11 + 15;
        kotlin.getShowEditors.$10 = r0 % 128;
        r0 = r0 % 2;
        r0 = r4.getDeclaredConstructor(r22);
        r1 = kotlin.getShowEditors.$10 + 35;
        kotlin.getShowEditors.$11 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011c, code lost:
    
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
    
        if (r22 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (r20 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        r0 = kotlin.getShowEditors.$10;
        r2 = (r0 ^ 5) + ((r0 & 5) << 1);
        kotlin.getShowEditors.$11 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012f, code lost:
    
        if ((r2 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        r0 = r4.getDeclaredField(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0136, code lost:
    
        r4.getDeclaredField(r21);
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013e, code lost:
    
        r0 = r4.getField(r21);
        r1 = kotlin.getShowEditors.$11 + 57;
        kotlin.getShowEditors.$10 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
    
        r1 = kotlin.getShowEditors.$11;
        r2 = (r1 & 117) + (r1 | 117);
        r1 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0155, code lost:
    
        if (r20 == true) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0157, code lost:
    
        r0 = r4.getMethod(r21, r22);
        r1 = kotlin.getShowEditors.$11 + 75;
        kotlin.getShowEditors.$10 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0164, code lost:
    
        r0 = r4.getDeclaredMethod(r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0168, code lost:
    
        r5.put(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016d, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0171, code lost:
    
        if (r1 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0174, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r7 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object write(int r16, char r17, int r18, int r19, boolean r20, java.lang.String r21, java.lang.Class[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getShowEditors.write(int, char, int, int, boolean, java.lang.String, java.lang.Class[]):java.lang.Object");
    }

    public static Object write(int i, char c, int i2) throws Throwable {
        Object[] objArr;
        byte b;
        short s;
        byte b2;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = (i4 ^ 47) + ((i4 & 47) << 1);
        $11 = i5 % 128;
        int i6 = i5 % 2;
        Object obj = onMediaButtonEvent;
        int i7 = i4 + 43;
        int i8 = i7 % 128;
        $11 = i8;
        int i9 = i7 % 2;
        int i10 = (i8 & 93) + (i8 | 93);
        $10 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                objArr = new Object[3];
                objArr[3] = Integer.valueOf(i2);
            } else {
                objArr = new Object[3];
                objArr[2] = Integer.valueOf(i2);
            }
            objArr[1] = Character.valueOf(c);
            objArr[0] = Integer.valueOf(i);
            byte[] bArr = $$a;
            int i11 = $11;
            int i12 = (i11 & 113) + (i11 | 113);
            $10 = i12 % 128;
            int i13 = i12 % 2;
            Class<?> cls = Class.forName($$c(bArr[136], (short) 617, bArr[16]), true, (ClassLoader) onPlay);
            int i14 = $11;
            int i15 = (i14 & 99) + (i14 | 99);
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                b = bArr[16];
                s = (short) ((b ^ 242) | (b & 242));
                b2 = bArr[31149];
            } else {
                b = bArr[16];
                s = (short) ((b ^ TarConstants.LF_CONTIG) | (b & TarConstants.LF_CONTIG));
                b2 = bArr[334];
            }
            int i16 = ((i14 | 113) << 1) - (i14 ^ 113);
            $10 = i16 % 128;
            int i17 = i16 % 2;
            String str$$c = $$c(b, s, b2);
            Class<?>[] clsArr = new Class[3];
            clsArr[0] = Integer.TYPE;
            int i18 = $10 + 63;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            clsArr[1] = Character.TYPE;
            clsArr[2] = Integer.TYPE;
            Method method = cls.getMethod(str$$c, clsArr);
            int i20 = $11;
            int i21 = (i20 & 123) + (i20 | 123);
            $10 = i21 % 128;
            int i22 = i21 % 2;
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int read(Object obj) throws Throwable {
        Object[] objArr;
        byte b;
        short s;
        byte b2;
        Method method;
        int i = 2 % 2;
        int i2 = $10 + 73;
        int i3 = i2 % 128;
        $11 = i3;
        int i4 = i2 % 2;
        Object obj2 = onMediaButtonEvent;
        int i5 = i3 + 105;
        int i6 = i5 % 128;
        $10 = i6;
        try {
            if (i5 % 2 != 0) {
                objArr = new Object[1];
                objArr[1] = obj;
                b = $$a[20071];
            } else {
                objArr = new Object[]{obj};
                b = $$a[136];
            }
            int i7 = i6 + 13;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            byte b3 = b;
            short s2 = (short) 617;
            byte[] bArr = $$a;
            String str$$c = $$c(b3, s2, bArr[16]);
            int i9 = $11;
            int i10 = (i9 & 81) + (i9 | 81);
            $10 = i10 % 128;
            int i11 = i10 % 2;
            Class<?> cls = Class.forName(str$$c, true, (ClassLoader) onPlay);
            byte b4 = bArr[85];
            int i12 = $11 + 111;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                s = (short) ((b4 ^ 20414) | (b4 & 20414));
                b2 = bArr[75];
            } else {
                s = (short) ((b4 ^ 1098) | (b4 & 1098));
                b2 = bArr[23];
            }
            String str$$c2 = $$c(b4, s, b2);
            int i13 = $10;
            int i14 = ((i13 | 13) << 1) - (i13 ^ 13);
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                Class<?>[] clsArr = new Class[0];
                clsArr[1] = Object.class;
                method = cls.getMethod(str$$c2, clsArr);
            } else {
                method = cls.getMethod(str$$c2, Object.class);
            }
            return ((Integer) method.invoke(obj2, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AudioAttributesCompatParcelizer(int i) throws Throwable {
        byte b;
        int i2;
        String str$$c;
        Class<?>[] clsArr;
        Class<?> cls;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 105;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        Object obj = onMediaButtonEvent;
        int i6 = (i4 & 77) + (i4 | 77);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        char c = 1;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            int i8 = $11;
            int i9 = ((i8 | 123) << 1) - (i8 ^ 123);
            int i10 = i9 % 128;
            $10 = i10;
            int i11 = i9 % 2;
            byte b2 = bArr[136];
            short s = (short) 617;
            int i12 = (i10 & 65) + (i10 | 65);
            $11 = i12 % 128;
            int i13 = i12 % 2;
            Class<?> cls2 = Class.forName($$c(b2, s, bArr[16]), true, (ClassLoader) onPlay);
            int i14 = $11;
            int i15 = (i14 & 113) + (i14 | 113);
            int i16 = i15 % 128;
            $10 = i16;
            if (i15 % 2 != 0) {
                b = (byte) (-bArr[23173]);
                i2 = 17227;
            } else {
                b = (byte) (-bArr[567]);
                i2 = 668;
            }
            short s2 = (short) i2;
            int i17 = (i16 ^ 5) + ((i16 & 5) << 1);
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                str$$c = $$c(b, s2, bArr[69]);
                clsArr = new Class[1];
                cls = Integer.TYPE;
            } else {
                str$$c = $$c(b, s2, bArr[69]);
                clsArr = new Class[1];
                cls = Integer.TYPE;
                c = 0;
            }
            clsArr[c] = cls;
            return ((Integer) cls2.getMethod(str$$c, clsArr).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
