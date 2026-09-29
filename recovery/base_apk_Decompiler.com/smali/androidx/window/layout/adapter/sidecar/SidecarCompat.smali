###### Class androidx.window.layout.adapter.sidecar.SidecarCompat (androidx.window.layout.adapter.sidecar.SidecarCompat)
.class public final Landroidx/window/layout/adapter/sidecar/SidecarCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getResourcesForApplication;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;,
        Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;,
        Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0004$%&\'B\u001b\u0008\u0007\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0011\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0006\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0008\u0010\"\u001a\u00020#H\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038G\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Landroidx/window/layout/adapter/sidecar/SidecarCompat;",
        "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;",
        "sidecar",
        "Landroidx/window/sidecar/SidecarInterface;",
        "sidecarAdapter",
        "Landroidx/window/layout/adapter/sidecar/SidecarAdapter;",
        "<init>",
        "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/adapter/sidecar/SidecarAdapter;)V",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getSidecar",
        "()Landroidx/window/sidecar/SidecarInterface;",
        "windowListenerRegisteredContexts",
        "",
        "Landroid/os/IBinder;",
        "Landroid/app/Activity;",
        "componentCallbackMap",
        "Landroidx/core/util/Consumer;",
        "Landroid/content/res/Configuration;",
        "extensionCallback",
        "Landroidx/window/layout/adapter/sidecar/SidecarCompat$DistinctElementCallback;",
        "setExtensionCallback",
        "",
        "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat$ExtensionCallbackInterface;",
        "getWindowLayoutInfo",
        "Landroidx/window/layout/WindowLayoutInfo;",
        "activity",
        "onWindowLayoutChangeListenerAdded",
        "register",
        "windowToken",
        "registerConfigurationChangeListener",
        "onWindowLayoutChangeListenerRemoved",
        "unregisterComponentCallback",
        "validateExtensionInterface",
        "",
        "FirstAttachAdapter",
        "TranslatingCallback",
        "DistinctElementCallback",
        "Companion",
        "window_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;


# instance fields
.field private final IconCompatParcelizer:Landroidx/window/sidecar/SidecarInterface;

.field private final RemoteActionCompatParcelizer:Lo/getUserBadgedLabel;

.field private read:Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;

.field private final write:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 54
    new-instance v0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;

    return-void
.end method

.method public static final synthetic IconCompatParcelizer(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Ljava/util/Map;
    .registers 1

    .line 50
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->write:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;
    .registers 1

    .line 50
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->read:Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;

    return-object p0
.end method

.method public static final synthetic write(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Lo/getUserBadgedLabel;
    .registers 1

    .line 50
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->RemoteActionCompatParcelizer:Lo/getUserBadgedLabel;

    return-object p0
.end method


# virtual methods
.method public final IconCompatParcelizer()Landroidx/window/sidecar/SidecarInterface;
    .registers 1

    .line 53
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->IconCompatParcelizer:Landroidx/window/sidecar/SidecarInterface;

    return-object p0
.end method

###### Class androidx.window.layout.adapter.sidecar.SidecarCompat.IconCompatParcelizer (androidx.window.layout.adapter.sidecar.SidecarCompat$IconCompatParcelizer)
.class public final Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/adapter/sidecar/SidecarCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0000\u00a2\u0006\u0002\u0008\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000\u00a2\u0006\u0002\u0008\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/window/layout/adapter/sidecar/SidecarCompat$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "sidecarVersion",
        "Landroidx/window/core/Version;",
        "getSidecarVersion",
        "()Landroidx/window/core/Version;",
        "getSidecarCompat",
        "Landroidx/window/sidecar/SidecarInterface;",
        "context",
        "Landroid/content/Context;",
        "getSidecarCompat$window_release",
        "getActivityWindowToken",
        "Landroid/os/IBinder;",
        "activity",
        "Landroid/app/Activity;",
        "getActivityWindowToken$window_release",
        "window_release"
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
.method private constructor <init>()V
    .registers 1

    .line 395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 424
    invoke-direct {p0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroid/app/Activity;)Landroid/os/IBinder;
    .registers 2

    if-eqz p1, :cond_11

    .line 423
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_11

    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p0

    if-eqz p0, :cond_11

    iget-object p0, p0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    return-object p0

    :cond_11
    const/4 p0, 0x0

    return-object p0
.end method

###### Class androidx.window.layout.adapter.sidecar.SidecarCompat.RemoteActionCompatParcelizer (androidx.window.layout.adapter.sidecar.SidecarCompat$RemoteActionCompatParcelizer)
.class final Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getResourcesForApplication$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/adapter/sidecar/SidecarCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "RemoteActionCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011"
    }
    d2 = {
        "Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;",
        "Lo/getResourcesForApplication$AudioAttributesCompatParcelizer;",
        "Landroid/app/Activity;",
        "p0",
        "Lo/getPreferredActivities;",
        "p1",
        "",
        "RemoteActionCompatParcelizer",
        "(Landroid/app/Activity;Lo/getPreferredActivities;)V",
        "read",
        "Lo/getResourcesForApplication$AudioAttributesCompatParcelizer;",
        "AudioAttributesCompatParcelizer",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "IconCompatParcelizer",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "write",
        "Ljava/util/WeakHashMap;",
        "Ljava/util/WeakHashMap;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final IconCompatParcelizer:Ljava/util/concurrent/locks/ReentrantLock;

.field private final RemoteActionCompatParcelizer:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/app/Activity;",
            "Lo/getPreferredActivities;",
            ">;"
        }
    .end annotation
.end field

.field private final read:Lo/getResourcesForApplication$AudioAttributesCompatParcelizer;


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/app/Activity;Lo/getPreferredActivities;)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;->IconCompatParcelizer:Ljava/util/concurrent/locks/ReentrantLock;

    check-cast v0, Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 381
    :try_start_f
    iget-object v1, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/getPreferredActivities;

    .line 382
    invoke-static {p2, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1
    :try_end_1b
    .catchall {:try_start_f .. :try_end_1b} :catchall_32

    if-eqz v1, :cond_21

    .line 383
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    .line 385
    :cond_21
    :try_start_21
    iget-object v1, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/getPreferredActivities;
    :try_end_29
    .catchall {:try_start_21 .. :try_end_29} :catchall_32

    .line 380
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 387
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;->read:Lo/getResourcesForApplication$AudioAttributesCompatParcelizer;

    invoke-interface {p0, p1, p2}, Lo/getResourcesForApplication$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/app/Activity;Lo/getPreferredActivities;)V

    return-void

    :catchall_32
    move-exception p0

    .line 380
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method

###### Class androidx.window.layout.adapter.sidecar.SidecarCompat.TranslatingCallback (androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback)
.class public final Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/adapter/sidecar/SidecarCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "TranslatingCallback"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;",
        "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;",
        "<init>",
        "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V",
        "onDeviceStateChanged",
        "",
        "newDeviceState",
        "Landroidx/window/sidecar/SidecarDeviceState;",
        "onWindowLayoutChanged",
        "windowToken",
        "Landroid/os/IBinder;",
        "newLayout",
        "Landroidx/window/sidecar/SidecarWindowLayoutInfo;",
        "window_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat;


# virtual methods
.method public final onDeviceStateChanged(Landroidx/window/sidecar/SidecarDeviceState;)V
    .registers 7

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat;

    invoke-static {v0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->IconCompatParcelizer(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat;

    .line 428
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_48

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 333
    sget-object v2, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;

    invoke-virtual {v2, v1}, Landroidx/window/layout/adapter/sidecar/SidecarCompat$IconCompatParcelizer;->IconCompatParcelizer(Landroid/app/Activity;)Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_36

    .line 334
    invoke-virtual {p0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->IconCompatParcelizer()Landroidx/window/sidecar/SidecarInterface;

    move-result-object v4

    if-eqz v4, :cond_36

    invoke-interface {v4, v2}, Landroidx/window/sidecar/SidecarInterface;->getWindowLayoutInfo(Landroid/os/IBinder;)Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    move-result-object v3

    .line 336
    :cond_36
    invoke-static {p0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->RemoteActionCompatParcelizer(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;

    move-result-object v2

    if-eqz v2, :cond_17

    .line 338
    invoke-static {p0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->write(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Lo/getUserBadgedLabel;

    move-result-object v4

    invoke-virtual {v4, v3, p1}, Lo/getUserBadgedLabel;->RemoteActionCompatParcelizer(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Lo/getPreferredActivities;

    move-result-object v3

    .line 336
    invoke-virtual {v2, v1, v3}, Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/app/Activity;Lo/getPreferredActivities;)V

    goto :goto_17

    :cond_48
    return-void
.end method

.method public final onWindowLayoutChanged(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat;

    invoke-static {v0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->IconCompatParcelizer(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_17

    return-void

    .line 357
    :cond_17
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat;

    invoke-static {v0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->write(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Lo/getUserBadgedLabel;

    move-result-object v0

    iget-object v1, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat;

    invoke-virtual {v1}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->IconCompatParcelizer()Landroidx/window/sidecar/SidecarInterface;

    move-result-object v1

    if-eqz v1, :cond_2b

    invoke-interface {v1}, Landroidx/window/sidecar/SidecarInterface;->getDeviceState()Landroidx/window/sidecar/SidecarDeviceState;

    move-result-object v1

    if-nez v1, :cond_30

    :cond_2b
    new-instance v1, Landroidx/window/sidecar/SidecarDeviceState;

    invoke-direct {v1}, Landroidx/window/sidecar/SidecarDeviceState;-><init>()V

    :cond_30
    invoke-virtual {v0, p2, v1}, Lo/getUserBadgedLabel;->RemoteActionCompatParcelizer(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Lo/getPreferredActivities;

    move-result-object p2

    .line 358
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->AudioAttributesCompatParcelizer:Landroidx/window/layout/adapter/sidecar/SidecarCompat;

    invoke-static {p0}, Landroidx/window/layout/adapter/sidecar/SidecarCompat;->RemoteActionCompatParcelizer(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;

    move-result-object p0

    if-eqz p0, :cond_3f

    invoke-virtual {p0, p1, p2}, Landroidx/window/layout/adapter/sidecar/SidecarCompat$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/app/Activity;Lo/getPreferredActivities;)V

    :cond_3f
    return-void
.end method
