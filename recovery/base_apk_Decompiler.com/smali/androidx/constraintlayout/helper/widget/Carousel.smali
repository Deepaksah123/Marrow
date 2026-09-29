###### Class androidx.constraintlayout.helper.widget.Carousel (androidx.constraintlayout.helper.widget.Carousel)
.class public Landroidx/constraintlayout/helper/widget/Carousel;
.super Landroidx/constraintlayout/motion/widget/MotionHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesImplApi21Parcelizer:I

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:F

.field private MediaBrowserCompatCustomActionResultReceiver:I

.field private MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:I

.field private RatingCompat:Z

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private final onAddQueueItem:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private onCommand:I

.field private onCustomAction:I

.field private onFastForward:I

.field private onMediaButtonEvent:I

.field private onPause:I

.field private onPlay:Ljava/lang/Runnable;

.field private onPlayFromMediaId:I

.field private onPrepareFromMediaId:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    .line 91
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    .line 43
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onAddQueueItem:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 44
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCustomAction:I

    .line 45
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 48
    iput-boolean p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->RatingCompat:Z

    .line 49
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    .line 50
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    .line 51
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPause:I

    .line 52
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onMediaButtonEvent:I

    const v1, 0x3f666666    # 0.9f

    .line 53
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplBaseParcelizer:F

    .line 54
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onFastForward:I

    const/4 p1, 0x4

    .line 55
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    const/4 p1, 0x1

    .line 60
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlayFromMediaId:I

    const/high16 p1, 0x40000000    # 2.0f

    .line 61
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPrepareFromMediaId:F

    .line 62
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCommand:I

    const/16 p1, 0xc8

    .line 63
    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaMetadataCompat:I

    .line 210
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 266
    new-instance p1, Landroidx/constraintlayout/helper/widget/Carousel$4;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/helper/widget/Carousel$4;-><init>(Landroidx/constraintlayout/helper/widget/Carousel;)V

    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlay:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 95
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onAddQueueItem:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 44
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCustomAction:I

    .line 45
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    const/4 v1, -0x1

    .line 47
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 48
    iput-boolean v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->RatingCompat:Z

    .line 49
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    .line 50
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    .line 51
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPause:I

    .line 52
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onMediaButtonEvent:I

    const v2, 0x3f666666    # 0.9f

    .line 53
    iput v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplBaseParcelizer:F

    .line 54
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onFastForward:I

    const/4 v0, 0x4

    .line 55
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    const/4 v0, 0x1

    .line 60
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlayFromMediaId:I

    const/high16 v0, 0x40000000    # 2.0f

    .line 61
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPrepareFromMediaId:F

    .line 62
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCommand:I

    const/16 v0, 0xc8

    .line 63
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaMetadataCompat:I

    .line 210
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 266
    new-instance v0, Landroidx/constraintlayout/helper/widget/Carousel$4;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/helper/widget/Carousel$4;-><init>(Landroidx/constraintlayout/helper/widget/Carousel;)V

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlay:Ljava/lang/Runnable;

    .line 96
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/helper/widget/Carousel;->IconCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    .line 100
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 42
    iput-object p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    .line 43
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onAddQueueItem:Ljava/util/ArrayList;

    const/4 p3, 0x0

    .line 44
    iput p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCustomAction:I

    .line 45
    iput p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 48
    iput-boolean p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->RatingCompat:Z

    .line 49
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    .line 50
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    .line 51
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPause:I

    .line 52
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onMediaButtonEvent:I

    const v1, 0x3f666666    # 0.9f

    .line 53
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplBaseParcelizer:F

    .line 54
    iput p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onFastForward:I

    const/4 p3, 0x4

    .line 55
    iput p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    const/4 p3, 0x1

    .line 60
    iput p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlayFromMediaId:I

    const/high16 p3, 0x40000000    # 2.0f

    .line 61
    iput p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPrepareFromMediaId:F

    .line 62
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCommand:I

    const/16 p3, 0xc8

    .line 63
    iput p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaMetadataCompat:I

    .line 210
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 266
    new-instance p3, Landroidx/constraintlayout/helper/widget/Carousel$4;

    invoke-direct {p3, p0}, Landroidx/constraintlayout/helper/widget/Carousel$4;-><init>(Landroidx/constraintlayout/helper/widget/Carousel;)V

    iput-object p3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlay:Ljava/lang/Runnable;

    .line 101
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/helper/widget/Carousel;->IconCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)I
    .registers 1

    .line 39
    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlayFromMediaId:I

    return p0
.end method

.method private AudioAttributesCompatParcelizer(IZ)Z
    .registers 5

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_5

    return v1

    .line 252
    :cond_5
    iget-object p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    if-nez p0, :cond_a

    return v1

    .line 255
    :cond_a
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(I)Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    move-result-object p0

    if-nez p0, :cond_11

    return v1

    .line 259
    :cond_11
    invoke-virtual {p0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer()Z

    move-result p1

    if-ne p2, p1, :cond_18

    return v1

    .line 262
    :cond_18
    invoke-virtual {p0, p2}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->write(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;I)Z
    .registers 7

    .line 334
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 338
    :cond_6
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer()[I

    move-result-object v0

    move v2, v1

    .line 339
    :goto_b
    array-length v3, v0

    if-ge v1, v3, :cond_18

    .line 340
    aget v3, v0, v1

    invoke-direct {p0, v3, p1, p2}, Landroidx/constraintlayout/helper/widget/Carousel;->read(ILandroid/view/View;I)Z

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_18
    return v2
.end method

.method static synthetic AudioAttributesImplApi21Parcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)F
    .registers 1

    .line 39
    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPrepareFromMediaId:F

    return p0
.end method

.method private AudioAttributesImplApi21Parcelizer()V
    .registers 8

    .line 364
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_f1

    .line 367
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    if-eqz v1, :cond_f1

    .line 370
    invoke-interface {v0}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v0

    if-eqz v0, :cond_f1

    .line 376
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onAddQueueItem:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_16
    if-ge v2, v0, :cond_96

    .line 379
    iget-object v3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onAddQueueItem:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 380
    iget v4, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    add-int/2addr v4, v2

    iget v5, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onFastForward:I

    sub-int/2addr v4, v5

    .line 381
    iget-boolean v5, p0, Landroidx/constraintlayout/helper/widget/Carousel;->RatingCompat:Z

    if-eqz v5, :cond_7a

    const/4 v5, 0x4

    if-gez v4, :cond_4b

    .line 383
    iget v6, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    if-eq v6, v5, :cond_35

    .line 384
    invoke-direct {p0, v3, v6}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroid/view/View;I)Z

    goto :goto_38

    .line 386
    :cond_35
    invoke-direct {p0, v3, v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroid/view/View;I)Z

    .line 388
    :goto_38
    iget-object v3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v3}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v3

    rem-int v3, v4, v3

    if-nez v3, :cond_43

    goto :goto_93

    .line 391
    :cond_43
    iget-object v3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v3}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v3

    rem-int/2addr v4, v3

    goto :goto_93

    .line 393
    :cond_4b
    iget-object v6, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v6}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v6

    if-lt v4, v6, :cond_76

    .line 394
    iget-object v6, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v6}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v6

    if-eq v4, v6, :cond_6a

    .line 396
    iget-object v6, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v6}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v6

    if-le v4, v6, :cond_6a

    .line 397
    iget-object v6, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v6}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v6

    rem-int/2addr v4, v6

    .line 399
    :cond_6a
    iget v4, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    if-eq v4, v5, :cond_72

    .line 400
    invoke-direct {p0, v3, v4}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroid/view/View;I)Z

    goto :goto_93

    .line 402
    :cond_72
    invoke-direct {p0, v3, v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroid/view/View;I)Z

    goto :goto_93

    .line 406
    :cond_76
    invoke-direct {p0, v3, v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroid/view/View;I)Z

    goto :goto_93

    :cond_7a
    if-gez v4, :cond_82

    .line 411
    iget v4, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    invoke-direct {p0, v3, v4}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroid/view/View;I)Z

    goto :goto_93

    .line 412
    :cond_82
    iget-object v5, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v5}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v5

    if-lt v4, v5, :cond_90

    .line 413
    iget v4, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    invoke-direct {p0, v3, v4}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroid/view/View;I)Z

    goto :goto_93

    .line 415
    :cond_90
    invoke-direct {p0, v3, v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroid/view/View;I)Z

    :goto_93
    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    .line 421
    :cond_96
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCommand:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_aa

    iget v3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    if-eq v0, v3, :cond_aa

    .line 422
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    new-instance v3, Lo/NumberDeserializersByteDeserializer;

    invoke-direct {v3, p0}, Lo/NumberDeserializersByteDeserializer;-><init>(Landroidx/constraintlayout/helper/widget/Carousel;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_b0

    .line 430
    :cond_aa
    iget v3, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    if-ne v0, v3, :cond_b0

    .line 431
    iput v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCommand:I

    .line 434
    :cond_b0
    :goto_b0
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    if-eq v0, v2, :cond_f1

    iget v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    if-eq v0, v2, :cond_f1

    .line 439
    iget-boolean v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->RatingCompat:Z

    if-eqz v0, :cond_bd

    goto :goto_f1

    .line 443
    :cond_bd
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v0}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v0

    .line 444
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    const/4 v3, 0x1

    if-nez v2, :cond_ce

    .line 445
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    invoke-direct {p0, v2, v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(IZ)Z

    goto :goto_da

    .line 447
    :cond_ce
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    invoke-direct {p0, v2, v3}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(IZ)Z

    .line 448
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v4, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {v2, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(I)V

    .line 450
    :goto_da
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    sub-int/2addr v0, v3

    if-ne v2, v0, :cond_e5

    .line 451
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    invoke-direct {p0, v0, v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(IZ)Z

    return-void

    .line 453
    :cond_e5
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    invoke-direct {p0, v0, v3}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(IZ)Z

    .line 454
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    invoke-virtual {v0, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(I)V

    :cond_f1
    :goto_f1
    return-void
.end method

.method static synthetic AudioAttributesImplApi26Parcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)F
    .registers 1

    .line 39
    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplBaseParcelizer:F

    return p0
.end method

.method static synthetic AudioAttributesImplBaseParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)I
    .registers 1

    .line 39
    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCustomAction:I

    return p0
.end method

.method private IconCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    if-eqz p2, :cond_9d

    .line 106
    sget-object v0, Lo/_isBlank$read;->Carousel:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 107
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    :goto_d
    if-ge v0, p2, :cond_9a

    .line 109
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v1

    .line 110
    sget v2, Lo/_isBlank$read;->Carousel_carousel_firstView:I

    if-ne v1, v2, :cond_21

    .line 111
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatCustomActionResultReceiver:I

    goto/16 :goto_96

    .line 112
    :cond_21
    sget v2, Lo/_isBlank$read;->Carousel_carousel_backwardTransition:I

    if-ne v1, v2, :cond_2f

    .line 113
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    goto/16 :goto_96

    .line 114
    :cond_2f
    sget v2, Lo/_isBlank$read;->Carousel_carousel_forwardTransition:I

    if-ne v1, v2, :cond_3c

    .line 115
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    goto :goto_96

    .line 116
    :cond_3c
    sget v2, Lo/_isBlank$read;->Carousel_carousel_emptyViewsBehavior:I

    if-ne v1, v2, :cond_49

    .line 117
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer:I

    goto :goto_96

    .line 118
    :cond_49
    sget v2, Lo/_isBlank$read;->Carousel_carousel_previousState:I

    if-ne v1, v2, :cond_56

    .line 119
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPause:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPause:I

    goto :goto_96

    .line 120
    :cond_56
    sget v2, Lo/_isBlank$read;->Carousel_carousel_nextState:I

    if-ne v1, v2, :cond_63

    .line 121
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onMediaButtonEvent:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onMediaButtonEvent:I

    goto :goto_96

    .line 122
    :cond_63
    sget v2, Lo/_isBlank$read;->Carousel_carousel_touchUp_dampeningFactor:I

    if-ne v1, v2, :cond_70

    .line 123
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplBaseParcelizer:F

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplBaseParcelizer:F

    goto :goto_96

    .line 124
    :cond_70
    sget v2, Lo/_isBlank$read;->Carousel_carousel_touchUpMode:I

    if-ne v1, v2, :cond_7d

    .line 125
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlayFromMediaId:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlayFromMediaId:I

    goto :goto_96

    .line 126
    :cond_7d
    sget v2, Lo/_isBlank$read;->Carousel_carousel_touchUp_velocityThreshold:I

    if-ne v1, v2, :cond_8a

    .line 127
    iget v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPrepareFromMediaId:F

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPrepareFromMediaId:F

    goto :goto_96

    .line 128
    :cond_8a
    sget v2, Lo/_isBlank$read;->Carousel_carousel_infinite:I

    if-ne v1, v2, :cond_96

    .line 129
    iget-boolean v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->RatingCompat:Z

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->RatingCompat:Z

    :cond_96
    :goto_96
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_d

    .line 132
    :cond_9a
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_9d
    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)V
    .registers 1

    .line 39
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/motion/widget/MotionLayout;
    .registers 1

    .line 39
    iget-object p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    return-object p0
.end method

.method static synthetic read(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;
    .registers 1

    .line 39
    iget-object p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    return-object p0
.end method

.method private read(ILandroid/view/View;I)Z
    .registers 5

    .line 346
    iget-object p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer;

    move-result-object p0

    const/4 p1, 0x0

    if-nez p0, :cond_a

    return p1

    .line 350
    :cond_a
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer(I)Lo/ReferenceTypeDeserializer$write;

    move-result-object p0

    if-nez p0, :cond_15

    return p1

    .line 354
    :cond_15
    iget-object p0, p0, Lo/ReferenceTypeDeserializer$write;->AudioAttributesImplApi26Parcelizer:Lo/ReferenceTypeDeserializer$AudioAttributesCompatParcelizer;

    const/4 p1, 0x1

    iput p1, p0, Lo/ReferenceTypeDeserializer$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 359
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    return p1
.end method

.method static synthetic write(Landroidx/constraintlayout/helper/widget/Carousel;)I
    .registers 1

    .line 39
    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    return p0
.end method


# virtual methods
.method public final synthetic AudioAttributesCompatParcelizer()V
    .registers 3

    .line 423
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaMetadataCompat:I

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransitionDuration(I)V

    .line 424
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCommand:I

    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    if-ge v0, v1, :cond_17

    .line 425
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPause:I

    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaMetadataCompat:I

    invoke-virtual {v0, v1, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(II)V

    return-void

    .line 427
    :cond_17
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onMediaButtonEvent:I

    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaMetadataCompat:I

    invoke-virtual {v0, v1, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(II)V

    return-void
.end method

.method public onAttachedToWindow()V
    .registers 6

    .line 296
    invoke-super {p0}, Landroidx/constraintlayout/motion/widget/MotionHelper;->onAttachedToWindow()V

    .line 298
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;

    if-eqz v0, :cond_4e

    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/motion/widget/MotionLayout;

    const/4 v1, 0x0

    .line 303
    :goto_12
    iget v2, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-ge v1, v2, :cond_2c

    .line 304
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->IconCompatParcelizer:[I

    aget v2, v2, v1

    .line 305
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->MediaBrowserCompatItemReceiver(I)Landroid/view/View;

    move-result-object v3

    .line 306
    iget v4, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v4, v2, :cond_24

    .line 307
    iput v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onFastForward:I

    .line 309
    :cond_24
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onAddQueueItem:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_12

    .line 311
    :cond_2c
    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 313
    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlayFromMediaId:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_4b

    .line 314
    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatMediaItem:I

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(I)Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    move-result-object v0

    if-eqz v0, :cond_3e

    .line 316
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer()V

    .line 318
    :cond_3e
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->write(I)Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;

    move-result-object v0

    if-eqz v0, :cond_4b

    .line 320
    invoke-virtual {v0}, Lo/PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer()V

    .line 323
    :cond_4b
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer()V

    :cond_4e
    return-void
.end method

.method public final read(I)V
    .registers 4

    .line 214
    iget v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCustomAction:I

    .line 215
    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onMediaButtonEvent:I

    if-ne p1, v1, :cond_d

    add-int/lit8 v0, v0, 0x1

    .line 216
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    goto :goto_15

    .line 217
    :cond_d
    iget v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPause:I

    if-ne p1, v1, :cond_15

    add-int/lit8 v0, v0, -0x1

    .line 218
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    .line 220
    :cond_15
    :goto_15
    iget-boolean p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->RatingCompat:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_35

    .line 221
    iget p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v1}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v1

    if-lt p1, v1, :cond_26

    .line 222
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    .line 224
    :cond_26
    iget p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    if-gez p1, :cond_4f

    .line 225
    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {p1}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    goto :goto_4f

    .line 228
    :cond_35
    iget p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {v1}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v1

    if-lt p1, v1, :cond_49

    .line 229
    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    invoke-interface {p1}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    .line 231
    :cond_49
    iget p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    if-gez p1, :cond_4f

    .line 232
    iput v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    .line 236
    :cond_4f
    :goto_4f
    iget p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onCustomAction:I

    iget v0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaDescriptionCompat:I

    if-eq p1, v0, :cond_5c

    .line 237
    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget-object p0, p0, Landroidx/constraintlayout/helper/widget/Carousel;->onPlay:Ljava/lang/Runnable;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_5c
    return-void
.end method

.method public setAdapter(Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;)V
    .registers 2

    .line 137
    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel;->MediaBrowserCompatSearchResultReceiver:Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    return-void
.end method

###### Class androidx.constraintlayout.helper.widget.Carousel.AnonymousClass4 (androidx.constraintlayout.helper.widget.Carousel$4)
.class final Landroidx/constraintlayout/helper/widget/Carousel$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/helper/widget/Carousel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/constraintlayout/helper/widget/Carousel;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/helper/widget/Carousel;)V
    .registers 2

    .line 266
    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 269
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/motion/widget/MotionLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 270
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->IconCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)V

    .line 271
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->read(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->write(Landroidx/constraintlayout/helper/widget/Carousel;)I

    .line 272
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/motion/widget/MotionLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->AudioAttributesImplBaseParcelizer()F

    move-result v0

    .line 273
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_97

    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi21Parcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)F

    move-result v1

    cmpl-float v1, v0, v1

    if-lez v1, :cond_97

    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->write(Landroidx/constraintlayout/helper/widget/Carousel;)I

    move-result v1

    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->read(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    move-result-object v2

    invoke-interface {v2}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_97

    .line 274
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplApi26Parcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)F

    move-result v1

    .line 275
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->write(Landroidx/constraintlayout/helper/widget/Carousel;)I

    move-result v2

    if-nez v2, :cond_66

    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplBaseParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)I

    move-result v2

    iget-object v3, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/Carousel;->write(Landroidx/constraintlayout/helper/widget/Carousel;)I

    move-result v3

    if-gt v2, v3, :cond_97

    .line 279
    :cond_66
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->write(Landroidx/constraintlayout/helper/widget/Carousel;)I

    move-result v2

    iget-object v3, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/Carousel;->read(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;

    move-result-object v3

    invoke-interface {v3}, Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;->read()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_88

    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesImplBaseParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)I

    move-result v2

    iget-object v3, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/Carousel;->write(Landroidx/constraintlayout/helper/widget/Carousel;)I

    move-result v3

    if-lt v2, v3, :cond_97

    .line 283
    :cond_88
    iget-object v2, p0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/Carousel;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/motion/widget/MotionLayout;

    move-result-object v2

    new-instance v3, Landroidx/constraintlayout/helper/widget/Carousel$4$1;

    mul-float/2addr v0, v1

    invoke-direct {v3, p0, v0}, Landroidx/constraintlayout/helper/widget/Carousel$4$1;-><init>(Landroidx/constraintlayout/helper/widget/Carousel$4;F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_97
    return-void
.end method

###### Class androidx.constraintlayout.helper.widget.Carousel.AnonymousClass4.AnonymousClass1 (androidx.constraintlayout.helper.widget.Carousel$4$1)
.class final Landroidx/constraintlayout/helper/widget/Carousel$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/helper/widget/Carousel$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:F

.field final synthetic IconCompatParcelizer:Landroidx/constraintlayout/helper/widget/Carousel$4;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/helper/widget/Carousel$4;F)V
    .registers 3

    .line 283
    iput-object p1, p0, Landroidx/constraintlayout/helper/widget/Carousel$4$1;->IconCompatParcelizer:Landroidx/constraintlayout/helper/widget/Carousel$4;

    iput p2, p0, Landroidx/constraintlayout/helper/widget/Carousel$4$1;->AudioAttributesCompatParcelizer:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 286
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Carousel$4$1;->IconCompatParcelizer:Landroidx/constraintlayout/helper/widget/Carousel$4;

    iget-object v0, v0, Landroidx/constraintlayout/helper/widget/Carousel$4;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/Carousel;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/helper/widget/Carousel;)Landroidx/constraintlayout/motion/widget/MotionLayout;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    iget p0, p0, Landroidx/constraintlayout/helper/widget/Carousel$4$1;->AudioAttributesCompatParcelizer:F

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1, p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(IFF)V

    return-void
.end method

###### Class androidx.constraintlayout.helper.widget.Carousel.RemoteActionCompatParcelizer (androidx.constraintlayout.helper.widget.Carousel$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/constraintlayout/helper/widget/Carousel$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/helper/widget/Carousel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract read()I
.end method

###### Class kotlin.NumberDeserializersByteDeserializer (o.NumberDeserializersByteDeserializer)
.class public final synthetic Lo/NumberDeserializersByteDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic write:Landroidx/constraintlayout/helper/widget/Carousel;


# direct methods
.method public synthetic constructor <init>(Landroidx/constraintlayout/helper/widget/Carousel;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/NumberDeserializersByteDeserializer;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/NumberDeserializersByteDeserializer;->write:Landroidx/constraintlayout/helper/widget/Carousel;

    invoke-virtual {p0}, Landroidx/constraintlayout/helper/widget/Carousel;->AudioAttributesCompatParcelizer()V

    return-void
.end method
