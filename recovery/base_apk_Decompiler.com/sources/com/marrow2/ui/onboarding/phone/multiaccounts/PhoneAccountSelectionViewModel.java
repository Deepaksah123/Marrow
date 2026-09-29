package com.marrow2.ui.onboarding.phone.multiaccounts;

import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import com.marrow2.ui.onboarding.phone.multiaccounts.PhoneAccountSelectionViewModel;
import java.util.Map;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.createParcelSparseArray;
import kotlin.getAnswerMap;
import kotlin.getLatestBitrateEstimate;
import kotlin.getLocaleLanguageTag;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.peekChar;
import kotlin.readDouble;
import kotlin.readLine;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.writeFloatObject;
import kotlin.writeIBinder;
import kotlin.writeIBinderArray;
import kotlin.zaF;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001f0!8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b\u001d\u0010#R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020$0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020&0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b\u0019\u0010#R\u0016\u0010*\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010)"}, d2 = {"Lcom/marrow2/ui/onboarding/phone/multiaccounts/PhoneAccountSelectionViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/peekChar;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "Lo/isSeekPending;", "p2", "Lo/getPlatform;", "p3", "<init>", "(Lo/peekChar;Lo/POJOPropertyBuilder5;Lo/isSeekPending;Lo/getPlatform;)V", "Lo/writeIBinder;", "", "write", "(Lo/writeIBinder;)V", "AudioAttributesCompatParcelizer", "()V", "", "(I)V", "AudioAttributesImplApi21Parcelizer", "Lo/peekChar;", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "Lo/POJOPropertyBuilder5;", "IconCompatParcelizer", "Lo/isSeekPending;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getPlatform;", "read", "Lo/getResolutionSize;", "Lo/writeFloatObject;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "AudioAttributesImplBaseParcelizer", "Lo/writeIBinderArray;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatMediaItem", "I", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhoneAccountSelectionViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<writeIBinderArray> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final peekChar RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getPlatform read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<writeIBinderArray> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<writeFloatObject> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setUpdatedStatus<writeFloatObject> AudioAttributesImplApi21Parcelizer;

    @setSdkPayload
    public PhoneAccountSelectionViewModel(peekChar peekchar, POJOPropertyBuilder5 pOJOPropertyBuilder5, isSeekPending isseekpending, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(peekchar, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = peekchar;
        this.IconCompatParcelizer = pOJOPropertyBuilder5;
        this.write = isseekpending;
        this.read = getplatform;
        getResolutionSize<writeFloatObject> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new writeFloatObject(null, null, null, null, 15, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<writeIBinderArray> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(writeIBinderArray.RemoteActionCompatParcelizer.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        this.MediaBrowserCompatSearchResultReceiver = -1;
        String str = (String) pOJOPropertyBuilder5.write("phone_number");
        str = str == null ? "" : str;
        String str2 = (String) pOJOPropertyBuilder5.write("country_code");
        str2 = str2 == null ? "" : str2;
        String str3 = (String) pOJOPropertyBuilder5.write("intermediate_token");
        getresolutionsizeRemoteActionCompatParcelizer.write(new writeFloatObject(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), str, str2, str3 != null ? str3 : ""));
    }

    public final setUpdatedStatus<writeFloatObject> read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<writeIBinderArray> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void write(writeIBinder p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, writeIBinder.write.INSTANCE)) {
            this.AudioAttributesImplApi26Parcelizer.write(writeIBinderArray.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof writeIBinder.read) {
            AudioAttributesCompatParcelizer(((writeIBinder.read) p0).write());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, writeIBinder.IconCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi26Parcelizer.write(writeIBinderArray.AudioAttributesCompatParcelizer.INSTANCE);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, writeIBinder.RemoteActionCompatParcelizer.INSTANCE)) {
            AudioAttributesCompatParcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, writeIBinder.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.AudioAttributesImplApi26Parcelizer.write(writeIBinderArray.read.INSTANCE);
            return;
        }
        if (p0 instanceof writeIBinder.MediaBrowserCompatCustomActionResultReceiver) {
            getResolutionSize<writeFloatObject> getresolutionsize = this.AudioAttributesCompatParcelizer;
            writeFloatObject writefloatobjectIconCompatParcelizer = getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(writeFloatObject.RemoteActionCompatParcelizer(((writeIBinder.MediaBrowserCompatCustomActionResultReceiver) p0).RemoteActionCompatParcelizer(), writefloatobjectIconCompatParcelizer.read, writefloatobjectIconCompatParcelizer.IconCompatParcelizer, writefloatobjectIconCompatParcelizer.AudioAttributesCompatParcelizer));
        } else {
            if (!(p0 instanceof writeIBinder.AudioAttributesImplApi21Parcelizer)) {
                throw new RenewEligibleCreator();
            }
            writeIBinder.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (writeIBinder.AudioAttributesImplApi21Parcelizer) p0;
            this.AudioAttributesCompatParcelizer.write(new writeFloatObject(audioAttributesImplApi21Parcelizer.IconCompatParcelizer(), audioAttributesImplApi21Parcelizer.write(), audioAttributesImplApi21Parcelizer.read(), audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()));
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), this, null), new MagicModuleSubmissionRequestBody() { // from class: o.writeParcel
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PhoneAccountSelectionViewModel.read(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ writeFloatObject AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ PhoneAccountSelectionViewModel write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getLocaleLanguageTag getlocalelanguagetag = new getLocaleLanguageTag(((writeFloatObject) this.write.AudioAttributesCompatParcelizer.IconCompatParcelizer()).getAudioAttributesCompatParcelizer(), this.AudioAttributesCompatParcelizer.write().get(this.write.MediaBrowserCompatSearchResultReceiver).getId(), new PhoneNumberDetails(this.AudioAttributesCompatParcelizer.getIconCompatParcelizer(), this.AudioAttributesCompatParcelizer.getRead(), 0, 4, null));
                this.RemoteActionCompatParcelizer = null;
                this.IconCompatParcelizer = null;
                this.read = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.write.read, new AnonymousClass1(this.write, getlocalelanguagetag, null), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: com.marrow2.ui.onboarding.phone.multiaccounts.PhoneAccountSelectionViewModel$RemoteActionCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ PhoneAccountSelectionViewModel IconCompatParcelizer;
            private /* synthetic */ getLocaleLanguageTag read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesCompatParcelizer = 1;
                    obj = this.IconCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.read, this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                readDouble readdouble = (readDouble) obj;
                this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                if (readdouble.getKycMeta() != null) {
                    isSeekPending isseekpending = this.IconCompatParcelizer.write;
                    zaF zaf = zaF.INSTANCE;
                    isseekpending.write(zaF.IconCompatParcelizer(readdouble.getKycMeta(), "multiple-accounts"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
                    this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer.write(new writeIBinderArray.write(readdouble.getKycMeta()));
                } else {
                    isSeekPending isseekpending2 = this.IconCompatParcelizer.write;
                    Map<String, ? extends Object> mapRemoteActionCompatParcelizer = getLatestBitrateEstimate.RemoteActionCompatParcelizer(readLine.read(readdouble), 0, 0, 0, 0);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer, "");
                    isseekpending2.AudioAttributesCompatParcelizer(mapRemoteActionCompatParcelizer);
                    this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer.write(writeIBinderArray.IconCompatParcelizer.INSTANCE);
                    isSeekPending isseekpending3 = this.IconCompatParcelizer.write;
                    createParcelSparseArray createparcelsparsearray = createParcelSparseArray.write;
                    isseekpending3.write(createParcelSparseArray.IconCompatParcelizer(createParcelSparseArray.IconCompatParcelizer.AudioAttributesCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    this.IconCompatParcelizer.write.write("login_complete", createParcelSparseArray.read(readdouble.getUserId(), readdouble.getPhoneNumber().getCountryCode(), "multi_account", -1, ""), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PhoneAccountSelectionViewModel phoneAccountSelectionViewModel, getLocaleLanguageTag getlocalelanguagetag, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = phoneAccountSelectionViewModel;
                this.read = getlocalelanguagetag;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass1(this.IconCompatParcelizer, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(writeFloatObject writefloatobject, PhoneAccountSelectionViewModel phoneAccountSelectionViewModel, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = writefloatobject;
            this.write = phoneAccountSelectionViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(PhoneAccountSelectionViewModel phoneAccountSelectionViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        phoneAccountSelectionViewModel.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        if (i == 502) {
            phoneAccountSelectionViewModel.AudioAttributesImplApi26Parcelizer.write(writeIBinderArray.AudioAttributesImplApi21Parcelizer.INSTANCE);
        } else {
            phoneAccountSelectionViewModel.AudioAttributesImplApi26Parcelizer.write(new writeIBinderArray.MediaBrowserCompatCustomActionResultReceiver(str));
        }
        phoneAccountSelectionViewModel.write.write("login_complete", createParcelSparseArray.read(phoneAccountSelectionViewModel.AudioAttributesCompatParcelizer.IconCompatParcelizer().getRead(), (String) null, "multi_account", i, str), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer(int p0) {
        this.MediaBrowserCompatSearchResultReceiver = p0;
        UserBasicDetails userBasicDetails = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().write().get(p0);
        this.write.write("multiple_accounts", createParcelSparseArray.RemoteActionCompatParcelizer(userBasicDetails.hasProPlan()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        this.AudioAttributesImplApi26Parcelizer.write(new writeIBinderArray.AudioAttributesImplBaseParcelizer(userBasicDetails.getEmail()));
    }
}
