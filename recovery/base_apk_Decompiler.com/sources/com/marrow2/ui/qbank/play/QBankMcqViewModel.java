package com.marrow2.ui.qbank.play;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow2.ui.qbank.play.QBankMcqViewModel;
import java.lang.reflect.Method;
import kotlin.BaseGmsClient;
import kotlin.CachedContent;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.buildRemoveAllDownloadsIntent;
import kotlin.buildSetRequirementsIntent;
import kotlin.checkAvailabilityAndConnect;
import kotlin.getAddress4;
import kotlin.getAddress5;
import kotlin.getAllRequestedScopes;
import kotlin.getAnswerMap;
import kotlin.getApiFeatures;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setCountry;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0014J\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\u000f\u0010\"R\u0016\u0010$\u001a\u00020\f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b$\u0010#"}, d2 = {"Lcom/marrow2/ui/qbank/play/QBankMcqViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p0", "Lo/checkAvailabilityAndConnect;", "p1", "<init>", "(Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/checkAvailabilityAndConnect;)V", "Lo/getAddress5;", "", "write", "(Lo/getAddress5;)V", "", "", "p2", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "IconCompatParcelizer", "(I)V", "()V", "read", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "MediaBrowserCompatItemReceiver", "Lo/checkAvailabilityAndConnect;", "Lo/getApiFeatures;", "()Lo/getApiFeatures;", "Lo/getResolutionSize;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lo/getAddress4;", "Lo/getResolutionSize;", "RemoteActionCompatParcelizer", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QBankMcqViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<getAddress4>> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<getAddress4>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final checkAvailabilityAndConnect AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplApi26Parcelizer;
    private final NetworkTypeObserverApi31DisplayInfoCallback read;

    @setSdkPayload
    public QBankMcqViewModel(NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, checkAvailabilityAndConnect checkavailabilityandconnect) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(checkavailabilityandconnect, "");
        this.read = networkTypeObserverApi31DisplayInfoCallback;
        this.AudioAttributesCompatParcelizer = checkavailabilityandconnect;
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<getAddress4>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.write = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
    }

    public final getApiFeatures read() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.qbank.play.QBankMcqViewModel$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/qbank/play/QBankMcqViewModel$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private static int AudioAttributesCompatParcelizer;
        private static long IconCompatParcelizer;
        private static int RemoteActionCompatParcelizer;
        private static int[] write;
        private static final byte[] $$c = {TarConstants.LF_CHR, -23, 108, 101};
        private static final int $$d = 127;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {27, 74, 113, 65, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
        private static final int $$b = 113;
        private static final byte[] read = {36, -60, 17, 26, 18, -5, 19, 2, -1, 0, -49, 77, -8, 1, 23, -68, 45, 24, 1, 23, -47, TarConstants.LF_LINK, 4, -3, 8, 3, 19, 2, -12, 24, -6, 11, 4, 3, 20, -21, 26, 5, 3, -37, TarConstants.LF_LINK, 4, 11, 3, 2, 2, 12, -26, 26, 9, -3, 15, 11, 4, 18, -5, 19, 2, -1, 0, -49, TarConstants.LF_GNUTYPE_LONGLINK, -10, 24, 1, -65, 43, 22, 24, 1, -26, 36, -6, 8, 12, 10, -5, 6, 24, -36, 28, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 42, -2, 22, -26, 23, 17, 9, -11, 14, -6, 7, -4, 26, -16, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 2, 1, 2, 16, -4, 26, -16, -46, 67, -6, 18, -2, -52, 32, 42, 11, -10, 7, 3, 18, -16, 16, 14, -11, -17, 28, 10, 11, -25, 16, 16, 14, -11, 18, -5, 19, 2, -1, 0, -49, 77, -8, 1, 23, -68, 45, 24, 1, 23, -78, 46, 29, 1, 23, 7, 2, -8, -13, 34, -6, 3, 3, 20, -28, 27, 22, -16, -4, 26, -16, -46, 67, -6, 18, -2, -52, 43, 25, 15, 2, 13, -17, 6, 15, -2, 3, 20, -44, 35, 25, 3, -9, -4, 26, -16, -46, 67, -6, 18, -2, -52, 38, 24, 13, 0, 3, 22, -4, 26, -16, -46, 67, -6, 18, -2, -52, 35, 40, 4, -2, 10, -4, -6, -4, 26, -16, -46, 67, -6, 18, -2, -52, 73, -8, 6, 11, -2, 3, 22, -65, 24, 39, 5, 7, 19, 5, -5, -2, 15, -2, -17, 24, 13, 0, 3, 22, -9, 20, -46, 39, 5, 7, 19, 5, -5, -2, 15, -2, -4, 26, -16, -46, 67, -6, 18, -2, -52, 73, -8, 6, 11, -2, 3, 22, -65, 36, 29, 20, -7, 12, -6, 10, 13, -2, 1, -1, -10, 35, -4, 26, -16, -46, 67, -6, 18, -2, -52, 38, 24, 13, 0, 3, 22, -52};
        private static final int MediaBrowserCompatItemReceiver = 151;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r7, int r8, int r9) {
            /*
                int r8 = r8 * 3
                int r8 = 1 - r8
                int r9 = r9 + 4
                int r7 = r7 * 3
                int r7 = 104 - r7
                byte[] r0 = com.marrow2.ui.qbank.play.QBankMcqViewModel.Companion.$$c
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r7 = r9
                r4 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r6
            L2a:
                int r9 = r9 + r3
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankMcqViewModel.Companion.$$e(short, int, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.marrow2.ui.qbank.play.QBankMcqViewModel.Companion.$$a
                int r8 = r8 * 4
                int r1 = r8 + 20
                int r7 = r7 * 4
                int r7 = r7 + 73
                int r6 = r6 * 2
                int r6 = 3 - r6
                byte[] r1 = new byte[r1]
                int r8 = r8 + 19
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r7
                r4 = r2
                r7 = r6
                goto L32
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                int r6 = r6 + 1
                r1[r3] = r4
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L32:
                int r6 = -r6
                int r6 = r6 + r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankMcqViewModel.Companion.d(byte, byte, byte, java.lang.Object[]):void");
        }

        private Companion() {
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
            char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(IconCompatParcelizer ^ 4027965449757546139L, cArr, i);
            buildsetrequirementsintent.write = 4;
            while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                int i2 = buildsetrequirementsintent.write;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(IconCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 12424 - KeyEvent.keyCodeFromString(""), 21 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrAudioAttributesCompatParcelizer[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), 1868 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 9 - TextUtils.lastIndexOf("", '0'), 1983509525, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        }

        private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3;
            int i4 = 2;
            int i5 = 2 % 2;
            buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = write;
            int i6 = 43695;
            int i7 = -470782045;
            int i8 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i9 = 0;
                while (i9 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i7);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + i6), 23297 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr4[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        i9++;
                        i6 = 43695;
                        i7 = -470782045;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i10 = $10 + 55;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = write;
            if (iArr6 != null) {
                int i12 = $11 + 109;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i3 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    int i13 = $10 + 21;
                    $11 = i13 % 128;
                    if (i13 % i4 == 0) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i8] = Integer.valueOf(iArr6[i3]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 43696), ImageFormat.getBitsPerPixel(i8) + 23298, 15 - (TypedValue.complexToFloat(i8) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i8) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr6[i3])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - Drawable.resolveOpacity(0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23297, 14 - ExpandableListView.getPackedPositionChild(0L), -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                        i3++;
                    }
                    i4 = 2;
                    i8 = 0;
                }
                i2 = i8;
                iArr6 = iArr2;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr6, i2, iArr5, i2, length3);
            buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
            while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
                int i14 = $10 + 49;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
                cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
                cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
                cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
                buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
                buildRemoveAllDownloadsIntent.read(iArr5);
                int i16 = 0;
                for (int i17 = 16; i16 < i17; i17 = 16) {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i16];
                    Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (43695 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 23297 - (ViewConfiguration.getEdgeSlop() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i16++;
                }
                int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = i18;
                buildremovealldownloadsintent.read ^= iArr5[16];
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
                int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                int i20 = buildremovealldownloadsintent.read;
                cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
                cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
                cArr[3] = (char) buildremovealldownloadsintent.read;
                buildRemoveAllDownloadsIntent.read(iArr5);
                cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
                cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
                cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
                cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
                Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 48194), 20126 - Color.green(0), 20 - (Process.myTid() >> 22), 1620047497, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0586 A[Catch: all -> 0x05b9, TryCatch #14 {all -> 0x05b9, blocks: (B:95:0x0568, B:108:0x057e, B:110:0x0586, B:111:0x0587, B:115:0x0599, B:116:0x05a6), top: B:180:0x0568 }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0587 A[Catch: all -> 0x05b9, TryCatch #14 {all -> 0x05b9, blocks: (B:95:0x0568, B:108:0x057e, B:110:0x0586, B:111:0x0587, B:115:0x0599, B:116:0x05a6), top: B:180:0x0568 }] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0603  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x0612 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void read(android.content.Context r20, long r21, long r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1895
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankMcqViewModel.Companion.read(android.content.Context, long, long):void");
        }

        static {
            AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer = 0;
            RemoteActionCompatParcelizer = 1;
            write = new int[]{1526487219, 1459106404, 1485353208, 517617399, -704804247, -1834160493, -988777796, -559404711, 2137371098, 2090381869, 704531204, 218800226, -414671168, -1416177908, 1428953731, -2028987690, -1801743304, -1556818635};
        }

        static void AudioAttributesCompatParcelizer() {
            IconCompatParcelizer = 1156955829835183025L;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                int r7 = r7 + 4
                int r8 = 118 - r8
                byte[] r0 = com.marrow2.ui.qbank.play.QBankMcqViewModel.Companion.read
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L11
                r4 = r8
                r3 = r2
                r8 = r6
                goto L26
            L11:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r4 = r0[r8]
            L26:
                int r6 = r6 + r4
                int r6 = r6 + (-5)
                int r8 = r8 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankMcqViewModel.Companion.a(int, short, int, java.lang.Object[]):void");
        }
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<getAddress4>> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final void write(getAddress5 p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, getAddress5.RemoteActionCompatParcelizer.INSTANCE)) {
            IconCompatParcelizer();
        }
    }

    public final void AudioAttributesCompatParcelizer(String p0, String p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.AudioAttributesImplApi26Parcelizer = p0;
        this.MediaBrowserCompatCustomActionResultReceiver = p1;
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, p1, p2, null), new MagicModuleSubmissionRequestBody() { // from class: o.RegisterRequestParams
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankMcqViewModel.write((String) obj2);
            }
        });
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Integer mediaBrowserCompatMediaItem;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = QBankMcqViewModel.this.read.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CachedContent cachedContent = (CachedContent) obj;
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(QBankMcqViewModel.this.RemoteActionCompatParcelizer, new getAddress4(cachedContent.getWrite(), cachedContent.getAudioAttributesImplApi26Parcelizer(), cachedContent.MediaBrowserCompatMediaItem(), cachedContent.getRatingCompat(), cachedContent.getMediaDescriptionCompat(), this.AudioAttributesCompatParcelizer ? null : cachedContent.getMediaBrowserCompatMediaItem(), getAllRequestedScopes.read(cachedContent), cachedContent.getOnFastForward(), (this.AudioAttributesCompatParcelizer || (mediaBrowserCompatMediaItem = cachedContent.getMediaBrowserCompatMediaItem()) == null) ? -1 : mediaBrowserCompatMediaItem.intValue()));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, String str2, boolean z, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.read = str2;
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankMcqViewModel.this.new read(this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getResolutionSize getresolutionsize = QBankMcqViewModel.this.RemoteActionCompatParcelizer;
                getAddress4 getaddress4 = (getAddress4) ((DataSourceBitmapLoaderExternalSyntheticLambda0) QBankMcqViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer()).read();
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, getAddress4.read((479 & 1) != 0 ? getaddress4.MediaBrowserCompatCustomActionResultReceiver : null, (479 & 2) != 0 ? getaddress4.AudioAttributesImplApi26Parcelizer : null, (479 & 4) != 0 ? getaddress4.AudioAttributesImplBaseParcelizer : null, (479 & 8) != 0 ? getaddress4.RemoteActionCompatParcelizer : 0, (479 & 16) != 0 ? getaddress4.write : null, (479 & 32) != 0 ? getaddress4.AudioAttributesImplApi21Parcelizer : null, (479 & 64) != 0 ? getaddress4.AudioAttributesCompatParcelizer : null, (479 & 128) != 0 ? getaddress4.read : null, (479 & 256) != 0 ? getaddress4.IconCompatParcelizer : this.write));
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(700L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            getResolutionSize getresolutionsize2 = QBankMcqViewModel.this.RemoteActionCompatParcelizer;
            getAddress4 getaddress42 = (getAddress4) ((DataSourceBitmapLoaderExternalSyntheticLambda0) QBankMcqViewModel.this.RemoteActionCompatParcelizer.IconCompatParcelizer()).read();
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize2, getAddress4.read((479 & 1) != 0 ? getaddress42.MediaBrowserCompatCustomActionResultReceiver : null, (479 & 2) != 0 ? getaddress42.AudioAttributesImplApi26Parcelizer : null, (479 & 4) != 0 ? getaddress42.AudioAttributesImplBaseParcelizer : null, (479 & 8) != 0 ? getaddress42.RemoteActionCompatParcelizer : 0, (479 & 16) != 0 ? getaddress42.write : null, (479 & 32) != 0 ? getaddress42.AudioAttributesImplApi21Parcelizer : QBankStatsResponse.RemoteActionCompatParcelizer(this.write), (479 & 64) != 0 ? getaddress42.AudioAttributesCompatParcelizer : null, (479 & 128) != 0 ? getaddress42.read : null, (479 & 256) != 0 ? getaddress42.IconCompatParcelizer : 0));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(int i, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankMcqViewModel.this.new IconCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(int p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.getRegisterRequests
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankMcqViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer() {
        IconCompatParcelizer(-1);
        getAddress4 getaddress4RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer();
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(getaddress4RemoteActionCompatParcelizer != null ? getaddress4RemoteActionCompatParcelizer.write() : -1, null), new MagicModuleSubmissionRequestBody() { // from class: o.getRegisteredKeys
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QBankMcqViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
            }
        });
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
        
            if (kotlin.setCountry.IconCompatParcelizer(700, r18) == r1) goto L24;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                int r2 = r0.read
                r3 = -1
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L22
                if (r2 == r5) goto L1e
                if (r2 != r4) goto L16
                kotlin.SdkPayloadData.IconCompatParcelizer(r19)
                goto L8e
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r19)
                goto L52
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r19)
                com.marrow2.ui.qbank.play.QBankMcqViewModel r2 = com.marrow2.ui.qbank.play.QBankMcqViewModel.this
                o.NetworkTypeObserverApi31DisplayInfoCallback r2 = com.marrow2.ui.qbank.play.QBankMcqViewModel.AudioAttributesCompatParcelizer(r2)
                com.marrow2.ui.qbank.play.QBankMcqViewModel r6 = com.marrow2.ui.qbank.play.QBankMcqViewModel.this
                java.lang.String r6 = com.marrow2.ui.qbank.play.QBankMcqViewModel.read(r6)
                java.lang.String r7 = ""
                r8 = 0
                if (r6 != 0) goto L3a
                kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r7)
                r6 = r8
            L3a:
                com.marrow2.ui.qbank.play.QBankMcqViewModel r9 = com.marrow2.ui.qbank.play.QBankMcqViewModel.this
                java.lang.String r9 = com.marrow2.ui.qbank.play.QBankMcqViewModel.write(r9)
                if (r9 != 0) goto L46
                kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r7)
                goto L47
            L46:
                r8 = r9
            L47:
                r7 = r0
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r0.read = r5
                java.lang.Object r2 = r2.IconCompatParcelizer(r6, r8, r3, r7)
                if (r2 == r1) goto Lbf
            L52:
                com.marrow2.ui.qbank.play.QBankMcqViewModel r2 = com.marrow2.ui.qbank.play.QBankMcqViewModel.this
                o.getResolutionSize r2 = com.marrow2.ui.qbank.play.QBankMcqViewModel.RemoteActionCompatParcelizer(r2)
                com.marrow2.ui.qbank.play.QBankMcqViewModel r6 = com.marrow2.ui.qbank.play.QBankMcqViewModel.this
                o.getResolutionSize r6 = com.marrow2.ui.qbank.play.QBankMcqViewModel.RemoteActionCompatParcelizer(r6)
                java.lang.Object r6 = r6.IconCompatParcelizer()
                o.DataSourceBitmapLoaderExternalSyntheticLambda0 r6 = (kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0) r6
                java.lang.Object r6 = r6.read()
                r7 = r6
                o.getAddress4 r7 = (kotlin.getAddress4) r7
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                int r6 = r0.AudioAttributesCompatParcelizer
                int r16 = r6 + (-1)
                r17 = 255(0xff, float:3.57E-43)
                o.getAddress4 r5 = kotlin.getAddress4.write(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(r2, r5)
                r2 = r0
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r0.read = r4
                r4 = 700(0x2bc, double:3.46E-321)
                java.lang.Object r2 = kotlin.setCountry.IconCompatParcelizer(r4, r2)
                if (r2 != r1) goto L8e
                goto Lbf
            L8e:
                com.marrow2.ui.qbank.play.QBankMcqViewModel r1 = com.marrow2.ui.qbank.play.QBankMcqViewModel.this
                o.getResolutionSize r1 = com.marrow2.ui.qbank.play.QBankMcqViewModel.RemoteActionCompatParcelizer(r1)
                com.marrow2.ui.qbank.play.QBankMcqViewModel r0 = com.marrow2.ui.qbank.play.QBankMcqViewModel.this
                o.getResolutionSize r0 = com.marrow2.ui.qbank.play.QBankMcqViewModel.RemoteActionCompatParcelizer(r0)
                java.lang.Object r0 = r0.IconCompatParcelizer()
                o.DataSourceBitmapLoaderExternalSyntheticLambda0 r0 = (kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0) r0
                java.lang.Object r0 = r0.read()
                r4 = r0
                o.getAddress4 r4 = (kotlin.getAddress4) r4
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                java.lang.Integer r10 = kotlin.QBankStatsResponse.RemoteActionCompatParcelizer(r3)
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 479(0x1df, float:6.71E-43)
                o.getAddress4 r0 = kotlin.getAddress4.write(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(r1, r0)
                o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
                return r0
            Lbf:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.qbank.play.QBankMcqViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(int i, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QBankMcqViewModel.this.new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        this.AudioAttributesCompatParcelizer.onEvent(BaseGmsClient.read.INSTANCE);
        super.write();
    }
}
