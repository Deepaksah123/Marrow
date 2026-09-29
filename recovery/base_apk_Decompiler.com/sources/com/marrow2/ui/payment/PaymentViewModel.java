package com.marrow2.ui.payment;

import com.marrow2.ui.payment.PaymentViewModel;
import com.marrow2.ui.payment.model.DeliveryAddressModel;
import com.marrow2.ui.payment.model.PaymentArgs;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DtsReader;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TestGroupLSModel;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.deserializeIterableFromIntentExtraSafe;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.readLittleEndianInt24;
import kotlin.readLittleEndianShort;
import kotlin.readLong;
import kotlin.readShort;
import kotlin.serializeIterableToBundle;
import kotlin.serializeIterableToBundleSafe;
import kotlin.setFastestInterval;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u000e\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0011J\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0011J-\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b\u0014\u0010\"J-\u0010#\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010\"J-\u0010\u001a\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b\u001a\u0010%R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u0014\u0010#\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020,0.8\u0007¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0014\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u00104R \u0010/\u001a\b\u0012\u0004\u0012\u000203068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u001a\u00109R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010:"}, d2 = {"Lcom/marrow2/ui/payment/PaymentViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/readLittleEndianShort;", "p0", "Lo/isSeekPending;", "p1", "Lo/POJOPropertyBuilder5;", "p2", "<init>", "(Lo/readLittleEndianShort;Lo/isSeekPending;Lo/POJOPropertyBuilder5;)V", "", "", "Lcom/marrow2/ui/payment/model/DeliveryAddressModel;", "", "write", "(Ljava/lang/String;Ljava/lang/Double;Lcom/marrow2/ui/payment/model/DeliveryAddressModel;)V", "onPlay", "(Ljava/lang/String;)V", "onCustomAction", "Lo/deserializeIterableFromIntentExtraSafe;", "read", "(Lo/deserializeIterableFromIntentExtraSafe;)V", "Lo/readLong;", "AudioAttributesCompatParcelizer", "(Lcom/marrow2/ui/payment/model/DeliveryAddressModel;)Lo/readLong;", "Lo/readLittleEndianInt24;", "IconCompatParcelizer", "(Lo/readLittleEndianInt24;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/readShort;", "(Lo/readShort;Lo/SampleVideos;)Ljava/lang/Object;", "onPause", "RatingCompat", "MediaBrowserCompatMediaItem", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "RemoteActionCompatParcelizer", "Lo/setFastestInterval$read;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo/setFastestInterval$read;", "AudioAttributesImplBaseParcelizer", "Lo/readLittleEndianShort;", "Lo/isSeekPending;", "Lcom/marrow2/ui/payment/model/PaymentArgs;", "Lcom/marrow2/ui/payment/model/PaymentArgs;", "Lo/fromCursor;", "Lo/serializeIterableToBundle;", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "AudioAttributesImplApi26Parcelizer", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "Lo/getResolutionSize;", "Lo/serializeIterableToBundleSafe;", "Lo/getResolutionSize;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setUpdatedStatus;", "MediaBrowserCompatItemReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<serializeIterableToBundleSafe> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<serializeIterableToBundle> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final readLittleEndianShort write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<serializeIterableToBundleSafe> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final PaymentArgs RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final fromCursor<serializeIterableToBundle> read;

    @setSdkPayload
    public PaymentViewModel(readLittleEndianShort readlittleendianshort, isSeekPending isseekpending, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(readlittleendianshort, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.write = readlittleendianshort;
        this.IconCompatParcelizer = isseekpending;
        PaymentArgs.Companion companion = PaymentArgs.INSTANCE;
        PaymentArgs paymentArgsAudioAttributesCompatParcelizer = PaymentArgs.Companion.AudioAttributesCompatParcelizer(pOJOPropertyBuilder5);
        this.RemoteActionCompatParcelizer = paymentArgsAudioAttributesCompatParcelizer;
        fromCursor<serializeIterableToBundle> fromcursor = getLastName.read(0, null, 7);
        this.read = fromcursor;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        getResolutionSize<serializeIterableToBundleSafe> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new serializeIterableToBundleSafe(false, 1, null));
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        write(paymentArgsAudioAttributesCompatParcelizer.getIconCompatParcelizer(), paymentArgsAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer(), paymentArgsAudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer());
    }

    public final NewNumberOtpResendRequest<serializeIterableToBundle> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setUpdatedStatus<serializeIterableToBundleSafe> IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private final void write(String p0, Double p1, DeliveryAddressModel p2) {
        readLong readlongAudioAttributesCompatParcelizer;
        String str = p0;
        if (str == null || str.length() == 0 || p1 == null || (readlongAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p2)) == null) {
            return;
        }
        getResolutionSize<serializeIterableToBundleSafe> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
        getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(serializeIterableToBundleSafe.RemoteActionCompatParcelizer(true));
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(p0, p1, readlongAudioAttributesCompatParcelizer, null), new MagicModuleSubmissionRequestBody() { // from class: o.deserializeFromIntentExtra
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentViewModel.AudioAttributesImplBaseParcelizer(this.write, (String) obj2);
            }
        });
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ readLong RemoteActionCompatParcelizer;
        private Object read;
        private /* synthetic */ Double write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
        
            if (r1.IconCompatParcelizer((kotlin.readLittleEndianInt24) r11, r10) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r10.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L69
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L3c
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                com.marrow2.ui.payment.PaymentViewModel r11 = com.marrow2.ui.payment.PaymentViewModel.this
                o.readLittleEndianShort r4 = com.marrow2.ui.payment.PaymentViewModel.AudioAttributesCompatParcelizer(r11)
                java.lang.String r5 = r10.IconCompatParcelizer
                java.lang.Double r11 = r10.write
                double r6 = r11.doubleValue()
                o.readLong r8 = r10.RemoteActionCompatParcelizer
                r9 = r10
                o.SampleVideos r9 = (kotlin.SampleVideos) r9
                r10.AudioAttributesCompatParcelizer = r3
                java.lang.Object r11 = r4.AudioAttributesCompatParcelizer(r5, r6, r8, r9)
                if (r11 == r0) goto L6c
            L3c:
                o.readLittleEndianInt24 r11 = (kotlin.readLittleEndianInt24) r11
                com.marrow2.ui.payment.PaymentViewModel r1 = com.marrow2.ui.payment.PaymentViewModel.this
                o.getResolutionSize r1 = com.marrow2.ui.payment.PaymentViewModel.read(r1)
                com.marrow2.ui.payment.PaymentViewModel r3 = com.marrow2.ui.payment.PaymentViewModel.this
                o.getResolutionSize r3 = com.marrow2.ui.payment.PaymentViewModel.read(r3)
                java.lang.Object r3 = r3.IconCompatParcelizer()
                o.serializeIterableToBundleSafe r3 = (kotlin.serializeIterableToBundleSafe) r3
                r3 = 0
                o.serializeIterableToBundleSafe r3 = kotlin.serializeIterableToBundleSafe.RemoteActionCompatParcelizer(r3)
                r1.write(r3)
                com.marrow2.ui.payment.PaymentViewModel r1 = com.marrow2.ui.payment.PaymentViewModel.this
                r3 = r10
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r4 = 0
                r10.read = r4
                r10.AudioAttributesCompatParcelizer = r2
                java.lang.Object r10 = com.marrow2.ui.payment.PaymentViewModel.RemoteActionCompatParcelizer(r1, r11, r3)
                if (r10 != r0) goto L69
                goto L6c
            L69:
                o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                return r10
            L6c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.payment.PaymentViewModel.AudioAttributesCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, Double d, readLong readlong, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
            this.write = d;
            this.RemoteActionCompatParcelizer = readlong;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(PaymentViewModel paymentViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        getResolutionSize<serializeIterableToBundleSafe> getresolutionsize = paymentViewModel.MediaBrowserCompatCustomActionResultReceiver;
        getresolutionsize.IconCompatParcelizer();
        getresolutionsize.write(serializeIterableToBundleSafe.RemoteActionCompatParcelizer(false));
        paymentViewModel.onPlay(str);
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (PaymentViewModel.this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.AudioAttributesCompatParcelizer(this.read), this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatSearchResultReceiver(String str, SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new MediaBrowserCompatSearchResultReceiver(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onPlay(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatSearchResultReceiver(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.SafeParcelableReserved
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentViewModel.onPlayFromMediaId((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onPlayFromMediaId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (PaymentViewModel.this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.AudioAttributesCompatParcelizer(this.IconCompatParcelizer), this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatItemReceiver(String str, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void onCustomAction(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatItemReceiver(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.SafeParcelableSerializer
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentViewModel.onCommand((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    public final void read(deserializeIterableFromIntentExtraSafe p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, deserializeIterableFromIntentExtraSafe.AudioAttributesImplBaseParcelizer.INSTANCE)) {
            onPause(this.AudioAttributesImplBaseParcelizer);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            return;
        }
        if (p0 instanceof deserializeIterableFromIntentExtraSafe.AudioAttributesImplApi21Parcelizer) {
            read(this.RemoteActionCompatParcelizer.getIconCompatParcelizer(), this.RemoteActionCompatParcelizer.getRead(), this.RemoteActionCompatParcelizer.getWrite());
            MediaBrowserCompatMediaItem(((deserializeIterableFromIntentExtraSafe.AudioAttributesImplApi21Parcelizer) p0).write());
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, deserializeIterableFromIntentExtraSafe.write.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.getter
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentViewModel.MediaMetadataCompat((String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof deserializeIterableFromIntentExtraSafe.read) {
            RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.getIconCompatParcelizer(), this.RemoteActionCompatParcelizer.getRead(), this.RemoteActionCompatParcelizer.getWrite());
            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
            return;
        }
        if (p0 instanceof deserializeIterableFromIntentExtraSafe.RemoteActionCompatParcelizer) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatCustomActionResultReceiver(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.SafeParcelableVersionField
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentViewModel.MediaDescriptionCompat((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, deserializeIterableFromIntentExtraSafe.IconCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplBaseParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.SafeParcelableRemovedParam
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentViewModel.MediaBrowserCompatSearchResultReceiver((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, deserializeIterableFromIntentExtraSafe.MediaBrowserCompatCustomActionResultReceiver.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi26Parcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.deserializeIterableFromBundleSafe
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentViewModel.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver((String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof deserializeIterableFromIntentExtraSafe.MediaBrowserCompatItemReceiver) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesImplApi21Parcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.deserializeFromBytes
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentViewModel.handleMediaPlayPauseIfPendingOnHandler((String) obj2);
                }
            });
            return;
        }
        if (p0 instanceof deserializeIterableFromIntentExtraSafe.AudioAttributesCompatParcelizer) {
            DtsReader.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(((deserializeIterableFromIntentExtraSafe.AudioAttributesCompatParcelizer) p0).read());
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.deserializeIterableFromBundle
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentViewModel.onAddQueueItem((String) obj2);
                }
            });
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, deserializeIterableFromIntentExtraSafe.AudioAttributesImplApi26Parcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            getResolutionSize<serializeIterableToBundleSafe> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
            getresolutionsize.IconCompatParcelizer();
            getresolutionsize.write(serializeIterableToBundleSafe.RemoteActionCompatParcelizer(false));
            getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (PaymentViewModel.this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.AudioAttributesCompatParcelizer("COD Initiated"), this) == objIconCompatParcelizer) {
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
            return PaymentViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaMetadataCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ deserializeIterableFromIntentExtraSafe AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                fromCursor fromcursor = PaymentViewModel.this.read;
                String str = PaymentViewModel.this.AudioAttributesImplBaseParcelizer;
                if (str == null) {
                    str = "";
                }
                this.read = 1;
                if (fromcursor.RemoteActionCompatParcelizer(new serializeIterableToBundle.RemoteActionCompatParcelizer(str, ((deserializeIterableFromIntentExtraSafe.RemoteActionCompatParcelizer) this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(), ((deserializeIterableFromIntentExtraSafe.RemoteActionCompatParcelizer) this.AudioAttributesCompatParcelizer).write()), this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatCustomActionResultReceiver(deserializeIterableFromIntentExtraSafe deserializeiterablefromintentextrasafe, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = deserializeiterablefromintentextrasafe;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaDescriptionCompat(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (PaymentViewModel.this.read.RemoteActionCompatParcelizer(serializeIterableToBundle.write.INSTANCE, this) == objIconCompatParcelizer) {
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatSearchResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (PaymentViewModel.this.read.RemoteActionCompatParcelizer(serializeIterableToBundle.read.INSTANCE, this) == objIconCompatParcelizer) {
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
            return PaymentViewModel.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ deserializeIterableFromIntentExtraSafe RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (PaymentViewModel.this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.AudioAttributesCompatParcelizer(((deserializeIterableFromIntentExtraSafe.MediaBrowserCompatItemReceiver) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer()), this) == objIconCompatParcelizer) {
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
        AudioAttributesImplApi21Parcelizer(deserializeIterableFromIntentExtraSafe deserializeiterablefromintentextrasafe, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = deserializeiterablefromintentextrasafe;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup handleMediaPlayPauseIfPendingOnHandler(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (PaymentViewModel.this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.AudioAttributesCompatParcelizer(null), this) == objIconCompatParcelizer) {
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
            return PaymentViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onAddQueueItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private static readLong AudioAttributesCompatParcelizer(DeliveryAddressModel p0) {
        String write2;
        String remoteActionCompatParcelizer;
        String iconCompatParcelizer;
        String audioAttributesCompatParcelizer;
        String read2;
        String mediaBrowserCompatCustomActionResultReceiver;
        String mediaBrowserCompatItemReceiver;
        String audioAttributesImplApi26Parcelizer;
        if (p0 == null || (write2 = p0.getWrite()) == null || write2.length() == 0 || (remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer()) == null || remoteActionCompatParcelizer.length() == 0 || (iconCompatParcelizer = p0.getIconCompatParcelizer()) == null || iconCompatParcelizer.length() == 0 || (audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer()) == null || audioAttributesCompatParcelizer.length() == 0 || (read2 = p0.getRead()) == null || read2.length() == 0 || (mediaBrowserCompatCustomActionResultReceiver = p0.getMediaBrowserCompatCustomActionResultReceiver()) == null || mediaBrowserCompatCustomActionResultReceiver.length() == 0 || (mediaBrowserCompatItemReceiver = p0.getMediaBrowserCompatItemReceiver()) == null || mediaBrowserCompatItemReceiver.length() == 0 || (audioAttributesImplApi26Parcelizer = p0.getAudioAttributesImplApi26Parcelizer()) == null || audioAttributesImplApi26Parcelizer.length() == 0) {
            return null;
        }
        String audioAttributesImplApi21Parcelizer = p0.getAudioAttributesImplApi21Parcelizer();
        if ((audioAttributesImplApi21Parcelizer != null ? TestGroupLSModel.AudioAttributesImplApi26Parcelizer(audioAttributesImplApi21Parcelizer) : null) == null) {
            return null;
        }
        return new readLong(p0.getWrite(), p0.getRemoteActionCompatParcelizer(), p0.getIconCompatParcelizer(), p0.getAudioAttributesCompatParcelizer(), p0.getRead(), p0.getMediaBrowserCompatCustomActionResultReceiver(), p0.getMediaBrowserCompatItemReceiver(), p0.getAudioAttributesImplApi26Parcelizer(), Integer.parseInt(p0.getAudioAttributesImplApi21Parcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IconCompatParcelizer(readLittleEndianInt24 readlittleendianint24, SampleVideos<? super getShowPopup> sampleVideos) {
        if (readlittleendianint24.IconCompatParcelizer()) {
            Object objRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(serializeIterableToBundle.MediaBrowserCompatItemReceiver.INSTANCE, sampleVideos);
            return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
        }
        if (readlittleendianint24.RemoteActionCompatParcelizer() != null) {
            Object objWrite = write(readlittleendianint24.RemoteActionCompatParcelizer(), sampleVideos);
            return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
        }
        Object objRemoteActionCompatParcelizer2 = this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.AudioAttributesCompatParcelizer(null), sampleVideos);
        return objRemoteActionCompatParcelizer2 == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer2 : getShowPopup.INSTANCE;
    }

    private final Object write(readShort readshort, SampleVideos<? super getShowPopup> sampleVideos) {
        if (readshort instanceof readShort.AudioAttributesCompatParcelizer) {
            readShort.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (readShort.AudioAttributesCompatParcelizer) readshort;
            this.AudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
            getResolutionSize<serializeIterableToBundleSafe> getresolutionsize = this.MediaBrowserCompatCustomActionResultReceiver;
            while (!getresolutionsize.AudioAttributesCompatParcelizer(getresolutionsize.IconCompatParcelizer(), serializeIterableToBundleSafe.RemoteActionCompatParcelizer(true))) {
            }
            Object objRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.MediaBrowserCompatCustomActionResultReceiver(audioAttributesCompatParcelizer), sampleVideos);
            return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
        }
        if (!(readshort instanceof readShort.IconCompatParcelizer)) {
            throw new RenewEligibleCreator();
        }
        getResolutionSize<serializeIterableToBundleSafe> getresolutionsize2 = this.MediaBrowserCompatCustomActionResultReceiver;
        while (!getresolutionsize2.AudioAttributesCompatParcelizer(getresolutionsize2.IconCompatParcelizer(), serializeIterableToBundleSafe.RemoteActionCompatParcelizer(true))) {
        }
        readShort.IconCompatParcelizer iconCompatParcelizer = (readShort.IconCompatParcelizer) readshort;
        String iconCompatParcelizer2 = this.RemoteActionCompatParcelizer.getIconCompatParcelizer();
        String audioAttributesCompatParcelizer2 = this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
        Integer write2 = this.RemoteActionCompatParcelizer.getWrite();
        DeliveryAddressModel audioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        String write3 = audioAttributesImplApi26Parcelizer != null ? audioAttributesImplApi26Parcelizer.getWrite() : null;
        DeliveryAddressModel audioAttributesImplApi26Parcelizer2 = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        String remoteActionCompatParcelizer = audioAttributesImplApi26Parcelizer2 != null ? audioAttributesImplApi26Parcelizer2.getRemoteActionCompatParcelizer() : null;
        DeliveryAddressModel audioAttributesImplApi26Parcelizer3 = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        String iconCompatParcelizer3 = audioAttributesImplApi26Parcelizer3 != null ? audioAttributesImplApi26Parcelizer3.getIconCompatParcelizer() : null;
        DeliveryAddressModel audioAttributesImplApi26Parcelizer4 = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        String audioAttributesCompatParcelizer3 = audioAttributesImplApi26Parcelizer4 != null ? audioAttributesImplApi26Parcelizer4.getAudioAttributesCompatParcelizer() : null;
        DeliveryAddressModel audioAttributesImplApi26Parcelizer5 = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        String read2 = audioAttributesImplApi26Parcelizer5 != null ? audioAttributesImplApi26Parcelizer5.getRead() : null;
        DeliveryAddressModel audioAttributesImplApi26Parcelizer6 = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        String mediaBrowserCompatCustomActionResultReceiver = audioAttributesImplApi26Parcelizer6 != null ? audioAttributesImplApi26Parcelizer6.getMediaBrowserCompatCustomActionResultReceiver() : null;
        DeliveryAddressModel audioAttributesImplApi26Parcelizer7 = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        String mediaBrowserCompatItemReceiver = audioAttributesImplApi26Parcelizer7 != null ? audioAttributesImplApi26Parcelizer7.getMediaBrowserCompatItemReceiver() : null;
        DeliveryAddressModel audioAttributesImplApi26Parcelizer8 = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        String audioAttributesImplApi26Parcelizer9 = audioAttributesImplApi26Parcelizer8 != null ? audioAttributesImplApi26Parcelizer8.getAudioAttributesImplApi26Parcelizer() : null;
        DeliveryAddressModel audioAttributesImplApi26Parcelizer10 = this.RemoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
        Object objRemoteActionCompatParcelizer2 = this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.AudioAttributesImplBaseParcelizer(readShort.IconCompatParcelizer.IconCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.AudioAttributesImplBaseParcelizer, iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver, iconCompatParcelizer.AudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizer, iconCompatParcelizer2, audioAttributesCompatParcelizer2, write2, iconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver, write3, iconCompatParcelizer3, audioAttributesCompatParcelizer3, read2, mediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatItemReceiver, audioAttributesImplApi26Parcelizer9, audioAttributesImplApi26Parcelizer10 != null ? audioAttributesImplApi26Parcelizer10.getAudioAttributesImplApi21Parcelizer() : null)), sampleVideos);
        return objRemoteActionCompatParcelizer2 == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer2 : getShowPopup.INSTANCE;
    }

    private final void onPause(String p0) {
        read(this.RemoteActionCompatParcelizer.getIconCompatParcelizer(), this.RemoteActionCompatParcelizer.getRead(), this.RemoteActionCompatParcelizer.getWrite());
        String str = p0;
        if (str == null || str.length() == 0) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RatingCompat(null), new MagicModuleSubmissionRequestBody() { // from class: o.SafeParcelableParam
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentViewModel.onMediaButtonEvent((String) obj2);
                }
            });
        } else {
            RatingCompat(p0);
        }
    }

    static final class RatingCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (PaymentViewModel.this.read.RemoteActionCompatParcelizer(new serializeIterableToBundle.AudioAttributesCompatParcelizer("Order id could not be generated"), this) == objIconCompatParcelizer) {
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

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RatingCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onMediaButtonEvent(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private Object read;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r6.AudioAttributesCompatParcelizer.read.RemoteActionCompatParcelizer(new o.serializeIterableToBundle.IconCompatParcelizer(((o.readLittleEndianUnsignedIntToInt.read) r7).read()), r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
        
            if (r6.AudioAttributesCompatParcelizer.read.RemoteActionCompatParcelizer(o.serializeIterableToBundle.AudioAttributesImplApi26Parcelizer.INSTANCE, r6) == r0) goto L28;
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
                int r1 = r6.IconCompatParcelizer
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L7c
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L38
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.payment.PaymentViewModel r7 = com.marrow2.ui.payment.PaymentViewModel.this
                o.readLittleEndianShort r7 = com.marrow2.ui.payment.PaymentViewModel.AudioAttributesCompatParcelizer(r7)
                java.lang.String r1 = r6.RemoteActionCompatParcelizer
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.IconCompatParcelizer = r4
                java.lang.Object r7 = r7.AudioAttributesCompatParcelizer(r1, r5)
                if (r7 == r0) goto L85
            L38:
                o.readLittleEndianUnsignedIntToInt r7 = (kotlin.readLittleEndianUnsignedIntToInt) r7
                boolean r1 = r7 instanceof o.readLittleEndianUnsignedIntToInt.read
                r4 = 0
                if (r1 == 0) goto L5e
                com.marrow2.ui.payment.PaymentViewModel r1 = com.marrow2.ui.payment.PaymentViewModel.this
                o.fromCursor r1 = com.marrow2.ui.payment.PaymentViewModel.write(r1)
                o.serializeIterableToBundle$IconCompatParcelizer r2 = new o.serializeIterableToBundle$IconCompatParcelizer
                o.readLittleEndianUnsignedIntToInt$read r7 = (o.readLittleEndianUnsignedIntToInt.read) r7
                java.lang.String r7 = r7.read()
                r2.<init>(r7)
                r7 = r6
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r6.read = r4
                r6.IconCompatParcelizer = r3
                java.lang.Object r6 = r1.RemoteActionCompatParcelizer(r2, r7)
                if (r6 != r0) goto L7c
                goto L85
            L5e:
                o.readLittleEndianUnsignedIntToInt$RemoteActionCompatParcelizer r1 = o.readLittleEndianUnsignedIntToInt.RemoteActionCompatParcelizer.INSTANCE
                boolean r7 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r7, r1)
                if (r7 == 0) goto L7f
                com.marrow2.ui.payment.PaymentViewModel r7 = com.marrow2.ui.payment.PaymentViewModel.this
                o.fromCursor r7 = com.marrow2.ui.payment.PaymentViewModel.write(r7)
                o.serializeIterableToBundle$AudioAttributesImplApi26Parcelizer r1 = o.serializeIterableToBundle.AudioAttributesImplApi26Parcelizer.INSTANCE
                r3 = r6
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r6.read = r4
                r6.IconCompatParcelizer = r2
                java.lang.Object r6 = r7.RemoteActionCompatParcelizer(r1, r3)
                if (r6 != r0) goto L7c
                goto L85
            L7c:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L7f:
                o.RenewEligibleCreator r6 = new o.RenewEligibleCreator
                r6.<init>()
                throw r6
            L85:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.payment.PaymentViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new read(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RatingCompat(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.SafeParcelableIndicator
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentViewModel.write(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(PaymentViewModel paymentViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        paymentViewModel.onCustomAction(str);
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private Object read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r6.RemoteActionCompatParcelizer.read.RemoteActionCompatParcelizer(new o.serializeIterableToBundle.IconCompatParcelizer(((o.readLittleEndianUnsignedIntToInt.read) r7).read()), r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
        
            if (r6.RemoteActionCompatParcelizer.read.RemoteActionCompatParcelizer(o.serializeIterableToBundle.AudioAttributesImplApi26Parcelizer.INSTANCE, r6) == r0) goto L28;
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L7c
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L38
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                com.marrow2.ui.payment.PaymentViewModel r7 = com.marrow2.ui.payment.PaymentViewModel.this
                o.readLittleEndianShort r7 = com.marrow2.ui.payment.PaymentViewModel.AudioAttributesCompatParcelizer(r7)
                java.lang.String r1 = r6.IconCompatParcelizer
                r5 = r6
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6.write = r4
                java.lang.Object r7 = r7.RemoteActionCompatParcelizer(r1, r5)
                if (r7 == r0) goto L85
            L38:
                o.readLittleEndianUnsignedIntToInt r7 = (kotlin.readLittleEndianUnsignedIntToInt) r7
                boolean r1 = r7 instanceof o.readLittleEndianUnsignedIntToInt.read
                r4 = 0
                if (r1 == 0) goto L5e
                com.marrow2.ui.payment.PaymentViewModel r1 = com.marrow2.ui.payment.PaymentViewModel.this
                o.fromCursor r1 = com.marrow2.ui.payment.PaymentViewModel.write(r1)
                o.readLittleEndianUnsignedIntToInt$read r7 = (o.readLittleEndianUnsignedIntToInt.read) r7
                java.lang.String r7 = r7.read()
                o.serializeIterableToBundle$IconCompatParcelizer r2 = new o.serializeIterableToBundle$IconCompatParcelizer
                r2.<init>(r7)
                r7 = r6
                o.SampleVideos r7 = (kotlin.SampleVideos) r7
                r6.read = r4
                r6.write = r3
                java.lang.Object r6 = r1.RemoteActionCompatParcelizer(r2, r7)
                if (r6 != r0) goto L7c
                goto L85
            L5e:
                o.readLittleEndianUnsignedIntToInt$RemoteActionCompatParcelizer r1 = o.readLittleEndianUnsignedIntToInt.RemoteActionCompatParcelizer.INSTANCE
                boolean r7 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r7, r1)
                if (r7 == 0) goto L7f
                com.marrow2.ui.payment.PaymentViewModel r7 = com.marrow2.ui.payment.PaymentViewModel.this
                o.fromCursor r7 = com.marrow2.ui.payment.PaymentViewModel.write(r7)
                o.serializeIterableToBundle$AudioAttributesImplApi26Parcelizer r1 = o.serializeIterableToBundle.AudioAttributesImplApi26Parcelizer.INSTANCE
                r3 = r6
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r6.read = r4
                r6.write = r2
                java.lang.Object r6 = r7.RemoteActionCompatParcelizer(r1, r3)
                if (r6 != r0) goto L7c
                goto L85
            L7c:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            L7f:
                o.RenewEligibleCreator r6 = new o.RenewEligibleCreator
                r6.<init>()
                throw r6
            L85:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.payment.PaymentViewModel.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return PaymentViewModel.this.new RemoteActionCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatMediaItem(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.validate
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentViewModel.AudioAttributesCompatParcelizer(this.write, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(PaymentViewModel paymentViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        paymentViewModel.onCustomAction(str);
        return getShowPopup.INSTANCE;
    }

    private final void read(String p0, String p1, Integer p2) {
        setFastestInterval.read readVarIconCompatParcelizer = IconCompatParcelizer(p0, p1, p2);
        isSeekPending isseekpending = this.IconCompatParcelizer;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.IconCompatParcelizer(readVarIconCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    private final void RemoteActionCompatParcelizer(String p0, String p1, Integer p2) {
        setFastestInterval.read readVarIconCompatParcelizer = IconCompatParcelizer(p0, p1, p2);
        isSeekPending isseekpending = this.IconCompatParcelizer;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.AudioAttributesCompatParcelizer(readVarIconCompatParcelizer), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    private static setFastestInterval.read IconCompatParcelizer(String p0, String p1, Integer p2) {
        if (p1 == null) {
            p1 = "";
        }
        if (p0 == null) {
            p0 = "";
        }
        String strValueOf = p2 != null ? String.valueOf(p2.intValue()) : null;
        return new setFastestInterval.read(p1, p0, strValueOf != null ? strValueOf : "");
    }
}
