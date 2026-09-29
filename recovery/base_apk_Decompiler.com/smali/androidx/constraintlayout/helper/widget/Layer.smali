###### Class androidx.constraintlayout.helper.widget.Layer (androidx.constraintlayout.helper.widget.Layer)
.class public Landroidx/constraintlayout/helper/widget/Layer;
.super Landroidx/constraintlayout/widget/ConstraintHelper;
.source "SourceFile"


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Z

.field private AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:F

.field private MediaBrowserCompatCustomActionResultReceiver:F

.field private MediaBrowserCompatMediaItem:F

.field private MediaBrowserCompatSearchResultReceiver:F

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

.field private MediaDescriptionCompat:F

.field private MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private RatingCompat:F

.field private handleMediaPlayPauseIfPendingOnHandler:F

.field private onAddQueueItem:F

.field private onCommand:Z

.field private onCustomAction:F

.field private onMediaButtonEvent:F

.field private onPause:F

.field private onPlay:[Landroid/view/View;

.field private onPlayFromMediaId:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 59
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 37
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCustomAction:F

    .line 38
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onAddQueueItem:F

    .line 39
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 41
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->handleMediaPlayPauseIfPendingOnHandler:F

    .line 42
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlayFromMediaId:F

    .line 43
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 44
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    .line 46
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatMediaItem:F

    .line 47
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->RatingCompat:F

    .line 48
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatSearchResultReceiver:F

    .line 49
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaDescriptionCompat:F

    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCommand:Z

    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlay:[Landroid/view/View;

    const/4 p1, 0x0

    .line 52
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onMediaButtonEvent:F

    .line 53
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPause:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 63
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 37
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCustomAction:F

    .line 38
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onAddQueueItem:F

    .line 39
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    const/high16 p2, 0x3f800000    # 1.0f

    .line 41
    iput p2, p0, Landroidx/constraintlayout/helper/widget/Layer;->handleMediaPlayPauseIfPendingOnHandler:F

    .line 42
    iput p2, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlayFromMediaId:F

    .line 43
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 44
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    .line 46
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatMediaItem:F

    .line 47
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->RatingCompat:F

    .line 48
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatSearchResultReceiver:F

    .line 49
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaDescriptionCompat:F

    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCommand:Z

    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlay:[Landroid/view/View;

    const/4 p1, 0x0

    .line 52
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onMediaButtonEvent:F

    .line 53
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPause:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 67
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 37
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCustomAction:F

    .line 38
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onAddQueueItem:F

    .line 39
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    const/high16 p2, 0x3f800000    # 1.0f

    .line 41
    iput p2, p0, Landroidx/constraintlayout/helper/widget/Layer;->handleMediaPlayPauseIfPendingOnHandler:F

    .line 42
    iput p2, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlayFromMediaId:F

    .line 43
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 44
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    .line 46
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatMediaItem:F

    .line 47
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->RatingCompat:F

    .line 48
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatSearchResultReceiver:F

    .line 49
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaDescriptionCompat:F

    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCommand:Z

    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlay:[Landroid/view/View;

    const/4 p1, 0x0

    .line 52
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onMediaButtonEvent:F

    .line 53
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPause:F

    return-void
.end method

.method private IconCompatParcelizer()V
    .registers 14

    .line 319
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_8c

    .line 322
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlay:[Landroid/view/View;

    if-nez v0, :cond_b

    .line 323
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->read()V

    .line 325
    :cond_b
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->RemoteActionCompatParcelizer()V

    .line 327
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_19

    const-wide/16 v0, 0x0

    goto :goto_20

    :cond_19
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    .line 328
    :goto_20
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    .line 329
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 330
    iget v1, p0, Landroidx/constraintlayout/helper/widget/Layer;->handleMediaPlayPauseIfPendingOnHandler:F

    .line 331
    iget v3, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlayFromMediaId:F

    neg-float v4, v3

    const/4 v5, 0x0

    .line 335
    :goto_30
    iget v6, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-ge v5, v6, :cond_8c

    .line 336
    iget-object v6, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlay:[Landroid/view/View;

    aget-object v6, v6, v5

    .line 337
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v7

    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v8

    add-int/2addr v7, v8

    div-int/lit8 v7, v7, 0x2

    .line 338
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v8

    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v9

    add-int/2addr v8, v9

    div-int/lit8 v8, v8, 0x2

    int-to-float v7, v7

    .line 339
    iget v9, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    sub-float/2addr v7, v9

    int-to-float v8, v8

    .line 340
    iget v9, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    sub-float/2addr v8, v9

    .line 341
    iget v9, p0, Landroidx/constraintlayout/helper/widget/Layer;->onMediaButtonEvent:F

    .line 342
    iget v10, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPause:F

    mul-float v11, v1, v0

    mul-float/2addr v11, v7

    mul-float v12, v4, v2

    mul-float/2addr v12, v8

    add-float/2addr v11, v12

    sub-float/2addr v11, v7

    add-float/2addr v11, v9

    .line 344
    invoke-virtual {v6, v11}, Landroid/view/View;->setTranslationX(F)V

    mul-float v9, v1, v2

    mul-float/2addr v7, v9

    mul-float v9, v3, v0

    mul-float/2addr v9, v8

    add-float/2addr v7, v9

    sub-float/2addr v7, v8

    add-float/2addr v7, v10

    .line 345
    invoke-virtual {v6, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 346
    iget v7, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlayFromMediaId:F

    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleY(F)V

    .line 347
    iget v7, p0, Landroidx/constraintlayout/helper/widget/Layer;->handleMediaPlayPauseIfPendingOnHandler:F

    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleX(F)V

    .line 348
    iget v7, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-nez v7, :cond_89

    .line 349
    iget v7, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    invoke-virtual {v6, v7}, Landroid/view/View;->setRotation(F)V

    :cond_89
    add-int/lit8 v5, v5, 0x1

    goto :goto_30

    :cond_8c
    return-void
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 9

    .line 270
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_ad

    .line 273
    iget-boolean v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCommand:Z

    if-nez v0, :cond_1a

    .line 274
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1a

    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_ad

    .line 278
    :cond_1a
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCustomAction:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_33

    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onAddQueueItem:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_33

    .line 312
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onAddQueueItem:F

    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    .line 313
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCustomAction:F

    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    return-void

    .line 279
    :cond_33
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/helper/widget/Layer;->write(Landroidx/constraintlayout/widget/ConstraintLayout;)[Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    .line 281
    aget-object v2, v0, v1

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 282
    aget-object v3, v0, v1

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    .line 283
    aget-object v4, v0, v1

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    .line 284
    aget-object v5, v0, v1

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v5

    .line 286
    :goto_52
    iget v6, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-ge v1, v6, :cond_7b

    .line 287
    aget-object v6, v0, v1

    .line 288
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 289
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 290
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v7

    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 291
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_52

    :cond_7b
    int-to-float v0, v4

    .line 294
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatMediaItem:F

    int-to-float v0, v5

    .line 295
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->RatingCompat:F

    int-to-float v0, v2

    .line 296
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatSearchResultReceiver:F

    int-to-float v0, v3

    .line 297
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaDescriptionCompat:F

    .line 299
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCustomAction:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_96

    add-int/2addr v2, v4

    .line 300
    div-int/lit8 v2, v2, 0x2

    int-to-float v0, v2

    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    goto :goto_9a

    .line 302
    :cond_96
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCustomAction:F

    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 304
    :goto_9a
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onAddQueueItem:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_a9

    add-int/2addr v3, v5

    .line 305
    div-int/lit8 v3, v3, 0x2

    int-to-float v0, v3

    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    return-void

    .line 308
    :cond_a9
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onAddQueueItem:F

    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    :cond_ad
    :goto_ad
    return-void
.end method

.method private read()V
    .registers 5

    .line 253
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_2d

    .line 256
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-eqz v0, :cond_2d

    .line 260
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlay:[Landroid/view/View;

    if-eqz v0, :cond_11

    array-length v0, v0

    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-eq v0, v1, :cond_17

    .line 261
    :cond_11
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlay:[Landroid/view/View;

    :cond_17
    const/4 v0, 0x0

    .line 263
    :goto_18
    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-ge v0, v1, :cond_2d

    .line 264
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->IconCompatParcelizer:[I

    aget v1, v1, v0

    .line 265
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlay:[Landroid/view/View;

    iget-object v3, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->MediaBrowserCompatItemReceiver(I)Landroid/view/View;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_18

    :cond_2d
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 7

    .line 75
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 76
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer:Z

    if-eqz p1, :cond_30

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/_isBlank$read;->ConstraintLayout_Layout:[I

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 79
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    :goto_16
    if-ge v0, v1, :cond_2d

    .line 81
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 82
    sget v3, Lo/_isBlank$read;->ConstraintLayout_Layout_android_visibility:I

    const/4 v4, 0x1

    if-ne v2, v3, :cond_24

    .line 83
    iput-boolean v4, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplApi21Parcelizer:Z

    goto :goto_2a

    .line 84
    :cond_24
    sget v3, Lo/_isBlank$read;->ConstraintLayout_Layout_android_elevation:I

    if-ne v2, v3, :cond_2a

    .line 85
    iput-boolean v4, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplApi26Parcelizer:Z

    :cond_2a
    :goto_2a
    add-int/lit8 v0, v0, 0x1

    goto :goto_16

    .line 88
    :cond_2d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_30
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .registers 2

    .line 360
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/helper/widget/Layer;->read(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .registers 3

    .line 126
    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 127
    invoke-virtual {p0}, Landroidx/constraintlayout/helper/widget/Layer;->getRotation()F

    move-result p1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_16

    .line 129
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_15

    .line 130
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    :cond_15
    return-void

    .line 133
    :cond_16
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    return-void
.end method

.method public onAttachedToWindow()V
    .registers 6

    .line 94
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintHelper;->onAttachedToWindow()V

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 96
    iget-boolean v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplApi21Parcelizer:Z

    if-nez v0, :cond_13

    iget-boolean v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_47

    .line 97
    :cond_13
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    .line 100
    invoke-virtual {p0}, Landroidx/constraintlayout/helper/widget/Layer;->getElevation()F

    move-result v1

    const/4 v2, 0x0

    .line 102
    :goto_1c
    iget v3, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-ge v2, v3, :cond_47

    .line 103
    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->IconCompatParcelizer:[I

    aget v3, v3, v2

    .line 104
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaMetadataCompat:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v4, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->MediaBrowserCompatItemReceiver(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_44

    .line 106
    iget-boolean v4, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz v4, :cond_33

    .line 107
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 109
    :cond_33
    iget-boolean v4, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v4, :cond_44

    const/4 v4, 0x0

    cmpl-float v4, v1, v4

    if-lez v4, :cond_44

    .line 111
    invoke-virtual {v3}, Landroid/view/View;->getTranslationZ()F

    move-result v4

    add-float/2addr v4, v1

    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationZ(F)V

    :cond_44
    add-int/lit8 v2, v2, 0x1

    goto :goto_1c

    :cond_47
    return-void
.end method

.method public setElevation(F)V
    .registers 2

    .line 225
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setElevation(F)V

    .line 226
    invoke-virtual {p0}, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public setPivotX(F)V
    .registers 2

    .line 176
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onCustomAction:F

    .line 177
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->IconCompatParcelizer()V

    return-void
.end method

.method public setPivotY(F)V
    .registers 2

    .line 187
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onAddQueueItem:F

    .line 188
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->IconCompatParcelizer()V

    return-void
.end method

.method public setRotation(F)V
    .registers 2

    .line 144
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    .line 145
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->IconCompatParcelizer()V

    return-void
.end method

.method public setScaleX(F)V
    .registers 2

    .line 154
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->handleMediaPlayPauseIfPendingOnHandler:F

    .line 155
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->IconCompatParcelizer()V

    return-void
.end method

.method public setScaleY(F)V
    .registers 2

    .line 165
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPlayFromMediaId:F

    .line 166
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->IconCompatParcelizer()V

    return-void
.end method

.method public setTranslationX(F)V
    .registers 2

    .line 197
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onMediaButtonEvent:F

    .line 198
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->IconCompatParcelizer()V

    return-void
.end method

.method public setTranslationY(F)V
    .registers 2

    .line 207
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Layer;->onPause:F

    .line 208
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->IconCompatParcelizer()V

    return-void
.end method

.method public setVisibility(I)V
    .registers 2

    .line 216
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setVisibility(I)V

    .line 217
    invoke-virtual {p0}, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public final write()V
    .registers 9

    .line 235
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->read()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 237
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 238
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->AudioAttributesImplBaseParcelizer:F

    .line 239
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 240
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->AudioAttributesCompatParcelizer()Lo/JdkDeserializers;

    move-result-object v0

    const/4 v1, 0x0

    .line 241
    invoke-virtual {v0, v1}, Lo/JdkDeserializers;->onFastForward(I)V

    .line 242
    invoke-virtual {v0, v1}, Lo/JdkDeserializers;->MediaMetadataCompat(I)V

    .line 243
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->RemoteActionCompatParcelizer()V

    .line 244
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatSearchResultReceiver:F

    float-to-int v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    .line 245
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaDescriptionCompat:F

    float-to-int v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    .line 246
    iget v4, p0, Landroidx/constraintlayout/helper/widget/Layer;->MediaBrowserCompatMediaItem:F

    float-to-int v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    .line 247
    iget v6, p0, Landroidx/constraintlayout/helper/widget/Layer;->RatingCompat:F

    float-to-int v6, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    add-int/2addr v4, v5

    add-int/2addr v6, v7

    .line 248
    invoke-virtual {p0, v0, v2, v4, v6}, Landroid/view/View;->layout(IIII)V

    .line 249
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Layer;->IconCompatParcelizer()V

    return-void
.end method
