###### Class androidx.coordinatorlayout.widget.CoordinatorLayout (androidx.coordinatorlayout.widget.CoordinatorLayout)
.class public Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lo/resetAsArray;
.implements Lo/resetAsObject;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$read;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$write;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;,
        Landroidx/coordinatorlayout/widget/CoordinatorLayout$MediaBrowserCompatItemReceiver;
    }
.end annotation


# static fields
.field private static AudioAttributesCompatParcelizer:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static IconCompatParcelizer:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor<",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private static final MediaBrowserCompatItemReceiver:Lo/rewrapCtorProblem$IconCompatParcelizer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/rewrapCtorProblem$IconCompatParcelizer<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private static RemoteActionCompatParcelizer:Ljava/lang/String;

.field private static write:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final AudioAttributesImplApi21Parcelizer:[I

.field private AudioAttributesImplApi26Parcelizer:Landroid/view/View;

.field private AudioAttributesImplBaseParcelizer:Lo/finishBranchObject;

.field private final MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/_handleIncompatibleUpdateValue<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private MediaBrowserCompatMediaItem:Z

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/View;

.field private MediaDescriptionCompat:[I

.field private final MediaMetadataCompat:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private RatingCompat:Z

.field private final handleMediaPlayPauseIfPendingOnHandler:[I

.field private final onAddQueueItem:Lo/rootArrayScope;

.field private onCommand:Z

.field private onCustomAction:Landroidx/core/view/WindowInsetsCompat;

.field private final onFastForward:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

.field private final onPlay:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

.field read:Landroid/view/ViewGroup$OnHierarchyChangeListener;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 118
    const-class v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 119
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 127
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$MediaBrowserCompatItemReceiver;

    invoke-direct {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$MediaBrowserCompatItemReceiver;-><init>()V

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write:Ljava/util/Comparator;

    .line 133
    const-class v0, Landroid/content/Context;

    const-class v1, Landroid/util/AttributeSet;

    filled-new-array {v0, v1}, [Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer:[Ljava/lang/Class;

    .line 138
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer:Ljava/lang/ThreadLocal;

    .line 152
    new-instance v0, Lo/rewrapCtorProblem$read;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lo/rewrapCtorProblem$read;-><init>(I)V

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatItemReceiver:Lo/rewrapCtorProblem$IconCompatParcelizer;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 207
    invoke-direct {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 211
    sget v0, Lo/StdDeserializer$RemoteActionCompatParcelizer;->coordinatorLayoutStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 13

    .line 216
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 168
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    .line 169
    new-instance v0, Lo/_handleIncompatibleUpdateValue;

    invoke-direct {v0}, Lo/_handleIncompatibleUpdateValue;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onFastForward:Ljava/util/List;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlay:Ljava/util/List;

    const/4 v0, 0x2

    .line 178
    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi21Parcelizer:[I

    .line 182
    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->handleMediaPlayPauseIfPendingOnHandler:[I

    .line 203
    new-instance v0, Lo/rootArrayScope;

    invoke-direct {v0}, Lo/rootArrayScope;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onAddQueueItem:Lo/rootArrayScope;

    const/4 v0, 0x0

    if-nez p3, :cond_3b

    .line 218
    sget-object v1, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout:[I

    sget v2, Lo/StdDeserializer$write;->Widget_Support_CoordinatorLayout:I

    .line 219
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    goto :goto_41

    :cond_3b
    sget-object v1, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout:[I

    .line 221
    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    :goto_41
    if-nez p3, :cond_50

    .line 225
    sget-object v4, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout:[I

    const/4 v7, 0x0

    sget v8, Lo/StdDeserializer$write;->Widget_Support_CoordinatorLayout:I

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, v1

    invoke-virtual/range {v2 .. v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    goto :goto_5b

    .line 229
    :cond_50
    sget-object v4, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout:[I

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, v1

    move v7, p3

    invoke-virtual/range {v2 .. v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 234
    :goto_5b
    sget p2, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_keylines:I

    invoke-virtual {v1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eqz p2, :cond_84

    .line 236
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 237
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object p2

    iput-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaDescriptionCompat:[I

    .line 238
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 239
    iget-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaDescriptionCompat:[I

    array-length p2, p2

    :goto_76
    if-ge v0, p2, :cond_84

    .line 241
    iget-object p3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaDescriptionCompat:[I

    aget v2, p3, v0

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    aput v2, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_76

    .line 244
    :cond_84
    sget p1, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_statusBarBackground:I

    invoke-virtual {v1, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    .line 245
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 247
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read()V

    .line 248
    new-instance p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;

    invoke-direct {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 250
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatItemReceiver(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_a4

    const/4 p1, 0x1

    .line 252
    invoke-static {p0, p1}, Lo/InvalidTypeIdException;->AudioAttributesImplBaseParcelizer(Landroid/view/View;I)V

    :cond_a4
    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)I
    .registers 1

    if-nez p0, :cond_4

    const/16 p0, 0x11

    :cond_4
    return p0
.end method

.method private static AudioAttributesCompatParcelizer()Landroid/graphics/Rect;
    .registers 1

    .line 156
    sget-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatItemReceiver:Lo/rewrapCtorProblem$IconCompatParcelizer;

    invoke-interface {v0}, Lo/rewrapCtorProblem$IconCompatParcelizer;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-nez v0, :cond_f

    .line 158
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    :cond_f
    return-object v0
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/view/View;I)V
    .registers 4

    .line 1503
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1504
    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:I

    if-eq v1, p1, :cond_13

    .line 1505
    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:I

    sub-int v1, p1, v1

    .line 1506
    invoke-static {p0, v1}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;I)V

    .line 1507
    iput p1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:I

    :cond_13
    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 2

    .line 953
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 954
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;ZLandroid/graphics/Rect;)V
    .registers 6

    .line 979
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_28

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_28

    if-eqz p2, :cond_14

    .line 984
    invoke-direct {p0, p1, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void

    .line 986
    :cond_14
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    invoke-virtual {p3, p0, p2, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    .line 980
    :cond_28
    invoke-virtual {p3}, Landroid/graphics/Rect;->setEmpty()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;Landroid/graphics/Rect;II)V
    .registers 12

    .line 1066
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1067
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 1070
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v4, p2, Landroid/graphics/Rect;->left:I

    .line 1072
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    iget v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v0, v5

    sub-int/2addr v0, p3

    sub-int/2addr v0, v6

    .line 1071
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v2, v3

    .line 1070
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1073
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, p2, Landroid/graphics/Rect;->top:I

    .line 1075
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v1, p0

    sub-int/2addr v1, p4

    sub-int/2addr v1, p1

    .line 1074
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result p0

    add-int/2addr v2, v3

    .line 1073
    invoke-static {v2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    add-int/2addr p3, v0

    add-int/2addr p4, p0

    .line 1077
    invoke-virtual {p2, v0, p0, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Ljava/util/List;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 444
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 446
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->isChildrenDrawingOrderEnabled()Z

    move-result v0

    .line 447
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    :goto_d
    if-ltz v2, :cond_21

    if-eqz v0, :cond_16

    .line 449
    invoke-virtual {p0, v1, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getChildDrawingOrder(II)I

    move-result v3

    goto :goto_17

    :cond_16
    move v3, v2

    .line 450
    :goto_17
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 451
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, -0x1

    goto :goto_d

    .line 454
    :cond_21
    sget-object p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write:Ljava/util/Comparator;

    if-eqz p0, :cond_28

    .line 455
    invoke-static {p1, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_28
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/View;)Z
    .registers 2

    .line 1607
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {p0, p1}, Lo/_handleIncompatibleUpdateValue;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private AudioAttributesImplApi26Parcelizer()V
    .registers 3

    .line 1634
    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v0, :cond_11

    .line 1635
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_11

    .line 1636
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 1637
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_11
    const/4 v0, 0x0

    .line 1640
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCommand:Z

    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer(Landroid/view/View;I)V
    .registers 16

    .line 1653
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1654
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    if-eqz v1, :cond_6a

    .line 1655
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v7

    .line 1656
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v8

    .line 1657
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v9

    .line 1659
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-direct {p0, v1, v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V

    const/4 v10, 0x0

    .line 1660
    invoke-direct {p0, p1, v10, v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 1662
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    .line 1663
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    move v1, p2

    move-object v2, v7

    move-object v3, v9

    move-object v4, v0

    move v5, v11

    move v6, v12

    .line 1664
    invoke-static/range {v1 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;II)V

    .line 1666
    iget p2, v9, Landroid/graphics/Rect;->left:I

    iget v1, v8, Landroid/graphics/Rect;->left:I

    if-ne p2, v1, :cond_3c

    iget p2, v9, Landroid/graphics/Rect;->top:I

    iget v1, v8, Landroid/graphics/Rect;->top:I

    if-eq p2, v1, :cond_3d

    :cond_3c
    const/4 v10, 0x1

    .line 1668
    :cond_3d
    invoke-direct {p0, v0, v9, v11, v12}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;Landroid/graphics/Rect;II)V

    .line 1670
    iget p2, v9, Landroid/graphics/Rect;->left:I

    iget v1, v8, Landroid/graphics/Rect;->left:I

    sub-int/2addr p2, v1

    .line 1671
    iget v1, v9, Landroid/graphics/Rect;->top:I

    iget v2, v8, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    if-eqz p2, :cond_4f

    .line 1674
    invoke-static {p1, p2}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    :cond_4f
    if-eqz v1, :cond_54

    .line 1677
    invoke-static {p1, v1}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;I)V

    :cond_54
    if-eqz v10, :cond_61

    .line 1682
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object p2

    if-eqz p2, :cond_61

    .line 1684
    iget-object v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-virtual {p2, p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    .line 1688
    :cond_61
    invoke-static {v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1689
    invoke-static {v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1690
    invoke-static {v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    :cond_6a
    return-void
.end method

.method private AudioAttributesImplBaseParcelizer()V
    .registers 5

    .line 1585
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_17

    .line 1587
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1588
    invoke-direct {p0, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_14

    const/4 v1, 0x1

    goto :goto_17

    :cond_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 1594
    :cond_17
    :goto_17
    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCommand:Z

    if-eq v1, v0, :cond_24

    if-eqz v1, :cond_21

    .line 1596
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer()V

    return-void

    .line 1598
    :cond_21
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi26Parcelizer()V

    :cond_24
    return-void
.end method

.method private IconCompatParcelizer()V
    .registers 9

    .line 689
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 690
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v0}, Lo/_handleIncompatibleUpdateValue;->read()V

    .line 692
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_10
    if-ge v2, v0, :cond_49

    .line 693
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 695
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroid/view/View;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    move-result-object v4

    .line 696
    invoke-virtual {v4, p0, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/view/View;

    .line 698
    iget-object v5, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v5, v3}, Lo/_handleIncompatibleUpdateValue;->IconCompatParcelizer(Ljava/lang/Object;)V

    move v5, v1

    :goto_23
    if-ge v5, v0, :cond_46

    if-eq v5, v2, :cond_43

    .line 705
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 706
    invoke-virtual {v4, p0, v3, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result v7

    if-eqz v7, :cond_43

    .line 707
    iget-object v7, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v7, v6}, Lo/_handleIncompatibleUpdateValue;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3e

    .line 709
    iget-object v7, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v7, v6}, Lo/_handleIncompatibleUpdateValue;->IconCompatParcelizer(Ljava/lang/Object;)V

    .line 712
    :cond_3e
    iget-object v7, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v7, v6, v3}, Lo/_handleIncompatibleUpdateValue;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_43
    add-int/lit8 v5, v5, 0x1

    goto :goto_23

    :cond_46
    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    .line 718
    :cond_49
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v1}, Lo/_handleIncompatibleUpdateValue;->write()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 721
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-static {p0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/view/View;I)V
    .registers 4

    .line 1494
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1495
    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    if-eq v1, p1, :cond_13

    .line 1496
    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    sub-int v1, p1, v1

    .line 1497
    invoke-static {p0, v1}, Lo/InvalidTypeIdException;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    .line 1498
    iput p1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    :cond_13
    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 3

    .line 732
    invoke-static {p0, p1, p2}, Lo/_checkCoercionFail;->write(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method private IconCompatParcelizer(Z)V
    .registers 15

    .line 412
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_34

    .line 414
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 415
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 416
    invoke-virtual {v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v4

    if-eqz v4, :cond_31

    .line 418
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-wide v5, v7

    .line 419
    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v5

    if-eqz p1, :cond_2b

    .line 422
    invoke-virtual {v4, p0, v3, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_2e

    .line 424
    :cond_2b
    invoke-virtual {v4, p0, v3, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 426
    :goto_2e
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    :cond_31
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_34
    move p1, v1

    :goto_35
    if-ge p1, v0, :cond_47

    .line 431
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 432
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 433
    invoke-virtual {v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_35

    :cond_47
    const/4 p1, 0x0

    .line 435
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    .line 436
    iput-boolean v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatMediaItem:Z

    return-void
.end method

.method private static MediaBrowserCompatCustomActionResultReceiver()Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;
    .registers 1

    .line 1755
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;-><init>()V

    return-object v0
.end method

.method private RemoteActionCompatParcelizer(I)I
    .registers 5

    .line 600
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaDescriptionCompat:[I

    const/4 v1, 0x0

    if-nez v0, :cond_9

    .line 601
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return v1

    :cond_9
    if-ltz p1, :cond_11

    .line 605
    array-length v2, v0

    if-ge p1, v2, :cond_11

    .line 610
    aget p0, v0, p1

    return p0

    .line 606
    :cond_11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return v1
.end method

.method private RemoteActionCompatParcelizer(Landroid/util/AttributeSet;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;
    .registers 3

    .line 1740
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 3

    .line 1615
    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatSearchResultReceiver:Z

    if-eqz v0, :cond_18

    .line 1617
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    if-nez v0, :cond_f

    .line 1618
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    .line 1620
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 1621
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_18
    const/4 v0, 0x1

    .line 1626
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCommand:Z

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V
    .registers 2

    .line 164
    invoke-virtual {p0}, Landroid/graphics/Rect;->setEmpty()V

    .line 165
    sget-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatItemReceiver:Lo/rewrapCtorProblem$IconCompatParcelizer;

    invoke-interface {v0, p0}, Lo/rewrapCtorProblem$IconCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Z

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;II)V
    .registers 13

    .line 1130
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1131
    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 1132
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(I)I

    move-result v1

    .line 1131
    invoke-static {v1, p3}, Lo/_clearIfStdImpl;->write(II)I

    move-result v1

    and-int/lit8 v2, v1, 0x7

    and-int/lit8 v1, v1, 0x70

    .line 1136
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 1137
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 1138
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 1139
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    const/4 v7, 0x1

    if-ne p3, v7, :cond_29

    sub-int p2, v3, p2

    .line 1145
    :cond_29
    invoke-direct {p0, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(I)I

    move-result p2

    sub-int/2addr p2, v5

    if-eq v2, v7, :cond_35

    const/4 p3, 0x5

    if-ne v2, p3, :cond_38

    add-int/2addr p2, v5

    goto :goto_38

    .line 1157
    :cond_35
    div-int/lit8 p3, v5, 0x2

    add-int/2addr p2, p3

    :cond_38
    :goto_38
    const/16 p3, 0x10

    if-eq v1, p3, :cond_44

    const/16 p3, 0x50

    if-eq v1, p3, :cond_42

    const/4 p3, 0x0

    goto :goto_46

    :cond_42
    move p3, v6

    goto :goto_46

    .line 1170
    :cond_44
    div-int/lit8 p3, v6, 0x2

    .line 1175
    :goto_46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1177
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v3, v7

    sub-int/2addr v3, v5

    sub-int/2addr v3, v8

    .line 1176
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr v1, v2

    .line 1175
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 1178
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1180
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v4, p0

    sub-int/2addr v4, v6

    sub-int/2addr v4, v0

    .line 1179
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    move-result p0

    add-int/2addr v1, v2

    .line 1178
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    add-int/2addr v5, p2

    add-int/2addr v6, p0

    .line 1182
    invoke-virtual {p1, p2, p0, v5, v6}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;)V
    .registers 13

    .line 1090
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1091
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 1092
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    move v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, v0

    move v5, v7

    move v6, p1

    .line 1093
    invoke-static/range {v1 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;II)V

    .line 1095
    invoke-direct {p0, v0, p4, v7, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;Landroid/graphics/Rect;II)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;I)V
    .registers 12

    .line 1413
    invoke-static {p1}, Lo/InvalidTypeIdException;->onSeekTo(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_fd

    .line 1418
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_fd

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_fd

    .line 1423
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1424
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v1

    .line 1425
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v2

    .line 1426
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v3

    .line 1427
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v6

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v7

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    if-eqz v1, :cond_6a

    .line 1429
    invoke-virtual {v1, p0, p1, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->RemoteActionCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_6a

    .line 1431
    invoke-virtual {v3, v2}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_46

    goto :goto_6d

    .line 1432
    :cond_46
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Rect should be within the child\'s bounds. Rect:"

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1433
    invoke-virtual {v2}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " | Bounds:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1434
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1437
    :cond_6a
    invoke-virtual {v2, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1441
    :goto_6d
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1443
    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7a

    .line 1445
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    return-void

    .line 1449
    :cond_7a
    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-static {v1, p3}, Lo/_clearIfStdImpl;->write(II)I

    move-result p3

    and-int/lit8 v1, p3, 0x30

    const/4 v3, 0x1

    const/16 v4, 0x30

    const/4 v5, 0x0

    if-ne v1, v4, :cond_9c

    .line 1454
    iget v1, v2, Landroid/graphics/Rect;->top:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, v4

    iget v4, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:I

    sub-int/2addr v1, v4

    .line 1455
    iget v4, p2, Landroid/graphics/Rect;->top:I

    if-ge v1, v4, :cond_9c

    .line 1456
    iget v4, p2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v4, v1

    invoke-static {p1, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    move v1, v3

    goto :goto_9d

    :cond_9c
    move v1, v5

    :goto_9d
    and-int/lit8 v4, p3, 0x50

    const/16 v6, 0x50

    if-ne v4, v6, :cond_bb

    .line 1461
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    iget v6, v2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, v6

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v4, v6

    iget v6, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:I

    add-int/2addr v4, v6

    .line 1462
    iget v6, p2, Landroid/graphics/Rect;->bottom:I

    if-ge v4, v6, :cond_bb

    .line 1463
    iget v1, p2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, v1

    invoke-static {p1, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    goto :goto_c0

    :cond_bb
    if-nez v1, :cond_c0

    .line 1468
    invoke-static {p1, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;I)V

    :cond_c0
    :goto_c0
    and-int/lit8 v1, p3, 0x3

    const/4 v4, 0x3

    if-ne v1, v4, :cond_d8

    .line 1473
    iget v1, v2, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v1, v4

    iget v4, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    sub-int/2addr v1, v4

    .line 1474
    iget v4, p2, Landroid/graphics/Rect;->left:I

    if-ge v1, v4, :cond_d8

    .line 1475
    iget v4, p2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v4, v1

    invoke-static {p1, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Landroid/view/View;I)V

    goto :goto_d9

    :cond_d8
    move v3, v5

    :goto_d9
    const/4 v1, 0x5

    and-int/2addr p3, v1

    if-ne p3, v1, :cond_f5

    .line 1480
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    iget p3, v2, Landroid/graphics/Rect;->right:I

    sub-int/2addr p0, p3

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p0, p3

    iget p3, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    add-int/2addr p0, p3

    .line 1481
    iget p3, p2, Landroid/graphics/Rect;->right:I

    if-ge p0, p3, :cond_f5

    .line 1482
    iget p2, p2, Landroid/graphics/Rect;->right:I

    sub-int/2addr p0, p2

    invoke-static {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Landroid/view/View;I)V

    goto :goto_fa

    :cond_f5
    if-nez v3, :cond_fa

    .line 1487
    invoke-static {p1, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Landroid/view/View;I)V

    .line 1490
    :cond_fa
    :goto_fa
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    :cond_fd
    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/View;I)V
    .registers 7

    .line 1106
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v0

    .line 1107
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v1

    .line 1109
    :try_start_8
    invoke-direct {p0, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1110
    invoke-direct {p0, p1, p3, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 1111
    iget p0, v1, Landroid/graphics/Rect;->left:I

    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget p3, v1, Landroid/graphics/Rect;->right:I

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p0, p2, p3, v2}, Landroid/view/View;->layout(IIII)V
    :try_end_19
    .catchall {:try_start_8 .. :try_end_19} :catchall_20

    .line 1113
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1114
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    return-void

    :catchall_20
    move-exception p0

    .line 1113
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1114
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1115
    throw p0
.end method

.method private static read(I)I
    .registers 2

    and-int/lit8 v0, p0, 0x7

    if-nez v0, :cond_8

    const v0, 0x800003

    or-int/2addr p0, v0

    :cond_8
    and-int/lit8 v0, p0, 0x70

    if-nez v0, :cond_e

    or-int/lit8 p0, p0, 0x30

    :cond_e
    return p0
.end method

.method static read(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    .registers 6

    .line 615
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    .line 620
    :cond_8
    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_47

    :cond_24
    const/16 v0, 0x2e

    .line 623
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_2d

    goto :goto_47

    .line 628
    :cond_2d
    sget-object v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_47

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 634
    :cond_47
    :goto_47
    :try_start_47
    sget-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_59

    .line 636
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 637
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 639
    :cond_59
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    if-nez v0, :cond_77

    .line 642
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    .line 643
    sget-object v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer:[Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v2, 0x1

    .line 644
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 645
    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    :cond_77
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_47 .. :try_end_81} :catch_82

    return-object p0

    :catch_82
    move-exception p0

    .line 649
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Could not inflate Behavior subclass "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private read()V
    .registers 2

    .line 3309
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 3310
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplBaseParcelizer:Lo/finishBranchObject;

    if-nez v0, :cond_11

    .line 3311
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$2;

    invoke-direct {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$2;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplBaseParcelizer:Lo/finishBranchObject;

    .line 3321
    :cond_11
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplBaseParcelizer:Lo/finishBranchObject;

    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Lo/finishBranchObject;)V

    const/16 v0, 0x500

    .line 3324
    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setSystemUiVisibility(I)V

    return-void

    :cond_1c
    const/4 v0, 0x0

    .line 3327
    invoke-static {p0, v0}, Lo/InvalidTypeIdException;->read(Landroid/view/View;Lo/finishBranchObject;)V

    return-void
.end method

.method private static read(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;II)V
    .registers 12

    .line 992
    iget v0, p3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 993
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(I)I

    move-result v0

    .line 992
    invoke-static {v0, p0}, Lo/_clearIfStdImpl;->write(II)I

    move-result v0

    .line 994
    iget p3, p3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 995
    invoke-static {p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read(I)I

    move-result p3

    .line 994
    invoke-static {p3, p0}, Lo/_clearIfStdImpl;->write(II)I

    move-result p0

    and-int/lit8 p3, v0, 0x7

    and-int/lit8 v0, v0, 0x70

    and-int/lit8 v1, p0, 0x7

    and-int/lit8 p0, p0, 0x70

    const/4 v2, 0x5

    const/4 v3, 0x1

    if-eq v1, v3, :cond_28

    if-eq v1, v2, :cond_25

    .line 1012
    iget v1, p1, Landroid/graphics/Rect;->left:I

    goto :goto_31

    .line 1015
    :cond_25
    iget v1, p1, Landroid/graphics/Rect;->right:I

    goto :goto_31

    .line 1018
    :cond_28
    iget v1, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v4

    :goto_31
    const/16 v4, 0x50

    const/16 v5, 0x10

    if-eq p0, v5, :cond_3f

    if-eq p0, v4, :cond_3c

    .line 1025
    iget p0, p1, Landroid/graphics/Rect;->top:I

    goto :goto_48

    .line 1028
    :cond_3c
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_48

    .line 1031
    :cond_3f
    iget p0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    add-int/2addr p0, p1

    :goto_48
    if-eq p3, v3, :cond_4e

    if-eq p3, v2, :cond_51

    sub-int/2addr v1, p4

    goto :goto_51

    .line 1045
    :cond_4e
    div-int/lit8 p1, p4, 0x2

    sub-int/2addr v1, p1

    :cond_51
    :goto_51
    if-eq v0, v5, :cond_57

    if-eq v0, v4, :cond_5a

    sub-int/2addr p0, p5

    goto :goto_5a

    .line 1058
    :cond_57
    div-int/lit8 p1, p5, 0x2

    sub-int/2addr p0, p1

    :cond_5a
    :goto_5a
    add-int/2addr p4, v1

    add-int/2addr p5, p0

    .line 1062
    invoke-virtual {p2, v1, p0, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method private read(Landroid/view/View;I)V
    .registers 15

    .line 1193
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1194
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v7

    .line 1195
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1196
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1197
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    iget v8, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1198
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v9

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v10

    iget v11, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    add-int/2addr v3, v4

    sub-int/2addr v5, v6

    sub-int/2addr v5, v8

    sub-int/2addr v9, v10

    sub-int/2addr v9, v11

    .line 1195
    invoke-virtual {v7, v1, v3, v5, v9}, Landroid/graphics/Rect;->set(IIII)V

    .line 1200
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    if-eqz v1, :cond_6f

    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_6f

    .line 1201
    invoke-static {p1}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_6f

    .line 1204
    iget v1, v7, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplApi21Parcelizer()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v7, Landroid/graphics/Rect;->left:I

    .line 1205
    iget v1, v7, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v7, Landroid/graphics/Rect;->top:I

    .line 1206
    iget v1, v7, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatItemReceiver()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v7, Landroid/graphics/Rect;->right:I

    .line 1207
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {p0}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplBaseParcelizer()I

    move-result p0

    sub-int/2addr v1, p0

    iput v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 1210
    :cond_6f
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object p0

    .line 1211
    iget v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read(I)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 1212
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    move-object v4, v7

    move-object v5, p0

    move v6, p2

    .line 1211
    invoke-static/range {v1 .. v6}, Lo/_clearIfStdImpl;->AudioAttributesCompatParcelizer(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    .line 1213
    iget p2, p0, Landroid/graphics/Rect;->left:I

    iget v0, p0, Landroid/graphics/Rect;->top:I

    iget v1, p0, Landroid/graphics/Rect;->right:I

    iget v2, p0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 1215
    invoke-static {v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1216
    invoke-static {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    return-void
.end method

.method private static write(I)I
    .registers 1

    if-nez p0, :cond_5

    const p0, 0x800035

    :cond_5
    return p0
.end method

.method private static write(Landroid/view/View;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;
    .registers 6

    .line 654
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 655
    iget-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    if-nez v1, :cond_53

    .line 656
    instance-of v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$read;

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    .line 657
    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$read;

    invoke-interface {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$read;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object p0

    .line 661
    invoke-virtual {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;)V

    .line 662
    iput-boolean v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    return-object v0

    .line 665
    :cond_1b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const/4 v1, 0x0

    :goto_20
    if-eqz p0, :cond_31

    .line 668
    const-class v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$write;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$write;

    if-nez v1, :cond_31

    .line 670
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_20

    :cond_31
    if-eqz v1, :cond_51

    .line 675
    :try_start_33
    invoke-interface {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$write;->read()Ljava/lang/Class;

    move-result-object p0

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {p0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    .line 674
    invoke-virtual {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;)V
    :try_end_49
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_49} :catch_4a

    goto :goto_51

    .line 677
    :catch_4a
    invoke-interface {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$write;->read()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 682
    :cond_51
    :goto_51
    iput-boolean v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    :cond_53
    return-object v0
.end method

.method private static write(Landroid/view/ViewGroup$LayoutParams;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;
    .registers 2

    .line 1745
    instance-of v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_c

    .line 1746
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;)V

    return-object v0

    .line 1747
    :cond_c
    instance-of v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_18

    .line 1748
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 1750
    :cond_18
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private write(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .registers 6

    .line 854
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatSearchResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_7

    return-object p1

    .line 858
    :cond_7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_c
    if-ge v1, v0, :cond_32

    .line 859
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 860
    invoke-static {v2}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_2f

    .line 861
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 862
    invoke-virtual {v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v2

    if-eqz v2, :cond_2f

    .line 866
    invoke-static {p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->AudioAttributesCompatParcelizer(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    .line 867
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatSearchResultReceiver()Z

    move-result v2

    if-eqz v2, :cond_2f

    return-object p1

    :cond_2f
    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_32
    return-object p1
.end method

.method private static write(Landroid/view/View;Landroid/graphics/Rect;)V
    .registers 2

    .line 965
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 966
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver()Landroid/graphics/Rect;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method private write(Landroid/view/MotionEvent;I)Z
    .registers 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 466
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    .line 468
    iget-object v4, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onFastForward:Ljava/util/List;

    .line 469
    invoke-direct {v0, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Ljava/util/List;)V

    .line 472
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v8, v7

    move v9, v8

    move v10, v9

    :goto_18
    if-ge v9, v5, :cond_80

    .line 474
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    .line 475
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 476
    invoke-virtual {v12}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v13

    const/4 v14, 0x1

    if-nez v8, :cond_2f

    if-eqz v10, :cond_54

    :cond_2f
    if-eqz v3, :cond_54

    if-eqz v13, :cond_7d

    if-nez v6, :cond_47

    .line 483
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v17

    const/16 v19, 0x3

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-wide/from16 v15, v17

    .line 484
    invoke-static/range {v15 .. v22}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v6

    :cond_47
    if-eqz v2, :cond_50

    if-eq v2, v14, :cond_4c

    goto :goto_7d

    .line 492
    :cond_4c
    invoke-virtual {v13, v0, v11, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_7d

    .line 489
    :cond_50
    invoke-virtual {v13, v0, v11, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_7d

    :cond_54
    if-nez v8, :cond_69

    if-eqz v13, :cond_69

    if-eqz v2, :cond_61

    if-ne v2, v14, :cond_65

    .line 505
    invoke-virtual {v13, v0, v11, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v8

    goto :goto_65

    .line 502
    :cond_61
    invoke-virtual {v13, v0, v11, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v8

    :cond_65
    :goto_65
    if-eqz v8, :cond_69

    .line 509
    iput-object v11, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    .line 515
    :cond_69
    invoke-virtual {v12}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer()Z

    move-result v10

    .line 516
    invoke-virtual {v12, v0, v11}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Z

    move-result v11

    if-eqz v11, :cond_77

    if-nez v10, :cond_77

    move v10, v14

    goto :goto_78

    :cond_77
    move v10, v7

    :goto_78
    if-eqz v11, :cond_7d

    if-nez v10, :cond_7d

    goto :goto_80

    :cond_7d
    :goto_7d
    add-int/lit8 v9, v9, 0x1

    goto :goto_18

    .line 525
    :cond_80
    :goto_80
    invoke-interface {v4}, Ljava/util/List;->clear()V

    return v8
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .registers 5

    .line 384
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v0, p1}, Lo/configureFromStringCreator;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    .line 385
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_16

    .line 386
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v2

    if-lez v2, :cond_16

    move v2, v0

    goto :goto_17

    :cond_16
    move v2, v1

    :goto_17
    iput-boolean v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RatingCompat:Z

    if-nez v2, :cond_22

    .line 387
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_22

    goto :goto_23

    :cond_22
    move v0, v1

    :goto_23
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 390
    invoke-direct {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    .line 391
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2d
    return-object p1
.end method

.method public AudioAttributesCompatParcelizer(Landroid/view/View;IIIII)V
    .registers 15

    const/4 v6, 0x0

    .line 1859
    iget-object v7, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->handleMediaPlayPauseIfPendingOnHandler:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/View;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1566
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v0, p1}, Lo/_handleIncompatibleUpdateValue;->read(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 1567
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlay:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_12

    .line 1569
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlay:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1571
    :cond_12
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlay:Ljava/util/List;

    return-object p0
.end method

.method final IconCompatParcelizer(I)V
    .registers 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 1307
    invoke-static/range {p0 .. p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v2

    .line 1308
    iget-object v3, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    .line 1309
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v4

    .line 1310
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v5

    .line 1311
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_1c
    if-ge v8, v3, :cond_102

    .line 1314
    iget-object v9, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    .line 1315
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    if-nez v1, :cond_36

    .line 1316
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v11

    const/16 v12, 0x8

    if-eq v11, v12, :cond_fe

    :cond_36
    move v11, v7

    :goto_37
    if-ge v11, v8, :cond_4b

    .line 1323
    iget-object v12, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    .line 1325
    iget-object v13, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    if-ne v13, v12, :cond_48

    .line 1326
    invoke-direct {v0, v9, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi26Parcelizer(Landroid/view/View;I)V

    :cond_48
    add-int/lit8 v11, v11, 0x1

    goto :goto_37

    :cond_4b
    const/4 v11, 0x1

    .line 1331
    invoke-direct {v0, v9, v11, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 1334
    iget v12, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    if-eqz v12, :cond_a5

    invoke-virtual {v5}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_a5

    .line 1335
    iget v12, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    invoke-static {v12, v2}, Lo/_clearIfStdImpl;->write(II)I

    move-result v12

    and-int/lit8 v13, v12, 0x70

    const/16 v14, 0x30

    if-eq v13, v14, :cond_79

    const/16 v14, 0x50

    if-ne v13, v14, :cond_83

    .line 1342
    iget v13, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v14

    iget v15, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr v14, v15

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v13

    iput v13, v4, Landroid/graphics/Rect;->bottom:I

    goto :goto_83

    .line 1339
    :cond_79
    iget v13, v4, Landroid/graphics/Rect;->top:I

    iget v14, v5, Landroid/graphics/Rect;->bottom:I

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v13

    iput v13, v4, Landroid/graphics/Rect;->top:I

    :cond_83
    :goto_83
    and-int/lit8 v12, v12, 0x7

    const/4 v13, 0x3

    if-eq v12, v13, :cond_9b

    const/4 v13, 0x5

    if-ne v12, v13, :cond_a5

    .line 1350
    iget v12, v4, Landroid/graphics/Rect;->right:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v13

    iget v14, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr v13, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v12

    iput v12, v4, Landroid/graphics/Rect;->right:I

    goto :goto_a5

    .line 1347
    :cond_9b
    iget v12, v4, Landroid/graphics/Rect;->left:I

    iget v13, v5, Landroid/graphics/Rect;->right:I

    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    move-result v12

    iput v12, v4, Landroid/graphics/Rect;->left:I

    .line 1356
    :cond_a5
    :goto_a5
    iget v10, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    if-eqz v10, :cond_b2

    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-nez v10, :cond_b2

    .line 1357
    invoke-direct {v0, v9, v4, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;I)V

    :cond_b2
    const/4 v10, 0x2

    if-eq v1, v10, :cond_c1

    .line 1362
    invoke-static {v9, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1363
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_fe

    .line 1366
    invoke-static {v9, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_c1
    add-int/lit8 v12, v8, 0x1

    :goto_c3
    if-ge v12, v3, :cond_fe

    .line 1371
    iget-object v13, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    .line 1372
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1373
    invoke-virtual {v14}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v15

    if-eqz v15, :cond_fb

    .line 1375
    invoke-virtual {v15, v13, v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->write(Landroid/view/View;Landroid/view/View;)Z

    move-result v16

    if-eqz v16, :cond_fb

    if-nez v1, :cond_eb

    .line 1376
    invoke-virtual {v14}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read()Z

    move-result v16

    if-eqz v16, :cond_eb

    .line 1379
    invoke-virtual {v14}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer()V

    goto :goto_fb

    :cond_eb
    if-eq v1, v10, :cond_f2

    .line 1393
    invoke-virtual {v15, v0, v13, v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result v13

    goto :goto_f6

    .line 1388
    :cond_f2
    invoke-virtual {v15, v0, v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V

    move v13, v11

    :goto_f6
    if-ne v1, v11, :cond_fb

    .line 1400
    invoke-virtual {v14, v13}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer(Z)V

    :cond_fb
    :goto_fb
    add-int/lit8 v12, v12, 0x1

    goto :goto_c3

    :cond_fe
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1c

    .line 1406
    :cond_102
    invoke-static {v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1407
    invoke-static {v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1408
    invoke-static {v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroid/view/View;II)Z
    .registers 5

    .line 1704
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer()Landroid/graphics/Rect;

    move-result-object v0

    .line 1705
    invoke-direct {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1707
    :try_start_7
    invoke-virtual {v0, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    move-result p0
    :try_end_b
    .catchall {:try_start_7 .. :try_end_b} :catchall_f

    .line 1709
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    return p0

    :catchall_f
    move-exception p0

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/graphics/Rect;)V

    .line 1710
    throw p0
.end method

.method public IconCompatParcelizer(Landroid/view/View;Landroid/view/View;II)Z
    .registers 19

    move/from16 v7, p4

    .line 1773
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    move v11, v10

    :goto_9
    if-ge v10, v8, :cond_3c

    move-object v12, p0

    .line 1775
    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1776
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_39

    .line 1780
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1781
    invoke-virtual {v13}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v0

    if-eqz v0, :cond_36

    move-object v1, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    .line 1783
    invoke-virtual/range {v0 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z

    move-result v0

    or-int/2addr v11, v0

    .line 1786
    invoke-virtual {v13, v7, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(IZ)V

    goto :goto_39

    .line 1788
    :cond_36
    invoke-virtual {v13, v7, v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(IZ)V

    :cond_39
    :goto_39
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_3c
    return v11
.end method

.method public final RemoteActionCompatParcelizer(Landroid/view/View;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1547
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v0, p1}, Lo/_handleIncompatibleUpdateValue;->write(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 1548
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlay:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_12

    .line 1550
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlay:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1552
    :cond_12
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlay:Ljava/util/List;

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;I)V
    .registers 8

    .line 1829
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onAddQueueItem:Lo/rootArrayScope;

    invoke-virtual {v0, p2}, Lo/rootArrayScope;->read(I)V

    .line 1831
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v0, :cond_2e

    .line 1833
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1834
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1835
    invoke-virtual {v3, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(I)Z

    move-result v4

    if-eqz v4, :cond_2b

    .line 1839
    invoke-virtual {v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v4

    if-eqz v4, :cond_25

    .line 1841
    invoke-virtual {v4, p0, v2, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V

    .line 1843
    :cond_25
    invoke-virtual {v3, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(I)V

    .line 1844
    invoke-virtual {v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer()V

    :cond_2b
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_2e
    const/4 p1, 0x0

    .line 1846
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/View;

    return-void
.end method

.method public RemoteActionCompatParcelizer(Landroid/view/View;II[II)V
    .registers 22

    move-object/from16 v8, p0

    .line 1923
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    const/4 v10, 0x0

    move v0, v10

    move v11, v0

    move v12, v11

    move v13, v12

    :goto_b
    const/4 v14, 0x1

    if-ge v11, v9, :cond_6e

    .line 1925
    invoke-virtual {v8, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1926
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v3, :cond_1d

    move/from16 v15, p5

    goto :goto_6b

    .line 1931
    :cond_1d
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    move/from16 v15, p5

    .line 1932
    invoke-virtual {v1, v15}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(I)Z

    move-result v3

    if-nez v3, :cond_2c

    goto :goto_6b

    .line 1936
    :cond_2c
    invoke-virtual {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v1

    if-eqz v1, :cond_6b

    .line 1938
    iget-object v6, v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi21Parcelizer:[I

    aput v10, v6, v10

    .line 1939
    aput v10, v6, v14

    move-object v0, v1

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v7, p5

    .line 1940
    invoke-virtual/range {v0 .. v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V

    .line 1942
    iget-object v0, v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi21Parcelizer:[I

    if-lez p2, :cond_51

    aget v0, v0, v10

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_57

    :cond_51
    aget v0, v0, v10

    .line 1943
    invoke-static {v12, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_57
    move v12, v0

    .line 1944
    iget-object v0, v8, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi21Parcelizer:[I

    if-lez p3, :cond_63

    aget v0, v0, v14

    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_69

    :cond_63
    aget v0, v0, v14

    .line 1945
    invoke-static {v13, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_69
    move v13, v0

    move v0, v14

    :cond_6b
    :goto_6b
    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    .line 1951
    :cond_6e
    aput v12, p4, v10

    .line 1952
    aput v13, p4, v14

    if-eqz v0, :cond_77

    .line 1955
    invoke-virtual {v8, v14}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(I)V

    :cond_77
    return-void
.end method

.method public final Y_()Landroidx/core/view/WindowInsetsCompat;
    .registers 1

    .line 401
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    return-object p0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 3

    .line 1760
    instance-of v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

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

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .registers 7

    .line 1253
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1254
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz v1, :cond_c

    .line 1255
    iget-object v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    .line 1277
    :cond_c
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p0

    return p0
.end method

.method protected drawableStateChanged()V
    .registers 4

    .line 332
    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    .line 334
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    .line 337
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1a

    .line 338
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_1a

    .line 339
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 343
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1a
    return-void
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 1

    .line 112
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver()Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 112
    invoke-direct {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/util/AttributeSet;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 112
    invoke-static {p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroid/view/ViewGroup$LayoutParams;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method public getNestedScrollAxes()I
    .registers 1

    .line 2017
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onAddQueueItem:Lo/rootArrayScope;

    invoke-virtual {p0}, Lo/rootArrayScope;->IconCompatParcelizer()I

    move-result p0

    return p0
.end method

.method protected getSuggestedMinimumHeight()I
    .registers 3

    .line 742
    invoke-super {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    add-int/2addr v1, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method protected getSuggestedMinimumWidth()I
    .registers 3

    .line 737
    invoke-super {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    add-int/2addr v1, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public onAttachedToWindow()V
    .registers 3

    .line 264
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x0

    .line 265
    invoke-direct {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Z)V

    .line 266
    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCommand:Z

    if-eqz v0, :cond_1f

    .line 267
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    if-nez v0, :cond_16

    .line 268
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    .line 270
    :cond_16
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 271
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 273
    :cond_1f
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    if-nez v0, :cond_2c

    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 276
    invoke-static {p0}, Lo/InvalidTypeIdException;->onSetRepeatMode(Landroid/view/View;)V

    :cond_2c
    const/4 v0, 0x1

    .line 278
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 4

    .line 283
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 284
    invoke-direct {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Z)V

    .line 285
    iget-boolean v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCommand:Z

    if-eqz v1, :cond_18

    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    if-eqz v1, :cond_18

    .line 286
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    .line 287
    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onPlayFromMediaId:Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 289
    :cond_18
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/View;

    if-eqz v1, :cond_1f

    .line 290
    invoke-virtual {p0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onStopNestedScroll(Landroid/view/View;)V

    .line 292
    :cond_1f
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatSearchResultReceiver:Z

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 6

    .line 926
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 927
    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RatingCompat:Z

    if-eqz v0, :cond_26

    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_26

    .line 928
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    const/4 v1, 0x0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v0

    goto :goto_16

    :cond_15
    move v0, v1

    :goto_16
    if-lez v0, :cond_26

    .line 930
    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {v2, v1, v1, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 931
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_26
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 5

    .line 532
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_a

    .line 536
    invoke-direct {p0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Z)V

    :cond_a
    const/4 v2, 0x0

    .line 539
    invoke-direct {p0, p1, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroid/view/MotionEvent;I)Z

    move-result p1

    if-eq v0, v1, :cond_15

    const/4 v2, 0x3

    if-eq v0, v2, :cond_15

    return p1

    .line 542
    :cond_15
    invoke-direct {p0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Z)V

    return p1
.end method

.method protected onLayout(ZIIII)V
    .registers 7

    .line 906
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result p1

    .line 907
    iget-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_b
    if-ge p3, p2, :cond_35

    .line 909
    iget-object p4, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/view/View;

    .line 910
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result p5

    const/16 v0, 0x8

    if-eq p5, v0, :cond_32

    .line 915
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p5

    check-cast p5, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 916
    invoke-virtual {p5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object p5

    if-eqz p5, :cond_2f

    .line 918
    invoke-virtual {p5, p0, p4, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z

    move-result p5

    if-nez p5, :cond_32

    .line 919
    :cond_2f
    invoke-virtual {p0, p4, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroid/view/View;I)V

    :cond_32
    add-int/lit8 p3, p3, 0x1

    goto :goto_b

    :cond_35
    return-void
.end method

.method protected onMeasure(II)V
    .registers 34

    move-object/from16 v7, p0

    .line 767
    invoke-direct/range {p0 .. p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer()V

    .line 768
    invoke-direct/range {p0 .. p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplBaseParcelizer()V

    .line 770
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v8

    .line 771
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v9

    .line 772
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v10

    .line 773
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v11

    .line 774
    invoke-static/range {p0 .. p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v12

    const/4 v0, 0x1

    if-ne v12, v0, :cond_21

    move v14, v0

    goto :goto_22

    :cond_21
    const/4 v14, 0x0

    .line 776
    :goto_22
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v15

    .line 777
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v16

    .line 778
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    .line 779
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v17

    .line 783
    invoke-virtual/range {p0 .. p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getSuggestedMinimumWidth()I

    move-result v1

    .line 784
    invoke-virtual/range {p0 .. p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getSuggestedMinimumHeight()I

    move-result v2

    .line 787
    iget-object v3, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    if-eqz v3, :cond_47

    invoke-static/range {p0 .. p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_47

    move/from16 v18, v0

    goto :goto_49

    :cond_47
    const/16 v18, 0x0

    .line 789
    :goto_49
    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    move v4, v1

    move v3, v2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_53
    if-ge v2, v5, :cond_180

    .line 791
    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaMetadataCompat:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/view/View;

    .line 792
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v13, 0x8

    if-ne v0, v13, :cond_71

    move/from16 v21, v2

    move/from16 v23, v5

    move/from16 v24, v6

    const/16 v22, 0x0

    goto/16 :goto_178

    .line 797
    :cond_71
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 800
    iget v0, v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-ltz v0, :cond_bc

    if-eqz v15, :cond_bc

    .line 801
    iget v0, v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    invoke-direct {v7, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(I)I

    move-result v0

    move/from16 v21, v1

    .line 802
    iget v1, v13, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 803
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(I)I

    move-result v1

    .line 802
    invoke-static {v1, v12}, Lo/_clearIfStdImpl;->write(II)I

    move-result v1

    and-int/lit8 v1, v1, 0x7

    move/from16 v22, v2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_99

    if-eqz v14, :cond_9e

    :cond_99
    const/4 v2, 0x5

    if-ne v1, v2, :cond_aa

    if-eqz v14, :cond_aa

    :cond_9e
    sub-int v1, v16, v10

    sub-int/2addr v1, v0

    const/4 v0, 0x0

    .line 807
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v2, v0

    move/from16 v20, v1

    goto :goto_c3

    :cond_aa
    if-ne v1, v2, :cond_ae

    if-eqz v14, :cond_b3

    :cond_ae
    const/4 v2, 0x3

    if-ne v1, v2, :cond_c0

    if-eqz v14, :cond_c0

    :cond_b3
    sub-int/2addr v0, v8

    const/4 v2, 0x0

    .line 810
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move/from16 v20, v0

    goto :goto_c3

    :cond_bc
    move/from16 v21, v1

    move/from16 v22, v2

    :cond_c0
    const/4 v2, 0x0

    move/from16 v20, v2

    :goto_c3
    if-eqz v18, :cond_f8

    .line 816
    invoke-static/range {v19 .. v19}, Lo/InvalidTypeIdException;->MediaBrowserCompatCustomActionResultReceiver(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_f8

    .line 819
    iget-object v0, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplApi21Parcelizer()I

    move-result v0

    iget-object v1, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    .line 820
    invoke-virtual {v1}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatItemReceiver()I

    move-result v1

    .line 821
    iget-object v2, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    invoke-virtual {v2}, Landroidx/core/view/WindowInsetsCompat;->MediaBrowserCompatCustomActionResultReceiver()I

    move-result v2

    move/from16 v24, v3

    iget-object v3, v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onCustomAction:Landroidx/core/view/WindowInsetsCompat;

    .line 822
    invoke-virtual {v3}, Landroidx/core/view/WindowInsetsCompat;->AudioAttributesImplBaseParcelizer()I

    move-result v3

    add-int/2addr v0, v1

    sub-int v0, v16, v0

    .line 824
    invoke-static {v0, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    add-int/2addr v2, v3

    sub-int v1, v17, v2

    .line 826
    invoke-static {v1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    move/from16 v25, v0

    move/from16 v26, v1

    goto :goto_fe

    :cond_f8
    move/from16 v24, v3

    move/from16 v25, p1

    move/from16 v26, p2

    .line 830
    :goto_fe
    invoke-virtual {v13}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v0

    if-eqz v0, :cond_129

    const/16 v27, 0x0

    move/from16 v3, v21

    move-object/from16 v1, p0

    move/from16 v21, v22

    const/16 v22, 0x0

    move-object/from16 v2, v19

    move/from16 v28, v3

    move/from16 v29, v24

    move/from16 v3, v25

    move/from16 v30, v4

    move/from16 v4, v20

    move/from16 v23, v5

    move/from16 v5, v26

    move/from16 v24, v6

    move/from16 v6, v27

    .line 831
    invoke-virtual/range {v0 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z

    move-result v0

    if-nez v0, :cond_145

    goto :goto_137

    :cond_129
    move/from16 v30, v4

    move/from16 v23, v5

    move/from16 v28, v21

    move/from16 v21, v22

    move/from16 v29, v24

    const/16 v22, 0x0

    move/from16 v24, v6

    :goto_137
    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move/from16 v2, v25

    move/from16 v3, v20

    move/from16 v4, v26

    .line 833
    invoke-virtual/range {v0 .. v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroid/view/View;IIII)V

    :cond_145
    add-int v0, v8, v10

    .line 837
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v1

    iget v1, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v1

    move/from16 v1, v30

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int v1, v9, v11

    .line 840
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, v2

    iget v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    move/from16 v2, v29

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 842
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    move/from16 v13, v28

    invoke-static {v13, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    move v4, v0

    move v3, v1

    move v1, v2

    :goto_178
    add-int/lit8 v2, v21, 0x1

    move/from16 v5, v23

    move/from16 v6, v24

    goto/16 :goto_53

    :cond_180
    move v13, v1

    move v2, v3

    move v1, v4

    const/high16 v0, -0x1000000

    and-int/2addr v0, v13

    move/from16 v3, p1

    .line 845
    invoke-static {v1, v3, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    shl-int/lit8 v1, v13, 0x10

    move/from16 v3, p2

    .line 847
    invoke-static {v2, v3, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    .line 849
    invoke-virtual {v7, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setMeasuredDimension(II)V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 7

    .line 1964
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 p2, 0x0

    move p3, p2

    :goto_6
    if-ge p3, p1, :cond_28

    .line 1966
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    .line 1967
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_15

    goto :goto_25

    .line 1972
    :cond_15
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1973
    invoke-virtual {p4, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(I)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 1977
    invoke-virtual {p4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object p4

    :cond_25
    :goto_25
    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    :cond_28
    return p2
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 14

    .line 1994
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_7
    if-ge v2, v0, :cond_34

    .line 1996
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1997
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_16

    goto :goto_31

    .line 2002
    :cond_16
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 2003
    invoke-virtual {v4, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(I)Z

    move-result v5

    if-eqz v5, :cond_31

    .line 2007
    invoke-virtual {v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v4

    if-eqz v4, :cond_31

    move-object v5, p0

    move-object v7, p1

    move v8, p2

    move v9, p3

    .line 2009
    invoke-virtual/range {v4 .. v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z

    move-result v4

    or-int/2addr v3, v4

    :cond_31
    :goto_31
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_34
    return v3
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 1913
    invoke-virtual/range {v0 .. v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/view/View;II[II)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .registers 13

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 1852
    invoke-virtual/range {v0 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroid/view/View;IIIII)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .registers 5

    const/4 v0, 0x0

    .line 1796
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 8

    .line 3241
    instance-of v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    if-nez v0, :cond_8

    .line 3242
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 3246
    :cond_8
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    .line 3247
    invoke-virtual {p1}, Landroidx/customview/view/AbsSavedState;->read()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 3249
    iget-object p1, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    .line 3251
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_18
    if-ge v1, v0, :cond_3d

    .line 3252
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 3253
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    .line 3254
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroid/view/View;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    move-result-object v4

    .line 3255
    invoke-virtual {v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v4

    const/4 v5, -0x1

    if-eq v3, v5, :cond_3a

    if-eqz v4, :cond_3a

    .line 3258
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    if-eqz v3, :cond_3a

    .line 3260
    invoke-virtual {v4, p0, v2, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V

    :cond_3a
    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_3d
    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .registers 9

    .line 3269
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 3271
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 3272
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_13
    if-ge v3, v2, :cond_38

    .line 3273
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 3274
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    .line 3275
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 3276
    invoke-virtual {v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v6

    const/4 v7, -0x1

    if-eq v5, v7, :cond_35

    if-eqz v6, :cond_35

    .line 3280
    invoke-virtual {v6, p0, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;

    move-result-object v4

    if-eqz v4, :cond_35

    .line 3282
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_35
    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    .line 3286
    :cond_38
    iput-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    return-object v0
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .registers 5

    const/4 v0, 0x0

    .line 1765
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Landroid/view/View;Landroid/view/View;II)Z

    move-result p0

    return p0
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .registers 3

    const/4 v0, 0x0

    .line 1823
    invoke-virtual {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/view/View;I)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 555
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    .line 557
    iget-object v3, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_15

    invoke-direct {v0, v1, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->write(Landroid/view/MotionEvent;I)Z

    move-result v3

    if-eqz v3, :cond_2b

    goto :goto_16

    :cond_15
    move v3, v5

    .line 560
    :goto_16
    iget-object v6, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 561
    invoke-virtual {v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v6

    if-eqz v6, :cond_2b

    .line 563
    iget-object v7, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    invoke-virtual {v6, v0, v7, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v6

    goto :goto_2c

    :cond_2b
    move v6, v5

    .line 568
    :goto_2c
    iget-object v7, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    const/4 v8, 0x0

    if-nez v7, :cond_37

    .line 569
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    or-int/2addr v6, v1

    goto :goto_4a

    :cond_37
    if-eqz v3, :cond_4a

    .line 572
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide v9, v11

    .line 573
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v8

    .line 576
    invoke-super {v0, v8}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_4a
    :goto_4a
    if-eqz v8, :cond_4f

    .line 580
    invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V

    :cond_4f
    if-eq v2, v4, :cond_55

    const/4 v1, 0x3

    if-eq v2, v1, :cond_55

    return v6

    .line 584
    :cond_55
    invoke-direct {v0, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Z)V

    return v6
.end method

.method public final read(Landroid/view/View;)V
    .registers 6

    .line 1523
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatCustomActionResultReceiver:Lo/_handleIncompatibleUpdateValue;

    invoke-virtual {v0, p1}, Lo/_handleIncompatibleUpdateValue;->read(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2d

    .line 1524
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2d

    const/4 v1, 0x0

    .line 1525
    :goto_f
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2d

    .line 1526
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 1528
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1529
    invoke-virtual {v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v3

    if-eqz v3, :cond_2a

    .line 1531
    invoke-virtual {v3, p0, v2, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    :cond_2a
    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_2d
    return-void
.end method

.method public read(Landroid/view/View;IIIII[I)V
    .registers 25

    move-object/from16 v10, p0

    .line 1868
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v11

    const/4 v12, 0x0

    move v0, v12

    move v13, v0

    move v14, v13

    move v15, v14

    :goto_b
    const/4 v9, 0x1

    if-ge v13, v11, :cond_75

    .line 1874
    invoke-virtual {v10, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1875
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v3, :cond_1b

    goto :goto_72

    .line 1880
    :cond_1b
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    move/from16 v8, p6

    .line 1881
    invoke-virtual {v1, v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(I)Z

    move-result v3

    if-nez v3, :cond_2a

    goto :goto_72

    .line 1885
    :cond_2a
    invoke-virtual {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v1

    if-eqz v1, :cond_72

    .line 1888
    iget-object v7, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi21Parcelizer:[I

    aput v12, v7, v12

    .line 1889
    aput v12, v7, v9

    move-object v0, v1

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v16, v7

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, v16

    .line 1891
    invoke-virtual/range {v0 .. v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V

    .line 1894
    iget-object v0, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi21Parcelizer:[I

    if-lez p4, :cond_57

    aget v0, v0, v12

    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_5d

    :cond_57
    aget v0, v0, v12

    .line 1895
    invoke-static {v14, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_5d
    move v14, v0

    .line 1896
    iget-object v0, v10, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesImplApi21Parcelizer:[I

    const/4 v1, 0x1

    if-lez p5, :cond_6a

    aget v0, v0, v1

    invoke-static {v15, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_70

    :cond_6a
    aget v0, v0, v1

    .line 1897
    invoke-static {v15, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_70
    move v15, v0

    move v0, v1

    :cond_72
    :goto_72
    add-int/lit8 v13, v13, 0x1

    goto :goto_b

    :cond_75
    move v1, v9

    .line 1903
    aget v2, p7, v12

    add-int/2addr v2, v14

    aput v2, p7, v12

    .line 1904
    aget v2, p7, v1

    add-int/2addr v2, v15

    aput v2, p7, v1

    if-eqz v0, :cond_85

    .line 1907
    invoke-virtual {v10, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(I)V

    :cond_85
    return-void
.end method

.method public read(Landroid/view/View;Landroid/view/View;II)V
    .registers 6

    .line 1802
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onAddQueueItem:Lo/rootArrayScope;

    invoke-virtual {p1, p3, p4}, Lo/rootArrayScope;->write(II)V

    .line 1803
    iput-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Landroid/view/View;

    .line 1805
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 p2, 0x0

    :goto_c
    if-ge p2, p1, :cond_24

    .line 1807
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    .line 1808
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 1809
    invoke-virtual {p3, p4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(I)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 1813
    invoke-virtual {p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    :cond_21
    add-int/lit8 p2, p2, 0x1

    goto :goto_c

    :cond_24
    return-void
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .registers 5

    .line 3293
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 3294
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 3297
    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 p0, 0x1

    return p0

    .line 3301
    :cond_14
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result p0

    return p0
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .registers 2

    .line 592
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    if-eqz p1, :cond_10

    .line 593
    iget-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatMediaItem:Z

    if-nez p1, :cond_10

    const/4 p1, 0x0

    .line 594
    invoke-direct {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(Z)V

    const/4 p1, 0x1

    .line 595
    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->MediaBrowserCompatMediaItem:Z

    :cond_10
    return-void
.end method

.method public setFitsSystemWindows(Z)V
    .registers 2

    .line 938
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setFitsSystemWindows(Z)V

    .line 939
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read()V

    return-void
.end method

.method public setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V
    .registers 2

    .line 259
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    return-void
.end method

.method public setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 302
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_43

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    .line 304
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_a
    if-eqz p1, :cond_10

    .line 306
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_10
    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_40

    .line 308
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p1

    if-eqz p1, :cond_23

    .line 309
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 311
    :cond_23
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    .line 312
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v0

    .line 311
    invoke-static {p1, v0}, Lo/findFormatOverrides;->RemoteActionCompatParcelizer(Landroid/graphics/drawable/Drawable;I)Z

    .line 313
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_37

    const/4 v0, 0x1

    goto :goto_38

    :cond_37
    move v0, v1

    :goto_38
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 314
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 316
    :cond_40
    invoke-static {p0}, Lo/InvalidTypeIdException;->onRemoveQueueItem(Landroid/view/View;)V

    :cond_43
    return-void
.end method

.method public setStatusBarBackgroundColor(I)V
    .registers 3

    .line 380
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStatusBarBackgroundResource(I)V
    .registers 3

    if-eqz p1, :cond_b

    .line 369
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/_isNaN;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setVisibility(I)V
    .registers 4

    .line 354
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    move p1, v0

    .line 357
    :goto_9
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-eq v1, p1, :cond_18

    .line 358
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_18
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .registers 3

    .line 349
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onMediaButtonEvent:Landroid/graphics/drawable/Drawable;

    if-eq p1, p0, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    const/4 p0, 0x1

    return p0
.end method

.method public final write(Landroid/view/View;I)V
    .registers 5

    .line 889
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 890
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer()Z

    move-result v1

    if-nez v1, :cond_24

    .line 894
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    if-eqz v1, :cond_16

    .line 895
    iget-object v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-direct {p0, p1, v0, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/view/View;I)V

    return-void

    .line 896
    :cond_16
    iget v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    if-ltz v1, :cond_20

    .line 897
    iget v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    invoke-direct {p0, p1, v0, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->RemoteActionCompatParcelizer(Landroid/view/View;II)V

    return-void

    .line 899
    :cond_20
    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read(Landroid/view/View;I)V

    return-void

    .line 891
    :cond_24
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final write(Landroid/view/View;IIII)V
    .registers 6

    .line 760
    invoke-virtual/range {p0 .. p5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    return-void
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.AnonymousClass2 (androidx.coordinatorlayout.widget.CoordinatorLayout$2)
.class final Landroidx/coordinatorlayout/widget/CoordinatorLayout$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/finishBranchObject;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;


# direct methods
.method constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .registers 2

    .line 3312
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$2;->IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .registers 3

    .line 3316
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$2;->IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {p0, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->AudioAttributesCompatParcelizer(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.AudioAttributesCompatParcelizer (androidx.coordinatorlayout.widget.CoordinatorLayout$AudioAttributesCompatParcelizer)
.class final Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;


# direct methods
.method constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .registers 2

    .line 2020
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .registers 2

    .line 2023
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(I)V

    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior (androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior)
.class public abstract Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Behavior"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 2091
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 2102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/view/WindowInsetsCompat;",
            ")",
            "Landroidx/core/view/WindowInsetsCompat;"
        }
    .end annotation

    return-object p0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/os/Parcelable;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public AudioAttributesCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public IconCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;)V
    .registers 2

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "I)V"
        }
    .end annotation

    return-void
.end method

.method public IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/graphics/Rect;",
            "Z)Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            ")Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public RemoteActionCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/graphics/Rect;",
            ")Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;)",
            "Landroid/os/Parcelable;"
        }
    .end annotation

    .line 2778
    sget-object p0, Landroid/view/View$BaseSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    return-object p0
.end method

.method public read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "IIIII[I)V"
        }
    .end annotation

    const/4 p0, 0x0

    .line 2583
    aget p1, p9, p0

    add-int/2addr p1, p6

    aput p1, p9, p0

    const/4 p0, 0x1

    .line 2584
    aget p1, p9, p0

    add-int/2addr p1, p7

    aput p1, p9, p0

    return-void
.end method

.method public read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "II[II)V"
        }
    .end annotation

    return-void
.end method

.method public read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public write(Landroid/view/View;Landroid/view/View;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Landroid/view/View;",
            ")Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;IIII)Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "FF)Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

.method public write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "II)Z"
        }
    .end annotation

    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.IconCompatParcelizer (androidx.coordinatorlayout.widget.CoordinatorLayout$IconCompatParcelizer)
.class final Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;


# direct methods
.method constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .registers 2

    .line 3218
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .registers 4

    .line 3223
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    if-eqz v0, :cond_d

    .line 3224
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    invoke-interface {p0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewAdded(Landroid/view/View;Landroid/view/View;)V

    :cond_d
    return-void
.end method

.method public final onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .registers 5

    .line 3230
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->IconCompatParcelizer(I)V

    .line 3232
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v0, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    if-eqz v0, :cond_13

    .line 3233
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$IconCompatParcelizer;->IconCompatParcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    invoke-interface {p0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V

    :cond_13
    return-void
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.MediaBrowserCompatItemReceiver (androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompatItemReceiver)
.class final Landroidx/coordinatorlayout/widget/CoordinatorLayout$MediaBrowserCompatItemReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MediaBrowserCompatItemReceiver"
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

    .line 2031
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/view/View;Landroid/view/View;)I
    .registers 3

    .line 2034
    invoke-static {p0}, Lo/InvalidTypeIdException;->onPlayFromMediaId(Landroid/view/View;)F

    move-result p0

    .line 2035
    invoke-static {p1}, Lo/InvalidTypeIdException;->onPlayFromMediaId(Landroid/view/View;)F

    move-result p1

    cmpl-float v0, p0, p1

    if-lez v0, :cond_e

    const/4 p0, -0x1

    return p0

    :cond_e
    cmpg-float p0, p0, p1

    if-gez p0, :cond_14

    const/4 p0, 0x1

    return p0

    :cond_14
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 2031
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    invoke-static {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$MediaBrowserCompatItemReceiver;->IconCompatParcelizer(Landroid/view/View;Landroid/view/View;)I

    move-result p0

    return p0
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.RemoteActionCompatParcelizer (androidx.coordinatorlayout.widget.CoordinatorLayout$RemoteActionCompatParcelizer)
.class public final Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field public AudioAttributesCompatParcelizer:I

.field AudioAttributesImplApi21Parcelizer:I

.field AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

.field AudioAttributesImplBaseParcelizer:Z

.field public IconCompatParcelizer:I

.field MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

.field MediaBrowserCompatItemReceiver:Landroid/view/View;

.field MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private MediaDescriptionCompat:I

.field final MediaMetadataCompat:Landroid/graphics/Rect;

.field private RatingCompat:Ljava/lang/Object;

.field public RemoteActionCompatParcelizer:I

.field private handleMediaPlayPauseIfPendingOnHandler:Z

.field private onAddQueueItem:Z

.field private onCustomAction:Z

.field public read:I

.field public write:I


# direct methods
.method public constructor <init>()V
    .registers 3

    const/4 v0, -0x2

    .line 2869
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 2809
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    .line 2818
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 2824
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    const/4 v1, -0x1

    .line 2831
    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 2837
    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    .line 2844
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    .line 2851
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 2864
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Rect;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 7

    .line 2873
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2809
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    .line 2818
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 2824
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    const/4 v1, -0x1

    .line 2831
    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 2837
    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    .line 2844
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    .line 2851
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 2864
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Rect;

    .line 2875
    sget-object v2, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 2878
    sget v3, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout_android_layout_gravity:I

    invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 2881
    sget v3, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout_layout_anchor:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    .line 2883
    sget v3, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout_layout_anchorGravity:I

    invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 2887
    sget v3, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout_layout_keyline:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 2890
    sget v1, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout_layout_insetEdge:I

    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    .line 2891
    sget v1, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout_layout_dodgeInsetEdges:I

    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 2893
    sget v0, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout_layout_behavior:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v0, :cond_66

    .line 2896
    sget v0, Lo/StdDeserializer$IconCompatParcelizer;->CoordinatorLayout_Layout_layout_behavior:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->read(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object p1

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    .line 2899
    :cond_66
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 2901
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz p1, :cond_70

    .line 2903
    invoke-virtual {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;)V

    :cond_70
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 3

    .line 2916
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    .line 2809
    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    .line 2818
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 2824
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    const/4 v0, -0x1

    .line 2831
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 2837
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    .line 2844
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    .line 2851
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 2864
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .registers 3

    .line 2912
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    .line 2809
    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    .line 2818
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 2824
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    const/4 v0, -0x1

    .line 2831
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 2837
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    .line 2844
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    .line 2851
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 2864
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 2908
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    .line 2809
    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    .line 2818
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write:I

    .line 2824
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    const/4 v0, -0x1

    .line 2831
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 2837
    iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    .line 2844
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    .line 2851
    iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 2864
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Rect;

    return-void
.end method

.method private IconCompatParcelizer(Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .registers 7

    .line 3141
    iget v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_4c

    if-ne v0, p2, :cond_20

    .line 3144
    invoke-virtual {p2}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3145
    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    return-void

    .line 3148
    :cond_18
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "View can not be anchored to the the parent CoordinatorLayout"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 3153
    :cond_20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    :goto_24
    if-eq v2, p2, :cond_49

    if-eqz v2, :cond_49

    if-ne v2, p1, :cond_3d

    .line 3157
    invoke-virtual {p2}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_35

    .line 3158
    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    return-void

    .line 3161
    :cond_35
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Anchor must not be a descendant of the anchored view"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 3164
    :cond_3d
    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_44

    .line 3165
    move-object v0, v2

    check-cast v0, Landroid/view/View;

    .line 3155
    :cond_44
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_24

    .line 3168
    :cond_49
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    return-void

    .line 3170
    :cond_4c
    invoke-virtual {p2}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_57

    .line 3171
    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    return-void

    .line 3174
    :cond_57
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not find CoordinatorLayout descendant view with id "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3175
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    iget p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    invoke-virtual {p2, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " to anchor view "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private RemoteActionCompatParcelizer(Landroid/view/View;I)Z
    .registers 3

    .line 3210
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;

    .line 3211
    iget p1, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->read:I

    invoke-static {p1, p2}, Lo/_clearIfStdImpl;->write(II)I

    move-result p1

    if-eqz p1, :cond_19

    .line 3212
    iget p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 3213
    invoke-static {p0, p2}, Lo/_clearIfStdImpl;->write(II)I

    move-result p0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_19

    const/4 p0, 0x1

    return p0

    :cond_19
    const/4 p0, 0x0

    return p0
.end method

.method private write(Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Z
    .registers 7

    .line 3186
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iget v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_c

    return v2

    .line 3190
    :cond_c
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    .line 3191
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    :goto_12
    if-eq v1, p2, :cond_2a

    if-eqz v1, :cond_24

    if-eq v1, p1, :cond_24

    .line 3198
    instance-of v3, v1, Landroid/view/View;

    if-eqz v3, :cond_1f

    .line 3199
    move-object v0, v1

    check-cast v0, Landroid/view/View;

    .line 3193
    :cond_1f
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_12

    :cond_24
    const/4 p1, 0x0

    .line 3195
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    return v2

    .line 3202
    :cond_2a
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(I)V
    .registers 3

    const/4 v0, 0x0

    .line 3054
    invoke-virtual {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(IZ)V

    return-void
.end method

.method final AudioAttributesCompatParcelizer(Landroid/graphics/Rect;)V
    .registers 2

    .line 2987
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method final AudioAttributesCompatParcelizer()Z
    .registers 2

    .line 3014
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-nez v0, :cond_7

    const/4 v0, 0x0

    .line 3015
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:Z

    .line 3017
    :cond_7
    iget-boolean p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:Z

    return p0
.end method

.method final AudioAttributesImplApi26Parcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 3050
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:Z

    return-void
.end method

.method final AudioAttributesImplBaseParcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 3087
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->onCustomAction:Z

    return-void
.end method

.method final IconCompatParcelizer(Z)V
    .registers 2

    .line 3083
    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->onCustomAction:Z

    return-void
.end method

.method final IconCompatParcelizer()Z
    .registers 2

    .line 3003
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    if-nez v0, :cond_b

    iget p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    const/4 v0, -0x1

    if-eq p0, v0, :cond_b

    const/4 p0, 0x1

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method final IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .registers 5

    .line 3100
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    if-eq p3, v0, :cond_1a

    .line 3101
    invoke-static {p1}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result p1

    invoke-direct {p0, p3, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/view/View;I)Z

    move-result p1

    if-nez p1, :cond_1a

    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eqz p0, :cond_18

    .line 3102
    invoke-virtual {p0, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->write(Landroid/view/View;Landroid/view/View;)Z

    move-result p0

    if-nez p0, :cond_1a

    :cond_18
    const/4 p0, 0x0

    return p0

    :cond_1a
    const/4 p0, 0x1

    return p0
.end method

.method final MediaBrowserCompatItemReceiver()Landroid/graphics/Rect;
    .registers 1

    .line 2995
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaMetadataCompat:Landroid/graphics/Rect;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()I
    .registers 1

    .line 2926
    iget p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    return p0
.end method

.method final RemoteActionCompatParcelizer(IZ)V
    .registers 4

    if-eqz p1, :cond_9

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    return-void

    .line 3063
    :cond_6
    iput-boolean p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Z

    return-void

    .line 3060
    :cond_9
    iput-boolean p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->onAddQueueItem:Z

    return-void
.end method

.method final read(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/view/View;
    .registers 5

    .line 3125
    iget v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaDescriptionCompat:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_b

    const/4 p1, 0x0

    .line 3126
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/view/View;

    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    return-object p1

    .line 3130
    :cond_b
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    if-eqz v0, :cond_15

    invoke-direct {p0, p2, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->write(Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Z

    move-result v0

    if-nez v0, :cond_18

    .line 3131
    :cond_15
    invoke-direct {p0, p2, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    .line 3133
    :cond_18
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/view/View;

    return-object p0
.end method

.method final read()Z
    .registers 1

    .line 3079
    iget-boolean p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->onCustomAction:Z

    return p0
.end method

.method public final write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    .registers 1

    .line 2952
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    return-object p0
.end method

.method public final write(Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;)V
    .registers 3

    .line 2965
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    if-eq v0, p1, :cond_16

    if-eqz v0, :cond_9

    .line 2968
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer()V

    .line 2971
    :cond_9
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    const/4 v0, 0x0

    .line 2972
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->RatingCompat:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 2973
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p1, :cond_16

    .line 2977
    invoke-virtual {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->IconCompatParcelizer(Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;)V

    :cond_16
    return-void
.end method

.method final write(I)Z
    .registers 3

    if-eqz p1, :cond_a

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    const/4 p0, 0x0

    return p0

    .line 3073
    :cond_7
    iget-boolean p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:Z

    return p0

    .line 3071
    :cond_a
    iget-boolean p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->onAddQueueItem:Z

    return p0
.end method

.method final write(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Z
    .registers 3

    .line 3033
    iget-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:Z

    if-eqz p1, :cond_6

    const/4 p0, 0x1

    return p0

    .line 3038
    :cond_6
    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$RemoteActionCompatParcelizer;->handleMediaPlayPauseIfPendingOnHandler:Z

    return p1
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState (androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState)
.class public Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;
.super Landroidx/customview/view/AbsSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
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
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field AudioAttributesCompatParcelizer:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 3373
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState$5;

    invoke-direct {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState$5;-><init>()V

    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 8

    .line 3335
    invoke-direct {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 3337
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 3339
    new-array v1, v0, [I

    .line 3340
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 3342
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object p1

    .line 3344
    new-instance p2, Landroid/util/SparseArray;

    invoke-direct {p2, v0}, Landroid/util/SparseArray;-><init>(I)V

    iput-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    const/4 p2, 0x0

    :goto_18
    if-ge p2, v0, :cond_26

    .line 3346
    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    aget v3, v1, p2

    aget-object v4, p1, p2

    invoke-virtual {v2, v3, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_18

    :cond_26
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    .line 3351
    invoke-direct {p0, p1}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 8

    .line 3356
    invoke-super {p0, p1, p2}, Landroidx/customview/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 3358
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    goto :goto_e

    :cond_d
    move v0, v1

    .line 3359
    :goto_e
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 3361
    new-array v2, v0, [I

    .line 3362
    new-array v3, v0, [Landroid/os/Parcelable;

    :goto_15
    if-ge v1, v0, :cond_2c

    .line 3365
    iget-object v4, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    aput v4, v2, v1

    .line 3366
    iget-object v4, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;->AudioAttributesCompatParcelizer:Landroid/util/SparseArray;

    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Parcelable;

    aput-object v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    .line 3368
    :cond_2c
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 3369
    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.AnonymousClass5 (androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$5)
.class final Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 3374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;
    .registers 3

    .line 3377
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    invoke-direct {v0, p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;
    .registers 3

    .line 3382
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;
    .registers 1

    .line 3387
    new-array p0, p0, [Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 3374
    invoke-static {p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState$5;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 3374
    invoke-static {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState$5;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 3374
    invoke-static {p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState$5;->RemoteActionCompatParcelizer(I)[Landroidx/coordinatorlayout/widget/CoordinatorLayout$SavedState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.read (androidx.coordinatorlayout.widget.CoordinatorLayout$read)
.class public interface abstract Landroidx/coordinatorlayout/widget/CoordinatorLayout$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "read"
.end annotation


# virtual methods
.method public abstract write()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.end method

###### Class androidx.coordinatorlayout.widget.CoordinatorLayout.write (androidx.coordinatorlayout.widget.CoordinatorLayout$write)
.class public interface abstract annotation Landroidx/coordinatorlayout/widget/CoordinatorLayout$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "write"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# virtual methods
.method public abstract read()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;",
            ">;"
        }
    .end annotation
.end method
