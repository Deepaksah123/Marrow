###### Class androidx.constraintlayout.utils.widget.MockView (androidx.constraintlayout.utils.widget.MockView)
.class public Landroidx/constraintlayout/utils/widget/MockView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

.field private AudioAttributesImplApi26Parcelizer:Landroid/graphics/Paint;

.field private AudioAttributesImplBaseParcelizer:I

.field private IconCompatParcelizer:I

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

.field private MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

.field private MediaBrowserCompatSearchResultReceiver:I

.field private RemoteActionCompatParcelizer:Z

.field protected read:Ljava/lang/String;

.field private write:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 5

    .line 52
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Paint;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->RemoteActionCompatParcelizer:Z

    .line 43
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer:Z

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->read:Ljava/lang/String;

    .line 45
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/16 v2, 0xff

    .line 46
    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/utils/widget/MockView;->IconCompatParcelizer:I

    const/16 v1, 0xc8

    .line 47
    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatSearchResultReceiver:I

    const/16 v1, 0x32

    .line 48
    invoke-static {v2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplBaseParcelizer:I

    const/4 v1, 0x4

    .line 49
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    .line 53
    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 57
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Paint;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->RemoteActionCompatParcelizer:Z

    .line 43
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer:Z

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->read:Ljava/lang/String;

    .line 45
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    const/4 v0, 0x0

    const/16 v1, 0xff

    .line 46
    invoke-static {v1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->IconCompatParcelizer:I

    const/16 v0, 0xc8

    .line 47
    invoke-static {v1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatSearchResultReceiver:I

    const/16 v0, 0x32

    .line 48
    invoke-static {v1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplBaseParcelizer:I

    const/4 v0, 0x4

    .line 49
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    .line 58
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    .line 62
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    .line 40
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Paint;

    .line 41
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    const/4 p3, 0x1

    .line 42
    iput-boolean p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->RemoteActionCompatParcelizer:Z

    .line 43
    iput-boolean p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer:Z

    const/4 p3, 0x0

    .line 44
    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->read:Ljava/lang/String;

    .line 45
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    const/4 p3, 0x0

    const/16 v0, 0xff

    .line 46
    invoke-static {v0, p3, p3, p3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p3

    iput p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->IconCompatParcelizer:I

    const/16 p3, 0xc8

    .line 47
    invoke-static {v0, p3, p3, p3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p3

    iput p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatSearchResultReceiver:I

    const/16 p3, 0x32

    .line 48
    invoke-static {v0, p3, p3, p3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p3

    iput p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplBaseParcelizer:I

    const/4 p3, 0x4

    .line 49
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    .line 63
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 7

    if-eqz p2, :cond_64

    .line 68
    sget-object v0, Lo/_isBlank$read;->MockView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 69
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_d
    if-ge v1, v0, :cond_61

    .line 71
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 72
    sget v3, Lo/_isBlank$read;->MockView_mock_label:I

    if-ne v2, v3, :cond_1e

    .line 73
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->read:Ljava/lang/String;

    goto :goto_5e

    .line 74
    :cond_1e
    sget v3, Lo/_isBlank$read;->MockView_mock_showDiagonals:I

    if-ne v2, v3, :cond_2b

    .line 75
    iget-boolean v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->RemoteActionCompatParcelizer:Z

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->RemoteActionCompatParcelizer:Z

    goto :goto_5e

    .line 76
    :cond_2b
    sget v3, Lo/_isBlank$read;->MockView_mock_diagonalsColor:I

    if-ne v2, v3, :cond_38

    .line 77
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->IconCompatParcelizer:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->IconCompatParcelizer:I

    goto :goto_5e

    .line 78
    :cond_38
    sget v3, Lo/_isBlank$read;->MockView_mock_labelBackgroundColor:I

    if-ne v2, v3, :cond_45

    .line 79
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplBaseParcelizer:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplBaseParcelizer:I

    goto :goto_5e

    .line 80
    :cond_45
    sget v3, Lo/_isBlank$read;->MockView_mock_labelColor:I

    if-ne v2, v3, :cond_52

    .line 81
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatSearchResultReceiver:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatSearchResultReceiver:I

    goto :goto_5e

    .line 82
    :cond_52
    sget v3, Lo/_isBlank$read;->MockView_mock_showLabel:I

    if-ne v2, v3, :cond_5e

    .line 83
    iget-boolean v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer:Z

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer:Z

    :cond_5e
    :goto_5e
    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    .line 86
    :cond_61
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 88
    :cond_64
    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MockView;->read:Ljava/lang/String;

    if-nez p2, :cond_76

    .line 90
    :try_start_68
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->read:Ljava/lang/String;
    :try_end_76
    .catch Ljava/lang/Exception; {:try_start_68 .. :try_end_76} :catch_76

    .line 94
    :catch_76
    :cond_76
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    iget p2, p0, Landroidx/constraintlayout/utils/widget/MockView;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 95
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 96
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Paint;

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatSearchResultReceiver:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 97
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 98
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    iget p2, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplBaseParcelizer:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 99
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->xdpi:F

    const/high16 v0, 0x43200000    # 160.0f

    div-float/2addr p2, v0

    mul-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 12

    .line 104
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 107
    iget-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->RemoteActionCompatParcelizer:Z

    if-eqz v2, :cond_41

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, -0x1

    int-to-float v8, v0

    int-to-float v9, v1

    .line 110
    iget-object v7, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move v5, v8

    move v6, v9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const/4 v6, 0x0

    .line 111
    iget-object v7, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    move v4, v9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const/4 v4, 0x0

    .line 112
    iget-object v7, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 113
    iget-object v7, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    move v3, v8

    move v6, v9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const/4 v5, 0x0

    .line 114
    iget-object v7, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    move v4, v9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const/4 v3, 0x0

    const/4 v6, 0x0

    .line 115
    iget-object v7, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/Paint;

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 117
    :cond_41
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->read:Ljava/lang/String;

    if-eqz v2, :cond_a5

    iget-boolean v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesCompatParcelizer:Z

    if-eqz v3, :cond_a5

    .line 118
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Paint;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    const/4 v6, 0x0

    invoke-virtual {v3, v2, v6, v4, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 119
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    .line 120
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    sub-int/2addr v1, v3

    int-to-float v1, v1

    div-float/2addr v1, v2

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    .line 121
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    float-to-int v3, v0

    float-to-int v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Rect;->offset(II)V

    .line 122
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    sub-int/2addr v3, v4

    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    iget v5, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    sub-int/2addr v4, v5

    iget-object v5, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    iget v6, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    add-int/2addr v5, v6

    iget-object v6, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    iget v7, p0, Landroidx/constraintlayout/utils/widget/MockView;->write:I

    add-int/2addr v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 124
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/Rect;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MockView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 125
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MockView;->read:Ljava/lang/String;

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MockView;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0, v1, p0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_a5
    return-void
.end method
