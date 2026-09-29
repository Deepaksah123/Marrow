###### Class androidx.constraintlayout.utils.widget.ImageFilterButton (androidx.constraintlayout.utils.widget.ImageFilterButton)
.class public Landroidx/constraintlayout/utils/widget/ImageFilterButton;
.super Landroidx/appcompat/widget/AppCompatImageButton;
.source "SourceFile"


# instance fields
.field private AudioAttributesCompatParcelizer:F

.field private AudioAttributesImplApi21Parcelizer:F

.field private AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

.field private AudioAttributesImplBaseParcelizer:F

.field private IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

.field private MediaBrowserCompatCustomActionResultReceiver:Z

.field private MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

.field private MediaBrowserCompatMediaItem:F

.field private MediaBrowserCompatSearchResultReceiver:F

.field private MediaDescriptionCompat:Landroid/graphics/RectF;

.field private MediaMetadataCompat:F

.field private RatingCompat:Landroid/view/ViewOutlineProvider;

.field private RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

.field private onAddQueueItem:F

.field private read:Landroid/graphics/drawable/Drawable;

.field private write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 102
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;)V

    .line 87
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-direct {p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    const/4 p1, 0x0

    .line 88
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    .line 89
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 90
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatSearchResultReceiver:F

    const/4 v0, 0x2

    .line 95
    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x1

    .line 97
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    .line 99
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    .line 183
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    .line 184
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    .line 185
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    .line 186
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    .line 103
    invoke-direct {p0, v0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 107
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 87
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-direct {p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    const/4 p1, 0x0

    .line 88
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    .line 89
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 90
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatSearchResultReceiver:F

    const/4 v0, 0x2

    .line 95
    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x1

    .line 97
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/4 v0, 0x0

    .line 98
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    .line 99
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    .line 183
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    .line 184
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    .line 185
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    .line 186
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    .line 108
    invoke-direct {p0, p2}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 112
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 87
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-direct {p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    const/4 p1, 0x0

    .line 88
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    .line 89
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 90
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatSearchResultReceiver:F

    const/4 p3, 0x2

    .line 95
    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    const/4 p3, 0x1

    .line 97
    iput-boolean p3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/4 p3, 0x0

    .line 98
    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    .line 99
    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    .line 183
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    .line 184
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    .line 185
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    .line 186
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    .line 113
    invoke-direct {p0, p2}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Z)V
    .registers 2

    .line 370
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatCustomActionResultReceiver:Z

    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/constraintlayout/utils/widget/ImageFilterButton;)F
    .registers 1

    .line 86
    iget p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    return p0
.end method

.method private IconCompatParcelizer()V
    .registers 12

    .line 335
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_21

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    .line 336
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_21

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    .line 337
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_21

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    .line 338
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_21

    return-void

    .line 342
    :cond_21
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2c

    move v0, v1

    goto :goto_2e

    :cond_2c
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    .line 343
    :goto_2e
    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_38

    move v2, v1

    goto :goto_3a

    :cond_38
    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    .line 344
    :goto_3a
    iget v3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_45

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_47

    :cond_45
    iget v3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    .line 345
    :goto_47
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_51

    iget v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    .line 346
    :cond_51
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 347
    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 348
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    int-to-float v5, v5

    .line 349
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v6

    int-to-float v6, v6

    .line 350
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    .line 351
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    mul-float v9, v5, v8

    mul-float v10, v6, v7

    cmpg-float v9, v9, v10

    if-gez v9, :cond_80

    div-float v9, v7, v5

    goto :goto_82

    :cond_80
    div-float v9, v8, v6

    :goto_82
    mul-float/2addr v3, v9

    .line 353
    invoke-virtual {v4, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    mul-float/2addr v5, v3

    mul-float/2addr v3, v6

    sub-float v6, v7, v5

    mul-float/2addr v0, v6

    add-float/2addr v0, v7

    sub-float/2addr v0, v5

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float/2addr v0, v5

    sub-float v6, v8, v3

    mul-float/2addr v2, v6

    add-float/2addr v2, v8

    sub-float/2addr v2, v3

    mul-float/2addr v2, v5

    .line 356
    invoke-virtual {v4, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v7, v0

    div-float/2addr v8, v0

    .line 357
    invoke-virtual {v4, v1, v7, v8}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 358
    invoke-virtual {p0, v4}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 359
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/constraintlayout/utils/widget/ImageFilterButton;)F
    .registers 1

    .line 86
    iget p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatSearchResultReceiver:F

    return p0
.end method

.method private read(Landroid/util/AttributeSet;)V
    .registers 8

    const/4 v0, 0x0

    .line 117
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    if-eqz p1, :cond_121

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/_isBlank$read;->ImageFilterView:[I

    .line 120
    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 121
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    .line 122
    sget v2, Lo/_isBlank$read;->ImageFilterView_altSrc:I

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    move v2, v0

    :goto_1d
    if-ge v2, v1, :cond_b7

    .line 125
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 126
    sget v4, Lo/_isBlank$read;->ImageFilterView_crossfade:I

    const/4 v5, 0x0

    if-ne v3, v4, :cond_30

    .line 127
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    goto/16 :goto_b3

    .line 128
    :cond_30
    sget v4, Lo/_isBlank$read;->ImageFilterView_warmth:I

    if-ne v3, v4, :cond_3d

    .line 129
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setWarmth(F)V

    goto/16 :goto_b3

    .line 130
    :cond_3d
    sget v4, Lo/_isBlank$read;->ImageFilterView_saturation:I

    if-ne v3, v4, :cond_4a

    .line 131
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setSaturation(F)V

    goto/16 :goto_b3

    .line 132
    :cond_4a
    sget v4, Lo/_isBlank$read;->ImageFilterView_contrast:I

    if-ne v3, v4, :cond_56

    .line 133
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setContrast(F)V

    goto :goto_b3

    .line 134
    :cond_56
    sget v4, Lo/_isBlank$read;->ImageFilterView_round:I

    if-ne v3, v4, :cond_62

    .line 136
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setRound(F)V

    goto :goto_b3

    .line 138
    :cond_62
    sget v4, Lo/_isBlank$read;->ImageFilterView_roundPercent:I

    if-ne v3, v4, :cond_6e

    .line 140
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setRoundPercent(F)V

    goto :goto_b3

    .line 142
    :cond_6e
    sget v4, Lo/_isBlank$read;->ImageFilterView_overlay:I

    if-ne v3, v4, :cond_7c

    .line 143
    iget-boolean v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatCustomActionResultReceiver:Z

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-direct {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer(Z)V

    goto :goto_b3

    .line 144
    :cond_7c
    sget v4, Lo/_isBlank$read;->ImageFilterView_imagePanX:I

    if-ne v3, v4, :cond_8a

    .line 145
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setImagePanX(F)V

    goto :goto_b3

    .line 146
    :cond_8a
    sget v4, Lo/_isBlank$read;->ImageFilterView_imagePanY:I

    if-ne v3, v4, :cond_98

    .line 147
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setImagePanY(F)V

    goto :goto_b3

    .line 148
    :cond_98
    sget v4, Lo/_isBlank$read;->ImageFilterView_imageRotate:I

    if-ne v3, v4, :cond_a6

    .line 149
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setImageRotate(F)V

    goto :goto_b3

    .line 150
    :cond_a6
    sget v4, Lo/_isBlank$read;->ImageFilterView_imageZoom:I

    if-ne v3, v4, :cond_b3

    .line 151
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setImageZoom(F)V

    :cond_b3
    :goto_b3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1d

    .line 154
    :cond_b7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 156
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    .line 157
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_10f

    if-eqz p1, :cond_10f

    .line 159
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    aput-object v1, p1, v0

    .line 160
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, p1, v2

    .line 162
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    .line 163
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 164
    iget-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-nez p1, :cond_109

    .line 165
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    iget v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    sub-float/2addr v0, v1

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 167
    :cond_109
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 169
    :cond_10f
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_121

    .line 171
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    aput-object p1, v1, v0

    :cond_121
    return-void
.end method

.method private write()V
    .registers 2

    .line 323
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_26

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    .line 324
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_26

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    .line 325
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_26

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    .line 326
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 328
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void

    .line 331
    :cond_26
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer()V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 2

    .line 606
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public layout(IIII)V
    .registers 5

    .line 614
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatImageButton;->layout(IIII)V

    .line 615
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer()V

    return-void
.end method

.method public setAltImageResource(I)V
    .registers 5

    .line 314
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    .line 315
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 316
    aput-object p1, v0, v1

    .line 317
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    .line 318
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 319
    iget p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setCrossfade(F)V

    return-void
.end method

.method public setBrightness(F)V
    .registers 3

    .line 466
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    iput p1, v0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 467
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V

    return-void
.end method

.method public setContrast(F)V
    .registers 3

    .line 400
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    iput p1, v0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->write:F

    .line 401
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V

    return-void
.end method

.method public setCrossfade(F)V
    .registers 5

    .line 439
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    .line 440
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_30

    .line 441
    iget-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatCustomActionResultReceiver:Z

    const/high16 v0, 0x437f0000    # 255.0f

    if-nez p1, :cond_1d

    .line 442
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/high16 v1, 0x3f800000    # 1.0f

    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, v0

    float-to-int v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 444
    :cond_1d
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    mul-float/2addr v1, v0

    float-to-int v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 445
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_30
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 282
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_28

    if-eqz p1, :cond_28

    .line 283
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    .line 284
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    .line 285
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    aput-object v1, v0, p1

    .line 286
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    .line 287
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 288
    iget p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setCrossfade(F)V

    return-void

    .line 290
    :cond_28
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setImagePanX(F)V
    .registers 2

    .line 242
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplBaseParcelizer:F

    .line 243
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write()V

    return-void
.end method

.method public setImagePanY(F)V
    .registers 2

    .line 256
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi21Parcelizer:F

    .line 257
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write()V

    return-void
.end method

.method public setImageResource(I)V
    .registers 4

    .line 296
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2e

    .line 297
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/Drawable;

    .line 298
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    .line 299
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->read:Landroid/graphics/drawable/Drawable;

    aput-object v1, v0, p1

    .line 300
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatItemReceiver:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    .line 301
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 302
    iget p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesCompatParcelizer:F

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setCrossfade(F)V

    return-void

    .line 304
    :cond_2e
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageResource(I)V

    return-void
.end method

.method public setImageRotate(F)V
    .registers 2

    .line 276
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaMetadataCompat:F

    .line 277
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write()V

    return-void
.end method

.method public setImageZoom(F)V
    .registers 2

    .line 266
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->onAddQueueItem:F

    .line 267
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write()V

    return-void
.end method

.method public setRound(F)V
    .registers 6

    .line 528
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 529
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatSearchResultReceiver:F

    .line 530
    iget p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    const/high16 v0, -0x40800000    # -1.0f

    .line 531
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    .line 532
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setRoundPercent(F)V

    return-void

    .line 535
    :cond_12
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatSearchResultReceiver:F

    cmpl-float v0, v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1c

    move v0, v1

    goto :goto_1d

    :cond_1c
    move v0, v2

    .line 536
    :goto_1d
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatSearchResultReceiver:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_6b

    .line 539
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

    if-nez p1, :cond_2f

    .line 540
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

    .line 542
    :cond_2f
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaDescriptionCompat:Landroid/graphics/RectF;

    if-nez p1, :cond_3a

    .line 543
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaDescriptionCompat:Landroid/graphics/RectF;

    .line 546
    :cond_3a
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RatingCompat:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_48

    .line 547
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterButton$1;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton$1;-><init>(Landroidx/constraintlayout/utils/widget/ImageFilterButton;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RatingCompat:Landroid/view/ViewOutlineProvider;

    .line 555
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 557
    :cond_48
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setClipToOutline(Z)V

    .line 560
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 561
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 562
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaDescriptionCompat:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v2, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 563
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 564
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaDescriptionCompat:Landroid/graphics/RectF;

    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatSearchResultReceiver:F

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_6e

    .line 567
    :cond_6b
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setClipToOutline(Z)V

    :goto_6e
    if-eqz v0, :cond_73

    .line 572
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->invalidateOutline()V

    :cond_73
    return-void
.end method

.method public setRoundPercent(F)V
    .registers 7

    .line 478
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    cmpl-float v0, v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_a

    move v0, v1

    goto :goto_b

    :cond_a
    move v0, v2

    .line 479
    :goto_b
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_62

    .line 481
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

    if-nez p1, :cond_1d

    .line 482
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

    .line 484
    :cond_1d
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaDescriptionCompat:Landroid/graphics/RectF;

    if-nez p1, :cond_28

    .line 485
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaDescriptionCompat:Landroid/graphics/RectF;

    .line 488
    :cond_28
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RatingCompat:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_36

    .line 489
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterButton$5;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton$5;-><init>(Landroidx/constraintlayout/utils/widget/ImageFilterButton;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RatingCompat:Landroid/view/ViewOutlineProvider;

    .line 498
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 500
    :cond_36
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setClipToOutline(Z)V

    .line 502
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 503
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 504
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaBrowserCompatMediaItem:F

    mul-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    .line 505
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaDescriptionCompat:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v4, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 506
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 507
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->AudioAttributesImplApi26Parcelizer:Landroid/graphics/Path;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->MediaDescriptionCompat:Landroid/graphics/RectF;

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_65

    .line 510
    :cond_62
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setClipToOutline(Z)V

    :goto_65
    if-eqz v0, :cond_6a

    .line 515
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->invalidateOutline()V

    :cond_6a
    return-void
.end method

.method public setSaturation(F)V
    .registers 3

    .line 381
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    iput p1, v0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:F

    .line 382
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V

    return-void
.end method

.method public setWarmth(F)V
    .registers 3

    .line 419
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    iput p1, v0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->read:F

    .line 420
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V

    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.ImageFilterButton.AnonymousClass1 (androidx.constraintlayout.utils.widget.ImageFilterButton$1)
.class final Landroidx/constraintlayout/utils/widget/ImageFilterButton$1;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setRound(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/utils/widget/ImageFilterButton;)V
    .registers 2

    .line 547
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton$1;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 9

    .line 550
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton$1;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 551
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton$1;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 552
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton$1;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;

    invoke-static {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/utils/widget/ImageFilterButton;)F

    move-result v5

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.ImageFilterButton.AnonymousClass5 (androidx.constraintlayout.utils.widget.ImageFilterButton$5)
.class final Landroidx/constraintlayout/utils/widget/ImageFilterButton$5;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/utils/widget/ImageFilterButton;->setRoundPercent(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/utils/widget/ImageFilterButton;)V
    .registers 2

    .line 489
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton$5;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 9

    .line 492
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton$5;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 493
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton$5;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 494
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterButton$5;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterButton;

    invoke-static {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterButton;->IconCompatParcelizer(Landroidx/constraintlayout/utils/widget/ImageFilterButton;)F

    move-result p0

    mul-float/2addr p1, p0

    const/high16 p0, 0x40000000    # 2.0f

    div-float v5, p1, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    .line 495
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method
