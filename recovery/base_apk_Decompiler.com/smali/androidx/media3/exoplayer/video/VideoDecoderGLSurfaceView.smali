###### Class androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView (androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView)
.class public final Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"

# interfaces
.implements Lo/parseTypes;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;
    }
.end annotation


# instance fields
.field private final write:Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 69
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 70
    new-instance p1, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;

    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;-><init>(Landroid/opengl/GLSurfaceView;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;->write:Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;

    const/4 p2, 0x1

    .line 71
    invoke-virtual {p0, p2}, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;->setPreserveEGLContextOnPause(Z)V

    const/4 p2, 0x2

    .line 72
    invoke-virtual {p0, p2}, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;->setEGLContextClientVersion(I)V

    .line 73
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    const/4 p1, 0x0

    .line 74
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    return-void
.end method


# virtual methods
.method public final setOutputBuffer(Lo/SimpleKeyDeserializers;)V
    .registers 2

    .line 79
    iget-object p0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;->write:Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;

    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Lo/SimpleKeyDeserializers;)V

    return-void
.end method

###### Class androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView.AudioAttributesCompatParcelizer (androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer)
.class final Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "AudioAttributesCompatParcelizer"
.end annotation


# static fields
.field private static final RemoteActionCompatParcelizer:Ljava/nio/FloatBuffer;

.field private static final read:[F

.field private static final write:[Ljava/lang/String;


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lo/SimpleKeyDeserializers;",
            ">;"
        }
    .end annotation
.end field

.field private final AudioAttributesImplApi21Parcelizer:[I

.field private AudioAttributesImplApi26Parcelizer:Lo/AsArrayTypeDeserializer;

.field private final AudioAttributesImplBaseParcelizer:Landroid/opengl/GLSurfaceView;

.field private IconCompatParcelizer:I

.field private MediaBrowserCompatCustomActionResultReceiver:Lo/SimpleKeyDeserializers;

.field private final MediaBrowserCompatItemReceiver:[I

.field private final MediaBrowserCompatMediaItem:[I

.field private final MediaBrowserCompatSearchResultReceiver:[Ljava/nio/FloatBuffer;

.field private final MediaDescriptionCompat:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const/16 v0, 0x9

    .line 98
    new-array v0, v0, [F

    fill-array-data v0, :array_24

    sput-object v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->read:[F

    .line 124
    const-string v0, "u_tex"

    const-string v1, "v_tex"

    const-string v2, "y_tex"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->write:[Ljava/lang/String;

    const/16 v0, 0x8

    .line 142
    new-array v0, v0, [F

    fill-array-data v0, :array_3a

    .line 143
    invoke-static {v0}, Lo/TypeSerializer1;->read([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    sput-object v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/nio/FloatBuffer;

    return-void

    nop

    :array_24
    .array-data 4
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x0
        -0x41a5e354    # -0.213f
        0x40072b02    # 2.112f
        0x3fe58106    # 1.793f
        -0x40f78d50    # -0.533f
        0x0
    .end array-data

    :array_3a
    .array-data 4
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/opengl/GLSurfaceView;)V
    .registers 6

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/opengl/GLSurfaceView;

    const/4 p1, 0x3

    .line 165
    new-array v0, p1, [I

    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatMediaItem:[I

    .line 166
    new-array v0, p1, [I

    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaDescriptionCompat:[I

    .line 167
    new-array v0, p1, [I

    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver:[I

    .line 168
    new-array v0, p1, [I

    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer:[I

    .line 169
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

    .line 170
    new-array v0, p1, [Ljava/nio/FloatBuffer;

    iput-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:[Ljava/nio/FloatBuffer;

    const/4 v0, 0x0

    :goto_22
    if-ge v0, p1, :cond_30

    .line 172
    iget-object v1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver:[I

    iget-object v2, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer:[I

    const/4 v3, -0x1

    aput v3, v2, v0

    aput v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_22

    :cond_30
    return-void
.end method

.method private AudioAttributesCompatParcelizer()V
    .registers 5

    .line 315
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatMediaItem:[I

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    :goto_7
    if-ge v2, v1, :cond_29

    .line 317
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/AsArrayTypeDeserializer;

    sget-object v3, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->write:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {v0, v3}, Lo/AsArrayTypeDeserializer;->IconCompatParcelizer(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    const v0, 0x84c0

    add-int/2addr v0, v2

    .line 318
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 319
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatMediaItem:[I

    aget v0, v0, v2

    const/16 v3, 0xde1

    invoke-static {v3, v0}, Lo/TypeSerializer1;->AudioAttributesCompatParcelizer(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 321
    :cond_29
    invoke-static {}, Lo/TypeSerializer1;->RemoteActionCompatParcelizer()V
    :try_end_2c
    .catch Lo/TypeSerializer1$IconCompatParcelizer; {:try_start_0 .. :try_end_2c} :catch_2c

    :catch_2c
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/SimpleKeyDeserializers;)V
    .registers 3

    .line 303
    iget-object v0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

    .line 304
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/SimpleKeyDeserializers;

    if-eqz p1, :cond_d

    .line 307
    invoke-virtual {p1}, Lo/SimpleAbstractTypeResolver;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 309
    :cond_d
    iget-object p0, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplBaseParcelizer:Landroid/opengl/GLSurfaceView;

    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    return-void
.end method

.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .registers 19

    move-object/from16 v0, p0

    .line 208
    iget-object v1, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    .line 209
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/SimpleKeyDeserializers;

    if-nez v1, :cond_12

    .line 210
    iget-object v2, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Lo/SimpleKeyDeserializers;

    if-nez v2, :cond_12

    return-void

    :cond_12
    if-eqz v1, :cond_1d

    .line 215
    iget-object v2, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Lo/SimpleKeyDeserializers;

    if-eqz v2, :cond_1b

    .line 216
    invoke-virtual {v2}, Lo/SimpleAbstractTypeResolver;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 218
    :cond_1b
    iput-object v1, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Lo/SimpleKeyDeserializers;

    .line 221
    :cond_1d
    iget-object v1, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Lo/SimpleKeyDeserializers;

    invoke-static {v1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/SimpleKeyDeserializers;

    .line 224
    sget-object v2, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->read:[F

    .line 225
    iget v3, v1, Lo/SimpleKeyDeserializers;->IconCompatParcelizer:I

    .line 237
    iget v3, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v3, v4, v5, v2, v5}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 244
    iget-object v2, v1, Lo/SimpleKeyDeserializers;->AudioAttributesImplApi26Parcelizer:[I

    invoke-static {v2}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    .line 245
    iget-object v3, v1, Lo/SimpleKeyDeserializers;->MediaBrowserCompatCustomActionResultReceiver:[Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/nio/ByteBuffer;

    move v6, v5

    :goto_41
    const/4 v7, 0x2

    const/4 v8, 0x3

    if-ge v6, v8, :cond_76

    if-nez v6, :cond_4a

    .line 248
    iget v7, v1, Lo/SimpleKeyDeserializers;->RemoteActionCompatParcelizer:I

    goto :goto_4e

    :cond_4a
    iget v8, v1, Lo/SimpleKeyDeserializers;->RemoteActionCompatParcelizer:I

    const/4 v8, 0x1

    div-int/2addr v8, v7

    :goto_4e
    const v7, 0x84c0

    add-int/2addr v7, v6

    .line 249
    invoke-static {v7}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 250
    iget-object v7, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatMediaItem:[I

    aget v7, v7, v6

    const/16 v8, 0xde1

    invoke-static {v8, v7}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/16 v7, 0xcf5

    .line 251
    invoke-static {v7, v4}, Landroid/opengl/GLES20;->glPixelStorei(II)V

    const/4 v9, 0x0

    const/16 v10, 0x1909

    .line 252
    aget v11, v2, v6

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x1909

    const/16 v15, 0x1401

    aget-object v16, v3, v6

    invoke-static/range {v8 .. v16}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_41

    .line 265
    :cond_76
    iget v1, v1, Lo/SimpleKeyDeserializers;->MediaBrowserCompatItemReceiver:I

    const/4 v1, 0x1

    .line 269
    div-int/2addr v1, v7

    filled-new-array {v5, v5, v5}, [I

    move-result-object v1

    move v3, v5

    :goto_7f
    const/4 v6, 0x4

    const/4 v9, 0x5

    if-ge v3, v8, :cond_e4

    .line 272
    iget-object v10, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver:[I

    aget v10, v10, v3

    aget v11, v1, v3

    if-ne v10, v11, :cond_93

    iget-object v10, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer:[I

    aget v10, v10, v3

    aget v11, v2, v3

    if-eq v10, v11, :cond_e1

    .line 273
    :cond_93
    aget v10, v2, v3

    if-eqz v10, :cond_99

    move v10, v4

    goto :goto_9a

    :cond_99
    move v10, v5

    :goto_9a
    invoke-static {v10}, Lo/buildTypeSerializer;->write(Z)V

    .line 274
    aget v10, v1, v3

    int-to-float v10, v10

    aget v11, v2, v3

    int-to-float v11, v11

    div-float/2addr v10, v11

    .line 277
    iget-object v11, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:[Ljava/nio/FloatBuffer;

    const/16 v12, 0x8

    new-array v12, v12, [F

    const/4 v13, 0x0

    aput v13, v12, v5

    aput v13, v12, v4

    aput v13, v12, v7

    const/high16 v14, 0x3f800000    # 1.0f

    aput v14, v12, v8

    aput v10, v12, v6

    aput v13, v12, v9

    const/4 v6, 0x6

    aput v10, v12, v6

    const/4 v6, 0x7

    aput v14, v12, v6

    .line 278
    invoke-static {v12}, Lo/TypeSerializer1;->read([F)Ljava/nio/FloatBuffer;

    move-result-object v6

    aput-object v6, v11, v3

    .line 280
    iget-object v6, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaDescriptionCompat:[I

    aget v9, v6, v3

    const/4 v10, 0x2

    const/16 v11, 0x1406

    const/4 v12, 0x0

    const/4 v13, 0x0

    iget-object v6, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:[Ljava/nio/FloatBuffer;

    aget-object v14, v6, v3

    invoke-static/range {v9 .. v14}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 287
    iget-object v6, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaBrowserCompatItemReceiver:[I

    aget v9, v1, v3

    aput v9, v6, v3

    .line 288
    iget-object v6, v0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi21Parcelizer:[I

    aget v9, v2, v3

    aput v9, v6, v3

    :cond_e1
    add-int/lit8 v3, v3, 0x1

    goto :goto_7f

    :cond_e4
    const/16 v0, 0x4000

    .line 292
    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 293
    invoke-static {v9, v5, v6}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 295
    :try_start_ec
    invoke-static {}, Lo/TypeSerializer1;->RemoteActionCompatParcelizer()V
    :try_end_ef
    .catch Lo/TypeSerializer1$IconCompatParcelizer; {:try_start_ec .. :try_end_ef} :catch_ef

    :catch_ef
    return-void
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .registers 4

    const/4 p0, 0x0

    .line 202
    invoke-static {p0, p0, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    return-void
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .registers 9

    .line 179
    :try_start_0
    new-instance p1, Lo/AsArrayTypeDeserializer;

    const-string p2, "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n"

    const-string v0, "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n"

    invoke-direct {p1, p2, v0}, Lo/AsArrayTypeDeserializer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/AsArrayTypeDeserializer;

    .line 180
    const-string p2, "in_pos"

    invoke-virtual {p1, p2}, Lo/AsArrayTypeDeserializer;->write(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 181
    sget-object v5, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 188
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaDescriptionCompat:[I

    iget-object p2, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/AsArrayTypeDeserializer;

    const-string v0, "in_tc_y"

    invoke-virtual {p2, v0}, Lo/AsArrayTypeDeserializer;->write(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x0

    aput p2, p1, v0

    .line 189
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaDescriptionCompat:[I

    iget-object p2, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/AsArrayTypeDeserializer;

    const-string v0, "in_tc_u"

    invoke-virtual {p2, v0}, Lo/AsArrayTypeDeserializer;->write(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x1

    aput p2, p1, v0

    .line 190
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->MediaDescriptionCompat:[I

    iget-object p2, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/AsArrayTypeDeserializer;

    const-string v0, "in_tc_v"

    invoke-virtual {p2, v0}, Lo/AsArrayTypeDeserializer;->write(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x2

    aput p2, p1, v0

    .line 191
    iget-object p1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesImplApi26Parcelizer:Lo/AsArrayTypeDeserializer;

    const-string p2, "mColorConversion"

    invoke-virtual {p1, p2}, Lo/AsArrayTypeDeserializer;->IconCompatParcelizer(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 192
    invoke-static {}, Lo/TypeSerializer1;->RemoteActionCompatParcelizer()V

    .line 193
    invoke-direct {p0}, Landroidx/media3/exoplayer/video/VideoDecoderGLSurfaceView$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    .line 194
    invoke-static {}, Lo/TypeSerializer1;->RemoteActionCompatParcelizer()V
    :try_end_55
    .catch Lo/TypeSerializer1$IconCompatParcelizer; {:try_start_0 .. :try_end_55} :catch_55

    :catch_55
    return-void
.end method
