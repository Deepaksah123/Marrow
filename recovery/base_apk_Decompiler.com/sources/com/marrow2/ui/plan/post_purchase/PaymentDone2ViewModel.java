package com.marrow2.ui.plan.post_purchase;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.plan.Plan;
import com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel;
import kotlin.Attachment;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.Fido2PrivilegedApiClient;
import kotlin.GmsLogger;
import kotlin.ICancelTokenStub;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.canLogPii;
import kotlin.efmt;
import kotlin.fromCursor;
import kotlin.getAlgoValue;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getYear;
import kotlin.isAbsolute;
import kotlin.isSeekPending;
import kotlin.readSynchSafeInt;
import kotlin.readUnsignedLongToLong;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0013\u0010\u001bJ!\u0010\u0010\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u0010\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001c0)8\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b$\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010/R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020.0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010/R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b\u0010\u0010,R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R \u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b0\u0010,R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106R \u00101\u001a\b\u0012\u0004\u0012\u000205078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00108\u001a\u0004\b\u001e\u00109"}, d2 = {"Lcom/marrow2/ui/plan/post_purchase/PaymentDone2ViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/isAbsolute;", "p0", "Lo/readSynchSafeInt;", "p1", "Lo/readUnsignedLongToLong;", "p2", "Lo/isSeekPending;", "p3", "Lo/POJOPropertyBuilder5;", "p4", "<init>", "(Lo/isAbsolute;Lo/readSynchSafeInt;Lo/readUnsignedLongToLong;Lo/isSeekPending;Lo/POJOPropertyBuilder5;)V", "Lo/efmt;", "", "IconCompatParcelizer", "(Lo/efmt;)V", "Lo/Fido2PrivilegedApiClient;", "write", "(Lo/Fido2PrivilegedApiClient;)V", "MediaBrowserCompatItemReceiver", "()V", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "", "", "(ILjava/lang/String;)V", "", "(ZLjava/lang/Boolean;)Z", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "Lo/isAbsolute;", "Lo/readSynchSafeInt;", "read", "Lo/readUnsignedLongToLong;", "RemoteActionCompatParcelizer", "Lo/isSeekPending;", "Lo/POJOPropertyBuilder5;", "Lo/setUpdatedStatus;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/getResolutionSize;", "Lo/getAlgoValue;", "Lo/getResolutionSize;", "AudioAttributesImplApi21Parcelizer", "MediaDescriptionCompat", "RatingCompat", "MediaBrowserCompatMediaItem", "Lo/fromCursor;", "Lo/Attachment;", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentDone2ViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final fromCursor<Attachment> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<Attachment> MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final readUnsignedLongToLong RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final readSynchSafeInt read;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final isAbsolute AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<getAlgoValue> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<getAlgoValue> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatSearchResultReceiver;

    static final class AudioAttributesImplApi21Parcelizer extends getTotalMcq {
        /* synthetic */ Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return PaymentDone2ViewModel.this.AudioAttributesCompatParcelizer(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, com.marrow.data.api.models.response.plan.Coupon] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, com.marrow.data.models.plan.Plan] */
    @setSdkPayload
    public PaymentDone2ViewModel(isAbsolute isabsolute, readSynchSafeInt readsynchsafeint, readUnsignedLongToLong readunsignedlongtolong, isSeekPending isseekpending, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(isabsolute, "");
        toMagicModuleMetaRepoModel.write(readsynchsafeint, "");
        toMagicModuleMetaRepoModel.write(readunsignedlongtolong, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.AudioAttributesCompatParcelizer = isabsolute;
        this.read = readsynchsafeint;
        this.RemoteActionCompatParcelizer = readunsignedlongtolong;
        this.IconCompatParcelizer = isseekpending;
        this.write = pOJOPropertyBuilder5;
        this.MediaBrowserCompatItemReceiver = pOJOPropertyBuilder5.write("showInitialAnimation", Boolean.TRUE);
        getResolutionSize<getAlgoValue> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getAlgoValue(null, null, null, null, null, false, 0, null, false, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        Boolean bool = Boolean.FALSE;
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(bool);
        this.MediaBrowserCompatSearchResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.RatingCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        fromCursor<Attachment> fromcursor = getLastName.read(0, null, 7);
        this.MediaBrowserCompatMediaItem = fromcursor;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        String str = (String) pOJOPropertyBuilder5.write("coupon");
        str = str == null ? "" : str;
        String str2 = (String) pOJOPropertyBuilder5.write("plan");
        str2 = str2 == null ? "" : str2;
        String str3 = (String) pOJOPropertyBuilder5.write("payment_id");
        str3 = str3 == null ? "" : str3;
        String str4 = (String) pOJOPropertyBuilder5.write("expiry_date");
        Boolean bool2 = (Boolean) pOJOPropertyBuilder5.write("is_plan_b_upgrade");
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        String str5 = (String) pOJOPropertyBuilder5.write("add_ons");
        str5 = str5 == null ? "" : str5;
        Integer num = (Integer) pOJOPropertyBuilder5.write("payment_gateway");
        int iIntValue = num != null ? num.intValue() : 1;
        String str6 = (String) pOJOPropertyBuilder5.write("payment_id");
        String str7 = str6 == null ? "" : str6;
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        MagicModuleUseCaseImplWhenMappings.write writeVar2 = new MagicModuleUseCaseImplWhenMappings.write();
        if (!zBooleanValue) {
            try {
                if (str2.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str2);
                    writeVar.write = new Plan();
                    ((Plan) writeVar.write).fromJSON(jSONObject);
                }
                if (str.length() > 0) {
                    JSONObject jSONObject2 = new JSONObject(str);
                    writeVar2.write = new Coupon();
                    ((Coupon) writeVar2.write).fromJSON(jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass2(str5, this, writeVar, writeVar2, str3, str4, zBooleanValue, iIntValue, str7, null), new MagicModuleSubmissionRequestBody() { // from class: o.getSignPendingIntent
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentDone2ViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
            }
        });
    }

    public final setUpdatedStatus<Boolean> read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<getAlgoValue> MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final setUpdatedStatus<Boolean> IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesImplApi21Parcelizer() {
        return this.RatingCompat;
    }

    public final NewNumberOtpResendRequest<Attachment> AudioAttributesCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ String AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<Plan> AudioAttributesImplBaseParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private /* synthetic */ PaymentDone2ViewModel MediaBrowserCompatMediaItem;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<Coupon> write;

        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0123 A[LOOP:0: B:26:0x0088->B:38:0x0123, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0120 A[SYNTHETIC] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, PaymentDone2ViewModel paymentDone2ViewModel, MagicModuleUseCaseImplWhenMappings.write<Plan> writeVar, MagicModuleUseCaseImplWhenMappings.write<Coupon> writeVar2, String str2, String str3, boolean z, int i, String str4, SampleVideos<? super AnonymousClass2> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompatMediaItem = paymentDone2ViewModel;
            this.AudioAttributesImplBaseParcelizer = writeVar;
            this.write = writeVar2;
            this.AudioAttributesImplApi26Parcelizer = str2;
            this.read = str3;
            this.RemoteActionCompatParcelizer = z;
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            this.AudioAttributesCompatParcelizer = str4;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new AnonymousClass2(this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, this.AudioAttributesImplBaseParcelizer, this.write, this.AudioAttributesImplApi26Parcelizer, this.read, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass2) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void IconCompatParcelizer(efmt p0) {
        getAlgoValue getalgovalueIconCompatParcelizer;
        getAlgoValue getalgovalue;
        GmsLogger gmsLoggerIconCompatParcelizer;
        getAlgoValue getalgovalueIconCompatParcelizer2;
        getAlgoValue getalgovalue2;
        GmsLogger gmsLoggerIconCompatParcelizer2;
        getAlgoValue getalgovalueIconCompatParcelizer3;
        getAlgoValue getalgovalue3;
        GmsLogger gmsLoggerIconCompatParcelizer3;
        getAlgoValue getalgovalueIconCompatParcelizer4;
        getAlgoValue getalgovalue4;
        GmsLogger gmsLoggerIconCompatParcelizer4;
        getAlgoValue getalgovalueIconCompatParcelizer5;
        getAlgoValue getalgovalue5;
        GmsLogger gmsLoggerIconCompatParcelizer5;
        getAlgoValue getalgovalueIconCompatParcelizer6;
        getAlgoValue getalgovalue6;
        GmsLogger gmsLoggerIconCompatParcelizer6;
        getAlgoValue getalgovalueIconCompatParcelizer7;
        getAlgoValue getalgovalue7;
        GmsLogger gmsLoggerIconCompatParcelizer7;
        getAlgoValue getalgovalueIconCompatParcelizer8;
        getAlgoValue getalgovalue8;
        GmsLogger gmsLoggerIconCompatParcelizer8;
        getAlgoValue getalgovalueIconCompatParcelizer9;
        getAlgoValue getalgovalue9;
        GmsLogger gmsLoggerIconCompatParcelizer9;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof efmt.read) {
            getResolutionSize<getAlgoValue> getresolutionsize = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer9 = getresolutionsize.IconCompatParcelizer();
                getalgovalue9 = getalgovalueIconCompatParcelizer9;
                GmsLogger remoteActionCompatParcelizer = getalgovalue9.getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer != null) {
                    efmt.read readVar = (efmt.read) p0;
                    String strWrite = readVar.write();
                    canLogPii canlogpii = canLogPii.INSTANCE;
                    gmsLoggerIconCompatParcelizer9 = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer.RatingCompat : null, (131071 & 2) != 0 ? remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? remoteActionCompatParcelizer.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? remoteActionCompatParcelizer.write : strWrite, (131071 & 16) != 0 ? remoteActionCompatParcelizer.IconCompatParcelizer : null, (131071 & 32) != 0 ? remoteActionCompatParcelizer.read : null, (131071 & 64) != 0 ? remoteActionCompatParcelizer.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? remoteActionCompatParcelizer.onCommand : null, (131071 & 256) != 0 ? remoteActionCompatParcelizer.MediaMetadataCompat : false, (131071 & 512) != 0 ? remoteActionCompatParcelizer.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer : canLogPii.AudioAttributesCompatParcelizer(readVar.write()), (131071 & 4096) != 0 ? remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? remoteActionCompatParcelizer.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? remoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler : null);
                } else {
                    gmsLoggerIconCompatParcelizer9 = null;
                }
            } while (!getresolutionsize.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer9, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue9.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue9.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue9.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue9.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue9.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue9.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue9.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue9.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue9.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue9.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer9)));
            return;
        }
        if (p0 instanceof efmt.AudioAttributesCompatParcelizer) {
            getResolutionSize<getAlgoValue> getresolutionsize2 = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer8 = getresolutionsize2.IconCompatParcelizer();
                getalgovalue8 = getalgovalueIconCompatParcelizer8;
                GmsLogger remoteActionCompatParcelizer2 = getalgovalue8.getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer2 != null) {
                    efmt.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (efmt.AudioAttributesCompatParcelizer) p0;
                    String str = audioAttributesCompatParcelizer.read();
                    canLogPii canlogpii2 = canLogPii.INSTANCE;
                    gmsLoggerIconCompatParcelizer8 = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer2.RatingCompat : null, (131071 & 2) != 0 ? remoteActionCompatParcelizer2.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? remoteActionCompatParcelizer2.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? remoteActionCompatParcelizer2.write : null, (131071 & 16) != 0 ? remoteActionCompatParcelizer2.IconCompatParcelizer : str, (131071 & 32) != 0 ? remoteActionCompatParcelizer2.read : null, (131071 & 64) != 0 ? remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? remoteActionCompatParcelizer2.onCommand : null, (131071 & 256) != 0 ? remoteActionCompatParcelizer2.MediaMetadataCompat : false, (131071 & 512) != 0 ? remoteActionCompatParcelizer2.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? remoteActionCompatParcelizer2.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? remoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? remoteActionCompatParcelizer2.AudioAttributesImplApi26Parcelizer : canLogPii.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.read()), (131071 & 8192) != 0 ? remoteActionCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? remoteActionCompatParcelizer2.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? remoteActionCompatParcelizer2.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? remoteActionCompatParcelizer2.handleMediaPlayPauseIfPendingOnHandler : null);
                } else {
                    gmsLoggerIconCompatParcelizer8 = null;
                }
            } while (!getresolutionsize2.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer8, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue8.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue8.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue8.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue8.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue8.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue8.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue8.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue8.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue8.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue8.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer8)));
            return;
        }
        if (p0 instanceof efmt.RemoteActionCompatParcelizer) {
            getResolutionSize<getAlgoValue> getresolutionsize3 = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer7 = getresolutionsize3.IconCompatParcelizer();
                getalgovalue7 = getalgovalueIconCompatParcelizer7;
                GmsLogger remoteActionCompatParcelizer3 = getalgovalue7.getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer3 != null) {
                    efmt.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = (efmt.RemoteActionCompatParcelizer) p0;
                    String strIconCompatParcelizer = remoteActionCompatParcelizer4.IconCompatParcelizer();
                    canLogPii canlogpii3 = canLogPii.INSTANCE;
                    gmsLoggerIconCompatParcelizer7 = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer3.RatingCompat : null, (131071 & 2) != 0 ? remoteActionCompatParcelizer3.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? remoteActionCompatParcelizer3.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? remoteActionCompatParcelizer3.write : null, (131071 & 16) != 0 ? remoteActionCompatParcelizer3.IconCompatParcelizer : null, (131071 & 32) != 0 ? remoteActionCompatParcelizer3.read : strIconCompatParcelizer, (131071 & 64) != 0 ? remoteActionCompatParcelizer3.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? remoteActionCompatParcelizer3.onCommand : null, (131071 & 256) != 0 ? remoteActionCompatParcelizer3.MediaMetadataCompat : false, (131071 & 512) != 0 ? remoteActionCompatParcelizer3.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? remoteActionCompatParcelizer3.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? remoteActionCompatParcelizer3.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? remoteActionCompatParcelizer3.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? remoteActionCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver : canLogPii.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer4.IconCompatParcelizer()), (131071 & 16384) != 0 ? remoteActionCompatParcelizer3.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? remoteActionCompatParcelizer3.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer3.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? remoteActionCompatParcelizer3.handleMediaPlayPauseIfPendingOnHandler : null);
                } else {
                    gmsLoggerIconCompatParcelizer7 = null;
                }
            } while (!getresolutionsize3.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer7, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue7.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue7.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue7.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue7.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue7.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue7.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue7.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue7.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue7.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue7.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer7)));
            return;
        }
        if (p0 instanceof efmt.IconCompatParcelizer) {
            getResolutionSize<getAlgoValue> getresolutionsize4 = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer6 = getresolutionsize4.IconCompatParcelizer();
                getalgovalue6 = getalgovalueIconCompatParcelizer6;
                GmsLogger remoteActionCompatParcelizer5 = getalgovalue6.getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer5 != null) {
                    efmt.IconCompatParcelizer iconCompatParcelizer = (efmt.IconCompatParcelizer) p0;
                    String strRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer();
                    canLogPii canlogpii4 = canLogPii.INSTANCE;
                    gmsLoggerIconCompatParcelizer6 = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer5.RatingCompat : null, (131071 & 2) != 0 ? remoteActionCompatParcelizer5.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? remoteActionCompatParcelizer5.RemoteActionCompatParcelizer : strRemoteActionCompatParcelizer, (131071 & 8) != 0 ? remoteActionCompatParcelizer5.write : null, (131071 & 16) != 0 ? remoteActionCompatParcelizer5.IconCompatParcelizer : null, (131071 & 32) != 0 ? remoteActionCompatParcelizer5.read : null, (131071 & 64) != 0 ? remoteActionCompatParcelizer5.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? remoteActionCompatParcelizer5.onCommand : null, (131071 & 256) != 0 ? remoteActionCompatParcelizer5.MediaMetadataCompat : false, (131071 & 512) != 0 ? remoteActionCompatParcelizer5.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? remoteActionCompatParcelizer5.MediaBrowserCompatItemReceiver : canLogPii.read(iconCompatParcelizer.RemoteActionCompatParcelizer()), (131071 & 2048) != 0 ? remoteActionCompatParcelizer5.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? remoteActionCompatParcelizer5.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? remoteActionCompatParcelizer5.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? remoteActionCompatParcelizer5.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? remoteActionCompatParcelizer5.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? remoteActionCompatParcelizer5.handleMediaPlayPauseIfPendingOnHandler : null);
                } else {
                    gmsLoggerIconCompatParcelizer6 = null;
                }
            } while (!getresolutionsize4.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer6, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue6.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue6.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue6.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue6.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue6.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue6.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue6.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue6.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue6.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue6.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer6)));
            return;
        }
        if (p0 instanceof efmt.write) {
            getResolutionSize<getAlgoValue> getresolutionsize5 = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer5 = getresolutionsize5.IconCompatParcelizer();
                getalgovalue5 = getalgovalueIconCompatParcelizer5;
                GmsLogger remoteActionCompatParcelizer6 = getalgovalue5.getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer6 != null) {
                    efmt.write writeVar = (efmt.write) p0;
                    String strRemoteActionCompatParcelizer2 = writeVar.RemoteActionCompatParcelizer();
                    canLogPii canlogpii5 = canLogPii.INSTANCE;
                    gmsLoggerIconCompatParcelizer5 = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer6.RatingCompat : null, (131071 & 2) != 0 ? remoteActionCompatParcelizer6.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? remoteActionCompatParcelizer6.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? remoteActionCompatParcelizer6.write : null, (131071 & 16) != 0 ? remoteActionCompatParcelizer6.IconCompatParcelizer : null, (131071 & 32) != 0 ? remoteActionCompatParcelizer6.read : null, (131071 & 64) != 0 ? remoteActionCompatParcelizer6.AudioAttributesCompatParcelizer : strRemoteActionCompatParcelizer2, (131071 & 128) != 0 ? remoteActionCompatParcelizer6.onCommand : null, (131071 & 256) != 0 ? remoteActionCompatParcelizer6.MediaMetadataCompat : false, (131071 & 512) != 0 ? remoteActionCompatParcelizer6.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? remoteActionCompatParcelizer6.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? remoteActionCompatParcelizer6.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? remoteActionCompatParcelizer6.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? remoteActionCompatParcelizer6.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? remoteActionCompatParcelizer6.AudioAttributesImplBaseParcelizer : canLogPii.write(writeVar.RemoteActionCompatParcelizer()), (131071 & 32768) != 0 ? remoteActionCompatParcelizer6.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer6.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? remoteActionCompatParcelizer6.handleMediaPlayPauseIfPendingOnHandler : null);
                } else {
                    gmsLoggerIconCompatParcelizer5 = null;
                }
            } while (!getresolutionsize5.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer5, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue5.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue5.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue5.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue5.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue5.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue5.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue5.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue5.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue5.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue5.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer5)));
            return;
        }
        if (p0 instanceof efmt.MediaBrowserCompatCustomActionResultReceiver) {
            getResolutionSize<getAlgoValue> getresolutionsize6 = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer4 = getresolutionsize6.IconCompatParcelizer();
                getalgovalue4 = getalgovalueIconCompatParcelizer4;
                GmsLogger remoteActionCompatParcelizer7 = getalgovalue4.getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer7 != null) {
                    efmt.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (efmt.MediaBrowserCompatCustomActionResultReceiver) p0;
                    String strWrite2 = mediaBrowserCompatCustomActionResultReceiver.write();
                    canLogPii canlogpii6 = canLogPii.INSTANCE;
                    gmsLoggerIconCompatParcelizer4 = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer7.RatingCompat : strWrite2, (131071 & 2) != 0 ? remoteActionCompatParcelizer7.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? remoteActionCompatParcelizer7.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? remoteActionCompatParcelizer7.write : null, (131071 & 16) != 0 ? remoteActionCompatParcelizer7.IconCompatParcelizer : null, (131071 & 32) != 0 ? remoteActionCompatParcelizer7.read : null, (131071 & 64) != 0 ? remoteActionCompatParcelizer7.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? remoteActionCompatParcelizer7.onCommand : null, (131071 & 256) != 0 ? remoteActionCompatParcelizer7.MediaMetadataCompat : canLogPii.IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.write()), (131071 & 512) != 0 ? remoteActionCompatParcelizer7.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? remoteActionCompatParcelizer7.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? remoteActionCompatParcelizer7.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? remoteActionCompatParcelizer7.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? remoteActionCompatParcelizer7.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? remoteActionCompatParcelizer7.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? remoteActionCompatParcelizer7.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer7.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? remoteActionCompatParcelizer7.handleMediaPlayPauseIfPendingOnHandler : null);
                } else {
                    gmsLoggerIconCompatParcelizer4 = null;
                }
            } while (!getresolutionsize6.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer4, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue4.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue4.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue4.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue4.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue4.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue4.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue4.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue4.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue4.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue4.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer4)));
            return;
        }
        if (p0 instanceof efmt.AudioAttributesImplApi26Parcelizer) {
            getResolutionSize<getAlgoValue> getresolutionsize7 = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer3 = getresolutionsize7.IconCompatParcelizer();
                getalgovalue3 = getalgovalueIconCompatParcelizer3;
                GmsLogger remoteActionCompatParcelizer8 = getalgovalue3.getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer8 != null) {
                    efmt.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (efmt.AudioAttributesImplApi26Parcelizer) p0;
                    String strAudioAttributesCompatParcelizer = audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
                    canLogPii canlogpii7 = canLogPii.INSTANCE;
                    gmsLoggerIconCompatParcelizer3 = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer8.RatingCompat : null, (131071 & 2) != 0 ? remoteActionCompatParcelizer8.MediaBrowserCompatSearchResultReceiver : strAudioAttributesCompatParcelizer, (131071 & 4) != 0 ? remoteActionCompatParcelizer8.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? remoteActionCompatParcelizer8.write : null, (131071 & 16) != 0 ? remoteActionCompatParcelizer8.IconCompatParcelizer : null, (131071 & 32) != 0 ? remoteActionCompatParcelizer8.read : null, (131071 & 64) != 0 ? remoteActionCompatParcelizer8.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? remoteActionCompatParcelizer8.onCommand : null, (131071 & 256) != 0 ? remoteActionCompatParcelizer8.MediaMetadataCompat : false, (131071 & 512) != 0 ? remoteActionCompatParcelizer8.MediaDescriptionCompat : canLogPii.read(audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer()), (131071 & 1024) != 0 ? remoteActionCompatParcelizer8.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? remoteActionCompatParcelizer8.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? remoteActionCompatParcelizer8.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? remoteActionCompatParcelizer8.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? remoteActionCompatParcelizer8.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? remoteActionCompatParcelizer8.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer8.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? remoteActionCompatParcelizer8.handleMediaPlayPauseIfPendingOnHandler : null);
                } else {
                    gmsLoggerIconCompatParcelizer3 = null;
                }
            } while (!getresolutionsize7.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer3, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue3.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue3.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue3.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue3.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue3.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue3.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue3.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue3.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue3.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue3.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer3)));
            return;
        }
        if (p0 instanceof efmt.AudioAttributesImplBaseParcelizer) {
            getResolutionSize<getAlgoValue> getresolutionsize8 = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer2 = getresolutionsize8.IconCompatParcelizer();
                getalgovalue2 = getalgovalueIconCompatParcelizer2;
                GmsLogger remoteActionCompatParcelizer9 = getalgovalue2.getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer9 != null) {
                    efmt.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (efmt.AudioAttributesImplBaseParcelizer) p0;
                    String strAudioAttributesCompatParcelizer2 = audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
                    canLogPii canlogpii8 = canLogPii.INSTANCE;
                    gmsLoggerIconCompatParcelizer2 = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer9.RatingCompat : null, (131071 & 2) != 0 ? remoteActionCompatParcelizer9.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? remoteActionCompatParcelizer9.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? remoteActionCompatParcelizer9.write : null, (131071 & 16) != 0 ? remoteActionCompatParcelizer9.IconCompatParcelizer : null, (131071 & 32) != 0 ? remoteActionCompatParcelizer9.read : null, (131071 & 64) != 0 ? remoteActionCompatParcelizer9.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? remoteActionCompatParcelizer9.onCommand : strAudioAttributesCompatParcelizer2, (131071 & 256) != 0 ? remoteActionCompatParcelizer9.MediaMetadataCompat : false, (131071 & 512) != 0 ? remoteActionCompatParcelizer9.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? remoteActionCompatParcelizer9.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? remoteActionCompatParcelizer9.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? remoteActionCompatParcelizer9.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? remoteActionCompatParcelizer9.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? remoteActionCompatParcelizer9.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? remoteActionCompatParcelizer9.MediaBrowserCompatMediaItem : canLogPii.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer()), (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer9.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : null, (131071 & 131072) != 0 ? remoteActionCompatParcelizer9.handleMediaPlayPauseIfPendingOnHandler : null);
                } else {
                    gmsLoggerIconCompatParcelizer2 = null;
                }
            } while (!getresolutionsize8.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer2, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue2.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue2.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue2.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue2.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue2.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue2.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue2.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue2.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue2.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue2.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer2)));
            return;
        }
        if (p0 instanceof efmt.MediaBrowserCompatItemReceiver) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (!(p0 instanceof efmt.AudioAttributesImplApi21Parcelizer)) {
            throw new RenewEligibleCreator();
        }
        getResolutionSize<getAlgoValue> getresolutionsize9 = this.AudioAttributesImplApi21Parcelizer;
        do {
            getalgovalueIconCompatParcelizer = getresolutionsize9.IconCompatParcelizer();
            getalgovalue = getalgovalueIconCompatParcelizer;
            GmsLogger remoteActionCompatParcelizer10 = getalgovalue.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer10 != null) {
                gmsLoggerIconCompatParcelizer = GmsLogger.IconCompatParcelizer((131071 & 1) != 0 ? remoteActionCompatParcelizer10.RatingCompat : null, (131071 & 2) != 0 ? remoteActionCompatParcelizer10.MediaBrowserCompatSearchResultReceiver : null, (131071 & 4) != 0 ? remoteActionCompatParcelizer10.RemoteActionCompatParcelizer : null, (131071 & 8) != 0 ? remoteActionCompatParcelizer10.write : null, (131071 & 16) != 0 ? remoteActionCompatParcelizer10.IconCompatParcelizer : null, (131071 & 32) != 0 ? remoteActionCompatParcelizer10.read : null, (131071 & 64) != 0 ? remoteActionCompatParcelizer10.AudioAttributesCompatParcelizer : null, (131071 & 128) != 0 ? remoteActionCompatParcelizer10.onCommand : null, (131071 & 256) != 0 ? remoteActionCompatParcelizer10.MediaMetadataCompat : false, (131071 & 512) != 0 ? remoteActionCompatParcelizer10.MediaDescriptionCompat : false, (131071 & 1024) != 0 ? remoteActionCompatParcelizer10.MediaBrowserCompatItemReceiver : false, (131071 & 2048) != 0 ? remoteActionCompatParcelizer10.AudioAttributesImplApi21Parcelizer : false, (131071 & 4096) != 0 ? remoteActionCompatParcelizer10.AudioAttributesImplApi26Parcelizer : false, (131071 & 8192) != 0 ? remoteActionCompatParcelizer10.MediaBrowserCompatCustomActionResultReceiver : false, (131071 & 16384) != 0 ? remoteActionCompatParcelizer10.AudioAttributesImplBaseParcelizer : false, (131071 & 32768) != 0 ? remoteActionCompatParcelizer10.MediaBrowserCompatMediaItem : false, (131071 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteActionCompatParcelizer10.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver : ((efmt.AudioAttributesImplApi21Parcelizer) p0).AudioAttributesCompatParcelizer(), (131071 & 131072) != 0 ? remoteActionCompatParcelizer10.handleMediaPlayPauseIfPendingOnHandler : null);
            } else {
                gmsLoggerIconCompatParcelizer = null;
            }
        } while (!getresolutionsize9.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue.RemoteActionCompatParcelizer : gmsLoggerIconCompatParcelizer)));
    }

    public final void write(Fido2PrivilegedApiClient p0) {
        getAlgoValue getalgovalueIconCompatParcelizer;
        getAlgoValue getalgovalue;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.RemoteActionCompatParcelizer.INSTANCE)) {
            AudioAttributesImplBaseParcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            getResolutionSize<Boolean> getresolutionsize = this.MediaBrowserCompatSearchResultReceiver;
            do {
            } while (!getresolutionsize.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), Boolean.valueOf(!r13.booleanValue())));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.getSignIntent
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentDone2ViewModel.MediaDescriptionCompat((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.TransportUnsupportedTransportException
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentDone2ViewModel.MediaBrowserCompatMediaItem((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.IconCompatParcelizer.INSTANCE) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.write.INSTANCE)) {
            if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().getRemoteActionCompatParcelizer() == null) {
                MediaBrowserCompatItemReceiver();
                return;
            } else {
                CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.getRegisterIntent
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentDone2ViewModel.handleMediaPlayPauseIfPendingOnHandler((String) obj2);
                    }
                });
                return;
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.AudioAttributesCompatParcelizer.INSTANCE)) {
            getResolutionSize<getAlgoValue> getresolutionsize2 = this.AudioAttributesImplApi21Parcelizer;
            do {
                getalgovalueIconCompatParcelizer = getresolutionsize2.IconCompatParcelizer();
                getalgovalue = getalgovalueIconCompatParcelizer;
            } while (!getresolutionsize2.AudioAttributesCompatParcelizer(getalgovalueIconCompatParcelizer, getAlgoValue.read((UnixStat.DEFAULT_LINK_PERM & 1) != 0 ? getalgovalue.IconCompatParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 2) != 0 ? getalgovalue.AudioAttributesImplApi26Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 4) != 0 ? getalgovalue.AudioAttributesImplBaseParcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 8) != 0 ? getalgovalue.write : null, (UnixStat.DEFAULT_LINK_PERM & 16) != 0 ? getalgovalue.read : null, (UnixStat.DEFAULT_LINK_PERM & 32) != 0 ? getalgovalue.AudioAttributesCompatParcelizer : false, (UnixStat.DEFAULT_LINK_PERM & 64) != 0 ? getalgovalue.MediaBrowserCompatCustomActionResultReceiver : 0, (UnixStat.DEFAULT_LINK_PERM & 128) != 0 ? getalgovalue.AudioAttributesImplApi21Parcelizer : null, (UnixStat.DEFAULT_LINK_PERM & 256) != 0 ? getalgovalue.MediaBrowserCompatItemReceiver : false, (UnixStat.DEFAULT_LINK_PERM & 512) != 0 ? getalgovalue.RemoteActionCompatParcelizer : null)));
            return;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, Fido2PrivilegedApiClient.read.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        this.write.AudioAttributesCompatParcelizer("showInitialAnimation", Boolean.FALSE);
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
                if (PaymentDone2ViewModel.this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new Attachment.IconCompatParcelizer(null, null), this) == objIconCompatParcelizer) {
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
            return PaymentDone2ViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (PaymentDone2ViewModel.this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(Attachment.AudioAttributesCompatParcelizer.INSTANCE, this) == objIconCompatParcelizer) {
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
            return PaymentDone2ViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatMediaItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (PaymentDone2ViewModel.this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(Attachment.write.INSTANCE, this) == objIconCompatParcelizer) {
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentDone2ViewModel.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
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
                if (PaymentDone2ViewModel.this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(Attachment.RemoteActionCompatParcelizer.INSTANCE, this) == objIconCompatParcelizer) {
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
            return PaymentDone2ViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.parseTransports
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentDone2ViewModel.RatingCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RatingCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                GmsLogger remoteActionCompatParcelizer = ((getAlgoValue) PaymentDone2ViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()).getRemoteActionCompatParcelizer();
                if (remoteActionCompatParcelizer == null || !remoteActionCompatParcelizer.MediaDescriptionCompat()) {
                    this.RemoteActionCompatParcelizer = 1;
                    if (PaymentDone2ViewModel.this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(Attachment.MediaBrowserCompatItemReceiver.INSTANCE, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    isSeekPending isseekpending = PaymentDone2ViewModel.this.IconCompatParcelizer;
                    ICancelTokenStub iCancelTokenStub = ICancelTokenStub.INSTANCE;
                    Plan audioAttributesImplApi26Parcelizer = ((getAlgoValue) PaymentDone2ViewModel.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer()).getAudioAttributesImplApi26Parcelizer();
                    isseekpending.write(ICancelTokenStub.IconCompatParcelizer(audioAttributesImplApi26Parcelizer != null ? audioAttributesImplApi26Parcelizer.getId() : null), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    PaymentDone2ViewModel.this.MediaMetadataCompat();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentDone2ViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.Fido2ApiClient
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentDone2ViewModel.MediaBrowserCompatSearchResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private Object read;

        /* JADX WARN: Code restructure failed: missing block: B:80:0x018d, code lost:
        
            if (r17.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(r17) == r1) goto L84;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.AudioAttributesImplBaseParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentDone2ViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaMetadataCompat() {
        getResolutionSize<Boolean> getresolutionsize = this.AudioAttributesImplBaseParcelizer;
        while (!getresolutionsize.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), Boolean.TRUE)) {
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.hasPendingIntent
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentDone2ViewModel.write(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(PaymentDone2ViewModel paymentDone2ViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        getResolutionSize<Boolean> getresolutionsize = paymentDone2ViewModel.AudioAttributesImplBaseParcelizer;
        while (!getresolutionsize.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), Boolean.FALSE)) {
        }
        paymentDone2ViewModel.write(i, str);
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ PaymentDone2ViewModel read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r4.read.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(o.Attachment.AudioAttributesImplApi26Parcelizer.INSTANCE, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            if (r4.read.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new o.Attachment.AudioAttributesImplBaseParcelizer(r4.IconCompatParcelizer), r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            return r0;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r4.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L17:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                goto L51
            L1b:
                kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                int r5 = r4.RemoteActionCompatParcelizer
                r1 = 502(0x1f6, float:7.03E-43)
                if (r5 != r1) goto L38
                com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel r5 = r4.read
                o.fromCursor r5 = com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.read(r5)
                o.Attachment$AudioAttributesImplApi26Parcelizer r1 = o.Attachment.AudioAttributesImplApi26Parcelizer.INSTANCE
                r2 = r4
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r4.write = r3
                java.lang.Object r4 = r5.RemoteActionCompatParcelizer(r1, r2)
                if (r4 != r0) goto L51
                goto L50
            L38:
                com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel r5 = r4.read
                o.fromCursor r5 = com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.read(r5)
                java.lang.String r1 = r4.IconCompatParcelizer
                o.Attachment$AudioAttributesImplBaseParcelizer r3 = new o.Attachment$AudioAttributesImplBaseParcelizer
                r3.<init>(r1)
                r1 = r4
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r4.write = r2
                java.lang.Object r4 = r5.RemoteActionCompatParcelizer(r3, r1)
                if (r4 != r0) goto L51
            L50:
                return r0
            L51:
                o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.MediaBrowserCompatCustomActionResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(int i, PaymentDone2ViewModel paymentDone2ViewModel, String str, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = i;
            this.read = paymentDone2ViewModel;
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return new MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write(int p0, String p1) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(p0, this, p1, null), new MagicModuleSubmissionRequestBody() { // from class: o.launchPendingIntent
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentDone2ViewModel.onCommand((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IconCompatParcelizer(boolean p0, Boolean p1) {
        if (p0) {
            return true;
        }
        return p1 != null && p1.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r0.RemoteActionCompatParcelizer(r1, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.AudioAttributesImplApi21Parcelizer
            if (r2 == 0) goto L18
            r2 = r1
            com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel$AudioAttributesImplApi21Parcelizer r2 = (com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.AudioAttributesImplApi21Parcelizer) r2
            int r3 = r2.RemoteActionCompatParcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.RemoteActionCompatParcelizer
            int r1 = r1 + r4
            r2.RemoteActionCompatParcelizer = r1
            goto L1d
        L18:
            com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel$AudioAttributesImplApi21Parcelizer r2 = new com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel$AudioAttributesImplApi21Parcelizer
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.IconCompatParcelizer
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.RemoteActionCompatParcelizer
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L7a
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L6d
        L3d:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            o.getResolutionSize<o.getAlgoValue> r1 = r0.AudioAttributesImplApi21Parcelizer
        L42:
            java.lang.Object r4 = r1.IconCompatParcelizer()
            r7 = r4
            o.getAlgoValue r7 = (kotlin.getAlgoValue) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 511(0x1ff, float:7.16E-43)
            o.getAlgoValue r7 = kotlin.getAlgoValue.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r4 = r1.AudioAttributesCompatParcelizer(r4, r7)
            if (r4 == 0) goto L42
            o.fromCursor<o.Attachment> r1 = r0.MediaBrowserCompatMediaItem
            o.Attachment$MediaBrowserCompatCustomActionResultReceiver r4 = o.Attachment.MediaBrowserCompatCustomActionResultReceiver.INSTANCE
            r2.RemoteActionCompatParcelizer = r6
            java.lang.Object r1 = r1.RemoteActionCompatParcelizer(r4, r2)
            if (r1 == r3) goto L7d
        L6d:
            o.fromCursor<o.Attachment> r0 = r0.MediaBrowserCompatMediaItem
            o.Attachment$read r1 = o.Attachment.read.INSTANCE
            r2.RemoteActionCompatParcelizer = r5
            java.lang.Object r0 = r0.RemoteActionCompatParcelizer(r1, r2)
            if (r0 != r3) goto L7a
            goto L7d
        L7a:
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
            return r0
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private Object read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        
            if (r5.IconCompatParcelizer.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new o.Attachment.IconCompatParcelizer(r6.read(), r6.RemoteActionCompatParcelizer()), r5) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r5.RemoteActionCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L56
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L32
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel r6 = com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.this
                o.readUnsignedLongToLong r6 = com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.RemoteActionCompatParcelizer(r6)
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.RemoteActionCompatParcelizer = r3
                java.lang.Object r6 = r6.write(r1)
                if (r6 == r0) goto L59
            L32:
                o.shouldSkipByte r6 = (kotlin.shouldSkipByte) r6
                com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel r1 = com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.this
                o.fromCursor r1 = com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.read(r1)
                java.lang.String r3 = r6.read()
                java.lang.String r6 = r6.RemoteActionCompatParcelizer()
                o.Attachment$IconCompatParcelizer r4 = new o.Attachment$IconCompatParcelizer
                r4.<init>(r3, r6)
                r6 = r5
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r3 = 0
                r5.read = r3
                r5.RemoteActionCompatParcelizer = r2
                java.lang.Object r5 = r1.RemoteActionCompatParcelizer(r4, r6)
                if (r5 != r0) goto L56
                goto L59
            L56:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L59:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.plan.post_purchase.PaymentDone2ViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentDone2ViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.getRegisterPendingIntent
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentDone2ViewModel.MediaMetadataCompat((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
