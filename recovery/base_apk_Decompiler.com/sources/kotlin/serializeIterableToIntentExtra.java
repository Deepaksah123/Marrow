package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/serializeIterableToIntentExtra;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseRoleFlagsFromDashRoleScheme;", "AudioAttributesCompatParcelizer", "Lo/parseRoleFlagsFromDashRoleScheme;", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class serializeIterableToIntentExtra extends serializeToBytes {
    private static char AudioAttributesImplApi26Parcelizer;
    private static long IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private parseRoleFlagsFromDashRoleScheme IconCompatParcelizer;
    private static final byte[] $$l = {114, -20, -35, -46};
    private static final int $$m = 20;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {62, -25, -124, -119, TarConstants.LF_CHR, -71, -12, -29, 36, -59, -3, -35, 71, -43, -66, 3, -19, -20, 32, -65, -14, -12, -5, -7, -33, -13, 1, -28, 28, -50, -17, -10, 28, -45, -32, 0, 7, -31, -31, 1, -16, -21, -11, -31, 7, -27, -9, -5, -25, 1, -33, -22, -16, -19, 1, 22, -48, -31, -3, -20, -13, 29, -58, -12, -17, 1, -33, 22, -31, -31, 1, -16, -21, -11, -31, 7, -27, TarConstants.LF_CHR, -51, -47, 5, -33, -15, -12, 32, -65, 7, -16, -25, -18, -3, -20, -13, 19, -34, -29, -14, -3, -27};
    private static final int $$k = 78;
    private static final byte[] $$d = {28, -38, TarConstants.LF_DIR, -29, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 229;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int AudioAttributesImplApi21Parcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = kotlin.serializeIterableToIntentExtra.$$l
            int r6 = 104 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtra.$$n(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 191 - r7
            byte[] r0 = kotlin.serializeIterableToIntentExtra.$$d
            int r6 = r6 + 65
            int r1 = 44 - r8
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L27:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            int r6 = r6 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtra.g(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 82
            byte[] r0 = kotlin.serializeIterableToIntentExtra.$$j
            int r8 = r8 + 5
            int r9 = 76 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-14)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtra.h(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.serializeIterableToIntentExtra$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/serializeIterableToIntentExtra$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/ConnectionTracker;", "p1", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/ConnectionTracker;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0, ConnectionTracker p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) serializeIterableToIntentExtra.class);
            p1.IconCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(IconCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 12424 - Color.alpha(0), 19 - TextUtils.lastIndexOf("", '0', 0, 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(0), 1867 - ((byte) KeyEvent.getModifierMetaStateMask()), 10 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 73;
                $10 = i6 % 128;
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

    private static void f(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i3 = $11 + 119;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 22748 - View.MeasureSpec.getSize(0), 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (ViewConfiguration.getTouchSlop() >> 8)), 2721 - TextUtils.indexOf("", "", 0, 0), 38 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1895162189, false, $$n(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15713, 64 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - (ViewConfiguration.getLongPressTimeout() >> 16)), 6122 - (KeyEvent.getMaxKeyCode() >> 16), 29 - (ViewConfiguration.getWindowTouchSlop() >> 8), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 35;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0148  */
    @Override // kotlin.serializeToBytes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtra.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    @Override // kotlin.serializeToBytes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtra.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca  */
    @Override // kotlin.serializeToBytes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtra.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0b43 A[Catch: all -> 0x034a, TryCatch #7 {all -> 0x034a, blocks: (B:74:0x04e3, B:76:0x04e9, B:77:0x0514, B:233:0x0fe3, B:235:0x0fe9, B:236:0x1017, B:269:0x13e8, B:271:0x13ee, B:272:0x1415, B:250:0x11b7, B:252:0x11da, B:253:0x1225, B:194:0x0b3d, B:196:0x0b43, B:197:0x0b70, B:23:0x0103, B:25:0x0109, B:26:0x0131, B:28:0x02b8, B:30:0x02ea, B:31:0x0344), top: B:308:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0fc4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x10ab  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1101  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1150  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x13c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d1  */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    @Override // kotlin.serializeToBytes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtra.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 1;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 99;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent read(Context context, ConnectionTracker connectionTracker) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 79;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Intent intentAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(context, connectionTracker);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 9;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return intentAudioAttributesCompatParcelizer;
        }
        throw null;
    }

    @Override // kotlin.serializeToBytes, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 11;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplBaseParcelizer + 59;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplApi26Parcelizer() {
        IconCompatParcelizer = -7777524300127059538L;
        RemoteActionCompatParcelizer = -1581213731242777491L;
        write = -136981212;
        AudioAttributesImplApi26Parcelizer = (char) 54564;
    }
}
