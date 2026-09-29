###### Class com.facebook.shimmer.Shimmer (com.facebook.shimmer.Shimmer)
.class public Lcom/facebook/shimmer/Shimmer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/shimmer/Shimmer$AlphaHighlightBuilder;,
        Lcom/facebook/shimmer/Shimmer$Builder;,
        Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;,
        Lcom/facebook/shimmer/Shimmer$Direction;,
        Lcom/facebook/shimmer/Shimmer$Shape;
    }
.end annotation


# static fields
.field private static final COMPONENT_COUNT:I = 0x4


# instance fields
.field alphaShimmer:Z

.field animationDuration:J

.field autoStart:Z

.field baseColor:I

.field final bounds:Landroid/graphics/RectF;

.field clipToChildren:Z

.field final colors:[I

.field direction:I

.field dropoff:F

.field fixedHeight:I

.field fixedWidth:I

.field heightRatio:F

.field highlightColor:I

.field intensity:F

.field final positions:[F

.field repeatCount:I

.field repeatDelay:J

.field repeatMode:I

.field shape:I

.field tilt:F

.field widthRatio:F


# direct methods
.method constructor <init>()V
    .registers 4

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 55
    new-array v1, v0, [F

    iput-object v1, p0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    .line 56
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/facebook/shimmer/Shimmer;->colors:[I

    .line 57
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/facebook/shimmer/Shimmer;->bounds:Landroid/graphics/RectF;

    const/4 v0, 0x0

    .line 59
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->direction:I

    const/4 v1, -0x1

    .line 60
    iput v1, p0, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    const v2, 0x4cffffff    # 1.3421772E8f

    .line 61
    iput v2, p0, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    .line 62
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->shape:I

    .line 63
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->fixedWidth:I

    .line 64
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->fixedHeight:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 66
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->widthRatio:F

    .line 67
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->heightRatio:F

    const/4 v0, 0x0

    .line 68
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->intensity:F

    const/high16 v0, 0x3f000000    # 0.5f

    .line 69
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->dropoff:F

    const/high16 v0, 0x41a00000    # 20.0f

    .line 70
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->tilt:F

    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Lcom/facebook/shimmer/Shimmer;->clipToChildren:Z

    .line 73
    iput-boolean v0, p0, Lcom/facebook/shimmer/Shimmer;->autoStart:Z

    .line 74
    iput-boolean v0, p0, Lcom/facebook/shimmer/Shimmer;->alphaShimmer:Z

    .line 76
    iput v1, p0, Lcom/facebook/shimmer/Shimmer;->repeatCount:I

    .line 77
    iput v0, p0, Lcom/facebook/shimmer/Shimmer;->repeatMode:I

    const-wide/16 v0, 0x3e8

    .line 78
    iput-wide v0, p0, Lcom/facebook/shimmer/Shimmer;->animationDuration:J

    return-void
.end method


# virtual methods
.method height(I)I
    .registers 3

    .line 88
    iget v0, p0, Lcom/facebook/shimmer/Shimmer;->fixedHeight:I

    if-lez v0, :cond_5

    return v0

    :cond_5
    iget p0, p0, Lcom/facebook/shimmer/Shimmer;->heightRatio:F

    int-to-float p1, p1

    mul-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method updateBounds(II)V
    .registers 10

    .line 128
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 129
    iget v1, p0, Lcom/facebook/shimmer/Shimmer;->tilt:F

    const/high16 v2, 0x42b40000    # 90.0f

    rem-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    int-to-double v3, v0

    const-wide v5, 0x3ff921fb54442d18L    # 1.5707963267948966

    sub-double/2addr v5, v1

    .line 130
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    div-double v0, v3, v0

    sub-double/2addr v0, v3

    double-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 131
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    .line 132
    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer;->bounds:Landroid/graphics/RectF;

    neg-int v2, v0

    int-to-float v2, v2

    invoke-virtual {p0, p1}, Lcom/facebook/shimmer/Shimmer;->width(I)I

    move-result p1

    add-int/2addr p1, v0

    int-to-float p1, p1

    invoke-virtual {p0, p2}, Lcom/facebook/shimmer/Shimmer;->height(I)I

    move-result p0

    add-int/2addr p0, v0

    int-to-float p0, p0

    invoke-virtual {v1, v2, v2, p1, p0}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method updateColors()V
    .registers 7

    .line 92
    iget v0, p0, Lcom/facebook/shimmer/Shimmer;->shape:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_17

    .line 95
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer;->colors:[I

    iget v5, p0, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    aput v5, v0, v3

    .line 96
    iget p0, p0, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    aput p0, v0, v4

    .line 97
    aput p0, v0, v2

    .line 98
    aput v5, v0, v1

    return-void

    .line 101
    :cond_17
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer;->colors:[I

    iget v5, p0, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    aput v5, v0, v3

    .line 102
    aput v5, v0, v4

    .line 103
    iget p0, p0, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    aput p0, v0, v2

    .line 104
    aput p0, v0, v1

    return-void
.end method

.method updatePositions()V
    .registers 10

    .line 110
    iget v0, p0, Lcom/facebook/shimmer/Shimmer;->shape:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x1

    if-eq v0, v6, :cond_4b

    .line 113
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    iget v7, p0, Lcom/facebook/shimmer/Shimmer;->intensity:F

    sub-float v7, v5, v7

    iget v8, p0, Lcom/facebook/shimmer/Shimmer;->dropoff:F

    sub-float/2addr v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-static {v7, v4}, Ljava/lang/Math;->max(FF)F

    move-result v7

    aput v7, v0, v3

    .line 114
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    iget v3, p0, Lcom/facebook/shimmer/Shimmer;->intensity:F

    sub-float v3, v5, v3

    const v7, 0x3a83126f    # 0.001f

    sub-float/2addr v3, v7

    div-float/2addr v3, v8

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    aput v3, v0, v6

    .line 115
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    iget v3, p0, Lcom/facebook/shimmer/Shimmer;->intensity:F

    add-float/2addr v3, v5

    add-float/2addr v3, v7

    div-float/2addr v3, v8

    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v3

    aput v3, v0, v2

    .line 116
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    iget v2, p0, Lcom/facebook/shimmer/Shimmer;->intensity:F

    add-float/2addr v2, v5

    iget p0, p0, Lcom/facebook/shimmer/Shimmer;->dropoff:F

    add-float/2addr v2, p0

    div-float/2addr v2, v8

    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result p0

    aput p0, v0, v1

    return-void

    .line 119
    :cond_4b
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    aput v4, v0, v3

    .line 120
    iget v3, p0, Lcom/facebook/shimmer/Shimmer;->intensity:F

    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v3

    aput v3, v0, v6

    .line 121
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    iget v3, p0, Lcom/facebook/shimmer/Shimmer;->intensity:F

    iget v4, p0, Lcom/facebook/shimmer/Shimmer;->dropoff:F

    add-float/2addr v3, v4

    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v3

    aput v3, v0, v2

    .line 122
    iget-object p0, p0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    aput v5, p0, v1

    return-void
.end method

.method width(I)I
    .registers 3

    .line 84
    iget v0, p0, Lcom/facebook/shimmer/Shimmer;->fixedWidth:I

    if-lez v0, :cond_5

    return v0

    :cond_5
    iget p0, p0, Lcom/facebook/shimmer/Shimmer;->widthRatio:F

    int-to-float p1, p1

    mul-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

###### Class com.facebook.shimmer.Shimmer.AlphaHighlightBuilder (com.facebook.shimmer.Shimmer$AlphaHighlightBuilder)
.class public Lcom/facebook/shimmer/Shimmer$AlphaHighlightBuilder;
.super Lcom/facebook/shimmer/Shimmer$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/Shimmer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AlphaHighlightBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/shimmer/Shimmer$Builder<",
        "Lcom/facebook/shimmer/Shimmer$AlphaHighlightBuilder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 422
    invoke-direct {p0}, Lcom/facebook/shimmer/Shimmer$Builder;-><init>()V

    .line 423
    iget-object p0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/shimmer/Shimmer;->alphaShimmer:Z

    return-void
.end method


# virtual methods
.method protected getThis()Lcom/facebook/shimmer/Shimmer$AlphaHighlightBuilder;
    .registers 1

    return-object p0
.end method

.method protected bridge synthetic getThis()Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 1

    .line 421
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$AlphaHighlightBuilder;->getThis()Lcom/facebook/shimmer/Shimmer$AlphaHighlightBuilder;

    move-result-object p0

    return-object p0
.end method

###### Class com.facebook.shimmer.Shimmer.Builder (com.facebook.shimmer.Shimmer$Builder)
.class public abstract Lcom/facebook/shimmer/Shimmer$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/Shimmer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/facebook/shimmer/Shimmer$Builder<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final mShimmer:Lcom/facebook/shimmer/Shimmer;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    new-instance v0, Lcom/facebook/shimmer/Shimmer;

    invoke-direct {v0}, Lcom/facebook/shimmer/Shimmer;-><init>()V

    iput-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    return-void
.end method

.method private static clamp(FFF)F
    .registers 3

    .line 417
    invoke-static {p0, p2}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {p1, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public build()Lcom/facebook/shimmer/Shimmer;
    .registers 2

    .line 411
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    invoke-virtual {v0}, Lcom/facebook/shimmer/Shimmer;->updateColors()V

    .line 412
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    invoke-virtual {v0}, Lcom/facebook/shimmer/Shimmer;->updatePositions()V

    .line 413
    iget-object p0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    return-object p0
.end method

.method public consumeAttributes(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/AttributeSet;",
            ")TT;"
        }
    .end annotation

    .line 143
    sget-object v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 144
    invoke-virtual {p0, p1}, Lcom/facebook/shimmer/Shimmer$Builder;->consumeAttributes(Landroid/content/res/TypedArray;)Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method consumeAttributes(Landroid/content/res/TypedArray;)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/TypedArray;",
            ")TT;"
        }
    .end annotation

    .line 148
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_clip_to_children:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 149
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_clip_to_children:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-boolean v1, v1, Lcom/facebook/shimmer/Shimmer;->clipToChildren:Z

    .line 150
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 149
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setClipToChildren(Z)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 153
    :cond_15
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_auto_start:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 154
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_auto_start:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-boolean v1, v1, Lcom/facebook/shimmer/Shimmer;->autoStart:Z

    .line 155
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 154
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setAutoStart(Z)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 157
    :cond_2a
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_base_alpha:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3e

    .line 158
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_base_alpha:I

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setBaseAlpha(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 160
    :cond_3e
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_highlight_alpha:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_51

    .line 161
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_highlight_alpha:I

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setHighlightAlpha(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 163
    :cond_51
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_duration:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_68

    .line 164
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_duration:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-wide v1, v1, Lcom/facebook/shimmer/Shimmer;->animationDuration:J

    long-to-int v1, v1

    .line 165
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    int-to-long v0, v0

    .line 164
    invoke-virtual {p0, v0, v1}, Lcom/facebook/shimmer/Shimmer$Builder;->setDuration(J)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 168
    :cond_68
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_repeat_count:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_7d

    .line 169
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_repeat_count:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->repeatCount:I

    .line 170
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 169
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setRepeatCount(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 172
    :cond_7d
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_repeat_delay:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_94

    .line 173
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_repeat_delay:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-wide v1, v1, Lcom/facebook/shimmer/Shimmer;->repeatDelay:J

    long-to-int v1, v1

    .line 174
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    int-to-long v0, v0

    .line 173
    invoke-virtual {p0, v0, v1}, Lcom/facebook/shimmer/Shimmer$Builder;->setRepeatDelay(J)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 177
    :cond_94
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_repeat_mode:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_a9

    .line 178
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_repeat_mode:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->repeatMode:I

    .line 179
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 178
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setRepeatMode(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 182
    :cond_a9
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_direction:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_d4

    .line 183
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_direction:I

    iget-object v3, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v3, v3, Lcom/facebook/shimmer/Shimmer;->direction:I

    .line 184
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    if-eq v0, v2, :cond_d1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_cd

    const/4 v3, 0x3

    if-eq v0, v3, :cond_c9

    .line 188
    invoke-virtual {p0, v1}, Lcom/facebook/shimmer/Shimmer$Builder;->setDirection(I)Lcom/facebook/shimmer/Shimmer$Builder;

    goto :goto_d4

    .line 197
    :cond_c9
    invoke-virtual {p0, v3}, Lcom/facebook/shimmer/Shimmer$Builder;->setDirection(I)Lcom/facebook/shimmer/Shimmer$Builder;

    goto :goto_d4

    .line 194
    :cond_cd
    invoke-virtual {p0, v3}, Lcom/facebook/shimmer/Shimmer$Builder;->setDirection(I)Lcom/facebook/shimmer/Shimmer$Builder;

    goto :goto_d4

    .line 191
    :cond_d1
    invoke-virtual {p0, v2}, Lcom/facebook/shimmer/Shimmer$Builder;->setDirection(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 202
    :cond_d4
    :goto_d4
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_shape:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_ef

    .line 203
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_shape:I

    iget-object v3, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v3, v3, Lcom/facebook/shimmer/Shimmer;->shape:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    if-eq v0, v2, :cond_ec

    .line 207
    invoke-virtual {p0, v1}, Lcom/facebook/shimmer/Shimmer$Builder;->setShape(I)Lcom/facebook/shimmer/Shimmer$Builder;

    goto :goto_ef

    .line 210
    :cond_ec
    invoke-virtual {p0, v2}, Lcom/facebook/shimmer/Shimmer$Builder;->setShape(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 215
    :cond_ef
    :goto_ef
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_dropoff:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_104

    .line 216
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_dropoff:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->dropoff:F

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setDropoff(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 218
    :cond_104
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_fixed_width:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_119

    .line 219
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_fixed_width:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->fixedWidth:I

    .line 220
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    .line 219
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setFixedWidth(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 223
    :cond_119
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_fixed_height:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_12e

    .line 224
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_fixed_height:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->fixedHeight:I

    .line 225
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    .line 224
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setFixedHeight(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 228
    :cond_12e
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_intensity:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_143

    .line 229
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_intensity:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->intensity:F

    .line 230
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 229
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setIntensity(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 232
    :cond_143
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_width_ratio:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_158

    .line 233
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_width_ratio:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->widthRatio:F

    .line 234
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 233
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setWidthRatio(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 236
    :cond_158
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_height_ratio:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_16d

    .line 237
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_height_ratio:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->heightRatio:F

    .line 238
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 237
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setHeightRatio(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 240
    :cond_16d
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_tilt:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_182

    .line 241
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_tilt:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->tilt:F

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/facebook/shimmer/Shimmer$Builder;->setTilt(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 243
    :cond_182
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public copyFrom(Lcom/facebook/shimmer/Shimmer;)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/shimmer/Shimmer;",
            ")TT;"
        }
    .end annotation

    .line 248
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->direction:I

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setDirection(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 249
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->shape:I

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setShape(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 250
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->fixedWidth:I

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setFixedWidth(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 251
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->fixedHeight:I

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setFixedHeight(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 252
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->widthRatio:F

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setWidthRatio(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 253
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->heightRatio:F

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setHeightRatio(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 254
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->intensity:F

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setIntensity(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 255
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->dropoff:F

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setDropoff(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 256
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->tilt:F

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setTilt(F)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 257
    iget-boolean v0, p1, Lcom/facebook/shimmer/Shimmer;->clipToChildren:Z

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setClipToChildren(Z)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 258
    iget-boolean v0, p1, Lcom/facebook/shimmer/Shimmer;->autoStart:Z

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setAutoStart(Z)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 259
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->repeatCount:I

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setRepeatCount(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 260
    iget v0, p1, Lcom/facebook/shimmer/Shimmer;->repeatMode:I

    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$Builder;->setRepeatMode(I)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 261
    iget-wide v0, p1, Lcom/facebook/shimmer/Shimmer;->repeatDelay:J

    invoke-virtual {p0, v0, v1}, Lcom/facebook/shimmer/Shimmer$Builder;->setRepeatDelay(J)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 262
    iget-wide v0, p1, Lcom/facebook/shimmer/Shimmer;->animationDuration:J

    invoke-virtual {p0, v0, v1}, Lcom/facebook/shimmer/Shimmer$Builder;->setDuration(J)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 263
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, p1, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    iput v1, v0, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    .line 264
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget p1, p1, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    .line 265
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method protected abstract getThis()Lcom/facebook/shimmer/Shimmer$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public setAutoStart(Z)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 370
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput-boolean p1, v0, Lcom/facebook/shimmer/Shimmer;->autoStart:Z

    .line 371
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setBaseAlpha(F)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 347
    invoke-static {v0, v1, p1}, Lcom/facebook/shimmer/Shimmer$Builder;->clamp(FFF)F

    move-result p1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    .line 348
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    shl-int/lit8 p1, p1, 0x18

    iget v1, v0, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    const v2, 0xffffff

    and-int/2addr v1, v2

    or-int/2addr p1, v1

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    .line 349
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setClipToChildren(Z)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 364
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput-boolean p1, v0, Lcom/facebook/shimmer/Shimmer;->clipToChildren:Z

    .line 365
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setDirection(I)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 270
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->direction:I

    .line 271
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setDropoff(F)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_e

    .line 332
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->dropoff:F

    .line 333
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0

    .line 330
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given invalid dropoff value: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setDuration(J)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_f

    .line 406
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput-wide p1, v0, Lcom/facebook/shimmer/Shimmer;->animationDuration:J

    .line 407
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0

    .line 404
    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given a negative duration: "

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setFixedHeight(I)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    if-ltz p1, :cond_b

    .line 294
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->fixedHeight:I

    .line 295
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0

    .line 292
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given invalid height: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setFixedWidth(I)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    if-ltz p1, :cond_b

    .line 285
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->fixedWidth:I

    .line 286
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0

    .line 283
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given invalid width: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setHeightRatio(F)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_e

    .line 312
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->heightRatio:F

    .line 313
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0

    .line 310
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given invalid height ratio: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setHighlightAlpha(F)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 354
    invoke-static {v0, v1, p1}, Lcom/facebook/shimmer/Shimmer$Builder;->clamp(FFF)F

    move-result p1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    .line 355
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    shl-int/lit8 p1, p1, 0x18

    iget v1, v0, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    const v2, 0xffffff

    and-int/2addr v1, v2

    or-int/2addr p1, v1

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    .line 356
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setIntensity(F)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_e

    .line 321
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->intensity:F

    .line 322
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0

    .line 319
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given invalid intensity value: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setRepeatCount(I)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 379
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->repeatCount:I

    .line 380
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setRepeatDelay(J)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TT;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_f

    .line 397
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput-wide p1, v0, Lcom/facebook/shimmer/Shimmer;->repeatDelay:J

    .line 398
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0

    .line 395
    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given a negative repeat delay: "

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setRepeatMode(I)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 388
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->repeatMode:I

    .line 389
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setShape(I)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 276
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->shape:I

    .line 277
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setTilt(F)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    .line 338
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->tilt:F

    .line 339
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0
.end method

.method public setWidthRatio(F)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_e

    .line 303
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->widthRatio:F

    .line 304
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$Builder;->getThis()Lcom/facebook/shimmer/Shimmer$Builder;

    move-result-object p0

    return-object p0

    .line 301
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given invalid width ratio: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class com.facebook.shimmer.Shimmer.ColorHighlightBuilder (com.facebook.shimmer.Shimmer$ColorHighlightBuilder)
.class public Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;
.super Lcom/facebook/shimmer/Shimmer$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/Shimmer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ColorHighlightBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/shimmer/Shimmer$Builder<",
        "Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 433
    invoke-direct {p0}, Lcom/facebook/shimmer/Shimmer$Builder;-><init>()V

    .line 434
    iget-object p0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/shimmer/Shimmer;->alphaShimmer:Z

    return-void
.end method


# virtual methods
.method bridge synthetic consumeAttributes(Landroid/content/res/TypedArray;)Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 2

    .line 432
    invoke-virtual {p0, p1}, Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;->consumeAttributes(Landroid/content/res/TypedArray;)Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;

    move-result-object p0

    return-object p0
.end method

.method consumeAttributes(Landroid/content/res/TypedArray;)Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;
    .registers 4

    .line 451
    invoke-super {p0, p1}, Lcom/facebook/shimmer/Shimmer$Builder;->consumeAttributes(Landroid/content/res/TypedArray;)Lcom/facebook/shimmer/Shimmer$Builder;

    .line 452
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_base_color:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 453
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_base_color:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    .line 454
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    .line 453
    invoke-virtual {p0, v0}, Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;->setBaseColor(I)Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;

    .line 456
    :cond_18
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_highlight_color:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 457
    sget v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout_shimmer_highlight_color:I

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    .line 458
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    .line 457
    invoke-virtual {p0, p1}, Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;->setHighlightColor(I)Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;

    .line 461
    :cond_2d
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;->getThis()Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;

    move-result-object p0

    return-object p0
.end method

.method protected bridge synthetic getThis()Lcom/facebook/shimmer/Shimmer$Builder;
    .registers 1

    .line 432
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;->getThis()Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;

    move-result-object p0

    return-object p0
.end method

.method protected getThis()Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;
    .registers 1

    return-object p0
.end method

.method public setBaseColor(I)Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;
    .registers 5

    .line 445
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    const v1, 0xffffff

    and-int/2addr p1, v1

    iget-object v1, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v1, v1, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    const/high16 v2, -0x1000000

    and-int/2addr v1, v2

    or-int/2addr p1, v1

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->baseColor:I

    .line 446
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;->getThis()Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;

    move-result-object p0

    return-object p0
.end method

.method public setHighlightColor(I)Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;
    .registers 3

    .line 439
    iget-object v0, p0, Lcom/facebook/shimmer/Shimmer$Builder;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iput p1, v0, Lcom/facebook/shimmer/Shimmer;->highlightColor:I

    .line 440
    invoke-virtual {p0}, Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;->getThis()Lcom/facebook/shimmer/Shimmer$ColorHighlightBuilder;

    move-result-object p0

    return-object p0
.end method

###### Class com.facebook.shimmer.Shimmer.Direction (com.facebook.shimmer.Shimmer$Direction)
.class public interface abstract annotation Lcom/facebook/shimmer/Shimmer$Direction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/Shimmer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "Direction"
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# static fields
.field public static final BOTTOM_TO_TOP:I = 0x3

.field public static final LEFT_TO_RIGHT:I = 0x0

.field public static final RIGHT_TO_LEFT:I = 0x2

.field public static final TOP_TO_BOTTOM:I = 0x1

###### Class com.facebook.shimmer.Shimmer.Shape (com.facebook.shimmer.Shimmer$Shape)
.class public interface abstract annotation Lcom/facebook/shimmer/Shimmer$Shape;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/Shimmer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "Shape"
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# static fields
.field public static final LINEAR:I = 0x0

.field public static final RADIAL:I = 0x1
