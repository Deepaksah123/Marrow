###### Class androidx.media3.container.MdtaMetadataEntry (androidx.media3.container.MdtaMetadataEntry)
.class public final Landroidx/media3/container/MdtaMetadataEntry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/container/MdtaMetadataEntry;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final IconCompatParcelizer:[B

.field public final RemoteActionCompatParcelizer:I

.field public final read:Ljava/lang/String;

.field public final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 144
    new-instance v0, Landroidx/media3/container/MdtaMetadataEntry$1;

    invoke-direct {v0}, Landroidx/media3/container/MdtaMetadataEntry$1;-><init>()V

    sput-object v0, Landroidx/media3/container/MdtaMetadataEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->read:Ljava/lang/String;

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->write:I

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/media3/container/MdtaMetadataEntry;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 32
    invoke-direct {p0, p1}, Landroidx/media3/container/MdtaMetadataEntry;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BII)V
    .registers 5

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Landroidx/media3/container/MdtaMetadataEntry;->read:Ljava/lang/String;

    .line 72
    iput-object p2, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    .line 73
    iput p3, p0, Landroidx/media3/container/MdtaMetadataEntry;->write:I

    .line 74
    iput p4, p0, Landroidx/media3/container/MdtaMetadataEntry;->RemoteActionCompatParcelizer:I

    return-void
.end method


# virtual methods
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
    if-eqz p1, :cond_33

    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_33

    .line 92
    check-cast p1, Landroidx/media3/container/MdtaMetadataEntry;

    .line 93
    iget-object v1, p0, Landroidx/media3/container/MdtaMetadataEntry;->read:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/container/MdtaMetadataEntry;->read:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_33

    iget-object v1, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    iget-object v2, p1, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    .line 94
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_33

    iget v1, p0, Landroidx/media3/container/MdtaMetadataEntry;->write:I

    iget v2, p1, Landroidx/media3/container/MdtaMetadataEntry;->write:I

    if-ne v1, v2, :cond_33

    iget p0, p0, Landroidx/media3/container/MdtaMetadataEntry;->RemoteActionCompatParcelizer:I

    iget p1, p1, Landroidx/media3/container/MdtaMetadataEntry;->RemoteActionCompatParcelizer:I

    if-ne p0, p1, :cond_33

    return v0

    :cond_33
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 4

    .line 102
    iget-object v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->read:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 103
    iget-object v1, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    .line 104
    iget v2, p0, Landroidx/media3/container/MdtaMetadataEntry;->write:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 105
    iget p0, p0, Landroidx/media3/container/MdtaMetadataEntry;->RemoteActionCompatParcelizer:I

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 112
    iget v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->RemoteActionCompatParcelizer:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2e

    const/16 v1, 0x17

    if-eq v0, v1, :cond_1f

    const/16 v1, 0x43

    if-eq v0, v1, :cond_14

    .line 123
    iget-object v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer([B)Ljava/lang/String;

    move-result-object v0

    goto :goto_34

    .line 120
    :cond_14
    iget-object v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    invoke-static {v0}, Lo/parseTextAttribute;->RemoteActionCompatParcelizer([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_34

    .line 117
    :cond_1f
    iget-object v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    invoke-static {v0}, Lo/parseTextAttribute;->RemoteActionCompatParcelizer([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    goto :goto_34

    .line 114
    :cond_2e
    iget-object v0, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer([B)Ljava/lang/String;

    move-result-object v0

    .line 126
    :goto_34
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mdta: key="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/media3/container/MdtaMetadataEntry;->read:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", value="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 133
    iget-object p2, p0, Landroidx/media3/container/MdtaMetadataEntry;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 134
    iget-object p2, p0, Landroidx/media3/container/MdtaMetadataEntry;->IconCompatParcelizer:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 135
    iget p2, p0, Landroidx/media3/container/MdtaMetadataEntry;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 136
    iget p0, p0, Landroidx/media3/container/MdtaMetadataEntry;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.media3.container.MdtaMetadataEntry.AnonymousClass1 (androidx.media3.container.MdtaMetadataEntry$1)
.class final Landroidx/media3/container/MdtaMetadataEntry$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/container/MdtaMetadataEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/container/MdtaMetadataEntry;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(I)[Landroidx/media3/container/MdtaMetadataEntry;
    .registers 1

    .line 154
    new-array p0, p0, [Landroidx/media3/container/MdtaMetadataEntry;

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/container/MdtaMetadataEntry;
    .registers 3

    .line 149
    new-instance v0, Landroidx/media3/container/MdtaMetadataEntry;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/media3/container/MdtaMetadataEntry;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 145
    invoke-static {p1}, Landroidx/media3/container/MdtaMetadataEntry$1;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/container/MdtaMetadataEntry;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 145
    invoke-static {p1}, Landroidx/media3/container/MdtaMetadataEntry$1;->IconCompatParcelizer(I)[Landroidx/media3/container/MdtaMetadataEntry;

    move-result-object p0

    return-object p0
.end method
