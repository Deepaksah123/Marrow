package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class applyLegacyRendererOverrides extends shouldEvaluateQueueSize<getInitializationUri> {
    private static short[] MediaBrowserCompatCustomActionResultReceiver;
    private RemoteActionCompatParcelizer read;
    private static final byte[] $$c = {34, TarConstants.LF_NORMAL, 18, 42};
    private static final int $$f = 11;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {124, -87, 60, -63, -58, 44, 40, -12, 26, 8, 5, -39, 58, -14, 9, 18, 11, -4, 13, 6, -26, 27, 22, 7, -4, 20, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$h = 63;
    private static final byte[] $$a = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, 9, 62, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 55;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int IconCompatParcelizer = -972740415;
    private static int write = -819363091;
    private static int AudioAttributesCompatParcelizer = 1126905735;
    private static byte[] RemoteActionCompatParcelizer = {1, -123, 124, -116, 119, -85, -88, 74, 116, -128, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -77, 64, 102, -104, 122, 1, 84, -96, 121, -114, -96, 71, TarConstants.LF_GNUTYPE_LONGNAME, -102, 80, 94, -96, TarConstants.LF_GNUTYPE_SPARSE, 92, 84, -82, 11, -105, 107, -100, -74, 73, -105, 110, -98, 101, -71, -70, 36, -101, -34, 85, 100, 101, 98, -111, 105, -110, 2, -54, TarConstants.LF_FIFO, -57, 58, 57, -50, 33, -36, -51, -64, TarConstants.LF_LINK, 61, -57, TarConstants.LF_DIR};

    public interface RemoteActionCompatParcelizer {
        void write(PhoneNumber phoneNumber, String str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 * 4
            int r7 = r7 + 112
            byte[] r1 = kotlin.applyLegacyRendererOverrides.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.applyLegacyRendererOverrides.$$i(byte, byte, int):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~i3;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i3));
        int i11 = ~(i7 | i9);
        int i12 = i6 | i11;
        int i13 = (~(i3 | i5)) | i11 | (~(i8 | i5));
        int i14 = i5 + i6 + i + (296844165 * i4) + (1729652556 * i2);
        int i15 = i14 * i14;
        int i16 = ((i5 * 599922083) - 580124672) + (599922083 * i6) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i) + ((-279707648) * i4) + ((-265289728) * i2) + (2117271552 * i15);
        int i17 = (i5 * (-1181628991)) + 1322814002 + (i6 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i * (-1181629109)) + (i4 * (-698251017)) + (i2 * 1773125444) + (i15 * 938541056);
        if (i16 + (i17 * i17 * (-109772800)) == 1) {
            applyLegacyRendererOverrides applylegacyrendereroverrides = (applyLegacyRendererOverrides) objArr[0];
            int i18 = 2 % 2;
            int i19 = AudioAttributesImplApi26Parcelizer + 35;
            AudioAttributesImplBaseParcelizer = i19 % 128;
            int i20 = i19 % 2;
            getShowPopup getshowpopup = read(applylegacyrendereroverrides);
            int i21 = AudioAttributesImplBaseParcelizer + 125;
            AudioAttributesImplApi26Parcelizer = i21 % 128;
            int i22 = i21 % 2;
            return getshowpopup;
        }
        applyLegacyRendererOverrides applylegacyrendereroverrides2 = (applyLegacyRendererOverrides) objArr[0];
        View view = (View) objArr[1];
        int i23 = 2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(view, applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().read)) {
            int i24 = AudioAttributesImplApi26Parcelizer + 41;
            AudioAttributesImplBaseParcelizer = i24 % 128;
            int i25 = i24 % 2;
            CustomTextView customTextView = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            CustomTextView customTextView2 = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
            PlayerControlViewExternalSyntheticLambda1.write(customTextView, customTextView2);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(view, applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().IconCompatParcelizer)) {
            int i26 = AudioAttributesImplApi26Parcelizer + 55;
            AudioAttributesImplBaseParcelizer = i26 % 128;
            int i27 = i26 % 2;
            CustomTextView customTextView3 = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
            CustomTextView customTextView4 = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView4, "");
            PlayerControlViewExternalSyntheticLambda1.write(customTextView3, customTextView4);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(view, applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver)) {
            int i28 = AudioAttributesImplBaseParcelizer + 91;
            AudioAttributesImplApi26Parcelizer = i28 % 128;
            int i29 = i28 % 2;
            CustomTextView customTextView5 = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView5, "");
            CustomTextView customTextView6 = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView6, "");
            PlayerControlViewExternalSyntheticLambda1.write(customTextView5, customTextView6);
        }
        view.setSelected(!view.isSelected());
        CustomTextView customTextView7 = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView7, "");
        CustomTextView customTextView8 = customTextView7;
        boolean z = !applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().read.isSelected();
        int i30 = R.color.steel_grey;
        PlayerControlViewExternalSyntheticLambda1.read(customTextView8, z ? R.color.steel_grey : R.color.off_white);
        CustomTextView customTextView9 = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView9, "");
        PlayerControlViewExternalSyntheticLambda1.read(customTextView9, applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().IconCompatParcelizer.isSelected() ? R.color.off_white : R.color.steel_grey);
        CustomTextView customTextView10 = applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView10, "");
        CustomTextView customTextView11 = customTextView10;
        if (applylegacyrendereroverrides2.AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver.isSelected()) {
            i30 = R.color.off_white;
        }
        PlayerControlViewExternalSyntheticLambda1.read(customTextView11, i30);
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 10
            int r0 = 44 - r6
            byte[] r1 = kotlin.applyLegacyRendererOverrides.$$a
            int r8 = r8 * 12
            int r8 = 77 - r8
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-1)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.applyLegacyRendererOverrides.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 5
            int r8 = 28 - r8
            int r7 = r7 * 29
            int r7 = r7 + 82
            int r6 = r6 * 22
            int r6 = r6 + 4
            byte[] r0 = kotlin.applyLegacyRendererOverrides.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-7)
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.applyLegacyRendererOverrides.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public applyLegacyRendererOverrides(Context context) {
        super(context, R.style.AppTheme_Light_Dialog);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 121;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getInitializationUri getinitializationuriIconCompatParcelizer = IconCompatParcelizer();
        if (i3 != 0) {
            return getinitializationuriIconCompatParcelizer;
        }
        throw null;
    }

    private getInitializationUri IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 117;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getInitializationUri getinitializationuriAudioAttributesCompatParcelizer = getInitializationUri.AudioAttributesCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getinitializationuriAudioAttributesCompatParcelizer, "");
        int i4 = AudioAttributesImplBaseParcelizer + 15;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return getinitializationuriAudioAttributesCompatParcelizer;
    }

    private static final void write(applyLegacyRendererOverrides applylegacyrendereroverrides) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 43;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        updateNavigation updatenavigation = updateNavigation.INSTANCE;
        if (i3 == 0) {
            updateNavigation.read(applylegacyrendereroverrides.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer);
            return;
        }
        updateNavigation.read(applylegacyrendereroverrides.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup read(applyLegacyRendererOverrides applylegacyrendereroverrides) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 73;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        applylegacyrendereroverrides.RemoteActionCompatParcelizer();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 19;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 47;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13184);
                int i3 = 1650 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
                byte b = $$a[5];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, i3, keyRepeatTimeout, -133433128, false, (String) objArr2[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer).getLong(null);
            throw null;
        }
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer2 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13183);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1649;
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
            byte b3 = $$a[5];
            byte b4 = b3;
            Object[] objArr3 = new Object[1];
            a(b3, b4, b4, objArr3);
            objRemoteActionCompatParcelizer2 = startForeground.read(touchSlop, absoluteGravity, scrollDefaultDelay, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer2).getLong(null) != -1) {
            int i4 = AudioAttributesImplBaseParcelizer + 79;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char fadingEdgeLength = (char) (13183 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int i5 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                    byte[] bArr = $$a;
                    byte b5 = bArr[53];
                    byte b6 = b5;
                    byte b7 = (byte) (-bArr[27]);
                    byte b8 = b5;
                    Object[] objArr4 = new Object[1];
                    a(b6, b7, b8, objArr4);
                    objRemoteActionCompatParcelizer3 = startForeground.read(fadingEdgeLength, modifierMetaStateMask, i5, -1033747278, false, (String) objArr4[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
                int i6 = 99 / 0;
            } else {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 13183);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1650;
                    int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr2 = $$a;
                    byte b9 = bArr2[53];
                    byte b10 = b9;
                    byte b11 = (byte) (-bArr2[27]);
                    byte b12 = b9;
                    Object[] objArr5 = new Object[1];
                    a(b10, b11, b12, objArr5);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, iLastIndexOf, iLastIndexOf2, -1033747278, false, (String) objArr5[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            }
        } else {
            Object[] objArr6 = new Object[1];
            b((byte) (58 - TextUtils.indexOf("", "")), 1945979706 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) - 153922166, (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) - 90, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            b((byte) (Color.alpha(0) - 30), ImageFormat.getBitsPerPixel(0) + 1945979706, ExpandableListView.getPackedPositionType(0L) - 153922150, (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 90, objArr7);
            try {
                Object[] objArr8 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue()), 0, 983113881};
                byte b13 = (byte) 0;
                byte b14 = (byte) (b13 + 1);
                Object[] objArr9 = new Object[1];
                c(b13, b14, b14, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b15 = (byte) ($$h & 1);
                byte b16 = (byte) (b15 - 1);
                Object[] objArr10 = new Object[1];
                c(b15, b16, b16, objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 13183);
                    int maximumDrawingCacheSize = 1649 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iMyPid = 26 - (Process.myPid() >> 22);
                    byte[] bArr3 = $$a;
                    byte b17 = bArr3[53];
                    byte b18 = b17;
                    byte b19 = (byte) (-bArr3[27]);
                    byte b20 = b17;
                    Object[] objArr11 = new Object[1];
                    a(b18, b19, b20, objArr11);
                    objRemoteActionCompatParcelizer5 = startForeground.read(mode, maximumDrawingCacheSize, iMyPid, -1033747278, false, (String) objArr11[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    b((byte) (40 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1945979698 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) - 153922134, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 90, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 122), Color.red(0) + 1945979701, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 153922112, (short) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), Color.green(0) - 91, objArr13);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13184);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1649;
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 26;
                        byte b21 = $$a[53];
                        Object[] objArr14 = new Object[1];
                        a(b21, r14[1], b21, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cIndexOf2, longPressTimeout, iIndexOf, 54351865, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char maximumFlingVelocity = (char) (13183 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int iRed = Color.red(0) + 1649;
                        int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                        byte b22 = $$a[5];
                        byte b23 = b22;
                        Object[] objArr15 = new Object[1];
                        a(b22, b23, b23, objArr15);
                        objRemoteActionCompatParcelizer7 = startForeground.read(maximumFlingVelocity, iRed, iNormalizeMetaState, -133433128, false, (String) objArr15[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
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
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) (4536 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 6054 - TextUtils.indexOf("", "", 0), 42 - ExpandableListView.getPackedPositionGroup(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = AudioAttributesImplBaseParcelizer + 13;
                AudioAttributesImplApi26Parcelizer = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr16 = {1722606642, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(0, 0) + 6030, 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    byte b24 = (byte) ($$h & 1);
                    byte b25 = (byte) (b24 - 1);
                    Object[] objArr17 = new Object[1];
                    c(b24, b25, b25, objArr17);
                    cls4.getMethod((String) objArr17[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr16);
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
        TrainingApplication trainingApplicationIconCompatParcelizer = TrainingApplication.IconCompatParcelizer(getContext());
        String nationalNumber = trainingApplicationIconCompatParcelizer.getLoggedUser().getInfo().getPhoneNumber().getNationalNumber();
        String countryCode = trainingApplicationIconCompatParcelizer.getLoggedUser().getInfo().getPhoneNumber().getCountryCode();
        AudioAttributesImplBaseParcelizer().read.setSelected(true);
        String str = nationalNumber;
        if (str != null && str.length() != 0) {
            AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.setText(str);
            AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setText("+".concat(String.valueOf(countryCode)));
            AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.setSelection(nationalNumber.length());
        }
        AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.postDelayed(new Runnable() { // from class: o.BaseTrackSelectionExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                applyLegacyRendererOverrides.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        }, 200L);
        CustomButton customButton = AudioAttributesImplBaseParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        RemoteActionCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.applyTrackSelectionOverrides
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                Object[] objArr18 = {this.RemoteActionCompatParcelizer};
                int i11 = AnnotatedField.Serialization.read();
                return (getShowPopup) applyLegacyRendererOverrides.AudioAttributesCompatParcelizer(AnnotatedField.Serialization.read(), AnnotatedField.Serialization.read(), objArr18, i11, AnnotatedField.Serialization.read(), -1809485139, 1809485140);
            }
        });
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        CustomTextView customTextView2 = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        CustomTextView customTextView3 = AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
        read(new View[]{customTextView, customTextView2, customTextView3}, (getAnswerMap<? super View, getShowPopup>) new getAnswerMap() { // from class: o.getFormatLanguageScore
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return applyLegacyRendererOverrides.read(this.RemoteActionCompatParcelizer, (View) obj);
            }
        });
    }

    public final void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 103;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.read = remoteActionCompatParcelizer;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(write)};
            int i7 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j = 0;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getTrimmedLength(""), 24297 - ExpandableListView.getPackedPositionType(0L), Color.argb(0, 0, 0, 0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i8 = iIntValue == -1 ? 1 : 0;
            float f = BitmapDescriptorFactory.HUE_RED;
            if (i8 != 0) {
                byte[] bArr = RemoteActionCompatParcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(bArr[i9]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i7;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1), 3083 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), 128 - View.combineMeasuredStates(i7, i7), 2145850993, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i7 = 0;
                        j = 0;
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatCustomActionResultReceiver[i2 + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                    int i10 = $10 + 83;
                    $11 = i10 % 128;
                    i4 = 2;
                    if (i10 % 2 == 0) {
                        int i11 = 2 % 3;
                    }
                } else {
                    int i12 = $11 + 115;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        byte[] bArr3 = RemoteActionCompatParcelizer;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(IconCompatParcelizer)};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 24296, 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) & 7899112766888837815L)) << ((int) (((long) write) | 7899112766888837815L));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        byte[] bArr4 = RemoteActionCompatParcelizer;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(IconCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.blue(0), 24297 - KeyEvent.normalizeMetaState(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L));
                    }
                    iIntValue = (byte) i5;
                    i4 = 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - i4) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)) + i8;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(AudioAttributesCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 34134), Color.blue(0) + 13432, 22 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = RemoteActionCompatParcelizer;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        bArr6[i13] = (byte) (((long) bArr5[i13]) ^ 7899112766888837815L);
                        i13++;
                        int i14 = $10 + 25;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    bArr5 = bArr6;
                }
                boolean z = !(bArr5 == null);
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    int i16 = $10 + 7;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr7 = RemoteActionCompatParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = MediaBrowserCompatCustomActionResultReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final void RemoteActionCompatParcelizer() {
        String strAudioAttributesCompatParcelizer;
        int i = 2 % 2;
        String string = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.getText().toString();
        String string2 = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.getText().toString();
        int i2 = dispatchTouchEvent.read(string2, string);
        if (i2 != 200) {
            switch (i2) {
                case 101:
                    AudioAttributesCompatParcelizer(R.string.error_country_code_empty);
                    AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.requestFocus();
                    break;
                case 102:
                    AudioAttributesCompatParcelizer(R.string.error_country_code_invalid);
                    AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.requestFocus();
                    break;
                case 103:
                    AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.setError(RemoteActionCompatParcelizer(R.string.error_phone_number_empty));
                    AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.requestFocus();
                    break;
                case 104:
                    AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.setError(RemoteActionCompatParcelizer(R.string.error_phone_number_invalid));
                    AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.requestFocus();
                    break;
            }
            return;
        }
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setError(null);
        AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.setError(null);
        if (!(!AudioAttributesImplBaseParcelizer().read.isSelected())) {
            strAudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer().read.AudioAttributesCompatParcelizer();
        } else if (!AudioAttributesImplBaseParcelizer().IconCompatParcelizer.isSelected()) {
            String strAudioAttributesCompatParcelizer2 = AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
            int i3 = AudioAttributesImplApi26Parcelizer + 57;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            strAudioAttributesCompatParcelizer = strAudioAttributesCompatParcelizer2;
        } else {
            int i5 = AudioAttributesImplBaseParcelizer + 87;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            strAudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer().IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        AudioAttributesCompatParcelizer(string2, string, strAudioAttributesCompatParcelizer);
    }

    private final void AudioAttributesCompatParcelizer(String str, String str2, String str3) {
        int i = 2 % 2;
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(str);
        phoneNumber.setNationalNumber(str2);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer != null) {
            int i2 = AudioAttributesImplBaseParcelizer + 85;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                remoteActionCompatParcelizer.write(phoneNumber, str3);
            } else {
                remoteActionCompatParcelizer.write(phoneNumber, str3);
                throw null;
            }
        }
        dismiss();
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(applyLegacyRendererOverrides applylegacyrendereroverrides) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 35;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        write(applylegacyrendereroverrides);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup read(applyLegacyRendererOverrides applylegacyrendereroverrides, View view) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 61;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = AnnotatedField.Serialization.read();
            int i4 = AnnotatedField.Serialization.read();
            int i5 = AnnotatedField.Serialization.read();
            return (getShowPopup) AudioAttributesCompatParcelizer(i4, AnnotatedField.Serialization.read(), new Object[]{applylegacyrendereroverrides, view}, i3, i5, -1848012513, 1848012513);
        }
        int i6 = AnnotatedField.Serialization.read();
        int i7 = AnnotatedField.Serialization.read();
        int i8 = AnnotatedField.Serialization.read();
        throw null;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(applyLegacyRendererOverrides applylegacyrendereroverrides) {
        int i = AnnotatedField.Serialization.read();
        int i2 = AnnotatedField.Serialization.read();
        int i3 = AnnotatedField.Serialization.read();
        return (getShowPopup) AudioAttributesCompatParcelizer(i2, AnnotatedField.Serialization.read(), new Object[]{applylegacyrendereroverrides}, i, i3, -1809485139, 1809485140);
    }

    private static final getShowPopup RemoteActionCompatParcelizer(applyLegacyRendererOverrides applylegacyrendereroverrides, View view) {
        int i = AnnotatedField.Serialization.read();
        int i2 = AnnotatedField.Serialization.read();
        int i3 = AnnotatedField.Serialization.read();
        return (getShowPopup) AudioAttributesCompatParcelizer(i2, AnnotatedField.Serialization.read(), new Object[]{applylegacyrendereroverrides, view}, i, i3, -1848012513, 1848012513);
    }
}
