###### Class androidx.appcompat.view.menu.ActionMenuItemView (androidx.appcompat.view.menu.ActionMenuItemView)
.class public Landroidx/appcompat/view/menu/ActionMenuItemView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"

# interfaces
.implements Lo/registerForActivityResult$AudioAttributesCompatParcelizer;
.implements Landroid/view/View$OnClickListener;
.implements Landroidx/appcompat/widget/ActionMenuView$write;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;,
        Landroidx/appcompat/view/menu/ActionMenuItemView$read;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private AudioAttributesImplApi21Parcelizer:I

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:I

.field private IconCompatParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/drawable/Drawable;

.field private MediaBrowserCompatItemReceiver:Lo/ActivityResult;

.field private MediaBrowserCompatSearchResultReceiver:Ljava/lang/CharSequence;

.field RemoteActionCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView$read;

.field read:Lo/onRetainNonConfigurationInstance;

.field write:Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    .line 72
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 74
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplApi26Parcelizer()Z

    move-result v1

    iput-boolean v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesCompatParcelizer:Z

    .line 75
    sget-object v1, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionMenuItemView:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 77
    sget p2, Lo/_init_lambda5$AudioAttributesImplApi26Parcelizer;->ActionMenuItemView_android_minWidth:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplApi21Parcelizer:I

    .line 79
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 81
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x42000000    # 32.0f

    mul-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    .line 82
    iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplApi26Parcelizer:I

    .line 84
    invoke-virtual {p0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, -0x1

    .line 86
    iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplBaseParcelizer:I

    .line 87
    invoke-virtual {p0, v2}, Landroid/view/View;->setSaveEnabled(Z)V

    return-void
.end method

.method private AudioAttributesImplApi26Parcelizer()Z
    .registers 5

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    .line 109
    iget v0, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 110
    iget v1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    const/16 v2, 0x1e0

    if-ge v0, v2, :cond_21

    const/16 v3, 0x280

    if-lt v0, v3, :cond_1a

    if-ge v1, v2, :cond_21

    .line 112
    :cond_1a
    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    if-eq p0, v0, :cond_21

    const/4 p0, 0x0

    return p0

    :cond_21
    const/4 p0, 0x1

    return p0
.end method

.method private MediaBrowserCompatCustomActionResultReceiver()V
    .registers 5

    .line 193
    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 194
    iget-object v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x1

    if-eqz v1, :cond_1e

    iget-object v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    .line 195
    invoke-virtual {v1}, Lo/onRetainNonConfigurationInstance;->MediaDescriptionCompat()Z

    move-result v1

    if-eqz v1, :cond_1c

    iget-boolean v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesCompatParcelizer:Z

    if-nez v1, :cond_1e

    iget-boolean v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->IconCompatParcelizer:Z

    if-eqz v1, :cond_1c

    goto :goto_1e

    :cond_1c
    const/4 v1, 0x0

    goto :goto_1f

    :cond_1e
    :goto_1e
    move v1, v2

    :goto_1f
    xor-int/2addr v0, v2

    and-int/2addr v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_27

    .line 197
    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/CharSequence;

    goto :goto_28

    :cond_27
    move-object v2, v1

    :goto_28
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v2}, Lo/onRetainNonConfigurationInstance;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v2

    .line 201
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_45

    if-eqz v0, :cond_3b

    move-object v2, v1

    goto :goto_41

    .line 204
    :cond_3b
    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v2}, Lo/onRetainNonConfigurationInstance;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    :goto_41
    invoke-virtual {p0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_48

    .line 206
    :cond_45
    invoke-virtual {p0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 209
    :goto_48
    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v2}, Lo/onRetainNonConfigurationInstance;->getTooltipText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 210
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_61

    if-eqz v0, :cond_57

    goto :goto_5d

    .line 212
    :cond_57
    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v0}, Lo/onRetainNonConfigurationInstance;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    :goto_5d
    invoke-static {p0, v1}, Lo/setItemInvoker;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void

    .line 214
    :cond_61
    invoke-static {p0, v2}, Lo/setItemInvoker;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/onRetainNonConfigurationInstance;)V
    .registers 3

    .line 129
    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    .line 131
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 132
    invoke-virtual {p1, p0}, Lo/onRetainNonConfigurationInstance;->IconCompatParcelizer(Lo/registerForActivityResult$AudioAttributesCompatParcelizer;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setTitle(Ljava/lang/CharSequence;)V

    .line 133
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->getItemId()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setId(I)V

    .line 135
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    goto :goto_21

    :cond_1f
    const/16 v0, 0x8

    :goto_21
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 136
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->isEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setEnabled(Z)V

    .line 137
    invoke-virtual {p1}, Lo/onRetainNonConfigurationInstance;->hasSubMenu()Z

    move-result p1

    if-eqz p1, :cond_3c

    .line 138
    iget-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatItemReceiver:Lo/ActivityResult;

    if-nez p1, :cond_3c

    .line 139
    new-instance p1, Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;

    invoke-direct {p1, p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;-><init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatItemReceiver:Lo/ActivityResult;

    :cond_3c
    return-void
.end method

.method public final AudioAttributesCompatParcelizer()Z
    .registers 2

    .line 264
    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->read()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object p0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {p0}, Lo/onRetainNonConfigurationInstance;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-nez p0, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public final IconCompatParcelizer()Lo/onRetainNonConfigurationInstance;
    .registers 1

    .line 124
    iget-object p0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 269
    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->read()Z

    move-result p0

    return p0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .registers 1

    .line 100
    const-class p0, Landroid/widget/Button;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public onClick(Landroid/view/View;)V
    .registers 2

    .line 155
    iget-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->write:Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;

    if-eqz p1, :cond_9

    .line 156
    iget-object p0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    invoke-interface {p1, p0}, Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;)Z

    :cond_9
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 2

    .line 92
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 94
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplApi26Parcelizer()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesCompatParcelizer:Z

    .line 95
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public onMeasure(II)V
    .registers 8

    .line 274
    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->read()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 275
    iget v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplBaseParcelizer:I

    if-ltz v1, :cond_19

    .line 276
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    .line 277
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    .line 276
    invoke-super {p0, v1, v2, v3, v4}, Landroidx/appcompat/widget/AppCompatTextView;->setPadding(IIII)V

    .line 280
    :cond_19
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->onMeasure(II)V

    .line 282
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 283
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 284
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    const/high16 v3, -0x80000000

    if-ne v1, v3, :cond_33

    .line 285
    iget v3, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplApi21Parcelizer:I

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_35

    .line 286
    :cond_33
    iget p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplApi21Parcelizer:I

    :goto_35
    const/high16 v3, 0x40000000    # 2.0f

    if-eq v1, v3, :cond_46

    .line 288
    iget v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplApi21Parcelizer:I

    if-lez v1, :cond_46

    if-ge v2, p1, :cond_46

    .line 290
    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->onMeasure(II)V

    :cond_46
    if-nez v0, :cond_6c

    .line 294
    iget-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_6c

    .line 297
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 298
    iget-object p2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    sub-int/2addr p1, p2

    .line 299
    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    invoke-super {p0, p1, p2, v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setPadding(IIII)V

    :cond_6c
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 2

    const/4 p1, 0x0

    .line 338
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    .line 146
    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    invoke-virtual {v0}, Lo/onRetainNonConfigurationInstance;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatItemReceiver:Lo/ActivityResult;

    if-eqz v0, :cond_14

    .line 147
    invoke-virtual {v0, p0, p1}, Lo/ActivityResult;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 p0, 0x1

    return p0

    .line 150
    :cond_14
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public final read()Z
    .registers 1

    .line 242
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public setCheckable(Z)V
    .registers 2

    return-void
.end method

.method public setChecked(Z)V
    .registers 2

    return-void
.end method

.method public setExpandedFormat(Z)V
    .registers 3

    .line 184
    iget-boolean v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->IconCompatParcelizer:Z

    if-eq v0, p1, :cond_d

    .line 185
    iput-boolean p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->IconCompatParcelizer:Z

    .line 186
    iget-object p0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    if-eqz p0, :cond_d

    .line 187
    invoke-virtual {p0}, Lo/onRetainNonConfigurationInstance;->IconCompatParcelizer()V

    :cond_d
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 6

    .line 220
    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatCustomActionResultReceiver:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_25

    .line 222
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 223
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 224
    iget v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplApi26Parcelizer:I

    if-le v0, v2, :cond_17

    int-to-float v3, v2

    int-to-float v0, v0

    div-float/2addr v3, v0

    int-to-float v0, v1

    mul-float/2addr v0, v3

    float-to-int v1, v0

    move v0, v2

    :cond_17
    if-le v1, v2, :cond_20

    int-to-float v3, v2

    int-to-float v1, v1

    div-float/2addr v3, v1

    int-to-float v0, v0

    mul-float/2addr v0, v3

    float-to-int v0, v0

    goto :goto_21

    :cond_20
    move v2, v1

    :goto_21
    const/4 v1, 0x0

    .line 234
    invoke-virtual {p1, v1, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_25
    const/4 v0, 0x0

    .line 236
    invoke-virtual {p0, p1, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 238
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public setItemInvoker(Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;)V
    .registers 2

    .line 161
    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->write:Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;

    return-void
.end method

.method public setPadding(IIII)V
    .registers 5

    .line 118
    iput p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->AudioAttributesImplBaseParcelizer:I

    .line 119
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatTextView;->setPadding(IIII)V

    return-void
.end method

.method public setPopupCallback(Landroidx/appcompat/view/menu/ActionMenuItemView$read;)V
    .registers 2

    .line 165
    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->RemoteActionCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView$read;

    return-void
.end method

.method public setShortcut(ZC)V
    .registers 3

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .registers 2

    .line 252
    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/CharSequence;

    .line 254
    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public final write()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.appcompat.view.menu.ActionMenuItemView.IconCompatParcelizer (androidx.appcompat.view.menu.ActionMenuItemView$IconCompatParcelizer)
.class final Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;
.super Lo/ActivityResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/ActionMenuItemView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .registers 2

    .line 304
    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 305
    invoke-direct {p0, p1}, Lo/ActivityResult;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/removeOnContextAvailableListener;
    .registers 2

    .line 310
    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->RemoteActionCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView$read;

    if-eqz v0, :cond_f

    .line 311
    iget-object p0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object p0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;->RemoteActionCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView$read;

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$read;->IconCompatParcelizer()Lo/removeOnContextAvailableListener;

    move-result-object p0

    return-object p0

    :cond_f
    const/4 p0, 0x0

    return-object p0
.end method

.method public final read()Z
    .registers 3

    .line 319
    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->write:Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;

    if-eqz v0, :cond_22

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->write:Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;

    iget-object v1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v1, Landroidx/appcompat/view/menu/ActionMenuItemView;->read:Lo/onRetainNonConfigurationInstance;

    invoke-interface {v0, v1}, Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 320
    invoke-virtual {p0}, Lo/ActivityResult;->AudioAttributesCompatParcelizer()Lo/removeOnContextAvailableListener;

    move-result-object p0

    if-eqz p0, :cond_22

    .line 321
    invoke-interface {p0}, Lo/removeOnContextAvailableListener;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_22

    const/4 p0, 0x1

    return p0

    :cond_22
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.appcompat.view.menu.ActionMenuItemView.read (androidx.appcompat.view.menu.ActionMenuItemView$read)
.class public abstract Landroidx/appcompat/view/menu/ActionMenuItemView$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/ActionMenuItemView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "read"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract IconCompatParcelizer()Lo/removeOnContextAvailableListener;
.end method
