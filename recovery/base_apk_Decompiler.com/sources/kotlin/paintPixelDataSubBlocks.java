package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.learn.video.overlay.OptionItem;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow.ui.adapter.video.timeline.BookmarkTimelineModelController;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.DefaultTrackSelectorExternalSyntheticLambda6;
import kotlin.DvbParserClutDefinition;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.getAutofillClient;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMultiRowAlign;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.setViewportSizeToPhysicalDisplaySize;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 x2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001xB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u000201H\u0016J\b\u00104\u001a\u00020\u001dH\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u000201H\u0016J\u0016\u00107\u001a\u00020\u001d2\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0016J\u0018\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020.H\u0002J\u0010\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020.H\u0016J\b\u0010@\u001a\u00020\u001dH\u0002J\u0010\u0010A\u001a\u00020\u001d2\u0006\u0010B\u001a\u000201H\u0016J\u0010\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020.H\u0016J\b\u0010E\u001a\u00020\u001dH\u0016J\b\u0010F\u001a\u00020\u001dH\u0016J\b\u0010G\u001a\u00020\u001dH\u0016J\b\u0010H\u001a\u00020\u001dH\u0016J\u0010\u0010I\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020.H\u0002J\u0012\u0010J\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010K\u001a\u00020\u001dH\u0016J\b\u0010L\u001a\u00020\u001dH\u0016J\b\u0010M\u001a\u00020.H\u0016J(\u0010N\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020P2\u0006\u0010<\u001a\u0002012\u0006\u0010B\u001a\u0002012\u0006\u0010Q\u001a\u00020,H\u0016J(\u0010R\u001a\u00020\u001d2\u0016\u0010S\u001a\u0012\u0012\u0004\u0012\u00020U0Tj\b\u0012\u0004\u0012\u00020U`V2\u0006\u0010W\u001a\u000201H\u0016J\b\u0010X\u001a\u00020\u001dH\u0016J\b\u0010Y\u001a\u00020\u001dH\u0016J\b\u0010Z\u001a\u00020\u001dH\u0016J\b\u0010[\u001a\u00020\u001dH\u0016J\b\u0010\\\u001a\u00020\u001dH\u0016J\b\u0010]\u001a\u00020\u001dH\u0016J\u0010\u0010^\u001a\u00020\u001d2\u0006\u0010_\u001a\u000201H\u0016J\b\u0010`\u001a\u00020\u001dH\u0016J\b\u0010a\u001a\u00020\u001dH\u0016J\b\u0010b\u001a\u00020\u001dH\u0016J\b\u0010c\u001a\u00020\u001dH\u0016J\b\u0010d\u001a\u00020,H\u0016J\u0013\u0010e\u001a\b\u0012\u0004\u0012\u00020g0fH\u0016¢\u0006\u0002\u0010hJ\b\u0010i\u001a\u00020\u001dH\u0016J\b\u0010j\u001a\u00020\u001dH\u0016J\b\u0010k\u001a\u00020\u001dH\u0016J\b\u0010l\u001a\u00020,H\u0016J\b\u0010m\u001a\u00020\u001dH\u0016J\b\u0010n\u001a\u00020\u001dH\u0014J\b\u0010o\u001a\u00020,H\u0014J\u0010\u0010p\u001a\u00020\u001d2\u0006\u0010q\u001a\u000201H\u0016J\b\u0010r\u001a\u00020\u001dH\u0016J\b\u0010s\u001a\u00020\u001dH\u0014J\u0012\u0010t\u001a\u00020\u001d2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\b\u0010w\u001a\u00020\u001dH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006y"}, d2 = {"Lcom/marrow/ui/activities/learn/video/BookmarkVideoActivity;", "Lcom/marrow/kt/base/BaseDaggerActivity;", "Lcom/marrow/ui/activities/learn/video/BookmarkVideoPresenter;", "Lcom/marrow/ui/activities/learn/video/BookmarkVideoContract$View;", "Lcom/marrow/ui/dialogs/ShowProDialog$Listener;", "Lcom/marrow/ui/fragments/learn/video/VideoFragment5$VideoFragmentInterface;", "<init>", "()V", "videoFragment", "Lcom/marrow/ui/fragments/learn/video/VideoFragment5;", "animator", "Landroid/animation/ValueAnimator;", "timelineController", "Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController;", "getTimelineController", "()Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController;", "setTimelineController", "(Lcom/marrow/ui/adapter/video/timeline/BookmarkTimelineModelController;)V", "developerOptionCheckReceiver", "Lcom/marrow/receivers/video/DevOptionCheckReceiver;", "eventBroadcastReceiver", "Lcom/marrow/receivers/EventBroadcastReceiver;", "binding", "Lcom/marrow/databinding/ActivityBookmarkVideoBinding;", "getBinding", "()Lcom/marrow/databinding/ActivityBookmarkVideoBinding;", "binding$delegate", "Lcom/marrow/kt/base/view_binding/ViewBindingProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setTabletMargins", "addFragmentResultListeners", "applyEdgeToEdgeInsets", "getAppearanceConfig", "Lcom/marrow2/ui/theme/AppearanceConfig;", "showTimelineDetailsOnPlayer", "hideTimelineDetailsOnPlayer", "setSubscriptionProvider", "subscriptionDataProvider", "Lcom/marrow/data/dataprovider/subscription/ISubscriptionDataProvider;", "setConciseModeStatus", "isConciseMode", "", "getCurrentTimelineIndex", "", "selectTimelineId", "currentTimelineId", "", "setTimelineSubtitle", "timelineSubtitle", "hideVideoOverlay", "setTimelineTitle", "timelineTitle", "setTimelineData", "timelines", "", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;", "goToFullVideo", "lessonId", "startTimeSec", "showNextTimelineWatchNextView", "index", "removeAllAnimatorListeners", "toggleBookmarkState", "timelineId", "showDeletedTimelineDialog", "deletedTimelineCount", "setPrimaryColorTheme", "setDarkColorTheme", "showVideoPlayer", "hideVideoPlayer", "scrollToTimeline", "onPostCreate", "showEmulatorError", "showRootedError", "getLayoutId", "loadVideo", "videoInfo", "Lcom/marrow/data/models/content/VideoInfo;", "autoPlay", "showSubjectFiltersDialog", "subjectOptionsList", "Ljava/util/ArrayList;", "Lcom/marrow/ui/activities/learn/video/overlay/OptionItem;", "Lkotlin/collections/ArrayList;", "selectedSubjectId", "sendSuspiciousBroadcast", "hideEmptyView", "showEmptyView", "hideBookmarkListViewElements", "showBookmarkListViewElements", "showProDialog", "setSelectedSubjectFilterName", "filteredSubjectName", "showLoading", "hideLoading", "showNoVideoFoundError", "setVideoContainerHeight", "isFullScreenRequired", "getLocalReceivers", "", "Lcom/marrow/receivers/BaseReceiver;", "()[Lcom/marrow/receivers/BaseReceiver;", "onLearnMore", "onViewPlans", "showDeveloperOptionsWarning", "isAdbServerRunning", "setResultErrorAndFinish", "onDestroy", "isSecureNeeded", "setTotalBookmarksCountText", "bookmarkCountText", "onResume", "onCastDetectedInPresentationMode", "registerPipInterface", "videoStateManager", "Lcom/marrow/interfaces/VideoStateManager;", "launchPlanPurchase", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class paintPixelDataSubBlocks extends parsePaletteSection<DvbParserRegionObject> implements DvbParserClutDefinition.AudioAttributesCompatParcelizer, DefaultTrackSelectorExternalSyntheticLambda6.read, setViewportSizeToPhysicalDisplaySize.read {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer;
    private static boolean MediaDescriptionCompat;
    private static int MediaMetadataCompat;
    private static char[] RatingCompat;
    private static boolean onCommand;
    private static long onCustomAction;
    private static int onPause;
    private static /* synthetic */ isResolutionNotSupported<Object>[] read;
    private ValueAnimator AudioAttributesCompatParcelizer;
    private setViewportSizeToPhysicalDisplaySize MediaBrowserCompatMediaItem;
    private BookmarkTimelineModelController MediaBrowserCompatSearchResultReceiver;
    private static final byte[] $$l = {123, -86, 125, 25};
    private static final int $$o = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {77, 21, 89, -51, -12, 2, 63, -57, -8, 0, 8, -5, 7, TarConstants.LF_CONTIG, -51, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -55, -19, 9, -1, 4, 11, -24, 20, -13, 64, 4, -69, 4, -6, 3, 15, -2, TarConstants.LF_CONTIG, -54, 3, -18, 11, 58, -63, 12, -13, 5, 3, 1, -14, -1, 70, -36, -19, -11, -2, 13, -14, 14, -9, -6, 19, -19, 11, -6, 1, 74, -13, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, 65, -51, -18, 42, -37, -5, -1, 11, -11, -1, 1, 15, 5, 9, -11, 15, 65, -76, 0, 13, -7, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, -12, 2, 63, -57, -8, 0, 8, -5, 7, TarConstants.LF_CONTIG, -51, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -63, 12, -19, 15, -13, 9, 8, -11, 62, -53, -5, -1, -7, 66, -21, -37, -1, -7, TarConstants.LF_GNUTYPE_LONGNAME, -13};
    private static final int $$k = 36;
    private static final byte[] $$d = {61, 46, 102, -127, -12, -3, 4, -4, -8, 12, -14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14};
    private static final int $$e = 7;
    private static int handleMediaPlayPauseIfPendingOnHandler = 0;
    private static int onAddQueueItem = 0;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
    private final setCaptionRowCount write = new setCaptionRowCount(new getCreatedOnDateMs() { // from class: o.DvbParserObjectData
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return paintPixelDataSubBlocks.RemoteActionCompatParcelizer(this.read);
        }
    });
    private final isSpecialNorthAmericanChar MediaBrowserCompatCustomActionResultReceiver = new write();
    private final setSessionInfo RemoteActionCompatParcelizer = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new AudioAttributesImplApi21Parcelizer());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 * 3
            int r8 = 104 - r8
            byte[] r1 = kotlin.paintPixelDataSubBlocks.$$l
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks.$$r(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i | i3);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i6 | i3)) | i10;
        int i13 = (~(i3 | i6 | i)) | (~(i8 | (~i)));
        int i14 = i6 + i + i4 + ((-2005657349) * i5) + (1476006321 * i2);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i6) - 1319501824) + (407026429 * i) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i4) + ((-798228480) * i5) + ((-1404829696) * i2) + ((-1043726336) * i15);
        int i17 = (i6 * 961754349) + 784684277 + (i * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i4 * 961754313) + (i5 * (-1264871149)) + (i2 * 72538105) + (i15 * 798621696);
        switch (i16 + (i17 * i17 * (-1437204480))) {
            case 1:
                return write(objArr);
            case 2:
                return IconCompatParcelizer(objArr);
            case 3:
                return RemoteActionCompatParcelizer(objArr);
            case 4:
                return MediaBrowserCompatItemReceiver(objArr);
            case 5:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 6:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 7:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 8:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 9:
                return MediaBrowserCompatMediaItem(objArr);
            case 10:
                return RatingCompat(objArr);
            case 11:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 12:
                paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
                String str = (String) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i18 = 2 % 2;
                int i19 = onAddQueueItem + 45;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i19 % 128;
                int i20 = i19 % 2;
                ((DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter()).handleMediaPlayPauseIfPendingOnHandler();
                paintpixeldatasubblocks.onMediaButtonEvent();
                LessonVideoActivity.Companion companion = LessonVideoActivity.INSTANCE;
                paintpixeldatasubblocks.startActivity(LessonVideoActivity.Companion.RemoteActionCompatParcelizer(paintpixeldatasubblocks, str, iIntValue, true, 16));
                getLatestBitrateEstimate.MediaDescriptionCompat.read();
                int i21 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 123;
                onAddQueueItem = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 13:
                int i23 = 2 % 2;
                int i24 = onAddQueueItem + 31;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i24 % 128;
                int i25 = i24 % 2;
                return true;
            case 14:
                return MediaMetadataCompat(objArr);
            case 15:
                return MediaDescriptionCompat(objArr);
            default:
                return read(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 119 - r7
            byte[] r0 = kotlin.paintPixelDataSubBlocks.$$d
            int r1 = r5 + 4
            int r6 = 196 - r6
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r5
            r3 = r6
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks.e(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.paintPixelDataSubBlocks.$$j
            int r8 = r8 + 4
            int r7 = r7 + 73
            int r9 = r9 + 5
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L2b
        L10:
            r3 = r2
        L11:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks.h(int, int, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks, int i) {
        int i2 = 2 % 2;
        int i3 = onAddQueueItem + 1;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {paintpixeldatasubblocks, Integer.valueOf(i)};
        IconCompatParcelizer(609427913, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr, zzgk.RemoteActionCompatParcelizer(), -609427911);
        int i5 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 19;
        onAddQueueItem = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 71;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        Dialog dialog = paintpixeldatasubblocks.AudioAttributesImplApi21Parcelizer;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        int i5 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 27;
        onAddQueueItem = i5 % 128;
        int i6 = i5 % 2;
        return dialog;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(onCustomAction ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 63;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(onCustomAction)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.getSize(0), TextUtils.getOffsetAfter("", 0) + 12424, TextUtils.indexOf((CharSequence) "", '0', 0) + 21, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), 1869 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1983509525, false, $$r(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $10 + 19;
                $11 = i6 % 128;
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

    public static final class AudioAttributesImplApi21Parcelizer implements getAnswerMap<paintPixelDataSubBlocks, buildSegmentTemplate> {
        private static buildSegmentTemplate RemoteActionCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks) {
            toMagicModuleMetaRepoModel.write(paintpixeldatasubblocks, "");
            return buildSegmentTemplate.IconCompatParcelizer(SessionDescriptionParser.AudioAttributesCompatParcelizer(paintpixeldatasubblocks));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.buildSegmentTemplate, o.getApplicationLabel] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ buildSegmentTemplate invoke(paintPixelDataSubBlocks paintpixeldatasubblocks) {
            return RemoteActionCompatParcelizer(paintpixeldatasubblocks);
        }
    }

    private void IconCompatParcelizer(BookmarkTimelineModelController bookmarkTimelineModelController) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 19;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(bookmarkTimelineModelController, "");
            this.MediaBrowserCompatSearchResultReceiver = bookmarkTimelineModelController;
        } else {
            toMagicModuleMetaRepoModel.write(bookmarkTimelineModelController, "");
            this.MediaBrowserCompatSearchResultReceiver = bookmarkTimelineModelController;
            int i3 = 13 / 0;
        }
    }

    private BookmarkTimelineModelController accessonBackPresseds1027565324() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 63;
        int i3 = i2 % 128;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3;
        int i4 = i2 % 2;
        BookmarkTimelineModelController bookmarkTimelineModelController = this.MediaBrowserCompatSearchResultReceiver;
        if (bookmarkTimelineModelController == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i5 = i3 + 113;
        onAddQueueItem = i5 % 128;
        int i6 = i5 % 2;
        return bookmarkTimelineModelController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final getShowPopup AudioAttributesImplApi26Parcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 29;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            ((DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter()).MediaMetadataCompat();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 85;
            onAddQueueItem = i3 % 128;
            int i4 = i3 % 2;
            return getshowpopup;
        }
        ((DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter()).MediaMetadataCompat();
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        throw null;
    }

    public static final class write extends isSpecialNorthAmericanChar {
        write() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.isSpecialNorthAmericanChar
        public final void RemoteActionCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "video_screen")) {
                switch (str2.hashCode()) {
                    case -1170715117:
                        if (str2.equals("video_resumed")) {
                            paintPixelDataSubBlocks.this.onPlay();
                            paintPixelDataSubBlocks.this.onMediaButtonEvent();
                            return;
                        }
                        return;
                    case -98659982:
                        if (!str2.equals("video_paused")) {
                            return;
                        }
                        break;
                    case 326212082:
                        if (!str2.equals("video_controller_shown")) {
                            return;
                        }
                        break;
                    case 640345991:
                        if (str2.equals("video_completed")) {
                            ((DvbParserRegionObject) paintPixelDataSubBlocks.this.getMPresenter()).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            return;
                        }
                        return;
                    case 1208296681:
                        if (str2.equals("video_controller_hidden")) {
                            paintPixelDataSubBlocks.this.onPlay();
                            return;
                        }
                        return;
                    default:
                        return;
                }
                paintPixelDataSubBlocks.this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
        }

        @Override // kotlin.isSpecialNorthAmericanChar, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final buildSegmentTemplate accessgetReportFullyDrawnExecutorp() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 79;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        buildSegmentTemplate buildsegmenttemplate = (buildSegmentTemplate) this.RemoteActionCompatParcelizer.read(this, read[0]);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 7;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 == 0) {
            return buildsegmenttemplate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IconCompatParcelizer implements BookmarkTimelineModelController.AudioAttributesCompatParcelizer {
        IconCompatParcelizer() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.marrow.ui.adapter.video.timeline.BookmarkTimelineModelController.AudioAttributesCompatParcelizer
        public final void read(VideoBookmarkTimelineModel videoBookmarkTimelineModel) {
            toMagicModuleMetaRepoModel.write(videoBookmarkTimelineModel, "");
            ((DvbParserRegionObject) paintPixelDataSubBlocks.this.getMPresenter()).write(videoBookmarkTimelineModel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.marrow.ui.adapter.video.timeline.BookmarkTimelineModelController.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(VideoBookmarkTimelineModel videoBookmarkTimelineModel) {
            toMagicModuleMetaRepoModel.write(videoBookmarkTimelineModel, "");
            ((DvbParserRegionObject) paintPixelDataSubBlocks.this.getMPresenter()).RemoteActionCompatParcelizer(videoBookmarkTimelineModel);
        }
    }

    private static void f(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = RatingCompat;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44861 - ImageFormat.getBitsPerPixel(0)), Color.red(0) + 18944, (ViewConfiguration.getEdgeSlop() >> 16) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(MediaMetadataCompat)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19033, 75 - ExpandableListView.getPackedPositionGroup(0L), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i4 = -1593953308;
        if (onCommand) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11439, 14 - View.getDefaultSize(0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i4 = -1593953308;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!MediaDescriptionCompat) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i5 = $10 + 27;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i7 = $10 + 49;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i9 = $11 + 51;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11439 - View.MeasureSpec.makeMeasureSpec(0, 0), 15 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    public static final class AudioAttributesImplApi26Parcelizer extends AnimatorListenerAdapter {
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ VideoBookmarkTimelineModel write;

        AudioAttributesImplApi26Parcelizer(VideoBookmarkTimelineModel videoBookmarkTimelineModel, int i) {
            this.write = videoBookmarkTimelineModel;
            this.RemoteActionCompatParcelizer = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            super.onAnimationEnd(animator);
            ((DvbParserRegionObject) paintPixelDataSubBlocks.this.getMPresenter()).write(this.write);
            paintPixelDataSubBlocks.AudioAttributesCompatParcelizer(paintPixelDataSubBlocks.this, this.RemoteActionCompatParcelizer);
        }
    }

    public static final class AudioAttributesCompatParcelizer implements selectVideoTrack {
        AudioAttributesCompatParcelizer() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.selectVideoTrack
        public final void read() {
            ((DvbParserRegionObject) paintPixelDataSubBlocks.this.getMPresenter()).MediaBrowserCompatMediaItem();
            Object[] objArr = {paintPixelDataSubBlocks.this};
            ((Dialog) paintPixelDataSubBlocks.IconCompatParcelizer(-1778858172, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr, zzgk.RemoteActionCompatParcelizer(), 1778858172)).dismiss();
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int endTime = 0;
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int i = 2 % 2;
        List<? extends VideoBookmarkTimelineModel> currentData = paintpixeldatasubblocks.accessonBackPresseds1027565324().getCurrentData();
        if (currentData != null) {
            int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 83;
            onAddQueueItem = i2 % 128;
            int i3 = i2 % 2;
            VideoBookmarkTimelineModel videoBookmarkTimelineModel = currentData.get(paintpixeldatasubblocks.accessonBackPresseds1027565324().getCurrentSelectedPosition());
            if (videoBookmarkTimelineModel != null) {
                int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 41;
                onAddQueueItem = i4 % 128;
                int i5 = i4 % 2;
                String lessonId = videoBookmarkTimelineModel.getLessonId();
                if (videoBookmarkTimelineModel.getEndTime() <= 0) {
                    int i6 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 21;
                    onAddQueueItem = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    endTime = videoBookmarkTimelineModel.getEndTime();
                }
                Object[] objArr2 = {paintpixeldatasubblocks, lessonId, Integer.valueOf(endTime)};
                IconCompatParcelizer(-887708716, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr2, zzgk.RemoteActionCompatParcelizer(), 887708728);
                return getShowPopup.INSTANCE;
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void MediaBrowserCompatItemReceiver(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 19;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        ((DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter()).onPause();
        int i4 = onAddQueueItem + 57;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final getShowPopup AudioAttributesImplApi21Parcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 41;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        paintpixeldatasubblocks.accessaddObserverForBackInvoker();
        paintpixeldatasubblocks.onBackPressed();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = onAddQueueItem + 9;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static final getShowPopup MediaBrowserCompatMediaItem(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 97;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        paintpixeldatasubblocks.onMediaButtonEvent();
        paintpixeldatasubblocks.onPlay();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = onAddQueueItem + 65;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    @Override // kotlin.parsePaletteSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1
      0x0028: PHI (r1v6 o.paintPixelDataSubBlocks) = (r1v5 o.paintPixelDataSubBlocks), (r1v9 o.paintPixelDataSubBlocks) binds: [B:8:0x0025, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void _init_lambda5() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.paintPixelDataSubBlocks.onAddQueueItem
            int r1 = r1 + 63
            int r2 = r1 % 128
            kotlin.paintPixelDataSubBlocks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1c
            r1 = r4
            android.content.Context r1 = (android.content.Context) r1
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isTablet(r1)
            r3 = 98
            int r3 = r3 / 0
            if (r2 == 0) goto L4a
            goto L28
        L1c:
            r1 = r4
            android.content.Context r1 = (android.content.Context) r1
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isTablet(r1)
            r2 = r2 ^ 1
            if (r2 == 0) goto L28
            goto L4a
        L28:
            o.buildSegmentTemplate r2 = r4.accessgetReportFullyDrawnExecutorp()
            o.notifyPlaylistError r2 = r2.MediaBrowserCompatCustomActionResultReceiver
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.IconCompatParcelizer()
            java.lang.String r3 = ""
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r3)
            android.view.View r2 = (android.view.View) r2
            kotlin.bytesRead.IconCompatParcelizer(r1, r2)
            o.buildSegmentTemplate r4 = r4.accessgetReportFullyDrawnExecutorp()
            android.widget.LinearLayout r4 = r4.AudioAttributesImplBaseParcelizer
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r4, r3)
            android.view.View r4 = (android.view.View) r4
            kotlin.bytesRead.IconCompatParcelizer(r1, r4)
        L4a:
            int r4 = kotlin.paintPixelDataSubBlocks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r4 = r4 + 31
            int r1 = r4 % 128
            kotlin.paintPixelDataSubBlocks.onAddQueueItem = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L59
            r4 = 92
            int r4 = r4 / 0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks._init_lambda5():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void AudioAttributesCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 115;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        OptionItem optionItem = (OptionItem) StdKeyDeserializerDelegatingKD.IconCompatParcelizer(bundle, "key_selected_item_result", OptionItem.class);
        if (optionItem != null) {
            int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            int i4 = i3 + 9;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
            if (optionItem instanceof OptionItem.SubjectTextOptionItem) {
                int i6 = i3 + 65;
                onAddQueueItem = i6 % 128;
                int i7 = i6 % 2;
                DvbParserRegionObject dvbParserRegionObject = (DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter();
                if (i7 == 0) {
                    OptionItem.SubjectTextOptionItem subjectTextOptionItem = (OptionItem.SubjectTextOptionItem) optionItem;
                    dvbParserRegionObject.write(subjectTextOptionItem.getAudioAttributesCompatParcelizer(), subjectTextOptionItem.getIconCompatParcelizer());
                } else {
                    OptionItem.SubjectTextOptionItem subjectTextOptionItem2 = (OptionItem.SubjectTextOptionItem) optionItem;
                    dvbParserRegionObject.write(subjectTextOptionItem2.getAudioAttributesCompatParcelizer(), subjectTextOptionItem2.getIconCompatParcelizer());
                    throw null;
                }
            }
        }
    }

    private final void accessensureViewModelStore() {
        int i = 2 % 2;
        paintPixelDataSubBlocks paintpixeldatasubblocks = this;
        getSupportFragmentManager().IconCompatParcelizer("subject_filter_options", paintpixeldatasubblocks, new _addFields() { // from class: o.parseRegionComposition
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                paintPixelDataSubBlocks.IconCompatParcelizer(this.RemoteActionCompatParcelizer, str, bundle);
            }
        });
        getSupportFragmentManager().IconCompatParcelizer(SmsRetrieverStatusCodes.RemoteActionCompatParcelizer.getWrite(), paintpixeldatasubblocks, new _addFields() { // from class: o.parseObjectData
            @Override // kotlin._addFields
            public final void AudioAttributesCompatParcelizer(String str, Bundle bundle) {
                paintPixelDataSubBlocks.RemoteActionCompatParcelizer(this.write, str, bundle);
            }
        });
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 23;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object write(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 43;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (!(!bundle.getBoolean("positive_key_press"))) {
            int i4 = onAddQueueItem + 105;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                ((DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter()).onAddQueueItem();
                throw null;
            }
            ((DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter()).onAddQueueItem();
        }
        return null;
    }

    private final void _init_lambda4() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 49;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = accessgetReportFullyDrawnExecutorp().MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, false, true, true, 0, 50);
        FrameLayout frameLayout = accessgetReportFullyDrawnExecutorp().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        getHttpMethodString.read((View) frameLayout, true, true, true, true, 0, 48);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 109;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final NavigationBarViewSavedState onAddQueueItem() {
        int i = 2 % 2;
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(CmcdConfigurationRequestConfig.IconCompatParcelizer(), Integer.valueOf(R.attr.colorSurfaceVariant7), Integer.valueOf(R.attr.backgroundColor));
        int i2 = onAddQueueItem + 101;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return navigationBarViewSavedState;
    }

    public final void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 53;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = accessgetReportFullyDrawnExecutorp().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        TextView textView2 = accessgetReportFullyDrawnExecutorp().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(textView, textView2);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 83;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void onPlay() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 95;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = accessgetReportFullyDrawnExecutorp().MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        TextView textView2 = accessgetReportFullyDrawnExecutorp().MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView, textView2);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 115;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(ChunkHolder chunkHolder) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 57;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(chunkHolder, "");
            accessonBackPresseds1027565324().setSubscriptionDataProvider(chunkHolder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(chunkHolder, "");
        accessonBackPresseds1027565324().setSubscriptionDataProvider(chunkHolder);
        int i3 = onAddQueueItem + 111;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void read(boolean z) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 109;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        accessonBackPresseds1027565324().setConciseModeOn(z);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 123;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 17;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        BookmarkTimelineModelController bookmarkTimelineModelControllerAccessonBackPresseds1027565324 = accessonBackPresseds1027565324();
        if (i3 != 0) {
            bookmarkTimelineModelControllerAccessonBackPresseds1027565324.getCurrentSelectedPosition();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int currentSelectedPosition = bookmarkTimelineModelControllerAccessonBackPresseds1027565324.getCurrentSelectedPosition();
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 91;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return currentSelectedPosition;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 53;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            paintpixeldatasubblocks.accessonBackPresseds1027565324().updateTimelineSelection(str);
            return null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        paintpixeldatasubblocks.accessonBackPresseds1027565324().updateTimelineSelection(str);
        throw null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void AudioAttributesImplBaseParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 9;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            accessgetReportFullyDrawnExecutorp().MediaBrowserCompatMediaItem.setText(str);
        } else {
            toMagicModuleMetaRepoModel.write(str, "");
            accessgetReportFullyDrawnExecutorp().MediaBrowserCompatMediaItem.setText(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void onMediaButtonEvent() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 43;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = accessgetReportFullyDrawnExecutorp().onCustomAction;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout);
        accessaddObserverForBackInvoker();
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 1;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void MediaBrowserCompatItemReceiver(String str) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 17;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        accessgetReportFullyDrawnExecutorp().MediaMetadataCompat.setText(str);
        int i4 = onAddQueueItem + 51;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void write(List<VideoBookmarkTimelineModel> list) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 121;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(list, "");
            accessaddObserverForBackInvoker();
            accessonBackPresseds1027565324().resetCurrentSelectedPosition();
            accessonBackPresseds1027565324().setData(toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(list));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(list, "");
        accessaddObserverForBackInvoker();
        accessonBackPresseds1027565324().resetCurrentSelectedPosition();
        accessonBackPresseds1027565324().setData(toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(list));
        int i3 = onAddQueueItem + 49;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class read implements selectTracksForType {
        read() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.selectTracksForType
        public final void write() {
            ((DvbParserRegionObject) paintPixelDataSubBlocks.this.getMPresenter()).onCommand();
        }

        @Override // kotlin.selectTracksForType
        public final void AudioAttributesCompatParcelizer() {
            paintPixelDataSubBlocks paintpixeldatasubblocks = paintPixelDataSubBlocks.this;
            ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
            paintPixelDataSubBlocks paintpixeldatasubblocks2 = paintPixelDataSubBlocks.this;
            String string = paintpixeldatasubblocks2.getString(R.string.blog_url);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            paintpixeldatasubblocks.startActivityForResult(ResolvableApiException.Companion.read(paintpixeldatasubblocks2, new canceledPendingResult(string, "Marrow", null, 4, null)), 123);
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(final int i) {
        int i2 = 2 % 2;
        int i3 = onAddQueueItem + 31;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            accessonBackPresseds1027565324().getCurrentData();
            throw null;
        }
        List<? extends VideoBookmarkTimelineModel> currentData = accessonBackPresseds1027565324().getCurrentData();
        if (i > (currentData != null ? IntermediateLoginResponseBody.write((List) currentData) : 0)) {
            int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 37;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
            ConstraintLayout constraintLayout = accessgetReportFullyDrawnExecutorp().onCustomAction;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
            ConstraintLayout constraintLayout2 = accessgetReportFullyDrawnExecutorp().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
            PlayerControlViewExternalSyntheticLambda1.write(constraintLayout2);
            ConstraintLayout constraintLayout3 = accessgetReportFullyDrawnExecutorp().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout3, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout3);
            int i6 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 27;
            onAddQueueItem = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        List<? extends VideoBookmarkTimelineModel> currentData2 = accessonBackPresseds1027565324().getCurrentData();
        if (currentData2 != null) {
            int i7 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 97;
            onAddQueueItem = i7 % 128;
            int i8 = i7 % 2;
            final VideoBookmarkTimelineModel videoBookmarkTimelineModel = currentData2.get(i);
            if (videoBookmarkTimelineModel != null) {
                ConstraintLayout constraintLayout4 = accessgetReportFullyDrawnExecutorp().onCustomAction;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout4, "");
                PlayerControlViewExternalSyntheticLambda1.write(constraintLayout4);
                if (videoBookmarkTimelineModel.getTimelineTitle().length() <= 0) {
                    ConstraintLayout constraintLayout5 = accessgetReportFullyDrawnExecutorp().RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout5, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout5);
                    ImageView imageView = accessgetReportFullyDrawnExecutorp().AudioAttributesImplApi26Parcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
                    return;
                }
                accessgetReportFullyDrawnExecutorp().MediaDescriptionCompat.setText(AudioAttributesCompatParcelizer(videoBookmarkTimelineModel.getTimelineTitle()));
                ConstraintLayout constraintLayout6 = accessgetReportFullyDrawnExecutorp().RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout6, "");
                PlayerControlViewExternalSyntheticLambda1.write(constraintLayout6);
                ImageView imageView2 = accessgetReportFullyDrawnExecutorp().AudioAttributesImplApi26Parcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
                PlayerControlViewExternalSyntheticLambda1.write(imageView2);
                ConstraintLayout constraintLayout7 = accessgetReportFullyDrawnExecutorp().RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout7, "");
                RemoteActionCompatParcelizer(constraintLayout7, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.paintPixelDataSubBlock
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        Object[] objArr = {this.RemoteActionCompatParcelizer, videoBookmarkTimelineModel, Integer.valueOf(i)};
                        return (getShowPopup) paintPixelDataSubBlocks.IconCompatParcelizer(1048011111, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr, zzgk.RemoteActionCompatParcelizer(), -1048011102);
                    }
                });
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, accessgetReportFullyDrawnExecutorp().IconCompatParcelizer.getMax());
                valueAnimatorOfInt.setDuration(5000L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.parseDisplayDefinition
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        paintPixelDataSubBlocks.IconCompatParcelizer(this.write, valueAnimator);
                    }
                });
                valueAnimatorOfInt.addListener(new AudioAttributesImplApi26Parcelizer(videoBookmarkTimelineModel, i));
                this.AudioAttributesCompatParcelizer = valueAnimatorOfInt;
                if (valueAnimatorOfInt != null) {
                    valueAnimatorOfInt.start();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final getShowPopup AudioAttributesCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks, VideoBookmarkTimelineModel videoBookmarkTimelineModel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 85;
        onAddQueueItem = i3 % 128;
        if (i3 % 2 == 0) {
            ((DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter()).write(videoBookmarkTimelineModel);
            Object[] objArr = {paintpixeldatasubblocks, Integer.valueOf(i)};
            IconCompatParcelizer(609427913, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr, zzgk.RemoteActionCompatParcelizer(), -609427911);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 115;
            onAddQueueItem = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
            return getshowpopup;
        }
        ((DvbParserRegionObject) paintpixeldatasubblocks.getMPresenter()).write(videoBookmarkTimelineModel);
        Object[] objArr2 = {paintpixeldatasubblocks, Integer.valueOf(i)};
        IconCompatParcelizer(609427913, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr2, zzgk.RemoteActionCompatParcelizer(), -609427911);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void AudioAttributesCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 79;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(valueAnimator, "");
            ProgressBar progressBar = paintpixeldatasubblocks.accessgetReportFullyDrawnExecutorp().IconCompatParcelizer;
            Object animatedValue = valueAnimator.getAnimatedValue();
            toMagicModuleMetaRepoModel.read(animatedValue, "");
            progressBar.setProgress(((Integer) animatedValue).intValue());
            throw null;
        }
        toMagicModuleMetaRepoModel.write(valueAnimator, "");
        ProgressBar progressBar2 = paintpixeldatasubblocks.accessgetReportFullyDrawnExecutorp().IconCompatParcelizer;
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        toMagicModuleMetaRepoModel.read(animatedValue2, "");
        progressBar2.setProgress(((Integer) animatedValue2).intValue());
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 123;
        onAddQueueItem = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 android.animation.ValueAnimator) = (r1v4 android.animation.ValueAnimator), (r1v9 android.animation.ValueAnimator) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void accessaddObserverForBackInvoker() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.paintPixelDataSubBlocks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r1 = r1 + 67
            int r2 = r1 % 128
            kotlin.paintPixelDataSubBlocks.onAddQueueItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            android.animation.ValueAnimator r1 = r3.AudioAttributesCompatParcelizer
            r2 = 31
            int r2 = r2 / 0
            if (r1 == 0) goto L27
            goto L1b
        L17:
            android.animation.ValueAnimator r1 = r3.AudioAttributesCompatParcelizer
            if (r1 == 0) goto L27
        L1b:
            r1.removeAllListeners()
            int r1 = kotlin.paintPixelDataSubBlocks.onAddQueueItem
            int r1 = r1 + 49
            int r2 = r1 % 128
            kotlin.paintPixelDataSubBlocks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r2
            int r1 = r1 % r0
        L27:
            android.animation.ValueAnimator r3 = r3.AudioAttributesCompatParcelizer
            if (r3 == 0) goto L2e
            r3.removeAllUpdateListeners()
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks.accessaddObserverForBackInvoker():void");
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void MediaBrowserCompatCustomActionResultReceiver(String str) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 77;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        accessonBackPresseds1027565324().toggleTimelineBookmarkState(str);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 39;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        paintpixeldatasubblocks.RemoteActionCompatParcelizer();
        paintpixeldatasubblocks.AudioAttributesImplApi21Parcelizer = new DefaultTrackSelector(paintpixeldatasubblocks, iIntValue, paintpixeldatasubblocks.new AudioAttributesCompatParcelizer());
        paintpixeldatasubblocks.AudioAttributesImplApi21Parcelizer.show();
        int i2 = onAddQueueItem + 43;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void MediaSessionCompatResultReceiverWrapper() {
        Window window;
        int i;
        int i2 = 2 % 2;
        int i3 = onAddQueueItem + 41;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            CmcdConfigurationRequestConfig.read(this, R.attr.colorSurfaceVariant5);
            window = getWindow();
            i = 19123;
        } else {
            CmcdConfigurationRequestConfig.read(this, R.attr.colorSurfaceVariant5);
            window = getWindow();
            i = 1024;
        }
        window.clearFlags(i);
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void setSessionImpl() {
        Window window;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 27;
        onAddQueueItem = i3 % 128;
        if (i3 % 2 != 0) {
            CmcdConfigurationRequestConfig.read(this, R.attr.colorSurfaceVariant7);
            window = getWindow();
            i = 12034;
        } else {
            CmcdConfigurationRequestConfig.read(this, R.attr.colorSurfaceVariant7);
            window = getWindow();
            i = 1024;
        }
        window.clearFlags(i);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 123;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void _init_lambda2() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 107;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = accessgetReportFullyDrawnExecutorp().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(frameLayout);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void onFastForward() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 63;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = accessgetReportFullyDrawnExecutorp().RatingCompat;
        if (i3 != 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
            throw null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 45;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/paintPixelDataSubBlocks$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            o.paintPixelDataSubBlocks r1 = (kotlin.paintPixelDataSubBlocks) r1
            r2 = 1
            r6 = r6[r2]
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r2 = 2
            int r3 = r2 % r2
            int r3 = kotlin.paintPixelDataSubBlocks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r3 = r3 + 25
            int r4 = r3 % 128
            kotlin.paintPixelDataSubBlocks.onAddQueueItem = r4
            int r3 = r3 % r2
            r4 = 0
            if (r3 == 0) goto L2d
            o.buildSegmentTemplate r3 = r1.accessgetReportFullyDrawnExecutorp()
            com.airbnb.epoxy.EpoxyRecyclerView r3 = r3.onAddQueueItem
            int r3 = r3.RatingCompat()
            r5 = 18
            int r5 = r5 / r0
            if (r3 != 0) goto L58
            goto L39
        L2d:
            o.buildSegmentTemplate r3 = r1.accessgetReportFullyDrawnExecutorp()
            com.airbnb.epoxy.EpoxyRecyclerView r3 = r3.onAddQueueItem
            int r3 = r3.RatingCompat()
            if (r3 != 0) goto L58
        L39:
            int r3 = kotlin.paintPixelDataSubBlocks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r3 = r3 + 23
            int r5 = r3 % 128
            kotlin.paintPixelDataSubBlocks.onAddQueueItem = r5
            int r3 = r3 % r2
            if (r3 != 0) goto L4e
            o.buildSegmentTemplate r1 = r1.accessgetReportFullyDrawnExecutorp()
            com.airbnb.epoxy.EpoxyRecyclerView r1 = r1.onAddQueueItem
            r1.AudioAttributesImplBaseParcelizer(r6)
            goto L58
        L4e:
            o.buildSegmentTemplate r0 = r1.accessgetReportFullyDrawnExecutorp()
            com.airbnb.epoxy.EpoxyRecyclerView r0 = r0.onAddQueueItem
            r0.AudioAttributesImplBaseParcelizer(r6)
            throw r4
        L58:
            int r6 = kotlin.paintPixelDataSubBlocks.onAddQueueItem
            int r6 = r6 + 81
            int r1 = r6 % 128
            kotlin.paintPixelDataSubBlocks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r1
            int r6 = r6 % r2
            if (r6 != 0) goto L66
            r6 = 64
            int r6 = r6 / r0
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, android.app.Activity
    public final void onPostCreate(Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 83;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            super.onPostCreate(savedInstanceState);
            ((DvbParserRegionObject) getMPresenter()).onCustomAction();
        } else {
            super.onPostCreate(savedInstanceState);
            ((DvbParserRegionObject) getMPresenter()).onCustomAction();
            throw null;
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem + 111;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        paintpixeldatasubblocks.write(R.string.toast_emulator_error);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 49;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 115;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        write(R.string.toast_rooted_device_error);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0da4  */
    /* JADX WARN: Type inference failed for: r8v118, types: [boolean, int] */
    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(com.marrow.data.models.content.VideoInfo r32, java.lang.String r33, java.lang.String r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks.AudioAttributesCompatParcelizer(com.marrow.data.models.content.VideoInfo, java.lang.String, java.lang.String, boolean):void");
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        argCount argcount;
        Object next;
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        ArrayList arrayList = (ArrayList) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(arrayList, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Fragment fragmentFindFragmentByTag = paintpixeldatasubblocks.getSupportFragmentManager().findFragmentByTag("subject_filter_options");
        Object obj = null;
        if (fragmentFindFragmentByTag instanceof argCount) {
            argcount = (argCount) fragmentFindFragmentByTag;
            int i2 = onAddQueueItem + 107;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
            int i3 = i2 % 2;
        } else {
            argcount = null;
        }
        if (argcount != null) {
            int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 99;
            onAddQueueItem = i4 % 128;
            if (i4 % 2 != 0) {
                argcount.dismissAllowingStateLoss();
                obj.hashCode();
                throw null;
            }
            argcount.dismissAllowingStateLoss();
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((OptionItem) next).getIconCompatParcelizer(), (Object) str)) {
                break;
            }
        }
        getMultiRowAlign.Companion companion = getMultiRowAlign.INSTANCE;
        String string = paintpixeldatasubblocks.getString(R.string.btn_filter);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        getMultiRowAlign.Companion.write(string, arrayList, (OptionItem) next, "subject_filter_options", true, null, null, false, false, 276, 340, RendererCapabilities.MODE_SUPPORT_MASK).show(paintpixeldatasubblocks.getSupportFragmentManager(), "subject_filter_options");
        return null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void onPlayFromSearch() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 119;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getProvider getprovider = getProvider.getInstance(this);
        isSpecialNorthAmericanChar.Companion companion = isSpecialNorthAmericanChar.INSTANCE;
        getprovider.AudioAttributesCompatParcelizer(isSpecialNorthAmericanChar.Companion.RemoteActionCompatParcelizer("bookmark_video_activity", "suspicious_event"));
        int i4 = onAddQueueItem + 59;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 21;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = paintpixeldatasubblocks.accessgetReportFullyDrawnExecutorp().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 107;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 81;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = accessgetReportFullyDrawnExecutorp().AudioAttributesCompatParcelizer;
        if (i3 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
            throw null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
        int i4 = onAddQueueItem + 81;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void onCustomAction() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 37;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = accessgetReportFullyDrawnExecutorp().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        int i5 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 75;
        onAddQueueItem = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 37;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        FrameLayout frameLayout = paintpixeldatasubblocks.accessgetReportFullyDrawnExecutorp().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(frameLayout);
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem + 73;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        String string = paintpixeldatasubblocks.getString(R.string.video_for_paid_user);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = paintpixeldatasubblocks.getString(R.string.view_plans);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = paintpixeldatasubblocks.getString(R.string.go_back);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        getAutofillClient.Companion.AudioAttributesCompatParcelizer(null, string, string2, string3, 0, SmsRetrieverStatusCodes.RemoteActionCompatParcelizer, false, false, null, 465).show(paintpixeldatasubblocks.getSupportFragmentManager(), (String) null);
        int i4 = onAddQueueItem + 83;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void write(String str) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 77;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        accessgetReportFullyDrawnExecutorp().MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer.setText(str);
        int i4 = onAddQueueItem + 3;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void ResultReceiver() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 121;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = accessgetReportFullyDrawnExecutorp().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(frameLayout);
        int i4 = onAddQueueItem + 25;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void onPlayFromMediaId() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 19;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout frameLayout = accessgetReportFullyDrawnExecutorp().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 61;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 69;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        write(R.string.toast_lesson_has_no_video);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 5;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 93;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup.LayoutParams layoutParams = accessgetReportFullyDrawnExecutorp().RatingCompat.getLayoutParams();
        layoutParams.height = (int) (getResources().getDisplayMetrics().widthPixels * ((DvbParserRegionObject) getMPresenter()).getMediaMetadataCompat());
        accessgetReportFullyDrawnExecutorp().RatingCompat.setLayoutParams(layoutParams);
        int i4 = onAddQueueItem + 25;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        handlePreambleAddressCode[] handlepreambleaddresscodeArr;
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 + 121;
        onAddQueueItem = i3 % 128;
        if (i3 % 2 != 0) {
            handlepreambleaddresscodeArr = new handlePreambleAddressCode[3];
            handlepreambleaddresscodeArr[1] = paintpixeldatasubblocks.write;
            handlepreambleaddresscodeArr[1] = paintpixeldatasubblocks.MediaBrowserCompatCustomActionResultReceiver;
        } else {
            handlepreambleaddresscodeArr = new handlePreambleAddressCode[]{paintpixeldatasubblocks.write, paintpixeldatasubblocks.MediaBrowserCompatCustomActionResultReceiver};
        }
        int i4 = i2 + 11;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
        return handlepreambleaddresscodeArr;
    }

    @Override // o.DefaultTrackSelectorExternalSyntheticLambda6.read
    public final void onPlayFromUri() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 93;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        startActivity(PlanActivity.AudioAttributesCompatParcelizer.IconCompatParcelizer(this));
        int i4 = onAddQueueItem + 111;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        int i = 2 % 2;
        int i2 = onAddQueueItem + 37;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        paintpixeldatasubblocks.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(paintpixeldatasubblocks, "Pro Subscription Dialog", null));
        int i4 = onAddQueueItem + 55;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void ParcelableVolumeInfo() {
        int i = 2 % 2;
        RemoteActionCompatParcelizer();
        normalizeUndeterminedLanguageToNull normalizeundeterminedlanguagetonull = new normalizeUndeterminedLanguageToNull(this);
        normalizeundeterminedlanguagetonull.RemoteActionCompatParcelizer(new read());
        this.AudioAttributesImplApi21Parcelizer = normalizeundeterminedlanguagetonull;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i2 = onAddQueueItem + 115;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final boolean onPrepare() {
        boolean zAudioAttributesCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 109;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        TrainingApplication trainingApplicationOnRemoveQueueItemAt = onRemoveQueueItemAt();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(trainingApplicationOnRemoveQueueItemAt, "");
        if (i3 != 0) {
            zAudioAttributesCompatParcelizer = requestPlayPauseAccessibilityFocus.AudioAttributesCompatParcelizer(trainingApplicationOnRemoveQueueItemAt);
            int i4 = 56 / 0;
        } else {
            zAudioAttributesCompatParcelizer = requestPlayPauseAccessibilityFocus.AudioAttributesCompatParcelizer(trainingApplicationOnRemoveQueueItemAt);
        }
        int i5 = onAddQueueItem + 75;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return zAudioAttributesCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 47;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        setResult(i2 % 2 == 0 ? 12 : 120);
        finish();
        int i3 = onAddQueueItem + 7;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.parsePaletteSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public final void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 105;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            accessaddObserverForBackInvoker();
            accessgetReportFullyDrawnExecutorp().onAddQueueItem.setAdapter(null);
            this.MediaBrowserCompatMediaItem = null;
            super.onDestroy();
            return;
        }
        accessaddObserverForBackInvoker();
        accessgetReportFullyDrawnExecutorp().onAddQueueItem.setAdapter(null);
        this.MediaBrowserCompatMediaItem = null;
        super.onDestroy();
        throw null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void AudioAttributesImplApi26Parcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 39;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            accessgetReportFullyDrawnExecutorp().MediaBrowserCompatCustomActionResultReceiver.write.setText(str);
            int i3 = 10 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(str, "");
            accessgetReportFullyDrawnExecutorp().MediaBrowserCompatCustomActionResultReceiver.write.setText(str);
        }
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 35;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.parsePaletteSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 101;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 89;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            f(new byte[]{-125, -127, -116, -124, -106, -107, -118, -117, -122, -108, -122, -117, -112, -109, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, 127 - View.resolveSizeAndState(0, 0, 0), null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, new char[]{31515, 15888, 4940, 31608, 55293, 25352, 49166, 57266, 56606, 45446, 27304, 'a', 14251, 2104, 3280, 27369, 34904, 58057, 54632, 52361, 58100, 48486}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 121;
                onAddQueueItem = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i8 = onAddQueueItem + 99;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (AndroidCharacter.getMirror('0') + 4487), TextUtils.indexOf((CharSequence) "", '0', 0) + 6055, (KeyEvent.getMaxKeyCode() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 6030 - View.combineMeasuredStates(0, 0), 16777240 + Color.rgb(0, 0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        onRewind();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void onSkipToPrevious() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 119;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        getLatestBitrateEstimate.AudioAttributesCompatParcelizer.read(((DvbParserRegionObject) getMPresenter()).RatingCompat());
        ((DvbParserRegionObject) getMPresenter()).onMediaButtonEvent();
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 47;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setViewportSizeToPhysicalDisplaySize.read
    public final void write(RtspMediaTrack rtspMediaTrack) {
        int i = 2 % 2;
        if (rtspMediaTrack != null) {
            int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 21;
            onAddQueueItem = i2 % 128;
            int i3 = i2 % 2;
            ((DvbParserRegionObject) getMPresenter()).RemoteActionCompatParcelizer(rtspMediaTrack);
        }
        int i4 = onAddQueueItem + 95;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void onPrepareFromMediaId() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 57;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        String lowerCase = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this, "Pro Subscription Dialog", lowerCase));
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 113;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.parsePaletteSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 37;
            onAddQueueItem = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(new byte[]{-125, -127, -116, -124, -106, -107, -118, -117, -122, -108, -122, -117, -112, -109, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(View.resolveSizeAndState(0, 0, 0), new char[]{31515, 15888, 4940, 31608, 55293, 25352, 49166, 57266, 56606, 45446, 27304, 'a', 14251, 2104, 3280, 27369, 34904, 58057, 54632, 52361, 58100, 48486}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = onAddQueueItem + 125;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 4535), (Process.myTid() >> 22) + 6054, ((byte) KeyEvent.getModifierMetaStateMask()) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6030, (KeyEvent.getMaxKeyCode() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i6 = onAddQueueItem + 37;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|268|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(27:282|33|(2:35|(2:37|(2:39|43)(1:40))(2:41|42))(1:43)|79|281|80|(1:82)|83|84|(4:86|87|(1:89)|90)(19:91|92|271|93|(1:95)|96|97|264|98|(1:100)|101|102|103|(1:105)|106|(1:108)|109|(1:111)|112)|113|(4:116|(3:290|118|(14:289|120|123|(3:125|(3:128|129|126)|296)|130|285|131|(1:133)|134|135|136|275|137|294)(1:295))(3:288|121|(13:291|123|(0)|130|285|131|(0)|134|135|136|275|137|294)(1:293))|292|114)|287|172|(1:174)|175|(3:177|(1:179)|180)(13:182|273|183|184|(1:186)|187|260|188|189|(1:191)|192|(1:194)|195)|181|196|(6:198|199|(1:201)|202|203|204)|205|(1:207)|208|(3:210|(1:212)|213)(14:215|216|(1:218)|219|220|(1:222)|223|262|224|225|(1:227)|228|(1:230)|231)|214|232|(7:234|235|(1:237)|238|239|240|241)(1:297))|47|279|48|(1:50)|51|269|52|(1:54)|55|56|79|281|80|(0)|83|84|(0)(0)|113|(1:114)|287|172|(0)|175|(0)(0)|181|196|(0)|205|(0)|208|(0)(0)|214|232|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x09dd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x09de, code lost:
    
        r8 = new java.lang.Object[1];
        f(new byte[]{-93, -97, -98, -102, -95, -97, -98, -96, -98, -102, -96}, null, 127 - android.text.TextUtils.indexOf("", "", 0), null, r8);
        r4 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x09f7, code lost:
    
        r5 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r5);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r5.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0a0e, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0a12, code lost:
    
        r5 = new java.util.ArrayList(2);
        r5.add(r1);
        r5.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0a21, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0a25, code lost:
    
        if (r1 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0a27, code lost:
    
        r1 = kotlin.startForeground.read((char) (4535 - (android.graphics.PointF.length(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.graphics.PointF.length(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1))), android.text.TextUtils.getCapsMode("", 0, 0) + 6054, 41 - android.graphics.ImageFormat.getBitsPerPixel(0), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0a50, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0a5c, code lost:
    
        r8 = new java.lang.Object[]{-904348707, 81604378625L, r5, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r4 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6030, 24 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
        r5 = kotlin.paintPixelDataSubBlocks.$$j;
        r12 = new java.lang.Object[1];
        h(r5[24], r5[97], (byte) 23, r12);
        r4.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0906 A[Catch: all -> 0x09bf, TryCatch #14 {all -> 0x09bf, blocks: (B:131:0x0900, B:133:0x0906, B:134:0x0932), top: B:285:0x0900, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0ee7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0f3a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x11b1  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04cf A[Catch: all -> 0x09dd, TryCatch #11 {all -> 0x09dd, blocks: (B:80:0x04c9, B:82:0x04cf, B:83:0x0514, B:87:0x052d, B:89:0x0533, B:90:0x057d, B:113:0x0881, B:114:0x0885, B:118:0x0897, B:123:0x08c3, B:126:0x08d0, B:128:0x08d3, B:135:0x0939, B:141:0x09b7, B:143:0x09bd, B:144:0x09be, B:146:0x09c0, B:148:0x09c7, B:149:0x09c8, B:121:0x08ad, B:91:0x0587, B:103:0x06f7, B:105:0x06fd, B:106:0x0745, B:108:0x07d4, B:109:0x0820, B:111:0x0836, B:112:0x087b, B:151:0x09ca, B:153:0x09d1, B:154:0x09d2, B:156:0x09d4, B:158:0x09db, B:159:0x09dc, B:98:0x066c, B:100:0x0680, B:101:0x06ec, B:93:0x0621, B:95:0x0635, B:96:0x0665, B:137:0x093e, B:131:0x0900, B:133:0x0906, B:134:0x0932), top: B:281:0x04c9, outer: #4, inners: #2, #6, #8, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0587 A[Catch: all -> 0x09dd, TRY_LEAVE, TryCatch #11 {all -> 0x09dd, blocks: (B:80:0x04c9, B:82:0x04cf, B:83:0x0514, B:87:0x052d, B:89:0x0533, B:90:0x057d, B:113:0x0881, B:114:0x0885, B:118:0x0897, B:123:0x08c3, B:126:0x08d0, B:128:0x08d3, B:135:0x0939, B:141:0x09b7, B:143:0x09bd, B:144:0x09be, B:146:0x09c0, B:148:0x09c7, B:149:0x09c8, B:121:0x08ad, B:91:0x0587, B:103:0x06f7, B:105:0x06fd, B:106:0x0745, B:108:0x07d4, B:109:0x0820, B:111:0x0836, B:112:0x087b, B:151:0x09ca, B:153:0x09d1, B:154:0x09d2, B:156:0x09d4, B:158:0x09db, B:159:0x09dc, B:98:0x066c, B:100:0x0680, B:101:0x06ec, B:93:0x0621, B:95:0x0635, B:96:0x0665, B:137:0x093e, B:131:0x0900, B:133:0x0906, B:134:0x0932), top: B:281:0x04c9, outer: #4, inners: #2, #6, #8, #14 }] */
    @Override // kotlin.parsePaletteSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.paintPixelDataSubBlocks.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void IconCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 103;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesCompatParcelizer(paintpixeldatasubblocks, valueAnimator);
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 101;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks, VideoBookmarkTimelineModel videoBookmarkTimelineModel, int i) {
        Object[] objArr = {paintpixeldatasubblocks, videoBookmarkTimelineModel, Integer.valueOf(i)};
        return (getShowPopup) IconCompatParcelizer(1048011111, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr, zzgk.RemoteActionCompatParcelizer(), -1048011102);
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 73;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(paintpixeldatasubblocks);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 43;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupMediaBrowserCompatMediaItem;
    }

    public static /* synthetic */ getShowPopup read(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 101;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
            return (getShowPopup) IconCompatParcelizer(857158824, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{paintpixeldatasubblocks}, iRemoteActionCompatParcelizer3, -857158821);
        }
        int iRemoteActionCompatParcelizer4 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer5 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer6 = zzgk.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void write(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 93;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatItemReceiver(paintpixeldatasubblocks);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = onAddQueueItem + 117;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 109;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesCompatParcelizer(paintpixeldatasubblocks, str, bundle);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 55;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 121;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 != 0) {
            AudioAttributesImplApi21Parcelizer(paintpixeldatasubblocks);
            throw null;
        }
        getShowPopup getshowpopupAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(paintpixeldatasubblocks);
        int i3 = onAddQueueItem + 53;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopupAudioAttributesImplApi21Parcelizer;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 43;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(paintpixeldatasubblocks);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 31;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return getshowpopupAudioAttributesImplApi26Parcelizer;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 67;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(-424301059, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{paintpixeldatasubblocks, str, bundle}, iRemoteActionCompatParcelizer3, 424301060);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 77;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    static {
        onPause = 1;
        _init_lambda3();
        read = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(paintPixelDataSubBlocks.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityBookmarkVideoBinding;", 0))};
        IconCompatParcelizer = new RemoteActionCompatParcelizer(null);
        int i = handleMediaPlayPauseIfPendingOnHandler + 97;
        onPause = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Dialog AudioAttributesImplBaseParcelizer(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        return (Dialog) IconCompatParcelizer(-1778858172, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{paintpixeldatasubblocks}, iRemoteActionCompatParcelizer3, 1778858172);
    }

    private static final void write(paintPixelDataSubBlocks paintpixeldatasubblocks, String str, Bundle bundle) {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(-424301059, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{paintpixeldatasubblocks, str, bundle}, iRemoteActionCompatParcelizer3, 424301060);
    }

    private final void AudioAttributesCompatParcelizer(String str, int i) {
        Object[] objArr = {this, str, Integer.valueOf(i)};
        IconCompatParcelizer(-887708716, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr, zzgk.RemoteActionCompatParcelizer(), 887708728);
    }

    private static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(paintPixelDataSubBlocks paintpixeldatasubblocks) {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        return (getShowPopup) IconCompatParcelizer(857158824, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{paintpixeldatasubblocks}, iRemoteActionCompatParcelizer3, -857158821);
    }

    private final void read(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        IconCompatParcelizer(609427913, zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), zzgk.RemoteActionCompatParcelizer(), objArr, zzgk.RemoteActionCompatParcelizer(), -609427911);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 113;
        int i3 = i2 % 128;
        onAddQueueItem = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_bookmark_video;
        }
        throw null;
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity
    public final handlePreambleAddressCode[] MediaBrowserCompatCustomActionResultReceiver() {
        Object[] objArr = {this};
        return (handlePreambleAddressCode[]) IconCompatParcelizer(1406240368, getTaxPercentInfo.AudioAttributesImplApi26Parcelizer(), (-1502216267) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2), (-780679922) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length(), objArr, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1112091476, -1406240361);
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void onCommand() {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(1181731509, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, iRemoteActionCompatParcelizer3, -1181731495);
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity
    public final boolean RatingCompat() {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iAudioAttributesImplApi26Parcelizer = getTaxPercentInfo.AudioAttributesImplApi26Parcelizer();
        return ((Boolean) IconCompatParcelizer(1578862197, getTaxPercentInfo.AudioAttributesImplApi26Parcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, iAudioAttributesImplApi26Parcelizer, -1578862184)).booleanValue();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean onSetPlaybackSpeed() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 69;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    @Override // o.DefaultTrackSelectorExternalSyntheticLambda6.read
    public final void onPrepareFromSearch() {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(-539970529, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, iRemoteActionCompatParcelizer3, 539970533);
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(String str) {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(264325304, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this, str}, iRemoteActionCompatParcelizer3, -264325298);
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void MediaSessionCompatQueueItem() {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(2026599776, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, iRemoteActionCompatParcelizer3, -2026599761);
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(int i) {
        IconCompatParcelizer(-686762045, zzgk.RemoteActionCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 238634778, getTaxPercentInfo.AudioAttributesImplApi26Parcelizer(), new Object[]{this, Integer.valueOf(i)}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 1617547425, 686762055);
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(1190016070, getTaxPercentInfo.AudioAttributesImplApi26Parcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 587783850, -1190016059);
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zzgk.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(148422061, zzgk.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{this}, iRemoteActionCompatParcelizer3, -148422053);
    }

    @Override // o.DvbParserClutDefinition.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(ArrayList<OptionItem> arrayList, String str) {
        int length = (-1843779512) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        int iRemoteActionCompatParcelizer = zzgk.RemoteActionCompatParcelizer();
        IconCompatParcelizer(-1354191954, zzgk.RemoteActionCompatParcelizer(), length, iRemoteActionCompatParcelizer, new Object[]{this, arrayList, str}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1180735256, 1354191959);
    }

    @Override // kotlin.parsePaletteSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 3;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onAddQueueItem + 29;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    static void _init_lambda3() {
        RatingCompat = new char[]{28538, 28431, 28537, 28427, 28428, 28530, 28495, 28424, 28520, 28418, 28425, 28534, 28430, 28504, 28529, 28536, 28528, 28429, 28506, 28423, 28521, 28533, 28518, 28539, 28490, 28491, 28485, 28486, 28488, 28482, 28487, 28489, 28484, 28535, 28493, 28483, 28492, 28422, 28532, 28426, 28494, 28531, 28501};
        MediaMetadataCompat = 411398045;
        MediaDescriptionCompat = true;
        onCommand = true;
        onCustomAction = -855788304375759101L;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        paintPixelDataSubBlocks paintpixeldatasubblocks = (paintPixelDataSubBlocks) objArr[0];
        VideoBookmarkTimelineModel videoBookmarkTimelineModel = (VideoBookmarkTimelineModel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onAddQueueItem + 111;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(paintpixeldatasubblocks, videoBookmarkTimelineModel, iIntValue);
        int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 13;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return getshowpopupAudioAttributesCompatParcelizer;
    }
}
