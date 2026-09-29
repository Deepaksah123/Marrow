###### Class com.airbnb.epoxy.TypedEpoxyController (com.airbnb.epoxy.TypedEpoxyController)
.class public abstract Lcom/airbnb/epoxy/TypedEpoxyController;
.super Lo/getContentBufferedPosition;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lo/getContentBufferedPosition;"
    }
.end annotation


# instance fields
.field private allowModelBuildRequests:Z

.field private currentData:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 24
    invoke-direct {p0}, Lo/getContentBufferedPosition;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Landroid/os/Handler;)V
    .registers 3

    .line 28
    invoke-direct {p0, p1, p2}, Lo/getContentBufferedPosition;-><init>(Landroid/os/Handler;Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final buildModels()V
    .registers 2

    .line 72
    invoke-virtual {p0}, Lcom/airbnb/epoxy/TypedEpoxyController;->isBuildingModels()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 77
    iget-object v0, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->currentData:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/TypedEpoxyController;->buildModels(Ljava/lang/Object;)V

    return-void

    .line 73
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected abstract buildModels(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public final getCurrentData()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 67
    iget-object p0, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->currentData:Ljava/lang/Object;

    return-object p0
.end method

.method public moveModel(II)V
    .registers 4

    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->allowModelBuildRequests:Z

    .line 51
    invoke-super {p0, p1, p2}, Lo/getContentBufferedPosition;->moveModel(II)V

    const/4 p1, 0x0

    .line 52
    iput-boolean p1, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->allowModelBuildRequests:Z

    return-void
.end method

.method public requestDelayedModelBuild(I)V
    .registers 3

    .line 57
    iget-boolean v0, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->allowModelBuildRequests:Z

    if-eqz v0, :cond_8

    .line 62
    invoke-super {p0, p1}, Lo/getContentBufferedPosition;->requestDelayedModelBuild(I)V

    return-void

    .line 58
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final requestModelBuild()V
    .registers 2

    .line 40
    iget-boolean v0, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->allowModelBuildRequests:Z

    if-eqz v0, :cond_8

    .line 45
    invoke-super {p0}, Lo/getContentBufferedPosition;->requestModelBuild()V

    return-void

    .line 41
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final setData(Ljava/lang/Object;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->currentData:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->allowModelBuildRequests:Z

    .line 34
    invoke-virtual {p0}, Lo/getContentBufferedPosition;->requestModelBuild()V

    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Lcom/airbnb/epoxy/TypedEpoxyController;->allowModelBuildRequests:Z

    return-void
.end method
