package com.marrow2.ui.internal_web.ui.main;

import com.marrow.data.models.user.PhoneNumber;
import com.marrow2.ui.internal_web.ui.main.InternalWebViewModel;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.C0201setMcqCount;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.ResolvingResultCallbacks;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.canceledPendingResult;
import kotlin.endSectionV18;
import kotlin.getAnswerMap;
import kotlin.getCreatedOnDateMs;
import kotlin.getDisplaySizeV17;
import kotlin.getLocaleLanguageTagV21;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.newYearNameItem;
import kotlin.onFailure;
import kotlin.onUnresolvableFailure;
import kotlin.removeQueryParameter;
import kotlin.setCountry;
import kotlin.setMbbsVerificationYear;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020%0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b'\u0010*R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020+0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010&R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020+0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b\u001e\u0010*R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020+0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R \u0010!\u001a\b\u0012\u0004\u0012\u00020+0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b\u0015\u0010*R\u0014\u0010\u001e\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020.0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020.0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b\u000e\u0010*"}, d2 = {"Lcom/marrow2/ui/internal_web/ui/main/InternalWebViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/getDisplaySizeV17;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "Lo/endSectionV18;", "p2", "<init>", "(Lo/getDisplaySizeV17;Lo/POJOPropertyBuilder5;Lo/endSectionV18;)V", "", "MediaBrowserCompatMediaItem", "()V", "Lo/onFailure;", "read", "(Lo/onFailure;)V", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi21Parcelizer", "MediaMetadataCompat", "MediaBrowserCompatCustomActionResultReceiver", "", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "RatingCompat", "MediaDescriptionCompat", "Lo/getDisplaySizeV17;", "AudioAttributesImplApi26Parcelizer", "()Lo/getDisplaySizeV17;", "MediaBrowserCompatItemReceiver", "Lo/POJOPropertyBuilder5;", "write", "AudioAttributesImplBaseParcelizer", "Lo/endSectionV18;", "()Lo/endSectionV18;", "Lo/getResolutionSize;", "Lo/onUnresolvableFailure;", "Lo/getResolutionSize;", "AudioAttributesCompatParcelizer", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "", "Lo/canceledPendingResult;", "Lo/canceledPendingResult;", "Lo/ResolvingResultCallbacks;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InternalWebViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<onUnresolvableFailure> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final endSectionV18 read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<ResolvingResultCallbacks> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 write;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getDisplaySizeV17 IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<onUnresolvableFailure> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<ResolvingResultCallbacks> MediaDescriptionCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final canceledPendingResult MediaBrowserCompatItemReceiver;

    @setSdkPayload
    public InternalWebViewModel(getDisplaySizeV17 getdisplaysizev17, POJOPropertyBuilder5 pOJOPropertyBuilder5, endSectionV18 endsectionv18) {
        toMagicModuleMetaRepoModel.write(getdisplaysizev17, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(endsectionv18, "");
        this.IconCompatParcelizer = getdisplaysizev17;
        this.write = pOJOPropertyBuilder5;
        this.read = endsectionv18;
        getResolutionSize<onUnresolvableFailure> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new onUnresolvableFailure(null, null, null, null, 15, null));
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        canceledPendingResult.Companion companion = canceledPendingResult.INSTANCE;
        this.MediaBrowserCompatItemReceiver = canceledPendingResult.Companion.AudioAttributesCompatParcelizer(pOJOPropertyBuilder5);
        getResolutionSize<ResolvingResultCallbacks> getresolutionsizeRemoteActionCompatParcelizer4 = setStartTime.RemoteActionCompatParcelizer(ResolvingResultCallbacks.IconCompatParcelizer.INSTANCE);
        this.MediaDescriptionCompat = getresolutionsizeRemoteActionCompatParcelizer4;
        this.MediaBrowserCompatMediaItem = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer4);
        MediaBrowserCompatMediaItem();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final getDisplaySizeV17 getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final endSectionV18 getRead() {
        return this.read;
    }

    public final setUpdatedStatus<onUnresolvableFailure> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<Boolean> IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final setUpdatedStatus<ResolvingResultCallbacks> read() {
        return this.MediaBrowserCompatMediaItem;
    }

    private final void MediaBrowserCompatMediaItem() {
        this.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.TRUE);
        this.AudioAttributesCompatParcelizer.write(new onUnresolvableFailure(null, this.MediaBrowserCompatItemReceiver.getWrite(), this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer(), this.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), 1, null));
    }

    public final void read(onFailure p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, onFailure.read.INSTANCE)) {
            MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, onFailure.IconCompatParcelizer.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (p0 instanceof onFailure.AudioAttributesCompatParcelizer) {
            onFailure.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (onFailure.AudioAttributesCompatParcelizer) p0;
            String strAsSingleEntity = new PhoneNumber(audioAttributesCompatParcelizer.write(), audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()).asSingleEntity();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAsSingleEntity, "");
            IconCompatParcelizer(strAsSingleEntity, audioAttributesCompatParcelizer.read());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, onFailure.write.INSTANCE)) {
            MediaMetadataCompat();
            return;
        }
        if (p0 instanceof onFailure.RemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer(((onFailure.RemoteActionCompatParcelizer) p0).AudioAttributesCompatParcelizer());
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, onFailure.MediaBrowserCompatItemReceiver.INSTANCE)) {
            MediaBrowserCompatSearchResultReceiver();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, onFailure.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            RatingCompat();
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        this.AudioAttributesImplApi26Parcelizer.write(Boolean.TRUE);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        this.AudioAttributesImplApi26Parcelizer.write(Boolean.FALSE);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(1200L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            InternalWebViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return InternalWebViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaMetadataCompat() {
        C0201setMcqCount.IconCompatParcelizer(TypeResolutionContextBasic.write(this), null, null, new IconCompatParcelizer(null), 3);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaDescriptionCompat.write(ResolvingResultCallbacks.IconCompatParcelizer.INSTANCE);
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                InternalWebViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.IconCompatParcelizer = 1;
                if (InternalWebViewModel.this.getIconCompatParcelizer().write(this.AudioAttributesCompatParcelizer, this.read, "int_web", this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            InternalWebViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            InternalWebViewModel.this.MediaDescriptionCompat.write(ResolvingResultCallbacks.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, String str2, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.read = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return InternalWebViewModel.this.new read(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(String p0, String p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p1, p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.Status
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return InternalWebViewModel.RemoteActionCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(InternalWebViewModel internalWebViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        internalWebViewModel.MediaDescriptionCompat.write(new ResolvingResultCallbacks.AudioAttributesImplBaseParcelizer(str));
        internalWebViewModel.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ InternalWebViewModel IconCompatParcelizer;
        private int read;
        private /* synthetic */ String write;

        /* JADX INFO: renamed from: com.marrow2.ui.internal_web.ui.main.InternalWebViewModel$RemoteActionCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi21Parcelizer;
            private Object AudioAttributesImplApi26Parcelizer;
            private Object AudioAttributesImplBaseParcelizer;
            private /* synthetic */ String IconCompatParcelizer;
            private Object MediaBrowserCompatCustomActionResultReceiver;
            private Object MediaBrowserCompatItemReceiver;
            private /* synthetic */ InternalWebViewModel RatingCompat;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private Object write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
                List listRemoteActionCompatParcelizer;
                List listRemoteActionCompatParcelizer2;
                List listRemoteActionCompatParcelizer3;
                List listRemoteActionCompatParcelizer4;
                String str;
                String str2;
                String str3;
                List listRemoteActionCompatParcelizer5;
                String str4;
                String str5;
                String str6;
                String str7;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesImplApi21Parcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    List<String> list = new newYearNameItem("\\?").read(this.IconCompatParcelizer);
                    if (!list.isEmpty()) {
                        ListIterator<String> listIterator = list.listIterator(list.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.write((Iterable) list, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    String str8 = ((String[]) listRemoteActionCompatParcelizer.toArray(new String[0]))[1];
                    List<String> list2 = new newYearNameItem("\\?").read(this.IconCompatParcelizer);
                    if (!list2.isEmpty()) {
                        ListIterator<String> listIterator2 = list2.listIterator(list2.size());
                        while (listIterator2.hasPrevious()) {
                            if (listIterator2.previous().length() != 0) {
                                listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.write((Iterable) list2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    String str9 = ((String[]) listRemoteActionCompatParcelizer2.toArray(new String[0]))[0];
                    List<String> list3 = new newYearNameItem("&").read(str8);
                    if (!list3.isEmpty()) {
                        ListIterator<String> listIterator3 = list3.listIterator(list3.size());
                        while (listIterator3.hasPrevious()) {
                            if (listIterator3.previous().length() != 0) {
                                listRemoteActionCompatParcelizer3 = IntermediateLoginResponseBody.write((Iterable) list3, listIterator3.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    listRemoteActionCompatParcelizer3 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    String[] strArr = (String[]) listRemoteActionCompatParcelizer3.toArray(new String[0]);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str10 : strArr) {
                        List<String> list4 = new newYearNameItem("=").read(str10);
                        if (!list4.isEmpty()) {
                            ListIterator<String> listIterator4 = list4.listIterator(list4.size());
                            while (listIterator4.hasPrevious()) {
                                if (listIterator4.previous().length() != 0) {
                                    listRemoteActionCompatParcelizer5 = IntermediateLoginResponseBody.write((Iterable) list4, listIterator4.nextIndex() + 1);
                                    break;
                                }
                            }
                            listRemoteActionCompatParcelizer5 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                        } else {
                            listRemoteActionCompatParcelizer5 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                        }
                        String[] strArr2 = (String[]) listRemoteActionCompatParcelizer5.toArray(new String[0]);
                        linkedHashMap.put(strArr2[0], strArr2[1]);
                    }
                    String strDecode = URLDecoder.decode((String) linkedHashMap.get("subject"), StandardCharsets.UTF_8.toString());
                    String strDecode2 = URLDecoder.decode((String) linkedHashMap.get("body"), StandardCharsets.UTF_8.toString());
                    List<String> list5 = new newYearNameItem(":").read(str9);
                    if (!list5.isEmpty()) {
                        ListIterator<String> listIterator5 = list5.listIterator(list5.size());
                        while (listIterator5.hasPrevious()) {
                            if (listIterator5.previous().length() != 0) {
                                listRemoteActionCompatParcelizer4 = IntermediateLoginResponseBody.write((Iterable) list5, listIterator5.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    listRemoteActionCompatParcelizer4 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    str = ((String[]) listRemoteActionCompatParcelizer4.toArray(new String[0]))[1];
                    this.AudioAttributesCompatParcelizer = null;
                    this.read = null;
                    this.write = null;
                    this.RemoteActionCompatParcelizer = null;
                    this.AudioAttributesImplBaseParcelizer = strDecode;
                    this.MediaBrowserCompatItemReceiver = strDecode2;
                    this.AudioAttributesImplApi26Parcelizer = str;
                    this.AudioAttributesImplApi21Parcelizer = 1;
                    Object objMediaMetadataCompat = this.RatingCompat.getIconCompatParcelizer().MediaMetadataCompat(this);
                    if (objMediaMetadataCompat != objIconCompatParcelizer) {
                        str2 = strDecode;
                        obj = objMediaMetadataCompat;
                        str3 = strDecode2;
                    }
                    return objIconCompatParcelizer;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (String) this.MediaBrowserCompatCustomActionResultReceiver;
                    String str11 = (String) this.AudioAttributesImplApi26Parcelizer;
                    str5 = (String) this.MediaBrowserCompatItemReceiver;
                    String str12 = (String) this.AudioAttributesImplBaseParcelizer;
                    SdkPayloadData.IconCompatParcelizer(obj);
                    str7 = str11;
                    str6 = str12;
                    removeQueryParameter removequeryparameter = (removeQueryParameter) obj;
                    StringBuilder sb = new StringBuilder("Subscription: ");
                    sb.append(str4);
                    sb.append("\n");
                    sb.append(str5);
                    String string = sb.toString();
                    getResolutionSize getresolutionsize = this.RatingCompat.MediaDescriptionCompat;
                    toMagicModuleMetaRepoModel.write((Object) str6);
                    getresolutionsize.write(new ResolvingResultCallbacks.read(str7, str6, string, removequeryparameter.AudioAttributesCompatParcelizer(), removequeryparameter.write()));
                    this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                    return getShowPopup.INSTANCE;
                }
                str = (String) this.AudioAttributesImplApi26Parcelizer;
                str3 = (String) this.MediaBrowserCompatItemReceiver;
                str2 = (String) this.AudioAttributesImplBaseParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                String str13 = (String) obj;
                this.AudioAttributesCompatParcelizer = null;
                this.read = null;
                this.write = null;
                this.RemoteActionCompatParcelizer = null;
                this.AudioAttributesImplBaseParcelizer = str2;
                this.MediaBrowserCompatItemReceiver = str3;
                this.AudioAttributesImplApi26Parcelizer = str;
                this.MediaBrowserCompatCustomActionResultReceiver = str13;
                this.AudioAttributesImplApi21Parcelizer = 2;
                Object obj2 = this.RatingCompat.getRead().read(this);
                if (obj2 != objIconCompatParcelizer) {
                    str4 = str13;
                    obj = obj2;
                    str5 = str3;
                    str6 = str2;
                    str7 = str;
                    removeQueryParameter removequeryparameter2 = (removeQueryParameter) obj;
                    StringBuilder sb2 = new StringBuilder("Subscription: ");
                    sb2.append(str4);
                    sb2.append("\n");
                    sb2.append(str5);
                    String string2 = sb2.toString();
                    getResolutionSize getresolutionsize2 = this.RatingCompat.MediaDescriptionCompat;
                    toMagicModuleMetaRepoModel.write((Object) str6);
                    getresolutionsize2.write(new ResolvingResultCallbacks.read(str7, str6, string2, removequeryparameter2.AudioAttributesCompatParcelizer(), removequeryparameter2.write()));
                    this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                    return getShowPopup.INSTANCE;
                }
                return objIconCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(String str, InternalWebViewModel internalWebViewModel, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = str;
                this.RatingCompat = internalWebViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.IconCompatParcelizer, this.RatingCompat, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass3(this.write, this.IconCompatParcelizer, null), this) == objIconCompatParcelizer) {
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
        RemoteActionCompatParcelizer(String str, InternalWebViewModel internalWebViewModel, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
            this.IconCompatParcelizer = internalWebViewModel;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(String p0) {
        if (p0.length() == 0) {
            return;
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(p0, this, null), new MagicModuleSubmissionRequestBody() { // from class: o.isInterrupted
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return InternalWebViewModel.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InternalWebViewModel internalWebViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        internalWebViewModel.MediaDescriptionCompat.write(new ResolvingResultCallbacks.AudioAttributesImplBaseParcelizer(str));
        internalWebViewModel.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    public static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.internal_web.ui.main.InternalWebViewModel$write$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<String, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ InternalWebViewModel RemoteActionCompatParcelizer;
            private /* synthetic */ Object write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.write;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.write = str;
                    this.AudioAttributesCompatParcelizer = 1;
                    obj = this.RemoteActionCompatParcelizer.getIconCompatParcelizer().onPlay(this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                getLocaleLanguageTagV21 getlocalelanguagetagv21 = (getLocaleLanguageTagV21) obj;
                this.RemoteActionCompatParcelizer.MediaDescriptionCompat.write(new ResolvingResultCallbacks.RemoteActionCompatParcelizer(getlocalelanguagetagv21.onAddQueueItem().asSingleEntity(), getlocalelanguagetagv21.MediaBrowserCompatItemReceiver(), str));
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InternalWebViewModel internalWebViewModel, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = internalWebViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.RemoteActionCompatParcelizer, sampleVideos);
                anonymousClass2.write = obj;
                return anonymousClass2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(String str, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(str, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getDisplaySizeV17 iconCompatParcelizer = InternalWebViewModel.this.getIconCompatParcelizer();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InternalWebViewModel.this, null);
                final InternalWebViewModel internalWebViewModel = InternalWebViewModel.this;
                getCreatedOnDateMs<getShowPopup> getcreatedondatems = new getCreatedOnDateMs() { // from class: o.Scope
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return InternalWebViewModel.write.read(internalWebViewModel);
                    }
                };
                final InternalWebViewModel internalWebViewModel2 = InternalWebViewModel.this;
                this.AudioAttributesCompatParcelizer = 1;
                if (iconCompatParcelizer.AudioAttributesCompatParcelizer(anonymousClass2, getcreatedondatems, new getCreatedOnDateMs() { // from class: o.andFinally
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return InternalWebViewModel.write.write(internalWebViewModel2);
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
            InternalWebViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(InternalWebViewModel internalWebViewModel) {
            internalWebViewModel.MediaDescriptionCompat.write(ResolvingResultCallbacks.AudioAttributesCompatParcelizer.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(InternalWebViewModel internalWebViewModel) {
            internalWebViewModel.MediaDescriptionCompat.write(ResolvingResultCallbacks.write.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return InternalWebViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.getScopeUri
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return InternalWebViewModel.AudioAttributesImplApi26Parcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(InternalWebViewModel internalWebViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        internalWebViewModel.MediaDescriptionCompat.write(new ResolvingResultCallbacks.AudioAttributesImplBaseParcelizer(str));
        internalWebViewModel.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }
}
