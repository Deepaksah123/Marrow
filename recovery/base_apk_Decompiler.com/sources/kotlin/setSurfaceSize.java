package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001a\u0010 J\r\u0010!\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\"R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010/\u001a\u0004\u0018\u00010,8\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010-\"\u0004\b!\u0010.R\u001c\u00103\u001a\u0002008\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b\u001a\u00102R\u0016\u0010$\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010*\u001a\u0006*\u000207078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00108"}, d2 = {"Lo/setSurfaceSize;", "", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p0", "Lo/copyWithPlaceholderTimeline;", "p1", "Lo/increaseVolume;", "p2", "Lo/setMuted;", "p3", "", "p4", "Lo/onDroppedVideoFrames;", "p5", "Lo/AnalyticsListenerEvents;", "p6", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lo/copyWithPlaceholderTimeline;Lo/increaseVolume;Lo/setMuted;ILo/onDroppedVideoFrames;Lo/AnalyticsListenerEvents;)V", "Lorg/json/JSONArray;", "", "", "AudioAttributesCompatParcelizer", "(Lorg/json/JSONArray;Ljava/lang/String;)V", "IconCompatParcelizer", "(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "read", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "RemoteActionCompatParcelizer", "(Lorg/json/JSONArray;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/Timeline;", "(Lo/Timeline;Z)Z", "write", "()V", "Lo/copyWithPlaceholderTimeline;", "AudioAttributesImplApi26Parcelizer", "Lo/increaseVolume;", "Lo/setMuted;", "AudioAttributesImplApi21Parcelizer", "I", "Lo/onDroppedVideoFrames;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/AnalyticsListenerEvents;", "Lo/r8lambdayqk5n84OlDC9DTin4ovqV23B95c;", "Lo/r8lambdayqk5n84OlDC9DTin4ovqV23B95c;", "(Lo/r8lambdayqk5n84OlDC9DTin4ovqV23B95c;)V", "MediaBrowserCompatItemReceiver", "Lo/isMockTest;", "Lo/isMockTest;", "()Lo/isMockTest;", "AudioAttributesImplBaseParcelizer", "Lo/TopUserCompanion;", "MediaBrowserCompatMediaItem", "Lo/TopUserCompanion;", "Lo/RendererWakeupListener;", "Lo/RendererWakeupListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setSurfaceSize {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setMuted write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final increaseVolume IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final RendererWakeupListener MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final copyWithPlaceholderTimeline RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final AnalyticsListenerEvents AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private isMockTest AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private TopUserCompanion AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final onDroppedVideoFrames read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private r8lambdayqk5n84OlDC9DTin4ovqV23B95c MediaBrowserCompatItemReceiver;

    private setSurfaceSize(CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline, increaseVolume increasevolume, setMuted setmuted, int i, onDroppedVideoFrames ondroppedvideoframes, AnalyticsListenerEvents analyticsListenerEvents) {
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(copywithplaceholdertimeline, "");
        toMagicModuleMetaRepoModel.write(increasevolume, "");
        toMagicModuleMetaRepoModel.write(setmuted, "");
        toMagicModuleMetaRepoModel.write(ondroppedvideoframes, "");
        toMagicModuleMetaRepoModel.write(analyticsListenerEvents, "");
        this.RemoteActionCompatParcelizer = copywithplaceholdertimeline;
        this.IconCompatParcelizer = increasevolume;
        this.write = setmuted;
        this.AudioAttributesCompatParcelizer = i;
        this.read = ondroppedvideoframes;
        this.AudioAttributesImplApi21Parcelizer = analyticsListenerEvents;
        isMockTest ismocktest = getAltContact.read(null);
        this.AudioAttributesImplBaseParcelizer = ismocktest;
        this.AudioAttributesImplApi26Parcelizer = College.AudioAttributesCompatParcelizer(ismocktest.plus(analyticsListenerEvents.IconCompatParcelizer().IconCompatParcelizer(i)));
        this.MediaBrowserCompatCustomActionResultReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
    }

    public /* synthetic */ setSurfaceSize(CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline, increaseVolume increasevolume, setMuted setmuted, int i, onDroppedVideoFrames ondroppedvideoframes, AnalyticsListenerEvents analyticsListenerEvents, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(cleverTapInstanceConfig, copywithplaceholdertimeline, increasevolume, setmuted, (i2 & 16) != 0 ? 5 : i, (i2 & 32) != 0 ? onDroppedVideoFrames.IconCompatParcelizer : ondroppedvideoframes, (i2 & 64) != 0 ? new updateMediaPeriodQueueInfo() : analyticsListenerEvents);
    }

    public final void write(r8lambdayqk5n84OlDC9DTin4ovqV23B95c r8lambdayqk5n84oldc9dtin4ovqv23b95c) {
        this.MediaBrowserCompatItemReceiver = r8lambdayqk5n84oldc9dtin4ovqv23b95c;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final isMockTest getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ JSONArray IconCompatParcelizer;
        private int write;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v14 */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    JSONArray jSONArrayIconCompatParcelizer = setSurfaceSize.this.IconCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
                    if (jSONArrayIconCompatParcelizer.length() > 0) {
                        this.write = 1;
                        Object objRemoteActionCompatParcelizer = setSurfaceSize.this.RemoteActionCompatParcelizer(jSONArrayIconCompatParcelizer, this);
                        this = objRemoteActionCompatParcelizer;
                        if (objRemoteActionCompatParcelizer == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        setSurfaceSize.this.MediaBrowserCompatCustomActionResultReceiver.write("ContentFetch", "No valid content fetch items to send.");
                        this = getShowPopup.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this = this;
                }
            } catch (CancellationException unused) {
                setSurfaceSize.this.MediaBrowserCompatCustomActionResultReceiver.write("ContentFetch", "Fetch job was cancelled.");
            } catch (Exception e) {
                setSurfaceSize.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(JSONArray jSONArray, String str, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = jSONArray;
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setSurfaceSize.this.new read(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void AudioAttributesCompatParcelizer(JSONArray p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        C0201setMcqCount.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, null, null, new read(p0, p1, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONArray IconCompatParcelizer(JSONArray p0, String p1) {
        JSONArray jSONArray = new JSONArray();
        int length = p0.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = p0.opt(i);
            if (objOpt != null) {
                try {
                    JSONObject jSONObject = read(p1);
                    jSONObject.put("evtData", objOpt);
                    jSONArray.put(jSONObject);
                    RendererWakeupListener rendererWakeupListener = this.MediaBrowserCompatCustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added content fetch item: ");
                    sb.append(objOpt);
                    rendererWakeupListener.write("ContentFetch", sb.toString());
                } catch (Exception e) {
                    this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
                }
            }
        }
        return jSONArray;
    }

    private final JSONObject read(String p0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "event");
        jSONObject.put("evtName", "content_fetch");
        jSONObject.put(CmcdHeadersFactory.STREAMING_FORMAT_SS, this.RemoteActionCompatParcelizer.RatingCompat());
        jSONObject.put("pg", copyWithPlaceholderTimeline.read());
        jSONObject.put("ep", this.read.IconCompatParcelizer());
        jSONObject.put("f", this.RemoteActionCompatParcelizer.onPrepare());
        jSONObject.put("lsl", this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        jSONObject.put("pai", p0);
        String strOnMediaButtonEvent = this.RemoteActionCompatParcelizer.onMediaButtonEvent();
        if (strOnMediaButtonEvent != null) {
            jSONObject.put("n", strOnMediaButtonEvent);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object RemoteActionCompatParcelizer(JSONArray jSONArray, SampleVideos<? super Boolean> sampleVideos) {
        JSONObject jSONObjectWrite = this.IconCompatParcelizer.write((String) null);
        if (jSONObjectWrite == null) {
            return QBankStatsResponse.AudioAttributesCompatParcelizer(false);
        }
        decreaseVolume decreasevolume = new decreaseVolume(jSONObjectWrite, jSONArray);
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer("ContentFetch", "Fetching Content: ".concat(String.valueOf(decreasevolume)));
        try {
            Timeline timeline = this.write.AudioAttributesCompatParcelizer().read(decreasevolume);
            try {
                Boolean boolAudioAttributesCompatParcelizer = QBankStatsResponse.AudioAttributesCompatParcelizer(read(timeline, !getUserConfig.write(sampleVideos.getAudioAttributesImplApi26Parcelizer())));
                MagicModuleMetaLSModel.IconCompatParcelizer(timeline, null);
                return boolAudioAttributesCompatParcelizer;
            } finally {
            }
        } catch (Exception e) {
            this.MediaBrowserCompatCustomActionResultReceiver.write();
            return QBankStatsResponse.AudioAttributesCompatParcelizer(false);
        }
    }

    private final boolean read(Timeline p0, boolean p1) {
        r8lambdayqk5n84OlDC9DTin4ovqV23B95c r8lambdayqk5n84oldc9dtin4ovqv23b95c;
        if (p0.AudioAttributesCompatParcelizer()) {
            String strWrite = p0.write();
            JSONObject jSONObject = PlayerPlaybackSuppressionReason.read(strWrite);
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
            if (strWrite == null || jSONObject == null || (r8lambdayqk5n84oldc9dtin4ovqv23b95c = this.MediaBrowserCompatItemReceiver) == null) {
                return true;
            }
            r8lambdayqk5n84oldc9dtin4ovqv23b95c.AudioAttributesCompatParcelizer(false, jSONObject, strWrite, p1);
            return true;
        }
        if (p0.RemoteActionCompatParcelizer() == 429) {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
        } else {
            RendererWakeupListener rendererWakeupListener = this.MediaBrowserCompatCustomActionResultReceiver;
            p0.RemoteActionCompatParcelizer();
            rendererWakeupListener.AudioAttributesCompatParcelizer();
        }
        return false;
    }

    public final void write() throws InterruptedException {
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((CancellationException) null);
        setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, new IconCompatParcelizer(null));
        College.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, null);
        AudioAttributesCompatParcelizer();
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Iterator<setPassingYear> itWrite;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                itWrite = setSurfaceSize.this.getAudioAttributesImplBaseParcelizer().bk_().write();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                itWrite = (Iterator) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            while (itWrite.hasNext()) {
                setPassingYear next = itWrite.next();
                this.IconCompatParcelizer = itWrite;
                this.AudioAttributesCompatParcelizer = 1;
                if (next.a_(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            }
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return setSurfaceSize.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        isMockTest ismocktest = getAltContact.read(null);
        this.AudioAttributesImplBaseParcelizer = ismocktest;
        this.AudioAttributesImplApi26Parcelizer = College.AudioAttributesCompatParcelizer(ismocktest.plus(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().IconCompatParcelizer(this.AudioAttributesCompatParcelizer)));
    }
}
