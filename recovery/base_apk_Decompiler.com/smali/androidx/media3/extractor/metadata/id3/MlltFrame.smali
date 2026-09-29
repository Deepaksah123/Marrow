###### Class androidx.media3.extractor.metadata.id3.MlltFrame (androidx.media3.extractor.metadata.id3.MlltFrame)
.class public final Landroidx/media3/extractor/metadata/id3/MlltFrame;
.super Landroidx/media3/extractor/metadata/id3/Id3Frame;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/id3/MlltFrame;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:[I

.field public final IconCompatParcelizer:I

.field public final RemoteActionCompatParcelizer:I

.field public final read:[I

.field public final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 102
    new-instance v0, Landroidx/media3/extractor/metadata/id3/MlltFrame$5;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/id3/MlltFrame$5;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(III[I[I)V
    .registers 7

    .line 42
    const-string v0, "MLLT"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 43
    iput p1, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->RemoteActionCompatParcelizer:I

    .line 44
    iput p2, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->IconCompatParcelizer:I

    .line 45
    iput p3, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->write:I

    .line 46
    iput-object p4, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->read:[I

    .line 47
    iput-object p5, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->AudioAttributesCompatParcelizer:[I

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 51
    const-string v0, "MLLT"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->RemoteActionCompatParcelizer:I

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->IconCompatParcelizer:I

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->write:I

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->read:[I

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object p1

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->AudioAttributesCompatParcelizer:[I

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
    if-eqz p1, :cond_39

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_39

    .line 67
    check-cast p1, Landroidx/media3/extractor/metadata/id3/MlltFrame;

    .line 68
    iget v1, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->RemoteActionCompatParcelizer:I

    iget v2, p1, Landroidx/media3/extractor/metadata/id3/MlltFrame;->RemoteActionCompatParcelizer:I

    if-ne v1, v2, :cond_39

    iget v1, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->IconCompatParcelizer:I

    iget v2, p1, Landroidx/media3/extractor/metadata/id3/MlltFrame;->IconCompatParcelizer:I

    if-ne v1, v2, :cond_39

    iget v1, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->write:I

    iget v2, p1, Landroidx/media3/extractor/metadata/id3/MlltFrame;->write:I

    if-ne v1, v2, :cond_39

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->read:[I

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/MlltFrame;->read:[I

    .line 71
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v1

    if-eqz v1, :cond_39

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->AudioAttributesCompatParcelizer:[I

    iget-object p1, p1, Landroidx/media3/extractor/metadata/id3/MlltFrame;->AudioAttributesCompatParcelizer:[I

    .line 72
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p0

    if-eqz p0, :cond_39

    return v0

    :cond_39
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 5

    .line 78
    iget v0, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->RemoteActionCompatParcelizer:I

    .line 79
    iget v1, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->IconCompatParcelizer:I

    .line 80
    iget v2, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->write:I

    .line 81
    iget-object v3, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->read:[I

    invoke-static {v3}, Ljava/util/Arrays;->hashCode([I)I

    move-result v3

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 82
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->AudioAttributesCompatParcelizer:[I

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([I)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 90
    iget p2, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    iget p2, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    iget p2, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->read:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 94
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/MlltFrame;->AudioAttributesCompatParcelizer:[I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeIntArray([I)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.id3.MlltFrame.AnonymousClass5 (androidx.media3.extractor.metadata.id3.MlltFrame$5)
.class final Landroidx/media3/extractor/metadata/id3/MlltFrame$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/id3/MlltFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/id3/MlltFrame;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/id3/MlltFrame;
    .registers 1

    .line 112
    new-array p0, p0, [Landroidx/media3/extractor/metadata/id3/MlltFrame;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/MlltFrame;
    .registers 2

    .line 107
    new-instance v0, Landroidx/media3/extractor/metadata/id3/MlltFrame;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/id3/MlltFrame;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 103
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/MlltFrame$5;->write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/MlltFrame;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 103
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/MlltFrame$5;->RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/id3/MlltFrame;

    move-result-object p0

    return-object p0
.end method
