###### Class androidx.appcompat.widget.ActionMenuView (androidx.appcompat.widget.ActionMenuView)
.class public Landroidx/appcompat/widget/ActionMenuView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "SourceFile"

# interfaces
.implements Lo/onRequestPermissionsResult$AudioAttributesCompatParcelizer;
.implements Lo/registerForActivityResult;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActionMenuView$write;,
        Landroidx/appcompat/widget/ActionMenuView$IconCompatParcelizer;,
        Landroidx/appcompat/widget/ActionMenuView$LayoutParams;,
        Landroidx/appcompat/widget/ActionMenuView$read;,
        Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/peekAvailableContext$AudioAttributesCompatParcelizer;

.field private AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:I

.field IconCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

.field private MediaBrowserCompatCustomActionResultReceiver:I

.field private MediaBrowserCompatItemReceiver:Landroid/content/Context;

.field private MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

.field private RatingCompat:Z

.field RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;

.field private read:Z

.field private write:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 79
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 83
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 84
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setBaselineAligned(Z)V

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42600000    # 56.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    .line 86
    iput v1, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplBaseParcelizer:I

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 87
    iput v0, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi26Parcelizer:I

    .line 88
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatItemReceiver:Landroid/content/Context;

    .line 89
    iput p2, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatCustomActionResultReceiver:I

    return-void
.end method

.method private static MediaBrowserCompatMediaItem()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;
    .registers 2

    .line 583
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-direct {v0}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>()V

    const/16 v1, 0x10

    .line 585
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    return-object v0
.end method

.method private read(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;
    .registers 3

    .line 591
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method private read(II)V
    .registers 34

    move-object/from16 v0, p0

    .line 181
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 182
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 183
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 185
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    .line 186
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    add-int/2addr v6, v7

    const/4 v7, -0x2

    move/from16 v8, p2

    .line 188
    invoke-static {v8, v6, v7}, Landroidx/appcompat/widget/ActionMenuView;->getChildMeasureSpec(III)I

    move-result v7

    add-int/2addr v4, v5

    sub-int/2addr v2, v4

    .line 194
    iget v4, v0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplBaseParcelizer:I

    div-int v5, v2, v4

    const/4 v8, 0x0

    if-nez v5, :cond_33

    .line 199
    invoke-virtual {v0, v2, v8}, Landroidx/appcompat/widget/ActionMenuView;->setMeasuredDimension(II)V

    return-void

    .line 203
    :cond_33
    rem-int v9, v2, v4

    div-int/2addr v9, v5

    add-int/2addr v4, v9

    .line 215
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    move v10, v8

    move v11, v10

    move v12, v11

    move v13, v12

    move v14, v13

    move/from16 v17, v14

    const-wide/16 v15, 0x0

    :goto_44
    if-ge v12, v9, :cond_c0

    .line 217
    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    move/from16 v18, v3

    .line 218
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v3

    move/from16 v19, v2

    const/16 v2, 0x8

    if-ne v3, v2, :cond_57

    goto :goto_b9

    .line 220
    :cond_57
    instance-of v2, v8, Landroidx/appcompat/view/menu/ActionMenuItemView;

    add-int/lit8 v14, v14, 0x1

    if-eqz v2, :cond_66

    .line 226
    iget v3, v0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi26Parcelizer:I

    move/from16 v20, v14

    const/4 v14, 0x0

    invoke-virtual {v8, v3, v14, v3, v14}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_69

    :cond_66
    move/from16 v20, v14

    const/4 v14, 0x0

    .line 229
    :goto_69
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 230
    iput-boolean v14, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->RemoteActionCompatParcelizer:Z

    .line 231
    iput v14, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->write:I

    .line 232
    iput v14, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    .line 233
    iput-boolean v14, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    .line 234
    iput v14, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 235
    iput v14, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eqz v2, :cond_88

    .line 236
    move-object v2, v8

    check-cast v2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/ActionMenuItemView;->read()Z

    move-result v2

    if-eqz v2, :cond_88

    const/4 v2, 0x1

    goto :goto_89

    :cond_88
    const/4 v2, 0x0

    :goto_89
    iput-boolean v2, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesImplApi21Parcelizer:Z

    .line 239
    iget-boolean v2, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    if-eqz v2, :cond_91

    const/4 v2, 0x1

    goto :goto_92

    :cond_91
    move v2, v5

    .line 241
    :goto_92
    invoke-static {v8, v4, v2, v7, v6}, Landroidx/appcompat/widget/ActionMenuView;->write(Landroid/view/View;IIII)I

    move-result v2

    .line 244
    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 245
    iget-boolean v14, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    if-eqz v14, :cond_a0

    add-int/lit8 v11, v11, 0x1

    .line 246
    :cond_a0
    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    if-eqz v3, :cond_a5

    const/4 v13, 0x1

    :cond_a5
    sub-int/2addr v5, v2

    .line 249
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    move/from16 v8, v17

    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    move-result v17

    const/4 v3, 0x1

    if-ne v2, v3, :cond_b7

    shl-int v2, v3, v12

    int-to-long v2, v2

    or-long/2addr v15, v2

    :cond_b7
    move/from16 v14, v20

    :goto_b9
    add-int/lit8 v12, v12, 0x1

    move/from16 v3, v18

    move/from16 v2, v19

    goto :goto_44

    :cond_c0
    move/from16 v19, v2

    move/from16 v18, v3

    move/from16 v8, v17

    const/4 v2, 0x2

    if-eqz v13, :cond_cd

    if-ne v14, v2, :cond_cd

    const/4 v3, 0x1

    goto :goto_ce

    :cond_cd
    const/4 v3, 0x0

    :goto_ce
    const/4 v6, 0x0

    :goto_cf
    const-wide/16 v20, 0x1

    if-lez v11, :cond_172

    if-lez v5, :cond_172

    const v12, 0x7fffffff

    move/from16 v24, v6

    const/4 v2, 0x0

    const/4 v6, 0x0

    const-wide/16 v22, 0x0

    :goto_de
    if-ge v2, v9, :cond_113

    .line 266
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v25

    .line 267
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v25

    move/from16 v26, v8

    move-object/from16 v8, v25

    check-cast v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move/from16 v25, v11

    .line 270
    iget-boolean v11, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    if-nez v11, :cond_f5

    goto :goto_10c

    .line 273
    :cond_f5
    iget v11, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    if-ge v11, v12, :cond_102

    .line 274
    iget v6, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    shl-long v11, v20, v2

    move-wide/from16 v22, v11

    move v12, v6

    const/4 v6, 0x1

    goto :goto_10c

    .line 277
    :cond_102
    iget v8, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    if-ne v8, v12, :cond_10c

    shl-long v27, v20, v2

    or-long v22, v22, v27

    add-int/lit8 v6, v6, 0x1

    :cond_10c
    :goto_10c
    add-int/lit8 v2, v2, 0x1

    move/from16 v11, v25

    move/from16 v8, v26

    goto :goto_de

    :cond_113
    move/from16 v26, v8

    move/from16 v25, v11

    or-long v15, v15, v22

    if-gt v6, v5, :cond_16c

    const/4 v2, 0x0

    :goto_11c
    if-ge v2, v9, :cond_164

    .line 292
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 293
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move/from16 v27, v1

    const/4 v11, 0x1

    shl-int v1, v11, v2

    move v11, v9

    move/from16 v28, v10

    int-to-long v9, v1

    and-long v20, v22, v9

    const-wide/16 v29, 0x0

    cmp-long v1, v20, v29

    if-nez v1, :cond_141

    .line 296
    iget v1, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    add-int/lit8 v6, v12, 0x1

    if-ne v1, v6, :cond_15c

    or-long/2addr v15, v9

    goto :goto_15c

    :cond_141
    if-eqz v3, :cond_152

    .line 300
    iget-boolean v1, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz v1, :cond_152

    const/4 v1, 0x1

    if-ne v5, v1, :cond_152

    .line 302
    iget v9, v0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi26Parcelizer:I

    add-int v10, v9, v4

    const/4 v1, 0x0

    invoke-virtual {v6, v10, v1, v9, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 304
    :cond_152
    iget v1, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    const/4 v6, 0x1

    add-int/2addr v1, v6

    iput v1, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    .line 305
    iput-boolean v6, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->RemoteActionCompatParcelizer:Z

    add-int/lit8 v5, v5, -0x1

    :cond_15c
    :goto_15c
    add-int/lit8 v2, v2, 0x1

    move v9, v11

    move/from16 v1, v27

    move/from16 v10, v28

    goto :goto_11c

    :cond_164
    move/from16 v11, v25

    move/from16 v8, v26

    const/4 v2, 0x2

    const/4 v6, 0x1

    goto/16 :goto_cf

    :cond_16c
    move/from16 v27, v1

    :goto_16e
    move v11, v9

    move/from16 v28, v10

    goto :goto_179

    :cond_172
    move/from16 v27, v1

    move/from16 v24, v6

    move/from16 v26, v8

    goto :goto_16e

    :goto_179
    const/4 v1, 0x1

    if-nez v13, :cond_180

    if-ne v14, v1, :cond_180

    move v2, v1

    goto :goto_181

    :cond_180
    const/4 v2, 0x0

    :goto_181
    if-lez v5, :cond_237

    const-wide/16 v8, 0x0

    cmp-long v3, v15, v8

    if-eqz v3, :cond_237

    sub-int/2addr v14, v1

    if-lt v5, v14, :cond_192

    if-nez v2, :cond_192

    move/from16 v8, v28

    if-le v8, v1, :cond_237

    .line 318
    :cond_192
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->bitCount(J)I

    move-result v1

    int-to-float v1, v1

    if-nez v2, :cond_1d2

    and-long v2, v15, v20

    const-wide/16 v8, 0x0

    cmp-long v2, v2, v8

    const/high16 v3, 0x3f000000    # 0.5f

    if-eqz v2, :cond_1b4

    const/4 v14, 0x0

    .line 323
    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 324
    iget-boolean v2, v2, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesImplApi21Parcelizer:Z

    if-nez v2, :cond_1b5

    sub-float/2addr v1, v3

    goto :goto_1b5

    :cond_1b4
    const/4 v14, 0x0

    :cond_1b5
    :goto_1b5
    add-int/lit8 v9, v11, -0x1

    const/4 v2, 0x1

    shl-int v6, v2, v9

    int-to-long v12, v6

    and-long/2addr v12, v15

    const-wide/16 v20, 0x0

    cmp-long v2, v12, v20

    if-eqz v2, :cond_1d3

    .line 327
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 328
    iget-boolean v2, v2, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesImplApi21Parcelizer:Z

    if-nez v2, :cond_1d3

    sub-float/2addr v1, v3

    goto :goto_1d3

    :cond_1d2
    const/4 v14, 0x0

    :cond_1d3
    :goto_1d3
    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_1dd

    mul-int/2addr v5, v4

    int-to-float v2, v5

    div-float/2addr v2, v1

    float-to-int v1, v2

    goto :goto_1de

    :cond_1dd
    move v1, v14

    :goto_1de
    move v2, v14

    move/from16 v3, v24

    :goto_1e1
    if-ge v2, v11, :cond_235

    const/4 v5, 0x1

    shl-int v6, v5, v2

    int-to-long v8, v6

    and-long/2addr v8, v15

    const-wide/16 v12, 0x0

    cmp-long v6, v8, v12

    if-eqz v6, :cond_230

    .line 338
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 339
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 340
    instance-of v6, v6, Landroidx/appcompat/view/menu/ActionMenuItemView;

    if-eqz v6, :cond_210

    .line 342
    iput v1, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->write:I

    .line 343
    iput-boolean v5, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->RemoteActionCompatParcelizer:Z

    if-nez v2, :cond_20c

    .line 344
    iget-boolean v3, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesImplApi21Parcelizer:Z

    if-nez v3, :cond_20c

    neg-int v3, v1

    const/4 v5, 0x2

    .line 347
    div-int/2addr v3, v5

    iput v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_20d

    :cond_20c
    const/4 v5, 0x2

    :goto_20d
    const/4 v3, 0x1

    const/4 v6, 0x1

    goto :goto_232

    :cond_210
    const/4 v5, 0x2

    .line 350
    iget-boolean v6, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    if-eqz v6, :cond_220

    .line 351
    iput v1, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->write:I

    const/4 v6, 0x1

    .line 352
    iput-boolean v6, v8, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->RemoteActionCompatParcelizer:Z

    neg-int v3, v1

    .line 353
    div-int/2addr v3, v5

    iput v3, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v3, v6

    goto :goto_232

    :cond_220
    const/4 v6, 0x1

    if-eqz v2, :cond_227

    .line 360
    div-int/lit8 v9, v1, 0x2

    iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :cond_227
    add-int/lit8 v9, v11, -0x1

    if-eq v2, v9, :cond_232

    .line 363
    div-int/lit8 v9, v1, 0x2

    iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_232

    :cond_230
    move v6, v5

    const/4 v5, 0x2

    :cond_232
    :goto_232
    add-int/lit8 v2, v2, 0x1

    goto :goto_1e1

    :cond_235
    move v6, v3

    goto :goto_23a

    :cond_237
    const/4 v14, 0x0

    move/from16 v6, v24

    :goto_23a
    const/high16 v1, 0x40000000    # 2.0f

    if-eqz v6, :cond_25f

    move v8, v14

    :goto_23f
    if-ge v8, v11, :cond_25f

    .line 374
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 375
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 377
    iget-boolean v5, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->RemoteActionCompatParcelizer:Z

    if-eqz v5, :cond_25c

    .line 379
    iget v5, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    iget v3, v3, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->write:I

    mul-int/2addr v5, v4

    add-int/2addr v5, v3

    .line 380
    invoke-static {v5, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v2, v3, v7}, Landroid/view/View;->measure(II)V

    :cond_25c
    add-int/lit8 v8, v8, 0x1

    goto :goto_23f

    :cond_25f
    move/from16 v2, v27

    if-ne v2, v1, :cond_268

    move/from16 v3, v18

    move/from16 v2, v19

    goto :goto_26c

    :cond_268
    move/from16 v2, v19

    move/from16 v3, v26

    .line 389
    :goto_26c
    invoke-virtual {v0, v2, v3}, Landroidx/appcompat/widget/ActionMenuView;->setMeasuredDimension(II)V

    return-void
.end method

.method private read(I)Z
    .registers 5

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    add-int/lit8 v1, p1, -0x1

    .line 736
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 737
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 739
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    if-ge p1, p0, :cond_1e

    instance-of p0, v1, Landroidx/appcompat/widget/ActionMenuView$write;

    if-eqz p0, :cond_1e

    .line 740
    check-cast v1, Landroidx/appcompat/widget/ActionMenuView$write;

    invoke-interface {v1}, Landroidx/appcompat/widget/ActionMenuView$write;->RemoteActionCompatParcelizer()Z

    move-result v0

    :cond_1e
    if-lez p1, :cond_2c

    .line 742
    instance-of p0, v2, Landroidx/appcompat/widget/ActionMenuView$write;

    if-eqz p0, :cond_2c

    .line 743
    check-cast v2, Landroidx/appcompat/widget/ActionMenuView$write;

    invoke-interface {v2}, Landroidx/appcompat/widget/ActionMenuView$write;->AudioAttributesCompatParcelizer()Z

    move-result p0

    or-int/2addr p0, v0

    return p0

    :cond_2c
    return v0
.end method

.method private static write(Landroid/view/View;IIII)I
    .registers 10

    .line 407
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 409
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 411
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p3

    sub-int/2addr v1, p4

    .line 412
    invoke-static {v1, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    .line 414
    instance-of p4, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    if-eqz p4, :cond_1b

    .line 415
    move-object p4, p0

    check-cast p4, Landroidx/appcompat/view/menu/ActionMenuItemView;

    goto :goto_1c

    :cond_1b
    const/4 p4, 0x0

    :goto_1c
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p4, :cond_28

    .line 416
    invoke-virtual {p4}, Landroidx/appcompat/view/menu/ActionMenuItemView;->read()Z

    move-result p4

    if-eqz p4, :cond_28

    move p4, v2

    goto :goto_29

    :cond_28
    move p4, v1

    :goto_29
    if-lez p2, :cond_4c

    const/4 v3, 0x2

    if-eqz p4, :cond_30

    if-lt p2, v3, :cond_4c

    :cond_30
    mul-int/2addr p2, p1

    const/high16 v4, -0x80000000

    .line 420
    invoke-static {p2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 422
    invoke-virtual {p0, p2, p3}, Landroid/view/View;->measure(II)V

    .line 424
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    .line 425
    div-int v4, p2, p1

    .line 426
    rem-int/2addr p2, p1

    if-eqz p2, :cond_45

    add-int/lit8 v4, v4, 0x1

    :cond_45
    if-eqz p4, :cond_4a

    if-ge v4, v3, :cond_4a

    goto :goto_4d

    :cond_4a
    move v3, v4

    goto :goto_4d

    :cond_4c
    move v3, v1

    .line 430
    :goto_4d
    iget-boolean p2, v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    if-nez p2, :cond_55

    if-nez p4, :cond_54

    goto :goto_55

    :cond_54
    move v1, v2

    .line 431
    :cond_55
    :goto_55
    iput-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->AudioAttributesCompatParcelizer:Z

    .line 433
    iput v3, v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->IconCompatParcelizer:I

    mul-int/2addr p1, v3

    const/high16 p2, 0x40000000    # 2.0f

    .line 435
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-virtual {p0, p1, p3}, Landroid/view/View;->measure(II)V

    return v3
.end method

.method public static write()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;
    .registers 2

    .line 616
    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object v0

    const/4 v1, 0x1

    .line 617
    iput-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    return-object v0
.end method

.method protected static write(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;
    .registers 2

    if-eqz p0, :cond_1c

    .line 597
    instance-of v0, p0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    if-eqz v0, :cond_e

    .line 598
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    check-cast p0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>(Landroidx/appcompat/widget/ActionMenuView$LayoutParams;)V

    goto :goto_13

    .line 599
    :cond_e
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 600
    :goto_13
    iget p0, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gtz p0, :cond_1b

    const/16 p0, 0x10

    .line 601
    iput p0, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    :cond_1b
    return-object v0

    .line 605
    :cond_1c
    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Z
    .registers 1

    .line 700
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->write()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 1

    .line 691
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatSearchResultReceiver()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Lo/onRequestPermissionsResult;
    .registers 1

    .line 682
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Z
    .registers 1

    .line 572
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionMenuView;->RatingCompat:Z

    return p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Z
    .registers 1

    .line 716
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatItemReceiver()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaBrowserCompatItemReceiver()Z
    .registers 1

    .line 710
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer()Z

    move-result p0

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method protected synthetic RemoteActionCompatParcelizer(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    .registers 2

    .line 50
    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuView;->write(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 1

    .line 723
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p0, :cond_7

    .line 724
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->RemoteActionCompatParcelizer()Z

    :cond_7
    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/onRequestPermissionsResult;)V
    .registers 2

    .line 639
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/onRetainNonConfigurationInstance;)Z
    .registers 3

    .line 625
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/onRequestPermissionsResult;->IconCompatParcelizer(Landroid/view/MenuItem;I)Z

    move-result p0

    return p0
.end method

.method protected synthetic b_()Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    .registers 1

    .line 50
    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .registers 2

    .line 610
    instance-of p0, p1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    return p0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .registers 1

    .line 50
    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem()Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 50
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->read(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .registers 2

    .line 50
    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuView;->write(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    .line 131
    invoke-super {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 133
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p1, :cond_1d

    const/4 v0, 0x0

    .line 134
    invoke-virtual {p1, v0}, Lo/onConfigurationChanged;->AudioAttributesCompatParcelizer(Z)V

    .line 136
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->AudioAttributesImplBaseParcelizer()Z

    move-result p1

    if-eqz p1, :cond_1d

    .line 137
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->write()Z

    .line 138
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatSearchResultReceiver()Z

    :cond_1d
    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 1

    .line 544
    invoke-super {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->onDetachedFromWindow()V

    .line 545
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 23

    move-object/from16 v0, p0

    .line 442
    iget-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView;->read:Z

    if-nez v1, :cond_a

    .line 443
    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V

    return-void

    .line 447
    :cond_a
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int v2, p5, p3

    .line 448
    div-int/lit8 v2, v2, 0x2

    .line 449
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->RatingCompat()I

    move-result v3

    sub-int v4, p4, p2

    .line 452
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    sub-int v5, v4, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    sub-int/2addr v5, v6

    .line 454
    invoke-static/range {p0 .. p0}, Lo/setChecked;->AudioAttributesCompatParcelizer(Landroid/view/View;)Z

    move-result v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_2a
    const/16 v11, 0x8

    const/4 v12, 0x1

    if-ge v8, v1, :cond_8c

    .line 456
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 457
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    if-eq v14, v11, :cond_89

    .line 461
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 462
    iget-boolean v14, v11, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    if-eqz v14, :cond_79

    .line 463
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 464
    invoke-direct {v0, v8}, Landroidx/appcompat/widget/ActionMenuView;->read(I)Z

    move-result v14

    if-eqz v14, :cond_4e

    add-int/2addr v9, v3

    .line 467
    :cond_4e
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    if-eqz v6, :cond_5e

    .line 471
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v15

    iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v15, v11

    add-int v11, v15, v9

    goto :goto_6e

    .line 474
    :cond_5e
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v16

    sub-int v15, v15, v16

    iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int v11, v15, v11

    sub-int v15, v11, v9

    .line 477
    :goto_6e
    div-int/lit8 v16, v14, 0x2

    sub-int v7, v2, v16

    add-int/2addr v14, v7

    .line 479
    invoke-virtual {v13, v15, v7, v11, v14}, Landroid/view/View;->layout(IIII)V

    sub-int/2addr v5, v9

    move v9, v12

    goto :goto_89

    .line 484
    :cond_79
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    iget v12, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v7, v12

    iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v7, v11

    sub-int/2addr v5, v7

    .line 486
    invoke-direct {v0, v8}, Landroidx/appcompat/widget/ActionMenuView;->read(I)Z

    add-int/lit8 v10, v10, 0x1

    :cond_89
    :goto_89
    add-int/lit8 v8, v8, 0x1

    goto :goto_2a

    :cond_8c
    if-ne v1, v12, :cond_ab

    if-nez v9, :cond_ab

    const/4 v3, 0x0

    .line 494
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 495
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 496
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 497
    div-int/lit8 v4, v4, 0x2

    .line 498
    div-int/lit8 v5, v1, 0x2

    sub-int/2addr v4, v5

    .line 499
    div-int/lit8 v5, v3, 0x2

    sub-int/2addr v2, v5

    add-int/2addr v1, v4

    add-int/2addr v3, v2

    .line 500
    invoke-virtual {v0, v4, v2, v1, v3}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_ab
    xor-int/lit8 v3, v9, 0x1

    sub-int/2addr v10, v3

    if-lez v10, :cond_b3

    .line 505
    div-int v3, v5, v10

    goto :goto_b4

    :cond_b3
    const/4 v3, 0x0

    :goto_b4
    const/4 v4, 0x0

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-eqz v6, :cond_f9

    .line 508
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    move v7, v4

    :goto_c5
    if-ge v7, v1, :cond_132

    .line 510
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 511
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 512
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eq v8, v11, :cond_f6

    iget-boolean v8, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    if-eqz v8, :cond_dc

    goto :goto_f6

    .line 516
    :cond_dc
    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v5, v8

    .line 517
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    .line 518
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    .line 519
    div-int/lit8 v10, v9, 0x2

    sub-int v10, v2, v10

    sub-int v12, v5, v8

    add-int/2addr v9, v10

    .line 520
    invoke-virtual {v4, v12, v10, v5, v9}, Landroid/view/View;->layout(IIII)V

    .line 521
    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v8, v4

    add-int/2addr v8, v3

    sub-int/2addr v5, v8

    :cond_f6
    :goto_f6
    add-int/lit8 v7, v7, 0x1

    goto :goto_c5

    .line 524
    :cond_f9
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    move v7, v4

    :goto_fe
    if-ge v7, v1, :cond_132

    .line 526
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 527
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 528
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eq v8, v11, :cond_12f

    iget-boolean v8, v6, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    if-eqz v8, :cond_115

    goto :goto_12f

    .line 532
    :cond_115
    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v5, v8

    .line 533
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    .line 534
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    .line 535
    div-int/lit8 v10, v9, 0x2

    sub-int v10, v2, v10

    add-int v12, v5, v8

    add-int/2addr v9, v10

    .line 536
    invoke-virtual {v4, v5, v10, v12, v9}, Landroid/view/View;->layout(IIII)V

    .line 537
    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v8, v4

    add-int/2addr v8, v3

    add-int/2addr v5, v8

    :cond_12f
    :goto_12f
    add-int/lit8 v7, v7, 0x1

    goto :goto_fe

    :cond_132
    return-void
.end method

.method protected onMeasure(II)V
    .registers 8

    .line 150
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuView;->read:Z

    .line 151
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_e

    move v1, v3

    goto :goto_f

    :cond_e
    move v1, v4

    :goto_f
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionMenuView;->read:Z

    if-eq v0, v1, :cond_15

    .line 154
    iput v4, p0, Landroidx/appcompat/widget/ActionMenuView;->write:I

    .line 159
    :cond_15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 160
    iget-boolean v1, p0, Landroidx/appcompat/widget/ActionMenuView;->read:Z

    if-eqz v1, :cond_2a

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

    if-eqz v1, :cond_2a

    iget v2, p0, Landroidx/appcompat/widget/ActionMenuView;->write:I

    if-eq v0, v2, :cond_2a

    .line 161
    iput v0, p0, Landroidx/appcompat/widget/ActionMenuView;->write:I

    .line 162
    invoke-virtual {v1, v3}, Lo/onRequestPermissionsResult;->read(Z)V

    .line 165
    :cond_2a
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 166
    iget-boolean v1, p0, Landroidx/appcompat/widget/ActionMenuView;->read:Z

    if-eqz v1, :cond_38

    if-lez v0, :cond_38

    .line 167
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->read(II)V

    return-void

    :cond_38
    move v1, v4

    :goto_39
    if-ge v1, v0, :cond_4c

    .line 171
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 172
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    .line 173
    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_39

    .line 175
    :cond_4c
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    return-void
.end method

.method public final read()Landroid/view/Menu;
    .registers 4

    .line 651
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

    if-nez v0, :cond_3d

    .line 652
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 653
    new-instance v1, Lo/onRequestPermissionsResult;

    invoke-direct {v1, v0}, Lo/onRequestPermissionsResult;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

    .line 654
    new-instance v2, Landroidx/appcompat/widget/ActionMenuView$read;

    invoke-direct {v2, p0}, Landroidx/appcompat/widget/ActionMenuView$read;-><init>(Landroidx/appcompat/widget/ActionMenuView;)V

    invoke-virtual {v1, v2}, Lo/onRequestPermissionsResult;->IconCompatParcelizer(Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;)V

    .line 655
    new-instance v1, Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/ActionMenuPresenter;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 656
    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionMenuPresenter;->MediaBrowserCompatMediaItem()V

    .line 657
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesCompatParcelizer:Lo/peekAvailableContext$AudioAttributesCompatParcelizer;

    if-nez v1, :cond_2c

    .line 658
    new-instance v1, Landroidx/appcompat/widget/ActionMenuView$IconCompatParcelizer;

    invoke-direct {v1}, Landroidx/appcompat/widget/ActionMenuView$IconCompatParcelizer;-><init>()V

    .line 657
    :cond_2c
    invoke-virtual {v0, v1}, Lo/onConfigurationChanged;->read(Lo/peekAvailableContext$AudioAttributesCompatParcelizer;)V

    .line 659
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v2, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatItemReceiver:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lo/onRequestPermissionsResult;->write(Lo/peekAvailableContext;Landroid/content/Context;)V

    .line 660
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer(Landroidx/appcompat/widget/ActionMenuView;)V

    .line 663
    :cond_3d
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesImplApi21Parcelizer:Lo/onRequestPermissionsResult;

    return-object p0
.end method

.method public setExpandedActionViewsExclusive(Z)V
    .registers 2

    .line 756
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->RemoteActionCompatParcelizer(Z)V

    return-void
.end method

.method public setMenuCallbacks(Lo/peekAvailableContext$AudioAttributesCompatParcelizer;Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 672
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->AudioAttributesCompatParcelizer:Lo/peekAvailableContext$AudioAttributesCompatParcelizer;

    .line 673
    iput-object p2, p0, Landroidx/appcompat/widget/ActionMenuView;->IconCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

    return-void
.end method

.method public setOnMenuItemClickListener(Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;)V
    .registers 2

    .line 144
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;

    return-void
.end method

.method public setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    .line 554
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->read()Landroid/view/Menu;

    .line 555
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setOverflowReserved(Z)V
    .registers 2

    .line 578
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionMenuView;->RatingCompat:Z

    return-void
.end method

.method public setPopupTheme(I)V
    .registers 4

    .line 100
    iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatCustomActionResultReceiver:I

    if-eq v0, p1, :cond_1a

    .line 101
    iput p1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatCustomActionResultReceiver:I

    if-nez p1, :cond_f

    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatItemReceiver:Landroid/content/Context;

    return-void

    .line 105
    :cond_f
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatItemReceiver:Landroid/content/Context;

    :cond_1a
    return-void
.end method

.method public setPresenter(Landroidx/appcompat/widget/ActionMenuPresenter;)V
    .registers 2

    .line 125
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->MediaBrowserCompatMediaItem:Landroidx/appcompat/widget/ActionMenuPresenter;

    .line 126
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/ActionMenuPresenter;->IconCompatParcelizer(Landroidx/appcompat/widget/ActionMenuView;)V

    return-void
.end method

.method public synthetic write(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    .registers 2

    .line 50
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->read(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionMenuView$LayoutParams;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.appcompat.widget.ActionMenuView.IconCompatParcelizer (androidx.appcompat.widget.ActionMenuView$IconCompatParcelizer)
.class final Landroidx/appcompat/widget/ActionMenuView$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/peekAvailableContext$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 793
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/onRequestPermissionsResult;Z)V
    .registers 3

    return-void
.end method

.method public final read(Lo/onRequestPermissionsResult;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.appcompat.widget.ActionMenuView.LayoutParams (androidx.appcompat.widget.ActionMenuView$LayoutParams)
.class public Landroidx/appcompat/widget/ActionMenuView$LayoutParams;
.super Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field public AudioAttributesCompatParcelizer:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public AudioAttributesImplApi21Parcelizer:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public IconCompatParcelizer:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field RemoteActionCompatParcelizer:Z

.field public read:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public write:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, -0x2

    .line 846
    invoke-direct {p0, v0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 847
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 833
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .registers 2

    .line 837
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/ActionMenuView$LayoutParams;)V
    .registers 2

    .line 841
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 842
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionMenuView$LayoutParams;->read:Z

    return-void
.end method

###### Class androidx.appcompat.widget.ActionMenuView.RemoteActionCompatParcelizer (androidx.appcompat.widget.ActionMenuView$RemoteActionCompatParcelizer)
.class public interface abstract Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation


# virtual methods
.method public abstract write(Landroid/view/MenuItem;)Z
.end method

###### Class androidx.appcompat.widget.ActionMenuView.read (androidx.appcompat.widget.ActionMenuView$read)
.class final Landroidx/appcompat/widget/ActionMenuView$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/ActionMenuView;)V
    .registers 2

    .line 775
    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView$read;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Lo/onRequestPermissionsResult;)V
    .registers 3

    .line 786
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView$read;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->IconCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

    if-eqz v0, :cond_d

    .line 787
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView$read;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->IconCompatParcelizer:Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1}, Lo/onRequestPermissionsResult$RemoteActionCompatParcelizer;->read(Lo/onRequestPermissionsResult;)V

    :cond_d
    return-void
.end method

.method public final write(Lo/onRequestPermissionsResult;Landroid/view/MenuItem;)Z
    .registers 3

    .line 780
    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView$read;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;

    if-eqz p1, :cond_12

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView$read;->AudioAttributesCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView;

    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->RemoteActionCompatParcelizer:Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;

    .line 781
    invoke-interface {p0, p2}, Landroidx/appcompat/widget/ActionMenuView$RemoteActionCompatParcelizer;->write(Landroid/view/MenuItem;)Z

    move-result p0

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.appcompat.widget.ActionMenuView.write (androidx.appcompat.widget.ActionMenuView$write)
.class public interface abstract Landroidx/appcompat/widget/ActionMenuView$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActionMenuView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer()Z
.end method

.method public abstract RemoteActionCompatParcelizer()Z
.end method
