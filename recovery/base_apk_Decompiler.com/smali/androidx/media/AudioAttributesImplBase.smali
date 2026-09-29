###### Class androidx.media.AudioAttributesImplBase (androidx.media.AudioAttributesImplBase)
.class public Landroidx/media/AudioAttributesImplBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media/AudioAttributesImpl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media/AudioAttributesImplBase$write;
    }
.end annotation


# instance fields
.field public IconCompatParcelizer:I

.field public RemoteActionCompatParcelizer:I

.field public read:I

.field public write:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Landroidx/media/AudioAttributesImplBase;->read:I

    .line 66
    iput v0, p0, Landroidx/media/AudioAttributesImplBase;->write:I

    .line 71
    iput v0, p0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    const/4 v0, -0x1

    .line 76
    iput v0, p0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    return-void
.end method

.method constructor <init>(IIII)V
    .registers 5

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput p1, p0, Landroidx/media/AudioAttributesImplBase;->write:I

    .line 89
    iput p2, p0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    .line 90
    iput p3, p0, Landroidx/media/AudioAttributesImplBase;->read:I

    .line 91
    iput p4, p0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    return-void
.end method

.method private AudioAttributesCompatParcelizer()I
    .registers 3

    .line 130
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    .line 131
    invoke-direct {p0}, Landroidx/media/AudioAttributesImplBase;->write()I

    move-result p0

    const/4 v1, 0x6

    if-ne p0, v1, :cond_c

    or-int/lit8 v0, v0, 0x4

    goto :goto_11

    :cond_c
    const/4 v1, 0x7

    if-ne p0, v1, :cond_11

    or-int/lit8 v0, v0, 0x1

    :cond_11
    :goto_11
    and-int/lit16 p0, v0, 0x111

    return p0
.end method

.method static AudioAttributesCompatParcelizer(I)I
    .registers 2

    const/4 v0, 0x2

    packed-switch p0, :pswitch_data_18

    :pswitch_4
    const/4 p0, 0x0

    return p0

    :pswitch_6
    const/16 p0, 0xb

    return p0

    :pswitch_9
    const/4 p0, 0x3

    return p0

    :pswitch_b
    return v0

    :pswitch_c
    const/4 p0, 0x5

    return p0

    :pswitch_e
    const/4 p0, 0x4

    return p0

    :pswitch_10
    const/4 p0, 0x1

    return p0

    :pswitch_12
    const/4 p0, 0x6

    return p0

    :pswitch_14
    const/16 p0, 0xd

    return p0

    :pswitch_17
    return v0

    :pswitch_data_18
    .packed-switch 0x0
        :pswitch_17
        :pswitch_14
        :pswitch_12
        :pswitch_10
        :pswitch_e
        :pswitch_c
        :pswitch_b
        :pswitch_14
        :pswitch_9
        :pswitch_4
        :pswitch_6
    .end packed-switch
.end method

.method private IconCompatParcelizer()I
    .registers 1

    .line 125
    iget p0, p0, Landroidx/media/AudioAttributesImplBase;->read:I

    return p0
.end method

.method private read()I
    .registers 1

    .line 120
    iget p0, p0, Landroidx/media/AudioAttributesImplBase;->write:I

    return p0
.end method

.method private write()I
    .registers 3

    .line 107
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    .line 110
    :cond_6
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    iget p0, p0, Landroidx/media/AudioAttributesImplBase;->read:I

    const/4 v1, 0x0

    invoke-static {v1, v0, p0}, Landroidx/media/AudioAttributesCompat;->write(ZII)I

    move-result p0

    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 5

    .line 150
    instance-of v0, p1, Landroidx/media/AudioAttributesImplBase;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    .line 153
    :cond_6
    check-cast p1, Landroidx/media/AudioAttributesImplBase;

    .line 154
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->write:I

    invoke-direct {p1}, Landroidx/media/AudioAttributesImplBase;->read()I

    move-result v2

    if-ne v0, v2, :cond_28

    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    .line 155
    invoke-direct {p1}, Landroidx/media/AudioAttributesImplBase;->AudioAttributesCompatParcelizer()I

    move-result v2

    if-ne v0, v2, :cond_28

    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->read:I

    .line 156
    invoke-direct {p1}, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer()I

    move-result v2

    if-ne v0, v2, :cond_28

    iget p0, p0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    iget p1, p1, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    if-ne p0, p1, :cond_28

    const/4 p0, 0x1

    return p0

    :cond_28
    return v1
.end method

.method public hashCode()I
    .registers 4

    .line 145
    iget v0, p0, Landroidx/media/AudioAttributesImplBase;->write:I

    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    iget v2, p0, Landroidx/media/AudioAttributesImplBase;->read:I

    iget p0, p0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioAttributesCompat:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1b

    .line 165
    const-string v1, " stream="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->IconCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    const-string v1, " derived"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    :cond_1b
    const-string v1, " usage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->read:I

    .line 169
    invoke-static {v1}, Landroidx/media/AudioAttributesCompat;->write(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    const-string v1, " content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/media/AudioAttributesImplBase;->write:I

    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    const-string v1, " flags=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/media/AudioAttributesImplBase;->RemoteActionCompatParcelizer:I

    .line 173
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media.AudioAttributesImplBase.write (androidx.media.AudioAttributesImplBase$write)
.class final Landroidx/media/AudioAttributesImplBase$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media/AudioAttributesImpl$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/AudioAttributesImplBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:I

.field private RemoteActionCompatParcelizer:I

.field private read:I

.field private write:I


# direct methods
.method constructor <init>()V
    .registers 2

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 178
    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->AudioAttributesCompatParcelizer:I

    .line 179
    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    .line 180
    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->RemoteActionCompatParcelizer:I

    const/4 v0, -0x1

    .line 181
    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->write:I

    return-void
.end method

.method private RemoteActionCompatParcelizer(I)Landroidx/media/AudioAttributesImplBase$write;
    .registers 5

    const/4 v0, 0x1

    const/4 v1, 0x4

    packed-switch p1, :pswitch_data_36

    goto :goto_2f

    .line 302
    :pswitch_6
    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    goto :goto_2f

    .line 299
    :pswitch_9
    iput v1, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    goto :goto_2f

    .line 296
    :pswitch_c
    iput v1, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    goto :goto_2f

    .line 274
    :pswitch_f
    iget v2, p0, Landroidx/media/AudioAttributesImplBase$write;->RemoteActionCompatParcelizer:I

    or-int/2addr v0, v2

    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->RemoteActionCompatParcelizer:I

    goto :goto_2a

    .line 292
    :pswitch_15
    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    .line 293
    iget v0, p0, Landroidx/media/AudioAttributesImplBase$write;->RemoteActionCompatParcelizer:I

    or-int/2addr v0, v1

    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->RemoteActionCompatParcelizer:I

    goto :goto_2f

    .line 289
    :pswitch_1d
    iput v1, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    goto :goto_2f

    .line 286
    :pswitch_20
    iput v1, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    goto :goto_2f

    :pswitch_23
    const/4 v0, 0x2

    .line 283
    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    goto :goto_2f

    .line 280
    :pswitch_27
    iput v1, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    goto :goto_2f

    .line 277
    :goto_2a
    :pswitch_2a
    iput v1, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    goto :goto_2f

    .line 271
    :pswitch_2d
    iput v0, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    .line 307
    :goto_2f
    invoke-static {p1}, Landroidx/media/AudioAttributesImplBase;->AudioAttributesCompatParcelizer(I)I

    move-result p1

    iput p1, p0, Landroidx/media/AudioAttributesImplBase$write;->AudioAttributesCompatParcelizer:I

    return-object p0

    :pswitch_data_36
    .packed-switch 0x0
        :pswitch_2d
        :pswitch_2a
        :pswitch_27
        :pswitch_23
        :pswitch_20
        :pswitch_1d
        :pswitch_15
        :pswitch_f
        :pswitch_c
        :pswitch_9
        :pswitch_6
    .end packed-switch
.end method

.method private write(I)Landroidx/media/AudioAttributesImplBase$write;
    .registers 3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_b

    .line 264
    iput p1, p0, Landroidx/media/AudioAttributesImplBase$write;->write:I

    .line 265
    invoke-direct {p0, p1}, Landroidx/media/AudioAttributesImplBase$write;->RemoteActionCompatParcelizer(I)Landroidx/media/AudioAttributesImplBase$write;

    move-result-object p0

    return-object p0

    .line 260
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()Landroidx/media/AudioAttributesImpl;
    .registers 5

    .line 196
    new-instance v0, Landroidx/media/AudioAttributesImplBase;

    iget v1, p0, Landroidx/media/AudioAttributesImplBase$write;->read:I

    iget v2, p0, Landroidx/media/AudioAttributesImplBase$write;->RemoteActionCompatParcelizer:I

    iget v3, p0, Landroidx/media/AudioAttributesImplBase$write;->AudioAttributesCompatParcelizer:I

    iget p0, p0, Landroidx/media/AudioAttributesImplBase$write;->write:I

    invoke-direct {v0, v1, v2, v3, p0}, Landroidx/media/AudioAttributesImplBase;-><init>(IIII)V

    return-object v0
.end method

.method public final synthetic read(I)Landroidx/media/AudioAttributesImpl$write;
    .registers 2

    .line 177
    invoke-direct {p0, p1}, Landroidx/media/AudioAttributesImplBase$write;->write(I)Landroidx/media/AudioAttributesImplBase$write;

    move-result-object p0

    return-object p0
.end method
