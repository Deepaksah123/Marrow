package com.marrow2.ui.qbank.tracker;

import com.marrow2.data.lesson.remote.model.CalendarDayMatrix;
import com.marrow2.data.pref.repo.model.WoqMarrowthonResponse;
import com.marrow2.ui.qbank.tracker.QbankTrackerViewModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda0;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.ParsableNalUnitBitArray;
import kotlin.PlayerControlViewExternalSyntheticLambda0;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getMobileNetworkType;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getSubMesh;
import kotlin.getYear;
import kotlin.isSeekPending;
import kotlin.lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setStreamingFormat;
import kotlin.setUpdatedStatus;
import kotlin.skipH265ScalingList;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.zzee;
import kotlin.zzeu;
import kotlin.zzew;
import kotlin.zzex;
import kotlin.zzez;
import kotlin.zzfa;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010+R#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0,8\u0007¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b\u0018\u0010.R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0)0,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b\f\u0010.R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R&\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0)0,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b\u001c\u0010."}, d2 = {"Lcom/marrow2/ui/qbank/tracker/QbankTrackerViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/skipH265ScalingList;", "p0", "Lo/ParsableNalUnitBitArray;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/skipH265ScalingList;Lo/ParsableNalUnitBitArray;Lo/isSeekPending;)V", "Lo/zzfa;", "", "read", "(Lo/zzfa;)V", "AudioAttributesImplApi21Parcelizer", "()V", "MediaBrowserCompatSearchResultReceiver", "", "Lo/zzex;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "Lo/getMobileNetworkType;", "IconCompatParcelizer", "(Lo/getMobileNetworkType;)Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "Lo/skipH265ScalingList;", "AudioAttributesCompatParcelizer", "Lo/ParsableNalUnitBitArray;", "Lo/isSeekPending;", "Ljava/util/Calendar;", "MediaBrowserCompatMediaItem", "Ljava/util/Calendar;", "RemoteActionCompatParcelizer", "Ljava/util/HashMap;", "", "Lo/zzeu;", "Ljava/util/HashMap;", "write", "Lo/getResolutionSize;", "Lo/DataSourceBitmapLoaderExternalSyntheticLambda0;", "Lo/zzew;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/zzez;", "MediaDescriptionCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QbankTrackerViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzeu>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final skipH265ScalingList AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final HashMap<String, zzeu> write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzeu>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final ParsableNalUnitBitArray IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzez>> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final Calendar RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzew>> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzez>> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzew>> AudioAttributesImplApi21Parcelizer;

    @setSdkPayload
    public QbankTrackerViewModel(skipH265ScalingList skiph265scalinglist, ParsableNalUnitBitArray parsableNalUnitBitArray, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(skiph265scalinglist, "");
        toMagicModuleMetaRepoModel.write(parsableNalUnitBitArray, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.AudioAttributesCompatParcelizer = skiph265scalinglist;
        this.IconCompatParcelizer = parsableNalUnitBitArray;
        this.read = isseekpending;
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(calendar, "");
        this.RemoteActionCompatParcelizer = calendar;
        this.write = new HashMap<>();
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzew>> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesImplApi21Parcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.MediaBrowserCompatItemReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzeu>> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesImplApi26Parcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<DataSourceBitmapLoaderExternalSyntheticLambda0<zzez>> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(new setStreamingFormat(null, 1, null));
        this.AudioAttributesImplBaseParcelizer = getresolutionsizeRemoteActionCompatParcelizer3;
        this.MediaDescriptionCompat = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplBaseParcelizer();
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzew>> IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzeu>> read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<zzez>> AudioAttributesCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final void read(zzfa p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzfa.write.INSTANCE)) {
            AudioAttributesImplApi21Parcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzfa.RemoteActionCompatParcelizer.INSTANCE)) {
            MediaBrowserCompatSearchResultReceiver();
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, zzfa.IconCompatParcelizer.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            isSeekPending isseekpending = this.read;
            zzee zzeeVar = zzee.IconCompatParcelizer;
            isseekpending.write(zzee.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        Calendar calendar = this.RemoteActionCompatParcelizer;
        calendar.add(2, 1);
        calendar.set(5, 1);
        AudioAttributesImplBaseParcelizer();
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        Calendar calendar = this.RemoteActionCompatParcelizer;
        calendar.add(2, -1);
        calendar.set(5, 1);
        AudioAttributesImplBaseParcelizer();
    }

    private static List<zzex> AudioAttributesImplApi26Parcelizer() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        int i = 0;
        while (i < 7) {
            i++;
            calendar.set(7, i);
            getSubMesh getsubmesh = getSubMesh.INSTANCE;
            toMagicModuleMetaRepoModel.write(calendar);
            String strSubstring = getSubMesh.write(calendar, "EEE").substring(0, 2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            arrayList.add(new zzex.RemoteActionCompatParcelizer(strSubstring));
        }
        return arrayList;
    }

    private final List<zzex> MediaBrowserCompatCustomActionResultReceiver() {
        this.RemoteActionCompatParcelizer.set(5, 1);
        int i = this.RemoteActionCompatParcelizer.get(7) - 1;
        List<zzex> listAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(zzex.read.INSTANCE);
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) listAudioAttributesImplApi26Parcelizer, (Iterable) arrayList);
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                obj = QbankTrackerViewModel.this.IconCompatParcelizer.write(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            WoqMarrowthonResponse woqMarrowthonResponse = (WoqMarrowthonResponse) obj;
            if (woqMarrowthonResponse != null) {
                QbankTrackerViewModel qbankTrackerViewModel = QbankTrackerViewModel.this;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(woqMarrowthonResponse.getShowBanner(), QBankStatsResponse.AudioAttributesCompatParcelizer(true))) {
                    String strRemoteActionCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(woqMarrowthonResponse.getInfo(), "");
                    String strRemoteActionCompatParcelizer2 = PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(woqMarrowthonResponse.getUrl(), "");
                    String strRemoteActionCompatParcelizer3 = PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(woqMarrowthonResponse.getTitle(), "Marrowthon");
                    StringBuilder sb = new StringBuilder();
                    sb.append(strRemoteActionCompatParcelizer3);
                    sb.append(" | ");
                    lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(qbankTrackerViewModel.AudioAttributesImplApi21Parcelizer, new zzew(sb.toString(), PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(woqMarrowthonResponse.getDate(), ""), strRemoteActionCompatParcelizer, " Learn more...", strRemoteActionCompatParcelizer2));
                }
            }
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankTrackerViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzer
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QbankTrackerViewModel.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(QbankTrackerViewModel qbankTrackerViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.read(qbankTrackerViewModel.AudioAttributesImplApi21Parcelizer, i, str, null);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<zzex> IconCompatParcelizer(getMobileNetworkType p0) {
        ArrayList arrayList = new ArrayList();
        List<zzex> listMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        for (List<CalendarDayMatrix> list : p0.read()) {
            ArrayList<CalendarDayMatrix> arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((CalendarDayMatrix) obj).getDate() > 0) {
                    arrayList2.add(obj);
                }
            }
            for (CalendarDayMatrix calendarDayMatrix : arrayList2) {
                this.RemoteActionCompatParcelizer.set(5, calendarDayMatrix.getDate());
                getSubMesh getsubmesh = getSubMesh.INSTANCE;
                String strValueOf = getSubMesh.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer) ? "" : String.valueOf(calendarDayMatrix.getCount());
                getSubMesh getsubmesh2 = getSubMesh.INSTANCE;
                String strValueOf2 = getSubMesh.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer) ? "Today" : String.valueOf(calendarDayMatrix.getDate());
                getSubMesh getsubmesh3 = getSubMesh.INSTANCE;
                arrayList.add(new zzex.AudioAttributesCompatParcelizer(strValueOf2, strValueOf, getSubMesh.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)));
            }
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) listMediaBrowserCompatCustomActionResultReceiver, (Iterable) arrayList);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            String strWrite;
            String str;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getSubMesh getsubmesh = getSubMesh.INSTANCE;
                strWrite = getSubMesh.write(QbankTrackerViewModel.this.RemoteActionCompatParcelizer, "MMMM yyyy");
                if (!QbankTrackerViewModel.this.write.containsKey(strWrite)) {
                    skipH265ScalingList skiph265scalinglist = QbankTrackerViewModel.this.AudioAttributesCompatParcelizer;
                    int i2 = QbankTrackerViewModel.this.RemoteActionCompatParcelizer.get(2);
                    this.AudioAttributesCompatParcelizer = strWrite;
                    this.read = 1;
                    Object obj2 = skiph265scalinglist.read(i2 + 1, QbankTrackerViewModel.this.RemoteActionCompatParcelizer.get(1), this);
                    if (obj2 == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    str = strWrite;
                    obj = obj2;
                }
                getResolutionSize getresolutionsize = QbankTrackerViewModel.this.AudioAttributesImplApi26Parcelizer;
                Object obj3 = QbankTrackerViewModel.this.write.get(strWrite);
                toMagicModuleMetaRepoModel.write(obj3);
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize, obj3);
                return getShowPopup.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.AudioAttributesCompatParcelizer;
            SdkPayloadData.IconCompatParcelizer(obj);
            getMobileNetworkType getmobilenetworktype = (getMobileNetworkType) obj;
            getSubMesh getsubmesh2 = getSubMesh.INSTANCE;
            if (getSubMesh.write(QbankTrackerViewModel.this.RemoteActionCompatParcelizer)) {
                lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(QbankTrackerViewModel.this.AudioAttributesImplBaseParcelizer, new zzez(getmobilenetworktype.write(), getmobilenetworktype.IconCompatParcelizer()));
            }
            QbankTrackerViewModel.this.write.put(str, new zzeu(str, QbankTrackerViewModel.this.IconCompatParcelizer(getmobilenetworktype), getmobilenetworktype.AudioAttributesCompatParcelizer() > 0, getmobilenetworktype.RemoteActionCompatParcelizer() > 0));
            strWrite = str;
            getResolutionSize getresolutionsize2 = QbankTrackerViewModel.this.AudioAttributesImplApi26Parcelizer;
            Object obj32 = QbankTrackerViewModel.this.write.get(strWrite);
            toMagicModuleMetaRepoModel.write(obj32);
            lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.IconCompatParcelizer(getresolutionsize2, obj32);
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return QbankTrackerViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, null);
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.zzen
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return QbankTrackerViewModel.write(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(QbankTrackerViewModel qbankTrackerViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        lambdaloadBitmap2comgoogleandroidexoplayer2upstreamDataSourceBitmapLoader.read(qbankTrackerViewModel.AudioAttributesImplApi26Parcelizer, i, str, null);
        return getShowPopup.INSTANCE;
    }
}
