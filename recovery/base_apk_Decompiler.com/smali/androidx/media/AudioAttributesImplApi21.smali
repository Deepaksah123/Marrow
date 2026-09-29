###### Class androidx.media.AudioAttributesImplApi21 (androidx.media.AudioAttributesImplApi21)
.class public Landroidx/media/AudioAttributesImplApi21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media/AudioAttributesImpl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field public AudioAttributesCompatParcelizer:I

.field public RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 43
    iput v0, p0, Landroidx/media/AudioAttributesImplApi21;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method constructor <init>(Landroid/media/AudioAttributes;)V
    .registers 3

    const/4 v0, -0x1

    .line 56
    invoke-direct {p0, p1, v0}, Landroidx/media/AudioAttributesImplApi21;-><init>(Landroid/media/AudioAttributes;I)V

    return-void
.end method

.method constructor <init>(Landroid/media/AudioAttributes;I)V
    .registers 3

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Landroidx/media/AudioAttributesImplApi21;->RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;

    .line 61
    iput p2, p0, Landroidx/media/AudioAttributesImplApi21;->AudioAttributesCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 3

    .line 111
    instance-of v0, p1, Landroidx/media/AudioAttributesImplApi21;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return p0

    .line 114
    :cond_6
    check-cast p1, Landroidx/media/AudioAttributesImplApi21;

    .line 115
    iget-object p0, p0, Landroidx/media/AudioAttributesImplApi21;->RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;

    iget-object p1, p1, Landroidx/media/AudioAttributesImplApi21;->RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;

    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public hashCode()I
    .registers 1

    .line 106
    iget-object p0, p0, Landroidx/media/AudioAttributesImplApi21;->RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;

    invoke-virtual {p0}, Landroid/media/AudioAttributes;->hashCode()I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioAttributesCompat: audioattributes="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/media/AudioAttributesImplApi21;->RemoteActionCompatParcelizer:Landroid/media/AudioAttributes;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media.AudioAttributesImplApi21.RemoteActionCompatParcelizer (androidx.media.AudioAttributesImplApi21$RemoteActionCompatParcelizer)
.class Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media/AudioAttributesImpl$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/AudioAttributesImplApi21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field final IconCompatParcelizer:Landroid/media/AudioAttributes$Builder;


# direct methods
.method constructor <init>()V
    .registers 2

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iput-object v0, p0, Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/media/AudioAttributes$Builder;

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(I)Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;
    .registers 3

    .line 171
    iget-object v0, p0, Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/media/AudioAttributes$Builder;

    invoke-virtual {v0, p1}, Landroid/media/AudioAttributes$Builder;->setLegacyStreamType(I)Landroid/media/AudioAttributes$Builder;

    return-object p0
.end method

.method public RemoteActionCompatParcelizer()Landroidx/media/AudioAttributesImpl;
    .registers 2

    .line 139
    new-instance v0, Landroidx/media/AudioAttributesImplApi21;

    iget-object p0, p0, Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/media/AudioAttributes$Builder;

    invoke-virtual {p0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/media/AudioAttributesImplApi21;-><init>(Landroid/media/AudioAttributes;)V

    return-object v0
.end method

.method public synthetic read(I)Landroidx/media/AudioAttributesImpl$write;
    .registers 2

    .line 124
    invoke-virtual {p0, p1}, Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(I)Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;

    move-result-object p0

    return-object p0
.end method
