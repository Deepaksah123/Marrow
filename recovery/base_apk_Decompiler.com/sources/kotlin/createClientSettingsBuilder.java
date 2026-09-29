package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.zzhd;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001bR\"\u0010\u0018\u001a\u00020\u001d8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0014\u0010\u001f\"\u0004\b\u0018\u0010 "}, d2 = {"Lo/createClientSettingsBuilder;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "Lo/SingleSegmentIndex;", "read", "Lo/SingleSegmentIndex;", "write", "()Lo/SingleSegmentIndex;", "RemoteActionCompatParcelizer", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "()Landroid/os/CountDownTimer;", "(Landroid/os/CountDownTimer;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createClientSettingsBuilder extends argCount {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private long AudioAttributesCompatParcelizer;
    private long IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private SingleSegmentIndex write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private CountDownTimer read;
    private static final byte[] $$d = {123, -91, -44, 22, 74, -14, 7, 4, 2, -25, 12, 21, 14, 7, 7, 26, -8, -10, 13, 8, 12, 22, 74, -74, 14, 18, -2, 24, -17, -3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, -10, 1, 7, 4, 24, 45, -25, -8, 20, 3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4};
    private static final int $$e = 95;
    private static final byte[] $$a = {10, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 13, 109, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 140;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 12
            int r8 = r8 + 65
            byte[] r0 = kotlin.createClientSettingsBuilder.$$a
            int r7 = 79 - r7
            int r6 = r6 * 10
            int r1 = r6 + 34
            byte[] r1 = new byte[r1]
            int r6 = r6 + 33
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createClientSettingsBuilder.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 20
            int r9 = r9 + 73
            byte[] r0 = kotlin.createClientSettingsBuilder.$$d
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r5 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + 9
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createClientSettingsBuilder.c(short, short, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i11 = ~i3;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i4;
        int i14 = i6 + i4 + i + ((-700610695) * i2) + ((-1151578525) * i5);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i6) + 1030029312 + ((-1366800679) * i4) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i) + ((-665714688) * i2) + (367394816 * i5) + (374145024 * i15);
        int i17 = ((i6 * 323709325) - 650539883) + (i4 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i * 323709601) + (i2 * (-499299047)) + (i5 * 1568885315) + (i15 * (-395509760));
        return i16 + ((i17 * i17) * (-772603904)) != 1 ? RemoteActionCompatParcelizer(objArr) : read(objArr);
    }

    public static final /* synthetic */ SingleSegmentIndex IconCompatParcelizer(createClientSettingsBuilder createclientsettingsbuilder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 79;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        SingleSegmentIndex singleSegmentIndexAudioAttributesCompatParcelizer = createclientsettingsbuilder.AudioAttributesCompatParcelizer();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 45;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return singleSegmentIndexAudioAttributesCompatParcelizer;
        }
        throw null;
    }

    private final SingleSegmentIndex AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 77;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        SingleSegmentIndex singleSegmentIndex = this.write;
        toMagicModuleMetaRepoModel.write(singleSegmentIndex);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 37;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return singleSegmentIndex;
        }
        obj.hashCode();
        throw null;
    }

    private void read(CountDownTimer countDownTimer) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(countDownTimer, "");
        this.read = countDownTimer;
        int i4 = MediaBrowserCompatItemReceiver + 117;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public final CountDownTimer IconCompatParcelizer() {
        int i = 2 % 2;
        CountDownTimer countDownTimer = this.read;
        if (countDownTimer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i2 = MediaBrowserCompatItemReceiver + 7;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
        return countDownTimer;
    }

    public static final class AudioAttributesCompatParcelizer extends CountDownTimer {
        AudioAttributesCompatParcelizer(long j) {
            super(j, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            if (createClientSettingsBuilder.this.getView() != null) {
                createClientSettingsBuilder.IconCompatParcelizer(createClientSettingsBuilder.this).RemoteActionCompatParcelizer.setText(loadBitmap.write(j));
            }
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            if (createClientSettingsBuilder.this.getView() != null) {
                createClientSettingsBuilder.IconCompatParcelizer(createClientSettingsBuilder.this).RemoteActionCompatParcelizer.setText(createClientSettingsBuilder.this.getString(R.string.label_live_video_tag));
            }
        }
    }

    /* JADX INFO: renamed from: o.createClientSettingsBuilder$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/createClientSettingsBuilder$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/createClientSettingsBuilder;", "read", "(J)Lo/createClientSettingsBuilder;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static createClientSettingsBuilder read(long p0) {
            createClientSettingsBuilder createclientsettingsbuilder = new createClientSettingsBuilder();
            Bundle bundle = new Bundle();
            bundle.putLong("start_time", p0);
            createclientsettingsbuilder.setArguments(bundle);
            return createclientsettingsbuilder;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 43;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char cResolveSizeAndState = (char) (13183 - View.resolveSizeAndState(0, 0, 0));
                int gidForName = Process.getGidForName("") + 1650;
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 26;
                byte b = $$a[17];
                Object[] objArr2 = new Object[1];
                a(b, (byte) 76, b, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cResolveSizeAndState, gidForName, iResolveSizeAndState, -133433128, false, (String) objArr2[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer).getLong(null);
            throw null;
        }
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer2 == null) {
            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 13183);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
            int i3 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
            byte b2 = $$a[17];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) 76, b2, objArr3);
            objRemoteActionCompatParcelizer2 = startForeground.read(trimmedLength, touchSlop, i3, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer2).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cRed = (char) (13183 - Color.red(0));
                int iMyPid = (Process.myPid() >> 22) + 1649;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 27;
                byte b3 = $$a[5];
                Object[] objArr4 = new Object[1];
                a(b3, r15[39], b3, objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(cRed, iMyPid, iLastIndexOf, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 0, 0}, true, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0}, new int[]{16, 16, 0, 5}, false, objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, -1702716788};
                byte b4 = (byte) ($$e & 5);
                byte[] bArr = $$d;
                byte b5 = (byte) (-bArr[48]);
                Object[] objArr8 = new Object[1];
                c(b4, b5, (byte) (b5 & 38), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b6 = bArr[48];
                byte b7 = (byte) (b6 - 1);
                Object[] objArr9 = new Object[1];
                c(b7, (byte) (b7 | 23), (byte) (b6 - 1), objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char tapTimeout = (char) (13183 - (ViewConfiguration.getTapTimeout() >> 16));
                    int offsetBefore = 1649 - TextUtils.getOffsetBefore("", 0);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                    byte b8 = $$a[5];
                    Object[] objArr10 = new Object[1];
                    a(b8, r10[39], b8, objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(tapTimeout, offsetBefore, scrollDefaultDelay, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{32, 22, 0, 0}, true, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, new int[]{54, 15, 0, 0}, true, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char windowTouchSlop = (char) (13183 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int iMyTid = 1649 - (Process.myTid() >> 22);
                        int i4 = 27 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte b9 = $$a[5];
                        byte b10 = b9;
                        Object[] objArr13 = new Object[1];
                        a(b9, b10, b10, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(windowTouchSlop, iMyTid, i4, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 13184);
                        int iRed = 1649 - Color.red(0);
                        int iAlpha = Color.alpha(0) + 26;
                        byte b11 = $$a[17];
                        Object[] objArr14 = new Object[1];
                        a(b11, (byte) 76, b11, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cLastIndexOf, iRed, iAlpha, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
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
        int i5 = ((int[]) objArr[c])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 != i5) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4534), TextUtils.indexOf("", "", 0) + 6054, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i7 = MediaBrowserCompatCustomActionResultReceiver + 17;
                MediaBrowserCompatItemReceiver = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr15 = {1705911961, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (Process.myTid() >> 22), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b12 = $$d[19];
                    Object[] objArr16 = new Object[1];
                    c(b12, (byte) (b12 | 34), (byte) ($$e & 41), objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
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
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.IconCompatParcelizer = arguments.getLong("start_time", 0L);
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 19;
        MediaBrowserCompatItemReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.write = SingleSegmentIndex.RemoteActionCompatParcelizer(p0, p1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer().IconCompatParcelizer(), "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = SingleSegmentIndex.RemoteActionCompatParcelizer(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = AudioAttributesCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        ConstraintLayout constraintLayout = constraintLayoutIconCompatParcelizer;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 21;
        MediaBrowserCompatItemReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            return constraintLayout;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = AudioAttributesImplApi21Parcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11614, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $10 + 61;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), Color.rgb(0, 0, 0) + 16800175, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 9863 - (ViewConfiguration.getTouchSlop() >> 8), Color.blue(0) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (ViewConfiguration.getEdgeSlop() >> 16)), 9755 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.green(0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i11 = $10 + 91;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                System.arraycopy(cArr5, 0, cArr3, i3 / i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i3 << i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i12 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i12, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i12);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            int i13 = $10 + 43;
            $11 = i13 % 128;
            while (true) {
                int i14 = i13 % 2;
                if (buildsetstopreasonintent.RemoteActionCompatParcelizer >= i3) {
                    break;
                }
                cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                i13 = $11 + 97;
                $10 = i13 % 128;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            int i15 = $10 + 89;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final void RemoteActionCompatParcelizer(createClientSettingsBuilder createclientsettingsbuilder) {
        createClientSettingsBuilder createclientsettingsbuilder2;
        Bundle bundleWrite;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 87;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            createclientsettingsbuilder2 = createclientsettingsbuilder;
            Pair[] pairArr = new Pair[0];
            pairArr[0] = setAction.write("primary_button_click", Boolean.TRUE);
            bundleWrite = _getIndexResolver.write(pairArr);
        } else {
            createclientsettingsbuilder2 = createclientsettingsbuilder;
            bundleWrite = _getIndexResolver.write(setAction.write("primary_button_click", Boolean.TRUE));
        }
        withAlwaysAsId.read(createclientsettingsbuilder2, "dialog_key", bundleWrite);
        createclientsettingsbuilder.dismiss();
        int i3 = MediaBrowserCompatItemReceiver + 69;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 103;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        SingleSegmentIndex singleSegmentIndexAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.IconCompatParcelizer;
        if (jCurrentTimeMillis > j) {
            singleSegmentIndexAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setText(getString(R.string.label_live_video_tag));
        } else {
            long jCurrentTimeMillis2 = j - System.currentTimeMillis();
            this.AudioAttributesCompatParcelizer = jCurrentTimeMillis2;
            read(new AudioAttributesCompatParcelizer(jCurrentTimeMillis2));
            IconCompatParcelizer().start();
            int i4 = MediaBrowserCompatItemReceiver + 19;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        singleSegmentIndexAudioAttributesCompatParcelizer.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.doRead
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.write};
                createClientSettingsBuilder.read(zzhd.RemoteActionCompatParcelizer.write(), zzhd.RemoteActionCompatParcelizer.write(), zzhd.RemoteActionCompatParcelizer.write(), -2095986437, objArr, zzhd.RemoteActionCompatParcelizer.write(), 2095986437);
            }
        });
        singleSegmentIndexAudioAttributesCompatParcelizer.read.setOnClickListener(new View.OnClickListener() { // from class: o.disconnectService
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createClientSettingsBuilder.write(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    private static final void read(createClientSettingsBuilder createclientsettingsbuilder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        createclientsettingsbuilder.dismiss();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 77;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        createClientSettingsBuilder createclientsettingsbuilder = (createClientSettingsBuilder) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroyView();
            createclientsettingsbuilder.write = null;
            int i3 = 75 / 0;
        } else {
            super.onDestroyView();
            createclientsettingsbuilder.write = null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 85;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void write(createClientSettingsBuilder createclientsettingsbuilder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 47;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        read(createclientsettingsbuilder);
        int i4 = MediaBrowserCompatItemReceiver + 77;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(createClientSettingsBuilder createclientsettingsbuilder) {
        int iWrite = zzhd.RemoteActionCompatParcelizer.write();
        read(zzhd.RemoteActionCompatParcelizer.write(), zzhd.RemoteActionCompatParcelizer.write(), iWrite, -2095986437, new Object[]{createclientsettingsbuilder}, zzhd.RemoteActionCompatParcelizer.write(), 2095986437);
    }

    static {
        AudioAttributesImplApi26Parcelizer = 1;
        RemoteActionCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 69;
        AudioAttributesImplApi26Parcelizer = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 0;
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int iWrite = zzhd.RemoteActionCompatParcelizer.write();
        read(zzhd.RemoteActionCompatParcelizer.write(), zzhd.RemoteActionCompatParcelizer.write(), iWrite, 1412380673, new Object[]{this}, zzhd.RemoteActionCompatParcelizer.write(), -1412380672);
    }

    static void RemoteActionCompatParcelizer() {
        AudioAttributesImplApi21Parcelizer = new char[]{44988, 45027, 45030, 45049, 45052, 45036, 45002, 44992, 45024, 45037, 45036, 44999, 45005, 45025, 45025, 45039, 44990, 45023, 45011, 45027, 45038, 45037, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 44991, 45037, 45027, 45031, 45021, 45010, 45027, 45030, 45049, 45052, 45036, 45002, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 44984, 45027, 45025, 45028, 45050, 45036, 45033, 45009, 45009, 45038, 45030, 45051, 45026, 45036, 45026};
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        createClientSettingsBuilder createclientsettingsbuilder = (createClientSettingsBuilder) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 109;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(createclientsettingsbuilder);
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 79;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
