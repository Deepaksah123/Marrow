###### Class androidx.constraintlayout.utils.widget.ImageFilterView (androidx.constraintlayout.utils.widget.ImageFilterView)
.class public Landroidx/constraintlayout/utils/widget/ImageFilterView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:F

.field private AudioAttributesImplApi21Parcelizer:F

.field private AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

.field private AudioAttributesImplBaseParcelizer:Z

.field private IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

.field private MediaBrowserCompatCustomActionResultReceiver:F

.field private MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

.field private MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

.field private MediaBrowserCompatSearchResultReceiver:Landroid/view/ViewOutlineProvider;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

.field private MediaDescriptionCompat:F

.field private MediaMetadataCompat:F

.field private RatingCompat:F

.field private RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

.field private read:Landroid/graphics/drawable/Drawable;

.field private write:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    .line 483
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 287
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-direct {p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    const/4 p1, 0x1

    .line 288
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplBaseParcelizer:Z

    const/4 p1, 0x0

    .line 289
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    .line 290
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    .line 291
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    .line 292
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 293
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaMetadataCompat:F

    const/4 v1, 0x2

    .line 298
    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    .line 308
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    .line 309
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 310
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    .line 311
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    .line 484
    invoke-direct {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 488
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 287
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-direct {p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    const/4 p1, 0x1

    .line 288
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplBaseParcelizer:Z

    const/4 p1, 0x0

    .line 289
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    .line 290
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 291
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    .line 292
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 293
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaMetadataCompat:F

    const/4 v0, 0x2

    .line 298
    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    .line 308
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    .line 309
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 310
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    .line 311
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    .line 489
    invoke-direct {p0, p2}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 493
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 287
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-direct {p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    const/4 p1, 0x1

    .line 288
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplBaseParcelizer:Z

    const/4 p1, 0x0

    .line 289
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    .line 290
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 291
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    .line 292
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 293
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaMetadataCompat:F

    const/4 p3, 0x2

    .line 298
    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    .line 308
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    .line 309
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 310
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    .line 311
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    .line 494
    invoke-direct {p0, p2}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/constraintlayout/utils/widget/ImageFilterView;)F
    .registers 1

    .line 88
    iget p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaMetadataCompat:F

    return p0
.end method

.method private IconCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 8

    if-eqz p1, :cond_12b

    .line 499
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/_isBlank$read;->ImageFilterView:[I

    .line 500
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 501
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    .line 502
    sget v1, Lo/_isBlank$read;->ImageFilterView_altSrc:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    move v2, v1

    :goto_1a
    if-ge v2, v0, :cond_c1

    .line 505
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 506
    sget v4, Lo/_isBlank$read;->ImageFilterView_crossfade:I

    const/4 v5, 0x0

    if-ne v3, v4, :cond_2d

    .line 507
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    goto/16 :goto_bd

    .line 508
    :cond_2d
    sget v4, Lo/_isBlank$read;->ImageFilterView_warmth:I

    if-ne v3, v4, :cond_3a

    .line 509
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setWarmth(F)V

    goto/16 :goto_bd

    .line 510
    :cond_3a
    sget v4, Lo/_isBlank$read;->ImageFilterView_saturation:I

    if-ne v3, v4, :cond_47

    .line 511
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setSaturation(F)V

    goto/16 :goto_bd

    .line 512
    :cond_47
    sget v4, Lo/_isBlank$read;->ImageFilterView_contrast:I

    if-ne v3, v4, :cond_54

    .line 513
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setContrast(F)V

    goto/16 :goto_bd

    .line 514
    :cond_54
    sget v4, Lo/_isBlank$read;->ImageFilterView_brightness:I

    if-ne v3, v4, :cond_60

    .line 515
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setBrightness(F)V

    goto :goto_bd

    .line 516
    :cond_60
    sget v4, Lo/_isBlank$read;->ImageFilterView_round:I

    if-ne v3, v4, :cond_6c

    .line 518
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setRound(F)V

    goto :goto_bd

    .line 520
    :cond_6c
    sget v4, Lo/_isBlank$read;->ImageFilterView_roundPercent:I

    if-ne v3, v4, :cond_78

    .line 522
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setRoundPercent(F)V

    goto :goto_bd

    .line 524
    :cond_78
    sget v4, Lo/_isBlank$read;->ImageFilterView_overlay:I

    if-ne v3, v4, :cond_86

    .line 525
    iget-boolean v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplBaseParcelizer:Z

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-direct {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer(Z)V

    goto :goto_bd

    .line 526
    :cond_86
    sget v4, Lo/_isBlank$read;->ImageFilterView_imagePanX:I

    if-ne v3, v4, :cond_94

    .line 527
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setImagePanX(F)V

    goto :goto_bd

    .line 528
    :cond_94
    sget v4, Lo/_isBlank$read;->ImageFilterView_imagePanY:I

    if-ne v3, v4, :cond_a2

    .line 529
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setImagePanY(F)V

    goto :goto_bd

    .line 530
    :cond_a2
    sget v4, Lo/_isBlank$read;->ImageFilterView_imageRotate:I

    if-ne v3, v4, :cond_b0

    .line 531
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setImageRotate(F)V

    goto :goto_bd

    .line 532
    :cond_b0
    sget v4, Lo/_isBlank$read;->ImageFilterView_imageZoom:I

    if-ne v3, v4, :cond_bd

    .line 533
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setImageZoom(F)V

    :cond_bd
    :goto_bd
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1a

    .line 536
    :cond_c1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 538
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    .line 539
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_119

    if-eqz p1, :cond_119

    .line 541
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    aput-object v0, p1, v1

    .line 542
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, p1, v2

    .line 544
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    .line 545
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 546
    iget-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplBaseParcelizer:Z

    if-nez p1, :cond_113

    .line 547
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    iget v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    sub-float/2addr v0, v1

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 549
    :cond_113
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 551
    :cond_119
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_12b

    .line 553
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    aput-object p1, v0, v1

    :cond_12b
    return-void
.end method

.method private IconCompatParcelizer(Z)V
    .registers 2

    .line 566
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplBaseParcelizer:Z

    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/constraintlayout/utils/widget/ImageFilterView;)F
    .registers 1

    .line 88
    iget p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    return p0
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 12

    .line 455
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_21

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 456
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_21

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    .line 457
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_21

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    .line 458
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_21

    return-void

    .line 462
    :cond_21
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2c

    move v0, v1

    goto :goto_2e

    :cond_2c
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    .line 463
    :goto_2e
    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_38

    move v2, v1

    goto :goto_3a

    :cond_38
    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 464
    :goto_3a
    iget v3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_45

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_47

    :cond_45
    iget v3, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    .line 465
    :goto_47
    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_51

    iget v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    .line 466
    :cond_51
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 467
    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 468
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    int-to-float v5, v5

    .line 469
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v6

    int-to-float v6, v6

    .line 470
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    .line 471
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

    .line 473
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

    .line 476
    invoke-virtual {v4, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v7, v0

    div-float/2addr v8, v0

    .line 477
    invoke-virtual {v4, v1, v7, v8}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 478
    invoke-virtual {p0, v4}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 479
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method private read()V
    .registers 2

    .line 443
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_26

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 444
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_26

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    .line 445
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_26

    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    .line 446
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 448
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void

    .line 451
    :cond_26
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer()V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 2

    .line 810
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public layout(IIII)V
    .registers 5

    .line 818
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatImageView;->layout(IIII)V

    .line 819
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public setAltImageResource(I)V
    .registers 5

    .line 434
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    .line 435
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 436
    aput-object p1, v0, v1

    .line 437
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    .line 438
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 439
    iget p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setCrossfade(F)V

    return-void
.end method

.method public setBrightness(F)V
    .registers 3

    .line 661
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    iput p1, v0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 662
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V

    return-void
.end method

.method public setContrast(F)V
    .registers 3

    .line 596
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    iput p1, v0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->write:F

    .line 597
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V

    return-void
.end method

.method public setCrossfade(F)V
    .registers 5

    .line 634
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    .line 635
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_30

    .line 636
    iget-boolean p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplBaseParcelizer:Z

    const/high16 v0, 0x437f0000    # 255.0f

    if-nez p1, :cond_1d

    .line 637
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/high16 v1, 0x3f800000    # 1.0f

    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, v0

    float-to-int v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 639
    :cond_1d
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    mul-float/2addr v1, v0

    float-to-int v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 640
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_30
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 4

    .line 407
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_28

    if-eqz p1, :cond_28

    .line 408
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    .line 409
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    .line 410
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    aput-object v1, v0, p1

    .line 411
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    .line 412
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 413
    iget p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setCrossfade(F)V

    return-void

    .line 415
    :cond_28
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setImagePanX(F)V
    .registers 2

    .line 367
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi21Parcelizer:F

    .line 368
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read()V

    return-void
.end method

.method public setImagePanY(F)V
    .registers 2

    .line 381
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 382
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read()V

    return-void
.end method

.method public setImageResource(I)V
    .registers 4

    .line 421
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2e

    .line 422
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/getDefaultViewModelCreationExtras;->write(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read:Landroid/graphics/drawable/Drawable;

    .line 423
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    .line 424
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->write:Landroid/graphics/drawable/Drawable;

    aput-object v1, v0, p1

    .line 425
    new-instance p1, Landroid/graphics/drawable/LayerDrawable;

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesImplApi26Parcelizer:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer:Landroid/graphics/drawable/LayerDrawable;

    .line 426
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 427
    iget p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer:F

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setCrossfade(F)V

    return-void

    .line 429
    :cond_2e
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    return-void
.end method

.method public setImageRotate(F)V
    .registers 2

    .line 401
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaDescriptionCompat:F

    .line 402
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read()V

    return-void
.end method

.method public setImageZoom(F)V
    .registers 2

    .line 391
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:F

    .line 392
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->read()V

    return-void
.end method

.method public setRound(F)V
    .registers 6

    .line 733
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 734
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaMetadataCompat:F

    .line 735
    iget p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    const/high16 v0, -0x40800000    # -1.0f

    .line 736
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    .line 737
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setRoundPercent(F)V

    return-void

    .line 740
    :cond_12
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaMetadataCompat:F

    cmpl-float v0, v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1c

    move v0, v1

    goto :goto_1d

    :cond_1c
    move v0, v2

    .line 741
    :goto_1d
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaMetadataCompat:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_6b

    .line 744
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

    if-nez p1, :cond_2f

    .line 745
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

    .line 747
    :cond_2f
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

    if-nez p1, :cond_3a

    .line 748
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

    .line 751
    :cond_3a
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_48

    .line 752
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterView$2;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$2;-><init>(Landroidx/constraintlayout/utils/widget/ImageFilterView;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/ViewOutlineProvider;

    .line 760
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 762
    :cond_48
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setClipToOutline(Z)V

    .line 764
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 765
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 766
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v2, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 767
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 768
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaMetadataCompat:F

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_6e

    .line 771
    :cond_6b
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setClipToOutline(Z)V

    :goto_6e
    if-eqz v0, :cond_73

    .line 776
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->invalidateOutline()V

    :cond_73
    return-void
.end method

.method public setRoundPercent(F)V
    .registers 7

    .line 682
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    cmpl-float v0, v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_a

    move v0, v1

    goto :goto_b

    :cond_a
    move v0, v2

    .line 683
    :goto_b
    iput p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_62

    .line 685
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

    if-nez p1, :cond_1d

    .line 686
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

    .line 688
    :cond_1d
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

    if-nez p1, :cond_28

    .line 689
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

    .line 692
    :cond_28
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_36

    .line 693
    new-instance p1, Landroidx/constraintlayout/utils/widget/ImageFilterView$4;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$4;-><init>(Landroidx/constraintlayout/utils/widget/ImageFilterView;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatSearchResultReceiver:Landroid/view/ViewOutlineProvider;

    .line 702
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 704
    :cond_36
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setClipToOutline(Z)V

    .line 707
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 708
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 709
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    iget v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RatingCompat:F

    mul-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    .line 710
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v4, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 711
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 712
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatItemReceiver:Landroid/graphics/Path;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->MediaBrowserCompatMediaItem:Landroid/graphics/RectF;

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_65

    .line 715
    :cond_62
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setClipToOutline(Z)V

    :goto_65
    if-eqz v0, :cond_6a

    .line 720
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->invalidateOutline()V

    :cond_6a
    return-void
.end method

.method public setSaturation(F)V
    .registers 3

    .line 577
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    iput p1, v0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:F

    .line 578
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V

    return-void
.end method

.method public setWarmth(F)V
    .registers 3

    .line 615
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    iput p1, v0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->read:F

    .line 616
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;

    invoke-virtual {p1, p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V

    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.ImageFilterView.AnonymousClass2 (androidx.constraintlayout.utils.widget.ImageFilterView$2)
.class final Landroidx/constraintlayout/utils/widget/ImageFilterView$2;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/utils/widget/ImageFilterView;->setRound(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/utils/widget/ImageFilterView;)V
    .registers 2

    .line 752
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$2;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 9

    .line 755
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$2;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 756
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$2;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 757
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$2;->IconCompatParcelizer:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-static {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->AudioAttributesCompatParcelizer(Landroidx/constraintlayout/utils/widget/ImageFilterView;)F

    move-result v5

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.ImageFilterView.AnonymousClass4 (androidx.constraintlayout.utils.widget.ImageFilterView$4)
.class final Landroidx/constraintlayout/utils/widget/ImageFilterView$4;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/utils/widget/ImageFilterView;->setRoundPercent(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/constraintlayout/utils/widget/ImageFilterView;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/utils/widget/ImageFilterView;)V
    .registers 2

    .line 693
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$4;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 9

    .line 696
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$4;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 697
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$4;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 698
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$4;->write:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    invoke-static {p0}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/utils/widget/ImageFilterView;)F

    move-result p0

    mul-float/2addr p1, p0

    const/high16 p0, 0x40000000    # 2.0f

    div-float v5, p1, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    .line 699
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.ImageFilterView.IconCompatParcelizer (androidx.constraintlayout.utils.widget.ImageFilterView$IconCompatParcelizer)
.class final Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/utils/widget/ImageFilterView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:F

.field private AudioAttributesImplBaseParcelizer:Landroid/graphics/ColorMatrix;

.field private IconCompatParcelizer:[F

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/ColorMatrix;

.field RemoteActionCompatParcelizer:F

.field read:F

.field write:F


# direct methods
.method constructor <init>()V
    .registers 2

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    .line 90
    new-array v0, v0, [F

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->IconCompatParcelizer:[F

    .line 91
    new-instance v0, Landroid/graphics/ColorMatrix;

    invoke-direct {v0}, Landroid/graphics/ColorMatrix;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/graphics/ColorMatrix;

    .line 92
    new-instance v0, Landroid/graphics/ColorMatrix;

    invoke-direct {v0}, Landroid/graphics/ColorMatrix;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/ColorMatrix;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 93
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 94
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:F

    .line 95
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->write:F

    .line 96
    iput v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->read:F

    return-void
.end method

.method private RemoteActionCompatParcelizer(F)V
    .registers 4

    .line 228
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->IconCompatParcelizer:[F

    const/4 v0, 0x0

    aput p1, p0, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 229
    aput v1, p0, v0

    const/4 v0, 0x2

    .line 230
    aput v1, p0, v0

    const/4 v0, 0x3

    .line 231
    aput v1, p0, v0

    const/4 v0, 0x4

    .line 232
    aput v1, p0, v0

    const/4 v0, 0x5

    .line 234
    aput v1, p0, v0

    const/4 v0, 0x6

    .line 235
    aput p1, p0, v0

    const/4 v0, 0x7

    .line 236
    aput v1, p0, v0

    const/16 v0, 0x8

    .line 237
    aput v1, p0, v0

    const/16 v0, 0x9

    .line 238
    aput v1, p0, v0

    const/16 v0, 0xa

    .line 240
    aput v1, p0, v0

    const/16 v0, 0xb

    .line 241
    aput v1, p0, v0

    const/16 v0, 0xc

    .line 242
    aput p1, p0, v0

    const/16 p1, 0xd

    .line 243
    aput v1, p0, p1

    const/16 p1, 0xe

    .line 244
    aput v1, p0, p1

    const/16 p1, 0xf

    .line 246
    aput v1, p0, p1

    const/16 p1, 0x10

    .line 247
    aput v1, p0, p1

    const/16 p1, 0x11

    .line 248
    aput v1, p0, p1

    const/16 p1, 0x12

    const/high16 v0, 0x3f800000    # 1.0f

    .line 249
    aput v0, p0, p1

    const/16 p1, 0x13

    .line 250
    aput v1, p0, p1

    return-void
.end method

.method private read(F)V
    .registers 9

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v1, v0, p1

    const v2, 0x3e998c7e    # 0.2999f

    mul-float/2addr v2, v1

    const v3, 0x3f1645a2    # 0.587f

    mul-float/2addr v3, v1

    const v4, 0x3de978d5    # 0.114f

    mul-float/2addr v1, v4

    .line 109
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->IconCompatParcelizer:[F

    const/4 v4, 0x0

    add-float v5, v2, p1

    aput v5, p0, v4

    const/4 v4, 0x1

    .line 110
    aput v3, p0, v4

    const/4 v4, 0x2

    .line 111
    aput v1, p0, v4

    const/4 v4, 0x3

    const/4 v5, 0x0

    .line 112
    aput v5, p0, v4

    const/4 v4, 0x4

    .line 113
    aput v5, p0, v4

    const/4 v4, 0x5

    .line 115
    aput v2, p0, v4

    const/4 v4, 0x6

    add-float v6, v3, p1

    .line 116
    aput v6, p0, v4

    const/4 v4, 0x7

    .line 117
    aput v1, p0, v4

    const/16 v4, 0x8

    .line 118
    aput v5, p0, v4

    const/16 v4, 0x9

    .line 119
    aput v5, p0, v4

    const/16 v4, 0xa

    .line 121
    aput v2, p0, v4

    const/16 v2, 0xb

    .line 122
    aput v3, p0, v2

    const/16 v2, 0xc

    add-float/2addr v1, p1

    .line 123
    aput v1, p0, v2

    const/16 p1, 0xd

    .line 124
    aput v5, p0, p1

    const/16 p1, 0xe

    .line 125
    aput v5, p0, p1

    const/16 p1, 0xf

    .line 127
    aput v5, p0, p1

    const/16 p1, 0x10

    .line 128
    aput v5, p0, p1

    const/16 p1, 0x11

    .line 129
    aput v5, p0, p1

    const/16 p1, 0x12

    .line 130
    aput v0, p0, p1

    const/16 p1, 0x13

    .line 131
    aput v5, p0, p1

    return-void
.end method

.method private write(F)V
    .registers 13

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_8

    const p1, 0x3c23d70a    # 0.01f

    :cond_8
    const v1, 0x459c4000    # 5000.0f

    div-float/2addr v1, p1

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr v1, p1

    const/high16 p1, 0x42840000    # 66.0f

    cmpl-float v2, v1, p1

    const v3, 0x43211e9c

    const v4, 0x42c6f10d

    const/high16 v5, 0x437f0000    # 255.0f

    if-lez v2, :cond_3f

    const/high16 v2, 0x42700000    # 60.0f

    sub-float v2, v1, v2

    float-to-double v6, v2

    const-wide v8, -0x403ef32580000000L    # -0.13320475816726685

    .line 147
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    double-to-float v2, v8

    const v8, 0x43a4d970

    mul-float/2addr v2, v8

    const-wide v8, 0x3fb354f0e0000000L

    .line 148
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v6, v6

    const v7, 0x43900fa3

    mul-float/2addr v6, v7

    goto :goto_49

    :cond_3f
    float-to-double v6, v1

    .line 151
    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    double-to-float v2, v6

    mul-float/2addr v2, v4

    sub-float v6, v2, v3

    move v2, v5

    :goto_49
    cmpg-float p1, v1, p1

    const v7, 0x439885bc

    const v8, 0x430a848a

    if-gez p1, :cond_67

    const/high16 p1, 0x41980000    # 19.0f

    cmpl-float p1, v1, p1

    if-lez p1, :cond_65

    const/high16 p1, 0x41200000    # 10.0f

    sub-float/2addr v1, p1

    float-to-double v9, v1

    .line 156
    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v9

    double-to-float p1, v9

    mul-float/2addr p1, v8

    sub-float/2addr p1, v7

    goto :goto_68

    :cond_65
    move p1, v0

    goto :goto_68

    :cond_67
    move p1, v5

    .line 163
    :goto_68
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 164
    invoke-static {v6, v0}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 165
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v5, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const-wide/high16 v9, 0x4049000000000000L    # 50.0

    .line 181
    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v9

    double-to-float v6, v9

    const-wide/high16 v9, 0x4044000000000000L    # 40.0

    .line 186
    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v9

    double-to-float v9, v9

    .line 193
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v10

    invoke-static {v5, v10}, Ljava/lang/Math;->min(FF)F

    move-result v10

    mul-float/2addr v6, v4

    sub-float/2addr v6, v3

    .line 194
    invoke-static {v6, v0}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    mul-float/2addr v9, v8

    sub-float/2addr v9, v7

    .line 195
    invoke-static {v9, v0}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    div-float/2addr v1, v10

    div-float/2addr v2, v3

    div-float/2addr p1, v4

    .line 201
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->IconCompatParcelizer:[F

    const/4 v3, 0x0

    aput v1, p0, v3

    const/4 v1, 0x1

    .line 202
    aput v0, p0, v1

    const/4 v1, 0x2

    .line 203
    aput v0, p0, v1

    const/4 v1, 0x3

    .line 204
    aput v0, p0, v1

    const/4 v1, 0x4

    .line 205
    aput v0, p0, v1

    const/4 v1, 0x5

    .line 207
    aput v0, p0, v1

    const/4 v1, 0x6

    .line 208
    aput v2, p0, v1

    const/4 v1, 0x7

    .line 209
    aput v0, p0, v1

    const/16 v1, 0x8

    .line 210
    aput v0, p0, v1

    const/16 v1, 0x9

    .line 211
    aput v0, p0, v1

    const/16 v1, 0xa

    .line 213
    aput v0, p0, v1

    const/16 v1, 0xb

    .line 214
    aput v0, p0, v1

    const/16 v1, 0xc

    .line 215
    aput p1, p0, v1

    const/16 p1, 0xd

    .line 216
    aput v0, p0, p1

    const/16 p1, 0xe

    .line 217
    aput v0, p0, p1

    const/16 p1, 0xf

    .line 219
    aput v0, p0, p1

    const/16 p1, 0x10

    .line 220
    aput v0, p0, p1

    const/16 p1, 0x11

    .line 221
    aput v0, p0, p1

    const/16 p1, 0x12

    const/high16 v1, 0x3f800000    # 1.0f

    .line 222
    aput v1, p0, p1

    const/16 p1, 0x13

    .line 223
    aput v0, p0, p1

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)V
    .registers 7

    .line 254
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/graphics/ColorMatrix;

    invoke-virtual {v0}, Landroid/graphics/ColorMatrix;->reset()V

    .line 256
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, v0, v1

    const/4 v3, 0x1

    if-eqz v2, :cond_1a

    .line 257
    invoke-direct {p0, v0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->read(F)V

    .line 258
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/graphics/ColorMatrix;

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->IconCompatParcelizer:[F

    invoke-virtual {v0, v2}, Landroid/graphics/ColorMatrix;->set([F)V

    move v0, v3

    goto :goto_1b

    :cond_1a
    const/4 v0, 0x0

    .line 261
    :goto_1b
    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->write:F

    cmpl-float v4, v2, v1

    if-eqz v4, :cond_2e

    .line 262
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/ColorMatrix;

    invoke-virtual {v0, v2, v2, v2, v1}, Landroid/graphics/ColorMatrix;->setScale(FFFF)V

    .line 263
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/graphics/ColorMatrix;

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/ColorMatrix;

    invoke-virtual {v0, v2}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    move v0, v3

    .line 266
    :cond_2e
    iget v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->read:F

    cmpl-float v4, v2, v1

    if-eqz v4, :cond_46

    .line 267
    invoke-direct {p0, v2}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->write(F)V

    .line 268
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/ColorMatrix;

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->IconCompatParcelizer:[F

    invoke-virtual {v0, v2}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 269
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/graphics/ColorMatrix;

    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/ColorMatrix;

    invoke-virtual {v0, v2}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    goto :goto_47

    :cond_46
    move v3, v0

    .line 272
    :goto_47
    iget v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->RemoteActionCompatParcelizer:F

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_5f

    .line 273
    invoke-direct {p0, v0}, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->RemoteActionCompatParcelizer(F)V

    .line 274
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/ColorMatrix;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->IconCompatParcelizer:[F

    invoke-virtual {v0, v1}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 275
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/graphics/ColorMatrix;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/ColorMatrix;

    invoke-virtual {v0, v1}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    goto :goto_61

    :cond_5f
    if-eqz v3, :cond_6c

    .line 280
    :goto_61
    new-instance v0, Landroid/graphics/ColorMatrixColorFilter;

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/ImageFilterView$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/graphics/ColorMatrix;

    invoke-direct {v0, p0}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    .line 282
    :cond_6c
    invoke-virtual {p1}, Landroid/widget/ImageView;->clearColorFilter()V

    return-void
.end method
