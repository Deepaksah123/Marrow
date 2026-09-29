package kotlin;

import android.graphics.Matrix;
import android.graphics.Outline;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\rH&¢\u0006\u0004\b\u000b\u0010\u000eJ;\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0012H&¢\u0006\u0004\b\u000b\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u00020\u001b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\b\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8&@'X¦\u000e¢\u0006\u0006\"\u0004\b\u0019\u0010 R\u001c\u0010\u0019\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010#\"\u0004\b\u0016\u0010$R\u001c\u0010\b\u001a\u00020%8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u001d\"\u0004\b\u0019\u0010\u001eR\u001e\u0010\u0016\u001a\u0004\u0018\u00010&8'@'X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b\u0019\u0010)R\u001c\u0010\u001c\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010#\"\u0004\b\u001c\u0010$R\u001c\u0010,\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010#\"\u0004\b'\u0010$R\u001c\u0010/\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010#\"\u0004\b.\u0010$R\u001c\u0010.\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010#\"\u0004\b,\u0010$R\u001c\u0010'\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b1\u0010#\"\u0004\b/\u0010$R\u001c\u0010+\u001a\u0002028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u00103\"\u0004\b\b\u0010 R\u001c\u0010*\u001a\u0002028'@'X¦\u000e¢\u0006\f\u001a\u0004\b4\u00103\"\u0004\b\u0016\u0010 R\u001c\u00106\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b5\u0010#\"\u0004\b\u000b\u0010$R\u001c\u00105\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010#\"\u0004\b\u0019\u0010$R\u001c\u00107\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b7\u0010#\"\u0004\b!\u0010$R\u001c\u0010-\u001a\u00020\"8'@'X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010#\"\u0004\b\b\u0010$R\u0016\u00101\u001a\u0002088&@'X¦\u000e¢\u0006\u0006\"\u0004\b\b\u00109R\u001e\u00100\u001a\u0004\u0018\u00010:8'@'X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010;\"\u0004\b!\u0010<R\u0016\u0010=\u001a\u0002088&@'X¦\u000e¢\u0006\u0006\"\u0004\b\u0016\u00109R\u0014\u00104\u001a\u0002088WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002088WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010>ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/hasAsKey;", "", "", "p0", "p1", "Lo/getKey;", "p2", "", "write", "(IIJ)V", "Landroid/graphics/Outline;", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Outline;J)V", "Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;)V", "Lo/bufferMapProperty;", "Lo/tryToResolveUnresolved;", "Lo/hasAnyGetter;", "Lkotlin/Function1;", "Lo/findSetterInfo;", "p3", "(Lo/bufferMapProperty;Lo/tryToResolveUnresolved;Lo/hasAnyGetter;Lo/getAnswerMap;)V", "read", "()V", "Landroid/graphics/Matrix;", "IconCompatParcelizer", "()Landroid/graphics/Matrix;", "Lo/hasAnySetter;", "AudioAttributesImplBaseParcelizer", "()I", "(I)V", "Lo/getReferencedType;", "(J)V", "RemoteActionCompatParcelizer", "", "()F", "(F)V", "Lo/createInstance;", "Lo/switchAndReturnNext;", "MediaBrowserCompatItemReceiver", "()Lo/switchAndReturnNext;", "(Lo/switchAndReturnNext;)V", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem", "MediaBrowserCompatCustomActionResultReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "onAddQueueItem", "handleMediaPlayPauseIfPendingOnHandler", "Lo/switchToNext;", "()J", "onCommand", "RatingCompat", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "", "(Z)V", "Lo/parseVersionPart;", "()Lo/parseVersionPart;", "(Lo/parseVersionPart;)V", "onCustomAction", "()Z", "onPlayFromMediaId"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface hasAsKey {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    int getMediaBrowserCompatItemReceiver();

    void AudioAttributesCompatParcelizer(float f);

    void AudioAttributesCompatParcelizer(Outline p0, long p1);

    void AudioAttributesCompatParcelizer(JsonParserDelegate p0);

    void AudioAttributesCompatParcelizer(bufferMapProperty p0, tryToResolveUnresolved p1, hasAnyGetter p2, getAnswerMap<? super findSetterInfo, getShowPopup> p3);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
    float getOnPause();

    void AudioAttributesImplApi21Parcelizer(float f);

    void AudioAttributesImplApi26Parcelizer(float f);

    default boolean AudioAttributesImplApi26Parcelizer() {
        return true;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    int getOnPrepare();

    void AudioAttributesImplBaseParcelizer(float f);

    Matrix IconCompatParcelizer();

    void IconCompatParcelizer(float f);

    void IconCompatParcelizer(int i);

    void IconCompatParcelizer(long j);

    void IconCompatParcelizer(switchAndReturnNext switchandreturnnext);

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver */
    parseVersionPart getOnPlayFromSearch();

    void MediaBrowserCompatCustomActionResultReceiver(float f);

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver */
    switchAndReturnNext getMediaMetadataCompat();

    void MediaBrowserCompatItemReceiver(float f);

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem */
    float getMediaDescriptionCompat();

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver */
    float getOnMediaButtonEvent();

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver */
    float getRatingCompat();

    /* JADX INFO: renamed from: MediaDescriptionCompat */
    float getMediaBrowserCompatMediaItem();

    /* JADX INFO: renamed from: MediaMetadataCompat */
    float getOnFastForward();

    /* JADX INFO: renamed from: RatingCompat */
    float getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    float getMediaBrowserCompatCustomActionResultReceiver();

    void RemoteActionCompatParcelizer(float f);

    void RemoteActionCompatParcelizer(parseVersionPart parseversionpart);

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler */
    float getOnCommand();

    /* JADX INFO: renamed from: onAddQueueItem */
    float getOnCustomAction();

    /* JADX INFO: renamed from: onCommand */
    long getOnAddQueueItem();

    default boolean onCustomAction() {
        return false;
    }

    void read();

    void read(float f);

    void read(long j);

    void read(boolean z);

    /* JADX INFO: renamed from: write */
    long getHandleMediaPlayPauseIfPendingOnHandler();

    void write(float f);

    void write(int i);

    void write(int p0, int p1, long p2);

    void write(long j);

    void write(boolean z);

    /* JADX INFO: renamed from: o.hasAsKey$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lo/hasAsKey$read;", "", "<init>", "()V", "Lkotlin/Function1;", "Lo/findSetterInfo;", "", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion write = new Companion();

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private static final getAnswerMap<findSetterInfo, getShowPopup> AudioAttributesCompatParcelizer = AnonymousClass2.AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: o.hasAsKey$read$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSetterInfo;", "", "IconCompatParcelizer", "(Lo/findSetterInfo;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<findSetterInfo, getShowPopup> {
            public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

            public final void IconCompatParcelizer(findSetterInfo findsetterinfo) {
                findSetterInfo.read$default(findsetterinfo, switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer(), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 126, null);
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(findSetterInfo findsetterinfo) {
                IconCompatParcelizer(findsetterinfo);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass2() {
                super(1);
            }
        }

        private Companion() {
        }
    }
}
