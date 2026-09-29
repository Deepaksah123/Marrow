###### Class androidx.constraintlayout.utils.widget.MotionButton (androidx.constraintlayout.utils.widget.MotionButton)
.class public Landroidx/constraintlayout/utils/widget/MotionButton;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# instance fields
.field private AudioAttributesCompatParcelizer:F

.field private IconCompatParcelizer:Landroid/view/ViewOutlineProvider;

.field private RemoteActionCompatParcelizer:F

.field private read:Landroid/graphics/Path;

.field private write:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 66
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 59
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 60
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer:F

    const/4 p1, 0x0

    .line 67
    invoke-direct {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionButton;->IconCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 71
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 59
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 60
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer:F

    .line 72
    invoke-direct {p0, p2}, Landroidx/constraintlayout/utils/widget/MotionButton;->IconCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 76
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 59
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 60
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer:F

    .line 77
    invoke-direct {p0, p2}, Landroidx/constraintlayout/utils/widget/MotionButton;->IconCompatParcelizer(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/constraintlayout/utils/widget/MotionButton;)F
    .registers 1

    .line 58
    iget p0, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer:F

    return p0
.end method

.method private IconCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 7

    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    if-eqz p1, :cond_38

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/_isBlank$read;->ImageFilterView:[I

    .line 84
    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 85
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    :goto_14
    if-ge v0, v1, :cond_35

    .line 87
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 88
    sget v3, Lo/_isBlank$read;->ImageFilterView_round:I

    const/4 v4, 0x0

    if-ne v2, v3, :cond_27

    .line 90
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionButton;->setRound(F)V

    goto :goto_32

    .line 92
    :cond_27
    sget v3, Lo/_isBlank$read;->ImageFilterView_roundPercent:I

    if-ne v2, v3, :cond_32

    .line 94
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionButton;->setRoundPercent(F)V

    :cond_32
    :goto_32
    add-int/lit8 v0, v0, 0x1

    goto :goto_14

    .line 98
    :cond_35
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_38
    return-void
.end method

.method static synthetic RemoteActionCompatParcelizer(Landroidx/constraintlayout/utils/widget/MotionButton;)F
    .registers 1

    .line 58
    iget p0, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    return p0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 2

    .line 238
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public setRound(F)V
    .registers 6

    .line 160
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 161
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer:F

    .line 162
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    const/high16 v0, -0x40800000    # -1.0f

    .line 163
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    .line 164
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionButton;->setRoundPercent(F)V

    return-void

    .line 167
    :cond_12
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer:F

    cmpl-float v0, v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1c

    move v0, v1

    goto :goto_1d

    :cond_1c
    move v0, v2

    .line 168
    :goto_1d
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_6b

    .line 171
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->read:Landroid/graphics/Path;

    if-nez p1, :cond_2f

    .line 172
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->read:Landroid/graphics/Path;

    .line 174
    :cond_2f
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->write:Landroid/graphics/RectF;

    if-nez p1, :cond_3a

    .line 175
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->write:Landroid/graphics/RectF;

    .line 178
    :cond_3a
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->IconCompatParcelizer:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_48

    .line 179
    new-instance p1, Landroidx/constraintlayout/utils/widget/MotionButton$5;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/MotionButton$5;-><init>(Landroidx/constraintlayout/utils/widget/MotionButton;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->IconCompatParcelizer:Landroid/view/ViewOutlineProvider;

    .line 187
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionButton;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 189
    :cond_48
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/MotionButton;->setClipToOutline(Z)V

    .line 192
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 193
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 194
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->write:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v2, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 195
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->read:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 196
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->read:Landroid/graphics/Path;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->write:Landroid/graphics/RectF;

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer:F

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_6e

    .line 199
    :cond_6b
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionButton;->setClipToOutline(Z)V

    :goto_6e
    if-eqz v0, :cond_73

    .line 204
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/MotionButton;->invalidateOutline()V

    :cond_73
    return-void
.end method

.method public setRoundPercent(F)V
    .registers 7

    .line 110
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    cmpl-float v0, v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_a

    move v0, v1

    goto :goto_b

    :cond_a
    move v0, v2

    .line 111
    :goto_b
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-eqz p1, :cond_62

    .line 113
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->read:Landroid/graphics/Path;

    if-nez p1, :cond_1d

    .line 114
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->read:Landroid/graphics/Path;

    .line 116
    :cond_1d
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->write:Landroid/graphics/RectF;

    if-nez p1, :cond_28

    .line 117
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->write:Landroid/graphics/RectF;

    .line 120
    :cond_28
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->IconCompatParcelizer:Landroid/view/ViewOutlineProvider;

    if-nez p1, :cond_36

    .line 121
    new-instance p1, Landroidx/constraintlayout/utils/widget/MotionButton$1;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/MotionButton$1;-><init>(Landroidx/constraintlayout/utils/widget/MotionButton;)V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->IconCompatParcelizer:Landroid/view/ViewOutlineProvider;

    .line 130
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionButton;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 132
    :cond_36
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/MotionButton;->setClipToOutline(Z)V

    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 136
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer:F

    mul-float/2addr v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    .line 137
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->write:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float v1, v1

    invoke-virtual {v4, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 138
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->read:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 139
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->read:Landroid/graphics/Path;

    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionButton;->write:Landroid/graphics/RectF;

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    goto :goto_65

    .line 142
    :cond_62
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionButton;->setClipToOutline(Z)V

    :goto_65
    if-eqz v0, :cond_6a

    .line 147
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/MotionButton;->invalidateOutline()V

    :cond_6a
    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.MotionButton.AnonymousClass1 (androidx.constraintlayout.utils.widget.MotionButton$1)
.class final Landroidx/constraintlayout/utils/widget/MotionButton$1;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/utils/widget/MotionButton;->setRoundPercent(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic read:Landroidx/constraintlayout/utils/widget/MotionButton;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/utils/widget/MotionButton;)V
    .registers 2

    .line 121
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton$1;->read:Landroidx/constraintlayout/utils/widget/MotionButton;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 9

    .line 124
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton$1;->read:Landroidx/constraintlayout/utils/widget/MotionButton;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 125
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton$1;->read:Landroidx/constraintlayout/utils/widget/MotionButton;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 126
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionButton$1;->read:Landroidx/constraintlayout/utils/widget/MotionButton;

    invoke-static {p0}, Landroidx/constraintlayout/utils/widget/MotionButton;->RemoteActionCompatParcelizer(Landroidx/constraintlayout/utils/widget/MotionButton;)F

    move-result p0

    mul-float/2addr p1, p0

    const/high16 p0, 0x40000000    # 2.0f

    div-float v5, p1, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    .line 127
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method

###### Class androidx.constraintlayout.utils.widget.MotionButton.AnonymousClass5 (androidx.constraintlayout.utils.widget.MotionButton$5)
.class final Landroidx/constraintlayout/utils/widget/MotionButton$5;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/utils/widget/MotionButton;->setRound(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionButton;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/utils/widget/MotionButton;)V
    .registers 2

    .line 179
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton$5;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionButton;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 9

    .line 182
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton$5;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionButton;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 183
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionButton$5;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionButton;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 184
    iget-object p0, p0, Landroidx/constraintlayout/utils/widget/MotionButton$5;->RemoteActionCompatParcelizer:Landroidx/constraintlayout/utils/widget/MotionButton;

    invoke-static {p0}, Landroidx/constraintlayout/utils/widget/MotionButton;->AudioAttributesCompatParcelizer(Landroidx/constraintlayout/utils/widget/MotionButton;)F

    move-result v5

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method
