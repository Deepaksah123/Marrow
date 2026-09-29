package kotlin;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.gif.GifImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.marrow.data.models.ResponseError;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u001b\u0010\u0014\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u0005\u001a\u00020$H\u0002¢\u0006\u0004\b\u0014\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0018\u0010\u001c\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010-R\u0018\u0010\u0014\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010/\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106R\u0018\u00108\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0018\u0010#\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010:R\u0014\u0010\u001f\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010<"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda49;", "Lo/SimpleBasePlayerExternalSyntheticLambda17;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "onResume", "onPause", "onStop", "read", "RatingCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCommand", "handleMediaPlayPauseIfPendingOnHandler", "MediaMetadataCompat", "Landroid/widget/FrameLayout;", "Lcom/clevertap/android/sdk/customviews/CloseImageView;", "RemoteActionCompatParcelizer", "(Landroid/widget/FrameLayout;Lcom/clevertap/android/sdk/customviews/CloseImageView;)V", "MediaDescriptionCompat", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "onAddQueueItem", "MediaBrowserCompatCustomActionResultReceiver", "", "(Landroid/view/View;Ljava/lang/String;)V", "", "IconCompatParcelizer", "Z", "Lo/onFastForward;", "Lo/onFastForward;", "write", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "Lcom/clevertap/android/sdk/gif/GifImageView;", "AudioAttributesCompatParcelizer", "Lcom/clevertap/android/sdk/gif/GifImageView;", "Lo/lambdaonDeviceVolumeChanged59;", "Lo/lambdaonDeviceVolumeChanged59;", "Landroid/widget/RelativeLayout;", "MediaBrowserCompatItemReceiver", "Landroid/widget/RelativeLayout;", "Landroid/widget/FrameLayout;", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "Lo/SimpleBasePlayerExternalSyntheticLambda49$AudioAttributesCompatParcelizer;", "Lo/SimpleBasePlayerExternalSyntheticLambda49$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda49 extends SimpleBasePlayerExternalSyntheticLambda17 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private GifImageView read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private lambdaonDeviceVolumeChanged59 AudioAttributesCompatParcelizer;
    private FrameLayout AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer = new AudioAttributesCompatParcelizer();
    private boolean IconCompatParcelizer;
    private ViewGroup.LayoutParams MediaBrowserCompatCustomActionResultReceiver;
    private RelativeLayout MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private FrameLayout AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private onFastForward write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private ImageView RemoteActionCompatParcelizer;
    private static final byte[] $$c = {73, 111, 30, 98};
    private static final int $$f = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {112, -40, -93, -59, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$e = 27;
    private static final byte[] $$a = {111, -119, 57, 106, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 49;
    private static int RatingCompat = 0;
    private static int MediaDescriptionCompat = 1;
    private static long MediaBrowserCompatMediaItem = -1381282673316496250L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r5, byte r6, int r7) {
        /*
            byte[] r0 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.$$c
            int r7 = r7 + 4
            int r5 = r5 * 4
            int r5 = 104 - r5
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r5
            r5 = r6
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r7]
        L29:
            int r5 = r5 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerExternalSyntheticLambda49.$$g(short, byte, int):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i5) | i7);
        int i9 = ~i3;
        int i10 = ~(i9 | i);
        int i11 = ~(i7 | i3);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i5);
        int i14 = (~(i5 | i7)) | i10 | i11;
        int i15 = i3 + i + i4 + (2052055731 * i6) + (1687666023 * i2);
        int i16 = i15 * i15;
        int i17 = (i3 * (-1966771951)) + 1000013824 + ((-1966771951) * i) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i4) + (632946688 * i6) + ((-741212160) * i2) + (2121465856 * i16);
        int i18 = (i3 * 1533266457) + 1248777597 + (i * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * ResponseError.NO_INTERNET_ERROR) + (i4 * 1533266057) + (i6 * 706030027) + (i2 * 1023530015) + (i16 * (-2088042496));
        int i19 = i17 + (i18 * i18 * 1434255360);
        if (i19 == 1) {
            return AudioAttributesCompatParcelizer(objArr);
        }
        if (i19 == 2) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i19 != 3) {
            return i19 != 4 ? write(objArr) : IconCompatParcelizer(objArr);
        }
        SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49 = (SimpleBasePlayerExternalSyntheticLambda49) objArr[0];
        int i20 = 2 % 2;
        int i21 = RatingCompat + 53;
        MediaDescriptionCompat = i21 % 128;
        int i22 = i21 % 2;
        super.onResume();
        if (simpleBasePlayerExternalSyntheticLambda49.AudioAttributesImplApi26Parcelizer().onPrepareFromMediaId()) {
            int i23 = MediaDescriptionCompat + 91;
            RatingCompat = i23 % 128;
            int i24 = i23 % 2;
            simpleBasePlayerExternalSyntheticLambda49.onAddQueueItem();
            simpleBasePlayerExternalSyntheticLambda49.MediaBrowserCompatSearchResultReceiver();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.$$a
            int r7 = r7 * 12
            int r7 = 77 - r7
            int r8 = r8 * 10
            int r8 = 44 - r8
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-1)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerExternalSyntheticLambda49.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.$$d
            int r7 = r7 * 17
            int r7 = 99 - r7
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r1 = r8 + 28
            byte[] r1 = new byte[r1]
            int r8 = r8 + 27
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-6)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerExternalSyntheticLambda49.c(short, byte, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ boolean AudioAttributesCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 109;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        boolean z = simpleBasePlayerExternalSyntheticLambda49.IconCompatParcelizer;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return z;
    }

    public static final /* synthetic */ void read(SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49) {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        simpleBasePlayerExternalSyntheticLambda49.AudioAttributesImplApi21Parcelizer();
        int i4 = MediaDescriptionCompat + 105;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ RelativeLayout write(SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 13;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        RelativeLayout relativeLayout = simpleBasePlayerExternalSyntheticLambda49.MediaBrowserCompatItemReceiver;
        int i5 = i2 + 25;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
        return relativeLayout;
    }

    public static final class AudioAttributesCompatParcelizer extends onRemoveQueueItemAt {
        AudioAttributesCompatParcelizer() {
            super(false);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            if (SimpleBasePlayerExternalSyntheticLambda49.AudioAttributesCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda49.this)) {
                SimpleBasePlayerExternalSyntheticLambda49.read(SimpleBasePlayerExternalSyntheticLambda49.this);
                setEnabled(false);
            }
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaBrowserCompatMediaItem ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 85;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaBrowserCompatMediaItem)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), 12424 - View.combineMeasuredStates(0, 0), TextUtils.getTrimmedLength("") + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1869 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') - '&', 1983509525, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
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
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $10 + 63;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char size = (char) (View.MeasureSpec.getSize(0) + 13183);
            int i2 = 1649 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int i3 = 26 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b, b, r2[53], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(size, i2, i3, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c = (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1650;
                int packedPositionGroup = 26 - ExpandableListView.getPackedPositionGroup(0L);
                byte b2 = $$a[17];
                Object[] objArr3 = new Object[1];
                a(b2, b2, r5[65], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c, iLastIndexOf, packedPositionGroup, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getPressedStateDuration() >> 16) + 1, new char[]{2753, 2731, 13001, 28672, 48663, 6325, 9292, 49185, 41627, 57396, 36047, 39090, 23118, 18914, 54641, 29009, 62446, 4548, 15859, 51657}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(TextUtils.indexOf("", "") + 1, new char[]{57932, 57893, 52593, 43236, 16200, 59144, 64699, 16753, 19020, 8073, 21566, 6650, 45804, 46613, 3509, 61471, 6995, 61031, 58646, 18590}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = MediaDescriptionCompat + 53;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1830115990};
                byte[] bArr = $$d;
                byte b3 = bArr[35];
                byte b4 = b3;
                Object[] objArr7 = new Object[1];
                c(b3, b4, (byte) (b4 | 10), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((byte) (-bArr[12]), bArr[60], bArr[70], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13183);
                    int bitsPerPixel = 1648 - ImageFormat.getBitsPerPixel(0);
                    int i6 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                    byte b5 = $$a[17];
                    Object[] objArr9 = new Object[1];
                    a(b5, b5, r10[65], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cMakeMeasureSpec, bitsPerPixel, i6, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{37910, 38007, 19499, 37421, 5752, 26200, 50803, 26717, 15373, 40659, 28391, 12445, 50321, 14173, 14113, 55572, 27955, 28449, 57295, 25006, 13739, 34693, 25675, 13872, 56881, 14369}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(-ImageFormat.getBitsPerPixel(0), new char[]{25208, 25117, 49473, 20106, 20465, 60208, 6865, 12758, 51839, 5045, 45632, 26984, 13045, 47653, 60356, 32954, 39757, 57941, 889}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 13183);
                        int iIndexOf = 1648 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 26;
                        byte b6 = $$a[17];
                        byte b7 = b6;
                        Object[] objArr12 = new Object[1];
                        a(b6, b7, (byte) (b7 | 74), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(maxKeyCode, iIndexOf, iNormalizeMetaState, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 13183);
                        int iIndexOf2 = 1649 - TextUtils.indexOf("", "", 0);
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 27;
                        byte b8 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b8, b8, r9[53], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cResolveOpacity, iIndexOf2, bitsPerPixel2, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6054 - ExpandableListView.getPackedPositionGroup(0L), 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = MediaDescriptionCompat + 67;
                RatingCompat = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr14 = {-258583963, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 6030 - Color.red(0), 24 - TextUtils.indexOf("", ""));
                    byte[] bArr2 = $$d;
                    Object[] objArr15 = new Object[1];
                    c(bArr2[53], bArr2[70], bArr2[35], objArr15);
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
        this.AudioAttributesCompatParcelizer = lambdaonDownstreamFormatChanged28.write == lambdaonDrmSessionReleased66.write ? new lambdaonDroppedFrames16() : new lambdaonDrmKeysRestored64();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        RatingCompat = i2 % 128;
        FrameLayout frameLayout = null;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri();
            frameLayout.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        View viewInflate = (AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && MediaBrowserCompatItemReceiver()) ? p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.tab_inapp_interstitial, p1, false) : p0.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inapp_interstitial, p1, false);
        FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.inapp_interstitial_frame_layout);
        IconCompatParcelizer((CloseImageView) frameLayout2.findViewById(199272));
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout2.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_relative_layout);
        this.MediaBrowserCompatItemReceiver = relativeLayout;
        if (relativeLayout != null) {
            frameLayout = (FrameLayout) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.video_frame);
        } else {
            int i3 = RatingCompat + 45;
            MediaDescriptionCompat = i3 % 128;
            int i4 = i3 % 2;
        }
        this.AudioAttributesImplBaseParcelizer = frameLayout;
        RelativeLayout relativeLayout2 = this.MediaBrowserCompatItemReceiver;
        if (relativeLayout2 != null) {
            int i5 = RatingCompat + 61;
            MediaDescriptionCompat = i5 % 128;
            int i6 = i5 % 2;
            relativeLayout2.setBackgroundColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnPlay()));
            int i7 = RatingCompat + 5;
            MediaDescriptionCompat = i7 % 128;
            int i8 = i7 % 2;
        }
        frameLayout2.setBackground(new ColorDrawable(-1157627904));
        toMagicModuleMetaRepoModel.write(frameLayout2);
        CloseImageView closeImageViewRemoteActionCompatParcelizer = getRead();
        toMagicModuleMetaRepoModel.write(closeImageViewRemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(604197005, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), -604197004, new Object[]{this, frameLayout2, closeImageViewRemoteActionCompatParcelizer}, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer());
        handleMediaPlayPauseIfPendingOnHandler();
        onCommand();
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        RatingCompat();
        return viewInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r2
      0x0026: PHI (r2v5 com.clevertap.android.sdk.gif.GifImageView) = (r2v4 com.clevertap.android.sdk.gif.GifImageView), (r2v6 com.clevertap.android.sdk.gif.GifImageView) binds: [B:8:0x0024, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            o.SimpleBasePlayerExternalSyntheticLambda49 r5 = (kotlin.SimpleBasePlayerExternalSyntheticLambda49) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat
            int r2 = r2 + 95
            int r3 = r2 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 == 0) goto L1f
            super.onStart()
            com.clevertap.android.sdk.gif.GifImageView r2 = r5.read
            r4 = 58
            int r4 = r4 / r0
            if (r2 == 0) goto L66
            goto L26
        L1f:
            super.onStart()
            com.clevertap.android.sdk.gif.GifImageView r2 = r5.read
            if (r2 == 0) goto L66
        L26:
            int r0 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat
            int r0 = r0 + 63
            int r4 = r0 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat = r4
            int r0 = r0 % r1
            if (r0 != 0) goto L54
            com.clevertap.android.sdk.inapp.CTInAppNotification r0 = r5.AudioAttributesImplApi26Parcelizer()
            java.util.List r0 = r0.onAddQueueItem()
            java.lang.Object r0 = kotlin.IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(r0)
            com.clevertap.android.sdk.inapp.CTInAppNotificationMedia r0 = (com.clevertap.android.sdk.inapp.CTInAppNotificationMedia) r0
            if (r0 == 0) goto L66
            o.SimpleBasePlayerExternalSyntheticLambda6 r5 = r5.AudioAttributesImplBaseParcelizer()
            java.lang.String r0 = r0.getRemoteActionCompatParcelizer()
            byte[] r5 = r5.AudioAttributesCompatParcelizer(r0)
            r2.setBytes(r5)
            r2.AudioAttributesCompatParcelizer()
            goto L66
        L54:
            com.clevertap.android.sdk.inapp.CTInAppNotification r5 = r5.AudioAttributesImplApi26Parcelizer()
            java.util.List r5 = r5.onAddQueueItem()
            java.lang.Object r5 = kotlin.IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(r5)
            com.clevertap.android.sdk.inapp.CTInAppNotificationMedia r5 = (com.clevertap.android.sdk.inapp.CTInAppNotificationMedia) r5
            r3.hashCode()
            throw r3
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerExternalSyntheticLambda49.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49 = (SimpleBasePlayerExternalSyntheticLambda49) objArr[0];
        int i = 2 % 2;
        super.onPause();
        GifImageView gifImageView = simpleBasePlayerExternalSyntheticLambda49.read;
        if (gifImageView != null) {
            gifImageView.read();
            int i2 = MediaDescriptionCompat + 125;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        if (simpleBasePlayerExternalSyntheticLambda49.IconCompatParcelizer) {
            simpleBasePlayerExternalSyntheticLambda49.AudioAttributesImplApi21Parcelizer();
            simpleBasePlayerExternalSyntheticLambda49.AudioAttributesImplApi21Parcelizer.setEnabled(false);
        }
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged59 = simpleBasePlayerExternalSyntheticLambda49.AudioAttributesCompatParcelizer;
        if (lambdaondevicevolumechanged59 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lambdaondevicevolumechanged59 = null;
        }
        lambdaondevicevolumechanged59.read();
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged592 = simpleBasePlayerExternalSyntheticLambda49.AudioAttributesCompatParcelizer;
        if (lambdaondevicevolumechanged592 == null) {
            int i4 = RatingCompat + 63;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lambdaondevicevolumechanged592 = null;
        }
        lambdaondevicevolumechanged592.write();
        return null;
    }

    public static final class RemoteActionCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ CloseImageView IconCompatParcelizer;
        private /* synthetic */ FrameLayout write;

        RemoteActionCompatParcelizer(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.write = frameLayout;
            this.IconCompatParcelizer = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            RelativeLayout relativeLayoutWrite = SimpleBasePlayerExternalSyntheticLambda49.write(SimpleBasePlayerExternalSyntheticLambda49.this);
            if (relativeLayoutWrite == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayoutWrite.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (SimpleBasePlayerExternalSyntheticLambda49.this.AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && SimpleBasePlayerExternalSyntheticLambda49.this.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda49.this.write(relativeLayoutWrite, layoutParams2, this.write, this.IconCompatParcelizer);
            } else if (SimpleBasePlayerExternalSyntheticLambda49.this.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda49.this.read(relativeLayoutWrite, layoutParams2, this.write, this.IconCompatParcelizer);
            } else {
                SimpleBasePlayerExternalSyntheticLambda2.read(relativeLayoutWrite, layoutParams2, this.IconCompatParcelizer);
            }
            relativeLayoutWrite.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int i = 2 % 2;
        super.onStop();
        GifImageView gifImageView = this.read;
        if (gifImageView != null) {
            int i2 = RatingCompat + 43;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            gifImageView.read();
        }
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged59 = this.AudioAttributesCompatParcelizer;
        if (lambdaondevicevolumechanged59 == null) {
            int i4 = RatingCompat + 125;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i6 = RatingCompat + 15;
            MediaDescriptionCompat = i6 % 128;
            int i7 = i6 % 2;
            lambdaondevicevolumechanged59 = null;
        }
        lambdaondevicevolumechanged59.write();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 com.clevertap.android.sdk.gif.GifImageView) = (r1v4 com.clevertap.android.sdk.gif.GifImageView), (r1v7 com.clevertap.android.sdk.gif.GifImageView) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda2, kotlin.SimpleBasePlayerExternalSyntheticLambda14
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void read() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat
            int r1 = r1 + 83
            int r2 = r1 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            super.read()
            com.clevertap.android.sdk.gif.GifImageView r1 = r3.read
            r2 = 93
            int r2 = r2 / 0
            if (r1 == 0) goto L24
            goto L21
        L1a:
            super.read()
            com.clevertap.android.sdk.gif.GifImageView r1 = r3.read
            if (r1 == 0) goto L24
        L21:
            r1.read()
        L24:
            o.lambdaonDeviceVolumeChanged59 r3 = r3.AudioAttributesCompatParcelizer
            r1 = 0
            if (r3 != 0) goto L38
            int r3 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat
            int r3 = r3 + 59
            int r2 = r3 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat = r2
            int r3 = r3 % r0
            java.lang.String r3 = ""
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r3)
            r3 = r1
        L38:
            r3.write()
            int r3 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat
            int r3 = r3 + 73
            int r2 = r3 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L47
            return
        L47:
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerExternalSyntheticLambda49.read():void");
    }

    private final void RatingCompat() {
        int i = 2 % 2;
        if (AudioAttributesImplApi26Parcelizer().getOnRewind()) {
            CloseImageView closeImageViewRemoteActionCompatParcelizer = getRead();
            if (closeImageViewRemoteActionCompatParcelizer != null) {
                closeImageViewRemoteActionCompatParcelizer.setVisibility(0);
                int i2 = MediaDescriptionCompat + 63;
                RatingCompat = i2 % 128;
                int i3 = i2 % 2;
            }
            CloseImageView closeImageViewRemoteActionCompatParcelizer2 = getRead();
            if (closeImageViewRemoteActionCompatParcelizer2 != null) {
                closeImageViewRemoteActionCompatParcelizer2.setOnClickListener(new View.OnClickListener() { // from class: o.SimpleBasePlayerExternalSyntheticLambda52
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SimpleBasePlayerExternalSyntheticLambda49.RemoteActionCompatParcelizer(this.read);
                    }
                });
                return;
            }
            return;
        }
        int i4 = MediaDescriptionCompat + 95;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        CloseImageView closeImageViewRemoteActionCompatParcelizer3 = getRead();
        if (closeImageViewRemoteActionCompatParcelizer3 != null) {
            closeImageViewRemoteActionCompatParcelizer3.setOnClickListener(null);
        }
        CloseImageView closeImageViewRemoteActionCompatParcelizer4 = getRead();
        if (closeImageViewRemoteActionCompatParcelizer4 != null) {
            int i6 = MediaDescriptionCompat + 11;
            RatingCompat = i6 % 128;
            if (i6 % 2 != 0) {
                closeImageViewRemoteActionCompatParcelizer4.setVisibility(13);
            } else {
                closeImageViewRemoteActionCompatParcelizer4.setVisibility(8);
            }
            int i7 = RatingCompat + 95;
            MediaDescriptionCompat = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final void AudioAttributesImplApi26Parcelizer(SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda49, "");
        simpleBasePlayerExternalSyntheticLambda49.RemoteActionCompatParcelizer((Bundle) null);
        GifImageView gifImageView = simpleBasePlayerExternalSyntheticLambda49.read;
        if (gifImageView != null) {
            int i2 = RatingCompat + 99;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            gifImageView.read();
        }
        maybeGetTypeVariable activity = simpleBasePlayerExternalSyntheticLambda49.getActivity();
        if (activity != null) {
            int i4 = RatingCompat + 31;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            activity.finish();
            if (i5 == 0) {
                int i6 = 26 / 0;
            }
        }
    }

    public static final class write implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ CloseImageView AudioAttributesCompatParcelizer;
        private /* synthetic */ FrameLayout read;

        write(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.read = frameLayout;
            this.AudioAttributesCompatParcelizer = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            RelativeLayout relativeLayoutWrite = SimpleBasePlayerExternalSyntheticLambda49.write(SimpleBasePlayerExternalSyntheticLambda49.this);
            if (relativeLayoutWrite == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayoutWrite.getLayoutParams();
            toMagicModuleMetaRepoModel.read(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (SimpleBasePlayerExternalSyntheticLambda49.this.AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && SimpleBasePlayerExternalSyntheticLambda49.this.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda49.this.RemoteActionCompatParcelizer(relativeLayoutWrite, layoutParams2, this.read, this.AudioAttributesCompatParcelizer);
            } else if (SimpleBasePlayerExternalSyntheticLambda49.this.MediaBrowserCompatItemReceiver()) {
                SimpleBasePlayerExternalSyntheticLambda49.this.IconCompatParcelizer(relativeLayoutWrite, layoutParams2, this.read, this.AudioAttributesCompatParcelizer);
            } else {
                SimpleBasePlayerExternalSyntheticLambda2.write(relativeLayoutWrite, layoutParams2, this.AudioAttributesCompatParcelizer);
            }
            relativeLayoutWrite.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        LinearLayout linearLayout;
        Button button;
        Button button2;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        RelativeLayout relativeLayout = this.MediaBrowserCompatItemReceiver;
        Object obj = null;
        if (relativeLayout != null) {
            int i2 = MediaDescriptionCompat + 49;
            RatingCompat = i2 % 128;
            if (i2 % 2 != 0) {
                linearLayout = (LinearLayout) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_linear_layout);
                int i3 = 41 / 0;
            } else {
                linearLayout = (LinearLayout) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_linear_layout);
            }
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            int i4 = RatingCompat + 109;
            MediaDescriptionCompat = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            button = (Button) linearLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_button1);
        } else {
            button = null;
        }
        if (button != null) {
            arrayList.add(button);
        }
        if (linearLayout != null) {
            int i5 = MediaDescriptionCompat + 73;
            RatingCompat = i5 % 128;
            if (i5 % 2 != 0) {
                button2 = (Button) linearLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_button2);
                int i6 = 20 / 0;
            } else {
                button2 = (Button) linearLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_button2);
            }
        } else {
            button2 = null;
        }
        if (button2 != null) {
            arrayList.add(button2);
        }
        List<CTInAppNotificationButton> listIconCompatParcelizer = AudioAttributesImplApi26Parcelizer().IconCompatParcelizer();
        if (listIconCompatParcelizer.size() == 1) {
            int i7 = MediaDescriptionCompat + 99;
            RatingCompat = i7 % 128;
            if (i7 % 2 == 0 ? getIconCompatParcelizer() == 2 : getIconCompatParcelizer() == 4) {
                int i8 = RatingCompat + 21;
                MediaDescriptionCompat = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (button != null) {
                    button.setVisibility(8);
                }
            } else if (getIconCompatParcelizer() == 1) {
                int i9 = MediaDescriptionCompat + 73;
                RatingCompat = i9 % 128;
                if (i9 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (button != null) {
                    button.setVisibility(4);
                }
            }
            if (button2 != null) {
                int i10 = MediaDescriptionCompat + 71;
                RatingCompat = i10 % 128;
                if (i10 % 2 != 0) {
                    AudioAttributesCompatParcelizer(button2, listIconCompatParcelizer.get(0), 1);
                    return;
                } else {
                    AudioAttributesCompatParcelizer(button2, listIconCompatParcelizer.get(0), 0);
                    return;
                }
            }
        } else if (!listIconCompatParcelizer.isEmpty()) {
            int size = listIconCompatParcelizer.size();
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = MediaDescriptionCompat + 75;
                RatingCompat = i12 % 128;
                int i13 = i12 % 2;
                if (i11 >= 2) {
                    break;
                }
                AudioAttributesCompatParcelizer((Button) arrayList.get(i11), listIconCompatParcelizer.get(i11), i11);
            }
        }
        int i14 = MediaDescriptionCompat + 49;
        RatingCompat = i14 % 128;
        int i15 = i14 % 2;
    }

    private final void onCommand() {
        TextView textView;
        int i = 2 % 2;
        RelativeLayout relativeLayout = this.MediaBrowserCompatItemReceiver;
        if (relativeLayout != null) {
            int i2 = MediaDescriptionCompat + 111;
            RatingCompat = i2 % 128;
            if (i2 % 2 != 0) {
                textView.hashCode();
                throw null;
            }
            textView = (TextView) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_title);
        } else {
            textView = null;
        }
        if (textView != null) {
            int i3 = MediaDescriptionCompat + 93;
            RatingCompat = i3 % 128;
            if (i3 % 2 != 0) {
                textView.setText(AudioAttributesImplApi26Parcelizer().getMediaMetadataCompat());
                textView.hashCode();
                throw null;
            }
            textView.setText(AudioAttributesImplApi26Parcelizer().getMediaMetadataCompat());
        }
        if (textView != null) {
            int i4 = MediaDescriptionCompat + 21;
            RatingCompat = i4 % 128;
            if (i4 % 2 != 0) {
                textView.setTextColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnSkipToQueueItem()));
                throw null;
            }
            textView.setTextColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnSkipToQueueItem()));
        }
        RelativeLayout relativeLayout2 = this.MediaBrowserCompatItemReceiver;
        textView = relativeLayout2 != null ? (TextView) relativeLayout2.findViewById(RendererCapabilitiesAdaptiveSupport.write.interstitial_message) : null;
        if (textView != null) {
            int i5 = RatingCompat + 61;
            MediaDescriptionCompat = i5 % 128;
            int i6 = i5 % 2;
            textView.setText(AudioAttributesImplApi26Parcelizer().getRatingCompat());
        }
        if (textView != null) {
            textView.setTextColor(Color.parseColor(AudioAttributesImplApi26Parcelizer().getOnSetRating()));
        }
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        FrameLayout frameLayout;
        int i = 2 % 2;
        if (AudioAttributesImplApi26Parcelizer().onAddQueueItem().isEmpty()) {
            return;
        }
        CTInAppNotificationMedia cTInAppNotificationMedia = AudioAttributesImplApi26Parcelizer().onAddQueueItem().get(0);
        ImageView imageView = null;
        if (cTInAppNotificationMedia.AudioAttributesImplApi21Parcelizer()) {
            Bitmap bitmap = AudioAttributesImplBaseParcelizer().read(cTInAppNotificationMedia.getRemoteActionCompatParcelizer());
            if (bitmap != null) {
                RelativeLayout relativeLayout = this.MediaBrowserCompatItemReceiver;
                if (relativeLayout != null) {
                    imageView = (ImageView) relativeLayout.findViewById(RendererCapabilitiesAdaptiveSupport.write.backgroundImage);
                    int i2 = RatingCompat + 1;
                    MediaDescriptionCompat = i2 % 128;
                    int i3 = i2 % 2;
                }
                if (imageView != null) {
                    read(imageView, cTInAppNotificationMedia.getWrite());
                }
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    return;
                }
                return;
            }
            return;
        }
        if (cTInAppNotificationMedia.AudioAttributesCompatParcelizer()) {
            byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(cTInAppNotificationMedia.getRemoteActionCompatParcelizer());
            if (bArrAudioAttributesCompatParcelizer != null) {
                RelativeLayout relativeLayout2 = this.MediaBrowserCompatItemReceiver;
                GifImageView gifImageView = relativeLayout2 != null ? (GifImageView) relativeLayout2.findViewById(RendererCapabilitiesAdaptiveSupport.write.gifImage) : null;
                this.read = gifImageView;
                if (gifImageView != null) {
                    int i4 = RatingCompat + 1;
                    MediaDescriptionCompat = i4 % 128;
                    if (i4 % 2 == 0) {
                        read(gifImageView, cTInAppNotificationMedia.getWrite());
                        throw null;
                    }
                    read(gifImageView, cTInAppNotificationMedia.getWrite());
                }
                GifImageView gifImageView2 = this.read;
                if (gifImageView2 != null) {
                    gifImageView2.setVisibility(0);
                }
                GifImageView gifImageView3 = this.read;
                if (gifImageView3 != null) {
                    int i5 = MediaDescriptionCompat + 65;
                    RatingCompat = i5 % 128;
                    int i6 = i5 % 2;
                    gifImageView3.setBytes(bArrAudioAttributesCompatParcelizer);
                }
                GifImageView gifImageView4 = this.read;
                if (gifImageView4 != null) {
                    gifImageView4.AudioAttributesCompatParcelizer();
                    return;
                }
                return;
            }
            return;
        }
        if (!(!cTInAppNotificationMedia.AudioAttributesImplBaseParcelizer())) {
            MediaMetadataCompat();
            onAddQueueItem();
            MediaBrowserCompatSearchResultReceiver();
            FrameLayout frameLayout2 = this.AudioAttributesImplBaseParcelizer;
            if (frameLayout2 != null) {
                int i7 = MediaDescriptionCompat + 3;
                RatingCompat = i7 % 128;
                int i8 = i7 % 2;
                read(frameLayout2, cTInAppNotificationMedia.getWrite());
                int i9 = MediaDescriptionCompat + 85;
                RatingCompat = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
            return;
        }
        if (cTInAppNotificationMedia.read()) {
            int i11 = MediaDescriptionCompat + 13;
            RatingCompat = i11 % 128;
            if (i11 % 2 != 0) {
                MediaMetadataCompat();
                onAddQueueItem();
                MediaBrowserCompatSearchResultReceiver();
                AudioAttributesCompatParcelizer(-456124821, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), 456124825, new Object[]{this}, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer());
                frameLayout = this.AudioAttributesImplBaseParcelizer;
                int i12 = 69 / 0;
                if (frameLayout == null) {
                    return;
                }
            } else {
                MediaMetadataCompat();
                onAddQueueItem();
                MediaBrowserCompatSearchResultReceiver();
                AudioAttributesCompatParcelizer(-456124821, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), 456124825, new Object[]{this}, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer());
                frameLayout = this.AudioAttributesImplBaseParcelizer;
                if (frameLayout == null) {
                    return;
                }
            }
            read(frameLayout, cTInAppNotificationMedia.getWrite());
        }
    }

    private static final void AudioAttributesImplApi21Parcelizer(SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda49, "");
        if (simpleBasePlayerExternalSyntheticLambda49.IconCompatParcelizer) {
            simpleBasePlayerExternalSyntheticLambda49.AudioAttributesImplApi21Parcelizer();
            simpleBasePlayerExternalSyntheticLambda49.AudioAttributesImplApi21Parcelizer.setEnabled(false);
            return;
        }
        int i4 = MediaDescriptionCompat + 21;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            simpleBasePlayerExternalSyntheticLambda49.AudioAttributesImplApi21Parcelizer.setEnabled(false);
        } else {
            simpleBasePlayerExternalSyntheticLambda49.AudioAttributesImplApi21Parcelizer.setEnabled(true);
        }
        simpleBasePlayerExternalSyntheticLambda49.MediaBrowserCompatMediaItem();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaMetadataCompat() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r2 = r7.requireContext()
            r1.<init>(r2)
            r7.RemoteActionCompatParcelizer = r1
            android.content.res.Resources r2 = r7.getResources()
            int r3 = o.RendererCapabilitiesAdaptiveSupport.read.ct_ic_fullscreen_expand
            r4 = 0
            android.graphics.drawable.Drawable r2 = kotlin._parseDoublePrimitive.read(r2, r3, r4)
            r1.setImageDrawable(r2)
            o.SimpleBasePlayerExternalSyntheticLambda53 r2 = new o.SimpleBasePlayerExternalSyntheticLambda53
            r2.<init>()
            r1.setOnClickListener(r2)
            android.content.res.Resources r2 = r7.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            com.clevertap.android.sdk.inapp.CTInAppNotification r3 = r7.AudioAttributesImplApi26Parcelizer()
            boolean r3 = r3.getOnPrepareFromUri()
            r5 = 1
            if (r3 == 0) goto L5c
            int r3 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat
            int r3 = r3 + 95
            int r6 = r3 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat = r6
            int r3 = r3 % r0
            if (r3 != 0) goto L58
            boolean r7 = r7.MediaBrowserCompatItemReceiver()
            if (r7 == 0) goto L5c
            int r7 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat
            int r7 = r7 + 15
            int r3 = r7 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat = r3
            int r7 = r7 % r0
            r7 = 1106247680(0x41f00000, float:30.0)
            float r7 = android.util.TypedValue.applyDimension(r5, r7, r2)
            goto L62
        L58:
            r7.MediaBrowserCompatItemReceiver()
            throw r4
        L5c:
            r7 = 1101004800(0x41a00000, float:20.0)
            float r7 = android.util.TypedValue.applyDimension(r5, r7, r2)
        L62:
            int r7 = (int) r7
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = android.util.TypedValue.applyDimension(r5, r0, r2)
            int r0 = (int) r0
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = android.util.TypedValue.applyDimension(r5, r3, r2)
            int r2 = (int) r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r7, r7)
            r7 = 8388613(0x800005, float:1.175495E-38)
            r3.gravity = r7
            r7 = 0
            r3.setMargins(r7, r0, r2, r7)
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r1.setLayoutParams(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaMetadataCompat():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[PHI: r2
      0x0044: PHI (r2v7 android.widget.RelativeLayout) = (r2v6 android.widget.RelativeLayout), (r2v10 android.widget.RelativeLayout) binds: [B:17:0x0042, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            o.SimpleBasePlayerExternalSyntheticLambda49 r1 = (kotlin.SimpleBasePlayerExternalSyntheticLambda49) r1
            r2 = 1
            r3 = r7[r2]
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 2
            r7 = r7[r4]
            com.clevertap.android.sdk.customviews.CloseImageView r7 = (com.clevertap.android.sdk.customviews.CloseImageView) r7
            int r5 = r4 % r4
            int r5 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat
            int r5 = r5 + 13
            int r6 = r5 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat = r6
            int r5 = r5 % r4
            r6 = 0
            if (r5 != 0) goto L24
            int r2 = r1.getIconCompatParcelizer()
            if (r2 == 0) goto L55
            goto L2b
        L24:
            int r5 = r1.getIconCompatParcelizer()
            if (r5 == r2) goto L55
            r2 = r5
        L2b:
            if (r2 != r4) goto L69
            int r2 = kotlin.SimpleBasePlayerExternalSyntheticLambda49.MediaDescriptionCompat
            int r2 = r2 + 115
            int r5 = r2 % 128
            kotlin.SimpleBasePlayerExternalSyntheticLambda49.RatingCompat = r5
            int r2 = r2 % r4
            if (r2 == 0) goto L40
            android.widget.RelativeLayout r2 = r1.MediaBrowserCompatItemReceiver
            r4 = 20
            int r4 = r4 / r0
            if (r2 == 0) goto L69
            goto L44
        L40:
            android.widget.RelativeLayout r2 = r1.MediaBrowserCompatItemReceiver
            if (r2 == 0) goto L69
        L44:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            if (r0 == 0) goto L69
            o.SimpleBasePlayerExternalSyntheticLambda49$write r2 = new o.SimpleBasePlayerExternalSyntheticLambda49$write
            r2.<init>(r3, r7)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            r0.addOnGlobalLayoutListener(r2)
            return r6
        L55:
            android.widget.RelativeLayout r0 = r1.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L69
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L69
            o.SimpleBasePlayerExternalSyntheticLambda49$RemoteActionCompatParcelizer r2 = new o.SimpleBasePlayerExternalSyntheticLambda49$RemoteActionCompatParcelizer
            r2.<init>(r3, r7)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2
            r0.addOnGlobalLayoutListener(r2)
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerExternalSyntheticLambda49.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49 = (SimpleBasePlayerExternalSyntheticLambda49) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 69;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageView = simpleBasePlayerExternalSyntheticLambda49.RemoteActionCompatParcelizer;
        if (imageView != null) {
            imageView.setVisibility(8);
            int i4 = RatingCompat + 47;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = MediaDescriptionCompat + 121;
        RatingCompat = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged59 = this.AudioAttributesCompatParcelizer;
        if (lambdaondevicevolumechanged59 == null) {
            int i2 = RatingCompat + 113;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lambdaondevicevolumechanged59 = null;
        }
        View viewAudioAttributesCompatParcelizer = lambdaondevicevolumechanged59.AudioAttributesCompatParcelizer();
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged592 = this.AudioAttributesCompatParcelizer;
        if (lambdaondevicevolumechanged592 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lambdaondevicevolumechanged592 = null;
        }
        lambdaondevicevolumechanged592.write(false);
        ImageView imageView = this.RemoteActionCompatParcelizer;
        if (imageView != null) {
            imageView.setLayoutParams(this.MediaBrowserCompatCustomActionResultReceiver);
            int i4 = MediaDescriptionCompat + 5;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
        }
        FrameLayout frameLayout = this.AudioAttributesImplApi26Parcelizer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.AudioAttributesImplBaseParcelizer;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewAudioAttributesCompatParcelizer);
        }
        FrameLayout frameLayout3 = this.AudioAttributesImplBaseParcelizer;
        if (frameLayout3 != null) {
            int i6 = RatingCompat + 103;
            MediaDescriptionCompat = i6 % 128;
            if (i6 % 2 == 0) {
                frameLayout3.addView(this.RemoteActionCompatParcelizer);
                throw null;
            }
            frameLayout3.addView(this.RemoteActionCompatParcelizer);
        }
        this.IconCompatParcelizer = false;
        onFastForward onfastforward = this.write;
        if (onfastforward != null) {
            onfastforward.dismiss();
        }
        ImageView imageView2 = this.RemoteActionCompatParcelizer;
        if (imageView2 != null) {
            imageView2.setImageDrawable(_isNaN.getDrawable(requireContext(), RendererCapabilitiesAdaptiveSupport.read.ct_ic_fullscreen_expand));
        }
    }

    private final void MediaBrowserCompatMediaItem() {
        ViewGroup.LayoutParams layoutParams;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 51;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged59 = this.AudioAttributesCompatParcelizer;
        Object obj = null;
        if (lambdaondevicevolumechanged59 == null) {
            int i5 = i2 + 79;
            RatingCompat = i5 % 128;
            if (i5 % 2 != 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                obj.hashCode();
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lambdaondevicevolumechanged59 = null;
        }
        View viewAudioAttributesCompatParcelizer = lambdaondevicevolumechanged59.AudioAttributesCompatParcelizer();
        ImageView imageView = this.RemoteActionCompatParcelizer;
        if (imageView != null) {
            int i6 = RatingCompat + 95;
            MediaDescriptionCompat = i6 % 128;
            if (i6 % 2 == 0) {
                imageView.getLayoutParams();
                obj.hashCode();
                throw null;
            }
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = layoutParams;
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged592 = this.AudioAttributesCompatParcelizer;
        if (lambdaondevicevolumechanged592 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lambdaondevicevolumechanged592 = null;
        }
        lambdaondevicevolumechanged592.write(true);
        FrameLayout frameLayout = this.AudioAttributesImplBaseParcelizer;
        if (frameLayout != null) {
            int i7 = MediaDescriptionCompat + 59;
            RatingCompat = i7 % 128;
            if (i7 % 2 != 0) {
                frameLayout.removeAllViews();
                throw null;
            }
            frameLayout.removeAllViews();
        }
        if (this.write == null) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            onFastForward onfastforward = new onFastForward(contextRequireContext, R.style.Theme.Black.NoTitleBar.Fullscreen);
            this.write = onfastforward;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout2 = new FrameLayout(requireContext());
            this.AudioAttributesImplApi26Parcelizer = frameLayout2;
            onfastforward.addContentView(frameLayout2, layoutParams2);
            maybeGetTypeVariable activity = getActivity();
            if (activity != null) {
                onfastforward.getIconCompatParcelizer().AudioAttributesCompatParcelizer(activity, this.AudioAttributesImplApi21Parcelizer);
            }
        }
        FrameLayout frameLayout3 = this.AudioAttributesImplApi26Parcelizer;
        if (frameLayout3 != null) {
            frameLayout3.addView(viewAudioAttributesCompatParcelizer);
        }
        this.IconCompatParcelizer = true;
        onFastForward onfastforward2 = this.write;
        if (onfastforward2 != null) {
            onfastforward2.show();
        }
        int i8 = RatingCompat + 33;
        MediaDescriptionCompat = i8 % 128;
        int i9 = i8 % 2;
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged59 = this.AudioAttributesCompatParcelizer;
        Object obj = null;
        if (lambdaondevicevolumechanged59 == null) {
            int i2 = MediaDescriptionCompat + 83;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            lambdaondevicevolumechanged59 = null;
        }
        lambdaondevicevolumechanged59.IconCompatParcelizer();
        int i4 = RatingCompat + 9;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onAddQueueItem() {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged59 = this.AudioAttributesCompatParcelizer;
            if (lambdaondevicevolumechanged59 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                lambdaondevicevolumechanged59 = null;
            }
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            if (AudioAttributesImplApi26Parcelizer().getOnPrepareFromUri() && MediaBrowserCompatItemReceiver()) {
                int i3 = MediaDescriptionCompat + 53;
                RatingCompat = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            lambdaondevicevolumechanged59.write(contextRequireContext, z);
            MediaBrowserCompatCustomActionResultReceiver();
            lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged592 = this.AudioAttributesCompatParcelizer;
            if (lambdaondevicevolumechanged592 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                int i5 = RatingCompat + 61;
                MediaDescriptionCompat = i5 % 128;
                int i6 = i5 % 2;
                lambdaondevicevolumechanged592 = null;
            }
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            lambdaondevicevolumechanged592.AudioAttributesCompatParcelizer(contextRequireContext2, AudioAttributesImplApi26Parcelizer().onAddQueueItem().get(0).getRemoteActionCompatParcelizer());
            int i7 = RatingCompat + 85;
            MediaDescriptionCompat = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        FrameLayout frameLayout = this.AudioAttributesImplBaseParcelizer;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        lambdaonDeviceVolumeChanged59 lambdaondevicevolumechanged59 = this.AudioAttributesCompatParcelizer;
        Object obj = null;
        if (lambdaondevicevolumechanged59 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lambdaondevicevolumechanged59 = null;
        }
        View viewAudioAttributesCompatParcelizer = lambdaondevicevolumechanged59.AudioAttributesCompatParcelizer();
        FrameLayout frameLayout2 = this.AudioAttributesImplBaseParcelizer;
        if (frameLayout2 != null) {
            int i2 = MediaDescriptionCompat + 35;
            RatingCompat = i2 % 128;
            if (i2 % 2 != 0) {
                frameLayout2.getChildCount();
                obj.hashCode();
                throw null;
            }
            if (frameLayout2.getChildCount() == 0) {
                FrameLayout frameLayout3 = this.AudioAttributesImplBaseParcelizer;
                if (frameLayout3 != null) {
                    int i3 = RatingCompat + 105;
                    MediaDescriptionCompat = i3 % 128;
                    int i4 = i3 % 2;
                    frameLayout3.addView(viewAudioAttributesCompatParcelizer);
                }
                FrameLayout frameLayout4 = this.AudioAttributesImplBaseParcelizer;
                if (frameLayout4 != null) {
                    int i5 = MediaDescriptionCompat + 65;
                    RatingCompat = i5 % 128;
                    int i6 = i5 % 2;
                    frameLayout4.addView(this.RemoteActionCompatParcelizer);
                    int i7 = RatingCompat + 121;
                    MediaDescriptionCompat = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                }
                return;
            }
        }
        RendererWakeupListener.MediaBrowserCompatItemReceiver();
        int i9 = MediaDescriptionCompat + 47;
        RatingCompat = i9 % 128;
        int i10 = i9 % 2;
    }

    private static void read(View view, String str) {
        String str2;
        int i = 2 % 2;
        int i2 = RatingCompat + 73;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            str2 = str;
            int i3 = 61 / 0;
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) str2)) {
                return;
            }
        } else {
            str2 = str;
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) str2)) {
                return;
            }
        }
        int i4 = RatingCompat + 105;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        view.setContentDescription(str2);
        int i6 = RatingCompat + 99;
        MediaDescriptionCompat = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 2;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49) {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi26Parcelizer(simpleBasePlayerExternalSyntheticLambda49);
        int i4 = RatingCompat + 71;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda49 simpleBasePlayerExternalSyntheticLambda49) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 71;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi21Parcelizer(simpleBasePlayerExternalSyntheticLambda49);
        int i4 = MediaDescriptionCompat + 105;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void MediaDescriptionCompat() {
        int iAudioAttributesCompatParcelizer = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(-456124821, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), 456124825, new Object[]{this}, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer3);
    }

    private final void RemoteActionCompatParcelizer(FrameLayout p0, CloseImageView p1) {
        int iAudioAttributesCompatParcelizer = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(604197005, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), -604197004, new Object[]{this, p0, p1}, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int iAudioAttributesCompatParcelizer = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(-863587628, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), 863587628, new Object[]{this}, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int iAudioAttributesCompatParcelizer = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(-104573312, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), 104573315, new Object[]{this}, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int iAudioAttributesCompatParcelizer = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(1534031225, GoogleMapOnCameraMoveStartedListener.AudioAttributesCompatParcelizer(), -1534031223, new Object[]{this}, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer3);
    }
}
