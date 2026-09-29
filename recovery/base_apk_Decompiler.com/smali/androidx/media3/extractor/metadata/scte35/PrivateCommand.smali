###### Class androidx.media3.extractor.metadata.scte35.PrivateCommand (androidx.media3.extractor.metadata.scte35.PrivateCommand)
.class public final Landroidx/media3/extractor/metadata/scte35/PrivateCommand;
.super Landroidx/media3/extractor/metadata/scte35/SpliceCommand;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/scte35/PrivateCommand;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:[B

.field public final IconCompatParcelizer:J

.field public final read:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 75
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand$2;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/scte35/PrivateCommand$2;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(J[BJ)V
    .registers 6

    .line 37
    invoke-direct {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceCommand;-><init>()V

    .line 38
    iput-wide p4, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->read:J

    .line 39
    iput-wide p1, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->IconCompatParcelizer:J

    .line 40
    iput-object p3, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->AudioAttributesCompatParcelizer:[B

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 43
    invoke-direct {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceCommand;-><init>()V

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->read:J

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->IconCompatParcelizer:J

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->AudioAttributesCompatParcelizer:[B

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 26
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static read(Lo/AsPropertyTypeDeserializer;IJ)Landroidx/media3/extractor/metadata/scte35/PrivateCommand;
    .registers 10

    .line 51
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->onMediaButtonEvent()J

    move-result-wide v1

    add-int/lit8 p1, p1, -0x4

    .line 52
    new-array v3, p1, [B

    const/4 v0, 0x0

    .line 53
    invoke-virtual {p0, v3, v0, p1}, Lo/AsPropertyTypeDeserializer;->write([BII)V

    .line 54
    new-instance p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;

    move-object v0, p0

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;-><init>(J[BJ)V

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .registers 4

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SCTE-35 PrivateCommand { ptsAdjustment="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->read:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", identifier= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->IconCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " }"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 70
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->read:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 71
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->IconCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 72
    iget-object p0, p0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;->AudioAttributesCompatParcelizer:[B

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.scte35.PrivateCommand.AnonymousClass2 (androidx.media3.extractor.metadata.scte35.PrivateCommand$2)
.class final Landroidx/media3/extractor/metadata/scte35/PrivateCommand$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/scte35/PrivateCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/scte35/PrivateCommand;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/PrivateCommand;
    .registers 3

    .line 80
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/media3/extractor/metadata/scte35/PrivateCommand;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method

.method private static IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/scte35/PrivateCommand;
    .registers 1

    .line 85
    new-array p0, p0, [Landroidx/media3/extractor/metadata/scte35/PrivateCommand;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 76
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/PrivateCommand$2;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/PrivateCommand;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 76
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/PrivateCommand$2;->IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/scte35/PrivateCommand;

    move-result-object p0

    return-object p0
.end method
