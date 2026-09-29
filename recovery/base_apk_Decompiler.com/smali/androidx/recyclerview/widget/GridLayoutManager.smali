###### Class androidx.recyclerview.widget.GridLayoutManager (androidx.recyclerview.widget.GridLayoutManager)
.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/GridLayoutManager$write;,
        Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;,
        Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;
    }
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Landroid/util/SparseIntArray;

.field final IconCompatParcelizer:Landroid/util/SparseIntArray;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

.field final RemoteActionCompatParcelizer:Landroid/graphics/Rect;

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:Z

.field private onCommand:[I

.field private onCustomAction:[Landroid/view/View;

.field private onPause:Z


# direct methods
.method public constructor <init>(I)V
    .registers 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 100
    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(IZ)V

    .line 46
    iput-boolean v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onAddQueueItem:Z

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 58
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer:Landroid/util/SparseIntArray;

    .line 59
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    .line 60
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$write;

    invoke-direct {v0}, Landroidx/recyclerview/widget/GridLayoutManager$write;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    .line 62
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 101
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->MediaMetadataCompat(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .registers 3

    .line 87
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>()V

    const/4 p1, 0x0

    .line 46
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onAddQueueItem:Z

    const/4 p1, -0x1

    .line 47
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 58
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer:Landroid/util/SparseIntArray;

    .line 59
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    .line 60
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager$write;

    invoke-direct {p1}, Landroidx/recyclerview/widget/GridLayoutManager$write;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    .line 62
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 88
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->MediaMetadataCompat(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    .line 75
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onAddQueueItem:Z

    const/4 v0, -0x1

    .line 47
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 58
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer:Landroid/util/SparseIntArray;

    .line 59
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    .line 60
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$write;

    invoke-direct {v0}, Landroidx/recyclerview/widget/GridLayoutManager$write;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    .line 62
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 76
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/GridLayoutManager;->read(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;

    move-result-object p1

    .line 77
    iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$write;->AudioAttributesCompatParcelizer:I

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->MediaMetadataCompat(I)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I
    .registers 5

    .line 495
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p2

    if-nez p2, :cond_f

    .line 496
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-virtual {p1, p3, p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer(II)I

    move-result p0

    return p0

    .line 498
    :cond_f
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result p2

    if-eq p2, v0, :cond_19

    return p2

    .line 502
    :cond_19
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(I)I

    move-result p1

    if-ne p1, v0, :cond_21

    const/4 p0, 0x0

    return p0

    .line 512
    :cond_21
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-virtual {p2, p1, p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer(II)I

    move-result p0

    return p0
.end method

.method private AudioAttributesImplApi21Parcelizer(II)I
    .registers 5

    .line 360
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_17

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 361
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    sub-int/2addr p0, p1

    aget p1, v0, p0

    sub-int/2addr p0, p2

    aget p0, v0, p0

    sub-int/2addr p1, p0

    return p1

    .line 364
    :cond_17
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    add-int/2addr p2, p1

    aget p2, p0, p2

    aget p0, p0, p1

    sub-int/2addr p2, p0

    return p2
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I
    .registers 4

    .line 479
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p2

    if-nez p2, :cond_f

    .line 480
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-virtual {p1, p3, p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer(II)I

    move-result p0

    return p0

    .line 482
    :cond_f
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(I)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_18

    const/4 p0, 0x0

    return p0

    .line 491
    :cond_18
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-virtual {p2, p1, p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->RemoteActionCompatParcelizer(II)I

    move-result p0

    return p0
.end method

.method private IconCompatParcelizer(FI)V
    .registers 4

    .line 772
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 774
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->RatingCompat(I)V

    return-void
.end method

.method private MediaMetadataCompat(I)V
    .registers 3

    .line 836
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne p1, v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    .line 839
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onAddQueueItem:Z

    if-lez p1, :cond_15

    .line 844
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 845
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 846
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSetRating()V

    return-void

    .line 841
    :cond_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Span count should be at least 1. Provided "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private RatingCompat(I)V
    .registers 4

    .line 326
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-static {v0, v1, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->write([III)[I

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I
    .registers 5

    .line 516
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result p2

    if-nez p2, :cond_d

    .line 517
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer(I)I

    move-result p0

    return p0

    .line 519
    :cond_d
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer:Landroid/util/SparseIntArray;

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result p2

    if-eq p2, v0, :cond_17

    return p2

    .line 523
    :cond_17
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;->AudioAttributesCompatParcelizer(I)I

    move-result p1

    if-ne p1, v0, :cond_1f

    const/4 p0, 0x1

    return p0

    .line 533
    :cond_1f
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer(I)I

    move-result p0

    return p0
.end method

.method private RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;I)V
    .registers 10

    const/4 v0, 0x1

    if-ne p4, v0, :cond_5

    move p4, v0

    goto :goto_6

    :cond_5
    const/4 p4, 0x0

    .line 405
    :goto_6
    iget v1, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    invoke-direct {p0, p1, p2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v1

    if-eqz p4, :cond_21

    :goto_e
    if-lez v1, :cond_20

    .line 408
    iget p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    if-lez p4, :cond_20

    .line 409
    iget p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    sub-int/2addr p4, v0

    iput p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    .line 410
    iget p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    invoke-direct {p0, p1, p2, p4}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v1

    goto :goto_e

    :cond_20
    return-void

    .line 414
    :cond_21
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result p4

    .line 415
    iget v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    :goto_27
    add-int/lit8 v3, p4, -0x1

    if-ge v2, v3, :cond_36

    add-int/lit8 v3, v2, 0x1

    .line 418
    invoke-direct {p0, p1, p2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v4

    if-le v4, v1, :cond_36

    move v2, v3

    move v1, v4

    goto :goto_27

    .line 426
    :cond_36
    iput v2, p3, Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method

.method private onSkipToPrevious()V
    .registers 2

    .line 196
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 197
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method private onSkipToQueueItem()V
    .registers 7

    .line 201
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_2a

    .line 203
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 204
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result v3

    .line 205
    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer:Landroid/util/SparseIntArray;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read()I

    move-result v5

    invoke-virtual {v4, v3, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 206
    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->write()I

    move-result v2

    invoke-virtual {v4, v3, v2}, Landroid/util/SparseIntArray;->put(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_2a
    return-void
.end method

.method private onStop()V
    .registers 3

    .line 292
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatSearchResultReceiver()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_15

    .line 293
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepare()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v1

    goto :goto_22

    .line 295
    :cond_15
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onMediaButtonEvent()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v1

    :goto_22
    sub-int/2addr v0, v1

    .line 297
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->RatingCompat(I)V

    return-void
.end method

.method private read(Landroid/view/View;IIZ)V
    .registers 6

    .line 779
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz p4, :cond_d

    .line 782
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p0

    goto :goto_11

    .line 784
    :cond_d
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->read(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p0

    :goto_11
    if-eqz p0, :cond_16

    .line 787
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    :cond_16
    return-void
.end method

.method private read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;IZ)V
    .registers 9

    const/4 v0, 0x0

    if-eqz p4, :cond_6

    const/4 p4, 0x1

    move v1, v0

    goto :goto_c

    :cond_6
    add-int/lit8 p3, p3, -0x1

    const/4 p4, -0x1

    move v1, v0

    move v0, p3

    move p3, p4

    :goto_c
    if-eq v0, p3, :cond_29

    .line 808
    iget-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    aget-object v2, v2, v0

    .line 809
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 810
    invoke-static {v2}, Landroidx/recyclerview/widget/GridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v2

    invoke-direct {p0, p1, p2, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v2

    iput v2, v3, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    .line 811
    iput v1, v3, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    .line 812
    iget v2, v3, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    add-int/2addr v1, v2

    add-int/2addr v0, p4

    goto :goto_c

    :cond_29
    return-void
.end method

.method private setSessionImpl()V
    .registers 3

    .line 380
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    if-eqz v0, :cond_a

    array-length v0, v0

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ne v0, v1, :cond_a

    return-void

    .line 381
    :cond_a
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    return-void
.end method

.method private write(Landroid/view/View;IZ)V
    .registers 12

    .line 738
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 739
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 740
    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    .line 742
    iget v3, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    .line 744
    iget v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    iget v4, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    invoke-direct {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesImplApi21Parcelizer(II)I

    move-result v1

    .line 747
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v4, v6, :cond_43

    .line 748
    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v1, p2, v3, v4, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->write(IIIIZ)I

    move-result p2

    .line 750
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onFastForward()I

    move-result v3

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v1, v3, v2, v0, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->write(IIIIZ)I

    move-result v0

    goto :goto_5c

    .line 753
    :cond_43
    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v1, p2, v2, v4, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->write(IIIIZ)I

    move-result p2

    .line 755
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1}, Lo/UIntDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onSeekTo()I

    move-result v2

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v1, v2, v3, v0, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->write(IIIIZ)I

    move-result v0

    move v7, v0

    move v0, p2

    move p2, v7

    .line 758
    :goto_5c
    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->read(Landroid/view/View;IIZ)V

    return-void
.end method

.method private static write([III)[I
    .registers 8

    const/4 v0, 0x1

    if-eqz p0, :cond_e

    .line 337
    array-length v1, p0

    add-int/lit8 v2, p1, 0x1

    if-ne v1, v2, :cond_e

    array-length v1, p0

    sub-int/2addr v1, v0

    aget v1, p0, v1

    if-eq v1, p2, :cond_12

    :cond_e
    add-int/lit8 p0, p1, 0x1

    .line 339
    new-array p0, p0, [I

    :cond_12
    const/4 v1, 0x0

    .line 341
    aput v1, p0, v1

    .line 342
    div-int v2, p2, p1

    .line 343
    rem-int/2addr p2, p1

    move v3, v1

    :goto_19
    if-gt v0, p1, :cond_2d

    add-int/2addr v1, p2

    if-lez v1, :cond_26

    sub-int v4, p1, v1

    if-ge v4, p2, :cond_26

    add-int/lit8 v4, v2, 0x1

    sub-int/2addr v1, p1

    goto :goto_27

    :cond_26
    move v4, v2

    :goto_27
    add-int/2addr v3, v4

    .line 354
    aput v3, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    :cond_2d
    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1238
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;
    .registers 26

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    .line 1090
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->write(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_e

    return-object v4

    .line 1094
    :cond_e
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 1095
    iget v6, v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    .line 1096
    iget v7, v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    iget v5, v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    add-int/2addr v7, v5

    .line 1097
    invoke-super/range {p0 .. p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_22

    return-object v4

    :cond_22
    move/from16 v5, p2

    .line 1103
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer(I)I

    move-result v5

    const/4 v9, 0x1

    if-ne v5, v9, :cond_2d

    move v5, v9

    goto :goto_2e

    :cond_2d
    const/4 v5, 0x0

    .line 1104
    :goto_2e
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/4 v11, -0x1

    if-eq v5, v10, :cond_3b

    .line 1107
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v5

    sub-int/2addr v5, v9

    move v10, v11

    move v12, v10

    goto :goto_42

    .line 1113
    :cond_3b
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v5

    move v10, v5

    move v12, v9

    const/4 v5, 0x0

    .line 1115
    :goto_42
    iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne v13, v9, :cond_4e

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v13

    if-eqz v13, :cond_4e

    move v13, v9

    goto :goto_4f

    :cond_4e
    const/4 v13, 0x0

    .line 1139
    :goto_4f
    invoke-direct {v0, v1, v2, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v14

    move v8, v11

    move v15, v8

    move/from16 v16, v12

    const/4 v9, 0x0

    const/4 v12, 0x0

    move v11, v5

    move-object v5, v4

    :goto_5b
    if-eq v11, v10, :cond_107

    move/from16 v17, v10

    .line 1141
    invoke-direct {v0, v1, v2, v11}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v10

    .line 1142
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v1

    if-eq v1, v3, :cond_107

    .line 1147
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v18

    if-eqz v18, :cond_79

    if-eq v10, v14, :cond_79

    if-nez v4, :cond_107

    move-object/from16 v18, v3

    move/from16 v19, v14

    goto/16 :goto_f9

    .line 1158
    :cond_79
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 1159
    iget v2, v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    move-object/from16 v18, v3

    .line 1160
    iget v3, v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    move/from16 v19, v14

    iget v14, v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    add-int/2addr v3, v14

    .line 1161
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v14

    if-eqz v14, :cond_95

    if-ne v2, v6, :cond_95

    if-ne v3, v7, :cond_95

    return-object v1

    .line 1166
    :cond_95
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v14

    if-eqz v14, :cond_9d

    if-eqz v4, :cond_d6

    .line 1167
    :cond_9d
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v14

    if-nez v14, :cond_a6

    if-nez v5, :cond_a6

    goto :goto_d6

    .line 1170
    :cond_a6
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 1171
    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v20

    sub-int v14, v20, v14

    .line 1173
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v20

    if-eqz v20, :cond_c3

    if-le v14, v9, :cond_b9

    goto :goto_d6

    :cond_b9
    if-ne v14, v9, :cond_f9

    if-le v2, v15, :cond_bf

    const/4 v14, 0x1

    goto :goto_c0

    :cond_bf
    const/4 v14, 0x0

    :goto_c0
    if-ne v13, v14, :cond_f9

    goto :goto_d6

    :cond_c3
    if-nez v4, :cond_f9

    .line 1182
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onAddQueueItem(Landroid/view/View;)Z

    move-result v20

    if-eqz v20, :cond_f9

    if-gt v14, v12, :cond_d6

    if-ne v14, v12, :cond_f9

    if-gt v2, v8, :cond_d3

    const/4 v14, 0x0

    goto :goto_d4

    :cond_d3
    const/4 v14, 0x1

    :goto_d4
    if-ne v13, v14, :cond_f9

    .line 1194
    :cond_d6
    :goto_d6
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v14

    if-eqz v14, :cond_eb

    .line 1196
    iget v4, v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    .line 1197
    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1198
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v9, v3, v2

    move v15, v4

    move-object v4, v1

    goto :goto_f9

    .line 1201
    :cond_eb
    iget v5, v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    .line 1202
    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1203
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v12, v3, v2

    move v8, v5

    move-object v5, v1

    :cond_f9
    :goto_f9
    add-int v11, v11, v16

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v10, v17

    move-object/from16 v3, v18

    move/from16 v14, v19

    goto/16 :goto_5b

    :cond_107
    if-eqz v4, :cond_10a

    return-object v4

    :cond_10a
    return-object v5
.end method

.method public final AudioAttributesCompatParcelizer()Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;
    .registers 1

    .line 287
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    return-object p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    .line 254
    new-instance p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object p0
.end method

.method final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;I)V
    .registers 6

    .line 371
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;I)V

    .line 372
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->onStop()V

    .line 373
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v0

    if-lez v0, :cond_15

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    if-nez v0, :cond_15

    .line 374
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer;I)V

    .line 376
    :cond_15
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->setSessionImpl()V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    .line 224
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 225
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write()V

    return-void
.end method

.method public final IconCompatParcelizer()I
    .registers 1

    .line 823
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    return p0
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1220
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 5

    .line 135
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 136
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    return p0

    .line 138
    :cond_8
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v0

    if-gtz v0, :cond_10

    const/4 p0, 0x0

    return p0

    .line 143
    :cond_10
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result p0

    add-int/2addr p0, v1

    return p0
.end method

.method public final IconCompatParcelizer(Landroid/graphics/Rect;II)V
    .registers 8

    .line 302
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    if-nez v0, :cond_7

    .line 303
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroid/graphics/Rect;II)V

    .line 306
    :cond_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    .line 307
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    .line 308
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3b

    .line 309
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p1, v1

    .line 310
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepareFromSearch()I

    move-result v1

    invoke-static {p3, p1, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->a_(III)I

    move-result p1

    .line 311
    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    array-length v1, p3

    sub-int/2addr v1, v3

    aget p3, p3, v1

    .line 312
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromUri()I

    move-result v1

    add-int/2addr p3, v0

    .line 311
    invoke-static {p2, p3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->a_(III)I

    move-result p2

    goto :goto_57

    .line 314
    :cond_3b
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v0

    .line 315
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromUri()I

    move-result v0

    invoke-static {p2, p1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->a_(III)I

    move-result p2

    .line 316
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    array-length v0, p1

    sub-int/2addr v0, v3

    aget p1, p1, v0

    .line 317
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPrepareFromSearch()I

    move-result v0

    add-int/2addr p1, v1

    .line 316
    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->a_(III)I

    move-result p1

    .line 319
    :goto_57
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(II)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 12

    .line 149
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 150
    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    if-nez v1, :cond_c

    .line 151
    invoke-super {p0, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    return-void

    .line 154
    :cond_c
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 155
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->O_()I

    move-result p3

    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result p1

    .line 156
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-nez p0, :cond_2e

    .line 158
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->write()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read()I

    move-result v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v3, p1

    .line 157
    invoke-static/range {v1 .. v6}, Lo/hasSuperClassStartingWith$AudioAttributesImplBaseParcelizer;->read(IIIIZZ)Lo/hasSuperClassStartingWith$AudioAttributesImplBaseParcelizer;

    move-result-object p0

    invoke-virtual {p4, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)V

    return-void

    .line 163
    :cond_2e
    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->write()I

    move-result v3

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read()I

    move-result v4

    const/4 v2, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v1, p1

    .line 161
    invoke-static/range {v1 .. v6}, Lo/hasSuperClassStartingWith$AudioAttributesImplBaseParcelizer;->read(IIIIZZ)Lo/hasSuperClassStartingWith$AudioAttributesImplBaseParcelizer;

    move-result-object p0

    invoke-virtual {p4, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/hasSuperClassStartingWith;)V
    .registers 4

    .line 170
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/hasSuperClassStartingWith;)V

    .line 174
    const-class p0, Landroid/widget/GridView;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;III)V
    .registers 5

    .line 237
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 238
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write()V

    return-void
.end method

.method public final L_()V
    .registers 2

    .line 218
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 219
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write()V

    return-void
.end method

.method public final M_()Z
    .registers 2

    .line 1212
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatItemReceiver:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_a

    iget-boolean p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onAddQueueItem:Z

    if-nez p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    .line 396
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->onStop()V

    .line 397
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->setSessionImpl()V

    .line 398
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1247
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    .line 121
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-nez v0, :cond_7

    .line 122
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    return p0

    .line 124
    :cond_7
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v0

    if-gtz v0, :cond_f

    const/4 p0, 0x0

    return p0

    .line 129
    :cond_f
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    .line 212
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 213
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 2

    .line 268
    instance-of p0, p1, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    return p0
.end method

.method public final read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 4

    .line 388
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->onStop()V

    .line 389
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->setSessionImpl()V

    .line 390
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I
    .registers 2

    .line 1229
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I

    move-result p0

    return p0
.end method

.method public final read()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    .line 243
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v0, -0x2

    const/4 v1, -0x1

    if-nez p0, :cond_c

    .line 244
    new-instance p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-direct {p0, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(II)V

    return-object p0

    .line 247
    :cond_c
    new-instance p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-direct {p0, v1, v0}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(II)V

    return-object p0
.end method

.method public final read(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 2

    .line 259
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p0, :cond_c

    .line 260
    new-instance p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object p0

    .line 262
    :cond_c
    new-instance p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public final read(Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;)V
    .registers 2

    .line 278
    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    return-void
.end method

.method final read(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;)V
    .registers 9

    .line 539
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    const/4 v1, 0x0

    move v2, v1

    .line 541
    :goto_4
    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ge v2, v3, :cond_2c

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Z

    move-result v3

    if-eqz v3, :cond_2c

    if-lez v0, :cond_2c

    .line 542
    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 543
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-interface {p3, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver$RemoteActionCompatParcelizer;->read(II)V

    .line 544
    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v3

    sub-int/2addr v0, v3

    .line 546
    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v3, v4

    iput v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_2c
    return-void
.end method

.method final write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;ZZ)Landroid/view/View;
    .registers 14

    .line 435
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p3

    const/4 v0, 0x1

    if-eqz p4, :cond_f

    .line 438
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result p3

    sub-int/2addr p3, v0

    const/4 p4, -0x1

    move v0, p4

    goto :goto_13

    :cond_f
    const/4 p4, 0x0

    move v8, p4

    move p4, p3

    move p3, v8

    .line 443
    :goto_13
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->read()I

    move-result v1

    .line 445
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesImplBaseParcelizer()V

    .line 449
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v2}, Lo/UIntDeserializer;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    .line 450
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v3}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer()I

    move-result v3

    const/4 v4, 0x0

    move-object v5, v4

    :goto_28
    if-eq p3, p4, :cond_63

    .line 453
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->MediaBrowserCompatCustomActionResultReceiver(I)Landroid/view/View;

    move-result-object v6

    .line 454
    invoke-static {v6}, Landroidx/recyclerview/widget/GridLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v7

    if-ltz v7, :cond_61

    if-ge v7, v1, :cond_61

    .line 456
    invoke-direct {p0, p1, p2, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v7

    if-eqz v7, :cond_3d

    goto :goto_61

    .line 460
    :cond_3d
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v7

    if-eqz v7, :cond_4d

    if-nez v5, :cond_61

    move-object v5, v6

    goto :goto_61

    .line 464
    :cond_4d
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v7, v6}, Lo/UIntDeserializer;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v7

    if-ge v7, v3, :cond_5e

    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    .line 465
    invoke-virtual {v7, v6}, Lo/UIntDeserializer;->IconCompatParcelizer(Landroid/view/View;)I

    move-result v7

    if-lt v7, v2, :cond_5e

    return-object v6

    :cond_5e
    if-nez v4, :cond_61

    move-object v4, v6

    :cond_61
    :goto_61
    add-int/2addr p3, v0

    goto :goto_28

    :cond_63
    if-eqz v4, :cond_66

    return-object v4

    :cond_66
    return-object v5
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 2

    .line 191
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    const/4 p1, 0x0

    .line 192
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->onAddQueueItem:Z

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V
    .registers 4

    .line 179
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;->write()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 180
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->onSkipToQueueItem()V

    .line 182
    :cond_9
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V

    .line 186
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->onSkipToPrevious()V

    return-void
.end method

.method final write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;Landroidx/recyclerview/widget/LinearLayoutManager$read;)V
    .registers 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 554
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v5}, Lo/UIntDeserializer;->IconCompatParcelizer()I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    if-eq v5, v8, :cond_18

    move v9, v6

    goto :goto_19

    :cond_18
    move v9, v7

    .line 556
    :goto_19
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlay()I

    move-result v10

    if-lez v10, :cond_26

    iget-object v10, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    iget v11, v0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    aget v10, v10, v11

    goto :goto_27

    :cond_26
    move v10, v7

    :goto_27
    if-eqz v9, :cond_2c

    .line 561
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/GridLayoutManager;->onStop()V

    .line 563
    :cond_2c
    iget v11, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    if-ne v11, v6, :cond_32

    move v11, v6

    goto :goto_33

    :cond_32
    move v11, v7

    .line 566
    :goto_33
    iget v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-nez v11, :cond_44

    .line 568
    iget v12, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    invoke-direct {v0, v1, v2, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v12

    .line 569
    iget v13, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    invoke-direct {v0, v1, v2, v13}, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v13

    add-int/2addr v12, v13

    :cond_44
    move v13, v7

    .line 572
    :goto_45
    iget v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-ge v13, v14, :cond_98

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Z

    move-result v14

    if-eqz v14, :cond_98

    if-lez v12, :cond_98

    .line 573
    iget v14, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->write:I

    .line 574
    invoke-direct {v0, v1, v2, v14}, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;I)I

    move-result v15

    .line 575
    iget v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    if-gt v15, v8, :cond_6d

    sub-int/2addr v12, v15

    if-ltz v12, :cond_98

    .line 584
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_98

    .line 588
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    aput-object v8, v14, v13

    add-int/lit8 v13, v13, 0x1

    const/high16 v8, 0x40000000    # 2.0f

    goto :goto_45

    .line 576
    :cond_6d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Item at position "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " requires "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " spans but GridLayoutManager has only "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " spans."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_98
    if-nez v13, :cond_9d

    .line 593
    iput-boolean v6, v4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->read:Z

    return-void

    .line 601
    :cond_9d
    invoke-direct {v0, v1, v2, v13, v11}, Landroidx/recyclerview/widget/GridLayoutManager;->read(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;IZ)V

    const/4 v1, 0x0

    move v2, v7

    move v8, v2

    :goto_a3
    if-ge v2, v13, :cond_ea

    .line 603
    iget-object v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    aget-object v12, v12, v2

    .line 604
    iget-object v14, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaDescriptionCompat:Ljava/util/List;

    if-nez v14, :cond_b7

    if-eqz v11, :cond_b3

    .line 606
    invoke-virtual {v0, v12}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    goto :goto_c0

    .line 608
    :cond_b3
    invoke-virtual {v0, v12, v7}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->read(Landroid/view/View;I)V

    goto :goto_c0

    :cond_b7
    if-eqz v11, :cond_bd

    .line 612
    invoke-virtual {v0, v12}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    goto :goto_c0

    .line 614
    :cond_bd
    invoke-virtual {v0, v12, v7}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    .line 617
    :goto_c0
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {v0, v12, v14}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 619
    invoke-direct {v0, v12, v5, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->write(Landroid/view/View;IZ)V

    .line 620
    iget-object v14, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v14, v12}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v14

    if-le v14, v8, :cond_d1

    move v8, v14

    .line 624
    :cond_d1
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 625
    iget-object v15, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v15, v12}, Lo/UIntDeserializer;->write(Landroid/view/View;)I

    move-result v12

    int-to-float v12, v12

    iget v14, v14, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    int-to-float v14, v14

    div-float/2addr v12, v14

    cmpl-float v14, v12, v1

    if-lez v14, :cond_e7

    move v1, v12

    :cond_e7
    add-int/lit8 v2, v2, 0x1

    goto :goto_a3

    :cond_ea
    if-eqz v9, :cond_108

    .line 633
    invoke-direct {v0, v1, v10}, Landroidx/recyclerview/widget/GridLayoutManager;->IconCompatParcelizer(FI)V

    move v1, v7

    move v8, v1

    :goto_f1
    if-ge v1, v13, :cond_108

    .line 637
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    aget-object v2, v2, v1

    const/high16 v5, 0x40000000    # 2.0f

    .line 638
    invoke-direct {v0, v2, v5, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->write(Landroid/view/View;IZ)V

    .line 639
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v5, v2}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v2

    if-le v2, v8, :cond_105

    move v8, v2

    :cond_105
    add-int/lit8 v1, v1, 0x1

    goto :goto_f1

    :cond_108
    move v1, v7

    :goto_109
    if-ge v1, v13, :cond_168

    .line 649
    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    aget-object v2, v2, v1

    .line 650
    iget-object v5, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v5, v2}, Lo/UIntDeserializer;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v5

    if-eq v5, v8, :cond_163

    .line 651
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 652
    iget-object v9, v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 653
    iget v10, v9, Landroid/graphics/Rect;->top:I

    iget v11, v9, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v10, v11

    iget v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v10, v11

    iget v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v10, v11

    .line 655
    iget v11, v9, Landroid/graphics/Rect;->left:I

    iget v9, v9, Landroid/graphics/Rect;->right:I

    add-int/2addr v11, v9

    iget v9, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v11, v9

    iget v9, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v11, v9

    .line 657
    iget v9, v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    iget v12, v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    invoke-direct {v0, v9, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->AudioAttributesImplApi21Parcelizer(II)I

    move-result v9

    .line 660
    iget v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne v12, v6, :cond_150

    .line 661
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v9, v12, v11, v5, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->write(IIIIZ)I

    move-result v5

    sub-int v9, v8, v10

    .line 663
    invoke-static {v9, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    goto :goto_15f

    :cond_150
    const/high16 v12, 0x40000000    # 2.0f

    sub-int v11, v8, v11

    .line 666
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 668
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v9, v12, v10, v5, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->write(IIIIZ)I

    move-result v9

    move v5, v11

    .line 671
    :goto_15f
    invoke-direct {v0, v2, v5, v9, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->read(Landroid/view/View;IIZ)V

    goto :goto_165

    :cond_163
    const/high16 v12, 0x40000000    # 2.0f

    :goto_165
    add-int/lit8 v1, v1, 0x1

    goto :goto_109

    .line 675
    :cond_168
    iput v8, v4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->AudioAttributesCompatParcelizer:I

    .line 678
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    const/4 v2, -0x1

    if-ne v1, v6, :cond_180

    .line 679
    iget v1, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v1, v2, :cond_178

    .line 680
    iget v1, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    sub-int v2, v1, v8

    goto :goto_17c

    .line 683
    :cond_178
    iget v2, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    add-int v1, v2, v8

    :goto_17c
    move v5, v2

    move v2, v7

    move v3, v2

    goto :goto_191

    .line 687
    :cond_180
    iget v1, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v1, v2, :cond_189

    .line 688
    iget v1, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    sub-int v2, v1, v8

    goto :goto_18d

    .line 691
    :cond_189
    iget v2, v3, Landroidx/recyclerview/widget/LinearLayoutManager$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:I

    add-int v1, v2, v8

    :goto_18d
    move v3, v2

    move v5, v7

    move v2, v1

    move v1, v5

    :goto_191
    if-ge v7, v13, :cond_200

    .line 696
    iget-object v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    aget-object v8, v8, v7

    .line 697
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    .line 698
    iget v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->write:I

    if-ne v10, v6, :cond_1d1

    .line 699
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Z

    move-result v2

    if-eqz v2, :cond_1be

    .line 700
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v2

    iget-object v3, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    iget v10, v0, Landroidx/recyclerview/widget/GridLayoutManager;->handleMediaPlayPauseIfPendingOnHandler:I

    iget v11, v9, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    sub-int/2addr v10, v11

    aget v3, v3, v10

    add-int/2addr v2, v3

    .line 701
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v3, v8}, Lo/UIntDeserializer;->write(Landroid/view/View;)I

    move-result v3

    sub-int v3, v2, v3

    goto :goto_1e3

    .line 703
    :cond_1be
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingLeft()I

    move-result v2

    iget-object v3, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    iget v10, v9, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    aget v3, v3, v10

    add-int/2addr v3, v2

    .line 704
    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v2, v8}, Lo/UIntDeserializer;->write(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v3

    goto :goto_1e3

    .line 707
    :cond_1d1
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->getPaddingTop()I

    move-result v1

    iget-object v5, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCommand:[I

    iget v10, v9, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    aget v5, v5, v10

    add-int/2addr v5, v1

    .line 708
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer:Lo/UIntDeserializer;

    invoke-virtual {v1, v8}, Lo/UIntDeserializer;->write(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v5

    .line 712
    :goto_1e3
    invoke-static {v8, v3, v5, v2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->RemoteActionCompatParcelizer(Landroid/view/View;IIII)V

    .line 720
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Q_()Z

    move-result v10

    if-nez v10, :cond_1f2

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->P_()Z

    move-result v9

    if-eqz v9, :cond_1f4

    .line 721
    :cond_1f2
    iput-boolean v6, v4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->IconCompatParcelizer:Z

    .line 723
    :cond_1f4
    iget-boolean v9, v4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->write:Z

    invoke-virtual {v8}, Landroid/view/View;->hasFocusable()Z

    move-result v8

    or-int/2addr v8, v9

    iput-boolean v8, v4, Landroidx/recyclerview/widget/LinearLayoutManager$read;->write:Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_191

    .line 725
    :cond_200
    iget-object v0, v0, Landroidx/recyclerview/widget/GridLayoutManager;->onCustomAction:[Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .registers 5

    .line 231
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 232
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write()V

    return-void
.end method

.method public final write(Z)V
    .registers 2

    if-nez p1, :cond_7

    const/4 p1, 0x0

    .line 115
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Z)V

    return-void

    .line 111
    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class androidx.recyclerview.widget.GridLayoutManager.IconCompatParcelizer (androidx.recyclerview.widget.GridLayoutManager$IconCompatParcelizer)
.class public abstract Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/GridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field final IconCompatParcelizer:Landroid/util/SparseIntArray;

.field private read:Z

.field final write:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 856
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 858
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    .line 859
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write:Landroid/util/SparseIntArray;

    const/4 v0, 0x0

    .line 861
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->read:Z

    .line 862
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    return-void
.end method

.method private read(II)I
    .registers 9

    .line 1067
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_8
    if-ge v2, p1, :cond_1d

    .line 1069
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v5

    add-int/2addr v4, v5

    if-ne v4, p2, :cond_15

    add-int/lit8 v3, v3, 0x1

    move v4, v1

    goto :goto_1a

    :cond_15
    if-le v4, p2, :cond_1a

    add-int/lit8 v3, v3, 0x1

    move v4, v5

    :cond_1a
    :goto_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_1d
    add-int/2addr v4, v0

    if-le v4, p2, :cond_22

    add-int/lit8 v3, v3, 0x1

    :cond_22
    return v3
.end method

.method private static write(Landroid/util/SparseIntArray;I)I
    .registers 6

    .line 1020
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_7
    if-gt v1, v0, :cond_19

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    .line 1026
    invoke-virtual {p0, v2}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v3

    if-ge v3, p1, :cond_16

    add-int/lit8 v1, v2, 0x1

    goto :goto_7

    :cond_16
    add-int/lit8 v0, v2, -0x1

    goto :goto_7

    :cond_19
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_28

    .line 1034
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    move-result p1

    if-ge v1, p1, :cond_28

    .line 1035
    invoke-virtual {p0, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result p0

    return p0

    :cond_28
    const/4 p0, -0x1

    return p0
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(II)I
    .registers 5

    .line 939
    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->read:Z

    if-nez v0, :cond_9

    .line 940
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write(II)I

    move-result p0

    return p0

    .line 942
    :cond_9
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    if-eq v0, v1, :cond_13

    return v0

    .line 946
    :cond_13
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write(II)I

    move-result p2

    .line 947
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    invoke-virtual {p0, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    return p2
.end method

.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    .line 909
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public abstract IconCompatParcelizer(I)I
.end method

.method final RemoteActionCompatParcelizer(II)I
    .registers 3

    .line 953
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->read(II)I

    move-result p0

    return p0
.end method

.method public final read()V
    .registers 2

    const/4 v0, 0x1

    .line 884
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->read:Z

    return-void
.end method

.method public write(II)I
    .registers 8

    .line 988
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v0, p2, :cond_8

    return v1

    .line 995
    :cond_8
    iget-boolean v2, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->read:Z

    if-eqz v2, :cond_20

    .line 996
    iget-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    invoke-static {v2, p1}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write(Landroid/util/SparseIntArray;I)I

    move-result v2

    if-ltz v2, :cond_20

    .line 998
    iget-object v3, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_30

    :cond_20
    move v2, v1

    move v3, v2

    :goto_22
    if-ge v2, p1, :cond_33

    .line 1003
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->IconCompatParcelizer(I)I

    move-result v4

    add-int/2addr v3, v4

    if-ne v3, p2, :cond_2d

    move v3, v1

    goto :goto_30

    :cond_2d
    if-le v3, p2, :cond_30

    move v3, v4

    :cond_30
    :goto_30
    add-int/lit8 v2, v2, 0x1

    goto :goto_22

    :cond_33
    add-int/2addr v0, v3

    if-gt v0, p2, :cond_37

    return v3

    :cond_37
    return v1
.end method

.method public final write()V
    .registers 1

    .line 917
    iget-object p0, p0, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;->write:Landroid/util/SparseIntArray;

    invoke-virtual {p0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

###### Class androidx.recyclerview.widget.GridLayoutManager.LayoutParams (androidx.recyclerview.widget.GridLayoutManager$LayoutParams)
.class public Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;
.super Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/GridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field IconCompatParcelizer:I

.field read:I


# direct methods
.method public constructor <init>(II)V
    .registers 3

    .line 1406
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    const/4 p1, -0x1

    .line 1397
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    const/4 p1, 0x0

    .line 1399
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 1402
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 1397
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    const/4 p1, 0x0

    .line 1399
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 2

    .line 1414
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, -0x1

    .line 1397
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    const/4 p1, 0x0

    .line 1399
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .registers 2

    .line 1410
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, -0x1

    .line 1397
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    const/4 p1, 0x0

    .line 1399
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    return-void
.end method


# virtual methods
.method public final read()I
    .registers 1

    .line 1446
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->read:I

    return p0
.end method

.method public final write()I
    .registers 1

    .line 1436
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->IconCompatParcelizer:I

    return p0
.end method

###### Class androidx.recyclerview.widget.GridLayoutManager.write (androidx.recyclerview.widget.GridLayoutManager$write)
.class public final Landroidx/recyclerview/widget/GridLayoutManager$write;
.super Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/GridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "write"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1370
    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$IconCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(I)I
    .registers 2

    const/4 p0, 0x1

    return p0
.end method

.method public final write(II)I
    .registers 3

    .line 1379
    rem-int/2addr p1, p2

    return p1
.end method
