package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010!\u001a\u00020#8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010%"}, d2 = {"Lo/getAutofillClient;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "AudioAttributesCompatParcelizer", "onDestroyView", "", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "write", "", "I", "read", "Ljava/lang/Integer;", "RemoteActionCompatParcelizer", "", "Z", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/getSegmentDurationUs;", "Lo/getSegmentDurationUs;", "()Lo/getSegmentDurationUs;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAutofillClient extends argCount {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char MediaBrowserCompatMediaItem;
    private static long MediaBrowserCompatSearchResultReceiver;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static int MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getSegmentDurationUs AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Integer RemoteActionCompatParcelizer;
    private static final byte[] $$c = {7, -56, -121, 7};
    private static final int $$f = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_CHR, -90, -19, 114, -61, 61, 2, 19, -44, TarConstants.LF_DIR, 1, -13, 23, -7, 10, 3, -29, 32, 7, 4, 1, 14, 30, 16, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17};
    private static final int $$e = 17;
    private static final byte[] $$a = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 23, -13, 96, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 18;
    private static int onCustomAction = 1;
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int read = -1;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer = true;
    private String AudioAttributesImplApi26Parcelizer = SmsRetrieverStatusCodes.AudioAttributesCompatParcelizer.getWrite();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r5, int r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r0 = kotlin.getAutofillClient.$$c
            int r6 = r6 * 3
            int r6 = 103 - r6
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r5
            r6 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAutofillClient.$$g(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 10
            int r7 = r7 + 34
            int r8 = r8 * 12
            int r8 = 77 - r8
            byte[] r0 = kotlin.getAutofillClient.$$a
            int r9 = 79 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r8 = r8 + r9
            int r8 = r8 + (-1)
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAutofillClient.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 111 - r6
            int r0 = r5 + 19
            byte[] r1 = kotlin.getAutofillClient.$$d
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r5 = r5 + 18
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r5
            r4 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            r4 = r1[r7]
            int r3 = r3 + 1
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-4)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAutofillClient.c(short, byte, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = (~(i7 | i5)) | i3;
        int i9 = ~i5;
        int i10 = ~i3;
        int i11 = (~(i9 | i10)) | i4;
        int i12 = (~(i3 | i9 | i4)) | (~(i7 | i9 | i10)) | (~(i10 | i5 | i4));
        int i13 = i5 + i4 + i + ((-104759182) * i2) + ((-453318476) * i6);
        int i14 = i13 * i13;
        int i15 = (i5 * 1504131295) + 1805123584 + (1504131295 * i4) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i) + (711983104 * i2) + (1180696576 * i6) + (1022754816 * i14);
        int i16 = ((i5 * (-1431886989)) - 1507491630) + (i4 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i * (-1431886867)) + (i2 * 722567050) + (i6 * (-1618605404)) + (i14 * 297664512);
        return i15 + ((i16 * i16) * (-277217280)) != 1 ? AudioAttributesCompatParcelizer(objArr) : write(objArr);
    }

    private final getSegmentDurationUs RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 111;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        getSegmentDurationUs getsegmentdurationus = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(getsegmentdurationus);
        int i4 = MediaMetadataCompat + 93;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return getsegmentdurationus;
        }
        throw null;
    }

    private static void b(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 95;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22747, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 31369), 2721 - TextUtils.indexOf("", "", 0), 38 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Drawable.resolveOpacity(0, 0), 15712 - TextUtils.lastIndexOf("", '0'), TextUtils.getOffsetBefore("", 0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - ExpandableListView.getPackedPositionGroup(0L)), (Process.myPid() >> 22) + 6122, Color.green(0) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (MediaBrowserCompatSearchResultReceiver ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) MediaDescriptionCompat) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) MediaBrowserCompatMediaItem) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i6 = $11 + 1;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 11;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 76 / 0;
            objArr[0] = str;
        }
    }

    /* JADX INFO: renamed from: o.getAutofillClient$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/marrow2/ui/dialogs/confirmation/ConfirmationDialogFragment$Companion;", "", "<init>", "()V", "POSITIVE_KEY_PRESS", "", "NEGATIVE_KEY_PRESS", "DRAWABLE_DEFAULT_VALUE", "", "newInstance", "Lcom/marrow2/ui/dialogs/confirmation/ConfirmationDialogFragment;", "title", "message", "positiveText", "negativeText", "imageDrawable", "requestKey", "Lcom/marrow2/ui/dialogs/confirmation/ConfirmationDialogRequestKey;", "allowBackPress", "", "autoDismissOnButtonPress", "maxWidthDp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/marrow2/ui/dialogs/confirmation/ConfirmationDialogRequestKey;ZZLjava/lang/Integer;)Lcom/marrow2/ui/dialogs/confirmation/ConfirmationDialogFragment;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ getAutofillClient AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4, int i, SmsRetrieverStatusCodes smsRetrieverStatusCodes, boolean z, boolean z2, Integer num, int i2) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                str2 = "";
            }
            if ((i2 & 4) != 0) {
                str3 = "";
            }
            if ((i2 & 8) != 0) {
                str4 = "";
            }
            if ((i2 & 16) != 0) {
                i = 0;
            }
            if ((i2 & 32) != 0) {
                smsRetrieverStatusCodes = SmsRetrieverStatusCodes.AudioAttributesCompatParcelizer;
            }
            if ((i2 & 64) != 0) {
                z = true;
            }
            if ((i2 & 128) != 0) {
                z2 = true;
            }
            if ((i2 & 256) != 0) {
                num = null;
            }
            return write(str, str2, str3, str4, i, smsRetrieverStatusCodes, z, z2, num);
        }

        @getMagicModuleMeta
        private static getAutofillClient write(String str, String str2, String str3, String str4, int i, SmsRetrieverStatusCodes smsRetrieverStatusCodes, boolean z, boolean z2, Integer num) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(smsRetrieverStatusCodes, "");
            getAutofillClient getautofillclient = new getAutofillClient();
            Bundle bundle = new Bundle();
            bundle.putString("titleKey", str);
            bundle.putString("messageKey", str2);
            bundle.putString("positive_text_key", str3);
            bundle.putString("negative_text_key", str4);
            bundle.putBoolean("back_press_allow_key", z);
            bundle.putString("request_key", smsRetrieverStatusCodes.getWrite());
            bundle.putInt("image_drawable", i);
            bundle.putBoolean("auto_dismiss_on_button_click", z2);
            if (num != null) {
                bundle.putInt("max_width_dp", num.intValue());
            }
            getautofillclient.setArguments(bundle);
            return getautofillclient;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public final getAutofillClient AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4, int i, SmsRetrieverStatusCodes smsRetrieverStatusCodes, boolean z, boolean z2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(smsRetrieverStatusCodes, "");
            return AudioAttributesCompatParcelizer(str, str2, str3, str4, 0, smsRetrieverStatusCodes, true, true, null, 256);
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0'));
            int iRed = 1649 - Color.red(0);
            int scrollBarSize = 26 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte[] bArr = $$a;
            byte b = bArr[53];
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b, b2, (byte) (b2 | TarConstants.LF_GNUTYPE_LONGNAME), objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, iRed, scrollBarSize, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) == -1) {
            Object[] objArr3 = new Object[1];
            b(Drawable.resolveOpacity(0, 0), new char[]{0, 0, 0, 0}, new char[]{55299, 58595, 5526, 20619, 35264, 52432, 64476, 36176, 20368, 6526, 1900, 999, 19441, 4779, 11429, 1382}, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31705), new char[]{44479, 54267, 55794, 27259}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(Drawable.resolveOpacity(0, 0), new char[]{0, 0, 0, 0}, new char[]{61614, 1465, 33127, 2833, 17430, 52445, 62994, 41281, 6921, 29566, 9959, 36615, 59255, 2621, 21468, 13127}, (char) (1201 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), new char[]{30485, 65265, 45548, 17668}, objArr4);
            int iIntValue = ((Integer) cls.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
            int i2 = MediaMetadataCompat + 55;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr5 = {Integer.valueOf(iIntValue), 0, 437917618};
                byte b3 = (byte) ($$d[10] - 1);
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                Object[] objArr7 = new Object[1];
                c(r1[10], r1[47], (byte) ($$e + 1), objArr7);
                objArr = (Object[]) cls2.getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr5);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cBlue = (char) (13183 - Color.blue(0));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1649;
                    int iRgb = Color.rgb(0, 0, 0) + 16777242;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[5];
                    byte b6 = bArr2[53];
                    byte b7 = (byte) (-bArr2[39]);
                    Object[] objArr8 = new Object[1];
                    a(b5, b6, b7, objArr8);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cBlue, maximumFlingVelocity, iRgb, -1033747278, false, (String) objArr8[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer2).set(null, objArr);
                try {
                    Object[] objArr9 = new Object[1];
                    b(KeyEvent.getDeadChar(0, 0), new char[]{0, 0, 0, 0}, new char[]{28973, 48408, 1377, 9394, 23565, 35127, 638, 4926, 24417, 7092, 43741, 60458, 49783, 5480, 57378, 2161, 5063, 63068, 11024, 40303, 57946, 47521}, (char) View.resolveSize(0, 0), new char[]{44175, 11056, 10590, 36830}, objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1267579436, new char[]{0, 0, 0, 0}, new char[]{10890, 51961, 53066, 26232, 16797, 54056, 42589, 58976, 40069, 18851, 25039, 1073, 25431, 16415, 57946}, (char) (Color.green(0) + 50855), new char[]{54531, 29253, 42932, 25798}, objArr10);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 13183);
                        int i4 = 1650 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i5 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                        byte b8 = $$a[5];
                        Object[] objArr11 = new Object[1];
                        a(b8, r14[53], b8, objArr11);
                        objRemoteActionCompatParcelizer3 = startForeground.read(trimmedLength, i4, i5, 54351865, false, (String) objArr11[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer3).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c = (char) (13183 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1650;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
                        byte[] bArr3 = $$a;
                        byte b9 = bArr3[53];
                        byte b10 = bArr3[5];
                        Object[] objArr12 = new Object[1];
                        a(b9, b10, (byte) (b10 | TarConstants.LF_GNUTYPE_LONGNAME), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(c, packedPositionChild, iKeyCodeFromString, -133433128, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf2);
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
        } else {
            int i6 = MediaMetadataCompat + 65;
            RatingCompat = i6 % 128;
            if (i6 % 2 == 0) {
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 13183);
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 1649;
                    int keyRepeatDelay = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr4 = $$a;
                    byte b11 = bArr4[5];
                    byte b12 = bArr4[53];
                    byte b13 = (byte) (-bArr4[39]);
                    Object[] objArr13 = new Object[1];
                    a(b11, b12, b13, objArr13);
                    objRemoteActionCompatParcelizer5 = startForeground.read(threadPriority, iKeyCodeFromString2, keyRepeatDelay, -1033747278, false, (String) objArr13[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
                int i7 = 2 / 0;
            } else {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cLastIndexOf2 = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
                    int i8 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                    byte[] bArr5 = $$a;
                    byte b14 = bArr5[5];
                    byte b15 = bArr5[53];
                    byte b16 = (byte) (-bArr5[39]);
                    Object[] objArr14 = new Object[1];
                    a(b14, b15, b16, objArr14);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cLastIndexOf2, i8, scrollDefaultDelay, -1033747278, false, (String) objArr14[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer6).get(null);
            }
        }
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0)), 6054 - Gravity.getAbsoluteGravity(0, 0), 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                try {
                    Object[] objArr15 = {-753476628, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 24 - View.combineMeasuredStates(0, 0));
                    byte[] bArr6 = $$d;
                    Object[] objArr16 = new Object[1];
                    c(bArr6[44], (byte) (-bArr6[16]), (byte) (bArr6[47] - 1), objArr16);
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
            String string = arguments.getString("titleKey");
            if (string == null) {
                string = "";
            }
            this.IconCompatParcelizer = string;
            String string2 = arguments.getString("messageKey");
            if (string2 == null) {
                int i11 = RatingCompat + 77;
                MediaMetadataCompat = i11 % 128;
                int i12 = i11 % 2;
                string2 = "";
            }
            this.write = string2;
            String string3 = arguments.getString("positive_text_key");
            if (string3 == null) {
                string3 = "";
            }
            this.MediaBrowserCompatItemReceiver = string3;
            String string4 = arguments.getString("negative_text_key");
            this.MediaBrowserCompatCustomActionResultReceiver = string4 != null ? string4 : "";
            this.read = arguments.getInt("image_drawable");
            this.RemoteActionCompatParcelizer = arguments.containsKey("max_width_dp") ? Integer.valueOf(arguments.getInt("max_width_dp")) : null;
            setCancelable(arguments.getBoolean("back_press_allow_key"));
            String string5 = arguments.getString("request_key");
            if (string5 == null) {
                string5 = SmsRetrieverStatusCodes.AudioAttributesCompatParcelizer.getWrite();
            }
            this.AudioAttributesImplApi26Parcelizer = string5;
            this.AudioAttributesCompatParcelizer = arguments.getBoolean("auto_dismiss_on_button_click", true);
        }
        int i13 = RatingCompat + 21;
        MediaMetadataCompat = i13 % 128;
        int i14 = i13 % 2;
    }

    private static final void RemoteActionCompatParcelizer(getAutofillClient getautofillclient) {
        int i = 2 % 2;
        withAlwaysAsId.read(getautofillclient, getautofillclient.AudioAttributesImplApi26Parcelizer, _getIndexResolver.write(setAction.write("positive_key_press", Boolean.TRUE)));
        if (getautofillclient.AudioAttributesCompatParcelizer) {
            int i2 = MediaMetadataCompat + 77;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            getautofillclient.dismiss();
            int i4 = MediaMetadataCompat + 67;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = RatingCompat + 25;
        MediaMetadataCompat = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getAutofillClient getautofillclient;
        String str;
        Bundle bundleWrite;
        getAutofillClient getautofillclient2 = (getAutofillClient) objArr[0];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            getautofillclient = getautofillclient2;
            str = getautofillclient2.AudioAttributesImplApi26Parcelizer;
            Pair[] pairArr = new Pair[0];
            pairArr[1] = setAction.write("negative_key_press", Boolean.TRUE);
            bundleWrite = _getIndexResolver.write(pairArr);
        } else {
            getautofillclient = getautofillclient2;
            str = getautofillclient2.AudioAttributesImplApi26Parcelizer;
            bundleWrite = _getIndexResolver.write(setAction.write("negative_key_press", Boolean.TRUE));
        }
        withAlwaysAsId.read(getautofillclient, str, bundleWrite);
        getautofillclient2.dismiss();
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        View decorView;
        int i = 2 % 2;
        int i2 = RatingCompat + 57;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesImplBaseParcelizer = getSegmentDurationUs.IconCompatParcelizer(p0, p1);
        Dialog dialog = getDialog();
        if (dialog != null) {
            int i4 = MediaMetadataCompat + 63;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            int i6 = RatingCompat + 113;
            MediaMetadataCompat = i6 % 128;
            int i7 = i6 % 2;
            Window window2 = dialog2.getWindow();
            if (window2 != null && (decorView = window2.getDecorView()) != null) {
                int i8 = MediaMetadataCompat + 49;
                RatingCompat = i8 % 128;
                if (i8 % 2 == 0) {
                    decorView.setElevation(2.0f);
                } else {
                    decorView.setElevation(BitmapDescriptorFactory.HUE_RED);
                }
            }
        }
        Button button = RemoteActionCompatParcelizer().IconCompatParcelizer;
        String str = this.MediaBrowserCompatItemReceiver;
        String str2 = null;
        if (str == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str = null;
        }
        button.setText(str);
        String str3 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (str3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str3 = null;
        }
        if (str3.length() == 0) {
            TextView textView = RemoteActionCompatParcelizer().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        } else {
            TextView textView2 = RemoteActionCompatParcelizer().read;
            String str4 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (str4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                str4 = null;
            }
            textView2.setText(str4);
        }
        String str5 = this.IconCompatParcelizer;
        if (str5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str5 = null;
        }
        if (str5.length() > 0) {
            TextView textView3 = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
            String str6 = this.IconCompatParcelizer;
            if (str6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                str6 = null;
            }
            textView3.setText(str6);
            TextView textView4 = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView4);
        } else {
            TextView textView5 = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView5);
            int i9 = MediaMetadataCompat + 97;
            RatingCompat = i9 % 128;
            int i10 = i9 % 2;
        }
        if (this.read != 0) {
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer, this.read);
        } else {
            ImageView imageView = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView);
        }
        String str7 = this.write;
        if (str7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            str7 = null;
        }
        List<String> listWrite = TestGroupLSModel.write(str7, new String[]{"<a>", "</a>"}, 0, 6);
        TextView textView6 = RemoteActionCompatParcelizer().write;
        String str8 = this.write;
        if (str8 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            str2 = str8;
        }
        textView6.setVisibility(str2.length() == 0 ? 8 : 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer().write, R.attr.onSurfaceBgLinks);
        for (String str9 : listWrite) {
            if (_deserializeCustom.AudioAttributesCompatParcelizer.matcher(str9).matches()) {
                spannableStringBuilder.append(str9, new ForegroundColorSpan(iRemoteActionCompatParcelizer), 33);
            } else {
                spannableStringBuilder.append((CharSequence) str9);
            }
        }
        RemoteActionCompatParcelizer().write.setText(spannableStringBuilder);
        RemoteActionCompatParcelizer().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.SmsCodeRetriever
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.write};
                getAutofillClient.write(Ac4ExtractorExternalSyntheticLambda0.write(), Ac4ExtractorExternalSyntheticLambda0.write(), Ac4ExtractorExternalSyntheticLambda0.write(), 1991257479, -1991257479, Ac4ExtractorExternalSyntheticLambda0.write(), objArr);
            }
        });
        RemoteActionCompatParcelizer().read.setOnClickListener(new View.OnClickListener() { // from class: o.SmsRetrieverApi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getAutofillClient.read(this.IconCompatParcelizer);
            }
        });
        ScrollView scrollViewAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewAudioAttributesCompatParcelizer, "");
        return scrollViewAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 123;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
            AudioAttributesCompatParcelizer();
            int i3 = 49 / 0;
        } else {
            super.onStart();
            AudioAttributesCompatParcelizer();
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        Window window;
        int i;
        int i2 = 2 % 2;
        Integer num = this.RemoteActionCompatParcelizer;
        if (num != null) {
            if (num.intValue() <= 0) {
                int i3 = RatingCompat;
                int i4 = i3 + 51;
                MediaMetadataCompat = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 47;
                MediaMetadataCompat = i5 % 128;
                int i6 = i5 % 2;
                num = null;
            }
            if (num != null) {
                int i7 = RatingCompat + 33;
                MediaMetadataCompat = i7 % 128;
                int i8 = i7 % 2;
                int iIntValue = num.intValue();
                Dialog dialog = getDialog();
                if (dialog == null || (window = dialog.getWindow()) == null) {
                    return;
                }
                int i9 = RatingCompat + 37;
                MediaMetadataCompat = i9 % 128;
                if (i9 % 2 != 0) {
                    Context contextRequireContext = requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                    window.setLayout(Math.min(DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext, iIntValue), getResources().getDisplayMetrics().widthPixels), 93);
                    i = 70;
                } else {
                    Context contextRequireContext2 = requireContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                    window.setLayout(Math.min(DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext2, iIntValue), getResources().getDisplayMetrics().widthPixels), -2);
                    i = 17;
                }
                window.setGravity(i);
            }
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroyView();
            this.AudioAttributesImplBaseParcelizer = null;
            int i3 = RatingCompat + 107;
            MediaMetadataCompat = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onDestroyView();
        this.AudioAttributesImplBaseParcelizer = null;
        throw null;
    }

    public static /* synthetic */ void IconCompatParcelizer(getAutofillClient getautofillclient) {
        int iWrite = Ac4ExtractorExternalSyntheticLambda0.write();
        write(Ac4ExtractorExternalSyntheticLambda0.write(), Ac4ExtractorExternalSyntheticLambda0.write(), iWrite, 1991257479, -1991257479, Ac4ExtractorExternalSyntheticLambda0.write(), new Object[]{getautofillclient});
    }

    public static /* synthetic */ void read(getAutofillClient getautofillclient) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 17;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {getautofillclient};
        int iWrite = Ac4ExtractorExternalSyntheticLambda0.write();
        if (i3 == 0) {
            write(Ac4ExtractorExternalSyntheticLambda0.write(), Ac4ExtractorExternalSyntheticLambda0.write(), iWrite, -1897847589, 1897847590, Ac4ExtractorExternalSyntheticLambda0.write(), objArr);
            throw null;
        }
        write(Ac4ExtractorExternalSyntheticLambda0.write(), Ac4ExtractorExternalSyntheticLambda0.write(), iWrite, -1897847589, 1897847590, Ac4ExtractorExternalSyntheticLambda0.write(), objArr);
        int i4 = RatingCompat + 117;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
        IconCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = onCustomAction + 67;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final getAutofillClient IconCompatParcelizer(String str, String str2, String str3, String str4, SmsRetrieverStatusCodes smsRetrieverStatusCodes) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 121;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = INSTANCE.AudioAttributesCompatParcelizer(str, str2, str3, str4, 0, smsRetrieverStatusCodes, true, true);
        int i4 = MediaMetadataCompat + 33;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return getautofillclientAudioAttributesCompatParcelizer;
    }

    private static final void write(getAutofillClient getautofillclient) {
        int iWrite = Ac4ExtractorExternalSyntheticLambda0.write();
        write(Ac4ExtractorExternalSyntheticLambda0.write(), Ac4ExtractorExternalSyntheticLambda0.write(), iWrite, -1897847589, 1897847590, Ac4ExtractorExternalSyntheticLambda0.write(), new Object[]{getautofillclient});
    }

    static void IconCompatParcelizer() {
        MediaBrowserCompatSearchResultReceiver = -3498762522182953692L;
        MediaDescriptionCompat = -136981212;
        MediaBrowserCompatMediaItem = (char) 34384;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        getAutofillClient getautofillclient = (getAutofillClient) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(getautofillclient);
        int i4 = MediaMetadataCompat + 125;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
