###### Class androidx.work.CoroutineWorker (androidx.work.CoroutineWorker)
.class public abstract Landroidx/work/CoroutineWorker;
.super Lo/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/CoroutineWorker$read;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\tH\u00a6@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012R\u001a\u0010\u000c\u001a\u00020\u00138\u0017X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016"
    }
    d2 = {
        "Landroidx/work/CoroutineWorker;",
        "Lo/j;",
        "Landroid/content/Context;",
        "p0",
        "Landroidx/work/WorkerParameters;",
        "p1",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lo/Mp4ExtractorExternalSyntheticLambda0;",
        "Lo/j$RemoteActionCompatParcelizer;",
        "RemoteActionCompatParcelizer",
        "()Lo/Mp4ExtractorExternalSyntheticLambda0;",
        "IconCompatParcelizer",
        "(Lo/SampleVideos;)Ljava/lang/Object;",
        "Lo/eb;",
        "write",
        "()Ljava/lang/Object;",
        "read",
        "Landroidx/work/WorkerParameters;",
        "Lo/getPlatform;",
        "Lo/getPlatform;",
        "AudioAttributesCompatParcelizer",
        "()Lo/getPlatform;"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final read:Lo/getPlatform;

.field private final write:Landroidx/work/WorkerParameters;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0, p1, p2}, Lo/j;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 40
    iput-object p2, p0, Landroidx/work/CoroutineWorker;->write:Landroidx/work/WorkerParameters;

    .line 52
    sget-object p1, Landroidx/work/CoroutineWorker$read;->IconCompatParcelizer:Landroidx/work/CoroutineWorker$read;

    check-cast p1, Lo/getPlatform;

    iput-object p1, p0, Landroidx/work/CoroutineWorker;->read:Lo/getPlatform;

    return-void
.end method

.method private static synthetic MediaDescriptionCompat()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 92
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not implemented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static write()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 122
    invoke-static {}, Landroidx/work/CoroutineWorker;->MediaDescriptionCompat()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer()Lo/getPlatform;
    .registers 1

    .line 51
    iget-object p0, p0, Landroidx/work/CoroutineWorker;->read:Lo/getPlatform;

    return-object p0
.end method

.method public abstract IconCompatParcelizer(Lo/SampleVideos;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/SampleVideos<",
            "-",
            "Lo/j$RemoteActionCompatParcelizer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public final RemoteActionCompatParcelizer()Lo/Mp4ExtractorExternalSyntheticLambda0;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/Mp4ExtractorExternalSyntheticLambda0<",
            "Lo/j$RemoteActionCompatParcelizer;",
            ">;"
        }
    .end annotation

    .line 61
    invoke-virtual {p0}, Landroidx/work/CoroutineWorker;->AudioAttributesCompatParcelizer()Lo/getPlatform;

    move-result-object v0

    sget-object v1, Landroidx/work/CoroutineWorker$read;->IconCompatParcelizer:Landroidx/work/CoroutineWorker$read;

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 62
    invoke-virtual {p0}, Landroidx/work/CoroutineWorker;->AudioAttributesCompatParcelizer()Lo/getPlatform;

    move-result-object v0

    check-cast v0, Lo/CurrentQuery;

    goto :goto_19

    .line 64
    :cond_13
    iget-object v0, p0, Landroidx/work/CoroutineWorker;->write:Landroidx/work/WorkerParameters;

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->IconCompatParcelizer()Lo/CurrentQuery;

    move-result-object v0

    .line 61
    :goto_19
    invoke-static {v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 67
    invoke-static {}, Lo/getUserConfig;->write()Lo/isMockTest;

    move-result-object v1

    check-cast v1, Lo/CurrentQuery;

    invoke-interface {v0, v1}, Lo/CurrentQuery;->plus(Lo/CurrentQuery;)Lo/CurrentQuery;

    move-result-object v0

    new-instance v1, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;-><init>(Landroidx/work/CoroutineWorker;Lo/SampleVideos;)V

    check-cast v1, Lo/MagicModuleSubmissionRequestBody;

    invoke-static {v0, v1}, Lo/i;->AudioAttributesCompatParcelizer(Lo/CurrentQuery;Lo/MagicModuleSubmissionRequestBody;)Lo/Mp4ExtractorExternalSyntheticLambda0;

    move-result-object p0

    return-object p0
.end method

.method public final read()Lo/Mp4ExtractorExternalSyntheticLambda0;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo/Mp4ExtractorExternalSyntheticLambda0<",
            "Lo/eb;",
            ">;"
        }
    .end annotation

    .line 121
    invoke-virtual {p0}, Landroidx/work/CoroutineWorker;->AudioAttributesCompatParcelizer()Lo/getPlatform;

    move-result-object v0

    invoke-static {}, Lo/getUserConfig;->write()Lo/isMockTest;

    move-result-object v1

    check-cast v1, Lo/CurrentQuery;

    invoke-virtual {v0, v1}, Lo/getUnderrunThreshold;->plus(Lo/CurrentQuery;)Lo/CurrentQuery;

    move-result-object v0

    new-instance v1, Landroidx/work/CoroutineWorker$write;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Landroidx/work/CoroutineWorker$write;-><init>(Landroidx/work/CoroutineWorker;Lo/SampleVideos;)V

    check-cast v1, Lo/MagicModuleSubmissionRequestBody;

    invoke-static {v0, v1}, Lo/i;->AudioAttributesCompatParcelizer(Lo/CurrentQuery;Lo/MagicModuleSubmissionRequestBody;)Lo/Mp4ExtractorExternalSyntheticLambda0;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.work.CoroutineWorker.AudioAttributesCompatParcelizer (androidx.work.CoroutineWorker$AudioAttributesCompatParcelizer)
.class final Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;
.super Lo/getMagicModuleStats;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/CoroutineWorker;->RemoteActionCompatParcelizer()Lo/Mp4ExtractorExternalSyntheticLambda0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/getMagicModuleStats;",
        "Lo/MagicModuleSubmissionRequestBody<",
        "Lo/TopUserCompanion;",
        "Lo/SampleVideos<",
        "-",
        "Lo/j$RemoteActionCompatParcelizer;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field final synthetic write:Landroidx/work/CoroutineWorker;


# direct methods
.method constructor <init>(Landroidx/work/CoroutineWorker;Lo/SampleVideos;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/CoroutineWorker;",
            "Lo/SampleVideos<",
            "-",
            "Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;",
            ">;)V"
        }
    .end annotation

    .line 68
    iput-object p1, p0, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;->write:Landroidx/work/CoroutineWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo/getMagicModuleStats;-><init>(ILo/SampleVideos;)V

    return-void
.end method

.method private read(Lo/TopUserCompanion;Lo/SampleVideos;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/TopUserCompanion;",
            "Lo/SampleVideos<",
            "-",
            "Lo/j$RemoteActionCompatParcelizer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 71
    invoke-virtual {p0, p1, p2}, Lo/getMonthName;->create(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;

    move-result-object p0

    check-cast p0, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;

    sget-object p1, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    invoke-virtual {p0, p1}, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lo/SampleVideos<",
            "*>;)",
            "Lo/SampleVideos<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 69
    new-instance p1, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;

    iget-object p0, p0, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;->write:Landroidx/work/CoroutineWorker;

    invoke-direct {p1, p0, p2}, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;-><init>(Landroidx/work/CoroutineWorker;Lo/SampleVideos;)V

    check-cast p1, Lo/SampleVideos;

    return-object p1
.end method

.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 70
    check-cast p1, Lo/TopUserCompanion;

    check-cast p2, Lo/SampleVideos;

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;->read(Lo/TopUserCompanion;Lo/SampleVideos;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lo/getYear;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 67
    iget v1, p0, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    return-object p1

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;->write:Landroidx/work/CoroutineWorker;

    move-object v1, p0

    check-cast v1, Lo/SampleVideos;

    iput v2, p0, Landroidx/work/CoroutineWorker$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, v1}, Landroidx/work/CoroutineWorker;->IconCompatParcelizer(Lo/SampleVideos;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_28

    return-object v0

    :cond_28
    return-object p0
.end method

###### Class androidx.work.CoroutineWorker.read (androidx.work.CoroutineWorker$read)
.class final Landroidx/work/CoroutineWorker$read;
.super Lo/getPlatform;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/CoroutineWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "read"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u000cj\u0002`\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/work/CoroutineWorker$DeprecatedDispatcher;",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "<init>",
        "()V",
        "dispatcher",
        "getDispatcher",
        "()Lkotlinx/coroutines/CoroutineDispatcher;",
        "dispatch",
        "",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "block",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "isDispatchNeeded",
        "",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final IconCompatParcelizer:Landroidx/work/CoroutineWorker$read;

.field private static final write:Lo/getPlatform;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroidx/work/CoroutineWorker$read;

    invoke-direct {v0}, Landroidx/work/CoroutineWorker$read;-><init>()V

    sput-object v0, Landroidx/work/CoroutineWorker$read;->IconCompatParcelizer:Landroidx/work/CoroutineWorker$read;

    .line 129
    invoke-static {}, Lo/setMbbsVerificationYear;->IconCompatParcelizer()Lo/getPlatform;

    move-result-object v0

    sput-object v0, Landroidx/work/CoroutineWorker$read;->write:Lo/getPlatform;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .line 128
    invoke-direct {p0}, Lo/getPlatform;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/CurrentQuery;)Z
    .registers 2

    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    sget-object p0, Landroidx/work/CoroutineWorker$read;->write:Lo/getPlatform;

    invoke-virtual {p0, p1}, Lo/getPlatform;->IconCompatParcelizer(Lo/CurrentQuery;)Z

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(Lo/CurrentQuery;Ljava/lang/Runnable;)V
    .registers 3

    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    sget-object p0, Landroidx/work/CoroutineWorker$read;->write:Lo/getPlatform;

    invoke-virtual {p0, p1, p2}, Lo/getPlatform;->RemoteActionCompatParcelizer(Lo/CurrentQuery;Ljava/lang/Runnable;)V

    return-void
.end method

###### Class androidx.work.CoroutineWorker.write (androidx.work.CoroutineWorker$write)
.class final Landroidx/work/CoroutineWorker$write;
.super Lo/getMagicModuleStats;
.source "SourceFile"

# interfaces
.implements Lo/MagicModuleSubmissionRequestBody;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/CoroutineWorker;->read()Lo/Mp4ExtractorExternalSyntheticLambda0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/getMagicModuleStats;",
        "Lo/MagicModuleSubmissionRequestBody<",
        "Lo/TopUserCompanion;",
        "Lo/SampleVideos<",
        "-",
        "Lo/eb;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/work/CoroutineWorker;

.field private write:I


# direct methods
.method constructor <init>(Landroidx/work/CoroutineWorker;Lo/SampleVideos;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/CoroutineWorker;",
            "Lo/SampleVideos<",
            "-",
            "Landroidx/work/CoroutineWorker$write;",
            ">;)V"
        }
    .end annotation

    .line 122
    iput-object p1, p0, Landroidx/work/CoroutineWorker$write;->IconCompatParcelizer:Landroidx/work/CoroutineWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo/getMagicModuleStats;-><init>(ILo/SampleVideos;)V

    return-void
.end method

.method private IconCompatParcelizer(Lo/TopUserCompanion;Lo/SampleVideos;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/TopUserCompanion;",
            "Lo/SampleVideos<",
            "-",
            "Lo/eb;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 125
    invoke-virtual {p0, p1, p2}, Lo/getMonthName;->create(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;

    move-result-object p0

    check-cast p0, Landroidx/work/CoroutineWorker$write;

    sget-object p1, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    invoke-virtual {p0, p1}, Landroidx/work/CoroutineWorker$write;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lo/SampleVideos;)Lo/SampleVideos;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lo/SampleVideos<",
            "*>;)",
            "Lo/SampleVideos<",
            "Lo/getShowPopup;",
            ">;"
        }
    .end annotation

    .line 123
    new-instance p1, Landroidx/work/CoroutineWorker$write;

    iget-object p0, p0, Landroidx/work/CoroutineWorker$write;->IconCompatParcelizer:Landroidx/work/CoroutineWorker;

    invoke-direct {p1, p0, p2}, Landroidx/work/CoroutineWorker$write;-><init>(Landroidx/work/CoroutineWorker;Lo/SampleVideos;)V

    check-cast p1, Lo/SampleVideos;

    return-object p1
.end method

.method public final synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 124
    check-cast p1, Lo/TopUserCompanion;

    check-cast p2, Lo/SampleVideos;

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker$write;->IconCompatParcelizer(Lo/TopUserCompanion;Lo/SampleVideos;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Lo/getYear;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 121
    iget v1, p0, Landroidx/work/CoroutineWorker$write;->write:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    return-object p1

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lo/SdkPayloadData;->IconCompatParcelizer(Ljava/lang/Object;)V

    move-object p1, p0

    check-cast p1, Lo/SampleVideos;

    iput v2, p0, Landroidx/work/CoroutineWorker$write;->write:I

    invoke-static {}, Landroidx/work/CoroutineWorker;->write()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_26

    return-object v0

    :cond_26
    return-object p0
.end method
