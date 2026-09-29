###### Class androidx.constraintlayout.motion.widget.MotionHelper (androidx.constraintlayout.motion.widget.MotionHelper)
.class public Landroidx/constraintlayout/motion/widget/MotionHelper;
.super Landroidx/constraintlayout/widget/ConstraintHelper;
.source "SourceFile"

# interfaces
.implements Lo/PrimitiveArrayDeserializersByteDeser;


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Z

.field private AudioAttributesImplApi26Parcelizer:F

.field private AudioAttributesImplBaseParcelizer:[Landroid/view/View;

.field private MediaBrowserCompatCustomActionResultReceiver:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 43
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 37
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 38
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplApi21Parcelizer:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 47
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 37
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 38
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplApi21Parcelizer:Z

    .line 48
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 52
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 37
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 38
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplApi21Parcelizer:Z

    .line 53
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 6

    .line 60
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    if-eqz p1, :cond_39

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/_isBlank$read;->MotionHelper:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 63
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v0, :cond_36

    .line 65
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 66
    sget v3, Lo/_isBlank$read;->MotionHelper_onShow:I

    if-ne v2, v3, :cond_27

    .line 67
    iget-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->MediaBrowserCompatCustomActionResultReceiver:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->MediaBrowserCompatCustomActionResultReceiver:Z

    goto :goto_33

    .line 68
    :cond_27
    sget v3, Lo/_isBlank$read;->MotionHelper_onHide:I

    if-ne v2, v3, :cond_33

    .line 69
    iget-boolean v3, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplApi21Parcelizer:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplApi21Parcelizer:Z

    :cond_33
    :goto_33
    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    .line 72
    :cond_36
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_39
    return-void
.end method

.method public IconCompatParcelizer()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 83
    iget-boolean p0, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->MediaBrowserCompatCustomActionResultReceiver:Z

    return p0
.end method

.method public read(I)V
    .registers 2

    return-void
.end method

.method public read(Landroidx/constraintlayout/motion/widget/MotionLayout;Ljava/util/HashMap;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/motion/widget/MotionLayout;",
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lo/handleSingleElementUnwrapped;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final read()Z
    .registers 1

    .line 93
    iget-boolean p0, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplApi21Parcelizer:Z

    return p0
.end method

.method public setProgress(F)V
    .registers 7

    .line 103
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplApi26Parcelizer:F

    .line 104
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    const/4 v1, 0x0

    if-lez v0, :cond_21

    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionHelper;->write(Landroidx/constraintlayout/widget/ConstraintLayout;)[Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplBaseParcelizer:[Landroid/view/View;

    .line 107
    :goto_13
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->write:I

    if-ge v1, v0, :cond_3b

    .line 108
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionHelper;->AudioAttributesImplBaseParcelizer:[Landroid/view/View;

    aget-object v0, v0, v1

    .line 109
    invoke-virtual {p0, v0, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->setProgress(Landroid/view/View;F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    .line 112
    :cond_21
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 113
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    :goto_2b
    if-ge v1, v2, :cond_3b

    .line 116
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 117
    instance-of v4, v3, Landroidx/constraintlayout/motion/widget/MotionHelper;

    if-nez v4, :cond_38

    .line 120
    invoke-virtual {p0, v3, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->setProgress(Landroid/view/View;F)V

    :cond_38
    add-int/lit8 v1, v1, 0x1

    goto :goto_2b

    :cond_3b
    return-void
.end method

.method public setProgress(Landroid/view/View;F)V
    .registers 3

    return-void
.end method
