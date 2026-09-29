###### Class androidx.media3.ui.PlayerView (androidx.media3.ui.PlayerView)
.class public Landroidx/media3/ui/PlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lo/expectObjectFormat;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/ui/PlayerView$read;,
        Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;,
        Landroidx/media3/ui/PlayerView$write;,
        Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;,
        Landroidx/media3/ui/PlayerView$IconCompatParcelizer;
    }
.end annotation


# static fields
.field public static final ARTWORK_DISPLAY_MODE_FILL:I = 0x2

.field public static final ARTWORK_DISPLAY_MODE_FIT:I = 0x1

.field public static final ARTWORK_DISPLAY_MODE_OFF:I = 0x0

.field public static final IMAGE_DISPLAY_MODE_FILL:I = 0x1

.field public static final IMAGE_DISPLAY_MODE_FIT:I = 0x0

.field public static final SHOW_BUFFERING_ALWAYS:I = 0x2

.field public static final SHOW_BUFFERING_NEVER:I = 0x0

.field public static final SHOW_BUFFERING_WHEN_PLAYING:I = 0x1

.field private static final SURFACE_TYPE_NONE:I = 0x0

.field private static final SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW:I = 0x3

.field private static final SURFACE_TYPE_SURFACE_VIEW:I = 0x1

.field private static final SURFACE_TYPE_TEXTURE_VIEW:I = 0x2

.field private static final SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW:I = 0x4


# instance fields
.field private final adOverlayFrameLayout:Landroid/widget/FrameLayout;

.field private artworkDisplayMode:I

.field private final artworkView:Landroid/widget/ImageView;

.field private final bufferingView:Landroid/view/View;

.field private final componentListener:Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

.field private final contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

.field private final controller:Landroidx/media3/ui/PlayerControlView;

.field private controllerAutoShow:Z

.field private controllerHideDuringAds:Z

.field private controllerHideOnTouch:Z

.field private controllerShowTimeoutMs:I

.field private controllerVisibilityListener:Landroidx/media3/ui/PlayerView$write;

.field private customErrorMessage:Ljava/lang/CharSequence;

.field private defaultArtwork:Landroid/graphics/drawable/Drawable;

.field private errorMessageProvider:Lo/JsonObjectFormatVisitor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/JsonObjectFormatVisitor<",
            "-",
            "Lo/validateSubClassName;",
            ">;"
        }
    .end annotation
.end field

.field private final errorMessageView:Landroid/widget/TextView;

.field private final exoPlayerClazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private fullscreenButtonClickListener:Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;

.field private imageDisplayMode:I

.field private final imageOutput:Ljava/lang/Object;

.field private final imageView:Landroid/widget/ImageView;

.field private keepContentOnPlayerReset:Z

.field private legacyControllerVisibilityListener:Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;

.field private final mainLooperHandler:Landroid/os/Handler;

.field private final overlayFrameLayout:Landroid/widget/FrameLayout;

.field private player:Lo/isUnsafeBaseType;

.field private final setImageOutputMethod:Ljava/lang/reflect/Method;

.field private showBuffering:I

.field private final shutterView:Landroid/view/View;

.field private final subtitleView:Landroidx/media3/ui/SubtitleView;

.field private final surfaceSyncGroupV34:Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

.field private final surfaceView:Landroid/view/View;

.field private final surfaceViewIgnoresVideoAspectRatio:Z

.field private textureViewRotation:I

.field private useController:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 341
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/PlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 345
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/ui/PlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 351
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 353
    new-instance v3, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

    invoke-direct {v3, v0}, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/ui/PlayerView;)V

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->componentListener:Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

    .line 354
    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v4, v0, Landroidx/media3/ui/PlayerView;->mainLooperHandler:Landroid/os/Handler;

    .line 356
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v4, :cond_61

    .line 357
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 358
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->shutterView:Landroid/view/View;

    .line 359
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    .line 360
    iput-boolean v5, v0, Landroidx/media3/ui/PlayerView;->surfaceViewIgnoresVideoAspectRatio:Z

    .line 361
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->surfaceSyncGroupV34:Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    .line 362
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    .line 363
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    .line 364
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->subtitleView:Landroidx/media3/ui/SubtitleView;

    .line 365
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->bufferingView:Landroid/view/View;

    .line 366
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->errorMessageView:Landroid/widget/TextView;

    .line 367
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    .line 368
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->adOverlayFrameLayout:Landroid/widget/FrameLayout;

    .line 369
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->overlayFrameLayout:Landroid/widget/FrameLayout;

    .line 370
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->exoPlayerClazz:Ljava/lang/Class;

    .line 371
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->setImageOutputMethod:Ljava/lang/reflect/Method;

    .line 372
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->imageOutput:Ljava/lang/Object;

    .line 373
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 374
    sget v3, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_56

    .line 375
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v1, v3, v2}, Landroidx/media3/ui/PlayerView;->configureEditModeLogoV23(Landroid/content/Context;Landroid/content/res/Resources;Landroid/widget/ImageView;)V

    goto :goto_5d

    .line 377
    :cond_56
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v1, v3, v2}, Landroidx/media3/ui/PlayerView;->configureEditModeLogo(Landroid/content/Context;Landroid/content/res/Resources;Landroid/widget/ImageView;)V

    .line 379
    :goto_5d
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 385
    :cond_61
    sget v4, Lo/maximumCapacity$AudioAttributesImplApi21Parcelizer;->exo_player_view:I

    const/4 v8, 0x1

    if-eqz v2, :cond_100

    .line 401
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    sget-object v10, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView:[I

    move/from16 v11, p3

    .line 402
    invoke-virtual {v9, v2, v10, v11, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v9

    .line 405
    :try_start_72
    sget v10, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_shutter_background_color:I

    invoke-virtual {v9, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v10

    .line 406
    sget v11, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_shutter_background_color:I

    invoke-virtual {v9, v11, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v11

    .line 407
    sget v12, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_player_layout_id:I

    invoke-virtual {v9, v12, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 408
    sget v12, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_use_artwork:I

    invoke-virtual {v9, v12, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    .line 409
    sget v13, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_artwork_display_mode:I

    .line 410
    invoke-virtual {v9, v13, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v13

    .line 411
    sget v14, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_default_artwork:I

    .line 412
    invoke-virtual {v9, v14, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    .line 413
    sget v15, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_image_display_mode:I

    invoke-virtual {v9, v15, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v15

    .line 414
    sget v6, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_use_controller:I

    invoke-virtual {v9, v6, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    .line 415
    sget v7, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_surface_type:I

    invoke-virtual {v9, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    .line 416
    sget v8, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_resize_mode:I

    invoke-virtual {v9, v8, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    .line 417
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_show_timeout:I

    move/from16 p3, v4

    const/16 v4, 0x1388

    .line 418
    invoke-virtual {v9, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    .line 419
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_hide_on_touch:I

    move/from16 v16, v4

    const/4 v4, 0x1

    .line 420
    invoke-virtual {v9, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    move/from16 v18, v5

    .line 421
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_auto_show:I

    invoke-virtual {v9, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    .line 422
    sget v4, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_show_buffering:I

    move/from16 v19, v5

    const/4 v5, 0x0

    invoke-virtual {v9, v4, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    .line 423
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_keep_content_on_player_reset:I

    move/from16 v20, v4

    iget-boolean v4, v0, Landroidx/media3/ui/PlayerView;->keepContentOnPlayerReset:Z

    .line 424
    invoke-virtual {v9, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v0, Landroidx/media3/ui/PlayerView;->keepContentOnPlayerReset:Z

    .line 426
    sget v4, Lo/maximumCapacity$MediaDescriptionCompat;->PlayerView_hide_during_ads:I

    const/4 v5, 0x1

    .line 427
    invoke-virtual {v9, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4
    :try_end_e5
    .catchall {:try_start_72 .. :try_end_e5} :catchall_fb

    .line 429
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    move v9, v14

    move/from16 v5, v18

    move/from16 v18, v4

    move v14, v12

    move/from16 v4, p3

    move/from16 p3, v6

    move v12, v10

    move v10, v7

    move v7, v15

    move v15, v13

    move v13, v11

    move v11, v8

    move/from16 v8, v20

    goto :goto_116

    :catchall_fb
    move-exception v0

    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 430
    throw v0

    :cond_100
    move v5, v4

    const/16 v4, 0x1388

    move/from16 v16, v4

    move v4, v5

    const/16 p3, 0x1

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/16 v18, 0x1

    const/16 v19, 0x1

    .line 433
    :goto_116
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    invoke-virtual {v6, v4, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v4, 0x40000

    .line 434
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 437
    sget v4, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_content_frame:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/media3/ui/AspectRatioFrameLayout;

    iput-object v4, v0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    if-eqz v4, :cond_131

    .line 439
    invoke-static {v4, v11}, Landroidx/media3/ui/PlayerView;->setResizeModeRaw(Landroidx/media3/ui/AspectRatioFrameLayout;I)V

    .line 443
    :cond_131
    sget v6, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_shutter:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->shutterView:Landroid/view/View;

    if-eqz v6, :cond_140

    if-eqz v12, :cond_140

    .line 445
    invoke-virtual {v6, v13}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_140
    const/16 v6, 0x22

    if-eqz v4, :cond_1d6

    if-eqz v10, :cond_1d6

    .line 451
    new-instance v11, Landroid/view/ViewGroup$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v11, v12, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    const/4 v12, 0x2

    if-eq v10, v12, :cond_1b7

    const/4 v12, 0x3

    if-eq v10, v12, :cond_18d

    const/4 v12, 0x4

    if-eq v10, v12, :cond_164

    .line 480
    new-instance v10, Landroid/view/SurfaceView;

    invoke-direct {v10, v1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 481
    sget v12, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    if-lt v12, v6, :cond_161

    .line 482
    invoke-static {v10}, Landroidx/media3/ui/PlayerView$read;->AudioAttributesCompatParcelizer(Landroid/view/SurfaceView;)V

    .line 484
    :cond_161
    iput-object v10, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    goto :goto_1be

    .line 472
    :cond_164
    :try_start_164
    const-string v10, "androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView"

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/4 v12, 0x1

    .line 473
    new-array v13, v12, [Ljava/lang/Class;

    const-class v12, Landroid/content/Context;

    const/16 v17, 0x0

    aput-object v12, v13, v17

    invoke-virtual {v10, v13}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    filled-new-array/range {p1 .. p1}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    iput-object v10, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;
    :try_end_183
    .catch Ljava/lang/Exception; {:try_start_164 .. :try_end_183} :catch_184

    goto :goto_1be

    :catch_184
    move-exception v0

    .line 475
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "video_decoder_gl_surface_view requires an ExoPlayer dependency"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 461
    :cond_18d
    :try_start_18d
    const-string v10, "androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView"

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/4 v12, 0x1

    .line 462
    new-array v13, v12, [Ljava/lang/Class;

    const-class v12, Landroid/content/Context;

    const/16 v17, 0x0

    aput-object v12, v13, v17

    invoke-virtual {v10, v13}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    filled-new-array/range {p1 .. p1}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    iput-object v10, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;
    :try_end_1ac
    .catch Ljava/lang/Exception; {:try_start_18d .. :try_end_1ac} :catch_1ae

    const/4 v10, 0x1

    goto :goto_1bf

    :catch_1ae
    move-exception v0

    .line 464
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "spherical_gl_surface_view requires an ExoPlayer dependency"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 456
    :cond_1b7
    new-instance v10, Landroid/view/TextureView;

    invoke-direct {v10, v1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v10, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    :goto_1be
    const/4 v10, 0x0

    .line 487
    :goto_1bf
    iget-object v12, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    invoke-virtual {v12, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 491
    iget-object v11, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    invoke-virtual {v11, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 492
    iget-object v3, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    const/4 v11, 0x0

    invoke-virtual {v3, v11}, Landroid/view/View;->setClickable(Z)V

    .line 493
    iget-object v3, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    invoke-virtual {v4, v3, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    const/4 v3, 0x0

    goto :goto_1da

    :cond_1d6
    const/4 v3, 0x0

    .line 495
    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    const/4 v10, 0x0

    .line 497
    :goto_1da
    iput-boolean v10, v0, Landroidx/media3/ui/PlayerView;->surfaceViewIgnoresVideoAspectRatio:Z

    .line 498
    sget v4, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v4, v6, :cond_1e7

    new-instance v4, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    invoke-direct {v4, v3}, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;-><init>(Landroidx/media3/ui/PlayerView$4;)V

    move-object v3, v4

    goto :goto_1e8

    :cond_1e7
    const/4 v3, 0x0

    :goto_1e8
    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->surfaceSyncGroupV34:Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    .line 501
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_ad_overlay:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->adOverlayFrameLayout:Landroid/widget/FrameLayout;

    .line 504
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_overlay:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->overlayFrameLayout:Landroid/widget/FrameLayout;

    .line 507
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_image:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    .line 508
    iput v7, v0, Landroidx/media3/ui/PlayerView;->imageDisplayMode:I

    .line 515
    :try_start_20a
    const-string v3, "androidx.media3.exoplayer.ExoPlayer"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 516
    const-string v4, "androidx.media3.exoplayer.image.ImageOutput"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 517
    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v6

    const-string v7, "setImageOutput"

    invoke-virtual {v3, v7, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 520
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    new-instance v10, Lo/PrivateMaxEntriesMapBuilder;

    invoke-direct {v10, v0}, Lo/PrivateMaxEntriesMapBuilder;-><init>(Landroidx/media3/ui/PlayerView;)V

    .line 519
    invoke-static {v7, v4, v10}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v4
    :try_end_231
    .catch Ljava/lang/ClassNotFoundException; {:try_start_20a .. :try_end_231} :catch_232
    .catch Ljava/lang/NoSuchMethodException; {:try_start_20a .. :try_end_231} :catch_232

    goto :goto_235

    :catch_232
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 534
    :goto_235
    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->exoPlayerClazz:Ljava/lang/Class;

    .line 535
    iput-object v6, v0, Landroidx/media3/ui/PlayerView;->setImageOutputMethod:Ljava/lang/reflect/Method;

    .line 536
    iput-object v4, v0, Landroidx/media3/ui/PlayerView;->imageOutput:Ljava/lang/Object;

    .line 539
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_artwork:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    if-eqz v14, :cond_24b

    if-eqz v15, :cond_24b

    if-nez v3, :cond_24c

    :cond_24b
    const/4 v15, 0x0

    .line 542
    :cond_24c
    iput v15, v0, Landroidx/media3/ui/PlayerView;->artworkDisplayMode:I

    if-eqz v9, :cond_25a

    .line 544
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v9}, Lo/_isNaN;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->defaultArtwork:Landroid/graphics/drawable/Drawable;

    .line 548
    :cond_25a
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_subtitles:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/media3/ui/SubtitleView;

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->subtitleView:Landroidx/media3/ui/SubtitleView;

    if-eqz v3, :cond_26c

    .line 550
    invoke-virtual {v3}, Landroidx/media3/ui/SubtitleView;->setUserDefaultStyle()V

    .line 551
    invoke-virtual {v3}, Landroidx/media3/ui/SubtitleView;->setUserDefaultTextSize()V

    .line 555
    :cond_26c
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_buffering:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->bufferingView:Landroid/view/View;

    const/16 v4, 0x8

    if-eqz v3, :cond_27b

    .line 557
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 559
    :cond_27b
    iput v8, v0, Landroidx/media3/ui/PlayerView;->showBuffering:I

    .line 562
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_error_message:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->errorMessageView:Landroid/widget/TextView;

    if-eqz v3, :cond_28c

    .line 564
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 568
    :cond_28c
    sget v3, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_controller:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/media3/ui/PlayerControlView;

    .line 569
    sget v4, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_controller_placeholder:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v3, :cond_2a0

    .line 571
    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    const/4 v6, 0x0

    goto :goto_2cc

    :cond_2a0
    if-eqz v4, :cond_2c8

    .line 575
    new-instance v3, Landroidx/media3/ui/PlayerControlView;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v3, v1, v7, v6, v2}, Landroidx/media3/ui/PlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V

    iput-object v3, v0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    .line 576
    sget v1, Lo/maximumCapacity$AudioAttributesImplBaseParcelizer;->exo_controller:I

    invoke-virtual {v3, v1}, Landroid/view/View;->setId(I)V

    .line 577
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 578
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 579
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    .line 580
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 581
    invoke-virtual {v1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_2cc

    :cond_2c8
    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 583
    iput-object v1, v0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    .line 585
    :goto_2cc
    iget-object v1, v0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    if-nez v1, :cond_2d2

    move v2, v6

    goto :goto_2d4

    :cond_2d2
    move/from16 v2, v16

    :goto_2d4
    iput v2, v0, Landroidx/media3/ui/PlayerView;->controllerShowTimeoutMs:I

    .line 586
    iput-boolean v5, v0, Landroidx/media3/ui/PlayerView;->controllerHideOnTouch:Z

    move/from16 v2, v19

    .line 587
    iput-boolean v2, v0, Landroidx/media3/ui/PlayerView;->controllerAutoShow:Z

    move/from16 v4, v18

    .line 588
    iput-boolean v4, v0, Landroidx/media3/ui/PlayerView;->controllerHideDuringAds:Z

    if-eqz p3, :cond_2e6

    if-eqz v1, :cond_2e6

    const/4 v5, 0x1

    goto :goto_2e7

    :cond_2e6
    move v5, v6

    .line 589
    :goto_2e7
    iput-boolean v5, v0, Landroidx/media3/ui/PlayerView;->useController:Z

    if-eqz v1, :cond_2f5

    .line 591
    invoke-virtual {v1}, Landroidx/media3/ui/PlayerControlView;->write()V

    .line 592
    iget-object v1, v0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    iget-object v2, v0, Landroidx/media3/ui/PlayerView;->componentListener:Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, v2}, Landroidx/media3/ui/PlayerControlView;->write(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;)V

    :cond_2f5
    if-eqz p3, :cond_2fb

    const/4 v1, 0x1

    .line 595
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 597
    :cond_2fb
    invoke-direct/range {p0 .. p0}, Landroidx/media3/ui/PlayerView;->updateContentDescription()V

    return-void
.end method

.method static synthetic access$100(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/SubtitleView;
    .registers 1

    .line 192
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->subtitleView:Landroidx/media3/ui/SubtitleView;

    return-object p0
.end method

.method static synthetic access$1000(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hideAndClearImage()V

    return-void
.end method

.method static synthetic access$1100(Landroidx/media3/ui/PlayerView;Z)V
    .registers 2

    .line 192
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->updateForCurrentTrackSelections(Z)V

    return-void
.end method

.method static synthetic access$1200(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateBuffering()V

    return-void
.end method

.method static synthetic access$1300(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateErrorMessage()V

    return-void
.end method

.method static synthetic access$1400(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateControllerVisibility()V

    return-void
.end method

.method static synthetic access$1500(Landroidx/media3/ui/PlayerView;)Z
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->isPlayingAd()Z

    move-result p0

    return p0
.end method

.method static synthetic access$1600(Landroidx/media3/ui/PlayerView;)Z
    .registers 1

    .line 192
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerView;->controllerHideDuringAds:Z

    return p0
.end method

.method static synthetic access$1700(Landroidx/media3/ui/PlayerView;)I
    .registers 1

    .line 192
    iget p0, p0, Landroidx/media3/ui/PlayerView;->textureViewRotation:I

    return p0
.end method

.method static synthetic access$1800(Landroid/view/TextureView;I)V
    .registers 2

    .line 192
    invoke-static {p0, p1}, Landroidx/media3/ui/PlayerView;->applyTextureViewRotation(Landroid/view/TextureView;I)V

    return-void
.end method

.method static synthetic access$1900(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->toggleControllerVisibility()V

    return-void
.end method

.method static synthetic access$200(Landroidx/media3/ui/PlayerView;)Lo/isUnsafeBaseType;
    .registers 1

    .line 192
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    return-object p0
.end method

.method static synthetic access$2000(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateContentDescription()V

    return-void
.end method

.method static synthetic access$2100(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$write;
    .registers 1

    .line 192
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controllerVisibilityListener:Landroidx/media3/ui/PlayerView$write;

    return-object p0
.end method

.method static synthetic access$2200(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;
    .registers 1

    .line 192
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->fullscreenButtonClickListener:Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;

    return-object p0
.end method

.method static synthetic access$300(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateAspectRatio()V

    return-void
.end method

.method static synthetic access$400(Landroidx/media3/ui/PlayerView;)Landroid/view/View;
    .registers 1

    .line 192
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$500(Landroidx/media3/ui/PlayerView;)Landroid/os/Handler;
    .registers 1

    .line 192
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->mainLooperHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$600(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$IconCompatParcelizer;
    .registers 1

    .line 192
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->surfaceSyncGroupV34:Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    return-object p0
.end method

.method static synthetic access$700(Landroidx/media3/ui/PlayerView;)Landroid/view/View;
    .registers 1

    .line 192
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->shutterView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$800(Landroidx/media3/ui/PlayerView;)Z
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hasSelectedImageTrack()Z

    move-result p0

    return p0
.end method

.method static synthetic access$900(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 192
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hideImage()V

    return-void
.end method

.method private static applyTextureViewRotation(Landroid/view/TextureView;I)V
    .registers 8

    .line 1810
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 1811
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    .line 1812
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    cmpl-float v4, v1, v3

    if-eqz v4, :cond_3e

    cmpl-float v4, v2, v3

    if-eqz v4, :cond_3e

    if-eqz p1, :cond_3e

    const/high16 v4, 0x40000000    # 2.0f

    div-float v5, v1, v4

    div-float v4, v2, v4

    int-to-float p1, p1

    .line 1816
    invoke-virtual {v0, p1, v5, v4}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 1819
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1820
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 1821
    invoke-virtual {v0, v3, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 1823
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result p1

    div-float/2addr v1, p1

    .line 1824
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result p1

    div-float/2addr v2, p1

    .line 1822
    invoke-virtual {v0, v1, v2, v5, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 1828
    :cond_3e
    invoke-virtual {p0, v0}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    return-void
.end method

.method private clearImageOutput(Lo/isUnsafeBaseType;)V
    .registers 4

    .line 710
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->exoPlayerClazz:Ljava/lang/Class;

    if-eqz v0, :cond_26

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 712
    :try_start_e
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->setImageOutputMethod:Ljava/lang/reflect/Method;

    invoke-static {p0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1e
    .catch Ljava/lang/IllegalAccessException; {:try_start_e .. :try_end_1e} :catch_1f
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_e .. :try_end_1e} :catch_1f

    return-void

    :catch_1f
    move-exception p0

    .line 714
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_26
    return-void
.end method

.method private closeShutter()V
    .registers 2

    .line 1695
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->shutterView:Landroid/view/View;

    if-eqz p0, :cond_8

    const/4 v0, 0x0

    .line 1696
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    return-void
.end method

.method private static configureEditModeLogo(Landroid/content/Context;Landroid/content/res/Resources;Landroid/widget/ImageView;)V
    .registers 4

    .line 1799
    sget v0, Lo/maximumCapacity$write;->exo_edit_mode_logo:I

    invoke-static {p0, p1, v0}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1800
    sget p0, Lo/maximumCapacity$read;->exo_edit_mode_background_color:I

    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p0

    invoke-virtual {p2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method private static configureEditModeLogoV23(Landroid/content/Context;Landroid/content/res/Resources;Landroid/widget/ImageView;)V
    .registers 4

    .line 1794
    sget v0, Lo/maximumCapacity$write;->exo_edit_mode_logo:I

    invoke-static {p0, p1, v0}, Lo/LaissezFaireSubTypeValidator;->read(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1795
    sget p0, Lo/maximumCapacity$read;->exo_edit_mode_background_color:I

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p0

    invoke-virtual {p2, p0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method private hasSelectedImageTrack()Z
    .registers 2

    .line 1607
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_1d

    .line 1608
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->imageOutput:Ljava/lang/Object;

    if-eqz p0, :cond_1d

    const/16 p0, 0x1e

    .line 1610
    invoke-interface {v0, p0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result p0

    if-eqz p0, :cond_1d

    .line 1611
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onPrepareFromSearch()Lo/collectAndResolveSubtypesByTypeId;

    move-result-object p0

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/collectAndResolveSubtypesByTypeId;->IconCompatParcelizer(I)Z

    move-result p0

    if-eqz p0, :cond_1d

    const/4 p0, 0x1

    return p0

    :cond_1d
    const/4 p0, 0x0

    return p0
.end method

.method private hasSelectedVideoTrack()Z
    .registers 2

    .line 1615
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-eqz p0, :cond_19

    const/16 v0, 0x1e

    .line 1617
    invoke-interface {p0, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1618
    invoke-interface {p0}, Lo/isUnsafeBaseType;->onPrepareFromSearch()Lo/collectAndResolveSubtypesByTypeId;

    move-result-object p0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/collectAndResolveSubtypesByTypeId;->IconCompatParcelizer(I)Z

    move-result p0

    if-eqz p0, :cond_19

    const/4 p0, 0x1

    return p0

    :cond_19
    const/4 p0, 0x0

    return p0
.end method

.method private hideAndClearImage()V
    .registers 2

    .line 1664
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hideImage()V

    .line 1665
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    if-eqz p0, :cond_d

    const v0, 0x106000d

    .line 1666
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_d
    return-void
.end method

.method private hideArtwork()V
    .registers 3

    .line 1600
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    if-eqz v0, :cond_10

    const v1, 0x106000d

    .line 1601
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1602
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_10
    return-void
.end method

.method private hideImage()V
    .registers 2

    .line 1678
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    if-eqz p0, :cond_8

    const/4 v0, 0x4

    .line 1679
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_8
    return-void
.end method

.method private isDpadKey(I)Z
    .registers 2

    const/16 p0, 0x13

    if-eq p1, p0, :cond_26

    const/16 p0, 0x10e

    if-eq p1, p0, :cond_26

    const/16 p0, 0x16

    if-eq p1, p0, :cond_26

    const/16 p0, 0x10f

    if-eq p1, p0, :cond_26

    const/16 p0, 0x14

    if-eq p1, p0, :cond_26

    const/16 p0, 0x10d

    if-eq p1, p0, :cond_26

    const/16 p0, 0x15

    if-eq p1, p0, :cond_26

    const/16 p0, 0x10c

    if-eq p1, p0, :cond_26

    const/16 p0, 0x17

    if-eq p1, p0, :cond_26

    const/4 p0, 0x0

    return p0

    :cond_26
    const/4 p0, 0x1

    return p0
.end method

.method private isImageSet()Z
    .registers 2

    .line 1622
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    const/4 v0, 0x0

    if-nez p0, :cond_6

    return v0

    .line 1625
    :cond_6
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_14

    .line 1627
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result p0

    if-eqz p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    return v0
.end method

.method private isPlayingAd()Z
    .registers 3

    .line 1505
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_1e

    const/16 v1, 0x10

    .line 1506
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    .line 1507
    invoke-interface {v0}, Lo/isUnsafeBaseType;->setSessionImpl()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    .line 1508
    invoke-interface {p0}, Lo/isUnsafeBaseType;->onPrepareFromUri()Z

    move-result p0

    if-eqz p0, :cond_1e

    const/4 p0, 0x1

    return p0

    :cond_1e
    const/4 p0, 0x0

    return p0
.end method

.method private maybeShowController(Z)V
    .registers 4

    .line 1470
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->isPlayingAd()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->controllerHideDuringAds:Z

    if-nez v0, :cond_30

    .line 1473
    :cond_a
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result v0

    if-eqz v0, :cond_30

    .line 1474
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    .line 1475
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_22

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesCompatParcelizer()I

    move-result v0

    if-gtz v0, :cond_22

    const/4 v0, 0x1

    goto :goto_23

    :cond_22
    const/4 v0, 0x0

    .line 1476
    :goto_23
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->shouldShowControllerIndefinitely()Z

    move-result v1

    if-nez p1, :cond_2d

    if-nez v0, :cond_2d

    if-eqz v1, :cond_30

    .line 1478
    :cond_2d
    invoke-direct {p0, v1}, Landroidx/media3/ui/PlayerView;->showController(Z)V

    :cond_30
    return-void
.end method

.method private onImageAvailable(Landroid/graphics/Bitmap;)V
    .registers 4

    .line 1684
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->mainLooperHandler:Landroid/os/Handler;

    new-instance v1, Lo/PrivateMaxEntriesMapAddTask;

    invoke-direct {v1, p0, p1}, Lo/PrivateMaxEntriesMapAddTask;-><init>(Landroidx/media3/ui/PlayerView;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private setArtworkFromMediaMetadata(Lo/isUnsafeBaseType;)Z
    .registers 4

    const/4 v0, 0x0

    if-eqz p1, :cond_2b

    const/16 v1, 0x12

    .line 1565
    invoke-interface {p1, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 1568
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onRemoveQueueItem()Lo/getSchema;

    move-result-object p1

    .line 1569
    iget-object v1, p1, Lo/getSchema;->read:[B

    if-nez v1, :cond_14

    return v0

    .line 1572
    :cond_14
    iget-object v1, p1, Lo/getSchema;->read:[B

    iget-object p1, p1, Lo/getSchema;->read:[B

    array-length p1, p1

    .line 1573
    invoke-static {v1, v0, p1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 1575
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->setDrawableArtwork(Landroid/graphics/drawable/Drawable;)Z

    move-result p0

    return p0

    :cond_2b
    return v0
.end method

.method private setDrawableArtwork(Landroid/graphics/drawable/Drawable;)Z
    .registers 7

    .line 1579
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eqz v0, :cond_40

    if-eqz p1, :cond_40

    .line 1580
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 1581
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    if-lez v0, :cond_40

    if-lez v2, :cond_40

    int-to-float v0, v0

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 1584
    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 1585
    iget v3, p0, Landroidx/media3/ui/PlayerView;->artworkDisplayMode:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2a

    .line 1586
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 1587
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1589
    :cond_2a
    iget-object v3, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-virtual {p0, v3, v0}, Landroidx/media3/ui/PlayerView;->onContentAspectRatioChanged(Landroidx/media3/ui/AspectRatioFrameLayout;F)V

    .line 1590
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1591
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1592
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p0, 0x1

    return p0

    :cond_40
    return v1
.end method

.method private setImage(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    .line 1631
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    if-nez v0, :cond_5

    return-void

    .line 1634
    :cond_5
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1635
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateImageViewAspectRatio()V

    return-void
.end method

.method private setImageOutput(Lo/isUnsafeBaseType;)V
    .registers 4

    .line 699
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->exoPlayerClazz:Ljava/lang/Class;

    if-eqz v0, :cond_2b

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 701
    :try_start_e
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->setImageOutputMethod:Ljava/lang/reflect/Method;

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->imageOutput:Ljava/lang/Object;

    invoke-static {p0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_23
    .catch Ljava/lang/IllegalAccessException; {:try_start_e .. :try_end_23} :catch_24
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_e .. :try_end_23} :catch_24

    return-void

    :catch_24
    move-exception p0

    .line 703
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_2b
    return-void
.end method

.method private static setResizeModeRaw(Landroidx/media3/ui/AspectRatioFrameLayout;I)V
    .registers 2

    .line 1805
    invoke-virtual {p0, p1}, Landroidx/media3/ui/AspectRatioFrameLayout;->setResizeMode(I)V

    return-void
.end method

.method private shouldShowControllerIndefinitely()Z
    .registers 5

    .line 1484
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    const/4 v1, 0x1

    if-nez v0, :cond_6

    return v1

    .line 1487
    :cond_6
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRewind()I

    move-result v0

    .line 1488
    iget-boolean v2, p0, Landroidx/media3/ui/PlayerView;->controllerAutoShow:Z

    if-eqz v2, :cond_38

    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    const/16 v3, 0x11

    .line 1489
    invoke-interface {v2, v3}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v2

    if-eqz v2, :cond_24

    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    .line 1490
    invoke-interface {v2}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object v2

    invoke-virtual {v2}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer()Z

    move-result v2

    if-nez v2, :cond_38

    :cond_24
    if-eq v0, v1, :cond_37

    const/4 v2, 0x4

    if-eq v0, v2, :cond_37

    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    .line 1493
    invoke-static {p0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/isUnsafeBaseType;

    invoke-interface {p0}, Lo/isUnsafeBaseType;->onPrepareFromUri()Z

    move-result p0

    if-nez p0, :cond_38

    :cond_37
    return v1

    :cond_38
    const/4 p0, 0x0

    return p0
.end method

.method private showController(Z)V
    .registers 3

    .line 1497
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    .line 1500
    :cond_7
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    if-eqz p1, :cond_d

    const/4 p1, 0x0

    goto :goto_f

    :cond_d
    iget p1, p0, Landroidx/media3/ui/PlayerView;->controllerShowTimeoutMs:I

    :goto_f
    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowTimeoutMs(I)V

    .line 1501
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method private showImage()V
    .registers 3

    .line 1671
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    if-eqz v0, :cond_b

    const/4 v1, 0x0

    .line 1672
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1673
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateImageViewAspectRatio()V

    :cond_b
    return-void
.end method

.method public static switchTargetView(Lo/isUnsafeBaseType;Landroidx/media3/ui/PlayerView;Landroidx/media3/ui/PlayerView;)V
    .registers 3

    if-eq p1, p2, :cond_d

    if-eqz p2, :cond_7

    .line 618
    invoke-virtual {p2, p0}, Landroidx/media3/ui/PlayerView;->setPlayer(Lo/isUnsafeBaseType;)V

    :cond_7
    if-eqz p1, :cond_d

    const/4 p0, 0x0

    .line 621
    invoke-virtual {p1, p0}, Landroidx/media3/ui/PlayerView;->setPlayer(Lo/isUnsafeBaseType;)V

    :cond_d
    return-void
.end method

.method private toggleControllerVisibility()V
    .registers 2

    .line 1458
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_20

    .line 1461
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer()Z

    move-result v0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    .line 1462
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->maybeShowController(Z)V

    return-void

    .line 1463
    :cond_17
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->controllerHideOnTouch:Z

    if-eqz v0, :cond_20

    .line 1464
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer()V

    :cond_20
    return-void
.end method

.method private updateAspectRatio()V
    .registers 6

    .line 1752
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lo/isUnsafeBaseType;->onSkipToPrevious()Lo/deserializeTypedFromObject;

    move-result-object v0

    goto :goto_b

    :cond_9
    sget-object v0, Lo/deserializeTypedFromObject;->read:Lo/deserializeTypedFromObject;

    .line 1753
    :goto_b
    iget v1, v0, Lo/deserializeTypedFromObject;->write:I

    .line 1754
    iget v2, v0, Lo/deserializeTypedFromObject;->AudioAttributesCompatParcelizer:I

    .line 1755
    iget v3, v0, Lo/deserializeTypedFromObject;->RemoteActionCompatParcelizer:I

    const/4 v4, 0x0

    if-eqz v2, :cond_1d

    if-eqz v1, :cond_1d

    int-to-float v1, v1

    .line 1757
    iget v0, v0, Lo/deserializeTypedFromObject;->IconCompatParcelizer:F

    mul-float/2addr v1, v0

    int-to-float v0, v2

    div-float/2addr v1, v0

    goto :goto_1e

    :cond_1d
    move v1, v4

    .line 1759
    :goto_1e
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    instance-of v2, v0, Landroid/view/TextureView;

    if-eqz v2, :cond_51

    cmpl-float v2, v1, v4

    if-lez v2, :cond_34

    const/16 v2, 0x5a

    if-eq v3, v2, :cond_30

    const/16 v2, 0x10e

    if-ne v3, v2, :cond_34

    :cond_30
    const/high16 v2, 0x3f800000    # 1.0f

    div-float/2addr v2, v1

    move v1, v2

    .line 1767
    :cond_34
    iget v2, p0, Landroidx/media3/ui/PlayerView;->textureViewRotation:I

    if-eqz v2, :cond_3d

    .line 1768
    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->componentListener:Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 1770
    :cond_3d
    iput v3, p0, Landroidx/media3/ui/PlayerView;->textureViewRotation:I

    if-eqz v3, :cond_48

    .line 1774
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->componentListener:Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 1776
    :cond_48
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    check-cast v0, Landroid/view/TextureView;

    iget v2, p0, Landroidx/media3/ui/PlayerView;->textureViewRotation:I

    invoke-static {v0, v2}, Landroidx/media3/ui/PlayerView;->applyTextureViewRotation(Landroid/view/TextureView;I)V

    .line 1779
    :cond_51
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    .line 1780
    iget-boolean v2, p0, Landroidx/media3/ui/PlayerView;->surfaceViewIgnoresVideoAspectRatio:Z

    if-eqz v2, :cond_58

    goto :goto_59

    :cond_58
    move v4, v1

    .line 1779
    :goto_59
    invoke-virtual {p0, v0, v4}, Landroidx/media3/ui/PlayerView;->onContentAspectRatioChanged(Landroidx/media3/ui/AspectRatioFrameLayout;F)V

    return-void
.end method

.method private updateBuffering()V
    .registers 5

    .line 1701
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->bufferingView:Landroid/view/View;

    if-eqz v0, :cond_2b

    .line 1702
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    const/4 v1, 0x0

    if-eqz v0, :cond_20

    .line 1704
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onRewind()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_20

    iget v0, p0, Landroidx/media3/ui/PlayerView;->showBuffering:I

    const/4 v3, 0x1

    if-eq v0, v2, :cond_21

    if-ne v0, v3, :cond_20

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    .line 1706
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onPrepareFromUri()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_21

    :cond_20
    move v3, v1

    .line 1707
    :cond_21
    :goto_21
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->bufferingView:Landroid/view/View;

    if-eqz v3, :cond_26

    goto :goto_28

    :cond_26
    const/16 v1, 0x8

    :goto_28
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2b
    return-void
.end method

.method private updateContentDescription()V
    .registers 4

    .line 1730
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    const/4 v1, 0x0

    if-eqz v0, :cond_2f

    iget-boolean v2, p0, Landroidx/media3/ui/PlayerView;->useController:Z

    if-eqz v2, :cond_2f

    .line 1732
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 1734
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->controllerHideOnTouch:Z

    if-eqz v0, :cond_1d

    .line 1735
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_hide:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1733
    :cond_1d
    invoke-virtual {p0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1739
    :cond_21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lo/maximumCapacity$MediaBrowserCompatCustomActionResultReceiver;->exo_controls_show:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1738
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1731
    :cond_2f
    invoke-virtual {p0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateControllerVisibility()V
    .registers 2

    .line 1744
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->isPlayingAd()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->controllerHideDuringAds:Z

    if-eqz v0, :cond_e

    .line 1745
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->hideController()V

    return-void

    :cond_e
    const/4 v0, 0x0

    .line 1747
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->maybeShowController(Z)V

    return-void
.end method

.method private updateErrorMessage()V
    .registers 4

    .line 1712
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->errorMessageView:Landroid/widget/TextView;

    if-eqz v0, :cond_3c

    .line 1713
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->customErrorMessage:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    if-eqz v1, :cond_12

    .line 1714
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1715
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->errorMessageView:Landroid/widget/TextView;

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 1718
    :cond_12
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_1b

    invoke-interface {v0}, Lo/isUnsafeBaseType;->getPlayerError()Lo/validateSubClassName;

    move-result-object v0

    goto :goto_1c

    :cond_1b
    const/4 v0, 0x0

    :goto_1c
    if-eqz v0, :cond_35

    .line 1719
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->errorMessageProvider:Lo/JsonObjectFormatVisitor;

    if-eqz v0, :cond_35

    .line 1720
    invoke-interface {v0}, Lo/JsonObjectFormatVisitor;->RemoteActionCompatParcelizer()Landroid/util/Pair;

    move-result-object v0

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    .line 1721
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->errorMessageView:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1722
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->errorMessageView:Landroid/widget/TextView;

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 1724
    :cond_35
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->errorMessageView:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_3c
    return-void
.end method

.method private updateForCurrentTrackSelections(Z)V
    .registers 8

    .line 1512
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1a

    const/16 v3, 0x1e

    .line 1517
    invoke-interface {v0, v3}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v3

    if-eqz v3, :cond_1a

    .line 1518
    invoke-interface {v0}, Lo/isUnsafeBaseType;->onPrepareFromSearch()Lo/collectAndResolveSubtypesByTypeId;

    move-result-object v3

    invoke-virtual {v3}, Lo/collectAndResolveSubtypesByTypeId;->write()Z

    move-result v3

    if-nez v3, :cond_1a

    move v3, v1

    goto :goto_1b

    :cond_1a
    move v3, v2

    .line 1519
    :goto_1b
    iget-boolean v4, p0, Landroidx/media3/ui/PlayerView;->keepContentOnPlayerReset:Z

    if-nez v4, :cond_2c

    if-eqz v3, :cond_23

    if-eqz p1, :cond_2c

    .line 1520
    :cond_23
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hideArtwork()V

    .line 1521
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->closeShutter()V

    .line 1522
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hideAndClearImage()V

    :cond_2c
    if-eqz v3, :cond_85

    .line 1529
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hasSelectedVideoTrack()Z

    move-result p1

    .line 1530
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hasSelectedImageTrack()Z

    move-result v3

    if-nez p1, :cond_40

    if-nez v3, :cond_40

    .line 1536
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->closeShutter()V

    .line 1537
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hideAndClearImage()V

    .line 1541
    :cond_40
    iget-object v4, p0, Landroidx/media3/ui/PlayerView;->shutterView:Landroid/view/View;

    if-eqz v4, :cond_52

    .line 1542
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_52

    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->isImageSet()Z

    move-result v4

    if-eqz v4, :cond_52

    goto :goto_53

    :cond_52
    move v1, v2

    :goto_53
    if-eqz v3, :cond_60

    if-nez p1, :cond_60

    if-eqz v1, :cond_60

    .line 1544
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->closeShutter()V

    .line 1545
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->showImage()V

    goto :goto_69

    :cond_60
    if-eqz p1, :cond_69

    if-nez v3, :cond_69

    if-eqz v1, :cond_69

    .line 1547
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hideAndClearImage()V

    :cond_69
    :goto_69
    if-nez p1, :cond_82

    if-nez v3, :cond_82

    .line 1551
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useArtwork()Z

    move-result p1

    if-eqz p1, :cond_82

    .line 1553
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->setArtworkFromMediaMetadata(Lo/isUnsafeBaseType;)Z

    move-result p1

    if-nez p1, :cond_85

    .line 1556
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->defaultArtwork:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->setDrawableArtwork(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_82

    goto :goto_85

    .line 1561
    :cond_82
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hideArtwork()V

    :cond_85
    :goto_85
    return-void
.end method

.method private updateImageViewAspectRatio()V
    .registers 5

    .line 1639
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    if-eqz v0, :cond_40

    .line 1642
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_40

    .line 1646
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    .line 1647
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-lez v1, :cond_40

    if-lez v0, :cond_40

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    .line 1652
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 1653
    iget v2, p0, Landroidx/media3/ui/PlayerView;->imageDisplayMode:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2e

    .line 1654
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v1, v0, v1

    .line 1655
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1657
    :cond_2e
    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_3b

    .line 1658
    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-virtual {p0, v2, v1}, Landroidx/media3/ui/PlayerView;->onContentAspectRatioChanged(Landroidx/media3/ui/AspectRatioFrameLayout;F)V

    .line 1660
    :cond_3b
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_40
    return-void
.end method

.method private useArtwork()Z
    .registers 2

    .line 1450
    iget v0, p0, Landroidx/media3/ui/PlayerView;->artworkDisplayMode:I

    if-eqz v0, :cond_b

    .line 1451
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    invoke-static {p0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method private useController()Z
    .registers 2

    .line 1442
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->useController:Z

    if-eqz v0, :cond_b

    .line 1443
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {p0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 3

    .line 1785
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 1786
    sget p1, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 v0, 0x22

    if-ne p1, v0, :cond_10

    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->surfaceSyncGroupV34:Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    if-eqz p0, :cond_10

    .line 1787
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;->RemoteActionCompatParcelizer()V

    :cond_10
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 5

    .line 930
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-eqz v0, :cond_19

    const/16 v1, 0x10

    .line 931
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    .line 932
    invoke-interface {v0}, Lo/isUnsafeBaseType;->setSessionImpl()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 933
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0

    .line 936
    :cond_19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->isDpadKey(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_36

    .line 938
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result v2

    if-eqz v2, :cond_36

    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {v2}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer()Z

    move-result v2

    if-nez v2, :cond_36

    .line 940
    invoke-direct {p0, v1}, Landroidx/media3/ui/PlayerView;->maybeShowController(Z)V

    return v1

    .line 942
    :cond_36
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v2

    if-nez v2, :cond_4f

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-nez p1, :cond_4f

    if-eqz v0, :cond_4d

    .line 947
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result p1

    if-eqz p1, :cond_4d

    .line 949
    invoke-direct {p0, v1}, Landroidx/media3/ui/PlayerView;->maybeShowController(Z)V

    :cond_4d
    const/4 p0, 0x0

    return p0

    .line 945
    :cond_4f
    invoke-direct {p0, v1}, Landroidx/media3/ui/PlayerView;->maybeShowController(Z)V

    return v1
.end method

.method public dispatchMediaKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    .line 963
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->read(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public getAdOverlayInfos()Ljava/util/List;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo/JsonFormatVisitorWrapperBase;",
            ">;"
        }
    .end annotation

    .line 1424
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1425
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->overlayFrameLayout:Landroid/widget/FrameLayout;

    if-eqz v1, :cond_1e

    .line 1426
    new-instance v1, Lo/JsonFormatVisitorWrapperBase$AudioAttributesCompatParcelizer;

    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->overlayFrameLayout:Landroid/widget/FrameLayout;

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lo/JsonFormatVisitorWrapperBase$AudioAttributesCompatParcelizer;-><init>(Landroid/view/View;I)V

    .line 1428
    const-string v2, "Transparent overlay does not impact viewability"

    invoke-virtual {v1, v2}, Lo/JsonFormatVisitorWrapperBase$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Lo/JsonFormatVisitorWrapperBase$AudioAttributesCompatParcelizer;

    move-result-object v1

    .line 1429
    invoke-virtual {v1}, Lo/JsonFormatVisitorWrapperBase$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/JsonFormatVisitorWrapperBase;

    move-result-object v1

    .line 1426
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1431
    :cond_1e
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    if-eqz v1, :cond_31

    .line 1432
    new-instance v1, Lo/JsonFormatVisitorWrapperBase$AudioAttributesCompatParcelizer;

    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lo/JsonFormatVisitorWrapperBase$AudioAttributesCompatParcelizer;-><init>(Landroid/view/View;I)V

    .line 1433
    invoke-virtual {v1}, Lo/JsonFormatVisitorWrapperBase$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Lo/JsonFormatVisitorWrapperBase;

    move-result-object p0

    .line 1432
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1435
    :cond_31
    invoke-static {v0}, Lo/initExtraTracks;->write(Ljava/util/Collection;)Lo/initExtraTracks;

    move-result-object p0

    return-object p0
.end method

.method public getAdViewGroup()Landroid/view/ViewGroup;
    .registers 2

    .line 1418
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->adOverlayFrameLayout:Landroid/widget/FrameLayout;

    const-string v0, "exo_ad_overlay must be present for ad playback"

    invoke-static {p0, v0}, Lo/buildTypeSerializer;->read(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method public getArtworkDisplayMode()I
    .registers 1

    .line 777
    iget p0, p0, Landroidx/media3/ui/PlayerView;->artworkDisplayMode:I

    return p0
.end method

.method public getControllerAutoShow()Z
    .registers 1

    .line 1047
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerView;->controllerAutoShow:Z

    return p0
.end method

.method public getControllerHideOnTouch()Z
    .registers 1

    .line 1025
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerView;->controllerHideOnTouch:Z

    return p0
.end method

.method public getControllerShowTimeoutMs()I
    .registers 1

    .line 1002
    iget p0, p0, Landroidx/media3/ui/PlayerView;->controllerShowTimeoutMs:I

    return p0
.end method

.method public getDefaultArtwork()Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 784
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->defaultArtwork:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public getImageDisplayMode()I
    .registers 1

    .line 814
    iget p0, p0, Landroidx/media3/ui/PlayerView;->imageDisplayMode:I

    return p0
.end method

.method public getOverlayFrameLayout()Landroid/widget/FrameLayout;
    .registers 1

    .line 1343
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->overlayFrameLayout:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method public getPlayer()Lo/isUnsafeBaseType;
    .registers 1

    .line 628
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    return-object p0
.end method

.method public getResizeMode()I
    .registers 2

    .line 742
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 743
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-virtual {p0}, Landroidx/media3/ui/AspectRatioFrameLayout;->AudioAttributesCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public getSubtitleView()Landroidx/media3/ui/SubtitleView;
    .registers 1

    .line 1355
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->subtitleView:Landroidx/media3/ui/SubtitleView;

    return-object p0
.end method

.method public getUseArtwork()Z
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 752
    iget p0, p0, Landroidx/media3/ui/PlayerView;->artworkDisplayMode:I

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public getUseController()Z
    .registers 1

    .line 819
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerView;->useController:Z

    return p0
.end method

.method public getVideoSurfaceView()Landroid/view/View;
    .registers 1

    .line 1330
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    return-object p0
.end method

.method public hideController()V
    .registers 1

    .line 987
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    if-eqz p0, :cond_7

    .line 988
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer()V

    :cond_7
    return-void
.end method

.method public isControllerFullyVisible()Z
    .registers 1

    .line 969
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public synthetic lambda$new$0$androidx-media3-ui-PlayerView(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 523
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onImageAvailable"

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    const/4 p1, 0x1

    .line 524
    aget-object p1, p3, p1

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->onImageAvailable(Landroid/graphics/Bitmap;)V

    :cond_14
    const/4 p0, 0x0

    return-object p0
.end method

.method public synthetic lambda$onImageAvailable$1$androidx-media3-ui-PlayerView(Landroid/graphics/Bitmap;)V
    .registers 4

    .line 1686
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->setImage(Landroid/graphics/drawable/Drawable;)V

    .line 1687
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->hasSelectedVideoTrack()Z

    move-result p1

    if-nez p1, :cond_18

    .line 1688
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->showImage()V

    .line 1689
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->closeShutter()V

    :cond_18
    return-void
.end method

.method protected onContentAspectRatioChanged(Landroidx/media3/ui/AspectRatioFrameLayout;F)V
    .registers 3

    if-eqz p1, :cond_5

    .line 1410
    invoke-virtual {p1, p2}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    :cond_5
    return-void
.end method

.method public onPause()V
    .registers 2

    .line 1394
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    instance-of v0, p0, Landroid/opengl/GLSurfaceView;

    if-eqz v0, :cond_b

    .line 1395
    check-cast p0, Landroid/opengl/GLSurfaceView;

    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    :cond_b
    return-void
.end method

.method public onResume()V
    .registers 2

    .line 1381
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    instance-of v0, p0, Landroid/opengl/GLSurfaceView;

    if-eqz v0, :cond_b

    .line 1382
    check-cast p0, Landroid/opengl/GLSurfaceView;

    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    :cond_b
    return-void
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 1366
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-eqz p1, :cond_f

    const/4 p1, 0x1

    .line 1369
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->maybeShowController(Z)V

    return p1

    :cond_f
    const/4 p0, 0x0

    return p0
.end method

.method public performClick()Z
    .registers 1

    .line 1360
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->toggleControllerVisibility()V

    .line 1361
    invoke-super {p0}, Landroid/widget/FrameLayout;->performClick()Z

    move-result p0

    return p0
.end method

.method public setArtworkDisplayMode(I)V
    .registers 4

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    .line 767
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->artworkView:Landroid/widget/ImageView;

    if-nez v1, :cond_9

    move v1, v0

    goto :goto_a

    :cond_9
    const/4 v1, 0x1

    :goto_a
    invoke-static {v1}, Lo/buildTypeSerializer;->write(Z)V

    .line 768
    iget v1, p0, Landroidx/media3/ui/PlayerView;->artworkDisplayMode:I

    if-eq v1, p1, :cond_16

    .line 769
    iput p1, p0, Landroidx/media3/ui/PlayerView;->artworkDisplayMode:I

    .line 770
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->updateForCurrentTrackSelections(Z)V

    :cond_16
    return-void
.end method

.method public setAspectRatioListener(Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;)V
    .registers 3

    .line 1306
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1307
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatioListener(Landroidx/media3/ui/AspectRatioFrameLayout$IconCompatParcelizer;)V

    return-void
.end method

.method public setControllerAnimationEnabled(Z)V
    .registers 3

    .line 1096
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1097
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setAnimationEnabled(Z)V

    return-void
.end method

.method public setControllerAutoShow(Z)V
    .registers 2

    .line 1059
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->controllerAutoShow:Z

    return-void
.end method

.method public setControllerHideDuringAds(Z)V
    .registers 2

    .line 1070
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->controllerHideDuringAds:Z

    return-void
.end method

.method public setControllerHideOnTouch(Z)V
    .registers 3

    .line 1035
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1036
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->controllerHideOnTouch:Z

    .line 1037
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateContentDescription()V

    return-void
.end method

.method public setControllerOnFullScreenModeChangedListener(Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1160
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 1161
    iput-object v0, p0, Landroidx/media3/ui/PlayerView;->fullscreenButtonClickListener:Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;

    .line 1162
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setOnFullScreenModeChangedListener(Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;)V

    return-void
.end method

.method public setControllerShowTimeoutMs(I)V
    .registers 3

    .line 1014
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1015
    iput p1, p0, Landroidx/media3/ui/PlayerView;->controllerShowTimeoutMs:I

    .line 1016
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p1}, Landroidx/media3/ui/PlayerControlView;->IconCompatParcelizer()Z

    move-result p1

    if-eqz p1, :cond_12

    .line 1018
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->showController()V

    :cond_12
    return-void
.end method

.method public setControllerVisibilityListener(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1113
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1114
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->legacyControllerVisibilityListener:Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;

    if-eq v0, p1, :cond_1d

    if-eqz v0, :cond_10

    .line 1119
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {v1, v0}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;)V

    .line 1121
    :cond_10
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->legacyControllerVisibilityListener:Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;

    if-eqz p1, :cond_1d

    .line 1123
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerControlView;->write(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;)V

    const/4 p1, 0x0

    .line 1124
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setControllerVisibilityListener(Landroidx/media3/ui/PlayerView$write;)V

    :cond_1d
    return-void
.end method

.method public setControllerVisibilityListener(Landroidx/media3/ui/PlayerView$write;)V
    .registers 2

    .line 1084
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->controllerVisibilityListener:Landroidx/media3/ui/PlayerView$write;

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    .line 1086
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setControllerVisibilityListener(Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;)V

    :cond_8
    return-void
.end method

.method public setCustomErrorMessage(Ljava/lang/CharSequence;)V
    .registers 3

    .line 923
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->errorMessageView:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    invoke-static {v0}, Lo/buildTypeSerializer;->write(Z)V

    .line 924
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->customErrorMessage:Ljava/lang/CharSequence;

    .line 925
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateErrorMessage()V

    return-void
.end method

.method public setDefaultArtwork(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    .line 795
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->defaultArtwork:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_a

    .line 796
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->defaultArtwork:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 797
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->updateForCurrentTrackSelections(Z)V

    :cond_a
    return-void
.end method

.method public setErrorMessageProvider(Lo/JsonObjectFormatVisitor;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/JsonObjectFormatVisitor<",
            "-",
            "Lo/validateSubClassName;",
            ">;)V"
        }
    .end annotation

    .line 909
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->errorMessageProvider:Lo/JsonObjectFormatVisitor;

    if-eq v0, p1, :cond_9

    .line 910
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->errorMessageProvider:Lo/JsonObjectFormatVisitor;

    .line 911
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateErrorMessage()V

    :cond_9
    return-void
.end method

.method public setExtraAdGroupMarkers([J[Z)V
    .registers 4

    .line 1293
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1294
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1, p2}, Landroidx/media3/ui/PlayerControlView;->setExtraAdGroupMarkers([J[Z)V

    return-void
.end method

.method public setFullscreenButtonClickListener(Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 1139
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1140
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->fullscreenButtonClickListener:Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;

    .line 1141
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->componentListener:Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/media3/ui/PlayerControlView;->setOnFullScreenModeChangedListener(Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;)V

    return-void
.end method

.method public setImageDisplayMode(I)V
    .registers 3

    .line 804
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->imageView:Landroid/widget/ImageView;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    invoke-static {v0}, Lo/buildTypeSerializer;->write(Z)V

    .line 805
    iget v0, p0, Landroidx/media3/ui/PlayerView;->imageDisplayMode:I

    if-eq v0, p1, :cond_13

    .line 806
    iput p1, p0, Landroidx/media3/ui/PlayerView;->imageDisplayMode:I

    .line 807
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateImageViewAspectRatio()V

    :cond_13
    return-void
.end method

.method public setKeepContentOnPlayerReset(Z)V
    .registers 3

    .line 880
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->keepContentOnPlayerReset:Z

    if-eq v0, p1, :cond_a

    .line 881
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->keepContentOnPlayerReset:Z

    const/4 p1, 0x0

    .line 882
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->updateForCurrentTrackSelections(Z)V

    :cond_a
    return-void
.end method

.method public setPlayer(Lo/isUnsafeBaseType;)V
    .registers 8

    .line 645
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_e

    move v0, v2

    goto :goto_f

    :cond_e
    move v0, v3

    :goto_f
    invoke-static {v0}, Lo/buildTypeSerializer;->write(Z)V

    if-eqz p1, :cond_20

    .line 647
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onCommand()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_20

    move v0, v3

    goto :goto_21

    :cond_20
    move v0, v2

    .line 646
    :goto_21
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 648
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    if-ne v0, p1, :cond_29

    return-void

    :cond_29
    const/16 v1, 0x1b

    if-eqz v0, :cond_50

    .line 654
    iget-object v4, p0, Landroidx/media3/ui/PlayerView;->componentListener:Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

    invoke-interface {v0, v4}, Lo/isUnsafeBaseType;->write(Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;)V

    .line 655
    invoke-interface {v0, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v4

    if-eqz v4, :cond_4d

    .line 656
    iget-object v4, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    instance-of v5, v4, Landroid/view/TextureView;

    if-eqz v5, :cond_44

    .line 657
    check-cast v4, Landroid/view/TextureView;

    invoke-interface {v0, v4}, Lo/isUnsafeBaseType;->write(Landroid/view/TextureView;)V

    goto :goto_4d

    .line 658
    :cond_44
    instance-of v5, v4, Landroid/view/SurfaceView;

    if-eqz v5, :cond_4d

    .line 659
    check-cast v4, Landroid/view/SurfaceView;

    invoke-interface {v0, v4}, Lo/isUnsafeBaseType;->read(Landroid/view/SurfaceView;)V

    .line 662
    :cond_4d
    :goto_4d
    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->clearImageOutput(Lo/isUnsafeBaseType;)V

    .line 664
    :cond_50
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->subtitleView:Landroidx/media3/ui/SubtitleView;

    if-eqz v0, :cond_58

    const/4 v4, 0x0

    .line 665
    invoke-virtual {v0, v4}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    .line 667
    :cond_58
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    .line 668
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result v0

    if-eqz v0, :cond_65

    .line 669
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {v0, p1}, Landroidx/media3/ui/PlayerControlView;->setPlayer(Lo/isUnsafeBaseType;)V

    .line 671
    :cond_65
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateBuffering()V

    .line 672
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateErrorMessage()V

    .line 673
    invoke-direct {p0, v2}, Landroidx/media3/ui/PlayerView;->updateForCurrentTrackSelections(Z)V

    if-eqz p1, :cond_c3

    .line 675
    invoke-interface {p1, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_a0

    .line 676
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    instance-of v1, v0, Landroid/view/TextureView;

    if-eqz v1, :cond_82

    .line 677
    check-cast v0, Landroid/view/TextureView;

    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->IconCompatParcelizer(Landroid/view/TextureView;)V

    goto :goto_8b

    .line 678
    :cond_82
    instance-of v1, v0, Landroid/view/SurfaceView;

    if-eqz v1, :cond_8b

    .line 679
    check-cast v0, Landroid/view/SurfaceView;

    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->AudioAttributesCompatParcelizer(Landroid/view/SurfaceView;)V

    :cond_8b
    :goto_8b
    const/16 v0, 0x1e

    .line 681
    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_9d

    .line 682
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onPrepareFromSearch()Lo/collectAndResolveSubtypesByTypeId;

    move-result-object v0

    invoke-virtual {v0}, Lo/collectAndResolveSubtypesByTypeId;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_a0

    .line 684
    :cond_9d
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateAspectRatio()V

    .line 687
    :cond_a0
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->subtitleView:Landroidx/media3/ui/SubtitleView;

    if-eqz v0, :cond_b7

    const/16 v0, 0x1c

    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_b7

    .line 688
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->subtitleView:Landroidx/media3/ui/SubtitleView;

    invoke-interface {p1}, Lo/isUnsafeBaseType;->onPlayFromMediaId()Lo/idFromValue;

    move-result-object v1

    iget-object v1, v1, Lo/idFromValue;->write:Lo/initExtraTracks;

    invoke-virtual {v0, v1}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    .line 690
    :cond_b7
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->componentListener:Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;

    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->read(Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;)V

    .line 691
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->setImageOutput(Lo/isUnsafeBaseType;)V

    .line 692
    invoke-direct {p0, v3}, Landroidx/media3/ui/PlayerView;->maybeShowController(Z)V

    return-void

    .line 694
    :cond_c3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->hideController()V

    return-void
.end method

.method public setRepeatToggleModes(I)V
    .registers 3

    .line 1216
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1217
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setRepeatToggleModes(I)V

    return-void
.end method

.method public setResizeMode(I)V
    .registers 3

    .line 735
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 736
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->contentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/AspectRatioFrameLayout;->setResizeMode(I)V

    return-void
.end method

.method public setShowBuffering(I)V
    .registers 3

    .line 896
    iget v0, p0, Landroidx/media3/ui/PlayerView;->showBuffering:I

    if-eq v0, p1, :cond_9

    .line 897
    iput p1, p0, Landroidx/media3/ui/PlayerView;->showBuffering:I

    .line 898
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateBuffering()V

    :cond_9
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .registers 3

    .line 1183
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1184
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowFastForwardButton(Z)V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1261
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1262
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowMultiWindowTimeBar(Z)V

    return-void
.end method

.method public setShowNextButton(Z)V
    .registers 3

    .line 1205
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1206
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowNextButton(Z)V

    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .registers 3

    .line 1276
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1277
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowPlayButtonIfPlaybackIsSuppressed(Z)V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .registers 3

    .line 1194
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1195
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowPreviousButton(Z)V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .registers 3

    .line 1172
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1173
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowRewindButton(Z)V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .registers 3

    .line 1227
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1228
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowShuffleButton(Z)V

    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .registers 3

    .line 1238
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1239
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowSubtitleButton(Z)V

    return-void
.end method

.method public setShowVrButton(Z)V
    .registers 3

    .line 1249
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-static {v0}, Lo/buildTypeSerializer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1250
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setShowVrButton(Z)V

    return-void
.end method

.method public setShutterBackgroundColor(I)V
    .registers 2

    .line 854
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->shutterView:Landroid/view/View;

    if-eqz p0, :cond_7

    .line 855
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_7
    return-void
.end method

.method public setUseArtwork(Z)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    xor-int/lit8 p1, p1, 0x1

    .line 761
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setArtworkDisplayMode(I)V

    return-void
.end method

.method public setUseController(Z)V
    .registers 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_a

    .line 832
    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    if-nez v2, :cond_a

    move v2, v0

    goto :goto_b

    :cond_a
    move v2, v1

    :goto_b
    invoke-static {v2}, Lo/buildTypeSerializer;->write(Z)V

    if-nez p1, :cond_16

    .line 833
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->hasOnClickListeners()Z

    move-result v2

    if-eqz v2, :cond_17

    :cond_16
    move v0, v1

    :cond_17
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 834
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->useController:Z

    if-ne v0, p1, :cond_1f

    return-void

    .line 837
    :cond_1f
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->useController:Z

    .line 838
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->useController()Z

    move-result p1

    if-eqz p1, :cond_2f

    .line 839
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->player:Lo/isUnsafeBaseType;

    invoke-virtual {p1, v0}, Landroidx/media3/ui/PlayerControlView;->setPlayer(Lo/isUnsafeBaseType;)V

    goto :goto_3c

    .line 840
    :cond_2f
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    if-eqz p1, :cond_3c

    .line 841
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerControlView;->RemoteActionCompatParcelizer()V

    .line 842
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->controller:Landroidx/media3/ui/PlayerControlView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/media3/ui/PlayerControlView;->setPlayer(Lo/isUnsafeBaseType;)V

    .line 844
    :cond_3c
    :goto_3c
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->updateContentDescription()V

    return-void
.end method

.method public setVisibility(I)V
    .registers 3

    .line 721
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 722
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->surfaceView:Landroid/view/View;

    instance-of v0, p0, Landroid/view/SurfaceView;

    if-eqz v0, :cond_c

    .line 724
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_c
    return-void
.end method

.method public showController()V
    .registers 2

    .line 981
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView;->shouldShowControllerIndefinitely()Z

    move-result v0

    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->showController(Z)V

    return-void
.end method

###### Class androidx.media3.ui.PlayerView.AnonymousClass4 (androidx.media3.ui.PlayerView$4)
.class final synthetic Landroidx/media3/ui/PlayerView$4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation

###### Class androidx.media3.ui.PlayerView.AudioAttributesCompatParcelizer (androidx.media3.ui.PlayerView$AudioAttributesCompatParcelizer)
.class public final Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/isUnsafeBaseType$AudioAttributesCompatParcelizer;
.implements Landroid/view/View$OnLayoutChangeListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroidx/media3/ui/PlayerControlView$MediaBrowserCompatSearchResultReceiver;
.implements Landroidx/media3/ui/PlayerControlView$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

.field private RemoteActionCompatParcelizer:Ljava/lang/Object;

.field private final write:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerView;)V
    .registers 2

    .line 1857
    iput-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1858
    new-instance p1, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    invoke-direct {p1}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->write:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    return-void
.end method

.method public static synthetic IconCompatParcelizer(Landroidx/media3/ui/PlayerView;)V
    .registers 1

    .line 1998
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 1893
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->access$700(Landroidx/media3/ui/PlayerView;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_25

    .line 1894
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->access$700(Landroidx/media3/ui/PlayerView;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1895
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->access$800(Landroidx/media3/ui/PlayerView;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 1896
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$900(Landroidx/media3/ui/PlayerView;)V

    return-void

    .line 1898
    :cond_20
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$1000(Landroidx/media3/ui/PlayerView;)V

    :cond_25
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Lo/isUnsafeBaseType$write;Lo/isUnsafeBaseType$write;I)V
    .registers 4

    .line 1954
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$1500(Landroidx/media3/ui/PlayerView;)Z

    move-result p1

    if-eqz p1, :cond_15

    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$1600(Landroidx/media3/ui/PlayerView;)Z

    move-result p1

    if-eqz p1, :cond_15

    .line 1955
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->hideController()V

    :cond_15
    return-void
.end method

.method public final IconCompatParcelizer(Lo/deserializeTypedFromObject;)V
    .registers 3

    .line 1872
    sget-object v0, Lo/deserializeTypedFromObject;->read:Lo/deserializeTypedFromObject;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_22

    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    .line 1873
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$200(Landroidx/media3/ui/PlayerView;)Lo/isUnsafeBaseType;

    move-result-object p1

    if-eqz p1, :cond_22

    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    .line 1874
    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$200(Landroidx/media3/ui/PlayerView;)Lo/isUnsafeBaseType;

    move-result-object p1

    invoke-interface {p1}, Lo/isUnsafeBaseType;->onRewind()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_22

    .line 1877
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$300(Landroidx/media3/ui/PlayerView;)V

    :cond_22
    return-void
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 2

    .line 1986
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->access$2000(Landroidx/media3/ui/PlayerView;)V

    .line 1987
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->access$2100(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$write;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 1988
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$2100(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$write;

    :cond_12
    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)V
    .registers 2

    .line 1937
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$1200(Landroidx/media3/ui/PlayerView;)V

    .line 1938
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$1300(Landroidx/media3/ui/PlayerView;)V

    .line 1939
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$1400(Landroidx/media3/ui/PlayerView;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 5

    .line 1882
    sget p1, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 p2, 0x22

    if-ne p1, p2, :cond_34

    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$400(Landroidx/media3/ui/PlayerView;)Landroid/view/View;

    move-result-object p1

    instance-of p1, p1, Landroid/view/SurfaceView;

    if-eqz p1, :cond_34

    .line 1885
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$600(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    move-result-object p1

    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    iget-object p2, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    .line 1887
    invoke-static {p2}, Landroidx/media3/ui/PlayerView;->access$500(Landroidx/media3/ui/PlayerView;)Landroid/os/Handler;

    move-result-object p2

    iget-object v0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->access$400(Landroidx/media3/ui/PlayerView;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    new-instance v1, Lo/PrivateMaxEntriesMapDrainStatus;

    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-direct {v1, p0}, Lo/PrivateMaxEntriesMapDrainStatus;-><init>(Landroidx/media3/ui/PlayerView;)V

    .line 1886
    invoke-virtual {p1, p2, v0, v1}, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;->write(Landroid/os/Handler;Landroid/view/SurfaceView;Ljava/lang/Runnable;)V

    :cond_34
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/collectAndResolveSubtypesByTypeId;)V
    .registers 5

    .line 1908
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$200(Landroidx/media3/ui/PlayerView;)Lo/isUnsafeBaseType;

    move-result-object p1

    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/isUnsafeBaseType;

    const/16 v0, 0x11

    .line 1910
    invoke-interface {p1, v0}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1911
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onPrepare()Lo/PolymorphicTypeValidator;

    move-result-object v0

    goto :goto_1b

    .line 1912
    :cond_19
    sget-object v0, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer:Lo/PolymorphicTypeValidator;

    .line 1913
    :goto_1b
    invoke-virtual {v0}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer()Z

    move-result v1

    if-nez v1, :cond_5d

    const/16 v1, 0x1e

    .line 1915
    invoke-interface {p1, v1}, Lo/isUnsafeBaseType;->write(I)Z

    move-result v1

    if-eqz v1, :cond_43

    .line 1916
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onPrepareFromSearch()Lo/collectAndResolveSubtypesByTypeId;

    move-result-object v1

    invoke-virtual {v1}, Lo/collectAndResolveSubtypesByTypeId;->write()Z

    move-result v1

    if-nez v1, :cond_43

    .line 1918
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onFastForward()I

    move-result p1

    iget-object v1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->write:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lo/PolymorphicTypeValidator;->RemoteActionCompatParcelizer(ILo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;Z)Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    move-result-object p1

    iget-object p1, p1, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->write:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    goto :goto_60

    .line 1919
    :cond_43
    iget-object v1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    if-eqz v1, :cond_60

    .line 1920
    invoke-virtual {v0, v1}, Lo/PolymorphicTypeValidator;->read(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_5d

    .line 1922
    iget-object v2, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->write:Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    .line 1923
    invoke-virtual {v0, v1, v2}, Lo/PolymorphicTypeValidator;->AudioAttributesCompatParcelizer(ILo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;)Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    move-result-object v0

    iget v0, v0, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    .line 1924
    invoke-interface {p1}, Lo/isUnsafeBaseType;->onMediaButtonEvent()I

    move-result p1

    if-ne p1, v0, :cond_5d

    return-void

    :cond_5d
    const/4 p1, 0x0

    .line 1929
    iput-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/Object;

    .line 1932
    :cond_60
    :goto_60
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Landroidx/media3/ui/PlayerView;->access$1100(Landroidx/media3/ui/PlayerView;Z)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(ZI)V
    .registers 3

    .line 1945
    iget-object p1, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p1}, Landroidx/media3/ui/PlayerView;->access$1200(Landroidx/media3/ui/PlayerView;)V

    .line 1946
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$1400(Landroidx/media3/ui/PlayerView;)V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 1979
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$1900(Landroidx/media3/ui/PlayerView;)V

    return-void
.end method

.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    .line 1972
    check-cast p1, Landroid/view/TextureView;

    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$1700(Landroidx/media3/ui/PlayerView;)I

    move-result p0

    invoke-static {p1, p0}, Landroidx/media3/ui/PlayerView;->access$1800(Landroid/view/TextureView;I)V

    return-void
.end method

.method public final read()V
    .registers 2

    .line 1996
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->access$2200(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 1997
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$2200(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;

    :cond_d
    return-void
.end method

.method public final write(Lo/idFromValue;)V
    .registers 3

    .line 1865
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {v0}, Landroidx/media3/ui/PlayerView;->access$100(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/SubtitleView;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 1866
    iget-object p0, p0, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView;->access$100(Landroidx/media3/ui/PlayerView;)Landroidx/media3/ui/SubtitleView;

    move-result-object p0

    iget-object p1, p1, Lo/idFromValue;->write:Lo/initExtraTracks;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    :cond_13
    return-void
.end method

###### Class kotlin.PrivateMaxEntriesMapDrainStatus (o.PrivateMaxEntriesMapDrainStatus)
.class public final synthetic Lo/PrivateMaxEntriesMapDrainStatus;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic write:Landroidx/media3/ui/PlayerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/PrivateMaxEntriesMapDrainStatus;->write:Landroidx/media3/ui/PlayerView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/PrivateMaxEntriesMapDrainStatus;->write:Landroidx/media3/ui/PlayerView;

    invoke-static {p0}, Landroidx/media3/ui/PlayerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Landroidx/media3/ui/PlayerView;)V

    return-void
.end method

###### Class androidx.media3.ui.PlayerView.IconCompatParcelizer (androidx.media3.ui.PlayerView$IconCompatParcelizer)
.class public final Landroidx/media3/ui/PlayerView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field write:Landroid/window/SurfaceSyncGroup;


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2012
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/ui/PlayerView$4;)V
    .registers 2

    .line 2012
    invoke-direct {p0}, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;-><init>()V

    return-void
.end method

.method public static synthetic IconCompatParcelizer()V
    .registers 0

    return-void
.end method


# virtual methods
.method public final synthetic IconCompatParcelizer(Landroid/view/SurfaceView;Ljava/lang/Runnable;)V
    .registers 5

    .line 2022
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getRootSurfaceControl()Landroid/view/AttachedSurfaceControl;

    move-result-object p1

    if-nez p1, :cond_7

    return-void

    .line 2027
    :cond_7
    new-instance v0, Landroid/window/SurfaceSyncGroup;

    const-string v1, "exo-sync-b-334901521"

    invoke-direct {v0, v1}, Landroid/window/SurfaceSyncGroup;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;->write:Landroid/window/SurfaceSyncGroup;

    .line 2028
    new-instance p0, Lo/PrivateMaxEntriesMapDrainStatus1;

    invoke-direct {p0}, Lo/PrivateMaxEntriesMapDrainStatus1;-><init>()V

    invoke-virtual {v0, p1, p0}, Landroid/window/SurfaceSyncGroup;->add(Landroid/view/AttachedSurfaceControl;Ljava/lang/Runnable;)Z

    move-result p0

    invoke-static {p0}, Lo/buildTypeSerializer;->write(Z)V

    .line 2029
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 2030
    new-instance p0, Landroid/view/SurfaceControl$Transaction;

    invoke-direct {p0}, Landroid/view/SurfaceControl$Transaction;-><init>()V

    invoke-interface {p1, p0}, Landroid/view/AttachedSurfaceControl;->applyTransactionOnDraw(Landroid/view/SurfaceControl$Transaction;)Z

    return-void
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 2

    .line 2036
    iget-object v0, p0, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;->write:Landroid/window/SurfaceSyncGroup;

    if-eqz v0, :cond_a

    .line 2037
    invoke-virtual {v0}, Landroid/window/SurfaceSyncGroup;->markSyncReady()V

    const/4 v0, 0x0

    .line 2038
    iput-object v0, p0, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;->write:Landroid/window/SurfaceSyncGroup;

    :cond_a
    return-void
.end method

.method public final write(Landroid/os/Handler;Landroid/view/SurfaceView;Ljava/lang/Runnable;)V
    .registers 5

    .line 2019
    new-instance v0, Lo/shouldDrainBuffers;

    invoke-direct {v0, p0, p2, p3}, Lo/shouldDrainBuffers;-><init>(Landroidx/media3/ui/PlayerView$IconCompatParcelizer;Landroid/view/SurfaceView;Ljava/lang/Runnable;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

###### Class kotlin.PrivateMaxEntriesMapDrainStatus1 (o.PrivateMaxEntriesMapDrainStatus1)
.class public final synthetic Lo/PrivateMaxEntriesMapDrainStatus1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    invoke-static {}, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;->IconCompatParcelizer()V

    return-void
.end method

###### Class kotlin.shouldDrainBuffers (o.shouldDrainBuffers)
.class public final synthetic Lo/shouldDrainBuffers;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroid/view/SurfaceView;

.field public final synthetic IconCompatParcelizer:Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

.field public final synthetic write:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerView$IconCompatParcelizer;Landroid/view/SurfaceView;Ljava/lang/Runnable;)V
    .registers 4

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/shouldDrainBuffers;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    iput-object p2, p0, Lo/shouldDrainBuffers;->AudioAttributesCompatParcelizer:Landroid/view/SurfaceView;

    iput-object p3, p0, Lo/shouldDrainBuffers;->write:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 0
    iget-object v0, p0, Lo/shouldDrainBuffers;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView$IconCompatParcelizer;

    iget-object v1, p0, Lo/shouldDrainBuffers;->AudioAttributesCompatParcelizer:Landroid/view/SurfaceView;

    iget-object p0, p0, Lo/shouldDrainBuffers;->write:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p0}, Landroidx/media3/ui/PlayerView$IconCompatParcelizer;->IconCompatParcelizer(Landroid/view/SurfaceView;Ljava/lang/Runnable;)V

    return-void
.end method

###### Class androidx.media3.ui.PlayerView.RemoteActionCompatParcelizer (androidx.media3.ui.PlayerView$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/media3/ui/PlayerView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation

###### Class androidx.media3.ui.PlayerView.read (androidx.media3.ui.PlayerView$read)
.class Landroidx/media3/ui/PlayerView$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# direct methods
.method public static AudioAttributesCompatParcelizer(Landroid/view/SurfaceView;)V
    .registers 2

    const/4 v0, 0x2

    .line 2007
    invoke-virtual {p0, v0}, Landroid/view/SurfaceView;->setSurfaceLifecycle(I)V

    return-void
.end method

###### Class androidx.media3.ui.PlayerView.write (androidx.media3.ui.PlayerView$write)
.class public interface abstract Landroidx/media3/ui/PlayerView$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/PlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation

###### Class kotlin.PrivateMaxEntriesMapAddTask (o.PrivateMaxEntriesMapAddTask)
.class public final synthetic Lo/PrivateMaxEntriesMapAddTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

.field public final synthetic write:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerView;Landroid/graphics/Bitmap;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/PrivateMaxEntriesMapAddTask;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    iput-object p2, p0, Lo/PrivateMaxEntriesMapAddTask;->write:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 0
    iget-object v0, p0, Lo/PrivateMaxEntriesMapAddTask;->IconCompatParcelizer:Landroidx/media3/ui/PlayerView;

    iget-object p0, p0, Lo/PrivateMaxEntriesMapAddTask;->write:Landroid/graphics/Bitmap;

    invoke-virtual {v0, p0}, Landroidx/media3/ui/PlayerView;->lambda$onImageAvailable$1$androidx-media3-ui-PlayerView(Landroid/graphics/Bitmap;)V

    return-void
.end method

###### Class kotlin.PrivateMaxEntriesMapBuilder (o.PrivateMaxEntriesMapBuilder)
.class public final synthetic Lo/PrivateMaxEntriesMapBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic write:Landroidx/media3/ui/PlayerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/PlayerView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/PrivateMaxEntriesMapBuilder;->write:Landroidx/media3/ui/PlayerView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 0
    iget-object p0, p0, Lo/PrivateMaxEntriesMapBuilder;->write:Landroidx/media3/ui/PlayerView;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/ui/PlayerView;->lambda$new$0$androidx-media3-ui-PlayerView(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
