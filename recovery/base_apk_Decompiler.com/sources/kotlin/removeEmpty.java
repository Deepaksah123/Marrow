package kotlin;

import com.marrow.data.api.models.response.notespurchase.NotesPurchasePlanDetailsResponse;
import com.marrow2.core.network.model.NetworkApiResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class removeEmpty implements getOrAdd {
    private final readContentMetadata RemoteActionCompatParcelizer;

    @setSdkPayload
    public removeEmpty(readContentMetadata readcontentmetadata) {
        toMagicModuleMetaRepoModel.write(readcontentmetadata, "");
        this.RemoteActionCompatParcelizer = readcontentmetadata;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super NotesPurchasePlanDetailsResponse>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = removeEmpty.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return removeEmpty.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super NotesPurchasePlanDetailsResponse> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getOrAdd
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super NotesPurchasePlanDetailsResponse> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new RemoteActionCompatParcelizer(null), sampleVideos);
    }
}
