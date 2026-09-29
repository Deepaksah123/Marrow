###### Class androidx.transition.ChangeImageTransform (androidx.transition.ChangeImageTransform)
.class public Landroidx/transition/ChangeImageTransform;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;
    }
.end annotation


# static fields
.field private static final AudioAttributesImplApi21Parcelizer:Landroid/animation/TypeEvaluator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/animation/TypeEvaluator<",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field

.field private static final MediaDescriptionCompat:[Ljava/lang/String;

.field private static final RemoteActionCompatParcelizer:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/widget/ImageView;",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 51
    const-string v0, "android:changeImageTransform:matrix"

    const-string v1, "android:changeImageTransform:bounds"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/transition/ChangeImageTransform;->MediaDescriptionCompat:[Ljava/lang/String;

    .line 56
    new-instance v0, Landroidx/transition/ChangeImageTransform$2;

    invoke-direct {v0}, Landroidx/transition/ChangeImageTransform$2;-><init>()V

    sput-object v0, Landroidx/transition/ChangeImageTransform;->AudioAttributesImplApi21Parcelizer:Landroid/animation/TypeEvaluator;

    .line 63
    new-instance v0, Landroidx/transition/ChangeImageTransform$4;

    const-class v1, Landroid/graphics/Matrix;

    const-string v2, "animatedTransform"

    invoke-direct {v0, v1, v2}, Landroidx/transition/ChangeImageTransform$4;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/ChangeImageTransform;->RemoteActionCompatParcelizer:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 76
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 80
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)Landroid/graphics/Matrix;
    .registers 6

    .line 235
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 236
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    int-to-float v1, v1

    div-float v3, v2, v1

    .line 240
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    .line 241
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    int-to-float v0, v0

    div-float v4, p0, v0

    .line 244
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    mul-float/2addr v1, v3

    sub-float/2addr v2, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v2, v1

    .line 248
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    mul-float/2addr v0, v3

    sub-float/2addr p0, v0

    div-float/2addr p0, v1

    .line 249
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    .line 251
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 252
    invoke-virtual {v0, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    int-to-float v1, v2

    int-to-float p0, p0

    .line 253
    invoke-virtual {v0, v1, p0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-object v0
.end method

.method private static IconCompatParcelizer(Landroid/widget/ImageView;)Landroid/graphics/Matrix;
    .registers 3

    .line 203
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 204
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-lez v1, :cond_36

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-lez v0, :cond_36

    .line 205
    sget-object v0, Landroidx/transition/ChangeImageTransform$3;->write:[I

    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_31

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2c

    .line 211
    new-instance v0, Landroid/graphics/Matrix;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    return-object v0

    .line 209
    :cond_2c
    invoke-static {p0}, Landroidx/transition/ChangeImageTransform;->AudioAttributesCompatParcelizer(Landroid/widget/ImageView;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0

    .line 207
    :cond_31
    invoke-static {p0}, Landroidx/transition/ChangeImageTransform;->RemoteActionCompatParcelizer(Landroid/widget/ImageView;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0

    .line 214
    :cond_36
    new-instance v0, Landroid/graphics/Matrix;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/animation/ObjectAnimator;
    .registers 5

    .line 198
    sget-object v0, Landroidx/transition/ChangeImageTransform;->RemoteActionCompatParcelizer:Landroid/util/Property;

    new-instance v1, Lo/Rinteger$RemoteActionCompatParcelizer;

    invoke-direct {v1}, Lo/Rinteger$RemoteActionCompatParcelizer;-><init>()V

    filled-new-array {p1, p2}, [Landroid/graphics/Matrix;

    move-result-object p1

    invoke-static {p0, v0, v1, p1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/widget/ImageView;)Landroid/graphics/Matrix;
    .registers 5

    .line 222
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 223
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 225
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 226
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p0, v0

    .line 224
    invoke-virtual {v1, v2, p0}, Landroid/graphics/Matrix;->postScale(FF)Z

    return-object v1
.end method

.method private static read(Lo/Rstring;Z)V
    .registers 8

    .line 89
    iget-object v0, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 90
    instance-of v1, v0, Landroid/widget/ImageView;

    if-eqz v1, :cond_48

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_48

    .line 93
    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 94
    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_48

    .line 98
    iget-object p0, p0, Lo/Rstring;->read:Ljava/util/Map;

    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    .line 102
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v4

    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    .line 105
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 106
    const-string v0, "android:changeImageTransform:bounds"

    invoke-interface {p0, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_3c

    .line 109
    sget p1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_image_transform:I

    invoke-virtual {v1, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Matrix;

    goto :goto_3d

    :cond_3c
    const/4 p1, 0x0

    :goto_3d
    if-nez p1, :cond_43

    .line 112
    invoke-static {v1}, Landroidx/transition/ChangeImageTransform;->IconCompatParcelizer(Landroid/widget/ImageView;)Landroid/graphics/Matrix;

    move-result-object p1

    .line 114
    :cond_43
    const-string v0, "android:changeImageTransform:matrix"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_48
    return-void
.end method

.method private static write(Landroid/widget/ImageView;)Landroid/animation/ObjectAnimator;
    .registers 5

    .line 192
    sget-object v0, Landroidx/transition/ChangeImageTransform;->RemoteActionCompatParcelizer:Landroid/util/Property;

    sget-object v1, Landroidx/transition/ChangeImageTransform;->AudioAttributesImplApi21Parcelizer:Landroid/animation/TypeEvaluator;

    sget-object v2, Lo/registerReferrer;->write:Landroid/graphics/Matrix;

    sget-object v3, Lo/registerReferrer;->write:Landroid/graphics/Matrix;

    filled-new-array {v2, v3}, [Landroid/graphics/Matrix;

    move-result-object v2

    invoke-static {p0, v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 2

    const/4 p0, 0x0

    .line 124
    invoke-static {p1, p0}, Landroidx/transition/ChangeImageTransform;->read(Lo/Rstring;Z)V

    return-void
.end method

.method public final read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 8

    const/4 p1, 0x0

    if-eqz p2, :cond_7e

    if-eqz p3, :cond_7e

    .line 149
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v1, "android:changeImageTransform:bounds"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 150
    iget-object v2, p3, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    if-eqz v0, :cond_7e

    if-eqz v1, :cond_7e

    .line 155
    iget-object p2, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:changeImageTransform:matrix"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Matrix;

    .line 156
    iget-object v3, p3, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Matrix;

    if-nez p2, :cond_31

    if-eqz v2, :cond_39

    :cond_31
    if-eqz p2, :cond_3b

    .line 159
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3b

    :cond_39
    const/4 v3, 0x1

    goto :goto_3c

    :cond_3b
    const/4 v3, 0x0

    .line 161
    :goto_3c
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_45

    if-eqz v3, :cond_45

    return-object p1

    .line 165
    :cond_45
    iget-object p1, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    check-cast p1, Landroid/widget/ImageView;

    .line 166
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    .line 167
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 168
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p3

    if-lez v0, :cond_79

    if-lez p3, :cond_79

    if-nez p2, :cond_5d

    .line 175
    sget-object p2, Lo/registerReferrer;->write:Landroid/graphics/Matrix;

    :cond_5d
    if-nez v2, :cond_61

    .line 178
    sget-object v2, Lo/registerReferrer;->write:Landroid/graphics/Matrix;

    .line 180
    :cond_61
    sget-object p3, Landroidx/transition/ChangeImageTransform;->RemoteActionCompatParcelizer:Landroid/util/Property;

    invoke-virtual {p3, p1, p2}, Landroid/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    invoke-static {p1, p2, v2}, Landroidx/transition/ChangeImageTransform;->RemoteActionCompatParcelizer(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/animation/ObjectAnimator;

    move-result-object p3

    .line 182
    new-instance v0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;

    invoke-direct {v0, p1, p2, v2}, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;-><init>(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V

    .line 183
    invoke-virtual {p3, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 184
    invoke-virtual {p3, v0}, Landroid/animation/ObjectAnimator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 185
    invoke-virtual {p0, v0}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    return-object p3

    .line 172
    :cond_79
    invoke-static {p1}, Landroidx/transition/ChangeImageTransform;->write(Landroid/widget/ImageView;)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0

    :cond_7e
    return-object p1
.end method

.method public final read(Lo/Rstring;)V
    .registers 2

    const/4 p0, 0x1

    .line 119
    invoke-static {p1, p0}, Landroidx/transition/ChangeImageTransform;->read(Lo/Rstring;Z)V

    return-void
.end method

.method public final read()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final write()[Ljava/lang/String;
    .registers 1

    .line 129
    sget-object p0, Landroidx/transition/ChangeImageTransform;->MediaDescriptionCompat:[Ljava/lang/String;

    return-object p0
.end method

###### Class androidx.transition.ChangeImageTransform.AnonymousClass2 (androidx.transition.ChangeImageTransform$2)
.class final Landroidx/transition/ChangeImageTransform$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeImageTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "Landroid/graphics/Matrix;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 56
    check-cast p2, Landroid/graphics/Matrix;

    check-cast p3, Landroid/graphics/Matrix;

    const/4 p0, 0x0

    return-object p0
.end method

###### Class androidx.transition.ChangeImageTransform.AnonymousClass3 (androidx.transition.ChangeImageTransform$3)
.class final synthetic Landroidx/transition/ChangeImageTransform$3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeImageTransform;
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

    .line 205
    invoke-static {}, Landroid/widget/ImageView$ScaleType;->values()[Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Landroidx/transition/ChangeImageTransform$3;->write:[I

    :try_start_9
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v0, Landroidx/transition/ChangeImageTransform$3;->write:[I

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_1d} :catch_1d

    :catch_1d
    return-void
.end method

###### Class androidx.transition.ChangeImageTransform.AnonymousClass4 (androidx.transition.ChangeImageTransform$4)
.class final Landroidx/transition/ChangeImageTransform$4;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeImageTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<",
        "Landroid/widget/ImageView;",
        "Landroid/graphics/Matrix;",
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

.method private static write(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V
    .registers 2

    .line 67
    invoke-static {p0, p1}, Lo/AdWordsConversionReporter;->RemoteActionCompatParcelizer(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    return-void
.end method


# virtual methods
.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 64
    check-cast p1, Landroid/widget/ImageView;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    .line 64
    check-cast p1, Landroid/widget/ImageView;

    check-cast p2, Landroid/graphics/Matrix;

    invoke-static {p1, p2}, Landroidx/transition/ChangeImageTransform$4;->write(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    return-void
.end method

###### Class androidx.transition.ChangeImageTransform.IconCompatParcelizer (androidx.transition.ChangeImageTransform$IconCompatParcelizer)
.class final Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeImageTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/widget/ImageView;

.field private IconCompatParcelizer:Z

.field private final RemoteActionCompatParcelizer:Landroid/graphics/Matrix;

.field private final write:Landroid/graphics/Matrix;


# direct methods
.method constructor <init>(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V
    .registers 5

    .line 263
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x1

    .line 261
    iput-boolean v0, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->IconCompatParcelizer:Z

    .line 264
    iput-object p1, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/widget/ImageView;

    .line 265
    iput-object p2, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/graphics/Matrix;

    .line 266
    iput-object p3, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->write:Landroid/graphics/Matrix;

    return-void
.end method

.method private write()V
    .registers 3

    .line 325
    iget-object v0, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/widget/ImageView;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_image_transform:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    if-eqz v0, :cond_19

    .line 327
    iget-object v1, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lo/AdWordsConversionReporter;->RemoteActionCompatParcelizer(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    .line 328
    iget-object p0, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/widget/ImageView;

    sget v0, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_image_transform:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_19
    return-void
.end method

.method private write(Landroid/graphics/Matrix;)V
    .registers 4

    .line 333
    iget-object v0, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/widget/ImageView;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_image_transform:I

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 334
    iget-object p1, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/widget/ImageView;

    iget-object p0, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->write:Landroid/graphics/Matrix;

    invoke-static {p1, p0}, Lo/AdWordsConversionReporter;->RemoteActionCompatParcelizer(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 1

    .line 290
    invoke-direct {p0}, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->write()V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 2

    .line 283
    iget-boolean v0, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->IconCompatParcelizer:Z

    if-eqz v0, :cond_9

    .line 284
    iget-object v0, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/graphics/Matrix;

    invoke-direct {p0, v0}, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->write(Landroid/graphics/Matrix;)V

    :cond_9
    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x0

    .line 310
    iput-boolean p1, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .registers 3

    .line 305
    iput-boolean p2, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method

.method public final onAnimationPause(Landroid/animation/Animator;)V
    .registers 2

    .line 315
    check-cast p1, Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Matrix;

    .line 316
    invoke-direct {p0, p1}, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->write(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final onAnimationResume(Landroid/animation/Animator;)V
    .registers 2

    .line 321
    invoke-direct {p0}, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->write()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x0

    .line 300
    iput-boolean p1, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .registers 3

    const/4 p1, 0x0

    .line 295
    iput-boolean p1, p0, Landroidx/transition/ChangeImageTransform$IconCompatParcelizer;->IconCompatParcelizer:Z

    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method
