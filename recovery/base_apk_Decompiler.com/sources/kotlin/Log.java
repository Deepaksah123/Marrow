package kotlin;

import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.content.ImageInfo;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes3.dex */
@getPlanOldPrice
public final class Log implements ListenerSetEvent {
    private final AdsMediaSourceAdPrepareListener RemoteActionCompatParcelizer;

    @setSdkPayload
    public Log(AdsMediaSourceAdPrepareListener adsMediaSourceAdPrepareListener) {
        toMagicModuleMetaRepoModel.write(adsMediaSourceAdPrepareListener, "");
        this.RemoteActionCompatParcelizer = adsMediaSourceAdPrepareListener;
    }

    static final class RemoteActionCompatParcelizer implements getAnswerMap<Throwable, getShowPopup> {
        private /* synthetic */ setStateRank<ImageInfo[]> IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            IconCompatParcelizer(th);
            return getShowPopup.INSTANCE;
        }

        private void IconCompatParcelizer(Throwable th) {
            setStateRank<ImageInfo[]> setstaterank = this.IconCompatParcelizer;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write((Object) th);
            setstaterank.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(th)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(setStateRank<? super ImageInfo[]> setstaterank) {
            this.IconCompatParcelizer = setstaterank;
        }
    }

    static final class read implements getAnswerMap<ImageInfo[], getShowPopup> {
        private /* synthetic */ setStateRank<ImageInfo[]> RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(ImageInfo[] imageInfoArr) {
            read(imageInfoArr);
            return getShowPopup.INSTANCE;
        }

        private void read(ImageInfo[] imageInfoArr) {
            setStateRank<ImageInfo[]> setstaterank = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(imageInfoArr);
            setstaterank.write(imageInfoArr, new getAnswerMap<Throwable, getShowPopup>() { // from class: o.Log.read.5
                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(Throwable th) {
                    read(th);
                    return getShowPopup.INSTANCE;
                }

                private static void read(Throwable th) {
                    toMagicModuleMetaRepoModel.write(th, "");
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        read(setStateRank<? super ImageInfo[]> setstaterank) {
            this.RemoteActionCompatParcelizer = setstaterank;
        }
    }

    static final class write implements getAnswerMap<Throwable, getShowPopup> {
        private /* synthetic */ MarkIncompleteResponseBody IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        private void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer.aL_();
        }

        write(MarkIncompleteResponseBody markIncompleteResponseBody) {
            this.IconCompatParcelizer = markIncompleteResponseBody;
        }
    }

    @Override // kotlin.ListenerSetEvent
    public final Object IconCompatParcelizer(String str, SampleVideos<? super ImageInfo[]> sampleVideos) {
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        setstatesolvedcount2.write((getAnswerMap<? super Throwable, getShowPopup>) new write(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, CourseConfigKeyConstantsKt.KEY_NOTES).read().RemoteActionCompatParcelizer(new getTimelineId(new read(setstatesolvedcount2)) { // from class: o.Log.AudioAttributesCompatParcelizer
            private final /* synthetic */ getAnswerMap write;

            {
                toMagicModuleMetaRepoModel.write(getanswermap, "");
                this.write = getanswermap;
            }

            @Override // kotlin.getTimelineId
            public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj) {
                this.write.invoke(obj);
            }
        }, new getTimelineId(new RemoteActionCompatParcelizer(setstatesolvedcount2)) { // from class: o.Log.AudioAttributesCompatParcelizer
            private final /* synthetic */ getAnswerMap write;

            {
                toMagicModuleMetaRepoModel.write(getanswermap, "");
                this.write = getanswermap;
            }

            @Override // kotlin.getTimelineId
            public final /* synthetic */ void RemoteActionCompatParcelizer(Object obj) {
                this.write.invoke(obj);
            }
        })));
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer;
    }
}
