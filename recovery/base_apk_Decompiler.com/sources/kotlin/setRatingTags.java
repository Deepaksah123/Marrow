package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setRatingTags;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseEventObject;", "IconCompatParcelizer", "Lo/parseEventObject;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setRatingTags extends getLessonIds {
    private static char[] AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long write;
    private parseEventObject IconCompatParcelizer;
    private static final byte[] $$l = {79, -100, -79, 21};
    private static final int $$m = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {10, -96, 35, -27, -70, 71, -5, -27, 7, -10, -14, 6, -20, 14, 3, -3, 0, -20, -41, 29, 12, -16, 1, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, -70, TarConstants.LF_BLK, -7, 10, -56, 30, 1, 6, -7, -4, -20, -6, -20, 22, -2, -4, -7, -18, -9, 7, -44, 36, -2, -10, -17, 14};
    private static final int $$k = 244;
    private static final byte[] $$d = {122, -64, TarConstants.LF_SYMLINK, -113, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 19;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r6, int r7, byte r8) {
        /*
            byte[] r0 = kotlin.setRatingTags.$$l
            int r8 = r8 * 3
            int r8 = r8 + 101
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRatingTags.$$n(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 44 - r6
            int r7 = r7 + 65
            int r5 = r5 + 4
            byte[] r1 = kotlin.setRatingTags.$$d
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r5
            r7 = r6
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r1[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRatingTags.g(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = kotlin.setRatingTags.$$j
            int r1 = r6 + 5
            int r8 = 119 - r8
            byte[] r1 = new byte[r1]
            int r6 = r6 + 4
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r0[r8]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + 5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRatingTags.h(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.setRatingTags$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setRatingTags$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "write", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public static int AudioAttributesCompatParcelizer;
        public static int write;

        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent write(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) setRatingTags.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static int write() {
            int i = write;
            int i2 = i % 8573104;
            write = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            AudioAttributesCompatParcelizer = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(write ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (true) {
            obj = null;
            if (buildsetrequirementsintent.write >= cArrAudioAttributesCompatParcelizer.length) {
                break;
            }
            int i3 = $11 + 47;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf("", "", 0) + 12424, 19 - ImageFormat.getBitsPerPixel(0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myTid() >> 22), (ViewConfiguration.getEdgeSlop() >> 16) + 1868, 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1983509525, false, $$n(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $10 + 31;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(char r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRatingTags.e(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016a  */
    @Override // kotlin.getLessonIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRatingTags.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    @Override // kotlin.getLessonIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRatingTags.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    @Override // kotlin.getLessonIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRatingTags.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x08dd A[Catch: all -> 0x02db, TryCatch #12 {all -> 0x02db, blocks: (B:206:0x0fb9, B:208:0x0fbf, B:209:0x0fea, B:248:0x1445, B:250:0x144b, B:251:0x1479, B:229:0x1232, B:231:0x1254, B:232:0x12a2, B:173:0x0b56, B:175:0x0b5c, B:176:0x0b87, B:126:0x08d7, B:128:0x08dd, B:129:0x090e, B:19:0x00e7, B:21:0x00ed, B:22:0x0115, B:24:0x0245, B:26:0x0275, B:27:0x02d5, B:134:0x09a3, B:138:0x09b3, B:142:0x09bf, B:143:0x09c5, B:144:0x09c6, B:159:0x0aa1, B:161:0x0aa7, B:162:0x0aa8, B:164:0x0aaa, B:166:0x0ab1, B:167:0x0ab2, B:148:0x09cf, B:150:0x09e4, B:151:0x0a1a, B:152:0x0a20, B:154:0x0a2d, B:155:0x0a97), top: B:294:0x00e7, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x09e4 A[Catch: all -> 0x0aa9, TryCatch #4 {all -> 0x0aa9, blocks: (B:148:0x09cf, B:150:0x09e4, B:151:0x0a1a), top: B:281:0x09cf, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0a2d A[Catch: all -> 0x0a9f, TryCatch #15 {all -> 0x0a9f, blocks: (B:152:0x0a20, B:154:0x0a2d, B:155:0x0a97), top: B:299:0x0a20, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0f94  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x107c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x10c5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1179  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x1424  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x09a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00bd  */
    @Override // kotlin.getLessonIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRatingTags.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplBaseParcelizer = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 117;
        AudioAttributesImplBaseParcelizer = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 5;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentWrite = Companion.write(context);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return intentWrite;
    }

    @Override // kotlin.getLessonIds, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 71;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 27;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer = new char[]{14819, 20465, 54748, 23463, 57753, 30586, 64840, 871, 35077, 7924, 42126, 10989, 45228, 50836, 19575, 53844, 22561, 60956, 18685, 16111, 42178, 10937, 36999, 1636, 35926, 29305, 63509, 28649, 54734, 23437, 49537, 46982, 15742, 41798, 10554, 40728, 1762, 36034, 29324, 63637, 28304, 54370, 23109, 49197, 46280, 49886, 22766, 54932, 27896, 64095, 28781, 36359, 1069, 37769, 10707, 42980, 15757, 19375, 49489, 24444, 53353, 42617, 15455, 45625, 2048, 40696, 5338, 60082, 24736, 63332, 19793, 50007, 22815, 12054, 42482, 15318, 56376, 43555, 12303, 48751, 1089, 37547, 6293, 59125, 27869, 64319, 16670, 56372, 43552, 12288, 48747, 1100, 37550, 6293, 59135, 27858, 64315, 16666};
        RemoteActionCompatParcelizer = -7203227981679973871L;
        write = 470609984011673148L;
    }
}
