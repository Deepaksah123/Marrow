package com.marrow2.ui.main.viewmodel;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import com.marrow2.domain.lesson.model.LessonNavigationCategory;
import com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel;
import dagger.Lazy;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.ApiClientKey;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataBuffer;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MarkIncompleteResponseBody;
import kotlin.Metadata;
import kotlin.NetworkTypeObserver1;
import kotlin.NetworkTypeObserverExternalSyntheticLambda0;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.PlayerControlViewExternalSyntheticLambda0;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.crc32;
import kotlin.disambiguate4gAnd5gNsa;
import kotlin.getAnswerMap;
import kotlin.getDisplaySizeV17;
import kotlin.getLatestBitrateEstimate;
import kotlin.getLocaleLanguageTagV21;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getSelectedIndexInTrackGroup;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.onDataChanged;
import kotlin.onDataRangeChanged;
import kotlin.onDataRangeInserted;
import kotlin.onDataRangeRemoved;
import kotlin.peekChar;
import kotlin.readSynchSafeInt;
import kotlin.readTimestamp;
import kotlin.setCountry;
import kotlin.setMbbsVerificationYear;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setTempDir;
import kotlin.setUpdatedStatus;
import kotlin.skipH265ScalingList;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010!\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010!\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020#¢\u0006\u0004\b!\u0010$J\u0019\u0010&\u001a\u00020\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010\u001dJ\u000f\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010\u001dJ\u000f\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\b*\u0010\u001dJ\u000f\u0010+\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010!\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b!\u0010,J\u000f\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b-\u0010\u001dJ\u000f\u0010.\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010\u001dJ\u000f\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010\u001dJ\u000f\u0010/\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u0010\u001dJ\u000f\u00100\u001a\u00020\u001bH\u0002¢\u0006\u0004\b0\u0010\u001dJ\u000f\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b1\u0010\u001dJ\u000f\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b2\u0010\u001dJ\u000f\u00103\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u0010\u001dJ\u000f\u00104\u001a\u00020\u001bH\u0002¢\u0006\u0004\b4\u0010\u001dJ\u000f\u00105\u001a\u00020\u001bH\u0002¢\u0006\u0004\b5\u0010\u001dJ\u000f\u00106\u001a\u00020\u001bH\u0002¢\u0006\u0004\b6\u0010\u001dJ\u000f\u00107\u001a\u00020\u001bH\u0002¢\u0006\u0004\b7\u0010\u001dJ\u000f\u00108\u001a\u00020\u001bH\u0002¢\u0006\u0004\b8\u0010\u001dJ\u0017\u00102\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020%H\u0002¢\u0006\u0004\b2\u0010'J\u000f\u00109\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u0010\u001dJ\u000f\u0010:\u001a\u00020\u001bH\u0002¢\u0006\u0004\b:\u0010\u001dJ\u0010\u0010;\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b;\u0010,J\u0017\u0010=\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020%H\u0082@¢\u0006\u0004\b?\u0010,J\u0010\u0010:\u001a\u00020@H\u0082@¢\u0006\u0004\b:\u0010,J\u0017\u0010C\u001a\u00020B2\u0006\u0010\u0004\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001bH\u0002¢\u0006\u0004\bE\u0010\u001dJ\u0010\u0010=\u001a\u00020FH\u0082@¢\u0006\u0004\b=\u0010,J\u0010\u0010C\u001a\u00020\u001bH\u0082@¢\u0006\u0004\bC\u0010,J\u000f\u0010;\u001a\u00020\u001bH\u0014¢\u0006\u0004\b;\u0010\u001dR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010GR\u0014\u0010C\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010HR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010GR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010GR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010GR\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010IR\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010JR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010GR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010GR\u0014\u00109\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010KR\u0014\u0010*\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010MR\u0014\u0010)\u001a\u00020F8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010NR.\u0010-\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q\u0012\u0004\u0012\u00020<\u0018\u00010P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010SR1\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q\u0012\u0004\u0012\u00020<\u0018\u00010P0T8\u0007¢\u0006\f\n\u0004\b\u001f\u0010U\u001a\u0004\bC\u0010VR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020W0O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010SR \u00102\u001a\b\u0012\u0004\u0012\u00020W0T8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010U\u001a\u0004\b=\u0010VR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020X0O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010SR \u00100\u001a\b\u0012\u0004\u0012\u00020X0T8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010U\u001a\u0004\b!\u0010VR\u0018\u0010/\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010Z"}, d2 = {"Lcom/marrow2/ui/main/viewmodel/HomeUIActivityViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Ldagger/Lazy;", "Lo/LogLogLevel;", "p0", "Lo/isSeekPending;", "p1", "Lo/peekChar;", "p2", "Lo/getDisplaySizeV17;", "p3", "Lo/readSynchSafeInt;", "p4", "", "p5", "Lo/readTimestamp;", "p6", "Lo/crc32;", "p7", "Lo/skipH265ScalingList;", "p8", "Lo/getPlatform;", "p9", "Lo/POJOPropertyBuilder5;", "p10", "<init>", "(Ldagger/Lazy;Lo/isSeekPending;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ljava/lang/Object;Lo/readTimestamp;Ldagger/Lazy;Ldagger/Lazy;Lo/getPlatform;Lo/POJOPropertyBuilder5;)V", "", "AudioAttributesImplApi26Parcelizer", "()V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "Lo/setTempDir;", "IconCompatParcelizer", "(Lo/setTempDir;)V", "Lo/onDataRangeInserted;", "(Lo/onDataRangeInserted;)V", "", "onCommand", "(Ljava/lang/String;)V", "MediaBrowserCompatSearchResultReceiver", "RatingCompat", "MediaDescriptionCompat", "onPlayFromMediaId", "(Lo/SampleVideos;)Ljava/lang/Object;", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "handleMediaPlayPauseIfPendingOnHandler", "onCustomAction", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onAddQueueItem", "onFastForward", "onMediaButtonEvent", "onPlay", "onPause", "onPrepareFromSearch", "onPrepare", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "write", "", "AudioAttributesCompatParcelizer", "(I)V", "RemoteActionCompatParcelizer", "Lo/NetworkTypeObserverApi31;", "Lo/getLocaleLanguageTagV21;", "Lo/NetworkTypeObserverExternalSyntheticLambda0;", "read", "(Lo/getLocaleLanguageTagV21;)Lo/NetworkTypeObserverExternalSyntheticLambda0;", "onPlayFromSearch", "", "Ldagger/Lazy;", "Lo/isSeekPending;", "Ljava/lang/Object;", "Lo/readTimestamp;", "Lo/getPlatform;", "Lo/onDataRangeRemoved;", "Lo/onDataRangeRemoved;", "Z", "Lo/getResolutionSize;", "Lo/getSubscriptionExpiresOn;", "", "Lo/DataBuffer;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/disambiguate4gAnd5gNsa;", "Lo/onDataRangeChanged;", "Lo/MarkIncompleteResponseBody;", "Lo/MarkIncompleteResponseBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeUIActivityViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getPlatform AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private MarkIncompleteResponseBody handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<disambiguate4gAnd5gNsa> onAddQueueItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Pair<List<DataBuffer>, Integer>> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Lazy<LogLogLevel> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Pair<List<DataBuffer>, Integer>> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final Lazy<peekChar> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final Lazy<readSynchSafeInt> write;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final Lazy<crc32> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean RatingCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final Lazy<skipH265ScalingList> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<onDataRangeChanged> onCustomAction;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<onDataRangeChanged> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final Object MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final Lazy<getDisplaySizeV17> IconCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final readTimestamp AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final onDataRangeRemoved MediaDescriptionCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<disambiguate4gAnd5gNsa> MediaMetadataCompat;

    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        /* synthetic */ Object RemoteActionCompatParcelizer;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeUIActivityViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object write;

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return HomeUIActivityViewModel.this.write(this);
        }
    }

    static final class MediaBrowserCompatMediaItem extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        boolean AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
            return HomeUIActivityViewModel.this.IconCompatParcelizer(this);
        }
    }

    public static final class MediaDescriptionCompat extends getTotalMcq {
        public static int AudioAttributesImplApi26Parcelizer;
        public static int MediaBrowserCompatCustomActionResultReceiver;
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return HomeUIActivityViewModel.this.MediaBrowserCompatCustomActionResultReceiver(this);
        }

        public static int RemoteActionCompatParcelizer() {
            int i = MediaBrowserCompatCustomActionResultReceiver;
            int i2 = i % 6029716;
            MediaBrowserCompatCustomActionResultReceiver = i + 1;
            if (i2 != 0) {
                return AudioAttributesImplApi26Parcelizer;
            }
            int iNextInt = new Random().nextInt(786681020);
            AudioAttributesImplApi26Parcelizer = iNextInt;
            return iNextInt;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[LessonNavigationCategory.values().length];
            try {
                iArr[LessonNavigationCategory.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LessonNavigationCategory.QBANK_INTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LessonNavigationCategory.PRO_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    static final class write extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object IconCompatParcelizer;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.AudioAttributesCompatParcelizer |= Integer.MIN_VALUE;
            return HomeUIActivityViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public HomeUIActivityViewModel(Lazy<LogLogLevel> lazy, isSeekPending isseekpending, Lazy<peekChar> lazy2, Lazy<getDisplaySizeV17> lazy3, Lazy<readSynchSafeInt> lazy4, Object obj, readTimestamp readtimestamp, Lazy<crc32> lazy5, Lazy<skipH265ScalingList> lazy6, getPlatform getplatform, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(lazy, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(lazy2, "");
        toMagicModuleMetaRepoModel.write(lazy3, "");
        toMagicModuleMetaRepoModel.write(lazy4, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        toMagicModuleMetaRepoModel.write(lazy5, "");
        toMagicModuleMetaRepoModel.write(lazy6, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.RemoteActionCompatParcelizer = lazy;
        this.read = isseekpending;
        this.AudioAttributesCompatParcelizer = lazy2;
        this.IconCompatParcelizer = lazy3;
        this.write = lazy4;
        this.MediaBrowserCompatItemReceiver = obj;
        this.AudioAttributesImplApi26Parcelizer = readtimestamp;
        this.AudioAttributesImplApi21Parcelizer = lazy5;
        this.MediaBrowserCompatCustomActionResultReceiver = lazy6;
        this.AudioAttributesImplBaseParcelizer = getplatform;
        onDataRangeRemoved.Companion companion = onDataRangeRemoved.INSTANCE;
        this.MediaDescriptionCompat = onDataRangeRemoved.Companion.RemoteActionCompatParcelizer(pOJOPropertyBuilder5);
        getResolutionSize<Pair<List<DataBuffer>, Integer>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(null);
        this.MediaBrowserCompatMediaItem = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<disambiguate4gAnd5gNsa> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new disambiguate4gAnd5gNsa(null, false, false, false, null, false, false, null, false, false, false, false, false, null, false, false, false, false, false, false, 1048575, null));
        this.MediaMetadataCompat = getresolutionsizeRemoteActionCompatParcelizer2;
        this.onAddQueueItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<onDataRangeChanged> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(onDataRangeChanged.AudioAttributesCompatParcelizer.INSTANCE);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.onCustomAction = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        AudioAttributesImplApi26Parcelizer();
    }

    public final setUpdatedStatus<Pair<List<DataBuffer>, Integer>> read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final setUpdatedStatus<disambiguate4gAnd5gNsa> AudioAttributesCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public final setUpdatedStatus<onDataRangeChanged> IconCompatParcelizer() {
        return this.onCustomAction;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplBaseParcelizer();
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatItemReceiver();
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object obj2 = HomeUIActivityViewModel.this.MediaBrowserCompatItemReceiver;
                MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this;
                this.AudioAttributesCompatParcelizer = 1;
                try {
                    Object[] objArr = {mediaBrowserCompatCustomActionResultReceiver};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-385271091);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 24193 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 11 - Drawable.resolveOpacity(0, 0), -1757348264, false, "IconCompatParcelizer", new Class[]{SampleVideos.class});
                    }
                    if (((Method) objRemoteActionCompatParcelizer).invoke(obj2, objArr) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), setMbbsVerificationYear.write(), null, new MediaBrowserCompatCustomActionResultReceiver(null), 2);
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.read(TypeResolutionContextBasic.write(this), "rpd", new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.DataBufferUtils
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeUIActivityViewModel.AudioAttributesImplBaseParcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$IconCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ HomeUIActivityViewModel read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    Object obj2 = this.read.MediaBrowserCompatItemReceiver;
                    AnonymousClass3 anonymousClass3 = this;
                    this.RemoteActionCompatParcelizer = 1;
                    try {
                        Object[] objArr = {1, anonymousClass3};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(246872773);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 24193 - Color.red(0), View.MeasureSpec.getMode(0) + 11, 1895775824, false, "write", new Class[]{Integer.TYPE, SampleVideos.class});
                        }
                        if (((Method) objRemoteActionCompatParcelizer).invoke(obj2, objArr) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HomeUIActivityViewModel homeUIActivityViewModel, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.read = homeUIActivityViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(HomeUIActivityViewModel.this.AudioAttributesImplBaseParcelizer, new AnonymousClass3(HomeUIActivityViewModel.this, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(setTempDir p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setTempDir.read.INSTANCE)) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setTempDir.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            AudioAttributesImplBaseParcelizer();
            return;
        }
        if (p0 instanceof setTempDir.MediaBrowserCompatItemReceiver) {
            AudioAttributesCompatParcelizer(((setTempDir.MediaBrowserCompatItemReceiver) p0).RemoteActionCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setTempDir.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatSearchResultReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.withRow
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return HomeUIActivityViewModel.MediaDescriptionCompat((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setTempDir.IconCompatParcelizer.INSTANCE)) {
            Pair<List<DataBuffer>, Integer> pairIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
            if (pairIconCompatParcelizer != null) {
                DataBuffer dataBuffer = pairIconCompatParcelizer.write().get(pairIconCompatParcelizer.IconCompatParcelizer().intValue());
                getSelectedIndexInTrackGroup.Companion companion = getSelectedIndexInTrackGroup.INSTANCE;
                getSelectedIndexInTrackGroup.Companion.AudioAttributesCompatParcelizer(dataBuffer.getMediaBrowserCompatItemReceiver());
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setTempDir.write.INSTANCE)) {
            Pair<List<DataBuffer>, Integer> pairIconCompatParcelizer2 = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
            if (pairIconCompatParcelizer2 != null) {
                DataBuffer dataBuffer2 = pairIconCompatParcelizer2.write().get(pairIconCompatParcelizer2.IconCompatParcelizer().intValue());
                getSelectedIndexInTrackGroup.Companion companion2 = getSelectedIndexInTrackGroup.INSTANCE;
                getSelectedIndexInTrackGroup.Companion.RemoteActionCompatParcelizer(dataBuffer2.getMediaBrowserCompatItemReceiver());
                isSeekPending isseekpending = this.read;
                ApiClientKey apiClientKey = ApiClientKey.INSTANCE;
                isseekpending.write(ApiClientKey.IconCompatParcelizer(PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(dataBuffer2.getMediaBrowserCompatItemReceiver())), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setTempDir.AudioAttributesCompatParcelizer.INSTANCE)) {
            MediaBrowserCompatSearchResultReceiver();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setTempDir.RemoteActionCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            getResolutionSize<onDataRangeChanged> getresolutionsize = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            String lowerCase = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            getresolutionsize.write(new onDataRangeChanged.MediaDescriptionCompat("Pro Subscription Dialog", lowerCase));
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(500L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            HomeUIActivityViewModel.this.MediaBrowserCompatCustomActionResultReceiver();
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ onDataRangeInserted AudioAttributesCompatParcelizer;
        private /* synthetic */ HomeUIActivityViewModel RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                onDataRangeInserted ondatarangeinserted = this.AudioAttributesCompatParcelizer;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.AudioAttributesCompatParcelizer.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.RatingCompat();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.write.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.MediaDescriptionCompat();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.handleMediaPlayPauseIfPendingOnHandler.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onPlayFromMediaId();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.read.INSTANCE)) {
                    this.read = 1;
                    if (this.RemoteActionCompatParcelizer.IconCompatParcelizer(this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.RemoteActionCompatParcelizer.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.MediaMetadataCompat();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.AudioAttributesImplBaseParcelizer.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onCommand();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onCustomAction();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.MediaBrowserCompatItemReceiver.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                } else if (ondatarangeinserted instanceof onDataRangeInserted.IconCompatParcelizer) {
                    HomeUIActivityViewModel homeUIActivityViewModel = this.RemoteActionCompatParcelizer;
                    NetworkTypeObserver1 onAddQueueItem = homeUIActivityViewModel.AudioAttributesCompatParcelizer().IconCompatParcelizer().getOnAddQueueItem();
                    homeUIActivityViewModel.onCommand(onAddQueueItem != null ? onAddQueueItem.AudioAttributesCompatParcelizer() : null);
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.MediaDescriptionCompat.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onAddQueueItem();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.MediaMetadataCompat.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onFastForward();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.MediaBrowserCompatMediaItem.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onMediaButtonEvent();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.onCustomAction.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onPlay();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.onAddQueueItem.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onPause();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onPrepareFromSearch();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.MediaBrowserCompatSearchResultReceiver.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.onPrepare();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(ondatarangeinserted, onDataRangeInserted.RatingCompat.INSTANCE)) {
                    this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.AudioAttributesCompatParcelizer.INSTANCE);
                } else {
                    throw new RenewEligibleCreator();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat(onDataRangeInserted ondatarangeinserted, HomeUIActivityViewModel homeUIActivityViewModel, SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = ondatarangeinserted;
            this.RemoteActionCompatParcelizer = homeUIActivityViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new RatingCompat(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(onDataRangeInserted p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(p0, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.DataHolder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeUIActivityViewModel.MediaBrowserCompatSearchResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand(String p0) {
        String str = p0;
        if (str == null || str.length() == 0) {
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(new onDataRangeChanged.read(p0));
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                if (((disambiguate4gAnd5gNsa) HomeUIActivityViewModel.this.MediaMetadataCompat.IconCompatParcelizer()).getOnCustomAction()) {
                    this.read = 1;
                    obj = ((LogLogLevel) HomeUIActivityViewModel.this.RemoteActionCompatParcelizer.get()).IconCompatParcelizer(this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                }
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            if (((Number) obj).intValue() == 1) {
                HomeUIActivityViewModel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            }
            return getShowPopup.INSTANCE;
        }

        MediaMetadataCompat(SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new MediaMetadataCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaMetadataCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.buildDataHolder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeUIActivityViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RatingCompat() {
        onAddQueueItem("click_aboutus");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(new onDataRangeChanged.MediaBrowserCompatItemReceiver("https://www.neurogliahealth.com/", "About Us"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaDescriptionCompat() {
        getLatestBitrateEstimate.MediaBrowserCompatMediaItem.read();
        getResolutionSize<onDataRangeChanged> getresolutionsize = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        String lowerCase = "HAMBURGER_MENU".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        getresolutionsize.write(new onDataRangeChanged.MediaDescriptionCompat("Menu", lowerCase));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayFromMediaId() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.handleMediaPlayPauseIfPendingOnHandler.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatMediaItem() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.AudioAttributesCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        onAddQueueItem("click_faq");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(new onDataRangeChanged.MediaBrowserCompatItemReceiver("https://www.marrow.com/home/faq", "FAQs"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand() {
        onAddQueueItem("click_sharetheapp");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.onCustomAction.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        onAddQueueItem("click_knowmore");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.AudioAttributesImplApi26Parcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomAction() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        onAddQueueItem("click_marrownotes");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.RemoteActionCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddQueueItem() {
        getLatestBitrateEstimate.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.AudioAttributesImplBaseParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFastForward() {
        onAddQueueItem("click_rateus");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.onAddQueueItem.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.MediaBrowserCompatSearchResultReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlay() {
        onAddQueueItem("click_reportcopyrightissue");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(new onDataRangeChanged.MediaBrowserCompatItemReceiver("https://medengageclinical.firebaseapp.com/reportpiracy.html", "Report Video Piracy"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause() {
        onAddQueueItem("click_t_c");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(new onDataRangeChanged.MediaBrowserCompatItemReceiver("https://www.marrow.com/home/terms", "Terms"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrepareFromSearch() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrepare() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(onDataRangeChanged.MediaBrowserCompatMediaItem.INSTANCE);
    }

    private final void onAddQueueItem(String p0) {
        isSeekPending isseekpending = this.read;
        onDataChanged ondatachanged = onDataChanged.RemoteActionCompatParcelizer;
        isseekpending.write(p0, onDataChanged.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX INFO: renamed from: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$MediaBrowserCompatItemReceiver$5, reason: invalid class name */
        static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private Object AudioAttributesImplApi21Parcelizer;
            private Object AudioAttributesImplApi26Parcelizer;
            private int AudioAttributesImplBaseParcelizer;
            private int IconCompatParcelizer;
            private Object MediaBrowserCompatCustomActionResultReceiver;
            private Object MediaBrowserCompatItemReceiver;
            private /* synthetic */ HomeUIActivityViewModel RatingCompat;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            /* JADX WARN: Code restructure failed: missing block: B:37:0x022e, code lost:
            
                if (r7 != r1) goto L38;
             */
            /* JADX WARN: Removed duplicated region for block: B:125:0x045c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x01cf  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x01df  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0204  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0207  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0241  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x031b  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x031f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0441 -> B:108:0x0444). Please report as a decompilation issue!!! */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r33) {
                /*
                    Method dump skipped, instruction units count: 1212
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.MediaBrowserCompatItemReceiver.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(HomeUIActivityViewModel homeUIActivityViewModel, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.RatingCompat = homeUIActivityViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass5(this.RatingCompat, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r6.IconCompatParcelizer.read(r6) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L3e
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel r7 = com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.this
                o.getPlatform r7 = com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.IconCompatParcelizer(r7)
                o.CurrentQuery r7 = (kotlin.CurrentQuery) r7
                com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$MediaBrowserCompatItemReceiver$5 r1 = new com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$MediaBrowserCompatItemReceiver$5
                com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel r4 = com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.this
                r5 = 0
                r1.<init>(r4, r5)
                o.MagicModuleSubmissionRequestBody r1 = (kotlin.MagicModuleSubmissionRequestBody) r1
                r4 = r6
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r6.write = r3
                java.lang.Object r7 = kotlin.setModifiedEndTimestampMs.RemoteActionCompatParcelizer(r7, r1, r4)
                if (r7 == r0) goto L4f
            L3e:
                com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel r7 = com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.this
                r1 = r6
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r6.write = r2
                java.lang.Object r6 = com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.read(r7, r1)
                if (r6 != r0) goto L4c
                goto L4f
            L4c:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L4f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.hasNull
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeUIActivityViewModel.MediaMetadataCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:29:0x012b, code lost:
        
            if (r8.AudioAttributesImplApi21Parcelizer.write(r8) == r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00bf A[PHI: r9
          0x00bf: PHI (r9v22 java.lang.Object) = (r9v21 java.lang.Object), (r9v0 java.lang.Object) binds: [B:21:0x00bd, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00fa A[PHI: r1 r9
          0x00fa: PHI (r1v12 java.util.List) = (r1v11 java.util.List), (r1v17 java.util.List) binds: [B:23:0x00d1, B:27:0x00f5] A[DONT_GENERATE, DONT_INLINE]
          0x00fa: PHI (r9v28 int) = (r9v26 int), (r9v30 int) binds: [B:23:0x00d1, B:27:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 306
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.hasPrevPage
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeUIActivityViewModel.RatingCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(kotlin.SampleVideos<? super kotlin.getShowPopup> r5) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.write(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$AudioAttributesImplApi26Parcelizer$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            private /* synthetic */ HomeUIActivityViewModel write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer = 1;
                    obj = ((getDisplaySizeV17) this.write.IconCompatParcelizer.get()).onPause(this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                PhoneNumberDetails phoneNumberDetails = (PhoneNumberDetails) obj;
                this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(new onDataRangeChanged.AudioAttributesImplApi21Parcelizer(phoneNumberDetails.getCountryCode(), phoneNumberDetails.getNationalNumber()));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HomeUIActivityViewModel homeUIActivityViewModel, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.write = homeUIActivityViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(HomeUIActivityViewModel.this.AudioAttributesImplBaseParcelizer, new AnonymousClass2(HomeUIActivityViewModel.this, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(int p0) {
        Pair<List<DataBuffer>, Integer> pairIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        if (pairIconCompatParcelizer != null) {
            Pair<List<DataBuffer>, Integer> pairIconCompatParcelizer2 = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
            if (pairIconCompatParcelizer2 == null || pairIconCompatParcelizer2.IconCompatParcelizer().intValue() != p0) {
                this.MediaBrowserCompatMediaItem.write(new Pair<>(pairIconCompatParcelizer.write(), Integer.valueOf(p0)));
                getSelectedIndexInTrackGroup.Companion companion = getSelectedIndexInTrackGroup.INSTANCE;
                getSelectedIndexInTrackGroup.Companion.read(pairIconCompatParcelizer.write().get(p0).getMediaBrowserCompatItemReceiver());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L14
            r0 = r7
            com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$AudioAttributesImplApi21Parcelizer r0 = (com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.AudioAttributesImplApi21Parcelizer) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.AudioAttributesCompatParcelizer
            int r7 = r7 + r2
            r0.AudioAttributesCompatParcelizer = r7
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$AudioAttributesImplApi21Parcelizer r0 = new com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$AudioAttributesImplApi21Parcelizer
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            return r7
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L6d
        L3e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            goto L55
        L42:
            kotlin.SdkPayloadData.IconCompatParcelizer(r7)
            dagger.Lazy<o.readSynchSafeInt> r7 = r6.write
            java.lang.Object r7 = r7.get()
            o.readSynchSafeInt r7 = (kotlin.readSynchSafeInt) r7
            r0.AudioAttributesCompatParcelizer = r5
            java.lang.Object r7 = r7.MediaDescriptionCompat(r0)
            if (r7 == r1) goto L95
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7b
            dagger.Lazy<o.LogLogLevel> r7 = r6.RemoteActionCompatParcelizer
            java.lang.Object r7 = r7.get()
            o.LogLogLevel r7 = (kotlin.LogLogLevel) r7
            r0.AudioAttributesCompatParcelizer = r4
            java.lang.Object r7 = r7.MediaBrowserCompatCustomActionResultReceiver(r0)
            if (r7 == r1) goto L95
        L6d:
            com.marrow.data.models.common.CourseConfigV2$CourseStrings r7 = (com.marrow.data.models.common.CourseConfigV2.CourseStrings) r7
            java.lang.String r7 = r7.getBuyNowHighlight()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 > 0) goto L7c
        L7b:
            r5 = 0
        L7c:
            if (r5 == 0) goto L92
            dagger.Lazy<o.readSynchSafeInt> r6 = r6.write
            java.lang.Object r6 = r6.get()
            o.readSynchSafeInt r6 = (kotlin.readSynchSafeInt) r6
            r0.IconCompatParcelizer = r5
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r6 = r6.AudioAttributesCompatParcelizer(r0)
            if (r6 != r1) goto L91
            goto L95
        L91:
            return r6
        L92:
            java.lang.String r6 = ""
            return r6
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MediaBrowserCompatCustomActionResultReceiver(kotlin.SampleVideos<? super kotlin.NetworkTypeObserverApi31> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.MediaDescriptionCompat
            if (r0 == 0) goto L14
            r0 = r10
            com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$MediaDescriptionCompat r0 = (com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.MediaDescriptionCompat) r0
            int r1 = r0.RemoteActionCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.RemoteActionCompatParcelizer
            int r10 = r10 + r2
            r0.RemoteActionCompatParcelizer = r10
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$MediaDescriptionCompat r0 = new com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$MediaDescriptionCompat
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.AudioAttributesImplApi21Parcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.RemoteActionCompatParcelizer
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L40
            if (r2 != r3) goto L38
            int r9 = r0.write
            java.lang.Object r9 = r0.read
            o.NetworkTypeObserverApi31 r9 = (kotlin.NetworkTypeObserverApi31) r9
            java.lang.Object r1 = r0.AudioAttributesCompatParcelizer
            java.lang.Object r0 = r0.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L93
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            goto L57
        L44:
            kotlin.SdkPayloadData.IconCompatParcelizer(r10)
            dagger.Lazy<o.peekChar> r10 = r9.AudioAttributesCompatParcelizer
            java.lang.Object r10 = r10.get()
            o.peekChar r10 = (kotlin.peekChar) r10
            r0.RemoteActionCompatParcelizer = r5
            java.lang.Object r10 = r10.AudioAttributesCompatParcelizer(r0)
            if (r10 == r1) goto L9a
        L57:
            java.util.List r10 = (java.util.List) r10
            o.NetworkTypeObserverApi31 r2 = new o.NetworkTypeObserverApi31
            r6 = 3
            r7 = 0
            r2.<init>(r4, r7, r6, r7)
            r6 = r10
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L76
            com.marrow2.data.user.remote.model.CourseModelV3$Companion r6 = com.marrow2.data.user.remote.model.CourseModelV3.INSTANCE
            boolean r10 = r6.hasNewCourse(r10)
            if (r10 == 0) goto L76
            o.NetworkTypeObserverApi31 r10 = kotlin.NetworkTypeObserverApi31.RemoteActionCompatParcelizer(r2, r5, r7, r3)
            goto L77
        L76:
            r10 = r2
        L77:
            dagger.Lazy<o.getDisplaySizeV17> r9 = r9.IconCompatParcelizer
            java.lang.Object r9 = r9.get()
            o.getDisplaySizeV17 r9 = (kotlin.getDisplaySizeV17) r9
            r0.IconCompatParcelizer = r7
            r0.AudioAttributesCompatParcelizer = r7
            r0.read = r10
            r0.write = r4
            r0.RemoteActionCompatParcelizer = r3
            java.lang.Object r9 = r9.AudioAttributesImplApi21Parcelizer(r0)
            if (r9 != r1) goto L90
            goto L9a
        L90:
            r8 = r10
            r10 = r9
            r9 = r8
        L93:
            java.lang.String r10 = (java.lang.String) r10
            o.NetworkTypeObserverApi31 r9 = kotlin.NetworkTypeObserverApi31.RemoteActionCompatParcelizer(r9, r4, r10, r5)
            return r9
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.MediaBrowserCompatCustomActionResultReceiver(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NetworkTypeObserverExternalSyntheticLambda0 read(getLocaleLanguageTagV21 p0) {
        return new NetworkTypeObserverExternalSyntheticLambda0(p0.onCommand(), p0.onMediaButtonEvent(), p0.onFastForward());
    }

    static final class onAddQueueItem extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            DataBuffer dataBuffer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                DataBuffer dataBuffer2 = DataBuffer.write;
                this.write = dataBuffer2;
                this.read = 1;
                Object objAudioAttributesCompatParcelizer = HomeUIActivityViewModel.this.AudioAttributesCompatParcelizer(this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objAudioAttributesCompatParcelizer;
                dataBuffer = dataBuffer2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dataBuffer = (DataBuffer) this.write;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            dataBuffer.AudioAttributesCompatParcelizer(((Boolean) obj).booleanValue());
            return getShowPopup.INSTANCE;
        }

        onAddQueueItem(SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new onAddQueueItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onAddQueueItem) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayFromSearch() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new onAddQueueItem(null), new MagicModuleSubmissionRequestBody() { // from class: o.hasNextPage
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return HomeUIActivityViewModel.handleMediaPlayPauseIfPendingOnHandler((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.write
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$write r0 = (com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.write) r0
            int r1 = r0.AudioAttributesCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.AudioAttributesCompatParcelizer
            int r5 = r5 + r2
            r0.AudioAttributesCompatParcelizer = r5
            goto L19
        L14:
            com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$write r0 = new com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel$write
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.IconCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.AudioAttributesCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            dagger.Lazy<o.crc32> r5 = r4.AudioAttributesImplApi21Parcelizer
            java.lang.Object r5 = r5.get()
            o.crc32 r5 = (kotlin.crc32) r5
            r0.AudioAttributesCompatParcelizer = r3
            java.lang.Object r5 = r5.AudioAttributesCompatParcelizer(r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L65
            o.isSeekPending r4 = r4.read
            o.interceptEvent r0 = kotlin.interceptEvent.INSTANCE
            o.getSubscriptionExpiresOn r0 = kotlin.interceptEvent.read()
            o.updateLoadingFinished r1 = kotlin.updateLoadingFinished.AudioAttributesCompatParcelizer
            o.updateLoadingFinished r2 = kotlin.updateLoadingFinished.RemoteActionCompatParcelizer
            o.updateLoadingFinished[] r1 = new kotlin.updateLoadingFinished[]{r1, r2}
            java.util.List r1 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r1)
            r4.write(r0, r1)
        L65:
            java.lang.Boolean r4 = kotlin.QBankStatsResponse.AudioAttributesCompatParcelizer(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            if (r8 != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        
            if (r8 == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 209
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.main.viewmodel.HomeUIActivityViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return HomeUIActivityViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object read(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, new AudioAttributesCompatParcelizer(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        super.write();
    }
}
