###### Class androidx.media3.ui.WebViewSubtitleOutput (androidx.media3.ui.WebViewSubtitleOutput)
.class final Landroidx/media3/ui/WebViewSubtitleOutput;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/computeNext;

.field private AudioAttributesImplApi26Parcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/getDefaultImpl;",
            ">;"
        }
    .end annotation
.end field

.field private final AudioAttributesImplBaseParcelizer:Landroid/webkit/WebView;

.field private IconCompatParcelizer:F

.field private final RemoteActionCompatParcelizer:Landroidx/media3/ui/CanvasSubtitleOutput;

.field private read:I

.field private write:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 75
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/WebViewSubtitleOutput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 79
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 81
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplApi26Parcelizer:Ljava/util/List;

    .line 82
    sget-object v0, Lo/computeNext;->IconCompatParcelizer:Lo/computeNext;

    iput-object v0, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    const v0, 0x3d5a511a    # 0.0533f

    .line 83
    iput v0, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->write:F

    const/4 v0, 0x0

    .line 84
    iput v0, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->read:I

    const v1, 0x3da3d70a    # 0.08f

    .line 85
    iput v1, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->IconCompatParcelizer:F

    .line 87
    new-instance v1, Landroidx/media3/ui/CanvasSubtitleOutput;

    invoke-direct {v1, p1, p2}, Landroidx/media3/ui/CanvasSubtitleOutput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v1, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->RemoteActionCompatParcelizer:Landroidx/media3/ui/CanvasSubtitleOutput;

    .line 88
    new-instance v2, Landroidx/media3/ui/WebViewSubtitleOutput$1;

    invoke-direct {v2, p0, p1, p2}, Landroidx/media3/ui/WebViewSubtitleOutput$1;-><init>(Landroidx/media3/ui/WebViewSubtitleOutput;Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v2, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplBaseParcelizer:Landroid/webkit/WebView;

    .line 104
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 106
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 107
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(IF)Ljava/lang/String;
    .registers 7

    .line 360
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v1, v2

    sub-int/2addr v1, v3

    .line 359
    invoke-static {p1, p2, v0, v1}, Lo/PrivateMaxEntriesMapKeySet;->write(IFII)F

    move-result p1

    const p2, -0x800001

    cmpl-float p2, p1, p2

    if-nez p2, :cond_20

    .line 362
    const-string p0, "unset"

    return-object p0

    .line 364
    :cond_20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p1, p0

    .line 365
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%.2fpx"

    invoke-static {p1, p0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/text/Layout$Alignment;)Ljava/lang/String;
    .registers 3

    .line 403
    const-string v0, "center"

    if-nez p0, :cond_5

    return-object v0

    .line 406
    :cond_5
    sget-object v1, Landroidx/media3/ui/WebViewSubtitleOutput$4;->write:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_17

    const/4 v1, 0x2

    if-eq p0, v1, :cond_14

    return-object v0

    .line 410
    :cond_14
    const-string p0, "end"

    return-object p0

    .line 408
    :cond_17
    const-string p0, "start"

    return-object p0
.end method

.method private static IconCompatParcelizer(Lo/getDefaultImpl;)Ljava/lang/String;
    .registers 3

    .line 338
    iget v0, p0, Lo/getDefaultImpl;->MediaBrowserCompatItemReceiver:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_27

    .line 340
    iget v0, p0, Lo/getDefaultImpl;->MediaBrowserCompatSearchResultReceiver:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_14

    iget v0, p0, Lo/getDefaultImpl;->MediaBrowserCompatSearchResultReceiver:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_14

    .line 342
    const-string v0, "skewX"

    goto :goto_16

    .line 341
    :cond_14
    const-string v0, "skewY"

    .line 343
    :goto_16
    iget p0, p0, Lo/getDefaultImpl;->MediaBrowserCompatItemReceiver:F

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%s(%.2fdeg)"

    invoke-static {v0, p0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 345
    :cond_27
    const-string p0, ""

    return-object p0
.end method

.method private IconCompatParcelizer()V
    .registers 33

    move-object/from16 v0, p0

    .line 166
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    iget-object v2, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    iget v2, v2, Lo/computeNext;->write:I

    .line 181
    invoke-static {v2}, Lo/PrivateMaxEntriesMap;->AudioAttributesCompatParcelizer(I)Ljava/lang/String;

    move-result-object v2

    iget v3, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->read:I

    iget v4, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->write:F

    .line 182
    invoke-direct {v0, v3, v4}, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer(IF)Ljava/lang/String;

    move-result-object v3

    .line 183
    iget-object v4, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    .line 184
    invoke-static {v4}, Landroidx/media3/ui/WebViewSubtitleOutput;->RemoteActionCompatParcelizer(Lo/computeNext;)Ljava/lang/String;

    move-result-object v4

    const v5, 0x3f99999a    # 1.2f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    filled-new-array {v2, v3, v6, v4}, [Ljava/lang/Object;

    move-result-object v2

    .line 168
    const-string v3, "<body><div style=\'-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;\'>"

    invoke-static {v3, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 167
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 188
    const-string v3, "default_bg"

    invoke-static {v3}, Lo/PrivateMaxEntriesMap;->read(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v6, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    iget v6, v6, Lo/computeNext;->RemoteActionCompatParcelizer:I

    .line 189
    invoke-static {v6}, Lo/PrivateMaxEntriesMap;->AudioAttributesCompatParcelizer(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "background-color:%s;"

    invoke-static {v7, v6}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 187
    invoke-interface {v2, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x0

    .line 190
    :goto_52
    iget-object v7, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplApi26Parcelizer:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x1

    if-ge v6, v7, :cond_20a

    .line 191
    iget-object v7, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplApi26Parcelizer:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo/getDefaultImpl;

    .line 192
    iget v9, v7, Lo/getDefaultImpl;->AudioAttributesImplApi21Parcelizer:F

    const v10, -0x800001

    cmpl-float v9, v9, v10

    const/high16 v11, 0x42c80000    # 100.0f

    if-eqz v9, :cond_72

    iget v9, v7, Lo/getDefaultImpl;->AudioAttributesImplApi21Parcelizer:F

    mul-float/2addr v9, v11

    goto :goto_74

    :cond_72
    const/high16 v9, 0x42480000    # 50.0f

    .line 193
    :goto_74
    iget v12, v7, Lo/getDefaultImpl;->AudioAttributesImplApi26Parcelizer:I

    invoke-static {v12}, Landroidx/media3/ui/WebViewSubtitleOutput;->RemoteActionCompatParcelizer(I)I

    move-result v12

    .line 198
    iget v13, v7, Lo/getDefaultImpl;->IconCompatParcelizer:F

    cmpl-float v13, v13, v10

    const/high16 v14, 0x3f800000    # 1.0f

    const-string v15, "%.2f%%"

    if-eqz v13, :cond_dd

    .line 199
    iget v13, v7, Lo/getDefaultImpl;->read:I

    if-eq v13, v8, :cond_aa

    .line 211
    iget v13, v7, Lo/getDefaultImpl;->IconCompatParcelizer:F

    mul-float/2addr v13, v11

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v15, v13}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 214
    iget v14, v7, Lo/getDefaultImpl;->MediaBrowserCompatSearchResultReceiver:I

    if-ne v14, v8, :cond_a3

    .line 215
    iget v14, v7, Lo/getDefaultImpl;->write:I

    invoke-static {v14}, Landroidx/media3/ui/WebViewSubtitleOutput;->RemoteActionCompatParcelizer(I)I

    move-result v14

    neg-int v14, v14

    goto :goto_ef

    .line 216
    :cond_a3
    iget v14, v7, Lo/getDefaultImpl;->write:I

    invoke-static {v14}, Landroidx/media3/ui/WebViewSubtitleOutput;->RemoteActionCompatParcelizer(I)I

    move-result v14

    goto :goto_ef

    .line 201
    :cond_aa
    iget v13, v7, Lo/getDefaultImpl;->IconCompatParcelizer:F

    const/16 v16, 0x0

    cmpl-float v13, v13, v16

    const-string v4, "%.2fem"

    if-ltz v13, :cond_c7

    .line 202
    iget v13, v7, Lo/getDefaultImpl;->IconCompatParcelizer:F

    mul-float/2addr v13, v5

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4, v13}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v21, v4

    const/4 v4, 0x0

    goto :goto_db

    .line 204
    :cond_c7
    iget v13, v7, Lo/getDefaultImpl;->IconCompatParcelizer:F

    neg-float v13, v13

    sub-float/2addr v13, v14

    mul-float/2addr v13, v5

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4, v13}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v21, v4

    move v4, v8

    :goto_db
    const/4 v14, 0x0

    goto :goto_f2

    .line 219
    :cond_dd
    iget v4, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->IconCompatParcelizer:F

    sub-float/2addr v14, v4

    mul-float/2addr v14, v11

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v15, v4}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const/16 v14, -0x64

    :goto_ef
    move-object/from16 v21, v13

    const/4 v4, 0x0

    .line 224
    :goto_f2
    iget v13, v7, Lo/getDefaultImpl;->AudioAttributesImplBaseParcelizer:F

    cmpl-float v10, v13, v10

    if-eqz v10, :cond_108

    .line 225
    iget v10, v7, Lo/getDefaultImpl;->AudioAttributesImplBaseParcelizer:F

    mul-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v15, v10}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    goto :goto_10a

    .line 226
    :cond_108
    const-string v10, "fit-content"

    :goto_10a
    move-object/from16 v23, v10

    .line 228
    iget-object v10, v7, Lo/getDefaultImpl;->MediaBrowserCompatMediaItem:Landroid/text/Layout$Alignment;

    invoke-static {v10}, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer(Landroid/text/Layout$Alignment;)Ljava/lang/String;

    move-result-object v24

    .line 229
    iget v10, v7, Lo/getDefaultImpl;->MediaBrowserCompatSearchResultReceiver:I

    invoke-static {v10}, Landroidx/media3/ui/WebViewSubtitleOutput;->read(I)Ljava/lang/String;

    move-result-object v25

    .line 230
    iget v10, v7, Lo/getDefaultImpl;->MediaMetadataCompat:I

    iget v11, v7, Lo/getDefaultImpl;->MediaDescriptionCompat:F

    invoke-direct {v0, v10, v11}, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer(IF)Ljava/lang/String;

    move-result-object v26

    .line 232
    iget-boolean v10, v7, Lo/getDefaultImpl;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Z

    if-eqz v10, :cond_127

    iget v10, v7, Lo/getDefaultImpl;->onCustomAction:I

    goto :goto_12b

    :cond_127
    iget-object v10, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    iget v10, v10, Lo/computeNext;->AudioAttributesImplApi26Parcelizer:I

    :goto_12b
    invoke-static {v10}, Lo/PrivateMaxEntriesMap;->AudioAttributesCompatParcelizer(I)Ljava/lang/String;

    move-result-object v27

    .line 236
    iget v10, v7, Lo/getDefaultImpl;->MediaBrowserCompatSearchResultReceiver:I

    const-string v11, "left"

    const/4 v13, 0x2

    const-string v15, "top"

    if-eq v10, v8, :cond_146

    if-eq v10, v13, :cond_143

    if-eqz v4, :cond_13e

    .line 247
    const-string v15, "bottom"

    :cond_13e
    move-object/from16 v18, v11

    move-object/from16 v20, v15

    goto :goto_14f

    :cond_143
    if-eqz v4, :cond_14b

    goto :goto_149

    :cond_146
    if-eqz v4, :cond_149

    goto :goto_14b

    :cond_149
    :goto_149
    const-string v11, "right"

    :cond_14b
    :goto_14b
    move-object/from16 v20, v11

    move-object/from16 v18, v15

    .line 254
    :goto_14f
    iget v4, v7, Lo/getDefaultImpl;->MediaBrowserCompatSearchResultReceiver:I

    if-eq v4, v13, :cond_161

    iget v4, v7, Lo/getDefaultImpl;->MediaBrowserCompatSearchResultReceiver:I

    if-eq v4, v8, :cond_161

    .line 261
    const-string v4, "width"

    move-object/from16 v22, v4

    move/from16 v31, v14

    move v14, v12

    move/from16 v12, v31

    goto :goto_165

    .line 257
    :cond_161
    const-string v4, "height"

    move-object/from16 v22, v4

    .line 264
    :goto_165
    iget-object v4, v7, Lo/getDefaultImpl;->RatingCompat:Ljava/lang/CharSequence;

    .line 266
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 265
    invoke-static {v4, v10}, Lo/PrivateMaxEntriesMapDrainStatus2;->IconCompatParcelizer(Ljava/lang/CharSequence;F)Lo/PrivateMaxEntriesMapDrainStatus2$read;

    move-result-object v4

    .line 267
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_181
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1ac

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 270
    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v2, v11, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v13, :cond_1a7

    .line 273
    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1a7

    const/4 v11, 0x0

    goto :goto_1a8

    :cond_1a7
    move v11, v8

    .line 271
    :goto_1a8
    invoke-static {v11}, Lo/buildTypeSerializer;->write(Z)V

    goto :goto_181

    .line 304
    :cond_1ac
    invoke-static {v7}, Landroidx/media3/ui/WebViewSubtitleOutput;->IconCompatParcelizer(Lo/getDefaultImpl;)Ljava/lang/String;

    move-result-object v30

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v19

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v28

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v29

    filled-new-array/range {v17 .. v30}, [Ljava/lang/Object;

    move-result-object v8

    .line 277
    const-string v9, "<div style=\'position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;\'>"

    invoke-static {v9, v8}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 276
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v8

    .line 305
    const-string v9, "<span class=\'%s\'>"

    invoke-static {v9, v8}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    iget-object v8, v7, Lo/getDefaultImpl;->MediaBrowserCompatCustomActionResultReceiver:Landroid/text/Layout$Alignment;

    if-eqz v8, :cond_1fc

    .line 308
    iget-object v7, v7, Lo/getDefaultImpl;->MediaBrowserCompatCustomActionResultReceiver:Landroid/text/Layout$Alignment;

    .line 311
    invoke-static {v7}, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer(Landroid/text/Layout$Alignment;)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    .line 309
    const-string v8, "<span style=\'display:inline-block; text-align:%s;\'>"

    invoke-static {v8, v7}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 308
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v4, Lo/PrivateMaxEntriesMapDrainStatus2$read;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 312
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    const-string v4, "</span>"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_201

    .line 315
    :cond_1fc
    iget-object v4, v4, Lo/PrivateMaxEntriesMapDrainStatus2$read;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    :goto_201
    const-string v4, "</span></div>"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_52

    .line 321
    :cond_20a
    const-string v3, "</div></body></html>"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "<html><head><style>"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 325
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_21e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_241

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 326
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "{"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "}"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_21e

    .line 328
    :cond_241
    const-string v2, "</style></head>"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    iget-object v0, v0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplBaseParcelizer:Landroid/webkit/WebView;

    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/parseMdtaFromMeta;->AudioAttributesImplApi26Parcelizer:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1, v8}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    .line 331
    const-string v2, "text/html"

    const-string v3, "base64"

    invoke-virtual {v0, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(I)I
    .registers 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_b

    const/4 v0, 0x2

    if-eq p0, v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    const/16 p0, -0x64

    return p0

    :cond_b
    const/16 p0, -0x32

    return p0
.end method

.method private static RemoteActionCompatParcelizer(Lo/computeNext;)Ljava/lang/String;
    .registers 3

    .line 369
    iget v0, p0, Lo/computeNext;->AudioAttributesCompatParcelizer:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_44

    const/4 v1, 0x2

    if-eq v0, v1, :cond_33

    const/4 v1, 0x3

    if-eq v0, v1, :cond_22

    const/4 v1, 0x4

    if-eq v0, v1, :cond_11

    .line 386
    const-string p0, "unset"

    return-object p0

    .line 371
    :cond_11
    iget p0, p0, Lo/computeNext;->read:I

    .line 372
    invoke-static {p0}, Lo/PrivateMaxEntriesMap;->AudioAttributesCompatParcelizer(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 371
    const-string v0, "-0.05em -0.05em 0.15em %s"

    invoke-static {v0, p0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 382
    :cond_22
    iget p0, p0, Lo/computeNext;->read:I

    .line 383
    invoke-static {p0}, Lo/PrivateMaxEntriesMap;->AudioAttributesCompatParcelizer(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 382
    const-string v0, "0.06em 0.08em 0.15em %s"

    invoke-static {v0, p0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 374
    :cond_33
    iget p0, p0, Lo/computeNext;->read:I

    invoke-static {p0}, Lo/PrivateMaxEntriesMap;->AudioAttributesCompatParcelizer(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "0.1em 0.12em 0.15em %s"

    invoke-static {v0, p0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 378
    :cond_44
    iget p0, p0, Lo/computeNext;->read:I

    .line 380
    invoke-static {p0}, Lo/PrivateMaxEntriesMap;->AudioAttributesCompatParcelizer(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 378
    const-string v0, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"

    invoke-static {v0, p0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static read(I)Ljava/lang/String;
    .registers 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_c

    const/4 v0, 0x2

    if-eq p0, v0, :cond_9

    .line 398
    const-string p0, "horizontal-tb"

    return-object p0

    .line 393
    :cond_9
    const-string p0, "vertical-lr"

    return-object p0

    .line 395
    :cond_c
    const-string p0, "vertical-rl"

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    .line 162
    iget-object p0, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplBaseParcelizer:Landroid/webkit/WebView;

    invoke-virtual {p0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method protected final onLayout(ZIIII)V
    .registers 6

    .line 147
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    if-eqz p1, :cond_10

    .line 148
    iget-object p1, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplApi26Parcelizer:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_10

    .line 151
    invoke-direct {p0}, Landroidx/media3/ui/WebViewSubtitleOutput;->IconCompatParcelizer()V

    :cond_10
    return-void
.end method

.method public final write(Ljava/util/List;Lo/computeNext;FIF)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/getDefaultImpl;",
            ">;",
            "Lo/computeNext;",
            "FIF)V"
        }
    .end annotation

    .line 117
    iput-object p2, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    .line 118
    iput p3, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->write:F

    .line 119
    iput p4, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->read:I

    .line 120
    iput p5, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->IconCompatParcelizer:F

    .line 122
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 123
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 124
    :goto_13
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2d

    .line 125
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/getDefaultImpl;

    .line 126
    iget-object v4, v3, Lo/getDefaultImpl;->AudioAttributesCompatParcelizer:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_27

    .line 127
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    .line 129
    :cond_27
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2a
    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    .line 133
    :cond_2d
    iget-object p1, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplApi26Parcelizer:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3b

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_40

    .line 134
    :cond_3b
    iput-object v0, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->AudioAttributesImplApi26Parcelizer:Ljava/util/List;

    .line 138
    invoke-direct {p0}, Landroidx/media3/ui/WebViewSubtitleOutput;->IconCompatParcelizer()V

    .line 140
    :cond_40
    iget-object v0, p0, Landroidx/media3/ui/WebViewSubtitleOutput;->RemoteActionCompatParcelizer:Landroidx/media3/ui/CanvasSubtitleOutput;

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/media3/ui/CanvasSubtitleOutput;->write(Ljava/util/List;Lo/computeNext;FIF)V

    .line 142
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

###### Class androidx.media3.ui.WebViewSubtitleOutput.AnonymousClass1 (androidx.media3.ui.WebViewSubtitleOutput$1)
.class final Landroidx/media3/ui/WebViewSubtitleOutput$1;
.super Landroid/webkit/WebView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/ui/WebViewSubtitleOutput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/media3/ui/WebViewSubtitleOutput;


# direct methods
.method constructor <init>(Landroidx/media3/ui/WebViewSubtitleOutput;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 89
    iput-object p1, p0, Landroidx/media3/ui/WebViewSubtitleOutput$1;->RemoteActionCompatParcelizer:Landroidx/media3/ui/WebViewSubtitleOutput;

    invoke-direct {p0, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 92
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p0, 0x0

    return p0
.end method

.method public final performClick()Z
    .registers 1

    .line 99
    invoke-super {p0}, Landroid/webkit/WebView;->performClick()Z

    const/4 p0, 0x0

    return p0
.end method

###### Class androidx.media3.ui.WebViewSubtitleOutput.AnonymousClass4 (androidx.media3.ui.WebViewSubtitleOutput$4)
.class final synthetic Landroidx/media3/ui/WebViewSubtitleOutput$4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/ui/WebViewSubtitleOutput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic write:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 406
    invoke-static {}, Landroid/text/Layout$Alignment;->values()[Landroid/text/Layout$Alignment;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Landroidx/media3/ui/WebViewSubtitleOutput$4;->write:[I

    :try_start_9
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v0, Landroidx/media3/ui/WebViewSubtitleOutput$4;->write:[I

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1d
    sget-object v0, Landroidx/media3/ui/WebViewSubtitleOutput$4;->write:[I

    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_28} :catch_28

    :catch_28
    return-void
.end method
