###### Class androidx.appcompat.widget.AlertDialogLayout (androidx.appcompat.widget.AlertDialogLayout)
.class public Landroidx/appcompat/widget/AlertDialogLayout;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 55
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 59
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private IconCompatParcelizer(II)Z
    .registers 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 75
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v4

    move-object v7, v6

    move v8, v5

    :goto_f
    const/16 v9, 0x8

    if-ge v8, v3, :cond_3d

    .line 77
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 78
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v11

    if-eq v11, v9, :cond_3a

    .line 82
    invoke-virtual {v10}, Landroid/view/View;->getId()I

    move-result v9

    .line 83
    sget v11, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->topPanel:I

    if-ne v9, v11, :cond_27

    move-object v4, v10

    goto :goto_3a

    .line 85
    :cond_27
    sget v11, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->buttonPanel:I

    if-ne v9, v11, :cond_2d

    move-object v6, v10

    goto :goto_3a

    .line 87
    :cond_2d
    sget v11, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->contentPanel:I

    if-eq v9, v11, :cond_36

    sget v11, Lo/_init_lambda5$AudioAttributesImplBaseParcelizer;->customPanel:I

    if-eq v9, v11, :cond_36

    return v5

    :cond_36
    if-eqz v7, :cond_39

    return v5

    :cond_39
    move-object v7, v10

    :cond_3a
    :goto_3a
    add-int/lit8 v8, v8, 0x1

    goto :goto_f

    .line 99
    :cond_3d
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v8

    .line 100
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v10

    .line 101
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    .line 104
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v13

    add-int/2addr v12, v13

    if-eqz v4, :cond_65

    .line 107
    invoke-virtual {v4, v1, v5}, Landroid/view/View;->measure(II)V

    .line 109
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    add-int/2addr v12, v13

    .line 110
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredState()I

    move-result v4

    invoke-static {v5, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    goto :goto_66

    :cond_65
    move v4, v5

    :goto_66
    if-eqz v6, :cond_7e

    .line 116
    invoke-virtual {v6, v1, v5}, Landroid/view/View;->measure(II)V

    .line 117
    invoke-static {v6}, Landroidx/appcompat/widget/AlertDialogLayout;->write(Landroid/view/View;)I

    move-result v13

    .line 118
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    sub-int/2addr v14, v13

    add-int/2addr v12, v13

    .line 121
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredState()I

    move-result v15

    invoke-static {v4, v15}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    goto :goto_80

    :cond_7e
    move v13, v5

    move v14, v13

    :goto_80
    if-eqz v7, :cond_a1

    if-nez v8, :cond_86

    move v15, v5

    goto :goto_90

    :cond_86
    sub-int v15, v10, v12

    .line 131
    invoke-static {v5, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    .line 130
    invoke-static {v15, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    .line 134
    :goto_90
    invoke-virtual {v7, v1, v15}, Landroid/view/View;->measure(II)V

    .line 135
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v15

    add-int/2addr v12, v15

    .line 138
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    goto :goto_a2

    :cond_a1
    const/4 v15, 0x0

    :goto_a2
    sub-int/2addr v10, v12

    const/high16 v5, 0x40000000    # 2.0f

    if-eqz v6, :cond_c6

    .line 149
    invoke-static {v10, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    if-lez v14, :cond_b0

    sub-int/2addr v10, v14

    add-int/2addr v14, v13

    goto :goto_b1

    :cond_b0
    move v14, v13

    .line 155
    :goto_b1
    invoke-static {v14, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 157
    invoke-virtual {v6, v1, v14}, Landroid/view/View;->measure(II)V

    sub-int/2addr v12, v13

    .line 159
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    add-int/2addr v12, v13

    .line 160
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredState()I

    move-result v6

    invoke-static {v4, v6}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    :cond_c6
    if-eqz v7, :cond_e0

    if-lez v10, :cond_e0

    add-int/2addr v10, v15

    .line 175
    invoke-static {v10, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 177
    invoke-virtual {v7, v1, v6}, Landroid/view/View;->measure(II)V

    sub-int/2addr v12, v15

    .line 179
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v12, v6

    .line 180
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I

    move-result v6

    invoke-static {v4, v6}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    :cond_e0
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_e2
    if-ge v6, v3, :cond_f9

    .line 186
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 187
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-eq v10, v9, :cond_f6

    .line 188
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    :cond_f6
    add-int/lit8 v6, v6, 0x1

    goto :goto_e2

    .line 192
    :cond_f9
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v8

    add-int/2addr v6, v8

    add-int/2addr v7, v6

    .line 194
    invoke-static {v7, v1, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    const/4 v4, 0x0

    .line 196
    invoke-static {v12, v2, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v4

    .line 198
    invoke-virtual {v0, v1, v4}, Landroidx/appcompat/widget/AlertDialogLayout;->setMeasuredDimension(II)V

    if-eq v11, v5, :cond_114

    .line 203
    invoke-direct {v0, v3, v2}, Landroidx/appcompat/widget/AlertDialogLayout;->read(II)V

    :cond_114
    const/4 v0, 0x1

    return v0
.end method

.method private read(II)V
    .registers 13

    .line 218
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    .line 217
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_b
    if-ge v1, p1, :cond_3a

    .line 221
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 222
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v4, 0x8

    if-eq v2, v4, :cond_37

    .line 223
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 224
    iget v2, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_37

    .line 227
    iget v9, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 228
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iput v2, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move v4, v0

    move v6, p2

    .line 231
    invoke-virtual/range {v2 .. v7}, Landroidx/appcompat/widget/AlertDialogLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 232
    iput v9, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_37
    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_3a
    return-void
.end method

.method private static write(Landroid/view/View;)I
    .registers 4

    .line 248
    invoke-static {p0}, Lo/InvalidTypeIdException;->RatingCompat(Landroid/view/View;)I

    move-result v0

    if-lez v0, :cond_7

    return v0

    .line 253
    :cond_7
    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_1e

    .line 254
    check-cast p0, Landroid/view/ViewGroup;

    .line 255
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1e

    .line 256
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/widget/AlertDialogLayout;->write(Landroid/view/View;)I

    move-result p0

    return p0

    :cond_1e
    return v1
.end method

.method private static write(Landroid/view/View;IIII)V
    .registers 5

    add-int/2addr p3, p1

    add-int/2addr p4, p2

    .line 348
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .registers 16

    .line 265
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    sub-int/2addr p4, p2

    .line 269
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    .line 272
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    .line 274
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 275
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    .line 276
    invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->MediaDescriptionCompat()I

    move-result v3

    and-int/lit8 v4, v3, 0x70

    const/16 v5, 0x10

    if-eq v4, v5, :cond_31

    const/16 v5, 0x50

    if-eq v4, v5, :cond_28

    .line 294
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    goto :goto_3b

    .line 284
    :cond_28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v4, p5

    sub-int/2addr v4, p3

    sub-int p3, v4, v1

    goto :goto_3b

    .line 289
    :cond_31
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr p5, p3

    sub-int/2addr p5, v1

    div-int/lit8 p5, p5, 0x2

    add-int p3, v4, p5

    .line 298
    :goto_3b
    invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->MediaBrowserCompatSearchResultReceiver()Landroid/graphics/drawable/Drawable;

    move-result-object p5

    const/4 v1, 0x0

    if-nez p5, :cond_44

    move p5, v1

    goto :goto_48

    .line 300
    :cond_44
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p5

    :goto_48
    if-ge v1, v2, :cond_a9

    .line 303
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_a6

    .line 304
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_a6

    .line 305
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 306
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    .line 309
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 311
    iget v8, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gez v8, :cond_6e

    const v8, 0x800007

    and-int/2addr v8, v3

    .line 315
    :cond_6e
    invoke-static {p0}, Lo/InvalidTypeIdException;->MediaBrowserCompatMediaItem(Landroid/view/View;)I

    move-result v9

    .line 316
    invoke-static {v8, v9}, Lo/_clearIfStdImpl;->write(II)I

    move-result v8

    and-int/lit8 v8, v8, 0x7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_88

    const/4 v9, 0x5

    if-eq v8, v9, :cond_82

    .line 332
    iget v8, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v8, p1

    goto :goto_95

    :cond_82
    sub-int v8, p4, p2

    sub-int/2addr v8, v5

    .line 327
    iget v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_94

    :cond_88
    sub-int v8, p4, p1

    sub-int/2addr v8, v0

    sub-int/2addr v8, v5

    .line 322
    div-int/lit8 v8, v8, 0x2

    add-int/2addr v8, p1

    iget v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v8, v9

    iget v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    :goto_94
    sub-int/2addr v8, v9

    .line 336
    :goto_95
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/AlertDialogLayout;->AudioAttributesCompatParcelizer(I)Z

    move-result v9

    if-eqz v9, :cond_9c

    add-int/2addr p3, p5

    .line 340
    :cond_9c
    iget v9, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p3, v9

    .line 341
    invoke-static {v4, v8, p3, v5, v6}, Landroidx/appcompat/widget/AlertDialogLayout;->write(Landroid/view/View;IIII)V

    .line 342
    iget v4, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v6, v4

    add-int/2addr p3, v6

    :cond_a6
    add-int/lit8 v1, v1, 0x1

    goto :goto_48

    :cond_a9
    return-void
.end method

.method protected onMeasure(II)V
    .registers 4

    .line 64
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AlertDialogLayout;->IconCompatParcelizer(II)Z

    move-result v0

    if-nez v0, :cond_9

    .line 66
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    :cond_9
    return-void
.end method
