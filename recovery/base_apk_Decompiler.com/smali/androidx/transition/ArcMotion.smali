###### Class androidx.transition.ArcMotion (androidx.transition.ArcMotion)
.class public Landroidx/transition/ArcMotion;
.super Landroidx/transition/PathMotion;
.source "SourceFile"


# static fields
.field private static final read:F


# instance fields
.field private AudioAttributesCompatParcelizer:F

.field private AudioAttributesImplBaseParcelizer:F

.field private IconCompatParcelizer:F

.field private MediaBrowserCompatCustomActionResultReceiver:F

.field private RemoteActionCompatParcelizer:F

.field private write:F


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-wide v0, 0x4041800000000000L    # 35.0

    .line 56
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float v0, v0

    sput v0, Landroidx/transition/ArcMotion;->read:F

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    .line 65
    invoke-direct {p0}, Landroidx/transition/PathMotion;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput v0, p0, Landroidx/transition/ArcMotion;->AudioAttributesCompatParcelizer:F

    .line 59
    iput v0, p0, Landroidx/transition/ArcMotion;->AudioAttributesImplBaseParcelizer:F

    const/high16 v1, 0x428c0000    # 70.0f

    .line 60
    iput v1, p0, Landroidx/transition/ArcMotion;->write:F

    .line 61
    iput v0, p0, Landroidx/transition/ArcMotion;->RemoteActionCompatParcelizer:F

    .line 62
    iput v0, p0, Landroidx/transition/ArcMotion;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 63
    sget v0, Landroidx/transition/ArcMotion;->read:F

    iput v0, p0, Landroidx/transition/ArcMotion;->IconCompatParcelizer:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 7

    .line 69
    invoke-direct {p0, p1, p2}, Landroidx/transition/PathMotion;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 58
    iput v0, p0, Landroidx/transition/ArcMotion;->AudioAttributesCompatParcelizer:F

    .line 59
    iput v0, p0, Landroidx/transition/ArcMotion;->AudioAttributesImplBaseParcelizer:F

    const/high16 v1, 0x428c0000    # 70.0f

    .line 60
    iput v1, p0, Landroidx/transition/ArcMotion;->write:F

    .line 61
    iput v0, p0, Landroidx/transition/ArcMotion;->RemoteActionCompatParcelizer:F

    .line 62
    iput v0, p0, Landroidx/transition/ArcMotion;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 63
    sget v2, Landroidx/transition/ArcMotion;->read:F

    iput v2, p0, Landroidx/transition/ArcMotion;->IconCompatParcelizer:F

    .line 70
    sget-object v2, Lo/recordRemarketingPing;->read:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 71
    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    .line 72
    const-string v2, "minimumVerticalAngle"

    const/4 v3, 0x1

    invoke-static {p1, p2, v2, v3, v0}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v2

    .line 75
    invoke-direct {p0, v2}, Landroidx/transition/ArcMotion;->RemoteActionCompatParcelizer(F)V

    .line 76
    const-string v2, "minimumHorizontalAngle"

    const/4 v3, 0x0

    invoke-static {p1, p2, v2, v3, v0}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v0

    .line 79
    invoke-direct {p0, v0}, Landroidx/transition/ArcMotion;->AudioAttributesCompatParcelizer(F)V

    .line 80
    const-string v0, "maximumAngle"

    const/4 v2, 0x2

    invoke-static {p1, p2, v0, v2, v1}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p2

    .line 82
    invoke-direct {p0, p2}, Landroidx/transition/ArcMotion;->IconCompatParcelizer(F)V

    .line 83
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(F)V
    .registers 2

    .line 98
    iput p1, p0, Landroidx/transition/ArcMotion;->AudioAttributesCompatParcelizer:F

    .line 99
    invoke-static {p1}, Landroidx/transition/ArcMotion;->write(F)F

    move-result p1

    iput p1, p0, Landroidx/transition/ArcMotion;->RemoteActionCompatParcelizer:F

    return-void
.end method

.method private IconCompatParcelizer(F)V
    .registers 2

    .line 157
    iput p1, p0, Landroidx/transition/ArcMotion;->write:F

    .line 158
    invoke-static {p1}, Landroidx/transition/ArcMotion;->write(F)F

    move-result p1

    iput p1, p0, Landroidx/transition/ArcMotion;->IconCompatParcelizer:F

    return-void
.end method

.method private RemoteActionCompatParcelizer(F)V
    .registers 2

    .line 128
    iput p1, p0, Landroidx/transition/ArcMotion;->AudioAttributesImplBaseParcelizer:F

    .line 129
    invoke-static {p1}, Landroidx/transition/ArcMotion;->write(F)F

    move-result p1

    iput p1, p0, Landroidx/transition/ArcMotion;->MediaBrowserCompatCustomActionResultReceiver:F

    return-void
.end method

.method private static write(F)F
    .registers 3

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-ltz v0, :cond_19

    const/high16 v0, 0x42b40000    # 90.0f

    cmpl-float v0, p0, v0

    if-gtz v0, :cond_19

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p0, v0

    float-to-double v0, p0

    .line 178
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0

    .line 176
    :cond_19
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Arc must be between 0 and 90 degrees"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final write(FFFF)Landroid/graphics/Path;
    .registers 16

    .line 199
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 200
    invoke-virtual {v7, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    sub-float v0, p3, p1

    sub-float v1, p4, p2

    mul-float v2, v0, v0

    mul-float v3, v1, v1

    add-float/2addr v2, v3

    add-float v3, p1, p3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float v5, p2, p4

    div-float/2addr v5, v4

    const/high16 v6, 0x3e800000    # 0.25f

    mul-float/2addr v6, v2

    cmpl-float v8, p2, p4

    if-lez v8, :cond_22

    const/4 v8, 0x1

    goto :goto_23

    :cond_22
    const/4 v8, 0x0

    .line 221
    :goto_23
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v9

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v10

    cmpg-float v9, v9, v10

    if-gez v9, :cond_3f

    mul-float/2addr v1, v4

    div-float/2addr v2, v1

    .line 227
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    if-eqz v8, :cond_3a

    add-float/2addr v0, p4

    move v1, p3

    goto :goto_3c

    :cond_3a
    add-float/2addr v0, p2

    move v1, p1

    .line 236
    :goto_3c
    iget v2, p0, Landroidx/transition/ArcMotion;->MediaBrowserCompatCustomActionResultReceiver:F

    goto :goto_4d

    :cond_3f
    mul-float/2addr v0, v4

    div-float/2addr v2, v0

    if-eqz v8, :cond_47

    add-float/2addr v2, p1

    move v0, p2

    move v1, v2

    goto :goto_4b

    :cond_47
    sub-float v0, p3, v2

    move v1, v0

    move v0, p4

    .line 249
    :goto_4b
    iget v2, p0, Landroidx/transition/ArcMotion;->RemoteActionCompatParcelizer:F

    :goto_4d
    mul-float v8, v6, v2

    mul-float/2addr v8, v2

    sub-float v2, v3, v1

    sub-float v9, v5, v0

    mul-float/2addr v2, v2

    mul-float/2addr v9, v9

    add-float/2addr v2, v9

    .line 256
    iget p0, p0, Landroidx/transition/ArcMotion;->IconCompatParcelizer:F

    mul-float/2addr v6, p0

    mul-float/2addr v6, p0

    cmpg-float p0, v2, v8

    const/4 v9, 0x0

    if-ltz p0, :cond_67

    cmpl-float p0, v2, v6

    if-lez p0, :cond_66

    move v8, v6

    goto :goto_67

    :cond_66
    move v8, v9

    :cond_67
    :goto_67
    cmpl-float p0, v8, v9

    if-eqz p0, :cond_79

    div-float/2addr v8, v2

    float-to-double v8, v8

    .line 266
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float p0, v8

    sub-float/2addr v1, v3

    mul-float/2addr v1, p0

    add-float/2addr v1, v3

    sub-float/2addr v0, v5

    mul-float/2addr p0, v0

    add-float v0, v5, p0

    :cond_79
    add-float/2addr p1, v1

    div-float p0, p1, v4

    add-float/2addr p2, v0

    div-float v2, p2, v4

    add-float/2addr v1, p3

    div-float v3, v1, v4

    add-float/2addr v0, p4

    div-float v4, v0, v4

    move-object v0, v7

    move v1, p0

    move v5, p3

    move v6, p4

    .line 274
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    return-object v7
.end method
