package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.common.KycResponseBody;
import com.marrow.data.models.common.ImageUpload;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ProgressiveMediaExtractor;

/* JADX INFO: loaded from: classes5.dex */
public final class ProgressiveMediaPeriod implements ProgressiveMediaExtractor.IconCompatParcelizer {
    private ProgressiveMediaExtractor.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;
    private final getIds RemoteActionCompatParcelizer;
    private final getSno read;
    private final withAvailableAdUri write;

    @setSdkPayload
    public ProgressiveMediaPeriod(getIds getids, withAvailableAdUri withavailableaduri) {
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(withavailableaduri, "");
        this.RemoteActionCompatParcelizer = getids;
        this.write = withavailableaduri;
        this.read = new getSno();
    }

    @Override // o.ProgressiveMediaExtractor.IconCompatParcelizer
    public final void IconCompatParcelizer(ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        accessgetEmptyStatecp<List<ImageUpload>> accessgetemptystatecpAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new AudioAttributesCompatParcelizer(this);
        accessgetEmptyStatecp<R> accessgetemptystatecpRemoteActionCompatParcelizer = accessgetemptystatecpAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.assertPrepared
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return ProgressiveMediaPeriod.IconCompatParcelizer(audioAttributesCompatParcelizer2, obj);
            }
        });
        final write writeVar = new write(this);
        getTimelineId gettimelineid = new getTimelineId() { // from class: o.createIcyMetadataHeaders
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                ProgressiveMediaPeriod.read(writeVar, obj);
            }
        };
        final IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        MarkIncompleteResponseBody markIncompleteResponseBodyIconCompatParcelizer = accessgetemptystatecpRemoteActionCompatParcelizer.IconCompatParcelizer((getTimelineId<? super R>) gettimelineid, new getTimelineId() { // from class: o.access702
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                ProgressiveMediaPeriod.MediaBrowserCompatItemReceiver(iconCompatParcelizer, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(markIncompleteResponseBodyIconCompatParcelizer, "");
        getManifestPublishTimeMsInEmsg.AudioAttributesCompatParcelizer(markIncompleteResponseBodyIconCompatParcelizer, this.read);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<List<? extends ImageUpload>, Boolean> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<ImageUpload> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            return Boolean.valueOf(((ProgressiveMediaPeriod) this.AudioAttributesImplApi26Parcelizer).RemoteActionCompatParcelizer(list));
        }

        AudioAttributesCompatParcelizer(Object obj) {
            super(1, obj, ProgressiveMediaPeriod.class, "onLoad", "onLoad(Ljava/util/List;)Z", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Throwable, getShowPopup> {
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            toMagicModuleMetaRepoModel.write(th, "");
            ((ProgressiveMediaPeriod) this.AudioAttributesImplApi26Parcelizer).write();
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            AudioAttributesCompatParcelizer(th);
            return getShowPopup.INSTANCE;
        }

        IconCompatParcelizer(Object obj) {
            super(1, obj, ProgressiveMediaPeriod.class, "onFailure", "onFailure(Ljava/lang/Throwable;)V", 0);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class write extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Boolean, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Boolean bool) {
            read(bool.booleanValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(boolean z) {
            ((ProgressiveMediaPeriod) this.AudioAttributesImplApi26Parcelizer).RemoteActionCompatParcelizer(z);
        }

        write(Object obj) {
            super(1, obj, ProgressiveMediaPeriod.class, "onDone", "onDone(Z)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (Boolean) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatItemReceiver(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(boolean z) {
        String str = z ? "ImageUploadPass" : "ImageUploadFailed";
        ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
        ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = null;
        if (audioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer("ImageUploadService", str);
        ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = this.AudioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer3;
        }
        audioAttributesCompatParcelizer2.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer;
        ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = null;
        if (audioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer("ImageUploadService", "ImageUploadFailed");
        ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = this.AudioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer3;
        }
        audioAttributesCompatParcelizer2.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean RemoteActionCompatParcelizer(List<ImageUpload> list) {
        ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        if (list.isEmpty()) {
            return true;
        }
        int size = list.size();
        Iterator<T> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            audioAttributesCompatParcelizer = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            ImageUpload imageUpload = (ImageUpload) next;
            ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer;
            if (audioAttributesCompatParcelizer2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
            }
            audioAttributesCompatParcelizer.read("Uploading ID Verification Images...", i2, size);
            if (AudioAttributesCompatParcelizer(imageUpload)) {
                i++;
            }
            i2++;
        }
        boolean z = size == i;
        if (z) {
            ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 = this.AudioAttributesCompatParcelizer;
            if (audioAttributesCompatParcelizer3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                audioAttributesCompatParcelizer = audioAttributesCompatParcelizer3;
            }
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer("ID Verification Upload Complete", size);
            return z;
        }
        ProgressiveMediaExtractor.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer4 = this.AudioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            audioAttributesCompatParcelizer = audioAttributesCompatParcelizer4;
        }
        audioAttributesCompatParcelizer.IconCompatParcelizer("ID Verification Upload Failed", i, size);
        return z;
    }

    private final boolean AudioAttributesCompatParcelizer(ImageUpload imageUpload) {
        MarrowResponse<KycResponseBody> marrowResponseRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(imageUpload);
        if (marrowResponseRemoteActionCompatParcelizer instanceof Success) {
            return ((KycResponseBody) ((Success) marrowResponseRemoteActionCompatParcelizer).getData()).isAccepted;
        }
        return false;
    }

    @Override // kotlin.getDisplayCues
    public final void read() {
        this.read.read();
    }
}
