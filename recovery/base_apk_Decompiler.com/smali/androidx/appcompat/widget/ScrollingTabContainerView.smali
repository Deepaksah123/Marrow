###### Class androidx.appcompat.widget.ScrollingTabContainerView (androidx.appcompat.widget.ScrollingTabContainerView)
.class public Landroidx/appcompat/widget/ScrollingTabContainerView;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ScrollingTabContainerView$write;,
        Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;,
        Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;
    }
.end annotation


# instance fields
.field protected final AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;

.field private AudioAttributesImplApi21Parcelizer:I

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

.field IconCompatParcelizer:Ljava/lang/Runnable;

.field private MediaBrowserCompatCustomActionResultReceiver:I

.field private MediaBrowserCompatItemReceiver:Z

.field RemoteActionCompatParcelizer:I

.field read:Landroidx/appcompat/widget/LinearLayoutCompat;

.field protected write:Landroid/view/ViewPropertyAnimator;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 78
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 5

    .line 83
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 76
    new-instance v0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;-><init>(Landroidx/appcompat/widget/ScrollingTabContainerView;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;

    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 87
    invoke-static {p1}, Lo/getFullyDrawnReporter;->RemoteActionCompatParcelizer(Landroid/content/Context;)Lo/getFullyDrawnReporter;

    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lo/getFullyDrawnReporter;->IconCompatParcelizer()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->setContentHeight(I)V

    .line 89
    invoke-virtual {p1}, Lo/getFullyDrawnReporter;->write()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplApi26Parcelizer:I

    .line 91
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->IconCompatParcelizer()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 92
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(I)V
    .registers 3

    .line 261
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    .line 262
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->IconCompatParcelizer:Ljava/lang/Runnable;

    if-eqz v0, :cond_d

    .line 263
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 265
    :cond_d
    new-instance v0, Landroidx/appcompat/widget/ScrollingTabContainerView$5;

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/widget/ScrollingTabContainerView$5;-><init>(Landroidx/appcompat/widget/ScrollingTabContainerView;Landroid/view/View;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->IconCompatParcelizer:Ljava/lang/Runnable;

    .line 273
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private AudioAttributesCompatParcelizer()Z
    .registers 2

    .line 147
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method private IconCompatParcelizer()Landroidx/appcompat/widget/LinearLayoutCompat;
    .registers 4

    .line 205
    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const/4 v1, 0x0

    sget v2, Lo/_init_lambda5$read;->actionBarTabBarStyle:I

    invoke-direct {v0, p0, v1, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p0, 0x1

    .line 207
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->setMeasureWithLargestChildEnabled(Z)V

    const/16 p0, 0x11

    .line 208
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    .line 209
    new-instance p0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {p0, v1, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private RemoteActionCompatParcelizer()Landroid/widget/Spinner;
    .registers 5

    .line 215
    new-instance v0, Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lo/_init_lambda5$read;->actionDropDownStyle:I

    invoke-direct {v0, v1, v2, v3}, Landroidx/appcompat/widget/AppCompatSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 217
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 220
    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-object v0
.end method

.method private read()V
    .registers 5

    .line 155
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    .line 157
    :cond_7
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    if-nez v0, :cond_11

    .line 158
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer()Landroid/widget/Spinner;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    .line 160
    :cond_11
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 161
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    if-nez v0, :cond_34

    .line 164
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    new-instance v1, Landroidx/appcompat/widget/ScrollingTabContainerView$write;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/ScrollingTabContainerView$write;-><init>(Landroidx/appcompat/widget/ScrollingTabContainerView;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 166
    :cond_34
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->IconCompatParcelizer:Ljava/lang/Runnable;

    if-eqz v0, :cond_3e

    .line 167
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 168
    iput-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->IconCompatParcelizer:Ljava/lang/Runnable;

    .line 170
    :cond_3e
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    iget p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method

.method private write()Z
    .registers 6

    .line 174
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesCompatParcelizer()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return v1

    .line 176
    :cond_8
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 177
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x1

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 179
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->setTabSelected(I)V

    return v1
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(Landroidx/appcompat/app/ActionBar$write;)Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;
    .registers 5

    .line 294
    new-instance v0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;-><init>(Landroidx/appcompat/widget/ScrollingTabContainerView;Landroid/content/Context;Landroidx/appcompat/app/ActionBar$write;Z)V

    const/4 p1, 0x0

    .line 296
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 297
    new-instance p1, Landroid/widget/AbsListView$LayoutParams;

    const/4 v1, -0x1

    iget p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplApi21Parcelizer:I

    invoke-direct {p1, v1, p0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public onAttachedToWindow()V
    .registers 2

    .line 278
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    .line 279
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->IconCompatParcelizer:Ljava/lang/Runnable;

    if-eqz v0, :cond_a

    .line 281
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_a
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    .line 226
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 228
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lo/getFullyDrawnReporter;->RemoteActionCompatParcelizer(Landroid/content/Context;)Lo/getFullyDrawnReporter;

    move-result-object p1

    .line 231
    invoke-virtual {p1}, Lo/getFullyDrawnReporter;->IconCompatParcelizer()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->setContentHeight(I)V

    .line 232
    invoke-virtual {p1}, Lo/getFullyDrawnReporter;->write()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplApi26Parcelizer:I

    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 2

    .line 287
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V

    .line 288
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->IconCompatParcelizer:Ljava/lang/Runnable;

    if-eqz v0, :cond_a

    .line 289
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_a
    return-void
.end method

.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 372
    check-cast p2, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;

    .line 373
    invoke-virtual {p2}, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Landroidx/appcompat/app/ActionBar$write;

    return-void
.end method

.method public onMeasure(II)V
    .registers 8

    .line 98
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    if-ne p2, v2, :cond_c

    move v3, v0

    goto :goto_d

    :cond_c
    move v3, v1

    .line 100
    :goto_d
    invoke-virtual {p0, v3}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    .line 102
    iget-object v4, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-le v4, v0, :cond_40

    if-eq p2, v2, :cond_1e

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_40

    :cond_1e
    const/4 p2, 0x2

    if-le v4, p2, :cond_2e

    .line 106
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    int-to-float p2, p2

    const v0, 0x3ecccccd    # 0.4f

    mul-float/2addr p2, v0

    float-to-int p2, p2

    iput p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer:I

    goto :goto_35

    .line 108
    :cond_2e
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    div-int/2addr v0, p2

    iput v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer:I

    .line 110
    :goto_35
    iget p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer:I

    iget v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplApi26Parcelizer:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer:I

    goto :goto_43

    :cond_40
    const/4 p2, -0x1

    .line 112
    iput p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer:I

    .line 115
    :goto_43
    iget p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplApi21Parcelizer:I

    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    if-nez v3, :cond_68

    .line 117
    iget-boolean v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->MediaBrowserCompatItemReceiver:Z

    if-eqz v0, :cond_68

    .line 121
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0, v1, p2}, Landroid/view/View;->measure(II)V

    .line 122
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    if-le v0, v1, :cond_64

    .line 123
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->read()V

    goto :goto_6b

    .line 125
    :cond_64
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->write()Z

    goto :goto_6b

    .line 128
    :cond_68
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->write()Z

    .line 131
    :goto_6b
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 132
    invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->onMeasure(II)V

    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    if-eqz v3, :cond_7f

    if-eq v0, p1, :cond_7f

    .line 137
    iget p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ScrollingTabContainerView;->setTabSelected(I)V

    :cond_7f
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method public setAllowCollapse(Z)V
    .registers 2

    .line 151
    iput-boolean p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->MediaBrowserCompatItemReceiver:Z

    return-void
.end method

.method public setContentHeight(I)V
    .registers 2

    .line 200
    iput p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplApi21Parcelizer:I

    .line 201
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTabSelected(I)V
    .registers 7

    .line 184
    iput p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 185
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_a
    if-ge v2, v0, :cond_22

    .line 187
    iget-object v3, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-ne v2, p1, :cond_16

    const/4 v4, 0x1

    goto :goto_17

    :cond_16
    move v4, v1

    .line 189
    :goto_17
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    if-eqz v4, :cond_1f

    .line 191
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesCompatParcelizer(I)V

    :cond_1f
    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    .line 194
    :cond_22
    iget-object p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesImplBaseParcelizer:Landroid/widget/Spinner;

    if-eqz p0, :cond_2b

    if-ltz p1, :cond_2b

    .line 195
    invoke-virtual {p0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    :cond_2b
    return-void
.end method

###### Class androidx.appcompat.widget.ScrollingTabContainerView.AnonymousClass5 (androidx.appcompat.widget.ScrollingTabContainerView$5)
.class final Landroidx/appcompat/widget/ScrollingTabContainerView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesCompatParcelizer(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

.field final synthetic RemoteActionCompatParcelizer:Landroid/view/View;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ScrollingTabContainerView;Landroid/view/View;)V
    .registers 3

    .line 265
    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iput-object p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$5;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 268
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$5;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$5;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    .line 269
    iget-object v2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    .line 270
    iget-object p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$5;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->IconCompatParcelizer:Ljava/lang/Runnable;

    return-void
.end method

###### Class androidx.appcompat.widget.ScrollingTabContainerView.AudioAttributesCompatParcelizer (androidx.appcompat.widget.ScrollingTabContainerView$AudioAttributesCompatParcelizer)
.class public final Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ScrollingTabContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private IconCompatParcelizer:Z

.field private RemoteActionCompatParcelizer:I

.field final synthetic write:Landroidx/appcompat/widget/ScrollingTabContainerView;


# direct methods
.method protected constructor <init>(Landroidx/appcompat/widget/ScrollingTabContainerView;)V
    .registers 2

    .line 572
    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->write:Landroidx/appcompat/widget/ScrollingTabContainerView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x0

    .line 573
    iput-boolean p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    .line 599
    iput-boolean p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    .line 591
    iget-boolean p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    if-eqz p1, :cond_5

    return-void

    .line 593
    :cond_5
    iget-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->write:Landroidx/appcompat/widget/ScrollingTabContainerView;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/widget/ScrollingTabContainerView;->write:Landroid/view/ViewPropertyAnimator;

    .line 594
    iget-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->write:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    .line 585
    iget-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->write:Landroidx/appcompat/widget/ScrollingTabContainerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 586
    iput-boolean v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method

###### Class androidx.appcompat.widget.ScrollingTabContainerView.RemoteActionCompatParcelizer (androidx.appcompat.widget.ScrollingTabContainerView$RemoteActionCompatParcelizer)
.class final Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ScrollingTabContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroid/view/View;

.field private IconCompatParcelizer:Landroid/widget/ImageView;

.field private MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/TextView;

.field private RemoteActionCompatParcelizer:Landroidx/appcompat/app/ActionBar$write;

.field final synthetic read:Landroidx/appcompat/widget/ScrollingTabContainerView;

.field private final write:[I


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ScrollingTabContainerView;Landroid/content/Context;Landroidx/appcompat/app/ActionBar$write;Z)V
    .registers 6

    .line 395
    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->read:Landroidx/appcompat/widget/ScrollingTabContainerView;

    .line 396
    sget p1, Lo/_init_lambda5$read;->actionBarTabStyle:I

    const/4 p4, 0x0

    invoke-direct {p0, p2, p4, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p1, 0x10100d4

    .line 382
    filled-new-array {p1}, [I

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->write:[I

    .line 397
    iput-object p3, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/app/ActionBar$write;

    .line 399
    sget p3, Lo/_init_lambda5$read;->actionBarTabStyle:I

    const/4 v0, 0x0

    invoke-static {p2, p4, p1, p3, v0}, Lo/setTitle;->read(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lo/setTitle;

    move-result-object p1

    .line 401
    invoke-virtual {p1, v0}, Lo/setTitle;->AudioAttributesImplApi26Parcelizer(I)Z

    move-result p2

    if-eqz p2, :cond_27

    .line 402
    invoke-virtual {p1, v0}, Lo/setTitle;->IconCompatParcelizer(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 404
    :cond_27
    invoke-virtual {p1}, Lo/setTitle;->write()V

    const p1, 0x800013

    .line 407
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 410
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 11

    .line 454
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/app/ActionBar$write;

    .line 455
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar$write;->AudioAttributesCompatParcelizer()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_31

    .line 457
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_1b

    if-eqz v0, :cond_18

    .line 459
    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 460
    :cond_18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 462
    :cond_1b
    iput-object v1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 463
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/TextView;

    if-eqz v0, :cond_24

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 464
    :cond_24
    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    if-eqz v0, :cond_30

    .line 465
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 466
    iget-object p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_30
    return-void

    .line 469
    :cond_31
    iget-object v1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/View;

    if-eqz v1, :cond_3a

    .line 470
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 471
    iput-object v3, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 474
    :cond_3a
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar$write;->RemoteActionCompatParcelizer()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 475
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar$write;->IconCompatParcelizer()Ljava/lang/CharSequence;

    move-result-object v4

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v7, -0x2

    if-eqz v1, :cond_6f

    .line 478
    iget-object v8, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    if-nez v8, :cond_64

    .line 479
    new-instance v8, Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v8, v9}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 480
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 482
    iput v5, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 483
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 484
    invoke-virtual {p0, v8, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 485
    iput-object v8, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    .line 487
    :cond_64
    iget-object v8, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    invoke-virtual {v8, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 488
    iget-object v1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_7b

    .line 489
    :cond_6f
    iget-object v1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    if-eqz v1, :cond_7b

    .line 490
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 491
    iget-object v1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 494
    :cond_7b
    :goto_7b
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_af

    .line 496
    iget-object v2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/TextView;

    if-nez v2, :cond_a4

    .line 497
    new-instance v2, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    sget v9, Lo/_init_lambda5$read;->actionBarTabTextStyle:I

    invoke-direct {v2, v8, v3, v9}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 499
    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 500
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 502
    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 503
    invoke-virtual {v2, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 504
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 505
    iput-object v2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/TextView;

    .line 507
    :cond_a4
    iget-object v2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 508
    iget-object v2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_bb

    .line 509
    :cond_af
    iget-object v4, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/TextView;

    if-eqz v4, :cond_bb

    .line 510
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 511
    iget-object v2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 514
    :cond_bb
    :goto_bb
    iget-object v2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/widget/ImageView;

    if-eqz v2, :cond_c6

    .line 515
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar$write;->write()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_c6
    if-eqz v1, :cond_cc

    .line 517
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar$write;->write()Ljava/lang/CharSequence;

    move-result-object v3

    :cond_cc
    invoke-static {p0, v3}, Lo/setItemInvoker;->AudioAttributesCompatParcelizer(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroidx/appcompat/app/ActionBar$write;)V
    .registers 2

    .line 414
    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/app/ActionBar$write;

    .line 415
    invoke-direct {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public final RemoteActionCompatParcelizer()Landroidx/appcompat/app/ActionBar$write;
    .registers 1

    .line 522
    iget-object p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/appcompat/app/ActionBar$write;

    return-object p0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 2

    .line 429
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 431
    const-string p0, "androidx.appcompat.app.ActionBar$Tab"

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 2

    .line 436
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 439
    const-string p0, "androidx.appcompat.app.ActionBar$Tab"

    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onMeasure(II)V
    .registers 4

    .line 444
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 447
    iget-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->read:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget p1, p1, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer:I

    if-lez p1, :cond_20

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->read:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget v0, v0, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer:I

    if-le p1, v0, :cond_20

    .line 448
    iget-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->read:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget p1, p1, Landroidx/appcompat/widget/ScrollingTabContainerView;->RemoteActionCompatParcelizer:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    :cond_20
    return-void
.end method

.method public final setSelected(Z)V
    .registers 3

    .line 420
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eq v0, p1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    .line 421
    :goto_9
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setSelected(Z)V

    if-eqz v0, :cond_14

    if-eqz p1, :cond_14

    const/4 p1, 0x4

    .line 423
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_14
    return-void
.end method

###### Class androidx.appcompat.widget.ScrollingTabContainerView.write (androidx.appcompat.widget.ScrollingTabContainerView$write)
.class final Landroidx/appcompat/widget/ScrollingTabContainerView$write;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ScrollingTabContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "write"
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ScrollingTabContainerView;)V
    .registers 2

    .line 527
    iput-object p1, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$write;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .registers 1

    .line 532
    iget-object p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$write;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget-object p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    return p0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .registers 2

    .line 537
    iget-object p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$write;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

    iget-object p0, p0, Landroidx/appcompat/widget/ScrollingTabContainerView;->read:Landroidx/appcompat/widget/LinearLayoutCompat;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Landroidx/appcompat/app/ActionBar$write;

    move-result-object p0

    return-object p0
.end method

.method public final getItemId(I)J
    .registers 2

    int-to-long p0, p1

    return-wide p0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 4

    if-nez p2, :cond_f

    .line 548
    iget-object p2, p0, Landroidx/appcompat/widget/ScrollingTabContainerView$write;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ScrollingTabContainerView;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ScrollingTabContainerView$write;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/app/ActionBar$write;

    invoke-virtual {p2, p0}, Landroidx/appcompat/widget/ScrollingTabContainerView;->AudioAttributesCompatParcelizer(Landroidx/appcompat/app/ActionBar$write;)Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0

    .line 550
    :cond_f
    move-object p3, p2

    check-cast p3, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ScrollingTabContainerView$write;->getItem(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/app/ActionBar$write;

    invoke-virtual {p3, p0}, Landroidx/appcompat/widget/ScrollingTabContainerView$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroidx/appcompat/app/ActionBar$write;)V

    return-object p2
.end method
