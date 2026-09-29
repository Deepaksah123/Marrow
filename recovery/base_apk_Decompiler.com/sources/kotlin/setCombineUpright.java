package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.ui.activities.base.BaseActivity;
import com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkActivity;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public abstract class setCombineUpright extends BaseActivity implements SubjectStat {
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$c = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15};
    private static final int $$f = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {62, -25, -124, -119, -51, 71, 12, 29, -36, 59, 3, 35, -71, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -28, TarConstants.LF_SYMLINK, 17, 10, -28, 45, 32, 0, -7, 31, 31, -1, 16, 21, 11, 31, -7, 27, 9, 5, 25, -1, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, -51, 71, 12, 29, -18, 34, 27, 6, 3, 26, 1, 22, 17, -9, 43, 8, -58, 60, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27};
    private static final int $$k = 151;
    private static final byte[] $$d = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 163;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static long RemoteActionCompatParcelizer = -5415238013411606236L;
    private static char[] MediaBrowserCompatCustomActionResultReceiver = {28290, 28310, 28410, 28294, 28301, 28300, 28378, 28353, 28299, 28302, 28303, 28381, 28379, 28380, 28374, 28298, 28377, 28382, 28383, 28376, 28355, 28291, 28317, 28393, 28316, 28297, 28396, 28288};
    private static int MediaBrowserCompatSearchResultReceiver = 411397905;
    private static boolean RatingCompat = true;
    private static boolean MediaMetadataCompat = true;
    private final Object read = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r5, short r6, byte r7) {
        /*
            byte[] r0 = kotlin.setCombineUpright.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 * 2
            int r7 = r7 + 104
            int r5 = r5 * 4
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            r3 = r0[r5]
        L28:
            int r5 = r5 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCombineUpright.$$i(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            int r6 = 190 - r6
            byte[] r1 = kotlin.setCombineUpright.$$d
            int r8 = 114 - r8
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCombineUpright.g(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 46 - r5
            byte[] r1 = kotlin.setCombineUpright.$$j
            int r7 = r7 + 82
            int r6 = 76 - r6
            byte[] r0 = new byte[r0]
            int r5 = 45 - r5
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r7 = r7 + r4
            int r7 = r7 + (-14)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCombineUpright.h(int, byte, short, java.lang.Object[]):void");
    }

    public setCombineUpright() {
        MediaBrowserCompatMediaItem();
    }

    private void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setCombineUpright.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setCombineUpright.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = MediaDescriptionCompat + 35;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaDescriptionCompat() {
        int i = 2 % 2;
        getSubjectStat getsubjectstatWrite = onCustomAction().write();
        this.write = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i2 = MediaBrowserCompatMediaItem + 91;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 != 0) {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i3 = MediaDescriptionCompat + 25;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $11 + 13;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $11 + 61;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 12424 - (ViewConfiguration.getEdgeSlop() >> 16), 20 - TextUtils.getCapsMode("", 0, 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) ($$f - 5);
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1868 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10 - Color.blue(0), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
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
        int i8 = $11 + 115;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 34 / 0;
            objArr[0] = str;
        }
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = MediaBrowserCompatCustomActionResultReceiver;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 33;
                $11 = i5 % 128;
                if (i5 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (44861 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18944, 28 - TextUtils.getOffsetAfter("", 0), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.blue(0) + 44862), 18944 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 29, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                }
                i4++;
                i2 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(MediaBrowserCompatSearchResultReceiver)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 19033 - (ViewConfiguration.getWindowTouchSlop() >> 8), 75 - KeyEvent.keyCodeFromString(""), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
        int i6 = -1593953308;
        if (MediaMetadataCompat) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i7 = $10 + 7;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer << 1) >>> notifydownloads.IconCompatParcelizer] % i] / iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(i6);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), 11439 - Drawable.resolveOpacity(0, 0), Process.getGidForName("") + 15, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(obj, objArr5);
                } else {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr6 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 16788655 + Color.rgb(0, 0, 0), 14 - (ViewConfiguration.getEdgeSlop() >> 16), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                    obj = null;
                }
                i6 = -1593953308;
            }
            String str = new String(cArr4);
            int i8 = $10 + 115;
            $11 = i8 % 128;
            if (i8 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                int i9 = 79 / 0;
                objArr[0] = str;
                return;
            }
        }
        if (!RatingCompat) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            int i10 = $10 + 31;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i12 = $11 + 59;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i14 = $11 + 37;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer % 1) - notifydownloads.IconCompatParcelizer] >>> i] >> iIntValue);
                Object[] objArr7 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 11438 - MotionEvent.axisFromString(""), 14 - TextUtils.getOffsetAfter("", 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr8 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 11439 - TextUtils.getTrimmedLength(""), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCombineUpright.onCreate(android.os.Bundle):void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.write;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i2 = MediaBrowserCompatMediaItem + 7;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = MediaDescriptionCompat + 31;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 87;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = onCustomAction().af_();
        int i4 = MediaBrowserCompatMediaItem + 77;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return objAf_;
    }

    private isHighlighted onCommand() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted onCustomAction() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = onCommand();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        skipStyleBlock skipstyleblock;
        Object objAudioAttributesCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 89;
        int i3 = i2 % 128;
        MediaBrowserCompatMediaItem = i3;
        if (i2 % 2 == 0) {
            int i4 = 32 / 0;
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
        } else if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        int i5 = i3 + 31;
        MediaDescriptionCompat = i5 % 128;
        if (i5 % 2 != 0) {
            this.AudioAttributesCompatParcelizer = true;
            skipstyleblock = (skipStyleBlock) af_();
            objAudioAttributesCompatParcelizer = getSubmittedOnDate.AudioAttributesCompatParcelizer(this);
        } else {
            this.AudioAttributesCompatParcelizer = true;
            skipstyleblock = (skipStyleBlock) af_();
            objAudioAttributesCompatParcelizer = getSubmittedOnDate.AudioAttributesCompatParcelizer(this);
        }
        skipstyleblock.write((DeeplinkActivity) objAudioAttributesCompatParcelizer);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaDescriptionCompat + 93;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCombineUpright.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCombineUpright.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x09c3 A[Catch: all -> 0x0a7e, TryCatch #13 {all -> 0x0a7e, blocks: (B:139:0x09bd, B:141:0x09c3, B:142:0x09ec), top: B:293:0x09bd, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCombineUpright.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatMediaItem + 19;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
