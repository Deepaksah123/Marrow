package kotlin;

import com.marrow.data.api.models.request.sync.SyncParam;
import com.marrow.data.models.common.SchemaUserStatus;
import com.marrow.data.models.mcq.schema.SchemaQbankItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class restoreBackup implements checkStateNotNull {
    private final replaceManifestUri AudioAttributesCompatParcelizer;
    private final getPlatform RemoteActionCompatParcelizer;

    @setSdkPayload
    public restoreBackup(replaceManifestUri replacemanifesturi, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(replacemanifesturi, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.AudioAttributesCompatParcelizer = replacemanifesturi;
        this.RemoteActionCompatParcelizer = getplatform;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends AtomicFile>>, Object> {
        private /* synthetic */ List<String> AudioAttributesCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            List<SchemaQbankItem> list = restoreBackup.this.AudioAttributesCompatParcelizer.read(this.AudioAttributesCompatParcelizer);
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (SchemaQbankItem schemaQbankItem : list) {
                arrayList.add(new AtomicFile(schemaQbankItem.getLessonId(), schemaQbankItem.getLessonName()));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(List<String> list, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return restoreBackup.this.new read(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<AtomicFile>> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.checkStateNotNull
    public final Object IconCompatParcelizer(List<String> list, SampleVideos<? super List<AtomicFile>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new read(list, null), sampleVideos);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super AtomicFileAtomicFileOutputStream>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            SyncParam syncParamWrite = restoreBackup.this.AudioAttributesCompatParcelizer.write();
            return new AtomicFileAtomicFileOutputStream(syncParamWrite.sinceId, syncParamWrite.lastUpdated, syncParamWrite.nextUrl);
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return restoreBackup.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super AtomicFileAtomicFileOutputStream> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.checkStateNotNull
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super AtomicFileAtomicFileOutputStream> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new write(null), sampleVideos);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super loadBitmapFromMetadata>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            SchemaUserStatus schemaUserStatusAudioAttributesImplBaseParcelizer = restoreBackup.this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.write(schemaUserStatusAudioAttributesImplBaseParcelizer);
            return BundleUtil.RemoteActionCompatParcelizer(schemaUserStatusAudioAttributesImplBaseParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return restoreBackup.this.new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super loadBitmapFromMetadata> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.checkStateNotNull
    public final Object IconCompatParcelizer(String str, SampleVideos<? super loadBitmapFromMetadata> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new RemoteActionCompatParcelizer(str, null), sampleVideos);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ List<loadBitmapFromMetadata> IconCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            replaceManifestUri replacemanifesturi = restoreBackup.this.AudioAttributesCompatParcelizer;
            List<loadBitmapFromMetadata> list = this.IconCompatParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BundleUtil.IconCompatParcelizer((loadBitmapFromMetadata) it.next()));
            }
            replacemanifesturi.IconCompatParcelizer(arrayList.toArray(new SchemaUserStatus[0]));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(List<loadBitmapFromMetadata> list, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return restoreBackup.this.new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.checkStateNotNull
    public final Object write(List<loadBitmapFromMetadata> list, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new AudioAttributesCompatParcelizer(list, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }
}
