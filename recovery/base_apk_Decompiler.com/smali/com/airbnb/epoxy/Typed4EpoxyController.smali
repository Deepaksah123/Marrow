###### Class com.airbnb.epoxy.Typed4EpoxyController (com.airbnb.epoxy.Typed4EpoxyController)
.class public abstract Lcom/airbnb/epoxy/Typed4EpoxyController;
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
        "W:",
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

.field private data4:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TW;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 27
    invoke-direct {p0}, Lo/getContentBufferedPosition;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Landroid/os/Handler;)V
    .registers 3

    .line 31
    invoke-direct {p0, p1, p2}, Lo/getContentBufferedPosition;-><init>(Landroid/os/Handler;Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final buildModels()V
    .registers 5

    .line 77
    invoke-virtual {p0}, Lcom/airbnb/epoxy/Typed4EpoxyController;->isBuildingModels()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 82
    iget-object v0, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->data1:Ljava/lang/Object;

    iget-object v1, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->data2:Ljava/lang/Object;

    iget-object v2, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->data3:Ljava/lang/Object;

    iget-object v3, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->data4:Ljava/lang/Object;

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/airbnb/epoxy/Typed4EpoxyController;->buildModels(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 78
    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected abstract buildModels(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TU;TV;TW;)V"
        }
    .end annotation
.end method

.method public moveModel(II)V
    .registers 4

    const/4 v0, 0x1

    .line 60
    iput-boolean v0, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->allowModelBuildRequests:Z

    .line 61
    invoke-super {p0, p1, p2}, Lo/getContentBufferedPosition;->moveModel(II)V

    const/4 p1, 0x0

    .line 62
    iput-boolean p1, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->allowModelBuildRequests:Z

    return-void
.end method

.method public requestDelayedModelBuild(I)V
    .registers 3

    .line 67
    iget-boolean v0, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->allowModelBuildRequests:Z

    if-eqz v0, :cond_8

    .line 72
    invoke-super {p0, p1}, Lo/getContentBufferedPosition;->requestDelayedModelBuild(I)V

    return-void

    .line 68
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final requestModelBuild()V
    .registers 2

    .line 50
    iget-boolean v0, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->allowModelBuildRequests:Z

    if-eqz v0, :cond_8

    .line 55
    invoke-super {p0}, Lo/getContentBufferedPosition;->requestModelBuild()V

    return-void

    .line 51
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setData(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TU;TV;TW;)V"
        }
    .end annotation

    .line 39
    iput-object p1, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->data1:Ljava/lang/Object;

    .line 40
    iput-object p2, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->data2:Ljava/lang/Object;

    .line 41
    iput-object p3, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->data3:Ljava/lang/Object;

    .line 42
    iput-object p4, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->data4:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->allowModelBuildRequests:Z

    .line 44
    invoke-virtual {p0}, Lo/getContentBufferedPosition;->requestModelBuild()V

    const/4 p1, 0x0

    .line 45
    iput-boolean p1, p0, Lcom/airbnb/epoxy/Typed4EpoxyController;->allowModelBuildRequests:Z

    return-void
.end method
