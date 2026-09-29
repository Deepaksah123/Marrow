###### Class androidx.media3.exoplayer.video.PlaceholderSurface (androidx.media3.exoplayer.video.PlaceholderSurface)
.class public final Landroidx/media3/exoplayer/video/PlaceholderSurface;
.super Landroid/view/Surface;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;
    }
.end annotation


# static fields
.field private static RemoteActionCompatParcelizer:Z

.field private static read:I


# instance fields
.field public final AudioAttributesCompatParcelizer:Z

.field private IconCompatParcelizer:Z

.field private final write:Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;Landroid/graphics/SurfaceTexture;Z)V
    .registers 4

    .line 96
    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 97
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->write:Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;

    .line 98
    iput-boolean p3, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->AudioAttributesCompatParcelizer:Z

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;Landroid/graphics/SurfaceTexture;ZB)V
    .registers 5

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/video/PlaceholderSurface;-><init>(Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;Landroid/graphics/SurfaceTexture;Z)V

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Landroid/content/Context;)Z
    .registers 4

    const-class v0, Landroidx/media3/exoplayer/video/PlaceholderSurface;

    monitor-enter v0

    .line 60
    :try_start_3
    sget-boolean v1, Landroidx/media3/exoplayer/video/PlaceholderSurface;->RemoteActionCompatParcelizer:Z

    const/4 v2, 0x1

    if-nez v1, :cond_10

    .line 61
    invoke-static {p0}, Landroidx/media3/exoplayer/video/PlaceholderSurface;->IconCompatParcelizer(Landroid/content/Context;)I

    move-result p0

    sput p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->read:I

    .line 62
    sput-boolean v2, Landroidx/media3/exoplayer/video/PlaceholderSurface;->RemoteActionCompatParcelizer:Z

    .line 64
    :cond_10
    sget p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->read:I
    :try_end_12
    .catchall {:try_start_3 .. :try_end_12} :catchall_17

    if-nez p0, :cond_15

    const/4 v2, 0x0

    :cond_15
    monitor-exit v0

    return v2

    :catchall_17
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static IconCompatParcelizer(Landroid/content/Context;)I
    .registers 1

    .line 117
    invoke-static {p0}, Lo/TypeSerializer1;->read(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_10

    .line 118
    invoke-static {}, Lo/TypeSerializer1;->read()Z

    move-result p0

    if-eqz p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x2

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public static write(Landroid/content/Context;Z)Landroidx/media3/exoplayer/video/PlaceholderSurface;
    .registers 3

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    .line 89
    invoke-static {p0}, Landroidx/media3/exoplayer/video/PlaceholderSurface;->AudioAttributesCompatParcelizer(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_b

    move p0, v0

    goto :goto_c

    :cond_b
    const/4 p0, 0x1

    :goto_c
    invoke-static {p0}, Lo/buildTypeSerializer;->write(Z)V

    .line 90
    new-instance p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;

    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;-><init>()V

    if-eqz p1, :cond_18

    .line 91
    sget v0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->read:I

    :cond_18
    invoke-virtual {p0, v0}, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(I)Landroidx/media3/exoplayer/video/PlaceholderSurface;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final release()V
    .registers 3

    .line 103
    invoke-super {p0}, Landroid/view/Surface;->release()V

    .line 108
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->write:Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;

    monitor-enter v0

    .line 109
    :try_start_6
    iget-boolean v1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->IconCompatParcelizer:Z

    if-nez v1, :cond_12

    .line 110
    iget-object v1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->write:Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;

    invoke-virtual {v1}, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()V

    const/4 v1, 0x1

    .line 111
    iput-boolean v1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;->IconCompatParcelizer:Z
    :try_end_12
    .catchall {:try_start_6 .. :try_end_12} :catchall_14

    .line 113
    :cond_12
    monitor-exit v0

    return-void

    :catchall_14
    move-exception p0

    monitor-exit v0

    throw p0
.end method

###### Class androidx.media3.exoplayer.video.PlaceholderSurface.AudioAttributesCompatParcelizer (androidx.media3.exoplayer.video.PlaceholderSurface$AudioAttributesCompatParcelizer)
.class final Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/PlaceholderSurface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Landroidx/media3/exoplayer/video/PlaceholderSurface;

.field private IconCompatParcelizer:Ljava/lang/RuntimeException;

.field private RemoteActionCompatParcelizer:Ljava/lang/Error;

.field private read:Landroid/os/Handler;

.field private write:Lo/_locateTypeId;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 144
    const-string v0, "ExoPlayer:PlaceholderSurface"

    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private read(I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/TypeSerializer1$IconCompatParcelizer;
        }
    .end annotation

    .line 216
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->write:Lo/_locateTypeId;

    .line 217
    invoke-virtual {v0, p1}, Lo/_locateTypeId;->IconCompatParcelizer(I)V

    .line 218
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->write:Lo/_locateTypeId;

    .line 220
    invoke-virtual {v0}, Lo/_locateTypeId;->AudioAttributesCompatParcelizer()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_10

    const/4 p1, 0x1

    goto :goto_11

    :cond_10
    move p1, v1

    :goto_11
    new-instance v2, Landroidx/media3/exoplayer/video/PlaceholderSurface;

    invoke-direct {v2, p0, v0, p1, v1}, Landroidx/media3/exoplayer/video/PlaceholderSurface;-><init>(Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;Landroid/graphics/SurfaceTexture;ZB)V

    iput-object v2, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    return-void
.end method

.method private write()V
    .registers 1

    .line 224
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->write:Lo/_locateTypeId;

    .line 225
    invoke-virtual {p0}, Lo/_locateTypeId;->IconCompatParcelizer()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(I)Landroidx/media3/exoplayer/video/PlaceholderSurface;
    .registers 5

    .line 148
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 149
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->read:Landroid/os/Handler;

    .line 150
    new-instance v0, Lo/_locateTypeId;

    iget-object v1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->read:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/_locateTypeId;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->write:Lo/_locateTypeId;

    .line 152
    monitor-enter p0

    .line 153
    :try_start_18
    iget-object v0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->read:Landroid/os/Handler;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v2, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 154
    :goto_23
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    if-nez p1, :cond_35

    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/RuntimeException;

    if-nez p1, :cond_35

    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/Error;
    :try_end_2d
    .catchall {:try_start_18 .. :try_end_2d} :catchall_52

    if-nez p1, :cond_35

    .line 156
    :try_start_2f
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_32
    .catch Ljava/lang/InterruptedException; {:try_start_2f .. :try_end_32} :catch_33
    .catchall {:try_start_2f .. :try_end_32} :catchall_52

    goto :goto_23

    :catch_33
    move v1, v2

    goto :goto_23

    .line 161
    :cond_35
    monitor-exit p0

    if-eqz v1, :cond_3f

    .line 164
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 166
    :cond_3f
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/RuntimeException;

    if-nez p1, :cond_51

    .line 168
    iget-object p1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/Error;

    if-nez p1, :cond_50

    .line 171
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroidx/media3/exoplayer/video/PlaceholderSurface;

    invoke-static {p0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/media3/exoplayer/video/PlaceholderSurface;

    return-object p0

    .line 169
    :cond_50
    throw p1

    .line 167
    :cond_51
    throw p1

    :catchall_52
    move-exception p1

    .line 161
    monitor-exit p0

    throw p1
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 2

    .line 176
    iget-object p0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->read:Landroid/os/Handler;

    const/4 v0, 0x2

    .line 177
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .registers 5

    .line 182
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1e

    const/4 p1, 0x2

    if-eq v0, p1, :cond_9

    return v1

    .line 203
    :cond_9
    :try_start_9
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->write()V
    :try_end_c
    .catchall {:try_start_9 .. :try_end_c} :catchall_d

    goto :goto_15

    :catchall_d
    move-exception p1

    .line 205
    :try_start_e
    const-string v0, "PlaceholderSurface"

    const-string v2, "Failed to release placeholder surface"

    invoke-static {v0, v2, p1}, Lo/prune;->read(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_15
    .catchall {:try_start_e .. :try_end_15} :catchall_19

    .line 207
    :goto_15
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    return v1

    :catchall_19
    move-exception p1

    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 208
    throw p1

    .line 185
    :cond_1e
    :try_start_1e
    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->read(I)V
    :try_end_23
    .catch Ljava/lang/RuntimeException; {:try_start_1e .. :try_end_23} :catch_57
    .catch Lo/TypeSerializer1$IconCompatParcelizer; {:try_start_1e .. :try_end_23} :catch_40
    .catch Ljava/lang/Error; {:try_start_1e .. :try_end_23} :catch_2e
    .catchall {:try_start_1e .. :try_end_23} :catchall_2c

    .line 196
    monitor-enter p0

    .line 197
    :try_start_24
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_27
    .catchall {:try_start_24 .. :try_end_27} :catchall_29

    .line 198
    :goto_27
    monitor-exit p0

    goto :goto_66

    :catchall_29
    move-exception p1

    monitor-exit p0

    throw p1

    :catchall_2c
    move-exception p1

    goto :goto_6a

    :catch_2e
    move-exception p1

    .line 193
    :try_start_2f
    const-string v0, "PlaceholderSurface"

    const-string v2, "Failed to initialize placeholder surface"

    invoke-static {v0, v2, p1}, Lo/prune;->read(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/lang/Error;
    :try_end_38
    .catchall {:try_start_2f .. :try_end_38} :catchall_2c

    .line 196
    monitor-enter p0

    .line 197
    :try_start_39
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_3c
    .catchall {:try_start_39 .. :try_end_3c} :catchall_3d

    goto :goto_27

    :catchall_3d
    move-exception p1

    .line 198
    monitor-exit p0

    throw p1

    :catch_40
    move-exception p1

    .line 190
    :try_start_41
    const-string v0, "PlaceholderSurface"

    const-string v2, "Failed to initialize placeholder surface"

    invoke-static {v0, v2, p1}, Lo/prune;->read(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/RuntimeException;
    :try_end_4f
    .catchall {:try_start_41 .. :try_end_4f} :catchall_2c

    .line 196
    monitor-enter p0

    .line 197
    :try_start_50
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_53
    .catchall {:try_start_50 .. :try_end_53} :catchall_54

    goto :goto_27

    :catchall_54
    move-exception p1

    .line 198
    monitor-exit p0

    throw p1

    :catch_57
    move-exception p1

    .line 187
    :try_start_58
    const-string v0, "PlaceholderSurface"

    const-string v2, "Failed to initialize placeholder surface"

    invoke-static {v0, v2, p1}, Lo/prune;->read(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 188
    iput-object p1, p0, Landroidx/media3/exoplayer/video/PlaceholderSurface$AudioAttributesCompatParcelizer;->IconCompatParcelizer:Ljava/lang/RuntimeException;
    :try_end_61
    .catchall {:try_start_58 .. :try_end_61} :catchall_2c

    .line 196
    monitor-enter p0

    .line 197
    :try_start_62
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_65
    .catchall {:try_start_62 .. :try_end_65} :catchall_67

    goto :goto_27

    :goto_66
    return v1

    :catchall_67
    move-exception p1

    .line 198
    monitor-exit p0

    throw p1

    .line 196
    :goto_6a
    monitor-enter p0

    .line 197
    :try_start_6b
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_6e
    .catchall {:try_start_6b .. :try_end_6e} :catchall_70

    .line 198
    monitor-exit p0

    .line 199
    throw p1

    :catchall_70
    move-exception p1

    .line 198
    monitor-exit p0

    throw p1
.end method
