###### Class androidx.work.impl.workers.DiagnosticsWorker (androidx.work.impl.workers.DiagnosticsWorker)
.class public final Landroidx/work/impl/workers/DiagnosticsWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Landroidx/work/impl/workers/DiagnosticsWorker;",
        "Landroidx/work/Worker;",
        "Landroid/content/Context;",
        "p0",
        "Landroidx/work/WorkerParameters;",
        "p1",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lo/j$RemoteActionCompatParcelizer;",
        "write",
        "()Lo/j$RemoteActionCompatParcelizer;"
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
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final write()Lo/j$RemoteActionCompatParcelizer;
    .registers 10

    .line 34
    invoke-virtual {p0}, Lo/j;->IconCompatParcelizer()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lo/hasPrevious;->read(Landroid/content/Context;)Lo/hasPrevious;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0}, Lo/hasPrevious;->AudioAttributesImplApi26Parcelizer()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->onMediaButtonEvent()Lo/CVolumeFlags;

    move-result-object v2

    .line 37
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->onFastForward()Lo/CRoleFlags;

    move-result-object v3

    .line 38
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->onPrepareFromMediaId()Lo/shouldStartPlayback;

    move-result-object v4

    .line 39
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->onPause()Lo/CColorRange;

    move-result-object v1

    .line 41
    invoke-virtual {p0}, Lo/hasPrevious;->AudioAttributesCompatParcelizer()Lo/b;

    move-result-object p0

    invoke-virtual {p0}, Lo/b;->RemoteActionCompatParcelizer()Lo/setInstallerPackageName;

    move-result-object p0

    invoke-interface {p0}, Lo/setInstallerPackageName;->read()J

    move-result-wide v5

    sget-object p0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x1

    invoke-virtual {p0, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    sub-long/2addr v5, v7

    .line 42
    invoke-interface {v2, v5, v6}, Lo/CVolumeFlags;->AudioAttributesCompatParcelizer(J)Ljava/util/List;

    move-result-object p0

    .line 43
    invoke-interface {v2}, Lo/CVolumeFlags;->IconCompatParcelizer()Ljava/util/List;

    move-result-object v5

    .line 45
    invoke-interface {v2}, Lo/CVolumeFlags;->AudioAttributesCompatParcelizer()Ljava/util/List;

    move-result-object v2

    .line 46
    move-object v6, p0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5d

    .line 47
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-static {}, Lo/lambdastatic0;->RemoteActionCompatParcelizer()Ljava/lang/String;

    .line 48
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 49
    invoke-static {}, Lo/lambdastatic0;->RemoteActionCompatParcelizer()Ljava/lang/String;

    invoke-static {v3, v4, v1, p0}, Lo/lambdastatic0;->read(Lo/CRoleFlags;Lo/shouldStartPlayback;Lo/CColorRange;Ljava/util/List;)Ljava/lang/String;

    .line 51
    :cond_5d
    move-object p0, v5

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_75

    .line 52
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-static {}, Lo/lambdastatic0;->RemoteActionCompatParcelizer()Ljava/lang/String;

    .line 53
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-static {}, Lo/lambdastatic0;->RemoteActionCompatParcelizer()Ljava/lang/String;

    invoke-static {v3, v4, v1, v5}, Lo/lambdastatic0;->read(Lo/CRoleFlags;Lo/shouldStartPlayback;Lo/CColorRange;Ljava/util/List;)Ljava/lang/String;

    .line 55
    :cond_75
    move-object p0, v2

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_8d

    .line 56
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-static {}, Lo/lambdastatic0;->RemoteActionCompatParcelizer()Ljava/lang/String;

    .line 57
    invoke-static {}, Lo/n;->write()Lo/n;

    invoke-static {}, Lo/lambdastatic0;->RemoteActionCompatParcelizer()Ljava/lang/String;

    invoke-static {v3, v4, v1, v2}, Lo/lambdastatic0;->read(Lo/CRoleFlags;Lo/shouldStartPlayback;Lo/CColorRange;Ljava/util/List;)Ljava/lang/String;

    .line 59
    :cond_8d
    invoke-static {}, Lo/j$RemoteActionCompatParcelizer;->read()Lo/j$RemoteActionCompatParcelizer;

    move-result-object p0

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
