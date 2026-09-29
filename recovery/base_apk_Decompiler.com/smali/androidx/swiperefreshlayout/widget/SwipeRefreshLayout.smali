###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout (androidx.swiperefreshlayout.widget.SwipeRefreshLayout)
.class public Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lo/_deserializeNR;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$write;,
        Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$AudioAttributesCompatParcelizer;
    }
.end annotation


# static fields
.field private static final MediaMetadataCompat:[I


# instance fields
.field AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

.field AudioAttributesImplApi21Parcelizer:I

.field AudioAttributesImplApi26Parcelizer:Lo/setOffset;

.field AudioAttributesImplBaseParcelizer:Z

.field protected IconCompatParcelizer:I

.field protected MediaBrowserCompatCustomActionResultReceiver:I

.field MediaBrowserCompatItemReceiver:Z

.field private MediaBrowserCompatMediaItem:I

.field MediaBrowserCompatSearchResultReceiver:Z

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$write;

.field private MediaDescriptionCompat:Landroid/view/animation/Animation;

.field RatingCompat:F

.field RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$AudioAttributesCompatParcelizer;

.field private final handleMediaPlayPauseIfPendingOnHandler:Landroid/view/animation/Animation;

.field private final onAddQueueItem:Landroid/view/animation/Animation;

.field private onCommand:I

.field private onCustomAction:Landroid/view/animation/Animation;

.field private onFastForward:F

.field private onMediaButtonEvent:F

.field private final onPause:Landroid/view/animation/DecelerateInterpolator;

.field private onPlay:I

.field private onPlayFromMediaId:I

.field private onPlayFromSearch:Z

.field private onPlayFromUri:Z

.field private final onPrepare:Lo/rootObjectScope;

.field private final onPrepareFromMediaId:Lo/rootArrayScope;

.field private onPrepareFromSearch:I

.field private onPrepareFromUri:Z

.field private onRemoveQueueItem:Landroid/view/animation/Animation;

.field private onRemoveQueueItemAt:Landroid/view/animation/Animation$AnimationListener;

.field private final onRewind:[I

.field private final onSeekTo:[I

.field private onSetCaptioningEnabled:Landroid/view/animation/Animation;

.field private onSetPlaybackSpeed:F

.field private onSetRating:F

.field private onSetRepeatMode:Landroid/view/animation/Animation;

.field private onSetShuffleMode:Landroid/view/View;

.field private onStop:I

.field read:I

.field write:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const v0, 0x101000e

    .line 140
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaMetadataCompat:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 340
    invoke-direct {p0, p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 7

    .line 350
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 112
    iput-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    const/high16 v1, -0x40800000    # -1.0f

    .line 114
    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetPlaybackSpeed:F

    const/4 v1, 0x2

    .line 122
    new-array v2, v1, [I

    iput-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSeekTo:[I

    .line 123
    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRewind:[I

    const/4 v1, -0x1

    .line 132
    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    .line 145
    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlay:I

    .line 178
    new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;

    invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRemoveQueueItemAt:Landroid/view/animation/Animation$AnimationListener;

    .line 1117
    new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;

    invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/animation/Animation;

    .line 1141
    new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$9;

    invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$9;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onAddQueueItem:Landroid/view/animation/Animation;

    .line 352
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onStop:I

    .line 354
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x10e0001

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepareFromSearch:I

    .line 357
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 358
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPause:Landroid/view/animation/DecelerateInterpolator;

    .line 360
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 361
    iget v2, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42200000    # 40.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onCommand:I

    .line 363
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer()V

    const/4 v2, 0x1

    .line 364
    invoke-virtual {p0, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setChildrenDrawingOrderEnabled(Z)V

    .line 366
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42800000    # 64.0f

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    int-to-float v1, v1

    .line 367
    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetPlaybackSpeed:F

    .line 368
    new-instance v1, Lo/rootArrayScope;

    invoke-direct {v1}, Lo/rootArrayScope;-><init>()V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepareFromMediaId:Lo/rootArrayScope;

    .line 370
    new-instance v1, Lo/rootObjectScope;

    invoke-direct {v1, p0}, Lo/rootObjectScope;-><init>(Landroid/view/View;)V

    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    .line 371
    invoke-virtual {p0, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setNestedScrollingEnabled(Z)V

    .line 373
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onCommand:I

    neg-int v1, v1

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 374
    invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(F)V

    .line 376
    sget-object v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaMetadataCompat:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 377
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 378
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 3

    .line 398
    new-instance v0, Lo/setWebLineWidth;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/setWebLineWidth;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    .line 399
    new-instance v0, Lo/setOffset;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/setOffset;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const/4 v1, 0x1

    .line 400
    invoke-virtual {v0, v1}, Lo/setOffset;->RemoteActionCompatParcelizer(I)V

    .line 401
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 402
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/setWebLineWidth;->setVisibility(I)V

    .line 403
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;)V
    .registers 5

    .line 1175
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 1176
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 1177
    iget v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    if-ne v1, v2, :cond_17

    if-nez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    .line 1181
    :goto_11
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    :cond_17
    return-void
.end method

.method private IconCompatParcelizer()V
    .registers 3

    .line 495
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {v0}, Lo/setOffset;->getAlpha()I

    move-result v0

    const/16 v1, 0xff

    invoke-direct {p0, v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write(II)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaDescriptionCompat:Landroid/view/animation/Animation;

    return-void
.end method

.method private IconCompatParcelizer(F)V
    .registers 11

    .line 916
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/setOffset;->write(Z)V

    .line 917
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetPlaybackSpeed:F

    div-float v0, p1, v0

    .line 919
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-double v2, v0

    const-wide v4, 0x3fd999999999999aL    # 0.4

    sub-double/2addr v2, v4

    double-to-float v2, v2

    const/4 v3, 0x0

    .line 920
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    const/high16 v4, 0x40a00000    # 5.0f

    mul-float/2addr v2, v4

    const/high16 v4, 0x40400000    # 3.0f

    div-float/2addr v2, v4

    .line 921
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v5, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetPlaybackSpeed:F

    .line 922
    iget v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromMediaId:I

    if-lez v6, :cond_32

    goto :goto_3e

    :cond_32
    iget-boolean v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v6, :cond_3c

    iget v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    iget v7, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    sub-int/2addr v6, v7

    goto :goto_3e

    :cond_3c
    iget v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    :goto_3e
    int-to-float v6, v6

    sub-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    mul-float v7, v6, v5

    .line 927
    invoke-static {v4, v7}, Ljava/lang/Math;->min(FF)F

    move-result v4

    div-float/2addr v4, v6

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const/high16 v4, 0x40800000    # 4.0f

    div-float/2addr v3, v4

    float-to-double v3, v3

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 929
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    sub-double/2addr v3, v7

    double-to-float v3, v3

    mul-float/2addr v3, v5

    .line 933
    iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    mul-float/2addr v0, v6

    mul-float/2addr v6, v3

    mul-float/2addr v6, v5

    add-float/2addr v0, v6

    float-to-int v0, v0

    .line 935
    iget-object v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-eqz v6, :cond_6f

    .line 936
    iget-object v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Lo/setWebLineWidth;->setVisibility(I)V

    .line 938
    :cond_6f
    iget-boolean v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplBaseParcelizer:Z

    if-nez v6, :cond_7d

    .line 939
    iget-object v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v6, v1}, Lo/setWebLineWidth;->setScaleX(F)V

    .line 940
    iget-object v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v6, v1}, Lo/setWebLineWidth;->setScaleY(F)V

    .line 943
    :cond_7d
    iget-boolean v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v6, :cond_8c

    .line 944
    iget v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetPlaybackSpeed:F

    div-float v6, p1, v6

    invoke-static {v1, v6}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-virtual {p0, v6}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer(F)V

    .line 946
    :cond_8c
    iget v6, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetPlaybackSpeed:F

    cmpg-float p1, p1, v6

    if-gez p1, :cond_a8

    .line 947
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {p1}, Lo/setOffset;->getAlpha()I

    move-result p1

    const/16 v6, 0x4c

    if-le p1, v6, :cond_bd

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onCustomAction:Landroid/view/animation/Animation;

    .line 948
    invoke-static {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(Landroid/view/animation/Animation;)Z

    move-result p1

    if-nez p1, :cond_bd

    .line 950
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver()V

    goto :goto_bd

    .line 953
    :cond_a8
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {p1}, Lo/setOffset;->getAlpha()I

    move-result p1

    const/16 v6, 0xff

    if-ge p1, v6, :cond_bd

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaDescriptionCompat:Landroid/view/animation/Animation;

    invoke-static {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(Landroid/view/animation/Animation;)Z

    move-result p1

    if-nez p1, :cond_bd

    .line 955
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer()V

    .line 959
    :cond_bd
    :goto_bd
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const v6, 0x3f4ccccd    # 0.8f

    mul-float v7, v2, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-virtual {p1, v6}, Lo/setOffset;->AudioAttributesCompatParcelizer(F)V

    .line 960
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-virtual {p1, v1}, Lo/setOffset;->read(F)V

    .line 963
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const v1, 0x3ecccccd    # 0.4f

    mul-float/2addr v2, v1

    const/high16 v1, 0x3e800000    # 0.25f

    sub-float/2addr v2, v1

    mul-float/2addr v3, v5

    add-float/2addr v2, v3

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v2, v1

    invoke-virtual {p1, v2}, Lo/setOffset;->RemoteActionCompatParcelizer(F)V

    add-int/2addr v4, v0

    .line 964
    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    sub-int/2addr v4, p1

    invoke-virtual {p0, v4}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(I)V

    return-void
.end method

.method private IconCompatParcelizer(ILandroid/view/animation/Animation$AnimationListener;)V
    .registers 5

    .line 1101
    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v0, :cond_8

    .line 1103
    invoke-direct {p0, p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(ILandroid/view/animation/Animation$AnimationListener;)V

    return-void

    .line 1105
    :cond_8
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer:I

    .line 1106
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onAddQueueItem:Landroid/view/animation/Animation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    .line 1107
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onAddQueueItem:Landroid/view/animation/Animation;

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1108
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onAddQueueItem:Landroid/view/animation/Animation;

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPause:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-eqz p2, :cond_24

    .line 1110
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1, p2}, Lo/setWebLineWidth;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1112
    :cond_24
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 1113
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onAddQueueItem:Landroid/view/animation/Animation;

    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/animation/Animation$AnimationListener;)V
    .registers 5

    .line 439
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/setWebLineWidth;->setVisibility(I)V

    .line 440
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 441
    new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$3;

    invoke-direct {v0, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$3;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRemoveQueueItem:Landroid/view/animation/Animation;

    .line 447
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepareFromSearch:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    if-eqz p1, :cond_21

    .line 449
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v0, p1}, Lo/setWebLineWidth;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 451
    :cond_21
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 452
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRemoveQueueItem:Landroid/view/animation/Animation;

    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private IconCompatParcelizer(ZZ)V
    .registers 4

    .line 465
    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    if-eq v0, p1, :cond_1a

    .line 466
    iput-boolean p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write:Z

    .line 467
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write()V

    .line 468
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    if-eqz p1, :cond_15

    .line 470
    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRemoveQueueItemAt:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write(ILandroid/view/animation/Animation$AnimationListener;)V

    return-void

    .line 472
    :cond_15
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRemoveQueueItemAt:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_1a
    return-void
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()Z
    .registers 3

    .line 672
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$write;

    if-eqz v0, :cond_9

    .line 673
    invoke-interface {v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$write;->write()Z

    move-result p0

    return p0

    .line 675
    :cond_9
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetShuffleMode:Landroid/view/View;

    instance-of v0, p0, Landroid/widget/ListView;

    const/4 v1, -0x1

    if-eqz v0, :cond_17

    .line 676
    check-cast p0, Landroid/widget/ListView;

    invoke-static {p0, v1}, Lo/AnnotatedClassResolver;->write(Landroid/widget/ListView;I)Z

    move-result p0

    return p0

    .line 678
    :cond_17
    invoke-virtual {p0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p0

    return p0
.end method

.method private MediaBrowserCompatItemReceiver()V
    .registers 3

    .line 491
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {v0}, Lo/setOffset;->getAlpha()I

    move-result v0

    const/16 v1, 0x4c

    invoke-direct {p0, v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write(II)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onCustomAction:Landroid/view/animation/Animation;

    return-void
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 3

    .line 234
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 235
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method private read(F)V
    .registers 4

    .line 968
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetPlaybackSpeed:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_b

    const/4 p1, 0x1

    .line 969
    invoke-direct {p0, p1, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer(ZZ)V

    return-void

    :cond_b
    const/4 p1, 0x0

    .line 972
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    .line 973
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/setOffset;->AudioAttributesCompatParcelizer(F)V

    .line 975
    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplBaseParcelizer:Z

    if-nez v0, :cond_1e

    .line 976
    new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$5;

    invoke-direct {v0, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$5;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    goto :goto_1f

    :cond_1e
    const/4 v0, 0x0

    .line 995
    :goto_1f
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    invoke-direct {p0, v1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer(ILandroid/view/animation/Animation$AnimationListener;)V

    .line 996
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {p0, p1}, Lo/setOffset;->write(Z)V

    return-void
.end method

.method private read(ILandroid/view/animation/Animation$AnimationListener;)V
    .registers 5

    .line 1150
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer:I

    .line 1151
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Lo/setWebLineWidth;->getScaleX()F

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RatingCompat:F

    .line 1152
    new-instance p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$10;

    invoke-direct {p1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$10;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetCaptioningEnabled:Landroid/view/animation/Animation;

    const-wide/16 v0, 0x96

    .line 1160
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    if-eqz p2, :cond_1d

    .line 1162
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1, p2}, Lo/setWebLineWidth;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1164
    :cond_1d
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 1165
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetCaptioningEnabled:Landroid/view/animation/Animation;

    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private static read(Landroid/view/animation/Animation;)Z
    .registers 2

    if-eqz p0, :cond_10

    .line 912
    invoke-virtual {p0}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p0

    if-nez p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method private write(II)Landroid/view/animation/Animation;
    .registers 4

    .line 499
    new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;

    invoke-direct {v0, p0, p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;II)V

    const-wide/16 p1, 0x12c

    .line 506
    invoke-virtual {v0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 508
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lo/setWebLineWidth;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 509
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 510
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-object v0
.end method

.method private write()V
    .registers 4

    .line 587
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetShuffleMode:Landroid/view/View;

    if-nez v0, :cond_1d

    const/4 v0, 0x0

    .line 588
    :goto_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1d

    .line 589
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 590
    iget-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    .line 591
    iput-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetShuffleMode:Landroid/view/View;

    return-void

    :cond_1a
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_1d
    return-void
.end method

.method private write(F)V
    .registers 4

    .line 1080
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onFastForward:F

    .line 1081
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onStop:I

    sub-float/2addr p1, v0

    int-to-float v1, v1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_1b

    iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    if-nez p1, :cond_1b

    add-float/2addr v0, v1

    .line 1082
    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onMediaButtonEvent:F

    const/4 p1, 0x1

    .line 1083
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    .line 1084
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const/16 p1, 0x4c

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_1b
    return-void
.end method

.method private write(ILandroid/view/animation/Animation$AnimationListener;)V
    .registers 5

    .line 1089
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer:I

    .line 1090
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/animation/Animation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    .line 1091
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/animation/Animation;

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1092
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/animation/Animation;

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPause:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-eqz p2, :cond_1c

    .line 1094
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1, p2}, Lo/setWebLineWidth;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1096
    :cond_1c
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 1097
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->handleMediaPlayPauseIfPendingOnHandler:Landroid/view/animation/Animation;

    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(F)V
    .registers 4

    .line 1136
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer:I

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int p1, v1

    .line 1137
    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    add-int/2addr v0, p1

    sub-int/2addr v0, v1

    .line 1138
    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(I)V

    return-void
.end method

.method final AudioAttributesCompatParcelizer(I)V
    .registers 3

    .line 1169
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 1170
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-static {v0, p1}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;I)V

    .line 1171
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    return-void
.end method

.method final RemoteActionCompatParcelizer(F)V
    .registers 3

    .line 460
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v0, p1}, Lo/setWebLineWidth;->setScaleX(F)V

    .line 461
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p0, p1}, Lo/setWebLineWidth;->setScaleY(F)V

    return-void
.end method

.method public dispatchNestedFling(FFZ)Z
    .registers 4

    .line 903
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    invoke-virtual {p0, p1, p2, p3}, Lo/rootObjectScope;->AudioAttributesCompatParcelizer(FFZ)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedPreFling(FF)Z
    .registers 3

    .line 908
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    invoke-virtual {p0, p1, p2}, Lo/rootObjectScope;->RemoteActionCompatParcelizer(FF)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .registers 5

    .line 885
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    invoke-virtual {p0, p1, p2, p3, p4}, Lo/rootObjectScope;->write(II[I[I)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .registers 12

    .line 879
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/rootObjectScope;->RemoteActionCompatParcelizer(IIII[I)Z

    move-result p0

    return p0
.end method

.method protected getChildDrawingOrder(II)I
    .registers 3

    .line 383
    iget p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlay:I

    if-gez p0, :cond_5

    goto :goto_e

    :cond_5
    add-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_a

    return p0

    :cond_a
    if-lt p2, p0, :cond_e

    add-int/lit8 p2, p2, 0x1

    :cond_e
    :goto_e
    return p2
.end method

.method public getNestedScrollAxes()I
    .registers 1

    .line 813
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepareFromMediaId:Lo/rootArrayScope;

    invoke-virtual {p0}, Lo/rootArrayScope;->IconCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public hasNestedScrollingParent()Z
    .registers 1

    .line 873
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    invoke-virtual {p0}, Lo/rootObjectScope;->write()Z

    move-result p0

    return p0
.end method

.method public isNestedScrollingEnabled()Z
    .registers 1

    .line 858
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    invoke-virtual {p0}, Lo/rootObjectScope;->read()Z

    move-result p0

    return p0
.end method

.method protected onDetachedFromWindow()V
    .registers 1

    .line 229
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 230
    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    .line 692
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write()V

    .line 694
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 701
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6c

    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v1

    if-nez v1, :cond_6c

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    if-nez v1, :cond_6c

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromUri:Z

    if-nez v1, :cond_6c

    if-eqz v0, :cond_48

    const/4 v1, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_43

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2f

    const/4 v1, 0x3

    if-eq v0, v1, :cond_43

    const/4 v1, 0x6

    if-ne v0, v1, :cond_69

    .line 735
    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;)V

    goto :goto_69

    .line 721
    :cond_2f
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    if-ne v0, v3, :cond_34

    return v2

    .line 726
    :cond_34
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_3b

    return v2

    .line 730
    :cond_3b
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 731
    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write(F)V

    goto :goto_69

    .line 740
    :cond_43
    iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    .line 741
    iput v3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    goto :goto_69

    .line 709
    :cond_48
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(I)V

    .line 710
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    .line 711
    iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    .line 713
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_63

    return v2

    .line 717
    :cond_63
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onFastForward:F

    .line 745
    :cond_69
    :goto_69
    iget-boolean p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    return p0

    :cond_6c
    return v2
.end method

.method protected onLayout(ZIIII)V
    .registers 10

    .line 609
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 610
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    .line 611
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-eqz p3, :cond_57

    .line 614
    iget-object p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetShuffleMode:Landroid/view/View;

    if-nez p3, :cond_15

    .line 615
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write()V

    .line 617
    :cond_15
    iget-object p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetShuffleMode:Landroid/view/View;

    if-nez p3, :cond_1a

    goto :goto_57

    .line 621
    :cond_1a
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    .line 622
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p5

    .line 623
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    .line 624
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int v0, p1, v0

    sub-int/2addr v0, v1

    add-int/2addr v0, p4

    sub-int/2addr p2, v2

    sub-int/2addr p2, v3

    add-int/2addr p2, p5

    .line 625
    invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V

    .line 626
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    .line 627
    iget-object p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    .line 628
    iget-object p4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p2, p2, 0x2

    iget p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    sub-int p5, p1, p2

    add-int/2addr p1, p2

    add-int/2addr p3, p0

    invoke-virtual {p4, p5, p0, p1, p3}, Landroid/view/View;->layout(IIII)V

    :cond_57
    :goto_57
    return-void
.end method

.method public onMeasure(II)V
    .registers 7

    .line 634
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 635
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetShuffleMode:Landroid/view/View;

    if-nez p1, :cond_a

    .line 636
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write()V

    .line 638
    :cond_a
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetShuffleMode:Landroid/view/View;

    if-eqz p1, :cond_60

    .line 642
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr p2, v0

    sub-int/2addr p2, v1

    const/high16 v0, 0x40000000    # 2.0f

    .line 641
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 644
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v1, v2

    sub-int/2addr v1, v3

    .line 643
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 641
    invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V

    .line 645
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    iget p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onCommand:I

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onCommand:I

    .line 646
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 645
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    const/4 p1, -0x1

    .line 647
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlay:I

    const/4 p1, 0x0

    .line 649
    :goto_4c
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-ge p1, p2, :cond_60

    .line 650
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    if-ne p2, v0, :cond_5d

    .line 651
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlay:I

    return-void

    :cond_5d
    add-int/lit8 p1, p1, 0x1

    goto :goto_4c

    :cond_60
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 5

    .line 898
    invoke-virtual {p0, p2, p3, p4}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedFling(FFZ)Z

    move-result p0

    return p0
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 4

    .line 892
    invoke-virtual {p0, p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedPreFling(FF)Z

    move-result p0

    return p0
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .registers 9

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-lez p3, :cond_21

    .line 783
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    cmpl-float v2, v1, p1

    if-lez v2, :cond_21

    int-to-float v2, p3

    cmpl-float v3, v2, v1

    if-lez v3, :cond_17

    float-to-int v1, v1

    sub-int v1, p3, v1

    .line 785
    aput v1, p4, v0

    .line 786
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    goto :goto_1c

    :cond_17
    sub-float/2addr v1, v2

    .line 788
    iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    .line 789
    aput p3, p4, v0

    .line 791
    :goto_1c
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    invoke-direct {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer(F)V

    .line 798
    :cond_21
    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v1, :cond_3e

    if-lez p3, :cond_3e

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_3e

    aget p1, p4, v0

    sub-int p1, p3, p1

    .line 799
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-lez p1, :cond_3e

    .line 800
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Lo/setWebLineWidth;->setVisibility(I)V

    .line 804
    :cond_3e
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSeekTo:[I

    const/4 v1, 0x0

    .line 805
    aget v2, p4, v1

    sub-int/2addr p2, v2

    aget v2, p4, v0

    sub-int/2addr p3, v2

    const/4 v2, 0x0

    invoke-virtual {p0, p2, p3, p1, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedPreScroll(II[I[I)Z

    move-result p0

    if-eqz p0, :cond_5c

    .line 806
    aget p0, p4, v1

    aget p2, p1, v1

    add-int/2addr p0, p2

    aput p0, p4, v1

    .line 807
    aget p0, p4, v0

    aget p1, p1, v0

    add-int/2addr p0, p1

    aput p0, p4, v0

    :cond_5c
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .registers 12

    .line 834
    iget-object v5, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRewind:[I

    move-object v0, p0

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedScroll(IIII[I)Z

    .line 842
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRewind:[I

    const/4 p2, 0x1

    aget p1, p1, p2

    add-int/2addr p5, p1

    if-gez p5, :cond_25

    .line 843
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p1

    if-nez p1, :cond_25

    .line 844
    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    add-float/2addr p1, p2

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    .line 845
    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer(F)V

    :cond_25
    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .registers 4

    .line 772
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepareFromMediaId:Lo/rootArrayScope;

    invoke-virtual {p1, p3}, Lo/rootArrayScope;->IconCompatParcelizer(I)V

    and-int/lit8 p1, p3, 0x2

    .line 774
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->startNestedScroll(I)Z

    const/4 p1, 0x0

    .line 775
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    const/4 p1, 0x1

    .line 776
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromUri:Z

    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .registers 4

    .line 765
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_10

    iget-boolean p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    if-nez p0, :cond_10

    and-int/lit8 p0, p3, 0x2

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .registers 4

    .line 818
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepareFromMediaId:Lo/rootArrayScope;

    invoke-virtual {p1}, Lo/rootArrayScope;->AudioAttributesCompatParcelizer()V

    const/4 p1, 0x0

    .line 819
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromUri:Z

    .line 822
    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_14

    .line 823
    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(F)V

    .line 824
    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRating:F

    .line 827
    :cond_14
    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->stopNestedScroll()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    .line 1002
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 1009
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_88

    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v1

    if-nez v1, :cond_88

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    if-nez v1, :cond_88

    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromUri:Z

    if-nez v1, :cond_88

    const/4 v1, 0x1

    if-eqz v0, :cond_7f

    const/high16 v3, 0x3f000000    # 0.5f

    if-eq v0, v1, :cond_61

    const/4 v4, 0x2

    if-eq v0, v4, :cond_3f

    const/4 v3, 0x3

    if-eq v0, v3, :cond_3e

    const/4 v3, 0x5

    if-eq v0, v3, :cond_30

    const/4 v2, 0x6

    if-ne v0, v2, :cond_87

    .line 1053
    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;)V

    goto :goto_87

    .line 1042
    :cond_30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    if-gez v0, :cond_37

    return v2

    .line 1048
    :cond_37
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    goto :goto_87

    :cond_3e
    return v2

    .line 1022
    :cond_3f
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_48

    return v2

    .line 1028
    :cond_48
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 1029
    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write(F)V

    .line 1031
    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    if-eqz v0, :cond_87

    .line 1032
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onMediaButtonEvent:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v3

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_60

    .line 1034
    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer(F)V

    goto :goto_87

    :cond_60
    return v2

    .line 1057
    :cond_61
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_6a

    return v2

    .line 1063
    :cond_6a
    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    if-eqz v1, :cond_7b

    .line 1064
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 1065
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onMediaButtonEvent:F

    .line 1066
    iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    sub-float/2addr p1, v0

    mul-float/2addr p1, v3

    .line 1067
    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(F)V

    :cond_7b
    const/4 p1, -0x1

    .line 1069
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    return v2

    .line 1017
    :cond_7f
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatMediaItem:I

    .line 1018
    iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromSearch:Z

    :cond_87
    :goto_87
    return v1

    :cond_88
    return v2
.end method

.method final read()V
    .registers 3

    .line 206
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 207
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {v0}, Lo/setOffset;->stop()V

    .line 208
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/setWebLineWidth;->setVisibility(I)V

    .line 209
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer()V

    .line 211
    iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v0, :cond_1d

    const/4 v0, 0x0

    .line 212
    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer(F)V

    goto :goto_25

    .line 214
    :cond_1d
    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(I)V

    .line 216
    :goto_25
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    return-void
.end method

.method final read(Landroid/view/animation/Animation$AnimationListener;)V
    .registers 5

    .line 478
    new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$2;

    invoke-direct {v0, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$2;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    iput-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRepeatMode:Landroid/view/animation/Animation;

    const-wide/16 v1, 0x96

    .line 484
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 485
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v0, p1}, Lo/setWebLineWidth;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 486
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 487
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetRepeatMode:Landroid/view/animation/Animation;

    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .registers 3

    .line 753
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetShuffleMode:Landroid/view/View;

    if-eqz v0, :cond_b

    .line 754
    invoke-static {v0}, Lo/InvalidTypeIdException;->onRemoveQueueItemAt(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_b

    return-void

    .line 757
    :cond_b
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public varargs setColorScheme([I)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 545
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V

    return-void
.end method

.method public varargs setColorSchemeColors([I)V
    .registers 2

    .line 572
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write()V

    .line 573
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {p0, p1}, Lo/setOffset;->AudioAttributesCompatParcelizer([I)V

    return-void
.end method

.method public varargs setColorSchemeResources([I)V
    .registers 6

    .line 556
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 557
    array-length v1, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    .line 558
    :goto_8
    array-length v3, p1

    if-ge v2, v3, :cond_16

    .line 559
    aget v3, p1, v2

    invoke-static {v0, v3}, Lo/_isNaN;->getColor(Landroid/content/Context;I)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 561
    :cond_16
    invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    return-void
.end method

.method public setDistanceToTriggerSync(I)V
    .registers 2

    int-to-float p1, p1

    .line 604
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onSetPlaybackSpeed:F

    return-void
.end method

.method public setEnabled(Z)V
    .registers 2

    .line 221
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setEnabled(Z)V

    if-nez p1, :cond_8

    .line 223
    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read()V

    :cond_8
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .registers 2

    .line 853
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    invoke-virtual {p0, p1}, Lo/rootObjectScope;->write(Z)V

    return-void
.end method

.method public setOnChildScrollUpCallback(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$write;)V
    .registers 2

    .line 687
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$write;

    return-void
.end method

.method public setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$AudioAttributesCompatParcelizer;)V
    .registers 2

    .line 411
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$AudioAttributesCompatParcelizer;

    return-void
.end method

.method public setProgressBackgroundColor(I)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 519
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setProgressBackgroundColorSchemeResource(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeColor(I)V
    .registers 2

    .line 537
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeResource(I)V
    .registers 3

    .line 528
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/_isNaN;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setProgressBackgroundColorSchemeColor(I)V

    return-void
.end method

.method public setProgressViewEndTarget(ZI)V
    .registers 3

    .line 296
    iput p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    .line 297
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplBaseParcelizer:Z

    .line 298
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setProgressViewOffset(ZII)V
    .registers 4

    .line 258
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplBaseParcelizer:Z

    .line 259
    iput p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 260
    iput p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    const/4 p1, 0x1

    .line 261
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatSearchResultReceiver:Z

    .line 262
    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read()V

    const/4 p1, 0x0

    .line 263
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    return-void
.end method

.method public setRefreshing(Z)V
    .registers 4

    const/4 v0, 0x0

    if-eqz p1, :cond_23

    .line 421
    iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    if-eq v1, p1, :cond_23

    .line 423
    iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    .line 425
    iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatSearchResultReceiver:Z

    if-nez p1, :cond_13

    .line 426
    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    add-int/2addr p1, v1

    goto :goto_15

    .line 428
    :cond_13
    iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    .line 430
    :goto_15
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(I)V

    .line 431
    iput-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write:Z

    .line 432
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onRemoveQueueItemAt:Landroid/view/animation/Animation$AnimationListener;

    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer(Landroid/view/animation/Animation$AnimationListener;)V

    return-void

    .line 434
    :cond_23
    invoke-direct {p0, p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer(ZZ)V

    return-void
.end method

.method public setSize(I)V
    .registers 4

    if-eqz p1, :cond_6

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    return-void

    .line 320
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    if-nez p1, :cond_19

    .line 322
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42600000    # 56.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onCommand:I

    goto :goto_21

    .line 324
    :cond_19
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42200000    # 40.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onCommand:I

    .line 329
    :goto_21
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 330
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {v0, p1}, Lo/setOffset;->RemoteActionCompatParcelizer(I)V

    .line 331
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSlingshotDistance(I)V
    .registers 2

    .line 310
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPlayFromMediaId:I

    return-void
.end method

.method public startNestedScroll(I)Z
    .registers 2

    .line 863
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    invoke-virtual {p0, p1}, Lo/rootObjectScope;->write(I)Z

    move-result p0

    return p0
.end method

.method public stopNestedScroll()V
    .registers 1

    .line 868
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->onPrepare:Lo/rootObjectScope;

    invoke-virtual {p0}, Lo/rootObjectScope;->IconCompatParcelizer()V

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass1 (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$1)
.class final Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    .line 178
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 3

    .line 189
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-boolean p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatItemReceiver:Z

    if-eqz p1, :cond_34

    .line 191
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 192
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    invoke-virtual {p1}, Lo/setOffset;->start()V

    .line 193
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-boolean p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write:Z

    if-eqz p1, :cond_29

    .line 194
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$AudioAttributesCompatParcelizer;

    if-eqz p1, :cond_29

    .line 195
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$AudioAttributesCompatParcelizer;

    invoke-interface {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$AudioAttributesCompatParcelizer;->onRefresh()V

    .line 198
    :cond_29
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read:I

    return-void

    .line 200
    :cond_34
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$1;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read()V

    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass10 (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$10)
.class final Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$10;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(ILandroid/view/animation/Animation$AnimationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    .line 1152
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$10;->RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 5

    .line 1155
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$10;->RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RatingCompat:F

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$10;->RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget v0, v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RatingCompat:F

    neg-float v0, v0

    .line 1156
    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$10;->RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    mul-float/2addr v0, p1

    add-float/2addr p2, v0

    invoke-virtual {v1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer(F)V

    .line 1157
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$10;->RemoteActionCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(F)V

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass2 (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$2)
.class final Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$2;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(Landroid/view/animation/Animation$AnimationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    .line 478
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$2;->IconCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 3

    .line 481
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$2;->IconCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float/2addr p2, p1

    invoke-virtual {p0, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer(F)V

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass3 (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$3)
.class final Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$3;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer(Landroid/view/animation/Animation$AnimationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    .line 441
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$3;->IconCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 3

    .line 444
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$3;->IconCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->RemoteActionCompatParcelizer(F)V

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass4 (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$4)
.class final Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->write(II)Landroid/view/animation/Animation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:I

.field final synthetic IconCompatParcelizer:I

.field final synthetic write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;II)V
    .registers 4

    .line 499
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iput p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;->AudioAttributesCompatParcelizer:I

    iput p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;->IconCompatParcelizer:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 5

    .line 502
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;->AudioAttributesCompatParcelizer:I

    int-to-float v1, v0

    iget p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$4;->IconCompatParcelizer:I

    sub-int/2addr p0, v0

    int-to-float p0, p0

    mul-float/2addr p0, p1

    add-float/2addr v1, p0

    float-to-int p0, v1

    invoke-virtual {p2, p0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass5 (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$5)
.class final Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    .line 976
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$5;->AudioAttributesCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 2

    .line 984
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$5;->AudioAttributesCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-boolean p1, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplBaseParcelizer:Z

    if-nez p1, :cond_c

    .line 985
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$5;->AudioAttributesCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->read(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_c
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass7 (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$7)
.class final Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    .line 1117
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 6

    .line 1122
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-boolean p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatSearchResultReceiver:Z

    if-nez p2, :cond_14

    .line 1123
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget v0, v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    sub-int/2addr p2, v0

    goto :goto_18

    .line 1125
    :cond_14
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi21Parcelizer:I

    .line 1127
    :goto_18
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget v0, v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer:I

    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget v1, v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->IconCompatParcelizer:I

    sub-int/2addr p2, v1

    int-to-float p2, p2

    mul-float/2addr p2, p1

    float-to-int p2, p2

    .line 1128
    iget-object v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object v1, v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer:Lo/setWebLineWidth;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    .line 1129
    iget-object v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    add-int/2addr v0, p2

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(I)V

    .line 1130
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$7;->write:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesImplApi26Parcelizer:Lo/setOffset;

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float/2addr p2, p1

    invoke-virtual {p0, p2}, Lo/setOffset;->read(F)V

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass9 (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$9)
.class final Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$9;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .registers 2

    .line 1141
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$9;->AudioAttributesCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .registers 3

    .line 1144
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$9;->AudioAttributesCompatParcelizer:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->AudioAttributesCompatParcelizer(F)V

    return-void
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AudioAttributesCompatParcelizer (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$AudioAttributesCompatParcelizer)
.class public interface abstract Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesCompatParcelizer"
.end annotation


# virtual methods
.method public abstract onRefresh()V
.end method

###### Class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.write (androidx.swiperefreshlayout.widget.SwipeRefreshLayout$write)
.class public interface abstract Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation


# virtual methods
.method public abstract write()Z
.end method
