###### Class androidx.compose.ui.platform.AndroidViewsHandler (androidx.compose.ui.platform.AndroidViewsHandler)
.class public final Landroidx/compose/ui/platform/AndroidViewsHandler;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J0\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0014J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017J\u001e\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0016\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020(J\u0012\u0010)\u001a\u00020\u00162\u0008\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0008\u0010,\u001a\u00020\u0010H\u0017J\u0008\u0010-\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(H\u0014R-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR-\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00080\u0007j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0008`\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000c\u00a8\u0006/"
    }
    d2 = {
        "Landroidx/compose/ui/platform/AndroidViewsHandler;",
        "Landroid/view/ViewGroup;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "holderToLayoutNode",
        "Ljava/util/HashMap;",
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "Landroidx/compose/ui/node/LayoutNode;",
        "Lkotlin/collections/HashMap;",
        "getHolderToLayoutNode",
        "()Ljava/util/HashMap;",
        "layoutNodeToHolder",
        "getLayoutNodeToHolder",
        "onMeasure",
        "",
        "widthMeasureSpec",
        "",
        "heightMeasureSpec",
        "onLayout",
        "changed",
        "",
        "l",
        "t",
        "r",
        "b",
        "onDescendantInvalidated",
        "child",
        "Landroid/view/View;",
        "target",
        "invalidateChildInParent",
        "",
        "location",
        "",
        "dirty",
        "Landroid/graphics/Rect;",
        "drawView",
        "view",
        "canvas",
        "Landroid/graphics/Canvas;",
        "dispatchTouchEvent",
        "ev",
        "Landroid/view/MotionEvent;",
        "requestLayout",
        "shouldDelayChildPressedState",
        "dispatchDraw",
        "ui"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lo/_assertNotNull;",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final RemoteActionCompatParcelizer:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            "Lo/_assertNotNull;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 36
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 38
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 41
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidViewsHandler;->RemoteActionCompatParcelizer:Ljava/util/HashMap;

    .line 42
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidViewsHandler;->AudioAttributesCompatParcelizer:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/util/HashMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Lo/_assertNotNull;",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidViewsHandler;->AudioAttributesCompatParcelizer:Ljava/util/HashMap;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer([ILandroid/graphics/Rect;)Ljava/lang/Void;
    .registers 3

    const/4 p0, 0x0

    return-object p0
.end method

.method protected final dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 2

    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    const/4 p0, 0x1

    return p0
.end method

.method public final synthetic invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .registers 3

    .line 36
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AndroidViewsHandler;->RemoteActionCompatParcelizer([ILandroid/graphics/Rect;)Ljava/lang/Void;

    move-result-object p0

    check-cast p0, Landroid/view/ViewParent;

    return-object p0
.end method

.method public final onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .registers 3

    return-void
.end method

.method protected final onLayout(ZIIII)V
    .registers 6

    .line 67
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidViewsHandler;->RemoteActionCompatParcelizer:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 120
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result p4

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p5

    invoke-virtual {p1, p2, p3, p4, p5}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->layout(IIII)V

    goto :goto_c

    :cond_2c
    return-void
.end method

.method protected final onMeasure(II)V
    .registers 5

    .line 47
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_9

    goto :goto_e

    .line 111
    :cond_9
    const-string v0, "widthMeasureSpec should be EXACTLY"

    invoke-static {v0}, Lo/reportWrongTokenException;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    .line 50
    :goto_e
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-ne v0, v1, :cond_15

    goto :goto_1a

    .line 115
    :cond_15
    const-string v0, "heightMeasureSpec should be EXACTLY"

    invoke-static {v0}, Lo/reportWrongTokenException;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    .line 54
    :goto_1a
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 55
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 53
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/AndroidViewsHandler;->setMeasuredDimension(II)V

    .line 60
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidViewsHandler;->RemoteActionCompatParcelizer:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 118
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_31
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_41

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 60
    invoke-virtual {p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->AudioAttributesImplBaseParcelizer()V

    goto :goto_31

    :cond_41
    return-void
.end method

.method public final requestLayout()V
    .registers 11

    .line 91
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidViewsHandler;->cleanupLayoutState(Landroid/view/View;)V

    .line 94
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_b
    if-ge v1, v0, :cond_2f

    .line 95
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 96
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidViewsHandler;->RemoteActionCompatParcelizer:Ljava/util/HashMap;

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lo/_assertNotNull;

    .line 97
    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-eqz v2, :cond_2c

    if-eqz v4, :cond_2c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x7

    const/4 v9, 0x0

    .line 98
    invoke-static/range {v4 .. v9}, Lo/_assertNotNull;->AudioAttributesCompatParcelizer$default(Lo/_assertNotNull;ZZZILjava/lang/Object;)V

    :cond_2c
    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_2f
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final write()Ljava/util/HashMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            "Lo/_assertNotNull;",
            ">;"
        }
    .end annotation

    .line 41
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidViewsHandler;->RemoteActionCompatParcelizer:Ljava/util/HashMap;

    return-object p0
.end method

.method public final write(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V
    .registers 3

    .line 79
    invoke-virtual {p1, p2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method
