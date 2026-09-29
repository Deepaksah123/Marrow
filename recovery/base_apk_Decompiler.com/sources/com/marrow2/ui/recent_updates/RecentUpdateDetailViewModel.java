package com.marrow2.ui.recent_updates;

import com.marrow2.ui.recent_updates.RecentUpdateDetailViewModel;
import java.util.List;
import kotlin.AndroidUtilsLight;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TimedValueQueue;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.blockUntilFinished;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isCancelled;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.ptsToUs;
import kotlin.readLittleEndianUnsignedShort;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.zzfx;
import kotlin.zzgz;
import kotlin.zzhc;
import kotlin.zzhi;
import kotlin.zzhj;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R#\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0%8\u0007¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\u001e\u0010'R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020)0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020)0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b\u0010\u0010'R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020+0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R \u0010,\u001a\b\u0012\u0004\u0012\u00020+0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b\u0013\u0010'"}, d2 = {"Lcom/marrow2/ui/recent_updates/RecentUpdateDetailViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/blockUntilFinished;", "p0", "Lo/TimedValueQueue;", "p1", "Lo/readLittleEndianUnsignedShort;", "p2", "Lo/POJOPropertyBuilder5;", "p3", "Lo/isSeekPending;", "p4", "<init>", "(Lo/blockUntilFinished;Lo/TimedValueQueue;Lo/readLittleEndianUnsignedShort;Lo/POJOPropertyBuilder5;Lo/isSeekPending;)V", "", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "Lo/zzhc;", "read", "(Lo/zzhc;)V", "write", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Lo/blockUntilFinished;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/TimedValueQueue;", "Lo/readLittleEndianUnsignedShort;", "AudioAttributesImplApi21Parcelizer", "Lo/POJOPropertyBuilder5;", "IconCompatParcelizer", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lo/zzhj;", "Lo/getResolutionSize;", "AudioAttributesImplBaseParcelizer", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "MediaBrowserCompatItemReceiver", "", "MediaBrowserCompatSearchResultReceiver", "Lo/zzgz;", "MediaMetadataCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecentUpdateDetailViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final blockUntilFinished RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhj>> MediaBrowserCompatItemReceiver;
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final TimedValueQueue write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<zzgz> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<zzgz> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final readLittleEndianUnsignedShort AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhj>> AudioAttributesImplBaseParcelizer;

    @setSdkPayload
    public RecentUpdateDetailViewModel(blockUntilFinished blockuntilfinished, TimedValueQueue timedValueQueue, readLittleEndianUnsignedShort readlittleendianunsignedshort, POJOPropertyBuilder5 pOJOPropertyBuilder5, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(blockuntilfinished, "");
        toMagicModuleMetaRepoModel.write(timedValueQueue, "");
        toMagicModuleMetaRepoModel.write(readlittleendianunsignedshort, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.RemoteActionCompatParcelizer = blockuntilfinished;
        this.write = timedValueQueue;
        this.AudioAttributesCompatParcelizer = readlittleendianunsignedshort;
        this.read = pOJOPropertyBuilder5;
        this.IconCompatParcelizer = isseekpending;
        String str = (String) pOJOPropertyBuilder5.write("Recent_Update_id");
        if (str != null) {
            AudioAttributesCompatParcelizer(str);
        }
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhj>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<zzgz> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(zzgz.RemoteActionCompatParcelizer.INSTANCE);
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaMetadataCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzhj>> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<Boolean> AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<zzgz> read() {
        return this.MediaMetadataCompat;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = RecentUpdateDetailViewModel.this.RemoteActionCompatParcelizer.write(this.RemoteActionCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(RecentUpdateDetailViewModel.this.AudioAttributesImplBaseParcelizer, zzhi.AudioAttributesCompatParcelizer((isCancelled) obj));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RecentUpdateDetailViewModel.this.new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzfd
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdateDetailViewModel.read(this.AudioAttributesCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(RecentUpdateDetailViewModel recentUpdateDetailViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.read(recentUpdateDetailViewModel.AudioAttributesImplBaseParcelizer, i, str, null);
        return getShowPopup.INSTANCE;
    }

    public final void read(zzhc p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof zzhc.write) {
            this.AudioAttributesImplApi26Parcelizer.write(zzgz.RemoteActionCompatParcelizer.INSTANCE);
            return;
        }
        if (p0 instanceof zzhc.IconCompatParcelizer) {
            write(((zzhc.IconCompatParcelizer) p0).IconCompatParcelizer());
            return;
        }
        if (p0 instanceof zzhc.read) {
            RemoteActionCompatParcelizer(((zzhc.read) p0).AudioAttributesCompatParcelizer());
        } else {
            if (!(p0 instanceof zzhc.RemoteActionCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending = this.IconCompatParcelizer;
            zzfx zzfxVar = zzfx.INSTANCE;
            isseekpending.write(zzfx.AudioAttributesCompatParcelizer(((zzhc.RemoteActionCompatParcelizer) p0).RemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = RecentUpdateDetailViewModel.this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            RecentUpdateDetailViewModel.this.AudioAttributesImplApi26Parcelizer.write(new zzgz.IconCompatParcelizer(((ptsToUs) IntermediateLoginResponseBody.RatingCompat((List) obj)).getWrite()));
            RecentUpdateDetailViewModel.this.AudioAttributesImplApi21Parcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RecentUpdateDetailViewModel.this.new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void write(String p0) {
        this.AudioAttributesImplApi21Parcelizer.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzey
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdateDetailViewModel.write(this.read, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(RecentUpdateDetailViewModel recentUpdateDetailViewModel, int i, String str) {
        zzgz.read readVar;
        toMagicModuleMetaRepoModel.write(str, "");
        getResolutionSize<zzgz> getresolutionsize = recentUpdateDetailViewModel.AudioAttributesImplApi26Parcelizer;
        if (1409 == i) {
            readVar = zzgz.write.INSTANCE;
        } else {
            readVar = new zzgz.read(str);
        }
        getresolutionsize.write(readVar);
        recentUpdateDetailViewModel.AudioAttributesImplApi21Parcelizer.write(Boolean.FALSE);
        return getShowPopup.INSTANCE;
    }

    private final void RemoteActionCompatParcelizer(String p0) {
        this.AudioAttributesImplApi21Parcelizer.write(Boolean.TRUE);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.zzff
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return RecentUpdateDetailViewModel.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (String) obj2);
            }
        });
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ String read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                obj = RecentUpdateDetailViewModel.this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            AndroidUtilsLight androidUtilsLight = (AndroidUtilsLight) obj;
            if (androidUtilsLight != null) {
                RecentUpdateDetailViewModel.this.AudioAttributesImplApi26Parcelizer.write(new zzgz.AudioAttributesCompatParcelizer(androidUtilsLight.AudioAttributesCompatParcelizer()));
            }
            RecentUpdateDetailViewModel.this.AudioAttributesImplApi21Parcelizer.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
            this.read = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return RecentUpdateDetailViewModel.this.new write(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(RecentUpdateDetailViewModel recentUpdateDetailViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        recentUpdateDetailViewModel.AudioAttributesImplApi21Parcelizer.write(Boolean.FALSE);
        recentUpdateDetailViewModel.AudioAttributesImplApi26Parcelizer.write(new zzgz.read(str));
        return getShowPopup.INSTANCE;
    }
}
