###### Class androidx.cardview.widget.CardView (androidx.cardview.widget.CardView)
.class public Landroidx/cardview/widget/CardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field private static final MediaBrowserCompatItemReceiver:Lo/setTransitioning;

.field private static final RemoteActionCompatParcelizer:[I


# instance fields
.field final AudioAttributesCompatParcelizer:Landroid/graphics/Rect;

.field private final AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

.field private AudioAttributesImplApi26Parcelizer:Z

.field final IconCompatParcelizer:Landroid/graphics/Rect;

.field private MediaBrowserCompatCustomActionResultReceiver:Z

.field read:I

.field write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const v0, 0x1010031

    .line 81
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/cardview/widget/CardView;->RemoteActionCompatParcelizer:[I

    .line 86
    new-instance v0, Lo/setSplitBackground;

    invoke-direct {v0}, Lo/setSplitBackground;-><init>()V

    sput-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    .line 92
    invoke-interface {v0}, Lo/setTransitioning;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 113
    invoke-direct {p0, p1, v0}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 117
    sget v0, Lo/ActionBarContextView$RemoteActionCompatParcelizer;->cardViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 13

    .line 121
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 108
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    .line 110
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/cardview/widget/CardView;->AudioAttributesCompatParcelizer:Landroid/graphics/Rect;

    .line 447
    new-instance v3, Landroidx/cardview/widget/CardView$5;

    invoke-direct {v3, p0}, Landroidx/cardview/widget/CardView$5;-><init>(Landroidx/cardview/widget/CardView;)V

    iput-object v3, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    .line 123
    sget-object v1, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView:[I

    sget v2, Lo/ActionBarContextView$read;->CardView:I

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 126
    sget p3, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_cardBackgroundColor:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    const/4 v1, 0x0

    if-eqz p3, :cond_31

    .line 127
    sget p3, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_cardBackgroundColor:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    :goto_2f
    move-object v5, p3

    goto :goto_6b

    .line 130
    :cond_31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget-object v2, Landroidx/cardview/widget/CardView;->RemoteActionCompatParcelizer:[I

    invoke-virtual {p3, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p3

    .line 131
    invoke-virtual {p3, v1, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 132
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    const/4 p3, 0x3

    .line 135
    new-array p3, p3, [F

    .line 136
    invoke-static {v2, p3}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v2, 0x2

    .line 137
    aget p3, p3, v2

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float p3, p3, v2

    if-lez p3, :cond_5c

    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v2, Lo/ActionBarContextView$IconCompatParcelizer;->cardview_light_background:I

    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    goto :goto_66

    .line 139
    :cond_5c
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v2, Lo/ActionBarContextView$IconCompatParcelizer;->cardview_dark_background:I

    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    .line 137
    :goto_66
    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    goto :goto_2f

    .line 141
    :goto_6b
    sget p3, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_cardCornerRadius:I

    const/4 v2, 0x0

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    .line 142
    sget p3, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_cardElevation:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    .line 143
    sget p3, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_cardMaxElevation:I

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    .line 144
    sget v2, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_cardUseCompatPadding:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 145
    sget v2, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_cardPreventCornerOverlap:I

    const/4 v4, 0x1

    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi26Parcelizer:Z

    .line 146
    sget v2, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_contentPadding:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 147
    sget v4, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_contentPaddingLeft:I

    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 149
    sget v4, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_contentPaddingTop:I

    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 151
    sget v4, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_contentPaddingRight:I

    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, v0, Landroid/graphics/Rect;->right:I

    .line 153
    sget v4, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_contentPaddingBottom:I

    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->bottom:I

    cmpl-float v0, v7, p3

    if-lez v0, :cond_bb

    move v8, v7

    goto :goto_bc

    :cond_bb
    move v8, p3

    .line 158
    :goto_bc
    sget p3, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_android_minWidth:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Landroidx/cardview/widget/CardView;->read:I

    .line 159
    sget p3, Lo/ActionBarContextView$AudioAttributesCompatParcelizer;->CardView_android_minHeight:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Landroidx/cardview/widget/CardView;->write:I

    .line 160
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 162
    sget-object v2, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    move-object v4, p1

    invoke-interface/range {v2 .. v8}, Lo/setTransitioning;->IconCompatParcelizer(Lo/setStackedBackground;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V

    return-void
.end method

.method static synthetic IconCompatParcelizer(Landroidx/cardview/widget/CardView;IIII)V
    .registers 5

    .line 79
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 1

    .line 183
    iget-boolean p0, p0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatCustomActionResultReceiver:Z

    return p0
.end method

.method public AudioAttributesImplApi26Parcelizer()I
    .registers 1

    .line 333
    iget-object p0, p0, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->top:I

    return p0
.end method

.method public final AudioAttributesImplBaseParcelizer()F
    .registers 2

    .line 413
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, p0}, Lo/setTransitioning;->AudioAttributesCompatParcelizer(Lo/setStackedBackground;)F

    move-result p0

    return p0
.end method

.method public MediaBrowserCompatCustomActionResultReceiver()F
    .registers 2

    .line 364
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, p0}, Lo/setTransitioning;->AudioAttributesImplApi26Parcelizer(Lo/setStackedBackground;)F

    move-result p0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()Z
    .registers 1

    .line 424
    iget-boolean p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi26Parcelizer:Z

    return p0
.end method

.method public T_()Landroid/content/res/ColorStateList;
    .registers 2

    .line 303
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, p0}, Lo/setTransitioning;->read(Lo/setStackedBackground;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public U_()I
    .registers 1

    .line 343
    iget-object p0, p0, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    return p0
.end method

.method public V_()I
    .registers 1

    .line 313
    iget-object p0, p0, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->left:I

    return p0
.end method

.method public W_()I
    .registers 1

    .line 323
    iget-object p0, p0, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->right:I

    return p0
.end method

.method public final X_()F
    .registers 2

    .line 387
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, p0}, Lo/setTransitioning;->write(Lo/setStackedBackground;)F

    move-result p0

    return p0
.end method

.method public onMeasure(II)V
    .registers 9

    .line 232
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    instance-of v1, v0, Lo/setSplitBackground;

    if-nez v1, :cond_4e

    .line 233
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, -0x80000000

    if-eq v1, v3, :cond_12

    if-ne v1, v2, :cond_2a

    .line 237
    :cond_12
    iget-object v4, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, v4}, Lo/setTransitioning;->IconCompatParcelizer(Lo/setStackedBackground;)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    .line 239
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 238
    invoke-static {v4, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 246
    :cond_2a
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-eq v1, v3, :cond_32

    if-ne v1, v2, :cond_4a

    .line 250
    :cond_32
    iget-object v2, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, v2}, Lo/setTransitioning;->RemoteActionCompatParcelizer(Lo/setStackedBackground;)F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    .line 252
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 251
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 258
    :cond_4a
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void

    .line 260
    :cond_4e
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public setCardBackgroundColor(I)V
    .registers 3

    .line 283
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lo/setTransitioning;->AudioAttributesCompatParcelizer(Lo/setStackedBackground;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCardBackgroundColor(Landroid/content/res/ColorStateList;)V
    .registers 3

    .line 293
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, p0, p1}, Lo/setTransitioning;->AudioAttributesCompatParcelizer(Lo/setStackedBackground;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setCardElevation(F)V
    .registers 3

    .line 376
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, p0, p1}, Lo/setTransitioning;->RemoteActionCompatParcelizer(Lo/setStackedBackground;F)V

    return-void
.end method

.method public setContentPadding(IIII)V
    .registers 6

    .line 226
    iget-object v0, p0, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 227
    sget-object p1, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {p1, p0}, Lo/setTransitioning;->AudioAttributesImplBaseParcelizer(Lo/setStackedBackground;)V

    return-void
.end method

.method public setMaxCardElevation(F)V
    .registers 3

    .line 402
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, p0, p1}, Lo/setTransitioning;->read(Lo/setStackedBackground;F)V

    return-void
.end method

.method public setMinimumHeight(I)V
    .registers 2

    .line 272
    iput p1, p0, Landroidx/cardview/widget/CardView;->write:I

    .line 273
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumHeight(I)V

    return-void
.end method

.method public setMinimumWidth(I)V
    .registers 2

    .line 266
    iput p1, p0, Landroidx/cardview/widget/CardView;->read:I

    .line 267
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setMinimumWidth(I)V

    return-void
.end method

.method public setPadding(IIII)V
    .registers 5

    return-void
.end method

.method public setPaddingRelative(IIII)V
    .registers 5

    return-void
.end method

.method public setPreventCornerOverlap(Z)V
    .registers 3

    .line 441
    iget-boolean v0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi26Parcelizer:Z

    if-eq p1, v0, :cond_d

    .line 442
    iput-boolean p1, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi26Parcelizer:Z

    .line 443
    sget-object p1, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {p1, p0}, Lo/setTransitioning;->MediaBrowserCompatItemReceiver(Lo/setStackedBackground;)V

    :cond_d
    return-void
.end method

.method public setRadius(F)V
    .registers 3

    .line 354
    sget-object v0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {v0, p0, p1}, Lo/setTransitioning;->write(Lo/setStackedBackground;F)V

    return-void
.end method

.method public setUseCompatPadding(Z)V
    .registers 3

    .line 203
    iget-boolean v0, p0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eq v0, p1, :cond_d

    .line 204
    iput-boolean p1, p0, Landroidx/cardview/widget/CardView;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 205
    sget-object p1, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver:Lo/setTransitioning;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer:Lo/setStackedBackground;

    invoke-interface {p1, p0}, Lo/setTransitioning;->AudioAttributesImplApi21Parcelizer(Lo/setStackedBackground;)V

    :cond_d
    return-void
.end method

###### Class androidx.cardview.widget.CardView.AnonymousClass5 (androidx.cardview.widget.CardView$5)
.class final Landroidx/cardview/widget/CardView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/setStackedBackground;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/cardview/widget/CardView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/graphics/drawable/Drawable;

.field final synthetic IconCompatParcelizer:Landroidx/cardview/widget/CardView;


# direct methods
.method constructor <init>(Landroidx/cardview/widget/CardView;)V
    .registers 2

    .line 447
    iput-object p1, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()Z
    .registers 1

    .line 458
    iget-object p0, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    invoke-virtual {p0}, Landroidx/cardview/widget/CardView;->AudioAttributesImplApi21Parcelizer()Z

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;
    .registers 1

    .line 485
    iget-object p0, p0, Landroidx/cardview/widget/CardView$5;->AudioAttributesCompatParcelizer:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final read(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 452
    iput-object p1, p0, Landroidx/cardview/widget/CardView$5;->AudioAttributesCompatParcelizer:Landroid/graphics/drawable/Drawable;

    .line 453
    iget-object p0, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final read()Z
    .registers 1

    .line 463
    iget-object p0, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    invoke-virtual {p0}, Landroidx/cardview/widget/CardView;->MediaBrowserCompatItemReceiver()Z

    move-result p0

    return p0
.end method

.method public final write()Landroid/view/View;
    .registers 1

    .line 490
    iget-object p0, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    return-object p0
.end method

.method public final write(IIII)V
    .registers 7

    .line 468
    iget-object v0, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    iget-object v0, v0, Landroidx/cardview/widget/CardView;->AudioAttributesCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 469
    iget-object v0, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    iget-object v1, v0, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v1

    iget-object v1, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    iget-object v1, v1, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p2, v1

    iget-object v1, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    iget-object v1, v1, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr p3, v1

    iget-object p0, p0, Landroidx/cardview/widget/CardView$5;->IconCompatParcelizer:Landroidx/cardview/widget/CardView;

    iget-object p0, p0, Landroidx/cardview/widget/CardView;->IconCompatParcelizer:Landroid/graphics/Rect;

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p4, p0

    invoke-static {v0, p1, p2, p3, p4}, Landroidx/cardview/widget/CardView;->IconCompatParcelizer(Landroidx/cardview/widget/CardView;IIII)V

    return-void
.end method
