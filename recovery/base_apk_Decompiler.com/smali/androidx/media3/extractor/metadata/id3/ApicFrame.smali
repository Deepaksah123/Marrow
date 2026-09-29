###### Class androidx.media3.extractor.metadata.id3.ApicFrame (androidx.media3.extractor.metadata.id3.ApicFrame)
.class public final Landroidx/media3/extractor/metadata/id3/ApicFrame;
.super Landroidx/media3/extractor/metadata/id3/Id3Frame;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/id3/ApicFrame;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field public final IconCompatParcelizer:I

.field public final RemoteActionCompatParcelizer:[B

.field public final read:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 101
    new-instance v0, Landroidx/media3/extractor/metadata/id3/ApicFrame$5;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/id3/ApicFrame$5;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 49
    const-string v0, "APIC"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->read:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->IconCompatParcelizer:I

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->RemoteActionCompatParcelizer:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I[B)V
    .registers 6

    .line 41
    const-string v0, "APIC"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 42
    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->read:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 44
    iput p3, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->IconCompatParcelizer:I

    .line 45
    iput-object p4, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->RemoteActionCompatParcelizer:[B

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/getSchema$RemoteActionCompatParcelizer;)V
    .registers 3

    .line 58
    iget-object v0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->RemoteActionCompatParcelizer:[B

    iget p0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->IconCompatParcelizer:I

    invoke-virtual {p1, v0, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->read([BI)Lo/getSchema$RemoteActionCompatParcelizer;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_37

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_37

    .line 69
    check-cast p1, Landroidx/media3/extractor/metadata/id3/ApicFrame;

    .line 70
    iget v1, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->IconCompatParcelizer:I

    iget v2, p1, Landroidx/media3/extractor/metadata/id3/ApicFrame;->IconCompatParcelizer:I

    if-ne v1, v2, :cond_37

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->read:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/ApicFrame;->read:Ljava/lang/String;

    .line 71
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_37

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/ApicFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 72
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_37

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->RemoteActionCompatParcelizer:[B

    iget-object p1, p1, Landroidx/media3/extractor/metadata/id3/ApicFrame;->RemoteActionCompatParcelizer:[B

    .line 73
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_37

    return v0

    :cond_37
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 5

    .line 79
    iget v0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->IconCompatParcelizer:I

    .line 80
    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->read:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_d

    :cond_c
    move v1, v2

    .line 81
    :goto_d
    iget-object v3, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz v3, :cond_15

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_15
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 82
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->RemoteActionCompatParcelizer:[B

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": mimeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->read:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 95
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 96
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 97
    iget p2, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;->RemoteActionCompatParcelizer:[B

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.id3.ApicFrame.AnonymousClass5 (androidx.media3.extractor.metadata.id3.ApicFrame$5)
.class Landroidx/media3/extractor/metadata/id3/ApicFrame$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/id3/ApicFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/id3/ApicFrame;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/ApicFrame;
    .registers 2

    .line 106
    new-instance p0, Landroidx/media3/extractor/metadata/id3/ApicFrame;

    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/id3/ApicFrame;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

.method public RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/id3/ApicFrame;
    .registers 2

    .line 111
    new-array p0, p1, [Landroidx/media3/extractor/metadata/id3/ApicFrame;

    return-object p0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 102
    invoke-virtual {p0, p1}, Landroidx/media3/extractor/metadata/id3/ApicFrame$5;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/ApicFrame;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 102
    invoke-virtual {p0, p1}, Landroidx/media3/extractor/metadata/id3/ApicFrame$5;->RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/id3/ApicFrame;

    move-result-object p0

    return-object p0
.end method
