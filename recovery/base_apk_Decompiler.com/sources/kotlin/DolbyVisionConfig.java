package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.MarrowTheme;
import com.marrow.designsystem.theme.ThemeKt;
import com.marrow2.ui.bookmark.detail.BookmarkMainViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.MediaCodecVideoRendererCodecMaxValues;
import kotlin.Metadata;
import kotlin.RecentUpdateSubjectDetails;
import kotlin.VisibilityChecker;
import kotlin.maybeRenotifyRenderedFirstFrame;
import kotlin.setAppId;
import kotlin.updateVideoFrameProcessingOffsetCounters;
import kotlin.withFieldVisibility;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\u00118CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"Lo/DolbyVisionConfig;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "onDestroy", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/marrow2/ui/bookmark/detail/BookmarkMainViewModel;", "IconCompatParcelizer", "Lo/RenewEligible;", "write", "()Lcom/marrow2/ui/bookmark/detail/BookmarkMainViewModel;", "Lo/zzks;", "Lo/zzks;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DolbyVisionConfig extends setHdr10PlusInfoV29 {
    private static char AudioAttributesCompatParcelizer;
    private static char AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static char MediaBrowserCompatItemReceiver;
    private static char RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final zzks IconCompatParcelizer;
    private static final byte[] $$c = {26, 47, -113, 59};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {32, -59, 22, 74, -61, 61, 2, 19, -30, 19, 23, -7, 9, -3, -9, 0, 7, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17};
    private static final int $$e = 140;
    private static final byte[] $$a = {81, 95, TarConstants.LF_LINK, -71, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 49;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[onDisplayInfoChanged.values().length];
            try {
                iArr[onDisplayInfoChanged.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onDisplayInfoChanged.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onDisplayInfoChanged.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onDisplayInfoChanged.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = kotlin.DolbyVisionConfig.$$c
            int r8 = r8 * 3
            int r8 = r8 + 122
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2f
        L16:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DolbyVisionConfig.$$g(byte, short, byte):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int i7 = ~i2;
        int i8 = ~((~i3) | i7 | i6);
        int i9 = ~i6;
        int i10 = (~(i7 | i3)) | (~(i7 | i9)) | (~(i9 | i3));
        int i11 = (~(i9 | i2)) | i3;
        int i12 = i2 + i3 + i4 + ((-946781377) * i) + ((-59450693) * i5);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i2) - 346488832) + (357422218 * i3) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i4) + ((-1205993472) * i) + ((-1651113984) * i5) + ((-884408320) * i13);
        int i15 = ((i2 * 358501064) - 1042343473) + (i3 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (358500791 * i4) + ((-249165559) * i) + (1905372845 * i5) + (i13 * 573505536);
        boolean z2 = false;
        switch (i14 + (i15 * i15 * (-553189376))) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                final updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters = (updateVideoFrameProcessingOffsetCounters) objArr[0];
                final DolbyVisionConfig dolbyVisionConfig = (DolbyVisionConfig) objArr[1];
                getReturnTransition getreturntransition = (getReturnTransition) objArr[2];
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape = (_handleUnrecognizedCharacterEscape) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i16 = 2 % 2;
                toMagicModuleMetaRepoModel.write(getreturntransition, "");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(getreturntransition) ? 4 : 2;
                }
                if ((iIntValue & 19) != 18) {
                    int i17 = MediaBrowserCompatCustomActionResultReceiver + 107;
                    AudioAttributesImplBaseParcelizer = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(z, iIntValue & 1)) {
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesCompatParcelizer(-1361849309, iIntValue, -1, "com.marrow2.ui.bookmark.detail.listing.BookmarkListingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (BookmarkListingFragment.kt:260)");
                    }
                    _handleOddName _handleoddname = getParentFragment.read(getFrameEndSchedulerui.IconCompatParcelizer$default(_handleOddName.INSTANCE, enabled.INSTANCE.write(_handleunrecognizedcharacterescape, enabled.RemoteActionCompatParcelizer).read(), null, 2, null), getreturntransition);
                    withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), false);
                    int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
                    _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
                    _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddname);
                    getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                    if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                        _getBigDecimal.write();
                    }
                    _handleunrecognizedcharacterescape.onPrepareFromMediaId();
                    if (!(!_handleunrecognizedcharacterescape.getParcelableVolumeInfo())) {
                        int i19 = AudioAttributesImplBaseParcelizer + 95;
                        MediaBrowserCompatCustomActionResultReceiver = i19 % 128;
                        int i20 = i19 % 2;
                        _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
                    } else {
                        _handleunrecognizedcharacterescape.onPlayFromUri();
                    }
                    _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
                    NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                    NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                    NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                    NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
                    NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                    setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                    if (updatevideoframeprocessingoffsetcounters.IconCompatParcelizer().isEmpty()) {
                        _handleunrecognizedcharacterescape.IconCompatParcelizer(1246111895);
                        colorTransferToString.write(isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), _handleunrecognizedcharacterescape, 6, 0);
                        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    } else {
                        int i21 = AudioAttributesImplBaseParcelizer + 57;
                        MediaBrowserCompatCustomActionResultReceiver = i21 % 128;
                        int i22 = i21 % 2;
                        _handleunrecognizedcharacterescape.IconCompatParcelizer(1244479094);
                        _handleOddName _handleoddnameIconCompatParcelizer$default = isAdded.IconCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                        MethodValueCreatorCompanion methodValueCreatorCompanionAudioAttributesCompatParcelizer = MissingKotlinParameterException.AudioAttributesCompatParcelizer(dolbyVisionConfig.write().AudioAttributesImplApi21Parcelizer(), _handleunrecognizedcharacterescape);
                        int size = updatevideoframeprocessingoffsetcounters.IconCompatParcelizer().size();
                        int iconCompatParcelizer = updatevideoframeprocessingoffsetcounters.getIconCompatParcelizer();
                        List<String> listMediaBrowserCompatMediaItem = updatevideoframeprocessingoffsetcounters.MediaBrowserCompatMediaItem();
                        int mediaBrowserCompatMediaItem = updatevideoframeprocessingoffsetcounters.getMediaBrowserCompatMediaItem();
                        boolean zBooleanValue = ((Boolean) isSetterVisible.AudioAttributesCompatParcelizer(dolbyVisionConfig.write().AudioAttributesImplBaseParcelizer(), _handleunrecognizedcharacterescape, 0).getRemoteActionCompatParcelizer()).booleanValue();
                        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(dolbyVisionConfig);
                        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                        if (!(!zIconCompatParcelizer) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause = new getCreatedOnDateMs() { // from class: o.getFramesWithoutSyncCount
                                @Override // kotlin.getCreatedOnDateMs
                                public final Object invoke() {
                                    return DolbyVisionConfig.RemoteActionCompatParcelizer(this.write);
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                        }
                        getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
                        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(dolbyVisionConfig);
                        boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(updatevideoframeprocessingoffsetcounters);
                        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
                        if ((zIconCompatParcelizer2 | zIconCompatParcelizer3) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause2 = new getAnswerMap() { // from class: o.getRecentFrameOutlierIndex
                                @Override // kotlin.getAnswerMap
                                public final Object invoke(Object obj) {
                                    return DolbyVisionConfig.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, updatevideoframeprocessingoffsetcounters, ((Integer) obj).intValue());
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
                        }
                        getAnswerMap getanswermap = (getAnswerMap) objOnPause2;
                        boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(dolbyVisionConfig);
                        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
                        if (!(!zIconCompatParcelizer4) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                            objOnPause3 = new MagicModuleSubmissionRequestBody() { // from class: o.FixedFrameRateEstimatorMatcher
                                @Override // kotlin.MagicModuleSubmissionRequestBody
                                public final Object invoke(Object obj, Object obj2) {
                                    return DolbyVisionConfig.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (onDisplayInfoChanged) obj, (String) obj2);
                                }
                            };
                            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
                        }
                        removeActivityTransitionUpdates.write(_handleoddnameIconCompatParcelizer$default, methodValueCreatorCompanionAudioAttributesCompatParcelizer, size, iconCompatParcelizer, listMediaBrowserCompatMediaItem, mediaBrowserCompatMediaItem, zBooleanValue, getcreatedondatems, getanswermap, (MagicModuleSubmissionRequestBody) objOnPause3, _handleunrecognizedcharacterescape, (MethodValueCreatorCompanion.IconCompatParcelizer << 3) | 6, 0);
                        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                } else {
                    _handleunrecognizedcharacterescape.onPrepareFromSearch();
                }
                break;
            default:
                final onSetRating onsetrating = (onSetRating) objArr[0];
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape3 = (_handleUnrecognizedCharacterEscape) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i23 = 2 % 2;
                int i24 = AudioAttributesImplBaseParcelizer;
                int i25 = i24 + 91;
                int i26 = i25 % 128;
                MediaBrowserCompatCustomActionResultReceiver = i26;
                int i27 = i25 % 2;
                if ((iIntValue2 & 3) != 2) {
                    int i28 = i26 + 101;
                    AudioAttributesImplBaseParcelizer = i28 % 128;
                    int i29 = i28 % 2;
                    z2 = true;
                } else {
                    int i30 = i24 + 109;
                    MediaBrowserCompatCustomActionResultReceiver = i30 % 128;
                    int i31 = i30 % 2;
                }
                if (_handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(z2, iIntValue2 & 1)) {
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        _validJsonValueList.AudioAttributesCompatParcelizer(-333427308, iIntValue2, -1, "com.marrow2.ui.bookmark.detail.listing.BookmarkListingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookmarkListingFragment.kt:250)");
                    }
                    boolean zIconCompatParcelizer5 = _handleunrecognizedcharacterescape3.IconCompatParcelizer(onsetrating);
                    Object objOnPause4 = _handleunrecognizedcharacterescape3.onPause();
                    if (!(!zIconCompatParcelizer5) || objOnPause4 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause4 = new getCreatedOnDateMs() { // from class: o.MediaCodecVideoRenderer
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return DolbyVisionConfig.AudioAttributesCompatParcelizer(onsetrating);
                            }
                        };
                        _handleunrecognizedcharacterescape3.RemoteActionCompatParcelizer(objOnPause4);
                        int i32 = MediaBrowserCompatCustomActionResultReceiver + 3;
                        AudioAttributesImplBaseParcelizer = i32 % 128;
                        if (i32 % 2 != 0) {
                            int i33 = 3 / 3;
                        }
                    }
                    releasePlaceholderSurface releaseplaceholdersurface = releasePlaceholderSurface.read;
                    JacksonInjectValue.IconCompatParcelizer((getCreatedOnDateMs) objOnPause4, null, false, null, releasePlaceholderSurface.AudioAttributesCompatParcelizer(), _handleunrecognizedcharacterescape3, CpioConstants.C_ISBLK, 14);
                    if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                        int i34 = AudioAttributesImplBaseParcelizer + 105;
                        MediaBrowserCompatCustomActionResultReceiver = i34 % 128;
                        int i35 = i34 % 2;
                        _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    }
                } else {
                    _handleunrecognizedcharacterescape3.onPrepareFromSearch();
                }
                break;
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.DolbyVisionConfig.$$a
            int r8 = r8 * 12
            int r8 = 77 - r8
            int r6 = r6 + 4
            int r7 = r7 * 10
            int r1 = r7 + 34
            byte[] r1 = new byte[r1]
            int r7 = r7 + 33
            r2 = -1
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L31
        L17:
            r3 = r2
        L18:
            int r3 = r3 + 1
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L2a:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L31:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DolbyVisionConfig.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 82
            int r5 = r5 + 4
            int r0 = 28 - r6
            byte[] r1 = kotlin.DolbyVisionConfig.$$d
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DolbyVisionConfig.c(int, short, byte, java.lang.Object[]):void");
    }

    public DolbyVisionConfig() {
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass4(new getCreatedOnDateMs() { // from class: o.getFrameDurationNs
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return DolbyVisionConfig.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        }));
        this.write = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(BookmarkMainViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass3(renewEligibleWrite), new AnonymousClass2(this, renewEligibleWrite));
        this.IconCompatParcelizer = new zzks(new MagicModuleSubmissionRequestBody() { // from class: o.isSynced
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return DolbyVisionConfig.IconCompatParcelizer(this.write, (String) obj, (onDisplayInfoChanged) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: o.DolbyVisionConfig$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/DolbyVisionConfig$read;", "", "<init>", "()V", "Lo/isoColorPrimariesToColorSpace;", "p0", "Lo/DolbyVisionConfig;", "RemoteActionCompatParcelizer", "(Lo/isoColorPrimariesToColorSpace;)Lo/DolbyVisionConfig;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static DolbyVisionConfig RemoteActionCompatParcelizer(isoColorPrimariesToColorSpace p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            DolbyVisionConfig dolbyVisionConfig = new DolbyVisionConfig();
            dolbyVisionConfig.setArguments(p0.write());
            return dolbyVisionConfig;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static final TypeResolutionContext MediaBrowserCompatMediaItem(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 87;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        maybeGetTypeVariable maybegettypevariableRequireActivity = dolbyVisionConfig.requireActivity();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(maybegettypevariableRequireActivity, "");
        maybeGetTypeVariable maybegettypevariable = maybegettypevariableRequireActivity;
        int i4 = AudioAttributesImplBaseParcelizer + 7;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return maybegettypevariable;
    }

    private final BookmarkMainViewModel write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 35;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        BookmarkMainViewModel bookmarkMainViewModel = (BookmarkMainViewModel) this.write.RemoteActionCompatParcelizer();
        int i4 = AudioAttributesImplBaseParcelizer + 41;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return bookmarkMainViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        DolbyVisionConfig dolbyVisionConfig = (DolbyVisionConfig) objArr[0];
        String str = (String) objArr[1];
        onDisplayInfoChanged ondisplayinfochanged = (onDisplayInfoChanged) objArr[2];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        dolbyVisionConfig.write().IconCompatParcelizer(str, ondisplayinfochanged, true);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 27;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return getshowpopup;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 3;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context context = getContext();
        if (context != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 47;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            context.unregisterReceiver(this.IconCompatParcelizer);
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: o.DolbyVisionConfig$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "IconCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$read.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$read = getcreatedondatems;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            cArr3[0] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i7 = $11 + 91;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            int i9 = 58224;
            int i10 = 0;
            while (i10 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                int i11 = (c2 + i9) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ 1193402106669854891L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(MediaBrowserCompatItemReceiver);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetBefore("", 0), View.getDefaultSize(0, 0) + 1504, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, 1322448859, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) RemoteActionCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1504 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, 1322448859, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    int i13 = $11 + 67;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[isstopped.read] = cArr3[0];
            cArr2[isstopped.read + 1] = cArr3[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                i2 = 2;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), 9017 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.argb(0, 0, 0, 0) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX INFO: renamed from: o.DolbyVisionConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$read).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$read = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.DolbyVisionConfig$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "RemoteActionCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs $read = null;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$IconCompatParcelizer);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.DolbyVisionConfig$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ RenewEligible $read;
        private /* synthetic */ Fragment $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$read);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$write.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$write = fragment;
            this.$read = renewEligible;
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Context AudioAttributesCompatParcelizer;
        private /* synthetic */ r8lambdaKUbBm7ckfqTc9QCgukC86fguu4<Intent, ActivityResult> IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ updateVideoFrameProcessingOffsetCounters read;
        private /* synthetic */ MediaCodecVideoRendererCodecMaxValues write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            setAppId.Companion companion = setAppId.INSTANCE;
            this.IconCompatParcelizer.read(setAppId.Companion.write(this.AudioAttributesCompatParcelizer, this.read.getAudioAttributesCompatParcelizer(), "", readBlockToCache.RemoteActionCompatParcelizer, ((MediaCodecVideoRendererCodecMaxValues.IconCompatParcelizer) this.write).read(), null, 32));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(Context context, updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, MediaCodecVideoRendererCodecMaxValues mediaCodecVideoRendererCodecMaxValues, r8lambdaKUbBm7ckfqTc9QCgukC86fguu4<Intent, ActivityResult> r8lambdakubbm7ckfqtc9qcgukc86fguu4, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = context;
            this.read = updatevideoframeprocessingoffsetcounters;
            this.write = mediaCodecVideoRendererCodecMaxValues;
            this.IconCompatParcelizer = r8lambdakubbm7ckfqtc9qcgukc86fguu4;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ Context IconCompatParcelizer;
        private /* synthetic */ MediaCodecVideoRendererCodecMaxValues RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            CmcdConfigurationRequestConfig.read(this.IconCompatParcelizer, ((MediaCodecVideoRendererCodecMaxValues.read) this.RemoteActionCompatParcelizer).write(), 0);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(Context context, MediaCodecVideoRendererCodecMaxValues mediaCodecVideoRendererCodecMaxValues, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = context;
            this.RemoteActionCompatParcelizer = mediaCodecVideoRendererCodecMaxValues;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 123;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cMyPid = (char) (13183 - (Process.myPid() >> 22));
            int i4 = 1649 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 27;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[53], bArr[17], bArr[5], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cMyPid, i4, iLastIndexOf, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c2 = (char) (13183 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1650;
                int iMyPid = (Process.myPid() >> 22) + 26;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr2[65], bArr2[5], bArr2[17], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c2, modifierMetaStateMask, iMyPid, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            int i5 = AudioAttributesImplBaseParcelizer + 121;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b(16 - Drawable.resolveOpacity(0, 0), new char[]{59652, 12073, 17985, 64512, 51281, 23707, 8403, 19759, 37471, 17925, 15106, 12285, 13589, 16229, 64322, 60730}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(15 - ImageFormat.getBitsPerPixel(0), new char[]{20457, 16434, 45423, 57233, 27732, 65142, 32900, 32939, 48670, 59648, 33073, 30328, 24860, 5996, 31145, 46368}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i7 = AudioAttributesImplBaseParcelizer;
            int i8 = i7 + 109;
            MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 107;
            MediaBrowserCompatCustomActionResultReceiver = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 679745397};
                byte[] bArr3 = $$d;
                byte b = bArr3[15];
                byte b2 = bArr3[43];
                Object[] objArr7 = new Object[1];
                c(b, b2, (byte) (b2 | 12), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(bArr3[26], (byte) (bArr3[10] + 1), bArr3[0], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 13183);
                    int i12 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 26;
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr4[65], bArr4[5], bArr4[17], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, i12, tapTimeout, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(Drawable.resolveOpacity(0, 0) + 22, new char[]{8403, 19759, 42504, 41461, 55474, 26626, 34146, 24292, 23560, 18738, 57813, 19661, 40712, 27800, 62179, 18415, 28389, 25854, 43831, 58442, 46210, 25556}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, new char[]{45872, 56666, 42124, 61738, 28132, 159, 62579, 24642, 59353, 3601, 42395, 41281, 14247, 42616, 41729, 25354}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char packedPositionChild = (char) (13182 - ExpandableListView.getPackedPositionChild(0L));
                        int absoluteGravity = 1649 - Gravity.getAbsoluteGravity(0, 0);
                        int iIndexOf = 26 - TextUtils.indexOf("", "", 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        a((byte) 75, bArr5[5], bArr5[17], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionChild, absoluteGravity, iIndexOf, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c3 = (char) (13184 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int fadingEdgeLength = 1649 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 27;
                        byte[] bArr6 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr6[53], bArr6[17], bArr6[5], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c3, fadingEdgeLength, iLastIndexOf2, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
        int i13 = ((int[]) objArr[c])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16781751), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6055, 41 - TextUtils.indexOf((CharSequence) "", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i15 = MediaBrowserCompatCustomActionResultReceiver + 117;
                AudioAttributesImplBaseParcelizer = i15 % 128;
                int i16 = i15 % 2;
                try {
                    Object[] objArr14 = {1934734701, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6030, 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    byte[] bArr7 = $$d;
                    byte b3 = (byte) (bArr7[18] + 1);
                    byte b4 = bArr7[15];
                    Object[] objArr15 = new Object[1];
                    c(b3, b4, b4, objArr15);
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
        if (Build.VERSION.SDK_INT >= 34) {
            Context context = getContext();
            if (context != null) {
                context.registerReceiver(this.IconCompatParcelizer, zzks.write(), 4);
                int i17 = AudioAttributesImplBaseParcelizer + 57;
                MediaBrowserCompatCustomActionResultReceiver = i17 % 128;
                int i18 = i17 % 2;
                return;
            }
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            context2.registerReceiver(this.IconCompatParcelizer, zzks.write());
            int i19 = MediaBrowserCompatCustomActionResultReceiver + 83;
            AudioAttributesImplBaseParcelizer = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        ComposeView composeViewAudioAttributesCompatParcelizer = setBitrateKbps.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(1086818834, true, new MagicModuleSubmissionRequestBody() { // from class: o.HevcConfig
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return DolbyVisionConfig.write(this.AudioAttributesCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return composeViewAudioAttributesCompatParcelizer;
    }

    private static final getShowPopup IconCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
        } else {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
        }
        dolbyVisionConfig.write().AudioAttributesCompatParcelizer(str, str2, true);
        return getShowPopup.INSTANCE;
    }

    private static final getShowPopup MediaBrowserCompatItemReceiver(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 27;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        dolbyVisionConfig.write().onPlayFromMediaId();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 63;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static final getShowPopup IconCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, onDisplayInfoChanged ondisplayinfochanged) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 95;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        dolbyVisionConfig.write().IconCompatParcelizer(ondisplayinfochanged);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 121;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        DolbyVisionConfig dolbyVisionConfig = (DolbyVisionConfig) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        dolbyVisionConfig.write().MediaMetadataCompat();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 125;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return getshowpopup;
    }

    private static final getShowPopup read(DolbyVisionConfig dolbyVisionConfig, ActivityResult activityResult) {
        Intent read;
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(activityResult, "");
        if (activityResult.getRemoteActionCompatParcelizer() == -1) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            if (activityResult.getRead() != null) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 123;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int intExtra = 0;
                if (i4 % 2 == 0 ? (read = activityResult.getRead()) != null : (read = activityResult.getRead()) != null) {
                    intExtra = read.getIntExtra("result_mcq_index", 0);
                }
                dolbyVisionConfig.write().AudioAttributesCompatParcelizer(intExtra);
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 41;
                AudioAttributesImplBaseParcelizer = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return getShowPopup.INSTANCE;
    }

    private static final getShowPopup AudioAttributesImplApi21Parcelizer(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            dolbyVisionConfig.write().handleMediaPlayPauseIfPendingOnHandler();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i3 = AudioAttributesImplBaseParcelizer + 111;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                return getshowpopup;
            }
            throw null;
        }
        dolbyVisionConfig.write().handleMediaPlayPauseIfPendingOnHandler();
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, final DolbyVisionConfig dolbyVisionConfig, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 79;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i3 % 2 != 0 ? (i & 3) != 2 : (i & 4) != 2, i & 1)) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 1;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(310268434, i, -1, "com.marrow2.ui.bookmark.detail.listing.BookmarkListingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookmarkListingFragment.kt:179)");
            }
            String mediaBrowserCompatItemReceiver = updatevideoframeprocessingoffsetcounters.getMediaBrowserCompatItemReceiver();
            isBufferLate write2 = updatevideoframeprocessingoffsetcounters.getWrite();
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(dolbyVisionConfig);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.calculateEarlyTimeUs
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return DolbyVisionConfig.write(this.write);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            handleFrameRendered.write(null, write2, mediaBrowserCompatItemReceiver, (getCreatedOnDateMs) objOnPause, _handleunrecognizedcharacterescape, 0, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
            int i6 = AudioAttributesImplBaseParcelizer + 75;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
        }
        return getShowPopup.INSTANCE;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        DolbyVisionConfig dolbyVisionConfig = (DolbyVisionConfig) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        dolbyVisionConfig.write().onCommand();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 73;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static final getShowPopup RemoteActionCompatParcelizer(updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, final DolbyVisionConfig dolbyVisionConfig, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z;
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 11;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(z, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                int i5 = AudioAttributesImplBaseParcelizer + 23;
                MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
                int i6 = i5 % 2;
                _validJsonValueList.AudioAttributesCompatParcelizer(-1109718393, i, -1, "com.marrow2.ui.bookmark.detail.listing.BookmarkListingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookmarkListingFragment.kt:191)");
            }
            if (updatevideoframeprocessingoffsetcounters.getAudioAttributesImplApi26Parcelizer() == updateVideoFrameProcessingOffsetCounters.read.IconCompatParcelizer) {
                int i7 = AudioAttributesImplBaseParcelizer + 99;
                MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
                int i8 = i7 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(dolbyVisionConfig);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.isLastFrameOutlier
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return DolbyVisionConfig.IconCompatParcelizer(this.write);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                int i9 = MediaBrowserCompatCustomActionResultReceiver + 115;
                AudioAttributesImplBaseParcelizer = i9 % 128;
                int i10 = i9 % 2;
            }
            getScope getscope = getScope.RemoteActionCompatParcelizer;
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            long audioAttributesCompatParcelizer = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesCompatParcelizer();
            MarrowTheme marrowTheme2 = MarrowTheme.INSTANCE;
            long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            MarrowTheme marrowTheme3 = MarrowTheme.INSTANCE;
            long onRemoveQueueItemAt = MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnRemoveQueueItemAt();
            MarrowTheme marrowTheme4 = MarrowTheme.INSTANCE;
            forScope.write(z2, (getAnswerMap) objOnPause, null, false, null, getscope.AudioAttributesCompatParcelizer(onRemoveQueueItemAt, audioAttributesCompatParcelizer, 1.0f, MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getOnStop(), r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, 1.0f, 0L, 0L, 0L, 0L, _handleunrecognizedcharacterescape, 196992, getScope.read, 960), _handleunrecognizedcharacterescape, 0, 28);
            if (!(!_validJsonValueList.AudioAttributesImplApi26Parcelizer())) {
                int i11 = MediaBrowserCompatCustomActionResultReceiver + 57;
                AudioAttributesImplBaseParcelizer = i11 % 128;
                int i12 = i11 % 2;
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    private static final getShowPopup MediaBrowserCompatSearchResultReceiver(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 95;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            dolbyVisionConfig.write().MediaBrowserCompatSearchResultReceiver();
            return getShowPopup.INSTANCE;
        }
        dolbyVisionConfig.write().MediaBrowserCompatSearchResultReceiver();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.getShowPopup AudioAttributesCompatParcelizer(final kotlin.DolbyVisionConfig r26, final kotlin.updateVideoFrameProcessingOffsetCounters r27, kotlin.getViewLifecycleOwnerLiveData r28, kotlin._handleUnrecognizedCharacterEscape r29, int r30) {
        /*
            Method dump skipped, instruction units count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DolbyVisionConfig.AudioAttributesCompatParcelizer(o.DolbyVisionConfig, o.updateVideoFrameProcessingOffsetCounters, o.getViewLifecycleOwnerLiveData, o._handleUnrecognizedCharacterEscape, int):o.getShowPopup");
    }

    private static final getShowPopup IconCompatParcelizer(onSetRating onsetrating) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 81;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (onsetrating != null) {
            int i5 = i2 + 103;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            onsetrating.RemoteActionCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    private static final getShowPopup write(final updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, final DolbyVisionConfig dolbyVisionConfig, final onSetRating onsetrating, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver;
        int i4 = i3 + 9;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 83;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(z, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1994529970, i, -1, "com.marrow2.ui.bookmark.detail.listing.BookmarkListingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (BookmarkListingFragment.kt:176)");
            }
            MarrowTheme marrowTheme = MarrowTheme.INSTANCE;
            pushChargedEvent.write(multiplyFft.AudioAttributesCompatParcelizer(310268434, true, new MagicModuleSubmissionRequestBody() { // from class: o.getMaxInputSize
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return DolbyVisionConfig.IconCompatParcelizer(updatevideoframeprocessingoffsetcounters, dolbyVisionConfig, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), null, multiplyFft.AudioAttributesCompatParcelizer(-333427308, true, new MagicModuleSubmissionRequestBody() { // from class: o.notifyFrameMetadataListener
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return DolbyVisionConfig.AudioAttributesCompatParcelizer(onsetrating, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), multiplyFft.AudioAttributesCompatParcelizer(817057021, true, new getModuleData() { // from class: o.maybeNotifyVideoFrameProcessingOffset
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return DolbyVisionConfig.write(this.IconCompatParcelizer, updatevideoframeprocessingoffsetcounters, (getViewLifecycleOwnerLiveData) obj, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), MarrowTheme.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, MarrowTheme.RemoteActionCompatParcelizer).getAudioAttributesImplBaseParcelizer(), 0L, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED), _handleunrecognizedcharacterescape, 1576326, 34);
            if (!(!_validJsonValueList.AudioAttributesImplApi26Parcelizer())) {
                int i8 = MediaBrowserCompatCustomActionResultReceiver + 31;
                AudioAttributesImplBaseParcelizer = i8 % 128;
                if (i8 % 2 != 0) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    int i9 = 70 / 0;
                } else {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        DolbyVisionConfig dolbyVisionConfig = (DolbyVisionConfig) objArr[0];
        updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters = (updateVideoFrameProcessingOffsetCounters) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 39;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            dolbyVisionConfig.write().AudioAttributesCompatParcelizer(iIntValue);
            if (updatevideoframeprocessingoffsetcounters.getAudioAttributesImplApi26Parcelizer() == updateVideoFrameProcessingOffsetCounters.read.IconCompatParcelizer) {
                _doAddInjectable _doaddinjectableIconCompatParcelizer = dolbyVisionConfig.requireActivity().getSupportFragmentManager().IconCompatParcelizer();
                maybeRenotifyRenderedFirstFrame.Companion companion = maybeRenotifyRenderedFirstFrame.INSTANCE;
                _doaddinjectableIconCompatParcelizer.write(R.id.container, maybeRenotifyRenderedFirstFrame.Companion.RemoteActionCompatParcelizer()).read((String) null).write();
            } else {
                dolbyVisionConfig.write().onFastForward();
                int i3 = AudioAttributesImplBaseParcelizer + 15;
                MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                int i4 = i3 % 2;
            }
            return getShowPopup.INSTANCE;
        }
        dolbyVisionConfig.write().AudioAttributesCompatParcelizer(iIntValue);
        updatevideoframeprocessingoffsetcounters.getAudioAttributesImplApi26Parcelizer();
        updateVideoFrameProcessingOffsetCounters.read readVar = updateVideoFrameProcessingOffsetCounters.read.IconCompatParcelizer;
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        DolbyVisionConfig dolbyVisionConfig = (DolbyVisionConfig) objArr[0];
        onDisplayInfoChanged ondisplayinfochanged = (onDisplayInfoChanged) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 19;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str, "");
        dolbyVisionConfig.write().IconCompatParcelizer(str, ondisplayinfochanged, false);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 7;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return getshowpopup;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        DolbyVisionConfig dolbyVisionConfig = (DolbyVisionConfig) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 57;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        dolbyVisionConfig.write().onCustomAction();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 69;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return getshowpopup;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026c A[PHI: r6 r9
      0x026c: PHI (r6v10 o.getShowPopup) = (r6v9 o.getShowPopup), (r6v13 o.getShowPopup) binds: [B:83:0x026a, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]
      0x026c: PHI (r9v2 java.lang.Object) = (r9v1 java.lang.Object), (r9v7 java.lang.Object) binds: [B:83:0x026a, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0274 A[PHI: r6
      0x0274: PHI (r6v12 o.getShowPopup) = (r6v9 o.getShowPopup), (r6v10 o.getShowPopup), (r6v13 o.getShowPopup) binds: [B:83:0x026a, B:85:0x0272, B:80:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object MediaBrowserCompatCustomActionResultReceiver(java.lang.Object[] r20) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DolbyVisionConfig.MediaBrowserCompatCustomActionResultReceiver(java.lang.Object[]):java.lang.Object");
    }

    private static final getShowPopup RemoteActionCompatParcelizer(final DolbyVisionConfig dolbyVisionConfig, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver;
        int i4 = i3 + 13;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 2) == 2) {
            z = false;
        } else {
            int i5 = i3 + 17;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(z, i & 1)) {
            int i7 = AudioAttributesImplBaseParcelizer + 111;
            MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
            if (i7 % 2 == 0) {
                _validJsonValueList.AudioAttributesImplApi26Parcelizer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!_validJsonValueList.AudioAttributesImplApi26Parcelizer())) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1086818834, i, -1, "com.marrow2.ui.bookmark.detail.listing.BookmarkListingFragment.onCreateView.<anonymous> (BookmarkListingFragment.kt:105)");
            }
            ThemeKt.read((AppTheme) null, true, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-1173150574, true, new MagicModuleSubmissionRequestBody() { // from class: o.getMaxSampleSize
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return DolbyVisionConfig.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 432, 1);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                int i8 = AudioAttributesImplBaseParcelizer + 111;
                MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
                if (i8 % 2 == 0) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                    int i9 = 39 / 0;
                } else {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    public static /* synthetic */ getShowPopup write(DolbyVisionConfig dolbyVisionConfig, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 81;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            read(dolbyVisionConfig, activityResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopup = read(dolbyVisionConfig, activityResult);
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 113;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup read(DolbyVisionConfig dolbyVisionConfig) {
        getShowPopup getshowpopup;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 47;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {dolbyVisionConfig};
        int iWrite = RecentUpdateSubjectDetails.read.write();
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        int iWrite3 = RecentUpdateSubjectDetails.read.write();
        int iWrite4 = RecentUpdateSubjectDetails.read.write();
        if (i3 != 0) {
            getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(objArr, iWrite3, -615147741, 615147745, iWrite2, iWrite4, iWrite);
            int i4 = 70 / 0;
        } else {
            getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(objArr, iWrite3, -615147741, 615147745, iWrite2, iWrite4, iWrite);
        }
        int i5 = AudioAttributesImplBaseParcelizer + 119;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, String str, onDisplayInfoChanged ondisplayinfochanged) {
        getShowPopup getshowpopup;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 51;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int iWrite = RecentUpdateSubjectDetails.read.write();
            getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig, str, ondisplayinfochanged}, RecentUpdateSubjectDetails.read.write(), -434724740, 434724741, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
            int i3 = 91 / 0;
        } else {
            int iWrite2 = RecentUpdateSubjectDetails.read.write();
            getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig, str, ondisplayinfochanged}, RecentUpdateSubjectDetails.read.write(), -434724740, 434724741, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite2);
        }
        int i4 = AudioAttributesImplBaseParcelizer + 31;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup read(updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, DolbyVisionConfig dolbyVisionConfig, getReturnTransition getreturntransition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 55;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {updatevideoframeprocessingoffsetcounters, dolbyVisionConfig, getreturntransition, _handleunrecognizedcharacterescape, Integer.valueOf(i)};
        int iWrite = RecentUpdateSubjectDetails.read.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(objArr, RecentUpdateSubjectDetails.read.write(), 960102170, -960102162, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
        int i5 = AudioAttributesImplBaseParcelizer + 61;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 117;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = RecentUpdateSubjectDetails.read.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig}, RecentUpdateSubjectDetails.read.write(), 282787322, -282787320, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 35;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 49;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iWrite = RecentUpdateSubjectDetails.read.write();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig, _handleunrecognizedcharacterescape, numValueOf}, RecentUpdateSubjectDetails.read.write(), -969047935, 969047942, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite2);
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 3;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup read(updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, DolbyVisionConfig dolbyVisionConfig, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 3;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(updatevideoframeprocessingoffsetcounters, dolbyVisionConfig, _handleunrecognizedcharacterescape, i);
        int i5 = AudioAttributesImplBaseParcelizer + 71;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopupRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(onSetRating onsetrating) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 51;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(onsetrating);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return getshowpopupIconCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup write(DolbyVisionConfig dolbyVisionConfig, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return RemoteActionCompatParcelizer(dolbyVisionConfig, _handleunrecognizedcharacterescape, i);
        }
        RemoteActionCompatParcelizer(dolbyVisionConfig, _handleunrecognizedcharacterescape, i);
        throw null;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 103;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return MediaBrowserCompatItemReceiver(dolbyVisionConfig);
        }
        MediaBrowserCompatItemReceiver(dolbyVisionConfig);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup write(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 29;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(dolbyVisionConfig);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return getshowpopupAudioAttributesImplApi21Parcelizer;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 117;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iWrite = RecentUpdateSubjectDetails.read.write();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig, updatevideoframeprocessingoffsetcounters, numValueOf}, RecentUpdateSubjectDetails.read.write(), -2008705072, 2008705078, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite2);
        int i5 = AudioAttributesImplBaseParcelizer + 39;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, onDisplayInfoChanged ondisplayinfochanged, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int iWrite = RecentUpdateSubjectDetails.read.write();
            throw null;
        }
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig, ondisplayinfochanged, str}, RecentUpdateSubjectDetails.read.write(), -581893827, 581893830, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite2);
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 105;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(dolbyVisionConfig, str, str2);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 79;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return getshowpopupIconCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int iWrite = RecentUpdateSubjectDetails.read.write();
            return (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig}, RecentUpdateSubjectDetails.read.write(), -1656336023, 1656336028, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
        }
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup read(updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, DolbyVisionConfig dolbyVisionConfig, onSetRating onsetrating, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 5;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopupWrite = write(updatevideoframeprocessingoffsetcounters, dolbyVisionConfig, onsetrating, _handleunrecognizedcharacterescape, i);
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 77;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopupWrite;
    }

    public static /* synthetic */ getShowPopup read(DolbyVisionConfig dolbyVisionConfig, onDisplayInfoChanged ondisplayinfochanged) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 107;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(dolbyVisionConfig, ondisplayinfochanged);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 79;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupIconCompatParcelizer;
        }
        throw null;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, DolbyVisionConfig dolbyVisionConfig, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 25;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(updatevideoframeprocessingoffsetcounters, dolbyVisionConfig, _handleunrecognizedcharacterescape, i);
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 69;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return getshowpopupAudioAttributesCompatParcelizer;
        }
        throw null;
    }

    public static /* synthetic */ getShowPopup write(DolbyVisionConfig dolbyVisionConfig, updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 45;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(dolbyVisionConfig, updatevideoframeprocessingoffsetcounters, getviewlifecycleownerlivedata, _handleunrecognizedcharacterescape, i);
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopupAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup MediaBrowserCompatCustomActionResultReceiver(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 109;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            MediaBrowserCompatSearchResultReceiver(dolbyVisionConfig);
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(dolbyVisionConfig);
        int i3 = AudioAttributesImplBaseParcelizer + 25;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            return getshowpopupMediaBrowserCompatSearchResultReceiver;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(onSetRating onsetrating, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 121;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {onsetrating, _handleunrecognizedcharacterescape, Integer.valueOf(i)};
        int iWrite = RecentUpdateSubjectDetails.read.write();
        int iWrite2 = RecentUpdateSubjectDetails.read.write();
        if (i4 != 0) {
            return (getShowPopup) AudioAttributesCompatParcelizer(objArr, RecentUpdateSubjectDetails.read.write(), 189087415, -189087415, iWrite2, RecentUpdateSubjectDetails.read.write(), iWrite);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TypeResolutionContext AudioAttributesImplBaseParcelizer(DolbyVisionConfig dolbyVisionConfig) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 81;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        TypeResolutionContext typeResolutionContextMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(dolbyVisionConfig);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 95;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return typeResolutionContextMediaBrowserCompatMediaItem;
        }
        throw null;
    }

    static {
        AudioAttributesImplApi26Parcelizer = 0;
        read();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatSearchResultReceiver + 41;
        AudioAttributesImplApi26Parcelizer = i % 128;
        int i2 = i % 2;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, String str, onDisplayInfoChanged ondisplayinfochanged) {
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig, str, ondisplayinfochanged}, RecentUpdateSubjectDetails.read.write(), -434724740, 434724741, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    private static final getShowPopup IconCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        Object[] objArr = {dolbyVisionConfig, _handleunrecognizedcharacterescape, Integer.valueOf(i)};
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(objArr, RecentUpdateSubjectDetails.read.write(), -969047935, 969047942, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    private static final getShowPopup AudioAttributesImplApi26Parcelizer(DolbyVisionConfig dolbyVisionConfig) {
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig}, RecentUpdateSubjectDetails.read.write(), -615147741, 615147745, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    private static final getShowPopup IconCompatParcelizer(onSetRating onsetrating, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        Object[] objArr = {onsetrating, _handleunrecognizedcharacterescape, Integer.valueOf(i)};
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(objArr, RecentUpdateSubjectDetails.read.write(), 189087415, -189087415, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    private static final getShowPopup MediaMetadataCompat(DolbyVisionConfig dolbyVisionConfig) {
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig}, RecentUpdateSubjectDetails.read.write(), -1656336023, 1656336028, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, DolbyVisionConfig dolbyVisionConfig, getReturnTransition getreturntransition, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        Object[] objArr = {updatevideoframeprocessingoffsetcounters, dolbyVisionConfig, getreturntransition, _handleunrecognizedcharacterescape, Integer.valueOf(i)};
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(objArr, RecentUpdateSubjectDetails.read.write(), 960102170, -960102162, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    private static final getShowPopup RatingCompat(DolbyVisionConfig dolbyVisionConfig) {
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig}, RecentUpdateSubjectDetails.read.write(), 282787322, -282787320, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    private static final getShowPopup write(DolbyVisionConfig dolbyVisionConfig, updateVideoFrameProcessingOffsetCounters updatevideoframeprocessingoffsetcounters, int i) {
        Object[] objArr = {dolbyVisionConfig, updatevideoframeprocessingoffsetcounters, Integer.valueOf(i)};
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(objArr, RecentUpdateSubjectDetails.read.write(), -2008705072, 2008705078, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    private static final getShowPopup RemoteActionCompatParcelizer(DolbyVisionConfig dolbyVisionConfig, onDisplayInfoChanged ondisplayinfochanged, String str) {
        int iWrite = RecentUpdateSubjectDetails.read.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(new Object[]{dolbyVisionConfig, ondisplayinfochanged, str}, RecentUpdateSubjectDetails.read.write(), -581893827, 581893830, RecentUpdateSubjectDetails.read.write(), RecentUpdateSubjectDetails.read.write(), iWrite);
    }

    static void read() {
        RemoteActionCompatParcelizer = (char) 6556;
        AudioAttributesCompatParcelizer = (char) 20941;
        AudioAttributesImplApi21Parcelizer = (char) 46219;
        MediaBrowserCompatItemReceiver = (char) 16672;
    }
}
