package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Rating$$ExternalSyntheticLambda0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.marrow.ui.activities.learn.video.overlay.NavKey;
import com.marrow.ui.activities.learn.video.overlay.SettingsItem;
import com.marrow.ui.activities.learn.video.overlay.SettingsResult;
import com.marrow.ui.activities.learn.video.overlay.ToggleKey;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b'\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010#\u001a\u0004\u0018\u00010$H\u0002J\n\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J$\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001a\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020-2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00104\u001a\u00020(H\u0016J\b\u00105\u001a\u000206H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\rX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00068"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/settings/BaseSettingsFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "_binding", "Lcom/marrow/databinding/FragmentOptionSheetBinding;", "get_binding", "()Lcom/marrow/databinding/FragmentOptionSheetBinding;", "set_binding", "(Lcom/marrow/databinding/FragmentOptionSheetBinding;)V", "binding", "getBinding", "resultKey", "", "getResultKey", "()Ljava/lang/String;", "setResultKey", "(Ljava/lang/String;)V", "titleText", "getTitleText", "setTitleText", "rows", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "Lkotlin/collections/ArrayList;", "getRows", "()Ljava/util/ArrayList;", "setRows", "(Ljava/util/ArrayList;)V", "adapter", "Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsOptionAdapter;", "getAdapter", "()Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsOptionAdapter;", "setAdapter", "(Lcom/marrow/ui/activities/learn/video/overlay/settings/SettingsOptionAdapter;)V", "overlayBottomHost", "Lcom/marrow/ui/activities/learn/video/overlay/OverlayHostBottomSheet;", "overlayDialogHost", "Lcom/marrow/ui/activities/learn/video/overlay/OverlayHostDialog;", "closeOverlay", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "view", "onDestroyView", "getTheme", "", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getFontSize extends argCount {
    private static char AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static long MediaBrowserCompatItemReceiver;
    private static int MediaBrowserCompatSearchResultReceiver;
    public static final IconCompatParcelizer read;
    private isUnderline AudioAttributesCompatParcelizer;
    private maybeExcludeTrack IconCompatParcelizer;
    private String write;
    private static final byte[] $$c = {112, -40, -93, -59};
    private static final int $$f = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {31, 80, -124, -66, -74, 14, -7, -4, -2, 25, -12, -21, -14, -7, -7, -26, 8, 10, -13, -8, -12, -22, -74, 74, -14, -18, 2, -24, 17, 3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4, 10, -1, -7, -4, -24, -45, 25, 8, -20, -3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4};
    private static final int $$e = 163;
    private static final byte[] $$a = {10, -96, 35, -27, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 51;
    private static int RatingCompat = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;
    private String AudioAttributesImplApi21Parcelizer = "";
    private ArrayList<SettingsItem> RemoteActionCompatParcelizer = new ArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r5, short r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = kotlin.getFontSize.$$c
            int r6 = r6 * 2
            int r6 = r6 + 103
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFontSize.$$g(int, short, byte):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i4 + i6 + i + ((-112346298) * i3) + (505796074 * i5);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i4) - 1525940224) + (1734765094 * i6) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i) + (859308032 * i3) + (310902784 * i5) + (417529856 * i13);
        int i15 = (i4 * (-1233303660)) + 1670658458 + (i6 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i * (-1233302909)) + (i3 * 1075253458) + (i5 * 745806526) + (i13 * 1512636416);
        return i14 + ((i15 * i15) * (-1737162752)) != 1 ? RemoteActionCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 10
            int r7 = r7 + 34
            byte[] r0 = kotlin.getFontSize.$$a
            int r8 = 79 - r8
            int r9 = r9 * 12
            int r9 = r9 + 65
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-1)
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFontSize.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 111 - r7
            byte[] r0 = kotlin.getFontSize.$$d
            int r6 = 47 - r6
            int r1 = r8 + 20
            byte[] r1 = new byte[r1]
            int r8 = r8 + 19
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r6
            int r6 = r3 + 9
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFontSize.c(int, int, short, java.lang.Object[]):void");
    }

    protected final maybeExcludeTrack RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 51;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        maybeExcludeTrack maybeexcludetrack = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(maybeexcludetrack);
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 81;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return maybeexcludetrack;
        }
        obj.hashCode();
        throw null;
    }

    private String AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 11;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.write;
        if (str != null) {
            return str;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i3 = MediaDescriptionCompat + 79;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return null;
    }

    private void read(String str) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = str;
        int i4 = MediaDescriptionCompat + 25;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        isUnderline isunderline = ((getFontSize) objArr[0]).AudioAttributesCompatParcelizer;
        if (isunderline != null) {
            int i2 = MediaDescriptionCompat + 123;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            return isunderline;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i4 = MediaDescriptionCompat + 1;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private void write(isUnderline isunderline) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(isunderline, "");
        this.AudioAttributesCompatParcelizer = isunderline;
        int i4 = MediaDescriptionCompat + 95;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private final getEventTimesUs read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 23;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Fragment parentFragment = getParentFragment();
        Object obj = null;
        if (!(parentFragment instanceof getEventTimesUs)) {
            int i4 = MediaDescriptionCompat + 65;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = MediaDescriptionCompat + 117;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        getEventTimesUs geteventtimesus = (getEventTimesUs) parentFragment;
        if (i5 % 2 == 0) {
            return geteventtimesus;
        }
        obj.hashCode();
        throw null;
    }

    private final TtmlRenderUtil IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Fragment parentFragment = getParentFragment();
        if (i3 != 0) {
            boolean z = parentFragment instanceof TtmlRenderUtil;
            obj.hashCode();
            throw null;
        }
        if (!(parentFragment instanceof TtmlRenderUtil)) {
            return null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 35;
        MediaDescriptionCompat = i4 % 128;
        TtmlRenderUtil ttmlRenderUtil = (TtmlRenderUtil) parentFragment;
        if (i4 % 2 != 0) {
            return ttmlRenderUtil;
        }
        obj.hashCode();
        throw null;
    }

    private final void write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getEventTimesUs geteventtimesus = read();
            if (geteventtimesus != null) {
                geteventtimesus.dismissAllowingStateLoss();
                return;
            }
            TtmlRenderUtil ttmlRenderUtilIconCompatParcelizer = IconCompatParcelizer();
            if (ttmlRenderUtilIconCompatParcelizer != null) {
                int i3 = MediaBrowserCompatCustomActionResultReceiver + 63;
                MediaDescriptionCompat = i3 % 128;
                if (i3 % 2 != 0) {
                    ttmlRenderUtilIconCompatParcelizer.write();
                    return;
                } else {
                    ttmlRenderUtilIconCompatParcelizer.write();
                    int i4 = 26 / 0;
                    return;
                }
            }
            dismiss();
            return;
        }
        read();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/settings/BaseSettingsFragment$Companion;", "", "<init>", "()V", "ARG_TITLE", "", "ARG_ROWS", "ARG_RESULT_KEY", "createArgs", "Landroid/os/Bundle;", "title", "rows", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/SettingsItem;", "Lkotlin/collections/ArrayList;", "resultKey", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public static Bundle IconCompatParcelizer(String str, ArrayList<SettingsItem> arrayList, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            return _getIndexResolver.write(setAction.write("title", str), setAction.write("rows", arrayList), setAction.write("result_key", str2));
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
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
        int i4 = $11 + 67;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i6 = $10 + 3;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), Drawable.resolveOpacity(0, 0) + 22748, TextUtils.getTrimmedLength("") + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.alpha(0) + 2721, View.getDefaultSize(0, 0) + 38, 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 15713 - View.MeasureSpec.getMode(0), Color.rgb(0, 0, 0) + 16777280, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40975 - ImageFormat.getBitsPerPixel(0)), 6122 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetBefore("", 0) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (MediaBrowserCompatItemReceiver ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
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
        int i8 = $10 + 79;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 13 / 0;
            objArr[0] = str;
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cBlue = (char) (13183 - Color.blue(0));
            int i2 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
            int edgeSlop = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b = $$a[17];
            Object[] objArr2 = new Object[1];
            a(b, (byte) 76, b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cBlue, i2, edgeSlop, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i3 = MediaDescriptionCompat + 85;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13183);
                    int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iArgb = 26 - Color.argb(0, 0, 0, 0);
                    byte b2 = $$a[5];
                    Object[] objArr3 = new Object[1];
                    a(b2, r2[39], b2, objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(touchSlop, scrollDefaultDelay, iArgb, -1033747278, false, (String) objArr3[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char modifierMetaStateMask = (char) (13182 - ((byte) KeyEvent.getModifierMetaStateMask()));
                int offsetBefore = 1649 - TextUtils.getOffsetBefore("", 0);
                int iMyTid = 26 - (Process.myTid() >> 22);
                byte b3 = $$a[5];
                Object[] objArr4 = new Object[1];
                a(b3, r11[39], b3, objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(modifierMetaStateMask, offsetBefore, iMyTid, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b(View.combineMeasuredStates(0, 0), new char[]{0, 0, 0, 0}, new char[]{42498, 31796, 12840, 47692, 20820, 54796, 61646, 48354, 35047, 48401, 7194, 61132, 35456, 54833, 32678, 60679}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD), new char[]{30539, 61026, 53477, 24834}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(ExpandableListView.getPackedPositionGroup(0L), new char[]{0, 0, 0, 0}, new char[]{10538, 50887, 44915, 41477, 6585, 34608, 5559, 62713, 38277, 56986, 8095, 37256, 49532, 58497, 43477, 43722}, (char) (57834 - View.resolveSize(0, 0)), new char[]{44915, 30565, 60054, 29153}, objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, 1603634888};
                byte[] bArr = $$d;
                byte b4 = (byte) (bArr[48] + 1);
                Object[] objArr8 = new Object[1];
                c((byte) 43, b4, (byte) (b4 + 5), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b5 = (byte) 19;
                Object[] objArr9 = new Object[1];
                c(b5, (byte) (b5 << 1), (byte) (bArr[48] + 1), objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13182);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1649;
                    int i4 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                    byte b6 = $$a[5];
                    Object[] objArr10 = new Object[1];
                    a(b6, r9[39], b6, objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(c2, packedPositionGroup, i4, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{0, 0, 0, 0}, new char[]{53871, 34430, 26373, 35222, 44295, 19315, 2060, 27227, 15252, 2239, 43351, 20455, 39038, 40223, 41190, 16932, 48603, 6482, 63033, 11943, 436, 50911}, (char) TextUtils.getOffsetAfter("", 0), new char[]{49368, 18141, 64691, 11189}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(View.MeasureSpec.makeMeasureSpec(0, 0) + 526203806, new char[]{0, 0, 0, 0}, new char[]{52805, 47536, 31399, 8446, 2996, 14709, 20437, 35326, 16738, 8925, 21378, 3114, 43417, 9241, 40411}, (char) (52643 - View.MeasureSpec.getMode(0)), new char[]{40634, 23867, 41759, 51661}, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 13183);
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1649;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 26;
                        byte b7 = $$a[5];
                        byte b8 = b7;
                        Object[] objArr13 = new Object[1];
                        a(b7, b8, b8, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(fadingEdgeLength, scrollDefaultDelay2, iMakeMeasureSpec, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13184);
                        int longPressTimeout = 1649 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
                        byte b9 = $$a[17];
                        Object[] objArr14 = new Object[1];
                        a(b9, (byte) 76, b9, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cLastIndexOf, longPressTimeout, iResolveSizeAndState, -133433128, false, (String) objArr14[0], null);
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
        int i5 = ((int[]) objArr[c])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 != i5) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (4535 - (ViewConfiguration.getLongPressTimeout() >> 16)), (Process.myTid() >> 22) + 6054, 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i7 = MediaDescriptionCompat;
                int i8 = i7 + 19;
                MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 27;
                MediaBrowserCompatCustomActionResultReceiver = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr15 = {-1930635947, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 6030, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24);
                    byte b10 = (byte) ($$d[48] + 1);
                    Object[] objArr16 = new Object[1];
                    c(b10, (byte) (b10 | 29), r2[16], objArr16);
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
        super.onCreate(savedInstanceState);
        String string = requireArguments().getString("title");
        if (string == null) {
            string = "";
        }
        this.AudioAttributesImplApi21Parcelizer = string;
        String string2 = requireArguments().getString("result_key");
        read(string2 != null ? string2 : "");
        ArrayList<SettingsItem> arrayListRemoteActionCompatParcelizer = StdKeyDeserializerDelegatingKD.RemoteActionCompatParcelizer(requireArguments(), "rows", SettingsItem.class);
        if (arrayListRemoteActionCompatParcelizer == null) {
            arrayListRemoteActionCompatParcelizer = new ArrayList<>();
        }
        this.RemoteActionCompatParcelizer = arrayListRemoteActionCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 29;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(inflater, "");
            this.IconCompatParcelizer = maybeExcludeTrack.write(inflater, container);
            LinearLayout linearLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
            linearLayout = linearLayoutIconCompatParcelizer;
            int i3 = 78 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(inflater, "");
            this.IconCompatParcelizer = maybeExcludeTrack.write(inflater, container);
            LinearLayout linearLayoutIconCompatParcelizer2 = RemoteActionCompatParcelizer().IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer2, "");
            linearLayout = linearLayoutIconCompatParcelizer2;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 121;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    private static final void RemoteActionCompatParcelizer(getFontSize getfontsize) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 19;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getfontsize.write();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 55;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final getShowPopup write(getFontSize getfontsize, ToggleKey toggleKey, boolean z) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(toggleKey, "");
        withAlwaysAsId.read(getfontsize, getfontsize.AudioAttributesImplApi21Parcelizer(), _getIndexResolver.write(setAction.write("key_settings_result", new SettingsResult.ToggleChanged(toggleKey, z))));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i2 = MediaDescriptionCompat + 109;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getFontSize getfontsize = (getFontSize) objArr[0];
        NavKey navKey = (NavKey) objArr[1];
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(navKey, "");
        withAlwaysAsId.read(getfontsize, getfontsize.AudioAttributesImplApi21Parcelizer(), _getIndexResolver.write(setAction.write("key_settings_result", new SettingsResult.NavClicked(navKey))));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i2 = MediaDescriptionCompat + 85;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.read.setText(this.AudioAttributesImplApi21Parcelizer);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.write.setOnClickListener(new View.OnClickListener() { // from class: o.getTextAlign
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getFontSize.write(this.write);
            }
        });
        write(new isUnderline(this.RemoteActionCompatParcelizer, new MagicModuleSubmissionRequestBody() { // from class: o.getTextEmphasis
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return getFontSize.read(this.AudioAttributesCompatParcelizer, (ToggleKey) obj, ((Boolean) obj2).booleanValue());
            }
        }, new getAnswerMap() { // from class: o.getStyle
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getFontSize.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (NavKey) obj);
            }
        }));
        RecyclerView recyclerView = RemoteActionCompatParcelizer().read;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = RemoteActionCompatParcelizer().read;
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        recyclerView2.setAdapter((isUnderline) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, Rating$$ExternalSyntheticLambda0.write(), -1754850226, Rating$$ExternalSyntheticLambda0.write(), new Object[]{this}, 1754850227));
        int i2 = MediaDescriptionCompat + 115;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 79;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        this.IconCompatParcelizer = null;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 27;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.argCount
    public int getTheme() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            CmcdConfigurationRequestConfig.read();
            obj.hashCode();
            throw null;
        }
        int i3 = CmcdConfigurationRequestConfig.read();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 119;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(getFontSize getfontsize, NavKey navKey) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 85;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int iWrite = Rating$$ExternalSyntheticLambda0.write();
            throw null;
        }
        int iWrite2 = Rating$$ExternalSyntheticLambda0.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite2, Rating$$ExternalSyntheticLambda0.write(), -1633183001, Rating$$ExternalSyntheticLambda0.write(), new Object[]{getfontsize, navKey}, 1633183001);
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 29;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ void write(getFontSize getfontsize) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 109;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(getfontsize);
        int i4 = MediaDescriptionCompat + 13;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ getShowPopup read(getFontSize getfontsize, ToggleKey toggleKey, boolean z) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 77;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(getfontsize, toggleKey, z);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return getshowpopupWrite;
    }

    static {
        MediaBrowserCompatSearchResultReceiver = 1;
        AudioAttributesCompatParcelizer();
        read = new IconCompatParcelizer(null);
        int i = RatingCompat + 111;
        MediaBrowserCompatSearchResultReceiver = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }

    private static final getShowPopup write(getFontSize getfontsize, NavKey navKey) {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, Rating$$ExternalSyntheticLambda0.write(), -1633183001, Rating$$ExternalSyntheticLambda0.write(), new Object[]{getfontsize, navKey}, 1633183001);
    }

    private isUnderline MediaBrowserCompatCustomActionResultReceiver() {
        int iWrite = Rating$$ExternalSyntheticLambda0.write();
        return (isUnderline) AudioAttributesCompatParcelizer(Rating$$ExternalSyntheticLambda0.write(), iWrite, Rating$$ExternalSyntheticLambda0.write(), -1754850226, Rating$$ExternalSyntheticLambda0.write(), new Object[]{this}, 1754850227);
    }

    static void AudioAttributesCompatParcelizer() {
        MediaBrowserCompatItemReceiver = -3498762522182953692L;
        AudioAttributesImplBaseParcelizer = -136981212;
        AudioAttributesImplApi26Parcelizer = (char) 45372;
    }
}
