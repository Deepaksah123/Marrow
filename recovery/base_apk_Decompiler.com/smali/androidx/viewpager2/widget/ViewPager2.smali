###### Class androidx.viewpager2.widget.ViewPager2 (androidx.viewpager2.widget.ViewPager2)
.class public final Landroidx/viewpager2/widget/ViewPager2;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;,
        Landroidx/viewpager2/widget/ViewPager2$IconCompatParcelizer;,
        Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;,
        Landroidx/viewpager2/widget/ViewPager2$write;,
        Landroidx/viewpager2/widget/ViewPager2$read;,
        Landroidx/viewpager2/widget/ViewPager2$AudioAttributesCompatParcelizer;,
        Landroidx/viewpager2/widget/ViewPager2$MediaBrowserCompatCustomActionResultReceiver;,
        Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;,
        Landroidx/viewpager2/widget/ViewPager2$SavedState;,
        Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi21Parcelizer;
    }
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

.field private AudioAttributesImplApi21Parcelizer:Lo/getInstalledApplications;

.field private AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$read;

.field private AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Lo/getPackageInfo;

.field MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

.field private MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:Lo/getInstalledApplications;

.field private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

.field private MediaDescriptionCompat:Lo/UByteSerializer;

.field private MediaMetadataCompat:Lo/getNameForUid;

.field private RatingCompat:Landroid/os/Parcelable;

.field RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

.field private final handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

.field private onAddQueueItem:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

.field private onCommand:Z

.field private onCustomAction:Z

.field read:I

.field public write:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 5

    .line 163
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 130
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

    .line 131
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

    .line 133
    new-instance v0, Lo/getInstalledApplications;

    invoke-direct {v0}, Lo/getInstalledApplications;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi21Parcelizer:Lo/getInstalledApplications;

    const/4 v0, 0x0

    .line 137
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer:Z

    .line 138
    new-instance v1, Landroidx/viewpager2/widget/ViewPager2$2;

    invoke-direct {v1, p0}, Landroidx/viewpager2/widget/ViewPager2$2;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$read;

    const/4 v1, -0x1

    .line 148
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    const/4 v2, 0x0

    .line 156
    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->onAddQueueItem:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    .line 157
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->onCommand:Z

    const/4 v0, 0x1

    .line 158
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->onCustomAction:Z

    .line 159
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplBaseParcelizer:I

    .line 164
    invoke-direct {p0, p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->read(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 168
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 130
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

    .line 131
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

    .line 133
    new-instance v0, Lo/getInstalledApplications;

    invoke-direct {v0}, Lo/getInstalledApplications;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi21Parcelizer:Lo/getInstalledApplications;

    const/4 v0, 0x0

    .line 137
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer:Z

    .line 138
    new-instance v1, Landroidx/viewpager2/widget/ViewPager2$2;

    invoke-direct {v1, p0}, Landroidx/viewpager2/widget/ViewPager2$2;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$read;

    const/4 v1, -0x1

    .line 148
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    const/4 v2, 0x0

    .line 156
    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->onAddQueueItem:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    .line 157
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->onCommand:Z

    const/4 v0, 0x1

    .line 158
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->onCustomAction:Z

    .line 159
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplBaseParcelizer:I

    .line 169
    invoke-direct {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->read(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    .line 173
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 130
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

    .line 131
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

    .line 133
    new-instance p3, Lo/getInstalledApplications;

    invoke-direct {p3}, Lo/getInstalledApplications;-><init>()V

    iput-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi21Parcelizer:Lo/getInstalledApplications;

    const/4 p3, 0x0

    .line 137
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer:Z

    .line 138
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$2;

    invoke-direct {v0, p0}, Landroidx/viewpager2/widget/ViewPager2$2;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$read;

    const/4 v0, -0x1

    .line 148
    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    const/4 v1, 0x0

    .line 156
    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->onAddQueueItem:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    .line 157
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->onCommand:Z

    const/4 p3, 0x1

    .line 158
    iput-boolean p3, p0, Landroidx/viewpager2/widget/ViewPager2;->onCustomAction:Z

    .line 159
    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplBaseParcelizer:I

    .line 174
    invoke-direct {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->read(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 299
    sget-object v0, Lo/getApplicationLogo$read;->ViewPager2:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 300
    sget-object v3, Lo/getApplicationLogo$read;->ViewPager2:[I

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, v0

    invoke-static/range {v1 .. v7}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 303
    :try_start_11
    sget p1, Lo/getApplicationLogo$read;->ViewPager2_android_orientation:I

    const/4 p2, 0x0

    .line 304
    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    .line 303
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V
    :try_end_1b
    .catchall {:try_start_11 .. :try_end_1b} :catchall_1f

    .line 306
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_1f
    move-exception p0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 307
    throw p0
.end method

.method private IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 478
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V

    :cond_7
    return-void
.end method

.method private MediaDescriptionCompat()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;
    .registers 2

    .line 270
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$1;

    invoke-direct {v0, p0}, Landroidx/viewpager2/widget/ViewPager2$1;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    return-object v0
.end method

.method private MediaMetadataCompat()V
    .registers 5

    .line 346
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3c

    .line 350
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_3c

    .line 354
    :cond_c
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->RatingCompat:Landroid/os/Parcelable;

    if-eqz v2, :cond_1d

    .line 355
    instance-of v3, v0, Lo/getInstallerPackageName;

    if-eqz v3, :cond_1a

    .line 356
    move-object v3, v0

    check-cast v3, Lo/getInstallerPackageName;

    invoke-interface {v3, v2}, Lo/getInstallerPackageName;->AudioAttributesCompatParcelizer(Landroid/os/Parcelable;)V

    :cond_1a
    const/4 v2, 0x0

    .line 358
    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->RatingCompat:Landroid/os/Parcelable;

    .line 361
    :cond_1d
    iget v2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    .line 362
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    .line 363
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer(I)V

    .line 364
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer()V

    :cond_3c
    :goto_3c
    return-void
.end method

.method private RatingCompat()V
    .registers 6

    .line 937
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaMetadataCompat:Lo/getNameForUid;

    invoke-virtual {v0}, Lo/getNameForUid;->write()Landroidx/viewpager2/widget/ViewPager2$AudioAttributesCompatParcelizer;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    .line 940
    :cond_9
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {v0}, Lo/getLaunchIntentForPackage;->AudioAttributesCompatParcelizer()D

    move-result-wide v0

    double-to-int v2, v0

    int-to-double v3, v2

    sub-double/2addr v0, v3

    double-to-float v0, v0

    .line 943
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 944
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaMetadataCompat:Lo/getNameForUid;

    invoke-virtual {p0, v2, v0, v1}, Landroidx/viewpager2/widget/ViewPager2$write;->AudioAttributesCompatParcelizer(IFI)V

    return-void
.end method

.method private read(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 187
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$read;

    invoke-direct {v0, p0}, Landroidx/viewpager2/widget/ViewPager2$read;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 188
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    .line 190
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;

    invoke-direct {v0, p0, p1}, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;-><init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    .line 191
    invoke-static {}, Lo/InvalidTypeIdException;->read()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 192
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 194
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;

    invoke-direct {v0, p0, p1}, Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;-><init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 195
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)V

    .line 196
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollingTouchSlop(I)V

    .line 197
    invoke-direct {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 199
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p2, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 201
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2;->MediaDescriptionCompat()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->read(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;)V

    .line 205
    new-instance p1, Lo/getLaunchIntentForPackage;

    invoke-direct {p1, p0}, Lo/getLaunchIntentForPackage;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    .line 207
    new-instance p2, Lo/getPackageInfo;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p2, p0, p1, v0}, Lo/getPackageInfo;-><init>(Landroidx/viewpager2/widget/ViewPager2;Lo/getLaunchIntentForPackage;Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatCustomActionResultReceiver:Lo/getPackageInfo;

    .line 208
    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$MediaBrowserCompatCustomActionResultReceiver;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaDescriptionCompat:Lo/UByteSerializer;

    .line 209
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2}, Lo/serializeOzbTUA;->read(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 212
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatSearchResultReceiver;)V

    .line 214
    new-instance p1, Lo/getInstalledApplications;

    invoke-direct {p1}, Lo/getInstalledApplications;-><init>()V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatSearchResultReceiver:Lo/getInstalledApplications;

    .line 215
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {p2, p1}, Lo/getLaunchIntentForPackage;->RemoteActionCompatParcelizer(Landroidx/viewpager2/widget/ViewPager2$write;)V

    .line 219
    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$5;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$5;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 237
    new-instance p2, Landroidx/viewpager2/widget/ViewPager2$3;

    invoke-direct {p2, p0}, Landroidx/viewpager2/widget/ViewPager2$3;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 249
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatSearchResultReceiver:Lo/getInstalledApplications;

    invoke-virtual {v0, p1}, Lo/getInstalledApplications;->RemoteActionCompatParcelizer(Landroidx/viewpager2/widget/ViewPager2$write;)V

    .line 250
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatSearchResultReceiver:Lo/getInstalledApplications;

    invoke-virtual {p1, p2}, Lo/getInstalledApplications;->RemoteActionCompatParcelizer(Landroidx/viewpager2/widget/ViewPager2$write;)V

    .line 253
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 254
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatSearchResultReceiver:Lo/getInstalledApplications;

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi21Parcelizer:Lo/getInstalledApplications;

    invoke-virtual {p1, p2}, Lo/getInstalledApplications;->RemoteActionCompatParcelizer(Landroidx/viewpager2/widget/ViewPager2$write;)V

    .line 258
    new-instance p1, Lo/getNameForUid;

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p1, p2}, Lo/getNameForUid;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaMetadataCompat:Lo/getNameForUid;

    .line 259
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatSearchResultReceiver:Lo/getInstalledApplications;

    invoke-virtual {p2, p1}, Lo/getInstalledApplications;->RemoteActionCompatParcelizer(Landroidx/viewpager2/widget/ViewPager2$write;)V

    .line 261
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/viewpager2/widget/ViewPager2;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private write(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 484
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi26Parcelizer:Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V

    :cond_7
    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()I
    .registers 3

    .line 564
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    .line 565
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer()I

    move-result p0

    if-nez p0, :cond_16

    .line 566
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr p0, v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    goto :goto_23

    .line 567
    :cond_16
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result p0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p0, v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    :goto_23
    sub-int/2addr p0, v0

    return p0
.end method

.method final AudioAttributesCompatParcelizer(IZ)V
    .registers 11

    .line 621
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_13

    .line 624
    iget p2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_88

    .line 625
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    return-void

    .line 629
    :cond_13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v2

    if-lez v2, :cond_88

    .line 633
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 634
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 636
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    if-ne p1, v0, :cond_33

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {v0}, Lo/getLaunchIntentForPackage;->read()Z

    move-result v0

    if-nez v0, :cond_88

    .line 640
    :cond_33
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    if-ne p1, v0, :cond_3a

    if-eqz p2, :cond_3a

    goto :goto_88

    :cond_3a
    int-to-double v0, v0

    .line 649
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    .line 650
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->IconCompatParcelizer()V

    .line 652
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {v2}, Lo/getLaunchIntentForPackage;->read()Z

    move-result v2

    if-nez v2, :cond_50

    .line 654
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {v0}, Lo/getLaunchIntentForPackage;->AudioAttributesCompatParcelizer()D

    move-result-wide v0

    .line 659
    :cond_50
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {v2, p1, p2}, Lo/getLaunchIntentForPackage;->write(IZ)V

    if-nez p2, :cond_5d

    .line 661
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer(I)V

    return-void

    :cond_5d
    int-to-double v2, p1

    sub-double v4, v2, v0

    .line 666
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    cmpl-double p2, v4, v6

    if-lez p2, :cond_83

    .line 667
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    cmpl-double v0, v2, v0

    if-lez v0, :cond_73

    add-int/lit8 v0, p1, -0x3

    goto :goto_75

    :cond_73
    add-int/lit8 v0, p1, 0x3

    :goto_75
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplApi21Parcelizer(I)V

    .line 669
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi21Parcelizer;

    invoke-direct {p2, p1, p0}, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi21Parcelizer;-><init>(ILandroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 671
    :cond_83
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer(I)V

    :cond_88
    :goto_88
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/viewpager2/widget/ViewPager2$write;)V
    .registers 2

    .line 879
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi21Parcelizer:Lo/getInstalledApplications;

    invoke-virtual {p0, p1}, Lo/getInstalledApplications;->RemoteActionCompatParcelizer(Landroidx/viewpager2/widget/ViewPager2$write;)V

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()I
    .registers 1

    .line 694
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {p0}, Lo/getLaunchIntentForPackage;->RemoteActionCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Z
    .registers 2

    .line 586
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;->onPlayFromSearch()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_a

    return v0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method final AudioAttributesImplBaseParcelizer()V
    .registers 3

    .line 545
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaDescriptionCompat:Lo/UByteSerializer;

    if-eqz v0, :cond_24

    .line 549
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Lo/serializeOzbTUA;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_d

    return-void

    .line 553
    :cond_d
    invoke-static {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v0

    .line 555
    iget v1, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    if-eq v0, v1, :cond_20

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi21Parcelizer()I

    move-result v1

    if-nez v1, :cond_20

    .line 557
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatSearchResultReceiver:Lo/getInstalledApplications;

    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2$write;->RemoteActionCompatParcelizer(I)V

    :cond_20
    const/4 v0, 0x0

    .line 560
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer:Z

    return-void

    .line 546
    :cond_24
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Design assumption violated."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final IconCompatParcelizer()I
    .registers 2

    .line 581
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaBrowserCompatSearchResultReceiver()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_a

    return v0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Z
    .registers 1

    .line 768
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatCustomActionResultReceiver:Lo/getPackageInfo;

    invoke-virtual {p0}, Lo/getPackageInfo;->write()Z

    move-result p0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()Z
    .registers 1

    .line 810
    iget-boolean p0, p0, Landroidx/viewpager2/widget/ViewPager2;->onCustomAction:Z

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;
    .registers 1

    .line 490
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method public final canScrollHorizontally(I)Z
    .registers 2

    .line 862
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->canScrollHorizontally(I)Z

    move-result p0

    return p0
.end method

.method public final canScrollVertically(I)Z
    .registers 2

    .line 867
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->canScrollVertically(I)Z

    move-result p0

    return p0
.end method

.method protected final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .line 370
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    .line 371
    instance-of v1, v0, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    if-eqz v1, :cond_24

    .line 372
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->RemoteActionCompatParcelizer:I

    .line 373
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    .line 374
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 375
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 378
    :cond_24
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    .line 381
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2;->MediaMetadataCompat()V

    return-void
.end method

.method public final getAccessibilityClassName()Ljava/lang/CharSequence;
    .registers 2

    .line 292
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->write()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 293
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 295
    :cond_f
    invoke-super {p0}, Landroid/view/ViewGroup;->getAccessibilityClassName()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 2

    .line 956
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 957
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-void
.end method

.method protected final onLayout(ZIIII)V
    .registers 9

    .line 524
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 525
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 529
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    iput v2, v1, Landroid/graphics/Rect;->left:I

    .line 530
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p4, p2

    iput p4, v1, Landroid/graphics/Rect;->right:I

    .line 531
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p4

    iput p4, p2, Landroid/graphics/Rect;->top:I

    .line 532
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    iput p5, p2, Landroid/graphics/Rect;->bottom:I

    .line 534
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

    const p4, 0x800033

    invoke-static {p4, p1, v0, p2, p3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 535
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

    iget p2, p2, Landroid/graphics/Rect;->left:I

    iget-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

    iget p3, p3, Landroid/graphics/Rect;->top:I

    iget-object p4, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

    iget p4, p4, Landroid/graphics/Rect;->right:I

    iget-object p5, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/graphics/Rect;

    iget p5, p5, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p2, p3, p4, p5}, Landroidx/recyclerview/widget/RecyclerView;->layout(IIII)V

    .line 538
    iget-boolean p1, p0, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer:Z

    if-eqz p1, :cond_56

    .line 539
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplBaseParcelizer()V

    :cond_56
    return-void
.end method

.method protected final onMeasure(II)V
    .registers 10

    .line 506
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->measureChild(Landroid/view/View;II)V

    .line 507
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 508
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 509
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getMeasuredState()I

    move-result v2

    .line 511
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    .line 512
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v3, v4

    add-int/2addr v0, v3

    .line 514
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v5, v6

    add-int/2addr v1, v5

    .line 515
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getSuggestedMinimumHeight()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 517
    invoke-static {v0, p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->resolveSizeAndState(III)I

    move-result p1

    shl-int/lit8 v0, v2, 0x10

    .line 518
    invoke-static {v1, p2, v0}, Landroidx/viewpager2/widget/ViewPager2;->resolveSizeAndState(III)I

    move-result p2

    .line 517
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->setMeasuredDimension(II)V

    return-void
.end method

.method protected final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    .line 334
    instance-of v0, p1, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    if-nez v0, :cond_8

    .line 335
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 339
    :cond_8
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    .line 340
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 341
    iget v0, p1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->IconCompatParcelizer:I

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    .line 342
    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->RatingCompat:Landroid/os/Parcelable;

    return-void
.end method

.method protected final onSaveInstanceState()Landroid/os/Parcelable;
    .registers 4

    .line 314
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 315
    new-instance v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    invoke-direct {v1, v0}, Landroidx/viewpager2/widget/ViewPager2$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 317
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->RemoteActionCompatParcelizer:I

    .line 318
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatMediaItem:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_18

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    :cond_18
    iput v0, v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->IconCompatParcelizer:I

    .line 320
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->RatingCompat:Landroid/os/Parcelable;

    if-eqz v0, :cond_21

    .line 321
    iput-object v0, v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    return-object v1

    .line 323
    :cond_21
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object p0

    .line 324
    instance-of v0, p0, Lo/getInstallerPackageName;

    if-eqz v0, :cond_33

    .line 325
    check-cast p0, Lo/getInstallerPackageName;

    invoke-interface {p0}, Lo/getInstallerPackageName;->RemoteActionCompatParcelizer()Landroid/os/Parcelable;

    move-result-object p0

    iput-object p0, v1, Landroidx/viewpager2/widget/ViewPager2$SavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    :cond_33
    return-object v1
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .registers 3

    .line 496
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 497
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " does not support direct child views"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .registers 4

    .line 963
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(I)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 964
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->read(I)Z

    move-result p0

    return p0

    .line 966
    :cond_f
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

.method public final read()I
    .registers 1

    .line 682
    iget p0, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    return p0
.end method

.method public final setAdapter(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 4

    .line 466
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->IconCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v0

    .line 467
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 468
    invoke-direct {p0, v0}, Landroidx/viewpager2/widget/ViewPager2;->write(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 469
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    const/4 v0, 0x0

    .line 470
    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    .line 471
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2;->MediaMetadataCompat()V

    .line 472
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    .line 473
    invoke-direct {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V

    return-void
.end method

.method public final setCurrentItem(I)V
    .registers 3

    const/4 v0, 0x1

    .line 598
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    return-void
.end method

.method public final setCurrentItem(IZ)V
    .registers 4

    .line 610
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-nez v0, :cond_a

    .line 614
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer(IZ)V

    return-void

    .line 611
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot change current item when ViewPager2 is fake dragging"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final setLayoutDirection(I)V
    .registers 2

    .line 950
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setLayoutDirection(I)V

    .line 951
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->read()V

    return-void
.end method

.method public final setOffscreenPageLimit(I)V
    .registers 3

    if-gtz p1, :cond_e

    const/4 v0, -0x1

    if-ne p1, v0, :cond_6

    goto :goto_e

    .line 840
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 843
    :cond_e
    :goto_e
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplBaseParcelizer:I

    .line 845
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final setOrientation(I)V
    .registers 3

    .line 576
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->AudioAttributesImplApi21Parcelizer(I)V

    .line 577
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method public final setPageTransformer(Landroidx/viewpager2/widget/ViewPager2$AudioAttributesCompatParcelizer;)V
    .registers 5

    const/4 v0, 0x0

    if-eqz p1, :cond_18

    .line 908
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->onCommand:Z

    if-nez v1, :cond_12

    .line 909
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    move-result-object v1

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->onAddQueueItem:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    const/4 v1, 0x1

    .line 910
    iput-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->onCommand:Z

    .line 912
    :cond_12
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;)V

    goto :goto_28

    .line 914
    :cond_18
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->onCommand:Z

    if-eqz v1, :cond_28

    .line 915
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->onAddQueueItem:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;)V

    .line 916
    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->onAddQueueItem:Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi26Parcelizer;

    const/4 v0, 0x0

    .line 917
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->onCommand:Z

    .line 923
    :cond_28
    :goto_28
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaMetadataCompat:Lo/getNameForUid;

    invoke-virtual {v0}, Lo/getNameForUid;->write()Landroidx/viewpager2/widget/ViewPager2$AudioAttributesCompatParcelizer;

    move-result-object v0

    if-ne p1, v0, :cond_31

    return-void

    .line 926
    :cond_31
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaMetadataCompat:Lo/getNameForUid;

    invoke-virtual {v0, p1}, Lo/getNameForUid;->read(Landroidx/viewpager2/widget/ViewPager2$AudioAttributesCompatParcelizer;)V

    .line 927
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2;->RatingCompat()V

    return-void
.end method

.method public final setUserInputEnabled(Z)V
    .registers 2

    .line 799
    iput-boolean p1, p0, Landroidx/viewpager2/widget/ViewPager2;->onCustomAction:Z

    .line 800
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public final write()I
    .registers 1

    .line 857
    iget p0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplBaseParcelizer:I

    return p0
.end method

.method public final write(Landroidx/viewpager2/widget/ViewPager2$write;)V
    .registers 2

    .line 889
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi21Parcelizer:Lo/getInstalledApplications;

    invoke-virtual {p0, p1}, Lo/getInstalledApplications;->write(Landroidx/viewpager2/widget/ViewPager2$write;)V

    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.AnonymousClass1 (androidx.viewpager2.widget.ViewPager2$1)
.class final Landroidx/viewpager2/widget/ViewPager2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager2/widget/ViewPager2;->MediaDescriptionCompat()Landroidx/recyclerview/widget/RecyclerView$AudioAttributesImplApi21Parcelizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    .line 270
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$1;->IconCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 3

    .line 274
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 275
    iget p1, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_10

    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne p0, v0, :cond_10

    return-void

    .line 277
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Pages must fill the whole ViewPager2 (use match_parent)"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final read(Landroid/view/View;)V
    .registers 2

    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.AnonymousClass2 (androidx.viewpager2.widget.ViewPager2$2)
.class final Landroidx/viewpager2/widget/ViewPager2$2;
.super Landroidx/viewpager2/widget/ViewPager2$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    .line 139
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$IconCompatParcelizer;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final read()V
    .registers 3

    .line 142
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer:Z

    .line 143
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver:Lo/getLaunchIntentForPackage;

    invoke-virtual {p0}, Lo/getLaunchIntentForPackage;->IconCompatParcelizer()V

    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.AnonymousClass3 (androidx.viewpager2.widget.ViewPager2$3)
.class final Landroidx/viewpager2/widget/ViewPager2$3;
.super Landroidx/viewpager2/widget/ViewPager2$write;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager2/widget/ViewPager2;->read(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    .line 237
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$3;->read:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$write;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(I)V
    .registers 2

    .line 240
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$3;->read:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 241
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$3;->read:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_15

    .line 242
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$3;->read:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->write:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Landroid/view/View;->requestFocus(I)Z

    :cond_15
    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.AnonymousClass5 (androidx.viewpager2.widget.ViewPager2$5)
.class final Landroidx/viewpager2/widget/ViewPager2$5;
.super Landroidx/viewpager2/widget/ViewPager2$write;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager2/widget/ViewPager2;->read(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    .line 219
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$5;->write:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$write;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(I)V
    .registers 2

    if-nez p1, :cond_7

    .line 231
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$5;->write:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplBaseParcelizer()V

    :cond_7
    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)V
    .registers 3

    .line 222
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$5;->write:Landroidx/viewpager2/widget/ViewPager2;

    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    if-eq v0, p1, :cond_11

    .line 223
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$5;->write:Landroidx/viewpager2/widget/ViewPager2;

    iput p1, v0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    .line 224
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$5;->write:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->IconCompatParcelizer()V

    :cond_11
    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.AudioAttributesCompatParcelizer (androidx.viewpager2.widget.ViewPager2$AudioAttributesCompatParcelizer)
.class public interface abstract Landroidx/viewpager2/widget/ViewPager2$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioAttributesCompatParcelizer"
.end annotation

###### Class androidx.viewpager2.widget.ViewPager2.AudioAttributesImplApi21Parcelizer (androidx.viewpager2.widget.ViewPager2$AudioAttributesImplApi21Parcelizer)
.class final Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi21Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation


# instance fields
.field private final RemoteActionCompatParcelizer:I

.field private final read:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method constructor <init>(ILandroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    .line 1077
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1078
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:I

    .line 1079
    iput-object p2, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi21Parcelizer;->read:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1084
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi21Parcelizer;->read:Landroidx/recyclerview/widget/RecyclerView;

    iget p0, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi21Parcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->AudioAttributesImplBaseParcelizer(I)V

    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.AudioAttributesImplApi26Parcelizer (androidx.viewpager2.widget.ViewPager2$AudioAttributesImplApi26Parcelizer)
.class final Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesImplApi26Parcelizer"
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V
    .registers 3

    .line 974
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    .line 975
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final getAccessibilityClassName()Ljava/lang/CharSequence;
    .registers 2

    .line 981
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    .line 984
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAccessibilityClassName()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 989
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 990
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 991
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    .line 992
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->read(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    .line 1003
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    .line 998
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    if-eqz p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.viewpager2.widget.ViewPager2.IconCompatParcelizer (androidx.viewpager2.widget.ViewPager2$IconCompatParcelizer)
.class abstract Landroidx/viewpager2/widget/ViewPager2$IconCompatParcelizer;
.super Landroidx/recyclerview/widget/RecyclerView$read;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1617
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$read;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .registers 2

    .line 1617
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$IconCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(II)V
    .registers 3

    .line 1634
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$read;->read()V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(IILjava/lang/Object;)V
    .registers 4

    .line 1629
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$read;->read()V

    return-void
.end method

.method public final IconCompatParcelizer(II)V
    .registers 3

    .line 1623
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$read;->read()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(II)V
    .registers 3

    .line 1644
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$read;->read()V

    return-void
.end method

.method public final read(II)V
    .registers 3

    .line 1639
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$read;->read()V

    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.LinearLayoutManagerImpl (androidx.viewpager2.widget.ViewPager2$LinearLayoutManagerImpl)
.class Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LinearLayoutManagerImpl"
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V
    .registers 3

    .line 1008
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    .line 1009
    invoke-direct {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 5

    .line 1033
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    invoke-virtual {p0, p3, p4}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->write(Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/hasSuperClassStartingWith;)V
    .registers 4

    .line 1024
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;Lo/hasSuperClassStartingWith;)V

    .line 1025
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .registers 6

    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;[I)V
    .registers 5

    .line 1039
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->write()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_d

    .line 1042
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;[I)V

    return-void

    .line 1045
    :cond_d
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer()I

    move-result p0

    mul-int/2addr p0, v0

    const/4 p1, 0x0

    .line 1046
    aput p0, p2, p1

    const/4 p1, 0x1

    .line 1047
    aput p0, p2, p1

    return-void
.end method

.method public final write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;ILandroid/os/Bundle;)Z
    .registers 6

    .line 1015
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$LinearLayoutManagerImpl;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;

    .line 1018
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->write(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;ILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

###### Class androidx.viewpager2.widget.ViewPager2.MediaBrowserCompatCustomActionResultReceiver (androidx.viewpager2.widget.ViewPager2$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroidx/viewpager2/widget/ViewPager2$MediaBrowserCompatCustomActionResultReceiver;
.super Lo/UByteSerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    .line 1059
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Lo/UByteSerializer;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)Landroid/view/View;
    .registers 3

    .line 1069
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 p0, 0x0

    return-object p0

    :cond_a
    invoke-super {p0, p1}, Lo/UByteSerializer;->AudioAttributesCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$MediaBrowserCompatItemReceiver;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.viewpager2.widget.ViewPager2.RemoteActionCompatParcelizer (androidx.viewpager2.widget.ViewPager2$RemoteActionCompatParcelizer)
.class abstract Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method private constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 2

    .line 1235
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/viewpager2/widget/ViewPager2;B)V
    .registers 3

    .line 1235
    invoke-direct {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    return-void
.end method


# virtual methods
.method AudioAttributesCompatParcelizer()V
    .registers 1

    return-void
.end method

.method AudioAttributesImplApi21Parcelizer()V
    .registers 1

    return-void
.end method

.method IconCompatParcelizer()V
    .registers 1

    return-void
.end method

.method IconCompatParcelizer(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 2

    return-void
.end method

.method IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    return-void
.end method

.method MediaBrowserCompatCustomActionResultReceiver()V
    .registers 1

    return-void
.end method

.method RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 2

    .line 1245
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Not implemented."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method RemoteActionCompatParcelizer(I)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method read()V
    .registers 1

    return-void
.end method

.method read(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 2

    return-void
.end method

.method read(I)Z
    .registers 2

    .line 1277
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Not implemented."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method write(Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 3

    return-void
.end method

.method write()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.viewpager2.widget.ViewPager2.SavedState (androidx.viewpager2.widget.ViewPager2$SavedState)
.class Landroidx/viewpager2/widget/ViewPager2$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/viewpager2/widget/ViewPager2$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

.field IconCompatParcelizer:I

.field RemoteActionCompatParcelizer:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 420
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$SavedState$5;

    invoke-direct {v0}, Landroidx/viewpager2/widget/ViewPager2$SavedState$5;-><init>()V

    sput-object v0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 3

    .line 392
    invoke-direct {p0, p1, p2}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 393
    invoke-direct {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2$SavedState;->read(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 402
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method

.method private read(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 4

    .line 407
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->RemoteActionCompatParcelizer:I

    .line 408
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->IconCompatParcelizer:I

    .line 409
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 414
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 415
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 416
    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->IconCompatParcelizer:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 417
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$SavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.SavedState.AnonymousClass5 (androidx.viewpager2.widget.ViewPager2$SavedState$5)
.class final Landroidx/viewpager2/widget/ViewPager2$SavedState$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/viewpager2/widget/ViewPager2$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 420
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/viewpager2/widget/ViewPager2$SavedState;
    .registers 3

    .line 424
    new-instance v0, Landroidx/viewpager2/widget/ViewPager2$SavedState;

    invoke-direct {v0, p0, p1}, Landroidx/viewpager2/widget/ViewPager2$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/viewpager2/widget/ViewPager2$SavedState;
    .registers 1

    .line 435
    new-array p0, p0, [Landroidx/viewpager2/widget/ViewPager2$SavedState;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/viewpager2/widget/ViewPager2$SavedState;
    .registers 2

    const/4 v0, 0x0

    .line 430
    invoke-static {p0, v0}, Landroidx/viewpager2/widget/ViewPager2$SavedState$5;->RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/viewpager2/widget/ViewPager2$SavedState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 420
    invoke-static {p1}, Landroidx/viewpager2/widget/ViewPager2$SavedState$5;->write(Landroid/os/Parcel;)Landroidx/viewpager2/widget/ViewPager2$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 420
    invoke-static {p1, p2}, Landroidx/viewpager2/widget/ViewPager2$SavedState$5;->RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/viewpager2/widget/ViewPager2$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 420
    invoke-static {p1}, Landroidx/viewpager2/widget/ViewPager2$SavedState$5;->RemoteActionCompatParcelizer(I)[Landroidx/viewpager2/widget/ViewPager2$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.viewpager2.widget.ViewPager2.read (androidx.viewpager2.widget.ViewPager2$read)
.class final Landroidx/viewpager2/widget/ViewPager2$read;
.super Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

.field private final RemoteActionCompatParcelizer:Lo/modifyFieldName;

.field private read:Landroidx/recyclerview/widget/RecyclerView$read;

.field private final write:Lo/modifyFieldName;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .registers 3

    .line 1347
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2$RemoteActionCompatParcelizer;-><init>(Landroidx/viewpager2/widget/ViewPager2;B)V

    .line 1348
    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$read$5;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$read$5;-><init>(Landroidx/viewpager2/widget/ViewPager2$read;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->write:Lo/modifyFieldName;

    .line 1359
    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$read$4;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$read$4;-><init>(Landroidx/viewpager2/widget/ViewPager2$read;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->RemoteActionCompatParcelizer:Lo/modifyFieldName;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/hasSuperClassStartingWith;)V
    .registers 4

    .line 1595
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v0

    if-eqz v0, :cond_31

    .line 1599
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v0

    if-eqz v0, :cond_31

    .line 1600
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver()Z

    move-result v1

    if-eqz v1, :cond_31

    .line 1603
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget v1, v1, Landroidx/viewpager2/widget/ViewPager2;->read:I

    if-lez v1, :cond_21

    const/16 v1, 0x2000

    .line 1604
    invoke-virtual {p1, v1}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(I)V

    .line 1606
    :cond_21
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget p0, p0, Landroidx/viewpager2/widget/ViewPager2;->read:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p0, v0, :cond_2e

    const/16 p0, 0x1000

    .line 1607
    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(I)V

    .line 1609
    :cond_2e
    invoke-virtual {p1, v1}, Lo/hasSuperClassStartingWith;->handleMediaPlayPauseIfPendingOnHandler(Z)V

    :cond_31
    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 12

    .line 1582
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_14

    .line 1583
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-static {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v0

    move v3, v0

    goto :goto_15

    :cond_14
    move v3, v2

    .line 1585
    :goto_15
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer()I

    move-result v0

    if-nez v0, :cond_25

    .line 1586
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-static {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->MediaDescriptionCompat(Landroid/view/View;)I

    move-result v2

    :cond_25
    move v5, v2

    const/4 v4, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 1589
    invoke-static/range {v3 .. v8}, Lo/hasSuperClassStartingWith$AudioAttributesImplBaseParcelizer;->read(IIIIZZ)Lo/hasSuperClassStartingWith$AudioAttributesImplBaseParcelizer;

    move-result-object p0

    .line 1591
    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)V

    return-void
.end method

.method private write(Lo/hasSuperClassStartingWith;)V
    .registers 6

    .line 1565
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2b

    .line 1566
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_20

    .line 1567
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result p0

    move v3, v2

    move v2, p0

    move p0, v3

    goto :goto_2d

    .line 1570
    :cond_20
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result p0

    goto :goto_2d

    :cond_2b
    move p0, v1

    move v2, p0

    .line 1575
    :goto_2d
    invoke-static {v2, p0, v1, v1}, Lo/hasSuperClassStartingWith$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(IIZI)Lo/hasSuperClassStartingWith$RemoteActionCompatParcelizer;

    move-result-object p0

    .line 1578
    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->RemoteActionCompatParcelizer(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    .line 1407
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method final AudioAttributesCompatParcelizer(I)V
    .registers 3

    .line 1494
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1495
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesCompatParcelizer(IZ)V

    :cond_e
    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()V
    .registers 1

    .line 1427
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method final AudioAttributesImplApi26Parcelizer()V
    .registers 9

    .line 1504
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    const v1, 0x1020048

    .line 1515
    invoke-static {v0, v1}, Lo/InvalidTypeIdException;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    const v2, 0x1020049

    .line 1516
    invoke-static {v0, v2}, Lo/InvalidTypeIdException;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    const v3, 0x1020046

    .line 1517
    invoke-static {v0, v3}, Lo/InvalidTypeIdException;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    const v4, 0x1020047

    .line 1518
    invoke-static {v0, v4}, Lo/InvalidTypeIdException;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    .line 1520
    iget-object v5, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v5}, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v5

    if-eqz v5, :cond_92

    .line 1524
    iget-object v5, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v5}, Landroidx/viewpager2/widget/ViewPager2;->RemoteActionCompatParcelizer()Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->getItemCount()I

    move-result v5

    if-eqz v5, :cond_92

    .line 1529
    iget-object v6, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v6}, Landroidx/viewpager2/widget/ViewPager2;->MediaBrowserCompatItemReceiver()Z

    move-result v6

    if-eqz v6, :cond_92

    .line 1533
    iget-object v6, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v6}, Landroidx/viewpager2/widget/ViewPager2;->IconCompatParcelizer()I

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_70

    .line 1534
    iget-object v3, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->AudioAttributesImplApi26Parcelizer()Z

    move-result v3

    if-eqz v3, :cond_49

    move v4, v1

    goto :goto_4a

    :cond_49
    move v4, v2

    :goto_4a
    if-eqz v3, :cond_4d

    move v1, v2

    .line 1538
    :cond_4d
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget v2, v2, Landroidx/viewpager2/widget/ViewPager2;->read:I

    add-int/lit8 v5, v5, -0x1

    if-ge v2, v5, :cond_5f

    .line 1539
    new-instance v2, Lo/hasSuperClassStartingWith$read;

    invoke-direct {v2, v4, v7}, Lo/hasSuperClassStartingWith$read;-><init>(ILjava/lang/CharSequence;)V

    iget-object v3, p0, Landroidx/viewpager2/widget/ViewPager2$read;->write:Lo/modifyFieldName;

    invoke-static {v0, v2, v7, v3}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith$read;Ljava/lang/CharSequence;Lo/modifyFieldName;)V

    .line 1543
    :cond_5f
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget v2, v2, Landroidx/viewpager2/widget/ViewPager2;->read:I

    if-lez v2, :cond_92

    .line 1544
    new-instance v2, Lo/hasSuperClassStartingWith$read;

    invoke-direct {v2, v1, v7}, Lo/hasSuperClassStartingWith$read;-><init>(ILjava/lang/CharSequence;)V

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->RemoteActionCompatParcelizer:Lo/modifyFieldName;

    invoke-static {v0, v2, v7, p0}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith$read;Ljava/lang/CharSequence;Lo/modifyFieldName;)V

    return-void

    .line 1549
    :cond_70
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget v1, v1, Landroidx/viewpager2/widget/ViewPager2;->read:I

    add-int/lit8 v5, v5, -0x1

    if-ge v1, v5, :cond_82

    .line 1550
    new-instance v1, Lo/hasSuperClassStartingWith$read;

    invoke-direct {v1, v4, v7}, Lo/hasSuperClassStartingWith$read;-><init>(ILjava/lang/CharSequence;)V

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2$read;->write:Lo/modifyFieldName;

    invoke-static {v0, v1, v7, v2}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith$read;Ljava/lang/CharSequence;Lo/modifyFieldName;)V

    .line 1554
    :cond_82
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    iget v1, v1, Landroidx/viewpager2/widget/ViewPager2;->read:I

    if-lez v1, :cond_92

    .line 1555
    new-instance v1, Lo/hasSuperClassStartingWith$read;

    invoke-direct {v1, v3, v7}, Lo/hasSuperClassStartingWith$read;-><init>(ILjava/lang/CharSequence;)V

    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->RemoteActionCompatParcelizer:Lo/modifyFieldName;

    invoke-static {v0, v1, v7, p0}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith$read;Ljava/lang/CharSequence;Lo/modifyFieldName;)V

    :cond_92
    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 1

    .line 1432
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 2

    .line 1450
    invoke-static {p1}, Lo/hasSuperClassStartingWith;->write(Landroid/view/accessibility/AccessibilityNodeInfo;)Lo/hasSuperClassStartingWith;

    move-result-object p1

    .line 1451
    invoke-direct {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$read;->write(Lo/hasSuperClassStartingWith;)V

    .line 1453
    invoke-direct {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer(Lo/hasSuperClassStartingWith;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 1421
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->read:Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V

    :cond_7
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    const/4 v0, 0x2

    .line 1375
    invoke-static {p1, v0}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    .line 1378
    new-instance p1, Landroidx/viewpager2/widget/ViewPager2$read$1;

    invoke-direct {p1, p0}, Landroidx/viewpager2/widget/ViewPager2$read$1;-><init>(Landroidx/viewpager2/widget/ViewPager2$read;)V

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->read:Landroidx/recyclerview/widget/RecyclerView$read;

    .line 1385
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-static {p1}, Lo/InvalidTypeIdException;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_19

    .line 1387
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    :cond_19
    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()V
    .registers 1

    .line 1437
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 1399
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->write()Z

    move-result p0

    if-eqz p0, :cond_9

    .line 1402
    const-string p0, "androidx.viewpager.widget.ViewPager"

    return-object p0

    .line 1400
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer<",
            "*>;)V"
        }
    .end annotation

    .line 1412
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesImplApi26Parcelizer()V

    if-eqz p1, :cond_a

    .line 1414
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->read:Landroidx/recyclerview/widget/RecyclerView$read;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$read;)V

    :cond_a
    return-void
.end method

.method public final RemoteActionCompatParcelizer(I)Z
    .registers 2

    const/16 p0, 0x2000

    if-eq p1, p0, :cond_a

    const/16 p0, 0x1000

    if-eq p1, p0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    const/4 p0, 0x1

    return p0
.end method

.method public final read()V
    .registers 1

    .line 1445
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

.method public final read(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 1484
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;)V

    .line 1485
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->RemoteActionCompatParcelizer()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final read(I)Z
    .registers 4

    .line 1471
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$read;->RemoteActionCompatParcelizer(I)Z

    move-result v0

    if-eqz v0, :cond_1e

    const/16 v0, 0x2000

    const/4 v1, 0x1

    if-ne p1, v0, :cond_13

    .line 1476
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->read()I

    move-result p1

    sub-int/2addr p1, v1

    goto :goto_1a

    .line 1477
    :cond_13
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->read()I

    move-result p1

    add-int/2addr p1, v1

    .line 1478
    :goto_1a
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer(I)V

    return v1

    .line 1472
    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method final write(Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 3

    .line 1460
    invoke-direct {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2$read;->RemoteActionCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    return-void
.end method

.method public final write()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.viewpager2.widget.ViewPager2.read.AnonymousClass1 (androidx.viewpager2.widget.ViewPager2$read$1)
.class final Landroidx/viewpager2/widget/ViewPager2$read$1;
.super Landroidx/viewpager2/widget/ViewPager2$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager2/widget/ViewPager2$read;->IconCompatParcelizer(Landroidx/recyclerview/widget/RecyclerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$read;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2$read;)V
    .registers 2

    .line 1378
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read$1;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$read;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$IconCompatParcelizer;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final read()V
    .registers 1

    .line 1381
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read$1;->AudioAttributesCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$read;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesImplApi26Parcelizer()V

    return-void
.end method

###### Class androidx.viewpager2.widget.ViewPager2.read.AnonymousClass4 (androidx.viewpager2.widget.ViewPager2$read$4)
.class final Landroidx/viewpager2/widget/ViewPager2$read$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/modifyFieldName;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2$read;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$read;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2$read;)V
    .registers 2

    .line 1360
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read$4;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$read;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Landroid/view/View;)Z
    .registers 3

    .line 1364
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 1365
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read$4;->RemoteActionCompatParcelizer:Landroidx/viewpager2/widget/ViewPager2$read;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->read()I

    move-result p1

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer(I)V

    return v0
.end method

###### Class androidx.viewpager2.widget.ViewPager2.read.AnonymousClass5 (androidx.viewpager2.widget.ViewPager2$read$5)
.class final Landroidx/viewpager2/widget/ViewPager2$read$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/modifyFieldName;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2$read;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/viewpager2/widget/ViewPager2$read;


# direct methods
.method constructor <init>(Landroidx/viewpager2/widget/ViewPager2$read;)V
    .registers 2

    .line 1349
    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2$read$5;->read:Landroidx/viewpager2/widget/ViewPager2$read;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Landroid/view/View;)Z
    .registers 3

    .line 1353
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 1354
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2$read$5;->read:Landroidx/viewpager2/widget/ViewPager2$read;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->read()I

    move-result p1

    const/4 v0, 0x1

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$read;->AudioAttributesCompatParcelizer(I)V

    return v0
.end method

###### Class androidx.viewpager2.widget.ViewPager2.write (androidx.viewpager2.widget.ViewPager2$write)
.class public abstract Landroidx/viewpager2/widget/ViewPager2$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/viewpager2/widget/ViewPager2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "write"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1091
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(I)V
    .registers 2

    return-void
.end method

.method public AudioAttributesCompatParcelizer(IFI)V
    .registers 4

    return-void
.end method

.method public RemoteActionCompatParcelizer(I)V
    .registers 2

    return-void
.end method
