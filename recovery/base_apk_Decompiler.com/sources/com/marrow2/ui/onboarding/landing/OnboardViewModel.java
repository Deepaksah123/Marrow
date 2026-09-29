package com.marrow2.ui.onboarding.landing;

import com.marrow2.ui.onboarding.landing.OnboardViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.ThemeState;
import kotlin.TrackSelectionViewTrackInfo;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.createParcelSparseArray;
import kotlin.createSparseBooleanArray;
import kotlin.createSparseLongArray;
import kotlin.createStringArray;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isDark;
import kotlin.isSeekPending;
import kotlin.peekChar;
import kotlin.sampleCountToDurationUs;
import kotlin.setPassingYear;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040#8\u0007¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b\u0011\u0010%R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020'0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020'0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b&\u0010%R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b\u0016\u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020(0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020(0)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*"}, d2 = {"Lcom/marrow2/ui/onboarding/landing/OnboardViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "Lo/TrackSelectionViewTrackInfo;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/peekChar;Lo/TrackSelectionViewTrackInfo;Lo/isSeekPending;)V", "", "MediaBrowserCompatCustomActionResultReceiver", "()V", "Lo/setPassingYear;", "MediaBrowserCompatItemReceiver", "()Lo/setPassingYear;", "Lo/createSparseBooleanArray;", "AudioAttributesCompatParcelizer", "(Lo/createSparseBooleanArray;)V", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "", "read", "(Z)V", "Lo/createStringArray;", "RemoteActionCompatParcelizer", "(Lo/createStringArray;)V", "", "write", "(I)V", "AudioAttributesImplApi26Parcelizer", "Lo/peekChar;", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "IconCompatParcelizer", "Lo/createSparseLongArray;", "", "Lo/isDark;", "Lo/isDark;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<TrackSelectionViewTrackInfo> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final peekChar RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<createSparseLongArray> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<String> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final isDark<String> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending AudioAttributesCompatParcelizer;
    private final getResolutionSize<TrackSelectionViewTrackInfo> read;
    private final getResolutionSize<createSparseLongArray> write;

    @setSdkPayload
    public OnboardViewModel(peekChar peekchar, TrackSelectionViewTrackInfo trackSelectionViewTrackInfo, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(trackSelectionViewTrackInfo, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.RemoteActionCompatParcelizer = peekchar;
        this.AudioAttributesCompatParcelizer = isseekpending;
        getResolutionSize<TrackSelectionViewTrackInfo> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(trackSelectionViewTrackInfo);
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.IconCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<createSparseLongArray> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(createSparseLongArray.write.INSTANCE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer("");
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer4;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.IconCompatParcelizer((ThemeState) getresolutionsizeRemoteActionCompatParcelizer4);
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatItemReceiver();
    }

    public final setUpdatedStatus<TrackSelectionViewTrackInfo> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final setUpdatedStatus<createSparseLongArray> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<Boolean> read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        this.AudioAttributesImplApi26Parcelizer.write(Boolean.TRUE);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (OnboardViewModel.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this) == objIconCompatParcelizer) {
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
            return OnboardViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear MediaBrowserCompatItemReceiver() {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.createIntegerList
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return OnboardViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(createSparseBooleanArray p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createSparseBooleanArray.AudioAttributesCompatParcelizer.INSTANCE)) {
            isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
            createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
            isseekpending.write(createParcelSparseArray.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createSparseBooleanArray.MediaBrowserCompatItemReceiver.INSTANCE)) {
            isSeekPending isseekpending2 = this.AudioAttributesCompatParcelizer;
            createParcelSparseArray createparcelsparsearray2 = createParcelSparseArray.write;
            isseekpending2.write(createParcelSparseArray.read(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            return;
        }
        if (p0 instanceof createSparseBooleanArray.AudioAttributesImplBaseParcelizer) {
            getResolutionSize<TrackSelectionViewTrackInfo> getresolutionsize = this.read;
            getresolutionsize.write(getresolutionsize.IconCompatParcelizer());
            return;
        }
        if (p0 instanceof createSparseBooleanArray.AudioAttributesImplApi26Parcelizer) {
            RemoteActionCompatParcelizer(((createSparseBooleanArray.AudioAttributesImplApi26Parcelizer) p0).read());
            return;
        }
        if (p0 instanceof createSparseBooleanArray.AudioAttributesImplApi21Parcelizer) {
            write(((createSparseBooleanArray.AudioAttributesImplApi21Parcelizer) p0).write());
            return;
        }
        if (p0 instanceof createSparseBooleanArray.RemoteActionCompatParcelizer) {
            createSparseBooleanArray.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (createSparseBooleanArray.RemoteActionCompatParcelizer) p0;
            read(remoteActionCompatParcelizer.IconCompatParcelizer());
            if (remoteActionCompatParcelizer.IconCompatParcelizer()) {
                return;
            }
            AudioAttributesImplBaseParcelizer();
            return;
        }
        if (p0 instanceof createSparseBooleanArray.read) {
            isSeekPending isseekpending3 = this.AudioAttributesCompatParcelizer;
            createParcelSparseArray createparcelsparsearray3 = createParcelSparseArray.write;
            isseekpending3.write(createParcelSparseArray.AudioAttributesCompatParcelizer(((createSparseBooleanArray.read) p0).write()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createSparseBooleanArray.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            this.write.write(createSparseLongArray.write.INSTANCE);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createSparseBooleanArray.write.INSTANCE)) {
            this.write.write(createSparseLongArray.read.INSTANCE);
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, createSparseBooleanArray.IconCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            this.write.write(createSparseLongArray.AudioAttributesCompatParcelizer.INSTANCE);
        }
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                obj = OnboardViewModel.this.RemoteActionCompatParcelizer.write(this);
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
                OnboardViewModel.this.write.write(createSparseLongArray.RemoteActionCompatParcelizer.INSTANCE);
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return OnboardViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.createParcel
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return OnboardViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (OnboardViewModel.this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(this) == objIconCompatParcelizer) {
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
            return OnboardViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.createLongArray
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return OnboardViewModel.read(this.read, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(OnboardViewModel onboardViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        onboardViewModel.MediaBrowserCompatCustomActionResultReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    private final void read(boolean p0) {
        isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
        sampleCountToDurationUs samplecounttodurationus = sampleCountToDurationUs.write;
        isseekpending.write(sampleCountToDurationUs.IconCompatParcelizer(p0, "google_popup", "login"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ createStringArray RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (OnboardViewModel.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(createStringArray createstringarray, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = createstringarray;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return OnboardViewModel.this.new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(createStringArray p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.createParcelList
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return OnboardViewModel.AudioAttributesCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(OnboardViewModel onboardViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        onboardViewModel.MediaBrowserCompatCustomActionResultReceiver.write(str);
        return getShowPopup.INSTANCE;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (OnboardViewModel.this.RemoteActionCompatParcelizer.read(this.IconCompatParcelizer, this) == objIconCompatParcelizer) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(int i, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return OnboardViewModel.this.new write(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write(int p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.createLongList
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return OnboardViewModel.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(OnboardViewModel onboardViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        onboardViewModel.MediaBrowserCompatCustomActionResultReceiver.write(str);
        return getShowPopup.INSTANCE;
    }
}
