###### Class androidx.media3.exoplayer.image.ImageOutput (androidx.media3.exoplayer.image.ImageOutput)
.class public interface abstract Landroidx/media3/exoplayer/image/ImageOutput;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final write:Landroidx/media3/exoplayer/image/ImageOutput;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 27
    new-instance v0, Landroidx/media3/exoplayer/image/ImageOutput$3;

    invoke-direct {v0}, Landroidx/media3/exoplayer/image/ImageOutput$3;-><init>()V

    sput-object v0, Landroidx/media3/exoplayer/image/ImageOutput;->write:Landroidx/media3/exoplayer/image/ImageOutput;

    return-void
.end method


# virtual methods
.method public abstract onImageAvailable(JLandroid/graphics/Bitmap;)V
.end method

###### Class androidx.media3.exoplayer.image.ImageOutput.AnonymousClass3 (androidx.media3.exoplayer.image.ImageOutput$3)
.class final Landroidx/media3/exoplayer/image/ImageOutput$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/exoplayer/image/ImageOutput;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/image/ImageOutput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onImageAvailable(JLandroid/graphics/Bitmap;)V
    .registers 4

    return-void
.end method
