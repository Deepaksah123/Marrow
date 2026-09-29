package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001c8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!"}, d2 = {"Lo/signOut;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer", "read", "onDestroyView", "", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "write", "IconCompatParcelizer", "Lo/getSegmentTimeUs;", "Lo/getSegmentTimeUs;", "()Lo/getSegmentTimeUs;", "AudioAttributesImplApi21Parcelizer", "", "Z", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class signOut extends argCount {
    private static int AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static short[] MediaBrowserCompatMediaItem;
    private static byte[] RatingCompat;
    private static int onCommand;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getSegmentTimeUs RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String IconCompatParcelizer;
    private static final byte[] $$c = {9, -121, -22, -93};
    private static final int $$f = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {10, -79, -66, -51, -58, 30, 58, -2, -24, 35, -4, 31, -13, 20, -34, 43, 10, 3, -34, TarConstants.LF_CHR, 5, 10, 6, 6, -2, 16, 13, -33, 36, 17, 8, -8, 16, -2, 20, -38, 58, 3, -8, 20, 3, -6, 18, -18, 45, -4, 13, -5, 4, 22, -4, 1, -16, 28, 19, -4, 9, 4, -40, 33, 19, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$e = 105;
    private static final byte[] $$a = {18, -64, -35, -97, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 246;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r5, int r6, short r7) {
        /*
            int r6 = r6 + 4
            byte[] r0 = kotlin.signOut.$$c
            int r7 = r7 * 3
            int r7 = 112 - r7
            int r5 = r5 * 3
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.signOut.$$g(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 12
            int r8 = 77 - r8
            int r7 = r7 + 4
            byte[] r0 = kotlin.signOut.$$a
            int r6 = r6 * 10
            int r1 = r6 + 34
            byte[] r1 = new byte[r1]
            int r6 = r6 + 33
            r2 = -1
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L2a:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2f:
            int r7 = r7 + r4
            int r7 = r7 + r2
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.signOut.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.signOut.$$d
            int r7 = r7 * 4
            int r7 = r7 + 20
            int r6 = r6 + 73
            int r5 = r5 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r6 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-7)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.signOut.c(int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i6)) | i2;
        int i9 = ~i6;
        int i10 = ~i2;
        int i11 = (~(i9 | i10)) | i5;
        int i12 = (~(i2 | i9 | i5)) | (~(i7 | i9 | i10)) | (~(i10 | i6 | i5));
        int i13 = i6 + i5 + i3 + ((-104759182) * i4) + ((-453318476) * i);
        int i14 = i13 * i13;
        int i15 = (i6 * 1504131295) + 1805123584 + (1504131295 * i5) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i3) + (711983104 * i4) + (1180696576 * i) + (1022754816 * i14);
        int i16 = ((i6 * (-1431886989)) - 1507491630) + (i5 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i3 * (-1431886867)) + (i4 * 722567050) + (i * (-1618605404)) + (i14 * 297664512);
        return i15 + ((i16 * i16) * (-277217280)) != 1 ? read(objArr) : IconCompatParcelizer(objArr);
    }

    private final getSegmentTimeUs RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 71;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getSegmentTimeUs getsegmenttimeus = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getsegmenttimeus);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return getsegmenttimeus;
    }

    /* JADX INFO: renamed from: o.signOut$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/signOut$read;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "", "p4", "Lo/signOut;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/signOut;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static signOut AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            signOut signout = new signOut();
            Bundle bundle = new Bundle();
            bundle.putString("titleKey", str);
            bundle.putString("messageKey", str2);
            bundle.putString("button_text_key", str4);
            bundle.putString("message_hint", str3);
            bundle.putBoolean("back_press_allow_key", true);
            signout.setArguments(bundle);
            return signout;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) throws Throwable {
        Object[] objArr2;
        signOut signout = (signOut) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        String str = "";
        if (objRemoteActionCompatParcelizer == null) {
            char cAxisFromString = (char) (13182 - MotionEvent.axisFromString(""));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1650;
            int iMyTid = (Process.myTid() >> 22) + 26;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[53], bArr[17], bArr[5], objArr3);
            objRemoteActionCompatParcelizer = startForeground.read(cAxisFromString, iIndexOf, iMyTid, -133433128, false, (String) objArr3[0], null);
        }
        Object obj = null;
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char maximumFlingVelocity = (char) (13183 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1649;
                int i2 = 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b = bArr2[5];
                byte b2 = (byte) (-bArr2[65]);
                byte b3 = bArr2[53];
                Object[] objArr4 = new Object[1];
                a(b, b2, b3, objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(maximumFlingVelocity, scrollDefaultDelay, i2, -1033747278, false, (String) objArr4[0], null);
            }
            objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr5 = new Object[1];
            b((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0') + 524897668, (ViewConfiguration.getWindowTouchSlop() >> 8) - 291278784, (short) ((-115) - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 27 - AndroidCharacter.getMirror('0'), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (Process.myTid() >> 22) + 524897666, (-291278768) - TextUtils.indexOf("", "", 0, 0), (short) (47 - TextUtils.lastIndexOf("", '0')), (-21) - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, signout)).intValue()), 0, 1831113570};
                byte[] bArr3 = $$d;
                Object[] objArr8 = new Object[1];
                c((byte) (bArr3[51] - 1), (byte) (-bArr3[35]), bArr3[56], objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b4 = (byte) (bArr3[51] - 1);
                Object[] objArr9 = new Object[1];
                c((byte) 55, b4, b4, objArr9);
                objArr2 = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 13183);
                    int mode = 1649 - View.MeasureSpec.getMode(0);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 26;
                    Object[] objArr10 = new Object[1];
                    a(r12[5], (byte) (-$$a[65]), r12[53], objArr10);
                    objRemoteActionCompatParcelizer3 = startForeground.read(offsetAfter, mode, iResolveSizeAndState, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr2);
                try {
                    Object[] objArr11 = new Object[1];
                    b((byte) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 524897659, TextUtils.indexOf((CharSequence) "", '0') - 291278751, (short) (KeyEvent.getDeadChar(0, 0) + 57), (-21) - View.resolveSizeAndState(0, 0, 0), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((byte) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 524897662, (-291278730) - TextUtils.getTrimmedLength(""), (short) (102 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 22, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 13184);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
                        int capsMode = 26 - TextUtils.getCapsMode("", 0, 0);
                        byte b5 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b5, (byte) (b5 | TarConstants.LF_GNUTYPE_LONGLINK), r14[53], objArr13);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, touchSlop, capsMode, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int iRgb = Color.rgb(0, 0, 0) + 16778865;
                        int scrollBarSize = 26 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr4[53], bArr4[17], bArr4[5], objArr14);
                        objRemoteActionCompatParcelizer5 = startForeground.read(scrollBarFadeDuration, iRgb, scrollBarSize, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i3 = ((int[]) objArr2[3])[0];
        int i4 = ((int[]) objArr2[2])[0];
        if (i4 != i3) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i4 ^ i3)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((ViewConfiguration.getTapTimeout() >> 16) + 4535), 6054 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 41 - TextUtils.lastIndexOf("", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i5 = MediaBrowserCompatSearchResultReceiver + 19;
                MediaDescriptionCompat = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr15 = {-2005053778, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Drawable.resolveOpacity(0, 0) + 6030, 24 - KeyEvent.normalizeMetaState(0));
                    Object[] objArr16 = new Object[1];
                    c((byte) 74, r8[56], (byte) (-$$d[7]), objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
        super.onCreate(bundle);
        Bundle arguments = signout.getArguments();
        if (arguments != null) {
            int i7 = MediaDescriptionCompat + 5;
            MediaBrowserCompatSearchResultReceiver = i7 % 128;
            if (i7 % 2 != 0) {
                arguments.getString("titleKey");
                obj.hashCode();
                throw null;
            }
            String string = arguments.getString("titleKey");
            if (string == null) {
                string = "";
            }
            signout.AudioAttributesCompatParcelizer = string;
            String string2 = arguments.getString("messageKey");
            if (string2 == null) {
                string2 = "";
            }
            signout.read = string2;
            String string3 = arguments.getString("message_hint");
            if (string3 == null) {
                int i8 = MediaBrowserCompatSearchResultReceiver + 111;
                MediaDescriptionCompat = i8 % 128;
                int i9 = i8 % 2;
                string3 = "";
            }
            signout.write = string3;
            String string4 = arguments.getString("button_text_key");
            if (string4 == null) {
                int i10 = MediaBrowserCompatSearchResultReceiver + 1;
                MediaDescriptionCompat = i10 % 128;
                int i11 = i10 % 2;
            } else {
                str = string4;
            }
            signout.IconCompatParcelizer = str;
            signout.setCancelable(arguments.getBoolean("back_press_allow_key"));
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 3;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = getSegmentTimeUs.IconCompatParcelizer(p0, p1);
        ScrollView scrollViewIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
        ScrollView scrollView = scrollViewIconCompatParcelizer;
        int i4 = MediaDescriptionCompat + 59;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return scrollView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 37;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        ScrollView scrollViewIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
        getHttpMethodString.read((View) scrollViewIconCompatParcelizer, true, true, false, false, 0, 60);
        AudioAttributesCompatParcelizer();
        int iIconCompatParcelizer = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer3 = getModuleMessage.IconCompatParcelizer();
        write(getModuleMessage.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer2, iIconCompatParcelizer3, 1954954191, -1954954190);
        int i4 = MediaBrowserCompatSearchResultReceiver + 111;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[PHI: r2
      0x0073: PHI (r2v32 android.widget.TextView) = (r2v31 android.widget.TextView), (r2v36 android.widget.TextView) binds: [B:23:0x0071, B:20:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.signOut.AudioAttributesCompatParcelizer():void");
    }

    private static final void write(getSegmentTimeUs getsegmenttimeus, signOut signout) {
        int i = 2 % 2;
        dispatchTouchEvent.read(getsegmenttimeus.AudioAttributesCompatParcelizer);
        getsegmenttimeus.write.requestFocus();
        Editable text = getsegmenttimeus.AudioAttributesCompatParcelizer.getText();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(text, "");
        if (text.length() != 0) {
            signOut signout2 = signout;
            withAlwaysAsId.read(signout2, "dialog_key", _getIndexResolver.write(setAction.write("on_error", Boolean.FALSE)));
            ProgressBar progressBar = getsegmenttimeus.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(progressBar);
            TextView textView = getsegmenttimeus.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
            EditText editText = getsegmenttimeus.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(editText);
            boolean z = signout.MediaBrowserCompatCustomActionResultReceiver;
            Editable text2 = getsegmenttimeus.AudioAttributesCompatParcelizer.getText();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(text2, "");
            withAlwaysAsId.read(signout2, "dialog_key", _getIndexResolver.write(setAction.write("button_press", TestGroupLSModel.AudioAttributesImplApi26Parcelizer(text2).toString())));
            int i2 = MediaBrowserCompatSearchResultReceiver + 19;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = MediaDescriptionCompat + 101;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        withAlwaysAsId.read(signout, "dialog_key", _getIndexResolver.write(setAction.write("on_error", Boolean.TRUE)));
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        final signOut signout = (signOut) objArr[0];
        int i = 2 % 2;
        EditText editText = signout.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        TextView textView = signout.RemoteActionCompatParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        buildEndStateNotification.RemoteActionCompatParcelizer(editText, textView, new getCreatedOnDateMs() { // from class: o.getFamilyName
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return signOut.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.getDisplayName
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return signOut.write(this.RemoteActionCompatParcelizer);
            }
        });
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final getShowPopup IconCompatParcelizer(signOut signout) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 67;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        signout.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setBackgroundResource(R.drawable.drw_edit_text_background_error);
        signout.RemoteActionCompatParcelizer().IconCompatParcelizer.setTextColor(_isNaN.getColor(signout.requireContext(), R.color.v1_onsurfaceRed));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaDescriptionCompat + 81;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static final getShowPopup read(signOut signout) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 93;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            signout.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setBackgroundResource(R.drawable.drw_edit_text_background);
            signout.RemoteActionCompatParcelizer().IconCompatParcelizer.setTextColor(_isNaN.getColor(signout.requireContext(), R.color.v1_onbackgroundsurface3));
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        signout.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setBackgroundResource(R.drawable.drw_edit_text_background);
        signout.RemoteActionCompatParcelizer().IconCompatParcelizer.setTextColor(_isNaN.getColor(signout.requireContext(), R.color.v1_onbackgroundsurface3));
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i3 = MediaBrowserCompatSearchResultReceiver + 25;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopup2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01ae A[PHI: r0
      0x01ae: PHI (r0v9 int) = (r0v8 int), (r0v40 int) binds: [B:47:0x01ac, B:44:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b8 A[PHI: r0
      0x01b8: PHI (r0v37 int) = (r0v8 int), (r0v40 int) binds: [B:47:0x01ac, B:44:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r24, int r25, int r26, short r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.signOut.b(byte, int, int, short, int, java.lang.Object[]):void");
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 29;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onDestroyView();
            this.RemoteActionCompatParcelizer = null;
        } else {
            super.onDestroyView();
            this.RemoteActionCompatParcelizer = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(signOut signout) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 39;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(signout);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = MediaDescriptionCompat + 113;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return getshowpopupIconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup write(signOut signout) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 65;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return read(signout);
        }
        read(signout);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void read(getSegmentTimeUs getsegmenttimeus, signOut signout) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 95;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        write(getsegmenttimeus, signout);
        int i4 = MediaDescriptionCompat + 67;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        onCommand = 1;
        write();
        INSTANCE = new Companion(null);
        int i = MediaMetadataCompat + 91;
        onCommand = i % 128;
        int i2 = i % 2;
    }

    private final void read() {
        int iIconCompatParcelizer = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer3 = getModuleMessage.IconCompatParcelizer();
        write(getModuleMessage.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer2, iIconCompatParcelizer3, 1954954191, -1954954190);
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) {
        int iIconCompatParcelizer = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getModuleMessage.IconCompatParcelizer();
        int iIconCompatParcelizer3 = getModuleMessage.IconCompatParcelizer();
        write(getModuleMessage.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{this, p0}, iIconCompatParcelizer2, iIconCompatParcelizer3, -52631713, 52631713);
    }

    static void write() {
        AudioAttributesImplBaseParcelizer = -562754185;
        AudioAttributesImplApi21Parcelizer = -819363165;
        MediaBrowserCompatCustomActionResultReceiver = 798961744;
        RatingCompat = new byte[]{TarConstants.LF_GNUTYPE_LONGLINK, -52, -45, -61, -38, 46, 47, -115, -37, TarConstants.LF_CONTIG, -33, 6, -9, -23, 63, -35, TarConstants.LF_GNUTYPE_LONGLINK, 102, 114, TarConstants.LF_GNUTYPE_LONGLINK, 28, 114, 85, 94, 40, 98, 108, 114, 97, 110, 102, 124, -75, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 12, 125, 71, 42, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 15, 127, 118, 90, 91, TarConstants.LF_DIR, 124, -65, 38, 117, 118, 115, 98, 10, 99, TarConstants.LF_GNUTYPE_LONGNAME, 37, 41, 56, 21, 18, 33, 26, 63, 46, 59, 42, 30, 56, 22};
    }
}
