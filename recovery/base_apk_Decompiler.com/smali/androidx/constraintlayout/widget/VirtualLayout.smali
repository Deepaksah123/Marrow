###### Class androidx.constraintlayout.widget.VirtualLayout (androidx.constraintlayout.widget.VirtualLayout)
.class public abstract Landroidx/constraintlayout/widget/VirtualLayout;
.super Landroidx/constraintlayout/widget/ConstraintHelper;
.source "SourceFile"


# instance fields
.field private AudioAttributesImplApi26Parcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 35
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 39
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 7

    .line 48
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    if-eqz p1, :cond_2e

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/_isBlank$read;->ConstraintLayout_Layout:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 51
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v0, :cond_2b

    .line 53
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 54
    sget v3, Lo/_isBlank$read;->ConstraintLayout_Layout_android_visibility:I

    const/4 v4, 0x1

    if-ne v2, v3, :cond_22

    .line 55
    iput-boolean v4, p0, Landroidx/constraintlayout/widget/VirtualLayout;->AudioAttributesImplApi26Parcelizer:Z

    goto :goto_28

    .line 56
    :cond_22
    sget v3, Lo/_isBlank$read;->ConstraintLayout_Layout_android_elevation:I

    if-ne v2, v3, :cond_28

    .line 57
    iput-boolean v4, p0, Landroidx/constraintlayout/widget/VirtualLayout;->MediaBrowserCompatCustomActionResultReceiver:Z

    :cond_28
    :goto_28
    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    .line 60
    :cond_2b
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_2e
    return-void
.end method

.method protected final IconCompatParcelizer(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .registers 2

    .line 125
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/VirtualLayout;->read(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .registers 7

    .line 73
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintHelper;->onAttachedToWindow()V

    .line 74
    iget-boolean v0, p0, Landroidx/constraintlayout/widget/VirtualLayout;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Landroidx/constraintlayout/widget/VirtualLayout;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v0, :cond_47

    .line 75
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 76
    instance-of v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v1, :cond_47

    .line 77
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v1

    .line 81
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/VirtualLayout;->getElevation()F

    move-result v2

    const/4 v3, 0x0

    .line 83
    :goto_1e
    iget v4, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-ge v3, v4, :cond_47

    .line 84
    iget-object v4, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->IconCompatParcelizer:[I

    aget v4, v4, v3

    .line 85
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->MediaBrowserCompatItemReceiver(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_44

    .line 87
    iget-boolean v5, p0, Landroidx/constraintlayout/widget/VirtualLayout;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v5, :cond_33

    .line 88
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 90
    :cond_33
    iget-boolean v5, p0, Landroidx/constraintlayout/widget/VirtualLayout;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v5, :cond_44

    const/4 v5, 0x0

    cmpl-float v5, v2, v5

    if-lez v5, :cond_44

    .line 92
    invoke-virtual {v4}, Landroid/view/View;->getTranslationZ()F

    move-result v5

    add-float/2addr v5, v2

    invoke-virtual {v4, v5}, Landroid/view/View;->setTranslationZ(F)V

    :cond_44
    add-int/lit8 v3, v3, 0x1

    goto :goto_1e

    :cond_47
    return-void
.end method

.method public read(Lo/_readAndBindStringKeyMap;II)V
    .registers 4

    return-void
.end method

.method public setElevation(F)V
    .registers 2

    .line 115
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setElevation(F)V

    .line 116
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/VirtualLayout;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public setVisibility(I)V
    .registers 2

    .line 106
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setVisibility(I)V

    .line 107
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/VirtualLayout;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method
