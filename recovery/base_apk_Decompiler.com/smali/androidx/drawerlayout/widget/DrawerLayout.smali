###### Class androidx.drawerlayout.widget.DrawerLayout (androidx.drawerlayout.widget.DrawerLayout)
.class public Landroidx/drawerlayout/widget/DrawerLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;,
        Landroidx/drawerlayout/widget/DrawerLayout$write;,
        Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;,
        Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;,
        Landroidx/drawerlayout/widget/DrawerLayout$SavedState;,
        Landroidx/drawerlayout/widget/DrawerLayout$AudioAttributesCompatParcelizer;,
        Landroidx/drawerlayout/widget/DrawerLayout$read;
    }
.end annotation


# static fields
.field static final AudioAttributesCompatParcelizer:[I

.field private static final IconCompatParcelizer:[I

.field static final RemoteActionCompatParcelizer:Z

.field private static read:Z

.field private static final write:Z


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Landroid/graphics/Matrix;

.field private final AudioAttributesImplApi26Parcelizer:Landroidx/drawerlayout/widget/DrawerLayout$write;

.field private AudioAttributesImplBaseParcelizer:Z

.field private final MediaBrowserCompatCustomActionResultReceiver:Lo/modifyFieldName;

.field private MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

.field private MediaBrowserCompatMediaItem:Z

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/drawerlayout/widget/DrawerLayout$read;

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:F

.field private RatingCompat:Z

.field private handleMediaPlayPauseIfPendingOnHandler:F

.field private onAddQueueItem:F

.field private final onCommand:Lo/call;

.field private onCustomAction:Ljava/lang/Object;

.field private onFastForward:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field private onMediaButtonEvent:I

.field private onPause:Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;

.field private onPlay:I

.field private onPlayFromMediaId:I

.field private onPlayFromSearch:I

.field private final onPlayFromUri:Landroidx/drawerlayout/widget/DrawerLayout$read;

.field private final onPrepare:Lo/call;

.field private onPrepareFromMediaId:I

.field private final onPrepareFromSearch:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private onPrepareFromUri:Landroid/graphics/drawable/Drawable;

.field private onRemoveQueueItem:Landroid/graphics/Paint;

.field private onRemoveQueueItemAt:I

.field private onRewind:F

.field private onSeekTo:Landroid/graphics/drawable/Drawable;

.field private onSetCaptioningEnabled:Landroid/graphics/drawable/Drawable;

.field private onSetPlaybackSpeed:Landroid/graphics/drawable/Drawable;

.field private onSetRating:Landroid/graphics/drawable/Drawable;

.field private onSetRepeatMode:Landroid/graphics/drawable/Drawable;

.field private onSetShuffleMode:Landroid/graphics/drawable/Drawable;

.field private onSkipToQueueItem:Ljava/lang/CharSequence;

.field private onStop:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const v0, 0x1010434

    .line 110
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer:[I

    const v0, 0x10100b3

    .line 189
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer:[I

    const/4 v0, 0x1

    .line 194
    sput-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer:Z

    .line 197
    sput-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->write:Z

    .line 256
    sput-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->read:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 328
    invoke-direct {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 332
    sget v0, Lo/_emptyAnnotationMap$IconCompatParcelizer;->drawerLayoutStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/drawerlayout/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 10

    .line 336
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 204
    new-instance v0, Landroidx/drawerlayout/widget/DrawerLayout$write;

    invoke-direct {v0}, Landroidx/drawerlayout/widget/DrawerLayout$write;-><init>()V

    iput-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/drawerlayout/widget/DrawerLayout$write;

    const/high16 v0, -0x67000000

    .line 210
    iput v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onRemoveQueueItemAt:I

    .line 212
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onRemoveQueueItem:Landroid/graphics/Paint;

    const/4 v0, 0x1

    .line 220
    iput-boolean v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatSearchResultReceiver:Z

    const/4 v1, 0x3

    .line 222
    iput v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlay:I

    .line 223
    iput v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onMediaButtonEvent:I

    .line 224
    iput v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromSearch:I

    .line 225
    iput v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromMediaId:I

    const/4 v2, 0x0

    .line 246
    iput-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRepeatMode:Landroid/graphics/drawable/Drawable;

    .line 247
    iput-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSeekTo:Landroid/graphics/drawable/Drawable;

    .line 248
    iput-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    .line 249
    iput-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetCaptioningEnabled:Landroid/graphics/drawable/Drawable;

    .line 258
    new-instance v2, Landroidx/drawerlayout/widget/DrawerLayout$3;

    invoke-direct {v2, p0}, Landroidx/drawerlayout/widget/DrawerLayout$3;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;)V

    iput-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/modifyFieldName;

    const/high16 v2, 0x40000

    .line 337
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 338
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42800000    # 64.0f

    mul-float/2addr v3, v2

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 339
    iput v3, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromMediaId:I

    const/high16 v3, 0x43c80000    # 400.0f

    mul-float/2addr v2, v3

    .line 342
    new-instance v3, Landroidx/drawerlayout/widget/DrawerLayout$read;

    invoke-direct {v3, p0, v1}, Landroidx/drawerlayout/widget/DrawerLayout$read;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;I)V

    iput-object v3, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/drawerlayout/widget/DrawerLayout$read;

    .line 343
    new-instance v1, Landroidx/drawerlayout/widget/DrawerLayout$read;

    const/4 v4, 0x5

    invoke-direct {v1, p0, v4}, Landroidx/drawerlayout/widget/DrawerLayout$read;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;I)V

    iput-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromUri:Landroidx/drawerlayout/widget/DrawerLayout$read;

    const/high16 v4, 0x3f800000    # 1.0f

    .line 345
    invoke-static {p0, v4, v3}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;FLo/call$IconCompatParcelizer;)Lo/call;

    move-result-object v5

    iput-object v5, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    .line 346
    invoke-virtual {v5, v0}, Lo/call;->RemoteActionCompatParcelizer(I)V

    .line 347
    invoke-virtual {v5, v2}, Lo/call;->write(F)V

    .line 348
    invoke-virtual {v3, v5}, Landroidx/drawerlayout/widget/DrawerLayout$read;->read(Lo/call;)V

    .line 350
    invoke-static {p0, v4, v1}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;FLo/call$IconCompatParcelizer;)Lo/call;

    move-result-object v3

    iput-object v3, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    const/4 v4, 0x2

    .line 351
    invoke-virtual {v3, v4}, Lo/call;->RemoteActionCompatParcelizer(I)V

    .line 352
    invoke-virtual {v3, v2}, Lo/call;->write(F)V

    .line 353
    invoke-virtual {v1, v3}, Landroidx/drawerlayout/widget/DrawerLayout$read;->read(Lo/call;)V

    .line 356
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 358
    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    .line 361
    new-instance v0, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;)V

    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/deserializeUsingCustom;)V

    const/4 v0, 0x0

    .line 362
    invoke-virtual {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->setMotionEventSplittingEnabled(Z)V

    .line 363
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_b6

    .line 365
    new-instance v1, Landroidx/drawerlayout/widget/DrawerLayout$1;

    invoke-direct {v1, p0}, Landroidx/drawerlayout/widget/DrawerLayout$1;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;)V

    invoke-virtual {p0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    const/16 v1, 0x500

    .line 373
    invoke-virtual {p0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setSystemUiVisibility(I)V

    .line 375
    sget-object v1, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer:[I

    invoke-virtual {p1, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 377
    :try_start_a7
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRating:Landroid/graphics/drawable/Drawable;
    :try_end_ad
    .catchall {:try_start_a7 .. :try_end_ad} :catchall_b1

    .line 379
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_b6

    :catchall_b1
    move-exception p0

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 380
    throw p0

    .line 386
    :cond_b6
    :goto_b6
    sget-object v1, Lo/_emptyAnnotationMap$read;->DrawerLayout:[I

    .line 387
    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 389
    :try_start_bc
    sget p2, Lo/_emptyAnnotationMap$read;->DrawerLayout_elevation:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_ce

    .line 390
    sget p2, Lo/_emptyAnnotationMap$read;->DrawerLayout_elevation:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat:F

    goto :goto_da

    .line 392
    :cond_ce
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lo/_emptyAnnotationMap$write;->def_drawer_elevation:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat:F
    :try_end_da
    .catchall {:try_start_bc .. :try_end_da} :catchall_e5

    .line 395
    :goto_da
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 398
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromSearch:Ljava/util/ArrayList;

    return-void

    :catchall_e5
    move-exception p0

    .line 395
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 396
    throw p0
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;Landroid/view/View;)Landroid/view/MotionEvent;
    .registers 6

    .line 826
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    .line 827
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    .line 828
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    .line 829
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 830
    invoke-virtual {p2}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    .line 831
    invoke-virtual {p2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_3a

    .line 832
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Matrix;

    if-nez v0, :cond_30

    .line 833
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Matrix;

    .line 835
    :cond_30
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Matrix;

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 836
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Matrix;

    invoke-virtual {p1, p0}, Landroid/view/MotionEvent;->transform(Landroid/graphics/Matrix;)V

    :cond_3a
    return-object p1
.end method

.method private AudioAttributesCompatParcelizer(I)V
    .registers 3

    const p1, 0x800003

    .line 1787
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_e

    const/4 p1, 0x1

    .line 1792
    invoke-direct {p0, v0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;Z)V

    return-void

    .line 1789
    :cond_e
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "No drawer view found with gravity "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1790
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->write(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;F)V
    .registers 5

    .line 1008
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;)F

    move-result v0

    .line 1009
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    mul-float/2addr v1, p2

    float-to-int v1, v1

    sub-int/2addr v1, v0

    const/4 v0, 0x3

    .line 1015
    invoke-virtual {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_16

    neg-int v1, v1

    .line 1014
    :cond_16
    invoke-virtual {p1, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 1016
    invoke-virtual {p0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Landroid/view/View;F)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;Z)V
    .registers 6

    .line 1741
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_4c

    .line 1745
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 1746
    iget-boolean v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v0, :cond_1e

    const/high16 v0, 0x3f800000    # 1.0f

    .line 1747
    iput v0, p2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    const/4 v0, 0x1

    .line 1748
    iput v0, p2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    .line 1750
    invoke-direct {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 1751
    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)V

    goto :goto_48

    .line 1753
    :cond_1e
    iget v0, p2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    const/4 p2, 0x3

    .line 1755
    invoke-virtual {p0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result p2

    if-eqz p2, :cond_36

    .line 1756
    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p2, p1, v0, v1}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/View;II)Z

    goto :goto_48

    .line 1758
    :cond_36
    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 1759
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v0, v1

    .line 1758
    invoke-virtual {p2, p1, v0, v2}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/View;II)Z

    .line 1766
    :goto_48
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 1742
    :cond_4c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "View "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a sliding drawer"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private AudioAttributesCompatParcelizer(FFLandroid/view/View;)Z
    .registers 5

    .line 793
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    if-nez v0, :cond_b

    .line 794
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    .line 796
    :cond_b
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    invoke-virtual {p3, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 797
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result p0

    return p0
.end method

.method private AudioAttributesImplApi21Parcelizer()Landroid/view/View;
    .registers 6

    .line 996
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_1b

    .line 998
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 999
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 1000
    iget v3, v3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    const/4 v4, 0x1

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_18

    return-object v2

    :cond_18
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method private AudioAttributesImplApi21Parcelizer(Landroid/view/View;)V
    .registers 5

    .line 882
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 883
    iget v1, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3f

    const/4 v1, 0x0

    .line 884
    iput v1, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    .line 886
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    if-eqz v0, :cond_28

    .line 889
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    :goto_18
    if-ltz v0, :cond_28

    .line 891
    iget-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;

    invoke-interface {v2, p1}, Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_18

    .line 895
    :cond_28
    invoke-direct {p0, p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 896
    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)V

    .line 901
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result p1

    if-eqz p1, :cond_3f

    .line 902
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_3f

    const/16 p1, 0x20

    .line 904
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_3f
    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer()Landroid/graphics/drawable/Drawable;
    .registers 3

    .line 1222
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_10

    .line 1224
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSeekTo:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1a

    .line 1226
    invoke-static {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->read(Landroid/graphics/drawable/Drawable;I)V

    .line 1227
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSeekTo:Landroid/graphics/drawable/Drawable;

    return-object p0

    .line 1230
    :cond_10
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRepeatMode:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1a

    .line 1232
    invoke-static {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->read(Landroid/graphics/drawable/Drawable;I)V

    .line 1233
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRepeatMode:Landroid/graphics/drawable/Drawable;

    return-object p0

    .line 1236
    :cond_1a
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetCaptioningEnabled:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method private static AudioAttributesImplApi26Parcelizer(Landroid/view/View;)Z
    .registers 2

    .line 1377
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_f

    .line 1379
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_f

    const/4 p0, 0x1

    return p0

    :cond_f
    const/4 p0, 0x0

    return p0
.end method

.method private AudioAttributesImplBaseParcelizer()V
    .registers 2

    .line 1195
    sget-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->write:Z

    if-eqz v0, :cond_5

    return-void

    .line 1198
    :cond_5
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatCustomActionResultReceiver()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    .line 1199
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi26Parcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetPlaybackSpeed:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public static AudioAttributesImplBaseParcelizer(Landroid/view/View;)Z
    .registers 4

    .line 1881
    invoke-static {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1884
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 1885
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-ne p0, v0, :cond_13

    return v0

    :cond_13
    const/4 p0, 0x0

    return p0

    .line 1882
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not a drawer"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static IconCompatParcelizer(Landroid/view/View;)F
    .registers 1

    .line 978
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    return p0
.end method

.method private IconCompatParcelizer()Z
    .registers 5

    .line 1950
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_1b

    .line 1952
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 1953
    iget-boolean v3, v3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->RemoteActionCompatParcelizer:Z

    if-eqz v3, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_1b
    return v1
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()Landroid/graphics/drawable/Drawable;
    .registers 3

    .line 1203
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_10

    .line 1206
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRepeatMode:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1a

    .line 1208
    invoke-static {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->read(Landroid/graphics/drawable/Drawable;I)V

    .line 1209
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRepeatMode:Landroid/graphics/drawable/Drawable;

    return-object p0

    .line 1212
    :cond_10
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSeekTo:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1a

    .line 1214
    invoke-static {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->read(Landroid/graphics/drawable/Drawable;I)V

    .line 1215
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSeekTo:Landroid/graphics/drawable/Drawable;

    return-object p0

    .line 1218
    :cond_1a
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)V
    .registers 4

    .line 950
    sget-object v0, Lo/hasSuperClassStartingWith$read;->AudioAttributesImplApi26Parcelizer:Lo/hasSuperClassStartingWith$read;

    invoke-virtual {v0}, Lo/hasSuperClassStartingWith$read;->RemoteActionCompatParcelizer()I

    move-result v0

    invoke-static {p1, v0}, Lo/InvalidTypeIdException;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    .line 951
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1e

    .line 952
    sget-object v0, Lo/hasSuperClassStartingWith$read;->AudioAttributesImplApi26Parcelizer:Lo/hasSuperClassStartingWith$read;

    const/4 v1, 0x0

    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/modifyFieldName;

    invoke-static {p1, v0, v1, p0}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;Lo/hasSuperClassStartingWith$read;Ljava/lang/CharSequence;Lo/modifyFieldName;)V

    :cond_1e
    return-void
.end method

.method private MediaBrowserCompatItemReceiver()Z
    .registers 1

    .line 2020
    invoke-virtual {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->write()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method static MediaBrowserCompatItemReceiver(Landroid/view/View;)Z
    .registers 3

    .line 1520
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget v0, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    .line 1522
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result p0

    .line 1521
    invoke-static {v0, p0}, Lo/_clearIfStdImpl;->write(II)I

    move-result p0

    and-int/lit8 v0, p0, 0x3

    const/4 v1, 0x1

    if-eqz v0, :cond_16

    return v1

    :cond_16
    and-int/lit8 p0, p0, 0x5

    if-eqz p0, :cond_1b

    return v1

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

.method private MediaBrowserCompatMediaItem(Landroid/view/View;)V
    .registers 5

    .line 911
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 912
    iget v1, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-nez v1, :cond_38

    .line 913
    iput v2, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    .line 914
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    if-eqz v0, :cond_27

    .line 917
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    :goto_17
    if-ltz v0, :cond_27

    .line 919
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;

    invoke-interface {v1, p1}, Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_17

    .line 923
    :cond_27
    invoke-direct {p0, p1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;Z)V

    .line 924
    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)V

    .line 927
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result p1

    if-eqz p1, :cond_38

    const/16 p1, 0x20

    .line 928
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_38
    return-void
.end method

.method private MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)V
    .registers 4

    .line 957
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    if-eqz v0, :cond_1a

    .line 960
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_a
    if-ltz v0, :cond_1a

    .line 962
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;

    invoke-interface {v1, p1}, Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_a

    :cond_1a
    return-void
.end method

.method private MediaDescriptionCompat(Landroid/view/View;)V
    .registers 3

    const/4 v0, 0x1

    .line 1731
    invoke-direct {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;Z)V

    return-void
.end method

.method private static MediaMetadataCompat(Landroid/view/View;)Z
    .registers 1

    .line 1516
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    if-nez p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method private static RatingCompat(Landroid/view/View;)Z
    .registers 4

    .line 1927
    invoke-static {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1930
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-lez p0, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0

    .line 1928
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not a drawer"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private RemoteActionCompatParcelizer(I)I
    .registers 5

    .line 684
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_41

    const/4 v2, 0x5

    if-eq p1, v2, :cond_32

    const v2, 0x800003

    if-eq p1, v2, :cond_23

    const v2, 0x800005

    if-ne p1, v2, :cond_50

    .line 718
    iget p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromMediaId:I

    if-eq p1, v1, :cond_19

    return p1

    :cond_19
    if-nez v0, :cond_1e

    .line 722
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onMediaButtonEvent:I

    goto :goto_20

    :cond_1e
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlay:I

    :goto_20
    if-eq p0, v1, :cond_50

    return p0

    .line 708
    :cond_23
    iget p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromSearch:I

    if-eq p1, v1, :cond_28

    return p1

    :cond_28
    if-nez v0, :cond_2d

    .line 712
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlay:I

    goto :goto_2f

    :cond_2d
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onMediaButtonEvent:I

    :goto_2f
    if-eq p0, v1, :cond_50

    return p0

    .line 698
    :cond_32
    iget p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onMediaButtonEvent:I

    if-eq p1, v1, :cond_37

    return p1

    :cond_37
    if-nez v0, :cond_3c

    .line 702
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromMediaId:I

    goto :goto_3e

    :cond_3c
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromSearch:I

    :goto_3e
    if-eq p0, v1, :cond_50

    return p0

    .line 688
    :cond_41
    iget p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlay:I

    if-eq p1, v1, :cond_46

    return p1

    :cond_46
    if-nez v0, :cond_4b

    .line 692
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromSearch:I

    goto :goto_4d

    :cond_4b
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromMediaId:I

    :goto_4d
    if-eq p0, v1, :cond_50

    return p0

    :cond_50
    const/4 p0, 0x0

    return p0
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;Z)V
    .registers 7

    .line 934
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_23

    .line 936
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-nez p2, :cond_13

    .line 937
    invoke-static {v2}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_17

    :cond_13
    if-eqz p2, :cond_1c

    if-ne v2, p1, :cond_1c

    :cond_17
    const/4 v3, 0x1

    .line 940
    invoke-static {v2, v3}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    goto :goto_20

    :cond_1c
    const/4 v3, 0x4

    .line 943
    invoke-static {v2, v3}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    :goto_20
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_23
    return-void
.end method

.method private static read(Landroid/graphics/drawable/Drawable;I)V
    .registers 3

    if-eqz p0, :cond_b

    .line 1243
    invoke-static {p0}, Lo/findFormatOverrides;->MediaBrowserCompatItemReceiver(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1244
    invoke-static {p0, p1}, Lo/findFormatOverrides;->RemoteActionCompatParcelizer(Landroid/graphics/drawable/Drawable;I)Z

    :cond_b
    return-void
.end method

.method private static write(I)Ljava/lang/String;
    .registers 3

    and-int/lit8 v0, p0, 0x3

    const/4 v1, 0x3

    if-ne v0, v1, :cond_8

    .line 1047
    const-string p0, "LEFT"

    return-object p0

    :cond_8
    and-int/lit8 v0, p0, 0x5

    const/4 v1, 0x5

    if-ne v0, v1, :cond_10

    .line 1050
    const-string p0, "RIGHT"

    return-object p0

    .line 1052
    :cond_10
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private write(Z)V
    .registers 11

    .line 1687
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_7
    if-ge v2, v0, :cond_4b

    .line 1689
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1690
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 1692
    invoke-static {v4}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_48

    if-eqz p1, :cond_20

    iget-boolean v6, v5, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->RemoteActionCompatParcelizer:Z

    if-nez v6, :cond_20

    goto :goto_48

    .line 1696
    :cond_20
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v6

    const/4 v7, 0x3

    .line 1698
    invoke-virtual {p0, v4, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v7

    if-eqz v7, :cond_37

    .line 1699
    iget-object v7, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    neg-int v6, v6

    .line 1700
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v8

    .line 1699
    invoke-virtual {v7, v4, v6, v8}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/View;II)Z

    move-result v4

    goto :goto_45

    .line 1702
    :cond_37
    iget-object v6, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    .line 1703
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v7

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v8

    .line 1702
    invoke-virtual {v6, v4, v7, v8}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/View;II)Z

    move-result v4

    :goto_45
    or-int/2addr v3, v4

    .line 1706
    iput-boolean v1, v5, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->RemoteActionCompatParcelizer:Z

    :cond_48
    :goto_48
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 1709
    :cond_4b
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/drawerlayout/widget/DrawerLayout$read;

    invoke-virtual {p1}, Landroidx/drawerlayout/widget/DrawerLayout$read;->AudioAttributesCompatParcelizer()V

    .line 1710
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromUri:Landroidx/drawerlayout/widget/DrawerLayout$read;

    invoke-virtual {p1}, Landroidx/drawerlayout/widget/DrawerLayout$read;->AudioAttributesCompatParcelizer()V

    if-eqz v3, :cond_5a

    .line 1713
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_5a
    return-void
.end method

.method private write(Landroid/view/MotionEvent;Landroid/view/View;)Z
    .registers 5

    .line 806
    invoke-virtual {p2}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    .line 807
    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_16

    .line 808
    invoke-direct {p0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(Landroid/view/MotionEvent;Landroid/view/View;)Landroid/view/MotionEvent;

    move-result-object p0

    .line 809
    invoke-virtual {p2, p0}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    .line 810
    invoke-virtual {p0}, Landroid/view/MotionEvent;->recycle()V

    return p1

    .line 812
    :cond_16
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    .line 813
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr p0, v1

    int-to-float p0, p0

    .line 814
    invoke-virtual {p1, v0, p0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 815
    invoke-virtual {p2, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p2

    neg-float v0, v0

    neg-float p0, p0

    .line 816
    invoke-virtual {p1, v0, p0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    return p2
.end method

.method static write(Landroid/view/View;)Z
    .registers 3

    .line 2160
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_10

    .line 2162
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result p0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(Landroid/view/View;)I
    .registers 2

    .line 986
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget p1, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    .line 987
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result p0

    invoke-static {p1, p0}, Lo/_clearIfStdImpl;->write(II)I

    move-result p0

    return p0
.end method

.method final AudioAttributesCompatParcelizer()V
    .registers 10

    .line 2036
    iget-boolean v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer:Z

    if-nez v0, :cond_28

    .line 2037
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v1, v3

    .line 2038
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 2040
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_16
    if-ge v2, v1, :cond_22

    .line 2042
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    .line 2044
    :cond_22
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    const/4 v0, 0x1

    .line 2045
    iput-boolean v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer:Z

    :cond_28
    return-void
.end method

.method final IconCompatParcelizer(I)Landroid/view/View;
    .registers 7

    .line 1027
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    .line 1026
    invoke-static {p1, v0}, Lo/_clearIfStdImpl;->write(II)I

    move-result p1

    .line 1028
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_d
    if-ge v1, v0, :cond_21

    .line 1030
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1031
    invoke-virtual {p0, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v3

    and-int/lit8 v3, v3, 0x7

    and-int/lit8 v4, p1, 0x7

    if-ne v3, v4, :cond_1e

    return-object v2

    :cond_1e
    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_21
    const/4 p0, 0x0

    return-object p0
.end method

.method public final IconCompatParcelizer(Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;)V
    .registers 3

    if-nez p1, :cond_3

    return-void

    .line 546
    :cond_3
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    if-nez v0, :cond_e

    .line 547
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    .line 549
    :cond_e
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final IconCompatParcelizer(Landroid/view/View;I)Z
    .registers 3

    .line 991
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p0

    and-int/2addr p0, p2

    if-ne p0, p2, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;)I
    .registers 4

    .line 741
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 744
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget p1, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    .line 745
    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(I)I

    move-result p0

    return p0

    .line 742
    :cond_13
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "View "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a drawer"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 2

    const v0, 0x800003

    .line 1776
    invoke-direct {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(I)V

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

    .line 1986
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v0

    const/high16 v1, 0x60000

    if-ne v0, v1, :cond_9

    return-void

    .line 1992
    :cond_9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_10
    if-ge v2, v0, :cond_2f

    .line 1995
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1996
    invoke-static {v4}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_27

    .line 1997
    invoke-static {v4}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_2c

    .line 1999
    invoke-virtual {v4, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    const/4 v3, 0x1

    goto :goto_2c

    .line 2002
    :cond_27
    iget-object v5, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromSearch:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_2c
    :goto_2c
    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_2f
    if-nez v3, :cond_4d

    .line 2007
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromSearch:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    :goto_37
    if-ge v1, v0, :cond_4d

    .line 2009
    iget-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromSearch:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 2010
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_4a

    .line 2011
    invoke-virtual {v2, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_4a
    add-int/lit8 v1, v1, 0x1

    goto :goto_37

    .line 2016
    :cond_4d
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromSearch:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    .line 2132
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2134
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi21Parcelizer()Landroid/view/View;

    move-result-object p2

    if-nez p2, :cond_14

    .line 2135
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result p2

    if-nez p2, :cond_14

    const/4 p2, 0x1

    .line 2143
    invoke-static {p1, p2}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    goto :goto_18

    :cond_14
    const/4 p2, 0x4

    .line 2138
    invoke-static {p1, p2}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    .line 2149
    :goto_18
    sget-boolean p2, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer:Z

    if-nez p2, :cond_21

    .line 2150
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/drawerlayout/widget/DrawerLayout$write;

    invoke-static {p1, p0}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Lo/deserializeUsingCustom;)V

    :cond_21
    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 3

    .line 1976
    instance-of v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

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

    .line 1359
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v0, :cond_1b

    .line 1362
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget v3, v3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    .line 1363
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 1365
    :cond_1b
    iput v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onRewind:F

    .line 1367
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    invoke-virtual {v0}, Lo/call;->IconCompatParcelizer()Z

    move-result v0

    .line 1368
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    invoke-virtual {v1}, Lo/call;->IconCompatParcelizer()Z

    move-result v1

    if-nez v0, :cond_2e

    if-nez v1, :cond_2e

    return-void

    .line 1370
    :cond_2e
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .registers 7

    .line 1586
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_43

    .line 1587
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_43

    iget v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onRewind:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-lez v0, :cond_43

    .line 1592
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_41

    .line 1594
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 1595
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    :cond_25
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_41

    .line 1599
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1603
    invoke-direct {p0, v1, v2, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(FFLandroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-static {v3}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat(Landroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_25

    .line 1608
    invoke-direct {p0, p1, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Landroid/view/MotionEvent;Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_25

    const/4 p0, 0x1

    return p0

    :cond_41
    const/4 p0, 0x0

    return p0

    .line 1589
    :cond_43
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .registers 19

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    .line 1453
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 1454
    invoke-static/range {p2 .. p2}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat(Landroid/view/View;)Z

    move-result v4

    .line 1455
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    .line 1457
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    if-eqz v4, :cond_5f

    .line 1459
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    move v10, v8

    move v11, v10

    :goto_1e
    if-ge v10, v9, :cond_57

    .line 1461
    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    if-eq v12, v2, :cond_54

    .line 1462
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-nez v13, :cond_54

    .line 1463
    invoke-static {v12}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi26Parcelizer(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_54

    invoke-static {v12}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_54

    .line 1464
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    move-result v13

    if-ge v13, v3, :cond_3f

    goto :goto_54

    .line 1468
    :cond_3f
    invoke-virtual {p0, v12, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v13

    if-eqz v13, :cond_4d

    .line 1469
    invoke-virtual {v12}, Landroid/view/View;->getRight()I

    move-result v12

    if-le v12, v11, :cond_54

    move v11, v12

    goto :goto_54

    .line 1472
    :cond_4d
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    move-result v12

    if-ge v12, v5, :cond_54

    move v5, v12

    :cond_54
    :goto_54
    add-int/lit8 v10, v10, 0x1

    goto :goto_1e

    .line 1476
    :cond_57
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p1, v11, v8, v5, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    move v8, v11

    .line 1478
    :cond_5f
    invoke-super/range {p0 .. p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v9

    .line 1479
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1481
    iget v3, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onRewind:F

    const/4 v6, 0x0

    cmpl-float v10, v3, v6

    if-lez v10, :cond_98

    if-eqz v4, :cond_98

    .line 1482
    iget v2, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onRemoveQueueItemAt:I

    const/high16 v4, -0x1000000

    and-int/2addr v4, v2

    ushr-int/lit8 v4, v4, 0x18

    int-to-float v4, v4

    mul-float/2addr v4, v3

    float-to-int v3, v4

    .line 1485
    iget-object v4, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onRemoveQueueItem:Landroid/graphics/Paint;

    const v6, 0xffffff

    and-int/2addr v2, v6

    shl-int/lit8 v3, v3, 0x18

    or-int/2addr v2, v3

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v2, v8

    int-to-float v3, v5

    const/4 v4, 0x0

    .line 1487
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget-object v6, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onRemoveQueueItem:Landroid/graphics/Paint;

    move-object v0, p1

    move v1, v2

    move v2, v4

    move v4, v5

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return v9

    .line 1488
    :cond_98
    iget-object v3, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    const/high16 v4, 0x437f0000    # 255.0f

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v3, :cond_dc

    .line 1489
    invoke-virtual {p0, v2, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_dc

    .line 1490
    iget-object v3, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    .line 1491
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getRight()I

    move-result v7

    .line 1492
    iget-object v8, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    invoke-virtual {v8}, Lo/call;->AudioAttributesImplApi26Parcelizer()I

    move-result v8

    int-to-float v10, v7

    int-to-float v8, v8

    div-float/2addr v10, v8

    .line 1494
    invoke-static {v10, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    .line 1495
    iget-object v6, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTop()I

    move-result v8

    .line 1496
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getBottom()I

    move-result v2

    add-int/2addr v3, v7

    .line 1495
    invoke-virtual {v6, v7, v8, v3, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1497
    iget-object v2, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    mul-float/2addr v5, v4

    float-to-int v3, v5

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1498
    iget-object v0, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetShuffleMode:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return v9

    .line 1499
    :cond_dc
    iget-object v3, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetPlaybackSpeed:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_122

    const/4 v3, 0x5

    .line 1500
    invoke-virtual {p0, v2, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_122

    .line 1501
    iget-object v3, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetPlaybackSpeed:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    .line 1502
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLeft()I

    move-result v7

    .line 1503
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v8

    .line 1504
    iget-object v10, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    invoke-virtual {v10}, Lo/call;->AudioAttributesImplApi26Parcelizer()I

    move-result v10

    sub-int/2addr v8, v7

    int-to-float v8, v8

    int-to-float v10, v10

    div-float/2addr v8, v10

    .line 1506
    invoke-static {v8, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    .line 1507
    iget-object v6, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetPlaybackSpeed:Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTop()I

    move-result v8

    .line 1508
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getBottom()I

    move-result v2

    sub-int v3, v7, v3

    .line 1507
    invoke-virtual {v6, v3, v8, v7, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1509
    iget-object v2, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetPlaybackSpeed:Landroid/graphics/drawable/Drawable;

    mul-float/2addr v5, v4

    float-to-int v3, v5

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1510
    iget-object v0, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetPlaybackSpeed:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_122
    return v9
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 1

    .line 1962
    new-instance p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;-><init>()V

    return-object p0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 3

    .line 1981
    new-instance v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 1967
    instance-of p0, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    if-eqz p0, :cond_c

    .line 1968
    new-instance p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;-><init>(Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;)V

    return-object p0

    .line 1969
    :cond_c
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p0, :cond_18

    .line 1970
    new-instance p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object p0

    .line 1971
    :cond_18
    new-instance p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method protected onAttachedToWindow()V
    .registers 2

    .line 1063
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 1064
    iput-boolean v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 2

    .line 1057
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x1

    .line 1058
    iput-boolean v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 6

    .line 1435
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 1436
    iget-boolean v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatMediaItem:Z

    if-eqz v0, :cond_28

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRating:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_28

    .line 1439
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCustomAction:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    .line 1440
    check-cast v0, Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v0

    goto :goto_18

    :cond_17
    move v0, v1

    :goto_18
    if-lez v0, :cond_28

    .line 1445
    iget-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRating:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {v2, v1, v1, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1446
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRating:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_28
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 9

    .line 1537
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 1540
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    invoke-virtual {v1, p1}, Lo/call;->read(Landroid/view/MotionEvent;)Z

    move-result v1

    iget-object v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    .line 1541
    invoke-virtual {v2, p1}, Lo/call;->read(Landroid/view/MotionEvent;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_37

    if-eq v0, v3, :cond_30

    const/4 p1, 0x2

    if-eq v0, p1, :cond_1d

    const/4 p1, 0x3

    if-eq v0, p1, :cond_30

    goto :goto_35

    .line 1563
    :cond_1d
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    invoke-virtual {p1}, Lo/call;->read()Z

    move-result p1

    if-eqz p1, :cond_35

    .line 1564
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroidx/drawerlayout/widget/DrawerLayout$read;

    invoke-virtual {p1}, Landroidx/drawerlayout/widget/DrawerLayout$read;->AudioAttributesCompatParcelizer()V

    .line 1565
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromUri:Landroidx/drawerlayout/widget/DrawerLayout$read;

    invoke-virtual {p1}, Landroidx/drawerlayout/widget/DrawerLayout$read;->AudioAttributesCompatParcelizer()V

    goto :goto_35

    .line 1572
    :cond_30
    invoke-direct {p0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Z)V

    .line 1573
    iput-boolean v4, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer:Z

    :cond_35
    :goto_35
    move p1, v4

    goto :goto_5f

    .line 1547
    :cond_37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1548
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 1549
    iput v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onAddQueueItem:F

    .line 1550
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->handleMediaPlayPauseIfPendingOnHandler:F

    .line 1551
    iget v5, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onRewind:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-lez v5, :cond_5c

    .line 1552
    iget-object v5, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    float-to-int v0, v0

    float-to-int p1, p1

    invoke-virtual {v5, v0, p1}, Lo/call;->read(II)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_5c

    .line 1553
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_5c

    move p1, v3

    goto :goto_5d

    :cond_5c
    move p1, v4

    .line 1557
    :goto_5d
    iput-boolean v4, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer:Z

    :goto_5f
    or-int v0, v1, v2

    if-nez v0, :cond_70

    if-nez p1, :cond_70

    .line 1577
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer()Z

    move-result p1

    if-nez p1, :cond_70

    iget-boolean p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer:Z

    if-nez p0, :cond_70

    return v4

    :cond_70
    return v3
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .registers 4

    const/4 v0, 0x4

    if-ne p1, v0, :cond_e

    .line 2051
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 2052
    invoke-virtual {p2}, Landroid/view/KeyEvent;->startTracking()V

    const/4 p0, 0x1

    return p0

    .line 2055
    :cond_e
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .registers 4

    const/4 v0, 0x4

    if-ne p1, v0, :cond_18

    .line 2061
    invoke-virtual {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->write()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_12

    .line 2062
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result p2

    if-nez p2, :cond_12

    .line 2063
    invoke-virtual {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->read()V

    :cond_12
    if-eqz p1, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0

    .line 2067
    :cond_18
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method protected onLayout(ZIIII)V
    .registers 22

    move-object/from16 v0, p0

    const/4 v1, 0x1

    .line 1250
    iput-boolean v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;->RatingCompat:Z

    sub-int v2, p4, p2

    .line 1252
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_d
    if-ge v5, v3, :cond_d3

    .line 1254
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1256
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_ce

    .line 1260
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 1262
    invoke-static {v6}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat(Landroid/view/View;)Z

    move-result v8

    if-eqz v8, :cond_3e

    .line 1263
    iget v8, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1264
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1265
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    add-int/2addr v10, v11

    add-int/2addr v7, v12

    .line 1263
    invoke-virtual {v6, v8, v9, v10, v7}, Landroid/view/View;->layout(IIII)V

    goto/16 :goto_ce

    .line 1267
    :cond_3e
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    .line 1268
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    const/4 v10, 0x3

    .line 1272
    invoke-virtual {v0, v6, v10}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v10

    if-eqz v10, :cond_59

    neg-int v10, v8

    int-to-float v11, v8

    .line 1273
    iget v12, v7, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    mul-float/2addr v12, v11

    float-to-int v12, v12

    add-int/2addr v10, v12

    add-int v12, v8, v10

    int-to-float v12, v12

    div-float/2addr v12, v11

    goto :goto_65

    :cond_59
    int-to-float v10, v8

    .line 1276
    iget v11, v7, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    mul-float/2addr v11, v10

    float-to-int v11, v11

    sub-int v11, v2, v11

    sub-int v12, v2, v11

    int-to-float v12, v12

    div-float/2addr v12, v10

    move v10, v11

    .line 1280
    :goto_65
    iget v11, v7, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    cmpl-float v11, v12, v11

    if-eqz v11, :cond_6d

    move v11, v1

    goto :goto_6e

    :cond_6d
    move v11, v4

    .line 1282
    :goto_6e
    iget v13, v7, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    and-int/lit8 v13, v13, 0x70

    const/16 v14, 0x10

    if-eq v13, v14, :cond_97

    const/16 v14, 0x50

    if-eq v13, v14, :cond_84

    .line 1287
    iget v13, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v10

    iget v14, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v14, v9

    invoke-virtual {v6, v10, v13, v8, v14}, Landroid/view/View;->layout(IIII)V

    goto :goto_b6

    :cond_84
    sub-int v9, p5, p3

    .line 1294
    iget v13, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1295
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int v13, v9, v13

    sub-int/2addr v13, v14

    add-int/2addr v8, v10

    sub-int/2addr v9, v15

    .line 1294
    invoke-virtual {v6, v10, v13, v8, v9}, Landroid/view/View;->layout(IIII)V

    goto :goto_b6

    :cond_97
    sub-int v13, p5, p3

    sub-int v14, v13, v9

    .line 1303
    div-int/lit8 v14, v14, 0x2

    .line 1307
    iget v15, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ge v14, v15, :cond_a4

    .line 1308
    iget v14, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_b1

    :cond_a4
    add-int v15, v14, v9

    .line 1309
    iget v1, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int v1, v13, v1

    if-le v15, v1, :cond_b1

    .line 1310
    iget v1, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v13, v1

    sub-int v14, v13, v9

    :cond_b1
    :goto_b1
    add-int/2addr v8, v10

    add-int/2addr v9, v14

    .line 1312
    invoke-virtual {v6, v10, v14, v8, v9}, Landroid/view/View;->layout(IIII)V

    :goto_b6
    if-eqz v11, :cond_bb

    .line 1319
    invoke-virtual {v0, v6, v12}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Landroid/view/View;F)V

    .line 1322
    :cond_bb
    iget v1, v7, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    const/4 v7, 0x0

    cmpl-float v1, v1, v7

    if-lez v1, :cond_c4

    move v1, v4

    goto :goto_c5

    :cond_c4
    const/4 v1, 0x4

    .line 1323
    :goto_c5
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v1, :cond_ce

    .line 1324
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_ce
    :goto_ce
    add-int/lit8 v5, v5, 0x1

    const/4 v1, 0x1

    goto/16 :goto_d

    .line 1329
    :cond_d3
    sget-boolean v1, Landroidx/drawerlayout/widget/DrawerLayout;->read:Z

    if-eqz v1, :cond_103

    .line 1331
    invoke-virtual/range {p0 .. p0}, Landroidx/drawerlayout/widget/DrawerLayout;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v1

    if-eqz v1, :cond_103

    .line 1334
    invoke-static {v1}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v1

    .line 1335
    invoke-virtual {v1}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplApi26Parcelizer()Lo/_verifyEndArrayForSingle;

    move-result-object v1

    .line 1339
    iget-object v2, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    .line 1340
    invoke-virtual {v2}, Lo/call;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v3

    iget v5, v1, Lo/_verifyEndArrayForSingle;->read:I

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1339
    invoke-virtual {v2, v3}, Lo/call;->AudioAttributesCompatParcelizer(I)V

    .line 1341
    iget-object v2, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    .line 1342
    invoke-virtual {v2}, Lo/call;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v3

    iget v1, v1, Lo/_verifyEndArrayForSingle;->IconCompatParcelizer:I

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1341
    invoke-virtual {v2, v1}, Lo/call;->AudioAttributesCompatParcelizer(I)V

    .line 1346
    :cond_103
    iput-boolean v4, v0, Landroidx/drawerlayout/widget/DrawerLayout;->RatingCompat:Z

    .line 1347
    iput-boolean v4, v0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method protected onMeasure(II)V
    .registers 20

    move-object/from16 v0, p0

    .line 1072
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 1073
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 1074
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 1075
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v1, v5, :cond_18

    if-eq v2, v5, :cond_26

    .line 1078
    :cond_18
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v6

    if-eqz v6, :cond_195

    const/16 v6, 0x12c

    if-nez v1, :cond_23

    move v3, v6

    :cond_23
    if-nez v2, :cond_26

    move v4, v6

    .line 1095
    :cond_26
    invoke-virtual {v0, v3, v4}, Landroidx/drawerlayout/widget/DrawerLayout;->setMeasuredDimension(II)V

    .line 1097
    iget-object v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onCustomAction:Ljava/lang/Object;

    const/4 v6, 0x0

    if-eqz v1, :cond_36

    invoke-static/range {p0 .. p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_36

    const/4 v1, 0x1

    goto :goto_37

    :cond_36
    move v1, v6

    .line 1098
    :goto_37
    invoke-static/range {p0 .. p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v7

    .line 1104
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    move v9, v6

    move v10, v9

    move v11, v10

    :goto_42
    if-ge v9, v8, :cond_194

    .line 1106
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 1108
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v13

    const/16 v14, 0x8

    if-eq v13, v14, :cond_18a

    .line 1112
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    const/4 v14, 0x3

    if-eqz v1, :cond_d5

    .line 1115
    iget v15, v13, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    invoke-static {v15, v7}, Lo/_clearIfStdImpl;->write(II)I

    move-result v15

    .line 1116
    invoke-static {v12}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v16

    const/4 v2, 0x5

    if-eqz v16, :cond_93

    .line 1118
    iget-object v5, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onCustomAction:Ljava/lang/Object;

    check-cast v5, Landroid/view/WindowInsets;

    if-ne v15, v14, :cond_7d

    .line 1120
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v2

    .line 1121
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v15

    .line 1122
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v14

    .line 1120
    invoke-virtual {v5, v2, v15, v6, v14}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object v5

    goto :goto_8f

    :cond_7d
    if-ne v15, v2, :cond_8f

    .line 1124
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v2

    .line 1125
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v14

    .line 1126
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v15

    .line 1124
    invoke-virtual {v5, v6, v2, v14, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object v5

    .line 1128
    :cond_8f
    :goto_8f
    invoke-virtual {v12, v5}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    goto :goto_d5

    .line 1132
    :cond_93
    iget-object v5, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onCustomAction:Ljava/lang/Object;

    check-cast v5, Landroid/view/WindowInsets;

    const/4 v14, 0x3

    if-ne v15, v14, :cond_ab

    .line 1134
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v2

    .line 1135
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v14

    .line 1136
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v15

    .line 1134
    invoke-virtual {v5, v2, v14, v6, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object v5

    goto :goto_bd

    :cond_ab
    if-ne v15, v2, :cond_bd

    .line 1138
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v2

    .line 1139
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v14

    .line 1140
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v15

    .line 1138
    invoke-virtual {v5, v6, v2, v14, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object v5

    .line 1142
    :cond_bd
    :goto_bd
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v2

    iput v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1143
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v2

    iput v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1144
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v2

    iput v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1145
    invoke-virtual {v5}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v2

    iput v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1150
    :cond_d5
    :goto_d5
    invoke-static {v12}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_f8

    .line 1152
    iget v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v2, v3, v2

    iget v5, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v2, v5

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1154
    iget v14, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int v14, v4, v14

    iget v13, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v14, v13

    invoke-static {v14, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v13

    .line 1156
    invoke-virtual {v12, v2, v13}, Landroid/view/View;->measure(II)V

    goto/16 :goto_18a

    :cond_f8
    const/high16 v5, 0x40000000    # 2.0f

    .line 1157
    invoke-static {v12}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_169

    .line 1158
    sget-boolean v2, Landroidx/drawerlayout/widget/DrawerLayout;->write:Z

    if-eqz v2, :cond_111

    .line 1159
    invoke-static {v12}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;)F

    move-result v2

    iget v14, v0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat:F

    cmpl-float v2, v2, v14

    if-eqz v2, :cond_111

    .line 1160
    invoke-static {v12, v14}, Lo/InvalidTypeIdException;->write(Landroid/view/View;F)V

    .line 1164
    :cond_111
    invoke-virtual {v0, v12}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result v2

    and-int/lit8 v2, v2, 0x7

    const/4 v14, 0x3

    if-ne v2, v14, :cond_11c

    const/4 v14, 0x1

    goto :goto_11d

    :cond_11c
    move v14, v6

    :goto_11d
    if-eqz v14, :cond_121

    if-nez v10, :cond_126

    :cond_121
    if-nez v14, :cond_143

    if-nez v11, :cond_126

    goto :goto_143

    .line 1170
    :cond_126
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Child drawer has absolute gravity "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1171
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {v2}, Landroidx/drawerlayout/widget/DrawerLayout;->write(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " but this DrawerLayout already has a drawer view along that edge"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_143
    :goto_143
    if-eqz v14, :cond_147

    const/4 v10, 0x1

    goto :goto_148

    :cond_147
    const/4 v11, 0x1

    .line 1179
    :goto_148
    iget v2, v0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromMediaId:I

    iget v14, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v14

    iget v14, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v2, v14

    iget v14, v13, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v15, p1

    invoke-static {v15, v2, v14}, Landroidx/drawerlayout/widget/DrawerLayout;->getChildMeasureSpec(III)I

    move-result v2

    .line 1182
    iget v14, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v5, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v14, v5

    iget v5, v13, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v13, p2

    invoke-static {v13, v14, v5}, Landroidx/drawerlayout/widget/DrawerLayout;->getChildMeasureSpec(III)I

    move-result v5

    .line 1185
    invoke-virtual {v12, v2, v5}, Landroid/view/View;->measure(II)V

    goto :goto_18e

    .line 1187
    :cond_169
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Child "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18a
    :goto_18a
    move/from16 v15, p1

    move/from16 v13, p2

    :goto_18e
    add-int/lit8 v9, v9, 0x1

    const/high16 v5, 0x40000000    # 2.0f

    goto/16 :goto_42

    :cond_194
    return-void

    .line 1090
    :cond_195
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DrawerLayout must be measured with MeasureSpec.EXACTLY."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 5

    .line 2072
    instance-of v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    if-nez v0, :cond_8

    .line 2073
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 2077
    :cond_8
    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    .line 2078
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->read()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 2080
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesImplApi21Parcelizer:I

    if-eqz v0, :cond_20

    .line 2081
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 2083
    invoke-direct {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaDescriptionCompat(Landroid/view/View;)V

    .line 2087
    :cond_20
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->RemoteActionCompatParcelizer:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2a

    .line 2088
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->RemoteActionCompatParcelizer:I

    invoke-virtual {p0, v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(II)V

    .line 2090
    :cond_2a
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->IconCompatParcelizer:I

    if-eq v0, v1, :cond_34

    .line 2091
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->IconCompatParcelizer:I

    const/4 v2, 0x5

    invoke-virtual {p0, v0, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(II)V

    .line 2093
    :cond_34
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->read:I

    if-eq v0, v1, :cond_40

    .line 2094
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->read:I

    const v2, 0x800003

    invoke-virtual {p0, v0, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(II)V

    .line 2096
    :cond_40
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesCompatParcelizer:I

    if-eq v0, v1, :cond_4c

    .line 2097
    iget p1, p1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesCompatParcelizer:I

    const v0, 0x800005

    invoke-virtual {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(II)V

    :cond_4c
    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .registers 2

    .line 1430
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .registers 10

    .line 2103
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2104
    new-instance v1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    invoke-direct {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 2106
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_f
    if-ge v3, v0, :cond_34

    .line 2108
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 2109
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 2111
    iget v5, v4, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    const/4 v6, 0x1

    if-ne v5, v6, :cond_22

    move v5, v6

    goto :goto_23

    :cond_22
    move v5, v2

    .line 2113
    :goto_23
    iget v7, v4, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    const/4 v8, 0x2

    if-eq v7, v8, :cond_29

    move v6, v2

    :cond_29
    if-nez v5, :cond_30

    if-nez v6, :cond_30

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    .line 2117
    :cond_30
    iget v0, v4, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    iput v0, v1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesImplApi21Parcelizer:I

    .line 2122
    :cond_34
    iget v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlay:I

    iput v0, v1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->RemoteActionCompatParcelizer:I

    .line 2123
    iget v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onMediaButtonEvent:I

    iput v0, v1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->IconCompatParcelizer:I

    .line 2124
    iget v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromSearch:I

    iput v0, v1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->read:I

    .line 2125
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromMediaId:I

    iput p0, v1, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesCompatParcelizer:I

    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 8

    .line 1619
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    invoke-virtual {v0, p1}, Lo/call;->IconCompatParcelizer(Landroid/view/MotionEvent;)V

    .line 1620
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    invoke-virtual {v0, p1}, Lo/call;->IconCompatParcelizer(Landroid/view/MotionEvent;)V

    .line 1622
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_5e

    if-eq v0, v1, :cond_1f

    const/4 p1, 0x3

    if-ne v0, p1, :cond_6c

    .line 1656
    invoke-direct {p0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Z)V

    .line 1657
    iput-boolean v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer:Z

    goto :goto_6c

    .line 1635
    :cond_1f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1636
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 1638
    iget-object v3, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    float-to-int v4, v0

    float-to-int v5, p1

    invoke-virtual {v3, v4, v5}, Lo/call;->read(II)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_59

    .line 1639
    invoke-static {v3}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_59

    .line 1640
    iget v3, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onAddQueueItem:F

    sub-float/2addr v0, v3

    .line 1641
    iget v3, p0, Landroidx/drawerlayout/widget/DrawerLayout;->handleMediaPlayPauseIfPendingOnHandler:F

    sub-float/2addr p1, v3

    .line 1642
    iget-object v3, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    invoke-virtual {v3}, Lo/call;->AudioAttributesImplBaseParcelizer()I

    move-result v3

    mul-float/2addr v0, v0

    mul-float/2addr p1, p1

    add-float/2addr v0, p1

    mul-int/2addr v3, v3

    int-to-float p1, v3

    cmpg-float p1, v0, p1

    if-gez p1, :cond_59

    .line 1645
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi21Parcelizer()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_59

    .line 1647
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_5a

    :cond_59
    move v2, v1

    .line 1651
    :cond_5a
    invoke-direct {p0, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Z)V

    goto :goto_6c

    .line 1626
    :cond_5e
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1627
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 1628
    iput v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onAddQueueItem:F

    .line 1629
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->handleMediaPlayPauseIfPendingOnHandler:F

    .line 1630
    iput-boolean v2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer:Z

    :cond_6c
    :goto_6c
    return v1
.end method

.method public final read(I)Ljava/lang/CharSequence;
    .registers 3

    .line 779
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    .line 778
    invoke-static {p1, v0}, Lo/_clearIfStdImpl;->write(II)I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_e

    .line 781
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSkipToQueueItem:Ljava/lang/CharSequence;

    return-object p0

    :cond_e
    const/4 v0, 0x5

    if-ne p1, v0, :cond_14

    .line 783
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onStop:Ljava/lang/CharSequence;

    return-object p0

    :cond_14
    const/4 p0, 0x0

    return-object p0
.end method

.method public final read()V
    .registers 2

    const/4 v0, 0x0

    .line 1682
    invoke-direct {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Z)V

    return-void
.end method

.method final read(ILandroid/view/View;)V
    .registers 7

    .line 846
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    invoke-virtual {v0}, Lo/call;->MediaBrowserCompatItemReceiver()I

    move-result v0

    .line 847
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    invoke-virtual {v1}, Lo/call;->MediaBrowserCompatItemReceiver()I

    move-result v1

    const/4 v2, 0x1

    if-eq v0, v2, :cond_19

    if-eq v1, v2, :cond_19

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1a

    if-ne v1, v3, :cond_17

    goto :goto_1a

    :cond_17
    const/4 v3, 0x0

    goto :goto_1a

    :cond_19
    move v3, v2

    :cond_1a
    :goto_1a
    if-eqz p2, :cond_3a

    if-nez p1, :cond_3a

    .line 859
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 860
    iget v0, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2f

    .line 861
    invoke-direct {p0, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplApi21Parcelizer(Landroid/view/View;)V

    goto :goto_3a

    .line 862
    :cond_2f
    iget p1, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v0

    if-nez p1, :cond_3a

    .line 863
    invoke-direct {p0, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatMediaItem(Landroid/view/View;)V

    .line 867
    :cond_3a
    :goto_3a
    iget p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaDescriptionCompat:I

    if-eq v3, p1, :cond_56

    .line 868
    iput v3, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaDescriptionCompat:I

    .line 870
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    if-eqz p1, :cond_56

    .line 873
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v2

    :goto_49
    if-ltz p1, :cond_56

    .line 875
    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;

    add-int/lit8 p1, p1, -0x1

    goto :goto_49

    :cond_56
    return-void
.end method

.method public final read(Landroid/view/View;)V
    .registers 3

    const/4 v0, 0x1

    .line 1809
    invoke-virtual {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Landroid/view/View;Z)V

    return-void
.end method

.method public final read(Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;)V
    .registers 2

    if-eqz p1, :cond_a

    .line 563
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onFastForward:Ljava/util/List;

    if-nez p0, :cond_7

    goto :goto_a

    .line 567
    :cond_7
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_a
    :goto_a
    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .registers 2

    .line 1671
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    if-eqz p1, :cond_9

    const/4 p1, 0x1

    .line 1674
    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Z)V

    :cond_9
    return-void
.end method

.method public requestLayout()V
    .registers 2

    .line 1352
    iget-boolean v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->RatingCompat:Z

    if-nez v0, :cond_7

    .line 1353
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_7
    return-void
.end method

.method public setChildInsets(Ljava/lang/Object;Z)V
    .registers 3

    .line 437
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCustomAction:Ljava/lang/Object;

    .line 438
    iput-boolean p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatMediaItem:Z

    if-nez p2, :cond_e

    .line 439
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_e

    const/4 p1, 0x1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    :goto_f
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 440
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDrawerElevation(F)V
    .registers 4

    .line 408
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat:F

    const/4 p1, 0x0

    .line 409
    :goto_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_1b

    .line 410
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 411
    invoke-static {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 412
    iget v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaMetadataCompat:F

    invoke-static {v0, v1}, Lo/InvalidTypeIdException;->write(Landroid/view/View;F)V

    :cond_18
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_1b
    return-void
.end method

.method public setDrawerListener(Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;)V
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 525
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPause:Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_7

    .line 526
    invoke-virtual {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->read(Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;)V

    :cond_7
    if-eqz p1, :cond_c

    .line 529
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;)V

    .line 533
    :cond_c
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPause:Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;

    return-void
.end method

.method public setDrawerLockMode(I)V
    .registers 3

    const/4 v0, 0x3

    .line 584
    invoke-virtual {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(II)V

    const/4 v0, 0x5

    .line 585
    invoke-virtual {p0, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(II)V

    return-void
.end method

.method public setDrawerLockMode(II)V
    .registers 6

    .line 609
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    .line 608
    invoke-static {p2, v0}, Lo/_clearIfStdImpl;->write(II)I

    move-result v0

    const/4 v1, 0x3

    if-eq p2, v1, :cond_21

    const/4 v2, 0x5

    if-eq p2, v2, :cond_1e

    const v2, 0x800003

    if-eq p2, v2, :cond_1b

    const v2, 0x800005

    if-ne p2, v2, :cond_23

    .line 622
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromMediaId:I

    goto :goto_23

    .line 619
    :cond_1b
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlayFromSearch:I

    goto :goto_23

    .line 616
    :cond_1e
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onMediaButtonEvent:I

    goto :goto_23

    .line 613
    :cond_21
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPlay:I

    :cond_23
    :goto_23
    if-eqz p1, :cond_2f

    if-ne v0, v1, :cond_2a

    .line 628
    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    goto :goto_2c

    :cond_2a
    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    .line 629
    :goto_2c
    invoke-virtual {p2}, Lo/call;->write()V

    :cond_2f
    const/4 p2, 0x1

    if-eq p1, p2, :cond_3f

    const/4 p2, 0x2

    if-ne p1, p2, :cond_48

    .line 633
    invoke-virtual {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_48

    .line 635
    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaDescriptionCompat(Landroid/view/View;)V

    return-void

    .line 639
    :cond_3f
    invoke-virtual {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_48

    .line 641
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->read(Landroid/view/View;)V

    :cond_48
    return-void
.end method

.method public setDrawerLockMode(ILandroid/view/View;)V
    .registers 4

    .line 667
    invoke-static {p2}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 671
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget p2, p2, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    .line 672
    invoke-virtual {p0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(II)V

    return-void

    .line 668
    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "View "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is not a drawer with appropriate layout_gravity"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setDrawerShadow(II)V
    .registers 4

    .line 497
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/_isNaN;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerShadow(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public setDrawerShadow(Landroid/graphics/drawable/Drawable;I)V
    .registers 5

    .line 463
    sget-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->write:Z

    if-nez v0, :cond_2c

    const v0, 0x800003

    and-int v1, p2, v0

    if-ne v1, v0, :cond_e

    .line 468
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRepeatMode:Landroid/graphics/drawable/Drawable;

    goto :goto_26

    :cond_e
    const v0, 0x800005

    and-int v1, p2, v0

    if-ne v1, v0, :cond_18

    .line 470
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSeekTo:Landroid/graphics/drawable/Drawable;

    goto :goto_26

    :cond_18
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x3

    if-ne v0, v1, :cond_20

    .line 472
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepareFromUri:Landroid/graphics/drawable/Drawable;

    goto :goto_26

    :cond_20
    const/4 v0, 0x5

    and-int/2addr p2, v0

    if-ne p2, v0, :cond_2c

    .line 474
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetCaptioningEnabled:Landroid/graphics/drawable/Drawable;

    .line 478
    :goto_26
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer()V

    .line 479
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2c
    return-void
.end method

.method public setDrawerTitle(ILjava/lang/CharSequence;)V
    .registers 4

    .line 760
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    .line 759
    invoke-static {p1, v0}, Lo/_clearIfStdImpl;->write(II)I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_e

    .line 762
    iput-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSkipToQueueItem:Ljava/lang/CharSequence;

    return-void

    :cond_e
    const/4 v0, 0x5

    if-ne p1, v0, :cond_13

    .line 764
    iput-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onStop:Ljava/lang/CharSequence;

    :cond_13
    return-void
.end method

.method public setScrimColor(I)V
    .registers 2

    .line 506
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onRemoveQueueItemAt:I

    .line 507
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStatusBarBackground(I)V
    .registers 3

    if-eqz p1, :cond_b

    .line 1412
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/_isNaN;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRating:Landroid/graphics/drawable/Drawable;

    .line 1413
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 1391
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRating:Landroid/graphics/drawable/Drawable;

    .line 1392
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setStatusBarBackgroundColor(I)V
    .registers 3

    .line 1424
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onSetRating:Landroid/graphics/drawable/Drawable;

    .line 1425
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method final write()Landroid/view/View;
    .registers 5

    .line 2024
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_1b

    .line 2026
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2027
    invoke-static {v2}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-static {v2}, Landroidx/drawerlayout/widget/DrawerLayout;->RatingCompat(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_18

    return-object v2

    :cond_18
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_1b
    const/4 p0, 0x0

    return-object p0
.end method

.method final write(Landroid/view/View;F)V
    .registers 5

    .line 968
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 969
    iget v1, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    cmpl-float v1, p2, v1

    if-nez v1, :cond_d

    return-void

    .line 973
    :cond_d
    iput p2, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    .line 974
    invoke-direct {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatSearchResultReceiver(Landroid/view/View;)V

    return-void
.end method

.method public final write(Landroid/view/View;Z)V
    .registers 7

    .line 1819
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_50

    .line 1823
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 1824
    iget-boolean v1, p0, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatSearchResultReceiver:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_17

    .line 1825
    iput v3, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->read:F

    .line 1826
    iput v2, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    goto :goto_4c

    :cond_17
    const/4 v1, 0x4

    if-eqz p2, :cond_43

    .line 1828
    iget p2, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    or-int/2addr p2, v1

    iput p2, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->write:I

    const/4 p2, 0x3

    .line 1830
    invoke-virtual {p0, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result p2

    if-eqz p2, :cond_35

    .line 1831
    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onCommand:Lo/call;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    .line 1832
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    .line 1831
    invoke-virtual {p2, p1, v0, v1}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/View;II)Z

    goto :goto_4c

    .line 1834
    :cond_35
    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout;->onPrepare:Lo/call;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p2, p1, v0, v1}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/View;II)Z

    goto :goto_4c

    .line 1837
    :cond_43
    invoke-direct {p0, p1, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;F)V

    .line 1838
    invoke-virtual {p0, v2, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->read(ILandroid/view/View;)V

    .line 1839
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1841
    :goto_4c
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 1820
    :cond_50
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "View "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a sliding drawer"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.AnonymousClass1 (androidx.drawerlayout.widget.DrawerLayout$1)
.class final Landroidx/drawerlayout/widget/DrawerLayout$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/drawerlayout/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;


# direct methods
.method constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;)V
    .registers 2

    .line 365
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$1;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 3

    .line 368
    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 369
    invoke-virtual {p2}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result p0

    if-lez p0, :cond_a

    const/4 p0, 0x1

    goto :goto_b

    :cond_a
    const/4 p0, 0x0

    :goto_b
    invoke-virtual {p1, p2, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->setChildInsets(Ljava/lang/Object;Z)V

    .line 370
    invoke-virtual {p2}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.AnonymousClass3 (androidx.drawerlayout.widget.DrawerLayout$3)
.class final Landroidx/drawerlayout/widget/DrawerLayout$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/modifyFieldName;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;


# direct methods
.method constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;)V
    .registers 2

    .line 259
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$3;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Landroid/view/View;)Z
    .registers 4

    .line 262
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesImplBaseParcelizer(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$3;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_16

    .line 263
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$3;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->read(Landroid/view/View;)V

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.AudioAttributesCompatParcelizer (androidx.drawerlayout.widget.DrawerLayout$AudioAttributesCompatParcelizer)
.class public abstract Landroidx/drawerlayout/widget/DrawerLayout$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AudioAttributesCompatParcelizer"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/View;)V
    .registers 2

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 2

    return-void
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.IconCompatParcelizer (androidx.drawerlayout.widget.DrawerLayout$IconCompatParcelizer)
.class final Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;
.super Lo/deserializeUsingCustom;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

.field private final write:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;)V
    .registers 2

    .line 2425
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-direct {p0}, Lo/deserializeUsingCustom;-><init>()V

    .line 2426
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;->write:Landroid/graphics/Rect;

    return-void
.end method

.method private RemoteActionCompatParcelizer(Lo/hasSuperClassStartingWith;Lo/hasSuperClassStartingWith;)V
    .registers 3

    .line 2518
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;->write:Landroid/graphics/Rect;

    .line 2520
    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->read(Landroid/graphics/Rect;)V

    .line 2521
    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->IconCompatParcelizer(Landroid/graphics/Rect;)V

    .line 2523
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->onSetShuffleMode()Z

    move-result p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->onPlayFromMediaId(Z)V

    .line 2524
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->MediaDescriptionCompat()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/CharSequence;)V

    .line 2525
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 2526
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->MediaBrowserCompatItemReceiver()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->IconCompatParcelizer(Ljava/lang/CharSequence;)V

    .line 2528
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->onPlayFromMediaId()Z

    move-result p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->MediaBrowserCompatCustomActionResultReceiver(Z)V

    .line 2529
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->onPlayFromUri()Z

    move-result p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->MediaBrowserCompatMediaItem(Z)V

    .line 2530
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->onAddQueueItem()Z

    move-result p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->RemoteActionCompatParcelizer(Z)V

    .line 2531
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->onPrepareFromUri()Z

    move-result p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->onCommand(Z)V

    .line 2533
    invoke-virtual {p2}, Lo/hasSuperClassStartingWith;->RemoteActionCompatParcelizer()I

    move-result p0

    invoke-virtual {p1, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(I)V

    return-void
.end method

.method private static read(Lo/hasSuperClassStartingWith;Landroid/view/ViewGroup;)V
    .registers 6

    .line 2502
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_17

    .line 2504
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2505
    invoke-static {v2}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 2506
    invoke-virtual {p0, v2}, Lo/hasSuperClassStartingWith;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    :cond_14
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_17
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 5

    .line 2475
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_27

    .line 2476
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object p1

    .line 2477
    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p2}, Landroidx/drawerlayout/widget/DrawerLayout;->write()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_25

    .line 2479
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;)I

    move-result p2

    .line 2480
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p0, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->read(I)Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_25

    .line 2482
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_25
    const/4 p0, 0x1

    return p0

    .line 2489
    :cond_27
    invoke-super {p0, p1, p2}, Lo/deserializeUsingCustom;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0

    return p0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 2463
    invoke-super {p0, p1, p2}, Lo/deserializeUsingCustom;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2465
    const-string p0, "androidx.drawerlayout.widget.DrawerLayout"

    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 6

    .line 2430
    sget-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_8

    .line 2431
    invoke-super {p0, p1, p2}, Lo/deserializeUsingCustom;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    goto :goto_2a

    .line 2436
    :cond_8
    invoke-static {p2}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Lo/hasSuperClassStartingWith;)Lo/hasSuperClassStartingWith;

    move-result-object v0

    .line 2437
    invoke-super {p0, p1, v0}, Lo/deserializeUsingCustom;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    .line 2439
    invoke-virtual {p2, p1}, Lo/hasSuperClassStartingWith;->write(Landroid/view/View;)V

    .line 2440
    invoke-static {p1}, Lo/InvalidTypeIdException;->onCustomAction(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v1

    .line 2441
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_1f

    .line 2442
    check-cast v1, Landroid/view/View;

    invoke-virtual {p2, v1}, Lo/hasSuperClassStartingWith;->IconCompatParcelizer(Landroid/view/View;)V

    .line 2444
    :cond_1f
    invoke-direct {p0, p2, v0}, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/hasSuperClassStartingWith;Lo/hasSuperClassStartingWith;)V

    .line 2445
    invoke-virtual {v0}, Lo/hasSuperClassStartingWith;->onSetCaptioningEnabled()V

    .line 2447
    check-cast p1, Landroid/view/ViewGroup;

    invoke-static {p2, p1}, Landroidx/drawerlayout/widget/DrawerLayout$IconCompatParcelizer;->read(Lo/hasSuperClassStartingWith;Landroid/view/ViewGroup;)V

    .line 2450
    :goto_2a
    const-string p0, "androidx.drawerlayout.widget.DrawerLayout"

    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->AudioAttributesCompatParcelizer(Ljava/lang/CharSequence;)V

    const/4 p0, 0x0

    .line 2455
    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->MediaDescriptionCompat(Z)V

    .line 2456
    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->MediaBrowserCompatMediaItem(Z)V

    .line 2457
    sget-object p0, Lo/hasSuperClassStartingWith$read;->MediaBrowserCompatSearchResultReceiver:Lo/hasSuperClassStartingWith$read;

    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->IconCompatParcelizer(Lo/hasSuperClassStartingWith$read;)Z

    .line 2458
    sget-object p0, Lo/hasSuperClassStartingWith$read;->read:Lo/hasSuperClassStartingWith$read;

    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->IconCompatParcelizer(Lo/hasSuperClassStartingWith$read;)Z

    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 5

    .line 2495
    sget-boolean v0, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer:Z

    if-nez v0, :cond_c

    invoke-static {p2}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_c

    const/4 p0, 0x0

    return p0

    .line 2496
    :cond_c
    invoke-super {p0, p1, p2, p3}, Lo/deserializeUsingCustom;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0

    return p0
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.LayoutParams (androidx.drawerlayout.widget.DrawerLayout$LayoutParams)
.class public Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field public IconCompatParcelizer:I

.field RemoteActionCompatParcelizer:Z

.field read:F

.field write:I


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, -0x1

    .line 2403
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 2388
    iput v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 2395
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2388
    iput v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    .line 2397
    sget-object v1, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2398
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    .line 2399
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 2

    .line 2417
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    .line 2388
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .registers 2

    .line 2421
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    .line 2388
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    return-void
.end method

.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;)V
    .registers 3

    .line 2412
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 v0, 0x0

    .line 2388
    iput v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    .line 2413
    iget p1, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->IconCompatParcelizer:I

    return-void
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.RemoteActionCompatParcelizer (androidx.drawerlayout.widget.DrawerLayout$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/drawerlayout/widget/DrawerLayout$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer(Landroid/view/View;)V
.end method

.method public abstract IconCompatParcelizer(Landroid/view/View;)V
.end method

.method public abstract RemoteActionCompatParcelizer(Landroid/view/View;)V
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.SavedState (androidx.drawerlayout.widget.DrawerLayout$SavedState)
.class public Landroidx/drawerlayout/widget/DrawerLayout$SavedState;
.super Landroidx/customview/view/AbsSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/drawerlayout/widget/DrawerLayout$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:I

.field AudioAttributesImplApi21Parcelizer:I

.field IconCompatParcelizer:I

.field RemoteActionCompatParcelizer:I

.field read:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 2199
    new-instance v0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState$3;

    invoke-direct {v0}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState$3;-><init>()V

    sput-object v0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 3

    .line 2177
    invoke-direct {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    const/4 p2, 0x0

    .line 2170
    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesImplApi21Parcelizer:I

    .line 2178
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesImplApi21Parcelizer:I

    .line 2179
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->RemoteActionCompatParcelizer:I

    .line 2180
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->IconCompatParcelizer:I

    .line 2181
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p2

    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->read:I

    .line 2182
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 2186
    invoke-direct {p0, p1}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    const/4 p1, 0x0

    .line 2170
    iput p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesImplApi21Parcelizer:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 2191
    invoke-super {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2192
    iget p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2193
    iget p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2194
    iget p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2195
    iget p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->read:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 2196
    iget p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.SavedState.AnonymousClass3 (androidx.drawerlayout.widget.DrawerLayout$SavedState$3)
.class final Landroidx/drawerlayout/widget/DrawerLayout$SavedState$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/drawerlayout/widget/DrawerLayout$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/drawerlayout/widget/DrawerLayout$SavedState;
    .registers 3

    .line 2202
    new-instance v0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    invoke-direct {v0, p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/drawerlayout/widget/DrawerLayout$SavedState;
    .registers 3

    .line 2207
    new-instance v0, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static read(I)[Landroidx/drawerlayout/widget/DrawerLayout$SavedState;
    .registers 1

    .line 2212
    new-array p0, p0, [Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 2199
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState$3;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 2199
    invoke-static {p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState$3;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 2199
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout$SavedState$3;->read(I)[Landroidx/drawerlayout/widget/DrawerLayout$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.read (androidx.drawerlayout.widget.DrawerLayout$read)
.class final Landroidx/drawerlayout/widget/DrawerLayout$read;
.super Lo/call$IconCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

.field final synthetic IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

.field private RemoteActionCompatParcelizer:Lo/call;

.field private final read:I


# direct methods
.method constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;I)V
    .registers 3

    .line 2227
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-direct {p0}, Lo/call$IconCompatParcelizer;-><init>()V

    .line 2221
    new-instance p1, Landroidx/drawerlayout/widget/DrawerLayout$read$4;

    invoke-direct {p1, p0}, Landroidx/drawerlayout/widget/DrawerLayout$read$4;-><init>(Landroidx/drawerlayout/widget/DrawerLayout$read;)V

    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    .line 2228
    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->read:I

    return-void
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 3

    .line 2278
    iget v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->read:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    const/4 v1, 0x5

    .line 2279
    :cond_6
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 2281
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p0, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->read(Landroid/view/View;)V

    :cond_13
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/view/View;)I
    .registers 2

    .line 2364
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;I)I
    .registers 3

    .line 2379
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 2236
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroid/view/View;II)V
    .registers 6

    .line 2255
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p3

    .line 2258
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_10

    add-int/2addr p2, p3

    int-to-float p2, p2

    goto :goto_18

    .line 2261
    :cond_10
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr v0, p2

    int-to-float p2, v0

    :goto_18
    int-to-float p3, p3

    div-float/2addr p2, p3

    .line 2264
    iget-object p3, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p3, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Landroid/view/View;F)V

    const/4 p3, 0x0

    cmpl-float p2, p2, p3

    if-nez p2, :cond_26

    const/4 p2, 0x4

    goto :goto_27

    :cond_26
    const/4 p2, 0x0

    .line 2265
    :goto_27
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 2266
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/View;I)I
    .registers 5

    .line 2369
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 2370
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    neg-int p0, p0

    const/4 p1, 0x0

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    .line 2372
    :cond_18
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    .line 2373
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    sub-int p1, p0, p1

    invoke-static {p2, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public final IconCompatParcelizer(I)V
    .registers 3

    .line 2249
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->RemoteActionCompatParcelizer:Lo/call;

    invoke-virtual {p0}, Lo/call;->AudioAttributesCompatParcelizer()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->read(ILandroid/view/View;)V

    return-void
.end method

.method public final IconCompatParcelizer(II)V
    .registers 4

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_c

    .line 2352
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object p1

    goto :goto_13

    .line 2354
    :cond_c
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object p1

    :goto_13
    if-eqz p1, :cond_22

    .line 2357
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_22

    .line 2358
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->RemoteActionCompatParcelizer:Lo/call;

    invoke-virtual {p0, p1, p2}, Lo/call;->read(Landroid/view/View;I)V

    :cond_22
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;I)V
    .registers 3

    .line 2271
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    const/4 p2, 0x0

    .line 2272
    iput-boolean p2, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->RemoteActionCompatParcelizer:Z

    .line 2274
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout$read;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method final read()V
    .registers 7

    .line 2312
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->RemoteActionCompatParcelizer:Lo/call;

    invoke-virtual {v0}, Lo/call;->AudioAttributesImplApi26Parcelizer()I

    move-result v0

    .line 2313
    iget v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->read:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-ne v1, v4, :cond_f

    move v1, v2

    goto :goto_10

    :cond_f
    move v1, v3

    :goto_10
    if-eqz v1, :cond_21

    .line 2315
    iget-object v5, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v5, v4}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1f

    .line 2316
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v3

    neg-int v3, v3

    :cond_1f
    add-int/2addr v3, v0

    goto :goto_2f

    .line 2318
    :cond_21
    iget-object v3, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v4, 0x5

    invoke-virtual {v3, v4}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(I)Landroid/view/View;

    move-result-object v4

    .line 2319
    iget-object v3, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int/2addr v3, v0

    :goto_2f
    if-eqz v4, :cond_67

    if-eqz v1, :cond_39

    .line 2322
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v0

    if-lt v0, v3, :cond_41

    :cond_39
    if-nez v1, :cond_67

    .line 2323
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v0

    if-le v0, v3, :cond_67

    :cond_41
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2324
    invoke-virtual {v0, v4}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_67

    .line 2325
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 2326
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->RemoteActionCompatParcelizer:Lo/call;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v1, v4, v3, v5}, Lo/call;->AudioAttributesCompatParcelizer(Landroid/view/View;II)Z

    .line 2327
    iput-boolean v2, v0, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->RemoteActionCompatParcelizer:Z

    .line 2328
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 2330
    invoke-direct {p0}, Landroidx/drawerlayout/widget/DrawerLayout$read;->RemoteActionCompatParcelizer()V

    .line 2332
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p0}, Landroidx/drawerlayout/widget/DrawerLayout;->AudioAttributesCompatParcelizer()V

    :cond_67
    return-void
.end method

.method public final read(Landroid/view/View;FF)V
    .registers 9

    .line 2289
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;)F

    move-result p3

    .line 2290
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 2293
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v2, 0x3

    invoke-virtual {v1, p1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    const/4 v3, 0x0

    if-eqz v1, :cond_22

    cmpl-float p2, p2, v3

    if-gtz p2, :cond_20

    if-nez p2, :cond_1e

    cmpl-float p2, p3, v2

    if-gtz p2, :cond_20

    :cond_1e
    neg-int p2, v0

    goto :goto_39

    :cond_20
    const/4 p2, 0x0

    goto :goto_39

    .line 2296
    :cond_22
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    cmpg-float v4, p2, v3

    if-ltz v4, :cond_37

    cmpl-float p2, p2, v3

    if-nez p2, :cond_35

    cmpl-float p2, p3, v2

    if-lez p2, :cond_35

    goto :goto_37

    :cond_35
    move p2, v1

    goto :goto_39

    :cond_37
    :goto_37
    sub-int p2, v1, v0

    .line 2300
    :goto_39
    iget-object p3, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->RemoteActionCompatParcelizer:Lo/call;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p3, p2, p1}, Lo/call;->RemoteActionCompatParcelizer(II)Z

    .line 2301
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final read(Lo/call;)V
    .registers 2

    .line 2232
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->RemoteActionCompatParcelizer:Lo/call;

    return-void
.end method

.method public final read(Landroid/view/View;I)Z
    .registers 4

    .line 2243
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->MediaBrowserCompatItemReceiver(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_1a

    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    iget v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->read:I

    invoke-virtual {p2, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->IconCompatParcelizer(Landroid/view/View;I)Z

    move-result p2

    if-eqz p2, :cond_1a

    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2244
    invoke-virtual {p0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->RemoteActionCompatParcelizer(Landroid/view/View;)I

    move-result p0

    if-nez p0, :cond_1a

    const/4 p0, 0x1

    return p0

    :cond_1a
    const/4 p0, 0x0

    return p0
.end method

.method public final write()V
    .registers 4

    .line 2306
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout;

    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read;->AudioAttributesCompatParcelizer:Ljava/lang/Runnable;

    const-wide/16 v1, 0xa0

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.read.AnonymousClass4 (androidx.drawerlayout.widget.DrawerLayout$read$4)
.class final Landroidx/drawerlayout/widget/DrawerLayout$read$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout$read;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout$read;


# direct methods
.method constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout$read;)V
    .registers 2

    .line 2221
    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$read$4;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout$read;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 2223
    iget-object p0, p0, Landroidx/drawerlayout/widget/DrawerLayout$read$4;->IconCompatParcelizer:Landroidx/drawerlayout/widget/DrawerLayout$read;

    invoke-virtual {p0}, Landroidx/drawerlayout/widget/DrawerLayout$read;->read()V

    return-void
.end method

###### Class androidx.drawerlayout.widget.DrawerLayout.write (androidx.drawerlayout.widget.DrawerLayout$write)
.class final Landroidx/drawerlayout/widget/DrawerLayout$write;
.super Lo/deserializeUsingCustom;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "write"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 2537
    invoke-direct {p0}, Lo/deserializeUsingCustom;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V
    .registers 3

    .line 2541
    invoke-super {p0, p1, p2}, Lo/deserializeUsingCustom;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Lo/hasSuperClassStartingWith;)V

    .line 2543
    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->write(Landroid/view/View;)Z

    move-result p0

    if-nez p0, :cond_d

    const/4 p0, 0x0

    .line 2547
    invoke-virtual {p2, p0}, Lo/hasSuperClassStartingWith;->IconCompatParcelizer(Landroid/view/View;)V

    :cond_d
    return-void
.end method
