package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.resetCueBuilders;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Lo/DefaultTrackSelectorExternalSyntheticLambda6;", "Lo/shouldEvaluateQueueSize;", "Lo/Aes128DataSource;", "Landroid/content/Context;", "p0", "Lo/DefaultTrackSelectorExternalSyntheticLambda6$read;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Lo/DefaultTrackSelectorExternalSyntheticLambda6$read;Ljava/lang/String;)V", "IconCompatParcelizer", "()Lo/Aes128DataSource;", "Landroid/os/Bundle;", "", "onCreate", "(Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "Lo/DefaultTrackSelectorExternalSyntheticLambda6$read;", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultTrackSelectorExternalSyntheticLambda6 extends shouldEvaluateQueueSize<Aes128DataSource> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final read IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String read;
    private static final byte[] $$g = {37, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 106, 111, TarConstants.LF_FIFO, -68, -9, -26, 21, -38, -16, 8, -22, 31, -62, 4, -11, -10, -24, 2, -10, 21, -60, -8, 6, -30, 0, -17, -10, 14, -41, 68, -40, -63, 6, -16, -17, 35, -62, -11, -9, -2, -4, -30, -10, 4, -25, 37, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, 2, -7, -14, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24};
    private static final int $$h = 71;
    private static final byte[] $$a = {70, -23, 8, 77, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 12;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static char[] RemoteActionCompatParcelizer = {28527, 28502, 28515, 28587, 28525, 28523, 28496, 28484, 28542, 28516, 28517, 28498, 28522, 28526, 28501, 28593, 28497, 28596, 28520, 28519, 28500, 28524, 28521, 28487};
    private static int read = 411398137;
    private static boolean AudioAttributesImplApi26Parcelizer = true;
    private static boolean AudioAttributesImplApi21Parcelizer = true;

    public interface read {
        void onPlayFromUri();

        void onPrepareFromSearch();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 12
            int r6 = r6 + 65
            int r7 = r7 + 4
            byte[] r0 = kotlin.DefaultTrackSelectorExternalSyntheticLambda6.$$a
            int r5 = r5 * 10
            int r1 = 44 - r5
            byte[] r1 = new byte[r1]
            int r5 = 43 - r5
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r7 = r7 + 1
            r3 = r0[r7]
        L2a:
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorExternalSyntheticLambda6.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 66 - r8
            byte[] r0 = kotlin.DefaultTrackSelectorExternalSyntheticLambda6.$$g
            int r7 = r7 * 8
            int r7 = r7 + 4
            int r9 = r9 + 82
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r9
            r9 = r8
            r8 = r6
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2b:
            int r8 = r8 + 1
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorExternalSyntheticLambda6.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private DefaultTrackSelectorExternalSyntheticLambda6(Context context, read readVar, String str) {
        super(context, R.style.AppTheme_Light_Dialog);
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = readVar;
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DefaultTrackSelectorExternalSyntheticLambda6(Context context, read readVar, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 4) != 0) {
            int i2 = AudioAttributesImplBaseParcelizer + 85;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 39 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        this(context, readVar, str);
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Aes128DataSource aes128DataSourceIconCompatParcelizer = IconCompatParcelizer();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 85;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return aes128DataSourceIconCompatParcelizer;
    }

    private Aes128DataSource IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 5;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Aes128DataSource aes128DataSourceWrite = Aes128DataSource.write(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(aes128DataSourceWrite, "");
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 67;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return aes128DataSourceWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = RemoteActionCompatParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - (Process.myPid() >> 22)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18944, Color.alpha(0) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(read)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0), Color.red(0) + 19033, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            try {
                if (!(!AudioAttributesImplApi21Parcelizer)) {
                    int i4 = $10 + 7;
                    $11 = i4 % 128;
                    notifydownloads.AudioAttributesCompatParcelizer = i4 % 2 == 0 ? bArr.length : bArr.length;
                    char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                    while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                        int i5 = $11 + 31;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
                        cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                        Object[] objArr4 = {notifydownloads, notifydownloads};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 11438 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), -558368911, false, "q", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!AudioAttributesImplApi26Parcelizer) {
                    notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                    char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                    while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                        int i7 = $11 + 1;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
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
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.MeasureSpec.getSize(0) + 11439, Gravity.getAbsoluteGravity(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr6);
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
    }

    private static final getShowPopup read(DefaultTrackSelectorExternalSyntheticLambda6 defaultTrackSelectorExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 51;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        read readVar = defaultTrackSelectorExternalSyntheticLambda6.IconCompatParcelizer;
        if (i4 != 0) {
            throw null;
        }
        if (readVar != null) {
            int i5 = i3 + 95;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            readVar.onPlayFromUri();
            if (i6 == 0) {
                throw null;
            }
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i7 = MediaBrowserCompatCustomActionResultReceiver + 93;
        AudioAttributesImplBaseParcelizer = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 69 / 0;
        }
        return getshowpopup;
    }

    private static final getShowPopup IconCompatParcelizer(DefaultTrackSelectorExternalSyntheticLambda6 defaultTrackSelectorExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 41;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            read readVar = defaultTrackSelectorExternalSyntheticLambda6.IconCompatParcelizer;
            if (readVar != null) {
                readVar.onPrepareFromSearch();
                int i3 = AudioAttributesImplBaseParcelizer + 81;
                MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                int i4 = i3 % 2;
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("button_type", 2);
                bundle.putString("source", defaultTrackSelectorExternalSyntheticLambda6.RemoteActionCompatParcelizer);
                getProvider getprovider = getProvider.getInstance(defaultTrackSelectorExternalSyntheticLambda6.getContext());
                resetCueBuilders.Companion companion = resetCueBuilders.INSTANCE;
                getprovider.AudioAttributesCompatParcelizer(resetCueBuilders.Companion.RemoteActionCompatParcelizer(bundle));
            }
            return getShowPopup.INSTANCE;
        }
        read readVar2 = defaultTrackSelectorExternalSyntheticLambda6.IconCompatParcelizer;
        throw null;
    }

    private static final getShowPopup AudioAttributesImplBaseParcelizer(DefaultTrackSelectorExternalSyntheticLambda6 defaultTrackSelectorExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 95;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        defaultTrackSelectorExternalSyntheticLambda6.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        if (i3 != 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 27;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
            int bitsPerPixel = 1648 - ImageFormat.getBitsPerPixel(0);
            int iAxisFromString = MotionEvent.axisFromString("") + 27;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[5], bArr[53], bArr[17], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(pressedStateDuration, bitsPerPixel, iAxisFromString, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 13184);
                int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i5 = 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr3 = new Object[1];
                a(r12[53], r12[5], (byte) (-$$a[65]), objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(bitsPerPixel2, keyRepeatTimeout, i5, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b(Color.green(0) + 127, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, null, null, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, null, null, objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 722254094};
                byte[] bArr2 = $$g;
                Object[] objArr7 = new Object[1];
                c((byte) (-bArr2[64]), (byte) (-bArr2[14]), (byte) 29, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b = bArr2[26];
                Object[] objArr8 = new Object[1];
                c(b, (byte) (b + 3), bArr2[77], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cBlue = (char) (Color.blue(0) + 13183);
                    int keyRepeatDelay = 1649 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                    Object[] objArr9 = new Object[1];
                    a(r13[53], r13[5], (byte) (-$$a[65]), objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cBlue, keyRepeatDelay, longPressTimeout, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(126 - TextUtils.indexOf((CharSequence) "", '0', 0), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, null, null, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(126 - ImageFormat.getBitsPerPixel(0), new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, null, null, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 13183);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1649;
                        int i6 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                        byte[] bArr3 = $$a;
                        byte b2 = bArr3[53];
                        byte b3 = bArr3[5];
                        Object[] objArr12 = new Object[1];
                        a(b2, b3, (byte) (b3 | TarConstants.LF_GNUTYPE_LONGLINK), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, jumpTapTimeout, i6, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char scrollBarSize = (char) (13183 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int i7 = 1648 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr4[5], bArr4[53], bArr4[17], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(scrollBarSize, i7, pressedStateDuration2, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    c = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i8 = ((int[]) objArr[c])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - (Process.myTid() >> 22)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6054, Color.blue(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i10 = MediaBrowserCompatCustomActionResultReceiver + 43;
                AudioAttributesImplBaseParcelizer = i10 % 128;
                if (i10 % 2 == 0) {
                    i = 5;
                    int i11 = 5 / 5;
                } else {
                    i = 5;
                }
                try {
                    Object[] objArr14 = new Object[i];
                    objArr14[4] = true;
                    objArr14[3] = strRemoteActionCompatParcelizer;
                    objArr14[2] = arrayList;
                    objArr14[1] = Long.valueOf(j3);
                    objArr14[0] = -1410128433;
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 6030, View.MeasureSpec.makeMeasureSpec(0, 0) + 24);
                    byte b4 = (byte) ($$h & 11);
                    byte b5 = $$g[26];
                    Object[] objArr15 = new Object[1];
                    c(b4, b5, b5, objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
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
        }
        super.onCreate(p0);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        CustomButton customButton = AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        RemoteActionCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.DefaultTrackSelectorExternalSyntheticLambda4
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return DefaultTrackSelectorExternalSyntheticLambda6.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        CustomButton customButton2 = AudioAttributesImplBaseParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton2, "");
        RemoteActionCompatParcelizer(customButton2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.DefaultTrackSelectorExternalSyntheticLambda5
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return DefaultTrackSelectorExternalSyntheticLambda6.write(this.AudioAttributesCompatParcelizer);
            }
        });
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        RemoteActionCompatParcelizer(customTextView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.DefaultTrackSelectorExternalSyntheticLambda3
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return DefaultTrackSelectorExternalSyntheticLambda6.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(DefaultTrackSelectorExternalSyntheticLambda6 defaultTrackSelectorExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 5;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopup = read(defaultTrackSelectorExternalSyntheticLambda6);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 41;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup write(DefaultTrackSelectorExternalSyntheticLambda6 defaultTrackSelectorExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 125;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            IconCompatParcelizer(defaultTrackSelectorExternalSyntheticLambda6);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(defaultTrackSelectorExternalSyntheticLambda6);
        int i3 = AudioAttributesImplBaseParcelizer + 65;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopupIconCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(DefaultTrackSelectorExternalSyntheticLambda6 defaultTrackSelectorExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 29;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(defaultTrackSelectorExternalSyntheticLambda6);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 53;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupAudioAttributesImplBaseParcelizer;
    }
}
