###### Class androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView (androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView)
.class public final Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;,
        Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private AudioAttributesImplApi21Parcelizer:Landroid/graphics/SurfaceTexture;

.field private AudioAttributesImplApi26Parcelizer:Landroid/view/Surface;

.field private final AudioAttributesImplBaseParcelizer:Landroid/hardware/SensorManager;

.field private final IconCompatParcelizer:Lo/ArrayBuildersByteBuilder;

.field private final MediaBrowserCompatCustomActionResultReceiver:Lo/getDefaultValue;

.field private final MediaBrowserCompatItemReceiver:Lo/ArrayBuildersShortBuilder;

.field private final MediaBrowserCompatMediaItem:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;",
            ">;"
        }
    .end annotation
.end field

.field private MediaMetadataCompat:Z

.field private final RemoteActionCompatParcelizer:Landroid/hardware/Sensor;

.field private final read:Landroid/os/Handler;

.field private write:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 94
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 8

    .line 98
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 99
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatMediaItem:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->read:Landroid/os/Handler;

    .line 104
    const-string p2, "sensor"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/SensorManager;

    iput-object p2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplBaseParcelizer:Landroid/hardware/SensorManager;

    const/16 v0, 0xf

    .line 110
    invoke-virtual {p2, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    if-nez v0, :cond_31

    const/16 v0, 0xb

    .line 112
    invoke-virtual {p2, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    .line 114
    :cond_31
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->RemoteActionCompatParcelizer:Landroid/hardware/Sensor;

    .line 116
    new-instance p2, Lo/ArrayBuildersShortBuilder;

    invoke-direct {p2}, Lo/ArrayBuildersShortBuilder;-><init>()V

    iput-object p2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatItemReceiver:Lo/ArrayBuildersShortBuilder;

    .line 117
    new-instance v0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;

    invoke-direct {v0, p0, p2}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;-><init>(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;Lo/ArrayBuildersShortBuilder;)V

    .line 119
    new-instance p2, Lo/getDefaultValue;

    invoke-direct {p2, p1, v0}, Lo/getDefaultValue;-><init>(Landroid/content/Context;Lo/getDefaultValue$IconCompatParcelizer;)V

    iput-object p2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatCustomActionResultReceiver:Lo/getDefaultValue;

    .line 120
    const-string v1, "window"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    .line 121
    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    const/4 v1, 0x2

    .line 122
    new-array v2, v1, [Lo/ArrayBuildersByteBuilder$IconCompatParcelizer;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    new-instance v4, Lo/ArrayBuildersByteBuilder;

    invoke-direct {v4, p1, v2}, Lo/ArrayBuildersByteBuilder;-><init>(Landroid/view/Display;[Lo/ArrayBuildersByteBuilder$IconCompatParcelizer;)V

    iput-object v4, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->IconCompatParcelizer:Lo/ArrayBuildersByteBuilder;

    .line 123
    iput-boolean v3, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaMetadataCompat:Z

    .line 125
    invoke-virtual {p0, v1}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->setEGLContextClientVersion(I)V

    .line 126
    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 127
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private IconCompatParcelizer()V
    .registers 6

    .line 218
    iget-boolean v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaMetadataCompat:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    iget-boolean v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesCompatParcelizer:Z

    if-eqz v0, :cond_b

    const/4 v0, 0x1

    goto :goto_c

    :cond_b
    move v0, v1

    .line 219
    :goto_c
    iget-object v2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->RemoteActionCompatParcelizer:Landroid/hardware/Sensor;

    if-eqz v2, :cond_27

    iget-boolean v3, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->write:Z

    if-eq v0, v3, :cond_27

    if-eqz v0, :cond_1e

    .line 223
    iget-object v3, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplBaseParcelizer:Landroid/hardware/SensorManager;

    iget-object v4, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->IconCompatParcelizer:Lo/ArrayBuildersByteBuilder;

    invoke-virtual {v3, v4, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_25

    .line 226
    :cond_1e
    iget-object v1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplBaseParcelizer:Landroid/hardware/SensorManager;

    iget-object v2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->IconCompatParcelizer:Lo/ArrayBuildersByteBuilder;

    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 228
    :goto_25
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->write:Z

    :cond_27
    return-void
.end method

.method private RemoteActionCompatParcelizer(Landroid/graphics/SurfaceTexture;)V
    .registers 4

    .line 233
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->read:Landroid/os/Handler;

    new-instance v1, Lo/isJodaTimeClass;

    invoke-direct {v1, p0, p1}, Lo/isJodaTimeClass;-><init>(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static read(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .registers 2

    if-eqz p0, :cond_5

    .line 250
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_5
    if-eqz p1, :cond_a

    .line 253
    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    :cond_a
    return-void
.end method

.method static synthetic read(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;Landroid/graphics/SurfaceTexture;)V
    .registers 2

    .line 58
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->RemoteActionCompatParcelizer(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/ArrayBuildersDoubleBuilder;
    .registers 1

    .line 164
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatItemReceiver:Lo/ArrayBuildersShortBuilder;

    return-object p0
.end method

.method public final synthetic IconCompatParcelizer(Landroid/graphics/SurfaceTexture;)V
    .registers 5

    .line 235
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/SurfaceTexture;

    .line 236
    iget-object v1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi26Parcelizer:Landroid/view/Surface;

    .line 237
    new-instance v2, Landroid/view/Surface;

    invoke-direct {v2, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 238
    iput-object p1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/SurfaceTexture;

    .line 239
    iput-object v2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi26Parcelizer:Landroid/view/Surface;

    .line 240
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatMediaItem:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_13
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_23

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;

    .line 241
    invoke-interface {p1, v2}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;->AudioAttributesCompatParcelizer(Landroid/view/Surface;)V

    goto :goto_13

    .line 243
    :cond_23
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->read(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    return-void
.end method

.method public final synthetic RemoteActionCompatParcelizer()V
    .registers 4

    .line 205
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi26Parcelizer:Landroid/view/Surface;

    if-eqz v0, :cond_1a

    .line 207
    iget-object v1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatMediaItem:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;

    .line 208
    invoke-interface {v2}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;->read()V

    goto :goto_a

    .line 211
    :cond_1a
    iget-object v1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/SurfaceTexture;

    invoke-static {v1, v0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->read(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    const/4 v0, 0x0

    .line 212
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi21Parcelizer:Landroid/graphics/SurfaceTexture;

    .line 213
    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi26Parcelizer:Landroid/view/Surface;

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;)V
    .registers 2

    .line 145
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatMediaItem:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final onDetachedFromWindow()V
    .registers 3

    .line 200
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    .line 203
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->read:Landroid/os/Handler;

    new-instance v1, Lo/ByteBufferBackedInputStream;

    invoke-direct {v1, p0}, Lo/ByteBufferBackedInputStream;-><init>(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onPause()V
    .registers 2

    const/4 v0, 0x0

    .line 192
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesCompatParcelizer:Z

    .line 193
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->IconCompatParcelizer()V

    .line 194
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public final onResume()V
    .registers 2

    .line 185
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 v0, 0x1

    .line 186
    iput-boolean v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesCompatParcelizer:Z

    .line 187
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->IconCompatParcelizer()V

    return-void
.end method

.method public final read()Lo/getRemainingInput;
    .registers 1

    .line 159
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatItemReceiver:Lo/ArrayBuildersShortBuilder;

    return-object p0
.end method

.method public final read(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;)V
    .registers 2

    .line 136
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatMediaItem:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final setDefaultStereoMode(I)V
    .registers 2

    .line 174
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaBrowserCompatItemReceiver:Lo/ArrayBuildersShortBuilder;

    invoke-virtual {p0, p1}, Lo/ArrayBuildersShortBuilder;->read(I)V

    return-void
.end method

.method public final setUseSensorRotation(Z)V
    .registers 2

    .line 179
    iput-boolean p1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->MediaMetadataCompat:Z

    .line 180
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->IconCompatParcelizer()V

    return-void
.end method

.method public final write()Landroid/view/Surface;
    .registers 1

    .line 154
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->AudioAttributesImplApi26Parcelizer:Landroid/view/Surface;

    return-object p0
.end method

###### Class androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.read (androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$read)
.class public interface abstract Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "read"
.end annotation


# virtual methods
.method public abstract AudioAttributesCompatParcelizer(Landroid/view/Surface;)V
.end method

.method public abstract read()V
.end method

###### Class androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.write (androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$write)
.class final Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;
.implements Lo/getDefaultValue$IconCompatParcelizer;
.implements Lo/ArrayBuildersByteBuilder$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "write"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:F

.field private AudioAttributesImplApi21Parcelizer:F

.field private final AudioAttributesImplApi26Parcelizer:[F

.field private final AudioAttributesImplBaseParcelizer:[F

.field private final IconCompatParcelizer:Lo/ArrayBuildersShortBuilder;

.field private final MediaBrowserCompatCustomActionResultReceiver:[F

.field private final MediaBrowserCompatItemReceiver:[F

.field private final MediaBrowserCompatSearchResultReceiver:[F

.field private final RemoteActionCompatParcelizer:[F

.field final synthetic read:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

.field private final write:[F


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;Lo/ArrayBuildersShortBuilder;)V
    .registers 7

    .line 285
    iput-object p1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->read:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    .line 265
    new-array v0, p1, [F

    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->RemoteActionCompatParcelizer:[F

    .line 268
    new-array v0, p1, [F

    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatSearchResultReceiver:[F

    .line 272
    new-array v0, p1, [F

    iput-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->write:[F

    .line 276
    new-array v1, p1, [F

    iput-object v1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatItemReceiver:[F

    .line 277
    new-array v2, p1, [F

    iput-object v2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesImplBaseParcelizer:[F

    .line 282
    new-array v3, p1, [F

    iput-object v3, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatCustomActionResultReceiver:[F

    .line 283
    new-array p1, p1, [F

    iput-object p1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesImplApi26Parcelizer:[F

    .line 286
    iput-object p2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->IconCompatParcelizer:Lo/ArrayBuildersShortBuilder;

    .line 287
    invoke-static {v0}, Lo/TypeSerializer1;->IconCompatParcelizer([F)V

    .line 288
    invoke-static {v1}, Lo/TypeSerializer1;->IconCompatParcelizer([F)V

    .line 289
    invoke-static {v2}, Lo/TypeSerializer1;->IconCompatParcelizer([F)V

    const p1, 0x40490fdb    # (float)Math.PI

    .line 290
    iput p1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesCompatParcelizer:F

    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 7

    .line 338
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatItemReceiver:[F

    iget v1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesImplApi21Parcelizer:F

    neg-float v2, v1

    iget v1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesCompatParcelizer:F

    float-to-double v3, v1

    .line 342
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v3, v3

    iget p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesCompatParcelizer:F

    float-to-double v4, p0

    .line 343
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 338
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    return-void
.end method

.method private static write(F)F
    .registers 5

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_22

    const-wide v0, 0x4046800000000000L    # 45.0

    .line 365
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    float-to-double v2, p0

    div-double/2addr v0, v2

    .line 366
    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v2

    double-to-float p0, v0

    return p0

    :cond_22
    const/high16 p0, 0x42b40000    # 90.0f

    return p0
.end method


# virtual methods
.method public final IconCompatParcelizer()Z
    .registers 1

    .line 358
    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->read:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    move-result p0

    return p0
.end method

.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .registers 14

    .line 311
    monitor-enter p0

    .line 312
    :try_start_1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesImplApi26Parcelizer:[F

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->write:[F

    const/4 v3, 0x0

    iget-object v4, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesImplBaseParcelizer:[F

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 313
    iget-object v6, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatCustomActionResultReceiver:[F

    const/4 v7, 0x0

    iget-object v8, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatItemReceiver:[F

    const/4 v9, 0x0

    iget-object v10, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesImplApi26Parcelizer:[F

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V
    :try_end_19
    .catchall {:try_start_1 .. :try_end_19} :catchall_2e

    .line 314
    monitor-exit p0

    .line 316
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatSearchResultReceiver:[F

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->RemoteActionCompatParcelizer:[F

    const/4 v3, 0x0

    iget-object v4, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatCustomActionResultReceiver:[F

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 317
    iget-object p1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->IconCompatParcelizer:Lo/ArrayBuildersShortBuilder;

    iget-object p0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->MediaBrowserCompatSearchResultReceiver:[F

    invoke-virtual {p1, p0}, Lo/ArrayBuildersShortBuilder;->RemoteActionCompatParcelizer([F)V

    return-void

    :catchall_2e
    move-exception p1

    .line 314
    monitor-exit p0

    throw p1
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .registers 10

    const/4 p1, 0x0

    .line 300
    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    int-to-float p1, p2

    int-to-float p2, p3

    div-float v3, p1, p2

    .line 302
    invoke-static {v3}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->write(F)F

    move-result v2

    .line 303
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->RemoteActionCompatParcelizer:[F

    const/4 v1, 0x0

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x42c80000    # 100.0f

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    return-void
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .registers 3

    monitor-enter p0

    .line 295
    :try_start_1
    iget-object p1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->read:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    iget-object p2, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->IconCompatParcelizer:Lo/ArrayBuildersShortBuilder;

    invoke-virtual {p2}, Lo/ArrayBuildersShortBuilder;->read()Landroid/graphics/SurfaceTexture;

    move-result-object p2

    invoke-static {p1, p2}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->read(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;Landroid/graphics/SurfaceTexture;)V
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_e

    .line 296
    monitor-exit p0

    return-void

    :catchall_e
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final write(Landroid/graphics/PointF;)V
    .registers 9

    monitor-enter p0

    .line 350
    :try_start_1
    iget v0, p1, Landroid/graphics/PointF;->y:F

    iput v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesImplApi21Parcelizer:F

    .line 351
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesCompatParcelizer()V

    .line 352
    iget-object v1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesImplBaseParcelizer:[F

    const/4 v2, 0x0

    iget p1, p1, Landroid/graphics/PointF;->x:F

    neg-float v3, p1

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V
    :try_end_15
    .catchall {:try_start_1 .. :try_end_15} :catchall_17

    .line 353
    monitor-exit p0

    return-void

    :catchall_17
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final write([FF)V
    .registers 6

    monitor-enter p0

    .line 324
    :try_start_1
    iget-object v0, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->write:[F

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    neg-float p1, p2

    .line 325
    iput p1, p0, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesCompatParcelizer:F

    .line 326
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView$write;->AudioAttributesCompatParcelizer()V
    :try_end_e
    .catchall {:try_start_1 .. :try_end_e} :catchall_10

    .line 327
    monitor-exit p0

    return-void

    :catchall_10
    move-exception p1

    monitor-exit p0

    throw p1
.end method

###### Class kotlin.ByteBufferBackedInputStream (o.ByteBufferBackedInputStream)
.class public final synthetic Lo/ByteBufferBackedInputStream;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ByteBufferBackedInputStream;->IconCompatParcelizer:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/ByteBufferBackedInputStream;->IconCompatParcelizer:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    invoke-virtual {p0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->RemoteActionCompatParcelizer()V

    return-void
.end method

###### Class kotlin.isJodaTimeClass (o.isJodaTimeClass)
.class public final synthetic Lo/isJodaTimeClass;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroid/graphics/SurfaceTexture;

.field public final synthetic write:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;Landroid/graphics/SurfaceTexture;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/isJodaTimeClass;->write:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    iput-object p2, p0, Lo/isJodaTimeClass;->AudioAttributesCompatParcelizer:Landroid/graphics/SurfaceTexture;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 0
    iget-object v0, p0, Lo/isJodaTimeClass;->write:Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;

    iget-object p0, p0, Lo/isJodaTimeClass;->AudioAttributesCompatParcelizer:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, p0}, Landroidx/media3/exoplayer/video/spherical/SphericalGLSurfaceView;->IconCompatParcelizer(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
