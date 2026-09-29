###### Class androidx.viewpager.widget.PagerTabStrip (androidx.viewpager.widget.PagerTabStrip)
.class public Landroidx/viewpager/widget/PagerTabStrip;
.super Landroidx/viewpager/widget/PagerTitleStrip;
.source "SourceFile"


# instance fields
.field private AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Z

.field private MediaBrowserCompatCustomActionResultReceiver:Z

.field private MediaBrowserCompatItemReceiver:I

.field private MediaBrowserCompatMediaItem:I

.field private MediaBrowserCompatSearchResultReceiver:F

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:I

.field private RatingCompat:F

.field private final handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Paint;

.field private onAddQueueItem:I

.field private onCommand:I

.field private onCustomAction:I

.field private final onFastForward:Landroid/graphics/Rect;

.field private onPlay:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 83
    invoke-direct {p0, p1, v0}, Landroidx/viewpager/widget/PagerTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 87
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 68
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Landroidx/viewpager/widget/PagerTabStrip;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Paint;

    .line 69
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->onFastForward:Landroid/graphics/Rect;

    const/16 v0, 0xff

    .line 71
    iput v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCustomAction:I

    const/4 v0, 0x0

    .line 73
    iput-boolean v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplBaseParcelizer:Z

    .line 74
    iput-boolean v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 89
    iget v1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesImplApi21Parcelizer:I

    iput v1, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaDescriptionCompat:I

    .line 90
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, p2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    .line 95
    iput v1, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatMediaItem:I

    const/high16 v1, 0x40c00000    # 6.0f

    mul-float/2addr v1, p2

    add-float/2addr v1, v2

    float-to-int v1, v1

    .line 96
    iput v1, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaMetadataCompat:I

    const/high16 v1, 0x42800000    # 64.0f

    mul-float/2addr v1, p2

    float-to-int v1, v1

    .line 97
    iput v1, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    const/high16 v1, 0x41800000    # 16.0f

    mul-float/2addr v1, p2

    add-float/2addr v1, v2

    float-to-int v1, v1

    .line 98
    iput v1, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    add-float v1, p2, v2

    float-to-int v1, v1

    .line 99
    iput v1, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatItemReceiver:I

    const/high16 v1, 0x42000000    # 32.0f

    mul-float/2addr p2, v1

    add-float/2addr p2, v2

    float-to-int p2, p2

    .line 100
    iput p2, p0, Landroidx/viewpager/widget/PagerTabStrip;->onAddQueueItem:I

    .line 101
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->onPlay:I

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0, p1, p2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 105
    invoke-virtual {p0}, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/PagerTitleStrip;->setTextSpacing(I)V

    .line 107
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 109
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 110
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->IconCompatParcelizer:Landroid/widget/TextView;

    new-instance v0, Landroidx/viewpager/widget/PagerTabStrip$1;

    invoke-direct {v0, p0}, Landroidx/viewpager/widget/PagerTabStrip$1;-><init>(Landroidx/viewpager/widget/PagerTabStrip;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 118
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->write:Landroid/widget/TextView;

    new-instance v0, Landroidx/viewpager/widget/PagerTabStrip$5;

    invoke-direct {v0, p0}, Landroidx/viewpager/widget/PagerTabStrip$5;-><init>(Landroidx/viewpager/widget/PagerTabStrip;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_a2

    .line 126
    iput-boolean p2, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplBaseParcelizer:Z

    :cond_a2
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .registers 19

    move-object/from16 v0, p0

    .line 265
    invoke-super/range {p0 .. p1}, Landroidx/viewpager/widget/PagerTitleStrip;->onDraw(Landroid/graphics/Canvas;)V

    .line 267
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 269
    iget-object v2, v0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    iget v3, v0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    .line 270
    iget-object v4, v0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    iget v5, v0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    .line 271
    iget v6, v0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatMediaItem:I

    .line 273
    iget-object v7, v0, Landroidx/viewpager/widget/PagerTabStrip;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Paint;

    iget v8, v0, Landroidx/viewpager/widget/PagerTabStrip;->onCustomAction:I

    shl-int/lit8 v8, v8, 0x18

    iget v9, v0, Landroidx/viewpager/widget/PagerTabStrip;->MediaDescriptionCompat:I

    const v10, 0xffffff

    and-int/2addr v9, v10

    or-int/2addr v8, v9

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    sub-int/2addr v2, v3

    int-to-float v12, v2

    sub-int v2, v1, v6

    int-to-float v13, v2

    add-int/2addr v4, v5

    int-to-float v14, v4

    int-to-float v6, v1

    .line 274
    iget-object v2, v0, Landroidx/viewpager/widget/PagerTabStrip;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Paint;

    move-object/from16 v11, p1

    move v15, v6

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 276
    iget-boolean v2, v0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v2, :cond_66

    .line 277
    iget-object v2, v0, Landroidx/viewpager/widget/PagerTabStrip;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Paint;

    iget v3, v0, Landroidx/viewpager/widget/PagerTabStrip;->MediaDescriptionCompat:I

    and-int/2addr v3, v10

    const/high16 v4, -0x1000000

    or-int/2addr v3, v4

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 278
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v3, v2

    iget v2, v0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatItemReceiver:I

    sub-int/2addr v1, v2

    int-to-float v4, v1

    .line 279
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v5, v1

    iget-object v7, v0, Landroidx/viewpager/widget/PagerTabStrip;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Paint;

    move-object/from16 v2, p1

    .line 278
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_66
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 6

    .line 228
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    .line 229
    iget-boolean v2, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v2, :cond_c

    return v1

    .line 235
    :cond_c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 236
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v3, 0x1

    if-eqz v0, :cond_71

    if-eq v0, v3, :cond_3b

    const/4 v1, 0x2

    if-ne v0, v1, :cond_77

    .line 245
    iget v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->RatingCompat:F

    sub-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Landroidx/viewpager/widget/PagerTabStrip;->onPlay:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_38

    iget v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatSearchResultReceiver:F

    sub-float/2addr p1, v0

    .line 246
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->onPlay:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_77

    .line 247
    :cond_38
    iput-boolean v3, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplApi26Parcelizer:Z

    goto :goto_77

    .line 252
    :cond_3b
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    iget v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    sub-int/2addr p1, v0

    int-to-float p1, p1

    cmpg-float p1, v2, p1

    if-gez p1, :cond_56

    .line 253
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result p0

    sub-int/2addr p0, v3

    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    goto :goto_77

    .line 254
    :cond_56
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result p1

    iget v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    add-int/2addr p1, v0

    int-to-float p1, p1

    cmpl-float p1, v2, p1

    if-lez p1, :cond_77

    .line 255
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result p0

    add-int/2addr p0, v3

    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    goto :goto_77

    .line 239
    :cond_71
    iput v2, p0, Landroidx/viewpager/widget/PagerTabStrip;->RatingCompat:F

    .line 240
    iput p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatSearchResultReceiver:F

    .line 241
    iput-boolean v1, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplApi26Parcelizer:Z

    :cond_77
    :goto_77
    return v3
.end method

.method final read(IFZ)V
    .registers 11

    .line 285
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->onFastForward:Landroid/graphics/Rect;

    .line 286
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 287
    iget-object v2, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    iget v3, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    .line 288
    iget-object v4, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    iget v5, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    .line 289
    iget v6, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatMediaItem:I

    sub-int v6, v1, v6

    sub-int/2addr v2, v3

    add-int/2addr v4, v5

    .line 291
    invoke-virtual {v0, v2, v6, v4, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 293
    invoke-super {p0, p1, p2, p3}, Landroidx/viewpager/widget/PagerTitleStrip;->read(IFZ)V

    const/high16 p1, 0x3f000000    # 0.5f

    sub-float/2addr p2, p1

    .line 294
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    mul-float/2addr p1, p2

    const/high16 p2, 0x437f0000    # 255.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCustomAction:I

    .line 296
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    iget p2, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    .line 297
    iget-object p3, p0, Landroidx/viewpager/widget/PagerTitleStrip;->RemoteActionCompatParcelizer:Landroid/widget/TextView;

    invoke-virtual {p3}, Landroid/view/View;->getRight()I

    move-result p3

    iget v2, p0, Landroidx/viewpager/widget/PagerTabStrip;->onCommand:I

    sub-int/2addr p1, p2

    add-int/2addr p3, v2

    .line 298
    invoke-virtual {v0, p1, v6, p3, v1}, Landroid/graphics/Rect;->union(IIII)V

    .line 300
    invoke-virtual {p0, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void
.end method

.method public setBackgroundColor(I)V
    .registers 3

    .line 184
    invoke-super {p0, p1}, Landroidx/viewpager/widget/PagerTitleStrip;->setBackgroundColor(I)V

    .line 185
    iget-boolean v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-nez v0, :cond_11

    const/high16 v0, -0x1000000

    and-int/2addr p1, v0

    if-nez p1, :cond_e

    const/4 p1, 0x1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    .line 186
    :goto_f
    iput-boolean p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplBaseParcelizer:Z

    :cond_11
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    .line 176
    invoke-super {p0, p1}, Landroidx/viewpager/widget/PagerTitleStrip;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 177
    iget-boolean v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-nez v0, :cond_e

    if-nez p1, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 178
    :goto_c
    iput-boolean p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplBaseParcelizer:Z

    :cond_e
    return-void
.end method

.method public setBackgroundResource(I)V
    .registers 3

    .line 192
    invoke-super {p0, p1}, Landroidx/viewpager/widget/PagerTitleStrip;->setBackgroundResource(I)V

    .line 193
    iget-boolean v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-nez v0, :cond_e

    if-nez p1, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    .line 194
    :goto_c
    iput-boolean p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplBaseParcelizer:Z

    :cond_e
    return-void
.end method

.method public setDrawFullUnderline(Z)V
    .registers 2

    .line 205
    iput-boolean p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->AudioAttributesImplBaseParcelizer:Z

    const/4 p1, 0x1

    .line 206
    iput-boolean p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 207
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setPadding(IIII)V
    .registers 6

    .line 160
    iget v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaMetadataCompat:I

    if-ge p4, v0, :cond_5

    move p4, v0

    .line 163
    :cond_5
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/viewpager/widget/PagerTitleStrip;->setPadding(IIII)V

    return-void
.end method

.method public setTabIndicatorColor(I)V
    .registers 3

    .line 136
    iput p1, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaDescriptionCompat:I

    .line 137
    iget-object v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->handleMediaPlayPauseIfPendingOnHandler:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 138
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTabIndicatorColorResource(I)V
    .registers 3

    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/_isNaN;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/PagerTabStrip;->setTabIndicatorColor(I)V

    return-void
.end method

.method public setTextSpacing(I)V
    .registers 3

    .line 168
    iget v0, p0, Landroidx/viewpager/widget/PagerTabStrip;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:I

    if-ge p1, v0, :cond_5

    move p1, v0

    .line 171
    :cond_5
    invoke-super {p0, p1}, Landroidx/viewpager/widget/PagerTitleStrip;->setTextSpacing(I)V

    return-void
.end method

.method final write()I
    .registers 2

    .line 223
    invoke-super {p0}, Landroidx/viewpager/widget/PagerTitleStrip;->write()I

    move-result v0

    iget p0, p0, Landroidx/viewpager/widget/PagerTabStrip;->onAddQueueItem:I

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

###### Class androidx.viewpager.widget.PagerTabStrip.AnonymousClass1 (androidx.viewpager.widget.PagerTabStrip$1)
.class final Landroidx/viewpager/widget/PagerTabStrip$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager/widget/PagerTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/viewpager/widget/PagerTabStrip;


# direct methods
.method constructor <init>(Landroidx/viewpager/widget/PagerTabStrip;)V
    .registers 2

    .line 110
    iput-object p1, p0, Landroidx/viewpager/widget/PagerTabStrip$1;->RemoteActionCompatParcelizer:Landroidx/viewpager/widget/PagerTabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 113
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTabStrip$1;->RemoteActionCompatParcelizer:Landroidx/viewpager/widget/PagerTabStrip;

    iget-object p1, p1, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object p0, p0, Landroidx/viewpager/widget/PagerTabStrip$1;->RemoteActionCompatParcelizer:Landroidx/viewpager/widget/PagerTabStrip;

    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

###### Class androidx.viewpager.widget.PagerTabStrip.AnonymousClass5 (androidx.viewpager.widget.PagerTabStrip$5)
.class final Landroidx/viewpager/widget/PagerTabStrip$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager/widget/PagerTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/PagerTabStrip;


# direct methods
.method constructor <init>(Landroidx/viewpager/widget/PagerTabStrip;)V
    .registers 2

    .line 118
    iput-object p1, p0, Landroidx/viewpager/widget/PagerTabStrip$5;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/PagerTabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    .line 121
    iget-object p1, p0, Landroidx/viewpager/widget/PagerTabStrip$5;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/PagerTabStrip;

    iget-object p1, p1, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    iget-object p0, p0, Landroidx/viewpager/widget/PagerTabStrip$5;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/PagerTabStrip;

    iget-object p0, p0, Landroidx/viewpager/widget/PagerTitleStrip;->AudioAttributesCompatParcelizer:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->write()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method
