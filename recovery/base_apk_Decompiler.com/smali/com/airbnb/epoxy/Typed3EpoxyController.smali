###### Class com.airbnb.epoxy.Typed3EpoxyController (com.airbnb.epoxy.Typed3EpoxyController)
.class public abstract Lcom/airbnb/epoxy/Typed3EpoxyController;
.super Lo/getContentBufferedPosition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lo/getContentBufferedPosition;"
    }
.end annotation


# instance fields
.field private allowModelBuildRequests:Z

.field private data1:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private data2:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TU;"
        }
    .end annotation
.end field

.field private data3:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 26
    invoke-direct {p0}, Lo/getContentBufferedPosition;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Landroid/os/Handler;)V
    .registers 3

    .line 30
    invoke-direct {p0, p1, p2}, Lo/getContentBufferedPosition;-><init>(Landroid/os/Handler;Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final buildModels()V
    .registers 4

    .line 75
    invoke-virtual {p0}, Lcom/airbnb/epoxy/Typed3EpoxyController;->isBuildingModels()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 80
    iget-object v0, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->data1:Ljava/lang/Object;

    iget-object v1, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->data2:Ljava/lang/Object;

    iget-object v2, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->data3:Ljava/lang/Object;

    invoke-virtual {p0, v0, v1, v2}, Lcom/airbnb/epoxy/Typed3EpoxyController;->buildModels(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 76
    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected abstract buildModels(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TU;TV;)V"
        }
    .end annotation
.end method

.method public moveModel(II)V
    .registers 4

    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->allowModelBuildRequests:Z

    .line 59
    invoke-super {p0, p1, p2}, Lo/getContentBufferedPosition;->moveModel(II)V

    const/4 p1, 0x0

    .line 60
    iput-boolean p1, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->allowModelBuildRequests:Z

    return-void
.end method

.method public requestDelayedModelBuild(I)V
    .registers 3

    .line 65
    iget-boolean v0, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->allowModelBuildRequests:Z

    if-eqz v0, :cond_8

    .line 70
    invoke-super {p0, p1}, Lo/getContentBufferedPosition;->requestDelayedModelBuild(I)V

    return-void

    .line 66
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final requestModelBuild()V
    .registers 2

    .line 48
    iget-boolean v0, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->allowModelBuildRequests:Z

    if-eqz v0, :cond_8

    .line 53
    invoke-super {p0}, Lo/getContentBufferedPosition;->requestModelBuild()V

    return-void

    .line 49
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setData(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TU;TV;)V"
        }
    .end annotation

    .line 38
    iput-object p1, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->data1:Ljava/lang/Object;

    .line 39
    iput-object p2, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->data2:Ljava/lang/Object;

    .line 40
    iput-object p3, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->data3:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->allowModelBuildRequests:Z

    .line 42
    invoke-virtual {p0}, Lo/getContentBufferedPosition;->requestModelBuild()V

    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Lcom/airbnb/epoxy/Typed3EpoxyController;->allowModelBuildRequests:Z

    return-void
.end method
