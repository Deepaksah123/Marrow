package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda9;", "Lo/SimpleBasePlayerExternalSyntheticLambda58;", "Lkotlin/Function0;", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "p0", "Lo/AnalyticsListenerEvents;", "p1", "<init>", "(Lo/getCreatedOnDateMs;Lo/AnalyticsListenerEvents;)V", "", "", "Lkotlin/Function1;", "", "IconCompatParcelizer", "(Ljava/util/List;Lo/getAnswerMap;)V", "write", "Lo/getCreatedOnDateMs;", "read", "()Lo/getCreatedOnDateMs;", "AudioAttributesCompatParcelizer", "Lo/AnalyticsListenerEvents;", "RemoteActionCompatParcelizer", "", "Lo/setPassingYear;", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda9 implements SimpleBasePlayerExternalSyntheticLambda58 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final AnalyticsListenerEvents RemoteActionCompatParcelizer;
    private List<setPassingYear> IconCompatParcelizer;
    private final getCreatedOnDateMs<SimpleBasePlayerExternalSyntheticLambda6> write;

    private SimpleBasePlayerExternalSyntheticLambda9(getCreatedOnDateMs<SimpleBasePlayerExternalSyntheticLambda6> getcreatedondatems, AnalyticsListenerEvents analyticsListenerEvents) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(analyticsListenerEvents, "");
        this.write = getcreatedondatems;
        this.RemoteActionCompatParcelizer = analyticsListenerEvents;
        this.IconCompatParcelizer = new ArrayList();
    }

    public final getCreatedOnDateMs<SimpleBasePlayerExternalSyntheticLambda6> read() {
        return this.write;
    }

    public /* synthetic */ SimpleBasePlayerExternalSyntheticLambda9(getCreatedOnDateMs getcreatedondatems, updateMediaPeriodQueueInfo updatemediaperiodqueueinfo, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getcreatedondatems, (i & 2) != 0 ? new updateMediaPeriodQueueInfo() : updatemediaperiodqueueinfo);
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ List<String> AudioAttributesCompatParcelizer;
        private /* synthetic */ Object IconCompatParcelizer;
        private /* synthetic */ SimpleBasePlayerExternalSyntheticLambda9 RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ getAnswerMap<String, getShowPopup> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.IconCompatParcelizer;
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = this.AudioAttributesCompatParcelizer.iterator();
                while (it.hasNext()) {
                    arrayList.add(setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, it.next(), this.write, null)));
                }
                this.read = 1;
                if (setEndTimestamp.AudioAttributesCompatParcelizer(arrayList, this) == objIconCompatParcelizer) {
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

        static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ SimpleBasePlayerExternalSyntheticLambda9 IconCompatParcelizer;
            private /* synthetic */ String read;
            private /* synthetic */ getAnswerMap<String, getShowPopup> write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer.read().invoke().RemoteActionCompatParcelizer(this.read);
                this.write.invoke(this.read);
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AudioAttributesCompatParcelizer(SimpleBasePlayerExternalSyntheticLambda9 simpleBasePlayerExternalSyntheticLambda9, String str, getAnswerMap<? super String, getShowPopup> getanswermap, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = simpleBasePlayerExternalSyntheticLambda9;
                this.read = str;
                this.write = getanswermap;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.read, this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(List<String> list, SimpleBasePlayerExternalSyntheticLambda9 simpleBasePlayerExternalSyntheticLambda9, getAnswerMap<? super String, getShowPopup> getanswermap, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = list;
            this.RemoteActionCompatParcelizer = simpleBasePlayerExternalSyntheticLambda9;
            this.write = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = new read(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, sampleVideos);
            readVar.IconCompatParcelizer = obj;
            return readVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.SimpleBasePlayerExternalSyntheticLambda58
    public final void IconCompatParcelizer(List<String> p0, getAnswerMap<? super String, getShowPopup> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.IconCompatParcelizer.add(C0201setMcqCount.IconCompatParcelizer(College.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer()), null, null, new read(p0, this, p1, null), 3));
    }
}
