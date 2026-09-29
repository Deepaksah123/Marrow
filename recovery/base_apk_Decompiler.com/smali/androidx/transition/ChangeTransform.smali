###### Class androidx.transition.ChangeTransform (androidx.transition.ChangeTransform)
.class public Landroidx/transition/ChangeTransform;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/ChangeTransform$write;,
        Landroidx/transition/ChangeTransform$IconCompatParcelizer;,
        Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;,
        Landroidx/transition/ChangeTransform$read;
    }
.end annotation


# static fields
.field private static final AudioAttributesImplApi21Parcelizer:Z

.field private static final MediaBrowserCompatSearchResultReceiver:[Ljava/lang/String;

.field private static final MediaMetadataCompat:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private static final RemoteActionCompatParcelizer:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;",
            "[F>;"
        }
    .end annotation
.end field


# instance fields
.field private MediaBrowserCompatMediaItem:Z

.field private MediaDescriptionCompat:Z

.field private RatingCompat:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 60
    const-string v0, "android:changeTransform:transforms"

    const-string v1, "android:changeTransform:parentMatrix"

    const-string v2, "android:changeTransform:matrix"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/transition/ChangeTransform;->MediaBrowserCompatSearchResultReceiver:[Ljava/lang/String;

    .line 69
    new-instance v0, Landroidx/transition/ChangeTransform$4;

    const-class v1, [F

    const-string v2, "nonTranslations"

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeTransform$4;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeTransform;->RemoteActionCompatParcelizer:Landroid/util/Property;

    .line 85
    new-instance v0, Landroidx/transition/ChangeTransform$2;

    const-class v1, Landroid/graphics/PointF;

    const-string v2, "translations"

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeTransform$2;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeTransform;->MediaMetadataCompat:Landroid/util/Property;

    const/4 v0, 0x1

    .line 101
    sput-boolean v0, Landroidx/transition/ChangeTransform;->AudioAttributesImplApi21Parcelizer:Z

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 108
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x1

    .line 103
    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->MediaBrowserCompatMediaItem:Z

    .line 105
    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->MediaDescriptionCompat:Z

    .line 106
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/transition/ChangeTransform;->RatingCompat:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 112
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    .line 103
    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->MediaBrowserCompatMediaItem:Z

    .line 105
    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->MediaDescriptionCompat:Z

    .line 106
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Landroidx/transition/ChangeTransform;->RatingCompat:Landroid/graphics/Matrix;

    .line 113
    sget-object v1, Lo/recordRemarketingPing;->IconCompatParcelizer:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 114
    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    const-string v1, "reparentWithOverlay"

    invoke-static {p1, p2, v1, v0, v0}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroidx/transition/ChangeTransform;->MediaBrowserCompatMediaItem:Z

    .line 116
    const-string v1, "reparent"

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2, v0}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IZ)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/transition/ChangeTransform;->MediaDescriptionCompat:Z

    .line 118
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/Rstring;)V
    .registers 6

    .line 195
    iget-object v0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 196
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_7d

    .line 199
    iget-object v1, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:changeTransform:parent"

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    new-instance v1, Landroidx/transition/ChangeTransform$read;

    invoke-direct {v1, v0}, Landroidx/transition/ChangeTransform$read;-><init>(Landroid/view/View;)V

    .line 201
    iget-object v2, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v3, "android:changeTransform:transforms"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    if-eqz v1, :cond_33

    .line 203
    invoke-virtual {v1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v2

    if-nez v2, :cond_33

    .line 206
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    goto :goto_34

    :cond_33
    const/4 v2, 0x0

    .line 208
    :goto_34
    iget-object v1, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v3, "android:changeTransform:matrix"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    iget-boolean p0, p0, Landroidx/transition/ChangeTransform;->MediaDescriptionCompat:Z

    if-eqz p0, :cond_7d

    .line 210
    new-instance p0, Landroid/graphics/Matrix;

    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 211
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 212
    invoke-static {v1, p0}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 213
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p0, v2, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 214
    iget-object v1, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:changeTransform:parentMatrix"

    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    iget-object p0, p1, Lo/Rstring;->read:Ljava/util/Map;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_transform:I

    .line 216
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    .line 215
    const-string v2, "android:changeTransform:intermediateMatrix"

    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    iget-object p0, p1, Lo/Rstring;->read:Ljava/util/Map;

    sget p1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->parent_matrix:I

    .line 218
    invoke-virtual {v0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    .line 217
    const-string v0, "android:changeTransform:intermediateParentMatrix"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7d
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/Rstring;Lo/Rstring;)V
    .registers 6

    .line 380
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v1, "android:changeTransform:parentMatrix"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    .line 381
    iget-object p2, p2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    sget v2, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->parent_matrix:I

    invoke-virtual {p2, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 383
    iget-object p0, p0, Landroidx/transition/ChangeTransform;->RatingCompat:Landroid/graphics/Matrix;

    .line 384
    invoke-virtual {p0}, Landroid/graphics/Matrix;->reset()V

    .line 385
    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 387
    iget-object p2, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:changeTransform:matrix"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Matrix;

    if-nez p2, :cond_2f

    .line 389
    new-instance p2, Landroid/graphics/Matrix;

    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 390
    iget-object v2, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    :cond_2f
    iget-object p1, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Matrix;

    .line 394
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 395
    invoke-virtual {p2, p0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    return-void
.end method

.method static RemoteActionCompatParcelizer(Landroid/view/View;FFFFFFFF)V
    .registers 9

    .line 407
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 408
    invoke-virtual {p0, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 409
    invoke-static {p0, p3}, Lo/InvalidTypeIdException;->IconCompatParcelizer(Landroid/view/View;F)V

    .line 410
    invoke-virtual {p0, p4}, Landroid/view/View;->setScaleX(F)V

    .line 411
    invoke-virtual {p0, p5}, Landroid/view/View;->setScaleY(F)V

    .line 412
    invoke-virtual {p0, p6}, Landroid/view/View;->setRotationX(F)V

    .line 413
    invoke-virtual {p0, p7}, Landroid/view/View;->setRotationY(F)V

    .line 414
    invoke-virtual {p0, p8}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

.method private write(Lo/Rstring;Lo/Rstring;Z)Landroid/animation/ObjectAnimator;
    .registers 13

    .line 285
    iget-object p1, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:changeTransform:matrix"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Matrix;

    .line 286
    iget-object v1, p2, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    if-nez p1, :cond_16

    .line 289
    sget-object p1, Lo/registerReferrer;->write:Landroid/graphics/Matrix;

    :cond_16
    if-nez v0, :cond_1a

    .line 293
    sget-object v0, Lo/registerReferrer;->write:Landroid/graphics/Matrix;

    :cond_1a
    move-object v5, v0

    .line 296
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    const/4 p0, 0x0

    return-object p0

    .line 300
    :cond_23
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v1, "android:changeTransform:transforms"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/transition/ChangeTransform$read;

    .line 303
    iget-object v2, p2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 304
    invoke-static {v2}, Landroidx/transition/ChangeTransform;->write(Landroid/view/View;)V

    const/16 p2, 0x9

    .line 306
    new-array v0, p2, [F

    .line 307
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 308
    new-array p1, p2, [F

    .line 309
    invoke-virtual {v5, p1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 310
    new-instance v4, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;

    invoke-direct {v4, v2, v0}, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;-><init>(Landroid/view/View;[F)V

    .line 313
    sget-object v1, Landroidx/transition/ChangeTransform;->RemoteActionCompatParcelizer:Landroid/util/Property;

    new-instance v6, Lo/CandleEntry;

    new-array p2, p2, [F

    invoke-direct {v6, p2}, Lo/CandleEntry;-><init>([F)V

    filled-new-array {v0, p1}, [[F

    move-result-object p2

    invoke-static {v1, v6, p2}, Landroid/animation/PropertyValuesHolder;->ofObject(Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object p2

    .line 316
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaDescriptionCompat()Landroidx/transition/PathMotion;

    move-result-object v1

    const/4 v6, 0x2

    aget v7, v0, v6

    const/4 v8, 0x5

    aget v0, v0, v8

    aget v6, p1, v6

    aget p1, p1, v8

    invoke-virtual {v1, v7, v0, v6, p1}, Landroidx/transition/PathMotion;->write(FFFF)Landroid/graphics/Path;

    move-result-object p1

    .line 319
    sget-object v0, Landroidx/transition/ChangeTransform;->MediaMetadataCompat:Landroid/util/Property;

    invoke-static {v0, p1}, Lo/AdWordsRemarketingReporter;->IconCompatParcelizer(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;

    move-result-object p1

    .line 321
    filled-new-array {p2, p1}, [Landroid/animation/PropertyValuesHolder;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 324
    new-instance p2, Landroidx/transition/ChangeTransform$IconCompatParcelizer;

    iget-boolean v7, p0, Landroidx/transition/ChangeTransform;->MediaBrowserCompatMediaItem:Z

    move-object v1, p2

    move v6, p3

    invoke-direct/range {v1 .. v7}, Landroidx/transition/ChangeTransform$IconCompatParcelizer;-><init>(Landroid/view/View;Landroidx/transition/ChangeTransform$read;Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;Landroid/graphics/Matrix;ZZ)V

    .line 327
    invoke-virtual {p1, p2}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 328
    invoke-virtual {p1, p2}, Landroid/animation/ObjectAnimator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    return-object p1
.end method

.method static write(Landroid/view/View;)V
    .registers 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    .line 400
    invoke-static/range {v0 .. v8}, Landroidx/transition/ChangeTransform;->RemoteActionCompatParcelizer(Landroid/view/View;FFFFFFFF)V

    return-void
.end method

.method private write(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)V
    .registers 7

    .line 347
    iget-object v0, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 349
    iget-object v1, p3, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:changeTransform:parentMatrix"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    .line 350
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 351
    invoke-static {p1, v2}, Lo/ab;->AudioAttributesCompatParcelizer(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 353
    invoke-static {v0, p1, v2}, Lo/disableAutomatedUsageReporting;->read(Landroid/view/View;Landroid/view/ViewGroup;Landroid/graphics/Matrix;)Lo/PieEntry;

    move-result-object p1

    if-eqz p1, :cond_4d

    .line 358
    iget-object v1, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:changeTransform:parent"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iget-object v2, p2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-interface {p1, v1, v2}, Lo/PieEntry;->IconCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 362
    :goto_29
    iget-object v1, p0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    if-eqz v1, :cond_30

    .line 363
    iget-object p0, p0, Landroidx/transition/Transition;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/TransitionSet;

    goto :goto_29

    .line 366
    :cond_30
    new-instance v1, Landroidx/transition/ChangeTransform$write;

    invoke-direct {v1, v0, p1}, Landroidx/transition/ChangeTransform$write;-><init>(Landroid/view/View;Lo/PieEntry;)V

    .line 367
    invoke-virtual {p0, v1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    .line 371
    sget-boolean p0, Landroidx/transition/ChangeTransform;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz p0, :cond_4d

    .line 372
    iget-object p0, p2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    iget-object p1, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    if-eq p0, p1, :cond_48

    .line 373
    iget-object p0, p2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lo/ab;->write(Landroid/view/View;F)V

    :cond_48
    const/high16 p0, 0x3f800000    # 1.0f

    .line 375
    invoke-static {v0, p0}, Lo/ab;->write(Landroid/view/View;F)V

    :cond_4d
    return-void
.end method

.method private write(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .registers 6

    .line 334
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeTransform;->read(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1a

    invoke-virtual {p0, p2}, Landroidx/transition/ChangeTransform;->read(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 337
    invoke-virtual {p0, p1, v2}, Landroidx/transition/ChangeTransform;->IconCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object p0

    if-eqz p0, :cond_19

    .line 339
    iget-object p0, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    if-ne p2, p0, :cond_19

    return v2

    :cond_19
    return v1

    :cond_1a
    if-ne p1, p2, :cond_1d

    return v2

    :cond_1d
    return v1
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 2

    .line 236
    invoke-direct {p0, p1}, Landroidx/transition/ChangeTransform;->AudioAttributesCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 9

    if-eqz p2, :cond_78

    if-eqz p3, :cond_78

    .line 243
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    .line 244
    const-string v1, "android:changeTransform:parent"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_78

    iget-object v0, p3, Lo/Rstring;->read:Ljava/util/Map;

    .line 245
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_78

    .line 249
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 250
    iget-object v2, p3, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 251
    iget-boolean v2, p0, Landroidx/transition/ChangeTransform;->MediaDescriptionCompat:Z

    if-eqz v2, :cond_32

    invoke-direct {p0, v0, v1}, Landroidx/transition/ChangeTransform;->write(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z

    move-result v1

    if-nez v1, :cond_32

    const/4 v1, 0x1

    goto :goto_33

    :cond_32
    const/4 v1, 0x0

    .line 253
    :goto_33
    iget-object v2, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v3, "android:changeTransform:intermediateMatrix"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Matrix;

    if-eqz v2, :cond_46

    .line 255
    iget-object v3, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v4, "android:changeTransform:matrix"

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    :cond_46
    iget-object v2, p2, Lo/Rstring;->read:Ljava/util/Map;

    .line 259
    const-string v3, "android:changeTransform:intermediateParentMatrix"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Matrix;

    if-eqz v2, :cond_59

    .line 261
    iget-object v3, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v4, "android:changeTransform:parentMatrix"

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_59
    if-eqz v1, :cond_5e

    .line 266
    invoke-direct {p0, p2, p3}, Landroidx/transition/ChangeTransform;->AudioAttributesCompatParcelizer(Lo/Rstring;Lo/Rstring;)V

    .line 270
    :cond_5e
    invoke-direct {p0, p2, p3, v1}, Landroidx/transition/ChangeTransform;->write(Lo/Rstring;Lo/Rstring;Z)Landroid/animation/ObjectAnimator;

    move-result-object v2

    if-eqz v1, :cond_6e

    if-eqz v2, :cond_6e

    .line 273
    iget-boolean v1, p0, Landroidx/transition/ChangeTransform;->MediaBrowserCompatMediaItem:Z

    if-eqz v1, :cond_6e

    .line 274
    invoke-direct {p0, p1, p2, p3}, Landroidx/transition/ChangeTransform;->write(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)V

    return-object v2

    .line 275
    :cond_6e
    sget-boolean p0, Landroidx/transition/ChangeTransform;->AudioAttributesImplApi21Parcelizer:Z

    if-nez p0, :cond_77

    .line 277
    iget-object p0, p2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    :cond_77
    return-object v2

    :cond_78
    const/4 p0, 0x0

    return-object p0
.end method

.method public final read(Lo/Rstring;)V
    .registers 2

    .line 224
    invoke-direct {p0, p1}, Landroidx/transition/ChangeTransform;->AudioAttributesCompatParcelizer(Lo/Rstring;)V

    .line 225
    sget-boolean p0, Landroidx/transition/ChangeTransform;->AudioAttributesImplApi21Parcelizer:Z

    if-nez p0, :cond_14

    .line 229
    iget-object p0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    iget-object p1, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    :cond_14
    return-void
.end method

.method public final write()[Ljava/lang/String;
    .registers 1

    .line 191
    sget-object p0, Landroidx/transition/ChangeTransform;->MediaBrowserCompatSearchResultReceiver:[Ljava/lang/String;

    return-object p0
.end method

###### Class androidx.transition.ChangeTransform.AnonymousClass2 (androidx.transition.ChangeTransform$2)
.class final Landroidx/transition/ChangeTransform$2;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    .line 86
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private static write(Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;Landroid/graphics/PointF;)V
    .registers 2

    .line 94
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/graphics/PointF;)V

    return-void
.end method


# virtual methods
.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 86
    check-cast p1, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 86
    check-cast p1, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;

    check-cast p2, Landroid/graphics/PointF;

    invoke-static {p1, p2}, Landroidx/transition/ChangeTransform$2;->write(Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;Landroid/graphics/PointF;)V

    return-void
.end method

###### Class androidx.transition.ChangeTransform.AnonymousClass4 (androidx.transition.ChangeTransform$4)
.class final Landroidx/transition/ChangeTransform$4;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;",
        "[F>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .registers 3

    .line 70
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;[F)V
    .registers 2

    .line 78
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->read([F)V

    return-void
.end method


# virtual methods
.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 70
    check-cast p1, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 70
    check-cast p1, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;

    check-cast p2, [F

    invoke-static {p1, p2}, Landroidx/transition/ChangeTransform$4;->RemoteActionCompatParcelizer(Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;[F)V

    return-void
.end method

###### Class androidx.transition.ChangeTransform.IconCompatParcelizer (androidx.transition.ChangeTransform$IconCompatParcelizer)
.class final Landroidx/transition/ChangeTransform$IconCompatParcelizer;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;

.field private final AudioAttributesImplApi26Parcelizer:Landroid/view/View;

.field private final AudioAttributesImplBaseParcelizer:Z

.field private final IconCompatParcelizer:Landroid/graphics/Matrix;

.field private final MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/ChangeTransform$read;

.field private final RemoteActionCompatParcelizer:Z

.field private final read:Landroid/graphics/Matrix;

.field private write:Z


# direct methods
.method constructor <init>(Landroid/view/View;Landroidx/transition/ChangeTransform$read;Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;Landroid/graphics/Matrix;ZZ)V
    .registers 8

    .line 560
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 551
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->read:Landroid/graphics/Matrix;

    .line 561
    iput-boolean p5, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    .line 562
    iput-boolean p6, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    .line 563
    iput-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    .line 564
    iput-object p2, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/ChangeTransform$read;

    .line 565
    iput-object p3, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;

    .line 566
    iput-object p4, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->IconCompatParcelizer:Landroid/graphics/Matrix;

    return-void
.end method

.method private write(Landroid/graphics/Matrix;)V
    .registers 4

    .line 600
    iget-object v0, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->read:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 601
    iget-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    sget v0, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_transform:I

    iget-object v1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->read:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 602
    iget-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/ChangeTransform$read;

    iget-object p0, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroidx/transition/ChangeTransform$read;->IconCompatParcelizer(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    .line 571
    iput-boolean p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->write:Z

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 4

    .line 576
    iget-boolean p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->write:Z

    const/4 v0, 0x0

    if-nez p1, :cond_21

    .line 577
    iget-boolean p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->RemoteActionCompatParcelizer:Z

    if-eqz p1, :cond_13

    iget-boolean p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    if-eqz p1, :cond_13

    .line 578
    iget-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->IconCompatParcelizer:Landroid/graphics/Matrix;

    invoke-direct {p0, p1}, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->write(Landroid/graphics/Matrix;)V

    goto :goto_21

    .line 580
    :cond_13
    iget-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_transform:I

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 581
    iget-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->parent_matrix:I

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 584
    :cond_21
    :goto_21
    iget-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    invoke-static {p1, v0}, Lo/ab;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 585
    iget-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Landroidx/transition/ChangeTransform$read;

    iget-object p0, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroidx/transition/ChangeTransform$read;->IconCompatParcelizer(Landroid/view/View;)V

    return-void
.end method

.method public final onAnimationPause(Landroid/animation/Animator;)V
    .registers 2

    .line 590
    iget-object p1, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;

    invoke-virtual {p1}, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Landroid/graphics/Matrix;

    move-result-object p1

    .line 591
    invoke-direct {p0, p1}, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->write(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final onAnimationResume(Landroid/animation/Animator;)V
    .registers 2

    .line 596
    iget-object p0, p0, Landroidx/transition/ChangeTransform$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Landroid/view/View;

    invoke-static {p0}, Landroidx/transition/ChangeTransform;->write(Landroid/view/View;)V

    return-void
.end method

###### Class androidx.transition.ChangeTransform.RemoteActionCompatParcelizer (androidx.transition.ChangeTransform$RemoteActionCompatParcelizer)
.class final Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/view/View;

.field private IconCompatParcelizer:F

.field private RemoteActionCompatParcelizer:F

.field private final read:Landroid/graphics/Matrix;

.field private final write:[F


# direct methods
.method constructor <init>(Landroid/view/View;[F)V
    .registers 4

    .line 518
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 512
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->read:Landroid/graphics/Matrix;

    .line 519
    iput-object p1, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 520
    invoke-virtual {p2}, [F->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    iput-object p1, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->write:[F

    const/4 p2, 0x2

    .line 521
    aget p2, p1, p2

    iput p2, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:F

    const/4 p2, 0x5

    .line 522
    aget p1, p1, p2

    iput p1, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->IconCompatParcelizer:F

    .line 523
    invoke-direct {p0}, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->read()V

    return-void
.end method

.method private read()V
    .registers 4

    .line 538
    iget-object v0, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->write:[F

    const/4 v1, 0x2

    iget v2, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:F

    aput v2, v0, v1

    const/4 v1, 0x5

    .line 539
    iget v2, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->IconCompatParcelizer:F

    aput v2, v0, v1

    .line 540
    iget-object v1, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->read:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 541
    iget-object v0, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/View;

    iget-object p0, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->read:Landroid/graphics/Matrix;

    invoke-static {v0, p0}, Lo/ab;->RemoteActionCompatParcelizer(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(Landroid/graphics/PointF;)V
    .registers 3

    .line 532
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iput v0, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:F

    .line 533
    iget p1, p1, Landroid/graphics/PointF;->y:F

    iput p1, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->IconCompatParcelizer:F

    .line 534
    invoke-direct {p0}, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->read()V

    return-void
.end method

.method final RemoteActionCompatParcelizer()Landroid/graphics/Matrix;
    .registers 1

    .line 545
    iget-object p0, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->read:Landroid/graphics/Matrix;

    return-object p0
.end method

.method final read([F)V
    .registers 5

    .line 527
    iget-object v0, p0, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->write:[F

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 528
    invoke-direct {p0}, Landroidx/transition/ChangeTransform$RemoteActionCompatParcelizer;->read()V

    return-void
.end method

###### Class androidx.transition.ChangeTransform.read (androidx.transition.ChangeTransform$read)
.class final Landroidx/transition/ChangeTransform$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# instance fields
.field final AudioAttributesCompatParcelizer:F

.field final AudioAttributesImplApi26Parcelizer:F

.field final IconCompatParcelizer:F

.field final MediaBrowserCompatCustomActionResultReceiver:F

.field final MediaBrowserCompatItemReceiver:F

.field final RemoteActionCompatParcelizer:F

.field final read:F

.field final write:F


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .registers 3

    .line 428
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 429
    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatCustomActionResultReceiver:F

    .line 430
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$read;->AudioAttributesImplApi26Parcelizer:F

    .line 431
    invoke-static {p1}, Lo/InvalidTypeIdException;->onPlay(Landroid/view/View;)F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatItemReceiver:F

    .line 432
    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$read;->RemoteActionCompatParcelizer:F

    .line 433
    invoke-virtual {p1}, Landroid/view/View;->getScaleY()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$read;->IconCompatParcelizer:F

    .line 434
    invoke-virtual {p1}, Landroid/view/View;->getRotationX()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$read;->read:F

    .line 435
    invoke-virtual {p1}, Landroid/view/View;->getRotationY()F

    move-result v0

    iput v0, p0, Landroidx/transition/ChangeTransform$read;->write:F

    .line 436
    invoke-virtual {p1}, Landroid/view/View;->getRotation()F

    move-result p1

    iput p1, p0, Landroidx/transition/ChangeTransform$read;->AudioAttributesCompatParcelizer:F

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroid/view/View;)V
    .registers 11

    .line 440
    iget v1, p0, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatCustomActionResultReceiver:F

    iget v2, p0, Landroidx/transition/ChangeTransform$read;->AudioAttributesImplApi26Parcelizer:F

    iget v3, p0, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatItemReceiver:F

    iget v4, p0, Landroidx/transition/ChangeTransform$read;->RemoteActionCompatParcelizer:F

    iget v5, p0, Landroidx/transition/ChangeTransform$read;->IconCompatParcelizer:F

    iget v6, p0, Landroidx/transition/ChangeTransform$read;->read:F

    iget v7, p0, Landroidx/transition/ChangeTransform$read;->write:F

    iget v8, p0, Landroidx/transition/ChangeTransform$read;->AudioAttributesCompatParcelizer:F

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Landroidx/transition/ChangeTransform;->RemoteActionCompatParcelizer(Landroid/view/View;FFFFFFFF)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    .line 446
    instance-of v0, p1, Landroidx/transition/ChangeTransform$read;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 449
    :cond_6
    check-cast p1, Landroidx/transition/ChangeTransform$read;

    .line 450
    iget v0, p1, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatCustomActionResultReceiver:F

    iget v2, p0, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatCustomActionResultReceiver:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_4a

    iget v0, p1, Landroidx/transition/ChangeTransform$read;->AudioAttributesImplApi26Parcelizer:F

    iget v2, p0, Landroidx/transition/ChangeTransform$read;->AudioAttributesImplApi26Parcelizer:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_4a

    iget v0, p1, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatItemReceiver:F

    iget v2, p0, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatItemReceiver:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_4a

    iget v0, p1, Landroidx/transition/ChangeTransform$read;->RemoteActionCompatParcelizer:F

    iget v2, p0, Landroidx/transition/ChangeTransform$read;->RemoteActionCompatParcelizer:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_4a

    iget v0, p1, Landroidx/transition/ChangeTransform$read;->IconCompatParcelizer:F

    iget v2, p0, Landroidx/transition/ChangeTransform$read;->IconCompatParcelizer:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_4a

    iget v0, p1, Landroidx/transition/ChangeTransform$read;->read:F

    iget v2, p0, Landroidx/transition/ChangeTransform$read;->read:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_4a

    iget v0, p1, Landroidx/transition/ChangeTransform$read;->write:F

    iget v2, p0, Landroidx/transition/ChangeTransform$read;->write:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_4a

    iget p1, p1, Landroidx/transition/ChangeTransform$read;->AudioAttributesCompatParcelizer:F

    iget p0, p0, Landroidx/transition/ChangeTransform$read;->AudioAttributesCompatParcelizer:F

    cmpl-float p0, p1, p0

    if-nez p0, :cond_4a

    const/4 p0, 0x1

    return p0

    :cond_4a
    return v1
.end method

.method public final hashCode()I
    .registers 11

    .line 462
    iget v0, p0, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatCustomActionResultReceiver:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    const/4 v3, 0x0

    if-eqz v2, :cond_d

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    goto :goto_e

    :cond_d
    move v0, v3

    .line 463
    :goto_e
    iget v2, p0, Landroidx/transition/ChangeTransform$read;->AudioAttributesImplApi26Parcelizer:F

    cmpl-float v4, v2, v1

    if-eqz v4, :cond_19

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    goto :goto_1a

    :cond_19
    move v2, v3

    .line 464
    :goto_1a
    iget v4, p0, Landroidx/transition/ChangeTransform$read;->MediaBrowserCompatItemReceiver:F

    cmpl-float v5, v4, v1

    if-eqz v5, :cond_25

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto :goto_26

    :cond_25
    move v4, v3

    .line 465
    :goto_26
    iget v5, p0, Landroidx/transition/ChangeTransform$read;->RemoteActionCompatParcelizer:F

    cmpl-float v6, v5, v1

    if-eqz v6, :cond_31

    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v5

    goto :goto_32

    :cond_31
    move v5, v3

    .line 466
    :goto_32
    iget v6, p0, Landroidx/transition/ChangeTransform$read;->IconCompatParcelizer:F

    cmpl-float v7, v6, v1

    if-eqz v7, :cond_3d

    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v6

    goto :goto_3e

    :cond_3d
    move v6, v3

    .line 467
    :goto_3e
    iget v7, p0, Landroidx/transition/ChangeTransform$read;->read:F

    cmpl-float v8, v7, v1

    if-eqz v8, :cond_49

    invoke-static {v7}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v7

    goto :goto_4a

    :cond_49
    move v7, v3

    .line 468
    :goto_4a
    iget v8, p0, Landroidx/transition/ChangeTransform$read;->write:F

    cmpl-float v9, v8, v1

    if-eqz v9, :cond_55

    invoke-static {v8}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v8

    goto :goto_56

    :cond_55
    move v8, v3

    .line 469
    :goto_56
    iget p0, p0, Landroidx/transition/ChangeTransform$read;->AudioAttributesCompatParcelizer:F

    cmpl-float v1, p0, v1

    if-eqz v1, :cond_60

    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    :cond_60
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v5

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v6

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v7

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v8

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    return v0
.end method

###### Class androidx.transition.ChangeTransform.write (androidx.transition.ChangeTransform$write)
.class final Landroidx/transition/ChangeTransform$write;
.super Lo/GoogleConversionReporter1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# instance fields
.field private IconCompatParcelizer:Lo/PieEntry;

.field private RemoteActionCompatParcelizer:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;Lo/PieEntry;)V
    .registers 3

    .line 480
    invoke-direct {p0}, Lo/GoogleConversionReporter1;-><init>()V

    .line 481
    iput-object p1, p0, Landroidx/transition/ChangeTransform$write;->RemoteActionCompatParcelizer:Landroid/view/View;

    .line 482
    iput-object p2, p0, Landroidx/transition/ChangeTransform$write;->IconCompatParcelizer:Lo/PieEntry;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    .line 500
    iget-object p0, p0, Landroidx/transition/ChangeTransform$write;->IconCompatParcelizer:Lo/PieEntry;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lo/PieEntry;->setVisibility(I)V

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 2

    .line 495
    iget-object p0, p0, Landroidx/transition/ChangeTransform$write;->IconCompatParcelizer:Lo/PieEntry;

    const/4 v0, 0x4

    invoke-interface {p0, v0}, Lo/PieEntry;->setVisibility(I)V

    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 4

    .line 487
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    .line 488
    iget-object p1, p0, Landroidx/transition/ChangeTransform$write;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-static {p1}, Lo/disableAutomatedUsageReporting;->IconCompatParcelizer(Landroid/view/View;)V

    .line 489
    iget-object p1, p0, Landroidx/transition/ChangeTransform$write;->RemoteActionCompatParcelizer:Landroid/view/View;

    sget v0, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_transform:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 490
    iget-object p0, p0, Landroidx/transition/ChangeTransform$write;->RemoteActionCompatParcelizer:Landroid/view/View;

    sget p1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->parent_matrix:I

    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
