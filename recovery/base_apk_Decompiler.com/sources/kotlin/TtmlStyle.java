package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0004@\u0004X\u0084\f¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020 8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020&0%8\u0005@\u0005X\u0085.¢\u0006\u0012\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)\"\u0004\b#\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010&8\u0004@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b\u001b\u0010+R\"\u0010\u0019\u001a\u00020,8\u0005@\u0005X\u0085.¢\u0006\u0012\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/\"\u0004\b\u001b\u00100R\u0016\u0010\u0005\u001a\u00020,8\u0004@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010\b\u001a\u0002018\u0004@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0016\u0010\u001a\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u00102"}, d2 = {"Lo/TtmlStyle;", "Lo/argCount;", "<init>", "()V", "Lo/getEventTimesUs;", "AudioAttributesImplBaseParcelizer", "()Lo/getEventTimesUs;", "Lo/TtmlRenderUtil;", "MediaBrowserCompatItemReceiver", "()Lo/TtmlRenderUtil;", "", "AudioAttributesCompatParcelizer", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplApi21Parcelizer", "write", "onDestroyView", "", "getTheme", "()I", "Lo/maybeExcludeTrack;", "IconCompatParcelizer", "Lo/maybeExcludeTrack;", "RemoteActionCompatParcelizer", "()Lo/maybeExcludeTrack;", "", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/util/List;", "(Ljava/util/List;)V", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TtmlStyle extends argCount {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AudioAttributesImplApi21Parcelizer;
    private static char[] AudioAttributesImplBaseParcelizer;
    private static int MediaDescriptionCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    protected boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    protected String AudioAttributesImplBaseParcelizer = "";

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    protected maybeExcludeTrack RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private List<? extends OptionItem> AudioAttributesCompatParcelizer;
    protected OptionItem write;
    private static final byte[] $$d = {3, 113, -44, TarConstants.LF_BLK, TarConstants.LF_CONTIG, -41, -34, -9, -15, -2, 20, -54, 1, -11, -8, 3, -29, -5, -11, -20, 19, -29, -19, 0, -11, -23, 3, -23, 37, -54, 1, -11, -8, 12, -30, -33, 24, -21, -21, -19, 6, -24, 3, -6, -13, -29, -18, -12, -15, 5, 26, -44, -27, 1, -16, -9, 33, -54, -8, -13, 5, -29, 26, -27, -27, 5, -12, -17, -7, -27, 11, -23};
    private static final int $$e = 1;
    private static final byte[] $$a = {64, -102, 72, -66, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 221;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int RatingCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 10
            int r0 = 44 - r7
            int r6 = r6 * 12
            int r6 = r6 + 65
            int r8 = r8 + 4
            byte[] r1 = kotlin.TtmlStyle.$$a
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = r8 + r6
            int r6 = r3 + 1
            int r8 = r8 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TtmlStyle.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 45 - r6
            byte[] r0 = kotlin.TtmlStyle.$$d
            int r5 = 114 - r5
            int r1 = 39 - r7
            byte[] r1 = new byte[r1]
            int r7 = 38 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r5 = r7
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-10)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TtmlStyle.c(int, short, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~(i6 | i7);
        int i11 = i | i10 | (~(i8 | i2));
        int i12 = i + i2 + i5 + ((-393945980) * i3) + (1728320405 * i4);
        int i13 = i12 * i12;
        int i14 = ((-1552544754) * i) + 1566572544 + ((-1100352524) * i2) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i5) + (2076180480 * i3) + ((-877658112) * i4) + (214302720 * i13);
        int i15 = ((i * (-252835662)) - 192251156) + (i2 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * UnixStat.DEFAULT_DIR_PERM) + (i5 * (-252835169)) + (i3 * 1574575612) + (i4 * 147979147) + (i13 * (-1426456576));
        int i16 = i14 + (i15 * i15 * 2075787264);
        return i16 != 1 ? i16 != 2 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : read(objArr);
    }

    protected final maybeExcludeTrack RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        maybeExcludeTrack maybeexcludetrack = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(maybeexcludetrack);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return maybeexcludetrack;
    }

    private List<OptionItem> MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 23;
        int i3 = i2 % 128;
        RatingCompat = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List list = this.AudioAttributesCompatParcelizer;
        if (list != null) {
            int i4 = i3 + 13;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i6 = MediaBrowserCompatSearchResultReceiver + 105;
        RatingCompat = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private void RemoteActionCompatParcelizer(List<? extends OptionItem> list) {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = list;
        int i4 = MediaBrowserCompatSearchResultReceiver + 43;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        TtmlStyle ttmlStyle = (TtmlStyle) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 51;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        String str = ttmlStyle.read;
        if (str == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i5 = i3 + 99;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private void write(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 71;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
        int i4 = MediaBrowserCompatSearchResultReceiver + 113;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final getEventTimesUs AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 59;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Fragment parentFragment = getParentFragment();
        if (i3 == 0) {
            int i4 = 84 / 0;
            if (!(parentFragment instanceof getEventTimesUs)) {
                return null;
            }
        } else if (!(parentFragment instanceof getEventTimesUs)) {
            return null;
        }
        getEventTimesUs geteventtimesus = (getEventTimesUs) parentFragment;
        int i5 = RatingCompat + 17;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return geteventtimesus;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        TtmlStyle ttmlStyle = (TtmlStyle) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 85;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Fragment parentFragment = ttmlStyle.getParentFragment();
        if (i3 != 0) {
            boolean z = parentFragment instanceof TtmlRenderUtil;
            throw null;
        }
        if (parentFragment instanceof TtmlRenderUtil) {
            return (TtmlRenderUtil) parentFragment;
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 123;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        getEventTimesUs geteventtimesusAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (geteventtimesusAudioAttributesImplBaseParcelizer != null) {
            geteventtimesusAudioAttributesImplBaseParcelizer.dismissAllowingStateLoss();
            return;
        }
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        TtmlRenderUtil ttmlRenderUtil = (TtmlRenderUtil) read(new Object[]{this}, -768501175, 768501175, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
        if (ttmlRenderUtil == null) {
            dismiss();
            int i2 = MediaBrowserCompatSearchResultReceiver + 55;
            RatingCompat = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = MediaBrowserCompatSearchResultReceiver + 67;
        RatingCompat = i3 % 128;
        if (i3 % 2 != 0) {
            ttmlRenderUtil.write();
        } else {
            ttmlRenderUtil.write();
            throw null;
        }
    }

    /* JADX INFO: renamed from: o.TtmlStyle$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/optionpicker/BaseOptionPickerFragment$Companion;", "", "<init>", "()V", "ARG_TITLE", "", "ARG_OPTIONS", "ARG_SELECTED_ITEM", "ARG_RESULT_KEY", "ARG_SHOULD_DISMISS_ON_OPTION_SELECTION", "ARG_SHOW_BACK_BUTTON", "KEY_SELECTED_ITEM_RESULT", "KEY_INITIALLY_SELECTED_ITEM", "KEY_BACK_PRESS_ACTION", "createArgs", "Landroid/os/Bundle;", "title", "options", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "Lkotlin/collections/ArrayList;", "preselected", "resultKey", "shouldDismissOnOption", "", "shouldShowBackButton", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Bundle write(String str, ArrayList<OptionItem> arrayList, OptionItem optionItem, String str2, boolean z, boolean z2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            return _getIndexResolver.write(setAction.write("title", str), setAction.write("options", arrayList), setAction.write("selected_item", optionItem), setAction.write("result_key", str2), setAction.write("should_dismiss_on_option_selection", Boolean.valueOf(z)), setAction.write("show_back", Boolean.valueOf(z2)));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        ArrayList arrayList;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
            int gidForName = Process.getGidForName("") + 1650;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
            byte[] bArr = $$a;
            byte b = bArr[53];
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(offsetBefore, gidForName, iIndexOf, -133433128, false, (String) objArr2[0], null);
        }
        Object obj = null;
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = RatingCompat + 105;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char c2 = (char) (13184 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1650;
                    int iMyTid = 26 - (Process.myTid() >> 22);
                    Object[] objArr3 = new Object[1];
                    a(r2[5], r2[53], (byte) (-$$a[27]), objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(c2, i3, iMyTid, -1033747278, false, (String) objArr3[0], null);
                }
                obj.hashCode();
                throw null;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13184);
                int pressedStateDuration = 1649 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int iBlue = Color.blue(0) + 26;
                Object[] objArr4 = new Object[1];
                a(r14[5], r14[53], (byte) (-$$a[27]), objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(cLastIndexOf, pressedStateDuration, iBlue, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b(Color.blue(0) + 16, new char[]{'\f', 2, 7, 21, 7, 0, 24, 17, 0, '\n', 11, 17, '\b', 3, '\t', 4}, (byte) (54 - TextUtils.getOffsetBefore("", 0)), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(16 - TextUtils.indexOf("", ""), new char[]{'\r', 18, '\t', 24, 3, '\r', 21, 18, 2, 21, '\b', 23, 24, 11, 14, 3}, (byte) (53 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i4 = MediaBrowserCompatSearchResultReceiver + 31;
            RatingCompat = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 4;
            }
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -222024106};
                byte[] bArr2 = $$d;
                Object[] objArr8 = new Object[1];
                c(bArr2[0], (byte) (-bArr2[5]), bArr2[23], objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b3 = bArr2[23];
                byte b4 = bArr2[0];
                Object[] objArr9 = new Object[1];
                c(b3, b4, (byte) (b4 | 32), objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 13183);
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 1649;
                    int i6 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr10 = new Object[1];
                    a(r12[5], r12[53], (byte) (-$$a[27]), objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cResolveSize, offsetBefore2, i6, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(TextUtils.indexOf("", "") + 22, new char[]{24, 17, '\n', 3, '\r', '\t', '\n', '\b', '\r', 4, 7, '\n', 18, 1, 24, 3, 20, 22, 4, '\f', 19, 5}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 124), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, new char[]{0, 3, 21, '\f', 4, 0, '\f', 18, 2, 24, 3, 22, '\t', 23, 13887}, (byte) (64 - KeyEvent.getDeadChar(0, 0)), objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char scrollBarSize = (char) (13183 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int mode = View.MeasureSpec.getMode(0) + 1649;
                        int doubleTapTimeout = 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr3 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr3[5], bArr3[53], (byte) ($$b & 366), objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(scrollBarSize, mode, doubleTapTimeout, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c3 = (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                        byte[] bArr4 = $$a;
                        byte b5 = bArr4[53];
                        byte b6 = bArr4[5];
                        Object[] objArr14 = new Object[1];
                        a(b5, b6, b6, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c3, doubleTapTimeout2, scrollDefaultDelay, -133433128, false, (String) objArr14[0], null);
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
        int i7 = ((int[]) objArr[c])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (Process.getGidForName("") + 4536), 6054 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.rgb(0, 0, 0) + 16777258, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList2 = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = MediaBrowserCompatSearchResultReceiver + 87;
                RatingCompat = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr15 = {-1246980711, Long.valueOf(j3), arrayList2, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "") + 6030, 23 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    Object[] objArr16 = new Object[1];
                    c((byte) ($$d[56] - 1), r2[23], r2[70], objArr16);
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
        Bundle bundleRequireArguments = requireArguments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bundleRequireArguments, "");
        String string = bundleRequireArguments.getString("title");
        if (string == null) {
            string = "";
        }
        this.AudioAttributesImplBaseParcelizer = string;
        ArrayList arrayListRemoteActionCompatParcelizer = StdKeyDeserializerDelegatingKD.RemoteActionCompatParcelizer(bundleRequireArguments, "options", OptionItem.class);
        if (arrayListRemoteActionCompatParcelizer != null) {
            arrayList = arrayListRemoteActionCompatParcelizer;
        } else {
            arrayList = new ArrayList();
            int i11 = RatingCompat + 113;
            MediaBrowserCompatSearchResultReceiver = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 % 2;
            }
        }
        RemoteActionCompatParcelizer(arrayList);
        this.write = (OptionItem) bundleRequireArguments.getParcelable("selected_item");
        String string2 = bundleRequireArguments.getString("result_key");
        write(string2 != null ? string2 : "");
        this.MediaBrowserCompatItemReceiver = bundleRequireArguments.getBoolean("should_dismiss_on_option_selection");
        this.AudioAttributesImplApi21Parcelizer = bundleRequireArguments.getBoolean("show_back");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 85;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = maybeExcludeTrack.write(p0, p1);
        LinearLayout linearLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        LinearLayout linearLayout = linearLayoutIconCompatParcelizer;
        int i4 = RatingCompat + 117;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View p0, Bundle p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 77;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            read();
            AudioAttributesImplApi21Parcelizer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        AudioAttributesImplApi21Parcelizer();
        int i3 = MediaBrowserCompatSearchResultReceiver + 91;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void read() {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 11;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.read.setText(this.AudioAttributesImplBaseParcelizer);
            ImageButton imageButton = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageButton, "");
            ImageButton imageButton2 = imageButton;
            if (this.AudioAttributesImplApi21Parcelizer) {
                int i4 = RatingCompat + 3;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                i = 0;
            } else {
                i = 8;
            }
            imageButton2.setVisibility(i);
            RecyclerView recyclerView = RemoteActionCompatParcelizer().read;
            requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            RemoteActionCompatParcelizer().read.setAdapter(new inherit(MediaBrowserCompatCustomActionResultReceiver(), this.write, new getAnswerMap() { // from class: o.getBackgroundColor
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return TtmlStyle.write(this.IconCompatParcelizer, (OptionItem) obj);
                }
            }));
            return;
        }
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.read.setText(this.AudioAttributesImplBaseParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup read(TtmlStyle ttmlStyle, OptionItem optionItem) {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(optionItem, "");
        ttmlStyle.getParentFragmentManager().read((String) read(new Object[]{ttmlStyle}, 1859607847, -1859607845, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer()), _getIndexResolver.write(setAction.write("key_selected_item_result", optionItem), setAction.write("initially_selected_item", ttmlStyle.write)));
        if (ttmlStyle.MediaBrowserCompatItemReceiver) {
            ttmlStyle.AudioAttributesCompatParcelizer();
            int i4 = MediaBrowserCompatSearchResultReceiver + 45;
            RatingCompat = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 3;
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final void RemoteActionCompatParcelizer(TtmlStyle ttmlStyle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 113;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ttmlStyle.AudioAttributesCompatParcelizer();
        int i4 = MediaBrowserCompatSearchResultReceiver + 49;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
    }

    private static final void write(TtmlStyle ttmlStyle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ttmlStyle.write();
        if (i3 != 0) {
            throw null;
        }
        int i4 = RatingCompat + 13;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.write.setOnClickListener(new View.OnClickListener() { // from class: o.endParagraph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TtmlStyle.read(this.read);
            }
        });
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.findRubyTextNode
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.RemoteActionCompatParcelizer};
                int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
                TtmlStyle.read(objArr, -1703913973, 1703913974, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
            }
        });
        if (this.AudioAttributesImplApi21Parcelizer) {
            RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.read.setOnClickListener(new View.OnClickListener() { // from class: o.getFontColor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TtmlStyle.IconCompatParcelizer(this.read);
                }
            });
        }
        int i2 = RatingCompat + 111;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void MediaBrowserCompatItemReceiver(TtmlStyle ttmlStyle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ttmlStyle.write();
        int i4 = MediaBrowserCompatSearchResultReceiver + 27;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    private final void write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 103;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        getParentFragmentManager().read((String) read(new Object[]{this}, 1859607847, -1859607845, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer()), _getIndexResolver.write(setAction.write("back_pressed", Boolean.TRUE)));
        int i4 = RatingCompat + 51;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 33;
        RatingCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onDestroyView();
            this.RemoteActionCompatParcelizer = null;
            int i3 = RatingCompat + 51;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super.onDestroyView();
        this.RemoteActionCompatParcelizer = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.argCount
    public int getTheme() {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int i4 = CmcdConfigurationRequestConfig.read();
        int i5 = RatingCompat + 103;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static void b(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = AudioAttributesImplBaseParcelizer;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $10 + 79;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 7015, 30 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 7014 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getCapsMode("", 0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 15;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    int i11 = $11 + 105;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20125, 20 - View.MeasureSpec.getMode(0), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19368, (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            int i14 = $10 + 43;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i16 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i17 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i16];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i17];
                        } else {
                            int i18 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i19 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i18];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i19];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                int i20 = $11 + 5;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 5 % 3;
                }
                obj2 = obj;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ void read(TtmlStyle ttmlStyle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 91;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(ttmlStyle);
        int i4 = MediaBrowserCompatSearchResultReceiver + 75;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IconCompatParcelizer(TtmlStyle ttmlStyle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatItemReceiver(ttmlStyle);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(TtmlStyle ttmlStyle) {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        read(new Object[]{ttmlStyle}, -1703913973, 1703913974, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    public static /* synthetic */ getShowPopup write(TtmlStyle ttmlStyle, OptionItem optionItem) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 39;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopup = read(ttmlStyle, optionItem);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = MediaBrowserCompatSearchResultReceiver + 109;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    static {
        MediaDescriptionCompat = 1;
        IconCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatMediaItem + 1;
        MediaDescriptionCompat = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TtmlRenderUtil MediaBrowserCompatItemReceiver() {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        return (TtmlRenderUtil) read(new Object[]{this}, -768501175, 768501175, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    private String AudioAttributesImplApi26Parcelizer() {
        int iAudioAttributesCompatParcelizer = zze.AudioAttributesCompatParcelizer();
        return (String) read(new Object[]{this}, 1859607847, -1859607845, zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), zze.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer);
    }

    static void IconCompatParcelizer() {
        AudioAttributesImplBaseParcelizer = new char[]{6490, 6496, 6468, 6491, 6477, 6406, 6494, 6466, 6465, 6467, 6489, 6488, 6523, 6476, 6471, 6475, 6481, 6522, 6464, 6470, 6479, 6507, 6473, 6492, 6469};
        AudioAttributesImplApi21Parcelizer = (char) 11447;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        TtmlStyle ttmlStyle = (TtmlStyle) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 99;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        write(ttmlStyle);
        int i4 = MediaBrowserCompatSearchResultReceiver + 49;
        RatingCompat = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
