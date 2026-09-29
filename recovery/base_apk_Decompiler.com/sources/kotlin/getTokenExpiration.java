package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow2.ui.video.revision_video.completed.viewmodel.RevisionCompletedViewModel;
import java.lang.reflect.Method;
import kotlin.ActivityC0259zzaz;
import kotlin.ActivityC0274zzbn;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.addAllowedCountryCodes;
import kotlin.r8lambdaRTx1izlilDmlyBaYsirhR7M98MU;
import kotlin.r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk;
import kotlin.z;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\n\u001a\u00020\u00118CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0012\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0012\u0010\u0017"}, d2 = {"Lo/getTokenExpiration;", "Lo/MediaBrowserCompatMediaItem;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/r8lambdaRTx1izlilDmlyBaYsirhR7M98MU;", "IconCompatParcelizer", "(Lo/r8lambdaRTx1izlilDmlyBaYsirhR7M98MU;)V", "", "onWindowFocusChanged", "(Z)V", "AudioAttributesImplBaseParcelizer", "finish", "Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedViewModel;", "AudioAttributesCompatParcelizer", "Lo/RenewEligible;", "read", "()Lcom/marrow2/ui/video/revision_video/completed/viewmodel/RevisionCompletedViewModel;", "Lo/r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk;", "()Lo/r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getTokenExpiration extends setAssethost {
    private static int AudioAttributesImplApi21Parcelizer;
    private static long MediaBrowserCompatItemReceiver;
    private static char[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getSiteKey
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return getTokenExpiration.write(this.IconCompatParcelizer);
        }
    });
    private static final byte[] $$l = {64, -102, 72, -66};
    private static final int $$m = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarConstants.LF_GNUTYPE_LONGLINK, 28, -90, 102, -51, 71, 12, 29, -18, 41, 19, -5, 25, -28, 65, -1, 14, 13, 27, 1, 13, -18, 63, 11, -3, 33, 3, 20, 13, -11, 44, -65, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -34, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, 1, 10, 17, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, -51, 71, 12, 29, -36, 59, 3, 35, -71, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -28, TarConstants.LF_SYMLINK, 17, 10, -28, 45, 32, 0, -7, 31, 31, -1, 16, 21, 11, 31, -7, 27, 9, 5, 25, -1};
    private static final int $$k = 181;
    private static final byte[] $$d = {109, -42, -99, -39, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 82;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = kotlin.getTokenExpiration.$$l
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = r7 + 104
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r7]
        L2a:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenExpiration.$$n(int, short, short):java.lang.String");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i5 | i);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i4 | i)) | i10;
        int i13 = (~(i | i4 | i5)) | (~(i8 | (~i5)));
        int i14 = i4 + i5 + i2 + ((-2005657349) * i6) + (1476006321 * i3);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i4) - 1319501824) + (407026429 * i5) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i2) + ((-798228480) * i6) + ((-1404829696) * i3) + ((-1043726336) * i15);
        int i17 = (i4 * 961754349) + 784684277 + (i5 * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i2 * 961754313) + (i6 * (-1264871149)) + (i3 * 72538105) + (i15 * 798621696);
        int i18 = i16 + (i17 * i17 * (-1437204480));
        if (i18 == 1) {
            return read(objArr);
        }
        if (i18 != 2) {
            return write(objArr);
        }
        getTokenExpiration gettokenexpiration = (getTokenExpiration) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i19 = 2 % 2;
        int i20 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplBaseParcelizer = i20 % 128;
        int i21 = i20 % 2;
        super.onWindowFocusChanged(zBooleanValue);
        if (zBooleanValue) {
            gettokenexpiration.AudioAttributesImplBaseParcelizer();
        }
        int i22 = AudioAttributesImplBaseParcelizer + 85;
        MediaBrowserCompatCustomActionResultReceiver = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 65
            byte[] r0 = kotlin.getTokenExpiration.$$d
            int r1 = r8 + 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenExpiration.g(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.getTokenExpiration.$$j
            int r7 = 60 - r7
            int r8 = 134 - r8
            int r9 = r9 + 82
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r9 = r8
            r5 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r3 = r3 + r8
            int r8 = r3 + (-14)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenExpiration.h(short, int, short, java.lang.Object[]):void");
    }

    public getTokenExpiration() {
        getTokenExpiration gettokenexpiration = this;
        this.IconCompatParcelizer = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(RevisionCompletedViewModel.class), new AnonymousClass5(gettokenexpiration), new AnonymousClass1(gettokenexpiration), new AnonymousClass3(gettokenexpiration));
    }

    public static final /* synthetic */ void IconCompatParcelizer(getTokenExpiration gettokenexpiration, r8lambdaRTx1izlilDmlyBaYsirhR7M98MU r8lambdartx1izlildmlybaysirhr7m98mu) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 69;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        gettokenexpiration.IconCompatParcelizer(r8lambdartx1izlildmlybaysirhr7m98mu);
        int i4 = AudioAttributesImplBaseParcelizer + 37;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    private final RevisionCompletedViewModel read() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 123;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        RevisionCompletedViewModel revisionCompletedViewModel = (RevisionCompletedViewModel) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (i3 != 0) {
            return revisionCompletedViewModel;
        }
        throw null;
    }

    private final r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 125;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        if (i3 != 0) {
            throw null;
        }
        r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk r8lambdabxxs3zoecdhhzumrqz2nwycntk = (r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk) objRemoteActionCompatParcelizer;
        int i4 = AudioAttributesImplBaseParcelizer + 41;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return r8lambdabxxs3zoecdhhzumrqz2nwycntk;
    }

    private static final r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk IconCompatParcelizer(getTokenExpiration gettokenexpiration) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 25;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk.Companion companion = r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk.INSTANCE;
        Intent intent = gettokenexpiration.getIntent();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
        r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk r8lambdabxxs3zoecdhhzumrqz2nwycntkRemoteActionCompatParcelizer = r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk.Companion.RemoteActionCompatParcelizer(intent);
        int i4 = AudioAttributesImplBaseParcelizer + 83;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdabxxs3zoecdhhzumrqz2nwycntkRemoteActionCompatParcelizer;
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<r8lambdaRTx1izlilDmlyBaYsirhR7M98MU, getShowPopup> {
        public final void AudioAttributesCompatParcelizer(r8lambdaRTx1izlilDmlyBaYsirhR7M98MU r8lambdartx1izlildmlybaysirhr7m98mu) {
            toMagicModuleMetaRepoModel.write(r8lambdartx1izlildmlybaysirhr7m98mu, "");
            getTokenExpiration.IconCompatParcelizer((getTokenExpiration) this.AudioAttributesImplApi26Parcelizer, r8lambdartx1izlildmlybaysirhr7m98mu);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(r8lambdaRTx1izlilDmlyBaYsirhR7M98MU r8lambdartx1izlildmlybaysirhr7m98mu) {
            AudioAttributesCompatParcelizer(r8lambdartx1izlildmlybaysirhr7m98mu);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(1, obj, getTokenExpiration.class, "IconCompatParcelizer", "IconCompatParcelizer(Lo/r8lambdaRTx1izlilDmlyBaYsirhR7M98MU;)V", 0);
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 37;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaBrowserCompatItemReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 12424 - (ViewConfiguration.getEdgeSlop() >> 16), 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1867, 9 - TextUtils.lastIndexOf("", '0', 0, 0), 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 81;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 84 / 0;
            objArr[0] = str;
        }
    }

    /* JADX INFO: renamed from: o.getTokenExpiration$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.getTokenExpiration$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$RemoteActionCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.getTokenExpiration$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "write", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$write.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.getTokenExpiration$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/getTokenExpiration$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk;", "p1", "Landroid/content/Intent;", "IconCompatParcelizer", "(Landroid/content/Context;Lo/r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent IconCompatParcelizer(Context p0, r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) getTokenExpiration.class);
            p1.RemoteActionCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = RemoteActionCompatParcelizer;
        char c = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", c, 0, 0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7015, 31 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
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
            Object[] objArr3 = {Integer.valueOf(write)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.alpha(0), (Process.myTid() >> 22) + 7015, 30 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -626716224, false, "o", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $10 + 9;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
                while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                    needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                    needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                    if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.MeasureSpec.getMode(0) + 20126, TextUtils.getOffsetAfter("", 0) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                                int i7 = $11 + 37;
                                $10 = i7 % 128;
                                int i8 = i7 % 2;
                                Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                                if (objRemoteActionCompatParcelizer4 == null) {
                                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), View.resolveSizeAndState(0, 0, 0) + 19368, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                                int i9 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i9];
                            } else {
                                obj = null;
                                if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                    needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                    needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                    int i10 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                    int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i10];
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                                } else {
                                    int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                    int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    needsstartedservice.AudioAttributesCompatParcelizer += 2;
                    int i14 = $11 + 47;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b5  */
    @Override // kotlin.setAssethost, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenExpiration.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r11) {
        /*
            r0 = 0
            r1 = r11[r0]
            o.getTokenExpiration r1 = (kotlin.getTokenExpiration) r1
            r2 = 1
            r3 = r11[r2]
            r8 = r3
            o._handleUnrecognizedCharacterEscape r8 = (kotlin._handleUnrecognizedCharacterEscape) r8
            r3 = 2
            r11 = r11[r3]
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            int r4 = r3 % r3
            r4 = r11 & 3
            if (r4 == r3) goto L1c
            r4 = r2
            goto L1d
        L1c:
            r4 = r0
        L1d:
            r5 = r11 & 1
            boolean r4 = r8.RemoteActionCompatParcelizer(r4, r5)
            if (r4 == r2) goto L29
            r8.onPrepareFromSearch()
            goto L98
        L29:
            boolean r4 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            r2 = r2 ^ r4
            if (r2 == 0) goto L31
            goto L45
        L31:
            int r2 = kotlin.getTokenExpiration.AudioAttributesImplBaseParcelizer
            int r2 = r2 + 59
            int r4 = r2 % 128
            kotlin.getTokenExpiration.MediaBrowserCompatCustomActionResultReceiver = r4
            int r2 = r2 % r3
            java.lang.String r4 = "com.marrow2.ui.video.revision_video.completed.RevisionCompletedActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (RevisionCompletedActivity.kt:56)"
            r5 = -1
            r6 = 692697393(0x2949b931, float:4.4791594E-14)
            if (r2 == 0) goto L9b
            kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r6, r11, r5, r4)
        L45:
            com.marrow2.ui.video.revision_video.completed.viewmodel.RevisionCompletedViewModel r4 = r1.read()
            boolean r11 = r8.IconCompatParcelizer(r1)
            java.lang.Object r2 = r8.onPause()
            if (r11 != 0) goto L64
            int r11 = kotlin.getTokenExpiration.AudioAttributesImplBaseParcelizer
            int r11 = r11 + 45
            int r5 = r11 % 128
            kotlin.getTokenExpiration.MediaBrowserCompatCustomActionResultReceiver = r5
            int r11 = r11 % r3
            o._handleUnrecognizedCharacterEscape$write r11 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE
            java.lang.Object r11 = r11.IconCompatParcelizer()
            if (r2 != r11) goto L6f
        L64:
            o.getTokenExpiration$AudioAttributesCompatParcelizer r11 = new o.getTokenExpiration$AudioAttributesCompatParcelizer
            r11.<init>(r1)
            r2 = r11
            o.getErrorMessageId r2 = (kotlin.getErrorMessageId) r2
            r8.RemoteActionCompatParcelizer(r2)
        L6f:
            o.getErrorMessageId r2 = (kotlin.getErrorMessageId) r2
            r7 = r2
            o.getAnswerMap r7 = (kotlin.getAnswerMap) r7
            r5 = 500(0x1f4, float:7.0E-43)
            r6 = 0
            r9 = 48
            r10 = 4
            kotlin.setTokenExpiration.AudioAttributesCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            boolean r11 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r11 == 0) goto L98
            int r11 = kotlin.getTokenExpiration.MediaBrowserCompatCustomActionResultReceiver
            int r11 = r11 + 61
            int r1 = r11 % 128
            kotlin.getTokenExpiration.AudioAttributesImplBaseParcelizer = r1
            int r11 = r11 % r3
            if (r11 == 0) goto L95
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
            r11 = 25
            int r11 = r11 / r0
            goto L98
        L95:
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
        L98:
            o.getShowPopup r11 = kotlin.getShowPopup.INSTANCE
            return r11
        L9b:
            kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r6, r11, r5, r4)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenExpiration.read(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.getShowPopup IconCompatParcelizer(final kotlin.getTokenExpiration r11, kotlin._handleUnrecognizedCharacterEscape r12, int r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = r13 & 3
            r2 = 0
            r3 = 1
            if (r1 == r0) goto Lb
            r1 = r3
            goto Lc
        Lb:
            r1 = r2
        Lc:
            r4 = r13 & 1
            boolean r1 = r12.RemoteActionCompatParcelizer(r1, r4)
            if (r1 == 0) goto L65
            int r1 = kotlin.getTokenExpiration.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 33
            int r4 = r1 % 128
            kotlin.getTokenExpiration.AudioAttributesImplBaseParcelizer = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L29
            boolean r1 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            r4 = 39
            int r4 = r4 / r2
            if (r1 == r3) goto L2f
            goto L38
        L29:
            boolean r1 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r1 == 0) goto L38
        L2f:
            r1 = -1
            java.lang.String r2 = "com.marrow2.ui.video.revision_video.completed.RevisionCompletedActivity.onCreate.<anonymous>.<anonymous> (RevisionCompletedActivity.kt:55)"
            r4 = 1001143985(0x3bac3eb1, float:0.005256497)
            kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r4, r13, r1, r2)
        L38:
            r5 = 0
            r6 = 0
            o.setApiEndpoint r13 = new o.setApiEndpoint
            r13.<init>()
            r11 = 54
            r1 = 692697393(0x2949b931, float:4.4791594E-14)
            o.FastIntegerMathUInt128 r11 = kotlin.multiplyFft.AudioAttributesCompatParcelizer(r1, r3, r13, r12, r11)
            r7 = r11
            o.MagicModuleSubmissionRequestBody r7 = (kotlin.MagicModuleSubmissionRequestBody) r7
            r9 = 384(0x180, float:5.38E-43)
            r10 = 3
            r8 = r12
            com.marrow.designsystem.theme.ThemeKt.read(r5, r6, r7, r8, r9, r10)
            boolean r11 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r11 == 0) goto L68
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
            int r11 = kotlin.getTokenExpiration.MediaBrowserCompatCustomActionResultReceiver
            int r11 = r11 + 89
            int r12 = r11 % 128
            kotlin.getTokenExpiration.AudioAttributesImplBaseParcelizer = r12
            int r11 = r11 % r0
            goto L68
        L65:
            r12.onPrepareFromSearch()
        L68:
            o.getShowPopup r11 = kotlin.getShowPopup.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenExpiration.IconCompatParcelizer(o.getTokenExpiration, o._handleUnrecognizedCharacterEscape, int):o.getShowPopup");
    }

    private final void IconCompatParcelizer(r8lambdaRTx1izlilDmlyBaYsirhR7M98MU p0) {
        int i = 2 % 2;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            String string = getString(R.string.solve_related_schema_message);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            CmcdConfigurationRequestConfig.read(this, string, 0);
            finish();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.RemoteActionCompatParcelizer.INSTANCE)) {
            finish();
            return;
        }
        if (p0 instanceof r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.AudioAttributesCompatParcelizer) {
            int i2 = AudioAttributesImplBaseParcelizer + 33;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                C0272zzbl remoteActionCompatParcelizer = AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer != null) {
                    int i3 = MediaBrowserCompatCustomActionResultReceiver + 97;
                    AudioAttributesImplBaseParcelizer = i3 % 128;
                    if (i3 % 2 == 0) {
                        C0272zzbl c0272zzblAudioAttributesCompatParcelizer = C0272zzbl.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer, remoteActionCompatParcelizer.write, remoteActionCompatParcelizer.IconCompatParcelizer, false);
                        ActivityC0274zzbn.Companion writeVar = ActivityC0274zzbn.INSTANCE;
                        startActivity(ActivityC0274zzbn.Companion.IconCompatParcelizer(this, c0272zzblAudioAttributesCompatParcelizer));
                        finish();
                        return;
                    }
                    C0272zzbl c0272zzblAudioAttributesCompatParcelizer2 = C0272zzbl.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer, remoteActionCompatParcelizer.write, remoteActionCompatParcelizer.IconCompatParcelizer, false);
                    ActivityC0274zzbn.Companion writeVar2 = ActivityC0274zzbn.INSTANCE;
                    startActivity(ActivityC0274zzbn.Companion.IconCompatParcelizer(this, c0272zzblAudioAttributesCompatParcelizer2));
                    finish();
                    throw null;
                }
                return;
            }
            AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer();
            throw null;
        }
        if (p0 instanceof r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.write) {
            ActivityC0259zzaz.Companion companion = ActivityC0259zzaz.INSTANCE;
            r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.write writeVar3 = (r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.write) p0;
            startActivity(ActivityC0259zzaz.Companion.RemoteActionCompatParcelizer(this, new isCompatible(0, writeVar3.read(), writeVar3.AudioAttributesCompatParcelizer(), null, 8, null)));
            finish();
            return;
        }
        if (p0 instanceof r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.read) {
            addAllowedCountryCodes.Companion companion2 = addAllowedCountryCodes.INSTANCE;
            startActivity(addAllowedCountryCodes.Companion.read(this, ((r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.read) p0).IconCompatParcelizer(), null));
            finish();
        } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, r8lambdaRTx1izlilDmlyBaYsirhR7M98MU.IconCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        findNameForMutator findnameformutator = new findNameForMutator(getWindow(), getWindow().getDecorView());
        findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver() | WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver());
        findnameformutator.IconCompatParcelizer(2);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 3;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 1;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.finish();
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    @Override // kotlin.setAssethost, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{'\f', 14, '\"', 17, 30, '\'', '!', 3, 14, 28, 26, 0, '0', '\'', 16, '#', ',', '(', 16, 21, 1, 20, 17, 27, '\n', 28}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 56), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, new char[]{'%', 6, 13832, 13832, 26, 17, 18, '*', 13834, 13834, 2, '#', '#', '\r', 16, '#', '!', 18}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 22), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 59;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i3 = MediaBrowserCompatCustomActionResultReceiver + 57;
                AudioAttributesImplBaseParcelizer = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 6055 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 42 - View.resolveSizeAndState(0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), (Process.myPid() >> 22) + 6030, 23 - MotionEvent.axisFromString(""), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    @Override // kotlin.setAssethost, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenExpiration.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x096f A[Catch: all -> 0x0a28, TryCatch #2 {all -> 0x0a28, blocks: (B:135:0x0969, B:137:0x096f, B:138:0x0998), top: B:274:0x0969, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c5e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0efb  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0fda  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x1022  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1075  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x136c  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0385 A[Catch: all -> 0x03f1, TryCatch #5 {all -> 0x03f1, blocks: (B:51:0x0378, B:53:0x0385, B:54:0x03e9), top: B:279:0x0378, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0476 A[Catch: all -> 0x02fc, TryCatch #12 {all -> 0x02fc, blocks: (B:77:0x0470, B:79:0x0476, B:80:0x049e, B:210:0x0f1c, B:212:0x0f22, B:213:0x0f47, B:246:0x138f, B:248:0x1395, B:249:0x13bc, B:227:0x1117, B:229:0x113a, B:230:0x1180, B:170:0x0aa5, B:172:0x0aab, B:173:0x0ace, B:19:0x00d6, B:21:0x00dc, B:22:0x0103, B:24:0x0268, B:26:0x0299, B:27:0x02f6, B:84:0x0538, B:86:0x053e, B:87:0x0589, B:91:0x05a3, B:93:0x05a9, B:94:0x05e8, B:117:0x08e9, B:118:0x08ed, B:122:0x08ff, B:127:0x092e, B:130:0x093b, B:132:0x093e, B:139:0x099f, B:145:0x0a20, B:147:0x0a26, B:148:0x0a27, B:150:0x0a29, B:152:0x0a30, B:153:0x0a31, B:125:0x0917, B:95:0x05f3, B:107:0x0747, B:109:0x074d, B:110:0x078b, B:112:0x0848, B:113:0x088d, B:115:0x08a4, B:116:0x08e3, B:155:0x0a33, B:157:0x0a3a, B:158:0x0a3b, B:160:0x0a3d, B:162:0x0a44, B:163:0x0a45, B:135:0x0969, B:137:0x096f, B:138:0x0998, B:102:0x06b7, B:104:0x06cc, B:105:0x073b, B:97:0x0667, B:99:0x067c, B:100:0x06b0, B:141:0x09a4), top: B:293:0x00d6, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x053e A[Catch: all -> 0x0a46, TryCatch #1 {all -> 0x0a46, blocks: (B:84:0x0538, B:86:0x053e, B:87:0x0589, B:91:0x05a3, B:93:0x05a9, B:94:0x05e8, B:117:0x08e9, B:118:0x08ed, B:122:0x08ff, B:127:0x092e, B:130:0x093b, B:132:0x093e, B:139:0x099f, B:145:0x0a20, B:147:0x0a26, B:148:0x0a27, B:150:0x0a29, B:152:0x0a30, B:153:0x0a31, B:125:0x0917, B:95:0x05f3, B:107:0x0747, B:109:0x074d, B:110:0x078b, B:112:0x0848, B:113:0x088d, B:115:0x08a4, B:116:0x08e3, B:155:0x0a33, B:157:0x0a3a, B:158:0x0a3b, B:160:0x0a3d, B:162:0x0a44, B:163:0x0a45, B:135:0x0969, B:137:0x096f, B:138:0x0998, B:102:0x06b7, B:104:0x06cc, B:105:0x073b, B:97:0x0667, B:99:0x067c, B:100:0x06b0, B:141:0x09a4), top: B:273:0x0538, outer: #12, inners: #2, #7, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05f3 A[Catch: all -> 0x0a46, TRY_LEAVE, TryCatch #1 {all -> 0x0a46, blocks: (B:84:0x0538, B:86:0x053e, B:87:0x0589, B:91:0x05a3, B:93:0x05a9, B:94:0x05e8, B:117:0x08e9, B:118:0x08ed, B:122:0x08ff, B:127:0x092e, B:130:0x093b, B:132:0x093e, B:139:0x099f, B:145:0x0a20, B:147:0x0a26, B:148:0x0a27, B:150:0x0a29, B:152:0x0a30, B:153:0x0a31, B:125:0x0917, B:95:0x05f3, B:107:0x0747, B:109:0x074d, B:110:0x078b, B:112:0x0848, B:113:0x088d, B:115:0x08a4, B:116:0x08e3, B:155:0x0a33, B:157:0x0a3a, B:158:0x0a3b, B:160:0x0a3d, B:162:0x0a44, B:163:0x0a45, B:135:0x0969, B:137:0x096f, B:138:0x0998, B:102:0x06b7, B:104:0x06cc, B:105:0x073b, B:97:0x0667, B:99:0x067c, B:100:0x06b0, B:141:0x09a4), top: B:273:0x0538, outer: #12, inners: #2, #7, #11, #15 }] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.CharSequence] */
    @Override // kotlin.setAssethost, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTokenExpiration.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ getShowPopup read(getTokenExpiration gettokenexpiration, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 3;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IconCompatParcelizer(gettokenexpiration, _handleunrecognizedcharacterescape, i);
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(gettokenexpiration, _handleunrecognizedcharacterescape, i);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 123;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupIconCompatParcelizer;
        }
        throw null;
    }

    public static /* synthetic */ r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk write(getTokenExpiration gettokenexpiration) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 13;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk r8lambdabxxs3zoecdhhzumrqz2nwycntkIconCompatParcelizer = IconCompatParcelizer(gettokenexpiration);
        int i4 = AudioAttributesImplBaseParcelizer + 5;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return r8lambdabxxs3zoecdhhzumrqz2nwycntkIconCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(getTokenExpiration gettokenexpiration, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 121;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {gettokenexpiration, _handleunrecognizedcharacterescape, Integer.valueOf(i)};
        getShowPopup getshowpopup = (getShowPopup) RemoteActionCompatParcelizer(onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1039599872, 1039599873, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), objArr);
        int i5 = AudioAttributesImplBaseParcelizer + 45;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    static {
        AudioAttributesImplApi21Parcelizer = 1;
        write();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi26Parcelizer + 29;
        AudioAttributesImplApi21Parcelizer = i % 128;
        int i2 = i % 2;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(getTokenExpiration gettokenexpiration, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        Object[] objArr = {gettokenexpiration, _handleunrecognizedcharacterescape, Integer.valueOf(i)};
        return (getShowPopup) RemoteActionCompatParcelizer(onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1039599872, 1039599873, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), objArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean p0) {
        RemoteActionCompatParcelizer((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1398317542, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), onDrmSessionAcquired.AudioAttributesCompatParcelizer(), -1853621746, 1853621748, onDrmSessionAcquired.AudioAttributesCompatParcelizer(), new Object[]{this, Boolean.valueOf(p0)});
    }

    @Override // kotlin.setAssethost, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int length = 1095674668 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length();
        int iAudioAttributesCompatParcelizer = onDrmSessionAcquired.AudioAttributesCompatParcelizer();
        int i = z.AudioAttributesCompatParcelizer.read();
        RemoteActionCompatParcelizer(length, iAudioAttributesCompatParcelizer, z.AudioAttributesCompatParcelizer.read(), 1735826845, -1735826845, i, new Object[]{this});
    }

    static void write() {
        RemoteActionCompatParcelizer = new char[]{6468, 6838, 6493, 6416, 6472, 6406, 6524, 6473, 6522, 6839, 6834, 6425, 6836, 6467, 6492, 6464, 6431, 6832, 6833, 6470, 6490, 6488, 6426, 6481, 6477, 6479, 6469, 6428, 6430, 6835, 6523, 6476, 6471, 6842, 6474, 6417, 6478, 6465, 6491, 6507, 6837, 6475, 6424, 6466, 6427, 6429, 6505, 6494, 6520};
        write = (char) 11445;
        MediaBrowserCompatItemReceiver = -3386801718492925153L;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getTokenExpiration gettokenexpiration = (getTokenExpiration) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 89;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 91;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
