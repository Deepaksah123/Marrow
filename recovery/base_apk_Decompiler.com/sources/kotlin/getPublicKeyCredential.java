package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.onUpstreamDiscarded;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0015\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001d"}, d2 = {"Lo/getPublicKeyCredential;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onStart", "", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "IconCompatParcelizer", "write", "Lo/SegmentBaseSegmentList;", "AudioAttributesCompatParcelizer", "Lo/SegmentBaseSegmentList;", "()Lo/SegmentBaseSegmentList;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getPublicKeyCredential extends argCount {
    private static char AudioAttributesImplApi26Parcelizer;
    private static char AudioAttributesImplBaseParcelizer;
    private static char MediaBrowserCompatCustomActionResultReceiver;
    private static char MediaBrowserCompatItemReceiver;
    private static int RatingCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private SegmentBaseSegmentList AudioAttributesCompatParcelizer;
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String write;
    private static final byte[] $$c = {70, -23, 8, 77};
    private static final int $$f = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {30, 6, -112, TarConstants.LF_FIFO, 58, -44, -40, 12, -26, -8, -5, 39, -58, 14, -9, -18, -11, 4, -13, -6, 26, -27, -22, -7, 4, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$e = 202;
    private static final byte[] $$a = {112, -40, -93, -59, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 187;
    private static int MediaDescriptionCompat = 1;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r7, int r8, byte r9) {
        /*
            byte[] r0 = kotlin.getPublicKeyCredential.$$c
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 122
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r8]
        L2a:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPublicKeyCredential.$$g(int, int, byte):java.lang.String");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i4));
        int i10 = ~(i6 | i4);
        int i11 = ~i4;
        int i12 = (~(i5 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i6 + i4 + i3 + ((-1570926368) * i) + ((-1409401439) * i2);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i6) - 657981440) + (821186744 * i4) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i3) + (1124073472 * i) + ((-332922880) * i2) + ((-1182662656) * i15);
        int i17 = (i6 * 1410161459) + 847508490 + (i4 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i3 * 1410159841) + (i * 1126552800) + (i2 * (-1948647807)) + (i15 * (-1287520256));
        return i16 + ((i17 * i17) * (-1577189376)) != 1 ? read(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 10
            int r0 = 44 - r7
            int r8 = r8 * 12
            int r8 = r8 + 65
            byte[] r1 = kotlin.getPublicKeyCredential.$$a
            int r6 = 80 - r6
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPublicKeyCredential.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 5
            int r0 = 28 - r6
            int r7 = r7 * 29
            int r7 = 111 - r7
            byte[] r1 = kotlin.getPublicKeyCredential.$$d
            int r8 = r8 * 22
            int r8 = 25 - r8
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L32
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-7)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPublicKeyCredential.c(byte, short, int, java.lang.Object[]):void");
    }

    private final SegmentBaseSegmentList RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 117;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        SegmentBaseSegmentList segmentBaseSegmentList = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(segmentBaseSegmentList);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        int i5 = AudioAttributesImplApi21Parcelizer + 37;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 != 0) {
            return segmentBaseSegmentList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: o.getPublicKeyCredential$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/marrow2/ui/dialogs/InfoDialogFragment$Companion;", "", "<init>", "()V", "TITLE_KEY", "", "MESSAGE_KEY", "BUTTON_TEXT_KEY", "ALLOW_BACK_PRESS_KEY", "REQUEST_KEY", "BUTTON_PRESS", "newInstance", "Lcom/marrow2/ui/dialogs/InfoDialogFragment;", "title", "message", "buttonText", "allowBackPress", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getPublicKeyCredential IconCompatParcelizer(String str, String str2, String str3, boolean z) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            getPublicKeyCredential getpublickeycredential = new getPublicKeyCredential();
            Bundle bundle = new Bundle();
            bundle.putString("titleKey", str);
            bundle.putString("messageKey", str2);
            bundle.putString("button_text_key", str3);
            bundle.putBoolean("back_press_allow_key", z);
            getpublickeycredential.setArguments(bundle);
            return getpublickeycredential;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i5] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i6 = 58224;
            int i7 = i5;
            while (i7 < 16) {
                int i8 = $10 + 121;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 1193402106669854891L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplApi26Parcelizer);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", i5, i5);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1504;
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20;
                        byte b = (byte) i5;
                        byte b2 = b;
                        String str$$g = $$g(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(capsMode, packedPositionGroup, i12, 1322448859, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) MediaBrowserCompatItemReceiver) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesImplBaseParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1504, TextUtils.getTrimmedLength("") + 21, 1322448859, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i13 = $10 + 7;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                i2 = 2;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.alpha(0), TextUtils.lastIndexOf("", '0') + 9017, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) throws Throwable {
        Object[] objArr2;
        char c;
        getPublicKeyCredential getpublickeycredential = (getPublicKeyCredential) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cAlpha = (char) (Color.alpha(0) + 13183);
            int iArgb = Color.argb(0, 0, 0, 0) + 1649;
            int iIndexOf = TextUtils.indexOf("", "") + 26;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) 76, bArr[5], bArr[17], objArr3);
            objRemoteActionCompatParcelizer = startForeground.read(cAlpha, iArgb, iIndexOf, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 13183);
                int longPressTimeout = 1649 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr4 = new Object[1];
                a(bArr2[39], bArr2[17], bArr2[5], objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(cResolveSize, longPressTimeout, iMakeMeasureSpec, -1033747278, false, (String) objArr4[0], null);
            }
            objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0') + 17, new char[]{10543, 6356, 59802, 19078, 38053, 1258, 62883, 43145, 8261, 38177, 60144, 19457, 56738, 30030, 27644, 34324}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(ExpandableListView.getPackedPositionType(0L) + 16, new char[]{61836, 16583, 46735, 33754, 34397, 29158, 46412, 61436, 45083, 22599, 39922, 34336, 17345, 51192, 12387, 40897}, objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, getpublickeycredential)).intValue()), 0, -1657005519};
                byte b = (byte) 1;
                byte b2 = (byte) (b - 1);
                Object[] objArr8 = new Object[1];
                c(b, b2, (byte) (b2 + 1), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 + 1);
                Object[] objArr9 = new Object[1];
                c(b3, b4, (byte) (b4 - 1), objArr9);
                objArr2 = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char packedPositionGroup = (char) (13183 - ExpandableListView.getPackedPositionGroup(0L));
                    int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 26;
                    byte[] bArr3 = $$a;
                    Object[] objArr10 = new Object[1];
                    a(bArr3[39], bArr3[17], bArr3[5], objArr10);
                    objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionGroup, keyRepeatTimeout, iArgb2, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr2);
                try {
                    Object[] objArr11 = new Object[1];
                    b(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{62883, 43145, 26532, 37657, 63152, 25256, 48873, 9450, 21913, 796, 60804, 54497, 44585, 57916, 56292, 11567, 59892, 27908, 26144, 23571, 15052, 15020}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(MotionEvent.axisFromString("") + 16, new char[]{33685, 59930, 26906, 16691, 7177, 56655, 4716, 57970, 9887, 15827, 12907, 61796, 7503, 33144, 2589, 59139}, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 13183);
                        int iAlpha = 1649 - Color.alpha(0);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 26;
                        byte b5 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b5, r13[17], b5, objArr13);
                        objRemoteActionCompatParcelizer4 = startForeground.read(size, iAlpha, touchSlop, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 13183);
                        int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a((byte) 76, bArr4[5], bArr4[17], objArr14);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cIndexOf, iLastIndexOf, packedPositionType, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    c = 3;
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
        int i2 = ((int[]) objArr2[c])[0];
        int i3 = ((int[]) objArr2[2])[0];
        if (i3 != i2) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (View.MeasureSpec.getMode(0) + 4535), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i4 = AudioAttributesImplApi21Parcelizer + 97;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr15 = {-1831847571, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 6030 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24);
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    Object[] objArr16 = new Object[1];
                    c(b6, b7, (byte) (b7 - 1), objArr16);
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
        Bundle arguments = getpublickeycredential.getArguments();
        if (arguments != null) {
            String string = arguments.getString("titleKey");
            if (string == null) {
                int i6 = MediaBrowserCompatMediaItem + 125;
                AudioAttributesImplApi21Parcelizer = i6 % 128;
                int i7 = i6 % 2;
                string = "";
            }
            getpublickeycredential.read = string;
            String string2 = arguments.getString("messageKey");
            if (string2 == null) {
                string2 = "";
            }
            getpublickeycredential.IconCompatParcelizer = string2;
            String string3 = arguments.getString("button_text_key");
            getpublickeycredential.write = string3 != null ? string3 : "";
            getpublickeycredential.setCancelable(arguments.getBoolean("back_press_allow_key"));
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 15;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.AudioAttributesCompatParcelizer = SegmentBaseSegmentList.RemoteActionCompatParcelizer(p0, p1);
            ScrollView scrollViewIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
            return scrollViewIconCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = SegmentBaseSegmentList.RemoteActionCompatParcelizer(p0, p1);
        ScrollView scrollViewIconCompatParcelizer2 = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer2, "");
        int i3 = 27 / 0;
        return scrollViewIconCompatParcelizer2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        final getPublicKeyCredential getpublickeycredential = (getPublicKeyCredential) objArr[0];
        View view = (View) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, bundle);
        SegmentBaseSegmentList segmentBaseSegmentListRemoteActionCompatParcelizer = getpublickeycredential.RemoteActionCompatParcelizer();
        String str = getpublickeycredential.read;
        Object obj = null;
        if (str == null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 5;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str = null;
        }
        if (str.length() > 0) {
            int i4 = AudioAttributesImplApi21Parcelizer + 63;
            MediaBrowserCompatMediaItem = i4 % 128;
            if (i4 % 2 == 0) {
                TextView textView = segmentBaseSegmentListRemoteActionCompatParcelizer.IconCompatParcelizer;
                String str2 = getpublickeycredential.read;
                throw null;
            }
            TextView textView2 = segmentBaseSegmentListRemoteActionCompatParcelizer.IconCompatParcelizer;
            String str3 = getpublickeycredential.read;
            if (str3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                str3 = null;
            }
            textView2.setText(str3);
            TextView textView3 = segmentBaseSegmentListRemoteActionCompatParcelizer.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView3);
        } else {
            TextView textView4 = segmentBaseSegmentListRemoteActionCompatParcelizer.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView4);
            int i5 = MediaBrowserCompatMediaItem + 101;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
        String str4 = getpublickeycredential.IconCompatParcelizer;
        if (str4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i7 = AudioAttributesImplApi21Parcelizer + 111;
            MediaBrowserCompatMediaItem = i7 % 128;
            int i8 = i7 % 2;
            str4 = null;
        }
        if (str4.length() > 0) {
            int i9 = MediaBrowserCompatMediaItem + 105;
            AudioAttributesImplApi21Parcelizer = i9 % 128;
            if (i9 % 2 != 0) {
                TextView textView5 = segmentBaseSegmentListRemoteActionCompatParcelizer.write;
                String str5 = getpublickeycredential.IconCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            TextView textView6 = segmentBaseSegmentListRemoteActionCompatParcelizer.write;
            String str6 = getpublickeycredential.IconCompatParcelizer;
            if (str6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                int i10 = MediaBrowserCompatMediaItem + 49;
                AudioAttributesImplApi21Parcelizer = i10 % 128;
                int i11 = i10 % 2;
                str6 = null;
            }
            textView6.setText(str6);
            TextView textView7 = segmentBaseSegmentListRemoteActionCompatParcelizer.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView7, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView7);
        } else {
            TextView textView8 = segmentBaseSegmentListRemoteActionCompatParcelizer.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView8, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView8);
        }
        String str7 = getpublickeycredential.write;
        if (str7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str7 = null;
        }
        if (str7.length() > 0) {
            int i12 = MediaBrowserCompatMediaItem + 35;
            AudioAttributesImplApi21Parcelizer = i12 % 128;
            if (i12 % 2 != 0) {
                Button button = segmentBaseSegmentListRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                String str8 = getpublickeycredential.write;
                obj.hashCode();
                throw null;
            }
            Button button2 = segmentBaseSegmentListRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            String str9 = getpublickeycredential.write;
            if (str9 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                str9 = null;
            }
            button2.setText(str9);
            Button button3 = segmentBaseSegmentListRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button3, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(button3);
        } else {
            Button button4 = segmentBaseSegmentListRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button4, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(button4);
        }
        segmentBaseSegmentListRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getPassword
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getPublicKeyCredential.IconCompatParcelizer(this.read);
            }
        });
        return null;
    }

    private static final void read(getPublicKeyCredential getpublickeycredential) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 115;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        withAlwaysAsId.read(getpublickeycredential, "dialog_key", _getIndexResolver.write(setAction.write("button_press", Boolean.TRUE)));
        getpublickeycredential.dismiss();
        int i4 = AudioAttributesImplApi21Parcelizer + 115;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroyView();
            this.AudioAttributesCompatParcelizer = null;
            int i3 = 87 / 0;
        } else {
            super.onDestroyView();
            this.AudioAttributesCompatParcelizer = null;
        }
        int i4 = MediaBrowserCompatMediaItem + 71;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 109;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            int i6 = AudioAttributesImplApi21Parcelizer + 33;
            MediaBrowserCompatMediaItem = i6 % 128;
            if (i6 % 2 == 0) {
                Context contextRequireContext = requireContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                i = DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext, 1703);
                i2 = 102;
            } else {
                Context contextRequireContext2 = requireContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                i = DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext2, 320);
                i2 = -2;
            }
            window.setLayout(i, i2);
        }
        final int i7 = (int) (((double) getResources().getDisplayMetrics().heightPixels) * 0.8d);
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.post(new Runnable() { // from class: o.getPhoneNumber
            @Override // java.lang.Runnable
            public final void run() {
                getPublicKeyCredential.read(this.RemoteActionCompatParcelizer, i7);
            }
        });
    }

    private static final void AudioAttributesCompatParcelizer(getPublicKeyCredential getpublickeycredential, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 69;
        MediaBrowserCompatMediaItem = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getHeight() <= i && getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getMeasuredHeight() <= i) {
                int i4 = MediaBrowserCompatMediaItem + 31;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            int paddingLeft = getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getPaddingLeft();
            int paddingTop = getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getPaddingTop();
            int paddingRight = getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getPaddingRight();
            int paddingBottom = getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getLayoutParams();
            layoutParams.height = i;
            getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setLayoutParams(layoutParams);
            getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            return;
        }
        getpublickeycredential.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.getHeight();
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void read(getPublicKeyCredential getpublickeycredential, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 125;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        AudioAttributesCompatParcelizer(getpublickeycredential, i);
        int i5 = MediaBrowserCompatMediaItem + 41;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IconCompatParcelizer(getPublicKeyCredential getpublickeycredential) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 57;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        read(getpublickeycredential);
        int i4 = MediaBrowserCompatMediaItem + 83;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        RatingCompat = 0;
        write();
        INSTANCE = new Companion(null);
        int i = MediaDescriptionCompat + 25;
        RatingCompat = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) {
        int iIconCompatParcelizer = onUpstreamDiscarded.RemoteActionCompatParcelizer.IconCompatParcelizer();
        RemoteActionCompatParcelizer(new Object[]{this, p0}, onUpstreamDiscarded.RemoteActionCompatParcelizer.IconCompatParcelizer(), onUpstreamDiscarded.RemoteActionCompatParcelizer.IconCompatParcelizer(), onUpstreamDiscarded.RemoteActionCompatParcelizer.IconCompatParcelizer(), -1597768778, iIconCompatParcelizer, 1597768779);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        int iIconCompatParcelizer = onUpstreamDiscarded.RemoteActionCompatParcelizer.IconCompatParcelizer();
        RemoteActionCompatParcelizer(new Object[]{this, p0, p1}, onUpstreamDiscarded.RemoteActionCompatParcelizer.IconCompatParcelizer(), onUpstreamDiscarded.RemoteActionCompatParcelizer.IconCompatParcelizer(), onUpstreamDiscarded.RemoteActionCompatParcelizer.IconCompatParcelizer(), 1417531795, iIconCompatParcelizer, -1417531795);
    }

    static void write() {
        MediaBrowserCompatItemReceiver = (char) 31615;
        AudioAttributesImplBaseParcelizer = (char) 64130;
        MediaBrowserCompatCustomActionResultReceiver = (char) 52517;
        AudioAttributesImplApi26Parcelizer = (char) 52238;
    }
}
