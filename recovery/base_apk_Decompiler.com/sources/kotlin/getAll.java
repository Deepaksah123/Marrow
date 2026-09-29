package kotlin;

import android.os.Process;
import com.google.android.gms.wallet.WalletConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class getAll {
    private static final byte[] $$a;
    private static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    public static final Map onCommand;
    private static Object onFastForward;
    private static Object onMediaButtonEvent;
    private static byte[] onPause;
    private static byte[] onPlay;
    public static final Map onPlayFromMediaId;
    private static long onPlayFromSearch;
    private static int onPlayFromUri;
    private static long onPrepareFromMediaId;
    private static int onPrepareFromUri;
    private static int onRemoveQueueItem;
    private static boolean onRemoveQueueItemAt;
    private static long onRewind;
    private static int onSeekTo;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, int r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r9 = 119 - r9
            byte[] r1 = kotlin.getAll.$$a
            int r8 = 1061 - r8
            int r2 = 36 - r10
            byte[] r2 = new byte[r2]
            int r10 = 35 - r10
            r3 = 0
            if (r1 != 0) goto L1f
            int r4 = kotlin.getAll.$17
            int r4 = r4 + 29
            int r5 = r4 % 128
            kotlin.getAll.$16 = r5
            int r4 = r4 % r0
            r4 = r9
            r5 = r3
            r9 = r8
            goto L38
        L1f:
            r4 = r3
        L20:
            byte r5 = (byte) r9
            r2[r4] = r5
            int r5 = r4 + 1
            if (r4 != r10) goto L2d
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2, r3)
            return r8
        L2d:
            r4 = r1[r8]
            int r6 = kotlin.getAll.$16
            int r6 = r6 + 83
            int r7 = r6 % 128
            kotlin.getAll.$17 = r7
            int r6 = r6 % r0
        L38:
            int r8 = r8 + 1
            int r4 = -r4
            int r9 = r9 + r4
            int r9 = r9 + 1
            r4 = r5
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAll.$$c(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x023c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.URL read(java.lang.String r21, android.content.pm.ApplicationInfo r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAll.read(java.lang.String, android.content.pm.ApplicationInfo):java.net.URL");
    }

    private getAll() {
    }

    public static Object read(int i) {
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = (i3 & 61) + (i3 | 61);
        $11 = i4 % 128;
        int i5 = i4 % 2;
        Map map = onPlayFromMediaId;
        int i6 = onPrepareFromUri;
        Object obj = map.get(Integer.valueOf(((~i) & i6) | ((~i6) & i)));
        int i7 = $11;
        int i8 = (i7 & 49) + (i7 | 49);
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 19 / 0;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0414, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r8 == true ? 1 : 0, r29[105(0x69, float:1.47E-43)], r29[391(0x187, float:5.48E-43)])).getMethod($$c((short) 672, r29[306(0x132, float:4.29E-43)], r29[515(0x203, float:7.22E-43)]), null).invoke(r6, null)).booleanValue() == false) goto L1118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x1baf, code lost:
    
        r8 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x1bb4, code lost:
    
        r1 = r46.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        kotlin.getAll.onMediaButtonEvent = r1.newInstance(r2, java.lang.Boolean.valueOf(!r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x1bdd, code lost:
    
        r1 = kotlin.getAll.$15;
        r2 = ((r1 | 79) << 1) - (r1 ^ 79);
        kotlin.getAll.$14 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x1beb, code lost:
    
        if (r8 == 0) goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1bed, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x1bf1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x1bf2, code lost:
    
        r1 = r0;
        r5 = r45 ? 1 : 0;
        r27 = r27;
        r39 = r39;
        r45 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x1bf7, code lost:
    
        if (r45 == false) goto L768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x1bf9, code lost:
    
        r1 = kotlin.getAll.$15 + 111;
        kotlin.getAll.$14 = r1 % 128;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x1c03, code lost:
    
        if ((r1 % 2) == 0) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x1c05, code lost:
    
        r5 = r45 ? 1 : 0;
        r5 = r5;
        r45 = r45;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x1c09, code lost:
    
        if (r5 < 'm') goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x1c0c, code lost:
    
        r5 = r45 ? 1 : 0;
        r5 = r5;
        r45 = r45;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x1c10, code lost:
    
        if (r5 < 26) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1c13, code lost:
    
        r5 = r45 ? 1 : 0;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1c16, code lost:
    
        r1 = new java.lang.Object[r2];
        r1[1] = -253883599;
        r1[0] = -2017604470;
        r2 = kotlin.startForeground.RemoteActionCompatParcelizer(1344538224);
        r45 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x1c33, code lost:
    
        if (r2 != null) goto L774;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1c35, code lost:
    
        r2 = (char) ((android.media.AudioTrack.getMinVolume() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.media.AudioTrack.getMinVolume() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 46412);
        r3 = 12868 - (~(-(-android.graphics.Color.blue(0))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1c51, code lost:
    
        r4 = -(-android.view.KeyEvent.keyCodeFromString(""));
        r43 = (r4 ^ 28) + ((r4 & 28) << 1);
        r4 = kotlin.getAll.$15;
        r6 = (r4 ^ 73) + ((r4 & 73) << 1);
        kotlin.getAll.$14 = r6 % 128;
        r6 = r6 % 2;
        r45 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x1c6e, code lost:
    
        r2 = kotlin.startForeground.read(r2, r3, r43, 778945253, false, $$c(r4[202(0xca, float:2.83E-43)], (byte) (-kotlin.getAll.$$a[206(0xce, float:2.89E-43)]), r4[607(0x25f, float:8.5E-43)]), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x1c9b, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(null, r1);
        r5 = r5;
        r45 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x1ca1, code lost:
    
        r4 = 2;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x1caa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x1cac, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x1cb0, code lost:
    
        if (r2 != null) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x1cb2, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x1cb3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x1cb4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x1cb5, code lost:
    
        r45 = r45 ? 1 : 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1194:0x1f00 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1197:0x1ef2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1226:? A[Catch: all -> 0x1eac, SYNTHETIC, TryCatch #85 {all -> 0x1eac, blocks: (B:884:0x1e78, B:885:0x1e7b, B:778:0x1cac, B:780:0x1cb2, B:781:0x1cb3, B:887:0x1e7d, B:889:0x1e92, B:890:0x1e93, B:892:0x1e95, B:894:0x1eaa, B:895:0x1eab, B:400:0x0c7f, B:304:0x08f8, B:306:0x0917, B:769:0x1c16, B:771:0x1c35, B:773:0x1c6e, B:774:0x1c9b), top: B:1070:0x0c7f, inners: #60, #69, #83 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x042f A[Catch: all -> 0x04b4, TryCatch #87 {all -> 0x04b4, blocks: (B:131:0x0439, B:140:0x04ac, B:142:0x04b2, B:143:0x04b3, B:126:0x0429, B:128:0x042f, B:129:0x0430, B:134:0x047b, B:136:0x0487, B:137:0x04a9, B:135:0x0483), top: B:1118:0x0439, inners: #82 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0430 A[Catch: all -> 0x04b4, TryCatch #87 {all -> 0x04b4, blocks: (B:131:0x0439, B:140:0x04ac, B:142:0x04b2, B:143:0x04b3, B:126:0x0429, B:128:0x042f, B:129:0x0430, B:134:0x047b, B:136:0x0487, B:137:0x04a9, B:135:0x0483), top: B:1118:0x0439, inners: #82 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07dc A[Catch: Exception -> 0x07de, all -> 0x1eae, TryCatch #9 {Exception -> 0x07de, blocks: (B:245:0x07ca, B:247:0x07d0, B:248:0x07d1, B:252:0x07d6, B:254:0x07dc, B:255:0x07dd), top: B:978:0x06c0, outer: #86 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07dd A[Catch: Exception -> 0x07de, all -> 0x1eae, TRY_LEAVE, TryCatch #9 {Exception -> 0x07de, blocks: (B:245:0x07ca, B:247:0x07d0, B:248:0x07d1, B:252:0x07d6, B:254:0x07dc, B:255:0x07dd), top: B:978:0x06c0, outer: #86 }] */
    /* JADX WARN: Removed duplicated region for block: B:884:0x1e78 A[Catch: all -> 0x1eac, TRY_ENTER, TryCatch #85 {all -> 0x1eac, blocks: (B:884:0x1e78, B:885:0x1e7b, B:778:0x1cac, B:780:0x1cb2, B:781:0x1cb3, B:887:0x1e7d, B:889:0x1e92, B:890:0x1e93, B:892:0x1e95, B:894:0x1eaa, B:895:0x1eab, B:400:0x0c7f, B:304:0x08f8, B:306:0x0917, B:769:0x1c16, B:771:0x1c35, B:773:0x1c6e, B:774:0x1c9b), top: B:1070:0x0c7f, inners: #60, #69, #83 }] */
    /* JADX WARN: Removed duplicated region for block: B:908:0x1ee2 A[Catch: Exception -> 0x1fb5, TRY_ENTER, TryCatch #47 {Exception -> 0x1fb5, blocks: (B:12:0x00d0, B:14:0x00e0, B:16:0x00f1, B:42:0x01e9, B:939:0x1fac, B:941:0x1fb3, B:942:0x1fb4, B:48:0x024a, B:929:0x1f98, B:931:0x1f9f, B:932:0x1fa0, B:934:0x1fa2, B:936:0x1fa9, B:937:0x1faa, B:55:0x02c4, B:60:0x0310, B:62:0x0316, B:63:0x0317, B:64:0x0318, B:66:0x035d, B:75:0x039a, B:79:0x03a3, B:83:0x03b0, B:88:0x03bb, B:94:0x03c6, B:908:0x1ee2, B:914:0x1ef5, B:926:0x1f70, B:915:0x1f00, B:920:0x1f44, B:922:0x1f4a, B:923:0x1f4b, B:911:0x1ee8, B:916:0x1f15, B:917:0x1f41, B:51:0x0296, B:50:0x025c, B:44:0x021d, B:56:0x02d4), top: B:1046:0x00d0, inners: #14, #71, #74, #84, #116 }] */
    /* JADX WARN: Removed duplicated region for block: B:914:0x1ef5 A[Catch: Exception -> 0x1fb5, TryCatch #47 {Exception -> 0x1fb5, blocks: (B:12:0x00d0, B:14:0x00e0, B:16:0x00f1, B:42:0x01e9, B:939:0x1fac, B:941:0x1fb3, B:942:0x1fb4, B:48:0x024a, B:929:0x1f98, B:931:0x1f9f, B:932:0x1fa0, B:934:0x1fa2, B:936:0x1fa9, B:937:0x1faa, B:55:0x02c4, B:60:0x0310, B:62:0x0316, B:63:0x0317, B:64:0x0318, B:66:0x035d, B:75:0x039a, B:79:0x03a3, B:83:0x03b0, B:88:0x03bb, B:94:0x03c6, B:908:0x1ee2, B:914:0x1ef5, B:926:0x1f70, B:915:0x1f00, B:920:0x1f44, B:922:0x1f4a, B:923:0x1f4b, B:911:0x1ee8, B:916:0x1f15, B:917:0x1f41, B:51:0x0296, B:50:0x025c, B:44:0x021d, B:56:0x02d4), top: B:1046:0x00d0, inners: #14, #71, #74, #84, #116 }] */
    /* JADX WARN: Type inference failed for: r10v104, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v177, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v92, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r12v156, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r14v8, types: [short] */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v16 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v120, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v220, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v265 */
    /* JADX WARN: Type inference failed for: r2v266 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v11 */
    /* JADX WARN: Type inference failed for: r39v12 */
    /* JADX WARN: Type inference failed for: r39v15 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v20 */
    /* JADX WARN: Type inference failed for: r39v21 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v31 */
    /* JADX WARN: Type inference failed for: r39v34 */
    /* JADX WARN: Type inference failed for: r39v35 */
    /* JADX WARN: Type inference failed for: r39v36 */
    /* JADX WARN: Type inference failed for: r39v37 */
    /* JADX WARN: Type inference failed for: r39v38 */
    /* JADX WARN: Type inference failed for: r39v39 */
    /* JADX WARN: Type inference failed for: r39v40 */
    /* JADX WARN: Type inference failed for: r39v41 */
    /* JADX WARN: Type inference failed for: r39v44 */
    /* JADX WARN: Type inference failed for: r39v45 */
    /* JADX WARN: Type inference failed for: r39v49 */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v50 */
    /* JADX WARN: Type inference failed for: r39v51 */
    /* JADX WARN: Type inference failed for: r39v52 */
    /* JADX WARN: Type inference failed for: r39v53 */
    /* JADX WARN: Type inference failed for: r39v54 */
    /* JADX WARN: Type inference failed for: r39v55 */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r4v104, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v209 */
    /* JADX WARN: Type inference failed for: r4v90, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v91, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v136, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v186 */
    /* JADX WARN: Type inference failed for: r5v187 */
    /* JADX WARN: Type inference failed for: r5v188 */
    /* JADX WARN: Type inference failed for: r5v189 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v288 */
    /* JADX WARN: Type inference failed for: r5v293 */
    /* JADX WARN: Type inference failed for: r5v294 */
    /* JADX WARN: Type inference failed for: r5v314, types: [short] */
    /* JADX WARN: Type inference failed for: r5v315 */
    /* JADX WARN: Type inference failed for: r5v318, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v322 */
    /* JADX WARN: Type inference failed for: r5v343 */
    /* JADX WARN: Type inference failed for: r5v344 */
    /* JADX WARN: Type inference failed for: r5v345 */
    /* JADX WARN: Type inference failed for: r5v346 */
    /* JADX WARN: Type inference failed for: r5v347 */
    /* JADX WARN: Type inference failed for: r5v348 */
    /* JADX WARN: Type inference failed for: r5v349 */
    /* JADX WARN: Type inference failed for: r5v350 */
    /* JADX WARN: Type inference failed for: r5v351 */
    /* JADX WARN: Type inference failed for: r5v352 */
    /* JADX WARN: Type inference failed for: r5v353 */
    /* JADX WARN: Type inference failed for: r5v354 */
    /* JADX WARN: Type inference failed for: r5v355 */
    /* JADX WARN: Type inference failed for: r5v356 */
    /* JADX WARN: Type inference failed for: r5v357 */
    /* JADX WARN: Type inference failed for: r5v358 */
    /* JADX WARN: Type inference failed for: r5v359 */
    /* JADX WARN: Type inference failed for: r5v360 */
    /* JADX WARN: Type inference failed for: r5v361 */
    /* JADX WARN: Type inference failed for: r5v362 */
    /* JADX WARN: Type inference failed for: r5v363 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v100, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v173 */
    /* JADX WARN: Type inference failed for: r8v174 */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v176 */
    /* JADX WARN: Type inference failed for: r8v182 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26, types: [short] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v75, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v94 */
    static {
        /*
            Method dump skipped, instruction units count: 8172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAll.<clinit>():void");
    }

    public static Object RemoteActionCompatParcelizer(char c, int i, int i2, int i3, boolean z, String str, Class[] clsArr) throws Throwable {
        short s;
        byte[] bArr;
        Class<?> cls;
        short s2;
        byte b;
        Object method;
        int i4 = 2 % 2;
        int i5 = $11;
        int i6 = (i5 ^ 85) + ((i5 & 85) << 1);
        $10 = i6 % 128;
        int i7 = i6 % 2;
        Map map = onPlayFromMediaId;
        Object obj = map.get(Integer.valueOf(i3));
        if (obj != null) {
            int i8 = $11;
            int i9 = (i8 ^ 31) + ((i8 & 31) << 1);
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 71 / 0;
            }
            return obj;
        }
        Integer numValueOf = Integer.valueOf(i3);
        Object obj2 = onMediaButtonEvent;
        int i11 = $11;
        int i12 = ((i11 | 19) << 1) - (i11 ^ 19);
        $10 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = (i11 & 11) + (i11 | 11);
        $10 = i14 % 128;
        int i15 = i14 % 2;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i);
            int i16 = $11;
            int i17 = ((i16 | 65) << 1) - (i16 ^ 65);
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                objArr[1] = numValueOf2;
                objArr[0] = Character.valueOf(c);
                s = (short) 4391;
                bArr = $$a;
            } else {
                objArr[1] = numValueOf2;
                objArr[0] = Character.valueOf(c);
                s = (short) 434;
                bArr = $$a;
            }
            byte b2 = bArr[55];
            byte[] bArr2 = $$a;
            String str$$c = $$c(s, b2, bArr2[45]);
            Object obj3 = onFastForward;
            int i18 = $10;
            int i19 = (i18 & 9) + (i18 | 9);
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                cls = Class.forName(str$$c, true, (ClassLoader) obj3);
                s2 = (short) 11613;
                b = bArr2[121];
            } else {
                cls = Class.forName(str$$c, true, (ClassLoader) obj3);
                s2 = (short) WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
                b = bArr2[25];
            }
            Method method2 = cls.getMethod($$c(s2, b, (byte) (-bArr2[95])), Character.TYPE, Integer.TYPE, Integer.TYPE);
            int i20 = $11 + 95;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            Class cls2 = (Class) method2.invoke(obj2, objArr);
            int i22 = $10;
            int i23 = (i22 & 3) + (i22 | 3);
            int i24 = i23 % 128;
            $11 = i24;
            if (i23 % 2 == 0) {
                throw null;
            }
            if (str == null) {
                method = !z ? cls2.getConstructor(clsArr) : cls2.getDeclaredConstructor(clsArr);
            } else if (clsArr == null) {
                int i25 = (i22 ^ 53) + ((i22 & 53) << 1);
                $11 = i25 % 128;
                if (i25 % 2 == 0) {
                    throw null;
                }
                method = !(z ^ true) ? cls2.getDeclaredField(str) : cls2.getField(str);
            } else if (z) {
                int i26 = (i24 & 57) + (i24 | 57);
                $10 = i26 % 128;
                if (i26 % 2 != 0) {
                    method = cls2.getDeclaredMethod(str, clsArr);
                    int i27 = 16 / 0;
                } else {
                    method = cls2.getDeclaredMethod(str, clsArr);
                }
            } else {
                method = cls2.getMethod(str, clsArr);
                int i28 = $11;
                int i29 = ((i28 | 89) << 1) - (i28 ^ 89);
                $10 = i29 % 128;
                int i30 = i29 % 2;
            }
            map.put(numValueOf, method);
            return method;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AudioAttributesCompatParcelizer(char c, int i, int i2) throws Throwable {
        String str$$c;
        ClassLoader classLoader;
        boolean z;
        String str$$c2;
        Class<?>[] clsArr;
        int i3 = 2 % 2;
        Object obj = onMediaButtonEvent;
        int i4 = $11;
        int i5 = (i4 ^ 87) + ((i4 & 87) << 1);
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 81;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            short s = (short) 434;
            byte[] bArr = $$a;
            byte b = bArr[55];
            int i10 = $10;
            int i11 = (i10 & 97) + (i10 | 97);
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                str$$c = $$c(s, b, bArr[49]);
                classLoader = (ClassLoader) onFastForward;
                z = false;
            } else {
                str$$c = $$c(s, b, bArr[45]);
                classLoader = (ClassLoader) onFastForward;
                z = true;
            }
            int i12 = $10;
            int i13 = (i12 ^ 125) + ((i12 & 125) << 1);
            $11 = i13 % 128;
            int i14 = i13 % 2;
            Class<?> cls = Class.forName(str$$c, z, classLoader);
            short s2 = (short) WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
            byte b2 = bArr[25];
            int i15 = $11 + 115;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                str$$c2 = $$c(s2, b2, (byte) (-bArr[62]));
                clsArr = new Class[4];
            } else {
                str$$c2 = $$c(s2, b2, (byte) (-bArr[95]));
                clsArr = new Class[3];
            }
            clsArr[0] = Character.TYPE;
            clsArr[1] = Integer.TYPE;
            int i16 = $10 + 83;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            clsArr[2] = Integer.TYPE;
            return cls.getMethod(str$$c2, clsArr).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int write(Object obj) throws Throwable {
        String str$$c;
        Object obj2;
        boolean z;
        int i = 2 % 2;
        Object obj3 = onMediaButtonEvent;
        int i2 = $11 + 97;
        int i3 = i2 % 128;
        $10 = i3;
        int i4 = i2 % 2;
        try {
            Object[] objArr = {obj};
            short s = (short) 434;
            byte[] bArr = $$a;
            int i5 = (i3 ^ 111) + ((i3 & 111) << 1);
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str$$c = $$c(s, bArr[30], bArr[11]);
                obj2 = onFastForward;
                z = false;
            } else {
                str$$c = $$c(s, bArr[55], bArr[45]);
                obj2 = onFastForward;
                z = true;
            }
            Class<?> cls = Class.forName(str$$c, z, (ClassLoader) obj2);
            String str$$c2 = $$c((short) WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, bArr[25], (byte) (-bArr[95]));
            Class<?>[] clsArr = new Class[1];
            new Random().nextInt(1426447480);
            Process.getElapsedCpuTime();
            clsArr[0] = Object.class;
            Integer num = (Integer) cls.getMethod(str$$c2, clsArr).invoke(obj3, objArr);
            int i6 = $11;
            int i7 = (i6 ^ 9) + ((i6 & 9) << 1);
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                num.intValue();
                throw null;
            }
            int iIntValue = num.intValue();
            int i8 = $11 + 5;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 39 / 0;
            }
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AudioAttributesCompatParcelizer(int i) throws Throwable {
        short s;
        byte b;
        byte b2;
        String str$$c;
        ClassLoader classLoader;
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = (i3 ^ 93) + ((i3 & 93) << 1);
        $11 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Object obj2 = onMediaButtonEvent;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            int i5 = $11;
            int i6 = ((i5 | 47) << 1) - (i5 ^ 47);
            int i7 = i6 % 128;
            $10 = i7;
            if (i6 % 2 != 0) {
                s = (short) 434;
                byte[] bArr = $$a;
                b = bArr[120];
                b2 = bArr[63];
            } else {
                s = (short) 434;
                byte[] bArr2 = $$a;
                b = bArr2[55];
                b2 = bArr2[45];
            }
            int i8 = i7 + 89;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                str$$c = $$c(s, b, b2);
                classLoader = (ClassLoader) onFastForward;
            } else {
                str$$c = $$c(s, b, b2);
                classLoader = (ClassLoader) onFastForward;
            }
            Class<?> cls = Class.forName(str$$c, true, classLoader);
            short s2 = (short) WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
            byte[] bArr3 = $$a;
            byte b3 = bArr3[25];
            int i9 = $11 + 23;
            $10 = i9 % 128;
            String str$$c2 = i9 % 2 != 0 ? $$c(s2, b3, (byte) (-bArr3[74])) : $$c(s2, b3, (byte) (-bArr3[95]));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Integer.TYPE;
            Integer num = (Integer) cls.getMethod(str$$c2, clsArr).invoke(obj2, objArr);
            int i10 = $11;
            int i11 = ((i10 | 99) << 1) - (i10 ^ 99);
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int iIntValue = num.intValue();
            int i13 = $10;
            int i14 = (i13 ^ 3) + ((i13 & 3) << 1);
            $11 = i14 % 128;
            if (i14 % 2 != 0) {
                return iIntValue;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
