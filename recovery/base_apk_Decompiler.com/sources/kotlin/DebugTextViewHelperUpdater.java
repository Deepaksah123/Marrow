package kotlin;

import com.google.android.exoplayer2.offline.DownloadService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class DebugTextViewHelperUpdater implements DebugTextViewHelper1 {
    private final newChunkExtractor IconCompatParcelizer;
    private final getPlatform read;

    @setSdkPayload
    public DebugTextViewHelperUpdater(newChunkExtractor newchunkextractor, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(newchunkextractor, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.IconCompatParcelizer = newchunkextractor;
        this.read = getplatform;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ getTrackTypeString read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.AudioAttributesCompatParcelizer(DebugTextViewHelperUpdater.this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(this.read.getRemoteActionCompatParcelizer()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(getTrackTypeString gettracktypestring, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = gettracktypestring;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return DebugTextViewHelperUpdater.this.new RemoteActionCompatParcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.DebugTextViewHelper1
    public final Object AudioAttributesCompatParcelizer(getTrackTypeString gettracktypestring, SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new RemoteActionCompatParcelizer(gettracktypestring, null), sampleVideos);
    }

    @Override // kotlin.DebugTextViewHelper1
    public final Object AudioAttributesCompatParcelizer() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.RemoteActionCompatParcelizer(System.currentTimeMillis()));
    }

    @Override // kotlin.DebugTextViewHelper1
    public final Object read() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.MediaDescriptionCompat());
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ getTrackTypeString read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.AudioAttributesCompatParcelizer(DebugTextViewHelperUpdater.this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer(this.read.getRemoteActionCompatParcelizer(), this.write));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getTrackTypeString gettracktypestring, String str, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = gettracktypestring;
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return DebugTextViewHelperUpdater.this.new IconCompatParcelizer(this.read, this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.DebugTextViewHelper1
    public final Object AudioAttributesCompatParcelizer(getTrackTypeString gettracktypestring, String str, SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.read, new IconCompatParcelizer(gettracktypestring, str, null), sampleVideos);
    }

    @Override // kotlin.DebugTextViewHelper1
    public final Object write() {
        String[][] strArrAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        if (strArrAudioAttributesCompatParcelizer != null) {
            for (String[] strArr : strArrAudioAttributesCompatParcelizer) {
                String str = strArr[0];
                String str2 = strArr[1];
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) "mcq")) {
                    arrayList.clear();
                    return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) "mcq_subj")) {
                    toMagicModuleMetaRepoModel.write((Object) str);
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.DebugTextViewHelper1
    public final Object RemoteActionCompatParcelizer() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArr = {DownloadService.KEY_CONTENT_ID, "content_type", "expires_on", "content_name_for_event"};
        String[][] strArrWrite = this.IconCompatParcelizer.write(strArr, "expires_on>=?", new String[]{String.valueOf(jCurrentTimeMillis)}, null);
        ArrayList arrayList = new ArrayList();
        if (strArrWrite != null) {
            for (String[] strArr2 : strArrWrite) {
                String str = strArr2[getOrderDetails.read(strArr, DownloadService.KEY_CONTENT_ID)];
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                String str2 = strArr2[getOrderDetails.read(strArr, "content_type")];
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                String str3 = strArr2[getOrderDetails.read(strArr, "expires_on")];
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                long j = Long.parseLong(str3);
                String str4 = strArr2[getOrderDetails.read(strArr, "content_name_for_event")];
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
                arrayList.add(new updateAndPost(str, str2, j, str4));
            }
        }
        return arrayList;
    }

    @Override // kotlin.DebugTextViewHelper1
    public final Object read(getTrackTypeString gettracktypestring) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(gettracktypestring.getRemoteActionCompatParcelizer()));
    }
}
