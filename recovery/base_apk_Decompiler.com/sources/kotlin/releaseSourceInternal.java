package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\"\u0010\u0010\u001a\u00020\u00168\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0010\u0010\u001aR\"\u0010\u0012\u001a\u00020\u001b8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0010\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u0014\u0010\"\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0014R\u0014\u0010'\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0014\u0010&\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0014R\u0014\u0010 \u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0014R\u0014\u0010$\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0016\u0010*\u001a\u0004\u0018\u00010(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010)R\u0014\u0010\u0018\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lo/releaseSourceInternal;", "Lo/setUpdateThrottle;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lo/getCreatedOnDateMs;)V", "Lkotlin/Function2;", "", "p1", "", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "(ILo/MagicModuleSubmissionRequestBody;)Ljava/util/List;", "IconCompatParcelizer", "(I)I", "AudioAttributesCompatParcelizer", "", "read", "(I)Ljava/lang/Object;", "()I", "Lo/getCreatedOnDateMs;", "Lo/removeEventListener;", "Lo/removeEventListener;", "MediaMetadataCompat", "()Lo/removeEventListener;", "(Lo/removeEventListener;)V", "Lo/getCurrentTrackSelections;", "Lo/getCurrentTrackSelections;", "MediaBrowserCompatSearchResultReceiver", "()Lo/getCurrentTrackSelections;", "(Lo/getCurrentTrackSelections;)V", "MediaBrowserCompatCustomActionResultReceiver", "", "write", "()Z", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class releaseSourceInternal implements setUpdateThrottle {
    public removeEventListener AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<Integer> RemoteActionCompatParcelizer;
    public getCurrentTrackSelections read;

    @Override // kotlin.setUpdateThrottle
    public final int RemoteActionCompatParcelizer(int p0) {
        return p0;
    }

    public releaseSourceInternal(getCreatedOnDateMs<Integer> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = getcreatedondatems;
    }

    public final void AudioAttributesCompatParcelizer(removeEventListener removeeventlistener) {
        this.AudioAttributesCompatParcelizer = removeeventlistener;
    }

    public final removeEventListener MediaMetadataCompat() {
        removeEventListener removeeventlistener = this.AudioAttributesCompatParcelizer;
        if (removeeventlistener != null) {
            return removeeventlistener;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void AudioAttributesCompatParcelizer(getCurrentTrackSelections getcurrenttrackselections) {
        this.read = getcurrenttrackselections;
    }

    public final getCurrentTrackSelections MediaBrowserCompatSearchResultReceiver() {
        getCurrentTrackSelections getcurrenttrackselections = this.read;
        if (getcurrenttrackselections != null) {
            return getcurrenttrackselections;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Override // kotlin.setUpdateThrottle
    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer.invoke().intValue();
    }

    @Override // kotlin.setUpdateThrottle
    public final boolean write() {
        return !MediaMetadataCompat().RatingCompat().isEmpty();
    }

    @Override // kotlin.setUpdateThrottle
    public final int AudioAttributesImplApi26Parcelizer() {
        return Math.abs(getQues.RemoteActionCompatParcelizer(((getMediaItem) IntermediateLoginResponseBody.RatingCompat((List) MediaMetadataCompat().RatingCompat())).getMediaBrowserCompatMediaItem() + MediaMetadataCompat().read(), 0));
    }

    @Override // kotlin.setUpdateThrottle
    public final int AudioAttributesImplBaseParcelizer() {
        return Math.abs(((((getMediaItem) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) MediaMetadataCompat().RatingCompat())).getMediaBrowserCompatMediaItem() + MediaMetadataCompat().getAudioAttributesCompatParcelizer()) + MediaMetadataCompat().getRemoteActionCompatParcelizer()) - MediaMetadataCompat().getAudioAttributesImplApi21Parcelizer());
    }

    @Override // kotlin.setUpdateThrottle
    public final int AudioAttributesCompatParcelizer() {
        return (int) getQues.write(((long) ((getMediaItem) IntermediateLoginResponseBody.RatingCompat((List) MediaMetadataCompat().RatingCompat())).getWrite()) - ((long) MediaMetadataCompat().getAudioAttributesImplApi26Parcelizer()), 0L);
    }

    @Override // kotlin.setUpdateThrottle
    public final int RemoteActionCompatParcelizer() {
        return (int) getQues.AudioAttributesCompatParcelizer(((long) ((getMediaItem) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) MediaMetadataCompat().RatingCompat())).getWrite()) + ((long) MediaMetadataCompat().getAudioAttributesImplApi26Parcelizer()), ((long) MediaBrowserCompatCustomActionResultReceiver()) - 1);
    }

    @Override // kotlin.setUpdateThrottle
    public final int AudioAttributesImplApi21Parcelizer() {
        return enableInternal.AudioAttributesCompatParcelizer(MediaMetadataCompat());
    }

    @Override // kotlin.setUpdateThrottle
    public final bufferMapProperty read() {
        return MediaMetadataCompat().getOnPlayFromMediaId();
    }

    @Override // kotlin.setUpdateThrottle
    public final List<getCurrentTrackSelections.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer(int p0, final MagicModuleSubmissionRequestBody<? super Integer, ? super Integer, getShowPopup> p1) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(p0, MediaMetadataCompat().getOnPause(), true, new getAnswerMap() { // from class: o.prepareSourceInternal
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return releaseSourceInternal.AudioAttributesCompatParcelizer(p1, this, (getCurrentTrackSelections.write) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, releaseSourceInternal releasesourceinternal, getCurrentTrackSelections.write writeVar) {
        magicModuleSubmissionRequestBody.invoke(Integer.valueOf(writeVar.getRead()), Integer.valueOf(releasesourceinternal.MediaMetadataCompat().getAudioAttributesCompatParcelizer()));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setUpdateThrottle
    public final int MediaBrowserCompatItemReceiver() {
        return MediaMetadataCompat().onPrepare().size() + MediaMetadataCompat().RatingCompat().size() + MediaMetadataCompat().onPlayFromMediaId().size();
    }

    @Override // kotlin.setUpdateThrottle
    public final int IconCompatParcelizer(int p0) {
        return MediaMetadataCompat().getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setUpdateThrottle
    public final int AudioAttributesCompatParcelizer(int p0) {
        int size = MediaMetadataCompat().onPrepare().size();
        int size2 = MediaMetadataCompat().RatingCompat().size();
        if (p0 < size) {
            return MediaMetadataCompat().onPrepare().get(p0).getWrite();
        }
        if (p0 >= size && p0 < size + size2) {
            return MediaMetadataCompat().RatingCompat().get(p0 - size).getWrite();
        }
        if (p0 >= size + size2) {
            return MediaMetadataCompat().onPlayFromMediaId().get((p0 - size) - size2).getWrite();
        }
        return -1;
    }

    @Override // kotlin.setUpdateThrottle
    public final Object read(int p0) {
        int size = MediaMetadataCompat().onPrepare().size();
        int size2 = MediaMetadataCompat().RatingCompat().size();
        if (p0 < size) {
            return MediaMetadataCompat().onPrepare().get(p0).getRead();
        }
        if (p0 >= size && p0 < size + size2) {
            return MediaMetadataCompat().RatingCompat().get(p0 - size).getRead();
        }
        if (p0 >= size + size2) {
            return MediaMetadataCompat().onPlayFromMediaId().get((p0 - size) - size2).getRead();
        }
        return abandon.INSTANCE;
    }

    @Override // kotlin.setUpdateThrottle
    public final int IconCompatParcelizer() {
        if (MediaBrowserCompatCustomActionResultReceiver() == 0) {
            return -1;
        }
        return MediaBrowserCompatCustomActionResultReceiver() - 1;
    }
}
