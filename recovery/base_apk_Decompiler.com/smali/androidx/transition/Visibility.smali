###### Class androidx.transition.Visibility (androidx.transition.Visibility)
.class public abstract Landroidx/transition/Visibility;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Visibility$RemoteActionCompatParcelizer;,
        Landroidx/transition/Visibility$read;,
        Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;
    }
.end annotation


# static fields
.field private static final RemoteActionCompatParcelizer:[Ljava/lang/String;


# instance fields
.field private AudioAttributesImplApi21Parcelizer:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 82
    const-string v0, "android:visibility:visibility"

    const-string v1, "android:visibility:parent"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/transition/Visibility;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 101
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x3

    .line 99
    iput v0, p0, Landroidx/transition/Visibility;->AudioAttributesImplApi21Parcelizer:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 5

    .line 105
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x3

    .line 99
    iput v0, p0, Landroidx/transition/Visibility;->AudioAttributesImplApi21Parcelizer:I

    .line 106
    sget-object v0, Lo/recordRemarketingPing;->MediaBrowserCompatItemReceiver:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 108
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v0, "transitionVisibilityMode"

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, v1}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 111
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_1d

    .line 113
    invoke-virtual {p0, p2}, Landroidx/transition/Visibility;->read(I)V

    :cond_1d
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 8

    .line 281
    iget v0, p0, Landroidx/transition/Visibility;->AudioAttributesImplApi21Parcelizer:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2c

    if-eqz p3, :cond_2c

    if-nez p2, :cond_25

    .line 285
    iget-object v0, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    .line 286
    invoke-virtual {p0, v0, v1}, Landroidx/transition/Visibility;->IconCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object v3

    .line 288
    invoke-virtual {p0, v0, v1}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object v0

    .line 290
    invoke-static {v3, v0}, Landroidx/transition/Visibility;->write(Lo/Rstring;Lo/Rstring;)Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;

    move-result-object v0

    .line 291
    iget-boolean v0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_25

    return-object v2

    .line 295
    :cond_25
    iget-object v0, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0, p1, v0, p2, p3}, Landroidx/transition/Visibility;->read(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0

    :cond_2c
    return-object v2
.end method

.method private AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;I)Landroid/animation/Animator;
    .registers 15

    .line 339
    iget v0, p0, Landroidx/transition/Visibility;->AudioAttributesImplApi21Parcelizer:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_8

    return-object v2

    :cond_8
    if-nez p2, :cond_b

    return-object v2

    .line 348
    :cond_b
    iget-object v0, p2, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    if-eqz p3, :cond_12

    .line 349
    iget-object v3, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    goto :goto_13

    :cond_12
    move-object v3, v2

    .line 354
    :goto_13
    sget v4, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->save_overlay_view:I

    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_23

    move-object v3, v2

    move v7, v5

    goto/16 :goto_86

    :cond_23
    if-eqz v3, :cond_34

    .line 364
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_34

    const/4 v4, 0x4

    if-eq p4, v4, :cond_30

    if-ne v0, v3, :cond_39

    :cond_30
    move-object v4, v3

    move v7, v6

    move-object v3, v2

    goto :goto_3c

    :cond_34
    if-eqz v3, :cond_39

    move-object v4, v2

    move v7, v6

    goto :goto_3c

    :cond_39
    move-object v3, v2

    move-object v4, v3

    move v7, v5

    :goto_3c
    if-eqz v7, :cond_82

    .line 389
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_7e

    .line 392
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v3, v3, Landroid/view/View;

    if-eqz v3, :cond_7c

    .line 393
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 394
    invoke-virtual {p0, v3, v5}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object v7

    .line 395
    invoke-virtual {p0, v3, v5}, Landroidx/transition/Visibility;->IconCompatParcelizer(Landroid/view/View;Z)Lo/Rstring;

    move-result-object v8

    .line 398
    invoke-static {v7, v8}, Landroidx/transition/Visibility;->write(Lo/Rstring;Lo/Rstring;)Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;

    move-result-object v7

    .line 399
    iget-boolean v7, v7, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    if-nez v7, :cond_67

    .line 400
    invoke-static {p1, v0, v3}, Lo/Rinteger;->read(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    goto :goto_82

    .line 403
    :cond_67
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v7

    .line 404
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_7c

    const/4 v3, -0x1

    if-eq v7, v3, :cond_7c

    .line 405
    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_7c

    iget-boolean v3, p0, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer:Z

    :cond_7c
    move-object v3, v2

    goto :goto_82

    :cond_7e
    move-object v4, v0

    move-object v3, v2

    move v7, v6

    goto :goto_86

    :cond_82
    :goto_82
    move v7, v6

    move-object v9, v4

    move-object v4, v3

    move-object v3, v9

    :goto_86
    if-eqz v4, :cond_de

    if-nez v7, :cond_b6

    .line 420
    iget-object p4, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:visibility:screenLocation"

    invoke-interface {p4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [I

    .line 421
    aget v2, p4, v6

    .line 422
    aget p4, p4, v5

    .line 423
    new-array v1, v1, [I

    .line 424
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 425
    aget v3, v1, v6

    sub-int/2addr v2, v3

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v4, v2}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 426
    aget v1, v1, v5

    sub-int/2addr p4, v1

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr p4, v1

    invoke-virtual {v4, p4}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 427
    invoke-static {p1, v4}, Lo/InvalidTypeIdException;->write(Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 429
    :cond_b6
    invoke-virtual {p0, p1, v4, p2, p3}, Landroidx/transition/Visibility;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;

    move-result-object p2

    if-nez v7, :cond_dd

    if-nez p2, :cond_c6

    .line 432
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p0

    invoke-virtual {p0, v4}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-object p2

    .line 434
    :cond_c6
    sget p3, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->save_overlay_view:I

    invoke-virtual {v0, p3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 436
    new-instance p3, Landroidx/transition/Visibility$read;

    invoke-direct {p3, p0, p1, v4, v0}, Landroidx/transition/Visibility$read;-><init>(Landroidx/transition/Visibility;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    .line 439
    invoke-virtual {p2, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 440
    invoke-virtual {p2, p3}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 441
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver()Landroidx/transition/Transition;

    move-result-object p0

    invoke-virtual {p0, p3}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    :cond_dd
    return-object p2

    :cond_de
    if-eqz v3, :cond_101

    .line 448
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v0

    .line 449
    invoke-static {v3, v6}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;I)V

    .line 450
    invoke-virtual {p0, p1, v3, p2, p3}, Landroidx/transition/Visibility;->RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_fd

    .line 452
    new-instance p2, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;

    invoke-direct {p2, v3, p4}, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;-><init>(Landroid/view/View;I)V

    .line 454
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 455
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver()Landroidx/transition/Transition;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    return-object p1

    .line 457
    :cond_fd
    invoke-static {v3, v0}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;I)V

    return-object p1

    :cond_101
    return-object v2
.end method

.method private static IconCompatParcelizer(Lo/Rstring;)V
    .registers 4

    .line 148
    iget-object v0, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    .line 149
    iget-object v1, p0, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:visibility:visibility"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    iget-object v0, p0, Lo/Rstring;->read:Ljava/util/Map;

    iget-object v1, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v2, "android:visibility:parent"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    .line 151
    new-array v0, v0, [I

    .line 152
    iget-object v1, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 153
    iget-object p0, p0, Lo/Rstring;->read:Ljava/util/Map;

    const-string v1, "android:visibility:screenLocation"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static write(Lo/Rstring;Lo/Rstring;)Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;
    .registers 9

    .line 193
    new-instance v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;-><init>()V

    const/4 v1, 0x0

    .line 194
    iput-boolean v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    .line 195
    iput-boolean v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->write:Z

    .line 196
    const-string v2, "android:visibility:parent"

    const/4 v3, 0x0

    const/4 v4, -0x1

    const-string v5, "android:visibility:visibility"

    if-eqz p0, :cond_33

    iget-object v6, p0, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_33

    .line 197
    iget-object v6, p0, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    iput v6, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 198
    iget-object v6, p0, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iput-object v6, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    goto :goto_37

    .line 200
    :cond_33
    iput v4, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 201
    iput-object v3, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    :goto_37
    if-eqz p1, :cond_5a

    .line 203
    iget-object v6, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5a

    .line 204
    iget-object v3, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iput v3, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    .line 205
    iget-object v3, p1, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    goto :goto_5e

    .line 207
    :cond_5a
    iput v4, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    .line 208
    iput-object v3, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    :goto_5e
    const/4 v2, 0x1

    if-eqz p0, :cond_99

    if-eqz p1, :cond_99

    .line 211
    iget p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    iget p1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    if-ne p0, p1, :cond_6f

    iget-object p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    iget-object p1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    if-eq p0, p1, :cond_ae

    .line 215
    :cond_6f
    iget p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    iget p1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    if-eq p0, p1, :cond_87

    .line 216
    iget p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    if-nez p0, :cond_7e

    .line 217
    iput-boolean v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->write:Z

    .line 218
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    return-object v0

    .line 219
    :cond_7e
    iget p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    if-nez p0, :cond_ae

    .line 220
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->write:Z

    .line 221
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    return-object v0

    .line 225
    :cond_87
    iget-object p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    if-nez p0, :cond_90

    .line 226
    iput-boolean v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->write:Z

    .line 227
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    return-object v0

    .line 228
    :cond_90
    iget-object p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    if-nez p0, :cond_ae

    .line 229
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->write:Z

    .line 230
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    return-object v0

    :cond_99
    if-nez p0, :cond_a4

    .line 234
    iget p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    if-nez p0, :cond_a4

    .line 235
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->write:Z

    .line 236
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    return-object v0

    :cond_a4
    if-nez p1, :cond_ae

    .line 237
    iget p0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    if-nez p0, :cond_ae

    .line 238
    iput-boolean v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->write:Z

    .line 239
    iput-boolean v2, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    :cond_ae
    return-object v0
.end method


# virtual methods
.method public RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 5

    const/4 p0, 0x0

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 2

    .line 163
    invoke-static {p1}, Landroidx/transition/Visibility;->IconCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/Rstring;Lo/Rstring;)Z
    .registers 6

    const/4 p0, 0x0

    if-nez p1, :cond_6

    if-nez p2, :cond_6

    return p0

    :cond_6
    if-eqz p1, :cond_1b

    if-eqz p2, :cond_1b

    .line 491
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    .line 492
    const-string v1, "android:visibility:visibility"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p1, Lo/Rstring;->read:Ljava/util/Map;

    .line 493
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eq v0, v1, :cond_1b

    return p0

    .line 498
    :cond_1b
    invoke-static {p1, p2}, Landroidx/transition/Visibility;->write(Lo/Rstring;Lo/Rstring;)Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;

    move-result-object p1

    .line 499
    iget-boolean p2, p1, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz p2, :cond_2c

    iget p2, p1, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    if-eqz p2, :cond_2b

    iget p1, p1, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    if-nez p1, :cond_2c

    :cond_2b
    const/4 p0, 0x1

    :cond_2c
    return p0
.end method

.method public final onPlayFromMediaId()I
    .registers 1

    .line 139
    iget p0, p0, Landroidx/transition/Visibility;->AudioAttributesImplApi21Parcelizer:I

    return p0
.end method

.method public read(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 5

    const/4 p0, 0x0

    return-object p0
.end method

.method public final read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 6

    .line 247
    invoke-static {p2, p3}, Landroidx/transition/Visibility;->write(Lo/Rstring;Lo/Rstring;)Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;

    move-result-object v0

    .line 248
    iget-boolean v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v1, :cond_26

    iget-object v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    if-nez v1, :cond_10

    iget-object v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

    if-eqz v1, :cond_26

    .line 250
    :cond_10
    iget-boolean v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->write:Z

    if-eqz v1, :cond_1d

    .line 251
    iget v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    iget v0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    invoke-direct {p0, p1, p2, p3}, Landroidx/transition/Visibility;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0

    .line 254
    :cond_1d
    iget v1, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    iget v0, v0, Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;->read:I

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/transition/Visibility;->AudioAttributesCompatParcelizer(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;I)Landroid/animation/Animator;

    move-result-object p0

    return-object p0

    :cond_26
    const/4 p0, 0x0

    return-object p0
.end method

.method public final read(I)V
    .registers 3

    and-int/lit8 v0, p1, -0x4

    if-nez v0, :cond_7

    .line 128
    iput p1, p0, Landroidx/transition/Visibility;->AudioAttributesImplApi21Parcelizer:I

    return-void

    .line 126
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Only MODE_IN and MODE_OUT flags are allowed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public read(Lo/Rstring;)V
    .registers 2

    .line 158
    invoke-static {p1}, Landroidx/transition/Visibility;->IconCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final write()[Ljava/lang/String;
    .registers 1

    .line 144
    sget-object p0, Landroidx/transition/Visibility;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    return-object p0
.end method

###### Class androidx.transition.Visibility.AudioAttributesCompatParcelizer (androidx.transition.Visibility$AudioAttributesCompatParcelizer)
.class final Landroidx/transition/Visibility$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Visibility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field AudioAttributesCompatParcelizer:Landroid/view/ViewGroup;

.field AudioAttributesImplApi26Parcelizer:Z

.field IconCompatParcelizer:I

.field RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

.field read:I

.field write:Z


# direct methods
.method constructor <init>()V
    .registers 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

###### Class androidx.transition.Visibility.RemoteActionCompatParcelizer (androidx.transition.Visibility$RemoteActionCompatParcelizer)
.class final Landroidx/transition/Visibility$RemoteActionCompatParcelizer;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Visibility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private final AudioAttributesImplBaseParcelizer:Landroid/view/View;

.field private final IconCompatParcelizer:Landroid/view/ViewGroup;

.field private final RemoteActionCompatParcelizer:I

.field private final read:Z

.field private write:Z


# direct methods
.method constructor <init>(Landroid/view/View;I)V
    .registers 4

    .line 514
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    .line 512
    iput-boolean v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    .line 515
    iput-object p1, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/view/View;

    .line 516
    iput p2, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 517
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/view/ViewGroup;

    const/4 p1, 0x1

    .line 518
    iput-boolean p1, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->read:Z

    .line 520
    invoke-direct {p0, p1}, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->write(Z)V

    return-void
.end method

.method private write()V
    .registers 3

    .line 589
    iget-boolean v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-nez v0, :cond_12

    .line 591
    iget-object v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/view/View;

    iget v1, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-static {v0, v1}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;I)V

    .line 592
    iget-object v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_12

    .line 593
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_12
    const/4 v0, 0x0

    .line 597
    invoke-direct {p0, v0}, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->write(Z)V

    return-void
.end method

.method private write(Z)V
    .registers 3

    .line 601
    iget-boolean v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->read:Z

    if-eqz v0, :cond_11

    iget-boolean v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->write:Z

    if-eq v0, p1, :cond_11

    iget-object v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_11

    .line 602
    iput-boolean p1, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->write:Z

    .line 603
    invoke-static {v0, p1}, Lo/getPackageManager;->write(Landroid/view/ViewGroup;Z)V

    :cond_11
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 2

    const/4 v0, 0x1

    .line 582
    invoke-direct {p0, v0}, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->write(Z)V

    .line 583
    iget-boolean v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-nez v0, :cond_e

    .line 584
    iget-object p0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/view/View;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;I)V

    :cond_e
    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 574
    invoke-direct {p0, v0}, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->write(Z)V

    .line 575
    iget-boolean v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-nez v0, :cond_f

    .line 576
    iget-object v0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/view/View;

    iget p0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-static {v0, p0}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;I)V

    :cond_f
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    .line 525
    iput-boolean p1, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 2

    .line 538
    invoke-direct {p0}, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->write()V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .registers 3

    if-nez p2, :cond_5

    .line 554
    invoke-direct {p0}, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->write()V

    :cond_5
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .registers 2

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .registers 3

    if-eqz p2, :cond_f

    .line 544
    iget-object p1, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/view/View;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;I)V

    .line 545
    iget-object p0, p0, Landroidx/transition/Visibility$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/view/ViewGroup;

    if-eqz p0, :cond_f

    .line 546
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_f
    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 2

    .line 565
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    return-void
.end method

###### Class androidx.transition.Visibility.read (androidx.transition.Visibility$read)
.class final Landroidx/transition/Visibility$read;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Visibility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "read"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/view/View;

.field private IconCompatParcelizer:Z

.field private final RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

.field private final read:Landroid/view/View;

.field final synthetic write:Landroidx/transition/Visibility;


# direct methods
.method constructor <init>(Landroidx/transition/Visibility;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .registers 5

    .line 614
    iput-object p1, p0, Landroidx/transition/Visibility$read;->write:Landroidx/transition/Visibility;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x1

    .line 612
    iput-boolean p1, p0, Landroidx/transition/Visibility$read;->IconCompatParcelizer:Z

    .line 615
    iput-object p2, p0, Landroidx/transition/Visibility$read;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    .line 616
    iput-object p3, p0, Landroidx/transition/Visibility$read;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 617
    iput-object p4, p0, Landroidx/transition/Visibility$read;->read:Landroid/view/View;

    return-void
.end method

.method private RemoteActionCompatParcelizer()V
    .registers 4

    .line 680
    iget-object v0, p0, Landroidx/transition/Visibility$read;->read:Landroid/view/View;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->save_overlay_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 681
    iget-object v0, p0, Landroidx/transition/Visibility$read;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v0

    iget-object v1, p0, Landroidx/transition/Visibility$read;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 682
    iput-boolean v0, p0, Landroidx/transition/Visibility$read;->IconCompatParcelizer:Z

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    .line 674
    iget-boolean p1, p0, Landroidx/transition/Visibility$read;->IconCompatParcelizer:Z

    if-eqz p1, :cond_7

    .line 675
    invoke-direct {p0}, Landroidx/transition/Visibility$read;->RemoteActionCompatParcelizer()V

    :cond_7
    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 1

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 2

    .line 645
    invoke-direct {p0}, Landroidx/transition/Visibility$read;->RemoteActionCompatParcelizer()V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .registers 3

    if-nez p2, :cond_5

    .line 651
    invoke-direct {p0}, Landroidx/transition/Visibility$read;->RemoteActionCompatParcelizer()V

    :cond_5
    return-void
.end method

.method public final onAnimationPause(Landroid/animation/Animator;)V
    .registers 2

    .line 622
    iget-object p1, p0, Landroidx/transition/Visibility$read;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    iget-object p0, p0, Landroidx/transition/Visibility$read;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-void
.end method

.method public final onAnimationResume(Landroid/animation/Animator;)V
    .registers 2

    .line 627
    iget-object p1, p0, Landroidx/transition/Visibility$read;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_10

    .line 628
    iget-object p1, p0, Landroidx/transition/Visibility$read;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    iget-object p0, p0, Landroidx/transition/Visibility$read;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-static {p1, p0}, Lo/InvalidTypeIdException;->write(Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void

    .line 630
    :cond_10
    iget-object p0, p0, Landroidx/transition/Visibility$read;->write:Landroidx/transition/Visibility;

    invoke-virtual {p0}, Landroidx/transition/Visibility;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .registers 4

    if-eqz p2, :cond_15

    .line 637
    iget-object p1, p0, Landroidx/transition/Visibility$read;->read:Landroid/view/View;

    sget p2, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->save_overlay_view:I

    iget-object v0, p0, Landroidx/transition/Visibility$read;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 638
    iget-object p1, p0, Landroidx/transition/Visibility$read;->RemoteActionCompatParcelizer:Landroid/view/ViewGroup;

    iget-object p2, p0, Landroidx/transition/Visibility$read;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-static {p1, p2}, Lo/InvalidTypeIdException;->write(Landroid/view/ViewGroup;Landroid/view/View;)V

    const/4 p1, 0x1

    .line 639
    iput-boolean p1, p0, Landroidx/transition/Visibility$read;->IconCompatParcelizer:Z

    :cond_15
    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 2

    .line 657
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->AudioAttributesCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    return-void
.end method
