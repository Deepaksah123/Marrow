###### Class androidx.media3.ui.DefaultTimeBar (androidx.media3.ui.DefaultTimeBar)
.class public Landroidx/media3/ui/DefaultTimeBar;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lo/PrivateMaxEntriesMapRemovalTask;


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field private final AudioAttributesImplApi21Parcelizer:F

.field private final AudioAttributesImplApi26Parcelizer:I

.field private final AudioAttributesImplBaseParcelizer:Landroid/graphics/Rect;

.field private IconCompatParcelizer:[J

.field private final MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

.field private MediaBrowserCompatItemReceiver:J

.field private MediaBrowserCompatMediaItem:I

.field private final MediaBrowserCompatSearchResultReceiver:Ljava/lang/StringBuilder;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private final MediaDescriptionCompat:I

.field private MediaMetadataCompat:J

.field private final RatingCompat:Ljava/util/Formatter;

.field private final RemoteActionCompatParcelizer:I

.field private final handleMediaPlayPauseIfPendingOnHandler:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lo/PrivateMaxEntriesMapRemovalTask$write;",
            ">;"
        }
    .end annotation
.end field

.field private onAddQueueItem:J

.field private onCommand:[Z

.field private onCustomAction:Landroid/graphics/Rect;

.field private final onFastForward:Landroid/graphics/Paint;

.field private final onMediaButtonEvent:Landroid/graphics/Paint;

.field private onPause:J

.field private final onPlay:Landroid/graphics/Rect;

.field private onPlayFromMediaId:J

.field private final onPlayFromSearch:Landroid/graphics/drawable/Drawable;

.field private final onPlayFromUri:I

.field private final onPrepare:I

.field private final onPrepareFromMediaId:I

.field private final onPrepareFromSearch:Landroid/graphics/Rect;

.field private final onPrepareFromUri:I

.field private final onRemoveQueueItem:Landroid/graphics/Paint;

.field private onRemoveQueueItemAt:F

.field private onRewind:Z

.field private onSeekTo:Landroid/animation/ValueAnimator;

.field private final onSetCaptioningEnabled:I

.field private final onSetPlaybackSpeed:Landroid/graphics/Point;

.field private final onSetRating:Ljava/lang/Runnable;

.field private onSetRepeatMode:Z

.field private final onSetShuffleMode:Landroid/graphics/Rect;

.field private final onSkipToQueueItem:Landroid/graphics/Paint;

.field private read:I

.field private final write:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 242
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/DefaultTimeBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 246
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/ui/DefaultTimeBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 250
    invoke-direct {p0, p1, p2, p3, p2}, Landroidx/media3/ui/DefaultTimeBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    .line 258
    invoke-direct/range {v0 .. v5}, Landroidx/media3/ui/DefaultTimeBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V
    .registers 24

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    .line 269
    invoke-direct/range {p0 .. p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 270
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    .line 271
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    .line 272
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer:Landroid/graphics/Rect;

    .line 273
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    .line 274
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, v0, Landroidx/media3/ui/DefaultTimeBar;->onFastForward:Landroid/graphics/Paint;

    .line 275
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    .line 276
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, v0, Landroidx/media3/ui/DefaultTimeBar;->onSkipToQueueItem:Landroid/graphics/Paint;

    .line 277
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    iput-object v5, v0, Landroidx/media3/ui/DefaultTimeBar;->write:Landroid/graphics/Paint;

    .line 278
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    iput-object v6, v0, Landroidx/media3/ui/DefaultTimeBar;->onMediaButtonEvent:Landroid/graphics/Paint;

    .line 279
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    iput-object v7, v0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItem:Landroid/graphics/Paint;

    const/4 v8, 0x1

    .line 280
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 281
    new-instance v9, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v9}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v9, v0, Landroidx/media3/ui/DefaultTimeBar;->handleMediaPlayPauseIfPendingOnHandler:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 282
    new-instance v9, Landroid/graphics/Point;

    invoke-direct {v9}, Landroid/graphics/Point;-><init>()V

    iput-object v9, v0, Landroidx/media3/ui/DefaultTimeBar;->onSetPlaybackSpeed:Landroid/graphics/Point;

    .line 285
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    .line 286
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    .line 287
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    iput v9, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer:F

    const/16 v10, -0x32

    .line 288
    invoke-static {v9, v10}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(FI)I

    move-result v10

    iput v10, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaDescriptionCompat:I

    const/4 v10, 0x4

    .line 289
    invoke-static {v9, v10}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(FI)I

    move-result v11

    const/16 v12, 0x1a

    .line 290
    invoke-static {v9, v12}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(FI)I

    move-result v12

    .line 291
    invoke-static {v9, v10}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(FI)I

    move-result v10

    const/16 v13, 0xc

    .line 292
    invoke-static {v9, v13}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(FI)I

    move-result v13

    const/4 v14, 0x0

    .line 293
    invoke-static {v9, v14}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(FI)I

    move-result v15

    const/16 v8, 0x10

    .line 294
    invoke-static {v9, v8}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(FI)I

    move-result v8

    if-eqz v1, :cond_145

    .line 298
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v9

    sget-object v14, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar:[I

    move-object/from16 v17, v5

    move-object/from16 v16, v6

    move/from16 v6, p3

    move/from16 v5, p5

    .line 299
    invoke-virtual {v9, v1, v14, v6, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 302
    :try_start_a7
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_scrubber_drawable:I

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    iput-object v5, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_bc

    .line 304
    invoke-direct {v0, v5}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(Landroid/graphics/drawable/Drawable;)Z

    .line 306
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v5

    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 308
    :cond_bc
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_bar_height:I

    .line 309
    invoke-virtual {v1, v5, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi26Parcelizer:I

    .line 310
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_touch_target_height:I

    .line 311
    invoke-virtual {v1, v5, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, v0, Landroidx/media3/ui/DefaultTimeBar;->onSetCaptioningEnabled:I

    .line 313
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_bar_gravity:I

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    iput v5, v0, Landroidx/media3/ui/DefaultTimeBar;->RemoteActionCompatParcelizer:I

    .line 314
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_ad_marker_width:I

    .line 315
    invoke-virtual {v1, v5, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer:I

    .line 317
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_scrubber_enabled_size:I

    .line 318
    invoke-virtual {v1, v5, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepare:I

    .line 320
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_scrubber_disabled_size:I

    .line 321
    invoke-virtual {v1, v5, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromUri:I

    .line 323
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_scrubber_dragged_size:I

    .line 324
    invoke-virtual {v1, v5, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromMediaId:I

    .line 326
    sget v5, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_played_color:I

    const/4 v6, -0x1

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    .line 327
    sget v8, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_scrubber_color:I

    .line 328
    invoke-virtual {v1, v8, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    .line 329
    sget v8, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_buffered_color:I

    const v9, -0x33000001    # -1.3421772E8f

    .line 330
    invoke-virtual {v1, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    .line 331
    sget v9, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_unplayed_color:I

    const v10, 0x33ffffff

    .line 332
    invoke-virtual {v1, v9, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    .line 333
    sget v10, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_ad_marker_color:I

    const v11, -0x4d000100

    .line 334
    invoke-virtual {v1, v10, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    .line 335
    sget v11, Lo/maximumCapacity$MediaDescriptionCompat;->DefaultTimeBar_played_ad_marker_color:I

    const v12, 0x33ffff00

    .line 336
    invoke-virtual {v1, v11, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v11

    .line 338
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 339
    invoke-virtual {v7, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 340
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 341
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v5, v17

    .line 342
    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v6, v16

    .line 343
    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setColor(I)V
    :try_end_13c
    .catchall {:try_start_a7 .. :try_end_13c} :catchall_140

    .line 345
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_176

    :catchall_140
    move-exception v0

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 346
    throw v0

    .line 348
    :cond_145
    iput v11, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi26Parcelizer:I

    .line 349
    iput v12, v0, Landroidx/media3/ui/DefaultTimeBar;->onSetCaptioningEnabled:I

    const/4 v1, 0x0

    .line 350
    iput v1, v0, Landroidx/media3/ui/DefaultTimeBar;->RemoteActionCompatParcelizer:I

    .line 351
    iput v10, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer:I

    .line 352
    iput v13, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepare:I

    .line 353
    iput v15, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromUri:I

    .line 354
    iput v8, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromMediaId:I

    const/4 v1, -0x1

    .line 355
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 356
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    const v1, -0x33000001    # -1.3421772E8f

    .line 357
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    const v1, 0x33ffffff

    .line 358
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColor(I)V

    const v1, -0x4d000100

    .line 359
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    const v1, 0x33ffff00

    .line 360
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v1, 0x0

    .line 361
    iput-object v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    .line 363
    :goto_176
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v1, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/StringBuilder;

    .line 364
    new-instance v2, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v2, v0, Landroidx/media3/ui/DefaultTimeBar;->RatingCompat:Ljava/util/Formatter;

    .line 365
    new-instance v1, Lo/checkNotNull;

    invoke-direct {v1, v0}, Lo/checkNotNull;-><init>(Landroidx/media3/ui/DefaultTimeBar;)V

    iput-object v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onSetRating:Ljava/lang/Runnable;

    .line 366
    iget-object v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_19e

    .line 367
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromUri:I

    goto :goto_1b2

    :cond_19e
    const/4 v2, 0x1

    .line 369
    iget v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromUri:I

    iget v3, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepare:I

    iget v4, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromMediaId:I

    .line 370
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromUri:I

    :goto_1b2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 373
    iput v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    .line 374
    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    .line 375
    new-instance v2, Lo/ceilingNextPowerOfTwo;

    invoke-direct {v2, v0}, Lo/ceilingNextPowerOfTwo;-><init>(Landroidx/media3/ui/DefaultTimeBar;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 380
    iput-wide v1, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    .line 381
    iput-wide v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onAddQueueItem:J

    const/16 v1, 0x14

    .line 382
    iput v1, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatMediaItem:I

    const/4 v1, 0x1

    .line 383
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 384
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/ui/DefaultTimeBar;->getImportantForAccessibility()I

    move-result v2

    if-nez v2, :cond_1df

    .line 385
    invoke-virtual {v0, v1}, Landroidx/media3/ui/DefaultTimeBar;->setImportantForAccessibility(I)V

    :cond_1df
    return-void
.end method

.method private static AudioAttributesCompatParcelizer(FI)I
    .registers 2

    int-to-float p1, p1

    div-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method private AudioAttributesCompatParcelizer(II)V
    .registers 5

    .line 967
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onCustomAction:Landroid/graphics/Rect;

    if-eqz v0, :cond_13

    .line 968
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-ne v0, p1, :cond_13

    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onCustomAction:Landroid/graphics/Rect;

    .line 969
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-ne v0, p2, :cond_13

    return-void

    .line 973
    :cond_13
    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onCustomAction:Landroid/graphics/Rect;

    .line 974
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->setSystemGestureExclusionRects(Ljava/util/List;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;)V
    .registers 18

    move-object/from16 v0, p0

    .line 894
    iget-object v1, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    .line 895
    iget-object v2, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    div-int/lit8 v3, v1, 0x2

    sub-int/2addr v2, v3

    add-int/2addr v1, v2

    .line 897
    iget-wide v3, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-gtz v3, :cond_2e

    .line 898
    iget-object v3, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    int-to-float v5, v3

    int-to-float v6, v2

    iget-object v2, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    int-to-float v7, v2

    int-to-float v8, v1

    iget-object v9, v0, Landroidx/media3/ui/DefaultTimeBar;->onSkipToQueueItem:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void

    .line 901
    :cond_2e
    iget-object v3, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 902
    iget-object v4, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 903
    iget-object v5, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget-object v6, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 904
    iget-object v6, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->right:I

    if-ge v5, v6, :cond_5b

    int-to-float v8, v5

    int-to-float v9, v2

    .line 905
    iget-object v5, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    int-to-float v10, v5

    int-to-float v11, v1

    iget-object v12, v0, Landroidx/media3/ui/DefaultTimeBar;->onSkipToQueueItem:Landroid/graphics/Paint;

    move-object/from16 v7, p1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 907
    :cond_5b
    iget-object v5, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-le v4, v3, :cond_70

    int-to-float v6, v3

    int-to-float v7, v2

    int-to-float v8, v4

    int-to-float v9, v1

    .line 909
    iget-object v10, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    move-object/from16 v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 911
    :cond_70
    iget-object v3, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    if-lez v3, :cond_8b

    .line 912
    iget-object v3, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    int-to-float v5, v3

    int-to-float v6, v2

    iget-object v3, v0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v7, v3

    int-to-float v8, v1

    iget-object v9, v0, Landroidx/media3/ui/DefaultTimeBar;->onFastForward:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 914
    :cond_8b
    iget v3, v0, Landroidx/media3/ui/DefaultTimeBar;->read:I

    if-eqz v3, :cond_ef

    .line 917
    iget-object v3, v0, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer:[J

    invoke-static {v3}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [J

    .line 918
    iget-object v4, v0, Landroidx/media3/ui/DefaultTimeBar;->onCommand:[Z

    invoke-static {v4}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Z

    .line 919
    iget v5, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer:I

    div-int/lit8 v5, v5, 0x2

    const/4 v6, 0x0

    move v7, v6

    .line 920
    :goto_a5
    iget v8, v0, Landroidx/media3/ui/DefaultTimeBar;->read:I

    if-ge v7, v8, :cond_ef

    .line 921
    aget-wide v9, v3, v7

    const-wide/16 v11, 0x0

    iget-wide v13, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    invoke-static/range {v9 .. v14}, Lo/LaissezFaireSubTypeValidator;->read(JJJ)J

    move-result-wide v8

    .line 922
    iget-object v10, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    .line 923
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v10

    int-to-long v10, v10

    mul-long/2addr v10, v8

    iget-wide v8, v0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    div-long/2addr v10, v8

    long-to-int v8, v10

    .line 924
    iget-object v9, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->left:I

    iget-object v10, v0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    .line 926
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v10

    iget v11, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer:I

    sub-int/2addr v10, v11

    sub-int/2addr v8, v5

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-static {v10, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    add-int/2addr v9, v8

    .line 927
    aget-boolean v8, v4, v7

    if-eqz v8, :cond_dd

    iget-object v8, v0, Landroidx/media3/ui/DefaultTimeBar;->onMediaButtonEvent:Landroid/graphics/Paint;

    goto :goto_df

    :cond_dd
    iget-object v8, v0, Landroidx/media3/ui/DefaultTimeBar;->write:Landroid/graphics/Paint;

    :goto_df
    move-object v15, v8

    int-to-float v11, v9

    int-to-float v12, v2

    .line 928
    iget v8, v0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer:I

    add-int/2addr v9, v8

    int-to-float v13, v9

    int-to-float v14, v1

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_a5

    :cond_ef
    return-void
.end method

.method private AudioAttributesCompatParcelizer(FF)Z
    .registers 3

    .line 890
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result p0

    return p0
.end method

.method private AudioAttributesCompatParcelizer(J)Z
    .registers 12

    .line 840
    iget-wide v4, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    const/4 v6, 0x0

    if-gtz v0, :cond_a

    return v6

    .line 843
    :cond_a
    iget-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-eqz v0, :cond_11

    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPause:J

    goto :goto_13

    :cond_11
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromMediaId:J

    :goto_13
    move-wide v7, v0

    add-long v0, v7, p1

    const-wide/16 v2, 0x0

    .line 844
    invoke-static/range {v0 .. v5}, Lo/LaissezFaireSubTypeValidator;->read(JJJ)J

    move-result-wide p1

    cmp-long v0, p1, v7

    if-nez v0, :cond_21

    return v6

    .line 848
    :cond_21
    iget-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-nez v0, :cond_29

    .line 849
    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/DefaultTimeBar;->read(J)V

    goto :goto_2c

    .line 851
    :cond_29
    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/DefaultTimeBar;->RemoteActionCompatParcelizer(J)V

    .line 853
    :goto_2c
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer()V

    const/4 p0, 0x1

    return p0
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;I)Z
    .registers 4

    .line 992
    sget v0, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_e

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result p0

    if-eqz p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method private AudioAttributesImplApi21Parcelizer()V
    .registers 7

    .line 858
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 859
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 860
    iget-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-eqz v0, :cond_15

    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPause:J

    goto :goto_17

    :cond_15
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromMediaId:J

    .line 861
    :goto_17
    iget-wide v2, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_5c

    .line 862
    iget-object v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-long v2, v2

    iget-wide v4, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatItemReceiver:J

    mul-long/2addr v2, v4

    iget-wide v4, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    div-long/2addr v2, v4

    long-to-int v2, v2

    .line 863
    iget-object v3, p0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer:Landroid/graphics/Rect;

    iget-object v4, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v2

    iget-object v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v3, Landroid/graphics/Rect;->right:I

    .line 864
    iget-object v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v2, v0

    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    div-long/2addr v2, v0

    long-to-int v0, v2

    .line 865
    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget-object v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v0

    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v1, Landroid/graphics/Rect;->right:I

    goto :goto_6c

    .line 867
    :cond_5c
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 868
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 870
    :goto_6c
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer()J
    .registers 6

    .line 982
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onAddQueueItem:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_18

    .line 983
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_14

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_14
    iget p0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatMediaItem:I

    int-to-long v2, p0

    div-long/2addr v0, v2

    :cond_18
    return-wide v0
.end method

.method private AudioAttributesImplBaseParcelizer()Ljava/lang/String;
    .registers 5

    .line 978
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->RatingCompat:Ljava/util/Formatter;

    iget-wide v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromMediaId:J

    invoke-static {v0, v1, v2, v3}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static IconCompatParcelizer(FI)I
    .registers 2

    int-to-float p1, p1

    mul-float/2addr p1, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr p1, p0

    float-to-int p0, p1

    return p0
.end method

.method private IconCompatParcelizer(F)V
    .registers 4

    .line 874
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    float-to-int p1, p1

    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->right:I

    invoke-static {p1, v1, p0}, Lo/LaissezFaireSubTypeValidator;->write(III)I

    move-result p0

    iput p0, v0, Landroid/graphics/Rect;->right:I

    return-void
.end method

.method private IconCompatParcelizer(Landroid/graphics/Canvas;)V
    .registers 9

    .line 933
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_9

    return-void

    .line 936
    :cond_9
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-static {v0, v1, v2}, Lo/LaissezFaireSubTypeValidator;->write(III)I

    move-result v0

    .line 937
    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    .line 938
    iget-object v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_4c

    .line 940
    iget-boolean v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-nez v2, :cond_39

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v2

    if-nez v2, :cond_39

    .line 942
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_36

    iget v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepare:I

    goto :goto_3b

    :cond_36
    iget v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromUri:I

    goto :goto_3b

    .line 941
    :cond_39
    iget v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromMediaId:I

    :goto_3b
    int-to-float v2, v2

    .line 943
    iget v3, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    mul-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    float-to-int v2, v2

    int-to-float v0, v0

    int-to-float v1, v1

    int-to-float v2, v2

    .line 944
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItem:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, p0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void

    .line 946
    :cond_4c
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 947
    iget-object v3, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    mul-float/2addr v3, v4

    float-to-int v3, v3

    .line 948
    iget-object v4, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    div-int/lit8 v2, v2, 0x2

    div-int/lit8 v3, v3, 0x2

    sub-int v5, v0, v2

    sub-int v6, v1, v3

    add-int/2addr v0, v2

    add-int/2addr v1, v3

    invoke-virtual {v4, v5, v6, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 953
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/graphics/drawable/Drawable;)Z
    .registers 4

    .line 988
    sget v0, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_12

    invoke-virtual {p0}, Landroidx/media3/ui/DefaultTimeBar;->getLayoutDirection()I

    move-result p0

    invoke-static {p1, p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;I)Z

    move-result p0

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()J
    .registers 5

    .line 883
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_26

    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_26

    .line 886
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromSearch:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    mul-long/2addr v0, v2

    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result p0

    int-to-long v2, p0

    div-long/2addr v0, v2

    return-wide v0

    :cond_26
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private MediaBrowserCompatItemReceiver()V
    .registers 3

    .line 958
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_19

    .line 959
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    .line 960
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 961
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_19
    return-void
.end method

.method private RemoteActionCompatParcelizer(J)V
    .registers 5

    .line 810
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPause:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_1e

    .line 813
    iput-wide p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPause:J

    .line 814
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->handleMediaPlayPauseIfPendingOnHandler:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/PrivateMaxEntriesMapRemovalTask$write;

    .line 815
    invoke-interface {v0, p1, p2}, Lo/PrivateMaxEntriesMapRemovalTask$write;->IconCompatParcelizer(J)V

    goto :goto_e

    :cond_1e
    return-void
.end method

.method private read(Landroid/view/MotionEvent;)Landroid/graphics/Point;
    .registers 4

    .line 878
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetPlaybackSpeed:Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Point;->set(II)V

    .line 879
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetPlaybackSpeed:Landroid/graphics/Point;

    return-object p0
.end method

.method private read(J)V
    .registers 5

    .line 797
    iput-wide p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPause:J

    const/4 v0, 0x1

    .line 798
    iput-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    .line 799
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 800
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_11

    .line 802
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 804
    :cond_11
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->handleMediaPlayPauseIfPendingOnHandler:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_17
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/PrivateMaxEntriesMapRemovalTask$write;

    .line 805
    invoke-interface {v0, p1, p2}, Lo/PrivateMaxEntriesMapRemovalTask$write;->RemoteActionCompatParcelizer(J)V

    goto :goto_17

    :cond_27
    return-void
.end method

.method private write(Z)V
    .registers 6

    .line 820
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRating:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 821
    iput-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    .line 822
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 823
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_14

    .line 825
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 827
    :cond_14
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 828
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->handleMediaPlayPauseIfPendingOnHandler:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/PrivateMaxEntriesMapRemovalTask$write;

    .line 829
    iget-wide v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onPause:J

    invoke-interface {v1, v2, v3, p1}, Lo/PrivateMaxEntriesMapRemovalTask$write;->RemoteActionCompatParcelizer(JZ)V

    goto :goto_1d

    :cond_2f
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 391
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 392
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_d
    const/4 v0, 0x0

    .line 394
    iput-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onRewind:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 395
    iput v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    .line 396
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final synthetic IconCompatParcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 365
    invoke-direct {p0, v0}, Landroidx/media3/ui/DefaultTimeBar;->write(Z)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 5

    .line 405
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 406
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_d
    const/4 v0, 0x0

    .line 408
    iput-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onRewind:Z

    .line 409
    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    iget v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    const/4 v3, 0x2

    new-array v3, v3, [F

    aput v2, v3, v0

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    aput v0, v3, v2

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 410
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 411
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method protected drawableStateChanged()V
    .registers 1

    .line 683
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 684
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method public jumpDrawablesToCurrentState()V
    .registers 1

    .line 689
    invoke-super {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 690
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    if-eqz p0, :cond_a

    .line 691
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    :cond_a
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 2

    .line 591
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 592
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(Landroid/graphics/Canvas;)V

    .line 593
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(Landroid/graphics/Canvas;)V

    .line 594
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .registers 4

    .line 675
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 676
    iget-boolean p2, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-eqz p2, :cond_d

    if-nez p1, :cond_d

    const/4 p1, 0x0

    .line 677
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->write(Z)V

    :cond_d
    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    .line 747
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 748
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_15

    .line 749
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 751
    :cond_15
    const-string p0, "android.widget.SeekBar"

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 6

    .line 756
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 757
    const-string v0, "android.widget.SeekBar"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 758
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 759
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-gtz p0, :cond_18

    return-void

    .line 762
    :cond_18
    sget p0, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 v0, 0x15

    if-lt p0, v0, :cond_29

    .line 763
    sget-object p0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_FORWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    .line 764
    sget-object p0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_BACKWARD:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    return-void

    :cond_29
    const/16 p0, 0x1000

    .line 766
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    const/16 p0, 0x2000

    .line 767
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 7

    .line 645
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_30

    .line 646
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi26Parcelizer()J

    move-result-wide v0

    const/16 v2, 0x42

    const/4 v3, 0x1

    if-eq p1, v2, :cond_27

    packed-switch p1, :pswitch_data_36

    goto :goto_30

    :pswitch_13
    neg-long v0, v0

    .line 652
    :pswitch_14
    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(J)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 653
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRating:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 654
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRating:Ljava/lang/Runnable;

    const-wide/16 v0, 0x3e8

    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return v3

    .line 660
    :cond_27
    :pswitch_27
    iget-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-eqz v0, :cond_30

    const/4 p1, 0x0

    .line 661
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->write(Z)V

    return v3

    .line 669
    :cond_30
    :goto_30
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0

    nop

    :pswitch_data_36
    .packed-switch 0x15
        :pswitch_13
        :pswitch_14
        :pswitch_27
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .registers 10

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 713
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    .line 714
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    .line 717
    iget-boolean p3, p0, Landroidx/media3/ui/DefaultTimeBar;->onRewind:Z

    const/4 v0, 0x0

    if-eqz p3, :cond_11

    move p3, v0

    goto :goto_13

    :cond_11
    iget p3, p0, Landroidx/media3/ui/DefaultTimeBar;->onPrepareFromUri:I

    .line 718
    :goto_13
    iget v1, p0, Landroidx/media3/ui/DefaultTimeBar;->RemoteActionCompatParcelizer:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_34

    .line 719
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int v1, p5, v1

    iget v2, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetCaptioningEnabled:I

    sub-int/2addr v1, v2

    .line 721
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    iget v3, p0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi26Parcelizer:I

    sub-int v2, p5, v2

    sub-int/2addr v2, v3

    div-int/lit8 v3, v3, 0x2

    sub-int v3, p3, v3

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sub-int/2addr v2, v0

    goto :goto_40

    .line 723
    :cond_34
    iget v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetCaptioningEnabled:I

    sub-int v0, p5, v0

    div-int/lit8 v1, v0, 0x2

    .line 724
    iget v0, p0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi26Parcelizer:I

    sub-int v0, p5, v0

    div-int/lit8 v2, v0, 0x2

    .line 726
    :goto_40
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    sub-int p2, p4, p2

    iget v3, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetCaptioningEnabled:I

    add-int/2addr v3, v1

    invoke-virtual {v0, p1, v1, p2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 727
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    iget-object p2, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, p3

    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, p3

    iget p3, p0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi26Parcelizer:I

    add-int/2addr p3, v2

    invoke-virtual {p1, p2, v2, v0, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 732
    sget p1, Lo/LaissezFaireSubTypeValidator;->MediaBrowserCompatCustomActionResultReceiver:I

    const/16 p2, 0x1d

    if-lt p1, p2, :cond_65

    .line 733
    invoke-direct {p0, p4, p5}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(II)V

    .line 735
    :cond_65
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 5

    .line 697
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 698
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    if-nez v0, :cond_d

    .line 701
    iget p2, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetCaptioningEnabled:I

    goto :goto_17

    :cond_d
    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_17

    .line 704
    iget v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetCaptioningEnabled:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 705
    :cond_17
    :goto_17
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Landroidx/media3/ui/DefaultTimeBar;->setMeasuredDimension(II)V

    .line 706
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatItemReceiver()V

    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 3

    .line 740
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromSearch:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_d

    invoke-static {v0, p1}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(Landroid/graphics/drawable/Drawable;I)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 741
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_d
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 9

    .line 599
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_75

    iget-wide v2, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_75

    .line 602
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->read(Landroid/view/MotionEvent;)Landroid/graphics/Point;

    move-result-object v0

    .line 603
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 604
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 605
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_5c

    const/4 v5, 0x3

    if-eq v3, v4, :cond_4d

    const/4 v6, 0x2

    if-eq v3, v6, :cond_27

    if-eq v3, v5, :cond_4d

    goto :goto_75

    .line 616
    :cond_27
    iget-boolean p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-eqz p1, :cond_75

    .line 617
    iget p1, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaDescriptionCompat:I

    if-ge v0, p1, :cond_39

    .line 618
    iget p1, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    sub-int/2addr v2, p1

    .line 619
    div-int/2addr v2, v5

    add-int/2addr p1, v2

    int-to-float p1, p1

    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(F)V

    goto :goto_3f

    .line 621
    :cond_39
    iput v2, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    int-to-float p1, v2

    .line 622
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(F)V

    .line 624
    :goto_3f
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatCustomActionResultReceiver()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/DefaultTimeBar;->RemoteActionCompatParcelizer(J)V

    .line 625
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer()V

    .line 626
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v4

    .line 632
    :cond_4d
    iget-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-eqz v0, :cond_75

    .line 633
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-ne p1, v5, :cond_58

    move v1, v4

    :cond_58
    invoke-direct {p0, v1}, Landroidx/media3/ui/DefaultTimeBar;->write(Z)V

    return v4

    :cond_5c
    int-to-float p1, v2

    int-to-float v0, v0

    .line 607
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(FF)Z

    move-result v0

    if-eqz v0, :cond_75

    .line 608
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer(F)V

    .line 609
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatCustomActionResultReceiver()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Landroidx/media3/ui/DefaultTimeBar;->read(J)V

    .line 610
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer()V

    .line 611
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v4

    :cond_75
    :goto_75
    return v1
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .registers 8

    .line 773
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_8

    return v0

    .line 776
    :cond_8
    iget-wide v1, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    const/4 v1, 0x0

    if-gtz p2, :cond_12

    return v1

    :cond_12
    const/16 p2, 0x2000

    if-ne p1, p2, :cond_25

    .line 780
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi26Parcelizer()J

    move-result-wide p1

    neg-long p1, p1

    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(J)Z

    move-result p1

    if-eqz p1, :cond_36

    .line 781
    invoke-direct {p0, v1}, Landroidx/media3/ui/DefaultTimeBar;->write(Z)V

    goto :goto_36

    :cond_25
    const/16 p2, 0x1000

    if-ne p1, p2, :cond_3b

    .line 784
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi26Parcelizer()J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(J)Z

    move-result p1

    if-eqz p1, :cond_36

    .line 785
    invoke-direct {p0, v1}, Landroidx/media3/ui/DefaultTimeBar;->write(Z)V

    :cond_36
    :goto_36
    const/4 p1, 0x4

    .line 790
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    return v0

    :cond_3b
    return v1
.end method

.method public final read()V
    .registers 5

    .line 430
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 431
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 433
    :cond_d
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    iget v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v1, 0x0

    const/4 v3, 0x1

    aput v1, v2, v3

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 434
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 435
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final synthetic read(Landroid/animation/ValueAnimator;)V
    .registers 2

    .line 377
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    .line 378
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final read(Lo/PrivateMaxEntriesMapRemovalTask$write;)V
    .registers 2

    .line 507
    iget-object p0, p0, Landroidx/media3/ui/DefaultTimeBar;->handleMediaPlayPauseIfPendingOnHandler:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final read(Z)V
    .registers 3

    .line 416
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 417
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSeekTo:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 419
    :cond_d
    iput-boolean p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onRewind:Z

    const/4 p1, 0x0

    .line 420
    iput p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItemAt:F

    .line 421
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setAdGroupTimesMs([J[ZI)V
    .registers 5

    if-eqz p3, :cond_8

    if-eqz p1, :cond_6

    if-nez p2, :cond_8

    :cond_6
    const/4 v0, 0x0

    goto :goto_9

    :cond_8
    const/4 v0, 0x1

    .line 571
    :goto_9
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 573
    iput p3, p0, Landroidx/media3/ui/DefaultTimeBar;->read:I

    .line 574
    iput-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer:[J

    .line 575
    iput-object p2, p0, Landroidx/media3/ui/DefaultTimeBar;->onCommand:[Z

    .line 576
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public setAdMarkerColor(I)V
    .registers 3

    .line 488
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->write:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 489
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setBufferedColor(I)V
    .registers 3

    .line 467
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 468
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setBufferedPosition(J)V
    .registers 5

    .line 541
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatItemReceiver:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_7

    return-void

    .line 544
    :cond_7
    iput-wide p1, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatItemReceiver:J

    .line 545
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public setDuration(J)V
    .registers 5

    .line 550
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_7

    return-void

    .line 553
    :cond_7
    iput-wide p1, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    .line 554
    iget-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-eqz v0, :cond_1a

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v0

    if-nez p1, :cond_1a

    const/4 p1, 0x1

    .line 555
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->write(Z)V

    .line 557
    :cond_1a
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public setEnabled(Z)V
    .registers 3

    .line 583
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 584
    iget-boolean v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetRepeatMode:Z

    if-eqz v0, :cond_d

    if-nez p1, :cond_d

    const/4 p1, 0x1

    .line 585
    invoke-direct {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->write(Z)V

    :cond_d
    return-void
.end method

.method public setKeyCountIncrement(I)V
    .registers 4

    if-lez p1, :cond_4

    const/4 v0, 0x1

    goto :goto_5

    :cond_4
    const/4 v0, 0x0

    .line 524
    :goto_5
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 525
    iput p1, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatMediaItem:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 526
    iput-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onAddQueueItem:J

    return-void
.end method

.method public setKeyTimeIncrement(J)V
    .registers 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    .line 517
    :goto_9
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    const/4 v0, -0x1

    .line 518
    iput v0, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaBrowserCompatMediaItem:I

    .line 519
    iput-wide p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onAddQueueItem:J

    return-void
.end method

.method public setPlayedAdMarkerColor(I)V
    .registers 3

    .line 498
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onMediaButtonEvent:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 499
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setPlayedColor(I)V
    .registers 3

    .line 445
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onFastForward:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 446
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setPosition(J)V
    .registers 5

    .line 531
    iget-wide v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromMediaId:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_7

    return-void

    .line 534
    :cond_7
    iput-wide p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlayFromMediaId:J

    .line 535
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplBaseParcelizer()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 536
    invoke-direct {p0}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public setScrubberColor(I)V
    .registers 3

    .line 455
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onRemoveQueueItem:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 456
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setUnplayedColor(I)V
    .registers 3

    .line 478
    iget-object v0, p0, Landroidx/media3/ui/DefaultTimeBar;->onSkipToQueueItem:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 479
    iget-object p1, p0, Landroidx/media3/ui/DefaultTimeBar;->onSetShuffleMode:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final write()J
    .registers 6

    .line 562
    iget v0, p0, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesImplApi21Parcelizer:F

    iget-object v1, p0, Landroidx/media3/ui/DefaultTimeBar;->onPlay:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/media3/ui/DefaultTimeBar;->AudioAttributesCompatParcelizer(FI)I

    move-result v0

    if-eqz v0, :cond_22

    .line 563
    iget-wide v1, p0, Landroidx/media3/ui/DefaultTimeBar;->MediaMetadataCompat:J

    const-wide/16 v3, 0x0

    cmp-long p0, v1, v3

    if-eqz p0, :cond_22

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p0, v1, v3

    if-eqz p0, :cond_22

    int-to-long v3, v0

    .line 565
    div-long/2addr v1, v3

    return-wide v1

    :cond_22
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0
.end method

###### Class kotlin.ceilingNextPowerOfTwo (o.ceilingNextPowerOfTwo)
.class public final synthetic Lo/ceilingNextPowerOfTwo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic read:Landroidx/media3/ui/DefaultTimeBar;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/DefaultTimeBar;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ceilingNextPowerOfTwo;->read:Landroidx/media3/ui/DefaultTimeBar;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    .line 0
    iget-object p0, p0, Lo/ceilingNextPowerOfTwo;->read:Landroidx/media3/ui/DefaultTimeBar;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/DefaultTimeBar;->read(Landroid/animation/ValueAnimator;)V

    return-void
.end method

###### Class kotlin.checkNotNull (o.checkNotNull)
.class public final synthetic Lo/checkNotNull;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/media3/ui/DefaultTimeBar;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/DefaultTimeBar;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/checkNotNull;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/DefaultTimeBar;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/checkNotNull;->AudioAttributesCompatParcelizer:Landroidx/media3/ui/DefaultTimeBar;

    invoke-virtual {p0}, Landroidx/media3/ui/DefaultTimeBar;->IconCompatParcelizer()V

    return-void
.end method
