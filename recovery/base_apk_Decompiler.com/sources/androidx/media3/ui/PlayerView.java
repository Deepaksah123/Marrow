package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.JsonFormatVisitorWrapperBase;
import kotlin.JsonObjectFormatVisitor;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.PolymorphicTypeValidator;
import kotlin._isNaN;
import kotlin.buildTypeSerializer;
import kotlin.collectAndResolveSubtypesByTypeId;
import kotlin.deserializeTypedFromObject;
import kotlin.expectObjectFormat;
import kotlin.getSchema;
import kotlin.idFromValue;
import kotlin.initExtraTracks;
import kotlin.isUnsafeBaseType;
import kotlin.maximumCapacity;
import kotlin.validateSubClassName;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerView extends FrameLayout implements expectObjectFormat {
    public static final int ARTWORK_DISPLAY_MODE_FILL = 2;
    public static final int ARTWORK_DISPLAY_MODE_FIT = 1;
    public static final int ARTWORK_DISPLAY_MODE_OFF = 0;
    public static final int IMAGE_DISPLAY_MODE_FILL = 1;
    public static final int IMAGE_DISPLAY_MODE_FIT = 0;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final FrameLayout adOverlayFrameLayout;
    private int artworkDisplayMode;
    private final ImageView artworkView;
    private final View bufferingView;
    private final AudioAttributesCompatParcelizer componentListener;
    private final AspectRatioFrameLayout contentFrame;
    private final PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private write controllerVisibilityListener;
    private CharSequence customErrorMessage;
    private Drawable defaultArtwork;
    private JsonObjectFormatVisitor<? super validateSubClassName> errorMessageProvider;
    private final TextView errorMessageView;
    private final Class<?> exoPlayerClazz;
    private RemoteActionCompatParcelizer fullscreenButtonClickListener;
    private int imageDisplayMode;
    private final Object imageOutput;
    private final ImageView imageView;
    private boolean keepContentOnPlayerReset;
    private PlayerControlView.MediaBrowserCompatSearchResultReceiver legacyControllerVisibilityListener;
    private final Handler mainLooperHandler;
    private final FrameLayout overlayFrameLayout;
    private isUnsafeBaseType player;
    private final Method setImageOutputMethod;
    private int showBuffering;
    private final View shutterView;
    private final SubtitleView subtitleView;
    private final IconCompatParcelizer surfaceSyncGroupV34;
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useController;

    public interface RemoteActionCompatParcelizer {
    }

    public interface write {
    }

    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        boolean z6;
        AnonymousClass4 anonymousClass4;
        boolean z7;
        Class<?> cls;
        Object objNewProxyInstance;
        Method method;
        int i11;
        super(context, attributeSet, i);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        this.componentListener = audioAttributesCompatParcelizer;
        this.mainLooperHandler = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.surfaceSyncGroupV34 = null;
            this.imageView = null;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            this.exoPlayerClazz = null;
            this.setImageOutputMethod = null;
            this.imageOutput = null;
            ImageView imageView = new ImageView(context);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23) {
                configureEditModeLogoV23(context, getResources(), imageView);
            } else {
                configureEditModeLogo(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i12 = maximumCapacity.AudioAttributesImplApi21Parcelizer.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, maximumCapacity.MediaDescriptionCompat.PlayerView, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(maximumCapacity.MediaDescriptionCompat.PlayerView_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(maximumCapacity.MediaDescriptionCompat.PlayerView_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerView_player_layout_id, i12);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerView_use_artwork, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.PlayerView_artwork_display_mode, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(maximumCapacity.MediaDescriptionCompat.PlayerView_default_artwork, 0);
                int i14 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.PlayerView_image_display_mode, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerView_use_controller, true);
                int i15 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.PlayerView_surface_type, 1);
                int i16 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.PlayerView_resize_mode, 0);
                i2 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.PlayerView_show_timeout, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerView_hide_on_touch, true);
                z6 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(maximumCapacity.MediaDescriptionCompat.PlayerView_show_buffering, 0);
                this.keepContentOnPlayerReset = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerView_keep_content_on_player_reset, this.keepContentOnPlayerReset);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(maximumCapacity.MediaDescriptionCompat.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                i6 = resourceId2;
                z2 = z10;
                z5 = z11;
                z4 = z8;
                i3 = resourceId;
                z = z9;
                z3 = zHasValue;
                i7 = i15;
                i4 = i14;
                i10 = i13;
                i9 = color;
                i8 = i16;
                i5 = integer;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = i12;
            z = true;
            z2 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            z3 = false;
            i9 = 0;
            z4 = true;
            i10 = 1;
            z5 = true;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i8);
        }
        View viewFindViewById = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_shutter);
        this.shutterView = viewFindViewById;
        if (viewFindViewById != null && z3) {
            viewFindViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout != null && i7 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 == 2) {
                this.surfaceView = new TextureView(context);
            } else if (i7 == 3) {
                try {
                    this.surfaceView = (View) Class.forName("androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.surfaceView.setLayoutParams(layoutParams);
                    this.surfaceView.setOnClickListener(audioAttributesCompatParcelizer);
                    this.surfaceView.setClickable(false);
                    aspectRatioFrameLayout.addView(this.surfaceView, 0);
                    anonymousClass4 = null;
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i7 == 4) {
                try {
                    this.surfaceView = (View) Class.forName("androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else {
                SurfaceView surfaceView = new SurfaceView(context);
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 34) {
                    read.AudioAttributesCompatParcelizer(surfaceView);
                }
                this.surfaceView = surfaceView;
            }
            z7 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(audioAttributesCompatParcelizer);
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
            anonymousClass4 = null;
        } else {
            anonymousClass4 = null;
            this.surfaceView = null;
            z7 = false;
        }
        this.surfaceViewIgnoresVideoAspectRatio = z7;
        this.surfaceSyncGroupV34 = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 34 ? new IconCompatParcelizer() : null;
        this.adOverlayFrameLayout = (FrameLayout) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_ad_overlay);
        this.overlayFrameLayout = (FrameLayout) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_overlay);
        this.imageView = (ImageView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_image);
        this.imageDisplayMode = i4;
        try {
            cls = Class.forName("androidx.media3.exoplayer.ExoPlayer");
            Class<?> cls2 = Class.forName("androidx.media3.exoplayer.image.ImageOutput");
            method = cls.getMethod("setImageOutput", cls2);
            objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: o.PrivateMaxEntriesMapBuilder
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return this.write.m8lambda$new$0$androidxmedia3uiPlayerView(obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.exoPlayerClazz = cls;
        this.setImageOutputMethod = method;
        this.imageOutput = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_artwork);
        this.artworkView = imageView2;
        this.artworkDisplayMode = (!z4 || i10 == 0 || imageView2 == null) ? 0 : i10;
        if (i6 != 0) {
            this.defaultArtwork = _isNaN.getDrawable(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_subtitles);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_buffering);
        this.bufferingView = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.showBuffering = i5;
        TextView textView = (TextView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_controller);
        View viewFindViewById3 = findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_controller_placeholder);
        if (playerControlView != null) {
            this.controller = playerControlView;
            i11 = 0;
        } else if (viewFindViewById3 != null) {
            i11 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.controller = playerControlView2;
            playerControlView2.setId(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i11 = 0;
            this.controller = null;
        }
        PlayerControlView playerControlView3 = this.controller;
        this.controllerShowTimeoutMs = playerControlView3 == null ? i11 : i2;
        this.controllerHideOnTouch = z2;
        this.controllerAutoShow = z6;
        this.controllerHideDuringAds = z5;
        this.useController = (!z || playerControlView3 == null) ? i11 : 1;
        if (playerControlView3 != null) {
            playerControlView3.write();
            this.controller.write(this.componentListener);
        }
        if (z) {
            setClickable(true);
        }
        updateContentDescription();
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-ui-PlayerView, reason: not valid java name */
    public /* synthetic */ Object m8lambda$new$0$androidxmedia3uiPlayerView(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        onImageAvailable((Bitmap) objArr[1]);
        return null;
    }

    public static void switchTargetView(isUnsafeBaseType isunsafebasetype, PlayerView playerView, PlayerView playerView2) {
        if (playerView != playerView2) {
            if (playerView2 != null) {
                playerView2.setPlayer(isunsafebasetype);
            }
            if (playerView != null) {
                playerView.setPlayer(null);
            }
        }
    }

    public isUnsafeBaseType getPlayer() {
        return this.player;
    }

    public void setPlayer(isUnsafeBaseType isunsafebasetype) {
        buildTypeSerializer.write(Looper.myLooper() == Looper.getMainLooper());
        buildTypeSerializer.IconCompatParcelizer(isunsafebasetype == null || isunsafebasetype.onCommand() == Looper.getMainLooper());
        isUnsafeBaseType isunsafebasetype2 = this.player;
        if (isunsafebasetype2 == isunsafebasetype) {
            return;
        }
        if (isunsafebasetype2 != null) {
            isunsafebasetype2.write(this.componentListener);
            if (isunsafebasetype2.write(27)) {
                View view = this.surfaceView;
                if (view instanceof TextureView) {
                    isunsafebasetype2.write((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    isunsafebasetype2.read((SurfaceView) view);
                }
            }
            clearImageOutput(isunsafebasetype2);
        }
        SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = isunsafebasetype;
        if (useController()) {
            this.controller.setPlayer(isunsafebasetype);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (isunsafebasetype != null) {
            if (isunsafebasetype.write(27)) {
                View view2 = this.surfaceView;
                if (view2 instanceof TextureView) {
                    isunsafebasetype.IconCompatParcelizer((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    isunsafebasetype.AudioAttributesCompatParcelizer((SurfaceView) view2);
                }
                if (!isunsafebasetype.write(30) || isunsafebasetype.onPrepareFromSearch().RemoteActionCompatParcelizer()) {
                    updateAspectRatio();
                }
            }
            if (this.subtitleView != null && isunsafebasetype.write(28)) {
                this.subtitleView.setCues(isunsafebasetype.onPlayFromMediaId().write);
            }
            isunsafebasetype.read(this.componentListener);
            setImageOutput(isunsafebasetype);
            maybeShowController(false);
            return;
        }
        hideController();
    }

    private void setImageOutput(isUnsafeBaseType isunsafebasetype) {
        Class<?> cls = this.exoPlayerClazz;
        if (cls == null || !cls.isAssignableFrom(isunsafebasetype.getClass())) {
            return;
        }
        try {
            ((Method) buildTypeSerializer.IconCompatParcelizer(this.setImageOutputMethod)).invoke(isunsafebasetype, buildTypeSerializer.IconCompatParcelizer(this.imageOutput));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private void clearImageOutput(isUnsafeBaseType isunsafebasetype) {
        Class<?> cls = this.exoPlayerClazz;
        if (cls == null || !cls.isAssignableFrom(isunsafebasetype.getClass())) {
            return;
        }
        try {
            ((Method) buildTypeSerializer.IconCompatParcelizer(this.setImageOutputMethod)).invoke(isunsafebasetype, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setResizeMode(int i) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public int getResizeMode() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.contentFrame);
        return this.contentFrame.AudioAttributesCompatParcelizer();
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.artworkDisplayMode != 0;
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setArtworkDisplayMode(int i) {
        buildTypeSerializer.write(i == 0 || this.artworkView != null);
        if (this.artworkDisplayMode != i) {
            this.artworkDisplayMode = i;
            updateForCurrentTrackSelections(false);
        }
    }

    public int getArtworkDisplayMode() {
        return this.artworkDisplayMode;
    }

    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setImageDisplayMode(int i) {
        buildTypeSerializer.write(this.imageView != null);
        if (this.imageDisplayMode != i) {
            this.imageDisplayMode = i;
            updateImageViewAspectRatio();
        }
    }

    public int getImageDisplayMode() {
        return this.imageDisplayMode;
    }

    public boolean getUseController() {
        return this.useController;
    }

    public void setUseController(boolean z) {
        buildTypeSerializer.write((z && this.controller == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.useController == z) {
            return;
        }
        this.useController = z;
        if (useController()) {
            this.controller.setPlayer(this.player);
        } else {
            PlayerControlView playerControlView = this.controller;
            if (playerControlView != null) {
                playerControlView.RemoteActionCompatParcelizer();
                this.controller.setPlayer(null);
            }
        }
        updateContentDescription();
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setErrorMessageProvider(JsonObjectFormatVisitor<? super validateSubClassName> jsonObjectFormatVisitor) {
        if (this.errorMessageProvider != jsonObjectFormatVisitor) {
            this.errorMessageProvider = jsonObjectFormatVisitor;
            updateErrorMessage();
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        buildTypeSerializer.write(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        isUnsafeBaseType isunsafebasetype = this.player;
        if (isunsafebasetype != null && isunsafebasetype.write(16) && this.player.setSessionImpl()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zIsDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (zIsDpadKey && useController() && !this.controller.IconCompatParcelizer()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (!zIsDpadKey || !useController()) {
            return false;
        }
        maybeShowController(true);
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.read(keyEvent);
    }

    public boolean isControllerFullyVisible() {
        PlayerControlView playerControlView = this.controller;
        return playerControlView != null && playerControlView.IconCompatParcelizer();
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public void hideController() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            playerControlView.RemoteActionCompatParcelizer();
        }
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public void setControllerShowTimeoutMs(int i) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.IconCompatParcelizer()) {
            showController();
        }
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public void setControllerHideOnTouch(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerVisibilityListener(write writeVar) {
        this.controllerVisibilityListener = writeVar;
        if (writeVar != null) {
            setControllerVisibilityListener((PlayerControlView.MediaBrowserCompatSearchResultReceiver) null);
        }
    }

    public void setControllerAnimationEnabled(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setAnimationEnabled(z);
    }

    @Deprecated
    public void setControllerVisibilityListener(PlayerControlView.MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        PlayerControlView.MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver2 = this.legacyControllerVisibilityListener;
        if (mediaBrowserCompatSearchResultReceiver2 != mediaBrowserCompatSearchResultReceiver) {
            if (mediaBrowserCompatSearchResultReceiver2 != null) {
                this.controller.RemoteActionCompatParcelizer(mediaBrowserCompatSearchResultReceiver2);
            }
            this.legacyControllerVisibilityListener = mediaBrowserCompatSearchResultReceiver;
            if (mediaBrowserCompatSearchResultReceiver != null) {
                this.controller.write(mediaBrowserCompatSearchResultReceiver);
                setControllerVisibilityListener((write) null);
            }
        }
    }

    public void setFullscreenButtonClickListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.fullscreenButtonClickListener = remoteActionCompatParcelizer;
        this.controller.setOnFullScreenModeChangedListener(this.componentListener);
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.fullscreenButtonClickListener = null;
        this.controller.setOnFullScreenModeChangedListener(audioAttributesCompatParcelizer);
    }

    public void setShowRewindButton(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowRewindButton(z);
    }

    public void setShowFastForwardButton(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowFastForwardButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowPreviousButton(z);
    }

    public void setShowNextButton(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowNextButton(z);
    }

    public void setRepeatToggleModes(int i) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    public void setShowShuffleButton(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowVrButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowMultiWindowTimeBar(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        this.controller.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.IconCompatParcelizer iconCompatParcelizer) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.contentFrame);
        this.contentFrame.setAspectRatioListener(iconCompatParcelizer);
    }

    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    protected void onContentAspectRatioChanged(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) buildTypeSerializer.read(this.adOverlayFrameLayout, "exo_ad_overlay must be present for ad playback");
    }

    public List<JsonFormatVisitorWrapperBase> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        if (this.overlayFrameLayout != null) {
            arrayList.add(new JsonFormatVisitorWrapperBase.AudioAttributesCompatParcelizer(this.overlayFrameLayout, 4).AudioAttributesCompatParcelizer("Transparent overlay does not impact viewability").RemoteActionCompatParcelizer());
        }
        if (this.controller != null) {
            arrayList.add(new JsonFormatVisitorWrapperBase.AudioAttributesCompatParcelizer(this.controller, 1).RemoteActionCompatParcelizer());
        }
        return initExtraTracks.write(arrayList);
    }

    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.controller);
        return true;
    }

    private boolean useArtwork() {
        if (this.artworkDisplayMode == 0) {
            return false;
        }
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.artworkView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleControllerVisibility() {
        if (!useController() || this.player == null) {
            return;
        }
        if (!this.controller.IconCompatParcelizer()) {
            maybeShowController(true);
        } else if (this.controllerHideOnTouch) {
            this.controller.RemoteActionCompatParcelizer();
        }
    }

    private void maybeShowController(boolean z) {
        if (!(isPlayingAd() && this.controllerHideDuringAds) && useController()) {
            boolean z2 = this.controller.IconCompatParcelizer() && this.controller.AudioAttributesCompatParcelizer() <= 0;
            boolean zShouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z || z2 || zShouldShowControllerIndefinitely) {
                showController(zShouldShowControllerIndefinitely);
            }
        }
    }

    private boolean shouldShowControllerIndefinitely() {
        isUnsafeBaseType isunsafebasetype = this.player;
        if (isunsafebasetype == null) {
            return true;
        }
        int iOnRewind = isunsafebasetype.onRewind();
        if (!this.controllerAutoShow) {
            return false;
        }
        if (this.player.write(17) && this.player.onPrepare().RemoteActionCompatParcelizer()) {
            return false;
        }
        return iOnRewind == 1 || iOnRewind == 4 || !((isUnsafeBaseType) buildTypeSerializer.IconCompatParcelizer(this.player)).onPrepareFromUri();
    }

    private void showController(boolean z) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z ? 0 : this.controllerShowTimeoutMs);
            this.controller.AudioAttributesImplApi26Parcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        isUnsafeBaseType isunsafebasetype = this.player;
        return isunsafebasetype != null && isunsafebasetype.write(16) && this.player.setSessionImpl() && this.player.onPrepareFromUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z) {
        isUnsafeBaseType isunsafebasetype = this.player;
        boolean z2 = (isunsafebasetype == null || !isunsafebasetype.write(30) || isunsafebasetype.onPrepareFromSearch().write()) ? false : true;
        if (!this.keepContentOnPlayerReset && (!z2 || z)) {
            hideArtwork();
            closeShutter();
            hideAndClearImage();
        }
        if (z2) {
            boolean zHasSelectedVideoTrack = hasSelectedVideoTrack();
            boolean zHasSelectedImageTrack = hasSelectedImageTrack();
            if (!zHasSelectedVideoTrack && !zHasSelectedImageTrack) {
                closeShutter();
                hideAndClearImage();
            }
            View view = this.shutterView;
            boolean z3 = view != null && view.getVisibility() == 4 && isImageSet();
            if (zHasSelectedImageTrack && !zHasSelectedVideoTrack && z3) {
                closeShutter();
                showImage();
            } else if (zHasSelectedVideoTrack && !zHasSelectedImageTrack && z3) {
                hideAndClearImage();
            }
            if (zHasSelectedVideoTrack || zHasSelectedImageTrack || !useArtwork() || !(setArtworkFromMediaMetadata(isunsafebasetype) || setDrawableArtwork(this.defaultArtwork))) {
                hideArtwork();
            }
        }
    }

    private boolean setArtworkFromMediaMetadata(isUnsafeBaseType isunsafebasetype) {
        if (isunsafebasetype == null || !isunsafebasetype.write(18)) {
            return false;
        }
        getSchema getschemaOnRemoveQueueItem = isunsafebasetype.onRemoveQueueItem();
        if (getschemaOnRemoveQueueItem.read == null) {
            return false;
        }
        return setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(getschemaOnRemoveQueueItem.read, 0, getschemaOnRemoveQueueItem.read.length)));
    }

    private boolean setDrawableArtwork(Drawable drawable) {
        if (this.artworkView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.artworkDisplayMode == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                onContentAspectRatioChanged(this.contentFrame, width);
                this.artworkView.setScaleType(scaleType);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSelectedImageTrack() {
        isUnsafeBaseType isunsafebasetype = this.player;
        return isunsafebasetype != null && this.imageOutput != null && isunsafebasetype.write(30) && isunsafebasetype.onPrepareFromSearch().IconCompatParcelizer(4);
    }

    private boolean hasSelectedVideoTrack() {
        isUnsafeBaseType isunsafebasetype = this.player;
        return isunsafebasetype != null && isunsafebasetype.write(30) && isunsafebasetype.onPrepareFromSearch().IconCompatParcelizer(2);
    }

    private boolean isImageSet() {
        Drawable drawable;
        ImageView imageView = this.imageView;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        updateImageViewAspectRatio();
    }

    private void updateImageViewAspectRatio() {
        Drawable drawable;
        ImageView imageView = this.imageView;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.imageDisplayMode == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.imageView.getVisibility() == 0) {
            onContentAspectRatioChanged(this.contentFrame, width);
        }
        this.imageView.setScaleType(scaleType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAndClearImage() {
        hideImage();
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void showImage() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
            updateImageViewAspectRatio();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideImage() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private void onImageAvailable(final Bitmap bitmap) {
        this.mainLooperHandler.post(new Runnable() { // from class: o.PrivateMaxEntriesMapAddTask
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.m9lambda$onImageAvailable$1$androidxmedia3uiPlayerView(bitmap);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onImageAvailable$1$androidx-media3-ui-PlayerView, reason: not valid java name */
    public /* synthetic */ void m9lambda$onImageAvailable$1$androidxmedia3uiPlayerView(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        if (hasSelectedVideoTrack()) {
            return;
        }
        showImage();
        closeShutter();
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateBuffering() {
        /*
            r4 = this;
            android.view.View r0 = r4.bufferingView
            if (r0 == 0) goto L2b
            o.isUnsafeBaseType r0 = r4.player
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.onRewind()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.showBuffering
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            o.isUnsafeBaseType r0 = r4.player
            boolean r0 = r0.onPrepareFromUri()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r4 = r4.bufferingView
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r4.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.updateBuffering():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        JsonObjectFormatVisitor<? super validateSubClassName> jsonObjectFormatVisitor;
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
                return;
            }
            isUnsafeBaseType isunsafebasetype = this.player;
            if ((isunsafebasetype != null ? isunsafebasetype.getPlayerError() : null) != null && (jsonObjectFormatVisitor = this.errorMessageProvider) != null) {
                this.errorMessageView.setText((CharSequence) jsonObjectFormatVisitor.RemoteActionCompatParcelizer().second);
                this.errorMessageView.setVisibility(0);
            } else {
                this.errorMessageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView == null || !this.useController) {
            setContentDescription(null);
        } else if (playerControlView.IconCompatParcelizer()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(maximumCapacity.MediaBrowserCompatCustomActionResultReceiver.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAspectRatio() {
        isUnsafeBaseType isunsafebasetype = this.player;
        deserializeTypedFromObject deserializetypedfromobjectOnSkipToPrevious = isunsafebasetype != null ? isunsafebasetype.onSkipToPrevious() : deserializeTypedFromObject.read;
        int i = deserializetypedfromobjectOnSkipToPrevious.write;
        int i2 = deserializetypedfromobjectOnSkipToPrevious.AudioAttributesCompatParcelizer;
        int i3 = deserializetypedfromobjectOnSkipToPrevious.RemoteActionCompatParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = (i2 == 0 || i == 0) ? 0.0f : (i * deserializetypedfromobjectOnSkipToPrevious.IconCompatParcelizer) / i2;
        View view = this.surfaceView;
        if (view instanceof TextureView) {
            if (f2 > BitmapDescriptorFactory.HUE_RED && (i3 == 90 || i3 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.textureViewRotation != 0) {
                view.removeOnLayoutChangeListener(this.componentListener);
            }
            this.textureViewRotation = i3;
            if (i3 != 0) {
                this.surfaceView.addOnLayoutChangeListener(this.componentListener);
            }
            applyTextureViewRotation((TextureView) this.surfaceView, this.textureViewRotation);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.contentFrame;
        if (!this.surfaceViewIgnoresVideoAspectRatio) {
            f = f2;
        }
        onContentAspectRatioChanged(aspectRatioFrameLayout, f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        IconCompatParcelizer iconCompatParcelizer;
        super.dispatchDraw(canvas);
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver != 34 || (iconCompatParcelizer = this.surfaceSyncGroupV34) == null) {
            return;
        }
        iconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private static void configureEditModeLogoV23(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(maximumCapacity.read.exo_edit_mode_background_color, null));
    }

    private static void configureEditModeLogo(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(LaissezFaireSubTypeValidator.read(context, resources, maximumCapacity.write.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(maximumCapacity.read.exo_edit_mode_background_color));
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyTextureViewRotation(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != BitmapDescriptorFactory.HUE_RED && height != BitmapDescriptorFactory.HUE_RED && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    public final class AudioAttributesCompatParcelizer implements isUnsafeBaseType.AudioAttributesCompatParcelizer, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.MediaBrowserCompatSearchResultReceiver, PlayerControlView.AudioAttributesCompatParcelizer {
        private Object RemoteActionCompatParcelizer;
        private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer write = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();

        public AudioAttributesCompatParcelizer() {
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void write(idFromValue idfromvalue) {
            if (PlayerView.this.subtitleView != null) {
                PlayerView.this.subtitleView.setCues(idfromvalue.write);
            }
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject) {
            if (deserializetypedfromobject.equals(deserializeTypedFromObject.read) || PlayerView.this.player == null || PlayerView.this.player.onRewind() == 1) {
                return;
            }
            PlayerView.this.updateAspectRatio();
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i, int i2) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 34 && (PlayerView.this.surfaceView instanceof SurfaceView)) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(PlayerView.this.surfaceSyncGroupV34);
                Handler handler = PlayerView.this.mainLooperHandler;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.surfaceView;
                final PlayerView playerView = PlayerView.this;
                iconCompatParcelizer.write(handler, surfaceView, new Runnable() { // from class: o.PrivateMaxEntriesMapDrainStatus
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            if (PlayerView.this.shutterView != null) {
                PlayerView.this.shutterView.setVisibility(4);
                if (PlayerView.this.hasSelectedImageTrack()) {
                    PlayerView.this.hideImage();
                } else {
                    PlayerView.this.hideAndClearImage();
                }
            }
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(collectAndResolveSubtypesByTypeId collectandresolvesubtypesbytypeid) {
            PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare;
            isUnsafeBaseType isunsafebasetype = (isUnsafeBaseType) buildTypeSerializer.IconCompatParcelizer(PlayerView.this.player);
            if (isunsafebasetype.write(17)) {
                polymorphicTypeValidatorOnPrepare = isunsafebasetype.onPrepare();
            } else {
                polymorphicTypeValidatorOnPrepare = PolymorphicTypeValidator.RemoteActionCompatParcelizer;
            }
            if (!polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer()) {
                if (isunsafebasetype.write(30) && !isunsafebasetype.onPrepareFromSearch().write()) {
                    this.RemoteActionCompatParcelizer = polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(isunsafebasetype.onFastForward(), this.write, true).write;
                } else {
                    Object obj = this.RemoteActionCompatParcelizer;
                    if (obj != null) {
                        int i = polymorphicTypeValidatorOnPrepare.read(obj);
                        if (i != -1) {
                            if (isunsafebasetype.onMediaButtonEvent() == polymorphicTypeValidatorOnPrepare.AudioAttributesCompatParcelizer(i, this.write).AudioAttributesImplBaseParcelizer) {
                                return;
                            }
                        }
                        this.RemoteActionCompatParcelizer = null;
                    }
                }
            } else {
                this.RemoteActionCompatParcelizer = null;
            }
            PlayerView.this.updateForCurrentTrackSelections(false);
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            PlayerView.this.updateBuffering();
            PlayerView.this.updateErrorMessage();
            PlayerView.this.updateControllerVisibility();
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(boolean z, int i) {
            PlayerView.this.updateBuffering();
            PlayerView.this.updateControllerVisibility();
        }

        @Override // o.isUnsafeBaseType.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer(isUnsafeBaseType.write writeVar, isUnsafeBaseType.write writeVar2, int i) {
            if (PlayerView.this.isPlayingAd() && PlayerView.this.controllerHideDuringAds) {
                PlayerView.this.hideController();
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.applyTextureViewRotation((TextureView) view, PlayerView.this.textureViewRotation);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerView.this.toggleControllerVisibility();
        }

        @Override // androidx.media3.ui.PlayerControlView.MediaBrowserCompatSearchResultReceiver
        public final void RemoteActionCompatParcelizer() {
            PlayerView.this.updateContentDescription();
            if (PlayerView.this.controllerVisibilityListener != null) {
                write unused = PlayerView.this.controllerVisibilityListener;
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.AudioAttributesCompatParcelizer
        public final void read() {
            if (PlayerView.this.fullscreenButtonClickListener != null) {
                RemoteActionCompatParcelizer unused = PlayerView.this.fullscreenButtonClickListener;
            }
        }
    }

    static class read {
        public static void AudioAttributesCompatParcelizer(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    public static final class IconCompatParcelizer {
        SurfaceSyncGroup write;

        public static /* synthetic */ void IconCompatParcelizer() {
        }

        private IconCompatParcelizer() {
        }

        public final void write(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: o.shouldDrainBuffers
                @Override // java.lang.Runnable
                public final void run() {
                    this.IconCompatParcelizer.IconCompatParcelizer(surfaceView, runnable);
                }
            });
        }

        public final /* synthetic */ void IconCompatParcelizer(SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            this.write = surfaceSyncGroup;
            buildTypeSerializer.write(surfaceSyncGroup.add(rootSurfaceControl, new Runnable() { // from class: o.PrivateMaxEntriesMapDrainStatus1
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.IconCompatParcelizer.IconCompatParcelizer();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }

        public final void RemoteActionCompatParcelizer() {
            SurfaceSyncGroup surfaceSyncGroup = this.write;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.write = null;
            }
        }
    }
}
