package kotlin;

import com.marrow.data.models.mcq.McqAnswer;
import com.marrow.data.models.mcq.QaPair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.CachedContentRange;
import kotlin.dropTable;

/* JADX INFO: loaded from: classes3.dex */
public final class getUpstreamPriorityTaskManager implements setCacheWriteDataSinkFactory {
    private final getPlatform IconCompatParcelizer;
    private final onInitializationFailed RemoteActionCompatParcelizer;

    @setSdkPayload
    public getUpstreamPriorityTaskManager(onInitializationFailed oninitializationfailed, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = oninitializationfailed;
        this.IconCompatParcelizer = getplatform;
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final void write(List<dropTable> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<dropTable> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(getTableName.write((dropTable) it.next()));
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(arrayList.toArray(new McqAnswer[0]));
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final dropTable IconCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        McqAnswer mcqAnswerA_ = this.RemoteActionCompatParcelizer.a_(str, str2);
        if (mcqAnswerA_ == null) {
            dropTable.IconCompatParcelizer iconCompatParcelizer = dropTable.write;
            return dropTable.IconCompatParcelizer.write(str, str2);
        }
        return getTableName.IconCompatParcelizer(mcqAnswerA_);
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object read(dropTable droptable) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getTableName.write(droptable));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object AudioAttributesImplApi26Parcelizer(String str) {
        dropTable droptableWrite;
        McqAnswer answer;
        QaPair[] qaPairArrMediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(qaPairArrMediaBrowserCompatMediaItem, "");
        List<QaPair> listOnCommand = getOrderDetails.onCommand(qaPairArrMediaBrowserCompatMediaItem);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand, 10));
        for (QaPair qaPair : listOnCommand) {
            if (qaPair == null || (answer = qaPair.getAnswer()) == null) {
                dropTable.IconCompatParcelizer iconCompatParcelizer = dropTable.write;
                String mcqId = qaPair.getMcqId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mcqId, "");
                droptableWrite = dropTable.IconCompatParcelizer.write(str, mcqId);
            } else {
                droptableWrite = getTableName.IconCompatParcelizer(answer);
            }
            arrayList.add(droptableWrite);
        }
        return arrayList;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ getUpstreamPriorityTaskManager write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.length() > 0 ? this.write.RemoteActionCompatParcelizer.MediaMetadataCompat(this.AudioAttributesCompatParcelizer) : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, getUpstreamPriorityTaskManager getupstreamprioritytaskmanager, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.write = getupstreamprioritytaskmanager;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object write(String str, SampleVideos<? super Integer> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.IconCompatParcelizer, new AudioAttributesCompatParcelizer(str, this, null), sampleVideos);
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final void AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(str);
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final int RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.MediaMetadataCompat(str);
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final int MediaBrowserCompatMediaItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.RatingCompat(str);
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final int AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(str);
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final int MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.MediaDescriptionCompat(str);
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object MediaBrowserCompatItemReceiver(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(str));
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object AudioAttributesImplBaseParcelizer(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(str));
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object write(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str));
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object MediaDescriptionCompat(String str) {
        this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver(str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object MediaMetadataCompat(String str) {
        QaPair[] qaPairArrMediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(qaPairArrMediaBrowserCompatMediaItem, "");
        QaPair[] qaPairArr = qaPairArrMediaBrowserCompatMediaItem;
        ArrayList arrayList = new ArrayList(qaPairArr.length);
        for (QaPair qaPair : qaPairArr) {
            arrayList.add(lockRange.read(qaPair));
        }
        return arrayList;
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object RemoteActionCompatParcelizer(String str, String str2) {
        McqAnswer mcqAnswerA_ = this.RemoteActionCompatParcelizer.a_(str, str2);
        if (mcqAnswerA_ == null) {
            CachedContentRange.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = CachedContentRange.RemoteActionCompatParcelizer;
            return CachedContentRange.AudioAttributesCompatParcelizer.write(str, str2);
        }
        return setLastTouchTimestamp.IconCompatParcelizer(mcqAnswerA_);
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object RemoteActionCompatParcelizer(CachedContentRange cachedContentRange) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(setLastTouchTimestamp.read(cachedContentRange));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object IconCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer.read("parent_id", str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setCacheWriteDataSinkFactory
    public final Object read(String str) {
        this.RemoteActionCompatParcelizer.read("parent_id", str);
        return getShowPopup.INSTANCE;
    }
}
