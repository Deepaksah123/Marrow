###### Class androidx.transition.ChangeScroll (androidx.transition.ChangeScroll)
.class public Landroidx/transition/ChangeScroll;
.super Landroidx/transition/Transition;
.source "SourceFile"


# static fields
.field private static final RemoteActionCompatParcelizer:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 38
    const-string v0, "android:changeScroll:x"

    const-string v1, "android:changeScroll:y"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/transition/ChangeScroll;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 43
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 46
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Lo/Rstring;)V
    .registers 4

    .line 70
    iget-object v0, p0, Lo/Rstring;->read:Ljava/util/Map;

    iget-object v1, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "android:changeScroll:x"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    iget-object v0, p0, Lo/Rstring;->read:Ljava/util/Map;

    iget-object p0, p0, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "android:changeScroll:y"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Lo/Rstring;)V
    .registers 2

    .line 56
    invoke-static {p1}, Landroidx/transition/ChangeScroll;->AudioAttributesCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final read(Landroid/view/ViewGroup;Lo/Rstring;Lo/Rstring;)Landroid/animation/Animator;
    .registers 7

    const/4 p0, 0x0

    if-eqz p2, :cond_60

    if-nez p3, :cond_6

    goto :goto_60

    .line 80
    :cond_6
    iget-object p1, p3, Lo/Rstring;->AudioAttributesCompatParcelizer:Landroid/view/View;

    .line 81
    iget-object v0, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v1, "android:changeScroll:x"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 82
    iget-object v2, p3, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 83
    iget-object p2, p2, Lo/Rstring;->read:Ljava/util/Map;

    const-string v2, "android:changeScroll:y"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 84
    iget-object p3, p3, Lo/Rstring;->read:Ljava/util/Map;

    invoke-interface {p3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-eq v0, v1, :cond_4c

    .line 88
    invoke-virtual {p1, v0}, Landroid/view/View;->setScrollX(I)V

    .line 89
    filled-new-array {v0, v1}, [I

    move-result-object v0

    const-string v1, "scrollX"

    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    move-result-object v0

    goto :goto_4d

    :cond_4c
    move-object v0, p0

    :goto_4d
    if-eq p2, p3, :cond_5c

    .line 92
    invoke-virtual {p1, p2}, Landroid/view/View;->setScrollY(I)V

    .line 93
    filled-new-array {p2, p3}, [I

    move-result-object p0

    const-string p2, "scrollY"

    invoke-static {p1, p2, p0}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    move-result-object p0

    .line 95
    :cond_5c
    invoke-static {v0, p0}, Lo/Rinteger;->write(Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;

    move-result-object p0

    :cond_60
    :goto_60
    return-object p0
.end method

.method public final read(Lo/Rstring;)V
    .registers 2

    .line 51
    invoke-static {p1}, Landroidx/transition/ChangeScroll;->AudioAttributesCompatParcelizer(Lo/Rstring;)V

    return-void
.end method

.method public final read()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final write()[Ljava/lang/String;
    .registers 1

    .line 66
    sget-object p0, Landroidx/transition/ChangeScroll;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    return-object p0
.end method
