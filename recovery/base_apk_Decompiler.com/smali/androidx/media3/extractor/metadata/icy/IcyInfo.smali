###### Class androidx.media3.extractor.metadata.icy.IcyInfo (androidx.media3.extractor.metadata.icy.IcyInfo)
.class public final Landroidx/media3/extractor/metadata/icy/IcyInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/icy/IcyInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final IconCompatParcelizer:[B

.field public final RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final read:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 106
    new-instance v0, Landroidx/media3/extractor/metadata/icy/IcyInfo$3;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/icy/IcyInfo$3;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->IconCompatParcelizer:[B

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->read:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->IconCompatParcelizer:[B

    .line 50
    iput-object p2, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 51
    iput-object p3, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->read:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/getSchema$RemoteActionCompatParcelizer;)V
    .registers 2

    .line 62
    iget-object p0, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz p0, :cond_7

    .line 63
    invoke-virtual {p1, p0}, Lo/getSchema$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer(Ljava/lang/CharSequence;)Lo/getSchema$RemoteActionCompatParcelizer;

    :cond_7
    return-void
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 4

    if-ne p0, p1, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    if-eqz p1, :cond_1b

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_1b

    .line 75
    check-cast p1, Landroidx/media3/extractor/metadata/icy/IcyInfo;

    .line 77
    iget-object p0, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->IconCompatParcelizer:[B

    iget-object p1, p1, Landroidx/media3/extractor/metadata/icy/IcyInfo;->IconCompatParcelizer:[B

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 1

    .line 83
    iget-object p0, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->IconCompatParcelizer:[B

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    move-result p0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 88
    iget-object v0, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v1, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->read:Ljava/lang/String;

    iget-object p0, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->IconCompatParcelizer:[B

    array-length p0, p0

    .line 89
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 88
    const-string v0, "ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\""

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 96
    iget-object p2, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->IconCompatParcelizer:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 97
    iget-object p2, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 98
    iget-object p0, p0, Landroidx/media3/extractor/metadata/icy/IcyInfo;->read:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.icy.IcyInfo.AnonymousClass3 (androidx.media3.extractor.metadata.icy.IcyInfo$3)
.class final Landroidx/media3/extractor/metadata/icy/IcyInfo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/icy/IcyInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/icy/IcyInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/icy/IcyInfo;
    .registers 1

    .line 116
    new-array p0, p0, [Landroidx/media3/extractor/metadata/icy/IcyInfo;

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/icy/IcyInfo;
    .registers 2

    .line 111
    new-instance v0, Landroidx/media3/extractor/metadata/icy/IcyInfo;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/icy/IcyInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 107
    invoke-static {p1}, Landroidx/media3/extractor/metadata/icy/IcyInfo$3;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/icy/IcyInfo;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 107
    invoke-static {p1}, Landroidx/media3/extractor/metadata/icy/IcyInfo$3;->IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/icy/IcyInfo;

    move-result-object p0

    return-object p0
.end method
