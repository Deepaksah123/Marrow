package com.marrow2.ui.bookmark.landing;

import com.google.android.exoplayer2.C;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel;
import in.juspay.hypersdk.core.AndroidInterface$$ExternalSyntheticLambda4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Allocator;
import kotlin.AllocatorAllocationNode;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.HlsSampleStream;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.NetworkTypeObserverApi31DisplayInfoCallback;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.PlanDetailsCreator;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.adjustmentAllowed;
import kotlin.allocate;
import kotlin.anyIgnorals;
import kotlin.clearSurfaceFrameRate;
import kotlin.closestVsync;
import kotlin.colorRangeToString;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.maybeBuildDisplayHelper;
import kotlin.onDisplayInfoChanged;
import kotlin.putInt;
import kotlin.setCountry;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setScheme;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.updateSurfacePlaybackFrameRate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@¢\u0006\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\"0$8\u0007¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b \u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R \u0010)\u001a\b\u0012\u0004\u0012\u00020'0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b\u0013\u0010&"}, d2 = {"Lcom/marrow2/ui/bookmark/landing/BookmarkLandingViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "p0", "Lo/getPlatform;", "p1", "Lo/isSeekPending;", "p2", "Lo/Allocator;", "p3", "<init>", "(Lo/NetworkTypeObserverApi31DisplayInfoCallback;Lo/getPlatform;Lo/isSeekPending;Lo/Allocator;)V", "", "MediaBrowserCompatItemReceiver", "()V", "Lo/adjustmentAllowed;", "write", "(Lo/adjustmentAllowed;)V", "Lo/anyIgnorals$read;", "IconCompatParcelizer", "(Lo/anyIgnorals$read;)V", "read", "", "Lo/adjustReleaseTime;", "(Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplApi21Parcelizer", "Lo/NetworkTypeObserverApi31DisplayInfoCallback;", "Lo/getPlatform;", "RemoteActionCompatParcelizer", "Lo/isSeekPending;", "AudioAttributesImplBaseParcelizer", "Lo/Allocator;", "AudioAttributesCompatParcelizer", "Lo/getResolutionSize;", "Lo/maybeBuildDisplayHelper;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/updateSurfacePlaybackFrameRate;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BookmarkLandingViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<maybeBuildDisplayHelper> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final NetworkTypeObserverApi31DisplayInfoCallback IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<updateSurfacePlaybackFrameRate> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Allocator AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<maybeBuildDisplayHelper> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getPlatform RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<updateSurfacePlaybackFrameRate> AudioAttributesImplApi26Parcelizer;

    static final class IconCompatParcelizer extends getTotalMcq {
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return BookmarkLandingViewModel.this.IconCompatParcelizer(this);
        }
    }

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[anyIgnorals.read.values().length];
            try {
                iArr[anyIgnorals.read.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    @setSdkPayload
    public BookmarkLandingViewModel(NetworkTypeObserverApi31DisplayInfoCallback networkTypeObserverApi31DisplayInfoCallback, getPlatform getplatform, isSeekPending isseekpending, Allocator allocator) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverApi31DisplayInfoCallback, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(allocator, "");
        this.IconCompatParcelizer = networkTypeObserverApi31DisplayInfoCallback;
        this.RemoteActionCompatParcelizer = getplatform;
        this.read = isseekpending;
        this.AudioAttributesCompatParcelizer = allocator;
        getResolutionSize<maybeBuildDisplayHelper> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new maybeBuildDisplayHelper(false, 0, null, null, null, 31, null));
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<updateSurfacePlaybackFrameRate> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(updateSurfacePlaybackFrameRate.read.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getresolutionsizeRemoteActionCompatParcelizer.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer(getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer(), true, 0, null, null, null, 30));
        read();
        MediaBrowserCompatItemReceiver();
    }

    public final setUpdatedStatus<maybeBuildDisplayHelper> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<updateSurfacePlaybackFrameRate> IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object[] objArr = {BookmarkLandingViewModel.this.AudioAttributesCompatParcelizer};
                isDark isdark = (isDark) Allocator.IconCompatParcelizer(setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), 1850090459, setScheme.IconCompatParcelizer(), -1850090458, objArr, setScheme.IconCompatParcelizer());
                final BookmarkLandingViewModel bookmarkLandingViewModel = BookmarkLandingViewModel.this;
                this.RemoteActionCompatParcelizer = 1;
                if (isdark.write(new getValidationToken() { // from class: com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel.AudioAttributesImplApi21Parcelizer.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((allocate) obj2);
                    }

                    private Object IconCompatParcelizer(allocate allocateVar) {
                        if (allocateVar instanceof allocate.MediaBrowserCompatCustomActionResultReceiver) {
                            int iRemoteActionCompatParcelizer = AuthApiStatusCodes.RemoteActionCompatParcelizer();
                            int iRemoteActionCompatParcelizer2 = AuthApiStatusCodes.RemoteActionCompatParcelizer();
                            if (((AllocatorAllocationNode) allocate.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(AuthApiStatusCodes.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, new Object[]{(allocate.MediaBrowserCompatCustomActionResultReceiver) allocateVar}, -766262347, AuthApiStatusCodes.RemoteActionCompatParcelizer(), 766262348)) == AllocatorAllocationNode.read) {
                                bookmarkLandingViewModel.write(adjustmentAllowed.AudioAttributesImplApi21Parcelizer.INSTANCE);
                            }
                        } else if (allocateVar instanceof allocate.AudioAttributesCompatParcelizer) {
                            int iRemoteActionCompatParcelizer3 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                            int iRemoteActionCompatParcelizer4 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                            int iRemoteActionCompatParcelizer5 = AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer();
                            if (((AllocatorAllocationNode) allocate.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer3, AndroidInterface$$ExternalSyntheticLambda4.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer5, new Object[]{(allocate.AudioAttributesCompatParcelizer) allocateVar}, -2121217977, 2121217980, iRemoteActionCompatParcelizer4)) == AllocatorAllocationNode.read) {
                                bookmarkLandingViewModel.write(adjustmentAllowed.AudioAttributesImplBaseParcelizer.INSTANCE);
                            }
                        } else if (allocateVar instanceof allocate.RemoteActionCompatParcelizer) {
                            int iWrite = HlsSampleStream.write();
                            int iWrite2 = HlsSampleStream.write();
                            int iWrite3 = HlsSampleStream.write();
                            if (((AllocatorAllocationNode) allocate.RemoteActionCompatParcelizer.read(HlsSampleStream.write(), -92781229, iWrite, 92781232, iWrite2, iWrite3, new Object[]{(allocate.RemoteActionCompatParcelizer) allocateVar})) == AllocatorAllocationNode.read) {
                                bookmarkLandingViewModel.write(adjustmentAllowed.RemoteActionCompatParcelizer.INSTANCE);
                            }
                        } else if (allocateVar instanceof allocate.write) {
                            int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
                            int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
                            int iIconCompatParcelizer3 = setScheme.IconCompatParcelizer();
                            if (((AllocatorAllocationNode) allocate.write.RemoteActionCompatParcelizer(iIconCompatParcelizer2, setScheme.IconCompatParcelizer(), 918403904, iIconCompatParcelizer, new Object[]{(allocate.write) allocateVar}, iIconCompatParcelizer3, -918403904)) == AllocatorAllocationNode.read) {
                                bookmarkLandingViewModel.write(adjustmentAllowed.MediaBrowserCompatItemReceiver.INSTANCE);
                            }
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BookmarkLandingViewModel.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.MediaCodecVideoRendererVideoFrameProcessorManager1
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkLandingViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void write(adjustmentAllowed p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof adjustmentAllowed.write) {
            IconCompatParcelizer(((adjustmentAllowed.write) p0).IconCompatParcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, adjustmentAllowed.RemoteActionCompatParcelizer.INSTANCE)) {
            C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), null, null, new RemoteActionCompatParcelizer(null), 3);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, adjustmentAllowed.MediaBrowserCompatItemReceiver.INSTANCE)) {
            C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), null, null, new AudioAttributesCompatParcelizer(null), 3);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, adjustmentAllowed.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            getResolutionSize<maybeBuildDisplayHelper> getresolutionsize = this.write;
            getresolutionsize.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), false, 0, null, null, closestVsync.IconCompatParcelizer, 15));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, adjustmentAllowed.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            getResolutionSize<maybeBuildDisplayHelper> getresolutionsize2 = this.write;
            getresolutionsize2.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), false, 0, null, null, closestVsync.read, 15));
            read();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, adjustmentAllowed.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi26Parcelizer.write(updateSurfacePlaybackFrameRate.read.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, adjustmentAllowed.read.INSTANCE)) {
            isSeekPending isseekpending = this.read;
            colorRangeToString colorrangetostring = colorRangeToString.INSTANCE;
            isseekpending.write(colorRangeToString.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else if (p0 instanceof adjustmentAllowed.IconCompatParcelizer) {
            isSeekPending isseekpending2 = this.read;
            colorRangeToString colorrangetostring2 = colorRangeToString.INSTANCE;
            isseekpending2.write(colorRangeToString.IconCompatParcelizer(((adjustmentAllowed.IconCompatParcelizer) p0).IconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else {
            if (!(p0 instanceof adjustmentAllowed.AudioAttributesImplApi26Parcelizer)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending3 = this.read;
            colorRangeToString colorrangetostring3 = colorRangeToString.INSTANCE;
            isseekpending3.write(colorRangeToString.AudioAttributesCompatParcelizer(((adjustmentAllowed.AudioAttributesImplApi26Parcelizer) p0).read()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                BookmarkLandingViewModel.this.write.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer((maybeBuildDisplayHelper) BookmarkLandingViewModel.this.write.IconCompatParcelizer(), false, 0, null, null, closestVsync.AudioAttributesCompatParcelizer, 15));
                this.read = 1;
                if (setCountry.IconCompatParcelizer(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            BookmarkLandingViewModel.this.write.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer((maybeBuildDisplayHelper) BookmarkLandingViewModel.this.write.IconCompatParcelizer(), false, 0, null, null, closestVsync.write, 15));
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return BookmarkLandingViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                BookmarkLandingViewModel.this.write.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer((maybeBuildDisplayHelper) BookmarkLandingViewModel.this.write.IconCompatParcelizer(), false, 0, null, null, closestVsync.RemoteActionCompatParcelizer, 15));
                this.RemoteActionCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            BookmarkLandingViewModel.this.write.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer((maybeBuildDisplayHelper) BookmarkLandingViewModel.this.write.IconCompatParcelizer(), false, 0, null, null, closestVsync.write, 15));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return BookmarkLandingViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(anyIgnorals.read p0) {
        if (write.RemoteActionCompatParcelizer[p0.ordinal()] == 1) {
            read();
        }
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel$read$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            private Object RemoteActionCompatParcelizer;
            private /* synthetic */ BookmarkLandingViewModel read;
            private Object write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object next;
                Object next2;
                Object next3;
                ArrayList arrayList;
                MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer = 1;
                    obj = this.read.IconCompatParcelizer.IconCompatParcelizer(this);
                    if (obj != objIconCompatParcelizer) {
                    }
                    return objIconCompatParcelizer;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (ArrayList) this.RemoteActionCompatParcelizer;
                    iconCompatParcelizer = (MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer) this.write;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.read.write.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer((maybeBuildDisplayHelper) this.read.write.IconCompatParcelizer(), false, iconCompatParcelizer.AudioAttributesCompatParcelizer, arrayList, (List) obj, null, 17));
                    this.read.write.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer((maybeBuildDisplayHelper) this.read.write.IconCompatParcelizer(), false, 0, null, null, null, 30));
                    return getShowPopup.INSTANCE;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                Iterable<putInt> iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
                for (putInt putint : iterable) {
                    arrayList2.add(new clearSurfaceFrameRate(putint.getRead(), putint.getRemoteActionCompatParcelizer()));
                }
                MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
                ArrayList arrayList3 = new ArrayList();
                onDisplayInfoChanged ondisplayinfochanged = onDisplayInfoChanged.AudioAttributesCompatParcelizer;
                ArrayList arrayList4 = arrayList2;
                Iterator it = arrayList4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((clearSurfaceFrameRate) next).getIconCompatParcelizer() == onDisplayInfoChanged.AudioAttributesCompatParcelizer) {
                        break;
                    }
                }
                clearSurfaceFrameRate clearsurfaceframerate = (clearSurfaceFrameRate) next;
                arrayList3.add(new clearSurfaceFrameRate(ondisplayinfochanged, clearsurfaceframerate != null ? clearsurfaceframerate.getRemoteActionCompatParcelizer() : 0));
                onDisplayInfoChanged ondisplayinfochanged2 = onDisplayInfoChanged.IconCompatParcelizer;
                Iterator it2 = arrayList4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((clearSurfaceFrameRate) next2).getIconCompatParcelizer() == onDisplayInfoChanged.IconCompatParcelizer) {
                        break;
                    }
                }
                clearSurfaceFrameRate clearsurfaceframerate2 = (clearSurfaceFrameRate) next2;
                arrayList3.add(new clearSurfaceFrameRate(ondisplayinfochanged2, clearsurfaceframerate2 != null ? clearsurfaceframerate2.getRemoteActionCompatParcelizer() : 0));
                onDisplayInfoChanged ondisplayinfochanged3 = onDisplayInfoChanged.write;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (((clearSurfaceFrameRate) next3).getIconCompatParcelizer() == onDisplayInfoChanged.write) {
                        break;
                    }
                }
                clearSurfaceFrameRate clearsurfaceframerate3 = (clearSurfaceFrameRate) next3;
                arrayList3.add(new clearSurfaceFrameRate(ondisplayinfochanged3, clearsurfaceframerate3 != null ? clearsurfaceframerate3.getRemoteActionCompatParcelizer() : 0));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    iconCompatParcelizer2.AudioAttributesCompatParcelizer += ((clearSurfaceFrameRate) it4.next()).getRemoteActionCompatParcelizer();
                }
                this.AudioAttributesCompatParcelizer = null;
                this.write = iconCompatParcelizer2;
                this.RemoteActionCompatParcelizer = arrayList3;
                this.IconCompatParcelizer = 2;
                Object objIconCompatParcelizer2 = this.read.IconCompatParcelizer(this);
                if (objIconCompatParcelizer2 != objIconCompatParcelizer) {
                    arrayList = arrayList3;
                    iconCompatParcelizer = iconCompatParcelizer2;
                    obj = objIconCompatParcelizer2;
                    this.read.write.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer((maybeBuildDisplayHelper) this.read.write.IconCompatParcelizer(), false, iconCompatParcelizer.AudioAttributesCompatParcelizer, arrayList, (List) obj, null, 17));
                    this.read.write.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer((maybeBuildDisplayHelper) this.read.write.IconCompatParcelizer(), false, 0, null, null, null, 30));
                    return getShowPopup.INSTANCE;
                }
                return objIconCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(BookmarkLandingViewModel bookmarkLandingViewModel, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.read = bookmarkLandingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(BookmarkLandingViewModel.this.RemoteActionCompatParcelizer, new AnonymousClass4(BookmarkLandingViewModel.this, null), this) == objIconCompatParcelizer) {
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

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BookmarkLandingViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.MediaCodecVideoRendererVideoFrameProcessorManagerVideoFrameProcessorAccessor
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BookmarkLandingViewModel.read(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(BookmarkLandingViewModel bookmarkLandingViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        getResolutionSize<maybeBuildDisplayHelper> getresolutionsize = bookmarkLandingViewModel.write;
        getresolutionsize.write(maybeBuildDisplayHelper.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), false, 0, null, null, null, 30));
        bookmarkLandingViewModel.AudioAttributesImplApi26Parcelizer.write(new updateSurfacePlaybackFrameRate.write(str));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super java.util.List<kotlin.adjustReleaseTime>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r5
            com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel$IconCompatParcelizer r0 = (com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel.IconCompatParcelizer) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel$IconCompatParcelizer r0 = new com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel$IconCompatParcelizer
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.NetworkTypeObserverApi31DisplayInfoCallback r4 = r4.IconCompatParcelizer
            r0.read = r3
            java.lang.Object r5 = r4.RemoteActionCompatParcelizer(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r5, r0)
            r4.<init>(r0)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r5.next()
            o.skipBytes r0 = (kotlin.skipBytes) r0
            o.adjustReleaseTime r1 = new o.adjustReleaseTime
            java.lang.String r2 = r0.read()
            java.lang.String r3 = r0.AudioAttributesCompatParcelizer()
            int r0 = r0.IconCompatParcelizer()
            r1.<init>(r2, r3, r0)
            r4.add(r1)
            goto L53
        L74:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.bookmark.landing.BookmarkLandingViewModel.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }
}
