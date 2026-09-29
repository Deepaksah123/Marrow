###### Class com.facebook.shimmer.ShimmerDrawable (com.facebook.shimmer.ShimmerDrawable)
.class public final Lcom/facebook/shimmer/ShimmerDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field private final mDrawRect:Landroid/graphics/Rect;

.field private final mShaderMatrix:Landroid/graphics/Matrix;

.field private mShimmer:Lcom/facebook/shimmer/Shimmer;

.field private final mShimmerPaint:Landroid/graphics/Paint;

.field private final mUpdateListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field private mValueAnimator:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 43
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 27
    new-instance v0, Lcom/facebook/shimmer/ShimmerDrawable$1;

    invoke-direct {v0, p0}, Lcom/facebook/shimmer/ShimmerDrawable$1;-><init>(Lcom/facebook/shimmer/ShimmerDrawable;)V

    iput-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mUpdateListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 35
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmerPaint:Landroid/graphics/Paint;

    .line 36
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    .line 37
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShaderMatrix:Landroid/graphics/Matrix;

    const/4 p0, 0x1

    .line 44
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method private offset(FFF)F
    .registers 4

    sub-float/2addr p2, p1

    mul-float/2addr p2, p3

    add-float/2addr p1, p2

    return p1
.end method

.method private updateShader()V
    .registers 12

    .line 184
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 185
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 186
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-eqz v1, :cond_7c

    if-eqz v0, :cond_7c

    .line 187
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    if-eqz v2, :cond_7c

    .line 190
    invoke-virtual {v2, v1}, Lcom/facebook/shimmer/Shimmer;->width(I)I

    move-result v1

    .line 191
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    invoke-virtual {v2, v0}, Lcom/facebook/shimmer/Shimmer;->height(I)I

    move-result v0

    .line 194
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v2, v2, Lcom/facebook/shimmer/Shimmer;->shape:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_51

    .line 197
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v2, v2, Lcom/facebook/shimmer/Shimmer;->direction:I

    const/4 v4, 0x0

    if-eq v2, v3, :cond_35

    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v2, v2, Lcom/facebook/shimmer/Shimmer;->direction:I

    const/4 v5, 0x3

    if-ne v2, v5, :cond_34

    goto :goto_35

    :cond_34
    move v3, v4

    :cond_35
    :goto_35
    if-eqz v3, :cond_38

    move v1, v4

    :cond_38
    if-eqz v3, :cond_3b

    goto :goto_3c

    :cond_3b
    move v0, v4

    .line 202
    :goto_3c
    new-instance v10, Landroid/graphics/LinearGradient;

    const/4 v3, 0x0

    const/4 v4, 0x0

    int-to-float v5, v1

    int-to-float v6, v0

    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-object v7, v0, Lcom/facebook/shimmer/Shimmer;->colors:[I

    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-object v8, v0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v2, v10

    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    goto :goto_77

    :cond_51
    int-to-float v2, v1

    const/high16 v3, 0x40000000    # 2.0f

    div-float v5, v2, v3

    int-to-float v2, v0

    div-float v6, v2, v3

    .line 211
    new-instance v2, Landroid/graphics/RadialGradient;

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    div-double/2addr v0, v3

    double-to-float v7, v0

    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-object v8, v0, Lcom/facebook/shimmer/Shimmer;->colors:[I

    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-object v9, v0, Lcom/facebook/shimmer/Shimmer;->positions:[F

    sget-object v10, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    move-object v10, v2

    .line 218
    :goto_77
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmerPaint:Landroid/graphics/Paint;

    invoke-virtual {p0, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_7c
    return-void
.end method

.method private updateValueAnimator()V
    .registers 7

    .line 149
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    if-eqz v0, :cond_61

    .line 154
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, 0x0

    if-eqz v0, :cond_18

    .line 155
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    .line 156
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 157
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    goto :goto_19

    :cond_18
    move v0, v1

    .line 162
    :goto_19
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-wide v2, v2, Lcom/facebook/shimmer/Shimmer;->repeatDelay:J

    iget-object v4, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-wide v4, v4, Lcom/facebook/shimmer/Shimmer;->animationDuration:J

    div-long/2addr v2, v4

    long-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v4, v3, v1

    const/4 v1, 0x1

    aput v2, v3, v1

    .line 163
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    .line 164
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v2, v2, Lcom/facebook/shimmer/Shimmer;->repeatMode:I

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 165
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v2, v2, Lcom/facebook/shimmer/Shimmer;->repeatCount:I

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 166
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-wide v2, v2, Lcom/facebook/shimmer/Shimmer;->animationDuration:J

    iget-object v4, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-wide v4, v4, Lcom/facebook/shimmer/Shimmer;->repeatDelay:J

    add-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 167
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mUpdateListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    if-eqz v0, :cond_61

    .line 169
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    :cond_61
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .registers 10

    .line 90
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    if-eqz v0, :cond_a3

    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmerPaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v0

    if-eqz v0, :cond_a3

    .line 94
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v0, v0, Lcom/facebook/shimmer/Shimmer;->tilt:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 95
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    .line 96
    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v0, v3

    add-float/2addr v2, v0

    .line 99
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    const/4 v3, 0x0

    if-eqz v0, :cond_44

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v0

    goto :goto_45

    :cond_44
    move v0, v3

    .line 100
    :goto_45
    iget-object v4, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v4, v4, Lcom/facebook/shimmer/Shimmer;->direction:I

    const/4 v5, 0x1

    if-eq v4, v5, :cond_67

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5e

    const/4 v5, 0x3

    if-eq v4, v5, :cond_58

    neg-float v1, v2

    .line 103
    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/shimmer/ShimmerDrawable;->offset(FFF)F

    move-result v0

    goto :goto_63

    :cond_58
    neg-float v2, v1

    .line 116
    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/shimmer/ShimmerDrawable;->offset(FFF)F

    move-result v0

    goto :goto_6c

    :cond_5e
    neg-float v1, v2

    .line 107
    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/shimmer/ShimmerDrawable;->offset(FFF)F

    move-result v0

    :goto_63
    move v7, v3

    move v3, v0

    move v0, v7

    goto :goto_6c

    :cond_67
    neg-float v2, v1

    .line 112
    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/shimmer/ShimmerDrawable;->offset(FFF)F

    move-result v0

    .line 120
    :goto_6c
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShaderMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 121
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShaderMatrix:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget v2, v2, Lcom/facebook/shimmer/Shimmer;->tilt:F

    iget-object v4, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    iget-object v6, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v5

    invoke-virtual {v1, v2, v4, v6}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 122
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShaderMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1, v3, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 123
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmerPaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShaderMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 124
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmerPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_a3
    return-void
.end method

.method public final getOpacity()I
    .registers 2

    .line 139
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    if-eqz v0, :cond_10

    iget-boolean v0, v0, Lcom/facebook/shimmer/Shimmer;->clipToChildren:Z

    if-nez v0, :cond_e

    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    iget-boolean p0, p0, Lcom/facebook/shimmer/Shimmer;->alphaShimmer:Z

    if-eqz p0, :cond_10

    :cond_e
    const/4 p0, -0x3

    return p0

    :cond_10
    const/4 p0, -0x1

    return p0
.end method

.method public final isShimmerStarted()Z
    .registers 1

    .line 75
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method final maybeStartShimmer()V
    .registers 2

    .line 174
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1d

    .line 175
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    move-result v0

    if-nez v0, :cond_1d

    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    if-eqz v0, :cond_1d

    iget-boolean v0, v0, Lcom/facebook/shimmer/Shimmer;->autoStart:Z

    if-eqz v0, :cond_1d

    .line 178
    invoke-virtual {p0}, Lcom/facebook/shimmer/ShimmerDrawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-eqz v0, :cond_1d

    .line 179
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    :cond_1d
    return-void
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .registers 5

    .line 80
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 81
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 82
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    .line 83
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mDrawRect:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 84
    invoke-direct {p0}, Lcom/facebook/shimmer/ShimmerDrawable;->updateShader()V

    .line 85
    invoke-virtual {p0}, Lcom/facebook/shimmer/ShimmerDrawable;->maybeStartShimmer()V

    return-void
.end method

.method public final setAlpha(I)V
    .registers 2

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 2

    return-void
.end method

.method public final setShimmer(Lcom/facebook/shimmer/Shimmer;)V
    .registers 4

    .line 48
    iput-object p1, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmer:Lcom/facebook/shimmer/Shimmer;

    if-eqz p1, :cond_17

    .line 50
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mShimmerPaint:Landroid/graphics/Paint;

    iget-boolean p1, p1, Lcom/facebook/shimmer/Shimmer;->alphaShimmer:Z

    if-eqz p1, :cond_d

    sget-object p1, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_f

    :cond_d
    sget-object p1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    :goto_f
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v1, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 54
    :cond_17
    invoke-direct {p0}, Lcom/facebook/shimmer/ShimmerDrawable;->updateShader()V

    .line 55
    invoke-direct {p0}, Lcom/facebook/shimmer/ShimmerDrawable;->updateValueAnimator()V

    .line 56
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final startShimmer()V
    .registers 2

    .line 61
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_15

    invoke-virtual {p0}, Lcom/facebook/shimmer/ShimmerDrawable;->isShimmerStarted()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {p0}, Lcom/facebook/shimmer/ShimmerDrawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 62
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    :cond_15
    return-void
.end method

.method public final stopShimmer()V
    .registers 2

    .line 68
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lcom/facebook/shimmer/ShimmerDrawable;->isShimmerStarted()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 69
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable;->mValueAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_f
    return-void
.end method

###### Class com.facebook.shimmer.ShimmerDrawable.AnonymousClass1 (com.facebook.shimmer.ShimmerDrawable$1)
.class Lcom/facebook/shimmer/ShimmerDrawable$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/ShimmerDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/shimmer/ShimmerDrawable;


# direct methods
.method constructor <init>(Lcom/facebook/shimmer/ShimmerDrawable;)V
    .registers 2

    .line 28
    iput-object p1, p0, Lcom/facebook/shimmer/ShimmerDrawable$1;->this$0:Lcom/facebook/shimmer/ShimmerDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    .line 31
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerDrawable$1;->this$0:Lcom/facebook/shimmer/ShimmerDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
