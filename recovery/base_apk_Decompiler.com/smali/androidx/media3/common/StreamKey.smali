###### Class androidx.media3.common.StreamKey (androidx.media3.common.StreamKey)
.class public final Landroidx/media3/common/StreamKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Landroidx/media3/common/StreamKey;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/common/StreamKey;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:I

.field public final read:I

.field public final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 136
    new-instance v0, Landroidx/media3/common/StreamKey$3;

    invoke-direct {v0}, Landroidx/media3/common/StreamKey$3;-><init>()V

    sput-object v0, Landroidx/media3/common/StreamKey;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    .line 150
    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesImplApi26Parcelizer(I)Ljava/lang/String;

    const/4 v0, 0x1

    .line 151
    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesImplApi26Parcelizer(I)Ljava/lang/String;

    const/4 v0, 0x2

    .line 152
    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesImplApi26Parcelizer(I)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 69
    iput v0, p0, Landroidx/media3/common/StreamKey;->write:I

    .line 70
    iput v0, p0, Landroidx/media3/common/StreamKey;->read:I

    .line 71
    iput v0, p0, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/common/StreamKey;->write:I

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/common/StreamKey;->read:I

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    return-void
.end method

.method private read(Landroidx/media3/common/StreamKey;)I
    .registers 4

    .line 112
    iget v0, p0, Landroidx/media3/common/StreamKey;->write:I

    iget v1, p1, Landroidx/media3/common/StreamKey;->write:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_14

    .line 114
    iget v0, p0, Landroidx/media3/common/StreamKey;->read:I

    iget v1, p1, Landroidx/media3/common/StreamKey;->read:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_14

    .line 116
    iget p0, p0, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    iget p1, p1, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    sub-int/2addr p0, p1

    return p0

    :cond_14
    return v0
.end method


# virtual methods
.method public final synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 39
    check-cast p1, Landroidx/media3/common/StreamKey;

    invoke-direct {p0, p1}, Landroidx/media3/common/StreamKey;->read(Landroidx/media3/common/StreamKey;)I

    move-result p0

    return p0
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
    if-eqz p1, :cond_25

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_25

    .line 94
    check-cast p1, Landroidx/media3/common/StreamKey;

    .line 95
    iget v1, p0, Landroidx/media3/common/StreamKey;->write:I

    iget v2, p1, Landroidx/media3/common/StreamKey;->write:I

    if-ne v1, v2, :cond_25

    iget v1, p0, Landroidx/media3/common/StreamKey;->read:I

    iget v2, p1, Landroidx/media3/common/StreamKey;->read:I

    if-ne v1, v2, :cond_25

    iget p0, p0, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    iget p1, p1, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    if-ne p0, p1, :cond_25

    return v0

    :cond_25
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 3

    .line 102
    iget v0, p0, Landroidx/media3/common/StreamKey;->write:I

    .line 103
    iget v1, p0, Landroidx/media3/common/StreamKey;->read:I

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 104
    iget p0, p0, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Landroidx/media3/common/StreamKey;->write:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/media3/common/StreamKey;->read:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 131
    iget p2, p0, Landroidx/media3/common/StreamKey;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 132
    iget p2, p0, Landroidx/media3/common/StreamKey;->read:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 133
    iget p0, p0, Landroidx/media3/common/StreamKey;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.media3.common.StreamKey.AnonymousClass3 (androidx.media3.common.StreamKey$3)
.class final Landroidx/media3/common/StreamKey$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/common/StreamKey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/common/StreamKey;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Landroidx/media3/common/StreamKey;
    .registers 1

    .line 146
    new-array p0, p0, [Landroidx/media3/common/StreamKey;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/media3/common/StreamKey;
    .registers 2

    .line 141
    new-instance v0, Landroidx/media3/common/StreamKey;

    invoke-direct {v0, p0}, Landroidx/media3/common/StreamKey;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 137
    invoke-static {p1}, Landroidx/media3/common/StreamKey$3;->write(Landroid/os/Parcel;)Landroidx/media3/common/StreamKey;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 137
    invoke-static {p1}, Landroidx/media3/common/StreamKey$3;->AudioAttributesCompatParcelizer(I)[Landroidx/media3/common/StreamKey;

    move-result-object p0

    return-object p0
.end method
