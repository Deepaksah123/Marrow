###### Class androidx.transition.ChangeClipBounds (androidx.transition.ChangeClipBounds)
.class public Landroidx/transition/ChangeClipBounds;
.super Landroidx/transition/Transition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;
    }
.end annotation


# static fields
.field private static final AudioAttributesImplApi21Parcelizer:[Ljava/lang/String;

.field static final RemoteActionCompatParcelizer:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 42
    const-string v0, "android:clipBounds:clip"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/transition/ChangeClipBounds;->AudioAttributesImplApi21Parcelizer:[Ljava/lang/String;

    .line 48
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Landroidx/transition/ChangeClipBounds;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 55
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 59
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Lo/Rstring;Z)V
    .registers 5

    .line 69
    iget-object v0, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_41

    const/4 v1, 0x0

    if-eqz p1, :cond_16

    .line 76
    sget p1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_clip:I

    invoke-virtual {v0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    goto :goto_17

    :cond_16
    move-object p1, v1

    :goto_17
    if-nez p1, :cond_1d

    .line 79
    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object p1

    .line 81
    :cond_1d
    sget-object v2, Landroidx/transition/ChangeClipBounds;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    if-ne p1, v2, :cond_22

    goto :goto_23

    :cond_22
    move-object v1, p1

    .line 84
    :goto_23
    iget-object p1, p0, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:clipBounds:clip"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v1, :cond_41

    .line 86
    new-instance p1, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v2, 0x0

    invoke-direct {p1, v2, v2, v1, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 87
    iget-object p0, p0, Lo/Rstring;->read:Ljava/util/Map;

    const-string v0, "android:clipBounds:bounds"

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_41
    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 2

    const/4 p0, 0x0

    .line 98
    invoke-static {p1, p0}, Landroidx/transition/ChangeClipBounds;->AudioAttributesCompatParcelizer(Lo/Rstring;Z)V

    return-void
.end method

.method public final read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 9

    const/4 p1, 0x0

    if-eqz p2, :cond_76

    if-eqz p3, :cond_76

    .line 105
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    .line 106
    const-string v1, "android:clipBounds:clip"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_76

    iget-object v0, p3, Lo/Rstring;->read:Ljava/util/Map;

    .line 107
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_76

    .line 110
    :cond_18
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 111
    iget-object v2, p3, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    if-nez v0, :cond_2d

    if-nez v1, :cond_2d

    return-object p1

    .line 116
    :cond_2d
    const-string v2, "android:clipBounds:bounds"

    if-nez v0, :cond_3a

    iget-object p2, p2, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Rect;

    goto :goto_3b

    :cond_3a
    move-object p2, v0

    :goto_3b
    if-nez v1, :cond_46

    .line 117
    iget-object v3, p3, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    goto :goto_47

    :cond_46
    move-object v2, v1

    .line 119
    :goto_47
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4e

    return-object p1

    .line 123
    :cond_4e
    iget-object p1, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 124
    new-instance p1, Lo/reportActivity;

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {p1, v3}, Lo/reportActivity;-><init>(Landroid/graphics/Rect;)V

    .line 125
    iget-object v3, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    sget-object v4, Lo/ab;->AudioAttributesCompatParcelizer:Landroid/util/Property;

    filled-new-array {p2, v2}, [Landroid/graphics/Rect;

    move-result-object p2

    invoke-static {v3, v4, p1, p2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 127
    iget-object p2, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 128
    new-instance p3, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;

    invoke-direct {p3, p2, v0, v1}, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;-><init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 129
    invoke-virtual {p1, p3}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 130
    invoke-virtual {p0, p3}, Landroidx/transition/Transition;->RemoteActionCompatParcelizer(Landroidx/transition/Transition$RemoteActionCompatParcelizer;)Landroidx/transition/Transition;

    :cond_76
    :goto_76
    return-object p1
.end method

.method public final read(Lo/Rstring;)V
    .registers 2

    const/4 p0, 0x1

    .line 93
    invoke-static {p1, p0}, Landroidx/transition/ChangeClipBounds;->AudioAttributesCompatParcelizer(Lo/Rstring;Z)V

    return-void
.end method

.method public final read()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final write()[Ljava/lang/String;
    .registers 1

    .line 52
    sget-object p0, Landroidx/transition/ChangeClipBounds;->AudioAttributesImplApi21Parcelizer:[Ljava/lang/String;

    return-object p0
.end method

###### Class androidx.transition.ChangeClipBounds.IconCompatParcelizer (androidx.transition.ChangeClipBounds$IconCompatParcelizer)
.class final Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Landroidx/transition/Transition$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/ChangeClipBounds;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/graphics/Rect;

.field private final RemoteActionCompatParcelizer:Landroid/view/View;

.field private final write:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .registers 4

    .line 139
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 140
    iput-object p1, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    .line 141
    iput-object p2, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->write:Landroid/graphics/Rect;

    .line 142
    iput-object p3, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 172
    iget-object v0, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    sget v1, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_clip:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 173
    iget-object v1, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 174
    iget-object p0, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    sget v0, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_clip:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final AudioAttributesCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final IconCompatParcelizer()V
    .registers 4

    .line 162
    iget-object v0, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object v0

    if-nez v0, :cond_a

    .line 164
    sget-object v0, Landroidx/transition/ChangeClipBounds;->RemoteActionCompatParcelizer:Landroid/graphics/Rect;

    .line 166
    :cond_a
    iget-object v1, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    sget v2, Lo/reportWithConversionId$RemoteActionCompatParcelizer;->transition_clip:I

    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 167
    iget-object v0, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    iget-object p0, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {v0, p0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final IconCompatParcelizer(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const/4 v0, 0x0

    .line 179
    invoke-virtual {p0, p1, v0}, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .registers 3

    if-nez p2, :cond_a

    .line 185
    iget-object p1, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    iget-object p0, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/graphics/Rect;

    invoke-virtual {p1, p0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void

    .line 187
    :cond_a
    iget-object p1, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->RemoteActionCompatParcelizer:Landroid/view/View;

    iget-object p0, p0, Landroidx/transition/ChangeClipBounds$IconCompatParcelizer;->write:Landroid/graphics/Rect;

    invoke-virtual {p1, p0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final read(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method
