###### Class androidx.core.widget.NestedScrollView (androidx.core.widget.NestedScrollView)
.class public Landroidx/core/widget/NestedScrollView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lo/resetAsObject;
.implements Lo/addValue;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/widget/NestedScrollView$IconCompatParcelizer;,
        Landroidx/core/widget/NestedScrollView$AudioAttributesCompatParcelizer;,
        Landroidx/core/widget/NestedScrollView$RemoteActionCompatParcelizer;,
        Landroidx/core/widget/NestedScrollView$read;,
        Landroidx/core/widget/NestedScrollView$write;,
        Landroidx/core/widget/NestedScrollView$SavedState;
    }
.end annotation


# static fields
.field private static final IconCompatParcelizer:F

.field private static final RemoteActionCompatParcelizer:Landroidx/core/widget/NestedScrollView$IconCompatParcelizer;

.field private static final read:[I


# instance fields
.field final AudioAttributesCompatParcelizer:Landroidx/core/widget/NestedScrollView$read;

.field private AudioAttributesImplApi21Parcelizer:Lo/byteFromChars;

.field private final AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

.field private AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

.field private MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

.field private MediaBrowserCompatMediaItem:Z

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private MediaDescriptionCompat:Z

.field private MediaMetadataCompat:I

.field private RatingCompat:Z

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:I

.field private onCommand:I

.field private onCustomAction:J

.field private final onFastForward:Lo/rootArrayScope;

.field private onMediaButtonEvent:Landroidx/core/widget/NestedScrollView$write;

.field private onPause:Landroidx/core/widget/NestedScrollView$SavedState;

.field private final onPlay:[I

.field private final onPlayFromMediaId:F

.field private onPlayFromSearch:Lo/IgnoredPropertyException;

.field private onPlayFromUri:Z

.field private final onPrepare:Landroid/graphics/Rect;

.field private final onPrepareFromMediaId:[I

.field private onPrepareFromSearch:Landroid/widget/OverScroller;

.field private onPrepareFromUri:Landroid/view/VelocityTracker;

.field private onRewind:I

.field private onSeekTo:F

.field private write:I


# direct methods
.method static constructor <clinit>()V
    .registers 4

    const-wide v0, 0x3fe8f5c28f5c28f6L    # 0.78

    .line 93
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-float v0, v0

    sput v0, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer:F

    .line 220
    new-instance v0, Landroidx/core/widget/NestedScrollView$IconCompatParcelizer;

    invoke-direct {v0}, Landroidx/core/widget/NestedScrollView$IconCompatParcelizer;-><init>()V

    sput-object v0, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer:Landroidx/core/widget/NestedScrollView$IconCompatParcelizer;

    const v0, 0x101017a

    .line 222
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/core/widget/NestedScrollView;->read:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 242
    invoke-direct {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 246
    sget v0, Lo/_byteOverflow$RemoteActionCompatParcelizer;->nestedScrollViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 9

    .line 251
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 127
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    const/4 v0, 0x1

    .line 151
    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->MediaDescriptionCompat:Z

    const/4 v1, 0x0

    .line 152
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatSearchResultReceiver:Z

    const/4 v2, 0x0

    .line 159
    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    .line 166
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    .line 182
    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromUri:Z

    const/4 v2, -0x1

    .line 192
    iput v2, p0, Landroidx/core/widget/NestedScrollView;->write:I

    const/4 v2, 0x2

    .line 199
    new-array v3, v2, [I

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromMediaId:[I

    .line 205
    new-array v2, v2, [I

    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    .line 233
    new-instance v2, Landroidx/core/widget/NestedScrollView$read;

    invoke-direct {v2, p0}, Landroidx/core/widget/NestedScrollView$read;-><init>(Landroidx/core/widget/NestedScrollView;)V

    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer:Landroidx/core/widget/NestedScrollView$read;

    .line 239
    new-instance v3, Lo/byteFromChars;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lo/byteFromChars;-><init>(Landroid/content/Context;Lo/_badFormat;)V

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi21Parcelizer:Lo/byteFromChars;

    .line 252
    invoke-static {p1, p2}, Lo/memberMethods;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v2

    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    .line 253
    invoke-static {p1, p2}, Lo/memberMethods;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v2

    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    .line 255
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x43200000    # 160.0f

    mul-float/2addr v2, v3

    const v3, 0x43c10b3d

    mul-float/2addr v2, v3

    const v3, 0x3f570a3d    # 0.84f

    mul-float/2addr v2, v3

    .line 256
    iput v2, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromMediaId:F

    .line 261
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer()V

    .line 263
    sget-object v2, Landroidx/core/widget/NestedScrollView;->read:[I

    invoke-virtual {p1, p2, v2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 266
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->setFillViewport(Z)V

    .line 268
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 270
    new-instance p1, Lo/rootArrayScope;

    invoke-direct {p1}, Lo/rootArrayScope;-><init>()V

    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->onFastForward:Lo/rootArrayScope;

    .line 271
    new-instance p1, Lo/rootObjectScope;

    invoke-direct {p1, p0}, Lo/rootObjectScope;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    .line 274
    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    .line 276
    sget-object p1, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer:Landroidx/core/widget/NestedScrollView$IconCompatParcelizer;

    invoke-static {p0, p1}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/deserializeUsingCustom;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)I
    .registers 12

    .line 2157
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    .line 2159
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 2160
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    add-int v3, v2, v0

    .line 2164
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v4

    .line 2169
    iget v5, p1, Landroid/graphics/Rect;->top:I

    if-lez v5, :cond_1b

    add-int/2addr v2, v4

    .line 2176
    :cond_1b
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 2177
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 2178
    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v8

    iget v9, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v9

    iget v9, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v8, v9

    if-ge v7, v8, :cond_36

    sub-int v4, v3, v4

    goto :goto_37

    :cond_36
    move v4, v3

    .line 2184
    :goto_37
    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    if-le v7, v4, :cond_59

    iget v7, p1, Landroid/graphics/Rect;->top:I

    if-le v7, v2, :cond_59

    .line 2189
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p0

    if-le p0, v0, :cond_49

    .line 2191
    iget p0, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p0, v2

    goto :goto_4c

    .line 2194
    :cond_49
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p0, v4

    .line 2198
    :goto_4c
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result p1

    iget v0, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    sub-int/2addr p1, v3

    .line 2200
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0

    .line 2202
    :cond_59
    iget v3, p1, Landroid/graphics/Rect;->top:I

    if-ge v3, v2, :cond_7a

    iget v3, p1, Landroid/graphics/Rect;->bottom:I

    if-ge v3, v4, :cond_7a

    .line 2207
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-le v3, v0, :cond_6c

    .line 2209
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, p1

    sub-int/2addr v1, v4

    goto :goto_70

    .line 2212
    :cond_6c
    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, p1

    sub-int/2addr v1, v2

    .line 2216
    :goto_70
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    neg-int p0, p0

    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    :cond_7a
    return v1
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/core/widget/NestedScrollView;)Landroid/widget/OverScroller;
    .registers 1

    .line 79
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 2

    .line 2105
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    const/4 v0, 0x1

    .line 2106
    invoke-direct {p0, v0}, Landroidx/core/widget/NestedScrollView;->RatingCompat(I)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(II)V
    .registers 3

    .line 1042
    iput p1, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    .line 1043
    iput p2, p0, Landroidx/core/widget/NestedScrollView;->write:I

    const/4 p1, 0x2

    const/4 p2, 0x0

    .line 1044
    invoke-direct {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->write(II)Z

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Z)V
    .registers 3

    const/4 v0, 0x1

    if-eqz p1, :cond_8

    const/4 p1, 0x2

    .line 2096
    invoke-direct {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->write(II)Z

    goto :goto_b

    .line 2098
    :cond_8
    invoke-direct {p0, v0}, Landroidx/core/widget/NestedScrollView;->RatingCompat(I)V

    .line 2100
    :goto_b
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->onCommand:I

    .line 2101
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->postInvalidateOnAnimation()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;)Z
    .registers 7

    .line 1350
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v2, 0x1

    if-eqz v0, :cond_1d

    .line 1351
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v0, v1, v3}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move v0, v2

    goto :goto_1e

    :cond_1d
    const/4 v0, 0x0

    .line 1354
    :goto_1e
    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-static {v3}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v3

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_3b

    .line 1355
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr p1, p0

    const/high16 p0, 0x3f800000    # 1.0f

    sub-float/2addr p0, p1

    invoke-static {v0, v1, p0}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    return v2

    :cond_3b
    return v0
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;)Z
    .registers 4

    const/4 v0, 0x0

    .line 1778
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Landroidx/core/widget/NestedScrollView;->read(Landroid/view/View;II)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private AudioAttributesImplApi21Parcelizer(I)I
    .registers 9

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    move v1, p1

    .line 1072
    invoke-direct/range {v0 .. v6}, Landroidx/core/widget/NestedScrollView;->read(IILandroid/view/MotionEvent;IIZ)I

    move-result p0

    return p0
.end method

.method private AudioAttributesImplApi21Parcelizer()V
    .registers 2

    .line 774
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    if-nez v0, :cond_a

    .line 775
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    :cond_a
    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer(I)I
    .registers 7

    .line 1281
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    const/high16 v3, 0x40800000    # 4.0f

    if-lez p1, :cond_31

    .line 1282
    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-static {v4}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v4, v4, v2

    if-eqz v4, :cond_31

    neg-int v2, p1

    int-to-float v2, v2

    mul-float/2addr v2, v3

    int-to-float v4, v0

    div-float/2addr v2, v4

    neg-int v0, v0

    int-to-float v0, v0

    div-float/2addr v0, v3

    .line 1284
    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    .line 1285
    invoke-static {v3, v2, v1}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result v1

    mul-float/2addr v0, v1

    .line 1284
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-eq v0, p1, :cond_2f

    .line 1287
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->finish()V

    :cond_2f
    sub-int/2addr p1, v0

    return p1

    :cond_31
    if-gez p1, :cond_55

    .line 1291
    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-static {v4}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v2, v4, v2

    if-eqz v2, :cond_55

    int-to-float v2, p1

    int-to-float v0, v0

    mul-float/2addr v2, v3

    div-float/2addr v2, v0

    div-float/2addr v0, v3

    .line 1293
    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    .line 1294
    invoke-static {v3, v2, v1}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result v1

    mul-float/2addr v0, v1

    .line 1293
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-eq v0, p1, :cond_54

    .line 1296
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->finish()V

    :cond_54
    sub-int/2addr p1, v0

    :cond_55
    return p1
.end method

.method private AudioAttributesImplApi26Parcelizer()V
    .registers 3

    .line 527
    new-instance v0, Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    const/4 v0, 0x1

    .line 528
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    const/high16 v0, 0x40000

    .line 529
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    const/4 v0, 0x0

    .line 530
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 531
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 532
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->onRewind:I

    .line 533
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->onAddQueueItem:I

    .line 534
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->handleMediaPlayPauseIfPendingOnHandler:I

    return-void
.end method

.method private AudioAttributesImplBaseParcelizer(I)F
    .registers 8

    .line 1311
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    const v0, 0x3eb33333    # 0.35f

    mul-float/2addr p1, v0

    iget v0, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromMediaId:F

    const v1, 0x3c75c28f    # 0.015f

    mul-float/2addr v0, v1

    div-float/2addr p1, v0

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    .line 1312
    sget p1, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer:F

    float-to-double v4, p1

    .line 1313
    iget p0, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromMediaId:F

    mul-float/2addr p0, v1

    float-to-double p0, p0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double v0, v4, v0

    div-double/2addr v4, v0

    mul-double/2addr v4, v2

    .line 1314
    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    mul-double/2addr p0, v0

    double-to-float p0, p0

    return p0
.end method

.method private AudioAttributesImplBaseParcelizer()Lo/IgnoredPropertyException;
    .registers 2

    .line 2635
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromSearch:Lo/IgnoredPropertyException;

    if-nez v0, :cond_a

    .line 2636
    invoke-static {p0}, Lo/IgnoredPropertyException;->read(Landroid/view/View;)Lo/IgnoredPropertyException;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromSearch:Lo/IgnoredPropertyException;

    .line 2638
    :cond_a
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromSearch:Lo/IgnoredPropertyException;

    return-object p0
.end method

.method private static IconCompatParcelizer(III)I
    .registers 4

    if-ge p1, p2, :cond_b

    if-ltz p0, :cond_b

    add-int v0, p1, p0

    if-le v0, p2, :cond_a

    sub-int/2addr p2, p1

    return p2

    :cond_a
    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method private IconCompatParcelizer(I)V
    .registers 3

    if-eqz p1, :cond_e

    .line 1800
    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromUri:Z

    if-eqz v0, :cond_a

    .line 1801
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat(I)V

    return-void

    :cond_a
    const/4 v0, 0x0

    .line 1803
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->scrollBy(II)V

    :cond_e
    return-void
.end method

.method private IconCompatParcelizer()Z
    .registers 3

    .line 1425
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getOverScrollMode()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_11

    if-ne v0, v1, :cond_f

    .line 1427
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result p0

    if-gtz p0, :cond_11

    :cond_f
    const/4 p0, 0x0

    return p0

    :cond_11
    return v1
.end method

.method private IconCompatParcelizer(II)Z
    .registers 6

    .line 754
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2b

    .line 755
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    .line 756
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    .line 757
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v2, v0

    if-lt p2, v2, :cond_2b

    .line 758
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v2

    sub-int/2addr v2, v0

    if-ge p2, v2, :cond_2b

    .line 759
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p2

    if-lt p1, p2, :cond_2b

    .line 760
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result p0

    if-ge p1, p0, :cond_2b

    const/4 p0, 0x1

    return p0

    :cond_2b
    return v1
.end method

.method private IconCompatParcelizer(IIII)Z
    .registers 14

    .line 1459
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getOverScrollMode()I

    .line 1461
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeHorizontalScrollRange()I

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeHorizontalScrollExtent()I

    .line 1463
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollRange()I

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollExtent()I

    add-int/2addr p3, p1

    const/4 p1, 0x1

    const/4 v0, 0x0

    if-lez p2, :cond_17

    :goto_14
    move v8, p1

    move p2, v0

    goto :goto_1b

    :cond_17
    if-gez p2, :cond_1a

    goto :goto_14

    :cond_1a
    move v8, v0

    :goto_1b
    if-le p3, p4, :cond_1f

    move p3, p1

    goto :goto_26

    :cond_1f
    if-gez p3, :cond_24

    move p3, p1

    move p4, v0

    goto :goto_26

    :cond_24
    move p4, p3

    move p3, v0

    :goto_26
    if-eqz p3, :cond_3c

    .line 1504
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->MediaDescriptionCompat(I)Z

    move-result v1

    if-nez v1, :cond_3c

    .line 1505
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result v7

    move v2, p2

    move v3, p4

    invoke-virtual/range {v1 .. v7}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    .line 1508
    :cond_3c
    invoke-virtual {p0, p2, p4, v8, p3}, Landroidx/core/widget/NestedScrollView;->onOverScrolled(IIZZ)V

    if-nez v8, :cond_44

    if-nez p3, :cond_44

    return v0

    :cond_44
    return p1
.end method

.method private IconCompatParcelizer(Landroid/graphics/Rect;Z)Z
    .registers 6

    .line 2136
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_a

    move v2, v0

    goto :goto_b

    :cond_a
    move v2, v1

    :goto_b
    if-eqz v2, :cond_16

    if-eqz p2, :cond_13

    .line 2140
    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollBy(II)V

    return v0

    .line 2142
    :cond_13
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat(I)V

    :cond_16
    return v2
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 2

    .line 766
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    if-nez v0, :cond_b

    .line 767
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    return-void

    .line 769
    :cond_b
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    return-void
.end method

.method private MediaBrowserCompatCustomActionResultReceiver(I)Z
    .registers 7

    const/16 v0, 0x82

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_8

    move v0, v1

    goto :goto_9

    :cond_8
    move v0, v2

    .line 1658
    :goto_9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 1660
    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iput v2, v4, Landroid/graphics/Rect;->top:I

    .line 1661
    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iput v3, v2, Landroid/graphics/Rect;->bottom:I

    if-eqz v0, :cond_3f

    .line 1664
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_3f

    sub-int/2addr v0, v1

    .line 1666
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1667
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 1668
    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, v2, Landroid/graphics/Rect;->bottom:I

    .line 1669
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 1672
    :cond_3f
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p0, p1, v0, v1}, Landroidx/core/widget/NestedScrollView;->write(III)Z

    move-result p0

    return p0
.end method

.method private MediaBrowserCompatItemReceiver()V
    .registers 2

    const/4 v0, -0x1

    .line 1049
    iput v0, p0, Landroidx/core/widget/NestedScrollView;->write:I

    const/4 v0, 0x0

    .line 1050
    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    .line 1052
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem()V

    .line 1053
    invoke-direct {p0, v0}, Landroidx/core/widget/NestedScrollView;->RatingCompat(I)V

    .line 1055
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 1056
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->onRelease()V

    return-void
.end method

.method private MediaBrowserCompatItemReceiver(I)Z
    .registers 11

    .line 1720
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-ne v0, p0, :cond_7

    const/4 v0, 0x0

    .line 1723
    :cond_7
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    .line 1725
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->MediaDescriptionCompat()I

    move-result v2

    if-eqz v1, :cond_36

    .line 1727
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {p0, v1, v2, v3}, Landroidx/core/widget/NestedScrollView;->read(Landroid/view/View;II)Z

    move-result v3

    if-eqz v3, :cond_36

    .line 1728
    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 1729
    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1730
    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-direct {p0, v2}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)I

    move-result v2

    .line 1732
    invoke-direct {p0, v2}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi21Parcelizer(I)I

    .line 1733
    invoke-virtual {v1, p1}, Landroid/view/View;->requestFocus(I)Z

    goto :goto_7d

    :cond_36
    const/16 v1, 0x21

    const/4 v3, 0x0

    const/16 v4, 0x82

    if-ne p1, v1, :cond_48

    .line 1739
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v2, :cond_48

    .line 1740
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    goto :goto_74

    :cond_48
    if-ne p1, v4, :cond_74

    .line 1742
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_74

    .line 1743
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1744
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 1745
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1746
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v8

    add-int/2addr v1, v5

    add-int/2addr v6, v7

    sub-int/2addr v6, v8

    sub-int/2addr v1, v6

    .line 1747
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_74
    :goto_74
    if-nez v2, :cond_77

    return v3

    :cond_77
    if-eq p1, v4, :cond_7a

    neg-int v2, v2

    .line 1755
    :cond_7a
    invoke-direct {p0, v2}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi21Parcelizer(I)I

    :goto_7d
    if-eqz v0, :cond_9a

    .line 1758
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_9a

    .line 1759
    invoke-direct {p0, v0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_9a

    .line 1765
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result p1

    const/high16 v0, 0x20000

    .line 1766
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 1767
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 1768
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :cond_9a
    const/4 p0, 0x1

    return p0
.end method

.method private MediaBrowserCompatMediaItem()V
    .registers 2

    .line 780
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_a

    .line 781
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 782
    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    :cond_a
    return-void
.end method

.method private MediaBrowserCompatMediaItem(I)Z
    .registers 6

    const/16 v0, 0x82

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_8

    move v0, v1

    goto :goto_9

    :cond_8
    move v0, v2

    .line 1620
    :goto_9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    if-eqz v0, :cond_42

    .line 1623
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    add-int/2addr v2, v3

    iput v2, v0, Landroid/graphics/Rect;->top:I

    .line 1624
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_55

    sub-int/2addr v0, v1

    .line 1626
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1627
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 1628
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    .line 1629
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v3

    if-le v1, v0, :cond_55

    .line 1630
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    sub-int/2addr v0, v3

    iput v0, v1, Landroid/graphics/Rect;->top:I

    goto :goto_55

    .line 1634
    :cond_42
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 1635
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    if-gez v0, :cond_55

    .line 1636
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iput v2, v0, Landroid/graphics/Rect;->top:I

    .line 1639
    :cond_55
    :goto_55
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 1641
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p0, p1, v0, v1}, Landroidx/core/widget/NestedScrollView;->write(III)Z

    move-result p0

    return p0
.end method

.method private MediaDescriptionCompat()I
    .registers 2

    .line 523
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method

.method private MediaDescriptionCompat(I)Z
    .registers 2

    .line 302
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    invoke-virtual {p0, p1}, Lo/rootObjectScope;->read(I)Z

    move-result p0

    return p0
.end method

.method private MediaMetadataCompat(I)V
    .registers 4

    const/4 v0, 0x0

    const/16 v1, 0xfa

    .line 1815
    invoke-direct {p0, v0, p1, v1, v0}, Landroidx/core/widget/NestedScrollView;->write(IIIZ)V

    return-void
.end method

.method private RatingCompat(I)V
    .registers 2

    .line 297
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    invoke-virtual {p0, p1}, Lo/rootObjectScope;->AudioAttributesCompatParcelizer(I)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(II[I)V
    .registers 14

    .line 382
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    const/4 v1, 0x0

    .line 383
    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollBy(II)V

    .line 384
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int v4, v1, v0

    if-eqz p3, :cond_16

    const/4 v0, 0x1

    .line 387
    aget v1, p3, v0

    add-int/2addr v1, v4

    aput v1, p3, v0

    .line 391
    :cond_16
    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    const/4 v3, 0x0

    const/4 v5, 0x0

    sub-int v6, p1, v4

    const/4 v7, 0x0

    move v8, p2

    move-object v9, p3

    invoke-virtual/range {v2 .. v9}, Lo/rootObjectScope;->IconCompatParcelizer(IIII[II[I)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 3

    .line 2115
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 2118
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2120
    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)I

    move-result p1

    if-eqz p1, :cond_16

    const/4 v0, 0x0

    .line 2123
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->scrollBy(II)V

    :cond_16
    return-void
.end method

.method private RemoteActionCompatParcelizer(II[I[II)Z
    .registers 12

    .line 320
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/rootObjectScope;->write(II[I[II)Z

    move-result p0

    return p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/View;)Z
    .registers 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 2357
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    .line 2358
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_15

    check-cast p0, Landroid/view/View;

    invoke-static {p0, p1}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_15

    return v0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method

.method private read(IILandroid/view/MotionEvent;IIZ)I
    .registers 25

    move-object/from16 v6, p0

    move/from16 v7, p2

    move/from16 v8, p4

    move/from16 v9, p5

    const/4 v10, 0x1

    if-ne v9, v10, :cond_f

    const/4 v0, 0x2

    .line 1117
    invoke-direct {v6, v0, v9}, Landroidx/core/widget/NestedScrollView;->write(II)Z

    :cond_f
    const/4 v1, 0x0

    .line 1123
    iget-object v3, v6, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    iget-object v4, v6, Landroidx/core/widget/NestedScrollView;->onPrepareFromMediaId:[I

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(II[I[II)Z

    move-result v0

    const/4 v11, 0x0

    if-eqz v0, :cond_2e

    .line 1132
    iget-object v0, v6, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    aget v0, v0, v10

    .line 1133
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->onPrepareFromMediaId:[I

    aget v1, v1, v10

    sub-int v0, p1, v0

    move v12, v0

    move v13, v1

    goto :goto_31

    :cond_2e
    move/from16 v12, p1

    move v13, v11

    .line 1138
    :goto_31
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v14

    .line 1139
    invoke-virtual/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result v15

    .line 1143
    invoke-direct/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_44

    if-nez p6, :cond_44

    move/from16 v16, v10

    goto :goto_46

    :cond_44
    move/from16 v16, v11

    .line 1147
    :goto_46
    invoke-direct {v6, v12, v11, v14, v15}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(IIII)Z

    move-result v0

    if-eqz v0, :cond_55

    .line 1157
    invoke-direct {v6, v9}, Landroidx/core/widget/NestedScrollView;->MediaDescriptionCompat(I)Z

    move-result v0

    if-nez v0, :cond_55

    move/from16 v17, v10

    goto :goto_57

    :cond_55
    move/from16 v17, v11

    .line 1160
    :goto_57
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int v1, v0, v14

    if-eqz p3, :cond_70

    if-eqz v1, :cond_70

    .line 1162
    invoke-direct/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer()Lo/IgnoredPropertyException;

    move-result-object v0

    .line 1163
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v2

    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    .line 1162
    invoke-virtual {v0, v2, v3, v7, v1}, Lo/IgnoredPropertyException;->IconCompatParcelizer(IIII)V

    .line 1168
    :cond_70
    iget-object v5, v6, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    aput v11, v5, v10

    sub-int v2, v12, v1

    .line 1171
    iget-object v3, v6, Landroidx/core/widget/NestedScrollView;->onPrepareFromMediaId:[I

    move-object/from16 v0, p0

    move/from16 v4, p5

    invoke-direct/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->write(II[II[I)V

    .line 1181
    iget-object v0, v6, Landroidx/core/widget/NestedScrollView;->onPrepareFromMediaId:[I

    aget v0, v0, v10

    .line 1184
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    aget v1, v1, v10

    sub-int/2addr v12, v1

    add-int/2addr v14, v12

    if-gez v14, :cond_c0

    if-eqz v16, :cond_f8

    .line 1189
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    neg-int v2, v12

    int-to-float v2, v2

    .line 1191
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    int-to-float v3, v8

    .line 1192
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 1189
    invoke-static {v1, v2, v3}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    if-eqz p3, :cond_b2

    .line 1195
    invoke-direct/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer()Lo/IgnoredPropertyException;

    move-result-object v1

    .line 1196
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v2

    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    .line 1195
    invoke-virtual {v1, v2, v3, v7, v10}, Lo/IgnoredPropertyException;->RemoteActionCompatParcelizer(IIIZ)V

    .line 1200
    :cond_b2
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_f8

    .line 1201
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_f8

    :cond_c0
    if-le v14, v15, :cond_f8

    if-eqz v16, :cond_f8

    .line 1207
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    int-to-float v2, v12

    .line 1209
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    int-to-float v3, v8

    .line 1210
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v4, v3

    .line 1207
    invoke-static {v1, v2, v4}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    if-eqz p3, :cond_eb

    .line 1213
    invoke-direct/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer()Lo/IgnoredPropertyException;

    move-result-object v1

    .line 1214
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v2

    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    .line 1213
    invoke-virtual {v1, v2, v3, v7, v11}, Lo/IgnoredPropertyException;->RemoteActionCompatParcelizer(IIIZ)V

    .line 1218
    :cond_eb
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_f8

    .line 1219
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 1224
    :cond_f8
    :goto_f8
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_115

    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_109

    goto :goto_115

    :cond_109
    if-eqz v17, :cond_118

    if-nez v9, :cond_118

    .line 1231
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_118

    .line 1232
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_118

    .line 1225
    :cond_115
    :goto_115
    invoke-virtual/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->postInvalidateOnAnimation()V

    :cond_118
    :goto_118
    if-ne v9, v10, :cond_127

    .line 1241
    invoke-direct {v6, v9}, Landroidx/core/widget/NestedScrollView;->RatingCompat(I)V

    .line 1244
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 1245
    iget-object v1, v6, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_127
    add-int/2addr v13, v0

    return v13
.end method

.method private read()Z
    .registers 5

    .line 590
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2d

    .line 591
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 592
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 593
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v3

    add-int/2addr v0, v2

    .line 594
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v2, p0

    if-le v0, v2, :cond_2d

    const/4 p0, 0x1

    return p0

    :cond_2d
    return v1
.end method

.method private read(Landroid/view/View;II)Z
    .registers 5

    .line 1786
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 1787
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1789
    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-lt p1, v0, :cond_23

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, p2

    .line 1790
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    add-int/2addr p0, p3

    if-gt p1, p0, :cond_23

    const/4 p0, 0x1

    return p0

    :cond_23
    const/4 p0, 0x0

    return p0
.end method

.method private read(Landroid/widget/EdgeEffect;I)Z
    .registers 5

    const/4 v0, 0x1

    if-lez p2, :cond_4

    return v0

    .line 1264
    :cond_4
    invoke-static {p1}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    neg-int p2, p2

    .line 1267
    invoke-direct {p0, p2}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer(I)F

    move-result p0

    mul-float/2addr p1, v1

    cmpg-float p0, p0, p1

    if-gez p0, :cond_18

    return v0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method private write(IF)I
    .registers 6

    .line 2073
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    int-to-float p1, p1

    .line 2074
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 2075
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_30

    .line 2076
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    neg-float p1, p1

    invoke-static {v0, p1, p2}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    neg-float p1, p1

    .line 2077
    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-static {p2}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p2

    cmpl-float p2, p2, v1

    if-nez p2, :cond_52

    .line 2078
    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_52

    .line 2080
    :cond_30
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_53

    .line 2081
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, p2

    invoke-static {v0, p1, v2}, Lo/memberMethods;->read(Landroid/widget/EdgeEffect;FF)F

    move-result p1

    .line 2083
    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-static {p2}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result p2

    cmpl-float p2, p2, v1

    if-nez p2, :cond_52

    .line 2084
    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_52
    :goto_52
    move v1, p1

    .line 2087
    :cond_53
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result p1

    if-eqz p1, :cond_62

    .line 2089
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_62
    return p1
.end method

.method private write(ZII)Landroid/view/View;
    .registers 15

    const/4 v0, 0x2

    .line 1542
    invoke-virtual {p0, v0}, Landroid/view/View;->getFocusables(I)Ljava/util/ArrayList;

    move-result-object p0

    .line 1554
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_d
    if-ge v3, v0, :cond_53

    .line 1556
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 1557
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v6

    .line 1558
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v7

    if-ge p2, v7, :cond_50

    if-ge v6, p3, :cond_50

    const/4 v8, 0x1

    if-ge p2, v6, :cond_28

    if-ge v7, p3, :cond_28

    move v9, v8

    goto :goto_29

    :cond_28
    move v9, v2

    :goto_29
    if-nez v1, :cond_2e

    move-object v1, v5

    move v4, v9

    goto :goto_50

    :cond_2e
    if-eqz p1, :cond_36

    .line 1574
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v10

    if-lt v6, v10, :cond_3e

    :cond_36
    if-nez p1, :cond_40

    .line 1575
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v6

    if-le v7, v6, :cond_40

    :cond_3e
    move v6, v8

    goto :goto_41

    :cond_40
    move v6, v2

    :goto_41
    if-eqz v4, :cond_48

    if-eqz v9, :cond_50

    if-eqz v6, :cond_50

    goto :goto_4f

    :cond_48
    if-eqz v9, :cond_4d

    move-object v1, v5

    move v4, v8

    goto :goto_50

    :cond_4d
    if-eqz v6, :cond_50

    :goto_4f
    move-object v1, v5

    :cond_50
    :goto_50
    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_53
    return-object v1
.end method

.method private write(IIIZ)V
    .registers 16

    .line 1838
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-nez p3, :cond_7

    return-void

    .line 1842
    :cond_7
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/core/widget/NestedScrollView;->onCustomAction:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xfa

    cmp-long p3, v0, v2

    if-lez p3, :cond_5b

    const/4 p1, 0x0

    .line 1844
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    .line 1845
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 1846
    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1847
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    .line 1848
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v7

    add-int/2addr p3, v1

    add-int/2addr p3, v0

    sub-int/2addr v2, v3

    sub-int/2addr v2, v4

    sub-int/2addr p3, v2

    .line 1849
    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    add-int/2addr p2, v7

    .line 1850
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 1851
    iget-object v5, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v6

    const/4 v8, 0x0

    sub-int v9, p1, v7

    const/16 v10, 0xfa

    invoke-virtual/range {v5 .. v10}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 1852
    invoke-direct {p0, p4}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Z)V

    goto :goto_69

    .line 1854
    :cond_5b
    iget-object p3, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {p3}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p3

    if-nez p3, :cond_66

    .line 1855
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer()V

    .line 1857
    :cond_66
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollBy(II)V

    .line 1859
    :goto_69
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/core/widget/NestedScrollView;->onCustomAction:J

    return-void
.end method

.method private write(IIZ)V
    .registers 5

    .line 1906
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    rsub-int/lit8 p1, p1, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int/2addr p2, v0

    const/16 v0, 0xfa

    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/core/widget/NestedScrollView;->write(IIIZ)V

    return-void
.end method

.method private write(II[II[I)V
    .registers 14

    .line 284
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    const/4 v1, 0x0

    const/4 v3, 0x0

    move v2, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    move-object v7, p5

    invoke-virtual/range {v0 .. v7}, Lo/rootObjectScope;->IconCompatParcelizer(IIII[II[I)V

    return-void
.end method

.method private write(Landroid/view/MotionEvent;)V
    .registers 5

    .line 1362
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 1363
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 1364
    iget v2, p0, Landroidx/core/widget/NestedScrollView;->write:I

    if-ne v1, v2, :cond_25

    if-nez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    .line 1369
    :goto_11
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    .line 1370
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->write:I

    .line 1371
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    if-eqz p0, :cond_25

    .line 1372
    invoke-virtual {p0}, Landroid/view/VelocityTracker;->clear()V

    :cond_25
    return-void
.end method

.method private write(I)Z
    .registers 5

    .line 1319
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v2, 0x1

    if-eqz v0, :cond_1f

    .line 1320
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-direct {p0, v0, p1}, Landroidx/core/widget/NestedScrollView;->read(Landroid/widget/EdgeEffect;I)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1321
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    return v2

    :cond_1a
    neg-int p1, p1

    .line 1323
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(I)V

    return v2

    .line 1325
    :cond_1f
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-static {v0}, Lo/memberMethods;->write(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3c

    .line 1326
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    neg-int p1, p1

    invoke-direct {p0, v0, p1}, Landroidx/core/widget/NestedScrollView;->read(Landroid/widget/EdgeEffect;I)Z

    move-result v0

    if-eqz v0, :cond_38

    .line 1327
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    return v2

    .line 1329
    :cond_38
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(I)V

    return v2

    :cond_3c
    const/4 p0, 0x0

    return p0
.end method

.method private write(II)Z
    .registers 3

    .line 292
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    invoke-virtual {p0, p1, p2}, Lo/rootObjectScope;->read(II)Z

    move-result p0

    return p0
.end method

.method private write(III)Z
    .registers 10

    .line 1690
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 1691
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v2, 0x21

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne p1, v2, :cond_11

    move v2, v3

    goto :goto_12

    :cond_11
    move v2, v4

    .line 1695
    :goto_12
    invoke-direct {p0, v2, p2, p3}, Landroidx/core/widget/NestedScrollView;->write(ZII)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_19

    move-object v5, p0

    :cond_19
    if-lt p2, v1, :cond_1f

    if-gt p3, v0, :cond_1f

    move v3, v4

    goto :goto_28

    :cond_1f
    if-eqz v2, :cond_23

    sub-int/2addr p2, v1

    goto :goto_25

    :cond_23
    sub-int p2, p3, v0

    .line 1704
    :goto_25
    invoke-direct {p0, p2}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi21Parcelizer(I)I

    .line 1707
    :goto_28
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p0

    if-eq v5, p0, :cond_31

    invoke-virtual {v5, p1}, Landroid/view/View;->requestFocus(I)Z

    :cond_31
    return v3
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(I)V
    .registers 14

    .line 2369
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_35

    .line 2371
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v5, p1

    invoke-virtual/range {v1 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    const/4 p1, 0x1

    .line 2376
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Z)V

    .line 2377
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x23

    if-lt p1, v0, :cond_35

    .line 2378
    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    .line 2379
    invoke-virtual {p1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 2378
    invoke-static {p0, p1}, Landroidx/core/widget/NestedScrollView$RemoteActionCompatParcelizer;->write(Landroid/view/View;F)V

    :cond_35
    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroid/view/View;IIIII)V
    .registers 7

    const/4 p1, 0x0

    .line 418
    invoke-direct {p0, p5, p6, p1}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(II[I)V

    return-void
.end method

.method public IconCompatParcelizer(Landroid/view/View;Landroid/view/View;II)Z
    .registers 5

    and-int/lit8 p0, p3, 0x2

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method final RemoteActionCompatParcelizer()F
    .registers 6

    .line 1432
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->onSeekTo:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_35

    .line 1433
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 1434
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 1435
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x101004d

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_2d

    .line 1441
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 1440
    invoke-virtual {v0, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->onSeekTo:F

    goto :goto_35

    .line 1437
    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Expected theme to define listPreferredItemHeight."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1443
    :cond_35
    :goto_35
    iget p0, p0, Landroidx/core/widget/NestedScrollView;->onSeekTo:F

    return p0
.end method

.method final RemoteActionCompatParcelizer(I)V
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1893
    invoke-direct {p0, v0, p1, v1}, Landroidx/core/widget/NestedScrollView;->write(IIZ)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;I)V
    .registers 3

    .line 411
    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onFastForward:Lo/rootArrayScope;

    invoke-virtual {p1, p2}, Lo/rootArrayScope;->read(I)V

    .line 412
    invoke-direct {p0, p2}, Landroidx/core/widget/NestedScrollView;->RatingCompat(I)V

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;II[II)V
    .registers 12

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v5, p5

    .line 424
    invoke-direct/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(II[I[II)Z

    return-void
.end method

.method public addView(Landroid/view/View;)V
    .registers 3

    .line 539
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_a

    .line 543
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void

    .line 540
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ScrollView can host only one direct child"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public addView(Landroid/view/View;I)V
    .registers 4

    .line 548
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_a

    .line 552
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    return-void

    .line 549
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ScrollView can host only one direct child"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 5

    .line 566
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_a

    .line 570
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 567
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ScrollView can host only one direct child"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    .line 557
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_a

    .line 561
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 558
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ScrollView can host only one direct child"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public computeHorizontalScrollExtent()I
    .registers 1

    .line 1963
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollExtent()I

    move-result p0

    return p0
.end method

.method public computeHorizontalScrollOffset()I
    .registers 1

    .line 1957
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollOffset()I

    move-result p0

    return p0
.end method

.method public computeHorizontalScrollRange()I
    .registers 1

    .line 1951
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollRange()I

    move-result p0

    return p0
.end method

.method public computeScroll()V
    .registers 16

    .line 1999
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_9

    return-void

    .line 2003
    :cond_9
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 2004
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    .line 2005
    iget v1, p0, Landroidx/core/widget/NestedScrollView;->onCommand:I

    sub-int v1, v0, v1

    invoke-direct {p0, v1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer(I)I

    move-result v1

    .line 2006
    iput v0, p0, Landroidx/core/widget/NestedScrollView;->onCommand:I

    .line 2009
    iget-object v5, p0, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    const/4 v0, 0x1

    const/4 v8, 0x0

    aput v8, v5, v0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, p0

    move v4, v1

    .line 2010
    invoke-direct/range {v2 .. v7}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(II[I[II)Z

    .line 2012
    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    aget v2, v2, v0

    sub-int/2addr v1, v2

    .line 2014
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result v2

    .line 2016
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x23

    if-lt v3, v4, :cond_48

    .line 2017
    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    .line 2018
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 2017
    invoke-static {p0, v3}, Landroidx/core/widget/NestedScrollView$RemoteActionCompatParcelizer;->write(Landroid/view/View;F)V

    :cond_48
    if-eqz v1, :cond_6d

    .line 2023
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    .line 2024
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    invoke-direct {p0, v1, v4, v3, v2}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(IIII)Z

    .line 2025
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    sub-int v10, v4, v3

    sub-int/2addr v1, v10

    .line 2029
    iget-object v14, p0, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    aput v8, v14, v0

    .line 2030
    iget-object v12, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromMediaId:[I

    const/4 v13, 0x1

    move-object v9, p0

    move v11, v1

    invoke-direct/range {v9 .. v14}, Landroidx/core/widget/NestedScrollView;->write(II[II[I)V

    .line 2032
    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->onPlay:[I

    aget v3, v3, v0

    sub-int/2addr v1, v3

    :cond_6d
    if-eqz v1, :cond_a7

    .line 2036
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getOverScrollMode()I

    move-result v3

    if-eqz v3, :cond_79

    if-ne v3, v0, :cond_a4

    if-lez v2, :cond_a4

    :cond_79
    if-gez v1, :cond_90

    .line 2041
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_a4

    .line 2042
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_a4

    .line 2045
    :cond_90
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_a4

    .line 2046
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 2050
    :cond_a4
    :goto_a4
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer()V

    .line 2053
    :cond_a7
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_b3

    .line 2054
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->postInvalidateOnAnimation()V

    return-void

    .line 2056
    :cond_b3
    invoke-direct {p0, v0}, Landroidx/core/widget/NestedScrollView;->RatingCompat(I)V

    return-void
.end method

.method public computeVerticalScrollExtent()I
    .registers 1

    .line 1945
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollExtent()I

    move-result p0

    return p0
.end method

.method public computeVerticalScrollOffset()I
    .registers 2

    const/4 v0, 0x0

    .line 1939
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollOffset()I

    move-result p0

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public computeVerticalScrollRange()I
    .registers 5

    .line 1916
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 1917
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_15

    return v1

    :cond_15
    const/4 v0, 0x0

    .line 1922
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1923
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1924
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    .line 1925
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    sub-int v1, v2, v1

    .line 1926
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-gez p0, :cond_35

    sub-int/2addr v2, p0

    return v2

    :cond_35
    if-le p0, v0, :cond_39

    sub-int/2addr p0, v0

    add-int/2addr v2, p0

    :cond_39
    return v2
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .registers 3

    .line 688
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->write(Landroid/view/KeyEvent;)Z

    move-result p0

    if-nez p0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method public dispatchNestedFling(FFZ)Z
    .registers 4

    .line 365
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    invoke-virtual {p0, p1, p2, p3}, Lo/rootObjectScope;->AudioAttributesCompatParcelizer(FFZ)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedPreFling(FF)Z
    .registers 3

    .line 370
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    invoke-virtual {p0, p1, p2}, Lo/rootObjectScope;->RemoteActionCompatParcelizer(FF)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 360
    invoke-direct/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(II[I[II)Z

    move-result p0

    return p0
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .registers 12

    .line 353
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/rootObjectScope;->RemoteActionCompatParcelizer(IIII[I)Z

    move-result p0

    return p0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 11

    .line 2409
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 2410
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    .line 2411
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_63

    .line 2412
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 2413
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 2414
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 2416
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 2418
    invoke-static {p0}, Landroidx/core/widget/NestedScrollView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;)Z

    move-result v6

    if-eqz v6, :cond_35

    .line 2419
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    add-int/2addr v6, v7

    sub-int/2addr v3, v6

    .line 2420
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    goto :goto_36

    :cond_35
    move v6, v2

    .line 2423
    :goto_36
    invoke-static {p0}, Landroidx/core/widget/NestedScrollView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;)Z

    move-result v7

    if-eqz v7, :cond_4b

    .line 2424
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v8

    add-int/2addr v7, v8

    sub-int/2addr v4, v7

    .line 2425
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v5, v7

    :cond_4b
    int-to-float v6, v6

    int-to-float v5, v5

    .line 2427
    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2428
    iget-object v5, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v5, v3, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 2429
    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver:Landroid/widget/EdgeEffect;

    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_60

    .line 2430
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->postInvalidateOnAnimation()V

    .line 2432
    :cond_60
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2434
    :cond_63
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_c9

    .line 2435
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    .line 2436
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 2437
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 2439
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result v5

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v4

    .line 2441
    invoke-static {p0}, Landroidx/core/widget/NestedScrollView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;)Z

    move-result v5

    if-eqz v5, :cond_94

    .line 2442
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    add-int/2addr v2, v5

    sub-int/2addr v3, v2

    .line 2443
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    .line 2446
    :cond_94
    invoke-static {p0}, Landroidx/core/widget/NestedScrollView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;)Z

    move-result v5

    if-eqz v5, :cond_a9

    .line 2447
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v5, v6

    sub-int/2addr v4, v5

    .line 2448
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v0, v5

    :cond_a9
    sub-int/2addr v2, v3

    int-to-float v2, v2

    int-to-float v0, v0

    .line 2450
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    int-to-float v0, v3

    const/high16 v2, 0x43340000    # 180.0f

    const/4 v5, 0x0

    .line 2451
    invoke-virtual {p1, v2, v0, v5}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 2452
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v3, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 2453
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplBaseParcelizer:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_c6

    .line 2454
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->postInvalidateOnAnimation()V

    .line 2456
    :cond_c6
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_c9
    return-void
.end method

.method protected getBottomFadingEdgeStrength()F
    .registers 6

    .line 502
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    const/4 v0, 0x0

    .line 506
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 507
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 508
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v2

    .line 509
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    .line 510
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    sub-int/2addr v0, p0

    sub-int/2addr v3, v4

    sub-int/2addr v0, v3

    if-ge v0, v2, :cond_33

    int-to-float p0, v0

    int-to-float v0, v2

    div-float/2addr p0, v0

    return p0

    :cond_33
    const/high16 p0, 0x3f800000    # 1.0f

    return p0
.end method

.method public getNestedScrollAxes()I
    .registers 1

    .line 475
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->onFastForward:Lo/rootArrayScope;

    invoke-virtual {p0}, Lo/rootArrayScope;->IconCompatParcelizer()I

    move-result p0

    return p0
.end method

.method protected getTopFadingEdgeStrength()F
    .registers 2

    .line 487
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    .line 491
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v0

    .line 492
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    if-ge p0, v0, :cond_16

    int-to-float p0, p0

    int-to-float v0, v0

    div-float/2addr p0, v0

    return p0

    :cond_16
    const/high16 p0, 0x3f800000    # 1.0f

    return p0
.end method

.method public hasNestedScrollingParent()Z
    .registers 2

    const/4 v0, 0x0

    .line 347
    invoke-direct {p0, v0}, Landroidx/core/widget/NestedScrollView;->MediaDescriptionCompat(I)Z

    move-result p0

    return p0
.end method

.method public isNestedScrollingEnabled()Z
    .registers 1

    .line 332
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    invoke-virtual {p0}, Lo/rootObjectScope;->read()Z

    move-result p0

    return p0
.end method

.method protected measureChild(Landroid/view/View;II)V
    .registers 5

    .line 1969
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    .line 1974
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 1975
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    iget p3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/2addr v0, p0

    .line 1974
    invoke-static {p2, v0, p3}, Landroidx/core/widget/NestedScrollView;->getChildMeasureSpec(III)I

    move-result p0

    const/4 p2, 0x0

    .line 1977
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 1979
    invoke-virtual {p1, p0, p2}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method protected measureChildWithMargins(Landroid/view/View;IIII)V
    .registers 9

    .line 1985
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1988
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v2, p4, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/2addr p5, p0

    add-int/2addr p5, v0

    add-int/2addr p5, v1

    add-int/2addr p5, p3

    .line 1987
    invoke-static {p2, p5, v2}, Landroidx/core/widget/NestedScrollView;->getChildMeasureSpec(III)I

    move-result p0

    .line 1990
    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p2, p3

    const/4 p3, 0x0

    invoke-static {p2, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 1993
    invoke-virtual {p1, p0, p2}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public onAttachedToWindow()V
    .registers 2

    .line 2324
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x0

    .line 2326
    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .registers 14

    .line 1379
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne v0, v1, :cond_5c

    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    if-nez v0, :cond_5c

    const/4 v0, 0x2

    .line 1384
    invoke-static {p1, v0}, Lo/emptyList;->IconCompatParcelizer(Landroid/view/MotionEvent;I)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_22

    const/16 v0, 0x9

    .line 1385
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    .line 1386
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    move v9, v4

    goto :goto_3d

    :cond_22
    const/high16 v1, 0x400000

    .line 1389
    invoke-static {p1, v1}, Lo/emptyList;->IconCompatParcelizer(Landroid/view/MotionEvent;I)Z

    move-result v1

    if-eqz v1, :cond_3a

    const/16 v1, 0x1a

    .line 1391
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v4

    .line 1394
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    div-int/lit8 v0, v5, 0x2

    move v9, v0

    move v0, v1

    move v1, v4

    goto :goto_3d

    :cond_3a
    move v0, v2

    move v9, v0

    move v1, v3

    :goto_3d
    cmpl-float v3, v1, v3

    if-eqz v3, :cond_5c

    .line 1404
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer()F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    const/16 v2, 0x2002

    .line 1407
    invoke-static {p1, v2}, Lo/emptyList;->IconCompatParcelizer(Landroid/view/MotionEvent;I)Z

    move-result v11

    neg-int v6, v1

    const/4 v10, 0x1

    move-object v5, p0

    move v7, v0

    move-object v8, p1

    .line 1409
    invoke-direct/range {v5 .. v11}, Landroidx/core/widget/NestedScrollView;->read(IILandroid/view/MotionEvent;IIZ)I

    .line 1412
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi21Parcelizer:Lo/byteFromChars;

    invoke-virtual {p0, p1, v0}, Lo/byteFromChars;->RemoteActionCompatParcelizer(Landroid/view/MotionEvent;I)V

    const/4 p0, 0x1

    return p0

    :cond_5c
    return v2
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 13

    .line 807
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_d

    .line 808
    iget-boolean v3, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    if-eqz v3, :cond_d

    return v1

    :cond_d
    and-int/lit16 v0, v0, 0xff

    const/4 v3, 0x0

    if-eqz v0, :cond_84

    const/4 v4, -0x1

    if-eq v0, v1, :cond_5f

    if-eq v0, v2, :cond_22

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5f

    const/4 v1, 0x6

    if-ne v0, v1, :cond_d4

    .line 895
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->write(Landroid/view/MotionEvent;)V

    goto/16 :goto_d4

    .line 823
    :cond_22
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->write:I

    if-eq v0, v4, :cond_d4

    .line 829
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ne v0, v4, :cond_2e

    goto/16 :goto_d4

    .line 836
    :cond_2e
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    .line 837
    iget v4, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    sub-int v4, v0, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 838
    iget v5, p0, Landroidx/core/widget/NestedScrollView;->onRewind:I

    if-le v4, v5, :cond_d4

    .line 839
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getNestedScrollAxes()I

    move-result v4

    and-int/2addr v2, v4

    if-nez v2, :cond_d4

    .line 840
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    .line 841
    iput v0, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    .line 842
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi21Parcelizer()V

    .line 843
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 844
    iput v3, p0, Landroidx/core/widget/NestedScrollView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 845
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_d4

    .line 847
    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_d4

    .line 886
    :cond_5f
    iput-boolean v3, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    .line 887
    iput v4, p0, Landroidx/core/widget/NestedScrollView;->write:I

    .line 888
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem()V

    .line 889
    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result v10

    invoke-virtual/range {v4 .. v10}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result p1

    if-eqz p1, :cond_80

    .line 890
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->postInvalidateOnAnimation()V

    .line 892
    :cond_80
    invoke-direct {p0, v3}, Landroidx/core/widget/NestedScrollView;->RatingCompat(I)V

    goto :goto_d4

    .line 854
    :cond_84
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    .line 855
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-direct {p0, v4, v0}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(II)Z

    move-result v4

    if-nez v4, :cond_aa

    .line 856
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_a4

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_a3

    goto :goto_a4

    :cond_a3
    move v1, v3

    :cond_a4
    :goto_a4
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    .line 857
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem()V

    goto :goto_d4

    .line 865
    :cond_aa
    iput v0, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    .line 866
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->write:I

    .line 868
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 869
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 877
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 878
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_cf

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_ce

    goto :goto_cf

    :cond_ce
    move v1, v3

    :cond_cf
    :goto_cf
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    .line 879
    invoke-direct {p0, v2, v3}, Landroidx/core/widget/NestedScrollView;->write(II)Z

    .line 903
    :cond_d4
    :goto_d4
    iget-boolean p0, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    return p0
.end method

.method protected onLayout(ZIIII)V
    .registers 7

    .line 2286
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    const/4 p1, 0x0

    .line 2287
    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->MediaDescriptionCompat:Z

    .line 2289
    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    if-eqz p2, :cond_15

    invoke-static {p2, p0}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_15

    .line 2290
    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    invoke-direct {p0, p2}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    :cond_15
    const/4 p2, 0x0

    .line 2292
    iput-object p2, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    .line 2294
    iget-boolean p4, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatSearchResultReceiver:Z

    if-nez p4, :cond_63

    .line 2296
    iget-object p4, p0, Landroidx/core/widget/NestedScrollView;->onPause:Landroidx/core/widget/NestedScrollView$SavedState;

    if-eqz p4, :cond_2d

    .line 2297
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p4

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPause:Landroidx/core/widget/NestedScrollView$SavedState;

    iget v0, v0, Landroidx/core/widget/NestedScrollView$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p0, p4, v0}, Landroid/view/View;->scrollTo(II)V

    .line 2298
    iput-object p2, p0, Landroidx/core/widget/NestedScrollView;->onPause:Landroidx/core/widget/NestedScrollView$SavedState;

    .line 2304
    :cond_2d
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_47

    .line 2305
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    .line 2306
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 2307
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget p4, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, p4

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, p2

    .line 2309
    :cond_47
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p4

    .line 2310
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int/2addr p5, p3

    sub-int/2addr p5, p2

    sub-int/2addr p5, p4

    .line 2311
    invoke-static {v0, p5, p1}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(III)I

    move-result p1

    if-eq p1, v0, :cond_63

    .line 2313
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p2

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollTo(II)V

    .line 2318
    :cond_63
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    const/4 p1, 0x1

    .line 2319
    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method protected onMeasure(II)V
    .registers 8

    .line 652
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 654
    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_56

    .line 658
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    if-eqz p2, :cond_56

    .line 663
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_56

    const/4 p2, 0x0

    .line 664
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    .line 665
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 667
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 668
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 669
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    .line 670
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v2, v3

    if-ge v1, v2, :cond_56

    .line 676
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    add-int/2addr v1, p0

    add-int/2addr v1, v3

    add-int/2addr v1, v4

    .line 675
    invoke-static {p1, v1, v0}, Landroidx/core/widget/NestedScrollView;->getChildMeasureSpec(III)I

    move-result p0

    const/high16 p1, 0x40000000    # 2.0f

    .line 679
    invoke-static {v2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 680
    invoke-virtual {p2, p0, p1}, Landroid/view/View;->measure(II)V

    :cond_56
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 5

    if-nez p4, :cond_c

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 461
    invoke-virtual {p0, p1, p3, p2}, Landroidx/core/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z

    float-to-int p1, p3

    .line 462
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(I)V

    return p2

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 4

    .line 470
    invoke-virtual {p0, p2, p3}, Landroidx/core/widget/NestedScrollView;->dispatchNestedPreFling(FF)Z

    move-result p0

    return p0
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 454
    invoke-virtual/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(Landroid/view/View;II[II)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .registers 6

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 449
    invoke-direct {p0, p5, p1, p2}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(II[I)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .registers 5

    const/4 v0, 0x0

    .line 438
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/core/widget/NestedScrollView;->read(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method protected onOverScrolled(IIZZ)V
    .registers 5

    .line 1449
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V

    return-void
.end method

.method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .registers 5

    const/4 v0, 0x2

    if-ne p1, v0, :cond_6

    const/16 p1, 0x82

    goto :goto_b

    :cond_6
    const/4 v0, 0x1

    if-ne p1, v0, :cond_b

    const/16 p1, 0x21

    :cond_b
    :goto_b
    if-nez p2, :cond_17

    .line 2253
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_1f

    .line 2254
    :cond_17
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p2, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v0

    :goto_1f
    const/4 v1, 0x0

    if-nez v0, :cond_23

    return v1

    .line 2261
    :cond_23
    invoke-direct {p0, v0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_2a

    return v1

    .line 2265
    :cond_2a
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p0

    return p0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    .line 2492
    instance-of v0, p1, Landroidx/core/widget/NestedScrollView$SavedState;

    if-nez v0, :cond_8

    .line 2493
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 2497
    :cond_8
    check-cast p1, Landroidx/core/widget/NestedScrollView$SavedState;

    .line 2498
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 2499
    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPause:Landroidx/core/widget/NestedScrollView$SavedState;

    .line 2500
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    .line 2505
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2506
    new-instance v1, Landroidx/core/widget/NestedScrollView$SavedState;

    invoke-direct {v1, v0}, Landroidx/core/widget/NestedScrollView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 2507
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    iput p0, v1, Landroidx/core/widget/NestedScrollView$SavedState;->AudioAttributesCompatParcelizer:I

    return-object v1
.end method

.method public onScrollChanged(IIII)V
    .registers 11

    .line 643
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onScrollChanged(IIII)V

    .line 645
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onMediaButtonEvent:Landroidx/core/widget/NestedScrollView$write;

    if-eqz v0, :cond_f

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    .line 646
    invoke-interface/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView$write;->read(Landroidx/core/widget/NestedScrollView;IIII)V

    :cond_f
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .registers 5

    .line 2331
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 2333
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_25

    if-eq p0, p1, :cond_25

    const/4 p2, 0x0

    .line 2341
    invoke-direct {p0, p1, p2, p4}, Landroidx/core/widget/NestedScrollView;->read(Landroid/view/View;II)Z

    move-result p2

    if-eqz p2, :cond_25

    .line 2342
    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p1, p2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 2343
    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2344
    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)I

    move-result p1

    .line 2345
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(I)V

    :cond_25
    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .registers 5

    const/4 v0, 0x0

    .line 432
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(Landroid/view/View;Landroid/view/View;II)Z

    move-result p0

    return p0
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .registers 3

    const/4 v0, 0x0

    .line 443
    invoke-virtual {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 14

    .line 908
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi21Parcelizer()V

    .line 910
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_c

    .line 913
    iput v1, p0, Landroidx/core/widget/NestedScrollView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    .line 916
    :cond_c
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v2

    .line 917
    iget v3, p0, Landroidx/core/widget/NestedScrollView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/4 v3, 0x1

    if-eqz v0, :cond_11d

    if-eq v0, v3, :cond_d1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_78

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4f

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3c

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2a

    goto/16 :goto_148

    .line 1025
    :cond_2a
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->write(Landroid/view/MotionEvent;)V

    .line 1026
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->write:I

    .line 1027
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    goto/16 :goto_148

    .line 1018
    :cond_3c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 1019
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    .line 1020
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->write:I

    goto/16 :goto_148

    .line 1007
    :cond_4f
    iget-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    if-eqz p1, :cond_73

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-lez p1, :cond_73

    .line 1008
    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    .line 1009
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result v10

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 1008
    invoke-virtual/range {v4 .. v10}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result p1

    if-eqz p1, :cond_73

    .line 1010
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->postInvalidateOnAnimation()V

    .line 1013
    :cond_73
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver()V

    goto/16 :goto_148

    .line 951
    :cond_78
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->write:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_83

    goto/16 :goto_148

    .line 957
    :cond_83
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    .line 958
    iget v4, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    sub-int/2addr v4, v1

    .line 959
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    invoke-direct {p0, v4, v5}, Landroidx/core/widget/NestedScrollView;->write(IF)I

    move-result v5

    sub-int/2addr v4, v5

    .line 963
    iget-boolean v5, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    if-nez v5, :cond_b4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v5

    iget v6, p0, Landroidx/core/widget/NestedScrollView;->onRewind:I

    if-le v5, v6, :cond_b4

    .line 964
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    if-eqz v5, :cond_a9

    .line 966
    invoke-interface {v5, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 968
    :cond_a9
    iput-boolean v3, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    if-lez v4, :cond_b1

    .line 970
    iget v5, p0, Landroidx/core/widget/NestedScrollView;->onRewind:I

    sub-int/2addr v4, v5

    goto :goto_b4

    .line 972
    :cond_b1
    iget v5, p0, Landroidx/core/widget/NestedScrollView;->onRewind:I

    add-int/2addr v4, v5

    :cond_b4
    :goto_b4
    move v6, v4

    .line 976
    iget-boolean v4, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    if-eqz v4, :cond_148

    .line 977
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    float-to-int v9, v0

    const/4 v7, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v5, p0

    move-object v8, p1

    .line 979
    invoke-direct/range {v5 .. v11}, Landroidx/core/widget/NestedScrollView;->read(IILandroid/view/MotionEvent;IIZ)I

    move-result p1

    sub-int/2addr v1, p1

    .line 982
    iput v1, p0, Landroidx/core/widget/NestedScrollView;->MediaMetadataCompat:I

    .line 983
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    goto/16 :goto_148

    .line 989
    :cond_d1
    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    .line 990
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->handleMediaPlayPauseIfPendingOnHandler:I

    int-to-float v0, v0

    const/16 v1, 0x3e8

    invoke-virtual {p1, v1, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 991
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->write:I

    invoke-virtual {p1, v0}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result p1

    float-to-int p1, p1

    .line 992
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Landroidx/core/widget/NestedScrollView;->onAddQueueItem:I

    if-lt v0, v1, :cond_ff

    .line 993
    invoke-direct {p0, p1}, Landroidx/core/widget/NestedScrollView;->write(I)Z

    move-result v0

    if-nez v0, :cond_119

    neg-int p1, p1

    int-to-float v0, p1

    .line 994
    invoke-virtual {p0, v4, v0}, Landroidx/core/widget/NestedScrollView;->dispatchNestedPreFling(FF)Z

    move-result v1

    if-nez v1, :cond_119

    .line 995
    invoke-virtual {p0, v4, v0, v3}, Landroidx/core/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z

    .line 996
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(I)V

    goto :goto_119

    .line 998
    :cond_ff
    iget-object v5, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v7

    .line 999
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 998
    invoke-virtual/range {v5 .. v11}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result p1

    if-eqz p1, :cond_119

    .line 1000
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->postInvalidateOnAnimation()V

    .line 1002
    :cond_119
    :goto_119
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver()V

    goto :goto_148

    .line 921
    :cond_11d
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_124

    return v1

    .line 927
    :cond_124
    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->RatingCompat:Z

    if-eqz v0, :cond_131

    .line 928
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_131

    .line 930
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 938
    :cond_131
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromSearch:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_13c

    .line 939
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer()V

    .line 943
    :cond_13c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    .line 944
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    .line 942
    invoke-direct {p0, v0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(II)V

    .line 1032
    :cond_148
    :goto_148
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->onPrepareFromUri:Landroid/view/VelocityTracker;

    if-eqz p0, :cond_14f

    .line 1033
    invoke-virtual {p0, v2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1036
    :cond_14f
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    return v3
.end method

.method public final read(I)V
    .registers 3

    const/4 v0, 0x0

    .line 1869
    invoke-direct {p0, v0, p1, v0}, Landroidx/core/widget/NestedScrollView;->write(IIZ)V

    return-void
.end method

.method public read(Landroid/view/View;IIIII[I)V
    .registers 8

    .line 378
    invoke-direct {p0, p5, p6, p7}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(II[I)V

    return-void
.end method

.method public read(Landroid/view/View;Landroid/view/View;II)V
    .registers 5

    .line 405
    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->onFastForward:Lo/rootArrayScope;

    invoke-virtual {p1, p3, p4}, Lo/rootArrayScope;->write(II)V

    const/4 p1, 0x2

    .line 406
    invoke-direct {p0, p1, p4}, Landroidx/core/widget/NestedScrollView;->write(II)Z

    return-void
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .registers 4

    .line 2223
    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->MediaDescriptionCompat:Z

    if-nez v0, :cond_8

    .line 2224
    invoke-direct {p0, p2}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    goto :goto_a

    .line 2227
    :cond_8
    iput-object p2, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    .line 2229
    :goto_a
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .registers 7

    .line 2272
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    .line 2273
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    sub-int/2addr v0, v1

    sub-int/2addr v2, p1

    .line 2272
    invoke-virtual {p2, v0, v2}, Landroid/graphics/Rect;->offset(II)V

    .line 2275
    invoke-direct {p0, p2, p3}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(Landroid/graphics/Rect;Z)Z

    move-result p0

    return p0
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .registers 2

    if-eqz p1, :cond_5

    .line 789
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem()V

    .line 791
    :cond_5
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public requestLayout()V
    .registers 2

    const/4 v0, 0x1

    .line 2280
    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->MediaDescriptionCompat:Z

    .line 2281
    invoke-super {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public scrollTo(II)V
    .registers 15

    .line 2392
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_58

    const/4 v0, 0x0

    .line 2393
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2394
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 2395
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    .line 2396
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 2397
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v9

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v10

    .line 2398
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v11, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v2, v3

    sub-int/2addr v2, v4

    add-int/2addr v5, v6

    add-int/2addr v5, v7

    .line 2399
    invoke-static {p1, v2, v5}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(III)I

    move-result p1

    sub-int/2addr v8, v9

    sub-int/2addr v8, v10

    add-int/2addr v0, v11

    add-int/2addr v0, v1

    .line 2400
    invoke-static {p2, v8, v0}, Landroidx/core/widget/NestedScrollView;->IconCompatParcelizer(III)I

    move-result p2

    .line 2401
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    if-ne p1, v0, :cond_55

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-eq p2, v0, :cond_58

    .line 2402
    :cond_55
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V

    :cond_58
    return-void
.end method

.method public setFillViewport(Z)V
    .registers 3

    .line 620
    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem:Z

    if-eq p1, v0, :cond_9

    .line 621
    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem:Z

    .line 622
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_9
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .registers 2

    .line 327
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->AudioAttributesImplApi26Parcelizer:Lo/rootObjectScope;

    invoke-virtual {p0, p1}, Lo/rootObjectScope;->write(Z)V

    return-void
.end method

.method public setOnScrollChangeListener(Landroidx/core/widget/NestedScrollView$write;)V
    .registers 2

    .line 583
    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->onMediaButtonEvent:Landroidx/core/widget/NestedScrollView$write;

    return-void
.end method

.method public setSmoothScrollingEnabled(Z)V
    .registers 2

    .line 638
    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->onPlayFromUri:Z

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public startNestedScroll(I)Z
    .registers 3

    const/4 v0, 0x0

    .line 337
    invoke-direct {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->write(II)Z

    move-result p0

    return p0
.end method

.method public stopNestedScroll()V
    .registers 2

    const/4 v0, 0x0

    .line 342
    invoke-direct {p0, v0}, Landroidx/core/widget/NestedScrollView;->RatingCompat(I)V

    return-void
.end method

.method final write()I
    .registers 7

    .line 1515
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_2f

    .line 1516
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1517
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 1518
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1519
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    add-int/2addr v0, v3

    add-int/2addr v0, v2

    sub-int/2addr v4, v5

    sub-int/2addr v4, p0

    sub-int/2addr v0, v4

    .line 1520
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    :cond_2f
    return v1
.end method

.method public final write(Landroid/view/KeyEvent;)Z
    .registers 7

    .line 700
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->onPrepare:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 702
    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->read()Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x82

    if-nez v0, :cond_37

    .line 703
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_36

    .line 704
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-ne p1, p0, :cond_22

    const/4 p1, 0x0

    .line 706
    :cond_22
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p1, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_36

    if-eq p1, p0, :cond_36

    .line 710
    invoke-virtual {p1, v2}, Landroid/view/View;->requestFocus(I)Z

    move-result p0

    if-eqz p0, :cond_36

    const/4 p0, 0x1

    return p0

    :cond_36
    return v1

    .line 716
    :cond_37
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_9c

    .line 717
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v3, 0x13

    const/16 v4, 0x21

    if-eq v0, v3, :cond_8c

    const/16 v3, 0x14

    if-eq v0, v3, :cond_7c

    const/16 v3, 0x3e

    if-eq v0, v3, :cond_71

    const/16 p1, 0x5c

    if-eq v0, p1, :cond_6c

    const/16 p1, 0x5d

    if-eq v0, p1, :cond_67

    const/16 p1, 0x7a

    if-eq v0, p1, :cond_63

    const/16 p1, 0x7b

    if-ne v0, p1, :cond_9c

    .line 745
    invoke-direct {p0, v2}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem(I)Z

    return v1

    .line 742
    :cond_63
    invoke-direct {p0, v4}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem(I)Z

    return v1

    .line 736
    :cond_67
    invoke-direct {p0, v2}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver(I)Z

    move-result p0

    return p0

    .line 733
    :cond_6c
    invoke-direct {p0, v4}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver(I)Z

    move-result p0

    return p0

    .line 739
    :cond_71
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p1

    if-eqz p1, :cond_78

    move v2, v4

    :cond_78
    invoke-direct {p0, v2}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatMediaItem(I)Z

    return v1

    .line 726
    :cond_7c
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    if-eqz p1, :cond_87

    .line 727
    invoke-direct {p0, v2}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver(I)Z

    move-result p0

    return p0

    .line 729
    :cond_87
    invoke-direct {p0, v2}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver(I)Z

    move-result p0

    return p0

    .line 719
    :cond_8c
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    if-eqz p1, :cond_97

    .line 720
    invoke-direct {p0, v4}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatCustomActionResultReceiver(I)Z

    move-result p0

    return p0

    .line 722
    :cond_97
    invoke-direct {p0, v4}, Landroidx/core/widget/NestedScrollView;->MediaBrowserCompatItemReceiver(I)Z

    move-result p0

    return p0

    :cond_9c
    return v1
.end method

###### Class androidx.core.widget.NestedScrollView.AudioAttributesCompatParcelizer (androidx.core.widget.NestedScrollView$AudioAttributesCompatParcelizer)
.class Landroidx/core/widget/NestedScrollView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/widget/NestedScrollView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;)Z
    .registers 1

    .line 2670
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result p0

    return p0
.end method

###### Class androidx.core.widget.NestedScrollView.IconCompatParcelizer (androidx.core.widget.NestedScrollView$IconCompatParcelizer)
.class final Landroidx/core/widget/NestedScrollView$IconCompatParcelizer;
.super Lo/deserializeUsingCustom;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/widget/NestedScrollView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2550
    invoke-direct {p0}, Lo/deserializeUsingCustom;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 2622
    invoke-super {p0, p1, p2}, Lo/deserializeUsingCustom;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2623
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 2624
    const-class p0, Landroid/widget/ScrollView;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 2625
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result p0

    if-lez p0, :cond_16

    const/4 p0, 0x1

    goto :goto_17

    :cond_16
    const/4 p0, 0x0

    .line 2626
    :goto_17
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    .line 2627
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p0

    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollX(I)V

    .line 2628
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p0

    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollY(I)V

    .line 2629
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p0

    invoke-static {p2, p0}, Lo/forPOJO;->read(Landroid/view/accessibility/AccessibilityRecord;I)V

    .line 2630
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result p0

    invoke-static {p2, p0}, Lo/forPOJO;->RemoteActionCompatParcelizer(Landroid/view/accessibility/AccessibilityRecord;I)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 4

    .line 2597
    invoke-super {p0, p1, p2}, Lo/deserializeUsingCustom;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    .line 2598
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 2599
    const-class p0, Landroid/widget/ScrollView;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 2600
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result p0

    if-eqz p0, :cond_3e

    .line 2601
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result p0

    if-lez p0, :cond_3e

    const/4 v0, 0x1

    .line 2603
    invoke-virtual {p2, v0}, Lo/hasSuperClassStartingWith;->handleMediaPlayPauseIfPendingOnHandler(Z)V

    .line 2604
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-lez v0, :cond_2e

    .line 2605
    sget-object v0, Lo/hasSuperClassStartingWith$read;->onPrepareFromSearch:Lo/hasSuperClassStartingWith$read;

    invoke-virtual {p2, v0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Lo/hasSuperClassStartingWith$read;)V

    .line 2607
    sget-object v0, Lo/hasSuperClassStartingWith$read;->onSetRating:Lo/hasSuperClassStartingWith$read;

    invoke-virtual {p2, v0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Lo/hasSuperClassStartingWith$read;)V

    .line 2610
    :cond_2e
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    if-ge p1, p0, :cond_3e

    .line 2611
    sget-object p0, Lo/hasSuperClassStartingWith$read;->onRemoveQueueItemAt:Lo/hasSuperClassStartingWith$read;

    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Lo/hasSuperClassStartingWith$read;)V

    .line 2613
    sget-object p0, Lo/hasSuperClassStartingWith$read;->onPrepareFromUri:Lo/hasSuperClassStartingWith$read;

    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Lo/hasSuperClassStartingWith$read;)V

    :cond_3e
    return-void
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .registers 8

    .line 2553
    invoke-super {p0, p1, p2, p3}, Lo/deserializeUsingCustom;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p0

    const/4 p3, 0x1

    if-eqz p0, :cond_8

    return p3

    .line 2556
    :cond_8
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 2557
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result p0

    const/4 v0, 0x0

    if-nez p0, :cond_12

    return v0

    .line 2560
    :cond_12
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p0

    .line 2561
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 2564
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v2

    if-eqz v2, :cond_2f

    invoke-virtual {p1, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v2

    if-eqz v2, :cond_2f

    .line 2565
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result p0

    :cond_2f
    const/16 v1, 0x1000

    if-eq p2, v1, :cond_60

    const/16 v1, 0x2000

    if-eq p2, v1, :cond_42

    const v1, 0x1020038

    if-eq p2, v1, :cond_42

    const v1, 0x102003a

    if-eq p2, v1, :cond_60

    return v0

    .line 2582
    :cond_42
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    .line 2583
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 2584
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v2

    sub-int/2addr p0, p2

    sub-int/2addr p0, v1

    sub-int/2addr v2, p0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 2585
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p2

    if-eq p0, p2, :cond_5f

    .line 2586
    invoke-virtual {p1, p0}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(I)V

    return p3

    :cond_5f
    return v0

    .line 2570
    :cond_60
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    .line 2571
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 2572
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v2

    .line 2573
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->write()I

    move-result v3

    sub-int/2addr p0, p2

    sub-int/2addr p0, v1

    add-int/2addr v2, p0

    .line 2572
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result p0

    .line 2574
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p2

    if-eq p0, p2, :cond_81

    .line 2575
    invoke-virtual {p1, p0}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer(I)V

    return p3

    :cond_81
    return v0
.end method

###### Class androidx.core.widget.NestedScrollView.RemoteActionCompatParcelizer (androidx.core.widget.NestedScrollView$RemoteActionCompatParcelizer)
.class final Landroidx/core/widget/NestedScrollView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/widget/NestedScrollView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method public static write(Landroid/view/View;F)V
    .registers 2

    .line 2678
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setFrameContentVelocity(F)V
    :try_end_3
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method

###### Class androidx.core.widget.NestedScrollView.SavedState (androidx.core.widget.NestedScrollView$SavedState)
.class Landroidx/core/widget/NestedScrollView$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/widget/NestedScrollView;
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
            "Landroidx/core/widget/NestedScrollView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public AudioAttributesCompatParcelizer:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 2536
    new-instance v0, Landroidx/core/widget/NestedScrollView$SavedState$2;

    invoke-direct {v0}, Landroidx/core/widget/NestedScrollView$SavedState$2;-><init>()V

    sput-object v0, Landroidx/core/widget/NestedScrollView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 2

    .line 2519
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 2520
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView$SavedState;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 2515
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    .line 2531
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HorizontalScrollView.SavedState{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2532
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " scrollPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/core/widget/NestedScrollView$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 2525
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2526
    iget p0, p0, Landroidx/core/widget/NestedScrollView$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.core.widget.NestedScrollView.SavedState.AnonymousClass2 (androidx.core.widget.NestedScrollView$SavedState$2)
.class final Landroidx/core/widget/NestedScrollView$SavedState$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/widget/NestedScrollView$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/core/widget/NestedScrollView$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2537
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/core/widget/NestedScrollView$SavedState;
    .registers 1

    .line 2545
    new-array p0, p0, [Landroidx/core/widget/NestedScrollView$SavedState;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/core/widget/NestedScrollView$SavedState;
    .registers 2

    .line 2540
    new-instance v0, Landroidx/core/widget/NestedScrollView$SavedState;

    invoke-direct {v0, p0}, Landroidx/core/widget/NestedScrollView$SavedState;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 2537
    invoke-static {p1}, Landroidx/core/widget/NestedScrollView$SavedState$2;->write(Landroid/os/Parcel;)Landroidx/core/widget/NestedScrollView$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 2537
    invoke-static {p1}, Landroidx/core/widget/NestedScrollView$SavedState$2;->RemoteActionCompatParcelizer(I)[Landroidx/core/widget/NestedScrollView$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.core.widget.NestedScrollView.read (androidx.core.widget.NestedScrollView$read)
.class final Landroidx/core/widget/NestedScrollView$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/_badFormat;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/widget/NestedScrollView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/core/widget/NestedScrollView;


# direct methods
.method constructor <init>(Landroidx/core/widget/NestedScrollView;)V
    .registers 2

    .line 2641
    iput-object p1, p0, Landroidx/core/widget/NestedScrollView$read;->RemoteActionCompatParcelizer:Landroidx/core/widget/NestedScrollView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    .line 2654
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView$read;->RemoteActionCompatParcelizer:Landroidx/core/widget/NestedScrollView;

    invoke-static {p0}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(Landroidx/core/widget/NestedScrollView;)Landroid/widget/OverScroller;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void
.end method

.method public final read(F)Z
    .registers 3

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_7

    const/4 p0, 0x0

    return p0

    .line 2647
    :cond_7
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView$read;->AudioAttributesCompatParcelizer()V

    .line 2648
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView$read;->RemoteActionCompatParcelizer:Landroidx/core/widget/NestedScrollView;

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->AudioAttributesCompatParcelizer(I)V

    const/4 p0, 0x1

    return p0
.end method

.method public final write()F
    .registers 1

    .line 2659
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView$read;->RemoteActionCompatParcelizer:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->RemoteActionCompatParcelizer()F

    move-result p0

    neg-float p0, p0

    return p0
.end method

###### Class androidx.core.widget.NestedScrollView.write (androidx.core.widget.NestedScrollView$write)
.class public interface abstract Landroidx/core/widget/NestedScrollView$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/widget/NestedScrollView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation


# virtual methods
.method public abstract read(Landroidx/core/widget/NestedScrollView;IIII)V
.end method
