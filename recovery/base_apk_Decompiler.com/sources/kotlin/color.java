package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
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
import kotlin.Metadata;
import kotlin.PolylineOptions;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/color;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseRepresentation;", "read", "Lo/parseRepresentation;", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class color extends endCap {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesCompatParcelizer;
    private static boolean AudioAttributesImplApi26Parcelizer;
    private static boolean AudioAttributesImplBaseParcelizer;
    private static char[] IconCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private parseRepresentation RemoteActionCompatParcelizer;
    private static final byte[] $$j = {36, -60, 17, 26, 61, -61, -2, -19, 47, -39, -10, -15, -2, -5, 11, -3, 11, -31, -7, -5, -2, 9, 0, -16, 35, -45, -7, 1, 8, -23, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 34, -27, -19, -7, 4, -7, 3, 19, -41, 5, 7, 27, -48, -1, -2, 38, -48, -3, -4, 5, -2, -21, 7, -17, 9, -15, -9, 40, -24, -17, 9, -10, -2, -17, 1, 5, -15, 11};
    private static final int $$k = 126;
    private static final byte[] $$d = {TarConstants.LF_SYMLINK, -51, -30, -2, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 20;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 65
            int r0 = 44 - r6
            int r5 = r5 + 4
            byte[] r1 = kotlin.color.$$d
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r7 = r5
            r3 = r6
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.color.g(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 95 - r8
            int r7 = 119 - r7
            int r0 = r6 + 5
            byte[] r1 = kotlin.color.$$j
            byte[] r0 = new byte[r0]
            int r6 = r6 + 4
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L27:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            int r7 = r7 + (-4)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.color.h(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.color$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/color$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent AudioAttributesCompatParcelizer(Context p0, String p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Intent intent = new Intent(p0, (Class<?>) color.class);
            intent.putExtra("email", p1);
            intent.putExtra("password", p2);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            int i5 = $10 + 21;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSize(0, 0), Color.blue(0) + 23704, 32 - TextUtils.indexOf("", "", 0), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (View.resolveSize(0, 0) + 44862), 18944 - Color.argb(0, 0, 0, 0), 28 - View.getDefaultSize(0, 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i8 = $10 + 1;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                int i10 = $10 + 121;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 << cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) % 0];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18944, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (44862 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 18944 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 28 - ((Process.getThreadPriority(0) + 20) >> 6), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = IconCompatParcelizer;
        long j = 0;
        if (cArr2 != null) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.myTid() >> 22) + 44862), ExpandableListView.getPackedPositionChild(j) + 18945, View.MeasureSpec.getMode(0) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 1), ExpandableListView.getPackedPositionGroup(0L) + 19033, 75 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i7 = -1593953308;
        if (!(!AudioAttributesImplApi26Parcelizer)) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i7);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16788655 + Color.rgb(0, 0, 0), 14 - (ViewConfiguration.getScrollBarSize() >> 8), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i7 = -1593953308;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesImplBaseParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i8 = $11 + 1;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer >>> 1) % notifydownloads.IconCompatParcelizer] >>> i] - iIntValue);
                    i2 = notifydownloads.IconCompatParcelizer;
                } else {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    i2 = notifydownloads.IconCompatParcelizer + 1;
                }
                notifydownloads.IconCompatParcelizer = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 119;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i11 = $10 + 29;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 11439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    @Override // kotlin.endCap, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 28, new char[]{65483, 1, 6, '\f', 15, 1, 11, 65534, 16, 16, 2, 0, '\f', 15, 65517, 65483, 16, '\f'}, 157 - TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionGroup(0L) + 18, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, new char[]{65532, 1, 65517, 17, 5}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 126, 5 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, 127 - Color.red(0), null, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(true, Color.blue(0) + 18, new char[]{4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 154, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i2 = MediaBrowserCompatSearchResultReceiver + 31;
                AudioAttributesImplApi21Parcelizer = i2 % 128;
                int i3 = i2 % 2;
            }
            if (baseContext != null) {
                baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Drawable.resolveOpacity(0, 0) + 4535), 6054 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(false, 33 - TextUtils.lastIndexOf("", '0', 0), new char[]{25, 65514, 65509, 26, 24, 65509, 65512, 26, 27, 65518, 65517, 27, 65513, 22, 65512, 65510, 65511, 65509, 26, 65511, 65515, 26, 23, 24, 23, 65516, 25, 65512, 65518, 65514, 65517, 65518, 27, 26, 24, 65514, 65509, 27, 24, 25, 22, 23, 65513, 65515, 65512, 65518, 26, 27}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 98, 48 - TextUtils.indexOf("", ""), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 24, new char[]{31, 65526, 65521, 65525, 65523, 65526, 30, '\"', 30, 65523, '!', 65518, 65517, 31, '!', 65524, 65522, 65523, 65524, 30, 65524, 65517, ' ', ' ', 65517, 65524, 65520, '\"', 65522, ' ', '\"', '#', 65525, 65522, 65521, 65526, 65518, 65517, 65522, 65526, 65517, '!', 65518, '#', '!', '!', 31, 65524, 65525, 65517, 65520, 65519, '#', 65520, 31, 65521, 65517, 65517, 65519, 65524, 65526, 65517, 65518, 65518}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 115, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(new byte[]{-108, -104, -102, -104, -111, -107, -111, -110, -118, -106, -104, -110, -127, -101, -125, -107, -127, -100, -109, -118, -100, -112, -109, -110, -101, -106, -112, -127, -112, -102, -127, -103, -108, -110, -104, -106, -105, -125, -112, -105, -109, -106, -110, -109, -110, -111, -127, -108, -125, -125, -127, -108, -110, -107, -125, -125, -108, -118, -109, -110, -125, -127, -110, -111}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 117, null, null, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 9, new char[]{17, 2, 16, 65535, 19, 5, 65484, 18, 17, 65535, 1, 18, 65535, 3, 16, 6, 18, 65484, 17, 2, '\f', 19, '\r', 16, 23, '\n', 7, 65535, 2, 65485, 65485, 65496, 17, 14, 18, 18, 6, 17, 18, '\f', 3, 20, 3, 65485, 65488, 20, 65485, 18, 17, 3, 5, '\f', 7, 65485, 7, 14, 65535, 65485, 11, '\r', 1, 65484, 3, 16, 65535, 19, 15}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + TarConstants.PREFIXLEN, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(false, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 5, new char[]{7, 65532, 65535, 2, 65532, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 104, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 103, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(new byte[]{-104, -104, -127, -110, -101, -118, -112, -102, -109, -127, -102, -101, -99, -100, -109, -111, -105, -99, -102, -103, -104, -103, -99, -101, -108, -101, -108, -99, -110, -110, -109, -104, -102, -111, -110, -109}, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 127, null, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), 6078 - AndroidCharacter.getMirror('0'), 24 - TextUtils.getOffsetAfter("", 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 13183);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1649;
            int deadChar = 26 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr = $$d;
            short s = bArr[5];
            Object[] objArr13 = new Object[1];
            g(s, (byte) s, (byte) (-bArr[113]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(tapTimeout, windowTouchSlop, deadChar, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 13183);
                int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int pressedStateDuration = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                g((short) (-bArr2[27]), (byte) (-bArr2[30]), bArr2[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionType, keyRepeatTimeout, pressedStateDuration, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e(false, 3 - View.MeasureSpec.getMode(0), new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 121, 16 - (KeyEvent.getMaxKeyCode() >> 16), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(new byte[]{-112, -125, -123, -96, -113, -97, -127, -98, -115, -117, -122, -117, -126, -112, -125, -122}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, null, null, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 514741663};
                byte b = (byte) ($$k & 23);
                byte[] bArr3 = $$j;
                byte b2 = bArr3[28];
                Object[] objArr18 = new Object[1];
                h(b, b2, (byte) (b2 | TarConstants.LF_GNUTYPE_SPARSE), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h((byte) (-bArr3[29]), (byte) (bArr3[76] - 1), (byte) 65, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1649;
                    int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    g((short) (-bArr4[27]), (byte) (-bArr4[30]), bArr4[5], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(maximumFlingVelocity, scrollBarFadeDuration, iLastIndexOf, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(new byte[]{-92, -118, -123, -93, -96, -94, -112, -117, -97, -115, -95, -121, -97, -123, -121, -125, -122, -123, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 16, null, null, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 1, new char[]{2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 126, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 14, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
                        int i4 = 1649 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                        Object[] objArr23 = new Object[1];
                        g((short) 76, (byte) (-$$d[30]), r7[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(defaultSize, i4, i5, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char modifierMetaStateMask = (char) (13182 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1649;
                        int pressedStateDuration2 = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr5 = $$d;
                        short s2 = bArr5[5];
                        Object[] objArr24 = new Object[1];
                        g(s2, (byte) s2, (byte) (-bArr5[113]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(modifierMetaStateMask, keyRepeatDelay, pressedStateDuration2, -133433128, false, (String) objArr24[0], null);
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
        int i6 = ((int[]) objArr[3])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = ((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - View.getDefaultSize(0, 0)), TextUtils.lastIndexOf("", '0') + 6055, (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {411588773, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.getOffsetBefore("", 0), 6030 - TextUtils.indexOf("", "", 0), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                byte[] bArr6 = $$j;
                Object[] objArr26 = new Object[1];
                h((byte) (-bArr6[29]), (byte) (bArr6[76] - 1), (byte) 65, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i8 = AudioAttributesImplApi21Parcelizer + 123;
                MediaBrowserCompatSearchResultReceiver = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, R.attr.colorSurfaceVariant5, false, 11);
        super.onCreate(p0);
        parseRepresentation parserepresentationRemoteActionCompatParcelizer = parseRepresentation.RemoteActionCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parserepresentationRemoteActionCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = parserepresentationRemoteActionCompatParcelizer;
        if (parserepresentationRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parserepresentationRemoteActionCompatParcelizer = null;
        }
        setContentView(parserepresentationRemoteActionCompatParcelizer.IconCompatParcelizer());
        if (p0 == null) {
            int i10 = AudioAttributesImplApi21Parcelizer + 75;
            MediaBrowserCompatSearchResultReceiver = i10 % 128;
            if (i10 % 2 == 0) {
                getIntent().getStringExtra("email");
                throw null;
            }
            String stringExtra = getIntent().getStringExtra("email");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = getIntent().getStringExtra("password");
            String str6 = stringExtra2 != null ? stringExtra2 : "";
            PolylineOptions.Companion iconCompatParcelizer = PolylineOptions.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.fragment_container, PolylineOptions.Companion.write(stringExtra, str6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f3  */
    @Override // kotlin.endCap, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.color.onResume():void");
    }

    @Override // kotlin.endCap, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 41;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, KeyEvent.getDeadChar(0, 0) + 127, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 14, new char[]{4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 154, 17 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = AudioAttributesImplApi21Parcelizer + 125;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
                int i6 = MediaBrowserCompatSearchResultReceiver + 15;
                AudioAttributesImplApi21Parcelizer = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 2;
                }
            } else {
                baseContext = null;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (Process.myTid() >> 22)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, Process.getGidForName("") + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), 6030 - (Process.myPid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x09b0 A[Catch: all -> 0x042d, TryCatch #6 {all -> 0x042d, blocks: (B:203:0x108e, B:205:0x1094, B:206:0x10c1, B:239:0x14df, B:241:0x14e5, B:242:0x1511, B:220:0x12d3, B:222:0x12f5, B:223:0x1349, B:170:0x0bc3, B:172:0x0bc9, B:173:0x0bf4, B:126:0x09aa, B:128:0x09b0, B:129:0x09db, B:19:0x0134, B:21:0x013a, B:22:0x0161, B:24:0x039a, B:26:0x03cb, B:27:0x0427, B:134:0x0a70, B:136:0x0a74, B:140:0x0a80, B:156:0x0b57, B:158:0x0b5d, B:159:0x0b5e, B:161:0x0b60, B:163:0x0b67, B:164:0x0b68, B:149:0x0ad7, B:151:0x0ae4, B:152:0x0b4d, B:145:0x0a8a, B:147:0x0a9e, B:148:0x0ad1), top: B:274:0x0134, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0a9e A[Catch: all -> 0x0b5f, TryCatch #15 {all -> 0x0b5f, blocks: (B:145:0x0a8a, B:147:0x0a9e, B:148:0x0ad1), top: B:291:0x0a8a, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0ae4 A[Catch: all -> 0x0b55, TryCatch #11 {all -> 0x0b55, blocks: (B:149:0x0ad7, B:151:0x0ae4, B:152:0x0b4d), top: B:283:0x0ad7, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0d3a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x106e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x1156  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x11a5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1204  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x14bf  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0a70 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x010a  */
    @Override // kotlin.endCap, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.color.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatItemReceiver = 1;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 91;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.endCap, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 33;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplApi26Parcelizer() {
        RemoteActionCompatParcelizer = 1000326145;
        IconCompatParcelizer = new char[]{28520, 28541, 28519, 28537, 28538, 28512, 28605, 28539, 28488, 28518, 28535, 28533, 28528, 28503, 28515, 28516, 28521, 28600, 28601, 28595, 28596, 28598, 28592, 28597, 28599, 28594, 28517, 28603, 28604, 28483, 28534, 28486, 28502, 28540, 28543, 28542};
        AudioAttributesCompatParcelizer = 411398027;
        AudioAttributesImplBaseParcelizer = true;
        AudioAttributesImplApi26Parcelizer = true;
    }
}
