###### Class com.clevertap.android.sdk.pushnotification.amp.CTPushAmpWorker (com.clevertap.android.sdk.pushnotification.amp.CTPushAmpWorker)
.class public final Lcom/clevertap/android/sdk/pushnotification/amp/CTPushAmpWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/pushnotification/amp/CTPushAmpWorker;",
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
        0x0,
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

    .line 9
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final write()Lo/j$RemoteActionCompatParcelizer;
    .registers 2

    .line 12
    invoke-static {}, Lo/RendererWakeupListener;->MediaMetadataCompat()V

    .line 13
    invoke-virtual {p0}, Lo/j;->IconCompatParcelizer()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lo/PlayerTimelineChangeReason;->IconCompatParcelizer(Landroid/content/Context;)V

    .line 14
    invoke-static {}, Lo/j$RemoteActionCompatParcelizer;->read()Lo/j$RemoteActionCompatParcelizer;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
