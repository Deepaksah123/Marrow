package com.marrow2.ui.notespurchase.landing;

import com.marrow2.ui.notespurchase.landing.NotesPurchaseLandingFragmentViewModel;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.ICancelTokenStub;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.PendingResultUtilResultConverter;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ServiceSpecificExtraArgsCastExtraArgs;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.checkArgumentInRange;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getMaxMethodInvocationsInBatch;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.readCharacterIfInList;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.skipBit;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/marrow2/ui/notespurchase/landing/NotesPurchaseLandingFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "analyticsPublisher", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marrow2/ui/notespurchase/landing/NotesPurchaseLandingUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_oneOffEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/marrow2/ui/notespurchase/landing/NotesPurchaseLandingUiEvent;", "oneOffEvent", "Lkotlinx/coroutines/flow/Flow;", "getOneOffEvent", "()Lkotlinx/coroutines/flow/Flow;", "notify", "", "event", "Lcom/marrow2/ui/notespurchase/landing/NotesPurchaseLandingActionEvent;", "processBottomBarData", "sharedData", "Lcom/marrow2/domain/notespurchase/NotesPurchasePlanDetailsUCModel;", "Lcom/marrow2/ui/notespurchase/NotesPlanPurchaseSharedDataModel;", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotesPurchaseLandingFragmentViewModel extends POJOPropertyBuilderWithMember {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(null);
    private static final List<String> read = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"https://cdn1.dailyrounds.org/marrow-images/notes85/P1047079-2.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047088.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047098.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047110-2.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047135.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047180.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047194.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047199.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047201.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047205.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047221.webp", "https://cdn1.dailyrounds.org/marrow-images/notes85/P1047225.webp"});
    private final setUpdatedStatus<getMaxMethodInvocationsInBatch> AudioAttributesImplApi21Parcelizer;
    private final isSeekPending IconCompatParcelizer;
    private final NewNumberOtpResendRequest<ServiceSpecificExtraArgsCastExtraArgs> MediaBrowserCompatItemReceiver;
    private final getResolutionSize<getMaxMethodInvocationsInBatch> RemoteActionCompatParcelizer;
    private final fromCursor<ServiceSpecificExtraArgsCastExtraArgs> write;

    @setSdkPayload
    public NotesPurchaseLandingFragmentViewModel(isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.IconCompatParcelizer = isseekpending;
        getResolutionSize<getMaxMethodInvocationsInBatch> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getMaxMethodInvocationsInBatch(null, false, null, null, null, false, 63, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        fromCursor<ServiceSpecificExtraArgsCastExtraArgs> fromcursor = getLastName.read(0, null, 7);
        this.write = fromcursor;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        getresolutionsizeRemoteActionCompatParcelizer.write(getMaxMethodInvocationsInBatch.IconCompatParcelizer(getresolutionsizeRemoteActionCompatParcelizer.IconCompatParcelizer(), read, false, null, null, null, false, 62));
    }

    public final setUpdatedStatus<getMaxMethodInvocationsInBatch> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final NewNumberOtpResendRequest<ServiceSpecificExtraArgsCastExtraArgs> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void RemoteActionCompatParcelizer(checkArgumentInRange checkargumentinrange) {
        toMagicModuleMetaRepoModel.write(checkargumentinrange, "");
        if (checkargumentinrange instanceof checkArgumentInRange.read) {
            RemoteActionCompatParcelizer(((checkArgumentInRange.read) checkargumentinrange).RemoteActionCompatParcelizer());
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(checkargumentinrange, checkArgumentInRange.IconCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.ReflectedParcelable
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return NotesPurchaseLandingFragmentViewModel.RemoteActionCompatParcelizer((String) obj2);
                }
            });
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(checkargumentinrange, checkArgumentInRange.RemoteActionCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.ResourceUtils
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return NotesPurchaseLandingFragmentViewModel.read((String) obj2);
                }
            });
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = NotesPurchaseLandingFragmentViewModel.this.IconCompatParcelizer;
                ICancelTokenStub iCancelTokenStub = ICancelTokenStub.INSTANCE;
                isseekpending.write(ICancelTokenStub.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.write = 1;
                if (NotesPurchaseLandingFragmentViewModel.this.write.RemoteActionCompatParcelizer(ServiceSpecificExtraArgsCastExtraArgs.AudioAttributesCompatParcelizer.INSTANCE, this) == objIconCompatParcelizer) {
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

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NotesPurchaseLandingFragmentViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = NotesPurchaseLandingFragmentViewModel.this.IconCompatParcelizer;
                ICancelTokenStub iCancelTokenStub = ICancelTokenStub.INSTANCE;
                isseekpending.write(ICancelTokenStub.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.IconCompatParcelizer = 1;
                if (NotesPurchaseLandingFragmentViewModel.this.write.RemoteActionCompatParcelizer(new ServiceSpecificExtraArgsCastExtraArgs.IconCompatParcelizer("https://www.marrow.com/notes/order-details"), this) == objIconCompatParcelizer) {
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
            return NotesPurchaseLandingFragmentViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(skipBit skipbit) {
        getMaxMethodInvocationsInBatch getmaxmethodinvocationsinbatchIconCompatParcelizer;
        getResolutionSize<getMaxMethodInvocationsInBatch> getresolutionsize = this.RemoteActionCompatParcelizer;
        if (skipbit.getRead()) {
            getMaxMethodInvocationsInBatch getmaxmethodinvocationsinbatchIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            readCharacterIfInList remoteActionCompatParcelizer = skipbit.getRemoteActionCompatParcelizer();
            String strWrite = PendingResultUtilResultConverter.write(remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.getWrite() : null);
            readCharacterIfInList remoteActionCompatParcelizer2 = skipbit.getRemoteActionCompatParcelizer();
            getmaxmethodinvocationsinbatchIconCompatParcelizer = getMaxMethodInvocationsInBatch.IconCompatParcelizer(getmaxmethodinvocationsinbatchIconCompatParcelizer2, null, true, strWrite, PendingResultUtilResultConverter.write(remoteActionCompatParcelizer2 != null ? remoteActionCompatParcelizer2.getMediaBrowserCompatCustomActionResultReceiver() : null), null, false, 49);
        } else {
            getmaxmethodinvocationsinbatchIconCompatParcelizer = getMaxMethodInvocationsInBatch.IconCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer(), null, false, null, null, skipbit.getIconCompatParcelizer(), skipbit.getWrite(), 13);
        }
        getresolutionsize.write(getmaxmethodinvocationsinbatchIconCompatParcelizer);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/marrow2/ui/notespurchase/landing/NotesPurchaseLandingFragmentViewModel$IconCompatParcelizer;", "", "<init>", "()V", "", "", "read", "Ljava/util/List;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
