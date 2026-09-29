###### Class androidx.profileinstaller.ProfileInstallReceiver (androidx.profileinstaller.ProfileInstallReceiver)
.class public Landroidx/profileinstaller/ProfileInstallReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 38
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private static read(Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 150
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/os/Process;->sendSignal(II)V

    const/16 v0, 0xc

    const/4 v1, 0x0

    .line 151
    invoke-interface {p0, v0, v1}, Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;->IconCompatParcelizer(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 5

    if-eqz p2, :cond_98

    .line 102
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 103
    const-string v1, "androidx.profileinstaller.action.INSTALL_PROFILE"

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    .line 104
    new-instance p2, Lo/ObjectIdWriter;

    invoke-direct {p2}, Lo/ObjectIdWriter;-><init>()V

    new-instance v0, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;-><init>(Landroidx/profileinstaller/ProfileInstallReceiver;)V

    invoke-static {p1, p2, v0}, Lo/getValueClassBoxConverter;->RemoteActionCompatParcelizer(Landroid/content/Context;Ljava/util/concurrent/Executor;Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;)V

    return-void

    .line 106
    :cond_1c
    const-string v1, "androidx.profileinstaller.action.SKIP_FILE"

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5c

    .line 107
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_98

    .line 109
    const-string v0, "EXTRA_SKIP_FILE_OPERATION"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 110
    const-string v0, "WRITE_SKIP_FILE"

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_46

    .line 111
    new-instance p2, Lo/ObjectIdWriter;

    invoke-direct {p2}, Lo/ObjectIdWriter;-><init>()V

    new-instance v0, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;-><init>(Landroidx/profileinstaller/ProfileInstallReceiver;)V

    invoke-static {p1, p2, v0}, Lo/getValueClassBoxConverter;->read(Landroid/content/Context;Ljava/util/concurrent/Executor;Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;)V

    return-void

    .line 112
    :cond_46
    const-string v0, "DELETE_SKIP_FILE"

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_98

    .line 113
    new-instance p2, Lo/ObjectIdWriter;

    invoke-direct {p2}, Lo/ObjectIdWriter;-><init>()V

    new-instance v0, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;-><init>(Landroidx/profileinstaller/ProfileInstallReceiver;)V

    invoke-static {p1, p2, v0}, Lo/getValueClassBoxConverter;->write(Landroid/content/Context;Ljava/util/concurrent/Executor;Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;)V

    return-void

    .line 117
    :cond_5c
    const-string v1, "androidx.profileinstaller.action.SAVE_PROFILE"

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6d

    .line 118
    new-instance p1, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;

    invoke-direct {p1, p0}, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;-><init>(Landroidx/profileinstaller/ProfileInstallReceiver;)V

    invoke-static {p1}, Landroidx/profileinstaller/ProfileInstallReceiver;->read(Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;)V

    return-void

    .line 119
    :cond_6d
    const-string v1, "androidx.profileinstaller.action.BENCHMARK_OPERATION"

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_98

    .line 120
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_98

    .line 122
    const-string v0, "EXTRA_BENCHMARK_OPERATION"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 123
    new-instance v0, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;-><init>(Landroidx/profileinstaller/ProfileInstallReceiver;)V

    .line 124
    const-string p0, "DROP_SHADER_CACHE"

    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_92

    .line 125
    invoke-static {p1, v0}, Lo/getValueClassReturnType;->AudioAttributesCompatParcelizer(Landroid/content/Context;Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;)V

    return-void

    :cond_92
    const/16 p0, 0x10

    const/4 p1, 0x0

    .line 127
    invoke-virtual {v0, p0, p1}, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;->IconCompatParcelizer(ILjava/lang/Object;)V

    :cond_98
    return-void
.end method

###### Class androidx.profileinstaller.ProfileInstallReceiver.AudioAttributesCompatParcelizer (androidx.profileinstaller.ProfileInstallReceiver$AudioAttributesCompatParcelizer)
.class public final Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/profileinstaller/ProfileInstallReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field final synthetic read:Landroidx/profileinstaller/ProfileInstallReceiver;


# direct methods
.method constructor <init>(Landroidx/profileinstaller/ProfileInstallReceiver;)V
    .registers 2

    .line 157
    iput-object p1, p0, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;->read:Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(ILjava/lang/Object;)V
    .registers 4

    .line 165
    sget-object v0, Lo/getValueClassBoxConverter;->IconCompatParcelizer:Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;

    invoke-interface {v0, p1, p2}, Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;->IconCompatParcelizer(ILjava/lang/Object;)V

    .line 166
    iget-object p0, p0, Landroidx/profileinstaller/ProfileInstallReceiver$AudioAttributesCompatParcelizer;->read:Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(ILjava/lang/Object;)V
    .registers 3

    .line 160
    sget-object p0, Lo/getValueClassBoxConverter;->IconCompatParcelizer:Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;

    invoke-interface {p0, p1, p2}, Lo/getValueClassBoxConverter$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(ILjava/lang/Object;)V

    return-void
.end method
