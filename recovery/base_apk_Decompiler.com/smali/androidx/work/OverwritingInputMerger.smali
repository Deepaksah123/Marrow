###### Class androidx.work.OverwritingInputMerger (androidx.work.OverwritingInputMerger)
.class public final Landroidx/work/OverwritingInputMerger;
.super Lo/gb;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroidx/work/OverwritingInputMerger;",
        "Lo/gb;",
        "<init>",
        "()V",
        "",
        "Lo/e1;",
        "p0",
        "IconCompatParcelizer",
        "(Ljava/util/List;)Lo/e1;"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 24
    invoke-direct {p0}, Lo/gb;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Ljava/util/List;)Lo/e1;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/e1;",
            ">;)",
            "Lo/e1;"
        }
    .end annotation

    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance p0, Lo/e1$IconCompatParcelizer;

    invoke-direct {p0}, Lo/e1$IconCompatParcelizer;-><init>()V

    .line 27
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_15
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/e1;

    .line 29
    invoke-virtual {v1}, Lo/e1;->read()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_15

    .line 31
    :cond_29
    invoke-virtual {p0, v0}, Lo/e1$IconCompatParcelizer;->IconCompatParcelizer(Ljava/util/Map;)Lo/e1$IconCompatParcelizer;

    .line 32
    invoke-virtual {p0}, Lo/e1$IconCompatParcelizer;->IconCompatParcelizer()Lo/e1;

    move-result-object p0

    return-object p0
.end method
