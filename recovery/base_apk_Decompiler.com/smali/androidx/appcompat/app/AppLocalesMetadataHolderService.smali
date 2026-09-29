###### Class androidx.appcompat.app.AppLocalesMetadataHolderService (androidx.appcompat.app.AppLocalesMetadataHolderService)
.class public final Landroidx/appcompat/app/AppLocalesMetadataHolderService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/AppLocalesMetadataHolderService$RemoteActionCompatParcelizer;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 43
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method public static RemoteActionCompatParcelizer(Landroid/content/Context;)Landroid/content/pm/ServiceInfo;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .line 64
    invoke-static {}, Landroidx/appcompat/app/AppLocalesMetadataHolderService$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer()I

    move-result v0

    .line 69
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/ComponentName;

    const-class v3, Landroidx/appcompat/app/AppLocalesMetadataHolderService;

    invoke-direct {v2, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    or-int/lit16 p0, v0, 0x80

    invoke-virtual {v1, v2, p0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final attachBaseContext(Landroid/content/Context;)V
    .registers 2

    .line 70
    invoke-super {p0, p1}, Landroid/app/Service;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 2

    .line 48
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public final onCreate()V
    .registers 1

    .line 71
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

###### Class androidx.appcompat.app.AppLocalesMetadataHolderService.RemoteActionCompatParcelizer (androidx.appcompat.app.AppLocalesMetadataHolderService$RemoteActionCompatParcelizer)
.class Landroidx/appcompat/app/AppLocalesMetadataHolderService$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AppLocalesMetadataHolderService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer()I
    .registers 1

    const/16 v0, 0x200

    return v0
.end method
