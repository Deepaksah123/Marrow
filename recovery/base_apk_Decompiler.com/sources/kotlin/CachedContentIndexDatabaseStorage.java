package kotlin;

import com.marrow.data.api.models.request.payment.CreateOrderRequest;
import com.marrow.data.api.models.response.payment.CreateOrderResponse;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;
import com.marrow2.core.network.model.NetworkApiResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedContentIndexDatabaseStorage implements store {
    private final getKeyForId IconCompatParcelizer;

    @setSdkPayload
    public CachedContentIndexDatabaseStorage(getKeyForId getkeyforid) {
        toMagicModuleMetaRepoModel.write(getkeyforid, "");
        this.IconCompatParcelizer = getkeyforid;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super CreateOrderResponse>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ CreateOrderRequest read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = CachedContentIndexDatabaseStorage.this.IconCompatParcelizer.read(this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return createDataSink.RemoteActionCompatParcelizer((NetworkApiResponse) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(CreateOrderRequest createOrderRequest, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = createOrderRequest;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CachedContentIndexDatabaseStorage.this.new write(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super CreateOrderResponse> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.store
    public final Object IconCompatParcelizer(CreateOrderRequest createOrderRequest, SampleVideos<? super CreateOrderResponse> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new write(createOrderRequest, null), sampleVideos);
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super PaymentStatusResponse>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = CachedContentIndexDatabaseStorage.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return createDataSink.RemoteActionCompatParcelizer((NetworkApiResponse) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return CachedContentIndexDatabaseStorage.this.new read(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super PaymentStatusResponse> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.store
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super PaymentStatusResponse> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new read(str, null), sampleVideos);
    }
}
