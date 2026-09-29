###### Class androidx.media3.extractor.metadata.emsg.EventMessage (androidx.media3.extractor.metadata.emsg.EventMessage)
.class public final Landroidx/media3/extractor/metadata/emsg/EventMessage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field private static final AudioAttributesImplApi21Parcelizer:Lo/format;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/emsg/EventMessage;",
            ">;"
        }
    .end annotation
.end field

.field private static final MediaBrowserCompatItemReceiver:Lo/format;


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private AudioAttributesImplBaseParcelizer:I

.field public final IconCompatParcelizer:J

.field public final RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final read:J

.field public final write:[B


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 54
    new-instance v0, Lo/format$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Lo/format$RemoteActionCompatParcelizer;-><init>()V

    .line 55
    const-string v1, "application/id3"

    invoke-virtual {v0, v1}, Lo/format$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer(Ljava/lang/String;)Lo/format$RemoteActionCompatParcelizer;

    move-result-object v0

    invoke-virtual {v0}, Lo/format$RemoteActionCompatParcelizer;->IconCompatParcelizer()Lo/format;

    move-result-object v0

    sput-object v0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesImplApi21Parcelizer:Lo/format;

    .line 56
    new-instance v0, Lo/format$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Lo/format$RemoteActionCompatParcelizer;-><init>()V

    .line 57
    const-string v1, "application/x-scte35"

    invoke-virtual {v0, v1}, Lo/format$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer(Ljava/lang/String;)Lo/format$RemoteActionCompatParcelizer;

    move-result-object v0

    invoke-virtual {v0}, Lo/format$RemoteActionCompatParcelizer;->IconCompatParcelizer()Lo/format;

    move-result-object v0

    sput-object v0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->MediaBrowserCompatItemReceiver:Lo/format;

    .line 179
    new-instance v0, Landroidx/media3/extractor/metadata/emsg/EventMessage$1;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/emsg/EventMessage$1;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->IconCompatParcelizer:J

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->read:J

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->write:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V
    .registers 8

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 87
    iput-object p2, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 88
    iput-wide p3, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->IconCompatParcelizer:J

    .line 89
    iput-wide p5, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->read:J

    .line 90
    iput-object p7, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->write:[B

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()[B
    .registers 2

    .line 118
    invoke-virtual {p0}, Landroidx/media3/extractor/metadata/emsg/EventMessage;->read()Lo/format;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object p0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->write:[B

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_41

    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_41

    .line 143
    check-cast p1, Landroidx/media3/extractor/metadata/emsg/EventMessage;

    .line 144
    iget-wide v1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->IconCompatParcelizer:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/emsg/EventMessage;->IconCompatParcelizer:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_41

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->read:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/emsg/EventMessage;->read:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_41

    iget-object v1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 146
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_41

    iget-object v1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/emsg/EventMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 147
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_41

    iget-object p0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->write:[B

    iget-object p1, p1, Landroidx/media3/extractor/metadata/emsg/EventMessage;->write:[B

    .line 148
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_41

    return v0

    :cond_41
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 8

    .line 123
    iget v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesImplBaseParcelizer:I

    if-nez v0, :cond_3b

    .line 125
    iget-object v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_f

    :cond_e
    move v0, v1

    .line 126
    :goto_f
    iget-object v2, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz v2, :cond_17

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 127
    :cond_17
    iget-wide v2, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->IconCompatParcelizer:J

    const/16 v4, 0x20

    ushr-long v5, v2, v4

    xor-long/2addr v2, v5

    long-to-int v2, v2

    .line 128
    iget-wide v5, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->read:J

    ushr-long v3, v5, v4

    xor-long/2addr v3, v5

    long-to-int v3, v3

    .line 129
    iget-object v4, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->write:[B

    invoke-static {v4}, Ljava/util/Arrays;->hashCode([B)I

    move-result v4

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    .line 130
    iput v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesImplBaseParcelizer:I

    .line 132
    :cond_3b
    iget p0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesImplBaseParcelizer:I

    return p0
.end method

.method public final read()Lo/format;
    .registers 5

    .line 104
    iget-object p0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, -0x578730ab

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2f

    const v1, -0x2f712a89

    if-eq v0, v1, :cond_25

    const v1, 0x4db418c9    # 3.776904E8f

    if-eq v0, v1, :cond_1b

    goto :goto_39

    :cond_1b
    const-string v0, "https://developer.apple.com/streaming/emsg-id3"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_39

    move p0, v2

    goto :goto_3a

    :cond_25
    const-string v0, "https://aomedia.org/emsg/ID3"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_39

    move p0, v3

    goto :goto_3a

    :cond_2f
    const-string v0, "urn:scte:scte35:2014:bin"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_39

    const/4 p0, 0x0

    goto :goto_3a

    :cond_39
    :goto_39
    const/4 p0, -0x1

    :goto_3a
    if-eqz p0, :cond_45

    if-eq p0, v3, :cond_42

    if-eq p0, v2, :cond_42

    const/4 p0, 0x0

    return-object p0

    .line 107
    :cond_42
    sget-object p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesImplApi21Parcelizer:Lo/format;

    return-object p0

    .line 109
    :cond_45
    sget-object p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->MediaBrowserCompatItemReceiver:Lo/format;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EMSG: scheme="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->read:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", durationMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->IconCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 172
    iget-object p2, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 173
    iget-object p2, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 174
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->IconCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 175
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->read:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 176
    iget-object p0, p0, Landroidx/media3/extractor/metadata/emsg/EventMessage;->write:[B

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.emsg.EventMessage.AnonymousClass1 (androidx.media3.extractor.metadata.emsg.EventMessage$1)
.class final Landroidx/media3/extractor/metadata/emsg/EventMessage$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/emsg/EventMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/emsg/EventMessage;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/emsg/EventMessage;
    .registers 2

    .line 184
    new-instance v0, Landroidx/media3/extractor/metadata/emsg/EventMessage;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/emsg/EventMessage;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/emsg/EventMessage;
    .registers 1

    .line 189
    new-array p0, p0, [Landroidx/media3/extractor/metadata/emsg/EventMessage;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 180
    invoke-static {p1}, Landroidx/media3/extractor/metadata/emsg/EventMessage$1;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/emsg/EventMessage;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 180
    invoke-static {p1}, Landroidx/media3/extractor/metadata/emsg/EventMessage$1;->RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/emsg/EventMessage;

    move-result-object p0

    return-object p0
.end method
