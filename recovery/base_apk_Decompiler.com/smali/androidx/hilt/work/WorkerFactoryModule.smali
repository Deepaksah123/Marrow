###### Class androidx.hilt.work.WorkerFactoryModule (androidx.hilt.work.WorkerFactoryModule)
.class public abstract Landroidx/hilt/work/WorkerFactoryModule;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .registers 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static write(Ljava/util/Map;)Lo/_removeIgnored;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lo/setDescriptionList<",
            "Lo/_mergeAnnotations<",
            "+",
            "Lo/j;",
            ">;>;>;)",
            "Lo/_removeIgnored;"
        }
    .end annotation

    .line 47
    new-instance v0, Lo/_removeIgnored;

    invoke-direct {v0, p0}, Lo/_removeIgnored;-><init>(Ljava/util/Map;)V

    return-object v0
.end method


# virtual methods
.method abstract write()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lo/_mergeAnnotations<",
            "+",
            "Lo/j;",
            ">;>;"
        }
    .end annotation
.end method
