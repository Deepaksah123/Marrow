###### Class androidx.constraintlayout.widget.ReactiveGuide (androidx.constraintlayout.widget.ReactiveGuide)
.class public Landroidx/constraintlayout/widget/ReactiveGuide;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lo/convertValue$AudioAttributesCompatParcelizer;


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private IconCompatParcelizer:I

.field private read:I

.field private write:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 38
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 p1, -0x1

    .line 32
    iput p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->AudioAttributesCompatParcelizer:Z

    .line 34
    iput p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->read:I

    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->write:Z

    const/16 p1, 0x8

    .line 39
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    .line 40
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ReactiveGuide;->RemoteActionCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 32
    iput p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->AudioAttributesCompatParcelizer:Z

    .line 34
    iput p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->read:I

    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->write:Z

    const/16 p1, 0x8

    .line 45
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    invoke-direct {p0, p2}, Landroidx/constraintlayout/widget/ReactiveGuide;->RemoteActionCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 50
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    .line 32
    iput p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->AudioAttributesCompatParcelizer:Z

    .line 34
    iput p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->read:I

    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->write:Z

    const/16 p1, 0x8

    .line 51
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    invoke-direct {p0, p2}, Landroidx/constraintlayout/widget/ReactiveGuide;->RemoteActionCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 6

    if-eqz p1, :cond_50

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/_isBlank$read;->ConstraintLayout_ReactiveGuide:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 64
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_11
    if-ge v1, v0, :cond_4d

    .line 66
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 67
    sget v3, Lo/_isBlank$read;->ConstraintLayout_ReactiveGuide_reactiveGuide_valueId:I

    if-ne v2, v3, :cond_24

    .line 68
    iget v3, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    goto :goto_4a

    .line 69
    :cond_24
    sget v3, Lo/_isBlank$read;->ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange:I

    if-ne v2, v3, :cond_31

    .line 70
    iget-boolean v3, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->AudioAttributesCompatParcelizer:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->AudioAttributesCompatParcelizer:Z

    goto :goto_4a

    .line 71
    :cond_31
    sget v3, Lo/_isBlank$read;->ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet:I

    if-ne v2, v3, :cond_3e

    .line 72
    iget v3, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->read:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->read:I

    goto :goto_4a

    .line 73
    :cond_3e
    sget v3, Lo/_isBlank$read;->ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets:I

    if-ne v2, v3, :cond_4a

    .line 74
    iget-boolean v3, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->write:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->write:Z

    :cond_4a
    :goto_4a
    add-int/lit8 v1, v1, 0x1

    goto :goto_11

    .line 77
    :cond_4d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    :cond_50
    iget p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_5e

    .line 80
    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->MediaBrowserCompatMediaItem()Lo/convertValue;

    move-result-object p1

    .line 81
    iget v0, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    invoke-virtual {p1, v0, p0}, Lo/convertValue;->RemoteActionCompatParcelizer(ILo/convertValue$AudioAttributesCompatParcelizer;)V

    :cond_5e
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 2

    return-void
.end method

.method protected onMeasure(II)V
    .registers 3

    const/4 p1, 0x0

    .line 132
    invoke-virtual {p0, p1, p1}, Landroidx/constraintlayout/widget/ReactiveGuide;->setMeasuredDimension(II)V

    return-void
.end method

.method public setAnimateChange(Z)V
    .registers 2

    .line 109
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->AudioAttributesCompatParcelizer:Z

    return-void
.end method

.method public setApplyToConstraintSetId(I)V
    .registers 2

    .line 103
    iput p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->read:I

    return-void
.end method

.method public setAttributeId(I)V
    .registers 5

    .line 88
    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->MediaBrowserCompatMediaItem()Lo/convertValue;

    move-result-object v0

    .line 89
    iget v1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_c

    .line 90
    invoke-virtual {v0, v1, p0}, Lo/convertValue;->AudioAttributesCompatParcelizer(ILo/convertValue$AudioAttributesCompatParcelizer;)V

    .line 92
    :cond_c
    iput p1, p0, Landroidx/constraintlayout/widget/ReactiveGuide;->IconCompatParcelizer:I

    if-eq p1, v2, :cond_13

    .line 94
    invoke-virtual {v0, p1, p0}, Lo/convertValue;->RemoteActionCompatParcelizer(ILo/convertValue$AudioAttributesCompatParcelizer;)V

    :cond_13
    return-void
.end method

.method public setGuidelineBegin(I)V
    .registers 3

    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 142
    iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->onPrepare:I

    .line 143
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setGuidelineEnd(I)V
    .registers 3

    .line 152
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 153
    iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->onPlayFromSearch:I

    .line 154
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setGuidelinePercent(F)V
    .registers 3

    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 163
    iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->onPlayFromUri:F

    .line 164
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setVisibility(I)V
    .registers 2

    return-void
.end method
