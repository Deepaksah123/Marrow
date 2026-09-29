package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class createForTrackGroup extends shouldEvaluateQueueSize<DashDownloader1> {
    private static short[] RatingCompat;
    private final String AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final RenewEligible AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final String read;
    private final boolean write;
    private static final byte[] $$c = {TarConstants.LF_BLK, -62, -101, -125};
    private static final int $$f = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_GNUTYPE_LONGLINK, 28, -90, 102, 61, -61, -2, -19, 34, -27, -19, -7, 4, -7, 3, 19, -41, 5, 7, 27, -48, -1, -2, 38, -48, -3, -4, 5, -2, -21, 7, -17, 9, -15, -9, 40, -24, -17, 9, -10, -2, -17, 1, 5, -15, 11, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$h = 126;
    private static final byte[] $$a = {91, -41, -108, -7, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 179;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = -1925168727;
    private static int MediaBrowserCompatItemReceiver = -819363115;
    private static int MediaBrowserCompatMediaItem = 7423535;
    private static byte[] MediaMetadataCompat = {25, -59, -20, -36, -45, 39, 56, -122, -44, -64, -24, 31, -128, -30, -56, -42, 25, -66, 74, -125, 84, 74, -83, -106, 96, -70, -92, 74, -71, -90, -66, -76, 3, -114, -110, -125, -19, -80, -114, -107, -123, -100, -32, -31, 91, -126, -59, TarConstants.LF_GNUTYPE_LONGNAME, -101, -100, -103, -120, -112, -119, 26, 29, 1, 16, 13, 10, 25, 114, 23, 6, 19, 2, 118, 16, 14};

    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[getSelectionEligibility.values().length];
            try {
                iArr[getSelectionEligibility.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getSelectionEligibility.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getSelectionEligibility.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getSelectionEligibility.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getSelectionEligibility.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getSelectionEligibility.AudioAttributesCompatParcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getSelectionEligibility.IconCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[getSelectionEligibility.AudioAttributesImplApi26Parcelizer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            read = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, byte r8, byte r9) {
        /*
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = kotlin.createForTrackGroup.$$c
            int r7 = r7 * 2
            int r7 = r7 + 112
            int r9 = r9 * 2
            int r9 = 4 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createForTrackGroup.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 12
            int r6 = 77 - r6
            int r5 = r5 * 10
            int r0 = r5 + 34
            byte[] r1 = kotlin.createForTrackGroup.$$a
            byte[] r0 = new byte[r0]
            int r5 = r5 + 33
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createForTrackGroup.a(byte, byte, int, java.lang.Object[]):void");
    }

    private static void c(int i, byte b, byte b2, Object[] objArr) {
        int i2 = 45 - (b2 * 2);
        byte[] bArr = $$g;
        int i3 = i + 82;
        byte[] bArr2 = new byte[39 - b];
        int i4 = 38 - b;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i4)) - 4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            i2++;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i2])) - 4;
        }
    }

    public static /* synthetic */ Object write(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i6 | i)) | (~(i3 | i));
        int i10 = ~i3;
        int i11 = (~(i10 | i)) | i6;
        int i12 = (~(i | i6 | i3)) | (~(i8 | i10));
        int i13 = i6 + i3 + i4 + ((-373584967) * i5) + ((-1711780345) * i2);
        int i14 = i13 * i13;
        int i15 = (i6 * 1075882953) + 1902575616 + (1075882953 * i3) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i4) + ((-375259136) * i5) + ((-1109524480) * i2) + (585564160 * i14);
        int i16 = ((i6 * 235012993) - 778813113) + (i3 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i4 * 235013625) + (i5 * 915899377) + (i2 * (-1709701169)) + (i14 * 1974403072);
        return i15 + ((i16 * i16) * (-848756736)) != 1 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    public static final /* synthetic */ String AudioAttributesCompatParcelizer(createForTrackGroup createfortrackgroup) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 + 47;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        String str = createfortrackgroup.read;
        int i5 = i2 + 125;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ int AudioAttributesImplApi26Parcelizer(createForTrackGroup createfortrackgroup) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        int i3 = i2 % 128;
        MediaBrowserCompatSearchResultReceiver = i3;
        int i4 = i2 % 2;
        int i5 = createfortrackgroup.AudioAttributesImplApi21Parcelizer;
        int i6 = i3 + 95;
        MediaDescriptionCompat = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        createForTrackGroup createfortrackgroup = (createForTrackGroup) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 101;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        DashDownloader1 dashDownloader1AudioAttributesImplApi21Parcelizer = createfortrackgroup.AudioAttributesImplApi21Parcelizer();
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return dashDownloader1AudioAttributesImplApi21Parcelizer;
    }

    public static final /* synthetic */ String IconCompatParcelizer(createForTrackGroup createfortrackgroup) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 17;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        String str = createfortrackgroup.AudioAttributesImplBaseParcelizer;
        int i5 = i2 + 75;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ boolean read(createForTrackGroup createfortrackgroup) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 5;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        boolean z = createfortrackgroup.IconCompatParcelizer;
        int i5 = i2 + 39;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createForTrackGroup(Context context, String str, int i, boolean z, boolean z2, String str2, String str3, boolean z3) {
        super(context, CmcdConfigurationRequestConfig.read());
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.AudioAttributesCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
        this.AudioAttributesImplBaseParcelizer = str2;
        this.read = str3;
        this.IconCompatParcelizer = z3;
        this.AudioAttributesImplApi26Parcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.DefaultTrackSelectorOtherTrackScore
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return createForTrackGroup.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    private DashDownloader1 AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 39;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        DashDownloader1 dashDownloader1IconCompatParcelizer = DashDownloader1.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dashDownloader1IconCompatParcelizer, "");
        int i4 = MediaBrowserCompatSearchResultReceiver + 89;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return dashDownloader1IconCompatParcelizer;
    }

    private final DefaultTrackSelectorParameters RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 5;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        DefaultTrackSelectorParameters defaultTrackSelectorParameters = (DefaultTrackSelectorParameters) this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        int i4 = MediaDescriptionCompat + 59;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultTrackSelectorParameters;
        }
        throw null;
    }

    private static final DefaultTrackSelectorParameters AudioAttributesImplApi21Parcelizer(createForTrackGroup createfortrackgroup) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 45;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            evaluateSelectionEligibility.INSTANCE.write(createfortrackgroup.AudioAttributesImplApi21Parcelizer);
            obj.hashCode();
            throw null;
        }
        DefaultTrackSelectorParameters defaultTrackSelectorParametersWrite = evaluateSelectionEligibility.INSTANCE.write(createfortrackgroup.AudioAttributesImplApi21Parcelizer);
        int i3 = MediaBrowserCompatSearchResultReceiver + 107;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            return defaultTrackSelectorParametersWrite;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i;
        createForTrackGroup createfortrackgroup = (createForTrackGroup) objArr[0];
        int i2 = 2 % 2;
        switch (read.read[createfortrackgroup.RemoteActionCompatParcelizer().getRead().ordinal()]) {
            case 1:
                i = R.array.video_error_1547_xiaomi_pad6;
                break;
            case 2:
                int i3 = MediaBrowserCompatSearchResultReceiver + 123;
                MediaDescriptionCompat = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i = R.array.video_error_1547_general;
                break;
                break;
            case 3:
                i = R.array.video_error_4202_general;
                break;
            case 4:
                i = R.array.video_error_4201_general;
                break;
            case 5:
                int i4 = MediaDescriptionCompat + 105;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                i = R.array.video_error_try_later;
                break;
            case 6:
                int i6 = MediaDescriptionCompat + 115;
                MediaBrowserCompatSearchResultReceiver = i6 % 128;
                int i7 = i6 % 2;
                i = R.array.video_error_restart_compulsory;
                break;
            case 7:
            case 8:
                if (createfortrackgroup.RemoteActionCompatParcelizer) {
                    int i8 = MediaDescriptionCompat + 51;
                    MediaBrowserCompatSearchResultReceiver = i8 % 128;
                    if (i8 % 2 != 0) {
                        return Integer.valueOf(R.array.video_error_resolutions_capability_support);
                    }
                    int i9 = 67 / 0;
                    return Integer.valueOf(R.array.video_error_resolutions_capability_support);
                }
                i = R.array.video_error_general_support;
                break;
            default:
                throw new RenewEligibleCreator();
        }
        return Integer.valueOf(i);
    }

    public static final class write extends ClickableSpan {
        private /* synthetic */ String write;

        write(String str) {
            this.write = str;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            String strAudioAttributesCompatParcelizer = populateHttpRequestHeaders.AudioAttributesCompatParcelizer(createForTrackGroup.AudioAttributesCompatParcelizer(createForTrackGroup.this), createForTrackGroup.IconCompatParcelizer(createForTrackGroup.this), createForTrackGroup.read(createForTrackGroup.this));
            String strConcat = "\nError Details\nError Code: ".concat(String.valueOf(createForTrackGroup.AudioAttributesImplApi26Parcelizer(createForTrackGroup.this)));
            Context context = createForTrackGroup.this.getContext();
            String str = this.write;
            StringBuilder sb = new StringBuilder();
            sb.append(strAudioAttributesCompatParcelizer);
            sb.append(strConcat);
            scheduleUpdate.AudioAttributesCompatParcelizer(context, str, "Video Error", sb.toString());
        }
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 59;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
            int i5 = 1649 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i6 = 26 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[17];
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(keyRepeatDelay, i5, i6, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i7 = MediaDescriptionCompat + 85;
            MediaBrowserCompatSearchResultReceiver = i7 % 128;
            int i8 = i7 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13182);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1649;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr2[5], bArr2[17], bArr2[27], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c2, keyRepeatTimeout, iResolveOpacity, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 816266194 - Color.green(0), (-1114227486) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 106), Gravity.getAbsoluteGravity(0, 0) - 99, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((byte) (ViewConfiguration.getJumpTapTimeout() >> 16), 816266194 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-1114227470) - Color.argb(0, 0, 0, 0), (short) ((ViewConfiguration.getTouchSlop() >> 8) - 8), (-99) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 1038365509};
                byte[] bArr3 = $$g;
                Object[] objArr7 = new Object[1];
                c((byte) (bArr3[1] + 1), (byte) (bArr3[42] - 1), (byte) (-bArr3[29]), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((byte) (bArr3[23] - 1), bArr3[8], (byte) (-bArr3[6]), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char size = (char) (13183 - View.MeasureSpec.getSize(0));
                    int i9 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                    int i10 = 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr4[5], bArr4[17], bArr4[27], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(size, i9, i10, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((byte) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0') + 816266186, (-1114227453) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 50), (-99) - View.MeasureSpec.getMode(0), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((byte) (ViewConfiguration.getTapTimeout() >> 16), 816266189 - (ViewConfiguration.getFadingEdgeLength() >> 16), (-1114227432) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 79), (-99) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
                        int offsetAfter = 1649 - TextUtils.getOffsetAfter("", 0);
                        int iMyPid = 26 - (Process.myPid() >> 22);
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        a(bArr5[5], bArr5[17], (byte) 76, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(defaultSize, offsetAfter, iMyPid, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c3 = (char) (13184 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int minimumFlingVelocity = 1649 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
                        byte[] bArr6 = $$a;
                        byte b3 = bArr6[17];
                        byte b4 = bArr6[5];
                        Object[] objArr13 = new Object[1];
                        a(b3, b4, b4, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c3, minimumFlingVelocity, i11, -133433128, false, (String) objArr13[0], null);
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
        int i12 = ((int[]) objArr[c])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - (ViewConfiguration.getEdgeSlop() >> 16)), 6055 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 42 - Color.alpha(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {23974888, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) Color.argb(0, 0, 0, 0), 6031 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 23 - TextUtils.lastIndexOf("", '0'));
                    byte b5 = $$g[42];
                    Object[] objArr15 = new Object[1];
                    c((byte) (b5 - 1), r4[45], (byte) (b5 - 1), objArr15);
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
        super.onCreate(bundle);
        setContentView(AudioAttributesImplBaseParcelizer().IconCompatParcelizer());
        DashDownloader1 dashDownloader1AudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        dashDownloader1AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver.setText(this.AudioAttributesCompatParcelizer);
        CustomTextView customTextView = dashDownloader1AudioAttributesImplBaseParcelizer.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        CustomTextView customTextView2 = customTextView;
        if (RemoteActionCompatParcelizer().getAudioAttributesCompatParcelizer()) {
            int i14 = MediaDescriptionCompat + 125;
            MediaBrowserCompatSearchResultReceiver = i14 % 128;
            i = i14 % 2 == 0 ? 1 : 0;
        } else {
            i = 8;
        }
        customTextView2.setVisibility(i);
        dashDownloader1AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer.setText(RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer ^ true ? RemoteActionCompatParcelizer().getRemoteActionCompatParcelizer() : R.string.text_device_restart_troubleshoot_heading));
        if (!(!this.write)) {
            dashDownloader1AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer.setVisibility(8);
            dashDownloader1AudioAttributesImplBaseParcelizer.IconCompatParcelizer.setVisibility(8);
        } else {
            String[] stringArray = getContext().getResources().getStringArray(((Integer) write(Identity.write(), Identity.write(), new Object[]{this}, 1547711338, Identity.write(), Identity.write(), -1547711338)).intValue());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stringArray, "");
            int i15 = 0;
            for (String str : stringArray) {
                i15++;
                View viewInflate = getLayoutInflater().inflate(R.layout.resolution_item, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_point_sr);
                StringBuilder sb = new StringBuilder();
                sb.append(i15);
                sb.append(")");
                textView.setText(sb.toString());
                ((TextView) viewInflate.findViewById(R.id.tv_point_text)).setText(str);
                dashDownloader1AudioAttributesImplBaseParcelizer.IconCompatParcelizer.addView(viewInflate);
            }
        }
        SpannableString spannableStringMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        AudioAttributesImplBaseParcelizer().read.setMovementMethod(LinkMovementMethod.getInstance());
        AudioAttributesImplBaseParcelizer().read.setText(spannableStringMediaBrowserCompatItemReceiver);
        CustomButton customButton = dashDownloader1AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        RemoteActionCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.DefaultTrackSelector1
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return createForTrackGroup.write(this.IconCompatParcelizer);
            }
        });
    }

    private static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(createForTrackGroup createfortrackgroup) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 119;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        createfortrackgroup.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaDescriptionCompat + 83;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatItemReceiver)};
            int i6 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24297, (ViewConfiguration.getEdgeSlop() >> 16) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = MediaMetadataCompat;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr3 = new Object[1];
                            objArr3[i6] = Integer.valueOf(bArr[i7]);
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b2 = (byte) i6;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', i6) + 1), 3082 - View.MeasureSpec.makeMeasureSpec(i6, i6), View.getDefaultSize(i6, i6) + 128, 2145850993, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i7++;
                            int i8 = $10 + 19;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            i6 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 63;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr3 = MediaMetadataCompat;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.getMode(0), 24297 - (ViewConfiguration.getEdgeSlop() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L)));
                        j = 7899112766888837815L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) RatingCompat[i2 + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                int i12 = ((i2 + iIntValue) - 2) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ j));
                if (z2) {
                    int i13 = $11 + 43;
                    int i14 = i13 % 128;
                    $10 = i14;
                    int i15 = i13 % 2;
                    int i16 = i14 + 121;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                buildresumedownloadsintent.read = i12 + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatMediaItem), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34135 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), MotionEvent.axisFromString("") + 13433, Color.rgb(0, 0, 0) + 16777237, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = MediaMetadataCompat;
                if (bArr4 != null) {
                    int i18 = $10 + 5;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i20 = 0; i20 < length2; i20++) {
                        bArr5[i20] = (byte) (((long) bArr4[i20]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i21 = $10 + 1;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        byte[] bArr6 = MediaMetadataCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = RatingCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private final SpannableString MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(R.string.support_email);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(IconCompatParcelizer(R.string.text_video_error_contact_support, strRemoteActionCompatParcelizer), Arrays.copyOf(new Object[0], 0));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        String str2 = str;
        int i2 = TestGroupLSModel.read((CharSequence) str2, strRemoteActionCompatParcelizer, 0, false, 6);
        SpannableString spannableString = new SpannableString(str2);
        if (i2 > 0) {
            Context context = getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context, R.attr.onBackgroundSurface3, 0, i2 - 1);
            int i3 = MediaDescriptionCompat + 115;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            int i4 = i3 % 2;
        }
        int length = strRemoteActionCompatParcelizer.length() + i2 + 1;
        Context context2 = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
        CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context2, R.attr.onBackgroundSurface3, strRemoteActionCompatParcelizer.length() + i2 + 1, str.length() - 1);
        if (length < str.length()) {
            int i5 = MediaBrowserCompatSearchResultReceiver + 101;
            MediaDescriptionCompat = i5 % 128;
            if (i5 % 2 != 0) {
                Context context3 = getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
                CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context3, R.attr.onBackgroundSurface3, length, str.length());
                int i6 = 66 / 0;
            } else {
                Context context4 = getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context4, "");
                CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context4, R.attr.onBackgroundSurface3, length, str.length());
            }
        }
        spannableString.setSpan(new write(strRemoteActionCompatParcelizer), i2, strRemoteActionCompatParcelizer.length() + i2, 18);
        Context context5 = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context5, "");
        CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context5, R.attr.onSurfaceBgLinks, i2, strRemoteActionCompatParcelizer.length() + i2);
        return spannableString;
    }

    public static /* synthetic */ DefaultTrackSelectorParameters RemoteActionCompatParcelizer(createForTrackGroup createfortrackgroup) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 19;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            AudioAttributesImplApi21Parcelizer(createfortrackgroup);
            throw null;
        }
        DefaultTrackSelectorParameters defaultTrackSelectorParametersAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(createfortrackgroup);
        int i3 = MediaBrowserCompatSearchResultReceiver + 83;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return defaultTrackSelectorParametersAudioAttributesImplApi21Parcelizer;
    }

    public static /* synthetic */ getShowPopup write(createForTrackGroup createfortrackgroup) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(createfortrackgroup);
        int i4 = MediaDescriptionCompat + 67;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopupMediaBrowserCompatCustomActionResultReceiver;
        }
        throw null;
    }

    private final int IconCompatParcelizer() {
        int iWrite = Identity.write();
        int iWrite2 = Identity.write();
        int iWrite3 = Identity.write();
        return ((Integer) write(iWrite, Identity.write(), new Object[]{this}, 1547711338, iWrite2, iWrite3, -1547711338)).intValue();
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* bridge */ /* synthetic */ getApplicationLabel write() {
        int iWrite = Identity.write();
        int iWrite2 = Identity.write();
        int iWrite3 = Identity.write();
        return (getApplicationLabel) write(iWrite, Identity.write(), new Object[]{this}, 2118967004, iWrite2, iWrite3, -2118967003);
    }
}
