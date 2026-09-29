###### Class androidx.transition.Explode (androidx.transition.Explode)
.class public Landroidx/transition/Explode;
.super Landroidx/transition/Visibility;
.source "SourceFile"


# static fields
.field private static final AudioAttributesImplApi21Parcelizer:Landroid/animation/TimeInterpolator;

.field private static final RemoteActionCompatParcelizer:Landroid/animation/TimeInterpolator;


# instance fields
.field private MediaDescriptionCompat:[I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 45
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/transition/Explode;->AudioAttributesImplApi21Parcelizer:Landroid/animation/TimeInterpolator;

    .line 46
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/transition/Explode;->RemoteActionCompatParcelizer:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 51
    invoke-direct {p0}, Landroidx/transition/Visibility;-><init>()V

    const/4 v0, 0x2

    .line 49
    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    .line 52
    new-instance v0, Lo/Entry;

    invoke-direct {v0}, Lo/Entry;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->read(Lo/Rcolor;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 56
    invoke-direct {p0, p1, p2}, Landroidx/transition/Visibility;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x2

    .line 49
    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    .line 57
    new-instance p1, Lo/Entry;

    invoke-direct {p1}, Lo/Entry;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/transition/Transition;->read(Lo/Rcolor;)V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/view/View;II)F
    .registers 4

    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 174
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    sub-int/2addr p0, p2

    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    int-to-float p1, p1

    int-to-float p0, p0

    .line 175
    invoke-static {p1, p0}, Landroidx/transition/Explode;->RemoteActionCompatParcelizer(FF)F

    move-result p0

    return p0
.end method

.method private IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;[I)V
    .registers 14

    .line 134
    iget-object v0, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 135
    iget-object v0, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    .line 136
    aget v0, v0, v3

    .line 140
    invoke-virtual {p0}, Landroidx/transition/Transition;->AudioAttributesImplApi26Parcelizer()Landroid/graphics/Rect;

    move-result-object p0

    if-nez p0, :cond_34

    .line 142
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    add-int/2addr p0, v2

    .line 143
    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-int/2addr p0, v4

    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v0

    .line 145
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_3f

    .line 147
    :cond_34
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    move-result v4

    .line 148
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerY()I

    move-result p0

    move v9, v4

    move v4, p0

    move p0, v9

    .line 151
    :goto_3f
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    move-result v5

    .line 152
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    move-result p2

    sub-int/2addr v5, p0

    int-to-float v5, v5

    sub-int/2addr p2, v4

    int-to-float p2, p2

    const/4 v6, 0x0

    cmpl-float v7, v5, v6

    if-nez v7, :cond_69

    cmpl-float v6, p2, v6

    if-nez v6, :cond_69

    .line 158
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v5

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    mul-double/2addr v5, v7

    double-to-float p2, v5

    .line 159
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v5

    mul-double/2addr v5, v7

    double-to-float v5, v5

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float/2addr p2, v6

    sub-float/2addr v5, v6

    move v9, v5

    move v5, p2

    move p2, v9

    .line 161
    :cond_69
    invoke-static {v5, p2}, Landroidx/transition/Explode;->RemoteActionCompatParcelizer(FF)F

    move-result v6

    div-float/2addr v5, v6

    div-float/2addr p2, v6

    sub-int/2addr p0, v2

    sub-int/2addr v4, v0

    .line 166
    invoke-static {p1, p0, v4}, Landroidx/transition/Explode;->IconCompatParcelizer(Landroid/view/View;II)F

    move-result p0

    mul-float/2addr v5, p0

    .line 168
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result p1

    aput p1, p3, v1

    mul-float/2addr p0, p2

    .line 169
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    aput p0, p3, v3

    return-void
.end method

.method private IconCompatParcelizer(Lo/Rstring;)V
    .registers 6

    .line 61
    iget-object v0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 62
    iget-object v1, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 63
    iget-object p0, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    const/4 v1, 0x0

    aget v1, p0, v1

    const/4 v2, 0x1

    .line 64
    aget p0, p0, v2

    .line 65
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 67
    iget-object p1, p1, Lo/Rstring;->read:Ljava/util/Map;

    new-instance v3, Landroid/graphics/Rect;

    add-int/2addr v2, v1

    add-int/2addr v0, p0

    invoke-direct {v3, v1, p0, v2, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    const-string p0, "android:explode:screenBounds"

    invoke-interface {p1, p0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static RemoteActionCompatParcelizer(FF)F
    .registers 2

    mul-float/2addr p0, p0

    mul-float/2addr p1, p1

    add-float/2addr p0, p1

    float-to-double p0, p0

    .line 179
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 15

    if-nez p3, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 110
    :cond_4
    iget-object p4, p3, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:explode:screenBounds"

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/graphics/Rect;

    .line 111
    iget v2, p4, Landroid/graphics/Rect;->left:I

    .line 112
    iget v3, p4, Landroid/graphics/Rect;->top:I

    .line 113
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v4

    .line 114
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v5

    .line 117
    iget-object v0, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_position:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_3e

    .line 121
    aget v7, v0, v6

    iget v8, p4, Landroid/graphics/Rect;->left:I

    sub-int/2addr v7, v8

    int-to-float v7, v7

    add-float/2addr v7, v4

    .line 122
    aget v8, v0, v1

    iget v9, p4, Landroid/graphics/Rect;->top:I

    sub-int/2addr v8, v9

    int-to-float v8, v8

    add-float/2addr v8, v5

    .line 123
    aget v9, v0, v6

    aget v0, v0, v1

    invoke-virtual {p4, v9, v0}, Landroid/graphics/Rect;->offsetTo(II)V

    goto :goto_40

    :cond_3e
    move v7, v4

    move v8, v5

    .line 125
    :goto_40
    iget-object v0, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    invoke-direct {p0, p1, p4, v0}, Landroidx/transition/Explode;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;[I)V

    .line 126
    iget-object p1, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    aget p4, p1, v6

    int-to-float p4, p4

    .line 127
    aget p1, p1, v1

    int-to-float p1, p1

    add-float v6, v7, p4

    add-float v7, v8, p1

    .line 129
    sget-object v8, Landroidx/transition/Explode;->RemoteActionCompatParcelizer:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p3

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Lo/addPackageToPreferred;->RemoteActionCompatParcelizer(Landroid/view/View;Lo/Rstring;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 2

    .line 78
    invoke-super {p0, p1}, Landroidx/transition/Visibility;->RemoteActionCompatParcelizer(Lo/Rstring;)V

    .line 79
    invoke-direct {p0, p1}, Landroidx/transition/Explode;->IconCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final read(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 15

    if-nez p4, :cond_4

    const/4 p0, 0x0

    return-object p0

    .line 93
    :cond_4
    iget-object p3, p4, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:explode:screenBounds"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Rect;

    .line 94
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result v6

    .line 95
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    move-result v7

    .line 96
    iget-object v0, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    invoke-direct {p0, p1, p3, v0}, Landroidx/transition/Explode;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Rect;[I)V

    .line 97
    iget-object p1, p0, Landroidx/transition/Explode;->MediaDescriptionCompat:[I

    const/4 v0, 0x0

    aget v0, p1, v0

    int-to-float v0, v0

    const/4 v1, 0x1

    .line 98
    aget p1, p1, v1

    int-to-float p1, p1

    .line 100
    iget v2, p3, Landroid/graphics/Rect;->left:I

    iget v3, p3, Landroid/graphics/Rect;->top:I

    add-float v4, v6, v0

    add-float v5, v7, p1

    sget-object v8, Landroidx/transition/Explode;->AudioAttributesImplApi21Parcelizer:Landroid/animation/TimeInterpolator;

    move-object v0, p2

    move-object v1, p4

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Lo/addPackageToPreferred;->RemoteActionCompatParcelizer(Landroid/view/View;Lo/Rstring;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public final read(Lo/Rstring;)V
    .registers 2

    .line 72
    invoke-super {p0, p1}, Landroidx/transition/Visibility;->read(Lo/Rstring;)V

    .line 73
    invoke-direct {p0, p1}, Landroidx/transition/Explode;->IconCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final read()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method
