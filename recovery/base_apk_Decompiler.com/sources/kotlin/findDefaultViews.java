package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0012\u001a\u00020\u0006*\u00020\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR$\u0010\u001a\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001f8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u000b\u0010\"R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%R0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001d\"\u0004\b\u001e\u0010(R\u0014\u0010\u000e\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010,8\u0011@\u0011X\u0091\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b\u001a\u0010.\"\u0004\b\u001a\u0010/R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010-R$\u0010#\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00168\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b\r\u00101\"\u0004\b\u001e\u00102R$\u00107\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b4\u00105\"\u0004\b\u000b\u00106R$\u00108\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b)\u00105\"\u0004\b\u0007\u00106R$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b8\u00105\"\u0004\b\u001a\u00106R$\u00109\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b9\u00105\"\u0004\b\u001e\u00106R$\u0010:\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b7\u00105\"\u0004\b\u0012\u00106R$\u0010;\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b:\u00105\"\u0004\b\r\u00106R$\u0010=\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038\u0006@GX\u0087\u000e¢\u0006\f\n\u0004\b<\u00105\"\u0004\b \u00106R\u0011\u00100\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0012\u0010>R\u0016\u0010<\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!"}, d2 = {"Lo/findDefaultViews;", "Lo/getConstructorsWithMode;", "<init>", "()V", "Lo/Instantiatable;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/Instantiatable;)V", "Lo/switchToNext;", "(J)V", "read", "(Lo/getConstructorsWithMode;)V", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "", "p1", "AudioAttributesCompatParcelizer", "(ILo/getConstructorsWithMode;)V", "Lo/findSetterInfo;", "(Lo/findSetterInfo;)V", "", "toString", "()Ljava/lang/String;", "Lo/resetWithShared;", "IconCompatParcelizer", "[F", "", "Ljava/util/List;", "write", "", "MediaBrowserCompatCustomActionResultReceiver", "Z", "()Z", "MediaMetadataCompat", "J", "()J", "", "Lo/getBeanClass;", "(Ljava/util/List;)V", "AudioAttributesImplApi26Parcelizer", "Lo/removeSoftRefsClearedByGc;", "Lo/removeSoftRefsClearedByGc;", "Lkotlin/Function1;", "Lo/getAnswerMap;", "()Lo/getAnswerMap;", "(Lo/getAnswerMap;)V", "onAddQueueItem", "Ljava/lang/String;", "(Ljava/lang/String;)V", "", "MediaDescriptionCompat", "F", "(F)V", "MediaBrowserCompatSearchResultReceiver", "RatingCompat", "MediaBrowserCompatMediaItem", "onCustomAction", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "onCommand", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findDefaultViews extends getConstructorsWithMode {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private float RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private float[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private String MediaMetadataCompat;
    private float MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private float onCustomAction;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private float MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private long read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private float MediaDescriptionCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<getConstructorsWithMode> write;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private float onCommand;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final getAnswerMap<getConstructorsWithMode, getShowPopup> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getAnswerMap<? super getConstructorsWithMode, getShowPopup> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private List<? extends getBeanClass> AudioAttributesCompatParcelizer;

    public findDefaultViews() {
        super(null);
        this.write = new ArrayList();
        this.IconCompatParcelizer = true;
        this.read = switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
        this.AudioAttributesCompatParcelizer = getFactoryMethods.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.MediaBrowserCompatItemReceiver = new AnonymousClass2();
        this.MediaMetadataCompat = "";
        this.MediaBrowserCompatMediaItem = 1.0f;
        this.onCustomAction = 1.0f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    private final void RemoteActionCompatParcelizer(Instantiatable p0) {
        if (!this.IconCompatParcelizer || p0 == null) {
            return;
        }
        if (p0 instanceof _hasOneOf) {
            RemoteActionCompatParcelizer(((_hasOneOf) p0).getRead());
        } else {
            MediaBrowserCompatItemReceiver();
        }
    }

    private final void RemoteActionCompatParcelizer(long p0) {
        if (!this.IconCompatParcelizer || p0 == 16) {
            return;
        }
        long j = this.read;
        if (j == 16) {
            this.read = p0;
        } else {
            if (getFactoryMethods.write(j, p0)) {
                return;
            }
            MediaBrowserCompatItemReceiver();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(getConstructorsWithMode p0) {
        if (p0 instanceof findJsonValueAccessor) {
            findJsonValueAccessor findjsonvalueaccessor = (findJsonValueAccessor) p0;
            RemoteActionCompatParcelizer(findjsonvalueaccessor.getRead());
            RemoteActionCompatParcelizer(findjsonvalueaccessor.getAudioAttributesImplApi21Parcelizer());
        } else if (p0 instanceof findDefaultViews) {
            findDefaultViews finddefaultviews = (findDefaultViews) p0;
            if (finddefaultviews.IconCompatParcelizer && this.IconCompatParcelizer) {
                RemoteActionCompatParcelizer(finddefaultviews.read);
            } else {
                MediaBrowserCompatItemReceiver();
            }
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        this.IconCompatParcelizer = false;
        this.read = switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
    }

    public final void write(List<? extends getBeanClass> list) {
        this.AudioAttributesCompatParcelizer = list;
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        RemoteActionCompatParcelizer();
    }

    private final boolean AudioAttributesImplApi26Parcelizer() {
        return !this.AudioAttributesCompatParcelizer.isEmpty();
    }

    @Override // kotlin.getConstructorsWithMode
    public final getAnswerMap<getConstructorsWithMode, getShowPopup> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.getConstructorsWithMode
    public final void IconCompatParcelizer(getAnswerMap<? super getConstructorsWithMode, getShowPopup> getanswermap) {
        this.AudioAttributesImplApi21Parcelizer = getanswermap;
    }

    /* JADX INFO: renamed from: o.findDefaultViews$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/getConstructorsWithMode;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/getConstructorsWithMode;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<getConstructorsWithMode, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getConstructorsWithMode getconstructorswithmode) {
            RemoteActionCompatParcelizer(getconstructorswithmode);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(getConstructorsWithMode getconstructorswithmode) {
            findDefaultViews.this.read(getconstructorswithmode);
            getAnswerMap<getConstructorsWithMode, getShowPopup> getanswermapIconCompatParcelizer = findDefaultViews.this.IconCompatParcelizer();
            if (getanswermapIconCompatParcelizer != null) {
                getanswermapIconCompatParcelizer.invoke(getconstructorswithmode);
            }
        }

        AnonymousClass2() {
            super(1);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        if (AudioAttributesImplApi26Parcelizer()) {
            removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = this.AudioAttributesImplApi26Parcelizer;
            if (removesoftrefsclearedbygcWrite == null) {
                removesoftrefsclearedbygcWrite = writeIndentation.write();
                this.AudioAttributesImplApi26Parcelizer = removesoftrefsclearedbygcWrite;
            }
            findProperties.write(this.AudioAttributesCompatParcelizer, removesoftrefsclearedbygcWrite);
        }
    }

    public final void write(String str) {
        this.MediaMetadataCompat = str;
        RemoteActionCompatParcelizer();
    }

    public final void read(float f) {
        this.MediaBrowserCompatSearchResultReceiver = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.RatingCompat = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void IconCompatParcelizer(float f) {
        this.MediaDescriptionCompat = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void write(float f) {
        this.MediaBrowserCompatMediaItem = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.onCustomAction = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void MediaBrowserCompatItemReceiver(float f) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        this.onCommand = f;
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        RemoteActionCompatParcelizer();
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write.size();
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        float[] fArrRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (fArrRemoteActionCompatParcelizer == null) {
            fArrRemoteActionCompatParcelizer = resetWithShared.RemoteActionCompatParcelizer(null, 1, null);
            this.RemoteActionCompatParcelizer = fArrRemoteActionCompatParcelizer;
        } else {
            resetWithShared.RemoteActionCompatParcelizer(fArrRemoteActionCompatParcelizer);
        }
        float f = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        resetWithShared.read$default(fArrRemoteActionCompatParcelizer, this.RatingCompat + f, this.onCommand + this.MediaDescriptionCompat, BitmapDescriptorFactory.HUE_RED, 4, null);
        resetWithShared.IconCompatParcelizer(fArrRemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver);
        resetWithShared.AudioAttributesCompatParcelizer(fArrRemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.onCustomAction, 1.0f);
        resetWithShared.read$default(fArrRemoteActionCompatParcelizer, -this.RatingCompat, -this.MediaDescriptionCompat, BitmapDescriptorFactory.HUE_RED, 4, null);
    }

    public final void AudioAttributesCompatParcelizer(int p0, getConstructorsWithMode p1) {
        if (p0 < AudioAttributesCompatParcelizer()) {
            this.write.set(p0, p1);
        } else {
            this.write.add(p1);
        }
        read(p1);
        p1.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getConstructorsWithMode
    public final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo) {
        if (this.handleMediaPlayPauseIfPendingOnHandler) {
            AudioAttributesImplApi21Parcelizer();
            this.handleMediaPlayPauseIfPendingOnHandler = false;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            AudioAttributesImplBaseParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver = false;
        }
        findSerializationTyping iconCompatParcelizer = findsetterinfo.getIconCompatParcelizer();
        long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
        iconCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
        try {
            findTypeName remoteActionCompatParcelizer = iconCompatParcelizer.getRemoteActionCompatParcelizer();
            float[] fArr = this.RemoteActionCompatParcelizer;
            if (fArr != null) {
                remoteActionCompatParcelizer.read((fArr != null ? resetWithShared.IconCompatParcelizer(fArr) : null).getIconCompatParcelizer());
            }
            removeSoftRefsClearedByGc removesoftrefsclearedbygc = this.AudioAttributesImplApi26Parcelizer;
            if (AudioAttributesImplApi26Parcelizer() && removesoftrefsclearedbygc != null) {
                findTypeName.write$default(remoteActionCompatParcelizer, removesoftrefsclearedbygc, 0, 2, null);
            }
            List<getConstructorsWithMode> list = this.write;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).AudioAttributesCompatParcelizer(findsetterinfo);
            }
        } finally {
            iconCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer();
            iconCompatParcelizer.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.MediaMetadataCompat);
        List<getConstructorsWithMode> list = this.write;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            getConstructorsWithMode getconstructorswithmode = list.get(i);
            sb.append("\t");
            sb.append(getconstructorswithmode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
