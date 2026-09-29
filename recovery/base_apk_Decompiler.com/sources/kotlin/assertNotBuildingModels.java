package kotlin;

import kotlin.Metadata;
import kotlin.assertNotBuildingModels;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\b \u0018\u0000 \u0011*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u0011B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0013J\r\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0015J!\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\"\u0010\u0015J\r\u0010#\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\u0015J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010\u0015J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u0015J\r\u0010&\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u0015J\u000f\u0010'\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010\u0015J\u000f\u0010*\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00028\u0000H\u0002¢\u0006\u0004\b+\u0010\u0015J\r\u0010,\u001a\u00028\u0000¢\u0006\u0004\b,\u0010\u0015J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\u0015J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u0015J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u0015J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001c\u0010(J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0015J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010(J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010\u0015J\r\u00102\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\u0015J\r\u00103\u001a\u00028\u0000¢\u0006\u0004\b3\u0010\u0015J\r\u00104\u001a\u00028\u0000¢\u0006\u0004\b4\u0010\u0015J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u001e\u0010\u0011\u001a\u00020\u000f*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u000fH\u0082\u0010¢\u0006\u0004\b\u0011\u00108J\u001e\u0010\u001a\u001a\u00020\u000f*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u000fH\u0082\u0010¢\u0006\u0004\b\u001a\u00108J\u001d\u0010 \u001a\u00020\u000f*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u00108J\u001d\u0010\u001c\u001a\u00020\u000f*\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u00108J\u001b\u0010\u0016\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u00108J\u000f\u00109\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010\u001eJ\u000f\u0010:\u001a\u00020\u000fH\u0002¢\u0006\u0004\b:\u0010\u001eJ\u000f\u0010;\u001a\u00020\u000fH\u0002¢\u0006\u0004\b;\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010<R\u0011\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b'\u0010=R\u0011\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010>R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010?R\u0017\u0010 \u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001c\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0011\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u001f\u001a\u00020\u00058\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bF\u0010GR\u001c\u0010\u001d\u001a\u00020\u00038\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\b\u001a\u0010HR\u0014\u0010*\u001a\u00020I8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K"}, d2 = {"Lo/assertNotBuildingModels;", "T", "", "Lo/AbstractDeserializer;", "p0", "Lo/findProperty;", "p1", "Lo/deserializeFromNumber;", "p2", "Lo/SettableBeanProperty;", "p3", "Lo/setFontAssetDelegate;", "p4", "<init>", "(Lo/AbstractDeserializer;JLo/deserializeFromNumber;Lo/SettableBeanProperty;Lo/setFontAssetDelegate;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "", "RemoteActionCompatParcelizer", "(I)V", "(II)V", "onPlayFromSearch", "()Lo/assertNotBuildingModels;", "IconCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "onCommand", "Lkotlin/Function1;", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;)Lo/assertNotBuildingModels;", "read", "AudioAttributesImplBaseParcelizer", "()I", "AudioAttributesImplApi26Parcelizer", "write", "onPrepareFromUri", "onSeekTo", "onPlay", "onMediaButtonEvent", "handleMediaPlayPauseIfPendingOnHandler", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/lang/Integer;", "onRewind", "MediaBrowserCompatItemReceiver", "onRemoveQueueItem", "onAddQueueItem", "onCustomAction", "onPlayFromUri", "MediaBrowserCompatMediaItem", "onPrepareFromSearch", "onFastForward", "onPause", "onPlayFromMediaId", "onPrepare", "", "onPrepareFromMediaId", "()Z", "(Lo/deserializeFromNumber;I)I", "onRemoveQueueItemAt", "onSetRepeatMode", "onSetRating", "(I)I", "Lo/AbstractDeserializer;", "J", "Lo/deserializeFromNumber;", "Lo/SettableBeanProperty;", "AudioAttributesImplApi21Parcelizer", "()Lo/SettableBeanProperty;", "Lo/setFontAssetDelegate;", "MediaMetadataCompat", "()Lo/setFontAssetDelegate;", "MediaDescriptionCompat", "()J", "()Lo/AbstractDeserializer;", "", "RatingCompat", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class assertNotBuildingModels<T extends assertNotBuildingModels<T>> {
    public static final int write = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private AbstractDeserializer AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final deserializeFromNumber read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final AbstractDeserializer IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final setFontAssetDelegate RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final SettableBeanProperty write;

    private assertNotBuildingModels(AbstractDeserializer abstractDeserializer, long j, deserializeFromNumber deserializefromnumber, SettableBeanProperty settableBeanProperty, setFontAssetDelegate setfontassetdelegate) {
        this.IconCompatParcelizer = abstractDeserializer;
        this.AudioAttributesCompatParcelizer = j;
        this.read = deserializefromnumber;
        this.write = settableBeanProperty;
        this.RemoteActionCompatParcelizer = setfontassetdelegate;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.AudioAttributesImplBaseParcelizer = abstractDeserializer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final SettableBeanProperty getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final setFontAssetDelegate getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final long getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final AbstractDeserializer getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String RatingCompat() {
        return this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer();
    }

    protected final void RemoteActionCompatParcelizer(int p0) {
        RemoteActionCompatParcelizer(p0, p0);
    }

    protected final void RemoteActionCompatParcelizer(int p0, int p1) {
        this.AudioAttributesImplApi26Parcelizer = getValueInstantiator.write(p0, p1);
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return setFractionalTextSize.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer(), findProperty.read(this.AudioAttributesImplApi26Parcelizer), -1);
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return setFractionalTextSize.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer(), findProperty.read(this.AudioAttributesImplApi26Parcelizer));
    }

    public final int write() {
        return setFractionalTextSize.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer(), findProperty.read(this.AudioAttributesImplApi26Parcelizer));
    }

    public final Integer MediaBrowserCompatCustomActionResultReceiver() {
        deserializeFromNumber deserializefromnumber = this.read;
        if (deserializefromnumber != null) {
            return Integer.valueOf(RemoteActionCompatParcelizer$default(this, deserializefromnumber, 0, 1, null));
        }
        return null;
    }

    public final Integer MediaBrowserCompatItemReceiver() {
        deserializeFromNumber deserializefromnumber = this.read;
        if (deserializefromnumber != null) {
            return Integer.valueOf(AudioAttributesCompatParcelizer$default(this, deserializefromnumber, 0, 1, null));
        }
        return null;
    }

    public final Integer read() {
        deserializeFromNumber deserializefromnumber = this.read;
        if (deserializefromnumber != null) {
            return Integer.valueOf(write$default(this, deserializefromnumber, 0, 1, null));
        }
        return null;
    }

    public final Integer RemoteActionCompatParcelizer() {
        deserializeFromNumber deserializefromnumber = this.read;
        if (deserializefromnumber != null) {
            return Integer.valueOf(read$default(this, deserializefromnumber, 0, 1, null));
        }
        return null;
    }

    private final boolean onPrepareFromMediaId() {
        deserializeFromNumber deserializefromnumber = this.read;
        return (deserializefromnumber != null ? deserializefromnumber.AudioAttributesImplApi21Parcelizer(onRemoveQueueItemAt()) : null) != _properties.IconCompatParcelizer;
    }

    static /* synthetic */ int RemoteActionCompatParcelizer$default(assertNotBuildingModels assertnotbuildingmodels, deserializeFromNumber deserializefromnumber, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = assertnotbuildingmodels.onRemoveQueueItemAt();
        }
        return assertnotbuildingmodels.RemoteActionCompatParcelizer(deserializefromnumber, i);
    }

    private final int RemoteActionCompatParcelizer(deserializeFromNumber deserializefromnumber, int i) {
        while (i < this.IconCompatParcelizer.length()) {
            long jMediaBrowserCompatMediaItem = deserializefromnumber.MediaBrowserCompatMediaItem(write(i));
            if (findProperty.read(jMediaBrowserCompatMediaItem) > i) {
                return this.write.write(findProperty.read(jMediaBrowserCompatMediaItem));
            }
            i++;
        }
        return this.IconCompatParcelizer.length();
    }

    static /* synthetic */ int AudioAttributesCompatParcelizer$default(assertNotBuildingModels assertnotbuildingmodels, deserializeFromNumber deserializefromnumber, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i2 & 1) != 0) {
            i = assertnotbuildingmodels.onRemoveQueueItemAt();
        }
        return assertnotbuildingmodels.AudioAttributesCompatParcelizer(deserializefromnumber, i);
    }

    private final int AudioAttributesCompatParcelizer(deserializeFromNumber deserializefromnumber, int i) {
        while (i > 0) {
            long jMediaBrowserCompatMediaItem = deserializefromnumber.MediaBrowserCompatMediaItem(write(i));
            if (findProperty.AudioAttributesImplBaseParcelizer(jMediaBrowserCompatMediaItem) < i) {
                return this.write.write(findProperty.AudioAttributesImplBaseParcelizer(jMediaBrowserCompatMediaItem));
            }
            i--;
        }
        return 0;
    }

    static /* synthetic */ int write$default(assertNotBuildingModels assertnotbuildingmodels, deserializeFromNumber deserializefromnumber, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = assertnotbuildingmodels.onSetRepeatMode();
        }
        return assertnotbuildingmodels.write(deserializefromnumber, i);
    }

    private final int write(deserializeFromNumber deserializefromnumber, int i) {
        return this.write.write(deserializefromnumber.AudioAttributesImplApi26Parcelizer(deserializefromnumber.AudioAttributesCompatParcelizer(i)));
    }

    static /* synthetic */ int read$default(assertNotBuildingModels assertnotbuildingmodels, deserializeFromNumber deserializefromnumber, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i2 & 1) != 0) {
            i = assertnotbuildingmodels.onSetRating();
        }
        return assertnotbuildingmodels.read(deserializefromnumber, i);
    }

    private final int read(deserializeFromNumber deserializefromnumber, int i) {
        return this.write.write(deserializefromnumber.write(deserializefromnumber.AudioAttributesCompatParcelizer(i), true));
    }

    private final int IconCompatParcelizer(deserializeFromNumber deserializefromnumber, int i) {
        int iOnRemoveQueueItemAt = onRemoveQueueItemAt();
        if (this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() == null) {
            this.RemoteActionCompatParcelizer.read(Float.valueOf(deserializefromnumber.IconCompatParcelizer(iOnRemoveQueueItemAt).getAudioAttributesCompatParcelizer()));
        }
        int iAudioAttributesCompatParcelizer = deserializefromnumber.AudioAttributesCompatParcelizer(iOnRemoveQueueItemAt) + i;
        if (iAudioAttributesCompatParcelizer < 0) {
            return 0;
        }
        if (iAudioAttributesCompatParcelizer >= deserializefromnumber.AudioAttributesImplBaseParcelizer()) {
            return RatingCompat().length();
        }
        float f = deserializefromnumber.read(iAudioAttributesCompatParcelizer);
        Float audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
        Float f2 = audioAttributesCompatParcelizer;
        float fFloatValue = f2.floatValue();
        if ((onPrepareFromMediaId() && fFloatValue >= deserializefromnumber.MediaBrowserCompatItemReceiver(iAudioAttributesCompatParcelizer)) || (!onPrepareFromMediaId() && fFloatValue <= deserializefromnumber.MediaBrowserCompatCustomActionResultReceiver(iAudioAttributesCompatParcelizer))) {
            return deserializefromnumber.write(iAudioAttributesCompatParcelizer, true);
        }
        long j = -1;
        return this.write.write(deserializefromnumber.AudioAttributesCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f - 1.0f)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (Float.floatToRawIntBits(f2.floatValue()) << 32))));
    }

    private final int onRemoveQueueItemAt() {
        return this.write.RemoteActionCompatParcelizer(findProperty.read(this.AudioAttributesImplApi26Parcelizer));
    }

    private final int onSetRepeatMode() {
        return this.write.RemoteActionCompatParcelizer(findProperty.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer));
    }

    private final int onSetRating() {
        return this.write.RemoteActionCompatParcelizer(findProperty.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi26Parcelizer));
    }

    private final int write(int p0) {
        return getQues.RemoteActionCompatParcelizer(p0, RatingCompat().length() - 1);
    }

    public final T onPlayFromSearch() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            RemoteActionCompatParcelizer(0, RatingCompat().length());
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T IconCompatParcelizer() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            RemoteActionCompatParcelizer(findProperty.read(this.AudioAttributesImplApi26Parcelizer));
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T MediaBrowserCompatSearchResultReceiver() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            if (onPrepareFromMediaId()) {
                onPrepareFromUri();
            } else {
                onSeekTo();
            }
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onCommand() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            if (onPrepareFromMediaId()) {
                onSeekTo();
            } else {
                onPrepareFromUri();
            }
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T AudioAttributesCompatParcelizer(getAnswerMap<? super T, getShowPopup> p0) {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            if (findProperty.write(this.AudioAttributesImplApi26Parcelizer)) {
                toMagicModuleMetaRepoModel.read(this, "");
                p0.invoke(this);
            } else if (onPrepareFromMediaId()) {
                RemoteActionCompatParcelizer(findProperty.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer));
            } else {
                RemoteActionCompatParcelizer(findProperty.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi26Parcelizer));
            }
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T read(getAnswerMap<? super T, getShowPopup> p0) {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            if (findProperty.write(this.AudioAttributesImplApi26Parcelizer)) {
                toMagicModuleMetaRepoModel.read(this, "");
                p0.invoke(this);
            } else if (onPrepareFromMediaId()) {
                RemoteActionCompatParcelizer(findProperty.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi26Parcelizer));
            } else {
                RemoteActionCompatParcelizer(findProperty.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer));
            }
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    private final T onPrepareFromUri() {
        int iAudioAttributesImplApi26Parcelizer;
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0 && (iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer()) != -1) {
            RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer);
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    private final T onSeekTo() {
        int iWrite;
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0 && (iWrite = write()) != -1) {
            RemoteActionCompatParcelizer(iWrite);
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onPlay() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            RemoteActionCompatParcelizer(0);
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onMediaButtonEvent() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            RemoteActionCompatParcelizer(RatingCompat().length());
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T handleMediaPlayPauseIfPendingOnHandler() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            if (onPrepareFromMediaId()) {
                onRemoveQueueItem();
            } else {
                onRewind();
            }
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            if (onPrepareFromMediaId()) {
                onRewind();
            } else {
                onRemoveQueueItem();
            }
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    private final T onRewind() {
        Integer numMediaBrowserCompatCustomActionResultReceiver;
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0 && (numMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver()) != null) {
            RemoteActionCompatParcelizer(numMediaBrowserCompatCustomActionResultReceiver.intValue());
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    private final T onRemoveQueueItem() {
        Integer numMediaBrowserCompatItemReceiver;
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0 && (numMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver()) != null) {
            RemoteActionCompatParcelizer(numMediaBrowserCompatItemReceiver.intValue());
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onAddQueueItem() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            int iWrite = TrackSelectionView.write(RatingCompat(), findProperty.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer));
            if (iWrite == findProperty.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer) && iWrite != 0) {
                iWrite = TrackSelectionView.write(RatingCompat(), iWrite - 1);
            }
            RemoteActionCompatParcelizer(iWrite);
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onCustomAction() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            int iIconCompatParcelizer = TrackSelectionView.IconCompatParcelizer(RatingCompat(), findProperty.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi26Parcelizer));
            if (iIconCompatParcelizer == findProperty.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi26Parcelizer) && iIconCompatParcelizer != RatingCompat().length()) {
                iIconCompatParcelizer = TrackSelectionView.IconCompatParcelizer(RatingCompat(), iIconCompatParcelizer + 1);
            }
            RemoteActionCompatParcelizer(iIconCompatParcelizer);
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onPlayFromUri() {
        deserializeFromNumber deserializefromnumber;
        if (RatingCompat().length() > 0 && (deserializefromnumber = this.read) != null) {
            RemoteActionCompatParcelizer(IconCompatParcelizer(deserializefromnumber, -1));
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T MediaBrowserCompatMediaItem() {
        deserializeFromNumber deserializefromnumber;
        if (RatingCompat().length() > 0 && (deserializefromnumber = this.read) != null) {
            RemoteActionCompatParcelizer(IconCompatParcelizer(deserializefromnumber, 1));
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onPrepareFromSearch() {
        Integer num;
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0 && (num = read()) != null) {
            RemoteActionCompatParcelizer(num.intValue());
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onFastForward() {
        Integer numRemoteActionCompatParcelizer;
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0 && (numRemoteActionCompatParcelizer = RemoteActionCompatParcelizer()) != null) {
            RemoteActionCompatParcelizer(numRemoteActionCompatParcelizer.intValue());
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onPause() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            if (onPrepareFromMediaId()) {
                onPrepareFromSearch();
            } else {
                onFastForward();
            }
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onPlayFromMediaId() {
        getRemoteActionCompatParcelizer().IconCompatParcelizer();
        if (RatingCompat().length() > 0) {
            if (onPrepareFromMediaId()) {
                onFastForward();
            } else {
                onPrepareFromSearch();
            }
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final T onPrepare() {
        if (RatingCompat().length() > 0) {
            this.AudioAttributesImplApi26Parcelizer = getValueInstantiator.write(findProperty.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer), findProperty.read(this.AudioAttributesImplApi26Parcelizer));
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public /* synthetic */ assertNotBuildingModels(AbstractDeserializer abstractDeserializer, long j, deserializeFromNumber deserializefromnumber, SettableBeanProperty settableBeanProperty, setFontAssetDelegate setfontassetdelegate, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, j, deserializefromnumber, settableBeanProperty, setfontassetdelegate);
    }
}
