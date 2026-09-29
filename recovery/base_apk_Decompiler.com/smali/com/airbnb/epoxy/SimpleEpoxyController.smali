###### Class com.airbnb.epoxy.SimpleEpoxyController (com.airbnb.epoxy.SimpleEpoxyController)
.class public Lcom/airbnb/epoxy/SimpleEpoxyController;
.super Lo/getContentBufferedPosition;
.source "SourceFile"


# instance fields
.field private currentModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lo/getCurrentPeriodIndex<",
            "*>;>;"
        }
    .end annotation
.end field

.field private insideSetModels:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 9
    invoke-direct {p0}, Lo/getContentBufferedPosition;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildModels()V
    .registers 2

    .line 35
    invoke-virtual {p0}, Lcom/airbnb/epoxy/SimpleEpoxyController;->isBuildingModels()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 39
    iget-object v0, p0, Lcom/airbnb/epoxy/SimpleEpoxyController;->currentModels:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/airbnb/epoxy/SimpleEpoxyController;->add(Ljava/util/List;)V

    return-void

    .line 36
    :cond_c
    new-instance p0, Lo/getPlaylistMetadata;

    const-string v0, "You cannot call `buildModels` directly. Call `setModels` instead."

    invoke-direct {p0, v0}, Lo/getPlaylistMetadata;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final requestModelBuild()V
    .registers 2

    .line 26
    iget-boolean v0, p0, Lcom/airbnb/epoxy/SimpleEpoxyController;->insideSetModels:Z

    if-eqz v0, :cond_8

    .line 30
    invoke-super {p0}, Lo/getContentBufferedPosition;->requestModelBuild()V

    return-void

    .line 27
    :cond_8
    new-instance p0, Lo/getPlaylistMetadata;

    const-string v0, "You cannot call `requestModelBuild` directly. Call `setModels` instead."

    invoke-direct {p0, v0}, Lo/getPlaylistMetadata;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public setModels(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo/getCurrentPeriodIndex<",
            "*>;>;)V"
        }
    .end annotation

    .line 18
    iput-object p1, p0, Lcom/airbnb/epoxy/SimpleEpoxyController;->currentModels:Ljava/util/List;

    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lcom/airbnb/epoxy/SimpleEpoxyController;->insideSetModels:Z

    .line 20
    invoke-virtual {p0}, Lo/getContentBufferedPosition;->requestModelBuild()V

    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lcom/airbnb/epoxy/SimpleEpoxyController;->insideSetModels:Z

    return-void
.end method
