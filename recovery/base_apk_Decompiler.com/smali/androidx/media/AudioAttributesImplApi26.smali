###### Class androidx.media.AudioAttributesImplApi26 (androidx.media.AudioAttributesImplApi26)
.class public Landroidx/media/AudioAttributesImplApi26;
.super Landroidx/media/AudioAttributesImplApi21;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media/AudioAttributesImplApi26$read;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 39
    invoke-direct {p0}, Landroidx/media/AudioAttributesImplApi21;-><init>()V

    return-void
.end method

.method constructor <init>(Landroid/media/AudioAttributes;)V
    .registers 3

    const/4 v0, -0x1

    .line 43
    invoke-direct {p0, p1, v0}, Landroidx/media/AudioAttributesImplApi21;-><init>(Landroid/media/AudioAttributes;I)V

    return-void
.end method

###### Class androidx.media.AudioAttributesImplApi26.read (androidx.media.AudioAttributesImplApi26$read)
.class Landroidx/media/AudioAttributesImplApi26$read;
.super Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/AudioAttributesImplApi26;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "read"
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 54
    invoke-direct {p0}, Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method public RemoteActionCompatParcelizer()Landroidx/media/AudioAttributesImpl;
    .registers 2

    .line 64
    new-instance v0, Landroidx/media/AudioAttributesImplApi26;

    iget-object p0, p0, Landroidx/media/AudioAttributesImplApi21$RemoteActionCompatParcelizer;->IconCompatParcelizer:Landroid/media/AudioAttributes$Builder;

    invoke-virtual {p0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/media/AudioAttributesImplApi26;-><init>(Landroid/media/AudioAttributes;)V

    return-object v0
.end method
