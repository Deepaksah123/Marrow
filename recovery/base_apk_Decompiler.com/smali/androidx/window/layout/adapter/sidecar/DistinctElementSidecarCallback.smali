###### Class androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback (androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback)
.class public Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/window/sidecar/SidecarInterface$SidecarCallback;


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/lang/Object;

.field private final IconCompatParcelizer:Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

.field private final RemoteActionCompatParcelizer:Lo/getUserBadgedLabel;

.field private final read:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Landroidx/window/sidecar/SidecarWindowLayoutInfo;",
            ">;"
        }
    .end annotation
.end field

.field private write:Landroidx/window/sidecar/SidecarDeviceState;


# virtual methods
.method public onDeviceStateChanged(Landroidx/window/sidecar/SidecarDeviceState;)V
    .registers 4

    if-nez p1, :cond_3

    return-void

    .line 79
    :cond_3
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->AudioAttributesCompatParcelizer:Ljava/lang/Object;

    monitor-enter v0

    .line 80
    :try_start_6
    iget-object v1, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->write:Landroidx/window/sidecar/SidecarDeviceState;

    invoke-static {v1, p1}, Lo/getUserBadgedLabel;->read(Landroidx/window/sidecar/SidecarDeviceState;Landroidx/window/sidecar/SidecarDeviceState;)Z

    move-result v1
    :try_end_c
    .catchall {:try_start_6 .. :try_end_c} :catchall_19

    if-eqz v1, :cond_10

    .line 81
    monitor-exit v0

    return-void

    .line 83
    :cond_10
    :try_start_10
    iput-object p1, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->write:Landroidx/window/sidecar/SidecarDeviceState;
    :try_end_12
    .catchall {:try_start_10 .. :try_end_12} :catchall_19

    .line 84
    monitor-exit v0

    .line 85
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->IconCompatParcelizer:Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

    invoke-interface {p0, p1}, Landroidx/window/sidecar/SidecarInterface$SidecarCallback;->onDeviceStateChanged(Landroidx/window/sidecar/SidecarDeviceState;)V

    return-void

    :catchall_19
    move-exception p0

    .line 84
    monitor-exit v0

    throw p0
.end method

.method public onWindowLayoutChanged(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V
    .registers 6

    .line 91
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->AudioAttributesCompatParcelizer:Ljava/lang/Object;

    monitor-enter v0

    .line 92
    :try_start_3
    iget-object v1, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->read:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    .line 93
    iget-object v2, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->RemoteActionCompatParcelizer:Lo/getUserBadgedLabel;

    invoke-virtual {v2, v1, p2}, Lo/getUserBadgedLabel;->RemoteActionCompatParcelizer(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Z

    move-result v1
    :try_end_11
    .catchall {:try_start_3 .. :try_end_11} :catchall_21

    if-eqz v1, :cond_15

    .line 94
    monitor-exit v0

    return-void

    .line 96
    :cond_15
    :try_start_15
    iget-object v1, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->read:Ljava/util/Map;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1a
    .catchall {:try_start_15 .. :try_end_1a} :catchall_21

    .line 97
    monitor-exit v0

    .line 98
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/DistinctElementSidecarCallback;->IconCompatParcelizer:Landroidx/window/sidecar/SidecarInterface$SidecarCallback;

    invoke-interface {p0, p1, p2}, Landroidx/window/sidecar/SidecarInterface$SidecarCallback;->onWindowLayoutChanged(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V

    return-void

    :catchall_21
    move-exception p0

    .line 97
    monitor-exit v0

    throw p0
.end method
