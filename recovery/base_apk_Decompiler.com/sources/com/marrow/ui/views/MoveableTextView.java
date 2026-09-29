package com.marrow.ui.views;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import com.marrow.R;
import com.marrow.ui.views.MoveableTextView;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Random;
import kotlin.DownloadService;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.getClassId;
import kotlin.getCreatedOnDateMs;
import kotlin.getShowPopup;
import kotlin.hideScrubber;
import kotlin.scrubIncrementally;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u000eJ\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u000eJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u000f\u0010'\u001a\u00020\fH\u0014¢\u0006\u0004\b'\u0010\u000eJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010\u000eJ\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\"\u00103\u001a\u0002028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u0002028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010=\u001a\u00020<8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010,R\u0016\u0010)\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010ER\u0016\u00100\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010(\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010GR\u0016\u0010F\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010HR\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010HR\u0016\u0010/\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010JR.\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0L8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010U\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010S8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010\\\u001a\b\u0012\u0004\u0012\u00020\f0[8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010\r\u001a\u00020\t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010bR\u0014\u0010C\u001a\u00020\t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010b"}, d2 = {"Lcom/marrow/ui/views/MoveableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "MediaBrowserCompatMediaItem", "()V", "", "setIsTablet", "(Z)V", "", "setMsDelay", "(J)V", "setMsFixedDuration", "", "setTextSizes", "([F)V", "", "setBackground", "([I)V", "setTextColor", "setBigTextCounter", "(I)V", "setDontHide", "setMinimumWidthMargin", "setMinimumHeightMargin", "write", "onAddQueueItem", "MediaMetadataCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "AudioAttributesImplBaseParcelizer", "onDetachedFromWindow", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "I", "read", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "Ljava/lang/Runnable;", "moveRunner", "Ljava/lang/Runnable;", "getMoveRunner", "()Ljava/lang/Runnable;", "setMoveRunner", "(Ljava/lang/Runnable;)V", "hideRunner", "getHideRunner", "setHideRunner", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "setRandom", "(Ljava/util/Random;)V", "RatingCompat", "RemoteActionCompatParcelizer", "[F", "MediaBrowserCompatItemReceiver", "[I", "Z", "onCustomAction", "J", "onCommand", "Lo/getSubscriptionExpiresOn;", "pairOfTimeAndIndex", "Lo/getSubscriptionExpiresOn;", "getPairOfTimeAndIndex", "()Lo/getSubscriptionExpiresOn;", "setPairOfTimeAndIndex", "(Lo/getSubscriptionExpiresOn;)V", "", "", "blinkerTexts", "[Ljava/lang/String;", "getBlinkerTexts", "()[Ljava/lang/String;", "setBlinkerTexts", "([Ljava/lang/String;)V", "Lkotlin/Function0;", "onMoveListener", "Lo/getCreatedOnDateMs;", "getOnMoveListener", "()Lo/getCreatedOnDateMs;", "setOnMoveListener", "(Lo/getCreatedOnDateMs;)V", "()I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveableTextView extends AppCompatTextView {
    private static final byte[] $$a = {27, 74, 113, 65};
    private static final int $$b = 120;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final int[] AudioAttributesImplApi26Parcelizer;
    private static final int[] AudioAttributesImplBaseParcelizer;
    private static final int[][] IconCompatParcelizer;
    private static final float[] MediaBrowserCompatCustomActionResultReceiver;
    private static final int[] RemoteActionCompatParcelizer;
    private static char[] onFastForward;
    private static final byte[] onMediaButtonEvent;
    private static int onPause;
    private static int onPlay;
    private static long onPlayFromMediaId;
    private static final int onPrepareFromMediaId;
    private static final int[] read;
    private static final int[] write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int[] AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private int[] AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;
    private String[] blinkerTexts;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private int read;
    private Runnable hideRunner;
    private Runnable moveRunner;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private float[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private long MediaMetadataCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private long MediaBrowserCompatSearchResultReceiver;
    private getCreatedOnDateMs<getShowPopup> onMoveListener;
    private Pair<Boolean, Integer> pairOfTimeAndIndex;
    public Random random;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r8 = r8 * 3
            int r8 = 101 - r8
            byte[] r1 = com.marrow.ui.views.MoveableTextView.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.$$c(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0495 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0386 A[Catch: all -> 0x0388, TryCatch #2 {all -> 0x0388, blocks: (B:40:0x036c, B:48:0x0380, B:50:0x0386, B:51:0x0387), top: B:113:0x036c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0387 A[Catch: all -> 0x0388, TRY_LEAVE, TryCatch #2 {all -> 0x0388, blocks: (B:40:0x036c, B:48:0x0380, B:50:0x0386, B:51:0x0387), top: B:113:0x036c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0484 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static final void AudioAttributesCompatParcelizer(MoveableTextView moveableTextView) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(moveableTextView);
        try {
            int i = 0;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) 322, bArr[26], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            int i2 = onPrepareFromMediaId;
            Object[] objArr2 = new Object[1];
            a((short) (i2 | 298), bArr[189], bArr[22], objArr2);
            int iIntValue = 96 - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 1714, bArr[12], bArr[24], objArr4);
            String str = (String) objArr4[0];
            short s = (short) 1708;
            Object[] objArr5 = new Object[1];
            a(s, bArr[6], bArr[106], objArr5);
            Object[] objArr6 = new Object[1];
            a(s, bArr[6], bArr[106], objArr6);
            int iIntValue2 = ((Integer) cls2.getMethod(str, Class.forName((String) objArr5[0]), Class.forName((String) objArr6[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue() + 4079;
            Object[] objArr7 = {"", '0'};
            Object[] objArr8 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(s, bArr[6], bArr[106], objArr10);
            Object[] objArr11 = new Object[1];
            b(iIntValue, iIntValue2, (char) (16551 - ((Integer) cls3.getMethod(str2, Class.forName((String) objArr10[0]), Character.TYPE).invoke(null, objArr7)).intValue()), objArr11);
            String str3 = (String) objArr11[0];
            short s2 = (short) 1822;
            Object[] objArr12 = new Object[1];
            a(s2, bArr[343], bArr[78], objArr12);
            Class<?> cls4 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a((short) 1224, bArr[49], bArr[22], objArr13);
            int iIntValue3 = (((Integer) cls4.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 24) + 1;
            Object[] objArr14 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a((short) 286, bArr[7], bArr[78], objArr15);
            int iIntValue4 = ((Integer) cls5.getMethod((String) objArr15[0], Integer.TYPE).invoke(null, 0)).intValue() + 87;
            Object[] objArr16 = new Object[1];
            a(s2, bArr[343], bArr[78], objArr16);
            Class<?> cls6 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a((short) 282, bArr[24], bArr[22], objArr17);
            Object[] objArr18 = new Object[1];
            b(iIntValue3, iIntValue4, (char) (56458 - (((Integer) cls6.getMethod((String) objArr17[0], null).invoke(null, null)).intValue() >> 16)), objArr18);
            Object[] objArr19 = {(String) objArr18[0]};
            short s3 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr20 = new Object[1];
            a(s3, b, b, objArr20);
            Class<?> cls7 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr21);
            String str4 = (String) objArr21[0];
            byte b2 = bArr[106];
            Object[] objArr22 = new Object[1];
            a(s3, b2, b2, objArr22);
            Object[] objArr23 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr22[0])).invoke(str3, objArr19);
            int[] iArr = new int[objArr23.length];
            for (int i3 = 0; i3 < objArr23.length; i3++) {
                Object[] objArr24 = {objArr23[i3]};
                int i4 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr25 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr25);
                Class<?> cls8 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                a((short) (i4 | 1576), bArr2[12], bArr2[29], objArr26);
                String str5 = (String) objArr26[0];
                byte b3 = bArr2[106];
                Object[] objArr27 = new Object[1];
                a(s3, b3, b3, objArr27);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                Object[] objArr28 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr28);
                Class<?> cls9 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr29);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
            }
            while (true) {
                int i5 = i + 1;
                int i6 = 25;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        break;
                    case -12:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i7 = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = 19;
                        i = (i7 == 0 || i7 != 1) ? i6 : 1;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i = 26;
                        break;
                    case -9:
                        i = 28;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        i = hidescrubber.RemoteActionCompatParcelizer == 0 ? 17 : i5;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                        } catch (Throwable th2) {
                            th = th2;
                            if (i < 21 || i >= 25) {
                                throw th;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i = 18;
                        }
                        break;
                    case -5:
                        return;
                    case -4:
                        i = 9;
                        break;
                    case -3:
                        i = 7;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).AudioAttributesImplBaseParcelizer();
                        break;
                    case -1:
                        i = 4;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x02a7. Please report as an issue. */
    public static final /* synthetic */ int[] AudioAttributesCompatParcelizer() throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber();
        try {
            int i2 = 0;
            int i3 = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i3 | 1328), bArr[4], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 1174, bArr[14], bArr[22], objArr2);
            int iIntValue = 92 - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a((short) (i3 | 1664), bArr[622], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 1164, bArr[78], bArr[22], objArr4);
            int i4 = 434 - (((Long) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).longValue() == 0L ? 0 : -1));
            short s = (short) 1822;
            Object[] objArr5 = new Object[1];
            a(s, bArr[343], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) (i3 | 1248), bArr[189], bArr[22], objArr6);
            Object[] objArr7 = new Object[1];
            b(iIntValue, i4, (char) (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 8), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a(s, bArr[343], bArr[78], objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 1140, bArr[69], bArr[22], objArr9);
            int iIntValue2 = 1 - (((Integer) cls4.getMethod((String) objArr9[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr10 = new Object[1];
            a(s, bArr[343], bArr[78], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 1793, bArr[71], bArr[22], objArr11);
            int iIntValue3 = (((Integer) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 16) + 87;
            Object[] objArr12 = new Object[1];
            a(s, bArr[343], bArr[78], objArr12);
            Class<?> cls6 = Class.forName((String) objArr12[0]);
            char c = 'j';
            Object[] objArr13 = new Object[1];
            a((short) 1118, bArr[106], bArr[22], objArr13);
            Object[] objArr14 = new Object[1];
            b(iIntValue2, iIntValue3, (char) ((((Integer) cls6.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 8) + 56458), objArr14);
            Object[] objArr15 = {(String) objArr14[0]};
            short s2 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr16 = new Object[1];
            a(s2, b, b, objArr16);
            Class<?> cls7 = Class.forName((String) objArr16[0]);
            char c2 = '\f';
            Object[] objArr17 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr17);
            String str2 = (String) objArr17[0];
            byte b2 = bArr[106];
            Object[] objArr18 = new Object[1];
            a(s2, b2, b2, objArr18);
            Object[] objArr19 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr18[0])).invoke(str, objArr15);
            int[] iArr = new int[objArr19.length];
            int i5 = 0;
            while (i5 < objArr19.length) {
                Object[] objArr20 = {objArr19[i5]};
                int i6 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                byte b3 = bArr2[24];
                byte b4 = bArr2[c];
                Object[] objArr21 = new Object[1];
                a((short) (i6 | 1592), b3, b4, objArr21);
                Class<?> cls8 = Class.forName((String) objArr21[0]);
                Object[] objArr22 = new Object[1];
                a((short) (i6 | 1576), bArr2[c2], bArr2[29], objArr22);
                String str3 = (String) objArr22[0];
                byte b5 = bArr2[106];
                Object[] objArr23 = new Object[1];
                a(s2, b5, b5, objArr23);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr23[0])).invoke(null, objArr20);
                c = 'j';
                Object[] objArr24 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls9 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i6 | 1570), (byte) i6, bArr2[24], objArr25);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr25[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                c2 = '\f';
            }
            while (true) {
                int i7 = i2 + 1;
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i2])) {
                    case -15:
                        i2 = 8;
                        break;
                    case -14:
                        i2 = 29;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 28;
                        }
                        i2 = i7;
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = i7;
                        break;
                    case -11:
                        i = onPlay;
                        hidescrubber.IconCompatParcelizer = i;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i2 = i7;
                        break;
                    case -10:
                        i2 = 1;
                        break;
                    case -9:
                        i2 = 19;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 18;
                        }
                        i2 = i7;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = i7;
                        break;
                    case -6:
                        i = onPause;
                        hidescrubber.IconCompatParcelizer = i;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i2 = i7;
                        break;
                    case -5:
                        break;
                    case -4:
                        i2 = 10;
                        break;
                    case -3:
                        i2 = 20;
                        break;
                    case -2:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = write;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i2 = i7;
                        break;
                    case -1:
                        i2 = 3;
                        break;
                    default:
                        i2 = i7;
                        break;
                }
                hidescrubber.RemoteActionCompatParcelizer(5);
                return (int[]) hidescrubber.MediaBrowserCompatItemReceiver;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0684 A[Catch: all -> 0x0754, TryCatch #12 {all -> 0x0754, blocks: (B:96:0x066b, B:131:0x0731, B:106:0x067d, B:108:0x0684, B:109:0x0685, B:113:0x0697, B:118:0x06bb, B:123:0x06dd, B:124:0x06f9, B:130:0x0720, B:133:0x0737), top: B:284:0x066b }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0685 A[Catch: all -> 0x0754, TryCatch #12 {all -> 0x0754, blocks: (B:96:0x066b, B:131:0x0731, B:106:0x067d, B:108:0x0684, B:109:0x0685, B:113:0x0697, B:118:0x06bb, B:123:0x06dd, B:124:0x06f9, B:130:0x0720, B:133:0x0737), top: B:284:0x066b }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a24 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesImplBaseParcelizer() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.AudioAttributesImplBaseParcelizer():void");
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~i5;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i6 | i5 | i3));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i3 | i5)) | (~(i13 | i8)) | (~(i6 | i3));
        int i16 = i6 + i5 + i4 + ((-298151579) * i) + ((-427515960) * i2);
        int i17 = i16 * i16;
        int i18 = (i6 * (-431502880)) + 875560960 + ((-431502880) * i5) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i4) + ((-16252928) * i) + (423624704 * i2) + (1109590016 * i17);
        int i19 = ((i6 * (-2003555040)) - 1632655964) + (i5 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i4 * (-2003554617)) + (i * 1812671363) + (i2 * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? AudioAttributesCompatParcelizer(objArr) : write(objArr) : RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x040c  */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.AbstractList.remove(AbstractList.java:169)
        	at jadx.core.utils.ListUtils.removeLast(ListUtils.java:82)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.removeBreak(SwitchBreakVisitor.java:254)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$ExtractCommonBreak.processBranchRegion(SwitchBreakVisitor.java:110)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$ExtractCommonBreak.processRegion(SwitchBreakVisitor.java:64)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.enterRegion(SwitchBreakVisitor.java:202)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x02d9. Please report as an issue. */
    public static /* synthetic */ getShowPopup IconCompatParcelizer() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber();
        try {
            int i = 0;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) 1857, bArr[69], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 1835, bArr[66], bArr[69], objArr2);
            int i2 = 87 - (((Float) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            short s = (short) 1822;
            Object[] objArr3 = new Object[1];
            a(s, bArr[343], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 1793, bArr[71], bArr[22], objArr4);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16;
            Object[] objArr5 = new Object[1];
            a((short) 1770, bArr[6], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            int i3 = onPrepareFromMediaId;
            a((short) (i3 | 1744), bArr[112], bArr[4], new Object[1]);
            Object[] objArr6 = new Object[1];
            b(i2, iIntValue, (char) ((((Long) cls3.getMethod((String) r7[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) r7[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1), objArr6);
            String str = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            a((short) (i3 | 1730), bArr[6], bArr[78], objArr7);
            Class<?> cls4 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a((short) 1714, bArr[12], bArr[24], objArr8);
            String str2 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a((short) 1708, bArr[6], bArr[106], objArr9);
            int i4 = -((Integer) cls4.getMethod(str2, Class.forName((String) objArr9[0]), Character.TYPE).invoke(null, "", '0')).intValue();
            Object[] objArr10 = new Object[1];
            a(s, bArr[343], bArr[78], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            byte b = bArr[22];
            Object[] objArr11 = new Object[1];
            a((short) (i3 | 1682), b, b, objArr11);
            int iIntValue2 = (((Integer) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 16) + 87;
            Object[] objArr12 = {0L};
            Object[] objArr13 = new Object[1];
            a((short) (i3 | 1664), bArr[622], bArr[78], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) (i3 | 1632), bArr[6], bArr[22], objArr14);
            char cIntValue = (char) (56458 - ((Integer) cls6.getMethod((String) objArr14[0], Long.TYPE).invoke(null, objArr12)).intValue());
            Object[] objArr15 = new Object[1];
            b(i4, iIntValue2, cIntValue, objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            short s2 = (short) 1616;
            byte b2 = bArr[106];
            Object[] objArr17 = new Object[1];
            a(s2, b2, b2, objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr18);
            String str3 = (String) objArr18[0];
            byte b3 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b3, b3, objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            for (int i5 = 0; i5 < objArr20.length; i5++) {
                Object[] objArr21 = {objArr20[i5]};
                int i6 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr22 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr22);
                Class<?> cls8 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                a((short) (i6 | 1576), bArr2[12], bArr2[29], objArr23);
                String str4 = (String) objArr23[0];
                byte b4 = bArr2[106];
                Object[] objArr24 = new Object[1];
                a(s2, b4, b4, objArr24);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                Object[] objArr25 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr25);
                Class<?> cls9 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                a((short) (i6 | 1570), (byte) i6, bArr2[24], objArr26);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
            }
            while (true) {
                int i7 = i + 1;
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i = 1;
                        break;
                    case -12:
                        i = 29;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 28;
                        }
                        i = i7;
                        break;
                    case -10:
                        i = 6;
                        break;
                    case -9:
                        i7 = 18;
                        i = i7;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 17;
                        }
                        i = i7;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i = i7;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i = i7;
                        break;
                    case -5:
                        break;
                    case -4:
                        i = 19;
                        break;
                    case -3:
                        i = 8;
                        break;
                    case -2:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = RatingCompat();
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i = i7;
                        break;
                    case -1:
                        i = 3;
                        break;
                    default:
                        i = i7;
                        break;
                }
                hidescrubber.RemoteActionCompatParcelizer(5);
                return (getShowPopup) hidescrubber.MediaBrowserCompatItemReceiver;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(MoveableTextView moveableTextView) throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber(moveableTextView);
        short s = (short) 1770;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[6], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 1568, bArr[26], bArr[4], objArr2);
            int i2 = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 164;
            int i3 = onPrepareFromMediaId;
            Object[] objArr3 = new Object[1];
            a((short) (i3 | 1544), bArr[154], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 1521, bArr[12], bArr[22], objArr4);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue() + 88;
            Object[] objArr5 = {0L};
            Object[] objArr6 = new Object[1];
            a((short) (i3 | 1664), bArr[622], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            short s2 = (short) 1515;
            Object[] objArr7 = new Object[1];
            a(s2, bArr[6], bArr[22], objArr7);
            Object[] objArr8 = new Object[1];
            b(i2, iIntValue, (char) ((-1) - ((Integer) cls3.getMethod((String) objArr7[0], Long.TYPE).invoke(null, objArr5)).intValue()), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a((short) 1822, bArr[343], bArr[78], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((short) 1494, bArr[69], bArr[22], objArr10);
            int iIntValue2 = 1 - (((Integer) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr11 = new Object[1];
            a((short) (i3 | 1730), bArr[6], bArr[78], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr12);
            String str2 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a((short) 1708, bArr[6], bArr[106], objArr13);
            int iIntValue3 = 86 - ((Integer) cls5.getMethod(str2, Class.forName((String) objArr13[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue();
            Object[] objArr14 = {0L};
            Object[] objArr15 = new Object[1];
            a((short) (i3 | 1664), bArr[622], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(s2, bArr[6], bArr[22], objArr16);
            char cIntValue = (char) (56457 - ((Integer) cls6.getMethod((String) objArr16[0], Long.TYPE).invoke(null, objArr14)).intValue());
            Object[] objArr17 = new Object[1];
            b(iIntValue2, iIntValue3, cIntValue, objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s3 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s3, b, b, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b2 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s3, b2, b2, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str, objArr18);
            int[] iArr = new int[objArr22.length];
            for (int i4 = 0; i4 < objArr22.length; i4++) {
                try {
                    Object[] objArr23 = {objArr22[i4]};
                    int i5 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr24 = new Object[1];
                    a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr24);
                    Class<?> cls8 = Class.forName((String) objArr24[0]);
                    Object[] objArr25 = new Object[1];
                    a((short) (i5 | 1576), bArr2[12], bArr2[29], objArr25);
                    String str4 = (String) objArr25[0];
                    byte b3 = bArr2[106];
                    Object[] objArr26 = new Object[1];
                    a(s3, b3, b3, objArr26);
                    Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                    try {
                        Object[] objArr27 = new Object[1];
                        a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr27);
                        Class<?> cls9 = Class.forName((String) objArr27[0]);
                        Object[] objArr28 = new Object[1];
                        a((short) (i5 | 1570), (byte) i5, bArr2[24], objArr28);
                        iArr[i4] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i6])) {
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i6 = 45;
                        break;
                    case -17:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i8 = hidescrubber.RemoteActionCompatParcelizer;
                        if (i8 == 17 || i8 != 63) {
                            i6 = 1;
                        } else {
                            i7 = 34;
                            i6 = i7;
                        }
                        break;
                    case -16:
                        i6 = 40;
                        break;
                    case -15:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        i7 = hidescrubber.RemoteActionCompatParcelizer != 0 ? 20 : 8;
                        i6 = i7;
                        break;
                    case -14:
                        i6 = 46;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i6 = 48;
                        break;
                    case -12:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 32;
                        }
                        i6 = i7;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i6 = 41;
                        break;
                    case -9:
                        i6 = 43;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 18;
                        }
                        i6 = i7;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = i7;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i6 = i7;
                        } catch (Throwable th4) {
                            th = th4;
                            if (i6 >= 21 && i6 < 25) {
                                i = 19;
                            } else if (i6 < 36 || i6 >= 40) {
                                byte[] bArr3 = onMediaButtonEvent;
                                Object[] objArr29 = new Object[1];
                                a((short) 1462, bArr3[22], bArr3[106], objArr29);
                                if (!Class.forName((String) objArr29[0]).isInstance(th) || i6 < 35 || i6 >= 36) {
                                    throw th;
                                }
                                i = 50;
                            } else {
                                i = 33;
                            }
                            i6 = i;
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                        }
                        break;
                    case -5:
                        return;
                    case -4:
                        i6 = 25;
                        break;
                    case -3:
                        i6 = 10;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        AudioAttributesCompatParcelizer((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver);
                        i6 = i7;
                        break;
                    case -1:
                        i6 = 4;
                        break;
                    default:
                        i6 = i7;
                        break;
                }
            }
            throw th;
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 == null) {
                throw th5;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0468 A[Catch: all -> 0x04e7, TryCatch #3 {all -> 0x04e7, blocks: (B:48:0x0452, B:68:0x048a, B:59:0x0462, B:61:0x0468, B:62:0x0469, B:67:0x047f, B:70:0x0490, B:71:0x04a3, B:76:0x04c8, B:77:0x04d6, B:78:0x04d7), top: B:135:0x0452 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0469 A[Catch: all -> 0x04e7, TryCatch #3 {all -> 0x04e7, blocks: (B:48:0x0452, B:68:0x048a, B:59:0x0462, B:61:0x0468, B:62:0x0469, B:67:0x047f, B:70:0x0490, B:71:0x04a3, B:76:0x04c8, B:77:0x04d6, B:78:0x04d7), top: B:135:0x0452 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int MediaBrowserCompatSearchResultReceiver() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.MediaBrowserCompatSearchResultReceiver():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0581  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int MediaDescriptionCompat() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.MediaDescriptionCompat():int");
    }

    private final void MediaMetadataCompat() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        hideScrubber hidescrubber = new hideScrubber(this);
        try {
            int i = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr3 = new Object[1];
            a((short) (i | 1194), bArr[6], bArr[78], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 534, bArr[9], (byte) i, objArr4);
            int iIntValue = (-16777112) - ((Integer) cls.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue();
            Object[] objArr5 = new Object[1];
            a((short) 514, bArr[71], bArr[78], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 491, bArr[99], bArr[22], objArr6);
            int i2 = 3739 - (((Float) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            short s = (short) 1822;
            Object[] objArr7 = new Object[1];
            a(s, bArr[343], bArr[78], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a((short) 480, bArr[78], bArr[22], objArr8);
            char c = (char) (1 - (((Long) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)));
            Object[] objArr9 = new Object[1];
            b(iIntValue, i2, c, objArr9);
            String str = (String) objArr9[0];
            try {
                Object[] objArr10 = {0};
                Object[] objArr11 = new Object[1];
                a((short) (i | 1544), bArr[154], bArr[78], objArr11);
                Class<?> cls4 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                a((short) 456, bArr[12], bArr[22], objArr12);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, objArr10)).intValue() + 1;
                Object[] objArr13 = {Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED)};
                Object[] objArr14 = new Object[1];
                a((short) 1360, bArr[69], bArr[78], objArr14);
                Class<?> cls5 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                a((short) 1338, bArr[27], bArr[66], objArr15);
                int i3 = (((Float) cls5.getMethod((String) objArr15[0], Float.TYPE, Float.TYPE).invoke(null, objArr13)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls5.getMethod((String) objArr15[0], Float.TYPE, Float.TYPE).invoke(null, objArr13)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 87;
                Object[] objArr16 = new Object[1];
                a(s, bArr[343], bArr[78], objArr16);
                Class<?> cls6 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                a((short) 450, bArr[147], bArr[22], objArr17);
                Object[] objArr18 = new Object[1];
                b(iIntValue2, i3, (char) (56458 - (((Integer) cls6.getMethod((String) objArr17[0], null).invoke(null, null)).intValue() >> 16)), objArr18);
                Object[] objArr19 = {(String) objArr18[0]};
                short s2 = (short) 1616;
                char c2 = 'j';
                byte b = bArr[106];
                Object[] objArr20 = new Object[1];
                a(s2, b, b, objArr20);
                Class<?> cls7 = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                a((short) 1601, bArr[7], bArr[12], objArr21);
                String str2 = (String) objArr21[0];
                byte b2 = bArr[106];
                Object[] objArr22 = new Object[1];
                a(s2, b2, b2, objArr22);
                Object[] objArr23 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr22[0])).invoke(str, objArr19);
                int[] iArr = new int[objArr23.length];
                int i4 = 0;
                while (i4 < objArr23.length) {
                    Object[] objArr24 = {objArr23[i4]};
                    int i5 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr25 = new Object[1];
                    a((short) (i5 | 1592), bArr2[24], bArr2[c2], objArr25);
                    Class<?> cls8 = Class.forName((String) objArr25[0]);
                    Object[] objArr26 = new Object[1];
                    a((short) (i5 | 1576), bArr2[12], bArr2[29], objArr26);
                    String str3 = (String) objArr26[0];
                    byte b3 = bArr2[c2];
                    Object[] objArr27 = new Object[1];
                    a(s2, b3, b3, objArr27);
                    Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                    Object[] objArr28 = new Object[1];
                    a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr28);
                    Class<?> cls9 = Class.forName((String) objArr28[0]);
                    Object[] objArr29 = new Object[1];
                    a((short) (i5 | 1570), (byte) i5, bArr2[24], objArr29);
                    iArr[i4] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                    i4++;
                    c2 = 'j';
                }
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                    switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i6])) {
                        case -16:
                            hidescrubber.RemoteActionCompatParcelizer(5);
                            throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                        case -15:
                            i6 = 1;
                            break;
                        case -14:
                            i6 = 30;
                            break;
                        case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                            hidescrubber.RemoteActionCompatParcelizer(13);
                            i6 = hidescrubber.RemoteActionCompatParcelizer != 0 ? i7 : 29;
                            break;
                        case -12:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            onPlay = hidescrubber.RemoteActionCompatParcelizer;
                            break;
                        case -11:
                            hidescrubber.IconCompatParcelizer = onPause;
                            try {
                                hidescrubber.RemoteActionCompatParcelizer(6);
                            } catch (Throwable th2) {
                                th = th2;
                                short s3 = (short) 1462;
                                byte[] bArr3 = onMediaButtonEvent;
                                objArr = new Object[1];
                                a(s3, bArr3[22], bArr3[106], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th) || i6 < 9 || i6 >= 10) {
                                    objArr2 = new Object[1];
                                    a(s3, bArr3[22], bArr3[106], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th) || i6 < 14 || i6 >= 16) {
                                        throw th;
                                    }
                                }
                                hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                hidescrubber.RemoteActionCompatParcelizer(35);
                                i6 = 32;
                            }
                            break;
                        case -10:
                            i6 = 7;
                            break;
                        case -9:
                            i6 = 20;
                            break;
                        case -8:
                            hidescrubber.RemoteActionCompatParcelizer(38);
                            if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                i7 = 19;
                            }
                            break;
                        case -7:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            onPause = hidescrubber.RemoteActionCompatParcelizer;
                            break;
                        case -6:
                            hidescrubber.IconCompatParcelizer = onPlay;
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            break;
                        case -5:
                            return;
                        case -4:
                            i6 = 21;
                            break;
                        case -3:
                            i6 = 9;
                            break;
                        case -2:
                            try {
                                hidescrubber.IconCompatParcelizer = 2;
                                hidescrubber.RemoteActionCompatParcelizer(10);
                                hidescrubber.RemoteActionCompatParcelizer(17);
                                View view = (View) hidescrubber.MediaBrowserCompatItemReceiver;
                                hidescrubber.RemoteActionCompatParcelizer(11);
                                view.setVisibility(hidescrubber.RemoteActionCompatParcelizer);
                            } catch (Throwable th3) {
                                th = th3;
                                short s32 = (short) 1462;
                                byte[] bArr32 = onMediaButtonEvent;
                                objArr = new Object[1];
                                a(s32, bArr32[22], bArr32[106], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    break;
                                }
                                objArr2 = new Object[1];
                                a(s32, bArr32[22], bArr32[106], objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                            }
                            break;
                        case -1:
                            i6 = 4;
                            break;
                        default:
                            break;
                    }
                }
                throw th;
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause == null) {
                    throw th4;
                }
                throw cause;
            }
        } catch (Throwable th5) {
            Throwable cause2 = th5.getCause();
            if (cause2 == null) {
                throw th5;
            }
            throw cause2;
        }
    }

    private static final getShowPopup RatingCompat() throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber();
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) 322, bArr[26], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            int i2 = onPrepareFromMediaId;
            Object[] objArr2 = new Object[1];
            a((short) (i2 | 298), bArr[189], bArr[22], objArr2);
            int iIntValue = 167 - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a((short) (i2 | 1664), bArr[622], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 266, bArr[78], bArr[22], objArr4);
            int i3 = 4174 - (((Long) cls2.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() == 0L ? 0 : -1));
            short s = (short) 1822;
            Object[] objArr5 = new Object[1];
            a(s, bArr[343], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 242, bArr[99], bArr[22], objArr6);
            Object[] objArr7 = new Object[1];
            b(iIntValue, i3, (char) (26048 - (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 8)), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a(s, bArr[343], bArr[78], objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) (i2 | 226), bArr[69], bArr[22], objArr9);
            int iIntValue2 = 1 - (((Integer) cls4.getMethod((String) objArr9[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr10 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 1714, bArr[12], bArr[24], objArr11);
            String str2 = (String) objArr11[0];
            short s2 = (short) 1708;
            Object[] objArr12 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr12);
            Object[] objArr13 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr13);
            int iIntValue3 = ((Integer) cls5.getMethod(str2, Class.forName((String) objArr12[0]), Class.forName((String) objArr13[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue() + 87;
            Object[] objArr14 = {0, Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED)};
            Object[] objArr15 = new Object[1];
            a((short) 1857, bArr[69], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 1082, bArr[24], bArr[69], objArr16);
            char c = (char) ((((Float) cls6.getMethod((String) objArr16[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr14)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls6.getMethod((String) objArr16[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr14)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 56458);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, iIntValue3, c, objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s3 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s3, b, b, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b2 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s3, b2, b2, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str, objArr18);
            int[] iArr = new int[objArr22.length];
            for (int i4 = 0; i4 < objArr22.length; i4++) {
                Object[] objArr23 = {objArr22[i4]};
                int i5 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i5 | 1576), bArr2[12], bArr2[29], objArr25);
                String str4 = (String) objArr25[0];
                byte b3 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s3, b3, b3, objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a((short) (i5 | 1570), (byte) i5, bArr2[24], objArr28);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i6])) {
                    case -21:
                        i6 = 45;
                        break;
                    case -20:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i8 = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = (i8 == 0 || i8 != 1) ? 1 : 35;
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i6 = 40;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        if (hidescrubber.RemoteActionCompatParcelizer != 0) {
                            i7 = 19;
                            i6 = i7;
                        } else {
                            i6 = 7;
                        }
                        break;
                    case -17:
                        i6 = 46;
                        break;
                    case -16:
                        i6 = 48;
                        break;
                    case -15:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 33;
                        }
                        i6 = i7;
                        break;
                    case -14:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = i7;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i6 = i7;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i6 < 20 || i6 >= 24) {
                                short s4 = (short) 1462;
                                byte[] bArr3 = onMediaButtonEvent;
                                Object[] objArr29 = new Object[1];
                                a(s4, bArr3[22], bArr3[106], objArr29);
                                i6 = (Class.forName((String) objArr29[0]).isInstance(th) && i6 >= 24 && i6 < 25) ? 51 : 18;
                                Object[] objArr30 = new Object[1];
                                a(s4, bArr3[22], bArr3[106], objArr30);
                                if (Class.forName((String) objArr30[0]).isInstance(th) && i6 >= 28 && i6 < 30) {
                                    i6 = 50;
                                } else {
                                    if (i6 < 36 || i6 >= 40) {
                                        throw th;
                                    }
                                    i6 = 34;
                                }
                                hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                hidescrubber.RemoteActionCompatParcelizer(35);
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                        }
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.IconCompatParcelizer = hidescrubber.MediaBrowserCompatItemReceiver.hashCode();
                        i = 6;
                        hidescrubber.RemoteActionCompatParcelizer(i);
                        i6 = i7;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i6 = 41;
                        break;
                    case -9:
                        i6 = 43;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 17;
                        }
                        i6 = i7;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = i7;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        i = 6;
                        hidescrubber.RemoteActionCompatParcelizer(i);
                        i6 = i7;
                        break;
                    case -5:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        return (getShowPopup) hidescrubber.MediaBrowserCompatItemReceiver;
                    case -4:
                        i6 = 24;
                        break;
                    case -3:
                        i6 = 9;
                        break;
                    case -2:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = getShowPopup.INSTANCE;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i6 = i7;
                        break;
                    case -1:
                        i6 = 3;
                        break;
                    default:
                        i6 = i7;
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:406:0x1135  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x1146  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x116f  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x1173  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x1182 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static final void RemoteActionCompatParcelizer(MoveableTextView moveableTextView) throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber(moveableTextView);
        try {
            int i2 = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i2 | 1544), bArr[154], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 438, bArr[112], bArr[147], objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() + 152;
            Object[] objArr3 = new Object[1];
            a((short) 424, bArr[24], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 408, bArr[66], bArr[22], objArr4);
            int iIntValue2 = 3843 - ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr5 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 1714, bArr[12], bArr[24], objArr6);
            String str = (String) objArr6[0];
            short s = (short) 1708;
            Object[] objArr7 = new Object[1];
            a(s, bArr[6], bArr[106], objArr7);
            Object[] objArr8 = new Object[1];
            a(s, bArr[6], bArr[106], objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod(str, Class.forName((String) objArr7[0]), Class.forName((String) objArr8[0])).invoke(null, "", "")).intValue() + 64563), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = {0, Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED)};
            Object[] objArr11 = new Object[1];
            a((short) 1857, bArr[69], bArr[78], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 1082, bArr[24], bArr[69], objArr12);
            int i3 = 1 - (((Float) cls4.getMethod((String) objArr12[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr10)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls4.getMethod((String) objArr12[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr10)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            Object[] objArr13 = new Object[1];
            a((short) (i2 | 954), bArr[154], bArr[78], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 931, bArr[82], bArr[22], objArr14);
            int iCharValue = ((Character) cls5.getMethod((String) objArr14[0], Character.TYPE).invoke(null, '0')).charValue() + '\'';
            Object[] objArr15 = new Object[1];
            a((short) 1770, bArr[6], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            byte b = bArr[69];
            Object[] objArr16 = new Object[1];
            a((short) 395, b, b, objArr16);
            Object[] objArr17 = new Object[1];
            b(i3, iCharValue, (char) (56459 - (((Long) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1))), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s2 = (short) 1616;
            byte b2 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b2, b2, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b3 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s2, b3, b3, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            for (int i4 = 0; i4 < objArr22.length; i4++) {
                Object[] objArr23 = {objArr22[i4]};
                int i5 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i5 | 1576), bArr2[12], bArr2[29], objArr25);
                String str4 = (String) objArr25[0];
                byte b4 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s2, b4, b4, objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a((short) (i5 | 1570), (byte) i5, bArr2[24], objArr28);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i6])) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i6 = 40;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        if (hidescrubber.RemoteActionCompatParcelizer != 1) {
                            i6 = 35;
                        } else {
                            i7 = 8;
                            i6 = i7;
                        }
                        break;
                    case -17:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.IconCompatParcelizer = hidescrubber.MediaBrowserCompatItemReceiver.hashCode();
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i6 = i7;
                        } catch (Throwable th2) {
                            th = th2;
                            short s3 = (short) 1462;
                            byte[] bArr3 = onMediaButtonEvent;
                            Object[] objArr29 = new Object[1];
                            a(s3, bArr3[22], bArr3[106], objArr29);
                            if (Class.forName((String) objArr29[0]).isInstance(th) && i6 >= 23) {
                                if (i6 < 24) {
                                    i6 = 46;
                                }
                                hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                hidescrubber.RemoteActionCompatParcelizer(35);
                            }
                            Object[] objArr30 = new Object[1];
                            a(s3, bArr3[22], bArr3[106], objArr30);
                            if (Class.forName((String) objArr30[0]).isInstance(th) && i6 >= 28 && i6 < 29) {
                                i6 = 46;
                            } else {
                                if (i6 < 36 || i6 >= 40) {
                                    throw th;
                                }
                                i6 = 34;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                        }
                        break;
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -15:
                        i6 = 41;
                        break;
                    case -14:
                        i6 = 43;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 33;
                        }
                        i6 = i7;
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = i7;
                        break;
                    case -11:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        i = 6;
                        hidescrubber.RemoteActionCompatParcelizer(i);
                        i6 = i7;
                        break;
                    case -10:
                        i6 = 1;
                        break;
                    case -9:
                        i6 = 22;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 21;
                        }
                        i6 = i7;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = i7;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        i = 6;
                        hidescrubber.RemoteActionCompatParcelizer(i);
                        i6 = i7;
                        break;
                    case -5:
                        return;
                    case -4:
                        i6 = 10;
                        break;
                    case -3:
                        i6 = 23;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).MediaMetadataCompat();
                        i6 = i7;
                        break;
                    case -1:
                        i6 = 4;
                        break;
                    default:
                        i6 = i7;
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x04c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onAddQueueItem() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.onAddQueueItem():void");
    }

    public static /* synthetic */ void read(MoveableTextView moveableTextView) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(moveableTextView);
        try {
            int i = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i | 1664), bArr[622], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 1444, bArr[4], bArr[22], objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Long.TYPE).invoke(null, 0L)).intValue() + 99;
            Object[] objArr3 = new Object[1];
            a((short) (i | 1544), bArr[154], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 1521, bArr[12], bArr[22], objArr4);
            int iIntValue2 = 253 - ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr5 = {0};
            Object[] objArr6 = new Object[1];
            a((short) 1424, bArr[77], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((short) 1386, bArr[31], bArr[69], objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Double) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).doubleValue() > 0.0d ? 1 : (((Double) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).doubleValue() == 0.0d ? 0 : -1)), objArr8);
            String str = (String) objArr8[0];
            try {
                Object[] objArr9 = {Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED)};
                Object[] objArr10 = new Object[1];
                a((short) 1360, bArr[69], bArr[78], objArr10);
                Class<?> cls4 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                a((short) 1338, bArr[27], bArr[66], objArr11);
                int i2 = 1 - (((Float) cls4.getMethod((String) objArr11[0], Float.TYPE, Float.TYPE).invoke(null, objArr9)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls4.getMethod((String) objArr11[0], Float.TYPE, Float.TYPE).invoke(null, objArr9)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                Object[] objArr12 = new Object[1];
                a((short) (i | 1328), bArr[4], bArr[78], objArr12);
                Class<?> cls5 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                a((short) 1313, bArr[71], bArr[22], objArr13);
                int iIntValue3 = 86 - ((byte) ((Integer) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).intValue());
                Object[] objArr14 = {0};
                Object[] objArr15 = new Object[1];
                a((short) (i | 1328), bArr[4], bArr[78], objArr15);
                Class<?> cls6 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                a((short) 1290, bArr[189], bArr[99], objArr16);
                Object[] objArr17 = new Object[1];
                b(i2, iIntValue3, (char) (56458 - ((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, objArr14)).intValue()), objArr17);
                Object[] objArr18 = {(String) objArr17[0]};
                short s = (short) 1616;
                char c = 'j';
                byte b = bArr[106];
                Object[] objArr19 = new Object[1];
                a(s, b, b, objArr19);
                Class<?> cls7 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                a((short) 1601, bArr[7], bArr[12], objArr20);
                String str2 = (String) objArr20[0];
                byte b2 = bArr[106];
                Object[] objArr21 = new Object[1];
                a(s, b2, b2, objArr21);
                Object[] objArr22 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr21[0])).invoke(str, objArr18);
                int[] iArr = new int[objArr22.length];
                int i3 = 0;
                while (i3 < objArr22.length) {
                    Object[] objArr23 = {objArr22[i3]};
                    int i4 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr24 = new Object[1];
                    a((short) (i4 | 1592), bArr2[24], bArr2[c], objArr24);
                    Class<?> cls8 = Class.forName((String) objArr24[0]);
                    Object[] objArr25 = new Object[1];
                    a((short) (i4 | 1576), bArr2[12], bArr2[29], objArr25);
                    String str3 = (String) objArr25[0];
                    byte b3 = bArr2[c];
                    Object[] objArr26 = new Object[1];
                    a(s, b3, b3, objArr26);
                    Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                    Object[] objArr27 = new Object[1];
                    a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr27);
                    Class<?> cls9 = Class.forName((String) objArr27[0]);
                    Object[] objArr28 = new Object[1];
                    a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr28);
                    iArr[i3] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                    i3++;
                    c = 'j';
                }
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    try {
                    } catch (Throwable th) {
                        short s2 = (short) 1462;
                        byte[] bArr3 = onMediaButtonEvent;
                        Object[] objArr29 = new Object[1];
                        a(s2, bArr3[22], bArr3[106], objArr29);
                        if (!Class.forName((String) objArr29[0]).isInstance(th) || i5 < 9 || i5 >= 10) {
                            Object[] objArr30 = new Object[1];
                            a(s2, bArr3[22], bArr3[106], objArr30);
                            if (!Class.forName((String) objArr30[0]).isInstance(th) || i5 < 12 || i5 >= 14) {
                                throw th;
                            }
                        }
                        hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                        hidescrubber.RemoteActionCompatParcelizer(35);
                        i5 = 30;
                    }
                    switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i5])) {
                        case -16:
                            hidescrubber.RemoteActionCompatParcelizer(5);
                            throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                        case -15:
                            i5 = 1;
                            break;
                        case -14:
                            i5 = 28;
                            break;
                        case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                            hidescrubber.RemoteActionCompatParcelizer(13);
                            i5 = hidescrubber.RemoteActionCompatParcelizer != 0 ? i6 : 27;
                            break;
                        case -12:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            onPlay = hidescrubber.RemoteActionCompatParcelizer;
                            break;
                        case -11:
                            hidescrubber.IconCompatParcelizer = onPause;
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            break;
                        case -10:
                            i5 = 7;
                            break;
                        case -9:
                            i5 = 18;
                            break;
                        case -8:
                            hidescrubber.RemoteActionCompatParcelizer(38);
                            if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                i5 = 17;
                            }
                            break;
                        case -7:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            onPause = hidescrubber.RemoteActionCompatParcelizer;
                            break;
                        case -6:
                            hidescrubber.IconCompatParcelizer = onPlay;
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            break;
                        case -5:
                            return;
                        case -4:
                            i5 = 19;
                            break;
                        case -3:
                            i5 = 9;
                            break;
                        case -2:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(17);
                            RemoteActionCompatParcelizer((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver);
                            break;
                        case -1:
                            i5 = 4;
                            break;
                        default:
                            break;
                    }
                }
                throw th;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    public static final /* synthetic */ int[] read() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber();
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[343], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            int i = onPrepareFromMediaId;
            Object[] objArr2 = new Object[1];
            a((short) (i | 1098), bArr[6], bArr[22], objArr2);
            int i2 = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 96;
            Object[] objArr3 = new Object[1];
            a(s, bArr[343], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b = bArr[22];
            Object[] objArr4 = new Object[1];
            a((short) (i | 1682), b, b, objArr4);
            int iIntValue = (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) + 526;
            Object[] objArr5 = {0};
            Object[] objArr6 = new Object[1];
            a((short) 1424, bArr[77], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((short) 1386, bArr[31], bArr[69], objArr7);
            Object[] objArr8 = new Object[1];
            b(i2, iIntValue, (char) (20330 - (((Double) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).doubleValue() > 0.0d ? 1 : (((Double) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).doubleValue() == 0.0d ? 0 : -1))), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a((short) (i | 1328), bArr[4], bArr[78], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((short) 1236, bArr[147], bArr[22], objArr10);
            int iIntValue2 = 1 - (((Integer) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr11 = {0};
            Object[] objArr12 = new Object[1];
            a((short) (i | 1544), bArr[154], bArr[78], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            char c = '\f';
            Object[] objArr13 = new Object[1];
            a((short) 1521, bArr[12], bArr[22], objArr13);
            int iIntValue3 = ((Integer) cls5.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, objArr11)).intValue() + 87;
            try {
                Object[] objArr14 = new Object[1];
                a(s, bArr[343], bArr[78], objArr14);
                Class<?> cls6 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                a((short) 1793, bArr[71], bArr[22], objArr15);
                Object[] objArr16 = new Object[1];
                b(iIntValue2, iIntValue3, (char) ((((Integer) cls6.getMethod((String) objArr15[0], null).invoke(null, null)).intValue() >> 16) + 56458), objArr16);
                try {
                    Object[] objArr17 = {(String) objArr16[0]};
                    short s2 = (short) 1616;
                    char c2 = 'j';
                    byte b2 = bArr[106];
                    Object[] objArr18 = new Object[1];
                    a(s2, b2, b2, objArr18);
                    Class<?> cls7 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    a((short) 1601, bArr[7], bArr[12], objArr19);
                    String str2 = (String) objArr19[0];
                    byte b3 = bArr[106];
                    Object[] objArr20 = new Object[1];
                    a(s2, b3, b3, objArr20);
                    Object[] objArr21 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr20[0])).invoke(str, objArr17);
                    int[] iArr = new int[objArr21.length];
                    int i3 = 0;
                    while (i3 < objArr21.length) {
                        Object[] objArr22 = {objArr21[i3]};
                        int i4 = onPrepareFromMediaId;
                        byte[] bArr2 = onMediaButtonEvent;
                        byte b4 = bArr2[24];
                        byte b5 = bArr2[c2];
                        Object[] objArr23 = new Object[1];
                        a((short) (i4 | 1592), b4, b5, objArr23);
                        Class<?> cls8 = Class.forName((String) objArr23[0]);
                        Object[] objArr24 = new Object[1];
                        a((short) (i4 | 1576), bArr2[c], bArr2[29], objArr24);
                        String str3 = (String) objArr24[0];
                        byte b6 = bArr2[106];
                        Object[] objArr25 = new Object[1];
                        a(s2, b6, b6, objArr25);
                        Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                        Object[] objArr26 = new Object[1];
                        a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr26);
                        Class<?> cls9 = Class.forName((String) objArr26[0]);
                        Object[] objArr27 = new Object[1];
                        a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr27);
                        iArr[i3] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        c2 = 'j';
                        c = '\f';
                    }
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                        switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i5])) {
                            case -16:
                                hidescrubber.RemoteActionCompatParcelizer(5);
                                throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                            case -15:
                                i5 = 6;
                                break;
                            case -14:
                                i5 = 28;
                                break;
                            case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                                hidescrubber.RemoteActionCompatParcelizer(13);
                                if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                    i6 = 27;
                                }
                                i5 = i6;
                                break;
                            case -12:
                                hidescrubber.IconCompatParcelizer = 1;
                                hidescrubber.RemoteActionCompatParcelizer(10);
                                hidescrubber.RemoteActionCompatParcelizer(11);
                                onPlay = hidescrubber.RemoteActionCompatParcelizer;
                                i5 = i6;
                                break;
                            case -11:
                                hidescrubber.IconCompatParcelizer = onPause;
                                try {
                                    hidescrubber.RemoteActionCompatParcelizer(6);
                                    i5 = i6;
                                } catch (Throwable th2) {
                                    th = th2;
                                    short s3 = (short) 1462;
                                    byte[] bArr3 = onMediaButtonEvent;
                                    Object[] objArr28 = new Object[1];
                                    a(s3, bArr3[22], bArr3[106], objArr28);
                                    if (!Class.forName((String) objArr28[0]).isInstance(th) || i5 < 8 || i5 >= 9) {
                                        Object[] objArr29 = new Object[1];
                                        a(s3, bArr3[22], bArr3[106], objArr29);
                                        if (Class.forName((String) objArr29[0]).isInstance(th) && i5 >= 12 && i5 < 13) {
                                            i5 = 29;
                                        }
                                        Object[] objArr30 = new Object[1];
                                        a(s3, bArr3[22], bArr3[106], objArr30);
                                        if (!Class.forName((String) objArr30[0]).isInstance(th) || i5 < 19 || i5 >= 24) {
                                            throw th;
                                        }
                                        i5 = 30;
                                        hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                        hidescrubber.RemoteActionCompatParcelizer(35);
                                    } else {
                                        i5 = 30;
                                    }
                                    hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                    hidescrubber.RemoteActionCompatParcelizer(35);
                                }
                                break;
                            case -10:
                                i5 = 1;
                                break;
                            case -9:
                                i5 = 18;
                                break;
                            case -8:
                                hidescrubber.RemoteActionCompatParcelizer(38);
                                if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                    i6 = 17;
                                }
                                i5 = i6;
                                break;
                            case -7:
                                hidescrubber.IconCompatParcelizer = 1;
                                hidescrubber.RemoteActionCompatParcelizer(10);
                                hidescrubber.RemoteActionCompatParcelizer(11);
                                onPause = hidescrubber.RemoteActionCompatParcelizer;
                                i5 = i6;
                                break;
                            case -6:
                                hidescrubber.IconCompatParcelizer = onPlay;
                                hidescrubber.RemoteActionCompatParcelizer(6);
                                i5 = i6;
                                break;
                            case -5:
                                hidescrubber.RemoteActionCompatParcelizer(5);
                                return (int[]) hidescrubber.MediaBrowserCompatItemReceiver;
                            case -4:
                                i5 = 8;
                                break;
                            case -3:
                                i5 = 19;
                                break;
                            case -2:
                                hidescrubber.AudioAttributesImplApi21Parcelizer = AudioAttributesImplBaseParcelizer;
                                hidescrubber.RemoteActionCompatParcelizer(1);
                                i5 = i6;
                                break;
                            case -1:
                                i5 = 3;
                                break;
                            default:
                                i5 = i6;
                                break;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                Throwable cause2 = th4.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber();
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr2 = new Object[1];
            a(s, bArr[343], bArr[78], objArr2);
            int i = 0;
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a((short) 1273, bArr[4], bArr[22], objArr3);
            int iIntValue = (((Integer) cls.getMethod((String) objArr3[0], null).invoke(null, null)).intValue() >> 16) + 82;
            Object[] objArr4 = new Object[1];
            a(s, bArr[343], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            int i2 = onPrepareFromMediaId;
            Object[] objArr5 = new Object[1];
            a((short) (i2 | 1248), bArr[189], bArr[22], objArr5);
            int iIntValue2 = (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 8) + 352;
            Object[] objArr6 = new Object[1];
            a((short) (i2 | 1328), bArr[4], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((short) 1236, bArr[147], bArr[22], objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 16), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(s, bArr[343], bArr[78], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((short) 1224, bArr[49], bArr[22], objArr10);
            int iIntValue3 = 1 - (((Integer) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).intValue() >> 24);
            Object[] objArr11 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 1178, bArr[7], bArr[22], objArr12);
            int iIntValue4 = 87 - ((Integer) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr13 = new Object[1];
            a(s, bArr[343], bArr[78], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 1793, bArr[71], bArr[22], objArr14);
            Object[] objArr15 = new Object[1];
            b(iIntValue3, iIntValue4, (char) (56458 - (((Integer) cls6.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16)), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            short s2 = (short) 1616;
            char c = 'j';
            byte b = bArr[106];
            Object[] objArr17 = new Object[1];
            a(s2, b, b, objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            char c2 = '\f';
            Object[] objArr18 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr18);
            String str2 = (String) objArr18[0];
            byte b2 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b2, b2, objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            int i3 = 0;
            while (i3 < objArr20.length) {
                Object[] objArr21 = {objArr20[i3]};
                int i4 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr22 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[c], objArr22);
                Class<?> cls8 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                a((short) (i4 | 1576), bArr2[c2], bArr2[29], objArr23);
                String str3 = (String) objArr23[0];
                byte b3 = bArr2[c];
                Object[] objArr24 = new Object[1];
                a(s2, b3, b3, objArr24);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                Object[] objArr25 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr25);
                Class<?> cls9 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr26);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 'j';
                c2 = '\f';
            }
            while (true) {
                int i5 = i + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i = 22;
                        break;
                    case -12:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i6 = hidescrubber.RemoteActionCompatParcelizer;
                        i = 18;
                        if (i6 != 0 && i6 == 1) {
                            i = 1;
                        }
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i = 23;
                        break;
                    case -9:
                        i = 25;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        i = hidescrubber.RemoteActionCompatParcelizer != 0 ? i5 : 16;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                        } catch (Throwable th2) {
                            th = th2;
                            if (i < 19 || i >= 22) {
                                throw th;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i = 17;
                        }
                        break;
                    case -5:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        return (int[]) hidescrubber.MediaBrowserCompatItemReceiver;
                    case -4:
                        i = 8;
                        break;
                    case -3:
                        i = 6;
                        break;
                    case -2:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        break;
                    case -1:
                        i = 3;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    private final void write(int p0) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber((Object) this, p0);
        try {
            Object[] objArr = {0, Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED)};
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr2 = new Object[1];
            a((short) 1857, bArr[69], bArr[78], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a((short) 1082, bArr[24], bArr[69], objArr3);
            int i = (((Float) cls.getMethod((String) objArr3[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr3[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 108;
            int i2 = onPrepareFromMediaId;
            Object[] objArr4 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr5);
            String str = (String) objArr5[0];
            short s = (short) 1708;
            Object[] objArr6 = new Object[1];
            a(s, bArr[6], bArr[106], objArr6);
            int iIntValue = 4773 - ((Integer) cls2.getMethod(str, Class.forName((String) objArr6[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue();
            short s2 = (short) 1822;
            Object[] objArr7 = new Object[1];
            a(s2, bArr[343], bArr[78], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a((short) 362, bArr[24], bArr[22], objArr8);
            Object[] objArr9 = new Object[1];
            b(i, iIntValue, (char) ((((Integer) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).intValue() >> 16) + 51429), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 209, bArr[14], bArr[22], objArr11);
            String str3 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(s, bArr[6], bArr[106], objArr12);
            int iIntValue2 = 1 - ((Integer) cls4.getMethod(str3, Class.forName((String) objArr12[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", 0, 0)).intValue();
            Object[] objArr13 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 286, bArr[7], bArr[78], objArr14);
            int iIntValue3 = 87 - ((Integer) cls5.getMethod((String) objArr14[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr15 = new Object[1];
            a(s2, bArr[343], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) (i2 | 226), bArr[69], bArr[22], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, iIntValue3, (char) ((((Integer) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 16) + 56458), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s3 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s3, b, b, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            char c = '\f';
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str4 = (String) objArr20[0];
            byte b2 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s3, b2, b2, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            int i3 = 0;
            while (i3 < objArr22.length) {
                Object[] objArr23 = {objArr22[i3]};
                int i4 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i4 | 1576), bArr2[c], bArr2[29], objArr25);
                String str5 = (String) objArr25[0];
                byte b3 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s3, b3, b3, objArr26);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                byte b4 = bArr2[24];
                Object[] objArr28 = new Object[1];
                a((short) (i4 | 1570), (byte) i4, b4, objArr28);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = '\f';
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                int iRemoteActionCompatParcelizer = hidescrubber.RemoteActionCompatParcelizer(iArr[i5]);
                i5 = 10;
                switch (iRemoteActionCompatParcelizer) {
                    case -15:
                        break;
                    case -14:
                        i5 = 33;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 32;
                        }
                        i5 = i6;
                        break;
                    case -12:
                        i5 = 1;
                        break;
                    case -11:
                        i5 = 22;
                        break;
                    case -10:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 21;
                        }
                        i5 = i6;
                        break;
                    case -9:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i5 = i6;
                        break;
                    case -8:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i5 = i6;
                        break;
                    case -7:
                        return;
                    case -6:
                        i5 = 12;
                        break;
                    case -5:
                        i5 = 23;
                        break;
                    case -4:
                        hidescrubber.IconCompatParcelizer = 3;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        View view = (View) hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        int i7 = hidescrubber.RemoteActionCompatParcelizer;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        view.setTag(i7, hidescrubber.MediaBrowserCompatItemReceiver);
                        i5 = i6;
                        break;
                    case -3:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        Object[] objArr29 = {Integer.valueOf(hidescrubber.RemoteActionCompatParcelizer)};
                        int i8 = onPrepareFromMediaId;
                        byte[] bArr3 = onMediaButtonEvent;
                        Object[] objArr30 = new Object[1];
                        a((short) (i8 | 1592), bArr3[24], bArr3[106], objArr30);
                        Class<?> cls10 = Class.forName((String) objArr30[0]);
                        Object[] objArr31 = new Object[1];
                        a((short) (i8 | 1576), bArr3[12], bArr3[29], objArr31);
                        hidescrubber.AudioAttributesImplApi21Parcelizer = cls10.getMethod((String) objArr31[0], Integer.TYPE).invoke(null, objArr29);
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i5 = i6;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = R.id.tag_moveable_textview_current_index;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i5 = i6;
                        break;
                    case -1:
                        i5 = 7;
                        break;
                    default:
                        i5 = i6;
                        break;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final /* synthetic */ int[] write() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber();
        try {
            Object[] objArr = {0, Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(BitmapDescriptorFactory.HUE_RED)};
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr2 = new Object[1];
            a((short) 1857, bArr[69], bArr[78], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a((short) 1082, bArr[24], bArr[69], objArr3);
            int i = 100 - (((Float) cls.getMethod((String) objArr3[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr3[0], Integer.TYPE, Float.TYPE, Float.TYPE).invoke(null, objArr)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int i2 = onPrepareFromMediaId;
            Object[] objArr4 = new Object[1];
            a((short) (i2 | 1328), bArr[4], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a((short) 1066, bArr[24], bArr[112], objArr5);
            String str = (String) objArr5[0];
            short s = (short) 1616;
            byte b = bArr[106];
            Object[] objArr6 = new Object[1];
            a(s, b, b, objArr6);
            int iIntValue = ((Integer) cls2.getMethod(str, Class.forName((String) objArr6[0])).invoke(null, "")).intValue() + 623;
            Object[] objArr7 = {0, 0};
            Object[] objArr8 = new Object[1];
            a((short) (i2 | 1328), bArr[4], bArr[78], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 1174, bArr[14], bArr[22], objArr9);
            Object[] objArr10 = new Object[1];
            b(i, iIntValue, (char) ((Integer) cls3.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr7)).intValue(), objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 1714, bArr[12], bArr[24], objArr12);
            String str3 = (String) objArr12[0];
            short s2 = (short) 1708;
            Object[] objArr13 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr13);
            Object[] objArr14 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr14);
            int iIntValue2 = ((Integer) cls4.getMethod(str3, Class.forName((String) objArr13[0]), Class.forName((String) objArr14[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue() + 1;
            Object[] objArr15 = {0};
            Object[] objArr16 = new Object[1];
            a((short) 1050, bArr[189], bArr[78], objArr16);
            Class<?> cls5 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a((short) 1033, bArr[24], bArr[22], objArr17);
            int iIntValue3 = 87 - ((((Integer) cls5.getMethod((String) objArr17[0], Integer.TYPE).invoke(null, objArr15)).intValue() + 20) >> 6);
            try {
                Object[] objArr18 = {0L};
                Object[] objArr19 = new Object[1];
                a((short) (i2 | 1664), bArr[622], bArr[78], objArr19);
                Class<?> cls6 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                a((short) 1515, bArr[6], bArr[22], objArr20);
                Object[] objArr21 = new Object[1];
                b(iIntValue2, iIntValue3, (char) (((Integer) cls6.getMethod((String) objArr20[0], Long.TYPE).invoke(null, objArr18)).intValue() + 56459), objArr21);
                Object[] objArr22 = {(String) objArr21[0]};
                byte b2 = bArr[106];
                Object[] objArr23 = new Object[1];
                a(s, b2, b2, objArr23);
                Class<?> cls7 = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                a((short) 1601, bArr[7], bArr[12], objArr24);
                String str4 = (String) objArr24[0];
                byte b3 = bArr[106];
                Object[] objArr25 = new Object[1];
                a(s, b3, b3, objArr25);
                Object[] objArr26 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr25[0])).invoke(str2, objArr22);
                int[] iArr = new int[objArr26.length];
                for (int i3 = 0; i3 < objArr26.length; i3++) {
                    Object[] objArr27 = {objArr26[i3]};
                    int i4 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr28 = new Object[1];
                    a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr28);
                    Class<?> cls8 = Class.forName((String) objArr28[0]);
                    Object[] objArr29 = new Object[1];
                    a((short) (i4 | 1576), bArr2[12], bArr2[29], objArr29);
                    String str5 = (String) objArr29[0];
                    byte b4 = bArr2[106];
                    Object[] objArr30 = new Object[1];
                    a(s, b4, b4, objArr30);
                    Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr30[0])).invoke(null, objArr27);
                    Object[] objArr31 = new Object[1];
                    a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr31);
                    Class<?> cls9 = Class.forName((String) objArr31[0]);
                    Object[] objArr32 = new Object[1];
                    a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr32);
                    iArr[i3] = ((Integer) cls9.getMethod((String) objArr32[0], null).invoke(objInvoke, null)).intValue();
                }
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                    switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i5])) {
                        case -16:
                            hidescrubber.RemoteActionCompatParcelizer(5);
                            throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                        case -15:
                            i5 = 6;
                            break;
                        case -14:
                            i5 = 29;
                            break;
                        case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                            hidescrubber.RemoteActionCompatParcelizer(13);
                            if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                i6 = 28;
                            }
                            i5 = i6;
                            break;
                        case -12:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            onPlay = hidescrubber.RemoteActionCompatParcelizer;
                            i5 = i6;
                            break;
                        case -11:
                            hidescrubber.IconCompatParcelizer = onPause;
                            try {
                                hidescrubber.RemoteActionCompatParcelizer(6);
                                i5 = i6;
                            } catch (Throwable th2) {
                                th = th2;
                                short s3 = (short) 1462;
                                byte[] bArr3 = onMediaButtonEvent;
                                Object[] objArr33 = new Object[1];
                                a(s3, bArr3[22], bArr3[106], objArr33);
                                if (!Class.forName((String) objArr33[0]).isInstance(th) || i5 < 8 || i5 >= 9) {
                                    Object[] objArr34 = new Object[1];
                                    a(s3, bArr3[22], bArr3[106], objArr34);
                                    if (Class.forName((String) objArr34[0]).isInstance(th) && i5 >= 12 && i5 < 13) {
                                    }
                                    Object[] objArr35 = new Object[1];
                                    a(s3, bArr3[22], bArr3[106], objArr35);
                                    if (!Class.forName((String) objArr35[0]).isInstance(th) || i5 < 19 || i5 >= 25) {
                                        throw th;
                                    }
                                    hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                    hidescrubber.RemoteActionCompatParcelizer(35);
                                    i5 = 30;
                                }
                                hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                hidescrubber.RemoteActionCompatParcelizer(35);
                                i5 = 30;
                            }
                            break;
                        case -10:
                            i5 = 1;
                            break;
                        case -9:
                            i5 = 18;
                            break;
                        case -8:
                            hidescrubber.RemoteActionCompatParcelizer(38);
                            if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                i6 = 17;
                            }
                            i5 = i6;
                            break;
                        case -7:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            onPause = hidescrubber.RemoteActionCompatParcelizer;
                            i5 = i6;
                            break;
                        case -6:
                            hidescrubber.IconCompatParcelizer = onPlay;
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i5 = i6;
                            break;
                        case -5:
                            hidescrubber.RemoteActionCompatParcelizer(5);
                            return (int[]) hidescrubber.MediaBrowserCompatItemReceiver;
                        case -4:
                            i5 = 8;
                            break;
                        case -3:
                            i5 = 19;
                            break;
                        case -2:
                            hidescrubber.AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi26Parcelizer;
                            hidescrubber.RemoteActionCompatParcelizer(1);
                            i5 = i6;
                            break;
                        case -1:
                            i5 = 3;
                            break;
                        default:
                            i5 = i6;
                            break;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            Throwable cause2 = th4.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th4;
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber(this);
        try {
            int i2 = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) TarConstants.PREFIXLEN, bArr[9], (byte) i2, objArr2);
            int iIntValue = 173 - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a((short) 424, bArr[24], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 83, bArr[4], bArr[69], objArr4);
            int iIntValue2 = 8222 - ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr5 = {"", '0'};
            Object[] objArr6 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            short s = (short) 1714;
            Object[] objArr7 = new Object[1];
            a(s, bArr[12], bArr[24], objArr7);
            String str = (String) objArr7[0];
            short s2 = (short) 1708;
            Object[] objArr8 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((-1) - ((Integer) cls3.getMethod(str, Class.forName((String) objArr8[0]), Character.TYPE).invoke(null, objArr5)).intValue()), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(s, bArr[12], bArr[24], objArr11);
            String str3 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr12);
            int i3 = -((Integer) cls4.getMethod(str3, Class.forName((String) objArr12[0]), Character.TYPE).invoke(null, "", '0')).intValue();
            Object[] objArr13 = new Object[1];
            a((short) 1822, bArr[343], bArr[78], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            byte b = bArr[22];
            Object[] objArr14 = new Object[1];
            a((short) (i2 | 1682), b, b, objArr14);
            int iIntValue3 = (((Integer) cls5.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16) + 87;
            Object[] objArr15 = {0, 0};
            Object[] objArr16 = new Object[1];
            a((short) AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, bArr[541], bArr[78], objArr16);
            Class<?> cls6 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a((short) 984, bArr[66], (byte) i2, objArr17);
            Object[] objArr18 = new Object[1];
            b(i3, iIntValue3, (char) (((Integer) cls6.getMethod((String) objArr17[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr15)).intValue() + 56458), objArr18);
            Object[] objArr19 = {(String) objArr18[0]};
            short s3 = (short) 1616;
            byte b2 = bArr[106];
            Object[] objArr20 = new Object[1];
            a(s3, b2, b2, objArr20);
            Class<?> cls7 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr21);
            String str4 = (String) objArr21[0];
            byte b3 = bArr[106];
            Object[] objArr22 = new Object[1];
            a(s3, b3, b3, objArr22);
            Object[] objArr23 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr22[0])).invoke(str2, objArr19);
            int[] iArr = new int[objArr23.length];
            for (int i4 = 0; i4 < objArr23.length; i4++) {
                try {
                    Object[] objArr24 = {objArr23[i4]};
                    int i5 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr25 = new Object[1];
                    a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr25);
                    Class<?> cls8 = Class.forName((String) objArr25[0]);
                    Object[] objArr26 = new Object[1];
                    a((short) (i5 | 1576), bArr2[12], bArr2[29], objArr26);
                    String str5 = (String) objArr26[0];
                    byte b4 = bArr2[106];
                    Object[] objArr27 = new Object[1];
                    a(s3, b4, b4, objArr27);
                    Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                    Object[] objArr28 = new Object[1];
                    a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr28);
                    Class<?> cls9 = Class.forName((String) objArr28[0]);
                    Object[] objArr29 = new Object[1];
                    a((short) (i5 | 1570), (byte) i5, bArr2[24], objArr29);
                    iArr[i4] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                int i8 = 35;
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i6])) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i6 = 48;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i9 = hidescrubber.RemoteActionCompatParcelizer;
                        i8 = 8;
                        i6 = (i9 == 8 || i9 != 50) ? 22 : i8;
                        break;
                    case -17:
                        i6 = 43;
                        break;
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i10 = hidescrubber.RemoteActionCompatParcelizer;
                        if (i10 != 0 && i10 == 1) {
                            i6 = 1;
                        }
                        i7 = 37;
                        i6 = i7;
                        break;
                    case -15:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.IconCompatParcelizer = hidescrubber.MediaBrowserCompatItemReceiver.hashCode();
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i6 = i7;
                        } catch (Throwable th3) {
                            th = th3;
                            if (i6 >= 23 && i6 < 26) {
                                i = 21;
                            } else {
                                if (i6 < 39 || i6 >= 43) {
                                    throw th;
                                }
                                i = 36;
                            }
                            i6 = i;
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                        }
                        break;
                    case -14:
                        i6 = 44;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i6 = 46;
                        break;
                    case -12:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer != 0) {
                            i6 = i7;
                        }
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i6 = 49;
                        break;
                    case -9:
                        i6 = 51;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 20;
                        }
                        i6 = i7;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = i7;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i6 = i7;
                        break;
                    case -5:
                        return;
                    case -4:
                        i6 = 26;
                        break;
                    case -3:
                        i6 = 10;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).AudioAttributesImplBaseParcelizer();
                        i6 = i7;
                        break;
                    case -1:
                        i6 = 4;
                        break;
                    default:
                        i6 = i7;
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause2 = th4.getCause();
            if (cause2 == null) {
                throw th4;
            }
            throw cause2;
        }
    }

    public final String[] getBlinkerTexts() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this);
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[343], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 186, bArr[24], bArr[22], objArr2);
            int i = (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 145;
            int i2 = onPrepareFromMediaId;
            Object[] objArr3 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 170, bArr[106], bArr[22], objArr4);
            String str = (String) objArr4[0];
            short s2 = (short) 1708;
            Object[] objArr5 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr5);
            int iIntValue = 4984 - ((Integer) cls2.getMethod(str, Class.forName((String) objArr5[0])).invoke(null, "")).intValue();
            Object[] objArr6 = {"", '0', 0, 0};
            Object[] objArr7 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr8);
            String str2 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr9);
            Object[] objArr10 = new Object[1];
            b(i, iIntValue, (char) ((-1) - ((Integer) cls3.getMethod(str2, Class.forName((String) objArr9[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6)).intValue()), objArr10);
            String str3 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            char c = '\f';
            Object[] objArr12 = new Object[1];
            a((short) 1714, bArr[12], bArr[24], objArr12);
            String str4 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr13);
            int i3 = -((Integer) cls4.getMethod(str4, Class.forName((String) objArr13[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue();
            Object[] objArr14 = new Object[1];
            a((short) 1770, bArr[6], bArr[78], objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a((short) (i2 | 368), bArr[99], bArr[7], objArr15);
            int i4 = (((Long) cls5.getMethod((String) objArr15[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr15[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 86;
            Object[] objArr16 = {0};
            Object[] objArr17 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr17);
            Class<?> cls6 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            a((short) TarConstants.PREFIXLEN, bArr[9], (byte) i2, objArr18);
            Object[] objArr19 = new Object[1];
            b(i3, i4, (char) (((Integer) cls6.getMethod((String) objArr18[0], Integer.TYPE).invoke(null, objArr16)).intValue() + 56458), objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            short s3 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s3, b, b, objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr22);
            String str5 = (String) objArr22[0];
            byte b2 = bArr[106];
            Object[] objArr23 = new Object[1];
            a(s3, b2, b2, objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str5, Class.forName((String) objArr23[0])).invoke(str3, objArr20);
            int[] iArr = new int[objArr24.length];
            int i5 = 0;
            while (i5 < objArr24.length) {
                Object[] objArr25 = {objArr24[i5]};
                int i6 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr26 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a((short) (i6 | 1576), bArr2[c], bArr2[29], objArr27);
                String str6 = (String) objArr27[0];
                byte b3 = bArr2[106];
                Object[] objArr28 = new Object[1];
                a(s3, b3, b3, objArr28);
                Object objInvoke = cls8.getMethod(str6, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                Object[] objArr29 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr29);
                Class<?> cls9 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                a((short) (i6 | 1570), (byte) i6, bArr2[24], objArr30);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                c = '\f';
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i7])) {
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i7 = 38;
                        break;
                    case -17:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        if (hidescrubber.RemoteActionCompatParcelizer == 49) {
                            i7 = 9;
                        } else {
                            i8 = 33;
                            i7 = i8;
                        }
                        break;
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -15:
                        i7 = 39;
                        break;
                    case -14:
                        i7 = 41;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i8 = 31;
                        }
                        i7 = i8;
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i7 = i8;
                        break;
                    case -11:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i7 = i8;
                        } catch (Throwable th2) {
                            th = th2;
                            byte[] bArr3 = onMediaButtonEvent;
                            Object[] objArr31 = new Object[1];
                            a((short) 1462, bArr3[22], bArr3[106], objArr31);
                            if (Class.forName((String) objArr31[0]).isInstance(th) && i7 >= 22 && i7 < 28) {
                                i7 = 44;
                            } else {
                                if (i7 < 34 || i7 >= 38) {
                                    throw th;
                                }
                                i7 = 32;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                        }
                        break;
                    case -10:
                        i7 = 1;
                        break;
                    case -9:
                        i7 = 21;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i8 = 20;
                        }
                        i7 = i8;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i7 = i8;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i7 = i8;
                        break;
                    case -5:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        return (String[]) hidescrubber.MediaBrowserCompatItemReceiver;
                    case -4:
                        i7 = 11;
                        break;
                    case -3:
                        i7 = 22;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.AudioAttributesImplApi21Parcelizer = ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).blinkerTexts;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i7 = i8;
                        break;
                    case -1:
                        i7 = 4;
                        break;
                    default:
                        i7 = i8;
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    public final Runnable getHideRunner() throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber(this);
        short s = (short) 1770;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[6], bArr[78], objArr);
            int i2 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            int i3 = onPrepareFromMediaId;
            Object[] objArr2 = new Object[1];
            a((short) (i3 | 1744), bArr[112], bArr[4], objArr2);
            int i4 = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
            Object[] objArr3 = new Object[1];
            a((short) AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, bArr[541], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 984, bArr[66], (byte) i3, objArr4);
            int iIntValue = 5130 - ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr5 = new Object[1];
            a((short) (i3 | 1730), bArr[6], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 1714, bArr[12], bArr[24], objArr6);
            String str = (String) objArr6[0];
            short s2 = (short) 1708;
            Object[] objArr7 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr7);
            Object[] objArr8 = new Object[1];
            a(s2, bArr[6], bArr[106], objArr8);
            Object[] objArr9 = new Object[1];
            b(i4, iIntValue, (char) (49549 - ((Integer) cls3.getMethod(str, Class.forName((String) objArr7[0]), Class.forName((String) objArr8[0])).invoke(null, "", "")).intValue()), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a((short) 322, bArr[26], bArr[78], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) (i3 | 298), bArr[189], bArr[22], objArr11);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() + 1;
            Object[] objArr12 = new Object[1];
            a((short) 153, bArr[542], bArr[78], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a((short) 126, bArr[112], bArr[22], objArr13);
            int iIntValue3 = 86 - ((Integer) cls5.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr14 = new Object[1];
            a((short) 1822, bArr[343], bArr[78], objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            byte b = bArr[22];
            Object[] objArr15 = new Object[1];
            a((short) 112, b, b, objArr15);
            Object[] objArr16 = new Object[1];
            b(iIntValue2, iIntValue3, (char) (56458 - (((Integer) cls6.getMethod((String) objArr15[0], null).invoke(null, null)).intValue() >> 16)), objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            short s3 = (short) 1616;
            byte b2 = bArr[106];
            Object[] objArr18 = new Object[1];
            a(s3, b2, b2, objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            Object[] objArr19 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr19);
            String str3 = (String) objArr19[0];
            byte b3 = bArr[106];
            Object[] objArr20 = new Object[1];
            a(s3, b3, b3, objArr20);
            Object[] objArr21 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr20[0])).invoke(str2, objArr17);
            int[] iArr = new int[objArr21.length];
            for (int i5 = 0; i5 < objArr21.length; i5++) {
                Object[] objArr22 = {objArr21[i5]};
                int i6 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr23 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr23);
                Class<?> cls8 = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                a((short) (i6 | 1576), bArr2[12], bArr2[29], objArr24);
                String str4 = (String) objArr24[0];
                byte b4 = bArr2[106];
                Object[] objArr25 = new Object[1];
                a(s3, b4, b4, objArr25);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                Object[] objArr26 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr26);
                Class<?> cls9 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a((short) (i6 | 1570), (byte) i6, bArr2[24], objArr27);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
            }
            while (true) {
                int i7 = i2 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i2])) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i2 = 35;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i8 = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = 20;
                        if (i8 != 0 && i8 == 1) {
                            i7 = 8;
                            i2 = i7;
                        }
                        break;
                    case -17:
                        i2 = 1;
                        break;
                    case -16:
                        i2 = 34;
                        break;
                    case -15:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 33;
                        }
                        i2 = i7;
                        break;
                    case -14:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = i7;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i2 = i7;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i2 < 21 || i2 >= 25) {
                                throw th;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i2 = 19;
                        }
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.IconCompatParcelizer = hidescrubber.MediaBrowserCompatItemReceiver.hashCode();
                        i = 6;
                        hidescrubber.RemoteActionCompatParcelizer(i);
                        i2 = i7;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i2 = 36;
                        break;
                    case -9:
                        i2 = 38;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 18;
                        }
                        i2 = i7;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = i7;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        i = 6;
                        hidescrubber.RemoteActionCompatParcelizer(i);
                        i2 = i7;
                        break;
                    case -5:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        return (Runnable) hidescrubber.MediaBrowserCompatItemReceiver;
                    case -4:
                        i2 = 25;
                        break;
                    case -3:
                        i2 = 10;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.AudioAttributesImplApi21Parcelizer = ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).hideRunner;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i2 = i7;
                        break;
                    case -1:
                        i2 = 4;
                        break;
                    default:
                        i2 = i7;
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    public final Runnable getMoveRunner() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this);
        try {
            Object[] objArr = {0, 0, 0};
            int i = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr2 = new Object[1];
            a((short) (i | 1194), bArr[6], bArr[78], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a((short) 534, bArr[9], (byte) i, objArr3);
            int iIntValue = (-16777107) - ((Integer) cls.getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr)).intValue();
            Object[] objArr4 = new Object[1];
            a((short) (i | 1730), bArr[6], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a((short) (i | 194), bArr[66], bArr[22], objArr5);
            String str = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            a((short) 1708, bArr[6], bArr[106], objArr6);
            int iIntValue2 = 5261 - ((Integer) cls2.getMethod(str, Class.forName((String) objArr6[0]), Integer.TYPE).invoke(null, "", 0)).intValue();
            short s = (short) 1822;
            Object[] objArr7 = new Object[1];
            a(s, bArr[343], bArr[78], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a((short) 480, bArr[78], bArr[22], objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((((Long) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 16971), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(s, bArr[343], bArr[78], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 1224, bArr[49], bArr[22], objArr11);
            char c = 24;
            int iIntValue3 = 1 - (((Integer) cls4.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 24);
            Object[] objArr12 = new Object[1];
            a(s, bArr[343], bArr[78], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a((short) 1494, bArr[69], bArr[22], objArr13);
            int iIntValue4 = 87 - (((Integer) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr14 = {0, 0};
            Object[] objArr15 = new Object[1];
            a((short) (i | 1328), bArr[4], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 1174, bArr[14], bArr[22], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue3, iIntValue4, (char) (((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr14)).intValue() + 56458), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s2 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b, b, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            char c2 = '\f';
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b2 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s2, b2, b2, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            int i2 = 0;
            while (i2 < objArr22.length) {
                Object[] objArr23 = {objArr22[i2]};
                int i3 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i3 | 1592), bArr2[c], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i3 | 1576), bArr2[c2], bArr2[29], objArr25);
                String str4 = (String) objArr25[0];
                byte b3 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s2, b3, b3, objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i3 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a((short) (i3 | 1570), (byte) i3, bArr2[24], objArr28);
                iArr[i2] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i2++;
                c = 24;
                c2 = '\f';
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i4])) {
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -15:
                        i4 = 8;
                        break;
                    case -14:
                        i4 = 31;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 30;
                        }
                        i4 = i5;
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i4 = i5;
                        break;
                    case -11:
                        hidescrubber.IconCompatParcelizer = onPause;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i4 = i5;
                        } catch (Throwable th2) {
                            th = th2;
                            short s3 = (short) 1462;
                            byte[] bArr3 = onMediaButtonEvent;
                            Object[] objArr29 = new Object[1];
                            a(s3, bArr3[22], bArr3[106], objArr29);
                            if (!Class.forName((String) objArr29[0]).isInstance(th) || i4 < 10 || i4 >= 11) {
                                Object[] objArr30 = new Object[1];
                                a(s3, bArr3[22], bArr3[106], objArr30);
                                if (!Class.forName((String) objArr30[0]).isInstance(th) || i4 < 13 || i4 >= 15) {
                                    throw th;
                                }
                                i4 = 32;
                            } else {
                                i4 = 33;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                        }
                        break;
                    case -10:
                        i4 = 1;
                        break;
                    case -9:
                        i4 = 19;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 18;
                        }
                        i4 = i5;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i4 = i5;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i4 = i5;
                        break;
                    case -5:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        return (Runnable) hidescrubber.MediaBrowserCompatItemReceiver;
                    case -4:
                        i4 = 10;
                        break;
                    case -3:
                        i4 = 20;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.AudioAttributesImplApi21Parcelizer = ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).moveRunner;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i4 = i5;
                        break;
                    case -1:
                        i4 = 4;
                        break;
                    default:
                        i4 = i5;
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    public final getCreatedOnDateMs<getShowPopup> getOnMoveListener() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this);
        short s = (short) 514;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[71], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 94, bArr[99], bArr[22], objArr2);
            int i = 99 - (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            Object[] objArr3 = new Object[1];
            a((short) 1822, bArr[343], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 1793, bArr[71], bArr[22], objArr4);
            int iIntValue = (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) + 5370;
            int i2 = onPrepareFromMediaId;
            Object[] objArr5 = new Object[1];
            a((short) (i2 | 1328), bArr[4], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 1313, bArr[71], bArr[22], objArr6);
            Object[] objArr7 = new Object[1];
            b(i, iIntValue, (char) (20788 - ((byte) ((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue())), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a((short) 424, bArr[24], bArr[78], objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 83, bArr[4], bArr[69], objArr9);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() + 1;
            Object[] objArr10 = {0};
            Object[] objArr11 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 286, bArr[7], bArr[78], objArr12);
            int iIntValue3 = 87 - ((Integer) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, objArr10)).intValue();
            Object[] objArr13 = {"", '0', 0};
            Object[] objArr14 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr15);
            String str2 = (String) objArr15[0];
            Object[] objArr16 = new Object[1];
            a((short) 1708, bArr[6], bArr[106], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, iIntValue3, (char) (((Integer) cls6.getMethod(str2, Class.forName((String) objArr16[0]), Character.TYPE, Integer.TYPE).invoke(null, objArr13)).intValue() + 56459), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s2 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b, b, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            char c = '\f';
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b2 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s2, b2, b2, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str, objArr18);
            int[] iArr = new int[objArr22.length];
            int i3 = 0;
            while (i3 < objArr22.length) {
                Object[] objArr23 = {objArr22[i3]};
                int i4 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i4 | 1576), bArr2[c], bArr2[29], objArr25);
                String str4 = (String) objArr25[0];
                byte b3 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s2, b3, b3, objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr28);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = '\f';
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i5])) {
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -15:
                        i5 = 7;
                        break;
                    case -14:
                        i5 = 28;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 27;
                        }
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        break;
                    case -11:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                        } catch (Throwable th2) {
                            th = th2;
                            short s3 = (short) 1462;
                            byte[] bArr3 = onMediaButtonEvent;
                            Object[] objArr29 = new Object[1];
                            a(s3, bArr3[22], bArr3[106], objArr29);
                            if (!Class.forName((String) objArr29[0]).isInstance(th) || i5 < 9 || i5 >= 10) {
                                Object[] objArr30 = new Object[1];
                                a(s3, bArr3[22], bArr3[106], objArr30);
                                if (!Class.forName((String) objArr30[0]).isInstance(th) || i5 < 12 || i5 >= 13) {
                                    throw th;
                                }
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i5 = 29;
                        }
                        break;
                    case -10:
                        i5 = 1;
                        break;
                    case -9:
                        i5 = 18;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        i5 = hidescrubber.RemoteActionCompatParcelizer != 0 ? i6 : 17;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        break;
                    case -5:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        return (getCreatedOnDateMs) hidescrubber.MediaBrowserCompatItemReceiver;
                    case -4:
                        i5 = 9;
                        break;
                    case -3:
                        i5 = 19;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.AudioAttributesImplApi21Parcelizer = ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).onMoveListener;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        break;
                    case -1:
                        i5 = 4;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    public final Pair<Boolean, Integer> getPairOfTimeAndIndex() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this);
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[343], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 186, bArr[24], bArr[22], objArr2);
            int i = (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 101;
            Object[] objArr3 = new Object[1];
            a(s, bArr[343], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b = bArr[22];
            Object[] objArr4 = new Object[1];
            a((short) 346, b, b, objArr4);
            int iIntValue = 5468 - (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr5 = new Object[1];
            a((short) 1050, bArr[189], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            int i2 = onPrepareFromMediaId;
            Object[] objArr6 = new Object[1];
            a((short) (i2 | 58), bArr[7], bArr[147], objArr6);
            Object[] objArr7 = new Object[1];
            b(i, iIntValue, (char) ((((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 22) + 467), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a((short) 424, bArr[24], bArr[78], objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(bArr[860], bArr[14], (byte) i2, objArr9);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() + 1;
            Object[] objArr10 = new Object[1];
            a(s, bArr[343], bArr[78], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 1793, bArr[71], bArr[22], objArr11);
            int iIntValue3 = 87 - (((Integer) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr12 = new Object[1];
            a((short) 1770, bArr[6], bArr[78], objArr12);
            Class<?> cls6 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a((short) (i2 | 1744), bArr[112], bArr[4], objArr13);
            Object[] objArr14 = new Object[1];
            b(iIntValue2, iIntValue3, (char) (56459 - (((Long) cls6.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls6.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr14);
            Object[] objArr15 = {(String) objArr14[0]};
            short s2 = (short) 1616;
            char c = 'j';
            byte b2 = bArr[106];
            Object[] objArr16 = new Object[1];
            a(s2, b2, b2, objArr16);
            Class<?> cls7 = Class.forName((String) objArr16[0]);
            char c2 = '\f';
            Object[] objArr17 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr17);
            String str2 = (String) objArr17[0];
            byte b3 = bArr[106];
            Object[] objArr18 = new Object[1];
            a(s2, b3, b3, objArr18);
            Object[] objArr19 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr18[0])).invoke(str, objArr15);
            int[] iArr = new int[objArr19.length];
            int i3 = 0;
            while (i3 < objArr19.length) {
                Object[] objArr20 = {objArr19[i3]};
                int i4 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                byte b4 = bArr2[24];
                byte b5 = bArr2[c];
                Object[] objArr21 = new Object[1];
                a((short) (i4 | 1592), b4, b5, objArr21);
                Class<?> cls8 = Class.forName((String) objArr21[0]);
                Object[] objArr22 = new Object[1];
                a((short) (i4 | 1576), bArr2[c2], bArr2[29], objArr22);
                String str3 = (String) objArr22[0];
                byte b6 = bArr2[106];
                Object[] objArr23 = new Object[1];
                a(s2, b6, b6, objArr23);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr23[0])).invoke(null, objArr20);
                Object[] objArr24 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls9 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr25);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr25[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 'j';
                c2 = '\f';
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i5])) {
                    case -14:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i5 = 1;
                        break;
                    case -12:
                        i5 = 29;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 28;
                        }
                        i5 = i6;
                        break;
                    case -10:
                        i5 = 8;
                        break;
                    case -9:
                        i5 = 19;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 18;
                        }
                        i5 = i6;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i5 = i6;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i5 = i6;
                        } catch (Throwable th2) {
                            th = th2;
                            short s3 = (short) 1462;
                            byte[] bArr3 = onMediaButtonEvent;
                            Object[] objArr26 = new Object[1];
                            a(s3, bArr3[22], bArr3[106], objArr26);
                            if (!Class.forName((String) objArr26[0]).isInstance(th) || i5 < 10 || i5 >= 11) {
                                Object[] objArr27 = new Object[1];
                                a(s3, bArr3[22], bArr3[106], objArr27);
                                if (!Class.forName((String) objArr27[0]).isInstance(th) || i5 < 14 || i5 >= 15) {
                                    throw th;
                                }
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i5 = 30;
                        }
                        break;
                    case -5:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        return (Pair) hidescrubber.MediaBrowserCompatItemReceiver;
                    case -4:
                        i5 = 20;
                        break;
                    case -3:
                        i5 = 10;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.AudioAttributesImplApi21Parcelizer = ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).pairOfTimeAndIndex;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i5 = i6;
                        break;
                    case -1:
                        i5 = 4;
                        break;
                    default:
                        i5 = i6;
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    public final Random getRandom() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this);
        try {
            int i = 0;
            short s = (short) 424;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[24], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            short s2 = bArr[56];
            byte b = bArr[22];
            int i2 = onPrepareFromMediaId;
            Object[] objArr2 = new Object[1];
            a(s2, b, (byte) i2, objArr2);
            int iIntValue = 178 - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[541], bArr[112], bArr[22], objArr4);
            String str = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            a((short) 1708, bArr[6], bArr[106], objArr5);
            int iIntValue2 = ((Integer) cls2.getMethod(str, Class.forName((String) objArr5[0]), Integer.TYPE).invoke(null, "", 0)).intValue() + 5570;
            Object[] objArr6 = {'0'};
            Object[] objArr7 = new Object[1];
            a((short) (i2 | 954), bArr[154], bArr[78], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a((short) 931, bArr[82], bArr[22], objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, iIntValue2, (char) (30094 - ((Character) cls3.getMethod((String) objArr8[0], Character.TYPE).invoke(null, objArr6)).charValue()), objArr9);
            String str2 = (String) objArr9[0];
            short s3 = (short) 1822;
            Object[] objArr10 = new Object[1];
            a(s3, bArr[343], bArr[78], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) (i2 | 1248), bArr[189], bArr[22], objArr11);
            int iIntValue3 = 1 - (((Integer) cls4.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 8);
            Object[] objArr12 = new Object[1];
            a(s3, bArr[343], bArr[78], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a((short) 242, bArr[99], bArr[22], objArr13);
            int iIntValue4 = (((Integer) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 8) + 87;
            Object[] objArr14 = {0, 0};
            Object[] objArr15 = new Object[1];
            a(s, bArr[24], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 408, bArr[66], bArr[22], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue3, iIntValue4, (char) (((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr14)).intValue() + 56458), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s4 = (short) 1616;
            byte b2 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s4, b2, b2, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            char c = '\f';
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b3 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s4, b3, b3, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            int i3 = 0;
            while (i3 < objArr22.length) {
                Object[] objArr23 = {objArr22[i3]};
                int i4 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[i]);
                Object[] objArr25 = new Object[1];
                a((short) (i4 | 1576), bArr2[c], bArr2[29], objArr25);
                String str4 = (String) objArr25[i];
                byte b4 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s4, b4, b4, objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr28);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                i = 0;
                c = '\f';
            }
            while (true) {
                int i5 = i + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i])) {
                    case -23:
                        i = 48;
                        break;
                    case -22:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        i5 = hidescrubber.RemoteActionCompatParcelizer != 62 ? 16 : 38;
                        break;
                    case -21:
                        i = 43;
                        break;
                    case -20:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i6 = hidescrubber.RemoteActionCompatParcelizer;
                        i5 = (i6 == 0 || i6 != 1) ? 18 : 9;
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i = 49;
                        break;
                    case -17:
                        i = 51;
                        break;
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 36;
                        }
                        break;
                    case -15:
                        i = 7;
                        break;
                    case -14:
                        i = 27;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 26;
                        }
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        break;
                    case -11:
                        hidescrubber.IconCompatParcelizer = onPause;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                        } catch (Throwable th2) {
                            th = th2;
                            if (i < 39 || i >= 43) {
                                throw th;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i = 37;
                        }
                        break;
                    case -10:
                        i = 1;
                        break;
                    case -9:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        return (Random) hidescrubber.MediaBrowserCompatItemReceiver;
                    case -8:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        toMagicModuleMetaRepoModel.IconCompatParcelizer((String) hidescrubber.MediaBrowserCompatItemReceiver);
                        break;
                    case -7:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = "";
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        break;
                    case -6:
                        i = 28;
                        break;
                    case -5:
                        i = 44;
                        break;
                    case -4:
                        i = 46;
                        break;
                    case -3:
                        hidescrubber.RemoteActionCompatParcelizer(166);
                        i = hidescrubber.RemoteActionCompatParcelizer != 0 ? i5 : 6;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.AudioAttributesImplApi21Parcelizer = ((MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver).random;
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        break;
                    case -1:
                        i = 13;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this);
        try {
            int i = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i | 1730), bArr[6], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr2);
            String str = (String) objArr2[0];
            Object[] objArr3 = new Object[1];
            a((short) 1708, bArr[6], bArr[106], objArr3);
            int iIntValue = 114 - ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue();
            short s = (short) 1822;
            Object[] objArr4 = new Object[1];
            a(s, bArr[343], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a((short) 1793, bArr[71], bArr[22], objArr5);
            int iIntValue2 = 5953 - (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr6 = new Object[1];
            a((short) 514, bArr[71], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((short) 491, bArr[99], bArr[22], objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, iIntValue2, (char) (14361 - (((Float) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr8);
            String str2 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a((short) AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, bArr[541], bArr[78], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((short) 984, bArr[66], (byte) i, objArr10);
            int iIntValue3 = 1 - ((Integer) cls4.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr11 = new Object[1];
            a((short) 322, bArr[26], bArr[78], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) (i | 298), bArr[189], bArr[22], objArr12);
            int iIntValue4 = 87 - ((Integer) cls5.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr13 = new Object[1];
            a(s, bArr[343], bArr[78], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a(bArr[106], bArr[14], bArr[22], objArr14);
            Object[] objArr15 = new Object[1];
            b(iIntValue3, iIntValue4, (char) (56458 - (((Integer) cls6.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16)), objArr15);
            try {
                Object[] objArr16 = {(String) objArr15[0]};
                short s2 = (short) 1616;
                byte b = bArr[106];
                Object[] objArr17 = new Object[1];
                a(s2, b, b, objArr17);
                Class<?> cls7 = Class.forName((String) objArr17[0]);
                char c = '\f';
                Object[] objArr18 = new Object[1];
                a((short) 1601, bArr[7], bArr[12], objArr18);
                String str3 = (String) objArr18[0];
                byte b2 = bArr[106];
                Object[] objArr19 = new Object[1];
                a(s2, b2, b2, objArr19);
                Object[] objArr20 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr19[0])).invoke(str2, objArr16);
                int[] iArr = new int[objArr20.length];
                int i2 = 0;
                while (i2 < objArr20.length) {
                    Object[] objArr21 = {objArr20[i2]};
                    int i3 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr22 = new Object[1];
                    a((short) (i3 | 1592), bArr2[24], bArr2[106], objArr22);
                    Class<?> cls8 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    a((short) (i3 | 1576), bArr2[c], bArr2[29], objArr23);
                    String str4 = (String) objArr23[0];
                    byte b3 = bArr2[106];
                    Object[] objArr24 = new Object[1];
                    a(s2, b3, b3, objArr24);
                    Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                    Object[] objArr25 = new Object[1];
                    a((short) (i3 | 1592), bArr2[24], bArr2[106], objArr25);
                    Class<?> cls9 = Class.forName((String) objArr25[0]);
                    Object[] objArr26 = new Object[1];
                    a((short) (i3 | 1570), (byte) i3, bArr2[24], objArr26);
                    iArr[i2] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                    i2++;
                    c = '\f';
                }
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    try {
                    } catch (Throwable th) {
                        th = th;
                    }
                    switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i4])) {
                        case -15:
                            hidescrubber.RemoteActionCompatParcelizer(5);
                            throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                        case -14:
                            i4 = 1;
                            break;
                        case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                            i4 = 33;
                            break;
                        case -12:
                            hidescrubber.RemoteActionCompatParcelizer(13);
                            if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                i5 = 32;
                            }
                            i4 = i5;
                            break;
                        case -11:
                            i4 = 9;
                            break;
                        case -10:
                            i4 = 22;
                            break;
                        case -9:
                            hidescrubber.RemoteActionCompatParcelizer(13);
                            if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                i5 = 21;
                            }
                            i4 = i5;
                            break;
                        case -8:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            onPlay = hidescrubber.RemoteActionCompatParcelizer;
                            i4 = i5;
                            break;
                        case -7:
                            hidescrubber.IconCompatParcelizer = onPause;
                            try {
                                hidescrubber.RemoteActionCompatParcelizer(6);
                                i4 = i5;
                            } catch (Throwable th2) {
                                th = th2;
                                short s3 = (short) 1462;
                                byte[] bArr3 = onMediaButtonEvent;
                                Object[] objArr27 = new Object[1];
                                a(s3, bArr3[22], bArr3[106], objArr27);
                                if (!Class.forName((String) objArr27[0]).isInstance(th) || i4 < 11 || i4 >= 18) {
                                    Object[] objArr28 = new Object[1];
                                    a(s3, bArr3[22], bArr3[106], objArr28);
                                    if (!Class.forName((String) objArr28[0]).isInstance(th) || i4 < 23 || i4 >= 29) {
                                        throw th;
                                    }
                                }
                                hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                hidescrubber.RemoteActionCompatParcelizer(35);
                                i4 = 34;
                            }
                            break;
                        case -6:
                            return;
                        case -5:
                            i4 = 23;
                            break;
                        case -4:
                            i4 = 11;
                            break;
                        case -3:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(17);
                            super.onDetachedFromWindow();
                            i4 = i5;
                            break;
                        case -2:
                            hidescrubber.IconCompatParcelizer = 1;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(17);
                            IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{(MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), 247168840, -247168839);
                            i4 = i5;
                            break;
                        case -1:
                            i4 = 6;
                            break;
                        default:
                            i4 = i5;
                            break;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause == null) {
                    throw th3;
                }
                throw cause;
            }
        } catch (Throwable th4) {
            Throwable cause2 = th4.getCause();
            if (cause2 == null) {
                throw th4;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x044a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setBackground(int[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.setBackground(int[]):void");
    }

    public final void setBigTextCounter(int p0) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber((Object) this, p0);
        short s = (short) 514;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[71], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 491, bArr[99], bArr[22], objArr2);
            int i = (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 141;
            Object[] objArr3 = new Object[1];
            a((short) 1050, bArr[189], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            int i2 = onPrepareFromMediaId;
            Object[] objArr4 = new Object[1];
            a((short) (i2 | 58), bArr[7], bArr[147], objArr4);
            int iIntValue = 6238 - (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 22);
            short s2 = (short) 1822;
            Object[] objArr5 = new Object[1];
            a(s2, bArr[343], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 186, bArr[24], bArr[22], objArr6);
            Object[] objArr7 = new Object[1];
            b(i, iIntValue, (char) ((((Float) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27142), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a(s2, bArr[343], bArr[78], objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 242, bArr[99], bArr[22], objArr9);
            int iIntValue2 = (((Integer) cls4.getMethod((String) objArr9[0], null).invoke(null, null)).intValue() >> 8) + 1;
            Object[] objArr10 = new Object[1];
            a(s2, bArr[343], bArr[78], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 1793, bArr[71], bArr[22], objArr11);
            int iIntValue3 = 87 - (((Integer) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr12 = {0, 0};
            Object[] objArr13 = new Object[1];
            a((short) 322, bArr[26], bArr[78], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) (i2 | 298), bArr[189], bArr[22], objArr14);
            Object[] objArr15 = new Object[1];
            b(iIntValue2, iIntValue3, (char) (((Integer) cls6.getMethod((String) objArr14[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr12)).intValue() + 56458), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            short s3 = (short) 1616;
            char c = 'j';
            byte b = bArr[106];
            Object[] objArr17 = new Object[1];
            a(s3, b, b, objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            char c2 = '\f';
            Object[] objArr18 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr18);
            String str2 = (String) objArr18[0];
            byte b2 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s3, b2, b2, objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            int i3 = 0;
            while (i3 < objArr20.length) {
                try {
                    Object[] objArr21 = {objArr20[i3]};
                    int i4 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr22 = new Object[1];
                    a((short) (i4 | 1592), bArr2[24], bArr2[c], objArr22);
                    Class<?> cls8 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    a((short) (i4 | 1576), bArr2[c2], bArr2[29], objArr23);
                    String str3 = (String) objArr23[0];
                    byte b3 = bArr2[c];
                    Object[] objArr24 = new Object[1];
                    a(s3, b3, b3, objArr24);
                    Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                    Object[] objArr25 = new Object[1];
                    a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr25);
                    Class<?> cls9 = Class.forName((String) objArr25[0]);
                    byte b4 = bArr2[24];
                    Object[] objArr26 = new Object[1];
                    a((short) (i4 | 1570), (byte) i4, b4, objArr26);
                    iArr[i3] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                    i3++;
                    c = 'j';
                    c2 = '\f';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i5])) {
                    case -16:
                        i5 = 36;
                        break;
                    case -15:
                        i6 = 30;
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i7 = hidescrubber.RemoteActionCompatParcelizer;
                        i5 = (i7 != 0 && i7 == 1) ? i6 : 1;
                        break;
                    case -14:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i5 = 37;
                        break;
                    case -12:
                        i5 = 39;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 28;
                        }
                        break;
                    case -10:
                        i5 = 7;
                        break;
                    case -9:
                        i5 = 20;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 19;
                        }
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        break;
                    case -5:
                        return;
                    case -4:
                        i5 = 21;
                        break;
                    case -3:
                        i5 = 9;
                        break;
                    case -2:
                        try {
                            hidescrubber.IconCompatParcelizer = 2;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(17);
                            MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            moveableTextView.AudioAttributesCompatParcelizer = hidescrubber.RemoteActionCompatParcelizer;
                        } catch (Throwable th3) {
                            th = th3;
                            byte[] bArr3 = onMediaButtonEvent;
                            Object[] objArr27 = new Object[1];
                            a((short) 1462, bArr3[22], bArr3[106], objArr27);
                            if (Class.forName((String) objArr27[0]).isInstance(th) && i5 >= 9) {
                                i5 = i5 < 16 ? 42 : 29;
                                hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                hidescrubber.RemoteActionCompatParcelizer(35);
                            }
                            if (i5 < 33 || i5 >= 36) {
                                throw th;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                        }
                        break;
                    case -1:
                        i5 = 4;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause2 = th4.getCause();
            if (cause2 == null) {
                throw th4;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x02f4. Please report as an issue. */
    public final void setBlinkerTexts(String[] strArr) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this, strArr);
        try {
            int i = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i | 1328), bArr[4], bArr[78], objArr);
            int i2 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 1236, bArr[147], bArr[22], objArr2);
            int iIntValue = (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16) + 108;
            Object[] objArr3 = new Object[1];
            a((short) 1822, bArr[343], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b = bArr[22];
            Object[] objArr4 = new Object[1];
            a((short) 346, b, b, objArr4);
            int iIntValue2 = 6379 - (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr5 = new Object[1];
            a((short) 514, bArr[71], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 94, bArr[99], bArr[22], objArr6);
            Object[] objArr7 = new Object[1];
            b(iIntValue, iIntValue2, (char) (1 - (((Float) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = {0};
            Object[] objArr9 = new Object[1];
            a((short) (i | 1194), bArr[6], bArr[78], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((short) TarConstants.PREFIXLEN, bArr[9], (byte) i, objArr10);
            int iIntValue3 = 1 - ((Integer) cls4.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr8)).intValue();
            Object[] objArr11 = new Object[1];
            a((short) (i | 1730), bArr[6], bArr[78], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr12);
            String str2 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a((short) 1708, bArr[6], bArr[106], objArr13);
            int iIntValue4 = ((Integer) cls5.getMethod(str2, Class.forName((String) objArr13[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue() + 88;
            Object[] objArr14 = {0, 0};
            char c = 24;
            Object[] objArr15 = new Object[1];
            a((short) 424, bArr[24], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 83, bArr[4], bArr[69], objArr16);
            char cIntValue = (char) (56458 - ((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr14)).intValue());
            Object[] objArr17 = new Object[1];
            b(iIntValue3, iIntValue4, cIntValue, objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s = (short) 1616;
            byte b2 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s, b2, b2, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            char c2 = '\f';
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b3 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s, b3, b3, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str, objArr18);
            int[] iArr = new int[objArr22.length];
            int i3 = 0;
            while (i3 < objArr22.length) {
                Object[] objArr23 = {objArr22[i3]};
                int i4 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i4 | 1592), bArr2[c], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i4 | 1576), bArr2[c2], bArr2[29], objArr25);
                String str4 = (String) objArr25[0];
                byte b4 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s, b4, b4, objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr28);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 24;
                c2 = '\f';
            }
            while (true) {
                int i5 = i2 + 1;
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i2])) {
                    case -15:
                        i2 = 1;
                        break;
                    case -14:
                        i5 = 33;
                        i2 = i5;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 32;
                        }
                        i2 = i5;
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = i5;
                        break;
                    case -11:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i2 = i5;
                        break;
                    case -10:
                        i2 = 10;
                        break;
                    case -9:
                        i2 = 22;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 21;
                        }
                        i2 = i5;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = i5;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i2 = i5;
                        break;
                    case -5:
                        break;
                    case -4:
                        i5 = 23;
                        i2 = i5;
                        break;
                    case -3:
                        i2 = 12;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        moveableTextView.blinkerTexts = (String[]) hidescrubber.MediaBrowserCompatItemReceiver;
                        i2 = i5;
                        break;
                    case -1:
                        i2 = 5;
                        break;
                    default:
                        i2 = i5;
                        break;
                }
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void setDontHide(boolean p0) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber((Object) this, p0 ? 1 : 0);
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[343], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            int i = onPrepareFromMediaId;
            byte b = bArr[22];
            Object[] objArr2 = new Object[1];
            a((short) (i | 1682), b, b, objArr2);
            int iIntValue = (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16) + 169;
            Object[] objArr3 = new Object[1];
            a((short) (i | 1664), bArr[622], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 1444, bArr[4], bArr[22], objArr4);
            int iIntValue2 = 6487 - ((Integer) cls2.getMethod((String) objArr4[0], Long.TYPE).invoke(null, 0L)).intValue();
            Object[] objArr5 = {0};
            Object[] objArr6 = new Object[1];
            a((short) 1424, bArr[77], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((short) 1386, bArr[31], bArr[69], objArr7);
            Object[] objArr8 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Double) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).doubleValue() > 0.0d ? 1 : (((Double) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).doubleValue() == 0.0d ? 0 : -1)), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(s, bArr[343], bArr[78], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((short) 450, bArr[147], bArr[22], objArr10);
            int iIntValue3 = 1 - (((Integer) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr11 = new Object[1];
            a(s, bArr[343], bArr[78], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) (i | 1248), bArr[189], bArr[22], objArr12);
            int iIntValue4 = (((Integer) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).intValue() >> 8) + 87;
            Object[] objArr13 = new Object[1];
            a(s, bArr[343], bArr[78], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 1273, bArr[4], bArr[22], objArr14);
            Object[] objArr15 = new Object[1];
            b(iIntValue3, iIntValue4, (char) ((((Integer) cls6.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 16) + 56458), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            short s2 = (short) 1616;
            char c = 'j';
            byte b2 = bArr[106];
            Object[] objArr17 = new Object[1];
            a(s2, b2, b2, objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            char c2 = '\f';
            Object[] objArr18 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr18);
            String str2 = (String) objArr18[0];
            byte b3 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b3, b3, objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            int i2 = 0;
            while (i2 < objArr20.length) {
                try {
                    Object[] objArr21 = {objArr20[i2]};
                    int i3 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr22 = new Object[1];
                    a((short) (i3 | 1592), bArr2[24], bArr2[c], objArr22);
                    Class<?> cls8 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    a((short) (i3 | 1576), bArr2[c2], bArr2[29], objArr23);
                    String str3 = (String) objArr23[0];
                    byte b4 = bArr2[c];
                    Object[] objArr24 = new Object[1];
                    a(s2, b4, b4, objArr24);
                    Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                    try {
                        Object[] objArr25 = new Object[1];
                        a((short) (i3 | 1592), bArr2[24], bArr2[106], objArr25);
                        Class<?> cls9 = Class.forName((String) objArr25[0]);
                        Object[] objArr26 = new Object[1];
                        a((short) (i3 | 1570), (byte) i3, bArr2[24], objArr26);
                        iArr[i2] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                        i2++;
                        c = 'j';
                        c2 = '\f';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                } catch (Throwable th3) {
                    if (i4 >= 21 && i4 < 25) {
                        i4 = 19;
                    } else {
                        if (i4 < 38 || i4 >= 42) {
                            throw th3;
                        }
                        i4 = 35;
                    }
                    hidescrubber.AudioAttributesImplApi21Parcelizer = th3;
                    hidescrubber.RemoteActionCompatParcelizer(35);
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i4])) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i4 = 47;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i6 = hidescrubber.RemoteActionCompatParcelizer;
                        if (i6 != 22 && i6 == 71) {
                            i4 = 1;
                        } else {
                            i5 = 36;
                            i4 = i5;
                        }
                        break;
                    case -17:
                        i4 = 42;
                        break;
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 20;
                            i4 = i5;
                        } else {
                            i4 = 8;
                        }
                        break;
                    case -15:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.IconCompatParcelizer = hidescrubber.MediaBrowserCompatItemReceiver.hashCode();
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i4 = i5;
                        break;
                    case -14:
                        i4 = 48;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i4 = 50;
                        break;
                    case -12:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 34;
                        }
                        i4 = i5;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i4 = 43;
                        break;
                    case -9:
                        i4 = 45;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 18;
                        }
                        i4 = i5;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i4 = i5;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i4 = i5;
                        break;
                    case -5:
                        return;
                    case -4:
                        i4 = 25;
                        break;
                    case -3:
                        i4 = 10;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        moveableTextView.MediaBrowserCompatItemReceiver = hidescrubber.RemoteActionCompatParcelizer != 0;
                        i4 = i5;
                        break;
                    case -1:
                        i4 = 5;
                        break;
                    default:
                        i4 = i5;
                        break;
                }
            }
            throw th3;
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 == null) {
                throw th4;
            }
            throw cause3;
        }
    }

    public final void setHideRunner(Runnable runnable) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this, runnable);
        try {
            int i = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i | 1730), bArr[6], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) (i | 194), bArr[66], bArr[22], objArr2);
            String str = (String) objArr2[0];
            short s = (short) 1708;
            Object[] objArr3 = new Object[1];
            a(s, bArr[6], bArr[106], objArr3);
            int iIntValue = 163 - ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0]), Integer.TYPE).invoke(null, "", 0)).intValue();
            Object[] objArr4 = new Object[1];
            a((short) (i | 1328), bArr[4], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a((short) 1066, bArr[24], bArr[112], objArr5);
            String str2 = (String) objArr5[0];
            short s2 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr6 = new Object[1];
            a(s2, b, b, objArr6);
            int iIntValue2 = 6656 - ((Integer) cls2.getMethod(str2, Class.forName((String) objArr6[0])).invoke(null, "")).intValue();
            Object[] objArr7 = new Object[1];
            a((short) (i | 1328), bArr[4], bArr[78], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a((short) 1236, bArr[147], bArr[22], objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).intValue() >> 16), objArr9);
            String str3 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a((short) (i | 1730), bArr[6], bArr[78], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            short s3 = (short) 1714;
            Object[] objArr11 = new Object[1];
            a(s3, bArr[12], bArr[24], objArr11);
            String str4 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(s, bArr[6], bArr[106], objArr12);
            Object[] objArr13 = new Object[1];
            a(s, bArr[6], bArr[106], objArr13);
            int iIntValue3 = 1 - ((Integer) cls4.getMethod(str4, Class.forName((String) objArr12[0]), Class.forName((String) objArr13[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue();
            Object[] objArr14 = new Object[1];
            a((short) (i | 1730), bArr[6], bArr[78], objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a(s3, bArr[12], bArr[24], objArr15);
            String str5 = (String) objArr15[0];
            Object[] objArr16 = new Object[1];
            a(s, bArr[6], bArr[106], objArr16);
            Object[] objArr17 = new Object[1];
            a(s, bArr[6], bArr[106], objArr17);
            int iIntValue4 = 87 - ((Integer) cls5.getMethod(str5, Class.forName((String) objArr16[0]), Class.forName((String) objArr17[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue();
            Object[] objArr18 = {0, 0, 0, 0};
            Object[] objArr19 = new Object[1];
            a((short) (i | 1194), bArr[6], bArr[78], objArr19);
            Class<?> cls6 = Class.forName((String) objArr19[0]);
            char c = 29;
            Object[] objArr20 = new Object[1];
            a(bArr[27], bArr[29], bArr[78], objArr20);
            Object[] objArr21 = new Object[1];
            b(iIntValue3, iIntValue4, (char) (((Integer) cls6.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18)).intValue() + 56458), objArr21);
            Object[] objArr22 = {(String) objArr21[0]};
            byte b2 = bArr[106];
            Object[] objArr23 = new Object[1];
            a(s2, b2, b2, objArr23);
            Class<?> cls7 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr24);
            String str6 = (String) objArr24[0];
            byte b3 = bArr[106];
            Object[] objArr25 = new Object[1];
            a(s2, b3, b3, objArr25);
            Object[] objArr26 = (Object[]) cls7.getMethod(str6, Class.forName((String) objArr25[0])).invoke(str3, objArr22);
            int[] iArr = new int[objArr26.length];
            int i2 = 0;
            while (i2 < objArr26.length) {
                Object[] objArr27 = {objArr26[i2]};
                int i3 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr28 = new Object[1];
                a((short) (i3 | 1592), bArr2[24], bArr2[106], objArr28);
                Class<?> cls8 = Class.forName((String) objArr28[0]);
                byte b4 = bArr2[12];
                byte b5 = bArr2[c];
                Object[] objArr29 = new Object[1];
                a((short) (i3 | 1576), b4, b5, objArr29);
                String str7 = (String) objArr29[0];
                byte b6 = bArr2[106];
                Object[] objArr30 = new Object[1];
                a(s2, b6, b6, objArr30);
                Object objInvoke = cls8.getMethod(str7, Class.forName((String) objArr30[0])).invoke(null, objArr27);
                Object[] objArr31 = new Object[1];
                a((short) (i3 | 1592), bArr2[24], bArr2[106], objArr31);
                Class<?> cls9 = Class.forName((String) objArr31[0]);
                Object[] objArr32 = new Object[1];
                a((short) (i3 | 1570), (byte) i3, bArr2[24], objArr32);
                iArr[i2] = ((Integer) cls9.getMethod((String) objArr32[0], null).invoke(objInvoke, null)).intValue();
                i2++;
                c = 29;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i4])) {
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i4 = 43;
                        break;
                    case -17:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        i4 = hidescrubber.RemoteActionCompatParcelizer != 42 ? 12 : 38;
                        break;
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -15:
                        i4 = 44;
                        break;
                    case -14:
                        i4 = 46;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 36;
                        }
                        break;
                    case -12:
                        i4 = 1;
                        break;
                    case -11:
                        i4 = 25;
                        break;
                    case -10:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        i4 = hidescrubber.RemoteActionCompatParcelizer != 0 ? i5 : 24;
                        break;
                    case -9:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        break;
                    case -8:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                        } catch (Throwable th2) {
                            th = th2;
                            short s4 = (short) 1462;
                            byte[] bArr3 = onMediaButtonEvent;
                            Object[] objArr33 = new Object[1];
                            a(s4, bArr3[22], bArr3[106], objArr33);
                            if (!Class.forName((String) objArr33[0]).isInstance(th) || i4 < 2 || i4 >= 3) {
                                Object[] objArr34 = new Object[1];
                                a(s4, bArr3[22], bArr3[106], objArr34);
                                if (Class.forName((String) objArr34[0]).isInstance(th) && i4 >= 3 && i4 < 4) {
                                    i4 = 49;
                                } else {
                                    if (i4 < 39 || i4 >= 43) {
                                        throw th;
                                    }
                                    i4 = 37;
                                }
                            } else {
                                i4 = 48;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                        }
                        break;
                    case -7:
                        return;
                    case -6:
                        i4 = 14;
                        break;
                    case -5:
                        i4 = 26;
                        break;
                    case -4:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        moveableTextView.hideRunner = (Runnable) hidescrubber.MediaBrowserCompatItemReceiver;
                        break;
                    case -3:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        Object obj = hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        toMagicModuleMetaRepoModel.write(obj, (String) hidescrubber.MediaBrowserCompatItemReceiver);
                        break;
                    case -2:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = "";
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        break;
                    case -1:
                        i4 = 8;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03cb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setIsTablet(boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.setIsTablet(boolean):void");
    }

    public final void setMinimumHeightMargin(int p0) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber((Object) this, p0);
        try {
            int i = 0;
            short s = (short) AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[541], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = bArr[66];
            int i2 = onPrepareFromMediaId;
            Object[] objArr2 = new Object[1];
            a((short) 984, b, (byte) i2, objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() + 100;
            Object[] objArr3 = {'0'};
            Object[] objArr4 = new Object[1];
            a((short) (i2 | 954), bArr[154], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a((short) 931, bArr[82], bArr[22], objArr5);
            int iCharValue = ((Character) cls2.getMethod((String) objArr5[0], Character.TYPE).invoke(null, objArr3)).charValue() + 6870;
            Object[] objArr6 = new Object[1];
            a((short) 570, bArr[71], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((short) 547, bArr[66], bArr[78], objArr7);
            String str = (String) objArr7[0];
            short s2 = (short) 1616;
            byte b2 = bArr[106];
            Object[] objArr8 = new Object[1];
            a(s2, b2, b2, objArr8);
            Method method = cls3.getMethod(str, Class.forName((String) objArr8[0]));
            Object[] objArr9 = new Object[1];
            b(iIntValue, iCharValue, (char) (5060 - ((Integer) method.invoke(null, "")).intValue()), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 1178, bArr[7], bArr[22], objArr11);
            int iIntValue2 = 1 - ((Integer) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr12 = new Object[1];
            a((short) 514, bArr[71], bArr[78], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a((short) 94, bArr[99], bArr[22], objArr13);
            int i3 = 88 - (((Float) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            Object[] objArr14 = {0};
            Object[] objArr15 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 286, bArr[7], bArr[78], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, i3, (char) (((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, objArr14)).intValue() + 56458), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            byte b3 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b3, b3, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            char c = '\f';
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b4 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s2, b4, b4, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            int i4 = 0;
            while (i4 < objArr22.length) {
                Object[] objArr23 = {objArr22[i4]};
                int i5 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i5 | 1576), bArr2[c], bArr2[29], objArr25);
                String str4 = (String) objArr25[0];
                byte b5 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s2, b5, b5, objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a((short) (i5 | 1570), (byte) i5, bArr2[24], objArr28);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c = '\f';
            }
            while (true) {
                int i6 = i + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i])) {
                    case -14:
                        i = 27;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 21;
                            i = i6;
                        } else {
                            i = 1;
                        }
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.IconCompatParcelizer = hidescrubber.MediaBrowserCompatItemReceiver.hashCode();
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i = i6;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i >= 23) {
                            }
                            throw th;
                        }
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i = 28;
                        break;
                    case -9:
                        i = 30;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 19;
                        }
                        i = i6;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i = i6;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i = i6;
                        break;
                    case -5:
                        return;
                    case -4:
                        i = 10;
                        break;
                    case -3:
                        i = 8;
                        break;
                    case -2:
                        try {
                            hidescrubber.IconCompatParcelizer = 2;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(17);
                            MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            moveableTextView.write = hidescrubber.RemoteActionCompatParcelizer;
                            i = i6;
                        } catch (Throwable th3) {
                            th = th3;
                            if (i >= 23 || i >= 27) {
                                throw th;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i = 20;
                        }
                        break;
                    case -1:
                        i = 5;
                        break;
                    default:
                        i = i6;
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    public final void setMinimumWidthMargin(int p0) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber((Object) this, p0);
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[343], bArr[78], objArr);
            int i = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b = bArr[22];
            Object[] objArr2 = new Object[1];
            a((short) 532, b, b, objArr2);
            int iIntValue = 103 - (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr3 = new Object[1];
            a(s, bArr[343], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 242, bArr[99], bArr[22], objArr4);
            int iIntValue2 = (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 8) + 7018;
            Object[] objArr5 = {0};
            int i2 = onPrepareFromMediaId;
            Object[] objArr6 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((short) 286, bArr[7], bArr[78], objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod(str, Integer.TYPE).invoke(null, objArr5)).intValue() + 50246), objArr8);
            String str2 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a((short) 424, bArr[24], bArr[78], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[860], bArr[14], (byte) i2, objArr10);
            int iIntValue3 = ((Integer) cls4.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() + 1;
            Object[] objArr11 = new Object[1];
            a((short) (i2 | 1328), bArr[4], bArr[78], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 1290, bArr[189], bArr[99], objArr12);
            int iIntValue4 = 87 - ((Integer) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr13 = {0, 0};
            Object[] objArr14 = new Object[1];
            a((short) 322, bArr[26], bArr[78], objArr14);
            Class<?> cls6 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a((short) (i2 | 298), bArr[189], bArr[22], objArr15);
            Object[] objArr16 = new Object[1];
            b(iIntValue3, iIntValue4, (char) (((Integer) cls6.getMethod((String) objArr15[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr13)).intValue() + 56458), objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            short s2 = (short) 1616;
            char c = 'j';
            byte b2 = bArr[106];
            Object[] objArr18 = new Object[1];
            a(s2, b2, b2, objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            char c2 = '\f';
            Object[] objArr19 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr19);
            String str3 = (String) objArr19[0];
            byte b3 = bArr[106];
            Object[] objArr20 = new Object[1];
            a(s2, b3, b3, objArr20);
            Object[] objArr21 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr20[0])).invoke(str2, objArr17);
            int[] iArr = new int[objArr21.length];
            int i3 = 0;
            while (i3 < objArr21.length) {
                Object[] objArr22 = {objArr21[i3]};
                int i4 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr23 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[c], objArr23);
                Class<?> cls8 = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                a((short) (i4 | 1576), bArr2[c2], bArr2[29], objArr24);
                String str4 = (String) objArr24[0];
                byte b4 = bArr2[c];
                Object[] objArr25 = new Object[1];
                a(s2, b4, b4, objArr25);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                Object[] objArr26 = new Object[1];
                a((short) (i4 | 1592), bArr2[24], bArr2[106], objArr26);
                Class<?> cls9 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a((short) (i4 | 1570), (byte) i4, bArr2[24], objArr27);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 'j';
                c2 = '\f';
            }
            while (true) {
                int i5 = i + 1;
                int i6 = 25;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        break;
                    case -12:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i7 = hidescrubber.RemoteActionCompatParcelizer;
                        i6 = 21;
                        i = (i7 != 0 && i7 == 1) ? 1 : i6;
                        break;
                    case -11:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -10:
                        i = 26;
                        break;
                    case -9:
                        i = 28;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i5 = 19;
                        }
                        i = i5;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i = i5;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i = i5;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i >= 23) {
                            }
                            throw th;
                        }
                        break;
                    case -5:
                        return;
                    case -4:
                        i = 10;
                        break;
                    case -3:
                        i = 8;
                        break;
                    case -2:
                        try {
                            hidescrubber.IconCompatParcelizer = 2;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(17);
                            MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                            hidescrubber.RemoteActionCompatParcelizer(11);
                            moveableTextView.read = hidescrubber.RemoteActionCompatParcelizer;
                            i = i5;
                        } catch (Throwable th3) {
                            th = th3;
                            if (i >= 23 || i >= 25) {
                                throw th;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i = 20;
                        }
                        break;
                    case -1:
                        i = 5;
                        break;
                    default:
                        i = i5;
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    public final void setMoveRunner(Runnable runnable) throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber(this, runnable);
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[343], bArr[78], objArr);
            char c = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 480, bArr[78], bArr[22], objArr2);
            int i2 = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 151;
            Object[] objArr3 = new Object[1];
            a((short) 153, bArr[542], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 126, bArr[112], bArr[22], objArr4);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue() + 7122;
            Object[] objArr5 = {0};
            int i3 = onPrepareFromMediaId;
            Object[] objArr6 = new Object[1];
            a((short) (i3 | 1194), bArr[6], bArr[78], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a((short) 646, bArr[29], bArr[71], objArr7);
            Object[] objArr8 = new Object[1];
            b(i2, iIntValue, (char) (((Integer) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).intValue() + 57683), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a((short) (i3 | 1730), bArr[6], bArr[78], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((short) 170, bArr[106], bArr[22], objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a((short) 1708, bArr[6], bArr[106], objArr11);
            int iIntValue2 = ((Integer) cls4.getMethod(str2, Class.forName((String) objArr11[0])).invoke(null, "")).intValue() + 1;
            short s2 = (short) 1050;
            Object[] objArr12 = new Object[1];
            a(s2, bArr[189], bArr[78], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            int i4 = 24;
            Object[] objArr13 = new Object[1];
            a(bArr[9], bArr[24], bArr[22], objArr13);
            int i5 = (((Long) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 86;
            Object[] objArr14 = {0};
            Object[] objArr15 = new Object[1];
            a(s2, bArr[189], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 1033, bArr[24], bArr[22], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, i5, (char) (56458 - ((((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, objArr14)).intValue() + 20) >> 6)), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s3 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s3, b, b, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            char c2 = '\f';
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str3 = (String) objArr20[0];
            byte b2 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s3, b2, b2, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str, objArr18);
            int[] iArr = new int[objArr22.length];
            int i6 = 0;
            while (i6 < objArr22.length) {
                try {
                    Object[] objArr23 = {objArr22[i6]};
                    int i7 = onPrepareFromMediaId;
                    byte[] bArr2 = onMediaButtonEvent;
                    Object[] objArr24 = new Object[1];
                    a((short) (i7 | 1592), bArr2[i4], bArr2[106], objArr24);
                    Class<?> cls8 = Class.forName((String) objArr24[c]);
                    Object[] objArr25 = new Object[1];
                    a((short) (i7 | 1576), bArr2[c2], bArr2[29], objArr25);
                    String str4 = (String) objArr25[c];
                    byte b3 = bArr2[106];
                    Object[] objArr26 = new Object[1];
                    a(s3, b3, b3, objArr26);
                    Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                    Object[] objArr27 = new Object[1];
                    a((short) (i7 | 1592), bArr2[24], bArr2[106], objArr27);
                    Class<?> cls9 = Class.forName((String) objArr27[0]);
                    Object[] objArr28 = new Object[1];
                    a((short) (i7 | 1570), (byte) i7, bArr2[24], objArr28);
                    iArr[i6] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                    i6++;
                    i4 = 24;
                    c = 0;
                    c2 = '\f';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = i4;
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                try {
                } catch (Throwable th2) {
                    byte[] bArr3 = onMediaButtonEvent;
                    Object[] objArr29 = new Object[1];
                    a((short) 1462, bArr3[22], bArr3[106], objArr29);
                    if (Class.forName((String) objArr29[0]).isInstance(th2) && i9 >= 2) {
                        i9 = i9 < 6 ? 44 : 33;
                        hidescrubber.AudioAttributesImplApi21Parcelizer = th2;
                        hidescrubber.RemoteActionCompatParcelizer(35);
                    }
                    if (i9 < 35 || i9 >= 38) {
                        throw th2;
                    }
                    hidescrubber.AudioAttributesImplApi21Parcelizer = th2;
                    hidescrubber.RemoteActionCompatParcelizer(35);
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i9])) {
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i9 = 38;
                        break;
                    case -17:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        int i11 = hidescrubber.RemoteActionCompatParcelizer;
                        if (i11 != 42 && i11 == 89) {
                            i = 34;
                            i9 = i;
                        } else {
                            i9 = 11;
                        }
                        break;
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -15:
                        i9 = 39;
                        break;
                    case -14:
                        i9 = 41;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i = 32;
                            i9 = i;
                        }
                        break;
                    case -12:
                        i9 = 1;
                        break;
                    case -11:
                        i9 = 23;
                        break;
                    case -10:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        i9 = hidescrubber.RemoteActionCompatParcelizer != 0 ? i10 : 22;
                        break;
                    case -9:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        break;
                    case -8:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        break;
                    case -7:
                        return;
                    case -6:
                        i9 = 13;
                        break;
                    case -5:
                        i9 = i8;
                        break;
                    case -4:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        moveableTextView.moveRunner = (Runnable) hidescrubber.MediaBrowserCompatItemReceiver;
                        break;
                    case -3:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        Object obj = hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        toMagicModuleMetaRepoModel.write(obj, (String) hidescrubber.MediaBrowserCompatItemReceiver);
                        break;
                    case -2:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = "";
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        break;
                    case -1:
                        i9 = 7;
                        break;
                    default:
                        break;
                }
            }
            throw th2;
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0341. Please report as an issue. */
    public final void setMsDelay(long p0) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this, p0);
        try {
            int i = 0;
            int i2 = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr2);
            String str = (String) objArr2[0];
            short s = (short) 1708;
            Object[] objArr3 = new Object[1];
            a(s, bArr[6], bArr[106], objArr3);
            int iIntValue = ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue() + 102;
            Object[] objArr4 = new Object[1];
            a((short) (i2 | 1328), bArr[4], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a((short) 1066, bArr[24], bArr[112], objArr5);
            String str2 = (String) objArr5[0];
            short s2 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr6 = new Object[1];
            a(s2, b, b, objArr6);
            int iIntValue2 = ((Integer) cls2.getMethod(str2, Class.forName((String) objArr6[0])).invoke(null, "")).intValue() + 7273;
            short s3 = (short) 1822;
            Object[] objArr7 = new Object[1];
            a(s3, bArr[343], bArr[78], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a((short) 282, bArr[24], bArr[22], objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((((Integer) cls3.getMethod((String) objArr8[0], null).invoke(null, null)).intValue() >> 16) + 57960), objArr9);
            String str3 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 209, bArr[14], bArr[22], objArr11);
            String str4 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(s, bArr[6], bArr[106], objArr12);
            int iIntValue3 = ((Integer) cls4.getMethod(str4, Class.forName((String) objArr12[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", 0, 0)).intValue() + 1;
            Object[] objArr13 = new Object[1];
            a((short) (i2 | 1664), bArr[622], bArr[78], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 266, bArr[78], bArr[22], objArr14);
            int i3 = (((Long) cls5.getMethod((String) objArr14[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr14[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() == 0L ? 0 : -1)) + 88;
            Object[] objArr15 = new Object[1];
            a(s3, bArr[343], bArr[78], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 1118, bArr[106], bArr[22], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue3, i3, (char) (56458 - (((Integer) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 8)), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            byte b2 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b2, b2, objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            char c = '\f';
            Object[] objArr20 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr20);
            String str5 = (String) objArr20[0];
            byte b3 = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s2, b3, b3, objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str5, Class.forName((String) objArr21[0])).invoke(str3, objArr18);
            int[] iArr = new int[objArr22.length];
            int i4 = 0;
            while (i4 < objArr22.length) {
                Object[] objArr23 = {objArr22[i4]};
                int i5 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr24 = new Object[1];
                a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a((short) (i5 | 1576), bArr2[c], bArr2[29], objArr25);
                String str6 = (String) objArr25[0];
                byte b4 = bArr2[106];
                Object[] objArr26 = new Object[1];
                a(s2, b4, b4, objArr26);
                Object objInvoke = cls8.getMethod(str6, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a((short) (i5 | 1592), bArr2[24], bArr2[106], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a((short) (i5 | 1570), (byte) i5, bArr2[24], objArr28);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c = '\f';
            }
            while (true) {
                int i6 = i + 1;
                int iRemoteActionCompatParcelizer = hidescrubber.RemoteActionCompatParcelizer(iArr[i]);
                i = 11;
                switch (iRemoteActionCompatParcelizer) {
                    case -15:
                        i = 9;
                        break;
                    case -14:
                        i = 31;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 30;
                        }
                        i = i6;
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i = i6;
                        break;
                    case -11:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i = i6;
                        break;
                    case -10:
                        i = 1;
                        break;
                    case -9:
                        i = 21;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i6 = 20;
                        }
                        i = i6;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i = i6;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i = i6;
                        break;
                    case -5:
                        break;
                    case -4:
                        break;
                    case -3:
                        i = 22;
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(TsExtractor.TS_STREAM_TYPE_AC4);
                        moveableTextView.MediaBrowserCompatSearchResultReceiver = hidescrubber.read;
                        i = i6;
                        break;
                    case -1:
                        i = 4;
                        break;
                    default:
                        i = i6;
                        break;
                }
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void setMsFixedDuration(long p0) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this, p0);
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[343], bArr[78], objArr);
            int i = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[106], bArr[14], bArr[22], objArr2);
            int iIntValue = (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16) + 104;
            Object[] objArr3 = new Object[1];
            a((short) 1770, bArr[6], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            int i2 = onPrepareFromMediaId;
            Object[] objArr4 = new Object[1];
            a((short) (i2 | 368), bArr[99], bArr[7], objArr4);
            int i3 = (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 7373;
            Object[] objArr5 = new Object[1];
            a(s, bArr[343], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 362, bArr[24], bArr[22], objArr6);
            Object[] objArr7 = new Object[1];
            b(iIntValue, i3, (char) (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a((short) (i2 | 1544), bArr[154], bArr[78], objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 438, bArr[112], bArr[147], objArr9);
            int iIntValue2 = 1 - ((Integer) cls4.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr10 = new Object[1];
            a((short) (i2 | 1664), bArr[622], bArr[78], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 1164, bArr[78], bArr[22], objArr11);
            int i4 = (((Long) cls5.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).longValue() == 0L ? 0 : -1)) + 87;
            Object[] objArr12 = {0};
            Object[] objArr13 = new Object[1];
            a((short) 153, bArr[542], bArr[78], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 126, bArr[112], bArr[22], objArr14);
            Object[] objArr15 = new Object[1];
            b(iIntValue2, i4, (char) (((Integer) cls6.getMethod((String) objArr14[0], Integer.TYPE).invoke(null, objArr12)).intValue() + 56459), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            short s2 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr17 = new Object[1];
            a(s2, b, b, objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            char c = '\f';
            Object[] objArr18 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr18);
            String str2 = (String) objArr18[0];
            byte b2 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b2, b2, objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str2, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            int i5 = 0;
            while (i5 < objArr20.length) {
                Object[] objArr21 = {objArr20[i5]};
                int i6 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr22 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr22);
                Class<?> cls8 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                a((short) (i6 | 1576), bArr2[c], bArr2[29], objArr23);
                String str3 = (String) objArr23[0];
                byte b3 = bArr2[106];
                Object[] objArr24 = new Object[1];
                a(s2, b3, b3, objArr24);
                Object objInvoke = cls8.getMethod(str3, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                Object[] objArr25 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr25);
                Class<?> cls9 = Class.forName((String) objArr25[0]);
                byte b4 = bArr2[24];
                Object[] objArr26 = new Object[1];
                a((short) (i6 | 1570), (byte) i6, b4, objArr26);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                c = '\f';
            }
            while (true) {
                int i7 = i + 1;
                int iRemoteActionCompatParcelizer = hidescrubber.RemoteActionCompatParcelizer(iArr[i]);
                i = 11;
                switch (iRemoteActionCompatParcelizer) {
                    case -16:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -15:
                        i = 1;
                        break;
                    case -14:
                        i = 29;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 28;
                        }
                        i = i7;
                        break;
                    case -12:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i = i7;
                        break;
                    case -11:
                        hidescrubber.IconCompatParcelizer = onPlay;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i = i7;
                        break;
                    case -10:
                        i = 9;
                        break;
                    case -9:
                        i = 19;
                        break;
                    case -8:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 18;
                        }
                        i = i7;
                        break;
                    case -7:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i = i7;
                        break;
                    case -6:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i = i7;
                        break;
                    case -5:
                        return;
                    case -4:
                        i = 20;
                        break;
                    case -3:
                        break;
                    case -2:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(TsExtractor.TS_STREAM_TYPE_AC4);
                        moveableTextView.MediaMetadataCompat = hidescrubber.read;
                        i = i7;
                        break;
                    case -1:
                        i = 4;
                        break;
                    default:
                        i = i7;
                        break;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x02c8. Please report as an issue. */
    public final void setOnMoveListener(getCreatedOnDateMs<getShowPopup> getcreatedondatems) throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber(this, getcreatedondatems);
        short s = (short) 1822;
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a(s, bArr[343], bArr[78], objArr);
            int i2 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[106], bArr[14], bArr[22], objArr2);
            int iIntValue = (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16) + 121;
            int i3 = onPrepareFromMediaId;
            Object[] objArr3 = new Object[1];
            a((short) (i3 | 1328), bArr[4], bArr[78], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) 1236, bArr[147], bArr[22], objArr4);
            int iIntValue2 = (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) + 7478;
            Object[] objArr5 = new Object[1];
            a((short) 1770, bArr[6], bArr[78], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) (i3 | 368), bArr[99], bArr[7], objArr6);
            Object[] objArr7 = new Object[1];
            b(iIntValue, iIntValue2, (char) (14042 - (((Long) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a((short) 1050, bArr[189], bArr[78], objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 971, bArr[147], bArr[22], objArr9);
            String str2 = (String) objArr9[0];
            short s2 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr10 = new Object[1];
            a(s2, b, b, objArr10);
            int i4 = -((Integer) cls4.getMethod(str2, Class.forName((String) objArr10[0])).invoke(null, "")).intValue();
            Object[] objArr11 = new Object[1];
            a(s, bArr[343], bArr[78], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 1793, bArr[71], bArr[22], objArr12);
            int iIntValue3 = (((Integer) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).intValue() >> 16) + 87;
            Object[] objArr13 = new Object[1];
            a(s, bArr[343], bArr[78], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 1118, bArr[106], bArr[22], objArr14);
            Object[] objArr15 = new Object[1];
            b(i4, iIntValue3, (char) (56458 - (((Integer) cls6.getMethod((String) objArr14[0], null).invoke(null, null)).intValue() >> 8)), objArr15);
            Object[] objArr16 = {(String) objArr15[0]};
            byte b2 = bArr[106];
            Object[] objArr17 = new Object[1];
            a(s2, b2, b2, objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            char c = '\f';
            Object[] objArr18 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr18);
            String str3 = (String) objArr18[0];
            byte b3 = bArr[106];
            Object[] objArr19 = new Object[1];
            a(s2, b3, b3, objArr19);
            Object[] objArr20 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr19[0])).invoke(str, objArr16);
            int[] iArr = new int[objArr20.length];
            int i5 = 0;
            while (i5 < objArr20.length) {
                Object[] objArr21 = {objArr20[i5]};
                int i6 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr22 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr22);
                Class<?> cls8 = Class.forName((String) objArr22[i2]);
                Object[] objArr23 = new Object[1];
                a((short) (i6 | 1576), bArr2[c], bArr2[29], objArr23);
                String str4 = (String) objArr23[i2];
                byte b4 = bArr2[106];
                Object[] objArr24 = new Object[1];
                a(s2, b4, b4, objArr24);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr24[0])).invoke(null, objArr21);
                Object[] objArr25 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr25);
                Class<?> cls9 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                a((short) (i6 | 1570), (byte) i6, bArr2[24], objArr26);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr26[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                i2 = 0;
                c = '\f';
            }
            while (true) {
                int i7 = i2 + 1;
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i2])) {
                    case -17:
                        i2 = 1;
                        break;
                    case -16:
                        i2 = 36;
                        break;
                    case -15:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 35;
                        }
                        i2 = i7;
                        break;
                    case -14:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = i7;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i = onPause;
                        hidescrubber.IconCompatParcelizer = i;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i2 = i7;
                        break;
                    case -12:
                        i2 = 12;
                        break;
                    case -11:
                        i2 = 24;
                        break;
                    case -10:
                        hidescrubber.RemoteActionCompatParcelizer(38);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 23;
                        }
                        i2 = i7;
                        break;
                    case -9:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPause = hidescrubber.RemoteActionCompatParcelizer;
                        i2 = i7;
                        break;
                    case -8:
                        i = onPlay;
                        hidescrubber.IconCompatParcelizer = i;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i2 = i7;
                        break;
                    case -7:
                        break;
                    case -6:
                        i2 = 25;
                        break;
                    case -5:
                        i2 = 14;
                        break;
                    case -4:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        moveableTextView.onMoveListener = (getCreatedOnDateMs) hidescrubber.MediaBrowserCompatItemReceiver;
                        i2 = i7;
                        break;
                    case -3:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        Object obj = hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        toMagicModuleMetaRepoModel.write(obj, (String) hidescrubber.MediaBrowserCompatItemReceiver);
                        i2 = i7;
                        break;
                    case -2:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = "";
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i2 = i7;
                        break;
                    case -1:
                        i2 = 8;
                        break;
                    default:
                        i2 = i7;
                        break;
                }
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x03b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPairOfTimeAndIndex(kotlin.Pair<java.lang.Boolean, java.lang.Integer> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.setPairOfTimeAndIndex(o.getSubscriptionExpiresOn):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0466  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setRandom(java.util.Random r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.setRandom(java.util.Random):void");
    }

    public final void setTextColor(int[] p0) throws Throwable {
        int i;
        hideScrubber hidescrubber = new hideScrubber(this, p0);
        try {
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) 570, bArr[71], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 547, bArr[66], bArr[78], objArr2);
            String str = (String) objArr2[0];
            short s = (short) 1616;
            byte b = bArr[106];
            Object[] objArr3 = new Object[1];
            a(s, b, b, objArr3);
            int iIntValue = ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0])).invoke(null, "")).intValue() + 157;
            short s2 = (short) 1822;
            Object[] objArr4 = new Object[1];
            a(s2, bArr[343], bArr[78], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            int i2 = onPrepareFromMediaId;
            byte b2 = bArr[22];
            Object[] objArr5 = new Object[1];
            a((short) (i2 | 1682), b2, b2, objArr5);
            int iIntValue2 = (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 16) + 7938;
            try {
                Object[] objArr6 = new Object[1];
                a(s2, bArr[343], bArr[78], objArr6);
                Class<?> cls3 = Class.forName((String) objArr6[0]);
                Object[] objArr7 = new Object[1];
                a((short) (i2 | 1248), bArr[189], bArr[22], objArr7);
                Object[] objArr8 = new Object[1];
                b(iIntValue, iIntValue2, (char) ((((Integer) cls3.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 8) + 64058), objArr8);
                String str2 = (String) objArr8[0];
                Object[] objArr9 = new Object[1];
                a((short) (i2 | 1730), bArr[6], bArr[78], objArr9);
                Class<?> cls4 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                a((short) 1472, bArr[14], bArr[66], objArr10);
                String str3 = (String) objArr10[0];
                short s3 = (short) 1708;
                Object[] objArr11 = new Object[1];
                a(s3, bArr[6], bArr[106], objArr11);
                int i3 = -((Integer) cls4.getMethod(str3, Class.forName((String) objArr11[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue();
                Object[] objArr12 = new Object[1];
                a((short) 1770, bArr[6], bArr[78], objArr12);
                Class<?> cls5 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                a((short) (i2 | 1744), bArr[112], bArr[4], objArr13);
                int i4 = (((Long) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 86;
                try {
                    Object[] objArr14 = new Object[1];
                    a((short) (i2 | 1730), bArr[6], bArr[78], objArr14);
                    Class<?> cls6 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    a((short) 170, bArr[106], bArr[22], objArr15);
                    String str4 = (String) objArr15[0];
                    Object[] objArr16 = new Object[1];
                    a(s3, bArr[6], bArr[106], objArr16);
                    Object[] objArr17 = new Object[1];
                    b(i3, i4, (char) (56458 - ((Integer) cls6.getMethod(str4, Class.forName((String) objArr16[0])).invoke(null, "")).intValue()), objArr17);
                    try {
                        Object[] objArr18 = {(String) objArr17[0]};
                        byte b3 = bArr[106];
                        Object[] objArr19 = new Object[1];
                        a(s, b3, b3, objArr19);
                        Class<?> cls7 = Class.forName((String) objArr19[0]);
                        char c = '\f';
                        Object[] objArr20 = new Object[1];
                        a((short) 1601, bArr[7], bArr[12], objArr20);
                        String str5 = (String) objArr20[0];
                        byte b4 = bArr[106];
                        Object[] objArr21 = new Object[1];
                        a(s, b4, b4, objArr21);
                        Object[] objArr22 = (Object[]) cls7.getMethod(str5, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
                        int[] iArr = new int[objArr22.length];
                        int i5 = 0;
                        while (i5 < objArr22.length) {
                            Object[] objArr23 = {objArr22[i5]};
                            int i6 = onPrepareFromMediaId;
                            byte[] bArr2 = onMediaButtonEvent;
                            Object[] objArr24 = new Object[1];
                            a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr24);
                            Class<?> cls8 = Class.forName((String) objArr24[0]);
                            Object[] objArr25 = new Object[1];
                            a((short) (i6 | 1576), bArr2[c], bArr2[29], objArr25);
                            String str6 = (String) objArr25[0];
                            byte b5 = bArr2[106];
                            Object[] objArr26 = new Object[1];
                            a(s, b5, b5, objArr26);
                            Object objInvoke = cls8.getMethod(str6, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                            Object[] objArr27 = new Object[1];
                            a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr27);
                            Class<?> cls9 = Class.forName((String) objArr27[0]);
                            Object[] objArr28 = new Object[1];
                            a((short) (i6 | 1570), (byte) i6, bArr2[24], objArr28);
                            iArr[i5] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                            i5++;
                            c = '\f';
                        }
                        int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            try {
                            } catch (Throwable th) {
                                short s4 = (short) 1462;
                                byte[] bArr3 = onMediaButtonEvent;
                                Object[] objArr29 = new Object[1];
                                a(s4, bArr3[22], bArr3[106], objArr29);
                                if (!Class.forName((String) objArr29[0]).isInstance(th) || i7 < 2 || i7 >= 6) {
                                    Object[] objArr30 = new Object[1];
                                    a(s4, bArr3[22], bArr3[106], objArr30);
                                    if (!Class.forName((String) objArr30[0]).isInstance(th) || i7 < 13 || i7 >= 19) {
                                        Object[] objArr31 = new Object[1];
                                        a(s4, bArr3[22], bArr3[106], objArr31);
                                        if (Class.forName((String) objArr31[0]).isInstance(th) && i7 >= 24 && i7 < 28) {
                                            i7 = 46;
                                        } else {
                                            if (i7 < 35 || i7 >= 40) {
                                                throw th;
                                            }
                                            i7 = 33;
                                        }
                                        hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                        hidescrubber.RemoteActionCompatParcelizer(35);
                                    } else {
                                        i7 = 45;
                                    }
                                } else {
                                    i7 = 46;
                                }
                                hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                                hidescrubber.RemoteActionCompatParcelizer(35);
                            }
                            switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i7])) {
                                case -20:
                                    i7 = 40;
                                    break;
                                case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                    hidescrubber.RemoteActionCompatParcelizer(30);
                                    if (hidescrubber.RemoteActionCompatParcelizer == 21) {
                                        i7 = 11;
                                    } else {
                                        i8 = 34;
                                    }
                                    break;
                                case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                    hidescrubber.RemoteActionCompatParcelizer(5);
                                    throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                                case -17:
                                    i7 = 41;
                                    break;
                                case -16:
                                    i7 = 43;
                                    break;
                                case -15:
                                    hidescrubber.RemoteActionCompatParcelizer(38);
                                    if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                                        i8 = 32;
                                    }
                                    break;
                                case -14:
                                    hidescrubber.IconCompatParcelizer = 1;
                                    hidescrubber.RemoteActionCompatParcelizer(10);
                                    hidescrubber.RemoteActionCompatParcelizer(11);
                                    onPause = hidescrubber.RemoteActionCompatParcelizer;
                                    break;
                                case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                                    hidescrubber.IconCompatParcelizer = onPlay;
                                    i = 6;
                                    hidescrubber.RemoteActionCompatParcelizer(i);
                                    break;
                                case -12:
                                    i7 = 1;
                                    break;
                                case -11:
                                    i7 = 23;
                                    break;
                                case -10:
                                    hidescrubber.RemoteActionCompatParcelizer(13);
                                    i7 = hidescrubber.RemoteActionCompatParcelizer != 0 ? i8 : 22;
                                    break;
                                case -9:
                                    hidescrubber.IconCompatParcelizer = 1;
                                    hidescrubber.RemoteActionCompatParcelizer(10);
                                    hidescrubber.RemoteActionCompatParcelizer(11);
                                    onPlay = hidescrubber.RemoteActionCompatParcelizer;
                                    break;
                                case -8:
                                    hidescrubber.IconCompatParcelizer = onPause;
                                    i = 6;
                                    hidescrubber.RemoteActionCompatParcelizer(i);
                                    break;
                                case -7:
                                    return;
                                case -6:
                                    i7 = 13;
                                    break;
                                case -5:
                                    i7 = 24;
                                    break;
                                case -4:
                                    hidescrubber.IconCompatParcelizer = 2;
                                    hidescrubber.RemoteActionCompatParcelizer(10);
                                    hidescrubber.RemoteActionCompatParcelizer(17);
                                    MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                                    hidescrubber.RemoteActionCompatParcelizer(17);
                                    moveableTextView.AudioAttributesImplApi26Parcelizer = (int[]) hidescrubber.MediaBrowserCompatItemReceiver;
                                    break;
                                case -3:
                                    hidescrubber.IconCompatParcelizer = 2;
                                    hidescrubber.RemoteActionCompatParcelizer(10);
                                    hidescrubber.RemoteActionCompatParcelizer(17);
                                    Object obj = hidescrubber.MediaBrowserCompatItemReceiver;
                                    hidescrubber.RemoteActionCompatParcelizer(17);
                                    toMagicModuleMetaRepoModel.write(obj, (String) hidescrubber.MediaBrowserCompatItemReceiver);
                                    break;
                                case -2:
                                    hidescrubber.AudioAttributesImplApi21Parcelizer = "";
                                    hidescrubber.RemoteActionCompatParcelizer(1);
                                    break;
                                case -1:
                                    i7 = 7;
                                    break;
                                default:
                                    break;
                            }
                        }
                        throw th;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        } catch (Throwable th5) {
            Throwable cause4 = th5.getCause();
            if (cause4 == null) {
                throw th5;
            }
            throw cause4;
        }
    }

    public final void setTextSizes(float[] p0) throws Throwable {
        hideScrubber hidescrubber = new hideScrubber(this, p0);
        try {
            int i = 0;
            int i2 = onPrepareFromMediaId;
            byte[] bArr = onMediaButtonEvent;
            Object[] objArr = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 1714, bArr[12], bArr[24], objArr2);
            String str = (String) objArr2[0];
            short s = (short) 1708;
            Object[] objArr3 = new Object[1];
            a(s, bArr[6], bArr[106], objArr3);
            Object[] objArr4 = new Object[1];
            a(s, bArr[6], bArr[106], objArr4);
            int iIntValue = 128 - ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0]), Class.forName((String) objArr4[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue();
            Object[] objArr5 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 209, bArr[14], bArr[22], objArr6);
            String str2 = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            a(s, bArr[6], bArr[106], objArr7);
            int iIntValue2 = 8094 - ((Integer) cls2.getMethod(str2, Class.forName((String) objArr7[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", 0, 0)).intValue();
            Object[] objArr8 = new Object[1];
            a((short) 1822, bArr[343], bArr[78], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 1494, bArr[69], bArr[22], objArr9);
            Object[] objArr10 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod((String) objArr9[0], null).invoke(null, null)).intValue() >> 16), objArr10);
            String str3 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a((short) (i2 | 1730), bArr[6], bArr[78], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a((short) 1472, bArr[14], bArr[66], objArr12);
            String str4 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(s, bArr[6], bArr[106], objArr13);
            int i3 = -((Integer) cls4.getMethod(str4, Class.forName((String) objArr13[0]), Character.TYPE).invoke(null, "", '0')).intValue();
            Object[] objArr14 = new Object[1];
            a((short) 1770, bArr[6], bArr[78], objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            a((short) 1568, bArr[26], bArr[4], objArr15);
            int i4 = (((Long) cls5.getMethod((String) objArr15[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr15[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 86;
            Object[] objArr16 = {0, 0, 0, 0};
            Object[] objArr17 = new Object[1];
            a((short) (i2 | 1194), bArr[6], bArr[78], objArr17);
            Class<?> cls6 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            a(bArr[27], bArr[29], bArr[78], objArr18);
            Object[] objArr19 = new Object[1];
            b(i3, i4, (char) (((Integer) cls6.getMethod((String) objArr18[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr16)).intValue() + 56458), objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            short s2 = (short) 1616;
            byte b = bArr[106];
            Object[] objArr21 = new Object[1];
            a(s2, b, b, objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            a((short) 1601, bArr[7], bArr[12], objArr22);
            String str5 = (String) objArr22[0];
            byte b2 = bArr[106];
            Object[] objArr23 = new Object[1];
            a(s2, b2, b2, objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str5, Class.forName((String) objArr23[0])).invoke(str3, objArr20);
            int[] iArr = new int[objArr24.length];
            int i5 = 0;
            while (i5 < objArr24.length) {
                Object[] objArr25 = {objArr24[i5]};
                int i6 = onPrepareFromMediaId;
                byte[] bArr2 = onMediaButtonEvent;
                Object[] objArr26 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[i]);
                Object[] objArr27 = new Object[1];
                a((short) (i6 | 1576), bArr2[12], bArr2[29], objArr27);
                String str6 = (String) objArr27[i];
                byte b3 = bArr2[106];
                Object[] objArr28 = new Object[1];
                a(s2, b3, b3, objArr28);
                Object objInvoke = cls8.getMethod(str6, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                Object[] objArr29 = new Object[1];
                a((short) (i6 | 1592), bArr2[24], bArr2[106], objArr29);
                Class<?> cls9 = Class.forName((String) objArr29[0]);
                byte b4 = bArr2[24];
                Object[] objArr30 = new Object[1];
                a((short) (i6 | 1570), (byte) i6, b4, objArr30);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                i = 0;
            }
            while (true) {
                int i7 = i + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (hidescrubber.RemoteActionCompatParcelizer(iArr[i])) {
                    case -16:
                        i = 34;
                        break;
                    case -15:
                        hidescrubber.RemoteActionCompatParcelizer(30);
                        if (hidescrubber.RemoteActionCompatParcelizer == 23) {
                            i7 = 25;
                            i = i7;
                        } else {
                            i = 1;
                        }
                        break;
                    case -14:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        hidescrubber.IconCompatParcelizer = hidescrubber.MediaBrowserCompatItemReceiver.hashCode();
                        try {
                            hidescrubber.RemoteActionCompatParcelizer(6);
                            i = i7;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i >= 30) {
                            }
                            throw th;
                        }
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        hidescrubber.RemoteActionCompatParcelizer(5);
                        throw ((Throwable) hidescrubber.MediaBrowserCompatItemReceiver);
                    case -12:
                        i = 35;
                        break;
                    case -11:
                        i = 37;
                        break;
                    case -10:
                        hidescrubber.RemoteActionCompatParcelizer(13);
                        if (hidescrubber.RemoteActionCompatParcelizer == 0) {
                            i7 = 23;
                        }
                        i = i7;
                        break;
                    case -9:
                        hidescrubber.IconCompatParcelizer = 1;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(11);
                        onPlay = hidescrubber.RemoteActionCompatParcelizer;
                        i = i7;
                        break;
                    case -8:
                        hidescrubber.IconCompatParcelizer = onPause;
                        hidescrubber.RemoteActionCompatParcelizer(6);
                        i = i7;
                        break;
                    case -7:
                        return;
                    case -6:
                        i = 14;
                        break;
                    case -5:
                        i = 12;
                        break;
                    case -4:
                        try {
                            hidescrubber.IconCompatParcelizer = 2;
                            hidescrubber.RemoteActionCompatParcelizer(10);
                            hidescrubber.RemoteActionCompatParcelizer(17);
                            MoveableTextView moveableTextView = (MoveableTextView) hidescrubber.MediaBrowserCompatItemReceiver;
                            hidescrubber.RemoteActionCompatParcelizer(17);
                            moveableTextView.MediaBrowserCompatCustomActionResultReceiver = (float[]) hidescrubber.MediaBrowserCompatItemReceiver;
                            i = i7;
                        } catch (Throwable th3) {
                            th = th3;
                            if (i >= 30 || i >= 34) {
                                throw th;
                            }
                            hidescrubber.AudioAttributesImplApi21Parcelizer = th;
                            hidescrubber.RemoteActionCompatParcelizer(35);
                            i = 24;
                        }
                        break;
                    case -3:
                        hidescrubber.IconCompatParcelizer = 2;
                        hidescrubber.RemoteActionCompatParcelizer(10);
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        Object obj = hidescrubber.MediaBrowserCompatItemReceiver;
                        hidescrubber.RemoteActionCompatParcelizer(17);
                        toMagicModuleMetaRepoModel.write(obj, (String) hidescrubber.MediaBrowserCompatItemReceiver);
                        i = i7;
                        break;
                    case -2:
                        hidescrubber.AudioAttributesImplApi21Parcelizer = "";
                        hidescrubber.RemoteActionCompatParcelizer(1);
                        i = i7;
                        break;
                    case -1:
                        i = 7;
                        break;
                    default:
                        i = i7;
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveableTextView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.moveRunner = new Runnable() { // from class: o.updateDrawableState
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                MoveableTextView.IconCompatParcelizer(this.write);
            }
        };
        this.hideRunner = new Runnable() { // from class: o.setSystemGestureExclusionRectsV29
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                MoveableTextView.read(this.RemoteActionCompatParcelizer);
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplApi21Parcelizer = write;
        this.AudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompatSearchResultReceiver = 60000L;
        this.MediaMetadataCompat = -1L;
        this.pairOfTimeAndIndex = new Pair<>(Boolean.FALSE, -1);
        this.blinkerTexts = (String[]) getTag(R.id.tag_moveable_textview_blinker_text);
        this.onMoveListener = new getCreatedOnDateMs() { // from class: o.updateScrubbing
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return MoveableTextView.IconCompatParcelizer();
            }
        };
        scrubIncrementally.IconCompatParcelizer(this, context, null);
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{this}, i, i2, -841728174, 841728174);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(attributeSet, "");
        this.moveRunner = new Runnable() { // from class: o.updateDrawableState
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                MoveableTextView.IconCompatParcelizer(this.write);
            }
        };
        this.hideRunner = new Runnable() { // from class: o.setSystemGestureExclusionRectsV29
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                MoveableTextView.read(this.RemoteActionCompatParcelizer);
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplApi21Parcelizer = write;
        this.AudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompatSearchResultReceiver = 60000L;
        this.MediaMetadataCompat = -1L;
        this.pairOfTimeAndIndex = new Pair<>(Boolean.FALSE, -1);
        this.blinkerTexts = (String[]) getTag(R.id.tag_moveable_textview_blinker_text);
        this.onMoveListener = new getCreatedOnDateMs() { // from class: o.updateScrubbing
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return MoveableTextView.IconCompatParcelizer();
            }
        };
        scrubIncrementally.IconCompatParcelizer(this, context, attributeSet);
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{this}, i, i2, -841728174, 841728174);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(attributeSet, "");
        this.moveRunner = new Runnable() { // from class: o.updateDrawableState
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                MoveableTextView.IconCompatParcelizer(this.write);
            }
        };
        this.hideRunner = new Runnable() { // from class: o.setSystemGestureExclusionRectsV29
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                MoveableTextView.read(this.RemoteActionCompatParcelizer);
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplApi21Parcelizer = write;
        this.AudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompatSearchResultReceiver = 60000L;
        this.MediaMetadataCompat = -1L;
        this.pairOfTimeAndIndex = new Pair<>(Boolean.FALSE, -1);
        this.blinkerTexts = (String[]) getTag(R.id.tag_moveable_textview_blinker_text);
        this.onMoveListener = new getCreatedOnDateMs() { // from class: o.updateScrubbing
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return MoveableTextView.IconCompatParcelizer();
            }
        };
        scrubIncrementally.IconCompatParcelizer(this, context, attributeSet);
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        int i3 = getClassId.AudioAttributesCompatParcelizer.read();
        IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{this}, i2, i3, -841728174, 841728174);
    }

    private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i3 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(onFastForward[i2 + i3])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36622 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 2340, (Process.myTid() >> 22) + 28, 480654850, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(onPlayFromMediaId), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) + 9701, (ViewConfiguration.getTouchSlop() >> 8) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), TextUtils.getOffsetBefore("", 0) + 23784, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) View.getDefaultSize(0, 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23783, (KeyEvent.getMaxKeyCode() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX INFO: renamed from: com.marrow.ui.views.MoveableTextView$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0007\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n"}, d2 = {"Lcom/marrow/ui/views/MoveableTextView$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "MediaBrowserCompatCustomActionResultReceiver", "[F", "read", "", "write", "[I", "IconCompatParcelizer", "()[I", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "", "[[I", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static int[] IconCompatParcelizer() {
            return MoveableTextView.AudioAttributesCompatParcelizer();
        }

        public static int[] write() {
            return MoveableTextView.write();
        }

        public static int[] read() {
            int i = getClassId.AudioAttributesCompatParcelizer.read();
            int i2 = getClassId.AudioAttributesCompatParcelizer.read();
            return (int[]) MoveableTextView.IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[0], i, i2, -1483312747, 1483312750);
        }

        public static int[] AudioAttributesCompatParcelizer() {
            return MoveableTextView.read();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        byte[] bArr = new byte[1877];
        System.arraycopy("hmyI\u0012û\u0013\u0002ÿ\u0000ÏL\u0004ú\bÇ+*üú\u0004÷\u0010\u0010\u000eõ\u0011\u0003\b\u0001þ\u0018á Ü+\b÷\u0018\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Ñ1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005Û$\u0016Ù \b\u0006ä6\u0002ô\u0018ú\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ*+ÿ\u0006ö\rÛ.\bù\r\fú\u0014\b÷\u0004ó\u0018\u0001\u0010\rú\tý\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿+\u0016\u0018\u0001æ$ú\b\f\nû\u0006\u0018Ü\u001cü\u001aðÒCú\u0012þÌ\u001a*þ\u0016æ\u0017\u0011\tõ\u000eú\u0007\u0003\u0014Ý(\u0004þî'ø\u0013\u0005æ\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏN÷\u0000\b\u0003\u0014¿\u001c8ýö\u0012û\u0002\u0006\u000fþì\"\u000f\u0006ç\u0018\u0001\u0017\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Þ0\u0002\u000b\u0000ü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõ\fú\u0014\b÷\u0004ó\u0018\u0001\u0010\rú\týî\u0018\u0012\u0006\t\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0003\u0014ä\u001b\u0016ð\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ú*\u0006\bý\u0003\u0014á'ø\u0013\u0005÷\u0004ô&ò\u0018öä6\u0002ô\u0018ú\u000b\u0004ú\u0017\u0006Ú*û\u0006\u0018Ü\u001cü\u001aðÒCú\u0012þÌ\u001c8ð\u0007\u0010\tú\u000b\u0004\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004ë*üú\u0012û\u0013\u0002ÿ\u0000ÏKö\fþ\u0010ý\f\u0004\u0010º:\u0006\u000eùÒ\u001a&\u000eùç'\f\u0005å(ù\u0003\u0018ú\u000b\u0004\u0011\u0004\rô\u0012\u0007â)ñ\u0016\u0007ä\u0017\u0003ö Ú&\u0003æ&\u0007\u0010ø\u0005\u0013\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À'$ÿ\n\u000b×þ\u000eþ\u0012ù\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼\"\u001f\u0019Ñ6ô\u000e\u000b\u0003\u0014Þ'ú\n\u0002\b\u0001\u0012à\u001d\u0014ò÷&ò\u0018öí\u0019\u0017ý\u0006\b\u0000ù\u0010\u0002\u0016ðí\u001d\u0014ò÷&ò\u0018ö\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005Ý&\u0006\u0000\u0019ü\rÕ&\fú\u001d\u0003\u0014è\u0017\nû\u0010\râ \u000bó\nð\u001e\b\u0006\u0003\u0014Þ\u0019\u001cØ\u001f\u0019Ï1ú\u0006\u0003\u0014Þ\u0019\u001cö\t\rýÜ3ô\u001b÷\nþá#\u0007\n\u0002ó\u001b\u0016ð\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À\u001a1\u0002\b\b\u0010ø\u0005\u000e\u0003\u0014Õ&\u0001\bä*þ\u0016\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ý.\bÚ0\u0002\u000b\u0000\u0003\u0014Þ!\n\u0000\t\rýÞ+\u0002\nþô\u0014\f\bù\u000b\u0010\n\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005Û$\u0016æ\u001b\u0016ð\u0003\u0014ë\u001a\u0005\u0003Û1\u0004\u000b\u0003\u0002\u0002\fæ\u001a\tý\u000f\u000b\u0004\u0011\u0003\b\u0001þ\u0018á Ü1ô\u0007\u0016ú\u000b\u0004ÿ\u0019Ï1ú\u0006æ1\u0002\u0003ë&\u0003ü\nþ\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ''\u0002ù\u0007\u0013\u0005\u0003\u0014å\u0019\u000fø\u0001\bñ'ü\u000b\bü\u0010\n\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À;\u0013ô\u001bï\u0006\u000fþÎ\u001b3ô\u001bï\u0006\u000fþø\u0013\u0001\u0002\u000fôï&ö\u0007\u000b\u0010\n\u0003\u0014Ø'\u0000ç.\bá\u0018\u0011ý\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿\u00182û\u0013\u0002ÿ\u0000ä*þ\u0016ô\u0007\u0016ö\u0012\u0003\u0014Þ!\u000e\u0005\u0002\bü\u001aðÒL\u0004ú\bÇ)\u0014\u0012û\u0010\u0003ü\u0018\u0001Ú*\u000b\u0012û\u0013\u0002ÿ\u0000Ï:\u0011\u0004\u000bö\u000e\u000b¿Iø\u0013À)\u0018\u0013\u0001\u000b\u0002ö\u0007\u0013\u0003\u0014Õ*\u000f\u0002\u0001ú\u001dÙ\u001d\u0014\u0003üÿ\u0015\u0012û\u0013\u0002ÿ\u0000ÏL\u0004ú\bÇ\u001b*\u000f\u0002\u0001ú\u001dÙ\u001d\u0014\u0003üÿ\u0015÷\u0000\u0015ùí\u001e\u0014ò\f\f\u0002\t\u0003\u0006\u0011á\u001e\u0014ò\f\f\u0003\u0014Ô1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0012û\u0013\u0002ÿ\u0000Ï:\u0011\u0004\u000bö\u000e\u000b¿Iø\u0013À\u001a1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\bü\u0001\u000e\u000bò\u0018ú\u000b\u0004ü\u001aðÒCú\u0012þÌ$\u0019\u0018ù\u0006\u0016\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Õ0\u0002\u000b\u0000¹.\u0019\u0016ú\u0007\nã\u001a\u001dû\u000b\u0004á\u0016\u0016ô\u0011\u000b÷\u0014Þ\u0019\u0016ú\u0007\n\n\u0012û\u0013\u0002ÿ\u0000ÏN÷\u0000\b\u0003\u0014¿\u001d1ô\u0011ýì\u001a\u001dû\u000b\u0004µ-\u001a\u001dû\u000b\u0004á\u0016\u0016ô\u0011\u000b\u0010ô\u001aø\u0010\n\u000f\u000eõü\u001aðÒCú\u0012þÌ\u00192\u0005\u0002þ\u0001\u0012\u0012\u0005\u0002þ\u0001\u0012í\u0010\u0010\u000eõü\u001aðÒCú\u0012þÌ%,ýú\b\u0012ü\u001aðÒCú\u0012þÌ*+ÿ\u0006ö\r\u0017\u0002\u0005ø\u000e\u000bå\u001a\týí!\b\u0005\u0002\u000f\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼$'\nú\u000b\u0004Ü6ô\u000e\u000b\u001cö\u000fØ1\u0002\u0003ë&\u0003ü\nþú\u0000\u0003\u0014Ü\u001f\u0019Þ\u0018\u0010ú\u0001\u0018å\u001a\tý\u000f\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏDý\u0004\nýÒ\u00189ô\n\u000bê#ô\u0007\r\u0003\u0014Þ!\ní\u001e\u0002\u000eýý\u0003\u0014Ø*\bø\u0004\u0010Ú'\u0016ú\u000b\u0004â\u001f\u0019à\u001a\tý\u000f\u000b\u0004\u0003\u0014Þ'ú\u0006\u0003\u0014å\u0012\u0014é\u001a\tý\u000f\u000b\u0004ù\u000fÿí\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017\u0003\u0014Õ&\u0006\u0000\u0019ü\rä\u001b\u0016ð\u0017\u0002\u0005ø\u000e\u000bå\u0019\u000fø\u0001\bõ\u001a\týí!\b\u0005\u0002\u000f\u0000\tú\týí!\b\u0005\u0002\u000f\u0003\u0014Û0ý\bé\u0012\u0014é\u001a\tý\u000f\u000b\u0004\u0003\u0014Õ0\u000bò\u000fþô\u0012\u0014é\u001a\tý\u000f\u000b\u0004÷\u0014ä\u0017\u0005\u0004\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼\u001e0ô\u001aø\u0010\n\u0003\u0014Ò&\u0016\u0001\u0002\u000e\u0004öç0ô\u001aø\u0010\n\u0010\týþ\u0003\u0014Ü\u001f\u0019Þ\u0018\u0010ú\u0001\u0018Õ&\fú\u001d\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ý.\bÖ*\u0006\bý\u0003\u0014å \u000bó\nð\u001e\b\u0006\u0003\u0014Þ\u0019\u001cö\t\rýÞ+\u0002\nþô\u0014\f\bù\u000b\u0010\n\u0003\u0014Ô#\u0014\bß'ú\u0006\u0003\u0014à\u001c\u0005\u0012÷\u0014Ò*\u0013ö\u0012\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005ß1üÿ\u0016ú\u000b\u0004\u0003\u0014å#ü\t\u0005ý\u0004í\u001e\u000eþ\u0012ùø\u0004\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À )ù\u000b\u0003æ.\b\u0000ù\u0018\u0003\u0014Ó,\u0010\u0004â\u001a\u0012ã\u001e\u0014ò\f\u0003\u0014× \b\n\nþã$\b\u0003ì\u001e\u000eþ\u0012ù\u0003\u0014Þ\u0019\u001cã\u001e\u0002\u000eýý\u0011\u0003ú\f\nüí\u001d\u0001\u0017\u0007\u0002ø\u0004ô&ò\u0018ö\u0013\u0011Ü\u001e\u0000ø\u0013\u0001\u0002\u000fôó\u001b\u0016ðø\u0013\u0001\u0002\u000fôó\u001b\u0016ðá2ûô&ò\u0018ö\u0003\u0014à\u001c\u0005\u0012÷\u0014Ó(\u0006\u000e\bø\u0011à\u001a\u0000\u0003\u0014Ö$\b\u0003ó\u001e\b\u0006\u0016ú\u0000\u0003\u0014Ö,ú\u0014\b÷\u0004ä2\nä\u001a\tý".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 1877);
        onMediaButtonEvent = bArr;
        onPrepareFromMediaId = 5;
        MediaBrowserCompatItemReceiver();
        onPause = 0;
        onPlay = 1;
        INSTANCE = new Companion(null);
        MediaBrowserCompatCustomActionResultReceiver = new float[]{9.0f, 9.0f, 40.0f};
        write = new int[]{0, -16777216, 0};
        AudioAttributesImplApi26Parcelizer = new int[]{-16777216, -1, -16777216};
        RemoteActionCompatParcelizer = new int[]{0, Color.parseColor("#B3FFFFFF"), 0};
        AudioAttributesImplBaseParcelizer = new int[]{-1, -16777216, -1};
        IconCompatParcelizer = new int[][]{new int[]{1, 1}, new int[]{3, 1}, new int[]{2, 1}, new int[]{1, 3}, new int[]{3, 3}, new int[]{2, 3}, new int[]{1, 2}, new int[]{3, 2}, new int[]{2, 2}};
        read = new int[]{8388659, 49, 8388661, 8388627, 17, 8388629, 8388691, 81, 8388693};
    }

    public static final /* synthetic */ int[] RemoteActionCompatParcelizer() {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        return (int[]) IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[0], i, i2, -1483312747, 1483312750);
    }

    private final void IconCompatParcelizer(int p0) {
        IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{this, Integer.valueOf(p0)}, getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), -1064144352, 1064144354);
    }

    private final void MediaBrowserCompatMediaItem() {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{this}, i, i2, -841728174, 841728174);
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        int i = getClassId.AudioAttributesCompatParcelizer.read();
        int i2 = getClassId.AudioAttributesCompatParcelizer.read();
        IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{this}, i, i2, 247168840, -247168839);
    }

    static void MediaBrowserCompatItemReceiver() {
        char[] cArr = new char[8395];
        ByteBuffer.wrap("Ü!|G\u009cÔ=O]ÖþB\u001eý¿ißðxt\u0098ä9\u0001Y\u0098ú\u0013\u001a\u0094»\u0006Û\u0098t:\u0094µ57U¨ö#\u0016F¶Ö×KwÊ\u0090P0þQmñò\u0012m²ýÓ`s\u0084\u008c\u0014,\u0093M\u0016í\u0082\u000e=®¢Ï0o«\u00881(^HÙéO\tÐªFÊÁkg\u008bè$nDéåx\u0005\u009c¦\u000bÆ\u0088g\n\u0087\u0099 '@¸á/\u0001¶¢&Â¡bÁ\u0083T#Ð|H\u009cß=b]öþq\u001e÷¿yß\u009ex\u0019\u0098\u008f9\u0012Y\u0086ú\u0001\u001a§»+Û®t)\u0094¿4Ã\u0000ªÜ!|G\u009cÔ=S]ÜþB\u001eý¿hßðxk\u0098û9\u001eY\u0086ú\u0012\u001a\u0092»\u0006Û\u009dt/\u0094´5/U°ö\"\u0016D¶Ö×QwÓ\u0090D0ÿQbñò\u0012r²úÓ`s\u0084\u008c\t,\u008eM\u0015í\u009c\u000e<®·Ï+oª\u0088:(@HØéS\tØªFÊÁko\u008bô$oDõå~\u0005\u009c¦\u0017Æ\u008dg\u0017\u0087\u0084 &@¸á,\u0001³¢&Â¾bÂ\u0083T#Ð|Q\u009cÂ=}]ïþp\u001eë¿~ß\u009ex\u0006\u0098\u00889\fY\u009bú\u001a\u001aº»5Ûµt(\u0094¼4ÂUVõÑ\u0016W¶Ú×~wù\u0090o0óQfñá\u0012\u0007²\u008cÓ\u000es\u0089\u008c\u001f,¡M6í\u00ad\u000e>®¤ÎßoF\u008fÒ(RHÝé@\täª`Êîkv\u008b÷$\u001cD\u0097å\u000f\u0005\u008a¦\u0005Æ£g!\u0087² 3@»á \u0001[¡ÉÂTbÈ\u0083]#â|v\u009cñ=w]þþ\u001e\u001e\u0099¿\u000fß\u0097x\u0006\u0098\u009f9%Y´ú/\u001aµ»6Û\\{É\u0094H4ÊUEõã\u0016l¶ò×mwû\u0090}0\u009aQ\u0015ñ\u0093\u0012\u0015Ü!|G\u009cÔ=S]ÜþB\u001eý¿hßðxk\u0098û9\u001eY\u0087ú\b\u001a\u008c»\u0018Û\u0099t:\u0094µ56U¨ö:\u0016\\¶××IwÊ\u0090E0äQxñí\u0012w²æÓus\u009a\u008c\u0015,\u0095M\bí\u009c\u000e<®«Ï.oª\u0088%(JHØéS\tÙªFÊÁkg\u008bè$nDéå\u007f\u0005\u0080¦\u0016Æ\u0091g\u0017\u0087\u0099 >@§á'\u0001¬¢>Â¼bÚ\u0083I#Ð|H\u009cÃ=a]èþp\u001eô¿zß\u009ex\u0019\u0098\u008f9\u0013Y\u0086ú\u0001\u001a§»,Û®t)\u0094¿4ÅUVõÑ\u0016W¶Ý×~wù\u0090o0öQfñá\u0012\u0007²\u008eÜ!|G\u009cÔ=O]ÖþB\u001eý¿ißðxt\u0098ä9\u0001Y\u0098ú\u0013\u001a\u0094»\u0006Û\u0098t:\u0094µ57U¨ö#\u0016F¶Ö×Hw×\u0090D0æQfñò\u0012q²øÓ`s\u009b\u008c\u000f,\u008eM\u0016í\u009c\u000e<®·Ï$oª\u0088%(KHØéS\tÑªZÊÀk{\u008bé$sDèåc\u0005\u0082¦\u0016Æ\u0088g\u0015\u0087\u0084  @¡á2\u0001\u00ad¢9Â bÛ\u0083I#Ð|H\u009cÝ=b]öþq\u001e÷¿{ß\u009ex\u0007\u0098\u008f9\fY\u0087ú\u001d\u001a¥Ü!|G\u009cÔ=O]ÖþB\u001eý¿ißðxt\u0098ä9\u0000Y\u0098ú\u000f\u001a\u0092»\u0006Û\u009et#\u0094´5/U°ö\"\u0016D¶Ö×QwÓ\u0090D0ÿQbñò\u0012t²þÓ`s\u008f\u008c\u0014,\u008fM\u0013í\u0082\u000e\"®¶Ï-o´\u0088$(_HÌéR\tÍªSÊÀk{\u008bé$rDèåc\u0005\u0081¦\nÆ\u0090g\u000b\u0087\u0099 #@¸á*\u0001µ¢&Â¸bÄ\u0083T#Ó|V\u009cÂ=}]ëþn\u001eê¿zß\u0080x\u0018\u0098\u00939\u0011Y\u0099ú\u0000\u001a»»)Û¶t(\u0094£4ÁUOõÐ\u0016K¶Ù×g\u0093K3-Ó¾r%\u0012¼±(Q\u0097ð\u0003\u0090\u009a7\u001f×\u0094vt\u0016ìµaUæôm\u0094ò;PÛÆzD\u001aÃ¹QY6ù½\u0098 8 ß6\u007f\u008e\u001e\u0012¾\u0080]\u001dý\u008c\u009c\u001f<ðÃ\u007fcÿ\u0002b¢öAVáÁ\u0080D ÀÇOg \u0007²¦9F³å,\u0085«$\rÄ\u0082k\u0004\u000b\u0083ª\u0015Jêé|\u0089û(}ÈóoT\u000fÊ®LNÆíX\u008dÊ-¥Ì>l¥3?Ó¶r\u0016\u0012\u0082±\u0004Q\u0080ð\u000f\u0090é7m×øvg\u0016ñµrUÐô_\u0094Ù;[ÛÈ{·\u001a!º£Y ù¯\u0098\t8\u0088ß\u0018\u007f\u0087\u001e\u0011¾\u0090Ü!|G\u009cÔ=O]ÖþB\u001eý¿ißðxt\u0098ä9\u0001Y\u0098ú\u0013\u001a\u0094»\u0006Û\u0098t:\u0094µ57U¨ö#\u0016F¶Ö×Hwß\u0090D0æQdñò\u0012q²øÓ`s\u009b\u008c\u000f,\u008eM\u0016í\u0082\u000e!®¨Ï0o«\u00880(^HÙéG\tÌªGÊÝkf\u008bô$oDõå~\u0005\u009c¦\u0017Æ\u008dg\u0017\u0087\u0084 '@¤á2\u0001²¢;Â bÇ\u0083J#Î|I\u009cß=b]öþn\u001eê¿yß\u0080x\u0018\u0098\u00939\u0011Y\u0099ú\u0000\u001a»»)Û¶t(\u0094£4ÁUOõÐ\u0016K¶Ù×gwø\u0090s0ñQ|ñà\u0012\u001b²\u0089Ó\u0014Ü!|G\u009cÔ=O]ÖþB\u001eá¿bßðxk\u0098û9\u001eY\u0099ú\n\u001a\u008c»\u0007Û\u0099t:\u0094µ54U¨ö;\u0016A¶Ö×IwÔ\u0090D0ÿQcñò\u0012u²ùÓ`s\u0087\u008c\u0000,\u008eM\tí\u0096\u000e<®¯Ï(oª\u0088=(GHØéS\tÙªFÊÁkg\u008bè$nDñåx\u0005\u009c¦\u0017Æ\u008dg\u0017\u0087\u0084 '@ á2\u0001µ¢?Â bÛ\u0083I#Ð|H\u009cÛ=g]öþq\u001e÷¿{ß\u009ex\u0001\u0098\u00869\fY\u009fú\u0015\u001aº»5Û³t0\u0094¢4ÆUKõÐ\u0016P¶Ú×~wá\u0090f0ìQgñý\u0012\u0002²\u0094Ó\u0014s\u0097\u008c\u0002,¦M.í°\u000e0®½ÎÞoY\u008fÏ(UHÆéZ\tàªtÊïku\u008bø$\u001cD\u008få\u0004\u0005\u008a¦\u0005Æ£g#\u0087² 6@½á \u0001G¡ÀÂNbÉ\u0083_#å|v\u009cê=p]äþ\u001f\u001e\u0085¿\bß\u008cx\u001f\u0098\u00949:Yµú3\u001a³»\"ÛF{Â\u0094P4ÐUQõþ\u0016y¶ï×uwæ\u0090z0\u0080Q\u0014ñ\u008f\u0012\u0015²\u0098Ó<s¯\u008c$,ªM%íC\rÃ®RÎ×oZ\u008fÀ(gHàén\téª\u007fÊ\u0085k\u0016\u008b\u008a$\u0010D\u0084å?\u0005¥¦(Æ¬g?\u0087´'Ú@UàÓ\u0001S¡ÂÂfbâ\u0083p#ñ|y\u009c\u009e=\u0003]\u008cþ\f\u001e\u009d¿\u001fßºx)\u0098º9(Y£ùÁ\u001aBºÐÛQ{Ü\u0094~4ãUkõì\u0016{¶ù×\u001aw\u008f\u0090\u00140\u0088Q\u0019ñ§\u00126²«Ó>s¤\u0093Ä,GLÒíV\rÞ®@Îáoa\u008fî(uHûé\u001c\t\u0082ª\fÊ\u008ak\u001d\u008bª$8D¦å1\u0005¦¦4ÆDfÔ\u0087T'×@Bàæ\u0001n¡ðÂqbü\u0083\u001e#\u0085|\u0006\u009c\u008c=\u0007]\u009dþ/\u001e´¿:ß·x\"\u0098F8ÈYPùÞ\u001a\\ºþÛl{ë\u0094l4òUzõ\u009a\u0016\t¶\u0097×\bw\u0096\u0090'0¶Q$ñ¾\u0012$²JÒÍsR\u0093Ó,XLÀí{\rê®rÎèoc\u008f\u0082(\u000bH\u0090é\u000b\t\u009aª Ê¸k-\u008b²$&DµäÇ\u0005T¥ÏÆVfÝ\u0087|'ã@nàê\u0001e¡\u0080Â\u0000b\u0092\u0083\u0019#\u0099|\u0000\u009c¤=4]¯þ6\u001e»¾ÜßW\u007fÎ\u0098P8ÄY\u007fùæ\u001aiºìÛy{þ\u0094\u001a4\u008fU\u0016õ\u0088\u0016\u0003¶¢×\"w°\u009050¹PÞñC\u0011Ê²LÒÇs^\u0093ï,tLûíp\râ®\u0004Î\u008do\u0010\u008f\u009f(\u001dH¾é,\t§ª,Ê¹k>\u008bZ+ÕDQäÔ\u0005B¥ýÆifí\u0087j'å@\u0001à\u0086\u0001\u0012¡\u0099Â\u001cb\u0080\u0083;#«|1\u009c¨==]AýÖ\u001eE¾ÑßD\u007fÿ\u0098g8íYlùó\u001atº\u009aÛ\u0001{\u009b\u0094\b4\u0083U#õ®\u00160¶«×;wG\u0097Ø0SPÓñ\\\u0011À²gÒèsr\u0093è,cL\u0083í\r\r\u0090®\u0015Î\u0099o>\u008f\u00ad(+H¬é'\t¿©ÁÊTjÔ\u008bV+ÂD}äé\u0005d¥êÆef\u0081\u0087\r'\u0092@\rà\u009e\u0001\u001c¡ºÂ)b²\u00835#¢CÉ\u009cK<Ð]KýÜ\u001ec¾øßm\u007fñ\u0098f8õY\u0007ù\u0094\u001a\u000fº\u0090Û\u001f{¼\u0094-4¥U*õ¥\u0015Æ¶FÖÒwM\u0097Þ0_Púñu\u0011ö²pÒâs\u0001\u0093\u008a,\u000eL\u008aí\u0005\r¦®!Î²o3\u008f»( HAèÌ\tN©ÉÊZjå\u008bv+íDväû\u0005\u001e¥\u0099Æ\nf\u0096\u0087\u0006'\u0081@\"à¯\u0001.¡©Â:bH\u0082Ö#MCÖ\u009c\\<þ]yýê\u001ey¾æß}\u007f\u0086\u0098\r8\u008eY\tù\u009a\u001a)º¶Û%{¾\u0094$4_TÁõN\u0015Ì¶GÖÙwg\u0097ô0oPññ|\u0011\u009c²\u000bÒ\u008cs\u0010\u0093\u0084,+L¡í2\r\u00ad®?Î¿nÚ\u008fI/ÒHSèÂ\t}©ïÊojê\u008by+\u008aD\u0018ä\u0093\u0005\u0015¥\u009eÆ\u0000f»\u0087-'·@(à£\u0000Å¡LÁÐbW\u0082Ø#jCø\u009co<ø]fýá\u001e\u0003¾\u008cß\u000e\u007f\u0089\u0098\u001b8¥Y6ù±\u001a3º¿ÚÞ{E\u009bÎ4YTÆõ]\u0015î¶tÖïwq\u0097ú0\u001cP\u0097ñ\t\u0011\u009e²\u0004Ò¿s!\u0093§,,L¹í>\rZ\u00adÕÎTnÔ\u008fB/ýHlèí\tj©åÊ\u0004j\u0086\u008b\u0012+\u0093D\u0018ä\u0080\u0005'¥©Æ3f¨\u0087#'FGÉàP\u0000×¡YÁàbx\u0082ó#vCù\u009c`<\u0087]\bý\u0094\u001e\b¾\u0083ß&\u007f®\u009808«Y>ùG\u0019ØºSÚÖ{\\\u009bÀ4gTéõq\u0015è¶{Ö\u0088w\u0016\u0097\u008d0\u0017P\u009cñ>\u0011¡²&Ò¬s;\u0093½3ÃLTìÓ\rU\u00adØÎ|n÷\u008fj/ñHdè\u0083\t\u0005©\u0089Ê\fj\u0087\u008b\u001a+®D4ä¯\u00052¥·ÅÜfW\u0086Ë'VGÄàa\u0000æ¡rÁñb{\u0082ý#\u001aC\u0095\u009c\u0015<\u0095]\u0002ý£\u001e+¾°ß7\u007f¹\u009fÃ8XXÓùW\u0019Øº@Úç{h\u009bô4hTãõ\u0007\u0015\u0089¶\u0010Ö\u008bw\u001f\u0097¦08P³ñ6\u0011¼² ÒGrÉ\u0093Z3ÈLCìæ\rm\u00adðÎwnù\u008f\u000b/\u0098H\u000fè\u0092\t\u001a©\u0080Ê;j¯\u008b7+¨D?äA\u0004Ë¥PÅËf_\u0086ä'xGïàq\u0000ø¡`Á\u009bb\u000f\u0082\u0094#\bC\u0098\u009c\"<¶]-ý¶\u001e>¾^ÞÙ\u007fI\u009f×8FXÝùd\u0019éºnÚé{y\u009b\u00874\u0016T\u008bõ\u0012\u0015\u0084¶#Ö¬w2\u0097\u00ad0=P´ðÚ\u0011I±ÐÒVrÂ\u0093}3ãLpìë\ry\u00ad\u0082Î\u0018n\u008f\u008f\u0012/\u0099H\u0000è»\t/©»Ê(j¿\u008aÂ+NKÐäW\u0004Ø¥aÅøfi\u0086ù'fGõà\u000e\u0000\u0094¡\u000fÁ\u009cb\u001e\u0082¼#+C®\u009c5<¤\\ÃýF\u001dË¾LÞÇ\u007fT\u009fç8tXóù|\u0019âº\u0001Ú\u0088{\u000f\u009b\u008a4\u0005Tªõ&\u0015²¶-Ö²w?\u0097Z7ÉPZðÈ\u0011C±èÒnrð\u0093r3ÿL\u001eì\u008d\r\u000f\u00ad\u008cÎ\u0007n\u0094\u008f#/´H/è¼\t8©\\É×jD\u008aÑ+DKãäf\u0004è¥lÅçft\u0086\u008e'\u0014G\u0091à\u0016\u0000\u0082¡!Á¨b+\u0082ª#9C@ãØ<S\\ØýS\u001dÀ¾{Þá\u007fr\u009fè8\u007fX\u0088ù\u0016\u0019\u0091º\u001fÚ\u0099{>\u009b¥4,T²õ&\u0015½µÄÖ@vÎ\u0097W7ÜP|ð÷\u0011e±ôÒdr\u009f\u0093\r3\u008dL\fì\u0087\r\u0015\u00ad¢Î4n±\u008f5/¢OÉèK\bÐ©KÉÑjg\u008aø+oKøäf\u0004á¥\u000eÅ\u0080f\u000e\u0086\u0090'\u0019G¼à#\u0000\u00ad¡*Á¥aË\u0082B\"ÒCMãÓ<[\\úýu\u001dû¾|Þâ\u007f\u0001\u009f\u00888\u0005X\u008aù\u0019\u0019¡º$Ú²{9\u009b»4 T[ôÁ\u0015WµÈÖXvâ\u0097v7íPuðù\u0011\u001e±\u0099Ò\u0007r\u0095\u0093\u00063\u009dL.ì´\r/\u00ad·Î\"nA\u008eÈ/NOÊèE\bë©xÉójy\u008aó+`K\u0087ä\n\u0004\u0091¥\bÅ\u009ff#\u0086¨'0G«à9\u0000B ÄÁRaÑ\u0082Y\"ØCzãé<q\\ñýb\u001d\u009d¾\u000bÞ\u008c\u007f\u0017\u009f\u00848#X§ù(\u0019¬º;Ú¿zÁ\u009bT;ÏTUôÞ\u0015bµöÖqv÷\u0097x7\u0081P\u0018ð\u0093\u0011\u0011±\u009aÒ\u0018rº\u0093)3±L6ì¢\fÁ\u00adIÍÄnJ\u008eÙ/cOãèr\bí©{Éüj\u0003\u008a\u0094+\u000fK\u0095ä\u001e\u0004¦¥6Å±f7\u0086¸&ÅGXçÓ\u0000Q ÚÁTaú\u0082i\"öCtãâ<\u001d\\\u008bý\f\u001d\u009f¾\u0004Þ£\u007f \u009f¯8,X§ù=\u0019G¹ÈÚNzÕ\u009bZ;âTvôí\u0015rµûÖ\u001ev\u0099\u0097\u000f7\u0091P\u001bð\u0080\u0011'±¬Ò6r¨\u0093?3ASÍìP\fË\u00adYÍãnf\u008eò/mOûè}\b\u0085©\u0014É\u008fj\u0015\u008a\u009f+$K¶ä1\u0004·¥9ÅGeØ\u0086O&ÔGZçÀ\u0000{ éÁraý\u0082b\"\u0081C\tã\u008e<\n\\\u0099ý&\u001d¡¾2Þ\u00ad\u007f;\u009f½?ÀXTøÓ\u0019P¹ÜÚ|zë\u009bh;ðTdô\u009f\u0015\u0005µ\u008fÖ\u0011v\u0086\u0097\u001b7¯P4ð³\u00110±¹ÑÜrK\u0092È3^SÄì\u007f\få\u00adnÍùnf\u008eý/\u0002O\u0081è\u000e\b\u0089©\u001fÉ¡j-\u008a°+7K½ëÂ\u0004X¤ÏÅUeÛ\u0086@&çGmçð\u0000h ãÁ\u0001a\u008b\u0082\u0004\"\u008aC\u0019ãª<8\\«ý4\u001d¦¾!ÞG~É\u009f[?ÈX[øá\u0019v¹ñÚwzú\u009b\u0002;\u0098T\u000fô\u0092\u0015\u001cµ\u0080Ö;v©\u009727µP\"ðF\u0010È±PÑ×r]\u0092á3xSóìq\fø\u00ad}Í\u009an\u0015\u008e\u0093/\u0016O\u009cè<\b¨©0É´j$\u008aC*ÍKRëÍ\u0004[¤ÞÅeeô\u0086p&èG|ç\u009c\u0000\u000b \u008eÁ\na\u009a\u0082'\"¸C3ã±<8\\¸üÚ\u001dJ½ÎÞW~Â\u009f}?èXeøê\u0019y¹\u0087Ú\u0000z\u0092\u009b\u0011;\u0093T\u0000ô»\u0015*µ¶Ö(v¼\u0096Ü7HWÐðW\u0010Ú±~Ñærk\u0092ì3gSýì\u0004\f\u008c\u00ad\u000eÍ\u0089n\u001f\u008e¢//O°è7\b½¨ÇÉXiÊ\u008aW*ÆK^ëç\u0004t¤óÅveâ\u0086\u001d&\u008bG\u000eç\u0090\u0000\u0004  Á8a¯\u00822\"¦C!ãG\u0003Ê\\UüÈ\u001dC½áÞh~ä\u009fj?åX\u0003ø\u0086\u0019\u0007¹\u008cÚ\u0019z\u009d\u009b:;©T3ôµ\u0015\"µ]ÕÍvM\u0096Ê7EWãðf\u0010ë±lÑûry\u0092\u00803\u0014S\u009aì\b\f\u0097\u00ad<Í·n-\u008e´/>O^ïÆ\bL¨ÌÉGiÝ\u008ae*èKnëé\u0004\u007f¤\u0083Å\u000be\u0090\u0086\u000b&\u0099G!ç¦\u00002 \u00adÁ;a¿\u0081Ä\"TBÏãU\u0003Ü\\eüö\u001dm½óÞ\u007f~\u009e\u009f\u0005?\u008bX\fø\u009e\u0019\u001c¹ºÚ)z°\u009b(;£[ÁôH\u0014ÊµJÕÚv~\u0096å7lWìðg\u0010ý±\u0005Ñ\u008br\u000e\u0092\u00893\u001fS£ì.\f°\u00ad+Í¹mÁ\u008eA.ÒOMïÛ\b_¨àÉtió\u008aq*öK\u001cë\u0083\u0004\u000b¤\u008aÅ\u001ae¡\u00868&³G1ç¹\u0000; ZÀÊaW\u0081È\"CBäãc\u0003ð\\küù\u001d\u0001½\u008cÞ\u0012~\u0093\u009f\u001e?\u0080X'ø\u00ad\u0019.¹°Ú>z\\\u009aË;N[ÊôE\u0014ãµgÕçvl\u0096ø7~W\u009að\u0015\u0010\u0093±\u0010Ñ\u009er<\u0092·3-S²ì9\f^¬ÙÍOmÔ\u008eX.ÀO{ïé\bv¨öÉbi\u009d\u008a\u000b*\u008fK\u001eë\u0084\u0004#¤¡Å'e¬\u0086>&¼FÚçI\u0007Ð HÀÃaa\u0081é\"eBêãz\u0003\u0080\\\u0018ü\u0093\u001d\u0011½\u009eÞ\u001f~º\u009f5?³X0øº\u0018Ü¹WÙÍzR\u009aÝ;~[åôh\u0014ðµfÕáv\u0007\u0096\u008c7\u0014W\u0088ð\u0003\u0010¡±*Ñªr*\u0092¥2ÃSDóÉ\fL¬ÇÍ]mâ\u008eo.îOuïø\b\u0001¨\u0096É\u0011i\u0097\u008a\u001c*ªK8ë¯\u00046¤¸Å e[\u0085É&VFÜçB\u0007ý kÀèa\u007f\u0081ä\"\u0003B\u0082ã\r\u0003\u008c\\\u0007ü\u009d\u001d#½¨Þ.~µ\u009f8?B_ÖøQ\u0018×¹]Ùâzx\u009aó;q[ÿô}\u0014\u009aµ\u000bÕ\u0090v\b\u0096\u00837!W¯ð.\u0010ª±;ÑCqØ\u0092S2ÑS_óÞ\fz¬õÍsmñ\u008e}.\u009cO\u000bï\u008a\b\u0012¨\u0084É?i¥\u008a+*´K&ë¿\u000bÂ¤TÄÏeU\u0085Û&dFöçq\u0007÷ }À\u0087a\u0018\u0081\u008d\"\u0011B\u0086ã\u0001\u0003§\\-ü´\u001d(½½ÝÂ~V\u009eÑ?W_Ýød\u0018ø¹sÙñz\u007f\u009aû;\u001a[\u008bô\u0010\u0014\u0088µ\u0003Õ¡v/\u0096¤7*W»÷Ã\u0010X°ÓÑQqß\u0092T2úSuóó\fq¬÷Í\u001cm\u0089\u008e\r.\u008aO\u0005ï£\b\"¨®É,i¹\u008a>*ZJÕëS\u000bÒ¤^Äüew\u0085í&pFùç\u001e\u0007\u0087 \fÀ\u008ca\u0007\u0081\u009d\" Bªã.\u0003·\\?ü\\\u001c×½MÝÐ~Z\u009eþ?y_ïøs\u0018ü¹`Ù\u009bz\t\u009a\u0091;\u0012pgÐ\u00010\u0092\u0091\u0015ñ\u009aR\u0004²»\u0013.s¶Ô-4½\u0095XõßVL¶Ê\u0017AwßØ|8ó\u0099rùîZeº\u0001\u001a\u0090{\u000bÛ\u0098<\u0002\u009c¹ý*]´¾7\u001e´\u007f&ßÝ G\u0080Èá[AÙ¢z\u0002ícbÃì$x\u0084\u0006ä\u009eE\u0015¥\u0097\u0006\u001cf\u0086Ç!'¦\u0088(è¯I9©Ç\nPjËËV+Û\u008cxìÿMi\u00adô\u000e`nçÎ\u0081/\r\u008f\u0088Ð\u000f0\u0099\u0091\"ñ°R+²¶\u00139sØÔC4Î\u0095^õÀV[¶è\u0017rwéØs8ý\u0098\u009aù\u0011Y\u008bº\u0016\u001a\u0082{9Û£</\u009cªý!]»¾H\u001eÒ\u007fIßÓ Q\u0080úáqAè¢p\u0002âb\u0099Ã\u0000#\u0089\u0084\nä\u009dE\u001c¥§\u00062fµÇ4'°\u0088ZèÍIL©×\nBjåËd+á\u008cjìýMr\u00ad\u001c\r\u0093n\u0015Î\u0097/\u0004\u008f»Ð.0¨\u0091,ñ£RF²Á\u0013TsËÔ^4Þ\u0095|õóVv¶÷\u0017dw\u001b×\u008e8\f\u0098\u008cù\u0003Y¦º#\u001a´{7Ûº<=\u009cÜýO]Ü¾N\u001eÅ\u007fgßé v\u0080íá|A\u0006¡\u009e\u0002\u0015b\u0094Ã\u001f#\u0086\u0084=ä¬E0¥®\u0006%fÄÇK'Ö\u0088MèÜIl©þ\nijñË\u007f+æ\u008b\u0081ì\bL\u0093\u00ad\u000e\r\u0099n Î¤/6\u008f\u00adÐ<0Í\u0091^ñÉRQ²Ø\u0013FsýÔl4õ\u0095nõùU\u0081¶\t\u0016\u0096w\r×\u009d8$\u0098¾ù5Yµº=\u001a¦{]ÛÍ<V\u009cÎýY]á¾i\u001eö\u007fqßø?\u008d\u0080\u001eà\u0095A\u0015¡\u009f\u0002\u0006b½Ã-#°\u0084.ä¥EE¥É\u0006VfÑÇV'ø\u0088\u007fèëIp©à\n~j\u0007Ê\u0092+\u0015\u008b\u0095ì\u001eLº\u00ad-\r\u00adn7Î¢/E\u008fÄÐA0Ê\u0091AñÙRg²ò\u0013isñÔp4\u001a\u0094\u0091õ\tU\u0099¶\u0002\u0016§w#×´8?\u0098½ù&YÝºJ\u001aÔ{NÛÙ<a\u009cåýv]ñ¾v\u001e\u0004~\u009eß\t?\u0091\u0080\u0019à\u0086A&¡¬\u0002(b³Ã0#Ç\u0084Pä×ET¥ß\u0006xfÿÇl'ô\u0088`èûH\u0088©\u0012\t\u0095j\u001aÊ\u009a+:\u008b\u00adì\"L³\u00ad\"\rÅn@ÎÔ/K\u008fØÐY0ü\u0091sñ÷Rw²ä\u0012\u0087s\u0004Ó\u00964\r\u0094\u009aõ U¾¶5\u0016²w9×¦8B\u0098ËùHYÓºP\u001aú{qÛî<v\u009câü\u0099]\u0006½\u008f\u001e\n~\u009dß\u001f?¤\u00802àµA0¡¤\u0002DbÉÃV#Í\u0084ZäìE~¥ë\u0006pfàÇx'\u0005\u0087\u0092è\tH\u0090©\u0019\tºj(Ê¶+-\u008b¹ìXLß\u00adL\rßn@ÎÛ/h\u008fêÐh0ö\u0091zñ\u001aQ\u008d²\b\u0012\u008cs\u0003Ó¡4\"\u0094´õ4U¾¶&\u0016ÝwK×Õ8N\u0098ÅùcYîºv\u001aí{{Û\u0007;\u009e\u009c\u0015ü\u0093]\u0018½\u0086\u001e!~¦ß(?¯\u0080;àÀAP¡Ë\u0002XbÛÃx#ã\u0084`äðE`¥û\u0005\u0087f\u0007Æ\u0088'\u0013\u0087\u0090è!H°©(\t¹j\"ÊÙ+G\u008bÍìJLÁ\u00ad_\rænrÎé/w\u008fÿï\u009a0\u0011\u0090\u008eñ\u0019Q\u0082²%\u0012ªs Óª4>\u0094»õ\\UÏ¶V\u0016ÎwE×ã8l\u0098öùrYü¹\u0098\u001a\u001fz\u008dÛ\u001e;\u0080\u009c\u0007ü¥]'½¨\u001e/~¾ßF?Ð\u0080WàÖA^¡ø\u0002\u007fbìÃ\u007f#à\u0084yä\u0003D\u0092¥\u0015\u0005\u0097f\u0004Æ¢'+\u0087¶è2H¿©X\tÃjJÊÊ+A\u008bßì`Lò\u00adv\rînyÎ\u0004.\u0090\u008f\u0017ï\u00960\u001f\u0090¸ñ?Q®²4\u0012 s'ÓÆ4M\u0094ÈõOUÝ¶b\u0016ðwk×ø8w\u0098\u0018ø\u009fY\t¹\u0093\u001a\u0000z\u0087Û\";¬\u009c(ü¯]:½Å\u001eP~×ßR?Ú\u0080xàÿAj¡ñ\u0002`bçÂ\u0082#\u0006\u0083\u0088ä\u0013D\u009f¥%\u0005°f+Æ¶'9\u0087ØèCHÎ©^\tÀjXÊã+r\u008bõì{Lø¬\u009a\r\u0011m\u0088Î\u0019.\u0082\u008f9ï¤0,\u0090ªñ=Q³²A\u0012ÒsIÓÔ4]\u0094úõmUã¶r\u0016âv\u0099×\u00047\u008d\u0098\nø\u0081Y\u001c¹¦\u001a2z·Û0;¤\u009c[üÊ]M½Ì\u001e]~åß~?õ\u0080pàûAf¡\u001d\u0001\u0088b\u001cÂ\u008e#\u001c\u0083§ä0D·¥6\u0005·fXÆÃ'N\u0087×è@HÇ©f\tçjhÊï+}\u008b\u0002ë\u0090L\u0017¬\u0095\r\u001aÜ!|G\u009cÔ=S]ÜþB\u001eý¿hßðxk\u0098û9\u001eY\u0085ú\b\u001a\u0095»\u0006Û\u0081t\"\u0094´5/U±ö\"\u0016]¶Ì×PwË\u0090_0þQgñï\u0012l²çÓts\u009a\u008c\t,\u0094M\u0013í\u0082\u000e=®£Ï0o«\u00889(BHØéS\tÑª[ÊÀkd\u008bô$pDèå\u007f\u0005\u0082¦\u0016Æ\u008eg\u0013\u0087\u0084 ?@¥á,\u0001¬¢>Â bÛ\u0083@#Î|I\u009cß=c]öþm\u001eÿ¿|ß\u009ex\u0005\u0098\u008b9\fY\u009eú\u001b\u001aº»*Û³t(\u0094¿4ÂUVõÑ\u0016W¶Ü×~wæ\u0090r0ñQxñà\u0012\u001b²\u0089Ó\u0017s\u0088\u008c\u0003,¡M,í°\u000e+®¹ÎÅoX\u008fÓ(QHÒé@\tâªtÊók}\u008bû$\u001cD\u0097å\u0004\u0005\u008a¦\u0005Æ£g-\u0087² 1@³á:\u0001Z¡ÁÂNbÉ\u0083\\#à|v\u009cî=t]äþ\u001f\u001e\u0086¿\u000fß\u008cx\u0007\u0098\u009e9$Y´ú/\u001a¶»=Û\\{×\u0094M4ÞUDõã\u0016l¶ò×mwø\u0090`0\u009bQ\u000bñ\u008e\u0012\u0011²\u009aÓ<s«\u008c%,±M$í_\rÀ®RÎÑoS\u008fÔ(zHêéz\tèª|Ê\u0089k\u0016\u008b\u0091$\u0014D\u009cå>\u0005¹¦,Æµg&\u0087¡'Ä@NàÎ\u0001I¡ÜÂgbö\u0083m#ÿ|q\u009c\u009e=\u0019]\u008cþ\u0018\u001e\u0086¿\u001eß¦x(\u0098®9)Y¼ùÈ\u001aVºÑÛT{Ñ\u0094~4æUnõñ\u0016f¶á×\u0005w\u0088\u0090\u000e0\u0095Q\u0017ñ¤\u00126²±Ó5s¸c\u001bÃ}#î\u0082kâïAx¡Ø\u0000P`ÔÇP'ß\u0086:æ¢E6¥ª\u0004$dºË\u0001+\u0091\u008a\u0014ê\u0093I\u0000©f\tíhsÈð/c\u008fÐîBNÉ\u00adL\rÜl[Ì»3.\u0093©ò-R¢±\u0006\u0011\u008dp\u001eÐ\u00907\u0006\u0097\u007f÷âVr¶ï\u0015|uûÔU4Î\u009bUûÏZDº¦\u0019-y·Ø-8¾\u009f\u0005ÿ\u009f^\u0016¾\u0096\u001d\u0002}\u0086Ýù<n\u009cõÃo#ç\u0082FâÑA^¡Ð\u0000D`ºÇ\"'©\u0086+æ¤E:¥\u009a\u0004\u0010d\u0094Ë\u0013+\u0085\u008bÿêlJõ©j\tþhZÈÛ/H\u008f×îANÀ\u00ad \r³l-Ìª38\u0093\u009bò\u0012R\u008a±\u000e\u0011\u0087qäÐc0ö\u0097v÷ýVg¶Û\u0015NuÊÔN4Â\u009b&û¸Z*º¥\u0019>y\u0085Ø\u001f8\u009c\u009f\u0016ÿ\u0082^\u001a¾}\u001eð}tÝó<e\u009cÓÃL#Ë\u0082NâÂA$¡£\u00006`«Ç<'»\u0086\u001eæ\u0093E\u0014¥\u0093\u0004\u0006dxÄì+t\u008bìêeJÄ©Z\tÖhVÈÁ/D\u008f î/Nª\u00ad-\r¸l\u0018Ì\u008c3\u0017\u0093\u008eò\u001eRe²ü\u0011pqöÐ}0ä\u0097Y÷ÎVU¶Ì\u0015Bu¦Ô-4´\u009b+û¾Z\u0019º\u0096\u0019\by\u0097Ø\u00068\u009a\u0098áÿu_ô¾o\u001eç}\\ÝÌ<K\u009cÄÃ^#¼\u00829â¨A#¡¡\u0000:`\u009dÇ\u001a'\u0094\u0086\u0013æ\u008dFæ¥r\u0005öddÄþ+Z\u008bÖêHJÈ©@\tÏh È°/-\u008f²î9N\u0098\u00ad\u0018\r\u008al\u0011Ì\u0080,ñ\u0093bóéRi²à\u0011zqÁÐQ0É\u0097R÷ÆV=¶¬\u0015+u¯Ô 4\u0084\u009b\u001fû\u009dZ\u000bº\u009c\u0019\u001by\u007fÙð8t\u0098óÿg_Ù¾L\u001eÕ}MÝÞ<%\u009c½Ã0#¶\u0082#â¤A\u0000¡\u008f\u0000\u000b`\u008aÇ\u0018'g\u0087òæqFð¥\u007f\u0005ÚdYÜ!|G\u009cÔ=P]Õþ^\u001eü¿wßîxj\u0098å9\u0001Y\u0098ú\f\u001a\u008c»\u0019Û\u0080t;\u0094¬5.U°ö\"\u0016]¶Ï×PwË\u0090^0þQfñï\u0012q²æÓ}s\u0083\u008c\u0014,\u0096M\u0013í\u0082\u000e)®¶Ï1o±\u0088$(@HØéO\tÒªFÊÁkn\u008bô$oDýåb\u0005\u009d¦\u000bÆ\u008cg\n\u0087\u0085 #@¤á2\u0001\u00ad¢;Â½bÚ\u0083J#Ó|V\u009cÂ=i]öþq\u001e÷¿zß\u009ex\u0006\u0098\u00929\u0011Y\u0098ú\u0000\u001a»»)Û±t(\u0094£4ÁUNõÐ\u0016K¶Ù×gwø\u0090s0ñQ\u007fñà\u0012\u001b²\u0089Ó\u0014s\u0088\u008c\u0003,¡M, \u0012\u0080t`çÁ`¡ï\u0002qâÎC[#Ã\u0084XdÈÅ-¥µ\u0006!æ¡G+'³\u0088\u0017h\u009eÉ\u001d©\u009a\n\têoJý+c\u008bølnÌÍ\u00adJ\rÛî_NË/N\u008f¶p'Ð ±\"\u0011±ò\u0017R\u009e3\u0003\u0093\u0087t\nÔm´ö\u0015\u007fõÿVt6è\u0097IwÙØ]¸Æ\u0019Où¯Z$:·\u009b9{¶Ü\u0018¼\u008b\u001d\u0000ý\u0082^\t>\u0093\u009eè\u007fzßá\u0080{`ðÁR¡Ø\u0002CâÁCM#\u00ad\u00843dºÅ?¥«\u0006.æ\u0089G\u001a'\u0083\u0088\u001bh\u0090Èò©{\tãêgJ÷+P\u008bÕlAÌÞ\u00adH\rÌî)N¦/ \u008f£p1Ð\u008e±\u0018\u0011\u009aò\u0019R\u00962ð\u0093qsáÔg´õ\u0015mõÖVG6Ü\u0097FwÊØ/¸»\u0019:ù¹Z6:\u0094\u009b\u000b{\u0080Ü\u0002¼\u0081\u001d\u0013ýw]ú>b\u009eû\u007fpßÒ\u0080P`ÃÁG¡Ê\u00025â«C #¢\u0084 d³Å\b¥\u009a\u0006\u0007æ\u009bG\u0010'r\u0087ÿlmÌ\u000b,\u0098\u008d\u001fí\u0090N\u000e®±\u000f$o¼È'(·\u0089RéÉJJªÀ\u000bKkÔÄv$ù\u0085{åäFo¦\n\u0006\u009ag\u001dÇ\u009d \b\u0080¯á-A¦¢ \u0002·c9ÃÖ<Y\u009cÖýD]Ö¾p\u001eû\u007fißæ8i\u0098\u000fø\u0088Y\u001e¹\u009e\u001a\u0017z\u0095Û6;\u00ad\u0094\"ô¥U3µÍ\u0016ZvÂ×F7Õ\u0090lðôQ\u007f±ý\u0012trìÒ\u00973\u0005\u0093\u009dÌ\u0004,\u008f\u008d-í¢N<®§\u000f5oÊÈT(ß\u0089]éÓJLª÷\u000bekû\u009c\u0089<ïÜ|}û\u001dt¾ê^UÿÀ\u009fX8ÃØSy¶\u0019/º Z$û°\u009b14\u0092Ô\u001du\u009e\u0015\u0000¶\u0092Vôö\u007f\u0097á7bÐípL\u0011Ð±DRÙòT\u0093È3,Ì¡l&\r½\u00ad4N\u0094î\u001f\u008f\u0083/\u0002È\u0092hè\bp©ûIpêî\u008ai+ÇË\\dÇ\u0004]¥ÖE4æ¿\u0086%'¿Ç,`\u008b\u0000\u0004¡\u009aA\u0005â\u0090\u0082\b\"lÃác}<àÜt}È\u001dK¾Ø^\\ÿÕ\u009f68±Ø%y¤\u0019/ºµZ\fû\u009c\u009b\u00194\u009eÔ\ntu\u0015ãµgVâös\u0097Ë7PÐÛpY\u0011Ñ¹á\u0019\u0087ù\u0014X\u008f8\u0016\u009b\u0082{=Ú©º0\u001d´ý$\\À<X\u009fÏ\u007fYÞÆ¾A\u0011âñtPö0h\u0093ãs\u0085Ó\u0016²\u0091\u0012\u0010õ\u0084U 4¥\u0094&w¬×3¶ \u0016[éÏIN(Ö\u0088BkáËhªð\nkíðM\u009e-\u0019\u008c\u0087l\fÏ\u0087¯\u001d\u000e¦î4A¯!5\u0080¿`\\ÃÎ£P\u0002Ôâ[Eþ%y\u0084ïdrÇæ§~\u0007\u0003æ\u0094F\u000f\u0019\u0091ù\u0002X½8+\u009b¯{*ÚººC\u001dÍýR\\Ô<X\u009fÀ\u007fgÞê¾n\u0011éñ\u007fQ\u00040\u0096\u0090\u000es\u008aÓ\u0019² \u00128õ³U14¿\u0094 wÛ×I¶Ô\u0016HéÃIa(í\u0088pkëËy«\u0003\n\u0098ê\u0013M\u0092-\u0006\u008c\u009el%Ï´¯0\u000e°î\"AÂ!O\u0080Ð`KÃÛ£~\u0002ùâoEø%f\u0084ÿd\u0087Ä\u0014§\u008f\u0007\u0015æ\u0097F<\u0019©ù.Xª8%\u009bÃ{MÚÒºM\u001dØý\\\\ú<k\u009fó\u007fhÞã¾\u0082\u001e\u000bñ\u0090Q\u00150\u009a\u0090>s¹Ó,²±\u0012&õ¡UG4É\u0094NwÉ×_¶áµ¬\u0015ÊõYTÞ4Q\u0097ÏwhÖã¶}\u0011æñwP\u00930\b\u0093\u008bs\u0001Ò\u008a²\u0012\u001d·ý8\\»<%\u009f±\u007fÏßG¾Ý\u001eFùÐYs8ô\u0098e{áÛjºö\u001a\u0017å\u0098E\u0017$\u0085\u0084\u0012g¥Ç;¦¼\u00062á©AÍ!K\u0080Â`AÃÖ£Y\u0002÷âxMþ-y\u008cïl\u000fÏ\u0085¯\u0003\u000e\u0087î\bI®)(\u0088¿h?Ëµ«2\u000bWêØJ^\u0015ÛõOTð4f\u0097âwgÖè¶\u000e\u0011\u008dñ\u001fP\u009c0\u001f\u0093\u008ds6Ò¤²:\u001d¥ý.]L<Á\u009c]\u007fÆßT¾è\u001euùþY|8ÿ\u0098m{\u008dÛ\u0003º\u0083\u001a\u0010å\u0092E1$º\u0084 g²Ç)§M\u0006ËæGAÁ!J\u0080Ð`bÃù£}\u0002ûâvM\u0091-\u0005\u008c\u0083l\u001dÏ\u0089¯2\u000e«î#I¡)6\u0088¹h×ÈG«Ý\u000b^êÏJo\u0015åõiTç4h\u0097\u008bw\u0015Ö\u0081¶\u0018\u0011\u008bñ\fP©0$\u0093£s$Ò±²Ï\u0012[ýÃ]G<Ö\u009cs\u007fôßa¾þ\u001ekùõY\u00178\u0098\u0098\u001d{\u009dÛ\u000fº®\u001a!å½E9$°\u0084ÓdTÇÁ§X\u0006ËæLAé!c\u0080ã`{Ãñ£\u0004\u0002\u009bâ\tM\u0087-\u001c\u008c³l4Ï¡¯:\u000e«î3NW)Ä\u0089]hÅÈN«ï\u000boêýJf\u0015÷õ\u0006T\u00954\u001e\u0097\u009ew\u0017Ö\u008d¶6\u0011¦ñ>P¥02\u0090EsÛÓ\\²Ò\u0012Iýí]k<â\u009ca\u007fößy¾\u0097\u001e\u0018ù\u009eY\u00198\u008f\u0098/{¥Û#º§\u001a(úNEÈ%_\u0084ßdUÇÒ§w\u0006äævAü!o\u0080\u0090`\u0004Ã\u0083£\u0007\u0002\u0088â,Mª-?\u008c l5Ï´¯×\u000fXîÝN_)Ï\u0089ohäÈa«ç\u000bqê\u008dJ\u0015\u0015\u0082õ\u001fT\u008b4\f\u0097©w\"Ö£¶;\u0011±ñÑQZ0Â\u0090_sÉÓr²ê\u0012fýá]j<ò\u009c\r\u007f\u0099ß\u0002¾\u009a\u001e\u0015ù±Y:8¢\u0098<{©ÛÍ»J\u001aÂúAEÕ%P\u0084÷ddÇý§e\u0006îæ\u000eA\u008f!\u001d\u0080\u0099`\u0017Ã³£4\u0002 â4M«-,\u008dOlÅÌC¯Ä\u000fWîìN{)ü\u0089xhôÈ\u0013«\u008d\u000b\u001fê\u009fJ\u0014\u0015\u0093õ7T§4:\u0097¥w.×O¶Ã\u0016]ñÆQQ0í\u0090usâÓ{²õ\u0012mý\u0096]\u0001<\u009c\u009c\u0005\u007f\u0091ß.¾¤\u001e=ù¦Y19L\u0098Õx^ÛÙ»S\u001aÍúiEæ%{\u0084ådnÇ\u0089§\u0002\u0006\u009dæ\u0019A\u0096!*\u0080µ`>Ã¹£2\u0002\u00adâÖBA-Ù\u008dElÑÌn¯á\u000f}îæNq)\u0088\u0089\u0015h\u0081È\u001e«\u0090\u000b\rê¶J!\u0015¸õ%T®4É\u0094OwÝ×Y¶Ö\u0016gñõQ~0ù\u0090~síÓ\t²\u0086\u0012\u0016ý\u0085]\u000e<©\u009c.\u007f½ß&¾¶\u001eÎþUYÞ9^\u0098Ö\u0014Ä´¢T1õ¶\u009596§Ö\u0018w\u008d\u0017\u0015°\u0095P\u001fñû\u0091|2èÒisâ\u0013}¼ß\\PýÒ\u009dM>ØÞ£~3\u001f«¿6X¡ø\u001a\u0099\u00879\u0017Ú\u0091z\u0003\u001b\u0084»dDñäj\u0085ù%gÆÇfK\u0007É§O@Üà¢\u0080=!¯Á2b£\u00020£\u009fC\u0010ì\u009e\u008c\r-\u0099Ígnó\u000et¯òO}èÛ\u0088\\)ÊÉTjÃ\nDª\"K¯ë+´¬T:õ\u0087\u0095\u00136\u0094Ö\u001bw\u0081\u0017e°åPjñé\u0091{2ûÒ_sÌ\u0013U¼Í\\Fü,\u009d³=+Þ¯~<\u001f\u0085¿\u001dX\u0096ø\u0014\u0099\u009c9\u0005Úþzl\u001bó»mDæäD\u0085Ê%UÆÎf\\\u0006\"×\u0005wc\u0097ð6wVôõs\u0015Ø´SÔÊsN\u0093Á2%R¼ñ)\u0011²°\"Ðº\u007f\u0007\u009f\u0090>\u000b^\u0094ý\u0006\u001d`½òÜu|÷\u009b`;ÛZFúÖ\u0019V¹ÚØZx¾\u0087('´F,æ»\u0005\u0006¥\u0092Ä\u0015d\u0095\u0083\u0000#dCââv\u0002é¡vÁä`_\u0080Å/JOÍî[\u000e¤\u00ad2Íµl3\u008c¼+\u001aK\u009dê\f\n\u0088©\u001cÉ\u009ciá\u0088p(òwp\u0097æ6EVÌõT\u0015Ï´[Ôºs\"\u0093¨2(R£ñ9\u0011\u0083°\u0010Ð\u008b\u007f\u0011\u009f\u0098?ø^sþé\u001dq½àÜ[|Á\u009bI;ÈZCúÙ\u0019&¹°Ø+x±\u0087>Ü!|G\u009cÔ=S]ÜþB\u001eý¿hßðxk\u0098û9\u001eY\u0086ú\u0012\u001a\u0092»\u0006Û\u009dt$\u0094´50U±ö\"\u0016]¶Î×PwÒ\u0090D0ÿQañò\u0012m²üÓ`s\u0084\u008c\f,\u0096M\bí\u009a\u000e ®¶Ï-o´\u0088$(_HÃéR\tÒªFÊÝkd\u008bô$oDüåb\u0005\u009d¦\u0003Æ\u0090g\u000b\u0087\u0099 \"@¸á3\u0001±¢:Â bÛ\u0083I#Ó|H\u009cÜ=d]ïþp\u001eò¿xß\u009ex\u0005\u0098\u008c9\fY\u0087ú\u001d\u001a¤»4Û°t(\u0094¿4ÂUVõÑ\u0016W¶Û×~wù\u0090o0ôQfñá\u0012\u0007²\u008dÓ\u000es\u0089\u008c\u001f,¦M6í¨\u000e*®ºÎÁoA\u008fÒ(RHÒé@\täªaÊîki\u008bû$\u001cD\u0097å\r\u0005\u0091¦\u0004Æ g'\u0087¨ ,@§á=\u0001N¡ÔÂPbÐ\u0083X#ü|w\u009cí=~]äþ\u001f\u001e\u0085¿\bß\u008cx\u0007\u0098\u009d9 \u001d¬½Ê]YüÞ\u009cQ?Ïßp~å\u001e}¹æYvø\u0093\u0098\b;\u0086Û\u0019z\u008b\u001a\u0010µ©U9ô½\u0094<7¯×ÐwC\u0016Ý¶_QÉñr\u0090ì0\u007fÓàsq\u0012í²\tM\u0081í\u0018\u008c\u0085,\u0017Ï¯o;\u000e ®9I©éÒ\u0089N(ßÈ_kÕ\u000bMªöJmåã\u0085d$úÄ\u0011g\u009a\u0007\u0000¦\u009bF\tá²\u0081( ¢À!c³\u0003-£IBÆâC½Ä]Rüï\u009c{?ãß~~é\u001e\u0012¹\u008cY\u001fø\u0080\u0098\u0016;\u0092Û7z§\u001a;µ±U/õL\u0094Á4]×ÆwT\u0016ë¶uQáña\u0090ö0sÓ\u0097s\u0018\u0012\u009e²\u001cM\u008fí0\u008c¦,'Ï§o(\u000fN®ÎN_éÀ\u0089V(ÖÈwkø\u000b~ªñJoå\u008e\u0085\u0005$\u009dÄ\u0006g\u0094\u0007&¦µF á¼\u0081+ ¬ÀÊ`L\u009em>\u000bÞ\u0098\u007f\u001f\u001f\u0090¼\u000e\\±ý$\u009d¼:'Ú·{R\u001bÊ¸^XÞùT\u0099Ì6hÖáwb\u0017å´vT\u0010ô\u0082\u0095\u001c5\u0087Ò\u0011r²\u00135³¤P ð´\u009141ÃÎXn×\u000fD¯ÏLkìú\u008db-æÊuj\f\n\u0094«\u001fK\u0094è\n\u0088\u008d)#É¸f#\u0006¹§2GÐä[\u0084Á%ZÅÈbs\u0002é£cCààt\u0080õ \u008aÁ\u0018a\u009f>\u001dÞ\u008e\u007f(\u001f¡¼<\\¸ý5\u009dÒ:IÚÀ{@\u001bË¸QXèùx\u0099ü6zÖîv\u0091\u0017\u0007·\u0083T\u0006ô\u0089\u0095/5¬Ò>r¡\u00137³µPVðÙ\u0091_1ÝÎNnñ\u000fg¯æLfìé\u008c\u008f-\u000e\u008d\u0014-rÍálf\fé¯wOÈî]\u008eÅ)^ÉÎh+\b³«'K¦ê3\u008a´%\u0017Å\u0081d\u0003\u0004\u009d§\u0016Gpçã\u0086d&åÁqaÕ\u0000T ÚCYãÆ\u0082U\"®Ý:}»\u001c#¼·_\u0014ÿ\u009d\u009e\u0005>\u009eÙ\u0005yk\u0019ì¸rXùûr\u009bè:SÚÁuZ\u0015À´KT©÷\"\u0097¸6\"Ö±q\u0015\u0011\u0094°\u0019P\u0099ó\u000b\u0093\u008e3ïÒtrû-|ÍêlW\fÃ¯[OÁîQ\u008eª)0É¸h9\b²«(K\u0097ê\u0001\u008a\u009a%\u0000Å\u008eeé\u0004b¤øGfçñ\u0086J&ÐÁ]aÙ\u0000R ÈC5Ýò}\u0094\u009d\u0007<\u0080\\\u000fÿ\u0091\u001f.¾»Þ#y¸\u0099(8ÍXUûÁ\u001bAºËÚSu÷\u0095~4ýTz÷é\u0017\u008f·\u001dÖ\u0083v\u0018\u0091\u008e1-Pªð;\u0013¿³+ÒªrV\u008dÇ-CLÆìQ\u000fò¯{Îãnx\u0089ì)\u008dI\u0015è\u009f\b\u001f«\u0094Ë\u0007j©\u008a&%¨E;ä°\u0004R§ÙÇCfØ\u0086J!ñAkàà\u0000e£õÃkc\u001d\u0082\u0087\"\u0000}\u0082\u009d\u0011<²\\?ÿ£\u001f8¾¬ÞMyÕ\u0099_8ßXTûÎ\u001btºçÚ|uæ\u0095o5\u000fT\u0084ô\u001e\u0017\u0086·\u0017Ö¬v6\u0091¾1?P´ð.\u0013Ñ³GÒÜrF\u008dÉ©\u007f\t\u0019é\u008aH\r(\u0082\u008b\u001ck£Ê6ª®\r)í LY,Æ\u008fMoÍÎX®ß\u0001|áê@q ï\u0083|c\u001fÃ\u0092¢\u0015\u0002\u0094å\u001bEº$&\u0084\u00adg)Ç¸¦?\u0006ÐùJYÎ8I\u0098Ü{cÛýºn\u001aêýz]\u001f=\u0086\u009c\r|\u008fß\u0004¿\u009e\u001e<þªQ11£\u0090<pÃÓU³Ó\u0012TòÄU}5ÿ\u0094ltç×x·ÿ\u0017\u0099ö\u0014V\u0090\t\bé\u009cH?(¶\u008b.kµÊ'ªß\rFíÍLO,À\u008f^oåÎw®é\u0001váýA\u009f \u0011\u0080\u008ec\u0015Ã\u0087¢=\u0002¦å2E«$$\u0084¾g\\ÇÔ¦P\u0006ËùBYâ8i\u0098ó{jÛú»\u009e\u001a\u0018ú\u008c]\u0013=\u0085\u009c\u0004|¤ß+¿\u00ad\u001e-þ¼QC1Õ\u0090ZpÔÓ[³ý\u0012sòìUj5ø\u0094`t\u001cÔ\u0096·\u0010\u0017\u0088ö\u0005Vº\t(é°H-(º\u008bAkÓÊLªÓ\rFíÂLd,õ\u008fnoöÎ}®\u001c\u000e\u0095á\u000eA\u008b \u0007\u0080 c'Ã²¢/\u0002¸å?EÚ$T\u0084ÐgNÇÈ¦b\u0006éùpYë8z\u0098\u001ex\u009fÛ\u0015»\u0092\u001a\u0019ú\u0080];wò×\u00947\u0007\u0096\u0080ö\u0005U\u008bµ/\u0014¤t=Ó¹36\u0092ÒòKQß±F\u0010ÕpNßý?g\u009eäþc]ñ½\u008e\u001d\u001d|\u0083Ü\u0018;\u0088\u009b-úµZ8¹¿\u00194xªØI'Ù\u0087]æÅFQ¥ò\u0005pdãÄx#í\u0083\u008dã\u0013B\u0081¢\u001e\u0001\u008ea\u0013À¨ 3\u008f½ï%N¨®U\rÅm]ÌÄ,W\u008bðëuJáª~\tàisÉ\u0017(\u0099\u0088\u001d×\u009a7\f\u0096³ö%U¢µ$\u0014ªtMÓÊ3\\\u0092ÁòUQÒ±t\u0010øp}ßã?q\u009f\u0011þ\u009a^\u0003½\u0087\u001d\u000f|\u00adÜ5;¸\u009b?ú´Z(¹É\u0019FxÀØC'Ñ\u0087qæüFx¥ù\u0005ce\rÄ\u009e$\u0001\u0083\u009eã\bB\u008a¢)\u0001¹a#À» 0\u008fÒï_NÃ®X\rÊmvÌë,`\u008bâëaJóª\u0088\n\u001ai\u0082É\u001b(\u008c\u00881×¿7#\u0096¸ö)UÍµJ\u0014Þt_ÓË3M\u0092õògQä±c\u0010ñp\u008eÐ\u001d?\u0083\u009f\u0018þ\u0088^-½µ\u001d8|¿Ü+;¬\u009bIúÚZH¹Ç\u0019QxîØ|'ã\u0087xæêF\u0098¦\u000b\u0005\u0099e\u0006Ä\u0095$\u0012\u0083·ã;B½¢%\u0001¨a[ÀÅ B\u008fÇïKNí®j\rÿmbÌõ,l\u008c\u0014ë\u0087K\u001cª\u0085\n\u000fi¯É:(½\u00889×¶7S\u0096Õä8D^¤Í\u0005JeÅÆ[&ä\u0087qçé@n é\u0001\u0007a\u0080Â\u0014\"\u0095\u0083\u001eã\u0081L#¬²\r-m±Î%.\\\u008eÏïHOÊ¨]\bÿiaÉê*o\u008aÿëxK\u0098´\r\u0014\u0089u\bÕ\u008e6%\u0096·÷2W³°#\u0010ZpÁÑV1Ë\u0092_òØSw³í\u001ci|ñÝf=\u009b\u009e\u000fþ\u0088_\u0006¿\u009d\u0018&x¼Ù79µ\u009a>ú¤ZÞ»M\u001bÖDL¤Æ\u0005eeîÆr&ó\u0087`ç\u009e@\u001a \u008b\u0001\ba\u0086Â\u0019\"¾\u00837ã·L0¬¯\fÅmQÍÉ.N\u008eÃïgOà¨v\bëi\u007fÉø*\u001e\u008a\u0092ë\u0017K\u0090´\u0006\u0014½u/Õ¨6.\u0096¥öÇW@·Ö\u0010LpßÑX1þ\u0092tJ_ê9\nª«-Ë¬h'\u0088\u0082)\tI\u0090î\u0014\u000e\u009b¯\u007fÏælr\u008cè-dMþâE\u0002Ò£PÃ×`E\u0080\" ¶A.áª\u0006$¦\u0080Ç\u0018g\u0095\u0084\u0012$\u0099E\u0004åä\u001arºðÛw{ç\u0098B8ÉYZùÔ\u001eD¾<Þ½\u007f,\u009f¯<!\\¾ý\u001c\u001d\u0091²\u0010Ò\u0083s\u001c\u0093ã0}Pîñj\u0011ú¶]ÖØwL\u0097Ó4ETÂô¤\u0015+µ\u00adê+\n¼«\u0003Ë\u0095h\u0010\u0088\u0094)\u001bIýîx\u000eì¯sÏåla\u008cÄ-TMÊâK\u0002Ü¢·Ã(c¯\u0080) ¢A\u0000á\u0098\u0006\f¦\u008fÇ\u0006g\u009e\u0084e$÷Eiåö\u001a}ºßÛR{Î\u0098U8ÇX»ù&\u0019\u00ad¾/Þ¬\u007f>\u009f\u0099<\u0010\\\u008bý\u0016\u001d\u009d²|Òèso\u0093ë0zPÞñ\\\u0011Ð¶RÖÙwF\u0097$7´T*ô¨\u0015<µ\u009cê\u001c\n\u008e«\nË\u008fh`\u0088ç)uIòîy\u000eã¯QÏÊlM\u008cÌ-CM\"í©\u00020¢¨Ã:c\u009e\u0080\u001c \u0093A\u0012á\u0099\u0006\u0000¦øÇjgñ\u0084k$èEBåÉ\u001aSºÀ¶&\u0016@öÓWW7Õ\u0094]tûÕpµé\u0012mòâS\u00063\u009f\u0090\bp\u0092Ñ\u0019±\u0087\u001e þ¦_)?®\u009c=|[ÜÉ½W\u001dÌúZZù;~\u009bïxkØÿ¹}\u0019\u0084æ\u0013F\u0091'\u0014\u0087\u0085d%Ä¬¥7\u0005°â=BY\"Þ\u0083NcËÀ_ Ç\u0001`áíNi.î\u008fqo\u009bÌ\u0010¬\u0082\r\rí\u0082J$*£\u008b5kªÈ<¨»\bÝéRIÓ\u0016OöÛWa7ë\u0094wtøÕcµ\u0098\u0012\u0004ò\u0095S\u00153\u009f\u0090\u0007p¼Ñ.±´\u001e/þ¤^Æ?O\u009f×|LÜÞ½f\u001dÿútZö;y\u009bçx\u0000Ø\u0087¹\t\u0019\u0095æ\u001bF»'0\u0087©d-Ä½¤Ã\u0005DåÕBU\"Ø\u0083GcüÀl é\u0001náøN\u0002.\u0091\u008f\bo\u0090Ì\u0003¬¸\r\"í¯J+*¾\u008b9k]ËÒ¨T\bÕéEIú\u0016löïWm7â\u0094\u0004t\u0087Ü!|G\u009cÔ=S]ÜþB\u001eá¿lßëxj\u0098å9\u0000Y\u0098ú\u0013\u001a\u0093»\u0006Û\u009et:\u0094ª5.Uµö<\u0016\\¶È×IwÊ\u0090E0æQxñê\u0012l²çÓys\u009a\u008c\u0015,\u0094M\bí\u009f\u000e)®®Ï0o·\u0088=(^HÀéN\tÌª[ÊÞkz\u008bõ$uDèå|\u0005\u0082¦\u0016Æ\u0091g\u001e\u0087\u0084 ?@\u00adá2\u0001\u00ad¢;Â¼bÚ\u0083U#Ó|T\u009cÂ=}]ëþm\u001eê¿zß\u0084x\f\u0098\u00929\u0012Y\u009bú\u0000\u001a§»*Û®t)\u0094¿4ÂUVõÎ\u0016J¶Ù×`wø\u0090s0ñQyñà\u0012\u001b²\u0089Ó\u0016s\u0088\u008c\u0003,¡M/í°\u000e+®¹ÎÇÜ!|G\u009cÔ=S]ÜþB\u001eæ¿hßðxk\u0098ú9\u001eY\u0099ú\r\u001a\u008c»\u0018Û\u0080t%\u0094´5/U°ö\"\u0016D¶Ö×QwÓ\u0090D0ÿQbñò\u0012r²üÓus\u009a\u008c\n,\u0093M\bí\u009f\u000e\"®¶Ï1o±\u0088$(@HÆéR\tÍªRÊÀk{\u008bá$nDéå\u007f\u0005\u0080¦\u0016Æ\u0091g\u0017\u0087\u0099 >@ á2\u0001²¢2Â bÄ\u0083M#Ö|H\u009cÜ=e]öþq\u001eó¿dß\u009fx\u0002\u0098\u00929\u0012Y\u009fú\u001b\u001aº»)Û·t(\u0094º4ÇUVõÅ\u0016J¶Å×ewø\u0090l0òQfñá\u0012\u0007²\u008aÓ\u000es\u0089\u008c\u001f,£M6í±\u000e7®¼ÎÞoY\u008fÏ(QHÆé^\tàªlÊîki\u008bü$\u001cD\u0088å\u000f\u0005\u008a¦\u0005Æ£g!\u0087² 2@¿á \u0001[¡ËÂNbÉ\u0083_#æ|v\u009cï=t]äþ\u001f\u001e\u0085¿\tß\u008cx\u0019\u0098\u009d9:Yµú3\u001a³»\"Û]{Ë\u0094D4ÊUZõá\u0016l¶ò×mwû\u0090u0\u009aQ\nñ\u0095\u0012\u0014²\u0082Ó=s«\u008c%Ü!|G\u009cÔ=S]ÒþY\u001eü¿wßîxj\u0098å9\u0001Y\u0098ú\u000f\u001a\u0098»\u0006Û\u009dt \u0094¯5.U©ö:\u0016\\¶××IwÊ\u0090Z0þQfñò\u0012q²óÓ`s\u009b\u008c\u000e,\u008eM\u0010í\u0082\u000e=®\u00adÏ0o«\u00880(^HÀéG\tÌª^ÊÛkz\u008bê$sDèå\u007f\u0005\u0082¦\u0016Æ\u0091g\u001f\u0087\u0084  @¸á/\u0001²¢&Â¡bÇ\u0083H#Î|I\u009cß=a]öþq\u001e÷¿zß\u009ex\u0019\u0098\u008f9\u0012Y\u0086ú\u0001\u001a®»4Û°t3\u0094¿4ÜUKõÉ\u0016J¶Ü×bwø\u0090o0òQfñá\u0012\u000f²\u0094Ó\u0010s\u0088\u008c\u001f,¢M6í±\u000e7®»ÎÞoY\u008fÏ(THÆéA\tçªmÊîki\u008bÿ$\u0006D\u0096å\b\u0005\u008a¦\u001aÆ¥g&\u0087² 2@¿á8\u0001Z¡ÊÂWbÈ\u0083C#ç|v\u009cñ=w]ÿþ\u001e\u001e\u0086¿\tß\u0091x\u0006\u0098\u00819'Y ú.\u001a¶»9ÛC{Ö\u0094Q4×UPõþ\u0016y¶ï×vwæ\u0090a0\u0087Q\u000e¤«\u0004Íä^EÙ%V\u0086ÈflÇâ§z\u0000áàpA\u0094!\u0013\u0082\u0087b\u0006Ã\u0093£\u0010\f°ì M½-\"\u008e©nÎÎ\\¯Â\u000f@èÏHm)ò\u0089yjüÊl«ô\u000b\u000bô\u0086T\u00045\u009f\u0095\u0012v¶Ö=·¡\u0017 ð°PÊ0R\u0091ÙqRÒÌ²K\u0013åó~\\å<\u007f\u009dô}\u0016Þ\u009d¾\u0007\u001f\u009dÿ\u000eX©8&\u0099¸y<Ú²º*\u001aQûÀ[D\u0004ÜäSEï%|\u0086äfyÇö§\u0014\u0000\u008cà\u0001A\u0086!\r\u0082\u0095b0Ã¿£9\f¼ì(LI-Â\u008dZnÁÎS¯ë\u000frèçH{)ì\u0089kj\u008dÊ\u0001Ïäo\u0082\u008f\u0011.\u0096N\u0019í\u0087\r#¬\u00adÌ5k®\u008b?*ÛJ\\éÈ\tI¨ÝÈEgà\u0087q&êFuåç\u0005\u0081¥\u0013Ä\u0094d\u0016\u0083\u0081#:B§â7\u0001·¡8À¿`_\u009fÌ?R^Íþ_\u001då½sÜè|q\u009bá;\u009a[\u0006ú\u0097\u001a\u0017¹\u009dÙ\u0005x¾\u0098%7«W,ö²\u0016YµÒÕHtÓ\u0094A3úS`òê\u0012i±ýÑ\u007fq\u0007\u0090\u00910\no\u0093\u008f\u0007.§N,íµ\r.¬¼ÌEkÝ\u008bI*ÐJCéÄ\t`¨ñÈjgð\u0087x'\u0019F\u008cæ\u000b\u0005\u008f¥\u0000Ä¦d%\u0083·#6B¾â%\u0001Þ¡LÀÓ\u0018g¸\u0001X\u0092ù\u0015\u0099\u009a:\u0004Ú {.\u001b¶¼-\\¼ýX\u009dß>KÞÊ\u007f_\u001fÜ°|Pìñq\u0091î2eÒ\u0002r\u0090\u0013\u000e³\u008cT\u0003ô¡\u0095>5µÖ0v \u00178·ÇHIèÈ\u0089S)ÝÊzjí\u000bl«ìLcì\u0003\u008c\u009e-\nÍ\u008an\u001d\u000e\u0098¯<O³à<\u0080®!%ÁÏbP\u0002×£QCÞäx\u0084ÿ%iÅ÷f`\u0006ø¦\u0086G\nç\u0088¸\u000fX\u009aù:\u0099\u00ad:#Úµ{\"\u001bÙ¼A\\ÔýK\u009dÝ>XÞü\u007fm\u001fö°nPåð\u0087\u0091\u000f1\u0096Ò\u0013r\u009f\u00138³¿T)ôµ\u0095 5§ÖAvÏ\u0017H·ÏHYèç=r\u009d\u0014}\u0087Ü\u0000¼\u0081\u001f\nÿ¯^$>½\u00999y¶ØR¸Ë\u001b_ûÅZI:Ó\u0095huÿÔ}´ú\u0017h÷\u000fW\u009b6\u0003\u0096\u0087q\tÑ\u00ad°5\u0010¸ó?S´2)\u0092Ém_ÍÝ¬Z\fÊïoOä.w\u008eùiiÉ\u0016©\u009f\b\u0001è\u0087K\u000e+\u0093\u008a7jºÅ=¥¦\u0004/äÏGD'Ö\u0086YfÉÁs¡ë\u0000`àâCi#ó\u0083\u0088b\u001aÂ\u0080\u009d\u001b}\u0090Ü2¼»\u001f#ÿ¸^*>Ó\u0099KyÀØK¸Õ\u001bMûòZr:ý\u0095cuíÕ\u008f´\u0018\u0014\u009d÷\u0019W\u009668\u0096«q?Ñ¡°5\u0010²óTSØ2]\u0092ÚmLÍ÷¬e\fâïdOî/\u008d\u008e\nn\u009cÉ\u0005©\u0095\b\u000bè©K9+©\u008a'j±ÅQ¥Ñ\u0004^äÙGV'ö\u0086kfàÁb¡î\u0000sà\u0017@\u009c#\u0002\u0083\u009bb\u0010Â²\u009d1}£Ü'¼£\u001fSÿË^@>Â\u0099AyÓØh¸ú\u001bgûûZp:\u0012\u009a\u009f>I\u009e/~¼ß8¿´\u001c5ü\u0094]\u001f=\u0086\u009a\u0002z\u008dÛi»ð\u0018døäYp9è\u0096OvÂ×F·Þ\u0014Sô4T¿5 \u0095¢r4Ò\u0096³\u0011\u0013\u0083ð\u0004P\u008f1\u0012\u0091ònbÎý¯u\u000fêìLLÅ-X\u008d×jLÊ7ª«\u000b:ëºH.(µ\u0089\fi\u009cÆ\u0007¦\u0094\u0007\nçõDk$ø\u0085ceñÂJ¢Ð\u0003[ãÙ@R È\u0080³a!Á»\u009e ~´ß\u000b¿\u0084\u001c\u0018ü\u009a]\u0012=ö\u009amzäÛd»ï\u0018uøÌY\\9Ø\u0096^vÊÖµ·#\u0017§ô\"T\u00ad5\u000b\u0095\u0088r\u001aÒ\u0085³\u0013\u0013\u0091ðrPý1{\u0091ùÜ!|G\u009cÔ=P]Üþ]\u001eü¿wßîxj\u0098å9\u0001Y\u0098ú\f\u001a\u008c»\u0018Û\u0080t'\u0094ª5.U¶ö;\u0016\\¶××HwÊ\u0090\\0þQyñë\u0012l²çÓzs\u009a\u008c\n,\u009aM\u0010í\u0082\u000e)®¶Ï1o±\u0088$(@HÆéR\tÍªRÊÀk{\u008bá$nDéå\u007f\u0005\u0080¦\u0016Æ\u0091g\u0017\u0087\u0098 >@¹á/\u0001±¢&Â¾bÅ\u0083@#Î|U\u009cÛ=|]ëþj\u001eê¿eß\u0083x\u0006\u0098\u00929\u0012Y\u0098ú\u0000\u001a»»)Û±t(\u0094£4ÁUNõÐ\u0016K¶Ù×gwø\u0090s0ñQ\u007fñà\u0012\u001b²\u0089Ó\u0014s\u0088\u008c\u0003,¡M,êøJ\u009eª\r\u000b\u008ak\u000bÈ\u0080(%\u0089®é7N³®<\u000fØoAÌÖ,A\u008dßíDBù¢v\u0003÷cpÀã \u0085\u0080\u000eá\u0090A\u0013¦\u0080\u0006>g¹Ç+$¨\u0084!å¹E]ºÔ\u001aW{ÐÛA8å\u0098wùéYr¾æ\u001e\u0087~\u0000ß\u009f?\u0015\u009c\u0087ü\u0000]£½5\u0012©r1Ó¦3[\u0090ÏðHQÆ±]\u0016ùva×ö7k\u0094ÿôxT\u001eµ\u0091\u0015\u0017J\u0090ª\u0006\u000b¸k/È¨(.\u0089£éGNÀ®V\u000fËo_ÌØ,~\u008dòíwBï¢o\u0002\u001cc\u008fÃ\u0011 \u0088\u0080\u001dá¹A<¦«\u0006(g¡Ç9$Â\u0084PåÏEQºÅ\u001ae{òÛw8ó\u0098|ø\u001aY\u0098¹\u000b\u001e\u0094~\u0002ß\u0083?#\u009c¬ü*]ª½;\u0012ÄrRÓÒÜ!|G\u009cÔ=S]ÒþY\u001eü¿wßîxj\u0098å9\u0001Y\u0098ú\u000f\u001a\u0098»\u0006Û\u009dt \u0094¯5.U©ö:\u0016\\¶××IwÊ\u0090Z0þQfñì\u0012l²øÓys\u009a\u008c\u0015,\u0094M\bí\u009a\u000e<®·Ï+oª\u0088%(JHØéL\tØª\\ÊÀko\u008bô$oDýåb\u0005\u0082¦\bÆ\u0090g\u000b\u0087\u0099 \"@¸á3\u0001±¢;Â bÛ\u0083I#Ð|H\u009cÃ=a]èþp\u001eë¿pß\u009ex\u0006\u0098\u008e9\u0018Y\u0086ú\u0018\u001a¤»4Û³t6\u0094¢4ÝUCõÐ\u0016T¶Ú×~wù\u0090o0óQfñá\u0012\u0007²\u008cÓ\u000es\u0089\u008c\u001f,¥M6í±\u000e7®¾ÎÞoE\u008fÈ(WHÆéA\täªtÊïkw\u008bâ$\u0001D\u0082å\u0010\u0005\u0097¦\u001eÆ¥g8\u0087³ 4@¦á>\u0001N¡ÏÂNbÖ\u0083V#ü|h\u009cì=\u007f]äþ\u0000\u001e\u0081¿\u0012ß\u008dx\u001f\u0098\u00809;Y©ú5\u001a¨»=ÛA{Ö\u0094Q4×UPõþ\u0016g¶ì×lwç\u0090}0\u008eQ\u0014ñ\u008f\u0012\u0015²\u0098Ó<s·\u008c-,°&«\u0086Íf^ÇÙ§X\u0004ÓävEý%d\u0082àboÃ\u008b£\u0012\u0000\u0086à\u001cA\u0090!\n\u008e±n&Ï¤¯#\f±ìÖLA-Ã\u008dXjÎÊi«ç\u000bxèçHv)ê\u0089\bv\u009eÖ\u0005·\u0099\u0017\bô·T(5º\u0095>r°ÒÁ²R\u0013Åó_PÌ0R\u0091ëq~Þñ¾b\u001féÿ\u0003\\\u009c<\u0004\u009d\u009e}\u000eÚµº/\u001b¤û&X\u00ad87\u0098MyÞÙE\u0086ßfVÇö§}\u0004çä~Eî%\u0015\u0082\u008fb\u0007Ã\u0086£\u0012\u0000\u009eà$A¾!<\u008e¹n(ÎC¯Ü\u000f[ìÝLV-ô\u008dljøÊ{«ò\u000bjè\u0091H\u0003)\u009d\u0089\u0002v\u0089Ö+·¦\u0017:ô¡T34O\u0095ÒuYÒÛ²X\u0013ÊómPä0\u007f\u0091âqiÞ\u0088¾\u001c\u001f\u009bÿ\u001f\\\u008e<)\u009d¦}8Ú»º6\u001b±ûÐ[_8Ü\u0098ByÖÙi\u0086üfgÇõ§r\u0004\u0094ä\u0013E\u0081%\u0006\u0082\u008db\u0017Ã¥£>\u0000»à=A¨!×\u0081BnÆÎ@¯Ð\u000f`ìçLx-ç\u008drjöÊ\u0010«\u009f\u000b\u0019è\u0096H\b)·\u0089!v®&\u001b\u0086}fîÇi§è\u0004cäÆEM%Ô\u0082PbßÃ;£¢\u00006à¬A !º\u008e\u0001n\u0096Ï\u0014¯\u0093\f\u0001ìfLò-j\u008dîj`ÊÄ«\\\u000bÑèVHÝ)@\u0089 v6Ö´·3\u0017£ô\u0006T\u008d5\u001e\u0095\u0090r\u0000Òq²þ\u0013hóîPb0ú\u0091]qÐÞT¾Ó\u001fMÿ¦\\2<ª\u009d-} Ú\u0004º\u0083\u001b\u0015û\u008aX\u001c8\u009b\u0098ýysÙô\u0086sfåÇX§Ì\u0004KäÍE@%¤\u0082#bµÃ)£¼\u0000$à\u009dA\u0014!\u0094\u008e\u0007n\u0098Îç¯q\u000fòìpLà-D\u008dßjVÊÖ«]\u000bÇè9H®)5\u0089¯v\"Ö\u0086·\r\u0017\u0097ô\u000bT\u009e4å\u0095\u007fuüÒv²ä\u0013zóÞP[0É\u0091RqÆÞ2¾¬\u001f4ÿ¬\\+<\u0084\u009d\u001c}\u0091Ú\u0016º\u009d\u001b\u0001û`[ï8i\u0098çyxÙÛ\u0086TfÊÇQ§À\u00048ä¢E6%£\u0082\"bºÃ\u0001£\u0090\u0000\bà\u0092A\u0019!{\u0081ønjÎñ¯c\u000fÐÜ!|G\u009cÔ=S]ÒþY\u001eü¿wßîxj\u0098å9\u0001Y\u0098ú\f\u001a\u0096»\u001aÛ\u0080t;\u0094¬5.U©ö;\u0016\\¶È×PwÔ\u0090D0ãQfñò\u0012r²ÿÓ`s\u009b\u008c\u000e,\u008eM\u0010í\u0082\u000e=®\u00adÏ0o«\u00880(^HÆéG\tÓªFÊÝkc\u008bô$vDôåb\u0005\u0081¦\bÆ\u0090g\u000b\u0087\u0091 >@¦á,\u0001¬¢'Â½bÆ\u0083T#Ï|U\u009cß=|]÷þm\u001eô¿dß\u009fx\u0005\u0098\u008d9\fY\u009bú\u001a\u001a¡»4Û¯t6\u0094¢4ÝUIõÐ\u0016T¶Þ×bwø\u0090s0ôQfñþ\u0012\u0005²\u0094Ó\u000fs\u0095\u008c\u001a,¼M(í©\u000e*®¥ÎÇoX\u008fÓ(QHßé@\täªaÊökh\u008bã$\u0001D\u008cå\u0010\u0005\u0094¦\u0010Æ¢g8\u0087³ 1@¼Ü!|G\u009cÔ=S]ÜþB\u001eý¿hßðxk\u0098û9\u001eY\u0085ú\u000b\u001a\u0094»\u0006Û\u009dt$\u0094´50U±ö\"\u0016]¶Î×PwÒ\u0090D0ÿQañò\u0012m²üÓ`s\u0084\u008c\u0001,\u0097M\bí\u009f\u000e%®¶Ï(o¶\u0088$(CHÆéR\tÍª]ÊÀkd\u008bô$sDöåb\u0005\u009d¦\u0002Æ\u0090g\u000b\u0087\u0091 >@¹á/\u0001°¢&Â¡bÇ\u0083I#Î|P\u009cÂ=b]éþp\u001e÷¿qß\u0082x\u0018\u0098\u00939\u0015Y\u0086ú\u0001\u001a »4Û°t1\u0094¹4ÜUNõÎ\u0016J¶Ù×`wø\u0090s0÷Qfñþ\u0012\u001a²\u0089Ó\u0010s\u0088\u008c\u0003,¡M(í°\u000e+®¹ÎÁoX\u008fÓ(QHÞé@\tûªiÊókh\u008bÿ$\bD\u0096å\u0011\u0005\u0094¦\u0004Æ g'\u0087² -@»á9\u0001Z¡ÊÂWbÈ\u0083C#ã|v\u009cñ=w]þþ\u001e\u001e\u0087¿\fß\u008cx\u0007\u0098\u009d9!Y´ú1\u001aµ»\"Û]{Ë\u0094K4ÊUEõã\u0016l¶ò×rwó\u0090z0\u009aQ\u0015ñ\u0093\u0012\u001d²\u0082Ó\"s£\u008c+,ªM%íC\rÍ".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 8395);
        onFastForward = cArr;
        onPlayFromMediaId = -5540658122928325514L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 1860 - r6
            int r8 = 119 - r8
            int r7 = r7 + 3
            byte[] r0 = com.marrow.ui.views.MoveableTextView.onMediaButtonEvent
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r6
            r4 = r2
            goto L2b
        L10:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r8
            int r6 = r6 + (-5)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.MoveableTextView.a(int, byte, int, java.lang.Object[]):void");
    }
}
