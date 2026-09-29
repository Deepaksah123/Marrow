###### Class androidx.work.impl.diagnostics.DiagnosticsReceiver (androidx.work.impl.diagnostics.DiagnosticsReceiver)
.class public Landroidx/work/impl/diagnostics/DiagnosticsReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 38
    const-string v0, "DiagnosticsRcvr"

    invoke-static {v0}, Lo/n;->write(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 37
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 3

    if-nez p2, :cond_3

    return-void

    .line 45
    :cond_3
    invoke-static {}, Lo/n;->write()Lo/n;

    .line 47
    :try_start_6
    invoke-static {p1}, Lo/getChildIndexByWindowIndex;->AudioAttributesCompatParcelizer(Landroid/content/Context;)Lo/getChildIndexByWindowIndex;

    move-result-object p0

    .line 48
    const-class p1, Landroidx/work/impl/workers/DiagnosticsWorker;

    invoke-static {p1}, Lo/onServiceDisconnected;->write(Ljava/lang/Class;)Lo/onServiceDisconnected;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo/getChildIndexByWindowIndex;->RemoteActionCompatParcelizer(Lo/getChildIndexByChildUid;)Lo/onTransact;
    :try_end_13
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_13} :catch_14

    return-void

    .line 50
    :catch_14
    invoke-static {}, Lo/n;->write()Lo/n;

    return-void
.end method
