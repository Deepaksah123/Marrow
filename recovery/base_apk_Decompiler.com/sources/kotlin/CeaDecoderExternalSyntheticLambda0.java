package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.addConnectionCallbacks;
import kotlin.buildDownloadCompletedNotification;
import kotlin.setActiveRecallQbankId;
import org.apache.commons.compress.archivers.tar.TarConstants;
import uk.co.senab.photoview.PhotoView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00168CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/CeaDecoderExternalSyntheticLambda0;", "Lcom/marrow/ui/activities/base/BaseActivity;", "Lo/buildDownloadCompletedNotification$IconCompatParcelizer;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "MediaDescriptionCompat", "", "handleMediaPlayPauseIfPendingOnHandler", "()I", "", "Landroid/widget/ImageView;", "p1", "read", "(ZLandroid/widget/ImageView;)V", "Lo/NavigationBarViewSavedState;", "onAddQueueItem", "()Lo/NavigationBarViewSavedState;", "Lo/parseMediaPresentationDescription;", "IconCompatParcelizer", "Lo/setSessionInfo;", "onCommand", "()Lo/parseMediaPresentationDescription;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CeaDecoderExternalSyntheticLambda0 extends releaseInputBuffer implements buildDownloadCompletedNotification.IconCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatSearchResultReceiver;
    private static long RemoteActionCompatParcelizer;
    private static /* synthetic */ isResolutionNotSupported<Object>[] read;
    private static char[] write;
    private final setSessionInfo IconCompatParcelizer = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new read());
    private static final byte[] $$l = {8, -19, -66, -33};
    private static final int $$o = 228;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarConstants.LF_BLK, -62, -101, -125, -59, 63, 4, 21, -42, TarConstants.LF_CONTIG, 3, -11, 25, -5, 12, 5, -27, 34, 9, 6, 3, 16, 32, 18, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 18, 4, -57, 63, 14, 6, -2, 11, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, 25, -9, 19, -3, -2, 17, -56, 59, 11, 7, 13, -60, 27, 43, 7, 13, -70, 19, 1, -3, 17, -9};
    private static final int $$k = 98;
    private static final byte[] $$d = {16, -111, 25, -45, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 126;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 0;
    private static int MediaDescriptionCompat = 1;

    private static String $$p(int i, byte b, int i2) {
        int i3 = i2 * 3;
        int i4 = b + 4;
        int i5 = 104 - (i * 3);
        byte[] bArr = $$l;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i4 + (-i6);
            i4 = i4;
            i5 = i8;
        }
        while (true) {
            int i9 = i4 + 1;
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 = i9;
            i5 += -bArr[i9];
        }
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i2) | i7);
        int i9 = ~(i6 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i2;
        int i12 = ~(i7 | i2);
        int i13 = i + i2 + i5 + (1577873432 * i4) + (977123338 * i3);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i) - 865599488) + ((-647756440) * i2) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i5) + ((-767557632) * i4) + (1290797056 * i3) + ((-539361280) * i14);
        int i16 = (i * (-1177406726)) + 1326046462 + (i2 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i5 * (-1177406223)) + (i4 * 1546282648) + (i3 * (-1884272278)) + (i14 * 70909952);
        if (i15 + (i16 * i16 * 451280896) != 1) {
            return RemoteActionCompatParcelizer(objArr);
        }
        int i17 = 2 % 2;
        int iIconCompatParcelizer = CmcdConfigurationRequestConfig.IconCompatParcelizer();
        Integer numValueOf = Integer.valueOf(R.attr.colorBlack);
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(iIconCompatParcelizer, numValueOf, numValueOf);
        int i18 = RatingCompat + 35;
        MediaDescriptionCompat = i18 % 128;
        int i19 = i18 % 2;
        return navigationBarViewSavedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 191 - r7
            int r0 = 44 - r6
            byte[] r1 = kotlin.CeaDecoderExternalSyntheticLambda0.$$d
            int r8 = 114 - r8
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoderExternalSyntheticLambda0.g(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 119 - r8
            int r7 = 106 - r7
            byte[] r0 = kotlin.CeaDecoderExternalSyntheticLambda0.$$j
            int r1 = 39 - r6
            byte[] r1 = new byte[r1]
            int r6 = 38 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r7
            int r7 = r3 + (-6)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoderExternalSyntheticLambda0.h(short, int, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        CeaDecoderExternalSyntheticLambda0 ceaDecoderExternalSyntheticLambda0 = (CeaDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        RatingCompat = i2 % 128;
        parseMediaPresentationDescription parsemediapresentationdescription = (parseMediaPresentationDescription) (i2 % 2 != 0 ? ceaDecoderExternalSyntheticLambda0.IconCompatParcelizer.read(ceaDecoderExternalSyntheticLambda0, read[1]) : ceaDecoderExternalSyntheticLambda0.IconCompatParcelizer.read(ceaDecoderExternalSyntheticLambda0, read[0]));
        int i3 = RatingCompat + 63;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return parsemediapresentationdescription;
    }

    /* JADX INFO: renamed from: o.CeaDecoderExternalSyntheticLambda0$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/CeaDecoderExternalSyntheticLambda0$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) CeaDecoderExternalSyntheticLambda0.class);
            intent.putExtra("image_url", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 51;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 12424 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 21, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1868 - TextUtils.indexOf("", ""), 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1983509525, false, $$p(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 69;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    public static final class read implements getAnswerMap<CeaDecoderExternalSyntheticLambda0, parseMediaPresentationDescription> {
        private static parseMediaPresentationDescription IconCompatParcelizer(CeaDecoderExternalSyntheticLambda0 ceaDecoderExternalSyntheticLambda0) {
            toMagicModuleMetaRepoModel.write(ceaDecoderExternalSyntheticLambda0, "");
            return parseMediaPresentationDescription.read(SessionDescriptionParser.AudioAttributesCompatParcelizer(ceaDecoderExternalSyntheticLambda0));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.parseMediaPresentationDescription] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ parseMediaPresentationDescription invoke(CeaDecoderExternalSyntheticLambda0 ceaDecoderExternalSyntheticLambda0) {
            return IconCompatParcelizer(ceaDecoderExternalSyntheticLambda0);
        }
    }

    private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        int i4 = $10 + 1;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (downloadService.write < i2) {
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(write[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (-b);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 36621), (ViewConfiguration.getScrollBarSize() >> 8) + 2340, Process.getGidForName("") + 29, 480654850, false, $$p(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9702, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), Process.getGidForName("") + 23785, Color.argb(0, 0, 0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.alpha(0), 23785 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i7 = $11 + 121;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static final void IconCompatParcelizer(CeaDecoderExternalSyntheticLambda0 ceaDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = RatingCompat + 33;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        ceaDecoderExternalSyntheticLambda0.finish();
        int i4 = MediaDescriptionCompat + 21;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.releaseInputBuffer, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[1];
        e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 111, 17 - TextUtils.lastIndexOf("", '0', 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 25086), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 1, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{47795, 9210, 47826, 19944, 14803, 35343, 812, 58703, 49417, 3071, 29635, 50243, 51506, 49622, 46567, 32371, 38690, 49109, 61427, 47140, 23813, 30127, 8579, 62020, 6999, 13246, 39829, 11336, 57714, 59778}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e((char) (Color.rgb(0, 0, 0) + 16819688), 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = MediaDescriptionCompat + 63;
                RatingCompat = i4 % 128;
                if (i4 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 6054 - TextUtils.getTrimmedLength(""), 42 - View.MeasureSpec.getMode(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{25898, 17781, 25929, 11068, 51718, 27621, 56505, 5838, 8439, 28029, 32839, 9713, 5886, 42783, 17957, 40858, 18591, 55647, 7266, 22918, 33498, 4908, 53781, 5107, 50345, 21820, 26624, 52714, 16050, 36623, 11874, 34690, 28809, 49480, 58484, 16835, 43727, 30907, 47744, 14950, 60472, 45818, 28868, 62500, 9774, 62618, 13999, 44566, 38978, 11904, 52448, 26710}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), View.combineMeasuredStates(0, 0) + 41, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 54, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 115, new char[]{21210, 13831, 21176, 22602, 27872, 60849, 60187, 45177, 42657, 7769, 9970, 41981, 8542, 54335, 57492, 6596, 32562, 43562, 47829, 57217, 46370, 24666, 29859, 38308, 62296, 9754, 52962, 19383, 2371, 64638, 34949, 396, 18297, 45629, 17088, 51101, 40302, 2970, 7222, 48176, 56267, 49550, 54818, 29219, 4491, 34793, 36932, 10309, 45033, 24057, 27137, 60932, 58799, 5087, 9255, 42100, 9179, 59805, 65122, 6758, 31179, 45049, 47188, 53335, 47100, 26044, 29255, 38429}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f((Process.getThreadPriority(0) + 20) >> 6, new char[]{14353, 46960, 14457, 55672, 36391, 9510, 33170, 21163, 28194, 40742, 50284, 27497, 19349, 21837, 538, 53530, 5560, 11086, 22540, 5907, 57279, 57640, 38496, 23864, 39381, 42804, 11377, 33635, 25552, 32024, 27216, 51543, 11762, 13064, 40973, 3905, 63460, 35565, 65185, 29874, 45330, 16621, 13494, 47783, 31491, 1737, 29405, 57493, 50478, 56529, 35020, 9863, 36641, 37541, 50876, 27903, 18767, 26811, 7398, 54005, 4933, 11971, 23237, 6276, 56622, 58521, 37077, 24259, 42879, 47736, 10528}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{19051, 12179, 19026, 16833, 45429, 16435, 62389, 28092, 2931, 1997}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{37296, 42338, 37250, 52015, 18652, 14175, 10358, 37958, 31772, 36156, 671, 31049, 57981, 18182, 50424, 50032, 48134, 14595, 40634, 1390, 30276, 62313, 20691, 20241, 12386, 46460, 60126, 37141, 51830, 28489, 44223, 56122, 33815, 8459, 26285, 7550, 24065, 39167, 14344, 26334}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myTid() >> 22), 6030 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetAfter("", 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13183);
            int trimmedLength = TextUtils.getTrimmedLength("") + 1649;
            int keyRepeatDelay = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr = $$d;
            byte b = bArr[5];
            Object[] objArr13 = new Object[1];
            g(b, (short) (b | 187), (byte) (-bArr[62]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(touchSlop, trimmedLength, keyRepeatDelay, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i5 = MediaDescriptionCompat + 125;
            RatingCompat = i5 % 128;
            int i6 = i5 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 13184);
                int size = 1649 - View.MeasureSpec.getSize(0);
                int defaultSize = 26 - View.getDefaultSize(0, 0);
                Object[] objArr14 = new Object[1];
                g(r3[30], (short) 144, (byte) (-$$d[9]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cAxisFromString, size, defaultSize, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f((-16777216) - Color.rgb(0, 0, 0), new char[]{10362, 6199, 10256, 30250, 31967, 57434, 37284, 41041, 43855, 12343, 14040, 44613, 23549, 64069, 61658, 5218, 1497, 33807, 43772, 53862}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35690), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 104, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i7 = MediaDescriptionCompat + 107;
            RatingCompat = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 2069009848};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                h(bArr2[81], (byte) ($$k + 4), bArr2[35], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h(bArr2[40], (byte) 84, (byte) 46, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char offsetAfter = (char) (13183 - TextUtils.getOffsetAfter("", 0));
                    int iIndexOf = 1648 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i9 = 26 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    Object[] objArr20 = new Object[1];
                    g(r9[30], (short) 144, (byte) (-$$d[9]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(offsetAfter, iIndexOf, i9, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, new char[]{40868, 52573, 40901, 41807, 34801, 37271, 9787, 23405, 55953, 58712, 52705, 57307, 60459, 12146, 2971, 26006, 45581, 20834, 20945, 41904, 30729, 39714, 40889, 59850, 15991, 56602}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{38143, 39287, 38042, 63335, 24612, 50582, 11644, 48317, 36498, 45438, 10801, 35748, 59258, 31562, 60425, 12722, 47430, 1366, 46608}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 13183);
                        int iMakeMeasureSpec = 1649 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i10 = 26 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte[] bArr3 = $$d;
                        Object[] objArr23 = new Object[1];
                        g(bArr3[30], (short) (-bArr3[1]), (byte) (-bArr3[9]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(defaultSize2, iMakeMeasureSpec, i10, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c = (char) (13184 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                        int iBlue = Color.blue(0) + 26;
                        byte[] bArr4 = $$d;
                        byte b2 = bArr4[5];
                        Object[] objArr24 = new Object[1];
                        g(b2, (short) (b2 | 187), (byte) (-bArr4[62]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c, doubleTapTimeout, iBlue, -133433128, false, (String) objArr24[0], null);
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
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getTapTimeout() >> 16) + 4535), 6054 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {1279941260, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 6030, 24 - ExpandableListView.getPackedPositionType(0L));
                Object[] objArr26 = new Object[1];
                h(r5[44], (byte) 65, (byte) (-$$j[25]), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(p0);
        MediaDescriptionCompat();
        buildDownloadCompletedNotification.RemoteActionCompatParcelizer(((parseMediaPresentationDescription) RemoteActionCompatParcelizer(625898949, -625898949, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1181042909, addConnectionCallbacks.write.IconCompatParcelizer(), setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer())).IconCompatParcelizer, getIntent().getStringExtra("image_url"), R.drawable.ic_img_not_loaded, this);
        ((ImageView) findViewById(R.id.close_image_view)).setOnClickListener(new View.OnClickListener() { // from class: o.getAvailableOutputBuffer
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CeaDecoderExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    private final void MediaDescriptionCompat() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesImplApi26Parcelizer = setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        int iAudioAttributesImplApi26Parcelizer2 = setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        PhotoView photoView = ((parseMediaPresentationDescription) RemoteActionCompatParcelizer(625898949, -625898949, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1181042909, addConnectionCallbacks.write.IconCompatParcelizer(), iAudioAttributesImplApi26Parcelizer2, iAudioAttributesImplApi26Parcelizer)).IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(photoView, "");
        getHttpMethodString.read((View) photoView, true, true, true, true, 0, 48);
        int iAudioAttributesImplApi26Parcelizer3 = setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        int iAudioAttributesImplApi26Parcelizer4 = setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        ImageView imageView = ((parseMediaPresentationDescription) RemoteActionCompatParcelizer(625898949, -625898949, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1181042909, addConnectionCallbacks.write.IconCompatParcelizer(), iAudioAttributesImplApi26Parcelizer4, iAudioAttributesImplApi26Parcelizer3)).RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        getHttpMethodString.read((View) imageView, true, false, false, true, 0, 54);
        int i4 = MediaDescriptionCompat + 27;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ba  */
    @Override // kotlin.releaseInputBuffer, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoderExternalSyntheticLambda0.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ee  */
    @Override // kotlin.releaseInputBuffer, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoderExternalSyntheticLambda0.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x011b  */
    @Override // kotlin.releaseInputBuffer, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoderExternalSyntheticLambda0.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(CeaDecoderExternalSyntheticLambda0 ceaDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(ceaDecoderExternalSyntheticLambda0);
        int i4 = MediaDescriptionCompat + 79;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        MediaBrowserCompatSearchResultReceiver = 1;
        MediaBrowserCompatMediaItem();
        read = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(CeaDecoderExternalSyntheticLambda0.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityImageDetailBinding;", 0))};
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatMediaItem + 19;
        MediaBrowserCompatSearchResultReceiver = i % 128;
        int i2 = i % 2;
    }

    private final parseMediaPresentationDescription onCommand() {
        int iAudioAttributesImplApi26Parcelizer = setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        int iAudioAttributesImplApi26Parcelizer2 = setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        return (parseMediaPresentationDescription) RemoteActionCompatParcelizer(625898949, -625898949, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1181042909, addConnectionCallbacks.write.IconCompatParcelizer(), iAudioAttributesImplApi26Parcelizer2, iAudioAttributesImplApi26Parcelizer);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final NavigationBarViewSavedState onAddQueueItem() {
        Object[] objArr = {this};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 645826546;
        return (NavigationBarViewSavedState) RemoteActionCompatParcelizer(1540990056, -1540990055, objArr, setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), addConnectionCallbacks.write.IconCompatParcelizer(), setActiveRecallQbankId.IconCompatParcelizer.C0132IconCompatParcelizer.RemoteActionCompatParcelizer.C0134RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), length);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 59;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_image_detail;
    }

    @Override // o.buildDownloadCompletedNotification.IconCompatParcelizer
    public final void read(boolean p0, ImageView p1) {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p1, "");
        int i4 = RatingCompat + 19;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.releaseInputBuffer, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 9;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = MediaDescriptionCompat + 115;
        RatingCompat = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void MediaBrowserCompatMediaItem() {
        write = new char[]{56429, 31748, 40100, 15692, 24059, 64923, 7692, 48872, 57171, 32745, 40926, 14398, 22710, 63821, 6651, 47507, 55839, 31417, 48543, 7661, 64875, 23721, 15374, 31111, 55799, 14682, 39076, 63513, 22644, 48116, 7023, 31396, 55810, 14964, 40431, 64847, 23723, 48132, 7287, 32747, 57164, 56380, 31753, 40099, 15630, 23971, 64915, 7775, 48880, 57097, 32685, 40852, 14348, 22772, 63763, 6652, 47552, 55821, 31407, 39745, 15271, 23490, 62570, 5372, 46367, 54782, 30155, 38497, 14078, 22301, 63413, 6090, 45158, 53500, 28958, 37346, 12749, 21042, 62080, 4891, 46006, 54212, 27757, 36050, 11594, 19936, 60804, 3689, 44754, 53020, 28595, 36821, 10350, 18565, 59691, 2492, 43475, 51812, 27356, 35701, 11245, 19409, 58407, 1163, 42273, 22286, 63333, 6094, 46651, 54923, 30448, 38263, 13780, 21535, 62608, 5352, 45933, 54252, 29222, 37527, 13048, 56372, 31835, 40182, 15630, 23968, 64961, 7775, 48894, 57098, 32680, 40900};
        RemoteActionCompatParcelizer = -8220296309829632918L;
        MediaBrowserCompatCustomActionResultReceiver = -4166917880908859161L;
    }
}
