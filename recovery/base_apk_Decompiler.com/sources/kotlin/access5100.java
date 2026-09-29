package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.access5300;
import kotlin.getTestPattern;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J©\u0001\u0010\u0018\u001a\u00020\u00162\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00160\u00152\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00160\u00152\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00160\u00152\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0017\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JË\u0001\u0010\u001b\u001a\u00020\u00162\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00160\u00152\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00160\u00152\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00160\u00152\u001e\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0017\u0012\u0004\u0012\u00020\u00160\u00152 \u0010\u000e\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"R\u001a\u0010%\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001b\u0010$R\u001a\u0010)\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010/R\u0014\u00102\u001a\u0002018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Lo/access5100;", "Lo/access5600;", "Lkotlin/Function0;", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "p0", "Lo/PlaylistTimeline1;", "p1", "Lo/AnalyticsListenerEvents;", "p2", "Lo/access5300;", "p3", "", "p4", "", "p5", "<init>", "(Lo/getCreatedOnDateMs;Lo/PlaylistTimeline1;Lo/AnalyticsListenerEvents;Lo/access5300;JZ)V", "", "Lo/getSubscriptionExpiresOn;", "", "Lo/lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer;", "Lkotlin/Function1;", "", "", "write", "(Ljava/util/List;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;)V", "", "read", "(Ljava/util/List;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;)V", "Lo/getCreatedOnDateMs;", "IconCompatParcelizer", "()Lo/getCreatedOnDateMs;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/PlaylistTimeline1;", "()Lo/PlaylistTimeline1;", "Lo/access5300;", "()Lo/access5300;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "J", "()J", "AudioAttributesCompatParcelizer", "Z", "", "Lo/setPassingYear;", "Ljava/util/List;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "MediaBrowserCompatItemReceiver", "Lo/TopUserCompanion;", "AudioAttributesImplBaseParcelizer", "Lo/TopUserCompanion;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class access5100 implements access5600 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<setPassingYear> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;
    private final TopUserCompanion AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final PlaylistTimeline1 IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final CoroutineExceptionHandler MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final access5300 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getCreatedOnDateMs<SimpleBasePlayerExternalSyntheticLambda6> read;

    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.values().length];
            try {
                iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    private access5100(getCreatedOnDateMs<SimpleBasePlayerExternalSyntheticLambda6> getcreatedondatems, PlaylistTimeline1 playlistTimeline1, AnalyticsListenerEvents analyticsListenerEvents, access5300 access5300Var, long j, boolean z) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(analyticsListenerEvents, "");
        toMagicModuleMetaRepoModel.write(access5300Var, "");
        this.read = getcreatedondatems;
        this.IconCompatParcelizer = playlistTimeline1;
        this.RemoteActionCompatParcelizer = access5300Var;
        this.AudioAttributesCompatParcelizer = j;
        this.write = z;
        this.AudioAttributesImplApi26Parcelizer = new ArrayList();
        this.MediaBrowserCompatItemReceiver = new RemoteActionCompatParcelizer(CoroutineExceptionHandler.INSTANCE, this);
        this.AudioAttributesImplBaseParcelizer = College.AudioAttributesCompatParcelizer(analyticsListenerEvents.IconCompatParcelizer().IconCompatParcelizer(getRemoteActionCompatParcelizer().getRead()));
    }

    private getCreatedOnDateMs<SimpleBasePlayerExternalSyntheticLambda6> IconCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final PlaylistTimeline1 getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ access5100(getCreatedOnDateMs getcreatedondatems, PlaylistTimeline1 playlistTimeline1, AnalyticsListenerEvents analyticsListenerEvents, access5300 access5300Var, long j, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        access5300 access5300Var2;
        long j2;
        PlaylistTimeline1 playlistTimeline12 = (i & 2) != 0 ? null : playlistTimeline1;
        updateMediaPeriodQueueInfo updatemediaperiodqueueinfo = (i & 4) != 0 ? new updateMediaPeriodQueueInfo() : analyticsListenerEvents;
        if ((i & 8) != 0) {
            access5300.Companion companion = access5300.INSTANCE;
            access5300Var2 = access5300.Companion.read();
        } else {
            access5300Var2 = access5300Var;
        }
        if ((i & 16) != 0) {
            getTestPattern.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getTestPattern.read;
            j2 = getTestPattern.read(getUserSubmissionTimestamp.IconCompatParcelizer(5, isAnonymous.IconCompatParcelizer));
        } else {
            j2 = j;
        }
        this(getcreatedondatems, playlistTimeline12, updatemediaperiodqueueinfo, access5300Var2, j2, (i & 32) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    private access5300 getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.access5600
    public final void write(List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> p0, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> p1, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> p2, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> p3, getAnswerMap<? super Map<String, Boolean>, getShowPopup> p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        read(p0, p1, p2, p3, p4, new getAnswerMap() { // from class: o.access5200
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return access5100.read(this.RemoteActionCompatParcelizer, (Pair) obj);
            }
        });
    }

    public static final class RemoteActionCompatParcelizer extends getUnderrunThreshold implements CoroutineExceptionHandler {
        private /* synthetic */ access5100 read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(CoroutineExceptionHandler.Companion companion, access5100 access5100Var) {
            super(companion);
            this.read = access5100Var;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(CurrentQuery currentQuery, Throwable th) {
            PlaylistTimeline1 iconCompatParcelizer = this.read.getIconCompatParcelizer();
            if (iconCompatParcelizer != null) {
                Objects.toString(th.getStackTrace());
                iconCompatParcelizer.read();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(access5100 access5100Var, Pair pair) {
        toMagicModuleMetaRepoModel.write(access5100Var, "");
        toMagicModuleMetaRepoModel.write(pair, "");
        String str = (String) pair.write();
        int i = IconCompatParcelizer.read[((lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer) pair.IconCompatParcelizer()).ordinal()];
        if (i == 1) {
            return access5100Var.IconCompatParcelizer().invoke().AudioAttributesImplApi26Parcelizer(str);
        }
        if (i == 2) {
            return access5100Var.IconCompatParcelizer().invoke().AudioAttributesImplApi21Parcelizer(str);
        }
        if (i != 3) {
            throw new RenewEligibleCreator();
        }
        return access5100Var.IconCompatParcelizer().invoke().write(str);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> AudioAttributesCompatParcelizer;
        private /* synthetic */ access5100 AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ List<Pair<String, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> AudioAttributesImplBaseParcelizer;
        private /* synthetic */ getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private /* synthetic */ Object MediaBrowserCompatItemReceiver;
        private /* synthetic */ getAnswerMap<Map<String, Boolean>, getShowPopup> RemoteActionCompatParcelizer;
        private /* synthetic */ getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> read;
        private /* synthetic */ getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, Object> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objRemoteActionCompatParcelizer;
            Map<String, Boolean> map;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.MediaBrowserCompatItemReceiver;
                ArrayList arrayList = new ArrayList();
                List<Pair<String, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list = this.AudioAttributesImplBaseParcelizer;
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(setAction.write(((Pair) it.next()).write(), QBankStatsResponse.AudioAttributesCompatParcelizer(false)));
                }
                ArrayList<Pair> arrayList3 = arrayList2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList3, 10)), 16));
                for (Pair pair : arrayList3) {
                    Pair pairWrite = setAction.write(pair.write(), pair.IconCompatParcelizer());
                    linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
                }
                Map<String, Boolean> mapIconCompatParcelizer = VideoTimelineResponseBody.IconCompatParcelizer(linkedHashMap);
                List<Pair<String, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list2 = this.AudioAttributesImplBaseParcelizer;
                access5100 access5100Var = this.AudioAttributesImplApi26Parcelizer;
                getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap = this.read;
                getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, Object> getanswermap2 = this.write;
                getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap3 = this.AudioAttributesCompatParcelizer;
                getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap4 = this.IconCompatParcelizer;
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap5 = getanswermap4;
                    getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap6 = getanswermap3;
                    arrayList.add(setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new read(access5100Var, (Pair) it2.next(), getanswermap, mapIconCompatParcelizer, getanswermap2, getanswermap6, getanswermap5, null)));
                    getanswermap4 = getanswermap5;
                    getanswermap3 = getanswermap6;
                    getanswermap2 = getanswermap2;
                }
                this.MediaBrowserCompatItemReceiver = mapIconCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = 1;
                objRemoteActionCompatParcelizer = NestfputmCountryCode.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer(), new C0061AudioAttributesCompatParcelizer(arrayList, null), this);
                if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                map = mapIconCompatParcelizer;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) this.MediaBrowserCompatItemReceiver;
                SdkPayloadData.IconCompatParcelizer(obj);
                objRemoteActionCompatParcelizer = obj;
            }
            List list3 = (List) objRemoteActionCompatParcelizer;
            if (list3 != null) {
                this.RemoteActionCompatParcelizer.invoke(VideoTimelineResponseBody.read(list3));
            } else {
                this.RemoteActionCompatParcelizer.invoke(map);
            }
            return getShowPopup.INSTANCE;
        }

        static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Pair<? extends String, ? extends Boolean>>, Object> {
            private /* synthetic */ Pair<String, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer> AudioAttributesCompatParcelizer;
            private int AudioAttributesImplApi21Parcelizer;
            private /* synthetic */ access5100 AudioAttributesImplApi26Parcelizer;
            private /* synthetic */ getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> AudioAttributesImplBaseParcelizer;
            private /* synthetic */ Map<String, Boolean> IconCompatParcelizer;
            private /* synthetic */ getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, Object> RemoteActionCompatParcelizer;
            private /* synthetic */ getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> read;
            private /* synthetic */ getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                PlaylistTimeline1 iconCompatParcelizer;
                PlaylistTimeline1 iconCompatParcelizer2;
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                if (this.AudioAttributesImplApi26Parcelizer.write && (iconCompatParcelizer2 = this.AudioAttributesImplApi26Parcelizer.getIconCompatParcelizer()) != null) {
                    Objects.toString(this.AudioAttributesCompatParcelizer);
                    iconCompatParcelizer2.read();
                }
                this.write.invoke(this.AudioAttributesCompatParcelizer);
                MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
                getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, Object> getanswermap = this.RemoteActionCompatParcelizer;
                Pair<String, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer> pair = this.AudioAttributesCompatParcelizer;
                getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap2 = this.AudioAttributesImplBaseParcelizer;
                getAnswerMap<Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap3 = this.read;
                System.currentTimeMillis();
                if (getanswermap.invoke(pair) != null) {
                    getanswermap2.invoke(pair);
                    audioAttributesCompatParcelizer.IconCompatParcelizer = true;
                } else {
                    getanswermap3.invoke(pair);
                    audioAttributesCompatParcelizer.IconCompatParcelizer = false;
                }
                System.currentTimeMillis();
                if (this.AudioAttributesImplApi26Parcelizer.write && (iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.getIconCompatParcelizer()) != null) {
                    Objects.toString(this.AudioAttributesCompatParcelizer);
                    iconCompatParcelizer.read();
                }
                this.IconCompatParcelizer.put(this.AudioAttributesCompatParcelizer.write(), QBankStatsResponse.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer));
                return setAction.write(this.AudioAttributesCompatParcelizer.write(), QBankStatsResponse.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            read(access5100 access5100Var, Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer> pair, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap, Map<String, Boolean> map, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, ? extends Object> getanswermap2, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap3, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap4, SampleVideos<? super read> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi26Parcelizer = access5100Var;
                this.AudioAttributesCompatParcelizer = pair;
                this.write = getanswermap;
                this.IconCompatParcelizer = map;
                this.RemoteActionCompatParcelizer = getanswermap2;
                this.AudioAttributesImplBaseParcelizer = getanswermap3;
                this.read = getanswermap4;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new read(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Pair<String, Boolean>> sampleVideos) {
                return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.access5100$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        static final class C0061AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends Pair<? extends String, ? extends Boolean>>>, Object> {
            private int IconCompatParcelizer;
            private /* synthetic */ List<getYearOfAdmission<Pair<String, Boolean>>> RemoteActionCompatParcelizer;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                Object objAudioAttributesCompatParcelizer = setEndTimestamp.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this);
                return objAudioAttributesCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objAudioAttributesCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0061AudioAttributesCompatParcelizer(List<getYearOfAdmission<Pair<String, Boolean>>> list, SampleVideos<? super C0061AudioAttributesCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = list;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new C0061AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<Pair<String, Boolean>>> sampleVideos) {
                return ((C0061AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> list, access5100 access5100Var, getAnswerMap<? super Map<String, Boolean>, getShowPopup> getanswermap, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap2, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, ? extends Object> getanswermap3, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap4, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> getanswermap5, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesImplBaseParcelizer = list;
            this.AudioAttributesImplApi26Parcelizer = access5100Var;
            this.RemoteActionCompatParcelizer = getanswermap;
            this.read = getanswermap2;
            this.write = getanswermap3;
            this.AudioAttributesCompatParcelizer = getanswermap4;
            this.IconCompatParcelizer = getanswermap5;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, this.read, this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver = obj;
            return audioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void read(List<? extends Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> p0, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> p1, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> p2, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, getShowPopup> p3, getAnswerMap<? super Map<String, Boolean>, getShowPopup> p4, getAnswerMap<? super Pair<String, ? extends lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>, ? extends Object> p5) {
        this.AudioAttributesImplApi26Parcelizer.add(C0201setMcqCount.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, null, new AudioAttributesCompatParcelizer(p0, this, p4, p3, p5, p1, p2, null), 2));
    }
}
