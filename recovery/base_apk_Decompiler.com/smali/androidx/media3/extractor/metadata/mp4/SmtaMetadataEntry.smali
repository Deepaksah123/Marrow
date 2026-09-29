###### Class androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry (androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry)
.class public final Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final IconCompatParcelizer:I

.field public final read:F


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 97
    new-instance v0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry$5;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry$5;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(FI)V
    .registers 3

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput p1, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->read:F

    .line 47
    iput p2, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->IconCompatParcelizer:I

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->read:F

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->IconCompatParcelizer:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 32
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;-><init>(Landroid/os/Parcel;)V

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
    if-eqz p1, :cond_21

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_21

    .line 63
    check-cast p1, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;

    .line 64
    iget v1, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->read:F

    iget v2, p1, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->read:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_21

    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->IconCompatParcelizer:I

    iget p1, p1, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->IconCompatParcelizer:I

    if-ne p0, p1, :cond_21

    return v0

    :cond_21
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 2

    .line 71
    iget v0, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->read:F

    invoke-static {v0}, Lo/parseMdtaMetadataEntryFromIlst;->read(F)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 72
    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->IconCompatParcelizer:I

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "smta: captureFrameRate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->read:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", svcTemporalLayerCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->IconCompatParcelizer:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 88
    iget p2, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->read:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 89
    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;->IconCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry.AnonymousClass5 (androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry$5)
.class final Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;
    .registers 1

    .line 107
    new-array p0, p0, [Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;
    .registers 3

    .line 102
    new-instance v0, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 98
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry$5;->write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 98
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry$5;->IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/mp4/SmtaMetadataEntry;

    move-result-object p0

    return-object p0
.end method
