###### Class androidx.constraintlayout.widget.Constraints (androidx.constraintlayout.widget.Constraints)
.class public Landroidx/constraintlayout/widget/Constraints;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/Constraints$LayoutParams;
    }
.end annotation


# instance fields
.field private write:Lo/ReferenceTypeDeserializer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 41
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    .line 42
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 46
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x8

    .line 48
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 52
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x8

    .line 54
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/Constraints$LayoutParams;
    .registers 3

    .line 62
    new-instance v0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroidx/constraintlayout/widget/Constraints$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer()Landroidx/constraintlayout/widget/Constraints$LayoutParams;
    .registers 1

    .line 136
    new-instance v0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/Constraints$LayoutParams;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final IconCompatParcelizer()Lo/ReferenceTypeDeserializer;
    .registers 2

    .line 152
    iget-object v0, p0, Landroidx/constraintlayout/widget/Constraints;->write:Lo/ReferenceTypeDeserializer;

    if-nez v0, :cond_b

    .line 153
    new-instance v0, Lo/ReferenceTypeDeserializer;

    invoke-direct {v0}, Lo/ReferenceTypeDeserializer;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/Constraints;->write:Lo/ReferenceTypeDeserializer;

    .line 156
    :cond_b
    iget-object v0, p0, Landroidx/constraintlayout/widget/Constraints;->write:Lo/ReferenceTypeDeserializer;

    invoke-virtual {v0, p0}, Lo/ReferenceTypeDeserializer;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/widget/Constraints;)V

    .line 157
    iget-object p0, p0, Landroidx/constraintlayout/widget/Constraints;->write:Lo/ReferenceTypeDeserializer;

    return-object p0
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 1

    .line 35
    invoke-static {}, Landroidx/constraintlayout/widget/Constraints;->RemoteActionCompatParcelizer()Landroidx/constraintlayout/widget/Constraints$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 35
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/Constraints;->IconCompatParcelizer(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/Constraints$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 148
    new-instance p0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    return-void
.end method

###### Class androidx.constraintlayout.widget.Constraints.LayoutParams (androidx.constraintlayout.widget.Constraints$LayoutParams)
.class public Landroidx/constraintlayout/widget/Constraints$LayoutParams;
.super Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/Constraints;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field public addContentView:Z

.field public addMenuProvider:F

.field public addOnConfigurationChangedListener:F

.field public addOnContextAvailableListener:F

.field public addOnMultiWindowModeChangedListener:F

.field public addOnNewIntentListener:F

.field public addOnPictureInPictureModeChangedListener:F

.field public addOnTrimMemoryListener:F

.field public addOnUserLeaveHintListener:F

.field public getActivityResultRegistry:F

.field public getDefaultViewModelCreationExtras:F

.field public getDefaultViewModelProviderFactory:F

.field public menuHostHelperlambda0:F


# direct methods
.method public constructor <init>()V
    .registers 3

    const/4 v0, -0x2

    .line 82
    invoke-direct {p0, v0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 67
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addMenuProvider:F

    const/4 v1, 0x0

    .line 68
    iput-boolean v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addContentView:Z

    const/4 v1, 0x0

    .line 69
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->menuHostHelperlambda0:F

    .line 70
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnMultiWindowModeChangedListener:F

    .line 71
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnContextAvailableListener:F

    .line 72
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnPictureInPictureModeChangedListener:F

    .line 73
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnConfigurationChangedListener:F

    .line 74
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnNewIntentListener:F

    .line 75
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnUserLeaveHintListener:F

    .line 76
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getDefaultViewModelCreationExtras:F

    .line 77
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnTrimMemoryListener:F

    .line 78
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getDefaultViewModelProviderFactory:F

    .line 79
    iput v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getActivityResultRegistry:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 90
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 67
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addMenuProvider:F

    const/4 v1, 0x0

    .line 68
    iput-boolean v1, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addContentView:Z

    const/4 v2, 0x0

    .line 69
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->menuHostHelperlambda0:F

    .line 70
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnMultiWindowModeChangedListener:F

    .line 71
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnContextAvailableListener:F

    .line 72
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnPictureInPictureModeChangedListener:F

    .line 73
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnConfigurationChangedListener:F

    .line 74
    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnNewIntentListener:F

    .line 75
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnUserLeaveHintListener:F

    .line 76
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getDefaultViewModelCreationExtras:F

    .line 77
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnTrimMemoryListener:F

    .line 78
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getDefaultViewModelProviderFactory:F

    .line 79
    iput v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getActivityResultRegistry:F

    .line 91
    sget-object v0, Lo/_isBlank$read;->ConstraintSet:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 92
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    :goto_2b
    if-ge v1, p2, :cond_d7

    .line 94
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v0

    .line 95
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_alpha:I

    if-ne v0, v2, :cond_3f

    .line 96
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addMenuProvider:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addMenuProvider:F

    goto/16 :goto_d3

    .line 97
    :cond_3f
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_elevation:I

    if-ne v0, v2, :cond_50

    .line 99
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->menuHostHelperlambda0:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->menuHostHelperlambda0:F

    const/4 v0, 0x1

    .line 100
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addContentView:Z

    goto/16 :goto_d3

    .line 102
    :cond_50
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_rotationX:I

    if-ne v0, v2, :cond_5e

    .line 103
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnContextAvailableListener:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnContextAvailableListener:F

    goto/16 :goto_d3

    .line 104
    :cond_5e
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_rotationY:I

    if-ne v0, v2, :cond_6c

    .line 105
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnPictureInPictureModeChangedListener:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnPictureInPictureModeChangedListener:F

    goto/16 :goto_d3

    .line 106
    :cond_6c
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_rotation:I

    if-ne v0, v2, :cond_79

    .line 107
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnMultiWindowModeChangedListener:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnMultiWindowModeChangedListener:F

    goto :goto_d3

    .line 108
    :cond_79
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_scaleX:I

    if-ne v0, v2, :cond_86

    .line 109
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnConfigurationChangedListener:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnConfigurationChangedListener:F

    goto :goto_d3

    .line 110
    :cond_86
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_scaleY:I

    if-ne v0, v2, :cond_93

    .line 111
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnNewIntentListener:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnNewIntentListener:F

    goto :goto_d3

    .line 112
    :cond_93
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_transformPivotX:I

    if-ne v0, v2, :cond_a0

    .line 113
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnUserLeaveHintListener:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnUserLeaveHintListener:F

    goto :goto_d3

    .line 114
    :cond_a0
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_transformPivotY:I

    if-ne v0, v2, :cond_ad

    .line 115
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getDefaultViewModelCreationExtras:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getDefaultViewModelCreationExtras:F

    goto :goto_d3

    .line 116
    :cond_ad
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_translationX:I

    if-ne v0, v2, :cond_ba

    .line 117
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnTrimMemoryListener:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->addOnTrimMemoryListener:F

    goto :goto_d3

    .line 118
    :cond_ba
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_translationY:I

    if-ne v0, v2, :cond_c7

    .line 119
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getDefaultViewModelProviderFactory:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getDefaultViewModelProviderFactory:F

    goto :goto_d3

    .line 120
    :cond_c7
    sget v2, Lo/_isBlank$read;->ConstraintSet_android_translationZ:I

    if-ne v0, v2, :cond_d3

    .line 122
    iget v2, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getActivityResultRegistry:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Landroidx/constraintlayout/widget/Constraints$LayoutParams;->getActivityResultRegistry:F

    :cond_d3
    :goto_d3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2b

    .line 126
    :cond_d7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
