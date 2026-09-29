package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0272zzbl;
import kotlin.C0276zzbp;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: renamed from: o.zzbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzbn;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivityC0274zzbn extends AbstractActivityC0270zzbj {
    private static int IconCompatParcelizer;
    private static long RemoteActionCompatParcelizer;
    private static long read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final byte[] $$c = {93, -80, 87, TarConstants.LF_DIR};
    private static final int $$f = 203;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {111, -63, 80, 27, -61, 61, 2, 19, -44, TarConstants.LF_DIR, 1, -13, 23, -7, 10, 3, -29, 32, 7, 4, 1, 14, 30, 16, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 27, TarConstants.LF_CONTIG, -5, -27, 32, -7, 28, -16, 17, -37, 40, 7, 0, -37, TarConstants.LF_NORMAL, 2, 7, 3, 3, -5, 13, 10, -36, 33, 14, 5, -11, 13, -5, 17, -41, TarConstants.LF_CONTIG, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -43};
    private static final int $$k = 179;
    private static final byte[] $$d = {37, -1, TarConstants.LF_CONTIG, -26, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 147;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int AudioAttributesCompatParcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, byte r7, short r8) {
        /*
            byte[] r0 = kotlin.ActivityC0274zzbn.$$c
            int r6 = r6 + 104
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r7 = r7 + 1
            r3 = r0[r7]
        L24:
            int r6 = r6 + r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0274zzbn.$$i(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = 114 - r8
            int r0 = r7 + 4
            byte[] r1 = kotlin.ActivityC0274zzbn.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0274zzbn.g(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 73
            int r7 = 56 - r7
            byte[] r0 = kotlin.ActivityC0274zzbn.$$j
            int r9 = 67 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r5 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r8 = r8 + r9
            int r8 = r8 + (-4)
            r9 = r3
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0274zzbn.h(short, byte, short, java.lang.Object[]):void");
    }

    public ActivityC0274zzbn() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.zzbn$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/zzbn$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/zzbl;", "p1", "Landroid/content/Intent;", "IconCompatParcelizer", "(Landroid/content/Context;Lo/zzbl;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent IconCompatParcelizer(Context p0, C0272zzbl p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ActivityC0274zzbn.class);
            p1.RemoteActionCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 73;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12424, 'D' - AndroidCharacter.getMirror('0'), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), 1867 - ((byte) KeyEvent.getModifierMetaStateMask()), View.resolveSize(0, 0) + 10, 1983509525, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $10 + 47;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r23, char[] r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0274zzbn.f(int, char[], java.lang.Object[]):void");
    }

    @Override // kotlin.AbstractActivityC0270zzbj, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 48, new char[]{60501, 8195, 30881, 16575, 60468, 39538, 3323, 28304, 1094, 33521, 9343, 22088, 15554, 43879, 15801, 49082, 21843, 21503, 21872, 42763, 19926, 31871}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(1 - KeyEvent.normalizeMetaState(0), new char[]{13787, 22022, 43208, 36619, 13750, 60512, 56483, 41279, 56771}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = AudioAttributesImplBaseParcelizer + 121;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 3, new char[]{2164, 60347, 1307, 36024, 2069, 20938, 28993, 41623, 57447, 18761, 22981, 39503, 55533, 24796, 16477, 29635, 45377, 38987, 10461, 27392, 43506, 47069, 4929, 23692, 33356, 44888, 64451, 13332, 31485, 50904}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 3, new char[]{40843, 49509, 11342, 26710, 40936, 31503, 22530, 18041, 30610, 25488, 28800, 32462, 20227, 18946, 26900, 38762, 9884, 45719, 392, 36846, 15892, 40196}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i4 = AudioAttributesImplBaseParcelizer + 109;
                    MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getTrimmedLength("") + 4535), ExpandableListView.getPackedPositionType(0L) + 6054, 42 - ((Process.getThreadPriority(0) + 20) >> 6), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(29663 - View.MeasureSpec.getSize(0), new char[]{40422, 61039, 31243, 50814, 21146, 57018, 10974, 46846, 841, 36708, 6912, 26409, 62356, 32688, 52179, 22433, 41029, 11311, 47176, 1080, 37082, 7339, 26825, 62645, 16725, 52516, 22807, 42337, 12754, 48631, 2453, 38324, 58880, 29192, 65069, 19101, 54971, 8925, 44797, 15179, 34617, 4865, 40746, 60357, 30697, 50063, 20465, 55313}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e((Process.myTid() >> 22) + 1, new char[]{6730, 49588, 62667, 43648, 6778, 31688, 32918, 34029, 61953, 25422, 43078, 48239, 51847, 19092, 45465, 21943, 41742, 45590, 55581, 19815, 48091, 40414, 57988, 31476, 36880, 34055, 2645, 4720, 26816, 60546, 5084, 3061, 16663, 54272, 15195, 9073, 22938, 15487, 19639, 55438, 13936, 10237, 21602, 61449, 3754, 3956, 32191, 59857, 59258, 30369, 34152, 33109, 65450, 24162, 44784, 48797, 54327, 18918, 46709, 22044, 44218, 45365, 57256, 20422, 34107, 39090, 59258, 26390}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3), new char[]{2635, 24579, 14709, 27859, 2601, 55853, 19754, 17130, 57862, 49834, 26028, 31282, 56023, 60272, 31862, 37815, 45831, 5105, 5283, 35686, 43907, 15469, 12089, 48303, 32789, 9401, 51180, 54312, 30874, 19809, 56887, 52655, 20764, 30134, 63206, 58666, 18847, 40349, 33116, 7819, 9846, 34333, 39388, 13836, 7842, 44742, 45062, 12246, 63356, 55106, 18647, 18179, 61358, 65416, 25373, 30879, 50230, 59486, 31692, 36889, 48306, 4230, 4678, 35220, 38201, 14679, 10945, 41290}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 40449, new char[]{40429, 1018, 41447, 18388, 58842, 35720, 10728, 53223, 28089, 4999, 45442, 22416, 62840, 39800, 14704, 57173, 32091, 58202, 33072, 10106, 50477, 27402, 2309, 44829, 19692, 62178, 37112, 14029, 54466, 31438, 6369, 48823, 23696, 49807, 24705, 1632, 42106, 19043, 59474, 36425, 11343, 53795, 28773, 5695, 46094, 23047, 63568, 39393, 16357, 56823, 17292, 57821, 34775, 9637, 52146, 27051, 3993, 44505, 21389, 61758, 38718, 13695, 56153, 31061, 7979, 48442, 8992}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(Gravity.getAbsoluteGravity(0, 0) + 1, new char[]{40518, 34430, 56511, 10550, 40575, 15439, 43184, 1887, 30228, 9431}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(Color.green(0) + 1, new char[]{63657, 55566, 60697, 37532, 63643, 25376, 39237, 48374, 4323, 31655, 45458, 33908, 10364, 21025, 43081, 28145, 16827, 43696, 49311, 30075, 22893, 34102, 64282, 17128, 29351, 40375, 4995, 10872, 35367, 62526, 2654, 13291, 41978, 52456, 8920, 6971, 47992, 9360, 21809, 57495}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 6031, 24 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') + 13135);
            int iResolveSizeAndState = 1649 - View.resolveSizeAndState(0, 0, 0);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 26;
            short s = $$d[1];
            Object[] objArr13 = new Object[1];
            g(s, (byte) (s & 40), r4[0], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(mirror, iResolveSizeAndState, threadPriority, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
                int iAlpha = 1649 - Color.alpha(0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
                Object[] objArr14 = new Object[1];
                g(r0[65], r0[8], (byte) (-$$d[9]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c, iAlpha, iIndexOf, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 63242, new char[]{40431, 27337, 29609, 30819, 16671, 19976, 22250, 24528, 9354, 11582, 14868, 787, 3050, 4280, 6550, 58955}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 4356, new char[]{40428, 36038, 49070, 44702, 55661, 51247, 64283, 58861, 5365, 1979, 13936, 8512, 20498, 17169, 28099, 40105}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = AudioAttributesImplBaseParcelizer + 83;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1993272254};
                byte[] bArr = $$j;
                Object[] objArr18 = new Object[1];
                h((byte) (-bArr[78]), bArr[47], (byte) 64, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b = (byte) (-bArr[91]);
                byte b2 = bArr[81];
                Object[] objArr19 = new Object[1];
                h(b, b2, (byte) (b2 | 46), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 13184);
                    int jumpTapTimeout = 1649 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int mode = View.MeasureSpec.getMode(0) + 26;
                    Object[] objArr20 = new Object[1];
                    g(r4[65], r4[8], (byte) (-$$d[9]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(packedPositionChild, jumpTapTimeout, mode, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 50388, new char[]{40420, 22698, 5987, 53812, 35054, 18345, 615, 63852, 47074, 29375, 10529, 58397, 41712, 39355, 21631, 4911, 51704, 33943, 17275, 15929, 62706, 46011}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(-TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{42625, 42092, 12236, 41328, 42724, 7711, 23443, 36701, 20110, 1682, 29458, 47099, 30236, 12058, 27286, 24145, 8092, 55186, 539}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c2 = (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                        int iResolveSize = 1649 - View.resolveSize(0, 0);
                        int iIndexOf2 = 26 - TextUtils.indexOf("", "", 0);
                        Object[] objArr23 = new Object[1];
                        g((short) 75, r13[8], (byte) (-$$d[9]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c2, iResolveSize, iIndexOf2, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cMyPid = (char) (13183 - (Process.myPid() >> 22));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1649;
                        int iAlpha2 = 26 - Color.alpha(0);
                        short s2 = $$d[1];
                        Object[] objArr24 = new Object[1];
                        g(s2, (byte) (s2 & 40), r2[0], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cMyPid, packedPositionType, iAlpha2, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4535), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6053, (KeyEvent.getMaxKeyCode() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {1296490954, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23);
                byte[] bArr2 = $$j;
                Object[] objArr26 = new Object[1];
                h(bArr2[75], bArr2[44], bArr2[3], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        C0272zzbl.write writeVar = C0272zzbl.read;
        Intent intent = getIntent();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
        C0272zzbl c0272zzblWrite = C0272zzbl.write.write(intent);
        if (c0272zzblWrite == null) {
            finish();
            return;
        }
        int i10 = MediaBrowserCompatCustomActionResultReceiver + 73;
        AudioAttributesImplBaseParcelizer = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 28 / 0;
            if (p0 != null) {
                return;
            }
        } else if (p0 != null) {
            return;
        }
        _doAddInjectable _doaddinjectableIconCompatParcelizer = getSupportFragmentManager().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer, "");
        C0276zzbp.Companion companion = C0276zzbp.INSTANCE;
        _doaddinjectableIconCompatParcelizer.write(R.id.fragment_container, C0276zzbp.Companion.AudioAttributesCompatParcelizer(c0272zzblWrite));
        _doaddinjectableIconCompatParcelizer.write();
    }

    @Override // kotlin.AbstractActivityC0270zzbj, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplBaseParcelizer + 15;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 3, new char[]{2164, 60347, 1307, 36024, 2069, 20938, 28993, 41623, 57447, 18761, 22981, 39503, 55533, 24796, 16477, 29635, 45377, 38987, 10461, 27392, 43506, 47069, 4929, 23692, 33356, 44888, 64451, 13332, 31485, 50904}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{40843, 49509, 11342, 26710, 40936, 31503, 22530, 18041, 30610, 25488, 28800, 32462, 20227, 18946, 26900, 38762, 9884, 45719, 392, 36846, 15892, 40196}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getOffsetBefore("", 0) + 4535), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), KeyEvent.keyCodeFromString("") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 6031 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 25, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 121;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    @Override // kotlin.AbstractActivityC0270zzbj, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0274zzbn.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x09f6 A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:174:0x09f0, B:176:0x09f6, B:177:0x0a22, B:207:0x0dd3, B:209:0x0dd9, B:210:0x0e01, B:243:0x117a, B:245:0x1180, B:246:0x11a8, B:224:0x0f7d, B:226:0x0f9f, B:227:0x0fef, B:67:0x0411, B:69:0x0417, B:70:0x0440, B:18:0x00d0, B:20:0x00d6, B:21:0x0100, B:23:0x0228, B:25:0x0258, B:26:0x02b2, B:32:0x02ce, B:34:0x02d2, B:38:0x02de, B:53:0x03a6, B:55:0x03ac, B:56:0x03ad, B:58:0x03af, B:60:0x03b6, B:61:0x03b7), top: B:270:0x00d0, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a8  */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v150 */
    /* JADX WARN: Type inference failed for: r3v153 */
    /* JADX WARN: Type inference failed for: r3v154 */
    /* JADX WARN: Type inference failed for: r3v164 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    @Override // kotlin.AbstractActivityC0270zzbj, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0274zzbn.attachBaseContext(android.content.Context):void");
    }

    static {
        IconCompatParcelizer = 1;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesCompatParcelizer + 119;
        IconCompatParcelizer = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.AbstractActivityC0270zzbj, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 27;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 125;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    static void AudioAttributesImplApi26Parcelizer() {
        RemoteActionCompatParcelizer = -4237333123101102972L;
        read = -1003795224869859762L;
    }
}
