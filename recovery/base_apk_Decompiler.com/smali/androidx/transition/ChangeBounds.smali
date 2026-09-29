###### Class androidx.transition.ChangeBounds (androidx.transition.ChangeBounds)
.class public Landroidx/transition/ChangeBounds;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;,
        Landroidx/transition/ChangeBounds$IconCompatParcelizer;,
        Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;
    }
.end annotation


# static fields
.field private static final AudioAttributesImplApi21Parcelizer:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final MediaBrowserCompatMediaItem:[Ljava/lang/String;

.field private static final MediaBrowserCompatSearchResultReceiver:Lo/reportActivity;

.field private static final MediaDescriptionCompat:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final MediaMetadataCompat:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final RatingCompat:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final RemoteActionCompatParcelizer:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private onCommand:Z


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 55
    const-string v0, "android:changeBounds:windowX"

    const-string v1, "android:changeBounds:windowY"

    const-string v2, "android:changeBounds:bounds"

    const-string v3, "android:changeBounds:clip"

    const-string v4, "android:changeBounds:parent"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/transition/ChangeBounds;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    .line 63
    new-instance v0, Landroidx/transition/ChangeBounds$2;

    const-class v1, Landroid/graphics/PointF;

    const-string v2, "topLeft"

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$2;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->MediaDescriptionCompat:Landroid/util/Property;

    .line 76
    new-instance v0, Landroidx/transition/ChangeBounds$1;

    const-class v1, Landroid/graphics/PointF;

    const-string v3, "bottomRight"

    invoke-direct {v0, v1, v3}, Landroidx/transition/ChangeBounds$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->AudioAttributesImplApi21Parcelizer:Landroid/util/Property;

    .line 89
    new-instance v0, Landroidx/transition/ChangeBounds$3;

    const-class v1, Landroid/graphics/PointF;

    invoke-direct {v0, v1, v3}, Landroidx/transition/ChangeBounds$3;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->RemoteActionCompatParcelizer:Landroid/util/Property;

    .line 106
    new-instance v0, Landroidx/transition/ChangeBounds$4;

    const-class v1, Landroid/graphics/PointF;

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$4;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->RatingCompat:Landroid/util/Property;

    .line 123
    new-instance v0, Landroidx/transition/ChangeBounds$5;

    const-class v1, Landroid/graphics/PointF;

    const-string v2, "position"

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeBounds$5;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeBounds;->MediaMetadataCompat:Landroid/util/Property;

    .line 142
    new-instance v0, Lo/reportActivity;

    invoke-direct {v0}, Lo/reportActivity;-><init>()V

    sput-object v0, Landroidx/transition/ChangeBounds;->MediaBrowserCompatSearchResultReceiver:Lo/reportActivity;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 144
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x0

    .line 140
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->onCommand:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 148
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 140
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->onCommand:Z

    .line 150
    sget-object v1, Lo/recordRemarketingPing;->AudioAttributesCompatParcelizer:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 151
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v1, "resizeClip"

    invoke-static {p1, p2, v1, v0, v0}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result p2

    .line 153
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 154
    invoke-direct {p0, p2}, Landroidx/transition/ChangeBounds;->read(Z)V

    return-void
.end method

.method private IconCompatParcelizer(Lo/Rstring;)V
    .registers 9

    .line 196
    iget-object v0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 198
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-nez v1, :cond_14

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-nez v1, :cond_14

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v1, :cond_4c

    .line 199
    :cond_14
    iget-object v1, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    .line 200
    new-instance v4, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v6

    invoke-direct {v4, v2, v3, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 199
    const-string v2, "android:changeBounds:bounds"

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    iget-object v1, p1, Lo/Rstring;->read:Ljava/util/Map;

    iget-object v2, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v3, "android:changeBounds:parent"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    iget-boolean p0, p0, Landroidx/transition/ChangeBounds;->onCommand:Z

    if-eqz p0, :cond_4c

    .line 203
    iget-object p0, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string p1, "android:changeBounds:clip"

    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4c
    return-void
.end method

.method private read(Z)V
    .registers 2

    .line 181
    iput-boolean p1, p0, Landroidx/transition/ChangeBounds;->onCommand:Z

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 2

    .line 222
    invoke-direct {p0, p1}, Landroidx/transition/ChangeBounds;->IconCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 25

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    if-eqz v1, :cond_1d9

    if-eqz v2, :cond_1d9

    .line 231
    iget-object v4, v1, Lo/Rstring;->read:Ljava/util/Map;

    .line 232
    iget-object v5, v2, Lo/Rstring;->read:Ljava/util/Map;

    .line 233
    const-string v6, "android:changeBounds:parent"

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    .line 234
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    if-eqz v4, :cond_1d7

    if-eqz v5, :cond_1d7

    .line 238
    iget-object v4, v2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 239
    iget-object v5, v1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v6, "android:changeBounds:bounds"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    .line 240
    iget-object v7, v2, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Rect;

    .line 241
    iget v12, v5, Landroid/graphics/Rect;->left:I

    .line 242
    iget v15, v6, Landroid/graphics/Rect;->left:I

    .line 243
    iget v13, v5, Landroid/graphics/Rect;->top:I

    .line 244
    iget v14, v6, Landroid/graphics/Rect;->top:I

    .line 245
    iget v11, v5, Landroid/graphics/Rect;->right:I

    .line 246
    iget v10, v6, Landroid/graphics/Rect;->right:I

    .line 247
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 248
    iget v9, v6, Landroid/graphics/Rect;->bottom:I

    sub-int v6, v11, v12

    sub-int v7, v5, v13

    sub-int v8, v10, v15

    sub-int v3, v9, v14

    .line 253
    iget-object v1, v1, Lo/Rstring;->read:Ljava/util/Map;

    move-object/from16 v20, v4

    const-string v4, "android:changeBounds:clip"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    .line 254
    iget-object v2, v2, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    if-eqz v6, :cond_64

    if-nez v7, :cond_68

    :cond_64
    if-eqz v8, :cond_78

    if-eqz v3, :cond_78

    :cond_68
    if-ne v12, v15, :cond_6f

    if-ne v13, v14, :cond_6f

    const/16 v16, 0x0

    goto :goto_71

    :cond_6f
    const/16 v16, 0x1

    :goto_71
    if-ne v11, v10, :cond_75

    if-eq v5, v9, :cond_7a

    :cond_75
    add-int/lit8 v16, v16, 0x1

    goto :goto_7a

    :cond_78
    const/16 v16, 0x0

    :cond_7a
    :goto_7a
    if-eqz v1, :cond_82

    .line 260
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_86

    :cond_82
    if-nez v1, :cond_88

    if-eqz v2, :cond_88

    :cond_86
    add-int/lit8 v16, v16, 0x1

    :cond_88
    move/from16 v4, v16

    if-lez v4, :cond_1d5

    move-object/from16 v16, v2

    .line 266
    iget-boolean v2, v0, Landroidx/transition/ChangeBounds;->onCommand:Z

    if-nez v2, :cond_124

    move-object/from16 v2, v20

    .line 267
    invoke-static {v2, v12, v13, v11, v5}, Lo/ab;->write(Landroid/view/View;IIII)V

    const/4 v1, 0x2

    if-ne v4, v1, :cond_f7

    if-ne v6, v8, :cond_b1

    if-ne v7, v3, :cond_b1

    .line 271
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaDescriptionCompat()Landroidx/transition/PathMotion;

    move-result-object v1

    int-to-float v3, v12

    int-to-float v4, v13

    int-to-float v5, v15

    int-to-float v6, v14

    invoke-virtual {v1, v3, v4, v5, v6}, Landroidx/transition/PathMotion;->write(FFFF)Landroid/graphics/Path;

    move-result-object v1

    .line 273
    sget-object v3, Landroidx/transition/ChangeBounds;->MediaMetadataCompat:Landroid/util/Property;

    invoke-static {v2, v3, v1}, Lo/DoubleClickAudienceReporter;->RemoteActionCompatParcelizer(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    goto :goto_120

    .line 276
    :cond_b1
    new-instance v3, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

    invoke-direct {v3, v2}, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;-><init>(Landroid/view/View;)V

    .line 277
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaDescriptionCompat()Landroidx/transition/PathMotion;

    move-result-object v4

    int-to-float v6, v12

    int-to-float v7, v13

    int-to-float v8, v15

    int-to-float v12, v14

    invoke-virtual {v4, v6, v7, v8, v12}, Landroidx/transition/PathMotion;->write(FFFF)Landroid/graphics/Path;

    move-result-object v4

    .line 279
    sget-object v6, Landroidx/transition/ChangeBounds;->MediaDescriptionCompat:Landroid/util/Property;

    .line 280
    invoke-static {v3, v6, v4}, Lo/DoubleClickAudienceReporter;->RemoteActionCompatParcelizer(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 282
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaDescriptionCompat()Landroidx/transition/PathMotion;

    move-result-object v6

    int-to-float v7, v11

    int-to-float v5, v5

    int-to-float v8, v10

    int-to-float v9, v9

    invoke-virtual {v6, v7, v5, v8, v9}, Landroidx/transition/PathMotion;->write(FFFF)Landroid/graphics/Path;

    move-result-object v5

    .line 284
    sget-object v6, Landroidx/transition/ChangeBounds;->AudioAttributesImplApi21Parcelizer:Landroid/util/Property;

    invoke-static {v3, v6, v5}, Lo/DoubleClickAudienceReporter;->RemoteActionCompatParcelizer(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 286
    new-instance v6, Landroid/animation/AnimatorSet;

    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    .line 287
    new-array v1, v1, [Landroid/animation/Animator;

    const/4 v7, 0x0

    aput-object v4, v1, v7

    const/4 v4, 0x1

    aput-object v5, v1, v4

    invoke-virtual {v6, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 289
    new-instance v1, Landroidx/transition/ChangeBounds$7;

    invoke-direct {v1, v0, v3}, Landroidx/transition/ChangeBounds$7;-><init>(Landroidx/transition/ChangeBounds;Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;)V

    invoke-virtual {v6, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object/from16 v20, v2

    move-object v1, v6

    goto/16 :goto_1b6

    :cond_f7
    if-ne v12, v15, :cond_10e

    if-ne v13, v14, :cond_10e

    .line 302
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaDescriptionCompat()Landroidx/transition/PathMotion;

    move-result-object v1

    int-to-float v3, v11

    int-to-float v4, v5

    int-to-float v5, v10

    int-to-float v6, v9

    invoke-virtual {v1, v3, v4, v5, v6}, Landroidx/transition/PathMotion;->write(FFFF)Landroid/graphics/Path;

    move-result-object v1

    .line 304
    sget-object v3, Landroidx/transition/ChangeBounds;->RemoteActionCompatParcelizer:Landroid/util/Property;

    invoke-static {v2, v3, v1}, Lo/DoubleClickAudienceReporter;->RemoteActionCompatParcelizer(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    goto :goto_120

    .line 297
    :cond_10e
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaDescriptionCompat()Landroidx/transition/PathMotion;

    move-result-object v1

    int-to-float v3, v12

    int-to-float v4, v13

    int-to-float v5, v15

    int-to-float v6, v14

    invoke-virtual {v1, v3, v4, v5, v6}, Landroidx/transition/PathMotion;->write(FFFF)Landroid/graphics/Path;

    move-result-object v1

    .line 299
    sget-object v3, Landroidx/transition/ChangeBounds;->RatingCompat:Landroid/util/Property;

    invoke-static {v2, v3, v1}, Lo/DoubleClickAudienceReporter;->RemoteActionCompatParcelizer(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    :goto_120
    move-object/from16 v20, v2

    goto/16 :goto_1b6

    :cond_124
    move-object/from16 v2, v20

    .line 308
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 309
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    move-result v17

    add-int/2addr v4, v12

    move/from16 v18, v9

    add-int v9, v13, v17

    .line 311
    invoke-static {v2, v12, v13, v4, v9}, Lo/ab;->write(Landroid/view/View;IIII)V

    if-ne v12, v15, :cond_142

    if-ne v13, v14, :cond_142

    move/from16 v17, v10

    move/from16 v19, v11

    move/from16 v20, v15

    const/4 v4, 0x0

    goto :goto_15a

    .line 316
    :cond_142
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaDescriptionCompat()Landroidx/transition/PathMotion;

    move-result-object v4

    int-to-float v9, v12

    move/from16 v17, v10

    int-to-float v10, v13

    move/from16 v19, v11

    int-to-float v11, v15

    move/from16 v20, v15

    int-to-float v15, v14

    invoke-virtual {v4, v9, v10, v11, v15}, Landroidx/transition/PathMotion;->write(FFFF)Landroid/graphics/Path;

    move-result-object v4

    .line 318
    sget-object v9, Landroidx/transition/ChangeBounds;->MediaMetadataCompat:Landroid/util/Property;

    invoke-static {v2, v9, v4}, Lo/DoubleClickAudienceReporter;->RemoteActionCompatParcelizer(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v4

    :goto_15a
    if-nez v1, :cond_15e

    const/4 v9, 0x1

    goto :goto_15f

    :cond_15e
    const/4 v9, 0x0

    :goto_15f
    if-eqz v9, :cond_168

    .line 323
    new-instance v1, Landroid/graphics/Rect;

    const/4 v10, 0x0

    invoke-direct {v1, v10, v10, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_169

    :cond_168
    const/4 v10, 0x0

    :goto_169
    if-nez v16, :cond_16d

    const/4 v11, 0x1

    goto :goto_16e

    :cond_16d
    move v11, v10

    :goto_16e
    if-eqz v11, :cond_177

    .line 327
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6, v10, v10, v8, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v10, v6

    goto :goto_179

    :cond_177
    move-object/from16 v10, v16

    .line 330
    :goto_179
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1af

    .line 331
    invoke-virtual {v2, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 332
    sget-object v3, Landroidx/transition/ChangeBounds;->MediaBrowserCompatSearchResultReceiver:Lo/reportActivity;

    filled-new-array {v1, v10}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "clipBounds"

    invoke-static {v2, v7, v3, v6}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 334
    new-instance v15, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;

    move-object v6, v15

    move-object v7, v2

    move-object v8, v1

    move/from16 v1, v18

    move/from16 v18, v17

    move/from16 v16, v19

    move/from16 v17, v14

    move/from16 v14, v16

    move/from16 v16, v20

    move-object/from16 v20, v2

    move-object v2, v15

    move v15, v5

    move/from16 v19, v1

    invoke-direct/range {v6 .. v19}, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;-><init>(Landroid/view/View;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZIIIIIIII)V

    .line 339
    invoke-virtual {v3, v2}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 340
    invoke-virtual {v0, v2}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    goto :goto_1b2

    :cond_1af
    move-object/from16 v20, v2

    const/4 v3, 0x0

    .line 342
    :goto_1b2
    invoke-static {v4, v3}, Lo/Rinteger;->write(Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;

    move-result-object v1

    .line 345
    :goto_1b6
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1d4

    .line 346
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x1

    .line 347
    invoke-static {v2, v3}, Lo/getPackageManager;->write(Landroid/view/ViewGroup;Z)V

    .line 348
    invoke-virtual/range {p0 .. p0}, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver()Landroidx/transition/Transition;

    move-result-object v0

    new-instance v3, Landroidx/transition/ChangeBounds$IconCompatParcelizer;

    invoke-direct {v3, v2}, Landroidx/transition/ChangeBounds$IconCompatParcelizer;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v3}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    :cond_1d4
    return-object v1

    :cond_1d5
    const/4 v0, 0x0

    return-object v0

    :cond_1d7
    const/4 v0, 0x0

    return-object v0

    :cond_1d9
    const/4 v0, 0x0

    return-object v0
.end method

.method public final read(Lo/Rstring;)V
    .registers 3

    .line 210
    invoke-direct {p0, p1}, Landroidx/transition/ChangeBounds;->IconCompatParcelizer(Lo/Rstring;)V

    .line 211
    iget-boolean p0, p0, Landroidx/transition/ChangeBounds;->onCommand:Z

    if-eqz p0, :cond_1a

    .line 212
    iget-object p0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    sget v0, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_clip:I

    .line 213
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Rect;

    if-eqz p0, :cond_1a

    .line 215
    iget-object p1, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:changeBounds:clip"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1a
    return-void
.end method

.method public final read()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final write()[Ljava/lang/String;
    .registers 1

    .line 164
    sget-object p0, Landroidx/transition/ChangeBounds;->MediaBrowserCompatMediaItem:[Ljava/lang/String;

    return-object p0
.end method

###### Class androidx.transition.ChangeBounds.AnonymousClass1 (androidx.transition.ChangeBounds$1)
.class final Landroidx/transition/ChangeBounds$1;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    .line 77
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private static IconCompatParcelizer(Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;Landroid/graphics/PointF;)V
    .registers 2

    .line 80
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->read(Landroid/graphics/PointF;)V

    return-void
.end method


# virtual methods
.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 77
    check-cast p1, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 77
    check-cast p1, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

    check-cast p2, Landroid/graphics/PointF;

    invoke-static {p1, p2}, Landroidx/transition/ChangeBounds$1;->IconCompatParcelizer(Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;Landroid/graphics/PointF;)V

    return-void
.end method

###### Class androidx.transition.ChangeBounds.AnonymousClass2 (androidx.transition.ChangeBounds$2)
.class final Landroidx/transition/ChangeBounds$2;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    .line 64
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;Landroid/graphics/PointF;)V
    .registers 2

    .line 67
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/graphics/PointF;)V

    return-void
.end method


# virtual methods
.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 64
    check-cast p1, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 64
    check-cast p1, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

    check-cast p2, Landroid/graphics/PointF;

    invoke-static {p1, p2}, Landroidx/transition/ChangeBounds$2;->AudioAttributesCompatParcelizer(Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;Landroid/graphics/PointF;)V

    return-void
.end method

###### Class androidx.transition.ChangeBounds.AnonymousClass3 (androidx.transition.ChangeBounds$3)
.class final Landroidx/transition/ChangeBounds$3;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroid/view/View;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    .line 90
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/view/View;Landroid/graphics/PointF;)V
    .registers 5

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v0

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    .line 95
    iget v2, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 96
    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 97
    invoke-static {p0, v0, v1, v2, p1}, Lo/ab;->write(Landroid/view/View;IIII)V

    return-void
.end method


# virtual methods
.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 90
    check-cast p1, Landroid/view/View;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 90
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/PointF;

    invoke-static {p1, p2}, Landroidx/transition/ChangeBounds$3;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/PointF;)V

    return-void
.end method

###### Class androidx.transition.ChangeBounds.AnonymousClass4 (androidx.transition.ChangeBounds$4)
.class final Landroidx/transition/ChangeBounds$4;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroid/view/View;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    .line 107
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/view/View;Landroid/graphics/PointF;)V
    .registers 5

    .line 110
    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 111
    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v1

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v2

    .line 114
    invoke-static {p0, v0, p1, v1, v2}, Lo/ab;->write(Landroid/view/View;IIII)V

    return-void
.end method


# virtual methods
.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 107
    check-cast p1, Landroid/view/View;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 107
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/PointF;

    invoke-static {p1, p2}, Landroidx/transition/ChangeBounds$4;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/PointF;)V

    return-void
.end method

###### Class androidx.transition.ChangeBounds.AnonymousClass5 (androidx.transition.ChangeBounds$5)
.class final Landroidx/transition/ChangeBounds$5;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroid/view/View;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    .line 124
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private static write(Landroid/view/View;Landroid/graphics/PointF;)V
    .registers 5

    .line 127
    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 128
    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    .line 130
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v1, v0

    add-int/2addr v2, p1

    .line 131
    invoke-static {p0, v0, p1, v1, v2}, Lo/ab;->write(Landroid/view/View;IIII)V

    return-void
.end method


# virtual methods
.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 124
    check-cast p1, Landroid/view/View;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 124
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/PointF;

    invoke-static {p1, p2}, Landroidx/transition/ChangeBounds$5;->write(Landroid/view/View;Landroid/graphics/PointF;)V

    return-void
.end method

###### Class androidx.transition.ChangeBounds.AnonymousClass7 (androidx.transition.ChangeBounds$7)
.class final Landroidx/transition/ChangeBounds$7;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/ChangeBounds;->read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

.field private final mViewBounds:Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

.field final synthetic read:Landroidx/transition/ChangeBounds;


# direct methods
.method constructor <init>(Landroidx/transition/ChangeBounds;Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 289
    iput-object p1, p0, Landroidx/transition/ChangeBounds$7;->read:Landroidx/transition/ChangeBounds;

    iput-object p2, p0, Landroidx/transition/ChangeBounds$7;->IconCompatParcelizer:Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 292
    iput-object p2, p0, Landroidx/transition/ChangeBounds$7;->mViewBounds:Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;

    return-void
.end method

###### Class androidx.transition.ChangeBounds.AudioAttributesCompatParcelizer (androidx.transition.ChangeBounds$AudioAttributesCompatParcelizer)
.class final Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field private final AudioAttributesImplApi21Parcelizer:I

.field private final AudioAttributesImplApi26Parcelizer:Z

.field private AudioAttributesImplBaseParcelizer:Z

.field private final IconCompatParcelizer:Z

.field private final MediaBrowserCompatCustomActionResultReceiver:I

.field private final MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

.field private final MediaBrowserCompatMediaItem:I

.field private final MediaBrowserCompatSearchResultReceiver:I

.field private final MediaDescriptionCompat:I

.field private final RatingCompat:Landroid/view/View;

.field private final RemoteActionCompatParcelizer:I

.field private final read:I

.field private final write:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZIIIIIIII)V
    .registers 14

    .line 419
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 420
    iput-object p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    .line 421
    iput-object p2, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    .line 422
    iput-boolean p3, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    .line 423
    iput-object p4, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->write:Landroid/graphics/Rect;

    .line 424
    iput-boolean p5, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    .line 425
    iput p6, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatMediaItem:I

    .line 426
    iput p7, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    .line 427
    iput p8, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaDescriptionCompat:I

    .line 428
    iput p9, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 429
    iput p10, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 430
    iput p11, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    .line 431
    iput p12, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 432
    iput p13, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->read:I

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 5

    .line 490
    iget-object v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_clip:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 491
    iget-object v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    sget v2, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_clip:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 492
    iget-object p0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    const/4 p1, 0x1

    .line 477
    iput-boolean p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 4

    .line 482
    iget-object v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 483
    iget-object v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    sget v2, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_clip:I

    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 484
    iget-boolean v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    if-eqz v0, :cond_13

    const/4 v0, 0x0

    goto :goto_15

    :cond_13
    iget-object v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->write:Landroid/graphics/Rect;

    .line 485
    :goto_15
    iget-object p0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const/4 v0, 0x0

    .line 442
    invoke-virtual {p0, p1, v0}, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .registers 5

    .line 460
    iget-boolean p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p1, :cond_5

    return-void

    :cond_5
    if-eqz p2, :cond_e

    .line 464
    iget-boolean p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    if-nez p1, :cond_15

    iget-object p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    goto :goto_16

    .line 465
    :cond_e
    iget-boolean p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Z

    if-nez p1, :cond_15

    iget-object p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->write:Landroid/graphics/Rect;

    goto :goto_16

    :cond_15
    const/4 p1, 0x0

    .line 466
    :goto_16
    iget-object v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    if-eqz p2, :cond_2b

    .line 468
    iget-object p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    iget p2, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatMediaItem:I

    iget v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    iget v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaDescriptionCompat:I

    iget p0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-static {p1, p2, v0, v1, p0}, Lo/ab;->write(Landroid/view/View;IIII)V

    return-void

    .line 471
    :cond_2b
    iget-object p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    iget p2, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    iget v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:I

    iget p0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->read:I

    invoke-static {p1, p2, v0, v1, p0}, Lo/ab;->write(Landroid/view/View;IIII)V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    const/4 v0, 0x0

    .line 437
    invoke-virtual {p0, p1, v0}, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->onAnimationStart(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .registers 7

    .line 447
    iget p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaDescriptionCompat:I

    iget v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatMediaItem:I

    sub-int/2addr p1, v0

    iget v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:I

    iget v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    sub-int/2addr v0, v1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 448
    iget v0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    iget v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->read:I

    iget v2, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz p2, :cond_21

    .line 450
    iget v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:I

    goto :goto_23

    :cond_21
    iget v1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatMediaItem:I

    :goto_23
    if-eqz p2, :cond_28

    .line 451
    iget v2, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer:I

    goto :goto_2a

    :cond_28
    iget v2, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:I

    .line 452
    :goto_2a
    iget-object v3, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    add-int/2addr p1, v1

    add-int/2addr v0, v2

    invoke-static {v3, v1, v2, p1, v0}, Lo/ab;->write(Landroid/view/View;IIII)V

    if-eqz p2, :cond_36

    .line 454
    iget-object p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->write:Landroid/graphics/Rect;

    goto :goto_38

    :cond_36
    iget-object p1, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver:Landroid/graphics/Rect;

    .line 455
    :goto_38
    iget-object p0, p0, Landroidx/transition/ChangeBounds$AudioAttributesCompatParcelizer;->RatingCompat:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

###### Class androidx.transition.ChangeBounds.IconCompatParcelizer (androidx.transition.ChangeBounds$IconCompatParcelizer)
.class final Landroidx/transition/ChangeBounds$IconCompatParcelizer;
.super Lo/GoogleConversionReporter1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

.field private write:Z


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;)V
    .registers 3

    .line 509
    invoke-direct {p0}, Lo/GoogleConversionReporter1;-><init>()V

    const/4 v0, 0x0

    .line 505
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds$IconCompatParcelizer;->write:Z

    .line 510
    iput-object p1, p0, Landroidx/transition/ChangeBounds$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 534
    iget-object p0, p0, Landroidx/transition/ChangeBounds$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lo/getPackageManager;->write(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 3

    .line 515
    iget-object p1, p0, Landroidx/transition/ChangeBounds$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/getPackageManager;->write(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    .line 516
    iput-boolean p1, p0, Landroidx/transition/ChangeBounds$IconCompatParcelizer;->write:Z

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 2

    .line 529
    iget-object p0, p0, Landroidx/transition/ChangeBounds$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/getPackageManager;->write(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 4

    .line 521
    iget-boolean v0, p0, Landroidx/transition/ChangeBounds$IconCompatParcelizer;->write:Z

    if-nez v0, :cond_a

    .line 522
    iget-object v0, p0, Landroidx/transition/ChangeBounds$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/getPackageManager;->write(Landroid/view/ViewGroup;Z)V

    .line 524
    :cond_a
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    return-void
.end method

###### Class androidx.transition.ChangeBounds.RemoteActionCompatParcelizer (androidx.transition.ChangeBounds$RemoteActionCompatParcelizer)
.class Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private final AudioAttributesImplApi26Parcelizer:Landroid/view/View;

.field private IconCompatParcelizer:I

.field private MediaBrowserCompatCustomActionResultReceiver:I

.field private RemoteActionCompatParcelizer:I

.field private read:I

.field private write:I


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .registers 2

    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 366
    iput-object p1, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    return-void
.end method

.method private write()V
    .registers 6

    .line 388
    iget-object v0, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    iget v1, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    iget v2, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->read:I

    iget v3, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget v4, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->write:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/ab;->write(Landroid/view/View;IIII)V

    const/4 v0, 0x0

    .line 389
    iput v0, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 390
    iput v0, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method


# virtual methods
.method final IconCompatParcelizer(Landroid/graphics/PointF;)V
    .registers 3

    .line 370
    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:I

    .line 371
    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->read:I

    .line 372
    iget p1, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 373
    iget v0, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    if-ne p1, v0, :cond_1d

    .line 374
    invoke-direct {p0}, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->write()V

    :cond_1d
    return-void
.end method

.method final read(Landroid/graphics/PointF;)V
    .registers 3

    .line 379
    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 380
    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->write:I

    .line 381
    iget p1, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    .line 382
    iget v0, p0, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:I

    if-ne v0, p1, :cond_1d

    .line 383
    invoke-direct {p0}, Landroidx/transition/ChangeBounds$RemoteActionCompatParcelizer;->write()V

    :cond_1d
    return-void
.end method
