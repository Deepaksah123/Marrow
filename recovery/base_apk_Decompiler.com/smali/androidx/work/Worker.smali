###### Class androidx.work.Worker (androidx.work.Worker)
.class public abstract Landroidx/work/Worker;
.super Lo/j;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011"
    }
    d2 = {
        "Landroidx/work/Worker;",
        "Lo/j;",
        "Landroid/content/Context;",
        "p0",
        "Landroidx/work/WorkerParameters;",
        "p1",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lo/j$RemoteActionCompatParcelizer;",
        "write",
        "()Lo/j$RemoteActionCompatParcelizer;",
        "Lo/Mp4ExtractorExternalSyntheticLambda0;",
        "RemoteActionCompatParcelizer",
        "()Lo/Mp4ExtractorExternalSyntheticLambda0;",
        "Lo/eb;",
        "read",
        "MediaDescriptionCompat",
        "()Lo/eb;"
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

    .line 43
    invoke-direct {p0, p1, p2}, Lo/j;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method

.method private static final AudioAttributesCompatParcelizer()Lo/eb;
    .registers 1

    .line 67
    invoke-static {}, Landroidx/work/Worker;->MediaDescriptionCompat()Lo/eb;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic IconCompatParcelizer(Landroidx/work/Worker;)Lo/j$RemoteActionCompatParcelizer;
    .registers 1

    .line 89
    invoke-static {p0}, Landroidx/work/Worker;->read(Landroidx/work/Worker;)Lo/j$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method private static MediaDescriptionCompat()Lo/eb;
    .registers 2

    .line 86
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final read(Landroidx/work/Worker;)Lo/j$RemoteActionCompatParcelizer;
    .registers 1

    .line 64
    invoke-virtual {p0}, Landroidx/work/Worker;->write()Lo/j$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic write(Landroidx/work/Worker;)Lo/eb;
    .registers 1

    .line 88
    invoke-static {}, Landroidx/work/Worker;->AudioAttributesCompatParcelizer()Lo/eb;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()Lo/Mp4ExtractorExternalSyntheticLambda0;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/Mp4ExtractorExternalSyntheticLambda0<",
            "Lo/j$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation

    .line 64
    invoke-virtual {p0}, Lo/j;->AudioAttributesImplApi21Parcelizer()Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lo/getChildUidByChildIndex;

    invoke-direct {v1, p0}, Lo/getChildUidByChildIndex;-><init>(Landroidx/work/Worker;)V

    invoke-static {v0, v1}, Lo/getIndexOfPeriod;->write(Ljava/util/concurrent/Executor;Lo/getCreatedOnDateMs;)Lo/Mp4ExtractorExternalSyntheticLambda0;

    move-result-object p0

    return-object p0
.end method

.method public final read()Lo/Mp4ExtractorExternalSyntheticLambda0;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/Mp4ExtractorExternalSyntheticLambda0<",
            "Lo/eb;",
            ">;"
        }
    .end annotation

    .line 67
    invoke-virtual {p0}, Lo/j;->AudioAttributesImplApi21Parcelizer()Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lo/getFirstPeriodIndexByChildIndex;

    invoke-direct {v1, p0}, Lo/getFirstPeriodIndexByChildIndex;-><init>(Landroidx/work/Worker;)V

    invoke-static {v0, v1}, Lo/getIndexOfPeriod;->write(Ljava/util/concurrent/Executor;Lo/getCreatedOnDateMs;)Lo/Mp4ExtractorExternalSyntheticLambda0;

    move-result-object p0

    return-object p0
.end method

.method public abstract write()Lo/j$RemoteActionCompatParcelizer;
.end method

###### Class kotlin.getChildUidByChildIndex (o.getChildUidByChildIndex)
.class public final synthetic Lo/getChildUidByChildIndex;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/work/Worker;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/Worker;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getChildUidByChildIndex;->IconCompatParcelizer:Landroidx/work/Worker;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getChildUidByChildIndex;->IconCompatParcelizer:Landroidx/work/Worker;

    invoke-static {p0}, Landroidx/work/Worker;->IconCompatParcelizer(Landroidx/work/Worker;)Lo/j$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getFirstPeriodIndexByChildIndex (o.getFirstPeriodIndexByChildIndex)
.class public final synthetic Lo/getFirstPeriodIndexByChildIndex;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/work/Worker;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/Worker;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getFirstPeriodIndexByChildIndex;->AudioAttributesCompatParcelizer:Landroidx/work/Worker;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getFirstPeriodIndexByChildIndex;->AudioAttributesCompatParcelizer:Landroidx/work/Worker;

    invoke-static {p0}, Landroidx/work/Worker;->write(Landroidx/work/Worker;)Lo/eb;

    move-result-object p0

    return-object p0
.end method
