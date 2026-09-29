###### Class com.bumptech.glide.load.data.ParcelFileDescriptorRewinder (com.bumptech.glide.load.data.ParcelFileDescriptorRewinder)
.class public final Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$AudioAttributesCompatParcelizer;,
        Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final read:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;


# direct methods
.method public constructor <init>(Landroid/os/ParcelFileDescriptor;)V
    .registers 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->read:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;

    return-void
.end method

.method public static AudioAttributesCompatParcelizer()Z
    .registers 2

    .line 22
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 23
    const-string v1, "robolectric"

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const/4 v0, 0x1

    return v0

    :cond_c
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final synthetic IconCompatParcelizer()Ljava/lang/Object;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16
    invoke-virtual {p0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->write()Landroid/os/ParcelFileDescriptor;

    move-result-object p0

    return-object p0
.end method

.method public final read()V
    .registers 1

    return-void
.end method

.method public final write()Landroid/os/ParcelFileDescriptor;
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    iget-object p0, p0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->read:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;

    invoke-virtual {p0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;->rewind()Landroid/os/ParcelFileDescriptor;

    move-result-object p0

    return-object p0
.end method

###### Class com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.AudioAttributesCompatParcelizer (com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$AudioAttributesCompatParcelizer)
.class public final Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/r8lambdaS__QVsutFC117zAPgt_KKJAKcRY$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/r8lambdaS__QVsutFC117zAPgt_KKJAKcRY$RemoteActionCompatParcelizer<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/ParcelFileDescriptor;)Lo/r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/ParcelFileDescriptor;",
            ")",
            "Lo/r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;-><init>(Landroid/os/ParcelFileDescriptor;)V

    return-object v0
.end method


# virtual methods
.method public final IconCompatParcelizer()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation

    .line 59
    const-class p0, Landroid/os/ParcelFileDescriptor;

    return-object p0
.end method

.method public final synthetic write(Ljava/lang/Object;)Lo/r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;
    .registers 2

    .line 46
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    invoke-static {p1}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/ParcelFileDescriptor;)Lo/r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;

    move-result-object p0

    return-object p0
.end method

###### Class com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.InternalRewinder (com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder)
.class final Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "InternalRewinder"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/os/ParcelFileDescriptor;


# direct methods
.method constructor <init>(Landroid/os/ParcelFileDescriptor;)V
    .registers 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;->AudioAttributesCompatParcelizer:Landroid/os/ParcelFileDescriptor;

    return-void
.end method


# virtual methods
.method final rewind()Landroid/os/ParcelFileDescriptor;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;->AudioAttributesCompatParcelizer:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    sget v1, Landroid/system/OsConstants;->SEEK_SET:I

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3, v1}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_d
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_d} :catch_10

    .line 82
    iget-object p0, p0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$InternalRewinder;->AudioAttributesCompatParcelizer:Landroid/os/ParcelFileDescriptor;

    return-object p0

    :catch_10
    move-exception p0

    .line 80
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
