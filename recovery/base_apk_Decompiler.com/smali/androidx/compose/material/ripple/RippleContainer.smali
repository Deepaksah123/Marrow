###### Class androidx.compose.material.ripple.RippleContainer (androidx.compose.material.ripple.RippleContainer)
.class public final Landroidx/compose/material/ripple/RippleContainer;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J7\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u000c*\u00020\u0013\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001eR\u0014\u0010\u0015\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010 R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001a"
    }
    d2 = {
        "Landroidx/compose/material/ripple/RippleContainer;",
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
        "Lo/setFeatureMask;",
        "Landroidx/compose/material/ripple/RippleHostView;",
        "IconCompatParcelizer",
        "(Lo/setFeatureMask;)Landroidx/compose/material/ripple/RippleHostView;",
        "read",
        "(Lo/setFeatureMask;)V",
        "AudioAttributesCompatParcelizer",
        "I",
        "RemoteActionCompatParcelizer",
        "",
        "write",
        "Ljava/util/List;",
        "Lo/setHighestNonEscapedChar;",
        "Lo/setHighestNonEscapedChar;"
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
.field private final AudioAttributesCompatParcelizer:I

.field private final IconCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/material/ripple/RippleHostView;",
            ">;"
        }
    .end annotation
.end field

.field private final RemoteActionCompatParcelizer:Lo/setHighestNonEscapedChar;

.field private read:I

.field private final write:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/material/ripple/RippleHostView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 5

    .line 36
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x5

    .line 41
    iput v0, p0, Landroidx/compose/material/ripple/RippleContainer;->AudioAttributesCompatParcelizer:I

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Landroidx/compose/material/ripple/RippleContainer;->write:Ljava/util/List;

    .line 50
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    iput-object v1, p0, Landroidx/compose/material/ripple/RippleContainer;->IconCompatParcelizer:Ljava/util/List;

    .line 52
    new-instance v2, Lo/setHighestNonEscapedChar;

    invoke-direct {v2}, Lo/setHighestNonEscapedChar;-><init>()V

    iput-object v2, p0, Landroidx/compose/material/ripple/RippleContainer;->RemoteActionCompatParcelizer:Lo/setHighestNonEscapedChar;

    const/4 v2, 0x0

    .line 58
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 64
    new-instance v2, Landroidx/compose/material/ripple/RippleHostView;

    invoke-direct {v2, p1}, Landroidx/compose/material/ripple/RippleHostView;-><init>(Landroid/content/Context;)V

    move-object p1, v2

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 65
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 69
    iput p1, p0, Landroidx/compose/material/ripple/RippleContainer;->read:I

    .line 72
    sget p1, Lo/_handleApos$AudioAttributesCompatParcelizer;->hide_in_inspector_tag:I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/setFeatureMask;)Landroidx/compose/material/ripple/RippleHostView;
    .registers 5

    .line 94
    iget-object v0, p0, Landroidx/compose/material/ripple/RippleContainer;->RemoteActionCompatParcelizer:Lo/setHighestNonEscapedChar;

    invoke-virtual {v0, p1}, Lo/setHighestNonEscapedChar;->RemoteActionCompatParcelizer(Lo/setFeatureMask;)Landroidx/compose/material/ripple/RippleHostView;

    move-result-object v0

    if-eqz v0, :cond_9

    return-object v0

    .line 100
    :cond_9
    iget-object v0, p0, Landroidx/compose/material/ripple/RippleContainer;->IconCompatParcelizer:Ljava/util/List;

    invoke-static {v0}, Lo/IntermediateLoginResponseBody;->read(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material/ripple/RippleHostView;

    if-nez v0, :cond_61

    .line 106
    iget v0, p0, Landroidx/compose/material/ripple/RippleContainer;->read:I

    iget-object v1, p0, Landroidx/compose/material/ripple/RippleContainer;->write:Ljava/util/List;

    invoke-static {v1}, Lo/IntermediateLoginResponseBody;->write(Ljava/util/List;)I

    move-result v1

    if-le v0, v1, :cond_34

    .line 107
    new-instance v0, Landroidx/compose/material/ripple/RippleHostView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/material/ripple/RippleHostView;-><init>(Landroid/content/Context;)V

    .line 109
    move-object v1, v0

    check-cast v1, Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 111
    iget-object v1, p0, Landroidx/compose/material/ripple/RippleContainer;->write:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_51

    .line 116
    :cond_34
    iget-object v0, p0, Landroidx/compose/material/ripple/RippleContainer;->write:Ljava/util/List;

    iget v1, p0, Landroidx/compose/material/ripple/RippleContainer;->read:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material/ripple/RippleHostView;

    .line 120
    iget-object v1, p0, Landroidx/compose/material/ripple/RippleContainer;->RemoteActionCompatParcelizer:Lo/setHighestNonEscapedChar;

    invoke-virtual {v1, v0}, Lo/setHighestNonEscapedChar;->read(Landroidx/compose/material/ripple/RippleHostView;)Lo/setFeatureMask;

    move-result-object v1

    if-eqz v1, :cond_51

    .line 126
    invoke-interface {v1}, Lo/setFeatureMask;->read()V

    .line 127
    iget-object v2, p0, Landroidx/compose/material/ripple/RippleContainer;->RemoteActionCompatParcelizer:Lo/setHighestNonEscapedChar;

    invoke-virtual {v2, v1}, Lo/setHighestNonEscapedChar;->IconCompatParcelizer(Lo/setFeatureMask;)V

    .line 128
    invoke-virtual {v0}, Landroidx/compose/material/ripple/RippleHostView;->RemoteActionCompatParcelizer()V

    .line 134
    :cond_51
    :goto_51
    iget v1, p0, Landroidx/compose/material/ripple/RippleContainer;->read:I

    iget v2, p0, Landroidx/compose/material/ripple/RippleContainer;->AudioAttributesCompatParcelizer:I

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_5e

    add-int/lit8 v1, v1, 0x1

    .line 135
    iput v1, p0, Landroidx/compose/material/ripple/RippleContainer;->read:I

    goto :goto_61

    :cond_5e
    const/4 v1, 0x0

    .line 137
    iput v1, p0, Landroidx/compose/material/ripple/RippleContainer;->read:I

    .line 141
    :cond_61
    :goto_61
    iget-object p0, p0, Landroidx/compose/material/ripple/RippleContainer;->RemoteActionCompatParcelizer:Lo/setHighestNonEscapedChar;

    invoke-virtual {p0, p1, v0}, Lo/setHighestNonEscapedChar;->IconCompatParcelizer(Lo/setFeatureMask;Landroidx/compose/material/ripple/RippleHostView;)V

    return-object v0
.end method

.method protected final onLayout(ZIIII)V
    .registers 6

    return-void
.end method

.method protected final onMeasure(II)V
    .registers 3

    const/4 p1, 0x0

    .line 81
    invoke-virtual {p0, p1, p1}, Landroidx/compose/material/ripple/RippleContainer;->setMeasuredDimension(II)V

    return-void
.end method

.method public final read(Lo/setFeatureMask;)V
    .registers 4

    .line 151
    invoke-interface {p1}, Lo/setFeatureMask;->read()V

    .line 152
    iget-object v0, p0, Landroidx/compose/material/ripple/RippleContainer;->RemoteActionCompatParcelizer:Lo/setHighestNonEscapedChar;

    invoke-virtual {v0, p1}, Lo/setHighestNonEscapedChar;->RemoteActionCompatParcelizer(Lo/setFeatureMask;)Landroidx/compose/material/ripple/RippleHostView;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 155
    invoke-virtual {v0}, Landroidx/compose/material/ripple/RippleHostView;->RemoteActionCompatParcelizer()V

    .line 156
    iget-object v1, p0, Landroidx/compose/material/ripple/RippleContainer;->RemoteActionCompatParcelizer:Lo/setHighestNonEscapedChar;

    invoke-virtual {v1, p1}, Lo/setHighestNonEscapedChar;->IconCompatParcelizer(Lo/setFeatureMask;)V

    .line 158
    iget-object p0, p0, Landroidx/compose/material/ripple/RippleContainer;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_18
    return-void
.end method

.method public final requestLayout()V
    .registers 1

    return-void
.end method
