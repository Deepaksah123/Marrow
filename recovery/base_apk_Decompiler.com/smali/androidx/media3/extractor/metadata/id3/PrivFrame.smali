###### Class androidx.media3.extractor.metadata.id3.PrivFrame (androidx.media3.extractor.metadata.id3.PrivFrame)
.class public final Landroidx/media3/extractor/metadata/id3/PrivFrame;
.super Landroidx/media3/extractor/metadata/id3/Id3Frame;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/id3/PrivFrame;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field public final RemoteActionCompatParcelizer:[B


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 81
    new-instance v0, Landroidx/media3/extractor/metadata/id3/PrivFrame$3;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/id3/PrivFrame$3;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 43
    const-string v0, "PRIV"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->RemoteActionCompatParcelizer:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B)V
    .registers 4

    .line 37
    const-string v0, "PRIV"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->RemoteActionCompatParcelizer:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_27

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_27

    .line 56
    check-cast p1, Landroidx/media3/extractor/metadata/id3/PrivFrame;

    .line 57
    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/PrivFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->RemoteActionCompatParcelizer:[B

    iget-object p1, p1, Landroidx/media3/extractor/metadata/id3/PrivFrame;->RemoteActionCompatParcelizer:[B

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_27

    return v0

    :cond_27
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 2

    .line 63
    iget-object v0, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 64
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->RemoteActionCompatParcelizer:[B

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 77
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/PrivFrame;->RemoteActionCompatParcelizer:[B

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.id3.PrivFrame.AnonymousClass3 (androidx.media3.extractor.metadata.id3.PrivFrame$3)
.class final Landroidx/media3/extractor/metadata/id3/PrivFrame$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/id3/PrivFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/id3/PrivFrame;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/PrivFrame;
    .registers 2

    .line 86
    new-instance v0, Landroidx/media3/extractor/metadata/id3/PrivFrame;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/id3/PrivFrame;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(I)[Landroidx/media3/extractor/metadata/id3/PrivFrame;
    .registers 1

    .line 91
    new-array p0, p0, [Landroidx/media3/extractor/metadata/id3/PrivFrame;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 82
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/PrivFrame$3;->write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/PrivFrame;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 82
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/PrivFrame$3;->write(I)[Landroidx/media3/extractor/metadata/id3/PrivFrame;

    move-result-object p0

    return-object p0
.end method
