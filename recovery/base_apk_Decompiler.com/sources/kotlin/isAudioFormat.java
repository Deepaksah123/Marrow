package kotlin;

import com.marrow.data.api.models.response.custommodule.CustomModuleQuotaResponseBody;
import com.marrow2.data.custom_module.remote.model.CustomModuleLSModel;
import com.marrow2.data.subject.local.model.SubjectLSModel;
import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import com.marrow2.domain.custom_module.model.CustomModuleTopicListModel;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0003\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0016\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0016\u0010\u0012J\u0018\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0011\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0096@¢\u0006\u0004\b\u001c\u0010\u0012J\u0014\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010\u0012J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020!H\u0096@¢\u0006\u0004\b\u0016\u0010#J\u0010\u0010$\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b$\u0010\u0012J\u0010\u0010%\u001a\u00020!H\u0096@¢\u0006\u0004\b%\u0010\u0012J\u0010\u0010&\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b&\u0010\u0012J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020 H\u0096@¢\u0006\u0004\b%\u0010#J\u0010\u0010'\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b'\u0010\u0012J \u0010\u0011\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020!H\u0096@¢\u0006\u0004\b\u0011\u0010#J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020(0\u00142\u0006\u0010\u0003\u001a\u00020 H\u0096@¢\u0006\u0004\b$\u0010#J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020 H\u0096@¢\u0006\u0004\b\u001f\u0010#J \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020)H\u0096@¢\u0006\u0004\b\u001f\u0010*R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0014\u0010%\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010.R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100"}, d2 = {"Lo/isAudioFormat;", "Lo/getArray;", "Lo/setResetOnNetworkTypeChange;", "p0", "Lo/unlockFolder;", "p1", "Lo/closeCurrentOutputStream;", "p2", "Lo/getPlayerStateString;", "p3", "Lo/intersects;", "p4", "Lo/getPlatform;", "p5", "<init>", "(Lo/setResetOnNetworkTypeChange;Lo/unlockFolder;Lo/closeCurrentOutputStream;Lo/getPlayerStateString;Lo/intersects;Lo/getPlatform;)V", "Lcom/marrow2/domain/custom_module/model/CustomModuleUCModel;", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/RepeatModeUtil;", "", "Lo/putInt;", "RemoteActionCompatParcelizer", "(Lo/RepeatModeUtil;Lo/SampleVideos;)Ljava/lang/Object;", "", "", "(ZLo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow2/domain/custom_module/model/CustomModuleSubjectListModel;", "AudioAttributesImplApi26Parcelizer", "Lcom/marrow/data/api/models/response/custommodule/CustomModuleQuotaResponseBody;", "Lcom/marrow2/data/custom_module/remote/model/CustomModuleQuotaModel;", "write", "", "", "Lcom/marrow2/domain/custom_module/model/CustomModuleTopicListModel;", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "read", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getBytePosition;", "", "(Ljava/lang/String;JLo/SampleVideos;)Ljava/lang/Object;", "Lo/setResetOnNetworkTypeChange;", "Lo/unlockFolder;", "Lo/closeCurrentOutputStream;", "Lo/getPlayerStateString;", "Lo/intersects;", "Lo/getPlatform;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isAudioFormat implements getArray {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final unlockFolder read;
    private final intersects IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final getPlayerStateString AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getPlatform AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setResetOnNetworkTypeChange RemoteActionCompatParcelizer;
    private final closeCurrentOutputStream write;

    @setSdkPayload
    public isAudioFormat(setResetOnNetworkTypeChange setresetonnetworktypechange, unlockFolder unlockfolder, closeCurrentOutputStream closecurrentoutputstream, getPlayerStateString getplayerstatestring, intersects intersectsVar, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(setresetonnetworktypechange, "");
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        toMagicModuleMetaRepoModel.write(closecurrentoutputstream, "");
        toMagicModuleMetaRepoModel.write(getplayerstatestring, "");
        toMagicModuleMetaRepoModel.write(intersectsVar, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.RemoteActionCompatParcelizer = setresetonnetworktypechange;
        this.read = unlockfolder;
        this.write = closecurrentoutputstream;
        this.AudioAttributesCompatParcelizer = getplayerstatestring;
        this.IconCompatParcelizer = intersectsVar;
        this.AudioAttributesImplApi26Parcelizer = getplatform;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super CustomModuleUCModel>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = isAudioFormat.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            CustomModuleLSModel customModuleLSModel = (CustomModuleLSModel) obj;
            if (customModuleLSModel != null) {
                return getPixelWidthHeightRatio.AudioAttributesCompatParcelizer(customModuleLSModel);
            }
            return null;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super CustomModuleUCModel> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object IconCompatParcelizer(SampleVideos<? super CustomModuleUCModel> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new IconCompatParcelizer(null), sampleVideos);
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends putInt>>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ RepeatModeUtil RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = isAudioFormat.this.IconCompatParcelizer.write(RepeatModeUtilRepeatToggleModes.write(this.RemoteActionCompatParcelizer), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(readBitsToLong.RemoteActionCompatParcelizer((CacheWriterProgressListener) it.next()));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(RepeatModeUtil repeatModeUtil, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = repeatModeUtil;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<putInt>> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object RemoteActionCompatParcelizer(RepeatModeUtil repeatModeUtil, SampleVideos<? super List<putInt>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new AudioAttributesImplBaseParcelizer(repeatModeUtil, null), sampleVideos);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.read = 1;
            Object obj_init_lambda2 = isAudioFormat.this.read._init_lambda2(this);
            return obj_init_lambda2 == objIconCompatParcelizer ? objIconCompatParcelizer : obj_init_lambda2;
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new RemoteActionCompatParcelizer(null), sampleVideos);
    }

    static final class onAddQueueItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ boolean read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (isAudioFormat.this.read.MediaDescriptionCompat(this.read, this) == objIconCompatParcelizer) {
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
        onAddQueueItem(boolean z, SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(2, sampleVideos);
            this.read = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new onAddQueueItem(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onAddQueueItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object IconCompatParcelizer(boolean z, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new onAddQueueItem(z, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends CustomModuleSubjectListModel>>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                obj = isAudioFormat.this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(RepeatModeUtilRepeatToggleModes.write(RepeatModeUtil.IconCompatParcelizer), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(isValidColorRange.read((SubjectLSModel) it.next()));
            }
            return arrayList;
        }

        MediaDescriptionCompat(SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new MediaDescriptionCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<CustomModuleSubjectListModel>> sampleVideos) {
            return ((MediaDescriptionCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object AudioAttributesImplApi26Parcelizer(SampleVideos<? super List<CustomModuleSubjectListModel>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new MediaDescriptionCompat(null), sampleVideos);
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super CustomModuleQuotaResponseBody>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.read = 1;
            Object objRemoteActionCompatParcelizer = isAudioFormat.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
            return objRemoteActionCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objRemoteActionCompatParcelizer;
        }

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super CustomModuleQuotaResponseBody> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object write(SampleVideos<? super CustomModuleQuotaResponseBody> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new AudioAttributesImplApi21Parcelizer(null), sampleVideos);
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends CustomModuleTopicListModel>>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ int IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.AudioAttributesCompatParcelizer = 1;
            Object objIconCompatParcelizer2 = isAudioFormat.this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this);
            return objIconCompatParcelizer2 == objIconCompatParcelizer ? objIconCompatParcelizer : objIconCompatParcelizer2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(String str, int i, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<CustomModuleTopicListModel>> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object RemoteActionCompatParcelizer(String p0, SampleVideos<? super List<CustomModuleTopicListModel>> p1) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new MediaBrowserCompatCustomActionResultReceiver(p0, -1, null), p1);
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r10 != r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            if (r9.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer.IconCompatParcelizer(r9) == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[SYNTHETIC] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r9.MediaBrowserCompatCustomActionResultReceiver
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L9c
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L1f:
                int r1 = r9.write
                java.lang.Object r5 = r9.MediaBrowserCompatItemReceiver
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r6 = r9.RemoteActionCompatParcelizer
                o.isAudioFormat r6 = (kotlin.isAudioFormat) r6
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L50
            L2d:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                goto L45
            L31:
                kotlin.SdkPayloadData.IconCompatParcelizer(r10)
                o.isAudioFormat r10 = kotlin.isAudioFormat.this
                o.setResetOnNetworkTypeChange r10 = kotlin.isAudioFormat.read(r10)
                r1 = r9
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r9.MediaBrowserCompatCustomActionResultReceiver = r5
                java.lang.Object r10 = r10.read(r1)
                if (r10 == r0) goto L9f
            L45:
                java.util.List r10 = (java.util.List) r10
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                o.isAudioFormat r6 = kotlin.isAudioFormat.this
                java.util.Iterator r5 = r10.iterator()
                r1 = r4
            L50:
                boolean r10 = r5.hasNext()
                r7 = 0
                if (r10 == 0) goto L7e
                java.lang.Object r10 = r5.next()
                com.marrow2.data.custom_module.remote.model.CustomModuleLSModel r10 = (com.marrow2.data.custom_module.remote.model.CustomModuleLSModel) r10
                o.intersects r8 = kotlin.isAudioFormat.write(r6)
                java.lang.String r10 = r10.getId()
                r9.AudioAttributesCompatParcelizer = r7
                r9.read = r7
                r9.RemoteActionCompatParcelizer = r6
                r9.MediaBrowserCompatItemReceiver = r5
                r9.AudioAttributesImplApi26Parcelizer = r7
                r9.AudioAttributesImplApi21Parcelizer = r7
                r9.write = r1
                r9.IconCompatParcelizer = r4
                r9.MediaBrowserCompatCustomActionResultReceiver = r3
                java.lang.Object r10 = r8.AudioAttributesCompatParcelizer(r10, r9)
                if (r10 != r0) goto L50
                goto L9f
            L7e:
                o.isAudioFormat r10 = kotlin.isAudioFormat.this
                o.setResetOnNetworkTypeChange r10 = kotlin.isAudioFormat.read(r10)
                r1 = r9
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r9.AudioAttributesCompatParcelizer = r7
                r9.read = r7
                r9.RemoteActionCompatParcelizer = r7
                r9.MediaBrowserCompatItemReceiver = r7
                r9.AudioAttributesImplApi26Parcelizer = r7
                r9.AudioAttributesImplApi21Parcelizer = r7
                r9.MediaBrowserCompatCustomActionResultReceiver = r2
                java.lang.Object r9 = r10.IconCompatParcelizer(r1)
                if (r9 != r0) goto L9c
                goto L9f
            L9c:
                o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
                return r9
            L9f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isAudioFormat.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object read(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new read(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            Object objRemoteActionCompatParcelizer = isAudioFormat.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
            return objRemoteActionCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objRemoteActionCompatParcelizer;
        }

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super Integer> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new AudioAttributesImplApi26Parcelizer(null), sampleVideos);
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.read = 1;
            Object objWrite = isAudioFormat.this.RemoteActionCompatParcelizer.write(this);
            return objWrite == objIconCompatParcelizer ? objIconCompatParcelizer : objWrite;
        }

        RatingCompat(SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new RatingCompat(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object AudioAttributesImplBaseParcelizer(SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new RatingCompat(null), sampleVideos);
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write = 1;
            Object objOnPrepare = isAudioFormat.this.IconCompatParcelizer.onPrepare(this.RemoteActionCompatParcelizer, this);
            return objOnPrepare == objIconCompatParcelizer ? objIconCompatParcelizer : objOnPrepare;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatSearchResultReceiver(String str, SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new MediaBrowserCompatSearchResultReceiver(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super Boolean> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new MediaBrowserCompatSearchResultReceiver(str, null), sampleVideos);
    }

    static final class MediaBrowserCompatMediaItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        
            if (r1.AudioAttributesCompatParcelizer(new kotlin.CmcdHeadersFactoryStreamType(java.lang.String.valueOf(((java.lang.Number) r6).intValue())), r5) == r0) goto L17;
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
                int r1 = r5.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L5c
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.read
                o.setResetOnNetworkTypeChange r1 = (kotlin.setResetOnNetworkTypeChange) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L3e
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                o.isAudioFormat r6 = kotlin.isAudioFormat.this
                o.setResetOnNetworkTypeChange r1 = kotlin.isAudioFormat.read(r6)
                o.isAudioFormat r6 = kotlin.isAudioFormat.this
                o.unlockFolder r6 = kotlin.isAudioFormat.IconCompatParcelizer(r6)
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.read = r1
                r5.write = r3
                java.lang.Object r6 = r6.AudioAttributesImplBaseParcelizer(r4)
                if (r6 == r0) goto L5f
            L3e:
                o.CmcdHeadersFactoryStreamType r3 = new o.CmcdHeadersFactoryStreamType
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                java.lang.String r6 = java.lang.String.valueOf(r6)
                r3.<init>(r6)
                r6 = r5
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r4 = 0
                r5.read = r4
                r5.write = r2
                java.lang.Object r5 = r1.AudioAttributesCompatParcelizer(r3, r6)
                if (r5 != r0) goto L5c
                goto L5f
            L5c:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L5f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isAudioFormat.MediaBrowserCompatMediaItem.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new MediaBrowserCompatMediaItem(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatMediaItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new MediaBrowserCompatMediaItem(null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class onCommand extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Integer>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write = 1;
            Object obj2 = isAudioFormat.this.RemoteActionCompatParcelizer.read(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this);
            return obj2 == objIconCompatParcelizer ? objIconCompatParcelizer : obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onCommand(String str, int i, SampleVideos<? super onCommand> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new onCommand(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Integer> sampleVideos) {
            return ((onCommand) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object IconCompatParcelizer(String p0, SampleVideos<? super Integer> p1) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new onCommand(p0, 1, null), p1);
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends getBytePosition>>, Object> {
        private /* synthetic */ String IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = isAudioFormat.this.IconCompatParcelizer.onPlayFromSearch(this.IconCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(ParsableBitArray.IconCompatParcelizer((getSpan) it.next()));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new write(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<getBytePosition>> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object read(String str, SampleVideos<? super List<getBytePosition>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new write(str, null), sampleVideos);
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super String>, Object> {
        private /* synthetic */ String read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write = 1;
            Object objIconCompatParcelizer2 = isAudioFormat.this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.read, this);
            return objIconCompatParcelizer2 == objIconCompatParcelizer ? objIconCompatParcelizer : objIconCompatParcelizer2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(String str, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new MediaBrowserCompatItemReceiver(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super String> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object write(String str, SampleVideos<? super String> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new MediaBrowserCompatItemReceiver(str, null), sampleVideos);
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (isAudioFormat.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
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
        MediaMetadataCompat(String str, long j, SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isAudioFormat.this.new MediaMetadataCompat(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getArray
    public final Object write(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, new MediaMetadataCompat(str, j, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }
}
