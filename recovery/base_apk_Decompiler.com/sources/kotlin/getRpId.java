package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import com.marrow2.ui.custom_module.join_by_code.CustomModuleJoinByCodeViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.DefaultTrackSelectorExternalSyntheticLambda6;
import kotlin.GetPhoneNumberHintIntentRequestBuilder;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0015\u001a\u00020\u001f8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010\u0012\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lo/getRpId;", "Lo/consumeCcData;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "AudioAttributesImplApi26Parcelizer", "", "AudioAttributesCompatParcelizer", "(Z)V", "AudioAttributesImplBaseParcelizer", "", "IconCompatParcelizer", "(I)V", "onDestroyView", "Landroid/content/DialogInterface;", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lo/RepresentationSingleSegmentRepresentation;", "Lo/setSessionInfo;", "write", "()Lo/RepresentationSingleSegmentRepresentation;", "Lcom/marrow2/ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel;", "Lo/RenewEligible;", "RemoteActionCompatParcelizer", "()Lcom/marrow2/ui/custom_module/join_by_code/CustomModuleJoinByCodeViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getRpId extends getStatusFromIntent {
    private static /* synthetic */ isResolutionNotSupported<Object>[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int MediaBrowserCompatItemReceiver;
    private static long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setSessionInfo AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible read;
    private static final byte[] $$c = {34, TarConstants.LF_NORMAL, 18, 42};
    private static final int $$f = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {8, -19, -66, -33, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$e = 76;
    private static final byte[] $$a = {122, -64, TarConstants.LF_SYMLINK, -113, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 26;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r5, short r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = 121 - r6
            int r5 = r5 * 4
            int r0 = 1 - r5
            byte[] r1 = kotlin.getRpId.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r3 = r6
            r4 = r2
            r6 = r5
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            r3 = r1[r7]
        L29:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRpId.$$g(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 12
            int r7 = 77 - r7
            byte[] r0 = kotlin.getRpId.$$a
            int r8 = r8 + 4
            int r6 = r6 * 10
            int r6 = r6 + 34
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRpId.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 111 - r8
            int r6 = r6 * 3
            int r0 = r6 + 22
            byte[] r1 = kotlin.getRpId.$$d
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 21
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
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
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + 2
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRpId.c(short, short, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~((~i5) | i3);
        int i8 = ~((~i3) | i6);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i6) | i3));
        int i11 = i3 + i6 + i2 + (762724209 * i) + (1201824936 * i4);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i3) + 43253760 + (1339426419 * i6) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i2) + (1302855680 * i) + (1514143744 * i4) + (1905524736 * i12);
        int i14 = ((i3 * 162561953) - 555857873) + (i6 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i2 * 162560975) + (i * 701011807) + (i4 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        if (i15 == 1) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i15 != 2) {
            return write(objArr);
        }
        getRpId getrpid = (getRpId) objArr[0];
        int i16 = 2 % 2;
        int i17 = AudioAttributesImplBaseParcelizer + 69;
        MediaBrowserCompatCustomActionResultReceiver = i17 % 128;
        int i18 = i17 % 2;
        super.onDestroyView();
        maybeGetTypeVariable activity = getrpid.getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(10);
            int i19 = AudioAttributesImplBaseParcelizer + 121;
            MediaBrowserCompatCustomActionResultReceiver = i19 % 128;
            int i20 = i19 % 2;
        }
        return null;
    }

    public getRpId() {
        getRpId getrpid = this;
        this.AudioAttributesCompatParcelizer = SessionDescription.IconCompatParcelizer(getrpid, new MediaBrowserCompatCustomActionResultReceiver(), SessionDescriptionParser.RemoteActionCompatParcelizer());
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1(new AnonymousClass4(getrpid)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(CustomModuleJoinByCodeViewModel.class), new AnonymousClass3(renewEligibleWrite), new AnonymousClass5(renewEligibleWrite), new AnonymousClass2(getrpid, renewEligibleWrite));
    }

    public static final /* synthetic */ CustomModuleJoinByCodeViewModel IconCompatParcelizer(getRpId getrpid) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        CustomModuleJoinByCodeViewModel customModuleJoinByCodeViewModelRemoteActionCompatParcelizer = getrpid.RemoteActionCompatParcelizer();
        int i4 = AudioAttributesImplBaseParcelizer + 57;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return customModuleJoinByCodeViewModelRemoteActionCompatParcelizer;
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(getRpId getrpid, boolean z) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 113;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getrpid, Boolean.valueOf(z)};
        int i4 = LeastRecentlyUsedCacheEvictor.read();
        if (i3 != 0) {
            read(LeastRecentlyUsedCacheEvictor.read(), LeastRecentlyUsedCacheEvictor.read(), -1360013439, LeastRecentlyUsedCacheEvictor.read(), i4, 1360013440, objArr);
        } else {
            read(LeastRecentlyUsedCacheEvictor.read(), LeastRecentlyUsedCacheEvictor.read(), -1360013439, LeastRecentlyUsedCacheEvictor.read(), i4, 1360013440, objArr);
            int i5 = 20 / 0;
        }
    }

    public static final /* synthetic */ RepresentationSingleSegmentRepresentation read(getRpId getrpid) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 95;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        RepresentationSingleSegmentRepresentation representationSingleSegmentRepresentationWrite = getrpid.write();
        int i4 = AudioAttributesImplBaseParcelizer + 119;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return representationSingleSegmentRepresentationWrite;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RepresentationSingleSegmentRepresentation write() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 49;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        return (RepresentationSingleSegmentRepresentation) this.AudioAttributesCompatParcelizer.read(this, i2 % 2 != 0 ? AudioAttributesCompatParcelizer[1] : AudioAttributesCompatParcelizer[0]);
    }

    private final CustomModuleJoinByCodeViewModel RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 41;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        CustomModuleJoinByCodeViewModel customModuleJoinByCodeViewModel = (CustomModuleJoinByCodeViewModel) this.read.RemoteActionCompatParcelizer();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 7;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return customModuleJoinByCodeViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 38461), 532 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "") + 8, -735610793, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (RemoteActionCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36620 - Process.getGidForName("")), 2339 - MotionEvent.axisFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 28, 188119637, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $10 + 33;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $10 + 115;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 + 1);
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (36621 - (Process.myPid() >> 22)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2340, 27 - Process.getGidForName(""), 188119637, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<GetPhoneNumberHintIntentRequestBuilder> setupdatedstatusMediaBrowserCompatItemReceiver = getRpId.IconCompatParcelizer(getRpId.this).MediaBrowserCompatItemReceiver();
                final getRpId getrpid = getRpId.this;
                this.write = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.getRpId.read.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((GetPhoneNumberHintIntentRequestBuilder) obj2);
                    }

                    private Object write(GetPhoneNumberHintIntentRequestBuilder getPhoneNumberHintIntentRequestBuilder) {
                        if (getPhoneNumberHintIntentRequestBuilder instanceof GetPhoneNumberHintIntentRequestBuilder.read) {
                            TextView textView = getRpId.read(getrpid).MediaBrowserCompatCustomActionResultReceiver;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                            PlayerControlViewExternalSyntheticLambda1.write((View) textView);
                            getRpId.RemoteActionCompatParcelizer(getrpid, false);
                        } else if (getPhoneNumberHintIntentRequestBuilder instanceof GetPhoneNumberHintIntentRequestBuilder.write) {
                            getRpId.RemoteActionCompatParcelizer(getrpid, false);
                            getRpId.read(getrpid).MediaBrowserCompatItemReceiver.setTextColor(createExtractors.RemoteActionCompatParcelizer(getRpId.read(getrpid).MediaBrowserCompatItemReceiver, R.attr.onSurfaceRed));
                            getRpId.read(getrpid).MediaBrowserCompatItemReceiver.setText(((GetPhoneNumberHintIntentRequestBuilder.write) getPhoneNumberHintIntentRequestBuilder).AudioAttributesCompatParcelizer());
                        } else if (getPhoneNumberHintIntentRequestBuilder instanceof GetPhoneNumberHintIntentRequestBuilder.AudioAttributesCompatParcelizer) {
                            getRpId.RemoteActionCompatParcelizer(getrpid, false);
                            Context contextRequireContext = getrpid.requireContext();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
                            final getRpId getrpid2 = getrpid;
                            new DefaultTrackSelectorExternalSyntheticLambda6(contextRequireContext, new DefaultTrackSelectorExternalSyntheticLambda6.read() { // from class: o.getRpId.read.4.3
                                @Override // o.DefaultTrackSelectorExternalSyntheticLambda6.read
                                public final void onPlayFromUri() {
                                    getRpId getrpid3 = getrpid2;
                                    PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                                    Context contextRequireContext2 = getrpid2.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                                    getrpid3.startActivity(PlanActivity.AudioAttributesCompatParcelizer.IconCompatParcelizer(contextRequireContext2));
                                    getrpid2.requireActivity().finish();
                                }

                                @Override // o.DefaultTrackSelectorExternalSyntheticLambda6.read
                                public final void onPrepareFromSearch() {
                                    getRpId getrpid3 = getrpid2;
                                    PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                                    Context contextRequireContext2 = getrpid2.requireContext();
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
                                    String lowerCase = "PRO_CM_ACCESSED".toLowerCase(Locale.ROOT);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                                    getrpid3.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(contextRequireContext2, "Pro Subscription Dialog", lowerCase));
                                    getrpid2.requireActivity().finish();
                                }
                            }, null, 4, null).show();
                        } else if (getPhoneNumberHintIntentRequestBuilder instanceof GetPhoneNumberHintIntentRequestBuilder.IconCompatParcelizer) {
                            EditText editText = getRpId.read(getrpid).read;
                            GetPhoneNumberHintIntentRequestBuilder.IconCompatParcelizer iconCompatParcelizer = (GetPhoneNumberHintIntentRequestBuilder.IconCompatParcelizer) getPhoneNumberHintIntentRequestBuilder;
                            editText.setText(iconCompatParcelizer.IconCompatParcelizer());
                            editText.setSelection(iconCompatParcelizer.IconCompatParcelizer().length());
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getRpId.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.getRpId$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private /* synthetic */ Fragment $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$RemoteActionCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$RemoteActionCompatParcelizer = fragment;
        }
    }

    /* JADX INFO: renamed from: o.getRpId$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$AudioAttributesCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$AudioAttributesCompatParcelizer = getcreatedondatems;
        }
    }

    /* JADX INFO: renamed from: o.getRpId$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    public static final class RemoteActionCompatParcelizer implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public RemoteActionCompatParcelizer() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String strValueOf = String.valueOf(editable);
            if (TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) strValueOf).toString().length() < 8) {
                TextView textView = getRpId.read(getRpId.this).MediaBrowserCompatCustomActionResultReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
                TextView textView2 = getRpId.read(getRpId.this).MediaBrowserCompatItemReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                PlayerControlViewExternalSyntheticLambda1.write((View) textView2);
                getRpId.read(getRpId.this).MediaBrowserCompatItemReceiver.setText(getRpId.this.getString(R.string.join_cm_enter_code));
                getRpId.read(getRpId.this).MediaBrowserCompatItemReceiver.setTextColor(createExtractors.RemoteActionCompatParcelizer(getRpId.read(getRpId.this).MediaBrowserCompatItemReceiver, R.attr.onBackgroundSurface2));
            }
            getRpId.RemoteActionCompatParcelizer(getRpId.this, TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) strValueOf).toString().length() >= 8);
            TextView textView3 = getRpId.read(getRpId.this).MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView3);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getRpId.read(getRpId.this).MediaBrowserCompatItemReceiver.getText(), (Object) getRpId.this.getString(R.string.join_cm_enter_code))) {
                return;
            }
            getRpId.IconCompatParcelizer(getRpId.this).AudioAttributesImplBaseParcelizer();
        }
    }

    /* JADX INFO: renamed from: o.getRpId$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $IconCompatParcelizer = null;
        private /* synthetic */ RenewEligible $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$RemoteActionCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RenewEligible renewEligible) {
            super(0);
            this.$RemoteActionCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.getRpId$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "read", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $IconCompatParcelizer;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$IconCompatParcelizer.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = fragment;
            this.$write = renewEligible;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel>> getresolutionsizeAudioAttributesCompatParcelizer = getRpId.IconCompatParcelizer(getRpId.this).AudioAttributesCompatParcelizer();
                final getRpId getrpid = getRpId.this;
                this.IconCompatParcelizer = 1;
                if (getresolutionsizeAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.getRpId.AudioAttributesCompatParcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object write(DataSourceBitmapLoaderExternalSyntheticLambda0<CustomModuleUCModel> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 == null) {
                            return getShowPopup.INSTANCE;
                        }
                        ProgressBar progressBar = getRpId.read(getrpid).RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(progressBar);
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            getRpId.RemoteActionCompatParcelizer(getrpid, true);
                            getRpId.IconCompatParcelizer(getrpid).AudioAttributesImplApi26Parcelizer();
                            withAlwaysAsId.read(getrpid, "CustomModuleJoinByCodeDialogSuccessKey", _getIndexResolver.write(new Pair("data", ((decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0).RemoteActionCompatParcelizer())));
                        } else if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat) {
                            ProgressBar progressBar2 = getRpId.read(getrpid).RemoteActionCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar2, "");
                            PlayerControlViewExternalSyntheticLambda1.write(progressBar2);
                        } else if (!(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setTopBitrateKbps)) {
                            throw new RenewEligibleCreator();
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getRpId.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<Pair<CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer, CustomModuleQuotaResponseBody>>> getresolutionsize = getRpId.IconCompatParcelizer(getRpId.this).read();
                final getRpId getrpid = getRpId.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (getresolutionsize.write(new getValidationToken() { // from class: o.getRpId.write.4

                    /* JADX INFO: renamed from: o.getRpId$write$4$IconCompatParcelizer */
                    public static final /* synthetic */ class IconCompatParcelizer {
                        public static final /* synthetic */ int[] read;

                        static {
                            int[] iArr = new int[CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.values().length];
                            try {
                                iArr[CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.IconCompatParcelizer.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer.read.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            read = iArr;
                        }
                    }

                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private Object IconCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<Pair<CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer, CustomModuleQuotaResponseBody>> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            if (!getrpid.isVisible()) {
                                return getShowPopup.INSTANCE;
                            }
                            decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                            CustomModuleQuotaResponseBody customModuleQuotaResponseBody = (CustomModuleQuotaResponseBody) ((Pair) decodebitmap.RemoteActionCompatParcelizer()).IconCompatParcelizer();
                            int i2 = IconCompatParcelizer.read[((CustomModuleJoinByCodeViewModel.AudioAttributesCompatParcelizer) ((Pair) decodebitmap.RemoteActionCompatParcelizer()).write()).ordinal()];
                            if (i2 == 1) {
                                getRpId.read(getrpid).AudioAttributesImplApi26Parcelizer.setText(getrpid.requireContext().getResources().getQuantityString(R.plurals.plurals_cm_subject_used, customModuleQuotaResponseBody.dailyAllowed, QBankStatsResponse.RemoteActionCompatParcelizer(customModuleQuotaResponseBody.dailyAllowed), QBankStatsResponse.RemoteActionCompatParcelizer(customModuleQuotaResponseBody.monthlyAllowed)));
                            } else if (i2 == 2) {
                                getRpId.read(getrpid).AudioAttributesImplApi26Parcelizer.setText(getrpid.requireContext().getResources().getQuantityString(R.plurals.text_cm_quota_left_today_n_month_wise_pro, Math.max(customModuleQuotaResponseBody.dailyAllowed - customModuleQuotaResponseBody.dailyCreated, 0), QBankStatsResponse.RemoteActionCompatParcelizer(Math.max(customModuleQuotaResponseBody.dailyAllowed - customModuleQuotaResponseBody.dailyCreated, 0)), QBankStatsResponse.RemoteActionCompatParcelizer(customModuleQuotaResponseBody.monthlyAllowed - customModuleQuotaResponseBody.monthlyCreated)));
                            } else if (i2 == 3) {
                                getRpId.read(getrpid).AudioAttributesImplApi26Parcelizer.setText(getrpid.requireContext().getResources().getQuantityString(R.plurals.text_cm_quota_left_today_n_month_wise_free, customModuleQuotaResponseBody.freeUserAllowed - customModuleQuotaResponseBody.totalCustomModuleCreated, QBankStatsResponse.RemoteActionCompatParcelizer(customModuleQuotaResponseBody.freeUserAllowed - customModuleQuotaResponseBody.totalCustomModuleCreated)));
                            } else if (i2 == 4) {
                                TextView textView = getRpId.read(getrpid).AudioAttributesImplApi26Parcelizer;
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                                PlayerControlViewExternalSyntheticLambda1.read(textView, R.color.error_red_color);
                                getRpId.read(getrpid).AudioAttributesImplApi26Parcelizer.setText(getrpid.getResources().getString(R.string.text_cm_quota_exhaust_today_n_month_wise));
                            }
                            onDraw.read(getRpId.read(getrpid).AudioAttributesImplApi26Parcelizer);
                            onDraw.read(getRpId.read(getrpid).AudioAttributesCompatParcelizer);
                        } else {
                            View view = getRpId.read(getrpid).AudioAttributesCompatParcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view);
                            TextView textView2 = getRpId.read(getrpid).AudioAttributesImplApi26Parcelizer;
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView2);
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return getRpId.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 63;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char threadPriority = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
                int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                int i3 = 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b = bArr[53];
                byte b2 = bArr[5];
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(threadPriority, modifierMetaStateMask, i3, -133433128, false, (String) objArr2[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer2 == null) {
            char c2 = (char) (13184 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iNormalizeMetaState = 1649 - KeyEvent.normalizeMetaState(0);
            int iRed = 26 - Color.red(0);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[53];
            byte b4 = bArr2[5];
            Object[] objArr3 = new Object[1];
            a(b3, b4, b4, objArr3);
            objRemoteActionCompatParcelizer2 = startForeground.read(c2, iNormalizeMetaState, iRed, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer2).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 1649;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
                Object[] objArr4 = new Object[1];
                a(r3[5], r3[53], (byte) (-$$a[27]), objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(scrollBarFadeDuration, deadChar, keyRepeatTimeout, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b(TextUtils.getCapsMode("", 0, 0) + 53849, new char[]{50955, 5465, 25509, 45067, 36395, 56496, 10518, 1888, 21966, 41582, 61512, 52939, 6974, 27024, 18394, 37947}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(20808 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{50952, 38466, 25994, 13530, 33289, 20843, 8383, 65513, 19729, 7295, 60372, 47364, 2166, 59285, 46823, 1069}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 57;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -67571063};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[49];
                Object[] objArr8 = new Object[1];
                c(b5, bArr3[42], b5, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(bArr3[17], bArr3[11], (byte) (bArr3[66] + 1), objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char scrollBarFadeDuration2 = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                    int iAlpha = 26 - Color.alpha(0);
                    Object[] objArr10 = new Object[1];
                    a(r3[5], r3[53], (byte) (-$$a[27]), objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(scrollBarFadeDuration2, doubleTapTimeout, iAlpha, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(View.combineMeasuredStates(0, 0) + 18757, new char[]{50944, 36426, 21903, 7388, 57882, 43345, 28827, 51116, 36134, 21631, 7165, 58053, 43044, 32659, 50899, 35855, 21340, 6839, 57815, 46865, 32358, 50595}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((KeyEvent.getMaxKeyCode() >> 16) + 3463, new char[]{50948, 51850, 56334, 61316, 61710, 33959, 38447, 39298, 43836, 48831, 16459, 21464, 25948, 26839, 31334}, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 13183);
                        int iArgb = Color.argb(0, 0, 0, 0) + 1649;
                        int deadChar2 = 26 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr4[5], bArr4[53], (byte) 76, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(capsMode, iArgb, deadChar2, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 13183);
                        int i6 = 1649 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int i7 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[53];
                        byte b7 = bArr5[5];
                        Object[] objArr14 = new Object[1];
                        a(b6, b7, b7, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cArgb, i6, i7, -133433128, false, (String) objArr14[0], null);
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
        int i8 = ((int[]) objArr[c])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 4535), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6054, 42 - (ViewConfiguration.getScrollBarSize() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i10 = AudioAttributesImplBaseParcelizer + 15;
                MediaBrowserCompatCustomActionResultReceiver = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr15 = {762488228, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 6030 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 23 - TextUtils.indexOf((CharSequence) "", '0'));
                    byte[] bArr6 = $$d;
                    Object[] objArr16 = new Object[1];
                    c(bArr6[16], bArr6[8], (byte) 29, objArr16);
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
        setStyle(0, R.style.Theme_Marrow2_BottomSheetDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        View viewInflate = p0.inflate(R.layout.dialog_custom_module_join_by_code, p1, false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            int i2 = AudioAttributesImplBaseParcelizer + 125;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Window window = dialog.getWindow();
            if (window != null) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 9;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                window.setSoftInputMode(i4 % 2 == 0 ? 17 : 16);
            }
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 79;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onViewCreated(p0, p1);
            IconCompatParcelizer(5);
            int i3 = LeastRecentlyUsedCacheEvictor.read();
            int i4 = LeastRecentlyUsedCacheEvictor.read();
            read(LeastRecentlyUsedCacheEvictor.read(), i4, -1360013439, LeastRecentlyUsedCacheEvictor.read(), i3, 1360013440, new Object[]{this, false});
            int i5 = LeastRecentlyUsedCacheEvictor.read();
            int i6 = LeastRecentlyUsedCacheEvictor.read();
            read(LeastRecentlyUsedCacheEvictor.read(), i6, 334896585, LeastRecentlyUsedCacheEvictor.read(), i5, -334896585, new Object[]{this});
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onViewCreated(p0, p1);
            IconCompatParcelizer(3);
            int i7 = LeastRecentlyUsedCacheEvictor.read();
            int i8 = LeastRecentlyUsedCacheEvictor.read();
            read(LeastRecentlyUsedCacheEvictor.read(), i8, -1360013439, LeastRecentlyUsedCacheEvictor.read(), i7, 1360013440, new Object[]{this, false});
            int i9 = LeastRecentlyUsedCacheEvictor.read();
            int i10 = LeastRecentlyUsedCacheEvictor.read();
            read(LeastRecentlyUsedCacheEvictor.read(), i10, 334896585, LeastRecentlyUsedCacheEvictor.read(), i9, -334896585, new Object[]{this});
        }
        AudioAttributesImplBaseParcelizer();
        read();
        RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer();
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver implements getAnswerMap<getRpId, RepresentationSingleSegmentRepresentation> {
        /* JADX WARN: Type inference failed for: r0v1, types: [o.RepresentationSingleSegmentRepresentation, o.getApplicationLabel] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ RepresentationSingleSegmentRepresentation invoke(getRpId getrpid) {
            return AudioAttributesCompatParcelizer(getrpid);
        }

        private static RepresentationSingleSegmentRepresentation AudioAttributesCompatParcelizer(getRpId getrpid) {
            toMagicModuleMetaRepoModel.write(getrpid, "");
            return RepresentationSingleSegmentRepresentation.RemoteActionCompatParcelizer(getrpid.requireView());
        }
    }

    private static final void RemoteActionCompatParcelizer(getRpId getrpid) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 73;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        withAlwaysAsId.read(getrpid, "CustomModuleJoinByCodeDialogDismissKey", _getIndexResolver.AudioAttributesCompatParcelizer());
        getrpid.IconCompatParcelizer(5);
        getrpid.dismissAllowingStateLoss();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 47;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    private final void read() {
        int i = 2 % 2;
        write().write.setOnClickListener(new View.OnClickListener() { // from class: o.getChallenge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getRpId.write(this.RemoteActionCompatParcelizer);
            }
        });
        write().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.BeginSignInRequestPasskeysRequestOptionsBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getRpId.AudioAttributesCompatParcelizer(this.write);
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 107;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void MediaBrowserCompatItemReceiver(getRpId getrpid) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 91;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getTrackName.write(getrpid.getContext());
            obj.hashCode();
            throw null;
        }
        if (!getTrackName.write(getrpid.getContext())) {
            getRpId getrpid2 = getrpid;
            String string = getrpid.getString(R.string.app_error_no_internet);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            PlayerControlViewExternalSyntheticLambda1.write(getrpid2, string);
            return;
        }
        getrpid.RemoteActionCompatParcelizer().write(getrpid.write().read.getText().toString());
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 41;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class AudioAttributesImplApi26Parcelizer implements View.OnKeyListener {
        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            toMagicModuleMetaRepoModel.write(keyEvent, "");
            if (keyEvent.getAction() != 0 || i != 66) {
                return false;
            }
            Editable text = getRpId.read(getRpId.this).read.getText();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(text, "");
            if (TestGroupLSModel.AudioAttributesImplApi26Parcelizer(text).length() < 8) {
                return true;
            }
            getRpId.read(getRpId.this).IconCompatParcelizer.performClick();
            return true;
        }
    }

    /* JADX INFO: renamed from: o.getRpId$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getRpId$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Lo/getRpId;", "read", "(Ljava/lang/String;)Lo/getRpId;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getRpId read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getRpId getrpid = new getRpId();
            getrpid.setArguments(_getIndexResolver.write(setAction.write("arg_invite_code", p0)));
            return getrpid;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getRpId getrpid = (getRpId) objArr[0];
        int i = 2 % 2;
        getRpId getrpid2 = getrpid;
        Object obj = null;
        setBitrateKbps.RemoteActionCompatParcelizer(getrpid2, getrpid.new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(getrpid2, getrpid.new AudioAttributesCompatParcelizer(null));
        setBitrateKbps.RemoteActionCompatParcelizer(getrpid2, getrpid.new write(null));
        int i2 = AudioAttributesImplBaseParcelizer + 19;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getRpId getrpid = (getRpId) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 35;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getrpid.write().IconCompatParcelizer.setEnabled(zBooleanValue);
            getrpid.write().IconCompatParcelizer.setAlpha(zBooleanValue ? 1.0f : 0.5f);
            int i3 = AudioAttributesImplBaseParcelizer + 33;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 6 / 0;
            }
            return null;
        }
        getrpid.write().IconCompatParcelizer.setEnabled(zBooleanValue);
        MaterialButton materialButton = getrpid.write().IconCompatParcelizer;
        obj.hashCode();
        throw null;
    }

    private final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        EditText editText = write().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(editText, "");
        editText.addTextChangedListener(new RemoteActionCompatParcelizer());
        dispatchTouchEvent.write(write().read);
        write().read.setOnKeyListener(new AudioAttributesImplApi26Parcelizer());
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 87;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r3
      0x001f: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v11 android.view.View) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void IconCompatParcelizer(int r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.getRpId.AudioAttributesImplBaseParcelizer
            int r1 = r1 + 113
            int r2 = r1 % 128
            kotlin.getRpId.MediaBrowserCompatCustomActionResultReceiver = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            android.view.View r3 = r3.getView()
            r1 = 20
            int r1 = r1 / 0
            if (r3 == 0) goto L24
            goto L1f
        L19:
            android.view.View r3 = r3.getView()
            if (r3 == 0) goto L24
        L1f:
            android.view.ViewParent r3 = r3.getParent()
            goto L2e
        L24:
            int r3 = kotlin.getRpId.MediaBrowserCompatCustomActionResultReceiver
            int r3 = r3 + 11
            int r1 = r3 % 128
            kotlin.getRpId.AudioAttributesImplBaseParcelizer = r1
            int r3 = r3 % r0
            r3 = 0
        L2e:
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r3, r0)
            android.view.View r3 = (android.view.View) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.AudioAttributesCompatParcelizer(r3)
            r3.IconCompatParcelizer(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRpId.IconCompatParcelizer(int):void");
    }

    @Override // kotlin.argCount, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 9;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onDismiss(p0);
            withAlwaysAsId.read(this, "CustomModuleJoinByCodeDialogDismissKey", _getIndexResolver.AudioAttributesCompatParcelizer());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onDismiss(p0);
        withAlwaysAsId.read(this, "CustomModuleJoinByCodeDialogDismissKey", _getIndexResolver.AudioAttributesCompatParcelizer());
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 51;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void write(getRpId getrpid) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(getrpid);
        int i4 = AudioAttributesImplBaseParcelizer + 49;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(getRpId getrpid) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 7;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatItemReceiver(getrpid);
        int i4 = AudioAttributesImplBaseParcelizer + 91;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        MediaBrowserCompatItemReceiver = 1;
        AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(getRpId.class, "binding", "getBinding()Lcom/marrow/databinding/DialogCustomModuleJoinByCodeBinding;", 0))};
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi26Parcelizer + 49;
        MediaBrowserCompatItemReceiver = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) {
        Object[] objArr = {this, Boolean.valueOf(p0)};
        int i = LeastRecentlyUsedCacheEvictor.read();
        read(LeastRecentlyUsedCacheEvictor.read(), LeastRecentlyUsedCacheEvictor.read(), -1360013439, LeastRecentlyUsedCacheEvictor.read(), i, 1360013440, objArr);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        int i = LeastRecentlyUsedCacheEvictor.read();
        int i2 = LeastRecentlyUsedCacheEvictor.read();
        read(LeastRecentlyUsedCacheEvictor.read(), i2, 334896585, LeastRecentlyUsedCacheEvictor.read(), i, -334896585, new Object[]{this});
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = LeastRecentlyUsedCacheEvictor.read();
        int i2 = LeastRecentlyUsedCacheEvictor.read();
        read(LeastRecentlyUsedCacheEvictor.read(), i2, 1439423698, LeastRecentlyUsedCacheEvictor.read(), i, -1439423696, new Object[]{this});
    }

    static void AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer = -3724697679616715606L;
    }
}
