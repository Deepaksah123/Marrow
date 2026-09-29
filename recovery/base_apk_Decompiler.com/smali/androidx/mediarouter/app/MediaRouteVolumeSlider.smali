###### Class androidx.mediarouter.app.MediaRouteVolumeSlider (androidx.mediarouter.app.MediaRouteVolumeSlider)
.class public Landroidx/mediarouter/app/MediaRouteVolumeSlider;
.super Landroidx/appcompat/widget/AppCompatSeekBar;
.source "SourceFile"


# instance fields
.field private IconCompatParcelizer:Landroid/graphics/drawable/Drawable;

.field private final RemoteActionCompatParcelizer:F

.field private read:Z

.field private write:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, v0}, Landroidx/mediarouter/app/MediaRouteVolumeSlider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 45
    sget v0, Lo/_init_lambda5$read;->seekBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/mediarouter/app/MediaRouteVolumeSlider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 49
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    invoke-static {p1}, Lo/getAccessible;->AudioAttributesCompatParcelizer(Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->RemoteActionCompatParcelizer:F

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .registers 5

    .line 55
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatSeekBar;->drawableStateChanged()V

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 v0, 0xff

    goto :goto_12

    :cond_c
    iget v0, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->RemoteActionCompatParcelizer:F

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 60
    :goto_12
    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->IconCompatParcelizer:Landroid/graphics/drawable/Drawable;

    iget v2, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->write:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 61
    iget-object v1, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->IconCompatParcelizer:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 63
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget v2, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->write:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 64
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method public setColor(I)V
    .registers 4

    .line 92
    iget v0, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->write:I

    if-ne v0, p1, :cond_5

    return-void

    .line 95
    :cond_5
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    const/16 v1, 0xff

    if-eq v0, v1, :cond_10

    .line 96
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 98
    :cond_10
    iput p1, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->write:I

    return-void
.end method

.method public setHideThumb(Z)V
    .registers 3

    .line 77
    iget-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->read:Z

    if-ne v0, p1, :cond_5

    return-void

    .line 80
    :cond_5
    iput-boolean p1, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->read:Z

    if-eqz p1, :cond_b

    const/4 p1, 0x0

    goto :goto_d

    .line 81
    :cond_b
    iget-object p1, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->IconCompatParcelizer:Landroid/graphics/drawable/Drawable;

    :goto_d
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatSeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setThumb(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    .line 69
    iput-object p1, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->IconCompatParcelizer:Landroid/graphics/drawable/Drawable;

    .line 70
    iget-boolean v0, p0, Landroidx/mediarouter/app/MediaRouteVolumeSlider;->read:Z

    if-eqz v0, :cond_7

    const/4 p1, 0x0

    :cond_7
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatSeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
