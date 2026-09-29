###### Class androidx.media3.extractor.metadata.flac.PictureFrame (androidx.media3.extractor.metadata.flac.PictureFrame)
.class public final Landroidx/media3/extractor/metadata/flac/PictureFrame;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/flac/PictureFrame;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field public final AudioAttributesImplApi26Parcelizer:I

.field public final AudioAttributesImplBaseParcelizer:[B

.field public final IconCompatParcelizer:I

.field public final MediaBrowserCompatItemReceiver:I

.field public final RemoteActionCompatParcelizer:I

.field public final read:Ljava/lang/String;

.field public final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 179
    new-instance v0, Landroidx/media3/extractor/metadata/flac/PictureFrame$3;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/flac/PictureFrame$3;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Ljava/lang/String;IIII[B)V
    .registers 9

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput p1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplApi26Parcelizer:I

    .line 69
    iput-object p2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->read:Ljava/lang/String;

    .line 70
    iput-object p3, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 71
    iput p4, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->MediaBrowserCompatItemReceiver:I

    .line 72
    iput p5, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->IconCompatParcelizer:I

    .line 73
    iput p6, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->write:I

    .line 74
    iput p7, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->RemoteActionCompatParcelizer:I

    .line 75
    iput-object p8, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplBaseParcelizer:[B

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplApi26Parcelizer:I

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->read:Ljava/lang/String;

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->MediaBrowserCompatItemReceiver:I

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->IconCompatParcelizer:I

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->write:I

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->RemoteActionCompatParcelizer:I

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplBaseParcelizer:[B

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Lo/AsPropertyTypeDeserializer;)Landroidx/media3/extractor/metadata/flac/PictureFrame;
    .registers 11

    .line 161
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v1

    .line 162
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v0

    .line 163
    sget-object v2, Lo/parseMdtaFromMeta;->RemoteActionCompatParcelizer:Ljava/nio/charset/Charset;

    .line 164
    invoke-virtual {p0, v0, v2}, Lo/AsPropertyTypeDeserializer;->AudioAttributesCompatParcelizer(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/DefaultBaseTypeLimitingValidator;->MediaMetadataCompat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 165
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v0

    .line 166
    invoke-virtual {p0, v0}, Lo/AsPropertyTypeDeserializer;->read(I)Ljava/lang/String;

    move-result-object v3

    .line 167
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v4

    .line 168
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v5

    .line 169
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v6

    .line 170
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v7

    .line 171
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->MediaBrowserCompatItemReceiver()I

    move-result v0

    .line 172
    new-array v8, v0, [B

    const/4 v9, 0x0

    .line 173
    invoke-virtual {p0, v8, v9, v0}, Lo/AsPropertyTypeDeserializer;->write([BII)V

    .line 175
    new-instance p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Landroidx/media3/extractor/metadata/flac/PictureFrame;-><init>(ILjava/lang/String;Ljava/lang/String;IIII[B)V

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/getSchema$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 91
    iget-object v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplBaseParcelizer:[B

    iget p0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, v0, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->read([BI)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_4f

    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_4f

    .line 107
    check-cast p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;

    .line 108
    iget v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplApi26Parcelizer:I

    iget v2, p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplApi26Parcelizer:I

    if-ne v1, v2, :cond_4f

    iget-object v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->read:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;->read:Ljava/lang/String;

    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4f

    iget-object v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4f

    iget v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->MediaBrowserCompatItemReceiver:I

    iget v2, p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;->MediaBrowserCompatItemReceiver:I

    if-ne v1, v2, :cond_4f

    iget v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->IconCompatParcelizer:I

    iget v2, p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;->IconCompatParcelizer:I

    if-ne v1, v2, :cond_4f

    iget v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->write:I

    iget v2, p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;->write:I

    if-ne v1, v2, :cond_4f

    iget v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->RemoteActionCompatParcelizer:I

    iget v2, p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;->RemoteActionCompatParcelizer:I

    if-ne v1, v2, :cond_4f

    iget-object p0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplBaseParcelizer:[B

    iget-object p1, p1, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplBaseParcelizer:[B

    .line 115
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_4f

    return v0

    :cond_4f
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 8

    .line 121
    iget v0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplApi26Parcelizer:I

    .line 122
    iget-object v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->read:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 123
    iget-object v2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    .line 124
    iget v3, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->MediaBrowserCompatItemReceiver:I

    .line 125
    iget v4, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->IconCompatParcelizer:I

    .line 126
    iget v5, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->write:I

    .line 127
    iget v6, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->RemoteActionCompatParcelizer:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v5

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v6

    mul-int/lit8 v0, v0, 0x1f

    .line 128
    iget-object p0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplBaseParcelizer:[B

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Picture: mimeType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->read:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 134
    iget p2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 135
    iget-object p2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 136
    iget-object p2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 137
    iget p2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 138
    iget p2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 139
    iget p2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 140
    iget p2, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    iget-object p0, p0, Landroidx/media3/extractor/metadata/flac/PictureFrame;->AudioAttributesImplBaseParcelizer:[B

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.flac.PictureFrame.AnonymousClass3 (androidx.media3.extractor.metadata.flac.PictureFrame$3)
.class final Landroidx/media3/extractor/metadata/flac/PictureFrame$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/flac/PictureFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/flac/PictureFrame;",
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

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/flac/PictureFrame;
    .registers 2

    .line 184
    new-instance v0, Landroidx/media3/extractor/metadata/flac/PictureFrame;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/flac/PictureFrame;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static read(I)[Landroidx/media3/extractor/metadata/flac/PictureFrame;
    .registers 1

    .line 189
    new-array p0, p0, [Landroidx/media3/extractor/metadata/flac/PictureFrame;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 180
    invoke-static {p1}, Landroidx/media3/extractor/metadata/flac/PictureFrame$3;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/flac/PictureFrame;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 180
    invoke-static {p1}, Landroidx/media3/extractor/metadata/flac/PictureFrame$3;->read(I)[Landroidx/media3/extractor/metadata/flac/PictureFrame;

    move-result-object p0

    return-object p0
.end method
