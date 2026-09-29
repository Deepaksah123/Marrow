package com.marrow2.ui.notespurchase.billingdetails;

import com.marrow2.ui.notespurchase.billingdetails.NotesPurchaseBillingDetailsViewModel;
import com.marrow2.ui.payment.model.DeliveryAddressModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.ICancelTokenStub;
import kotlin.IGmsServiceBroker;
import kotlin.ImagesContract;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.MethodInvocation;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.bytesLeft;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.newYearNameItem;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toTask;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0019\u0010\u000e\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)R \u0010.\u001a\b\u0012\u0004\u0012\u00020(0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b \u0010-"}, d2 = {"Lcom/marrow2/ui/notespurchase/billingdetails/NotesPurchaseBillingDetailsViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/bytesLeft;", "p0", "Lo/isSeekPending;", "p1", "Lo/POJOPropertyBuilder5;", "p2", "<init>", "(Lo/bytesLeft;Lo/isSeekPending;Lo/POJOPropertyBuilder5;)V", "Lo/IGmsServiceBroker;", "", "AudioAttributesCompatParcelizer", "(Lo/IGmsServiceBroker;)V", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/readCharacterIfInList;", "(Lo/readCharacterIfInList;)V", "", "(Ljava/lang/String;)Ljava/lang/String;", "", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)Z", "()V", "MediaBrowserCompatItemReceiver", "Lo/bytesLeft;", "Lo/isSeekPending;", "Lo/MethodInvocation;", "Lo/MethodInvocation;", "write", "Lo/getResolutionSize;", "Lo/toTask;", "read", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "AudioAttributesImplApi21Parcelizer", "Lo/setUpdatedStatus;", "IconCompatParcelizer", "()Lo/setUpdatedStatus;", "Lo/fromCursor;", "Lo/ImagesContract;", "Lo/fromCursor;", "AudioAttributesImplApi26Parcelizer", "Lo/NewNumberOtpResendRequest;", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotesPurchaseBillingDetailsViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final MethodInvocation write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<toTask> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<ImagesContract> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final bytesLeft RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending AudioAttributesCompatParcelizer;
    private final getResolutionSize<toTask> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final fromCursor<ImagesContract> AudioAttributesImplApi26Parcelizer;

    static final class write extends getTotalMcq {
        /* synthetic */ Object AudioAttributesCompatParcelizer;
        int read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return NotesPurchaseBillingDetailsViewModel.this.RemoteActionCompatParcelizer(this);
        }
    }

    @setSdkPayload
    public NotesPurchaseBillingDetailsViewModel(bytesLeft bytesleft, isSeekPending isseekpending, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(bytesleft, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.RemoteActionCompatParcelizer = bytesleft;
        this.AudioAttributesCompatParcelizer = isseekpending;
        MethodInvocation.Companion companion = MethodInvocation.INSTANCE;
        this.write = MethodInvocation.Companion.RemoteActionCompatParcelizer(pOJOPropertyBuilder5);
        getResolutionSize<toTask> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new toTask(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262143, null));
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.IconCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        fromCursor<ImagesContract> fromcursor = getLastName.read(0, null, 7);
        this.AudioAttributesImplApi26Parcelizer = fromcursor;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass3(null), new MagicModuleSubmissionRequestBody() { // from class: o.toStringHelper
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return NotesPurchaseBillingDetailsViewModel.write((String) obj2);
            }
        });
    }

    public final setUpdatedStatus<toTask> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final NewNumberOtpResendRequest<ImagesContract> read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.notespurchase.billingdetails.NotesPurchaseBillingDetailsViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (NotesPurchaseBillingDetailsViewModel.this.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
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

        AnonymousClass3(SampleVideos<? super AnonymousClass3> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NotesPurchaseBillingDetailsViewModel.this.new AnonymousClass3(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass3) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(IGmsServiceBroker p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, IGmsServiceBroker.write.INSTANCE)) {
            AudioAttributesCompatParcelizer();
        } else {
            if (!(p0 instanceof IGmsServiceBroker.IconCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            RemoteActionCompatParcelizer(((IGmsServiceBroker.IconCompatParcelizer) p0).write().getRemoteActionCompatParcelizer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r29) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.notespurchase.billingdetails.NotesPurchaseBillingDetailsViewModel.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(kotlin.readCharacterIfInList r23) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.notespurchase.billingdetails.NotesPurchaseBillingDetailsViewModel.RemoteActionCompatParcelizer(o.readCharacterIfInList):void");
    }

    private static String RemoteActionCompatParcelizer(String p0) {
        String str = p0;
        return (str == null || str.length() == 0) ? "-" : "+91 ".concat(String.valueOf(p0));
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(String p0) {
        return !new newYearNameItem("^(56|57|58|59)\\d{4}$").write(p0);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isSeekPending isseekpending = NotesPurchaseBillingDetailsViewModel.this.AudioAttributesCompatParcelizer;
                ICancelTokenStub iCancelTokenStub = ICancelTokenStub.INSTANCE;
                isseekpending.write(ICancelTokenStub.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                this.RemoteActionCompatParcelizer = 1;
                if (NotesPurchaseBillingDetailsViewModel.this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(new ImagesContract.IconCompatParcelizer(((toTask) NotesPurchaseBillingDetailsViewModel.this.read.IconCompatParcelizer()).getRatingCompat(), ((toTask) NotesPurchaseBillingDetailsViewModel.this.read.IconCompatParcelizer()).getMediaBrowserCompatSearchResultReceiver(), ((toTask) NotesPurchaseBillingDetailsViewModel.this.read.IconCompatParcelizer()).getMediaDescriptionCompat(), ((toTask) NotesPurchaseBillingDetailsViewModel.this.read.IconCompatParcelizer()).getMediaBrowserCompatMediaItem(), ((toTask) NotesPurchaseBillingDetailsViewModel.this.read.IconCompatParcelizer()).getMediaBrowserCompatCustomActionResultReceiver(), new DeliveryAddressModel(NotesPurchaseBillingDetailsViewModel.this.write.getRead(), NotesPurchaseBillingDetailsViewModel.this.write.getWrite(), NotesPurchaseBillingDetailsViewModel.this.write.getIconCompatParcelizer(), NotesPurchaseBillingDetailsViewModel.this.write.getAudioAttributesCompatParcelizer(), NotesPurchaseBillingDetailsViewModel.this.write.getRemoteActionCompatParcelizer(), NotesPurchaseBillingDetailsViewModel.this.write.getAudioAttributesImplApi21Parcelizer(), NotesPurchaseBillingDetailsViewModel.this.write.getAudioAttributesImplBaseParcelizer(), NotesPurchaseBillingDetailsViewModel.this.write.getMediaBrowserCompatCustomActionResultReceiver(), NotesPurchaseBillingDetailsViewModel.this.write.getMediaBrowserCompatItemReceiver())), this) == objIconCompatParcelizer) {
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NotesPurchaseBillingDetailsViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.checkBundlesEquality
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return NotesPurchaseBillingDetailsViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
