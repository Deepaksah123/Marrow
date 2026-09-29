package kotlin;

import com.marrow.data.models.test.TestMini;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class inferFileTypeFromResponseHeaders implements printMetadata {
    private final getPlatform AudioAttributesCompatParcelizer;
    private final DashWrappingSegmentIndex write;

    @setSdkPayload
    public inferFileTypeFromResponseHeaders(DashWrappingSegmentIndex dashWrappingSegmentIndex, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(dashWrappingSegmentIndex, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.write = dashWrappingSegmentIndex;
        this.AudioAttributesCompatParcelizer = getplatform;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends TestMini>>, Object> {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ long write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return IntermediateLoginResponseBody.onPlay(inferFileTypeFromResponseHeaders.this.write.RemoteActionCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(long j, long j2, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = j;
            this.AudioAttributesCompatParcelizer = j2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return inferFileTypeFromResponseHeaders.this.new read(this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<TestMini>> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.printMetadata
    public final Object IconCompatParcelizer(long j, long j2, SampleVideos<? super List<TestMini>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, new read(j, j2, null), sampleVideos);
    }

    @Override // kotlin.printMetadata
    public final Object AudioAttributesCompatParcelizer() {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer());
    }
}
