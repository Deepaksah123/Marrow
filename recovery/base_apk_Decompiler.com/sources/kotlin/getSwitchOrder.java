package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.di.app.data.NetworkModule;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Options;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\fB#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0014\u0010\f\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010+R\u0014\u0010!\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-"}, d2 = {"Lo/getSwitchOrder;", "Lo/shouldEvaluateQueueSize;", "Lo/attemptMerge;", "Landroid/content/Context;", "p0", "", "p1", "p2", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Lo/getSwitchOrder$IconCompatParcelizer;", "", "read", "(Lo/getSwitchOrder$IconCompatParcelizer;)V", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/attemptMerge;", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "write", "(Ljava/lang/String;)V", "IconCompatParcelizer", "()V", "onCustomAction", "Lcom/marrow/data/api/models/response/plan/Coupon;", "RemoteActionCompatParcelizer", "(Lcom/marrow/data/api/models/response/plan/Coupon;)V", "RatingCompat", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "MediaDescriptionCompat", "MediaBrowserCompatItemReceiver", "onStop", "dismiss", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "Lo/getSwitchOrder$IconCompatParcelizer;", "", "Z", "AudioAttributesCompatParcelizer", "Lo/getSno;", "Lo/getSno;", "Landroid/text/TextWatcher;", "Landroid/text/TextWatcher;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSwitchOrder extends shouldEvaluateQueueSize<attemptMerge> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesImplApi26Parcelizer;
    private static int MediaDescriptionCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getSno read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final TextWatcher MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private IconCompatParcelizer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    private static final byte[] $$g = {18, -127, -77, -105, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$h = 84;
    private static final byte[] $$a = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 209;
    private static int MediaMetadataCompat = 1;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    public interface IconCompatParcelizer {
        void read(Coupon coupon, boolean z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 12
            int r7 = r7 + 65
            byte[] r0 = kotlin.getSwitchOrder.$$a
            int r8 = r8 * 10
            int r1 = 44 - r8
            int r6 = 80 - r6
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = -1
            if (r0 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L28:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + r2
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSwitchOrder.a(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 22
            byte[] r1 = kotlin.getSwitchOrder.$$g
            int r8 = r8 + 65
            int r6 = r6 * 3
            int r6 = 54 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 21
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            int r6 = r6 + 2
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSwitchOrder.c(int, byte, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i2 | i5)) | (~(i6 | i5));
        int i10 = ~i6;
        int i11 = (~(i10 | i5)) | i2;
        int i12 = (~(i5 | i2 | i6)) | (~(i8 | i10));
        int i13 = i2 + i6 + i4 + ((-373584967) * i3) + ((-1711780345) * i);
        int i14 = i13 * i13;
        int i15 = (i2 * 1075882953) + 1902575616 + (1075882953 * i6) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i4) + ((-375259136) * i3) + ((-1109524480) * i) + (585564160 * i14);
        int i16 = ((i2 * 235012993) - 778813113) + (i6 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i4 * 235013625) + (i3 * 915899377) + (i * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? AudioAttributesCompatParcelizer(objArr) : AudioAttributesImplBaseParcelizer(objArr) : read(objArr) : IconCompatParcelizer(objArr) : write(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    private getSwitchOrder(Context context, String str, String str2) {
        super(context, R.style.AppTheme_Light_Dialog);
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.read = new getSno();
        this.MediaBrowserCompatItemReceiver = new AudioAttributesCompatParcelizer();
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(getSwitchOrder getswitchorder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 123;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1853719018, new Object[]{getswitchorder}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1853719016);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 75;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        getSwitchOrder getswitchorder = (getSwitchOrder) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 11;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        getswitchorder.AudioAttributesCompatParcelizer = zBooleanValue;
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
        int i6 = i2 + 85;
        MediaBrowserCompatItemReceiver = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 25;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        attemptMerge attemptmergeHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        int i4 = MediaBrowserCompatItemReceiver + 95;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return attemptmergeHandleMediaPlayPauseIfPendingOnHandler;
    }

    public static final class AudioAttributesCompatParcelizer implements TextWatcher {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            toMagicModuleMetaRepoModel.write(charSequence, "");
            getSwitchOrder.AudioAttributesCompatParcelizer(getSwitchOrder.this);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            toMagicModuleMetaRepoModel.write(editable, "");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            toMagicModuleMetaRepoModel.write(charSequence, "");
        }
    }

    public final void read(IconCompatParcelizer p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 95;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = p0;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    private attemptMerge handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 119;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        attemptMerge attemptmergeIconCompatParcelizer = attemptMerge.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(attemptmergeIconCompatParcelizer, "");
        int i4 = MediaBrowserCompatItemReceiver + 87;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return attemptmergeIconCompatParcelizer;
    }

    private static void b(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), View.resolveSize(0, 0) + 23704, 31 - TextUtils.lastIndexOf("", '0', 0), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44862), 18943 - ExpandableListView.getPackedPositionChild(0L), 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i8 = $10 + 55;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i10 = $11 + 79;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                    int i12 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                    cArr4[i11] = cArr2[0];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44863 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 18944 - Color.blue(0), 27 - TextUtils.lastIndexOf("", '0', 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44861), 18945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 28 - (Process.myTid() >> 22), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX INFO: renamed from: o.getSwitchOrder$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/getSwitchOrder$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "", "p3", "Lo/getSwitchOrder;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lo/getSwitchOrder;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getSwitchOrder AudioAttributesCompatParcelizer(Context p0, String p1, String p2, boolean p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            getSwitchOrder getswitchorder = new getSwitchOrder(p0, p1, p2, null);
            Object[] objArr = {getswitchorder, Boolean.valueOf(p3)};
            int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            getSwitchOrder.write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), -240517041, objArr, Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, 240517046);
            return getswitchorder;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static final getShowPopup RemoteActionCompatParcelizer(getSwitchOrder getswitchorder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 23;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            dispatchTouchEvent.read(getswitchorder.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer);
            getswitchorder.dismiss();
            return getShowPopup.INSTANCE;
        }
        dispatchTouchEvent.read(getswitchorder.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer);
        getswitchorder.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup AudioAttributesImplApi21Parcelizer(getSwitchOrder getswitchorder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 19;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        String string = getswitchorder.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.getText().toString();
        if (string.length() == 0) {
            getswitchorder.read("Coupon is invalid");
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 13;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            return getshowpopup;
        }
        getswitchorder.write(string);
        return getShowPopup.INSTANCE;
    }

    private static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(getSwitchOrder getswitchorder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 17;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        attemptMerge attemptmergeAudioAttributesImplBaseParcelizer = getswitchorder.AudioAttributesImplBaseParcelizer();
        if (i3 == 0) {
            attemptmergeAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.setText("");
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            throw null;
        }
        attemptmergeAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer.setText("");
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatItemReceiver + 17;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup2;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        String str;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char c = (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
            int i2 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
            int i3 = 27 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[2], bArr[53], bArr[5], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(c, i2, i3, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i4 = MediaBrowserCompatItemReceiver + 67;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 13183);
                int iGreen = 1649 - Color.green(0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
                Object[] objArr3 = new Object[1];
                a((byte) (-$$a[39]), r3[5], r3[53], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cKeyCodeFromString, iGreen, iIndexOf, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            int i6 = MediaBrowserCompatItemReceiver + 125;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 2;
            }
        } else {
            Object[] objArr4 = new Object[1];
            b((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, false, new char[]{65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b'}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, View.MeasureSpec.getMode(0) + 145, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, new char[]{14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3}, Color.rgb(0, 0, 0) + 16777232, TextUtils.getTrimmedLength("") + 149, objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, -59271698};
                byte[] bArr2 = $$g;
                byte b = bArr2[12];
                byte b2 = bArr2[49];
                Object[] objArr7 = new Object[1];
                c(b, b2, (byte) (b2 | 46), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((byte) (bArr2[18] - 1), bArr2[27], bArr2[49], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13183);
                    int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 26;
                    Object[] objArr9 = new Object[1];
                    a((byte) (-$$a[39]), r9[5], r9[53], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(c2, keyRepeatTimeout, trimmedLength, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(22 - Color.red(0), false, new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b'}, 22 - (ViewConfiguration.getEdgeSlop() >> 16), Gravity.getAbsoluteGravity(0, 0) + 146, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(KeyEvent.keyCodeFromString("") + 4, true, new char[]{'\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f'}, (Process.myTid() >> 22) + 15, TextUtils.getTrimmedLength("") + 150, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char jumpTapTimeout = (char) (13183 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int i8 = 1650 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iCombineMeasuredStates = 26 - View.combineMeasuredStates(0, 0);
                        byte b3 = $$a[5];
                        Object[] objArr12 = new Object[1];
                        a(b3, b3, r9[53], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(jumpTapTimeout, i8, iCombineMeasuredStates, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char minimumFlingVelocity = (char) (13183 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1649;
                        int i9 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr3 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr3[2], bArr3[53], bArr3[5], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(minimumFlingVelocity, packedPositionType, i9, -133433128, false, (String) objArr13[0], null);
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
        int i10 = ((int[]) objArr[3])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - KeyEvent.normalizeMetaState(0)), Color.rgb(0, 0, 0) + 16783270, 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {386878681, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 6030, 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    Object[] objArr15 = new Object[1];
                    c(r2[49], (byte) (-$$g[16]), r2[12], objArr15);
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
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.addTextChangedListener(this.MediaBrowserCompatItemReceiver);
        TextView textView = AudioAttributesImplBaseParcelizer().write;
        if (this.AudioAttributesCompatParcelizer) {
            int i12 = MediaBrowserCompatItemReceiver + 47;
            MediaBrowserCompatCustomActionResultReceiver = i12 % 128;
            int i13 = i12 % 2;
            str = "Add new referral code here.";
        } else {
            str = "Edit or add new promo code here.";
        }
        textView.setText(str);
        updateNavigation updatenavigation = updateNavigation.INSTANCE;
        updateNavigation.read(AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer);
        String str2 = this.IconCompatParcelizer;
        if (str2 != null && str2.length() != 0) {
            AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setText(this.IconCompatParcelizer);
            AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setSelection(this.IconCompatParcelizer.length());
        }
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        RemoteActionCompatParcelizer(customTextView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.AdaptiveTrackSelectionFactory
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                Object[] objArr16 = {this.write};
                int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
                int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
                return (getShowPopup) getSwitchOrder.write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1512189557, objArr16, Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1512189553);
            }
        });
        CustomButton customButton = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        RemoteActionCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.AdaptiveTrackSelectionAdaptationCheckpoint
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                Object[] objArr16 = {this.write};
                int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
                int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
                return (getShowPopup) getSwitchOrder.write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1402333174, objArr16, Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1402333171);
            }
        });
        ImageView imageView = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        RemoteActionCompatParcelizer(imageView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getMinDurationToRetainAfterDiscardUs
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getSwitchOrder.read(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    private static final void read(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 75;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        getanswermap.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 123;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(getSwitchOrder getswitchorder, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            Success success = (Success) marrowResponse;
            if (((Coupon) success.getData()).isValidForPlan(getswitchorder.write)) {
                Object[] objArr = {getswitchorder, (Coupon) success.getData()};
                int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
                write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), -1771675029, objArr, Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, 1771675030);
            } else {
                getswitchorder.read((String) shouldEvaluateQueueSize.IconCompatParcelizer(new Object[]{getswitchorder, Integer.valueOf(R.string.error_coupon_invalid_for_plan)}, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write(), -1090992228, 1090992228, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write()));
            }
        } else if (marrowResponse instanceof Failed) {
            getswitchorder.MediaBrowserCompatItemReceiver();
            int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1853719018, new Object[]{getswitchorder}, Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, -1853719016);
            getswitchorder.read(((Failed) marrowResponse).getError().getErrorMessage());
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            int i2 = MediaBrowserCompatItemReceiver + 109;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                getswitchorder.isShowing();
                obj.hashCode();
                throw null;
            }
            if (!getswitchorder.isShowing()) {
                return getShowPopup.INSTANCE;
            }
            getswitchorder.MediaBrowserCompatItemReceiver();
            int iAudioAttributesCompatParcelizer4 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer5 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1853719018, new Object[]{getswitchorder}, Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer5, iAudioAttributesCompatParcelizer4, -1853719016);
            if (parseDescriptor.read(((MarrowError) marrowResponse).getThrowable())) {
                int i3 = MediaBrowserCompatItemReceiver + 103;
                MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                if (i3 % 2 != 0) {
                    getswitchorder.onCustomAction();
                    return getShowPopup.INSTANCE;
                }
                getswitchorder.onCustomAction();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                obj.hashCode();
                throw null;
            }
            getswitchorder.RatingCompat();
        }
        return getShowPopup.INSTANCE;
    }

    private final void write(String p0) {
        accessgetEmptyStatecp<MarrowResponse<Coupon>> accessgetemptystatecpRemoteActionCompatParcelizer;
        int i = 2 % 2;
        MediaDescriptionCompat();
        int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1464678605, new Object[]{this}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1464678605);
        NetworkModule.Companion companion = NetworkModule.INSTANCE;
        Context context = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        maybeNotifyDownstreamFormatChanged maybenotifydownstreamformatchanged = new maybeNotifyDownstreamFormatChanged((setTrackId) companion.AudioAttributesCompatParcelizer(context).read(setTrackId.class), TrainingApplication.IconCompatParcelizer(getContext()).MediaDescriptionCompat());
        if (!this.AudioAttributesCompatParcelizer) {
            accessgetemptystatecpRemoteActionCompatParcelizer = maybenotifydownstreamformatchanged.RemoteActionCompatParcelizer(p0);
        } else {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 107;
            MediaBrowserCompatItemReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                accessgetemptystatecpRemoteActionCompatParcelizer = maybenotifydownstreamformatchanged.IconCompatParcelizer(p0, this.write);
                int i3 = 77 / 0;
            } else {
                accessgetemptystatecpRemoteActionCompatParcelizer = maybenotifydownstreamformatchanged.IconCompatParcelizer(p0, this.write);
            }
        }
        accessgetEmptyStatecp<MarrowResponse<Coupon>> accessgetemptystatecpAudioAttributesCompatParcelizer = accessgetemptystatecpRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(PlanBUpgradeData.RemoteActionCompatParcelizer()).AudioAttributesCompatParcelizer(getDeeplink.read());
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.getSortedTrackBitrates
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getSwitchOrder.read(this.read, (MarrowResponse) obj);
            }
        };
        this.read.read(accessgetemptystatecpAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new getTimelineId() { // from class: o.minDurationForQualityIncreaseUs
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                getSwitchOrder.RemoteActionCompatParcelizer(getanswermap, obj);
            }
        }));
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 3;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getSwitchOrder getswitchorder = (getSwitchOrder) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (getswitchorder.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.getText().toString().length() == 0) {
            int i2 = MediaBrowserCompatItemReceiver + 115;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                getswitchorder.MediaBrowserCompatSearchResultReceiver();
                return null;
            }
            getswitchorder.MediaBrowserCompatSearchResultReceiver();
            int i3 = 63 / 0;
            return null;
        }
        getswitchorder.MediaBrowserCompatMediaItem();
        int i4 = MediaBrowserCompatItemReceiver + 49;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onCustomAction() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 5;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        read(getContext().getResources().getString(R.string.app_error_no_internet));
        int i4 = MediaBrowserCompatItemReceiver + 95;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getSwitchOrder getswitchorder = (getSwitchOrder) objArr[0];
        Coupon coupon = (Coupon) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 25;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        getswitchorder.MediaBrowserCompatItemReceiver();
        if (!coupon.isValid()) {
            getswitchorder.RatingCompat();
            return null;
        }
        IconCompatParcelizer iconCompatParcelizer = getswitchorder.RemoteActionCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(coupon, getswitchorder.AudioAttributesCompatParcelizer);
            int i4 = MediaBrowserCompatItemReceiver + 29;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        getswitchorder.dismiss();
        return null;
    }

    private final void RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 123;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        read("Coupon is invalid");
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 35;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void read(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 41;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setError(p0);
            int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1464678605, new Object[]{this}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1464678605);
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 121;
            MediaBrowserCompatItemReceiver = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setError(p0);
        int iAudioAttributesCompatParcelizer4 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer5 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer6 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1464678605, new Object[]{this}, iAudioAttributesCompatParcelizer6, iAudioAttributesCompatParcelizer5, iAudioAttributesCompatParcelizer4, -1464678605);
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        getSwitchOrder getswitchorder = (getSwitchOrder) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 105;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageView = getswitchorder.AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
        if (i3 == 0) {
            return null;
        }
        int i4 = 93 / 0;
        return null;
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 125;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1464678605, new Object[]{this}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1464678605);
            MediaBrowserCompatItemReceiver();
            return;
        }
        int iAudioAttributesCompatParcelizer4 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer5 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer6 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1464678605, new Object[]{this}, iAudioAttributesCompatParcelizer6, iAudioAttributesCompatParcelizer5, iAudioAttributesCompatParcelizer4, -1464678605);
        MediaBrowserCompatItemReceiver();
        throw null;
    }

    private final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 85;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            MediaMetadataCompat();
            MediaBrowserCompatItemReceiver();
        } else {
            MediaMetadataCompat();
            MediaBrowserCompatItemReceiver();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 83;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        attemptMerge attemptmergeAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (i3 != 0) {
            ImageView imageView = attemptmergeAudioAttributesImplBaseParcelizer.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            PlayerControlViewExternalSyntheticLambda1.write(imageView);
        } else {
            ImageView imageView2 = attemptmergeAudioAttributesImplBaseParcelizer.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            PlayerControlViewExternalSyntheticLambda1.write(imageView2);
            int i4 = 81 / 0;
        }
    }

    private final void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 17;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        PlayerControlViewExternalSyntheticLambda1.write(progressBar);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 47;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 51;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = AudioAttributesImplBaseParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(progressBar);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onStop() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 113;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = null;
        super.onStop();
        int i4 = MediaBrowserCompatItemReceiver + 95;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 115;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            this.read.read();
            this.RemoteActionCompatParcelizer = null;
            super.dismiss();
        } else {
            this.read.read();
            this.RemoteActionCompatParcelizer = null;
            super.dismiss();
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup read(getSwitchOrder getswitchorder) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(getswitchorder);
        int i4 = MediaBrowserCompatItemReceiver + 97;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopupMediaBrowserCompatCustomActionResultReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 53;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        read(getanswermap, obj);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 11;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ getShowPopup write(getSwitchOrder getswitchorder) {
        int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        return (getShowPopup) write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1512189557, new Object[]{getswitchorder}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1512189553);
    }

    public static /* synthetic */ getShowPopup read(getSwitchOrder getswitchorder, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 51;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getswitchorder, marrowResponse);
        int i4 = MediaBrowserCompatItemReceiver + 5;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(getSwitchOrder getswitchorder) {
        int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        return (getShowPopup) write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1402333174, new Object[]{getswitchorder}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1402333171);
    }

    static {
        MediaDescriptionCompat = 0;
        RemoteActionCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaMetadataCompat + 91;
        MediaDescriptionCompat = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ getSwitchOrder(Context context, String str, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, str, str2);
    }

    public static final /* synthetic */ void read(getSwitchOrder getswitchorder, boolean z) {
        Object[] objArr = {getswitchorder, Boolean.valueOf(z)};
        int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), -240517041, objArr, Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, 240517046);
    }

    private final void IconCompatParcelizer() {
        int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1853719018, new Object[]{this}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1853719016);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), 1464678605, new Object[]{this}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, -1464678605);
    }

    private final void RemoteActionCompatParcelizer(Coupon p0) {
        int iAudioAttributesCompatParcelizer = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer3 = Options.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        write(Options.IconCompatParcelizer.AudioAttributesCompatParcelizer(), -1771675029, new Object[]{this, p0}, iAudioAttributesCompatParcelizer3, iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, 1771675030);
    }

    static void RemoteActionCompatParcelizer() {
        AudioAttributesImplApi26Parcelizer = 1000326164;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getSwitchOrder getswitchorder = (getSwitchOrder) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 103;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(getswitchorder);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 61;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupAudioAttributesImplApi21Parcelizer;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        getSwitchOrder getswitchorder = (getSwitchOrder) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 63;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getswitchorder);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 57;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return getshowpopupRemoteActionCompatParcelizer;
    }
}
