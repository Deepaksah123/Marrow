###### Class androidx.compose.ui.graphics.layer.view.DrawChildContainer (androidx.compose.ui.graphics.layer.view.DrawChildContainer)
.class public Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J7\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J%\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0019H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;",
        "Landroid/view/ViewGroup;",
        "Landroid/content/Context;",
        "p0",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "",
        "p1",
        "p2",
        "p3",
        "p4",
        "",
        "onLayout",
        "(ZIIII)V",
        "onMeasure",
        "(II)V",
        "requestLayout",
        "()V",
        "forceLayout",
        "",
        "Landroid/graphics/Rect;",
        "Landroid/view/ViewParent;",
        "invalidateChildInParent",
        "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;",
        "Landroid/graphics/Canvas;",
        "dispatchDraw",
        "(Landroid/graphics/Canvas;)V",
        "getChildCount",
        "()I",
        "IconCompatParcelizer",
        "Z",
        "RemoteActionCompatParcelizer"
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
.field private IconCompatParcelizer:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    .line 44
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 48
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 49
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 52
    sget p1, Lo/ThreadLocalBufferManagerThreadLocalBufferManagerHolder$AudioAttributesCompatParcelizer;->hide_graphics_layer_in_inspector_tag:I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 7

    .line 87
    invoke-super {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_29

    .line 88
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-string v4, ""

    invoke-static {v3, v4}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/compose/ui/graphics/layer/ViewLayer;

    .line 89
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/layer/ViewLayer;->isInvalidated()Z

    move-result v3

    if-eqz v3, :cond_26

    const/4 v0, 0x1

    .line 96
    iput-boolean v0, p0, Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;->IconCompatParcelizer:Z

    .line 98
    :try_start_1c
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V
    :try_end_1f
    .catchall {:try_start_1c .. :try_end_1f} :catchall_22

    .line 100
    iput-boolean v1, p0, Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;->IconCompatParcelizer:Z

    return-void

    :catchall_22
    move-exception p1

    iput-boolean v1, p0, Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;->IconCompatParcelizer:Z

    throw p1

    :cond_26
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_29
    return-void
.end method

.method public forceLayout()V
    .registers 1

    return-void
.end method

.method public getChildCount()I
    .registers 2

    .line 109
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;->IconCompatParcelizer:Z

    if-eqz v0, :cond_9

    invoke-super {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .registers 3

    const/4 p0, 0x0

    return-object p0
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    return-void
.end method

.method protected onMeasure(II)V
    .registers 3

    const/4 p1, 0x0

    .line 61
    invoke-virtual {p0, p1, p1}, Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;->setMeasuredDimension(II)V

    return-void
.end method

.method public requestLayout()V
    .registers 1

    return-void
.end method
