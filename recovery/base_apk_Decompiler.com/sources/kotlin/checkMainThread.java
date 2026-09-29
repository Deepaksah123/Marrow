package kotlin;

import com.marrow.data.models.mcq.schema.SchemaLessonItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class checkMainThread implements SplitParallelSampleBandwidthEstimator {
    private final getPlatform IconCompatParcelizer;
    private final onDashManifestPublishTimeExpired RemoteActionCompatParcelizer;

    @setSdkPayload
    public checkMainThread(onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = ondashmanifestpublishtimeexpired;
        this.IconCompatParcelizer = getplatform;
    }

    public final onDashManifestPublishTimeExpired RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends openRead>>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            ArrayList<SchemaLessonItem> arrayListOnCommand = checkMainThread.this.RemoteActionCompatParcelizer().onCommand(this.AudioAttributesCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(arrayListOnCommand, "");
            ArrayList<SchemaLessonItem> arrayList = arrayListOnCommand;
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList, 10));
            for (SchemaLessonItem schemaLessonItem : arrayList) {
                arrayList2.add(new openRead(schemaLessonItem.getLessonId(), schemaLessonItem.getLessonName(), schemaLessonItem.getSolvedOn(), schemaLessonItem.getRootSubjectName(), schemaLessonItem.getStepId()));
            }
            return arrayList2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return checkMainThread.this.new write(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<openRead>> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.SplitParallelSampleBandwidthEstimator
    public final Object IconCompatParcelizer(String str, SampleVideos<? super List<openRead>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new write(str, null), sampleVideos);
    }
}
