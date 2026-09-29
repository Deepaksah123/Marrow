###### Class androidx.appcompat.widget.ActionBarOverlayLayout (androidx.appcompat.widget.ActionBarOverlayLayout)
.class public Landroidx/appcompat/widget/ActionBarOverlayLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lo/removeCancellable;
.implements Lo/resetAsArray;
.implements Lo/resetAsObject;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;,
        Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;
    }
.end annotation


# static fields
.field private static write:[I


# instance fields
.field AudioAttributesCompatParcelizer:Landroid/view/ViewPropertyAnimator;

.field private AudioAttributesImplApi21Parcelizer:Landroidx/core/view/WindowInsetsCompat;

.field private AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

.field private AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

.field private final MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

.field private final MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

.field private final MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

.field private MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

.field private MediaDescriptionCompat:Landroid/widget/OverScroller;

.field private MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

.field private final RatingCompat:Landroid/graphics/Rect;

.field final RemoteActionCompatParcelizer:Landroid/animation/AnimatorListenerAdapter;

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:Z

.field private onCommand:Landroidx/core/view/WindowInsetsCompat;

.field private onCustomAction:Z

.field private final onFastForward:Landroid/graphics/Rect;

.field private onMediaButtonEvent:Landroidx/core/view/WindowInsetsCompat;

.field private final onPause:Landroid/graphics/Rect;

.field private onPlay:Landroidx/core/view/WindowInsetsCompat;

.field private final onPlayFromMediaId:Landroid/graphics/Rect;

.field private final onPlayFromSearch:Ljava/lang/Runnable;

.field private final onPlayFromUri:Landroid/graphics/Rect;

.field private final onPrepare:Lo/rootArrayScope;

.field private onPrepareFromMediaId:I

.field private onPrepareFromSearch:Z

.field private onPrepareFromUri:I

.field private onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

.field read:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 147
    sget v0, Lo/_init_lambda5$read;->actionBarSize:I

    const v1, 0x1010059

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->write:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 155
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 159
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 71
    iput p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromUri:I

    .line 90
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    .line 91
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPause:Landroid/graphics/Rect;

    .line 92
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

    .line 95
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->RatingCompat:Landroid/graphics/Rect;

    .line 96
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onFastForward:Landroid/graphics/Rect;

    .line 97
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlayFromMediaId:Landroid/graphics/Rect;

    .line 98
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlayFromUri:Landroid/graphics/Rect;

    .line 101
    sget-object p2, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi21Parcelizer:Landroidx/core/view/WindowInsetsCompat;

    .line 102
    sget-object p2, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onMediaButtonEvent:Landroidx/core/view/WindowInsetsCompat;

    .line 103
    sget-object p2, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    .line 104
    sget-object p2, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer:Landroidx/core/view/WindowInsetsCompat;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlay:Landroidx/core/view/WindowInsetsCompat;

    .line 114
    new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$5;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$5;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->RemoteActionCompatParcelizer:Landroid/animation/AnimatorListenerAdapter;

    .line 128
    new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$2;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$2;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlayFromSearch:Ljava/lang/Runnable;

    .line 137
    new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$4;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$4;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V

    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

    .line 160
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer(Landroid/content/Context;)V

    .line 162
    new-instance p1, Lo/rootArrayScope;

    invoke-direct {p1}, Lo/rootArrayScope;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepare:Lo/rootArrayScope;

    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer()V
    .registers 1

    .line 741
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    .line 742
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;
    .registers 3

    .line 394
    new-instance v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method private IconCompatParcelizer(Landroid/content/Context;)V
    .registers 6

    .line 166
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->write:[I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x0

    .line 167
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplBaseParcelizer:I

    const/4 v2, 0x1

    .line 168
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-nez v3, :cond_20

    move v3, v2

    goto :goto_21

    :cond_20
    move v3, v1

    .line 169
    :goto_21
    invoke-virtual {p0, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 170
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 172
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v3, 0x13

    if-ge v0, v3, :cond_32

    move v1, v2

    :cond_32
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCustomAction:Z

    .line 175
    new-instance v0, Landroid/widget/OverScroller;

    invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaDescriptionCompat:Landroid/widget/OverScroller;

    return-void
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 4

    .line 731
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    .line 732
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

    const-wide/16 v1, 0x258

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private MediaBrowserCompatMediaItem()I
    .registers 1

    .line 707
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    if-eqz p0, :cond_b

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarContainer;->getTranslationY()F

    move-result p0

    float-to-int p0, p0

    neg-int p0, p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method private static MediaBrowserCompatSearchResultReceiver()Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;
    .registers 1

    .line 389
    new-instance v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    invoke-direct {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;-><init>()V

    return-object v0
.end method

.method private MediaDescriptionCompat()V
    .registers 1

    .line 736
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    .line 737
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlayFromSearch:Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private MediaMetadataCompat()V
    .registers 2

    .line 674
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    if-nez v0, :cond_24

    .line 675
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->action_bar_activity_content:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 676
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->action_bar_container:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContainer;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    .line 677
    sget v0, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->action_bar:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->read(Landroid/view/View;)Lo/ActionBarLayoutParams;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    :cond_24
    return-void
.end method

.method private RatingCompat()V
    .registers 4

    .line 726
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    .line 727
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlayFromSearch:Ljava/lang/Runnable;

    const-wide/16 v1, 0x258

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private RemoteActionCompatParcelizer(F)Z
    .registers 11

    .line 746
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaDescriptionCompat:Landroid/widget/OverScroller;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    float-to-int v4, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    invoke-virtual/range {v0 .. v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 747
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaDescriptionCompat:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I

    move-result p1

    .line 748
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    if-le p1, p0, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_20
    const/4 p0, 0x0

    return p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .registers 7

    .line 288
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    .line 289
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, p1, Landroid/graphics/Rect;->left:I

    const/4 v2, 0x1

    if-eq v0, v1, :cond_13

    .line 291
    iget v0, p1, Landroid/graphics/Rect;->left:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move v0, v2

    goto :goto_14

    :cond_13
    const/4 v0, 0x0

    .line 293
    :goto_14
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, p1, Landroid/graphics/Rect;->top:I

    if-eq v1, v3, :cond_1f

    .line 295
    iget v0, p1, Landroid/graphics/Rect;->top:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move v0, v2

    .line 297
    :cond_1f
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v3, p1, Landroid/graphics/Rect;->right:I

    if-eq v1, v3, :cond_2a

    .line 299
    iget v0, p1, Landroid/graphics/Rect;->right:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v0, v2

    :cond_2a
    if-eqz p2, :cond_37

    .line 301
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    if-eq p2, v1, :cond_37

    .line 303
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    iput p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return v2

    :cond_37
    return v0
.end method

.method private static read(Landroid/view/View;)Lo/ActionBarLayoutParams;
    .registers 3

    .line 682
    instance-of v0, p0, Lo/ActionBarLayoutParams;

    if-eqz v0, :cond_7

    .line 683
    check-cast p0, Lo/ActionBarLayoutParams;

    return-object p0

    .line 684
    :cond_7
    instance-of v0, p0, Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_12

    .line 685
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->handleMediaPlayPauseIfPendingOnHandler()Lo/ActionBarLayoutParams;

    move-result-object p0

    return-object p0

    .line 687
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t make a decor toolbar out of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 688
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 718
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlayFromSearch:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 719
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 720
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer:Landroid/view/ViewPropertyAnimator;

    if-eqz p0, :cond_11

    .line 721
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    :cond_11
    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroid/view/View;IIIII)V
    .registers 7

    if-nez p6, :cond_5

    .line 592
    invoke-virtual/range {p0 .. p5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScroll(Landroid/view/View;IIII)V

    :cond_5
    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 1

    .line 828
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 829
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0}, Lo/ActionBarLayoutParams;->MediaMetadataCompat()Z

    move-result p0

    return p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Z
    .registers 1

    .line 840
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 841
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0}, Lo/ActionBarLayoutParams;->RatingCompat()Z

    move-result p0

    return p0
.end method

.method public final IconCompatParcelizer()V
    .registers 1

    .line 876
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 877
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0}, Lo/ActionBarLayoutParams;->write()V

    return-void
.end method

.method public final IconCompatParcelizer(I)V
    .registers 3

    .line 771
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    const/4 v0, 0x2

    if-eq p1, v0, :cond_12

    const/4 v0, 0x5

    if-eq p1, v0, :cond_12

    const/16 v0, 0x6d

    if-eq p1, v0, :cond_e

    return-void

    :cond_e
    const/4 p1, 0x1

    .line 780
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setOverlayMode(Z)V

    :cond_12
    return-void
.end method

.method public IconCompatParcelizer(Landroid/view/View;Landroid/view/View;II)Z
    .registers 5

    if-nez p4, :cond_a

    .line 571
    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result p0

    if-eqz p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()Z
    .registers 1

    .line 834
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 835
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0}, Lo/ActionBarLayoutParams;->MediaBrowserCompatSearchResultReceiver()Z

    move-result p0

    return p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;I)V
    .registers 3

    if-nez p2, :cond_5

    .line 584
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStopNestedScroll(Landroid/view/View;)V

    :cond_5
    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;II[II)V
    .registers 6

    if-nez p5, :cond_5

    .line 599
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_5
    return-void
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 846
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 847
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0}, Lo/ActionBarLayoutParams;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    return p0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 2

    .line 404
    instance-of p0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    return p0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 7

    .line 543
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 544
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3d

    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCustomAction:Z

    if-nez v0, :cond_3d

    .line 545
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_27

    .line 546
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContainer;->getTranslationY()F

    move-result v2

    add-float/2addr v0, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v0, v2

    float-to-int v0, v0

    goto :goto_28

    :cond_27
    move v0, v1

    .line 548
    :goto_28
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    .line 549
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    add-int/2addr v4, v0

    .line 548
    invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 550
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onRemoveQueueItemAt:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_3d
    return-void
.end method

.method protected fitSystemWindows(Landroid/graphics/Rect;)Z
    .registers 2

    .line 313
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result p0

    return p0
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 1

    .line 63
    invoke-static {}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver()Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 63
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 399
    new-instance p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public getNestedScrollAxes()I
    .registers 1

    .line 670
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepare:Lo/rootArrayScope;

    invoke-virtual {p0}, Lo/rootArrayScope;->IconCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 7

    .line 347
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 349
    invoke-static {p1, p0}, Landroidx/core/view/WindowInsetsCompat;->write(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    .line 351
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    .line 352
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v1

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatItemReceiver()I

    move-result v2

    .line 353
    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v4

    invoke-direct {v3, v0, v1, v2, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 356
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result v0

    .line 360
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    invoke-static {p0, p1, v1}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;Landroid/graphics/Rect;)Landroidx/core/view/WindowInsetsCompat;

    .line 361
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, v1, v2, v3, v4}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(IIII)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v1

    iput-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi21Parcelizer:Landroidx/core/view/WindowInsetsCompat;

    .line 364
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onMediaButtonEvent:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4b

    .line 366
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi21Parcelizer:Landroidx/core/view/WindowInsetsCompat;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onMediaButtonEvent:Landroidx/core/view/WindowInsetsCompat;

    const/4 v0, 0x1

    .line 368
    :cond_4b
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPause:Landroid/graphics/Rect;

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5d

    .line 370
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPause:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_5f

    :cond_5d
    if-eqz v0, :cond_62

    .line 374
    :goto_5f
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 381
    :cond_62
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->read()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    .line 382
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    .line 383
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat;->write()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    .line 384
    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatMediaItem()Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    .line 241
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer(Landroid/content/Context;)V

    .line 243
    invoke-static {p0}, Lo/InvalidTypeIdException;->onSetRepeatMode(Landroid/view/View;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 1

    .line 180
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 181
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 10

    .line 520
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    .line 522
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    .line 523
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    const/4 p4, 0x0

    :goto_d
    if-ge p4, p1, :cond_37

    .line 526
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    .line 527
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_34

    .line 528
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    .line 530
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 531
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 533
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, p2

    .line 534
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v0, p3

    add-int/2addr v1, v3

    add-int/2addr v2, v0

    .line 536
    invoke-virtual {p5, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    :cond_34
    add-int/lit8 p4, p4, 0x1

    goto :goto_d

    :cond_37
    return-void
.end method

.method protected onMeasure(II)V
    .registers 14

    .line 410
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 419
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 420
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    .line 421
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    .line 422
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, v2

    add-int/2addr v1, v3

    const/4 v2, 0x0

    .line 421
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 423
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    .line 424
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v3, v4

    add-int/2addr v3, v0

    .line 423
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 425
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarContainer;->getMeasuredState()I

    move-result v3

    invoke-static {v2, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v3

    .line 427
    invoke-static {p0}, Lo/InvalidTypeIdException;->onPause(Landroid/view/View;)I

    move-result v4

    and-int/lit16 v4, v4, 0x100

    const/4 v5, 0x1

    if-eqz v4, :cond_4b

    move v4, v5

    goto :goto_4c

    :cond_4b
    move v4, v2

    :goto_4c
    if-eqz v4, :cond_60

    .line 433
    iget v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplBaseParcelizer:I

    .line 434
    iget-boolean v7, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v7, :cond_72

    .line 435
    iget-object v7, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v7}, Landroidx/appcompat/widget/ActionBarContainer;->RemoteActionCompatParcelizer()Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_72

    .line 438
    iget v7, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplBaseParcelizer:I

    add-int/2addr v6, v7

    goto :goto_72

    .line 441
    :cond_60
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-eq v6, v7, :cond_71

    .line 444
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    goto :goto_72

    :cond_71
    move v6, v2

    .line 451
    :cond_72
    :goto_72
    iget-object v7, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    invoke-virtual {v7, v8}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 453
    iget-object v7, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi21Parcelizer:Landroidx/core/view/WindowInsetsCompat;

    iput-object v7, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    .line 458
    iget-boolean v8, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromSearch:Z

    if-nez v8, :cond_99

    if-nez v4, :cond_99

    .line 459
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

    iget v7, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v6

    iput v7, v4, Landroid/graphics/Rect;->top:I

    .line 460
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

    iget v7, v4, Landroid/graphics/Rect;->bottom:I

    iput v7, v4, Landroid/graphics/Rect;->bottom:I

    .line 464
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v4, v2, v6, v2, v2}, Landroidx/core/view/WindowInsetsCompat;->IconCompatParcelizer(IIII)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v2

    iput-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    goto :goto_c5

    .line 470
    :cond_99
    invoke-virtual {v7}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    .line 471
    invoke-virtual {v4}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v4

    iget-object v7, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    .line 472
    invoke-virtual {v7}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatItemReceiver()I

    move-result v7

    iget-object v8, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    .line 473
    invoke-virtual {v8}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v8

    add-int/2addr v4, v6

    .line 469
    invoke-static {v2, v4, v7, v8}, Lo/_verifyEndArrayForSingle;->read(IIII)Lo/_verifyEndArrayForSingle;

    move-result-object v2

    .line 475
    new-instance v4, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;

    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    invoke-direct {v4, v6}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    .line 476
    invoke-virtual {v4, v2}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write(Lo/_verifyEndArrayForSingle;)Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;

    move-result-object v2

    .line 477
    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat$RemoteActionCompatParcelizer;->write()Landroidx/core/view/WindowInsetsCompat;

    move-result-object v2

    iput-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    .line 483
    :goto_c5
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatMediaItem:Landroid/graphics/Rect;

    invoke-static {v2, v4, v5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 488
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlay:Landroidx/core/view/WindowInsetsCompat;

    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_df

    .line 489
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCommand:Landroidx/core/view/WindowInsetsCompat;

    iput-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPlay:Landroidx/core/view/WindowInsetsCompat;

    .line 490
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    invoke-static {v4, v2}, Lo/InvalidTypeIdException;->write(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    .line 496
    :cond_df
    iget-object v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v5, p0

    move v7, p1

    move v9, p2

    invoke-virtual/range {v5 .. v10}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 497
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;

    .line 498
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 499
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v6, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    add-int/2addr v4, v6

    .line 498
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 500
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 501
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v5

    add-int/2addr v4, v2

    .line 500
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 502
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat:Landroidx/appcompat/widget/ContentFrameLayout;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMeasuredState()I

    move-result v2

    invoke-static {v3, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    .line 505
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    .line 506
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v0, v5

    .line 509
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->getSuggestedMinimumHeight()I

    move-result v5

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v3, v4

    add-int/2addr v1, v3

    .line 510
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 513
    invoke-static {v1, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    shl-int/lit8 v1, v2, 0x10

    .line 514
    invoke-static {v0, p2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    .line 512
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setMeasuredDimension(II)V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 5

    .line 646
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onAddQueueItem:Z

    if-eqz p1, :cond_17

    if-eqz p4, :cond_17

    .line 649
    invoke-direct {p0, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->RemoteActionCompatParcelizer(F)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 650
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer()V

    goto :goto_13

    .line 652
    :cond_10
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaDescriptionCompat()V

    :goto_13
    const/4 p1, 0x1

    .line 654
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->read:Z

    return p1

    :cond_17
    const/4 p0, 0x0

    return p0
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 4

    const/4 p0, 0x0

    return p0
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .registers 5

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .registers 6

    .line 626
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->handleMediaPlayPauseIfPendingOnHandler:I

    add-int/2addr p1, p3

    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 627
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .registers 4

    .line 615
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepare:Lo/rootArrayScope;

    invoke-virtual {p1, p3}, Lo/rootArrayScope;->IconCompatParcelizer(I)V

    .line 616
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatMediaItem()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->handleMediaPlayPauseIfPendingOnHandler:I

    .line 617
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    .line 618
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

    if-eqz p0, :cond_15

    .line 619
    invoke-interface {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;->MediaMetadataCompat()V

    :cond_15
    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .registers 4

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_f

    .line 607
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_f

    .line 610
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onAddQueueItem:Z

    return p0

    :cond_f
    const/4 p0, 0x0

    return p0
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .registers 3

    .line 632
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onAddQueueItem:Z

    if-eqz p1, :cond_19

    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->read:Z

    if-nez p1, :cond_19

    .line 633
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->handleMediaPlayPauseIfPendingOnHandler:I

    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-gt p1, v0, :cond_16

    .line 634
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->RatingCompat()V

    goto :goto_19

    .line 636
    :cond_16
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatCustomActionResultReceiver()V

    :cond_19
    :goto_19
    return-void
.end method

.method public onWindowSystemUiVisibilityChanged(I)V
    .registers 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 254
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowSystemUiVisibilityChanged(I)V

    .line 256
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 257
    iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromMediaId:I

    .line 258
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromMediaId:I

    and-int/lit8 v1, p1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_13

    :cond_12
    move v1, v3

    :goto_13
    and-int/lit16 v4, p1, 0x100

    if-eqz v4, :cond_18

    goto :goto_19

    :cond_18
    move v2, v3

    .line 261
    :goto_19
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

    if-eqz v3, :cond_31

    xor-int/lit8 v4, v2, 0x1

    .line 265
    invoke-interface {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer(Z)V

    if-nez v1, :cond_2c

    if-eqz v2, :cond_2c

    .line 267
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

    invoke-interface {v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;->MediaDescriptionCompat()V

    goto :goto_31

    .line 266
    :cond_2c
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

    invoke-interface {v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;->MediaBrowserCompatSearchResultReceiver()V

    :cond_31
    :goto_31
    xor-int/2addr p1, v0

    and-int/lit16 p1, p1, 0x100

    if-eqz p1, :cond_3d

    .line 270
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

    if-eqz p1, :cond_3d

    .line 271
    invoke-static {p0}, Lo/InvalidTypeIdException;->onSetRepeatMode(Landroid/view/View;)V

    :cond_3d
    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .registers 2

    .line 278
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V

    .line 279
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromUri:I

    .line 280
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

    if-eqz p0, :cond_c

    .line 281
    invoke-interface {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer(I)V

    :cond_c
    return-void
.end method

.method public read(Landroid/view/View;IIIII[I)V
    .registers 8

    .line 564
    invoke-virtual/range {p0 .. p6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;IIIII)V

    return-void
.end method

.method public read(Landroid/view/View;Landroid/view/View;II)V
    .registers 5

    if-nez p4, :cond_5

    .line 577
    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_5
    return-void
.end method

.method public final read()Z
    .registers 1

    .line 211
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromSearch:Z

    return p0
.end method

.method public setActionBarHideOffset(I)V
    .registers 4

    .line 711
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    .line 712
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    .line 713
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 714
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    neg-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarContainer;->setTranslationY(F)V

    return-void
.end method

.method public setActionBarVisibilityCallback(Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;)V
    .registers 3

    .line 185
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

    .line 186
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_19

    .line 189
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesImplApi26Parcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;

    iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromUri:I

    invoke-interface {p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;->RemoteActionCompatParcelizer(I)V

    .line 190
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromMediaId:I

    if-eqz p1, :cond_19

    .line 192
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onWindowSystemUiVisibilityChanged(I)V

    .line 193
    invoke-static {p0}, Lo/InvalidTypeIdException;->onSetRepeatMode(Landroid/view/View;)V

    :cond_19
    return-void
.end method

.method public setHasNonEmbeddedTabs(Z)V
    .registers 2

    .line 215
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    return-void
.end method

.method public setHideOnContentScrollEnabled(Z)V
    .registers 3

    .line 693
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onAddQueueItem:Z

    if-eq p1, v0, :cond_f

    .line 694
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onAddQueueItem:Z

    if-nez p1, :cond_f

    .line 696
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    const/4 p1, 0x0

    .line 697
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    :cond_f
    return-void
.end method

.method public setIcon(I)V
    .registers 2

    .line 804
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 805
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0, p1}, Lo/ActionBarLayoutParams;->AudioAttributesCompatParcelizer(I)V

    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 810
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 811
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0, p1}, Lo/ActionBarLayoutParams;->read(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setLogo(I)V
    .registers 2

    .line 816
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 817
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0, p1}, Lo/ActionBarLayoutParams;->IconCompatParcelizer(I)V

    return-void
.end method

.method public setMenu(Landroid/view/Menu;Lo/peekAvailableContext$AudioAttributesCompatParcelizer;)V
    .registers 3

    .line 858
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 859
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0, p1, p2}, Lo/ActionBarLayoutParams;->RemoteActionCompatParcelizer(Landroid/view/Menu;Lo/peekAvailableContext$AudioAttributesCompatParcelizer;)V

    return-void
.end method

.method public setMenuPrepared()V
    .registers 1

    .line 852
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 853
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0}, Lo/ActionBarLayoutParams;->MediaBrowserCompatMediaItem()V

    return-void
.end method

.method public setOverlayMode(Z)V
    .registers 3

    .line 199
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onPrepareFromSearch:Z

    if-eqz p1, :cond_14

    .line 206
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v0, 0x13

    if-ge p1, v0, :cond_14

    const/4 p1, 0x1

    goto :goto_15

    :cond_14
    const/4 p1, 0x0

    :goto_15
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onCustomAction:Z

    return-void
.end method

.method public setShowingForActionMode(Z)V
    .registers 2

    return-void
.end method

.method public setUiOptions(I)V
    .registers 2

    return-void
.end method

.method public setWindowCallback(Landroid/view/Window$Callback;)V
    .registers 2

    .line 753
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 754
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0, p1}, Lo/ActionBarLayoutParams;->read(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public setWindowTitle(Ljava/lang/CharSequence;)V
    .registers 2

    .line 759
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 760
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0, p1}, Lo/ActionBarLayoutParams;->write(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final write()Z
    .registers 1

    .line 822
    invoke-direct {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaMetadataCompat()V

    .line 823
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->MediaBrowserCompatSearchResultReceiver:Lo/ActionBarLayoutParams;

    invoke-interface {p0}, Lo/ActionBarLayoutParams;->IconCompatParcelizer()Z

    move-result p0

    return p0
.end method

###### Class androidx.appcompat.widget.ActionBarOverlayLayout.AnonymousClass2 (androidx.appcompat.widget.ActionBarOverlayLayout$2)
.class final Landroidx/appcompat/widget/ActionBarOverlayLayout$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionBarOverlayLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V
    .registers 2

    .line 128
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$2;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 131
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$2;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    .line 132
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$2;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContainer;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$2;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->RemoteActionCompatParcelizer:Landroid/animation/AnimatorListenerAdapter;

    .line 133
    invoke-virtual {v1, p0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    iput-object p0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer:Landroid/view/ViewPropertyAnimator;

    return-void
.end method

###### Class androidx.appcompat.widget.ActionBarOverlayLayout.AnonymousClass4 (androidx.appcompat.widget.ActionBarOverlayLayout$4)
.class final Landroidx/appcompat/widget/ActionBarOverlayLayout$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionBarOverlayLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V
    .registers 2

    .line 137
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 140
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer()V

    .line 141
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContainer;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarContainer;

    .line 142
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$4;->IconCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->RemoteActionCompatParcelizer:Landroid/animation/AnimatorListenerAdapter;

    .line 143
    invoke-virtual {v1, p0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    iput-object p0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer:Landroid/view/ViewPropertyAnimator;

    return-void
.end method

###### Class androidx.appcompat.widget.ActionBarOverlayLayout.AnonymousClass5 (androidx.appcompat.widget.ActionBarOverlayLayout$5)
.class final Landroidx/appcompat/widget/ActionBarOverlayLayout$5;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionBarOverlayLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V
    .registers 2

    .line 114
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .registers 3

    .line 123
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer:Landroid/view/ViewPropertyAnimator;

    .line 124
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->read:Z

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    .line 117
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->AudioAttributesCompatParcelizer:Landroid/view/ViewPropertyAnimator;

    .line 118
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->read:Z

    return-void
.end method

###### Class androidx.appcompat.widget.ActionBarOverlayLayout.IconCompatParcelizer (androidx.appcompat.widget.ActionBarOverlayLayout$IconCompatParcelizer)
.class public interface abstract Landroidx/appcompat/widget/ActionBarOverlayLayout$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionBarOverlayLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IconCompatParcelizer"
.end annotation


# virtual methods
.method public abstract AudioAttributesImplApi21Parcelizer(Z)V
.end method

.method public abstract MediaBrowserCompatSearchResultReceiver()V
.end method

.method public abstract MediaDescriptionCompat()V
.end method

.method public abstract MediaMetadataCompat()V
.end method

.method public abstract RemoteActionCompatParcelizer(I)V
.end method

###### Class androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams (androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams)
.class public Landroidx/appcompat/widget/ActionBarOverlayLayout$LayoutParams;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionBarOverlayLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, -0x1

    .line 886
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 882
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 2

    .line 890
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
