###### Class androidx.viewpager.widget.ViewPager (androidx.viewpager.widget.ViewPager)
.class public Landroidx/viewpager/widget/ViewPager;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/viewpager/widget/ViewPager$write;,
        Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;,
        Landroidx/viewpager/widget/ViewPager$LayoutParams;,
        Landroidx/viewpager/widget/ViewPager$read;,
        Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;,
        Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;,
        Landroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;,
        Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;,
        Landroidx/viewpager/widget/ViewPager$SavedState;,
        Landroidx/viewpager/widget/ViewPager$MediaBrowserCompatCustomActionResultReceiver;
    }
.end annotation


# static fields
.field private static final MediaBrowserCompatCustomActionResultReceiver:Landroidx/viewpager/widget/ViewPager$MediaBrowserCompatCustomActionResultReceiver;

.field private static final RemoteActionCompatParcelizer:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field static final read:[I

.field private static final write:Landroid/view/animation/Interpolator;


# instance fields
.field AudioAttributesCompatParcelizer:I

.field private AudioAttributesImplApi21Parcelizer:I

.field private AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field IconCompatParcelizer:Lo/getComponentEnabledSetting;

.field private MediaBrowserCompatItemReceiver:I

.field private MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:I

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:I

.field private MediaSessionCompatQueueItem:Ljava/lang/ClassLoader;

.field private MediaSessionCompatResultReceiverWrapper:Z

.field private MediaSessionCompatToken:I

.field private ParcelableVolumeInfo:Landroid/os/Parcelable;

.field private PlaybackStateCompat:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;

.field private PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

.field private RatingCompat:I

.field private ResultReceiver:I

.field private final _init_lambda2:Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

.field private _init_lambda3:I

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:I

.field private onCommand:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final onCustomAction:Ljava/lang/Runnable;

.field private onFastForward:Z

.field private onMediaButtonEvent:F

.field private onPause:I

.field private onPlay:I

.field private onPlayFromMediaId:Z

.field private onPlayFromSearch:Z

.field private onPlayFromUri:F

.field private onPrepare:Z

.field private onPrepareFromMediaId:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

.field private onPrepareFromSearch:F

.field private onPrepareFromUri:F

.field private onRemoveQueueItem:Z

.field private onRemoveQueueItemAt:F

.field private onRewind:F

.field private final onSeekTo:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private onSetCaptioningEnabled:Z

.field private onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

.field private onSetRating:I

.field private onSetRepeatMode:I

.field private onSetShuffleMode:Landroid/graphics/drawable/Drawable;

.field private onSkipToNext:I

.field private onSkipToPrevious:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

.field private onSkipToQueueItem:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;

.field private onStop:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Z

.field private r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

.field private r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

.field private r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

.field private r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

.field private final r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Landroid/graphics/Rect;

.field private setSessionImpl:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const v0, 0x10100b3

    .line 122
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/viewpager/widget/ViewPager;->read:[I

    .line 140
    new-instance v0, Landroidx/viewpager/widget/ViewPager$3;

    invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$3;-><init>()V

    sput-object v0, Landroidx/viewpager/widget/ViewPager;->RemoteActionCompatParcelizer:Ljava/util/Comparator;

    .line 147
    new-instance v0, Landroidx/viewpager/widget/ViewPager$4;

    invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$4;-><init>()V

    sput-object v0, Landroidx/viewpager/widget/ViewPager;->write:Landroid/view/animation/Interpolator;

    .line 251
    new-instance v0, Landroidx/viewpager/widget/ViewPager$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$MediaBrowserCompatCustomActionResultReceiver;-><init>()V

    sput-object v0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/viewpager/widget/ViewPager$MediaBrowserCompatCustomActionResultReceiver;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 391
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 155
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    .line 156
    new-instance p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    invoke-direct {p1}, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->_init_lambda2:Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 158
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Landroid/graphics/Rect;

    const/4 p1, -0x1

    .line 162
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    const/4 v0, 0x0

    .line 163
    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->ParcelableVolumeInfo:Landroid/os/Parcelable;

    .line 164
    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatQueueItem:Ljava/lang/ClassLoader;

    const v0, -0x800001

    .line 179
    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->onMediaButtonEvent:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 180
    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    const/4 v0, 0x1

    .line 189
    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->setSessionImpl:I

    .line 207
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    .line 234
    iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    const/4 p1, 0x0

    .line 235
    iput-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->onSetCaptioningEnabled:Z

    .line 269
    new-instance v0, Landroidx/viewpager/widget/ViewPager$1;

    invoke-direct {v0, p0}, Landroidx/viewpager/widget/ViewPager$1;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onCustomAction:Ljava/lang/Runnable;

    .line 277
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->ResultReceiver:I

    .line 392
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaMetadataCompat()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 396
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 155
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    .line 156
    new-instance p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    invoke-direct {p1}, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->_init_lambda2:Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 158
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Landroid/graphics/Rect;

    const/4 p1, -0x1

    .line 162
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    const/4 p2, 0x0

    .line 163
    iput-object p2, p0, Landroidx/viewpager/widget/ViewPager;->ParcelableVolumeInfo:Landroid/os/Parcelable;

    .line 164
    iput-object p2, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatQueueItem:Ljava/lang/ClassLoader;

    const p2, -0x800001

    .line 179
    iput p2, p0, Landroidx/viewpager/widget/ViewPager;->onMediaButtonEvent:F

    const p2, 0x7f7fffff    # Float.MAX_VALUE

    .line 180
    iput p2, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    const/4 p2, 0x1

    .line 189
    iput p2, p0, Landroidx/viewpager/widget/ViewPager;->setSessionImpl:I

    .line 207
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    .line 234
    iput-boolean p2, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    const/4 p1, 0x0

    .line 235
    iput-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->onSetCaptioningEnabled:Z

    .line 269
    new-instance p2, Landroidx/viewpager/widget/ViewPager$1;

    invoke-direct {p2, p0}, Landroidx/viewpager/widget/ViewPager$1;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    iput-object p2, p0, Landroidx/viewpager/widget/ViewPager;->onCustomAction:Ljava/lang/Runnable;

    .line 277
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->ResultReceiver:I

    .line 397
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaMetadataCompat()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(II)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;
    .registers 5

    .line 1008
    new-instance v0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;-><init>()V

    .line 1009
    iput p1, v0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    .line 1010
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v1, p0, p1}, Lo/getComponentEnabledSetting;->read(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->write:Ljava/lang/Object;

    .line 1011
    invoke-static {}, Lo/getComponentEnabledSetting;->IconCompatParcelizer()F

    move-result p1

    iput p1, v0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    if-ltz p2, :cond_25

    .line 1012
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-ge p2, p1, :cond_25

    .line 1015
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {p0, p2, v0}, Ljava/util/AbstractList;->add(ILjava/lang/Object;)V

    return-object v0

    .line 1013
    :cond_25
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;
    .registers 6

    const/4 v0, 0x0

    .line 1512
    :goto_1
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_1f

    .line 1513
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1514
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    iget-object v3, v1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->write:Ljava/lang/Object;

    invoke-virtual {v2, p1, v3}, Lo/getComponentEnabledSetting;->RemoteActionCompatParcelizer(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    return-object v1

    :cond_1c
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1f
    const/4 p0, 0x0

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 2659
    iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    .line 2660
    iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItem:Z

    .line 2662
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_f

    .line 2663
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 2664
    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    :cond_f
    return-void
.end method

.method private AudioAttributesCompatParcelizer(I)V
    .registers 5

    .line 1940
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToPrevious:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_7

    .line 1941
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(I)V

    .line 1943
    :cond_7
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    if-eqz v0, :cond_22

    .line 1944
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v0, :cond_22

    .line 1945
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz v2, :cond_1f

    .line 1947
    invoke-interface {v2, p1}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(I)V

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    .line 1951
    :cond_22
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromMediaId:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_29

    .line 1952
    invoke-interface {p0, p1}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(I)V

    :cond_29
    return-void
.end method

.method private AudioAttributesCompatParcelizer(IIII)V
    .registers 10

    if-lez p2, :cond_49

    .line 1655
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_49

    .line 1656
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_21

    .line 1657
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result p2

    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result p0

    mul-int/2addr p2, p0

    invoke-virtual {p1, p2}, Landroid/widget/Scroller;->setFinalX(I)V

    return-void

    .line 1659
    :cond_21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    .line 1660
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    .line 1662
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    sub-int/2addr p2, v2

    sub-int/2addr p2, v3

    add-int/2addr p2, p4

    int-to-float p2, p2

    div-float/2addr v4, p2

    sub-int/2addr p1, v0

    sub-int/2addr p1, v1

    add-int/2addr p1, p3

    int-to-float p1, p1

    mul-float/2addr v4, p1

    float-to-int p1, v4

    .line 1666
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    return-void

    .line 1669
    :cond_49
    iget p2, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    invoke-direct {p0, p2}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer(I)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object p2

    if-eqz p2, :cond_5a

    .line 1670
    iget p2, p2, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    iget p3, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    move-result p2

    goto :goto_5b

    :cond_5a
    const/4 p2, 0x0

    .line 1672
    :goto_5b
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    sub-int/2addr p1, p3

    int-to-float p1, p1

    mul-float/2addr p2, p1

    float-to-int p1, p2

    .line 1673
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p2

    if-eq p1, p2, :cond_79

    const/4 p2, 0x0

    .line 1674
    invoke-direct {p0, p2}, Landroidx/viewpager/widget/ViewPager;->write(Z)V

    .line 1675
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    :cond_79
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Z)V
    .registers 3

    .line 2669
    iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Z

    if-eq v0, p1, :cond_6

    .line 2670
    iput-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw:Z

    :cond_6
    return-void
.end method

.method private AudioAttributesImplApi21Parcelizer()I
    .registers 3

    .line 600
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method private AudioAttributesImplApi21Parcelizer(I)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;
    .registers 5

    const/4 v0, 0x0

    .line 1533
    :goto_1
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_19

    .line 1534
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1535
    iget v2, v1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ne v2, p1, :cond_16

    return-object v1

    :cond_16
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_19
    const/4 p0, 0x0

    return-object p0
.end method

.method private AudioAttributesImplApi26Parcelizer()Z
    .registers 2

    const/4 v0, -0x1

    .line 2294
    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    .line 2295
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer()V

    .line 2296
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 2297
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 2298
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_22

    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p0

    if-nez p0, :cond_22

    const/4 p0, 0x0

    return p0

    :cond_22
    const/4 p0, 0x1

    return p0
.end method

.method private AudioAttributesImplBaseParcelizer()V
    .registers 3

    const/4 v0, 0x0

    .line 555
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1d

    .line 556
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 557
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 558
    iget-boolean v1, v1, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-nez v1, :cond_1a

    .line 559
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    add-int/lit8 v0, v0, -0x1

    :cond_1a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1d
    return-void
.end method

.method private IconCompatParcelizer(IFII)I
    .registers 6

    .line 2406
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result p4

    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->onPlay:I

    if-le p4, v0, :cond_15

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p4

    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->onSetRepeatMode:I

    if-le p4, v0, :cond_15

    if-gtz p3, :cond_23

    add-int/lit8 p1, p1, 0x1

    goto :goto_23

    .line 2409
    :cond_15
    iget p3, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-lt p1, p3, :cond_1d

    const p3, 0x3ecccccd    # 0.4f

    goto :goto_20

    :cond_1d
    const p3, 0x3f19999a    # 0.6f

    :goto_20
    add-float/2addr p2, p3

    float-to-int p2, p2

    add-int/2addr p1, p2

    .line 2413
    :cond_23
    :goto_23
    iget-object p2, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    if-lez p2, :cond_4f

    .line 2414
    iget-object p2, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 2415
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    invoke-virtual {p0, p3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 2418
    iget p2, p2, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget p0, p0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    :cond_4f
    return p1
.end method

.method private IconCompatParcelizer(IF)V
    .registers 6

    .line 1923
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToPrevious:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_7

    .line 1924
    invoke-interface {v0, p1, p2}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->read(IF)V

    .line 1926
    :cond_7
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    if-eqz v0, :cond_22

    .line 1927
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v0, :cond_22

    .line 1928
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz v2, :cond_1f

    .line 1930
    invoke-interface {v2, p1, p2}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->read(IF)V

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    .line 1934
    :cond_22
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromMediaId:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_29

    .line 1935
    invoke-interface {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->read(IF)V

    :cond_29
    return-void
.end method

.method private IconCompatParcelizer(IFI)V
    .registers 15

    .line 1865
    iget p3, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatMediaItem:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lez p3, :cond_6a

    .line 1866
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p3

    .line 1867
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    .line 1868
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    .line 1869
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 1870
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    move v6, v0

    :goto_1b
    if-ge v6, v5, :cond_6a

    .line 1872
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 1873
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 1874
    iget-boolean v9, v8, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-eqz v9, :cond_67

    .line 1876
    iget v8, v8, Landroidx/viewpager/widget/ViewPager$LayoutParams;->RemoteActionCompatParcelizer:I

    and-int/lit8 v8, v8, 0x7

    if-eq v8, v1, :cond_4c

    const/4 v9, 0x3

    if-eq v8, v9, :cond_46

    const/4 v9, 0x5

    if-eq v8, v9, :cond_39

    move v8, v2

    goto :goto_5b

    :cond_39
    sub-int v8, v4, v3

    .line 1891
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    sub-int/2addr v8, v9

    .line 1892
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v3, v9

    goto :goto_58

    .line 1884
    :cond_46
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v8

    add-int/2addr v8, v2

    goto :goto_5b

    .line 1887
    :cond_4c
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    sub-int v8, v4, v8

    div-int/lit8 v8, v8, 0x2

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    :goto_58
    move v10, v8

    move v8, v2

    move v2, v10

    :goto_5b
    add-int/2addr v2, p3

    .line 1897
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v9

    sub-int/2addr v2, v9

    if-eqz v2, :cond_66

    .line 1899
    invoke-virtual {v7, v2}, Landroid/view/View;->offsetLeftAndRight(I)V

    :cond_66
    move v2, v8

    :cond_67
    add-int/lit8 v6, v6, 0x1

    goto :goto_1b

    .line 1904
    :cond_6a
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(IF)V

    .line 1906
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompat:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;

    if-eqz p1, :cond_91

    .line 1907
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 1908
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    :goto_78
    if-ge v0, p1, :cond_91

    .line 1910
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    .line 1911
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 1913
    iget-boolean p3, p3, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-nez p3, :cond_8e

    .line 1914
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    :cond_8e
    add-int/lit8 v0, v0, 0x1

    goto :goto_78

    .line 1919
    :cond_91
    iput-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer:Z

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/MotionEvent;)V
    .registers 5

    .line 2644
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 2645
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 2646
    iget v2, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    if-ne v1, v2, :cond_24

    if-nez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    .line 2650
    :goto_11
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2651
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    .line 2652
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    if-eqz p0, :cond_24

    .line 2653
    invoke-virtual {p0}, Landroid/view/VelocityTracker;->clear()V

    :cond_24
    return-void
.end method

.method private IconCompatParcelizer(Z)V
    .registers 8

    .line 2015
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_19

    if-eqz p1, :cond_d

    .line 2017
    iget v3, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatToken:I

    goto :goto_e

    :cond_d
    move v3, v1

    .line 2019
    :goto_e
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_19
    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/KeyEvent;)Z
    .registers 5

    .line 2757
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_52

    .line 2758
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x15

    const/4 v2, 0x2

    if-eq v0, v1, :cond_40

    const/16 v1, 0x16

    if-eq v0, v1, :cond_2e

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_52

    .line 2774
    invoke-virtual {p1}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v0

    if-eqz v0, :cond_22

    .line 2775
    invoke-direct {p0, v2}, Landroidx/viewpager/widget/ViewPager;->write(I)Z

    move-result p0

    return p0

    :cond_22
    const/4 v0, 0x1

    .line 2776
    invoke-virtual {p1, v0}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    move-result p1

    if-eqz p1, :cond_52

    .line 2777
    invoke-direct {p0, v0}, Landroidx/viewpager/widget/ViewPager;->write(I)Z

    move-result p0

    return p0

    .line 2767
    :cond_2e
    invoke-virtual {p1, v2}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    move-result p1

    if-eqz p1, :cond_39

    .line 2768
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatMediaItem()Z

    move-result p0

    return p0

    :cond_39
    const/16 p1, 0x42

    .line 2770
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->write(I)Z

    move-result p0

    return p0

    .line 2760
    :cond_40
    invoke-virtual {p1, v2}, Landroid/view/KeyEvent;->hasModifiers(I)Z

    move-result p1

    if-eqz p1, :cond_4b

    .line 2761
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaDescriptionCompat()Z

    move-result p0

    return p0

    :cond_4b
    const/16 p1, 0x11

    .line 2763
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->write(I)Z

    move-result p0

    return p0

    :cond_52
    const/4 p0, 0x0

    return p0
.end method

.method private static IconCompatParcelizer(Landroid/view/View;)Z
    .registers 2

    .line 1498
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 1499
    const-class v0, Landroidx/viewpager/widget/ViewPager$write;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    if-eqz p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method private IconCompatParcelizer(Landroid/view/View;ZIII)Z
    .registers 20

    move-object v0, p1

    .line 2719
    instance-of v1, v0, Landroid/view/ViewGroup;

    const/4 v2, 0x1

    if-eqz v1, :cond_55

    .line 2720
    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup;

    .line 2721
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v3

    .line 2722
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v4

    .line 2723
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    sub-int/2addr v5, v2

    :goto_16
    if-ltz v5, :cond_55

    .line 2728
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    add-int v6, p4, v3

    .line 2729
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    if-lt v6, v8, :cond_52

    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v8

    if-ge v6, v8, :cond_52

    add-int v8, p5, v4

    .line 2730
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v9

    if-lt v8, v9, :cond_52

    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    move-result v9

    if-ge v8, v9, :cond_52

    .line 2731
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v9

    .line 2732
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v10

    const/4 v11, 0x1

    sub-int v12, v6, v9

    sub-int v13, v8, v10

    move-object v6, p0

    move v8, v11

    move/from16 v9, p3

    move v10, v12

    move v11, v13

    .line 2731
    invoke-direct/range {v6 .. v11}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(Landroid/view/View;ZIII)Z

    move-result v6

    if-eqz v6, :cond_52

    return v2

    :cond_52
    add-int/lit8 v5, v5, -0x1

    goto :goto_16

    :cond_55
    if-eqz p2, :cond_61

    move/from16 v1, p3

    neg-int v1, v1

    .line 2738
    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_61

    return v2

    :cond_61
    const/4 v0, 0x0

    return v0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 2

    .line 2303
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    if-eqz p0, :cond_a

    const/4 v0, 0x1

    .line 2305
    invoke-interface {p0, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_a
    return-void
.end method

.method private MediaBrowserCompatItemReceiver()Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;
    .registers 14

    .line 2363
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_f

    .line 2364
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, v0

    div-float/2addr v2, v3

    goto :goto_10

    :cond_f
    move v2, v1

    :goto_10
    if-lez v0, :cond_18

    .line 2365
    iget v3, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    int-to-float v3, v3

    int-to-float v0, v0

    div-float/2addr v3, v0

    goto :goto_19

    :cond_18
    move v3, v1

    :goto_19
    const/4 v0, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    move v8, v0

    move v9, v4

    move v7, v6

    move-object v6, v5

    move v5, v1

    .line 2372
    :goto_22
    iget-object v10, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/AbstractCollection;->size()I

    move-result v10

    if-ge v8, v10, :cond_71

    .line 2373
    iget-object v10, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    if-nez v9, :cond_4b

    .line 2375
    iget v11, v10, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    add-int/2addr v7, v4

    if-eq v11, v7, :cond_4b

    .line 2377
    iget-object v10, p0, Landroidx/viewpager/widget/ViewPager;->_init_lambda2:Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    add-float/2addr v1, v5

    add-float/2addr v1, v3

    .line 2378
    iput v1, v10, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 2379
    iput v7, v10, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    .line 2380
    iget v1, v10, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    invoke-static {}, Lo/getComponentEnabledSetting;->IconCompatParcelizer()F

    move-result v1

    iput v1, v10, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-int/lit8 v8, v8, -0x1

    :cond_4b
    move-object v5, v10

    .line 2383
    iget v1, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 2386
    iget v7, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    if-nez v9, :cond_56

    cmpl-float v9, v2, v1

    if-ltz v9, :cond_71

    :cond_56
    add-float/2addr v7, v1

    add-float/2addr v7, v3

    cmpg-float v6, v2, v7

    if-ltz v6, :cond_70

    .line 2388
    iget-object v6, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    sub-int/2addr v6, v4

    if-eq v8, v6, :cond_70

    .line 2395
    iget v7, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    .line 2397
    iget v6, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-int/lit8 v8, v8, 0x1

    move v9, v0

    move v12, v6

    move-object v6, v5

    move v5, v12

    goto :goto_22

    :cond_70
    return-object v5

    :cond_71
    return-object v6
.end method

.method private MediaBrowserCompatItemReceiver(I)V
    .registers 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 1097
    iget v2, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-eq v2, v1, :cond_f

    .line 1098
    invoke-direct {v0, v2}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer(I)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v2

    .line 1099
    iput v1, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    goto :goto_10

    :cond_f
    const/4 v2, 0x0

    .line 1102
    :goto_10
    iget-object v1, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-nez v1, :cond_18

    .line 1103
    invoke-direct/range {p0 .. p0}, Landroidx/viewpager/widget/ViewPager;->RatingCompat()V

    return-void

    .line 1111
    :cond_18
    iget-boolean v1, v0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatResultReceiverWrapper:Z

    if-eqz v1, :cond_20

    .line 1113
    invoke-direct/range {p0 .. p0}, Landroidx/viewpager/widget/ViewPager;->RatingCompat()V

    return-void

    .line 1120
    :cond_20
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_260

    .line 1124
    iget-object v1, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v1, v0}, Lo/getComponentEnabledSetting;->IconCompatParcelizer(Landroid/view/ViewGroup;)V

    .line 1126
    iget v1, v0, Landroidx/viewpager/widget/ViewPager;->setSessionImpl:I

    .line 1127
    iget v4, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    sub-int/2addr v4, v1

    const/4 v5, 0x0

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1128
    iget-object v6, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v6}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v6

    add-int/lit8 v7, v6, -0x1

    .line 1129
    iget v8, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    add-int/2addr v8, v1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1131
    iget v7, v0, Landroidx/viewpager/widget/ViewPager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne v6, v7, :cond_20b

    move v7, v5

    .line 1149
    :goto_49
    iget-object v8, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ge v7, v8, :cond_69

    .line 1150
    iget-object v8, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1151
    iget v9, v8, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget v10, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-lt v9, v10, :cond_66

    .line 1152
    iget v9, v8, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget v10, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-ne v9, v10, :cond_69

    goto :goto_6a

    :cond_66
    add-int/lit8 v7, v7, 0x1

    goto :goto_49

    :cond_69
    const/4 v8, 0x0

    :goto_6a
    if-nez v8, :cond_74

    if-lez v6, :cond_74

    .line 1158
    iget v8, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    invoke-direct {v0, v8, v7}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(II)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v8

    :cond_74
    const/4 v9, 0x0

    if-eqz v8, :cond_19a

    add-int/lit8 v10, v7, -0x1

    if-ltz v10, :cond_84

    .line 1167
    iget-object v11, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_85

    :cond_84
    const/4 v11, 0x0

    .line 1168
    :goto_85
    invoke-direct/range {p0 .. p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result v12

    const/high16 v13, 0x40000000    # 2.0f

    if-gtz v12, :cond_8f

    move v14, v9

    goto :goto_9b

    .line 1169
    :cond_8f
    iget v14, v8, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    sub-float v14, v13, v14

    .line 1170
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v15

    int-to-float v15, v15

    int-to-float v3, v12

    div-float/2addr v15, v3

    add-float/2addr v14, v15

    .line 1171
    :goto_9b
    iget v3, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    add-int/lit8 v3, v3, -0x1

    move v15, v9

    :goto_a0
    if-ltz v3, :cond_ff

    cmpl-float v16, v15, v14

    if-ltz v16, :cond_cd

    if-ge v3, v4, :cond_cd

    if-eqz v11, :cond_ff

    .line 1176
    iget v5, v11, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ne v3, v5, :cond_fb

    iget-boolean v5, v11, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    if-nez v5, :cond_fb

    .line 1177
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v10}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    .line 1178
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    iget-object v11, v11, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->write:Ljava/lang/Object;

    invoke-virtual {v5, v0, v11}, Lo/getComponentEnabledSetting;->IconCompatParcelizer(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    add-int/lit8 v10, v10, -0x1

    add-int/lit8 v7, v7, -0x1

    if-ltz v10, :cond_f9

    .line 1185
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v10}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_fa

    :cond_cd
    if-eqz v11, :cond_e3

    .line 1187
    iget v5, v11, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ne v3, v5, :cond_e3

    .line 1188
    iget v5, v11, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v15, v5

    add-int/lit8 v10, v10, -0x1

    if-ltz v10, :cond_f9

    .line 1190
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v10}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_fa

    :cond_e3
    add-int/lit8 v5, v10, 0x1

    .line 1192
    invoke-direct {v0, v3, v5}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(II)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v5

    .line 1193
    iget v5, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v15, v5

    add-int/lit8 v7, v7, 0x1

    if-ltz v10, :cond_f9

    .line 1195
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v10}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_fa

    :cond_f9
    const/4 v5, 0x0

    :goto_fa
    move-object v11, v5

    :cond_fb
    add-int/lit8 v3, v3, -0x1

    const/4 v5, 0x0

    goto :goto_a0

    .line 1199
    :cond_ff
    iget v3, v8, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-int/lit8 v4, v7, 0x1

    cmpg-float v5, v3, v13

    if-gez v5, :cond_190

    .line 1202
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ge v4, v5, :cond_118

    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_119

    :cond_118
    const/4 v5, 0x0

    :goto_119
    if-gtz v12, :cond_11d

    move v10, v9

    goto :goto_125

    .line 1204
    :cond_11d
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v10

    int-to-float v10, v10

    int-to-float v11, v12

    div-float/2addr v10, v11

    add-float/2addr v10, v13

    .line 1205
    :goto_125
    iget v11, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    :cond_127
    :goto_127
    add-int/lit8 v11, v11, 0x1

    if-ge v11, v6, :cond_190

    cmpl-float v12, v3, v10

    if-ltz v12, :cond_158

    if-le v11, v1, :cond_158

    if-eqz v5, :cond_190

    .line 1210
    iget v12, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ne v11, v12, :cond_127

    iget-boolean v12, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    if-nez v12, :cond_127

    .line 1211
    iget-object v12, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v12, v4}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    .line 1212
    iget-object v12, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    iget-object v5, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->write:Ljava/lang/Object;

    invoke-virtual {v12, v0, v5}, Lo/getComponentEnabledSetting;->IconCompatParcelizer(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 1217
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ge v4, v5, :cond_18e

    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_127

    :cond_158
    if-eqz v5, :cond_174

    .line 1219
    iget v12, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ne v11, v12, :cond_174

    .line 1220
    iget v5, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    .line 1222
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ge v4, v5, :cond_18e

    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_127

    .line 1224
    :cond_174
    invoke-direct {v0, v11, v4}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(II)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    .line 1226
    iget v5, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v3, v5

    .line 1227
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ge v4, v5, :cond_18e

    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_127

    :cond_18e
    const/4 v5, 0x0

    goto :goto_127

    .line 1232
    :cond_190
    invoke-direct {v0, v8, v7, v2}, Landroidx/viewpager/widget/ViewPager;->read(Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;ILandroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;)V

    .line 1234
    iget-object v1, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    iget-object v2, v8, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->write:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lo/getComponentEnabledSetting;->RemoteActionCompatParcelizer(Ljava/lang/Object;)V

    .line 1244
    :cond_19a
    iget-object v1, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v1}, Lo/getComponentEnabledSetting;->write()V

    .line 1248
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_1a4
    if-ge v2, v1, :cond_1cd

    .line 1250
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1251
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 1252
    iput v2, v4, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesCompatParcelizer:I

    .line 1253
    iget-boolean v5, v4, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-nez v5, :cond_1ca

    iget v5, v4, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesImplApi21Parcelizer:F

    cmpl-float v5, v5, v9

    if-nez v5, :cond_1ca

    .line 1255
    invoke-direct {v0, v3}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v3

    if-eqz v3, :cond_1ca

    .line 1257
    iget v5, v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    iput v5, v4, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesImplApi21Parcelizer:F

    .line 1258
    iget v3, v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iput v3, v4, Landroidx/viewpager/widget/ViewPager$LayoutParams;->IconCompatParcelizer:I

    :cond_1ca
    add-int/lit8 v2, v2, 0x1

    goto :goto_1a4

    .line 1262
    :cond_1cd
    invoke-direct/range {p0 .. p0}, Landroidx/viewpager/widget/ViewPager;->RatingCompat()V

    .line 1264
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_260

    .line 1265
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1e1

    .line 1266
    invoke-direct {v0, v1}, Landroidx/viewpager/widget/ViewPager;->write(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v3

    goto :goto_1e2

    :cond_1e1
    const/4 v3, 0x0

    :goto_1e2
    if-eqz v3, :cond_1ea

    .line 1267
    iget v1, v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget v2, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-eq v1, v2, :cond_260

    :cond_1ea
    const/4 v5, 0x0

    .line 1268
    :goto_1eb
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v5, v1, :cond_260

    .line 1269
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1270
    invoke-direct {v0, v1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v2

    if-eqz v2, :cond_208

    .line 1271
    iget v2, v2, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget v3, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-ne v2, v3, :cond_208

    const/4 v2, 0x2

    .line 1272
    invoke-virtual {v1, v2}, Landroid/view/View;->requestFocus(I)Z

    move-result v1

    if-nez v1, :cond_260

    :cond_208
    add-int/lit8 v5, v5, 0x1

    goto :goto_1eb

    .line 1134
    :cond_20b
    :try_start_20b
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1
    :try_end_217
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_20b .. :try_end_217} :catch_218

    goto :goto_220

    .line 1136
    :catch_218
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    .line 1138
    :goto_220
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v0, Landroidx/viewpager/widget/ViewPager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", found: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " Pager id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Pager class: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1142
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " Problematic adapter: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    .line 1143
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_260
    return-void
.end method

.method private MediaBrowserCompatMediaItem()Z
    .registers 4

    .line 2893
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-eqz v0, :cond_15

    iget v1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    if-ge v1, v0, :cond_15

    .line 2894
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    add-int/2addr v0, v2

    invoke-virtual {p0, v0, v2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    return v2

    :cond_15
    const/4 p0, 0x0

    return p0
.end method

.method private MediaDescriptionCompat()Z
    .registers 3

    .line 2885
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-lez v0, :cond_a

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    .line 2886
    invoke-virtual {p0, v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    return v1

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method private MediaMetadataCompat()V
    .registers 6

    const/4 v0, 0x0

    .line 401
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    const/high16 v0, 0x40000

    .line 402
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    const/4 v0, 0x1

    .line 403
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 404
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 405
    new-instance v2, Landroid/widget/Scroller;

    sget-object v3, Landroidx/viewpager/widget/ViewPager;->write:Landroid/view/animation/Interpolator;

    invoke-direct {v2, v1, v3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v2, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    .line 406
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    .line 407
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 409
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    move-result v4

    iput v4, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

    const/high16 v4, 0x43c80000    # 400.0f

    mul-float/2addr v4, v3

    float-to-int v4, v4

    .line 410
    iput v4, p0, Landroidx/viewpager/widget/ViewPager;->onSetRepeatMode:I

    .line 411
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v2

    iput v2, p0, Landroidx/viewpager/widget/ViewPager;->onSetRating:I

    .line 412
    new-instance v2, Landroid/widget/EdgeEffect;

    invoke-direct {v2, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/viewpager/widget/ViewPager;->onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

    .line 413
    new-instance v2, Landroid/widget/EdgeEffect;

    invoke-direct {v2, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

    const/high16 v1, 0x41c80000    # 25.0f

    mul-float/2addr v1, v3

    float-to-int v1, v1

    .line 415
    iput v1, p0, Landroidx/viewpager/widget/ViewPager;->onPlay:I

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v3

    float-to-int v1, v1

    .line 416
    iput v1, p0, Landroidx/viewpager/widget/ViewPager;->MediaMetadataCompat:I

    const/high16 v1, 0x41800000    # 16.0f

    mul-float/2addr v3, v1

    float-to-int v1, v3

    .line 417
    iput v1, p0, Landroidx/viewpager/widget/ViewPager;->RatingCompat:I

    .line 419
    new-instance v1, Landroidx/viewpager/widget/ViewPager$read;

    invoke-direct {v1, p0}, Landroidx/viewpager/widget/ViewPager$read;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    invoke-static {p0, v1}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/deserializeUsingCustom;)V

    .line 421
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_6b

    .line 423
    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    .line 427
    :cond_6b
    new-instance v0, Landroidx/viewpager/widget/ViewPager$2;

    invoke-direct {v0, p0}, Landroidx/viewpager/widget/ViewPager$2;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Lo/finishBranchObject;)V

    return-void
.end method

.method private RatingCompat()V
    .registers 5

    .line 1282
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->onAddQueueItem:I

    if-eqz v0, :cond_2d

    .line 1283
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onCommand:Ljava/util/ArrayList;

    if-nez v0, :cond_10

    .line 1284
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onCommand:Ljava/util/ArrayList;

    goto :goto_13

    .line 1286
    :cond_10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 1288
    :goto_13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_18
    if-ge v1, v0, :cond_26

    .line 1290
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1291
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->onCommand:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    .line 1293
    :cond_26
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onCommand:Ljava/util/ArrayList;

    sget-object v0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/viewpager/widget/ViewPager$MediaBrowserCompatCustomActionResultReceiver;

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_2d
    return-void
.end method

.method private RemoteActionCompatParcelizer(I)V
    .registers 5

    .line 1957
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToPrevious:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_7

    .line 1958
    invoke-interface {v0, p1}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->IconCompatParcelizer(I)V

    .line 1960
    :cond_7
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    if-eqz v0, :cond_22

    .line 1961
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v0, :cond_22

    .line 1962
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz v2, :cond_1f

    .line 1964
    invoke-interface {v2, p1}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->IconCompatParcelizer(I)V

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    .line 1968
    :cond_22
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromMediaId:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    if-eqz p0, :cond_29

    .line 1969
    invoke-interface {p0, p1}, Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;->IconCompatParcelizer(I)V

    :cond_29
    return-void
.end method

.method private RemoteActionCompatParcelizer(FF)Z
    .registers 5

    .line 2011
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->onPause:I

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    const/4 v1, 0x0

    if-gez v0, :cond_c

    cmpl-float v0, p2, v1

    if-gtz v0, :cond_1c

    :cond_c
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget p0, p0, Landroidx/viewpager/widget/ViewPager;->onPause:I

    sub-int/2addr v0, p0

    int-to-float p0, v0

    cmpl-float p0, p1, p0

    if-lez p0, :cond_1e

    cmpg-float p0, p2, v1

    if-gez p0, :cond_1e

    :cond_1c
    const/4 p0, 0x1

    return p0

    :cond_1e
    const/4 p0, 0x0

    return p0
.end method

.method private read(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    .registers 5

    if-nez p1, :cond_7

    .line 2860
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    :cond_7
    if-nez p2, :cond_e

    const/4 p0, 0x0

    .line 2863
    invoke-virtual {p1, p0, p0, p0, p0}, Landroid/graphics/Rect;->set(IIII)V

    return-object p1

    .line 2866
    :cond_e
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 2867
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 2868
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 2869
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 2871
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    .line 2872
    :goto_2a
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_5b

    if-eq p2, p0, :cond_5b

    .line 2873
    check-cast p2, Landroid/view/ViewGroup;

    .line 2874
    iget v0, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 2875
    iget v0, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 2876
    iget v0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 2877
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 2879
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    goto :goto_2a

    :cond_5b
    return-object p1
.end method

.method private read(IZIZ)V
    .registers 10

    .line 676
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer(I)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1d

    .line 679
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    int-to-float v2, v2

    .line 680
    iget v3, p0, Landroidx/viewpager/widget/ViewPager;->onMediaButtonEvent:F

    iget v0, v0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    iget v4, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    .line 681
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 680
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    mul-float/2addr v2, v0

    float-to-int v0, v2

    goto :goto_1e

    :cond_1d
    move v0, v1

    :goto_1e
    if-eqz p2, :cond_29

    .line 684
    invoke-direct {p0, v0, p3}, Landroidx/viewpager/widget/ViewPager;->write(II)V

    if-eqz p4, :cond_28

    .line 686
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(I)V

    :cond_28
    return-void

    :cond_29
    if-eqz p4, :cond_2e

    .line 690
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(I)V

    .line 692
    :cond_2e
    invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->write(Z)V

    .line 693
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->scrollTo(II)V

    .line 694
    invoke-direct {p0, v0}, Landroidx/viewpager/widget/ViewPager;->read(I)Z

    return-void
.end method

.method private read(IZZ)V
    .registers 5

    const/4 v0, 0x0

    .line 631
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/viewpager/widget/ViewPager;->write(IZZI)V

    return-void
.end method

.method private read(Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;ILandroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;)V
    .registers 13

    .line 1298
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v0}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v0

    .line 1299
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    if-lez v1, :cond_12

    .line 1300
    iget v2, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    int-to-float v2, v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    goto :goto_13

    :cond_12
    const/4 v2, 0x0

    :goto_13
    const/4 v1, 0x0

    if-eqz p3, :cond_ad

    .line 1303
    iget v3, p3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    .line 1305
    iget v4, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ge v3, v4, :cond_68

    .line 1308
    iget v4, p3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    iget p3, p3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v4, p3

    add-float/2addr v4, v2

    add-int/lit8 v3, v3, 0x1

    move p3, v1

    .line 1310
    :goto_25
    iget v5, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-gt v3, v5, :cond_ad

    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ge p3, v5, :cond_ad

    .line 1311
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, p3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1312
    :goto_39
    iget v6, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-le v3, v6, :cond_52

    iget-object v6, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-ge p3, v6, :cond_52

    add-int/lit8 p3, p3, 0x1

    .line 1314
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, p3}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_39

    .line 1316
    :cond_52
    :goto_52
    iget v6, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ge v3, v6, :cond_5f

    .line 1319
    invoke-static {}, Lo/getComponentEnabledSetting;->IconCompatParcelizer()F

    move-result v6

    add-float/2addr v6, v2

    add-float/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_52

    .line 1322
    :cond_5f
    iput v4, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 1323
    iget v5, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v5, v2

    add-float/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_25

    .line 1325
    :cond_68
    iget v4, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-le v3, v4, :cond_ad

    .line 1326
    iget-object v4, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    .line 1328
    iget p3, p3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    add-int/lit8 v3, v3, -0x1

    .line 1330
    :goto_78
    iget v5, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-lt v3, v5, :cond_ad

    if-ltz v4, :cond_ad

    .line 1331
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1332
    :goto_86
    iget v6, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ge v3, v6, :cond_97

    if-lez v4, :cond_97

    add-int/lit8 v4, v4, -0x1

    .line 1334
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_86

    .line 1336
    :cond_97
    :goto_97
    iget v6, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-le v3, v6, :cond_a4

    .line 1339
    invoke-static {}, Lo/getComponentEnabledSetting;->IconCompatParcelizer()F

    move-result v6

    add-float/2addr v6, v2

    sub-float/2addr p3, v6

    add-int/lit8 v3, v3, -0x1

    goto :goto_97

    .line 1342
    :cond_a4
    iget v6, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v6, v2

    sub-float/2addr p3, v6

    .line 1343
    iput p3, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    add-int/lit8 v3, v3, -0x1

    goto :goto_78

    .line 1349
    :cond_ad
    iget-object p3, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    .line 1350
    iget v3, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 1351
    iget v4, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    add-int/lit8 v4, v4, -0x1

    .line 1352
    iget v5, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-nez v5, :cond_c0

    iget v5, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    goto :goto_c3

    :cond_c0
    const v5, -0x800001

    :goto_c3
    iput v5, p0, Landroidx/viewpager/widget/ViewPager;->onMediaButtonEvent:F

    .line 1353
    iget v5, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    add-int/lit8 v0, v0, -0x1

    const/high16 v6, 0x3f800000    # 1.0f

    if-ne v5, v0, :cond_d4

    iget v5, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    iget v7, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v5, v7

    sub-float/2addr v5, v6

    goto :goto_d7

    :cond_d4
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    :goto_d7
    iput v5, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    add-int/lit8 v5, p2, -0x1

    :goto_db
    if-ltz v5, :cond_103

    .line 1357
    iget-object v7, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1358
    :goto_e5
    iget v8, v7, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-le v4, v8, :cond_f2

    .line 1359
    invoke-static {}, Lo/getComponentEnabledSetting;->IconCompatParcelizer()F

    move-result v8

    add-float/2addr v8, v2

    sub-float/2addr v3, v8

    add-int/lit8 v4, v4, -0x1

    goto :goto_e5

    .line 1361
    :cond_f2
    iget v8, v7, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v8, v2

    sub-float/2addr v3, v8

    .line 1362
    iput v3, v7, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 1363
    iget v7, v7, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-nez v7, :cond_fe

    iput v3, p0, Landroidx/viewpager/widget/ViewPager;->onMediaButtonEvent:F

    :cond_fe
    add-int/lit8 v5, v5, -0x1

    add-int/lit8 v4, v4, -0x1

    goto :goto_db

    .line 1365
    :cond_103
    iget v3, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    iget v4, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v3, v4

    add-float/2addr v3, v2

    .line 1366
    iget p1, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    :goto_10f
    if-ge p2, p3, :cond_13b

    .line 1369
    iget-object v4, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v4, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1370
    :goto_119
    iget v5, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ge p1, v5, :cond_126

    .line 1371
    invoke-static {}, Lo/getComponentEnabledSetting;->IconCompatParcelizer()F

    move-result v5

    add-float/2addr v5, v2

    add-float/2addr v3, v5

    add-int/lit8 p1, p1, 0x1

    goto :goto_119

    .line 1373
    :cond_126
    iget v5, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ne v5, v0, :cond_130

    .line 1374
    iget v5, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v5, v3

    sub-float/2addr v5, v6

    iput v5, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    .line 1376
    :cond_130
    iput v3, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 1377
    iget v4, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v4, v2

    add-float/2addr v3, v4

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_10f

    .line 1380
    :cond_13b
    iput-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->onSetCaptioningEnabled:Z

    return-void
.end method

.method private read(F)Z
    .registers 11

    .line 2312
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2313
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2315
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, p1

    add-float/2addr v1, v0

    .line 2317
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result p1

    int-to-float p1, p1

    .line 2319
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->onMediaButtonEvent:F

    mul-float/2addr v0, p1

    .line 2320
    iget v2, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    mul-float/2addr v2, p1

    .line 2324
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 2325
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    invoke-virtual {v5, v6}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 2326
    iget v6, v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-eqz v6, :cond_36

    .line 2328
    iget v0, v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    mul-float/2addr v0, p1

    move v3, v4

    goto :goto_37

    :cond_36
    move v3, v7

    .line 2330
    :goto_37
    iget v6, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget-object v8, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v8}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v8

    sub-int/2addr v8, v7

    if-eq v6, v8, :cond_47

    .line 2332
    iget v2, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    mul-float/2addr v2, p1

    move v5, v4

    goto :goto_48

    :cond_47
    move v5, v7

    :goto_48
    cmpg-float v6, v1, v0

    if-gez v6, :cond_5d

    if-eqz v3, :cond_5b

    .line 2338
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

    sub-float v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    div-float/2addr v1, p1

    invoke-virtual {v2, v1}, Landroid/widget/EdgeEffect;->onPull(F)V

    move v4, v7

    :cond_5b
    move v1, v0

    goto :goto_70

    :cond_5d
    cmpl-float v0, v1, v2

    if-lez v0, :cond_70

    if-eqz v5, :cond_6f

    .line 2345
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    div-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/EdgeEffect;->onPull(F)V

    move v4, v7

    :cond_6f
    move v1, v2

    .line 2351
    :cond_70
    :goto_70
    iget p1, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    float-to-int v0, v1

    int-to-float v2, v0

    sub-float/2addr v1, v2

    add-float/2addr p1, v1

    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2352
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->scrollTo(II)V

    .line 2353
    invoke-direct {p0, v0}, Landroidx/viewpager/widget/ViewPager;->read(I)Z

    return v4
.end method

.method private read(I)Z
    .registers 10

    .line 1818
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const-string v1, "onPageScrolled did not call superclass implementation"

    const/4 v2, 0x0

    if-nez v0, :cond_21

    .line 1819
    iget-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    if-eqz p1, :cond_10

    return v2

    .line 1824
    :cond_10
    iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer:Z

    const/4 p1, 0x0

    .line 1825
    invoke-direct {p0, v2, p1, v2}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(IFI)V

    .line 1826
    iget-boolean p0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz p0, :cond_1b

    return v2

    .line 1827
    :cond_1b
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1832
    :cond_21
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver()Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v0

    .line 1833
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result v3

    .line 1834
    iget v4, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    int-to-float v5, v4

    int-to-float v6, v3

    div-float/2addr v5, v6

    .line 1836
    iget v7, v0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    int-to-float p1, p1

    div-float/2addr p1, v6

    .line 1837
    iget v6, v0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    sub-float/2addr p1, v6

    iget v0, v0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v0, v5

    div-float/2addr p1, v0

    add-int/2addr v3, v4

    int-to-float v0, v3

    mul-float/2addr v0, p1

    float-to-int v0, v0

    .line 1841
    iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer:Z

    .line 1842
    invoke-direct {p0, v7, p1, v0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(IFI)V

    .line 1843
    iget-boolean p0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz p0, :cond_48

    const/4 p0, 0x1

    return p0

    .line 1844
    :cond_48
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static write(F)F
    .registers 3

    const/high16 v0, 0x3f000000    # 0.5f

    sub-float/2addr p0, v0

    const v0, 0x3ef1463b

    mul-float/2addr p0, v0

    float-to-double v0, p0

    .line 929
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method private write(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;
    .registers 3

    .line 1523
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_12

    if-eqz v0, :cond_10

    .line 1524
    instance-of p1, v0, Landroid/view/View;

    if-eqz p1, :cond_10

    .line 1527
    move-object p1, v0

    check-cast p1, Landroid/view/View;

    goto :goto_0

    :cond_10
    const/4 p0, 0x0

    return-object p0

    .line 1529
    :cond_12
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method private write(II)V
    .registers 12

    .line 950
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_b

    .line 952
    invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Z)V

    return-void

    .line 957
    :cond_b
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2f

    .line 963
    iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromSearch:Z

    if-eqz v0, :cond_20

    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    goto :goto_26

    :cond_20
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->getStartX()I

    move-result v0

    .line 965
    :goto_26
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->abortAnimation()V

    .line 966
    invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Z)V

    goto :goto_33

    .line 968
    :cond_2f
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    :goto_33
    move v3, v0

    .line 970
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    sub-int v5, p1, v3

    rsub-int/lit8 v6, v4, 0x0

    if-nez v5, :cond_4a

    if-nez v6, :cond_4a

    .line 974
    invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->write(Z)V

    .line 975
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer()V

    .line 976
    invoke-virtual {p0, v1}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(I)V

    return-void

    :cond_4a
    const/4 p1, 0x1

    .line 980
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Z)V

    const/4 p1, 0x2

    .line 981
    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(I)V

    .line 983
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    .line 984
    div-int/lit8 v2, v0, 0x2

    .line 985
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v7

    int-to-float v7, v7

    int-to-float v0, v0

    div-float/2addr v7, v0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Ljava/lang/Math;->min(FF)F

    move-result v7

    int-to-float v2, v2

    .line 987
    invoke-static {v7}, Landroidx/viewpager/widget/ViewPager;->write(F)F

    move-result v7

    .line 990
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-lez p2, :cond_82

    mul-float/2addr v7, v2

    add-float/2addr v2, v7

    int-to-float p2, p2

    div-float/2addr v2, p2

    .line 992
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    shl-int/lit8 p1, p2, 0x2

    goto :goto_91

    .line 995
    :cond_82
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    iget p2, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    int-to-float p2, p2

    add-float/2addr v0, p2

    div-float/2addr p1, v0

    add-float/2addr p1, v8

    const/high16 p2, 0x42c80000    # 100.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    :goto_91
    const/16 p2, 0x258

    .line 998
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 1002
    iput-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromSearch:Z

    .line 1003
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual/range {v2 .. v7}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 1004
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    return-void
.end method

.method private write(IZZI)V
    .registers 9

    .line 635
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    const/4 v1, 0x0

    if-eqz v0, :cond_6d

    invoke-virtual {v0}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v0

    if-lez v0, :cond_6d

    if-nez p3, :cond_1d

    .line 639
    iget p3, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-ne p3, p1, :cond_1d

    iget-object p3, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-eqz p3, :cond_1d

    .line 640
    invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Z)V

    return-void

    :cond_1d
    const/4 p3, 0x1

    if-gez p1, :cond_22

    move p1, v1

    goto :goto_31

    .line 646
    :cond_22
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v0}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v0

    if-lt p1, v0, :cond_31

    .line 647
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {p1}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result p1

    sub-int/2addr p1, p3

    .line 649
    :cond_31
    :goto_31
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->setSessionImpl:I

    .line 650
    iget v2, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    add-int v3, v2, v0

    if-gt p1, v3, :cond_3c

    sub-int/2addr v2, v0

    if-ge p1, v2, :cond_52

    :cond_3c
    move v0, v1

    .line 654
    :goto_3d
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v0, v2, :cond_52

    .line 655
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    iput-boolean p3, v2, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3d

    .line 658
    :cond_52
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-eq v0, p1, :cond_57

    move v1, p3

    .line 660
    :cond_57
    iget-boolean p3, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    if-eqz p3, :cond_66

    .line 663
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-eqz v1, :cond_62

    .line 665
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(I)V

    .line 667
    :cond_62
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    .line 669
    :cond_66
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver(I)V

    .line 670
    invoke-direct {p0, p1, p2, p4, v1}, Landroidx/viewpager/widget/ViewPager;->read(IZIZ)V

    return-void

    .line 636
    :cond_6d
    invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Z)V

    return-void
.end method

.method private write(Z)V
    .registers 9

    .line 1974
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->ResultReceiver:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_9

    move v0, v2

    goto :goto_a

    :cond_9
    move v0, v3

    :goto_a
    if-eqz v0, :cond_3c

    .line 1977
    invoke-direct {p0, v3}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Z)V

    .line 1978
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_3c

    .line 1980
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1981
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    .line 1982
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    .line 1983
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v5}, Landroid/widget/Scroller;->getCurrX()I

    move-result v5

    .line 1984
    iget-object v6, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v6}, Landroid/widget/Scroller;->getCurrY()I

    move-result v6

    if-ne v1, v5, :cond_34

    if-eq v4, v6, :cond_3c

    .line 1986
    :cond_34
    invoke-virtual {p0, v5, v6}, Landroid/view/View;->scrollTo(II)V

    if-eq v5, v1, :cond_3c

    .line 1988
    invoke-direct {p0, v5}, Landroidx/viewpager/widget/ViewPager;->read(I)Z

    .line 1993
    :cond_3c
    iput-boolean v3, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatResultReceiverWrapper:Z

    move v1, v3

    .line 1994
    :goto_3f
    iget-object v4, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    if-ge v1, v4, :cond_59

    .line 1995
    iget-object v4, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1996
    iget-boolean v5, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    if-eqz v5, :cond_56

    .line 1998
    iput-boolean v3, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    move v0, v2

    :cond_56
    add-int/lit8 v1, v1, 0x1

    goto :goto_3f

    :cond_59
    if-eqz v0, :cond_68

    if-eqz p1, :cond_63

    .line 2003
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager;->onCustomAction:Ljava/lang/Runnable;

    invoke-static {p0, p1}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    .line 2005
    :cond_63
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onCustomAction:Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_68
    return-void
.end method

.method private write(I)Z
    .registers 6

    .line 2793
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-ne v0, p0, :cond_7

    goto :goto_40

    :cond_7
    if-eqz v0, :cond_41

    .line 2798
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    :goto_d
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_19

    if-ne v1, p0, :cond_14

    goto :goto_41

    .line 2799
    :cond_14
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_d

    .line 2807
    :cond_19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2808
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2809
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_2d
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_3d

    .line 2811
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2810
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_2d

    .line 2814
    :cond_3d
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :goto_40
    const/4 v0, 0x0

    .line 2821
    :cond_41
    :goto_41
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x42

    const/16 v3, 0x11

    if-eqz v1, :cond_8c

    if-eq v1, v0, :cond_8c

    if-ne p1, v3, :cond_6c

    .line 2827
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Landroid/graphics/Rect;

    invoke-direct {p0, v2, v1}, Landroidx/viewpager/widget/ViewPager;->read(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 2828
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Landroid/graphics/Rect;

    invoke-direct {p0, v3, v0}, Landroidx/viewpager/widget/ViewPager;->read(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->left:I

    if-eqz v0, :cond_67

    if-ge v2, v3, :cond_9d

    .line 2832
    :cond_67
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    move-result v0

    goto :goto_a1

    :cond_6c
    if-ne p1, v2, :cond_96

    .line 2837
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Landroid/graphics/Rect;

    invoke-direct {p0, v2, v1}, Landroidx/viewpager/widget/ViewPager;->read(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Rect;->left:I

    .line 2838
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0:Landroid/graphics/Rect;

    invoke-direct {p0, v3, v0}, Landroidx/viewpager/widget/ViewPager;->read(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->left:I

    if-eqz v0, :cond_87

    if-gt v2, v3, :cond_87

    .line 2840
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatMediaItem()Z

    move-result v0

    goto :goto_a1

    .line 2842
    :cond_87
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    move-result v0

    goto :goto_a1

    :cond_8c
    if-eq p1, v3, :cond_9d

    const/4 v0, 0x1

    if-eq p1, v0, :cond_9d

    if-eq p1, v2, :cond_98

    const/4 v0, 0x2

    if-eq p1, v0, :cond_98

    :cond_96
    const/4 v0, 0x0

    goto :goto_a1

    .line 2850
    :cond_98
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatMediaItem()Z

    move-result v0

    goto :goto_a1

    .line 2847
    :cond_9d
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaDescriptionCompat()Z

    move-result v0

    :goto_a1
    if-eqz v0, :cond_aa

    .line 2853
    invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->playSoundEffect(I)V

    :cond_aa
    return v0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;)V
    .registers 2

    .line 594
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplBaseParcelizer:Ljava/util/List;

    if-eqz p0, :cond_7

    .line 595
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_7
    return-void
.end method

.method final IconCompatParcelizer()V
    .registers 2

    .line 1092
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    invoke-direct {p0, v0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver(I)V

    return-void
.end method

.method final IconCompatParcelizer(I)V
    .registers 3

    .line 488
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->ResultReceiver:I

    if-ne v0, p1, :cond_5

    return-void

    .line 492
    :cond_5
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->ResultReceiver:I

    .line 493
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompat:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;

    if-eqz v0, :cond_13

    if-eqz p1, :cond_f

    const/4 v0, 0x1

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    .line 495
    :goto_10
    invoke-direct {p0, v0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(Z)V

    .line 497
    :cond_13
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->RemoteActionCompatParcelizer(I)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;)V
    .registers 2

    .line 736
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    if-eqz p0, :cond_7

    .line 737
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_7
    return-void
.end method

.method final RemoteActionCompatParcelizer(Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;)Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;
    .registers 3

    .line 815
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromMediaId:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    .line 816
    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromMediaId:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    return-object v0
.end method

.method final RemoteActionCompatParcelizer()V
    .registers 8

    .line 1023
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v0}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v0

    .line 1024
    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 1025
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    iget v2, p0, Landroidx/viewpager/widget/ViewPager;->setSessionImpl:I

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    add-int/2addr v2, v3

    const/4 v4, 0x0

    if-ge v1, v2, :cond_20

    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    .line 1026
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v1, v0, :cond_20

    move v0, v3

    goto :goto_21

    :cond_20
    move v0, v4

    .line 1027
    :goto_21
    iget v1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    move v2, v4

    .line 1030
    :goto_24
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ge v2, v5, :cond_39

    .line 1031
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 1032
    iget-object v5, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->write:Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_24

    .line 1073
    :cond_39
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    sget-object v5, Landroidx/viewpager/widget/ViewPager;->RemoteActionCompatParcelizer:Ljava/util/Comparator;

    invoke-static {v2, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    if-eqz v0, :cond_63

    .line 1077
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v2, v4

    :goto_47
    if-ge v2, v0, :cond_5d

    .line 1079
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1080
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 1081
    iget-boolean v6, v5, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-nez v6, :cond_5a

    const/4 v6, 0x0

    .line 1082
    iput v6, v5, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesImplApi21Parcelizer:F

    :cond_5a
    add-int/lit8 v2, v2, 0x1

    goto :goto_47

    .line 1086
    :cond_5d
    invoke-direct {p0, v1, v4, v3}, Landroidx/viewpager/widget/ViewPager;->read(IZZ)V

    .line 1087
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_63
    return-void
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)V"
        }
    .end annotation

    .line 2905
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 2907
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v1

    const/high16 v2, 0x60000

    if-eq v1, v2, :cond_2f

    const/4 v2, 0x0

    .line 2910
    :goto_d
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_2f

    .line 2911
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 2912
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_2c

    .line 2913
    invoke-direct {p0, v3}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v4

    if-eqz v4, :cond_2c

    .line 2914
    iget v4, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget v5, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-ne v4, v5, :cond_2c

    .line 2915
    invoke-virtual {v3, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_2c
    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_2f
    const/high16 p2, 0x40000

    if-ne v1, p2, :cond_39

    .line 2926
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    if-ne v0, p2, :cond_54

    .line 2929
    :cond_39
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result p2

    if-eqz p2, :cond_54

    const/4 p2, 0x1

    and-int/2addr p3, p2

    if-ne p3, p2, :cond_4f

    .line 2933
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result p2

    if-eqz p2, :cond_4f

    invoke-virtual {p0}, Landroid/view/View;->isFocusableInTouchMode()Z

    move-result p2

    if-eqz p2, :cond_54

    :cond_4f
    if-eqz p1, :cond_54

    .line 2937
    invoke-virtual {p1, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_54
    return-void
.end method

.method public addTouchables(Ljava/util/ArrayList;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2950
    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_23

    .line 2951
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2952
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_20

    .line 2953
    invoke-direct {p0, v1}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v2

    if-eqz v2, :cond_20

    .line 2954
    iget v2, v2, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget v3, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-ne v2, v3, :cond_20

    .line 2955
    invoke-virtual {v1, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V

    :cond_20
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_23
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 7

    .line 1472
    invoke-virtual {p0, p3}, Landroidx/viewpager/widget/ViewPager;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 1473
    invoke-virtual {p0, p3}, Landroidx/viewpager/widget/ViewPager;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    .line 1475
    :cond_a
    move-object v0, p3

    check-cast v0, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 1477
    iget-boolean v1, v0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    invoke-static {p1}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(Landroid/view/View;)Z

    move-result v2

    or-int/2addr v1, v2

    iput-boolean v1, v0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    .line 1478
    iget-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->onFastForward:Z

    if-eqz v1, :cond_30

    if-eqz v0, :cond_29

    .line 1479
    iget-boolean v1, v0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-nez v1, :cond_21

    goto :goto_29

    .line 1480
    :cond_21
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot add pager decor view during layout"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_29
    :goto_29
    const/4 v1, 0x1

    .line 1482
    iput-boolean v1, v0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->write:Z

    .line 1483
    invoke-virtual {p0, p1, p2, p3}, Landroidx/viewpager/widget/ViewPager;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    return-void

    .line 1485
    :cond_30
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public canScrollHorizontally(I)Z
    .registers 6

    .line 2692
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 2696
    :cond_6
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    .line 2697
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    const/4 v3, 0x1

    if-gez p1, :cond_1a

    int-to-float p1, v0

    .line 2699
    iget p0, p0, Landroidx/viewpager/widget/ViewPager;->onMediaButtonEvent:F

    mul-float/2addr p1, p0

    float-to-int p0, p1

    if-le v2, p0, :cond_19

    return v3

    :cond_19
    return v1

    :cond_1a
    if-lez p1, :cond_24

    int-to-float p1, v0

    .line 2701
    iget p0, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    mul-float/2addr p1, p0

    float-to-int p0, p1

    if-ge v2, p0, :cond_24

    return v3

    :cond_24
    return v1
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 3

    .line 3029
    instance-of v0, p1, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    if-eqz v0, :cond_c

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public computeScroll()V
    .registers 5

    const/4 v0, 0x1

    .line 1793
    iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromSearch:Z

    .line 1794
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_41

    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_41

    .line 1795
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    .line 1796
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    .line 1797
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v2}, Landroid/widget/Scroller;->getCurrX()I

    move-result v2

    .line 1798
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v3}, Landroid/widget/Scroller;->getCurrY()I

    move-result v3

    if-ne v0, v2, :cond_2b

    if-eq v1, v3, :cond_3d

    .line 1801
    :cond_2b
    invoke-virtual {p0, v2, v3}, Landroid/view/View;->scrollTo(II)V

    .line 1802
    invoke-direct {p0, v2}, Landroidx/viewpager/widget/ViewPager;->read(I)Z

    move-result v0

    if-nez v0, :cond_3d

    .line 1803
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    const/4 v0, 0x0

    .line 1804
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->scrollTo(II)V

    .line 1809
    :cond_3d
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    return-void

    .line 1814
    :cond_41
    invoke-direct {p0, v0}, Landroidx/viewpager/widget/ViewPager;->write(Z)V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    .line 2744
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(Landroid/view/KeyEvent;)Z

    move-result p0

    if-nez p0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 8

    .line 2997
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x1000

    if-ne v0, v1, :cond_d

    .line 2998
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0

    return p0

    .line 3002
    :cond_d
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_13
    if-ge v2, v0, :cond_36

    .line 3004
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3005
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_33

    .line 3006
    invoke-direct {p0, v3}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v4

    if-eqz v4, :cond_33

    .line 3007
    iget v4, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget v5, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-ne v4, v5, :cond_33

    .line 3008
    invoke-virtual {v3, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v3

    if-eqz v3, :cond_33

    const/4 p0, 0x1

    return p0

    :cond_33
    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_36
    return v1
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 11

    .line 2426
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 2429
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getOverScrollMode()I

    move-result v0

    if-eqz v0, :cond_22

    const/4 v1, 0x1

    if-ne v0, v1, :cond_16

    .line 2430
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-eqz v0, :cond_16

    .line 2432
    invoke-virtual {v0}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v0

    if-gt v0, v1, :cond_22

    .line 2456
    :cond_16
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager;->onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V

    .line 2457
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->finish()V

    goto/16 :goto_ab

    .line 2433
    :cond_22
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_62

    .line 2434
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 2435
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    .line 2436
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    const/high16 v3, 0x43870000    # 270.0f

    .line 2438
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    neg-int v3, v1

    .line 2439
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Landroidx/viewpager/widget/ViewPager;->onMediaButtonEvent:F

    int-to-float v5, v2

    mul-float/2addr v4, v5

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2440
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

    invoke-virtual {v3, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 2441
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->onSetPlaybackSpeed:Landroid/widget/EdgeEffect;

    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v1

    .line 2442
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_63

    :cond_62
    const/4 v1, 0x0

    .line 2444
    :goto_63
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_a6

    .line 2445
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 2446
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 2447
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    const/high16 v6, 0x42b40000    # 90.0f

    .line 2449
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->rotate(F)V

    .line 2450
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    neg-int v6, v6

    int-to-float v6, v6

    iget v7, p0, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItemAt:F

    const/high16 v8, 0x3f800000    # 1.0f

    add-float/2addr v7, v8

    neg-float v7, v7

    int-to-float v8, v2

    mul-float/2addr v7, v8

    invoke-virtual {p1, v6, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2451
    iget-object v6, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

    sub-int/2addr v3, v4

    sub-int/2addr v3, v5

    invoke-virtual {v6, v3, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 2452
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompatCustomAction:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 2453
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_a6
    if-eqz v1, :cond_ab

    .line 2462
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    :cond_ab
    :goto_ab
    return-void
.end method

.method protected drawableStateChanged()V
    .registers 3

    .line 915
    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    .line 916
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_14

    .line 917
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_14

    .line 918
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_14
    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 1

    .line 3019
    new-instance p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager$LayoutParams;-><init>()V

    return-object p0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 3034
    new-instance v0, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroidx/viewpager/widget/ViewPager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 3024
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method protected getChildDrawingOrder(II)I
    .registers 5

    .line 802
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->onAddQueueItem:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_9

    add-int/lit8 p1, p1, -0x1

    sub-int p2, p1, p2

    .line 803
    :cond_9
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onCommand:Ljava/util/ArrayList;

    .line 804
    invoke-virtual {p0, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    iget p0, p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesCompatParcelizer:I

    return p0
.end method

.method protected onAttachedToWindow()V
    .registers 2

    .line 1544
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 1545
    iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    .line 479
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onCustomAction:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 481
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_14

    .line 482
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 484
    :cond_14
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 19

    move-object/from16 v0, p0

    .line 2468
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 2471
    iget v1, v0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    if-lez v1, :cond_aa

    iget-object v1, v0, Landroidx/viewpager/widget/ViewPager;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_aa

    iget-object v1, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-lez v1, :cond_aa

    iget-object v1, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-eqz v1, :cond_aa

    .line 2472
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    .line 2473
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 2475
    iget v3, v0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    int-to-float v3, v3

    int-to-float v4, v2

    div-float/2addr v3, v4

    .line 2477
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 2478
    iget v7, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 2479
    iget-object v8, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    .line 2480
    iget v9, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    .line 2481
    iget-object v10, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    add-int/lit8 v11, v8, -0x1

    invoke-virtual {v10, v11}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    iget v10, v10, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    :goto_45
    if-ge v9, v10, :cond_aa

    .line 2483
    :goto_47
    iget v11, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-le v9, v11, :cond_58

    if-ge v6, v8, :cond_58

    .line 2484
    iget-object v5, v0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    goto :goto_47

    .line 2488
    :cond_58
    iget v11, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    if-ne v9, v11, :cond_69

    .line 2489
    iget v7, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    iget v11, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v7, v11

    mul-float/2addr v7, v4

    .line 2490
    iget v11, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    iget v12, v5, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v11, v12

    add-float/2addr v11, v3

    goto :goto_71

    :cond_69
    const/high16 v11, 0x3f800000    # 1.0f

    add-float v12, v3, v11

    add-float/2addr v12, v7

    add-float/2addr v7, v11

    mul-float/2addr v7, v4

    move v11, v12

    .line 2497
    :goto_71
    iget v12, v0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    int-to-float v12, v12

    add-float/2addr v12, v7

    int-to-float v13, v1

    cmpl-float v12, v12, v13

    if-lez v12, :cond_99

    .line 2498
    iget-object v12, v0, Landroidx/viewpager/widget/ViewPager;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v13

    iget v14, v0, Landroidx/viewpager/widget/ViewPager;->_init_lambda3:I

    iget v15, v0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    int-to-float v15, v15

    add-float/2addr v15, v7

    .line 2499
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    move-result v15

    move/from16 v16, v3

    iget v3, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer:I

    .line 2498
    invoke-virtual {v12, v13, v14, v15, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2500
    iget-object v3, v0, Landroidx/viewpager/widget/ViewPager;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    move-object/from16 v12, p1

    invoke-virtual {v3, v12}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_9d

    :cond_99
    move-object/from16 v12, p1

    move/from16 v16, v3

    :goto_9d
    add-int v3, v1, v2

    int-to-float v3, v3

    cmpl-float v3, v7, v3

    if-gtz v3, :cond_aa

    add-int/lit8 v9, v9, 0x1

    move v7, v11

    move/from16 v3, v16

    goto :goto_45

    :cond_aa
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 17

    move-object v6, p0

    move-object/from16 v7, p1

    .line 2031
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x3

    const/4 v8, 0x0

    if-eq v0, v1, :cond_108

    const/4 v9, 0x1

    if-eq v0, v9, :cond_108

    if-eqz v0, :cond_1c

    .line 2044
    iget-boolean v1, v6, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    if-eqz v1, :cond_17

    return v9

    .line 2048
    :cond_17
    iget-boolean v1, v6, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItem:Z

    if-eqz v1, :cond_1c

    return v8

    :cond_1c
    const/4 v1, 0x2

    if-eqz v0, :cond_a6

    if-eq v0, v1, :cond_29

    const/4 v1, 0x6

    if-ne v0, v1, :cond_f6

    .line 2148
    invoke-direct/range {p0 .. p1}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(Landroid/view/MotionEvent;)V

    goto/16 :goto_f6

    .line 2065
    :cond_29
    iget v0, v6, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_f6

    .line 2071
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 2072
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v10

    .line 2073
    iget v1, v6, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    sub-float v1, v10, v1

    .line 2074
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v11

    .line 2075
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v12

    .line 2076
    iget v0, v6, Landroidx/viewpager/widget/ViewPager;->onPrepareFromSearch:F

    sub-float v0, v12, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v13

    const/4 v0, 0x0

    cmpl-float v14, v1, v0

    if-eqz v14, :cond_6a

    .line 2079
    iget v0, v6, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    invoke-direct {p0, v0, v1}, Landroidx/viewpager/widget/ViewPager;->RemoteActionCompatParcelizer(FF)Z

    move-result v0

    if-nez v0, :cond_6a

    float-to-int v3, v1

    float-to-int v4, v10

    float-to-int v5, v12

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p0

    .line 2080
    invoke-direct/range {v0 .. v5}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(Landroid/view/View;ZIII)Z

    move-result v0

    if-eqz v0, :cond_6a

    .line 2082
    iput v10, v6, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2083
    iput v12, v6, Landroidx/viewpager/widget/ViewPager;->onRewind:F

    .line 2084
    iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItem:Z

    return v8

    .line 2087
    :cond_6a
    iget v0, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

    int-to-float v0, v0

    cmpl-float v1, v11, v0

    if-lez v1, :cond_92

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v11, v1

    cmpl-float v1, v11, v13

    if-lez v1, :cond_92

    .line 2089
    iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    .line 2090
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2091
    invoke-virtual {p0, v9}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(I)V

    .line 2092
    iget v0, v6, Landroidx/viewpager/widget/ViewPager;->onPlayFromUri:F

    iget v1, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

    int-to-float v1, v1

    if-lez v14, :cond_89

    add-float/2addr v0, v1

    goto :goto_8a

    :cond_89
    sub-float/2addr v0, v1

    :goto_8a
    iput v0, v6, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2094
    iput v12, v6, Landroidx/viewpager/widget/ViewPager;->onRewind:F

    .line 2095
    invoke-direct {p0, v9}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Z)V

    goto :goto_98

    :cond_92
    cmpl-float v0, v13, v0

    if-lez v0, :cond_98

    .line 2102
    iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItem:Z

    .line 2104
    :cond_98
    :goto_98
    iget-boolean v0, v6, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    if-eqz v0, :cond_f6

    .line 2106
    invoke-direct {p0, v10}, Landroidx/viewpager/widget/ViewPager;->read(F)Z

    move-result v0

    if-eqz v0, :cond_f6

    .line 2107
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    goto :goto_f6

    .line 2118
    :cond_a6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, v6, Landroidx/viewpager/widget/ViewPager;->onPlayFromUri:F

    iput v0, v6, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2119
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, v6, Landroidx/viewpager/widget/ViewPager;->onPrepareFromSearch:F

    iput v0, v6, Landroidx/viewpager/widget/ViewPager;->onRewind:F

    .line 2120
    invoke-virtual {v7, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, v6, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    .line 2121
    iput-boolean v8, v6, Landroidx/viewpager/widget/ViewPager;->onRemoveQueueItem:Z

    .line 2123
    iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->onPlayFromSearch:Z

    .line 2124
    iget-object v0, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 2125
    iget v0, v6, Landroidx/viewpager/widget/ViewPager;->ResultReceiver:I

    if-ne v0, v1, :cond_f1

    iget-object v0, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    .line 2126
    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I

    move-result v0

    iget-object v1, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, v6, Landroidx/viewpager/widget/ViewPager;->MediaMetadataCompat:I

    if-le v0, v1, :cond_f1

    .line 2128
    iget-object v0, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 2129
    iput-boolean v8, v6, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatResultReceiverWrapper:Z

    .line 2130
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer()V

    .line 2131
    iput-boolean v9, v6, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    .line 2132
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2133
    invoke-virtual {p0, v9}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(I)V

    goto :goto_f6

    .line 2135
    :cond_f1
    invoke-direct {p0, v8}, Landroidx/viewpager/widget/ViewPager;->write(Z)V

    .line 2136
    iput-boolean v8, v6, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    .line 2152
    :cond_f6
    :goto_f6
    iget-object v0, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    if-nez v0, :cond_100

    .line 2153
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    .line 2155
    :cond_100
    iget-object v0, v6, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    invoke-virtual {v0, v7}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2161
    iget-boolean v0, v6, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    return v0

    .line 2037
    :cond_108
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer()Z

    return v8
.end method

.method protected onLayout(ZIIII)V
    .registers 24

    move-object/from16 v0, p0

    .line 1682
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int v2, p4, p2

    sub-int v3, p5, p3

    .line 1685
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    .line 1686
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    .line 1687
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    .line 1688
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    .line 1689
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_20
    const/16 v12, 0x8

    if-ge v10, v1, :cond_b8

    .line 1696
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 1697
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    if-eq v14, v12, :cond_b4

    .line 1698
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 1701
    iget-boolean v14, v12, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-eqz v14, :cond_b4

    .line 1702
    iget v14, v12, Landroidx/viewpager/widget/ViewPager$LayoutParams;->RemoteActionCompatParcelizer:I

    and-int/lit8 v14, v14, 0x7

    .line 1703
    iget v12, v12, Landroidx/viewpager/widget/ViewPager$LayoutParams;->RemoteActionCompatParcelizer:I

    and-int/lit8 v12, v12, 0x70

    const/4 v15, 0x1

    if-eq v14, v15, :cond_5e

    const/4 v15, 0x3

    if-eq v14, v15, :cond_58

    const/4 v15, 0x5

    if-eq v14, v15, :cond_4b

    move v14, v4

    goto :goto_6f

    :cond_4b
    sub-int v14, v2, v6

    .line 1717
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    sub-int/2addr v14, v15

    .line 1718
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    add-int/2addr v6, v15

    goto :goto_6a

    .line 1710
    :cond_58
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    add-int/2addr v14, v4

    goto :goto_6f

    .line 1713
    :cond_5e
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v14

    sub-int v14, v2, v14

    div-int/lit8 v14, v14, 0x2

    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    move-result v14

    :goto_6a
    move/from16 v17, v14

    move v14, v4

    move/from16 v4, v17

    :goto_6f
    const/16 v15, 0x10

    if-eq v12, v15, :cond_90

    const/16 v15, 0x30

    if-eq v12, v15, :cond_8a

    const/16 v15, 0x50

    if-eq v12, v15, :cond_7d

    move v12, v5

    goto :goto_a1

    :cond_7d
    sub-int v12, v3, v7

    .line 1734
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    sub-int/2addr v12, v15

    .line 1735
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v7, v15

    goto :goto_9c

    .line 1727
    :cond_8a
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    add-int/2addr v12, v5

    goto :goto_a1

    .line 1730
    :cond_90
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    sub-int v12, v3, v12

    div-int/lit8 v12, v12, 0x2

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v12

    :goto_9c
    move/from16 v17, v12

    move v12, v5

    move/from16 v5, v17

    :goto_a1
    add-int/2addr v4, v8

    .line 1740
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    .line 1741
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v16

    add-int/2addr v15, v4

    add-int v9, v5, v16

    .line 1739
    invoke-virtual {v13, v4, v5, v15, v9}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 v11, v11, 0x1

    move v5, v12

    move v4, v14

    :cond_b4
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_20

    :cond_b8
    const/4 v8, 0x0

    :goto_b9
    if-ge v8, v1, :cond_109

    .line 1750
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 1751
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-eq v10, v12, :cond_106

    .line 1752
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 1754
    iget-boolean v13, v10, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-nez v13, :cond_106

    invoke-direct {v0, v9}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v13

    if-eqz v13, :cond_106

    sub-int v14, v2, v4

    sub-int/2addr v14, v6

    int-to-float v14, v14

    .line 1755
    iget v13, v13, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    mul-float/2addr v13, v14

    float-to-int v13, v13

    add-int/2addr v13, v4

    .line 1758
    iget-boolean v15, v10, Landroidx/viewpager/widget/ViewPager$LayoutParams;->write:Z

    if-eqz v15, :cond_f9

    const/4 v15, 0x0

    .line 1761
    iput-boolean v15, v10, Landroidx/viewpager/widget/ViewPager$LayoutParams;->write:Z

    .line 1762
    iget v10, v10, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesImplApi21Parcelizer:F

    mul-float/2addr v14, v10

    float-to-int v10, v14

    const/high16 v14, 0x40000000    # 2.0f

    invoke-static {v10, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    sub-int v15, v3, v5

    sub-int/2addr v15, v7

    .line 1765
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 1768
    invoke-virtual {v9, v10, v14}, Landroid/view/View;->measure(II)V

    .line 1776
    :cond_f9
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    .line 1777
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    add-int/2addr v10, v13

    add-int/2addr v14, v5

    .line 1775
    invoke-virtual {v9, v13, v5, v10, v14}, Landroid/view/View;->layout(IIII)V

    :cond_106
    add-int/lit8 v8, v8, 0x1

    goto :goto_b9

    .line 1781
    :cond_109
    iput v5, v0, Landroidx/viewpager/widget/ViewPager;->_init_lambda3:I

    sub-int/2addr v3, v7

    .line 1782
    iput v3, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer:I

    .line 1783
    iput v11, v0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatMediaItem:I

    .line 1785
    iget-boolean v1, v0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    if-eqz v1, :cond_11b

    .line 1786
    iget v1, v0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Landroidx/viewpager/widget/ViewPager;->read(IZIZ)V

    goto :goto_11c

    :cond_11b
    const/4 v2, 0x0

    .line 1788
    :goto_11c
    iput-boolean v2, v0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    return-void
.end method

.method public onMeasure(II)V
    .registers 19

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move/from16 v2, p1

    .line 1555
    invoke-static {v1, v2}, Landroidx/viewpager/widget/ViewPager;->getDefaultSize(II)I

    move-result v2

    move/from16 v3, p2

    .line 1556
    invoke-static {v1, v3}, Landroidx/viewpager/widget/ViewPager;->getDefaultSize(II)I

    move-result v3

    .line 1555
    invoke-virtual {v0, v2, v3}, Landroidx/viewpager/widget/ViewPager;->setMeasuredDimension(II)V

    .line 1558
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 1559
    div-int/lit8 v3, v2, 0xa

    .line 1560
    iget v4, v0, Landroidx/viewpager/widget/ViewPager;->RatingCompat:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v0, Landroidx/viewpager/widget/ViewPager;->onPause:I

    .line 1563
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 1564
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 1571
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    move v5, v1

    :goto_3d
    const/16 v6, 0x8

    const/4 v7, 0x1

    const/high16 v8, 0x40000000    # 2.0f

    if-ge v5, v4, :cond_c1

    .line 1573
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 1574
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-eq v10, v6, :cond_bc

    .line 1575
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    if-eqz v6, :cond_bc

    .line 1576
    iget-boolean v10, v6, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-eqz v10, :cond_bc

    .line 1577
    iget v10, v6, Landroidx/viewpager/widget/ViewPager$LayoutParams;->RemoteActionCompatParcelizer:I

    and-int/lit8 v10, v10, 0x7

    .line 1578
    iget v11, v6, Landroidx/viewpager/widget/ViewPager$LayoutParams;->RemoteActionCompatParcelizer:I

    and-int/lit8 v11, v11, 0x70

    const/16 v12, 0x30

    if-eq v11, v12, :cond_6c

    const/16 v12, 0x50

    if-eq v11, v12, :cond_6c

    move v11, v1

    goto :goto_6d

    :cond_6c
    move v11, v7

    :goto_6d
    const/4 v12, 0x3

    if-eq v10, v12, :cond_75

    const/4 v12, 0x5

    if-ne v10, v12, :cond_74

    goto :goto_75

    :cond_74
    move v7, v1

    :cond_75
    :goto_75
    const/high16 v10, -0x80000000

    if-eqz v11, :cond_7c

    move v12, v10

    move v10, v8

    goto :goto_81

    :cond_7c
    if-eqz v7, :cond_80

    move v12, v8

    goto :goto_81

    :cond_80
    move v12, v10

    .line 1592
    :goto_81
    iget v13, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v14, -0x1

    const/4 v15, -0x2

    if-eq v13, v15, :cond_91

    .line 1594
    iget v10, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-eq v10, v14, :cond_8e

    .line 1595
    iget v10, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_8f

    :cond_8e
    move v10, v2

    :goto_8f
    move v13, v8

    goto :goto_93

    :cond_91
    move v13, v10

    move v10, v2

    .line 1598
    :goto_93
    iget v1, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v1, v15, :cond_a0

    .line 1600
    iget v1, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v1, v14, :cond_9e

    .line 1601
    iget v1, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_a2

    :cond_9e
    move v1, v3

    goto :goto_a2

    :cond_a0
    move v1, v3

    move v8, v12

    .line 1604
    :goto_a2
    invoke-static {v10, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 1605
    invoke-static {v1, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 1606
    invoke-virtual {v9, v6, v1}, Landroid/view/View;->measure(II)V

    if-eqz v11, :cond_b5

    .line 1609
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr v3, v1

    goto :goto_bc

    :cond_b5
    if-eqz v7, :cond_bc

    .line 1611
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v2, v1

    :cond_bc
    :goto_bc
    add-int/lit8 v5, v5, 0x1

    const/4 v1, 0x0

    goto/16 :goto_3d

    .line 1617
    :cond_c1
    invoke-static {v2, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    iput v1, v0, Landroidx/viewpager/widget/ViewPager;->MediaDescriptionCompat:I

    .line 1618
    invoke-static {v3, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    iput v1, v0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatSearchResultReceiver:I

    .line 1621
    iput-boolean v7, v0, Landroidx/viewpager/widget/ViewPager;->onFastForward:Z

    .line 1622
    invoke-virtual/range {p0 .. p0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer()V

    const/4 v1, 0x0

    .line 1623
    iput-boolean v1, v0, Landroidx/viewpager/widget/ViewPager;->onFastForward:Z

    .line 1626
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    :goto_d9
    if-ge v1, v3, :cond_102

    .line 1628
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1629
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-eq v5, v6, :cond_ff

    .line 1634
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    if-eqz v5, :cond_f1

    .line 1635
    iget-boolean v7, v5, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-nez v7, :cond_ff

    :cond_f1
    int-to-float v7, v2

    .line 1636
    iget v5, v5, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesImplApi21Parcelizer:F

    mul-float/2addr v7, v5

    float-to-int v5, v7

    invoke-static {v5, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 1638
    iget v7, v0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatSearchResultReceiver:I

    invoke-virtual {v4, v5, v7}, Landroid/view/View;->measure(II)V

    :cond_ff
    add-int/lit8 v1, v1, 0x1

    goto :goto_d9

    :cond_102
    return-void
.end method

.method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .registers 11

    .line 2970
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    and-int/lit8 v1, p1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_e

    move v1, v0

    move v0, v2

    move v4, v3

    goto :goto_12

    :cond_e
    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    move v4, v1

    :goto_12
    if-eq v0, v1, :cond_33

    .line 2981
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 2982
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_31

    .line 2983
    invoke-direct {p0, v5}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Landroid/view/View;)Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v6

    if-eqz v6, :cond_31

    .line 2984
    iget v6, v6, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget v7, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    if-ne v6, v7, :cond_31

    .line 2985
    invoke-virtual {v5, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v5

    if-eqz v5, :cond_31

    return v3

    :cond_31
    add-int/2addr v0, v4

    goto :goto_12

    :cond_33
    return v2
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 4

    .line 1452
    instance-of v0, p1, Landroidx/viewpager/widget/ViewPager$SavedState;

    if-nez v0, :cond_8

    .line 1453
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 1457
    :cond_8
    check-cast p1, Landroidx/viewpager/widget/ViewPager$SavedState;

    .line 1458
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->read()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1460
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-eqz v0, :cond_21

    .line 1461
    iget-object v0, p1, Landroidx/viewpager/widget/ViewPager$SavedState;->read:Landroid/os/Parcelable;

    iget-object v0, p1, Landroidx/viewpager/widget/ViewPager$SavedState;->AudioAttributesCompatParcelizer:Ljava/lang/ClassLoader;

    .line 1462
    iget p1, p1, Landroidx/viewpager/widget/ViewPager$SavedState;->RemoteActionCompatParcelizer:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Landroidx/viewpager/widget/ViewPager;->read(IZZ)V

    return-void

    .line 1464
    :cond_21
    iget v0, p1, Landroidx/viewpager/widget/ViewPager$SavedState;->RemoteActionCompatParcelizer:I

    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    .line 1465
    iget-object v0, p1, Landroidx/viewpager/widget/ViewPager$SavedState;->read:Landroid/os/Parcelable;

    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->ParcelableVolumeInfo:Landroid/os/Parcelable;

    .line 1466
    iget-object p1, p1, Landroidx/viewpager/widget/ViewPager$SavedState;->AudioAttributesCompatParcelizer:Ljava/lang/ClassLoader;

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatQueueItem:Ljava/lang/ClassLoader;

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    .line 1441
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 1442
    new-instance v1, Landroidx/viewpager/widget/ViewPager$SavedState;

    invoke-direct {v1, v0}, Landroidx/viewpager/widget/ViewPager$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1443
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    iput v0, v1, Landroidx/viewpager/widget/ViewPager$SavedState;->RemoteActionCompatParcelizer:I

    .line 1444
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-eqz p0, :cond_17

    .line 1445
    invoke-virtual {p0}, Lo/getComponentEnabledSetting;->RemoteActionCompatParcelizer()Landroid/os/Parcelable;

    move-result-object p0

    iput-object p0, v1, Landroidx/viewpager/widget/ViewPager$SavedState;->read:Landroid/os/Parcelable;

    :cond_17
    return-object v1
.end method

.method protected onSizeChanged(IIII)V
    .registers 5

    .line 1646
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    if-eq p1, p3, :cond_a

    .line 1650
    iget p2, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    invoke-direct {p0, p1, p3, p2, p2}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(IIII)V

    :cond_a
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 9

    .line 2173
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_e

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v0

    if-eqz v0, :cond_e

    return v1

    .line 2179
    :cond_e
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-eqz v0, :cond_155

    invoke-virtual {v0}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v0

    if-eqz v0, :cond_155

    .line 2184
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    if-nez v0, :cond_22

    .line 2185
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    .line 2187
    :cond_22
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2189
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x1

    if-eqz v0, :cond_134

    if-eq v0, v2, :cond_e2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_70

    const/4 v3, 0x3

    if-eq v0, v3, :cond_61

    const/4 v1, 0x5

    if-eq v0, v1, :cond_4f

    const/4 v1, 0x6

    if-ne v0, v1, :cond_154

    .line 2282
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(Landroid/view/MotionEvent;)V

    .line 2283
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    goto/16 :goto_154

    .line 2275
    :cond_4f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 2276
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    .line 2277
    iput v1, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2278
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    goto/16 :goto_154

    .line 2269
    :cond_61
    iget-boolean p1, p0, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    if-eqz p1, :cond_154

    .line 2270
    iget p1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    invoke-direct {p0, p1, v2, v1, v1}, Landroidx/viewpager/widget/ViewPager;->read(IZIZ)V

    .line 2271
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer()Z

    move-result p1

    goto/16 :goto_12e

    .line 2205
    :cond_70
    iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    if-nez v0, :cond_cf

    .line 2206
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_83

    .line 2210
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer()Z

    move-result p1

    goto/16 :goto_12e

    .line 2213
    :cond_83
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    .line 2214
    iget v3, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    sub-float v3, v1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 2215
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    .line 2216
    iget v4, p0, Landroidx/viewpager/widget/ViewPager;->onRewind:F

    sub-float v4, v0, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 2220
    iget v5, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

    int-to-float v5, v5

    cmpl-float v5, v3, v5

    if-lez v5, :cond_cf

    cmpl-float v3, v3, v4

    if-lez v3, :cond_cf

    .line 2222
    iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    .line 2223
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 2224
    iget v3, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromUri:F

    sub-float/2addr v1, v3

    const/4 v4, 0x0

    cmpl-float v1, v1, v4

    if-lez v1, :cond_b8

    iget v1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

    int-to-float v1, v1

    add-float/2addr v3, v1

    goto :goto_bc

    :cond_b8
    iget v1, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8:I

    int-to-float v1, v1

    sub-float/2addr v3, v1

    :goto_bc
    iput v3, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2226
    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->onRewind:F

    .line 2227
    invoke-virtual {p0, v2}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(I)V

    .line 2228
    invoke-direct {p0, v2}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(Z)V

    .line 2231
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_cf

    .line 2233
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2238
    :cond_cf
    iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    if-eqz v0, :cond_154

    .line 2240
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 2241
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    .line 2242
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;->read(F)Z

    move-result p1

    goto :goto_12e

    .line 2246
    :cond_e2
    iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepare:Z

    if-eqz v0, :cond_154

    .line 2247
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28:Landroid/view/VelocityTracker;

    .line 2248
    iget v1, p0, Landroidx/viewpager/widget/ViewPager;->onSetRating:I

    int-to-float v1, v1

    const/16 v3, 0x3e8

    invoke-virtual {v0, v3, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 2249
    iget v1, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    float-to-int v0, v0

    .line 2250
    iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatResultReceiverWrapper:Z

    .line 2251
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    .line 2252
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v3

    .line 2253
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver()Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    move-result-object v4

    .line 2254
    iget v5, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    int-to-float v5, v5

    int-to-float v1, v1

    div-float/2addr v5, v1

    .line 2255
    iget v6, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    int-to-float v3, v3

    div-float/2addr v3, v1

    .line 2256
    iget v1, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:F

    sub-float/2addr v3, v1

    iget v1, v4, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:F

    add-float/2addr v1, v5

    div-float/2addr v3, v1

    .line 2258
    iget v1, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    .line 2259
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    .line 2260
    iget v1, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromUri:F

    sub-float/2addr p1, v1

    float-to-int p1, p1

    .line 2261
    invoke-direct {p0, v6, v3, v0, p1}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(IFII)I

    move-result p1

    .line 2263
    invoke-direct {p0, p1, v2, v2, v0}, Landroidx/viewpager/widget/ViewPager;->write(IZZI)V

    .line 2265
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplApi26Parcelizer()Z

    move-result p1

    :goto_12e
    if-eqz p1, :cond_154

    .line 2287
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    goto :goto_154

    .line 2194
    :cond_134
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdaKUbBm7ckfqTc9QCgukC86fguu4:Landroid/widget/Scroller;

    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 2195
    iput-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatResultReceiverWrapper:Z

    .line 2196
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer()V

    .line 2199
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromUri:F

    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromUri:F

    .line 2200
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->onPrepareFromSearch:F

    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->onRewind:F

    .line 2201
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->MediaBrowserCompatItemReceiver:I

    :cond_154
    :goto_154
    return v2

    :cond_155
    return v1
.end method

.method public final read()Lo/getComponentEnabledSetting;
    .registers 1

    .line 572
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    return-object p0
.end method

.method public final read(Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 723
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    if-nez v0, :cond_b

    .line 724
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    .line 726
    :cond_b
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onStop:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .registers 3

    .line 1504
    iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->onFastForward:Z

    if-eqz v0, :cond_8

    .line 1505
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void

    .line 1507
    :cond_8
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public setAdapter(Lo/getComponentEnabledSetting;)V
    .registers 8

    .line 506
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3d

    .line 507
    invoke-virtual {v0, v1}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer(Landroid/database/DataSetObserver;)V

    .line 508
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v0, p0}, Lo/getComponentEnabledSetting;->IconCompatParcelizer(Landroid/view/ViewGroup;)V

    move v0, v2

    .line 509
    :goto_f
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v0, v3, :cond_2b

    .line 510
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    .line 511
    iget-object v4, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    iget v5, v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget-object v3, v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->write:Ljava/lang/Object;

    invoke-virtual {v4, p0, v3}, Lo/getComponentEnabledSetting;->IconCompatParcelizer(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    .line 513
    :cond_2b
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v0}, Lo/getComponentEnabledSetting;->write()V

    .line 514
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->onSeekTo:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 515
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplBaseParcelizer()V

    .line 516
    iput v2, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    .line 517
    invoke-virtual {p0, v2, v2}, Landroid/view/View;->scrollTo(II)V

    .line 520
    :cond_3d
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    .line 521
    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    .line 522
    iput v2, p0, Landroidx/viewpager/widget/ViewPager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-eqz p1, :cond_7e

    .line 525
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToQueueItem:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;

    if-nez v3, :cond_50

    .line 526
    new-instance v3, Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;

    invoke-direct {v3, p0}, Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;-><init>(Landroidx/viewpager/widget/ViewPager;)V

    iput-object v3, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToQueueItem:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;

    .line 528
    :cond_50
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    iget-object v4, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToQueueItem:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;

    invoke-virtual {v3, v4}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer(Landroid/database/DataSetObserver;)V

    .line 529
    iput-boolean v2, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatResultReceiverWrapper:Z

    .line 530
    iget-boolean v3, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    const/4 v4, 0x1

    .line 531
    iput-boolean v4, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    .line 532
    iget-object v5, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {v5}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result v5

    iput v5, p0, Landroidx/viewpager/widget/ViewPager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 533
    iget v5, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    if-ltz v5, :cond_75

    .line 535
    invoke-direct {p0, v5, v2, v4}, Landroidx/viewpager/widget/ViewPager;->read(IZZ)V

    const/4 v3, -0x1

    .line 536
    iput v3, p0, Landroidx/viewpager/widget/ViewPager;->r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM:I

    .line 537
    iput-object v1, p0, Landroidx/viewpager/widget/ViewPager;->ParcelableVolumeInfo:Landroid/os/Parcelable;

    .line 538
    iput-object v1, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatQueueItem:Ljava/lang/ClassLoader;

    goto :goto_7e

    :cond_75
    if-nez v3, :cond_7b

    .line 540
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer()V

    goto :goto_7e

    .line 542
    :cond_7b
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 547
    :cond_7e
    :goto_7e
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplBaseParcelizer:Ljava/util/List;

    if-eqz v1, :cond_9e

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9e

    .line 548
    iget-object v1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplBaseParcelizer:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_8e
    if-ge v2, v1, :cond_9e

    .line 549
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplBaseParcelizer:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;

    invoke-interface {v3, p0, v0, p1}, Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/viewpager/widget/ViewPager;Lo/getComponentEnabledSetting;Lo/getComponentEnabledSetting;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8e

    :cond_9e
    return-void
.end method

.method public setCurrentItem(I)V
    .registers 4

    const/4 v0, 0x0

    .line 611
    iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatResultReceiverWrapper:Z

    .line 612
    iget-boolean v1, p0, Landroidx/viewpager/widget/ViewPager;->onPlayFromMediaId:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-direct {p0, p1, v1, v0}, Landroidx/viewpager/widget/ViewPager;->read(IZZ)V

    return-void
.end method

.method public setCurrentItem(IZ)V
    .registers 4

    const/4 v0, 0x0

    .line 622
    iput-boolean v0, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatResultReceiverWrapper:Z

    .line 623
    invoke-direct {p0, p1, p2, v0}, Landroidx/viewpager/widget/ViewPager;->read(IZZ)V

    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .registers 3

    if-gtz p1, :cond_3

    const/4 p1, 0x1

    .line 854
    :cond_3
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->setSessionImpl:I

    if-eq p1, v0, :cond_c

    .line 855
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->setSessionImpl:I

    .line 856
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer()V

    :cond_c
    return-void
.end method

.method public setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;)V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 709
    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToPrevious:Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;

    return-void
.end method

.method public setPageMargin(I)V
    .registers 4

    .line 869
    iget v0, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    .line 870
    iput p1, p0, Landroidx/viewpager/widget/ViewPager;->onSkipToNext:I

    .line 872
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 873
    invoke-direct {p0, v1, v1, p1, v0}, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer(IIII)V

    .line 875
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPageMarginDrawable(I)V
    .registers 3

    .line 905
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/_isNaN;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 893
    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_7

    .line 894
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    :cond_7
    if-nez p1, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 895
    :goto_c
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 896
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;)V
    .registers 4

    const/4 v0, 0x2

    .line 769
    invoke-virtual {p0, p1, p2, v0}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;I)V

    return-void
.end method

.method public setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;I)V
    .registers 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_6

    move v2, v1

    goto :goto_7

    :cond_6
    move v2, v0

    .line 788
    :goto_7
    iget-object v3, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompat:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;

    if-eqz v3, :cond_d

    move v3, v1

    goto :goto_e

    :cond_d
    move v3, v0

    :goto_e
    if-eq v2, v3, :cond_12

    move v3, v1

    goto :goto_13

    :cond_12
    move v3, v0

    .line 789
    :goto_13
    iput-object p2, p0, Landroidx/viewpager/widget/ViewPager;->PlaybackStateCompat:Landroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;

    .line 790
    invoke-virtual {p0, v2}, Landroidx/viewpager/widget/ViewPager;->setChildrenDrawingOrderEnabled(Z)V

    if-eqz v2, :cond_22

    if-eqz p1, :cond_1d

    const/4 v1, 0x2

    .line 792
    :cond_1d
    iput v1, p0, Landroidx/viewpager/widget/ViewPager;->onAddQueueItem:I

    .line 793
    iput p3, p0, Landroidx/viewpager/widget/ViewPager;->MediaSessionCompatToken:I

    goto :goto_24

    .line 795
    :cond_22
    iput v0, p0, Landroidx/viewpager/widget/ViewPager;->onAddQueueItem:I

    :goto_24
    if-eqz v3, :cond_29

    .line 797
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer()V

    :cond_29
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    .line 910
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    if-eq p1, p0, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    const/4 p0, 0x1

    return p0
.end method

.method public final write()I
    .registers 1

    .line 627
    iget p0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    return p0
.end method

.method public final write(Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;)V
    .registers 3

    .line 581
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplBaseParcelizer:Ljava/util/List;

    if-nez v0, :cond_b

    .line 582
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplBaseParcelizer:Ljava/util/List;

    .line 584
    :cond_b
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesImplBaseParcelizer:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

###### Class androidx.viewpager.widget.ViewPager.AnonymousClass1 (androidx.viewpager.widget.ViewPager$1)
.class final Landroidx/viewpager/widget/ViewPager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .registers 2

    .line 269
    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager$1;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 272
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager$1;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer(I)V

    .line 273
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$1;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer()V

    return-void
.end method

###### Class androidx.viewpager.widget.ViewPager.AnonymousClass2 (androidx.viewpager.widget.ViewPager$2)
.class final Landroidx/viewpager/widget/ViewPager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/finishBranchObject;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager/widget/ViewPager;->MediaMetadataCompat()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final IconCompatParcelizer:Landroid/graphics/Rect;

.field final synthetic RemoteActionCompatParcelizer:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .registers 2

    .line 428
    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager$2;->RemoteActionCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 429
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager$2;->IconCompatParcelizer:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .registers 8

    .line 436
    invoke-static {p1, p2}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    .line 437
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatSearchResultReceiver()Z

    move-result p2

    if-eqz p2, :cond_b

    return-object p1

    .line 449
    :cond_b
    iget-object p2, p0, Landroidx/viewpager/widget/ViewPager$2;->IconCompatParcelizer:Landroid/graphics/Rect;

    .line 450
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    iput v0, p2, Landroid/graphics/Rect;->left:I

    .line 451
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v0

    iput v0, p2, Landroid/graphics/Rect;->top:I

    .line 452
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatItemReceiver()I

    move-result v0

    iput v0, p2, Landroid/graphics/Rect;->right:I

    .line 453
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v0

    iput v0, p2, Landroid/graphics/Rect;->bottom:I

    .line 455
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager$2;->RemoteActionCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_2c
    if-ge v1, v0, :cond_6b

    .line 456
    iget-object v2, p0, Landroidx/viewpager/widget/ViewPager$2;->RemoteActionCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    .line 457
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, p1}, Lo/InvalidTypeIdException;->write(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v2

    .line 460
    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplApi21Parcelizer()I

    move-result v3

    iget v4, p2, Landroid/graphics/Rect;->left:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, p2, Landroid/graphics/Rect;->left:I

    .line 462
    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v3

    iget v4, p2, Landroid/graphics/Rect;->top:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, p2, Landroid/graphics/Rect;->top:I

    .line 464
    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatItemReceiver()I

    move-result v3

    iget v4, p2, Landroid/graphics/Rect;->right:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, p2, Landroid/graphics/Rect;->right:I

    .line 466
    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v2

    iget v3, p2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p2, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2c

    .line 471
    :cond_6b
    iget p0, p2, Landroid/graphics/Rect;->left:I

    iget v0, p2, Landroid/graphics/Rect;->top:I

    iget v1, p2, Landroid/graphics/Rect;->right:I

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p0, v0, v1, p2}, Landroidx/core/view/WindowInsetsCompat;->read(IIII)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.viewpager.widget.ViewPager.AnonymousClass3 (androidx.viewpager.widget.ViewPager$3)
.class final Landroidx/viewpager/widget/ViewPager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;)I
    .registers 2

    .line 143
    iget p0, p0, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    iget p1, p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;->read:I

    sub-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 140
    check-cast p1, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    check-cast p2, Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;

    invoke-static {p1, p2}, Landroidx/viewpager/widget/ViewPager$3;->RemoteActionCompatParcelizer(Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;)I

    move-result p0

    return p0
.end method

###### Class androidx.viewpager.widget.ViewPager.AnonymousClass4 (androidx.viewpager.widget.ViewPager$4)
.class final Landroidx/viewpager/widget/ViewPager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .registers 3

    const/high16 p0, 0x3f800000    # 1.0f

    sub-float/2addr p1, p0

    mul-float v0, p1, p1

    mul-float/2addr v0, p1

    mul-float/2addr v0, p1

    mul-float/2addr v0, p1

    add-float/2addr v0, p0

    return v0
.end method

###### Class androidx.viewpager.widget.ViewPager.AudioAttributesCompatParcelizer (androidx.viewpager.widget.ViewPager$AudioAttributesCompatParcelizer)
.class final Landroidx/viewpager/widget/ViewPager$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:F

.field IconCompatParcelizer:Z

.field RemoteActionCompatParcelizer:F

.field read:I

.field write:Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .registers 1

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

###### Class androidx.viewpager.widget.ViewPager.AudioAttributesImplApi21Parcelizer (androidx.viewpager.widget.ViewPager$AudioAttributesImplApi21Parcelizer)
.class final Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .registers 2

    .line 3092
    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .registers 1

    .line 3097
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final onInvalidated()V
    .registers 1

    .line 3101
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->RemoteActionCompatParcelizer()V

    return-void
.end method

###### Class androidx.viewpager.widget.ViewPager.AudioAttributesImplBaseParcelizer (androidx.viewpager.widget.ViewPager$AudioAttributesImplBaseParcelizer)
.class public interface abstract Landroidx/viewpager/widget/ViewPager$AudioAttributesImplBaseParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesImplBaseParcelizer"
.end annotation

###### Class androidx.viewpager.widget.ViewPager.IconCompatParcelizer (androidx.viewpager.widget.ViewPager$IconCompatParcelizer)
.class public interface abstract Landroidx/viewpager/widget/ViewPager$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract RemoteActionCompatParcelizer(Landroidx/viewpager/widget/ViewPager;Lo/getComponentEnabledSetting;Lo/getComponentEnabledSetting;)V
.end method

###### Class androidx.viewpager.widget.ViewPager.LayoutParams (androidx.viewpager.widget.ViewPager$LayoutParams)
.class public Landroidx/viewpager/widget/ViewPager$LayoutParams;
.super Landroid/view/ViewGroup$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:I

.field AudioAttributesImplApi21Parcelizer:F

.field IconCompatParcelizer:I

.field public RemoteActionCompatParcelizer:I

.field public read:Z

.field write:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, -0x1

    .line 3145
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 3126
    iput v0, p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesImplApi21Parcelizer:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 3149
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 3126
    iput v0, p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->AudioAttributesImplApi21Parcelizer:F

    .line 3151
    sget-object v0, Landroidx/viewpager/widget/ViewPager;->read:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    const/16 v0, 0x30

    .line 3152
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->RemoteActionCompatParcelizer:I

    .line 3153
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

###### Class androidx.viewpager.widget.ViewPager.MediaBrowserCompatCustomActionResultReceiver (androidx.viewpager.widget.ViewPager$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroidx/viewpager/widget/ViewPager$MediaBrowserCompatCustomActionResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 3157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static read(Landroid/view/View;Landroid/view/View;)I
    .registers 4

    .line 3160
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 3161
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/viewpager/widget/ViewPager$LayoutParams;

    .line 3162
    iget-boolean v0, p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    iget-boolean v1, p1, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-eq v0, v1, :cond_1a

    .line 3163
    iget-boolean p0, p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->read:Z

    if-eqz p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, -0x1

    return p0

    .line 3165
    :cond_1a
    iget p0, p0, Landroidx/viewpager/widget/ViewPager$LayoutParams;->IconCompatParcelizer:I

    iget p1, p1, Landroidx/viewpager/widget/ViewPager$LayoutParams;->IconCompatParcelizer:I

    sub-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 3157
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    invoke-static {p1, p2}, Landroidx/viewpager/widget/ViewPager$MediaBrowserCompatCustomActionResultReceiver;->read(Landroid/view/View;Landroid/view/View;)I

    move-result p0

    return p0
.end method

###### Class androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer (androidx.viewpager.widget.ViewPager$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/viewpager/widget/ViewPager$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract IconCompatParcelizer(I)V
.end method

.method public abstract RemoteActionCompatParcelizer(I)V
.end method

.method public abstract read(IF)V
.end method

###### Class androidx.viewpager.widget.ViewPager.SavedState (androidx.viewpager.widget.ViewPager$SavedState)
.class public Landroidx/viewpager/widget/ViewPager$SavedState;
.super Landroidx/customview/view/AbsSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/viewpager/widget/ViewPager$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:Ljava/lang/ClassLoader;

.field RemoteActionCompatParcelizer:I

.field read:Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1412
    new-instance v0, Landroidx/viewpager/widget/ViewPager$SavedState$2;

    invoke-direct {v0}, Landroidx/viewpager/widget/ViewPager$SavedState$2;-><init>()V

    sput-object v0, Landroidx/viewpager/widget/ViewPager$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 4

    .line 1429
    invoke-direct {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    if-nez p2, :cond_d

    .line 1431
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    .line 1433
    :cond_d
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/viewpager/widget/ViewPager$SavedState;->RemoteActionCompatParcelizer:I

    .line 1434
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager$SavedState;->read:Landroid/os/Parcelable;

    .line 1435
    iput-object p2, p0, Landroidx/viewpager/widget/ViewPager$SavedState;->AudioAttributesCompatParcelizer:Ljava/lang/ClassLoader;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 1395
    invoke-direct {p0, p1}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    .line 1407
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FragmentPager.SavedState{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1408
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/viewpager/widget/ViewPager$SavedState;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 1400
    invoke-super {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1401
    iget v0, p0, Landroidx/viewpager/widget/ViewPager$SavedState;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1402
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$SavedState;->read:Landroid/os/Parcelable;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class androidx.viewpager.widget.ViewPager.SavedState.AnonymousClass2 (androidx.viewpager.widget.ViewPager$SavedState$2)
.class final Landroidx/viewpager/widget/ViewPager$SavedState$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/viewpager/widget/ViewPager$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1412
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/viewpager/widget/ViewPager$SavedState;
    .registers 3

    .line 1415
    new-instance v0, Landroidx/viewpager/widget/ViewPager$SavedState;

    invoke-direct {v0, p0, p1}, Landroidx/viewpager/widget/ViewPager$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static IconCompatParcelizer(I)[Landroidx/viewpager/widget/ViewPager$SavedState;
    .registers 1

    .line 1424
    new-array p0, p0, [Landroidx/viewpager/widget/ViewPager$SavedState;

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/viewpager/widget/ViewPager$SavedState;
    .registers 3

    .line 1420
    new-instance v0, Landroidx/viewpager/widget/ViewPager$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/viewpager/widget/ViewPager$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 1412
    invoke-static {p1}, Landroidx/viewpager/widget/ViewPager$SavedState$2;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/viewpager/widget/ViewPager$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 1412
    invoke-static {p1, p2}, Landroidx/viewpager/widget/ViewPager$SavedState$2;->IconCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/viewpager/widget/ViewPager$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 1412
    invoke-static {p1}, Landroidx/viewpager/widget/ViewPager$SavedState$2;->IconCompatParcelizer(I)[Landroidx/viewpager/widget/ViewPager$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.viewpager.widget.ViewPager.read (androidx.viewpager.widget.ViewPager$read)
.class final Landroidx/viewpager/widget/ViewPager$read;
.super Lo/deserializeUsingCustom;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .registers 2

    .line 3037
    iput-object p1, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0}, Lo/deserializeUsingCustom;-><init>()V

    return-void
.end method

.method private read()Z
    .registers 2

    .line 3087
    iget-object v0, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object v0, v0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-eqz v0, :cond_12

    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {p0}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result p0

    const/4 v0, 0x1

    if-le p0, v0, :cond_12

    return v0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    .line 3041
    invoke-super {p0, p1, p2}, Lo/deserializeUsingCustom;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 3042
    const-class p1, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 3043
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager$read;->read()Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    .line 3044
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    const/16 v0, 0x1000

    if-ne p1, v0, :cond_3a

    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object p1, p1, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    if-eqz p1, :cond_3a

    .line 3045
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object p1, p1, Landroidx/viewpager/widget/ViewPager;->IconCompatParcelizer:Lo/getComponentEnabledSetting;

    invoke-virtual {p1}, Lo/getComponentEnabledSetting;->AudioAttributesCompatParcelizer()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    .line 3046
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget p1, p1, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 3047
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget p0, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    :cond_3a
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 4

    .line 3053
    invoke-super {p0, p1, p2}, Lo/deserializeUsingCustom;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    .line 3054
    const-class p1, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 3055
    invoke-direct {p0}, Landroidx/viewpager/widget/ViewPager$read;->read()Z

    move-result p1

    invoke-virtual {p2, p1}, Lo/hasSuperClassStartingWith;->handleMediaPlayPauseIfPendingOnHandler(Z)V

    .line 3056
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_21

    const/16 p1, 0x1000

    .line 3057
    invoke-virtual {p2, p1}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(I)V

    .line 3059
    :cond_21
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p0

    if-eqz p0, :cond_2f

    const/16 p0, 0x2000

    .line 3060
    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(I)V

    :cond_2f
    return-void
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .registers 5

    .line 3066
    invoke-super {p0, p1, p2, p3}, Lo/deserializeUsingCustom;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    const/4 p3, 0x1

    if-eqz p1, :cond_8

    return p3

    :cond_8
    const/16 p1, 0x1000

    const/4 v0, 0x0

    if-eq p2, p1, :cond_25

    const/16 p1, 0x2000

    if-eq p2, p1, :cond_12

    return v0

    .line 3077
    :cond_12
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_24

    .line 3078
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget p1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    sub-int/2addr p1, p3

    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return p3

    :cond_24
    return v0

    .line 3071
    :cond_25
    iget-object p1, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p3}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_36

    .line 3072
    iget-object p0, p0, Landroidx/viewpager/widget/ViewPager$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget p1, p0, Landroidx/viewpager/widget/ViewPager;->AudioAttributesCompatParcelizer:I

    add-int/2addr p1, p3

    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return p3

    :cond_36
    return v0
.end method

###### Class androidx.viewpager.widget.ViewPager.write (androidx.viewpager.widget.ViewPager$write)
.class public interface abstract annotation Landroidx/viewpager/widget/ViewPager$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager/widget/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "write"
.end annotation

.annotation runtime Ljava/lang/annotation/Inherited;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation
