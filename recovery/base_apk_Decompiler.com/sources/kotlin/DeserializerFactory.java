package kotlin;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00122\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0018\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010#R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010 \u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00101R\u0018\u0010-\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0014\u0010(\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u00105\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00107"}, d2 = {"Lo/DeserializerFactory;", "", "Lo/useRootWrapping;", "p0", "Lo/getClassName;", "p1", "<init>", "(Lo/useRootWrapping;Lo/getClassName;)V", "", "p2", "p3", "p4", "p5", "", "read", "(ZZZZZZ)V", "Lo/hasValueTypeDeserializer;", "Lo/SettableBeanProperty;", "Lo/deserializeFromNumber;", "Lkotlin/Function1;", "Lo/resetWithShared;", "Lo/WritableTypeIdInclusion;", "RemoteActionCompatParcelizer", "(Lo/hasValueTypeDeserializer;Lo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/getAnswerMap;Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;)V", "write", "()V", "AudioAttributesCompatParcelizer", "MediaDescriptionCompat", "Lo/useRootWrapping;", "AudioAttributesImplApi21Parcelizer", "Lo/getClassName;", "IconCompatParcelizer", "MediaBrowserCompatMediaItem", "Ljava/lang/Object;", "RatingCompat", "Z", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "onAddQueueItem", "Lo/hasValueTypeDeserializer;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/deserializeFromNumber;", "MediaMetadataCompat", "MediaBrowserCompatSearchResultReceiver", "Lo/SettableBeanProperty;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/getAnswerMap;", "Lo/WritableTypeIdInclusion;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "[F", "onCustomAction", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "onCommand"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeserializerFactory {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getClassName IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private WritableTypeIdInclusion RatingCompat;
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private SettableBeanProperty MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final useRootWrapping AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private boolean read;
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private deserializeFromNumber MediaMetadataCompat;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private hasValueTypeDeserializer AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private WritableTypeIdInclusion MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final Object write = new Object();

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private getAnswerMap<? super resetWithShared, getShowPopup> MediaDescriptionCompat = AnonymousClass5.RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final CursorAnchorInfo.Builder onAddQueueItem = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final float[] onCustomAction = resetWithShared.RemoteActionCompatParcelizer(null, 1, null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Matrix onCommand = new Matrix();

    public DeserializerFactory(useRootWrapping userootwrapping, getClassName getclassname) {
        this.AudioAttributesCompatParcelizer = userootwrapping;
        this.IconCompatParcelizer = getclassname;
    }

    /* JADX INFO: renamed from: o.DeserializerFactory$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/resetWithShared;", "p0", "", "read", "([F)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<resetWithShared, getShowPopup> {
        public static final AnonymousClass5 RemoteActionCompatParcelizer = new AnonymousClass5();

        public final void read(float[] fArr) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(resetWithShared resetwithshared) {
            read(resetwithshared.getIconCompatParcelizer());
            return getShowPopup.INSTANCE;
        }

        AnonymousClass5() {
            super(1);
        }
    }

    public final void read(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5) {
        synchronized (this.write) {
            this.MediaBrowserCompatItemReceiver = p2;
            this.MediaBrowserCompatCustomActionResultReceiver = p3;
            this.AudioAttributesImplBaseParcelizer = p4;
            this.AudioAttributesImplApi26Parcelizer = p5;
            if (p0) {
                this.RemoteActionCompatParcelizer = true;
                if (this.AudioAttributesImplApi21Parcelizer != null) {
                    AudioAttributesCompatParcelizer();
                }
            }
            this.read = p1;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, SettableBeanProperty p1, deserializeFromNumber p2, getAnswerMap<? super resetWithShared, getShowPopup> p3, WritableTypeIdInclusion p4, WritableTypeIdInclusion p5) {
        synchronized (this.write) {
            this.AudioAttributesImplApi21Parcelizer = p0;
            this.MediaBrowserCompatMediaItem = p1;
            this.MediaMetadataCompat = p2;
            this.MediaDescriptionCompat = p3;
            this.RatingCompat = p4;
            this.MediaBrowserCompatSearchResultReceiver = p5;
            if (this.RemoteActionCompatParcelizer || this.read) {
                AudioAttributesCompatParcelizer();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void write() {
        synchronized (this.write) {
            this.AudioAttributesImplApi21Parcelizer = null;
            this.MediaBrowserCompatMediaItem = null;
            this.MediaMetadataCompat = null;
            this.MediaDescriptionCompat = AnonymousClass2.AudioAttributesCompatParcelizer;
            this.RatingCompat = null;
            this.MediaBrowserCompatSearchResultReceiver = null;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.DeserializerFactory$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/resetWithShared;", "p0", "", "write", "([F)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<resetWithShared, getShowPopup> {
        public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

        public final void write(float[] fArr) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(resetWithShared resetwithshared) {
            write(resetwithshared.getIconCompatParcelizer());
            return getShowPopup.INSTANCE;
        }

        AnonymousClass2() {
            super(1);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer.read()) {
            this.MediaDescriptionCompat.invoke(resetWithShared.IconCompatParcelizer(this.onCustomAction));
            this.AudioAttributesCompatParcelizer.read(this.onCustomAction);
            appendThreeBytes.read(this.onCommand, this.onCustomAction);
            getClassName getclassname = this.IconCompatParcelizer;
            CursorAnchorInfo.Builder builder = this.onAddQueueItem;
            hasValueTypeDeserializer hasvaluetypedeserializer = this.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.write(hasvaluetypedeserializer);
            SettableBeanProperty settableBeanProperty = this.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.write(settableBeanProperty);
            deserializeFromNumber deserializefromnumber = this.MediaMetadataCompat;
            toMagicModuleMetaRepoModel.write(deserializefromnumber);
            Matrix matrix = this.onCommand;
            WritableTypeIdInclusion writableTypeIdInclusion = this.RatingCompat;
            toMagicModuleMetaRepoModel.write(writableTypeIdInclusion);
            WritableTypeIdInclusion writableTypeIdInclusion2 = this.MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.write(writableTypeIdInclusion2);
            getclassname.IconCompatParcelizer(findConverter.RemoteActionCompatParcelizer(builder, hasvaluetypedeserializer, settableBeanProperty, deserializefromnumber, matrix, writableTypeIdInclusion, writableTypeIdInclusion2, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer));
            this.RemoteActionCompatParcelizer = false;
        }
    }
}
