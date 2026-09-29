###### Class androidx.transition.Fade (androidx.transition.Fade)
.class public Landroidx/transition/Fade;
.super Landroidx/transition/Visibility;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/Fade$IconCompatParcelizer;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 98
    invoke-direct {p0}, Landroidx/transition/Visibility;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    .line 91
    invoke-direct {p0}, Landroidx/transition/Visibility;-><init>()V

    .line 92
    invoke-virtual {p0, p1}, Landroidx/transition/Visibility;->read(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    .line 102
    invoke-direct {p0, p1, p2}, Landroidx/transition/Visibility;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 103
    sget-object v0, Lo/recordRemarketingPing;->RemoteActionCompatParcelizer:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 105
    check-cast p2, Landroid/content/res/XmlResourceParser;

    .line 106
    invoke-virtual {p0}, Landroidx/transition/Visibility;->onPlayFromMediaId()I

    move-result v0

    .line 105
    const-string v1, "fadingMode"

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2, v0}, Lo/_parseLongPrimitive;->read(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 107
    invoke-virtual {p0, p2}, Landroidx/transition/Visibility;->read(I)V

    .line 108
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private static IconCompatParcelizer(Lo/Rstring;F)F
    .registers 3

    if-eqz p0, :cond_13

    .line 177
    iget-object p0, p0, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:fade:transitionAlpha"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-eqz p0, :cond_13

    .line 179
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0

    :cond_13
    return p1
.end method

.method private IconCompatParcelizer(Landroid/view/View;FF)Landroid/animation/Animator;
    .registers 6

    cmpl-float v0, p2, p3

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    .line 137
    :cond_6
    invoke-static {p1, p2}, Lo/ab;->write(Landroid/view/View;F)V

    .line 138
    sget-object p2, Lo/ab;->IconCompatParcelizer:Landroid/util/Property;

    const/4 v0, 0x1

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p3, v0, v1

    invoke-static {p1, p2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    .line 143
    new-instance p3, Landroidx/transition/Fade$IconCompatParcelizer;

    invoke-direct {p3, p1}, Landroidx/transition/Fade$IconCompatParcelizer;-><init>(Landroid/view/View;)V

    .line 144
    invoke-virtual {p2, p3}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 145
    invoke-virtual {p0}, Landroidx/transition/Transition;->MediaBrowserCompatSearchResultReceiver()Landroidx/transition/Transition;

    move-result-object p0

    invoke-virtual {p0, p3}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    return-object p2
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 6

    .line 165
    invoke-static {p2}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 166
    invoke-static {p3, p1}, Landroidx/transition/Fade;->IconCompatParcelizer(Lo/Rstring;F)F

    move-result p3

    const/4 v0, 0x0

    .line 167
    invoke-direct {p0, p2, p3, v0}, Landroidx/transition/Fade;->IconCompatParcelizer(Landroid/view/View;FF)Landroid/animation/Animator;

    move-result-object p0

    if-nez p0, :cond_17

    .line 169
    invoke-static {p4, p1}, Landroidx/transition/Fade;->IconCompatParcelizer(Lo/Rstring;F)F

    move-result p1

    invoke-static {p2, p1}, Lo/ab;->write(Landroid/view/View;F)V

    :cond_17
    return-object p0
.end method

.method public final read(Landroid/view/ViewGroup;Landroid/view/View;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 5

    .line 157
    invoke-static {p2}, Lo/ab;->IconCompatParcelizer(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 158
    invoke-static {p3, p1}, Landroidx/transition/Fade;->IconCompatParcelizer(Lo/Rstring;F)F

    move-result p1

    const/high16 p3, 0x3f800000    # 1.0f

    .line 159
    invoke-direct {p0, p2, p1, p3}, Landroidx/transition/Fade;->IconCompatParcelizer(Landroid/view/View;FF)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public final read(Lo/Rstring;)V
    .registers 3

    .line 113
    invoke-super {p0, p1}, Landroidx/transition/Visibility;->read(Lo/Rstring;)V

    .line 114
    iget-object p0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    sget v0, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_pause_alpha:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-nez p0, :cond_27

    .line 116
    iget-object p0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_22

    .line 117
    iget-object p0, p1, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-static {p0}, Lo/ab;->write(Landroid/view/View;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    goto :goto_27

    :cond_22
    const/4 p0, 0x0

    .line 119
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    .line 122
    :cond_27
    :goto_27
    iget-object p1, p1, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:fade:transitionAlpha"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final read()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

###### Class androidx.transition.Fade.IconCompatParcelizer (androidx.transition.Fade$IconCompatParcelizer)
.class final Landroidx/transition/Fade$IconCompatParcelizer;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/Fade;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private final read:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .registers 3

    .line 191
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    .line 189
    iput-boolean v0, p0, Landroidx/transition/Fade$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    .line 192
    iput-object p1, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 250
    iget-object p0, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    sget v0, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_pause_alpha:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 3

    .line 243
    iget-object v0, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_f

    .line 244
    iget-object v0, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    invoke-static {v0}, Lo/ab;->write(Landroid/view/View;)F

    move-result v0

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    .line 245
    :goto_10
    iget-object p0, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_pause_alpha:I

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    .line 222
    iget-object p0, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p0, p1}, Lo/ab;->write(Landroid/view/View;F)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const/4 v0, 0x0

    .line 206
    invoke-virtual {p0, p1, v0}, Landroidx/transition/Fade$IconCompatParcelizer;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .registers 5

    .line 211
    iget-boolean p1, p0, Landroidx/transition/Fade$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    if-eqz p1, :cond_b

    .line 212
    iget-object p1, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_b
    if-nez p2, :cond_19

    .line 215
    iget-object p1, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p2}, Lo/ab;->write(Landroid/view/View;F)V

    .line 216
    iget-object p0, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    invoke-static {p0}, Lo/ab;->AudioAttributesCompatParcelizer(Landroid/view/View;)V

    :cond_19
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    .line 197
    iget-object p1, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->hasOverlappingRendering()Z

    move-result p1

    if-eqz p1, :cond_1a

    iget-object p1, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    .line 198
    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result p1

    if-nez p1, :cond_1a

    const/4 p1, 0x1

    .line 199
    iput-boolean p1, p0, Landroidx/transition/Fade$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Z

    .line 200
    iget-object p0, p0, Landroidx/transition/Fade$IconCompatParcelizer;->read:Landroid/view/View;

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_1a
    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final write(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method
