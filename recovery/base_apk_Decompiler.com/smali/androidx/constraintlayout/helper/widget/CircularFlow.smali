###### Class androidx.constraintlayout.helper.widget.CircularFlow (androidx.constraintlayout.helper.widget.CircularFlow)
.class public Landroidx/constraintlayout/helper/widget/CircularFlow;
.super Landroidx/constraintlayout/widget/VirtualLayout;
.source "SourceFile"


# static fields
.field private static AudioAttributesImplApi26Parcelizer:I

.field private static MediaBrowserCompatCustomActionResultReceiver:F


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private AudioAttributesImplBaseParcelizer:[F

.field private MediaBrowserCompatMediaItem:Ljava/lang/String;

.field private MediaBrowserCompatSearchResultReceiver:Ljava/lang/Float;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/lang/String;

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:I

.field private RatingCompat:[I

.field private handleMediaPlayPauseIfPendingOnHandler:I

.field private onAddQueueItem:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 111
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 115
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 119
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/VirtualLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 8

    .line 182
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplApi21Parcelizer:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x0

    .line 183
    :goto_9
    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-ge v0, v1, :cond_b2

    .line 184
    iget-object v1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplApi21Parcelizer:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->IconCompatParcelizer:[I

    aget v2, v2, v0

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->MediaBrowserCompatItemReceiver(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_ae

    .line 188
    sget v2, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplApi26Parcelizer:I

    .line 189
    sget v3, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 191
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    const/4 v5, 0x1

    if-eqz v4, :cond_28

    array-length v6, v4

    if-ge v0, v6, :cond_28

    .line 192
    aget v2, v4, v0

    goto :goto_5c

    .line 193
    :cond_28
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->onAddQueueItem:Ljava/lang/Integer;

    if-eqz v4, :cond_4c

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    const/4 v6, -0x1

    if-eq v4, v6, :cond_4c

    .line 194
    iget v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    add-int/2addr v4, v5

    iput v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    .line 195
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    if-nez v4, :cond_40

    .line 196
    new-array v4, v5, [I

    iput-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    .line 198
    :cond_40
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->IconCompatParcelizer()[I

    move-result-object v4

    iput-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    .line 199
    iget v6, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    sub-int/2addr v6, v5

    aput v2, v4, v6

    goto :goto_5c

    .line 201
    :cond_4c
    iget-object v4, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->read:Ljava/util/HashMap;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 204
    :goto_5c
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    if-eqz v4, :cond_66

    array-length v6, v4

    if-ge v0, v6, :cond_66

    .line 205
    aget v3, v4, v0

    goto :goto_9d

    .line 206
    :cond_66
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/Float;

    if-eqz v4, :cond_8d

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    const/high16 v6, -0x40800000    # -1.0f

    cmpl-float v4, v4, v6

    if-eqz v4, :cond_8d

    .line 207
    iget v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    add-int/2addr v4, v5

    iput v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    .line 208
    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    if-nez v4, :cond_81

    .line 209
    new-array v4, v5, [F

    iput-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    .line 211
    :cond_81
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->read()[F

    move-result-object v4

    iput-object v4, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    .line 212
    iget v6, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    sub-int/2addr v6, v5

    aput v3, v4, v6

    goto :goto_9d

    .line 214
    :cond_8d
    iget-object v4, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->read:Ljava/util/HashMap;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 216
    :goto_9d
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 217
    iput v3, v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->AudioAttributesImplBaseParcelizer:F

    .line 218
    iget v3, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->handleMediaPlayPauseIfPendingOnHandler:I

    iput v3, v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->MediaBrowserCompatItemReceiver:I

    .line 219
    iput v2, v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 220
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_ae
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_9

    .line 222
    :cond_b2
    invoke-virtual {p0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method private IconCompatParcelizer(Ljava/lang/String;)V
    .registers 5

    if-eqz p1, :cond_31

    .line 428
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_31

    .line 431
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->MediaBrowserCompatItemReceiver:Landroid/content/Context;

    if-eqz v0, :cond_31

    .line 434
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    if-eqz v0, :cond_31

    .line 438
    iget v1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    add-int/lit8 v1, v1, 0x1

    array-length v2, v0

    if-le v1, v2, :cond_20

    .line 439
    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    .line 441
    :cond_20
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    iget v1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    int-to-float p1, p1

    aput p1, v0, v1

    .line 442
    iget p1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    :cond_31
    return-void
.end method

.method private IconCompatParcelizer()[I
    .registers 2

    .line 123
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    iget p0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    return-object p0
.end method

.method private RemoteActionCompatParcelizer(Ljava/lang/String;)V
    .registers 5

    if-nez p1, :cond_3

    return-void

    :cond_3
    const/4 v0, 0x0

    .line 392
    iput v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    :goto_6
    const/16 v1, 0x2c

    .line 394
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1b

    .line 396
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/constraintlayout/helper/widget/CircularFlow;->IconCompatParcelizer(Ljava/lang/String;)V

    return-void

    .line 399
    :cond_1b
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->IconCompatParcelizer(Ljava/lang/String;)V

    add-int/lit8 v0, v1, 0x1

    goto :goto_6
.end method

.method private read(Ljava/lang/String;)V
    .registers 5

    if-nez p1, :cond_3

    return-void

    :cond_3
    const/4 v0, 0x0

    .line 412
    iput v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    :goto_6
    const/16 v1, 0x2c

    .line 414
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1b

    .line 416
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/constraintlayout/helper/widget/CircularFlow;->write(Ljava/lang/String;)V

    return-void

    .line 419
    :cond_1b
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->write(Ljava/lang/String;)V

    add-int/lit8 v0, v1, 0x1

    goto :goto_6
.end method

.method private read()[F
    .registers 2

    .line 128
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    iget p0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaMetadataCompat:I

    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p0

    return-object p0
.end method

.method private write(Ljava/lang/String;)V
    .registers 5

    if-eqz p1, :cond_3f

    .line 449
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3f

    .line 452
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->MediaBrowserCompatItemReceiver:Landroid/content/Context;

    if-eqz v0, :cond_3f

    .line 455
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    if-eqz v0, :cond_3f

    .line 459
    iget v1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    add-int/lit8 v1, v1, 0x1

    array-length v2, v0

    if-le v1, v2, :cond_20

    .line 460
    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    .line 463
    :cond_20
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    iget v1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    int-to-float p1, p1

    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->MediaBrowserCompatItemReceiver:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v2

    float-to-int p1, p1

    aput p1, v0, v1

    .line 464
    iget p1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaDescriptionCompat:I

    :cond_3f
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 7

    .line 134
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/VirtualLayout;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    if-eqz p1, :cond_77

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/_isBlank$read;->ConstraintLayout_Layout:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_15
    if-ge v2, v0, :cond_74

    .line 140
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 141
    sget v4, Lo/_isBlank$read;->ConstraintLayout_Layout_circularflow_viewCenter:I

    if-ne v3, v4, :cond_26

    .line 142
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->handleMediaPlayPauseIfPendingOnHandler:I

    goto :goto_71

    .line 143
    :cond_26
    sget v4, Lo/_isBlank$read;->ConstraintLayout_Layout_circularflow_angles:I

    if-ne v3, v4, :cond_34

    .line 144
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    .line 145
    invoke-direct {p0, v3}, Landroidx/constraintlayout/helper/widget/CircularFlow;->RemoteActionCompatParcelizer(Ljava/lang/String;)V

    goto :goto_71

    .line 146
    :cond_34
    sget v4, Lo/_isBlank$read;->ConstraintLayout_Layout_circularflow_radiusInDP:I

    if-ne v3, v4, :cond_42

    .line 147
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/lang/String;

    .line 148
    invoke-direct {p0, v3}, Landroidx/constraintlayout/helper/widget/CircularFlow;->read(Ljava/lang/String;)V

    goto :goto_71

    .line 149
    :cond_42
    sget v4, Lo/_isBlank$read;->ConstraintLayout_Layout_circularflow_defaultAngle:I

    if-ne v3, v4, :cond_5a

    .line 150
    sget v4, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    iput-object v3, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/Float;

    .line 151
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/helper/widget/CircularFlow;->setDefaultAngle(F)V

    goto :goto_71

    .line 152
    :cond_5a
    sget v4, Lo/_isBlank$read;->ConstraintLayout_Layout_circularflow_defaultRadius:I

    if-ne v3, v4, :cond_71

    .line 153
    sget v4, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->onAddQueueItem:Ljava/lang/Integer;

    .line 154
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/helper/widget/CircularFlow;->setDefaultRadius(I)V

    :cond_71
    :goto_71
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    .line 157
    :cond_74
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_77
    return-void
.end method

.method public onAttachedToWindow()V
    .registers 4

    .line 163
    invoke-super {p0}, Landroidx/constraintlayout/widget/VirtualLayout;->onAttachedToWindow()V

    .line 164
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_f

    .line 165
    new-array v2, v1, [F

    iput-object v2, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplBaseParcelizer:[F

    .line 166
    invoke-direct {p0, v0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->RemoteActionCompatParcelizer(Ljava/lang/String;)V

    .line 168
    :cond_f
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/lang/String;

    if-eqz v0, :cond_1a

    .line 169
    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->RatingCompat:[I

    .line 170
    invoke-direct {p0, v0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->read(Ljava/lang/String;)V

    .line 172
    :cond_1a
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/Float;

    if-eqz v0, :cond_25

    .line 173
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->setDefaultAngle(F)V

    .line 175
    :cond_25
    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/CircularFlow;->onAddQueueItem:Ljava/lang/Integer;

    if-eqz v0, :cond_30

    .line 176
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->setDefaultRadius(I)V

    .line 178
    :cond_30
    invoke-direct {p0}, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public setDefaultAngle(F)V
    .registers 2

    .line 322
    sput p1, Landroidx/constraintlayout/helper/widget/CircularFlow;->MediaBrowserCompatCustomActionResultReceiver:F

    return-void
.end method

.method public setDefaultRadius(I)V
    .registers 2

    .line 332
    sput p1, Landroidx/constraintlayout/helper/widget/CircularFlow;->AudioAttributesImplApi26Parcelizer:I

    return-void
.end method
