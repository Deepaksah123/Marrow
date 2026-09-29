package kotlin;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0018R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010 \u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0014\u0010\u001d\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u00102\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00101R\u0014\u0010)\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00104"}, d2 = {"Lo/setPresentationView;", "", "Lkotlin/Function1;", "Lo/resetWithShared;", "", "p0", "Lo/ViewPagerSavedState;", "p1", "<init>", "(Lo/getAnswerMap;Lo/ViewPagerSavedState;)V", "", "p2", "p3", "p4", "p5", "write", "(ZZZZZZ)V", "Lo/hasValueTypeDeserializer;", "Lo/SettableBeanProperty;", "Lo/deserializeFromNumber;", "Lo/WritableTypeIdInclusion;", "RemoteActionCompatParcelizer", "(Lo/hasValueTypeDeserializer;Lo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;)V", "read", "()V", "MediaDescriptionCompat", "Lo/getAnswerMap;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/ViewPagerSavedState;", "MediaBrowserCompatSearchResultReceiver", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "MediaBrowserCompatMediaItem", "Z", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "Lo/hasValueTypeDeserializer;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/deserializeFromNumber;", "RatingCompat", "Lo/SettableBeanProperty;", "Lo/WritableTypeIdInclusion;", "MediaMetadataCompat", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "[F", "onAddQueueItem", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setPresentationView {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final ViewPagerSavedState RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private WritableTypeIdInclusion MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private deserializeFromNumber RatingCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final getAnswerMap<resetWithShared, getShowPopup> write;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private SettableBeanProperty MediaDescriptionCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private hasValueTypeDeserializer AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private WritableTypeIdInclusion MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer = new Object();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final CursorAnchorInfo.Builder MediaBrowserCompatSearchResultReceiver = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final float[] onAddQueueItem = resetWithShared.RemoteActionCompatParcelizer(null, 1, null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Matrix MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public setPresentationView(getAnswerMap<? super resetWithShared, getShowPopup> getanswermap, ViewPagerSavedState viewPagerSavedState) {
        this.write = getanswermap;
        this.RemoteActionCompatParcelizer = viewPagerSavedState;
    }

    public final void write(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver = p2;
            this.MediaBrowserCompatItemReceiver = p3;
            this.AudioAttributesImplApi26Parcelizer = p4;
            this.AudioAttributesImplBaseParcelizer = p5;
            if (p0) {
                this.IconCompatParcelizer = true;
                if (this.AudioAttributesImplApi21Parcelizer != null) {
                    write();
                }
            }
            this.read = p1;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, SettableBeanProperty p1, deserializeFromNumber p2, WritableTypeIdInclusion p3, WritableTypeIdInclusion p4) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = p0;
            this.MediaDescriptionCompat = p1;
            this.RatingCompat = p2;
            this.MediaBrowserCompatMediaItem = p3;
            this.MediaMetadataCompat = p4;
            if (this.IconCompatParcelizer || this.read) {
                write();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void read() {
        synchronized (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = null;
            this.MediaDescriptionCompat = null;
            this.RatingCompat = null;
            this.MediaBrowserCompatMediaItem = null;
            this.MediaMetadataCompat = null;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    private final void write() {
        if (!this.RemoteActionCompatParcelizer.IconCompatParcelizer() || this.AudioAttributesImplApi21Parcelizer == null || this.MediaDescriptionCompat == null || this.RatingCompat == null || this.MediaBrowserCompatMediaItem == null || this.MediaMetadataCompat == null) {
            return;
        }
        resetWithShared.RemoteActionCompatParcelizer(this.onAddQueueItem);
        this.write.invoke(resetWithShared.IconCompatParcelizer(this.onAddQueueItem));
        float[] fArr = this.onAddQueueItem;
        WritableTypeIdInclusion writableTypeIdInclusion = this.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.write(writableTypeIdInclusion);
        float f = -writableTypeIdInclusion.getAudioAttributesCompatParcelizer();
        WritableTypeIdInclusion writableTypeIdInclusion2 = this.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.write(writableTypeIdInclusion2);
        resetWithShared.read(fArr, f, -writableTypeIdInclusion2.getRemoteActionCompatParcelizer(), BitmapDescriptorFactory.HUE_RED);
        appendThreeBytes.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onAddQueueItem);
        ViewPagerSavedState viewPagerSavedState = this.RemoteActionCompatParcelizer;
        CursorAnchorInfo.Builder builder = this.MediaBrowserCompatSearchResultReceiver;
        hasValueTypeDeserializer hasvaluetypedeserializer = this.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.write(hasvaluetypedeserializer);
        SettableBeanProperty settableBeanProperty = this.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.write(settableBeanProperty);
        deserializeFromNumber deserializefromnumber = this.RatingCompat;
        toMagicModuleMetaRepoModel.write(deserializefromnumber);
        Matrix matrix = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        WritableTypeIdInclusion writableTypeIdInclusion3 = this.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.write(writableTypeIdInclusion3);
        WritableTypeIdInclusion writableTypeIdInclusion4 = this.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.write(writableTypeIdInclusion4);
        viewPagerSavedState.RemoteActionCompatParcelizer(ExtensionWindowAreaPresentationRequirements.IconCompatParcelizer(builder, hasvaluetypedeserializer, settableBeanProperty, deserializefromnumber, matrix, writableTypeIdInclusion3, writableTypeIdInclusion4, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer));
        this.IconCompatParcelizer = false;
    }
}
