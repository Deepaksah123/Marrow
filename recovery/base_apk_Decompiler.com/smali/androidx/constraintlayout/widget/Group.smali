###### Class androidx.constraintlayout.widget.Group (androidx.constraintlayout.widget.Group)
.class public Landroidx/constraintlayout/widget/Group;
.super Landroidx/constraintlayout/widget/ConstraintHelper;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 55
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 59
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 63
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected final AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 2

    .line 71
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 72
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer:Z

    return-void
.end method

.method protected final IconCompatParcelizer(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .registers 2

    .line 99
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/Group;->read(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .registers 1

    .line 77
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintHelper;->onAttachedToWindow()V

    .line 78
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/Group;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public setElevation(F)V
    .registers 2

    .line 89
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setElevation(F)V

    .line 90
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/Group;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public setVisibility(I)V
    .registers 2

    .line 83
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setVisibility(I)V

    .line 84
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/Group;->AudioAttributesImplBaseParcelizer()V

    return-void
.end method

.method public final write()V
    .registers 3

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 109
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->getOnBackPressedDispatcherannotations:Lo/JdkDeserializers;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/JdkDeserializers;->onFastForward(I)V

    .line 110
    iget-object p0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->getOnBackPressedDispatcherannotations:Lo/JdkDeserializers;

    invoke-virtual {p0, v1}, Lo/JdkDeserializers;->MediaMetadataCompat(I)V

    return-void
.end method
