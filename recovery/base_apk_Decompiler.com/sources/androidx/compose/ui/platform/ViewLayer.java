package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.CoercionAction;
import kotlin.JsonParserDelegate;
import kotlin.JsonSerialize;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.RequestPayload;
import kotlin.Separators;
import kotlin._reportUnkownFormat;
import kotlin.charBufferLength;
import kotlin.contentAs;
import kotlin.createFlattened;
import kotlin.findCreatorAnnotation;
import kotlin.fromInitial;
import kotlin.getAcceptBlankAsEmpty;
import kotlin.getCreatedOnDateMs;
import kotlin.getGenericSignature;
import kotlin.getShowPopup;
import kotlin.getType;
import kotlin.hasAnyGetter;
import kotlin.hasReferringProperties;
import kotlin.parseVersion;
import kotlin.releaseBuffers;
import kotlin.removeSoftRefsClearedByGc;
import kotlin.resetWithShared;
import kotlin.resolveAbstractType;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.cpio.CpioConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0018J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0007\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u0010\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0013J7\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0013J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0013J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0007\u0010)J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010+J9\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00060,2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060-H\u0016¢\u0006\u0004\b\u0007\u0010.J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020/H\u0016¢\u0006\u0004\b\u0010\u00100J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020/H\u0016¢\u0006\u0004\b\u0007\u00100R\u0011\u00104\u001a\u0002018\u0006¢\u0006\u0006\n\u0004\b2\u00103R\u0011\u0010\u0010\u001a\u0002058\u0006¢\u0006\u0006\n\u0004\b6\u00107R,\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u0006\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00108R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0018\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\n\u001a\u0004\u0018\u00010D8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010ER*\u0010G\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010?\u001a\u0004\bG\u0010\u000e\"\u0004\b\u0007\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010?R\u0014\u0010>\u001a\u00020L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010MR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010N8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0014\u001a\u00020/8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010QR\"\u0010S\u001a\u00020R8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Y\u001a\u00020\f8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bY\u0010\u000e\"\u0004\bZ\u0010HR\u0016\u0010\u0012\u001a\u00020[8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010I\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010?R$\u0010a\u001a\u00020R2\u0006\u0010\u0005\u001a\u00020R8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010V\"\u0004\b`\u0010XR\u0016\u0010^\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010c"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Lo/_reportUnkownFormat;", "Lo/getGenericSignature;", "Lo/resolveAbstractType;", "p0", "", "IconCompatParcelizer", "(Lo/resolveAbstractType;)V", "Lo/releaseBuffers;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/releaseBuffers;", "", "hasOverlappingRendering", "()Z", "Lo/getReferencedType;", "RemoteActionCompatParcelizer", "(J)Z", "RatingCompat", "()V", "MediaBrowserCompatSearchResultReceiver", "Lo/getKey;", "(J)V", "Lo/hasReferringProperties;", "write", "Lo/JsonParserDelegate;", "Lo/hasAnyGetter;", "p1", "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "", "p2", "p3", "p4", "onLayout", "(ZIIII)V", "AudioAttributesCompatParcelizer", "forceLayout", "(JZ)J", "Lo/getType;", "(Lo/getType;Z)V", "Lkotlin/Function2;", "Lkotlin/Function0;", "(Lo/MagicModuleSubmissionRequestBody;Lo/getCreatedOnDateMs;)V", "Lo/resetWithShared;", "([F)V", "Landroidx/compose/ui/platform/AndroidComposeView;", "onFastForward", "Landroidx/compose/ui/platform/AndroidComposeView;", "read", "Landroidx/compose/ui/platform/DrawChildContainer;", "MediaDescriptionCompat", "Landroidx/compose/ui/platform/DrawChildContainer;", "Lo/MagicModuleSubmissionRequestBody;", "MediaMetadataCompat", "Lo/getCreatedOnDateMs;", "Lo/JsonSerialize;", "onPlayFromMediaId", "Lo/JsonSerialize;", "MediaBrowserCompatMediaItem", "Z", "AudioAttributesImplBaseParcelizer", "Landroid/graphics/Rect;", "MediaBrowserCompatItemReceiver", "Landroid/graphics/Rect;", "Lo/removeSoftRefsClearedByGc;", "()Lo/removeSoftRefsClearedByGc;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "AudioAttributesImplApi26Parcelizer", "(Z)V", "onAddQueueItem", "Lo/releaseBuffers;", "AudioAttributesImplApi21Parcelizer", "Lo/createFlattened;", "Lo/createFlattened;", "Lo/contentAs;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/contentAs;", "()[F", "", "frameRate", "F", "getFrameRate", "()F", "setFrameRate", "(F)V", "isFrameRateFromParent", "setFrameRateFromParent", "Lo/findCreatorAnnotation;", "onCustomAction", "J", "onCommand", "getCameraDistancePx", "setCameraDistancePx", "cameraDistancePx", "onPause", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewLayer extends View implements _reportUnkownFormat, getGenericSignature {
    private static boolean AudioAttributesCompatParcelizer;
    private static Method AudioAttributesImplApi21Parcelizer;
    private static Field AudioAttributesImplBaseParcelizer;
    private static boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final createFlattened MediaBrowserCompatMediaItem;
    private Rect MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super JsonParserDelegate, ? super hasAnyGetter, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final DrawChildContainer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;
    private float frameRate;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final contentAs<View> MediaMetadataCompat;
    private boolean isFrameRateFromParent;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private releaseBuffers AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private boolean onAddQueueItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private long RatingCompat;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final AndroidComposeView read;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private int onCommand;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final JsonSerialize write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int read = 8;
    private static final MagicModuleSubmissionRequestBody<View, Matrix, getShowPopup> RemoteActionCompatParcelizer = AnonymousClass5.write;
    private static final ViewOutlineProvider IconCompatParcelizer = new read();

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
    }

    private final removeSoftRefsClearedByGc MediaBrowserCompatItemReceiver() {
        if (!getClipToOutline() || this.write.AudioAttributesCompatParcelizer()) {
            return null;
        }
        return this.write.read();
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private final void IconCompatParcelizer(boolean z) {
        if (z != this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi26Parcelizer = z;
            this.read.RemoteActionCompatParcelizer(this, z);
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final float[] read() {
        return this.MediaMetadataCompat.read(this);
    }

    public final float getFrameRate() {
        return this.frameRate;
    }

    public final void setFrameRate(float f) {
        this.frameRate = f;
    }

    /* JADX INFO: renamed from: isFrameRateFromParent, reason: from getter */
    public final boolean getIsFrameRateFromParent() {
        return this.isFrameRateFromParent;
    }

    public final void setFrameRateFromParent(boolean z) {
        this.isFrameRateFromParent = z;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer(resolveAbstractType p0) {
        int iHandleMediaPlayPauseIfPendingOnHandler;
        getCreatedOnDateMs<getShowPopup> getcreatedondatems;
        int iOnMediaButtonEvent = p0.getRemoteActionCompatParcelizer() | this.onCommand;
        if ((iOnMediaButtonEvent & 4096) != 0) {
            long jMediaBrowserCompatItemReceiver = p0.getRatingCompat();
            this.RatingCompat = jMediaBrowserCompatItemReceiver;
            setPivotX(findCreatorAnnotation.read(jMediaBrowserCompatItemReceiver) * getWidth());
            setPivotY(findCreatorAnnotation.write(this.RatingCompat) * getHeight());
        }
        if ((iOnMediaButtonEvent & 1) != 0) {
            setScaleX(p0.getIconCompatParcelizer());
        }
        if ((iOnMediaButtonEvent & 2) != 0) {
            setScaleY(p0.getWrite());
        }
        if ((iOnMediaButtonEvent & 4) != 0) {
            setAlpha(p0.getAudioAttributesCompatParcelizer());
        }
        if ((iOnMediaButtonEvent & 8) != 0) {
            setTranslationX(p0.getRead());
        }
        if ((iOnMediaButtonEvent & 16) != 0) {
            setTranslationY(p0.getMediaBrowserCompatCustomActionResultReceiver());
        }
        if ((iOnMediaButtonEvent & 32) != 0) {
            setElevation(p0.getMediaBrowserCompatItemReceiver());
        }
        if ((iOnMediaButtonEvent & 1024) != 0) {
            setRotation(p0.getMediaMetadataCompat());
        }
        if ((iOnMediaButtonEvent & 256) != 0) {
            setRotationX(p0.getAudioAttributesImplApi21Parcelizer());
        }
        if ((iOnMediaButtonEvent & 512) != 0) {
            setRotationY(p0.getMediaBrowserCompatSearchResultReceiver());
        }
        if ((iOnMediaButtonEvent & 2048) != 0) {
            setCameraDistancePx(p0.getMediaBrowserCompatMediaItem());
        }
        boolean z = true;
        boolean z2 = MediaBrowserCompatItemReceiver() != null;
        boolean z3 = p0.getOnAddQueueItem() && p0.getMediaDescriptionCompat() != parseVersion.read();
        if ((iOnMediaButtonEvent & CpioConstants.C_ISBLK) != 0) {
            this.AudioAttributesImplBaseParcelizer = p0.getOnAddQueueItem() && p0.getMediaDescriptionCompat() == parseVersion.read();
            MediaBrowserCompatSearchResultReceiver();
            setClipToOutline(z3);
        }
        boolean z4 = this.write.read(p0.getOnPlayFromUri(), p0.getAudioAttributesCompatParcelizer(), z3, p0.getMediaBrowserCompatItemReceiver(), p0.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        if (this.write.getMediaBrowserCompatCustomActionResultReceiver()) {
            RatingCompat();
        }
        boolean z5 = MediaBrowserCompatItemReceiver() != null;
        if (z2 != z5 || (z5 && z4)) {
            invalidate();
        }
        if (!this.MediaDescriptionCompat && getElevation() > BitmapDescriptorFactory.HUE_RED && (getcreatedondatems = this.AudioAttributesCompatParcelizer) != null) {
            getcreatedondatems.invoke();
        }
        if ((iOnMediaButtonEvent & 7963) != 0) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
        if ((iOnMediaButtonEvent & 64) != 0) {
            CoercionAction.INSTANCE.write(this, RequestPayload.IconCompatParcelizer(p0.getAudioAttributesImplApi26Parcelizer()));
        }
        if ((iOnMediaButtonEvent & 128) != 0) {
            CoercionAction.INSTANCE.RemoteActionCompatParcelizer(this, RequestPayload.IconCompatParcelizer(p0.getAudioAttributesImplBaseParcelizer()));
        }
        if (Build.VERSION.SDK_INT >= 31 && (131072 & iOnMediaButtonEvent) != 0) {
            getAcceptBlankAsEmpty.INSTANCE.read(this, p0.getOnPlayFromMediaId());
        }
        boolean z6 = ((262144 & iOnMediaButtonEvent) == 0 && (524288 & iOnMediaButtonEvent) == 0) ? false : true;
        if ((iOnMediaButtonEvent & 32768) != 0 || z6) {
            if (z6) {
                iHandleMediaPlayPauseIfPendingOnHandler = Separators.INSTANCE.RemoteActionCompatParcelizer();
            } else {
                iHandleMediaPlayPauseIfPendingOnHandler = p0.getOnCommand();
            }
            Paint paintIconCompatParcelizer = null;
            if (Separators.RemoteActionCompatParcelizer(iHandleMediaPlayPauseIfPendingOnHandler, Separators.INSTANCE.RemoteActionCompatParcelizer())) {
                if (z6) {
                    releaseBuffers releasebuffersMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                    releasebuffersMediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(p0.getOnFastForward());
                    releasebuffersMediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(p0.getOnPlay());
                    paintIconCompatParcelizer = releasebuffersMediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer();
                }
                setLayerType(2, paintIconCompatParcelizer);
            } else if (Separators.RemoteActionCompatParcelizer(iHandleMediaPlayPauseIfPendingOnHandler, Separators.INSTANCE.IconCompatParcelizer())) {
                setLayerType(0, null);
                z = false;
            } else {
                setLayerType(0, null);
            }
            this.onAddQueueItem = z;
        }
        this.onCommand = p0.getRemoteActionCompatParcelizer();
    }

    private final releaseBuffers MediaBrowserCompatCustomActionResultReceiver() {
        releaseBuffers releasebuffers = this.AudioAttributesImplApi21Parcelizer;
        if (releasebuffers != null) {
            return releasebuffers;
        }
        releaseBuffers releasebuffersAudioAttributesCompatParcelizer = fromInitial.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer = releasebuffersAudioAttributesCompatParcelizer;
        return releasebuffersAudioAttributesCompatParcelizer;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.onAddQueueItem;
    }

    private final void RatingCompat() {
        setOutlineProvider(this.write.IconCompatParcelizer() != null ? IconCompatParcelizer : null);
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        Rect rect;
        if (this.AudioAttributesImplBaseParcelizer) {
            Rect rect2 = this.MediaBrowserCompatItemReceiver;
            if (rect2 == null) {
                this.MediaBrowserCompatItemReceiver = new Rect(0, 0, getWidth(), getHeight());
            } else {
                toMagicModuleMetaRepoModel.write(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.MediaBrowserCompatItemReceiver;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer(long p0) {
        int i = (int) (p0 >> 32);
        int i2 = (int) p0;
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(findCreatorAnnotation.read(this.RatingCompat) * i);
        setPivotY(findCreatorAnnotation.write(this.RatingCompat) * i2);
        RatingCompat();
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        MediaBrowserCompatSearchResultReceiver();
        this.MediaMetadataCompat.RemoteActionCompatParcelizer();
    }

    @Override // kotlin._reportUnkownFormat
    public final void write(long p0) {
        int iIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(p0);
        if (iIconCompatParcelizer != getLeft()) {
            offsetLeftAndRight(iIconCompatParcelizer - getLeft());
            this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
        int iAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(p0);
        if (iAudioAttributesCompatParcelizer != getTop()) {
            offsetTopAndBottom(iAudioAttributesCompatParcelizer - getTop());
            this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final void RemoteActionCompatParcelizer(JsonParserDelegate p0, hasAnyGetter p1) {
        boolean z = getElevation() > BitmapDescriptorFactory.HUE_RED;
        this.MediaDescriptionCompat = z;
        if (z) {
            p0.write();
        }
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0, this, getDrawingTime());
        if (this.MediaDescriptionCompat) {
            p0.RemoteActionCompatParcelizer();
        }
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas p0) {
        boolean z;
        createFlattened createflattened = this.MediaBrowserCompatMediaItem;
        Canvas canvas = createflattened.getIconCompatParcelizer().getRead();
        createflattened.getIconCompatParcelizer().write(p0);
        charBufferLength charbufferlength = createflattened.getIconCompatParcelizer();
        if (MediaBrowserCompatItemReceiver() == null && p0.isHardwareAccelerated()) {
            z = false;
        } else {
            charbufferlength.IconCompatParcelizer();
            this.write.IconCompatParcelizer(charbufferlength);
            z = true;
        }
        MagicModuleSubmissionRequestBody<? super JsonParserDelegate, ? super hasAnyGetter, getShowPopup> magicModuleSubmissionRequestBody = this.IconCompatParcelizer;
        if (magicModuleSubmissionRequestBody != null) {
            magicModuleSubmissionRequestBody.invoke(charbufferlength, null);
        }
        if (z) {
            charbufferlength.AudioAttributesCompatParcelizer();
        }
        createflattened.getIconCompatParcelizer().write(canvas);
        IconCompatParcelizer(false);
    }

    @Override // android.view.View, kotlin._reportUnkownFormat
    public final void invalidate() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return;
        }
        IconCompatParcelizer(true);
        super.invalidate();
        this.read.invalidate();
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer() {
        IconCompatParcelizer(false);
        this.read.ResultReceiver();
        this.IconCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
        this.read.IconCompatParcelizer(this);
        this.RemoteActionCompatParcelizer.removeViewInLayout(this);
    }

    @Override // kotlin._reportUnkownFormat
    public final void AudioAttributesCompatParcelizer() {
        if (!this.AudioAttributesImplApi26Parcelizer || MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        INSTANCE.RemoteActionCompatParcelizer(this);
        IconCompatParcelizer(false);
    }

    @Override // kotlin._reportUnkownFormat
    public final long IconCompatParcelizer(long p0, boolean p1) {
        if (p1) {
            return this.MediaMetadataCompat.write(this, p0);
        }
        return this.MediaMetadataCompat.AudioAttributesCompatParcelizer(this, p0);
    }

    @Override // kotlin._reportUnkownFormat
    public final void write(getType p0, boolean p1) {
        if (p1) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(this, p0);
        } else {
            this.MediaMetadataCompat.read(this, p0);
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super JsonParserDelegate, ? super hasAnyGetter, getShowPopup> p0, getCreatedOnDateMs<getShowPopup> p1) {
        this.RemoteActionCompatParcelizer.addView(this);
        this.MediaMetadataCompat.IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = false;
        this.MediaDescriptionCompat = false;
        this.RatingCompat = findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer = p0;
        this.AudioAttributesCompatParcelizer = p1;
        IconCompatParcelizer(false);
    }

    @Override // kotlin._reportUnkownFormat
    public final void RemoteActionCompatParcelizer(float[] p0) {
        resetWithShared.RemoteActionCompatParcelizer(p0, this.MediaMetadataCompat.read(this));
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer(float[] p0) {
        float[] fArrWrite = this.MediaMetadataCompat.write(this);
        if (fArrWrite != null) {
            resetWithShared.RemoteActionCompatParcelizer(p0, fArrWrite);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0011\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0007\u0010\u001aR*\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\r\u0010\u001a\"\u0004\b\r\u0010\u001c"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$write;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/view/View;)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "Lo/MagicModuleSubmissionRequestBody;", "Landroid/view/ViewOutlineProvider;", "IconCompatParcelizer", "Landroid/view/ViewOutlineProvider;", "Ljava/lang/reflect/Method;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/reflect/Method;", "write", "Ljava/lang/reflect/Field;", "AudioAttributesImplBaseParcelizer", "Ljava/lang/reflect/Field;", "read", "", "AudioAttributesCompatParcelizer", "Z", "()Z", "MediaBrowserCompatCustomActionResultReceiver", "(Z)V", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean RemoteActionCompatParcelizer() {
            return ViewLayer.AudioAttributesCompatParcelizer;
        }

        public final boolean IconCompatParcelizer() {
            return ViewLayer.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final void IconCompatParcelizer(boolean z) {
            ViewLayer.MediaBrowserCompatCustomActionResultReceiver = z;
        }

        public final void RemoteActionCompatParcelizer(View p0) {
            try {
                if (!RemoteActionCompatParcelizer()) {
                    ViewLayer.AudioAttributesCompatParcelizer = true;
                    ViewLayer.AudioAttributesImplApi21Parcelizer = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    ViewLayer.AudioAttributesImplBaseParcelizer = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = ViewLayer.AudioAttributesImplApi21Parcelizer;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.AudioAttributesImplBaseParcelizer;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.AudioAttributesImplBaseParcelizer;
                if (field2 != null) {
                    field2.setBoolean(p0, true);
                }
                Method method2 = ViewLayer.AudioAttributesImplApi21Parcelizer;
                if (method2 != null) {
                    method2.invoke(p0, new Object[0]);
                }
            } catch (Throwable unused) {
                IconCompatParcelizer(true);
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "p0", "Landroid/graphics/Matrix;", "p1", "", "write", "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<View, Matrix, getShowPopup> {
        public static final AnonymousClass5 write = new AnonymousClass5();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(View view, Matrix matrix) {
            write(view, matrix);
            return getShowPopup.INSTANCE;
        }

        public final void write(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        AnonymousClass5() {
            super(2);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$read;", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "p0", "Landroid/graphics/Outline;", "p1", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends ViewOutlineProvider {
        read() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View p0, Outline p1) {
            toMagicModuleMetaRepoModel.read(p0, "");
            Outline outlineIconCompatParcelizer = ((ViewLayer) p0).write.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.write(outlineIconCompatParcelizer);
            p1.set(outlineIconCompatParcelizer);
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final boolean RemoteActionCompatParcelizer(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        long j = -1;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & p0));
        if (this.AudioAttributesImplBaseParcelizer) {
            return BitmapDescriptorFactory.HUE_RED <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && BitmapDescriptorFactory.HUE_RED <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.write.IconCompatParcelizer(p0);
        }
        return true;
    }
}
