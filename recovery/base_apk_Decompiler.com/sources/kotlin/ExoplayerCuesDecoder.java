package kotlin;

import com.marrow.R;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.firebase.BuynowBannerResponse;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.api.models.response.plan.PlanDetails;
import com.marrow.data.api.models.response.plan.RenewEligible;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanGroup;
import com.marrow.data.models.plan.PlanList;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.PhoneNumber;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.getLatestBitrateEstimate;
import kotlin.readFromInput;
import kotlin.setFastestInterval;
import kotlin.setWindowColor;
import kotlin.swap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001;B\u0091\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020'H\u0002¢\u0006\u0004\b/\u0010+J\u000f\u00100\u001a\u00020'H\u0002¢\u0006\u0004\b0\u0010+J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020'H\u0002¢\u0006\u0004\b4\u0010+J\u0017\u0010-\u001a\u00020'2\u0006\u0010\u0004\u001a\u000205H\u0016¢\u0006\u0004\b-\u00106J)\u0010-\u001a\u00020'2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\b\u0010\u0006\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b-\u0010:J)\u0010;\u001a\u00020'2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\b\u0010\u0006\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010:J\u0017\u0010-\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020<H\u0002¢\u0006\u0004\b-\u0010=J\u000f\u0010>\u001a\u00020'H\u0016¢\u0006\u0004\b>\u0010+J\u001f\u0010;\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020?2\u0006\u0010\u0006\u001a\u00020?H\u0016¢\u0006\u0004\b;\u0010@J\u000f\u0010A\u001a\u00020'H\u0016¢\u0006\u0004\bA\u0010+J\u001f\u0010A\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010CJ\u000f\u0010D\u001a\u00020'H\u0016¢\u0006\u0004\bD\u0010+J\u000f\u0010;\u001a\u00020'H\u0016¢\u0006\u0004\b;\u0010+J\u000f\u0010E\u001a\u00020'H\u0016¢\u0006\u0004\bE\u0010+J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010+J\u000f\u0010-\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010+J\u0017\u0010-\u001a\u00020'2\u0006\u0010\u0004\u001a\u000201H\u0016¢\u0006\u0004\b-\u0010FJ\u000f\u0010G\u001a\u00020'H\u0016¢\u0006\u0004\bG\u0010+J\u000f\u0010H\u001a\u00020'H\u0016¢\u0006\u0004\bH\u0010+J\u000f\u0010I\u001a\u00020'H\u0002¢\u0006\u0004\bI\u0010+J\u000f\u0010J\u001a\u00020'H\u0002¢\u0006\u0004\bJ\u0010+R\u0014\u0010D\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010A\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010(\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010OR\u0014\u0010;\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010PR\u0014\u0010-\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010H\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0011\u0010V\u001a\u00020\u00188\u0006¢\u0006\u0006\n\u0004\bA\u0010UR\u0011\u0010Y\u001a\u00020\u001a8\u0006¢\u0006\u0006\n\u0004\bW\u0010XR\u0011\u0010E\u001a\u00020\u001c8\u0006¢\u0006\u0006\n\u0004\bD\u0010ZR\u0014\u0010M\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010[R\u0014\u0010G\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010[R\u0016\u00102\u001a\u0004\u0018\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010>\u001a\u0004\u0018\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010]R\u0014\u00100\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010^R\u0013\u0010/\u001a\u0004\u0018\u00010?8\u0006¢\u0006\u0006\n\u0004\bJ\u0010]R\u0014\u0010*\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010^R\u0016\u0010I\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010^R\u0014\u00104\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010bR\u0016\u0010J\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010dR\u001e\u0010f\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010eR\u0018\u0010K\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010gR\u0016\u0010W\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010iR\u0016\u0010\\\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010]R\u0016\u0010`\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010^"}, d2 = {"Lo/ExoplayerCuesDecoder;", "Lo/isRtspStartLine;", "Lo/setWindowColor$IconCompatParcelizer;", "Lo/setWindowColor$AudioAttributesCompatParcelizer;", "p0", "Lo/BundledChunkExtractor;", "p1", "Lo/withLastAdRemoved;", "p2", "Lo/isUnused;", "p3", "Lcom/marrow/data/models/common/ApplicationData;", "p4", "Lo/parseOptionalIntAttr;", "p5", "Lo/getNextChunkIndex;", "p6", "Lo/parseLongAttr;", "p7", "Lo/endsWithLivePostrollPlaceHolder;", "p8", "Lo/getIds;", "p9", "p10", "Lo/getChannel;", "p11", "Lo/ChunkHolder;", "p12", "Lo/isSeekPending;", "p13", "Lo/getPlatform;", "p14", "p15", "Lo/sendTeardownRequest;", "p16", "<init>", "(Lo/setWindowColor$IconCompatParcelizer;Lo/BundledChunkExtractor;Lo/withLastAdRemoved;Lo/isUnused;Lcom/marrow/data/models/common/ApplicationData;Lo/parseOptionalIntAttr;Lo/getNextChunkIndex;Lo/parseLongAttr;Lo/endsWithLivePostrollPlaceHolder;Lo/getIds;Lo/getIds;Lo/getChannel;Lo/ChunkHolder;Lo/isSeekPending;Lo/getPlatform;Lo/getPlatform;Lo/sendTeardownRequest;)V", "Lo/swap$AudioAttributesCompatParcelizer;", "Lo/setWindowColor$read;", "", "RemoteActionCompatParcelizer", "(Lo/swap$AudioAttributesCompatParcelizer;Lo/setWindowColor$read;)V", "onAddQueueItem", "()V", "Lcom/marrow/data/models/common/CourseConfigV2;", "IconCompatParcelizer", "(Lcom/marrow/data/models/common/CourseConfigV2;)V", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "", "MediaDescriptionCompat", "()Z", "onCustomAction", "Lcom/marrow/data/models/plan/PlanList;", "(Lcom/marrow/data/models/plan/PlanList;)V", "", "Lcom/marrow/data/models/plan/PlanGroup;", "Lcom/marrow/data/api/models/response/plan/Coupon;", "([Lcom/marrow/data/models/plan/PlanGroup;Lcom/marrow/data/api/models/response/plan/Coupon;)V", "AudioAttributesCompatParcelizer", "", "(Ljava/lang/Throwable;)V", "RatingCompat", "", "(Ljava/lang/String;Ljava/lang/String;)V", "read", "Lcom/marrow/data/models/user/PhoneNumber;", "(Lcom/marrow/data/models/user/PhoneNumber;Ljava/lang/String;)V", "write", "MediaBrowserCompatItemReceiver", "(Z)V", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi26Parcelizer", "handleMediaPlayPauseIfPendingOnHandler", "onCommand", "onPlayFromMediaId", "Lo/BundledChunkExtractor;", "AudioAttributesImplBaseParcelizer", "Lo/withLastAdRemoved;", "Lo/isUnused;", "Lcom/marrow/data/models/common/ApplicationData;", "onPrepareFromMediaId", "Lo/parseOptionalIntAttr;", "onPlayFromUri", "Lo/getNextChunkIndex;", "Lo/getChannel;", "AudioAttributesImplApi21Parcelizer", "onMediaButtonEvent", "Lo/ChunkHolder;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/isSeekPending;", "Lo/getPlatform;", "onFastForward", "Ljava/lang/String;", "Z", "Lo/TopUserCompanion;", "onPause", "Lo/TopUserCompanion;", "Lo/swap$AudioAttributesCompatParcelizer;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/setWindowColor$read;", "[Lcom/marrow/data/models/plan/PlanGroup;", "onPlay", "Lcom/marrow/data/api/models/response/plan/Coupon;", "", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExoplayerCuesDecoder extends isRtspStartLine<setWindowColor.IconCompatParcelizer> implements setWindowColor.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Coupon onPlayFromMediaId;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final withLastAdRemoved read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final ApplicationData AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getPlatform AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private setWindowColor.read onCommand;
    private final boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private boolean onPause;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private PlanGroup[] onPlay;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final getPlatform MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final boolean onAddQueueItem;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private swap.AudioAttributesCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private String onFastForward;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final String MediaMetadataCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final isUnused RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final String MediaDescriptionCompat;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final ChunkHolder MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final TopUserCompanion onCustomAction;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private int onMediaButtonEvent;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final BundledChunkExtractor write;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final getNextChunkIndex AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final parseOptionalIntAttr IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getChannel AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final isSeekPending MediaBrowserCompatItemReceiver;

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[CourseConfigV2.SupportItem.values().length];
            try {
                iArr[CourseConfigV2.SupportItem.FAQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseConfigV2.SupportItem.GET_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CourseConfigV2.SupportItem.SUPPORT_MAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CourseConfigV2.SupportItem.PRIVACY_POLICY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CourseConfigV2.SupportItem.CANCEL_POLICY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public ExoplayerCuesDecoder(setWindowColor.IconCompatParcelizer iconCompatParcelizer, BundledChunkExtractor bundledChunkExtractor, withLastAdRemoved withlastadremoved, isUnused isunused, ApplicationData applicationData, parseOptionalIntAttr parseoptionalintattr, getNextChunkIndex getnextchunkindex, parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, getChannel getchannel, ChunkHolder chunkHolder, isSeekPending isseekpending, getPlatform getplatform, getPlatform getplatform2, sendTeardownRequest sendteardownrequest) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, iconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        toMagicModuleMetaRepoModel.write(withlastadremoved, "");
        toMagicModuleMetaRepoModel.write(isunused, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(parseoptionalintattr, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(getchannel, "");
        toMagicModuleMetaRepoModel.write(chunkHolder, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(getplatform2, "");
        toMagicModuleMetaRepoModel.write(sendteardownrequest, "");
        this.write = bundledChunkExtractor;
        this.read = withlastadremoved;
        this.RemoteActionCompatParcelizer = isunused;
        this.AudioAttributesCompatParcelizer = applicationData;
        this.IconCompatParcelizer = parseoptionalintattr;
        this.AudioAttributesImplApi26Parcelizer = getnextchunkindex;
        this.AudioAttributesImplApi21Parcelizer = getchannel;
        this.MediaBrowserCompatCustomActionResultReceiver = chunkHolder;
        this.MediaBrowserCompatItemReceiver = isseekpending;
        this.AudioAttributesImplBaseParcelizer = getplatform;
        this.MediaBrowserCompatSearchResultReceiver = getplatform2;
        this.MediaDescriptionCompat = sendteardownrequest.AudioAttributesImplBaseParcelizer("key_referral");
        this.RatingCompat = sendteardownrequest.AudioAttributesImplBaseParcelizer("key_discount");
        this.MediaBrowserCompatMediaItem = sendteardownrequest.write("plan_expanded");
        this.MediaMetadataCompat = sendteardownrequest.AudioAttributesImplBaseParcelizer("plan_id");
        this.onAddQueueItem = sendteardownrequest.write("open_default_plan");
        this.onCustomAction = College.AudioAttributesCompatParcelizer(getAltContact.read(null).plus(setMbbsVerificationYear.RemoteActionCompatParcelizer()));
        this.onMediaButtonEvent = -1;
        this.onFastForward = "";
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer(swap.AudioAttributesCompatParcelizer p0, setWindowColor.read p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p0;
        this.onCommand = p1;
        MediaMetadataCompat();
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPrepare();
        onAddQueueItem();
    }

    private final void onAddQueueItem() {
        CmcdHeadersFactoryCmcdObjectBuilder.read(this.onCustomAction, "plan_list_course_config", new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.SimpleSubtitleDecoder1
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ExoplayerCuesDecoder.write((String) obj2);
            }
        });
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(ExoplayerCuesDecoder.this.AudioAttributesImplBaseParcelizer, new write(ExoplayerCuesDecoder.this, null), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            ExoplayerCuesDecoder.this.IconCompatParcelizer((CourseConfigV2) obj);
            return getShowPopup.INSTANCE;
        }

        static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super CourseConfigV2>, Object> {
            private /* synthetic */ ExoplayerCuesDecoder read;
            private int write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                return this.read.read.IconCompatParcelizer();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(ExoplayerCuesDecoder exoplayerCuesDecoder, SampleVideos<? super write> sampleVideos) {
                super(2, sampleVideos);
                this.read = exoplayerCuesDecoder;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new write(this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super CourseConfigV2> sampleVideos) {
                return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ExoplayerCuesDecoder.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(CourseConfigV2 p0) {
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).handleMediaPlayPauseIfPendingOnHandler();
        onCommand();
        if (MediaDescriptionCompat()) {
            setWindowColor.IconCompatParcelizer iconCompatParcelizer = (setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer;
            CourseConfigV2.PlanScreenConfig planScreenConfig = p0.getPlanScreenConfig();
            String emptyBuyPlanText = planScreenConfig != null ? planScreenConfig.getEmptyBuyPlanText() : null;
            if (emptyBuyPlanText == null) {
                emptyBuyPlanText = "";
            }
            iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(emptyBuyPlanText);
            return;
        }
        MediaBrowserCompatMediaItem();
        onCustomAction();
        handleMediaPlayPauseIfPendingOnHandler();
    }

    private final void MediaMetadataCompat() {
        swap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (audioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.write(new readFromInput.RemoteActionCompatParcelizer() { // from class: o.SubtitleDecoderException
            @Override // o.readFromInput.RemoteActionCompatParcelizer
            public final void read(int i, Object obj) {
                ExoplayerCuesDecoder.read(this.AudioAttributesCompatParcelizer, (PlanGroup) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(ExoplayerCuesDecoder exoplayerCuesDecoder, PlanGroup planGroup) {
        Coupon coupon = new Coupon();
        coupon.setCouponCode(exoplayerCuesDecoder.MediaDescriptionCompat);
        setWindowColor.IconCompatParcelizer iconCompatParcelizer = (setWindowColor.IconCompatParcelizer) exoplayerCuesDecoder.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(planGroup);
        iconCompatParcelizer.write(planGroup, exoplayerCuesDecoder.onPlayFromMediaId, coupon, exoplayerCuesDecoder.MediaBrowserCompatMediaItem, null, false);
    }

    private final void MediaBrowserCompatMediaItem() {
        CmcdHeadersFactoryCmcdObjectBuilder.read(this.onCustomAction, "plan_list_plan_image", new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.getNextEventTimeIndex
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ExoplayerCuesDecoder.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                obj = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(ExoplayerCuesDecoder.this.MediaBrowserCompatSearchResultReceiver, new RemoteActionCompatParcelizer(ExoplayerCuesDecoder.this, null), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((setWindowColor.IconCompatParcelizer) ExoplayerCuesDecoder.this.RemoteActionCompatParcelizer).onCustomAction();
            } else {
                ((setWindowColor.IconCompatParcelizer) ExoplayerCuesDecoder.this.RemoteActionCompatParcelizer).onAddQueueItem();
            }
            return getShowPopup.INSTANCE;
        }

        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
            private int read;
            private /* synthetic */ ExoplayerCuesDecoder write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                return QBankStatsResponse.AudioAttributesCompatParcelizer(this.write.write.accessaddObserverForBackInvoker());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            RemoteActionCompatParcelizer(ExoplayerCuesDecoder exoplayerCuesDecoder, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.write = exoplayerCuesDecoder;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new RemoteActionCompatParcelizer(this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ExoplayerCuesDecoder.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final boolean MediaDescriptionCompat() {
        CourseConfigV2.PlanScreenConfig planScreenConfig = this.read.IconCompatParcelizer().getPlanScreenConfig();
        if (planScreenConfig != null) {
            return planScreenConfig.getShouldShowEmptyPlanScreen();
        }
        return false;
    }

    private final void onCustomAction() {
        if (MediaDescriptionCompat()) {
            return;
        }
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPlay();
        if (this.onMediaButtonEvent == 0) {
            return;
        }
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPrepare();
        if (this.onMediaButtonEvent == 1) {
            setWindowColor.read readVar = this.onCommand;
            setWindowColor.read readVar2 = null;
            if (readVar == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                readVar = null;
            }
            PlanGroup[] planGroupArrAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
            setWindowColor.read readVar3 = this.onCommand;
            if (readVar3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                readVar2 = readVar3;
            }
            AudioAttributesCompatParcelizer(planGroupArrAudioAttributesCompatParcelizer, readVar2.IconCompatParcelizer());
            return;
        }
        this.onMediaButtonEvent = 0;
        accessgetEmptyStatecp<PlanList> accessgetemptystatecpWrite = this.RemoteActionCompatParcelizer.write(this.write.addContentView());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpWrite, "");
        IconCompatParcelizer(accessgetemptystatecpWrite, new read(this), new AudioAttributesImplApi21Parcelizer(this));
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<PlanList, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(PlanList planList) {
            read(planList);
            return getShowPopup.INSTANCE;
        }

        public final void read(PlanList planList) {
            toMagicModuleMetaRepoModel.write(planList, "");
            ((ExoplayerCuesDecoder) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(planList);
        }

        read(Object obj) {
            super(1, obj, ExoplayerCuesDecoder.class, "IconCompatParcelizer", "IconCompatParcelizer(Lcom/marrow/data/models/plan/PlanList;)V", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesImplApi21Parcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Throwable, getShowPopup> {
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            toMagicModuleMetaRepoModel.write(th, "");
            ((ExoplayerCuesDecoder) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(th);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            AudioAttributesCompatParcelizer(th);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi21Parcelizer(Object obj) {
            super(1, obj, ExoplayerCuesDecoder.class, "IconCompatParcelizer", "IconCompatParcelizer(Ljava/lang/Throwable;)V", 0);
        }
    }

    public final void IconCompatParcelizer(final PlanList p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        final PlanGroup[] planGroups = p0.getPlanGroups();
        String str = this.RatingCompat;
        if (str != null && str.length() != 0) {
            accessgetEmptyStatecp<MarrowResponse<Coupon>> accessgetemptystatecpRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.RatingCompat);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, "");
            read(accessgetemptystatecpRemoteActionCompatParcelizer, new getAnswerMap() { // from class: o.getEventTimeCount
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return ExoplayerCuesDecoder.RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0, planGroups, (MarrowResponse) obj);
                }
            });
            return;
        }
        IconCompatParcelizer(planGroups, p0.getDefaultCoupon());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(ExoplayerCuesDecoder exoplayerCuesDecoder, PlanList planList, PlanGroup[] planGroupArr, MarrowResponse marrowResponse) {
        Coupon defaultCoupon;
        int i;
        String errorMessage = "";
        if (marrowResponse instanceof Success) {
            defaultCoupon = (Coupon) ((Success) marrowResponse).getData();
            i = 200;
        } else if (marrowResponse instanceof Failed) {
            Failed failed = (Failed) marrowResponse;
            int errorCode = failed.getErrorCode();
            setWindowColor.IconCompatParcelizer iconCompatParcelizer = (setWindowColor.IconCompatParcelizer) exoplayerCuesDecoder.RemoteActionCompatParcelizer;
            String errorMessage2 = failed.getError().getErrorMessage();
            if (errorMessage2 == null) {
                errorMessage2 = exoplayerCuesDecoder.read(R.string.error_invalid_coupon_default);
            }
            iconCompatParcelizer.AudioAttributesImplBaseParcelizer(errorMessage2);
            errorMessage = failed.getError().getErrorMessage();
            defaultCoupon = planList.getDefaultCoupon();
            i = errorCode;
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            exoplayerCuesDecoder.RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "deeplink_disc_failed");
            defaultCoupon = planList.getDefaultCoupon();
            i = -1;
        }
        getLatestBitrateEstimate.read.RemoteActionCompatParcelizer(exoplayerCuesDecoder.RatingCompat, exoplayerCuesDecoder.MediaMetadataCompat, i, errorMessage);
        exoplayerCuesDecoder.IconCompatParcelizer(planGroupArr, defaultCoupon);
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(PlanGroup[] p0, Coupon p1) {
        PlanGroup planGroup;
        PlanDetails planDetails;
        PlanGroup planGroup2;
        Plan plan;
        this.onMediaButtonEvent = 1;
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(p0, p1);
        AudioAttributesCompatParcelizer(p0, p1);
        String str = this.MediaMetadataCompat;
        if (str == null || str.length() == 0) {
            if (this.onAddQueueItem) {
                if (p0 != null) {
                    for (PlanGroup planGroup3 : p0) {
                        String groupId = planGroup3.getGroupId();
                        RenewEligible renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = this.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) groupId, (Object) ((renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null || (planDetails = renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getPlanDetails()) == null) ? null : planDetails.getRenewGrpId()))) {
                            planGroup = planGroup3;
                            break;
                        }
                    }
                    planGroup = null;
                } else {
                    planGroup = null;
                }
                if (planGroup != null) {
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).write(planGroup, p1, null, true, this.MediaMetadataCompat, true);
                    return;
                }
                return;
            }
            return;
        }
        if (p0 != null) {
            for (PlanGroup planGroup4 : p0) {
                Plan[] plans = planGroup4.getPlans();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(plans, "");
                Plan[] planArr = plans;
                int length = planArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        plan = null;
                        break;
                    }
                    plan = planArr[i];
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) plan.getId(), (Object) this.MediaMetadataCompat)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (plan != null) {
                    planGroup2 = planGroup4;
                    break;
                }
            }
            planGroup2 = null;
        } else {
            planGroup2 = null;
        }
        if (planGroup2 != null) {
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).write(planGroup2, p1, null, true, this.MediaMetadataCompat, false);
        }
    }

    private final void AudioAttributesCompatParcelizer(PlanGroup[] p0, Coupon p1) {
        String couponCode;
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver();
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaDescriptionCompat();
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromUri();
        this.onPlay = p0;
        swap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = null;
        this.onPlayFromMediaId = (p1 == null || !p1.belongsToCourseId(this.write.onRemoveQueueItem())) ? null : p1;
        if (p1 == null || (couponCode = p1.getCouponCode()) == null || couponCode.length() == 0) {
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver();
        } else {
            setWindowColor.IconCompatParcelizer iconCompatParcelizer = (setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer;
            String couponCode2 = p1.getCouponCode();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(couponCode2, "");
            iconCompatParcelizer.MediaBrowserCompatItemReceiver(read(R.string.coupon_auto_applied, couponCode2));
            this.handleMediaPlayPauseIfPendingOnHandler = p1.getCouponType() == 2 && this.write.addContentView();
            handleMediaPlayPauseIfPendingOnHandler();
        }
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).read();
        if (p1 != null) {
            swap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (audioAttributesCompatParcelizer2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                audioAttributesCompatParcelizer2 = null;
            }
            audioAttributesCompatParcelizer2.write(p1);
        }
        PlanGroup[] planGroupArr = this.onPlay;
        if (planGroupArr != null) {
            swap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (audioAttributesCompatParcelizer3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                audioAttributesCompatParcelizer = audioAttributesCompatParcelizer3;
            }
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(planGroupArr);
            if (planGroupArr.length > 2 && !this.onPause) {
                ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onRewind();
            } else {
                ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onCommand();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(Throwable p0) {
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).read();
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver();
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        this.onMediaButtonEvent = -1;
        if (!this.AudioAttributesImplApi21Parcelizer.aC_()) {
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
        } else {
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaDescriptionCompat();
        }
        write(p0, "LOAD_PLAN_ERROR");
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void RatingCompat() {
        this.onPause = true;
        swap.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (audioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.write();
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onCommand();
        isSeekPending isseekpending = this.MediaBrowserCompatItemReceiver;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.write.onRemoveQueueItem();
        getLatestBitrateEstimate.RatingCompat.AudioAttributesCompatParcelizer(p0);
        isSeekPending isseekpending = this.MediaBrowserCompatItemReceiver;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.read(p1, this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void read() {
        int iIconCompatParcelizer;
        PlanGroup[] planGroupArr = this.onPlay;
        if (planGroupArr == null || planGroupArr.length == 0 || (iIconCompatParcelizer = SubtitleDecoderFactory.IconCompatParcelizer(planGroupArr, this.onFastForward)) == -1) {
            return;
        }
        setWindowColor.IconCompatParcelizer iconCompatParcelizer = (setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer;
        PlanGroup[] planGroupArr2 = this.onPlay;
        toMagicModuleMetaRepoModel.write(planGroupArr2);
        iconCompatParcelizer.write(planGroupArr2[iIconCompatParcelizer], this.onPlayFromMediaId, null, this.MediaBrowserCompatMediaItem, null, false);
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void read(final PhoneNumber p0, final String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (!this.AudioAttributesImplApi21Parcelizer.aC_()) {
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem();
            return;
        }
        isSeekPending isseekpending = this.MediaBrowserCompatItemReceiver;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.IconCompatParcelizer(setFastestInterval.IconCompatParcelizer.write), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        LoggedUser loggedUser = this.AudioAttributesCompatParcelizer.getLoggedUser();
        loggedUser.getInfo().setCollege(null);
        loggedUser.getInfo().setPhoneNumber(p0);
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).aj_();
        accessgetEmptyStatecp<MarrowResponse<LoggedUser>> accessgetemptystatecpAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(loggedUser);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.getCues
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ExoplayerCuesDecoder.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p1, p0, (MarrowResponse) obj);
            }
        };
        Object objWrite = accessgetemptystatecpAudioAttributesCompatParcelizer.write(new getSubjectTitle() { // from class: o.setPositionUs
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ExoplayerCuesDecoder.AudioAttributesImplApi26Parcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.write(objWrite);
        IconCompatParcelizer((accessgetEmptyStatecp) objWrite, new getAnswerMap() { // from class: o.SimpleSubtitleDecoder
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ExoplayerCuesDecoder.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        }, new getAnswerMap() { // from class: o.Subtitle
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ExoplayerCuesDecoder.write(this.write, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SchemaCompletionStatusRSModel AudioAttributesImplApi26Parcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (SchemaCompletionStatusRSModel) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SchemaCompletionStatusRSModel RemoteActionCompatParcelizer(ExoplayerCuesDecoder exoplayerCuesDecoder, String str, PhoneNumber phoneNumber, MarrowResponse marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        getLatestBitrateEstimate.RemoteActionCompatParcelizer.IconCompatParcelizer();
        return exoplayerCuesDecoder.AudioAttributesImplApi26Parcelizer.read(str, phoneNumber, "subscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(ExoplayerCuesDecoder exoplayerCuesDecoder) {
        exoplayerCuesDecoder.write.MediaBrowserCompatItemReceiver(System.currentTimeMillis());
        ((setWindowColor.IconCompatParcelizer) exoplayerCuesDecoder.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        ((setWindowColor.IconCompatParcelizer) exoplayerCuesDecoder.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(exoplayerCuesDecoder.read(R.string.thanks_message_on_subscription));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(ExoplayerCuesDecoder exoplayerCuesDecoder, Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        ((setWindowColor.IconCompatParcelizer) exoplayerCuesDecoder.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        exoplayerCuesDecoder.RemoteActionCompatParcelizer(th, "planlist_callback");
        return getShowPopup.INSTANCE;
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void write() {
        onCustomAction();
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() {
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.f_url_faq, Integer.valueOf(this.write.onRemoveQueueItem())), read(R.string.faq_page_title));
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void MediaBrowserCompatItemReceiver() {
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.f_url_refund_policy, Integer.valueOf(this.write.onRemoveQueueItem())), read(R.string.nav_item_refund));
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer("https://www.marrow.com/home/privacy-policy", read(R.string.privacy_page_title));
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer() {
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).write(this.write.AudioAttributesImplApi26Parcelizer());
    }

    @Override // o.setWindowColor.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(boolean p0) {
        if (p0 && this.onMediaButtonEvent == -1) {
            onCustomAction();
        }
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void MediaBrowserCompatSearchResultReceiver() {
        super.MediaBrowserCompatSearchResultReceiver();
        ao_().read();
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void AudioAttributesImplApi26Parcelizer() {
        super.AudioAttributesImplApi26Parcelizer();
        College.AudioAttributesCompatParcelizer(this.onCustomAction, null);
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        RenewEligible renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = this.write.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        if (this.handleMediaPlayPauseIfPendingOnHandler && renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != null) {
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).RatingCompat();
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaMetadataCompat();
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer();
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromSearch();
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).write(renewEligibleR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPrepareFromSearch();
            return;
        }
        if (this.read.IconCompatParcelizer().getDefaultPlanBannerDesign()) {
            return;
        }
        try {
            String str = this.RatingCompat;
            if (str != null && str.length() != 0) {
                return;
            }
            BuynowBannerResponse buynowBannerResponseOnPrepareFromSearch = this.write.onPrepareFromSearch();
            if (buynowBannerResponseOnPrepareFromSearch != null) {
                String title = buynowBannerResponseOnPrepareFromSearch.getTitle();
                String offer_text = buynowBannerResponseOnPrepareFromSearch.getOffer_text();
                String marquee_text = buynowBannerResponseOnPrepareFromSearch.getMarquee_text();
                String str2 = title;
                if (str2 == null || str2.length() == 0) {
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromMediaId();
                } else {
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(title);
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
                }
                String str3 = offer_text;
                if (str3 == null || str3.length() == 0) {
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).MediaMetadataCompat();
                } else {
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).IconCompatParcelizer(offer_text);
                }
                String str4 = marquee_text;
                if (str4 == null || str4.length() == 0) {
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer();
                } else {
                    ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(marquee_text);
                }
                String planGroupId = buynowBannerResponseOnPrepareFromSearch.getPlanGroupId();
                if (planGroupId != null) {
                    this.onFastForward = planGroupId;
                }
            }
        } catch (IOException e) {
            write(e, "BANNER_JSON_ERROR");
        }
    }

    private final void onCommand() {
        CourseConfigV2 courseConfigV2IconCompatParcelizer = this.read.IconCompatParcelizer();
        ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).IconCompatParcelizer(!courseConfigV2IconCompatParcelizer.getSupportViews().isEmpty());
        Iterator<T> it = courseConfigV2IconCompatParcelizer.getSupportViews().iterator();
        while (it.hasNext()) {
            int i = RemoteActionCompatParcelizer.write[((CourseConfigV2.SupportItem) it.next()).ordinal()];
            if (i == 1) {
                ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onFastForward();
            } else if (i == 2) {
                ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onRemoveQueueItem();
            } else if (i == 3) {
                ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPrepareFromUri();
            } else if (i == 4) {
                ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).onPrepareFromMediaId();
            } else {
                if (i != 5) {
                    throw new RenewEligibleCreator();
                }
                ((setWindowColor.IconCompatParcelizer) this.RemoteActionCompatParcelizer).ax_();
            }
        }
    }
}
