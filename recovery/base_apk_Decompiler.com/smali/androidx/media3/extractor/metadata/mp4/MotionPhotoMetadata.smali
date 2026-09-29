###### Class androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata (androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata)
.class public final Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:J

.field public final IconCompatParcelizer:J

.field public final RemoteActionCompatParcelizer:J

.field public final read:J

.field public final write:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 127
    new-instance v0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata$1;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata$1;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJJJJ)V
    .registers 11

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-wide p1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->write:J

    .line 56
    iput-wide p3, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->AudioAttributesCompatParcelizer:J

    .line 57
    iput-wide p5, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->read:J

    .line 58
    iput-wide p7, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->RemoteActionCompatParcelizer:J

    .line 59
    iput-wide p9, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->IconCompatParcelizer:J

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->write:J

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->AudioAttributesCompatParcelizer:J

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->read:J

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->RemoteActionCompatParcelizer:J

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->IconCompatParcelizer:J

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 29
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
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
    if-eqz p1, :cond_3b

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_3b

    .line 78
    check-cast p1, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;

    .line 79
    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->write:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->write:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_3b

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->AudioAttributesCompatParcelizer:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->AudioAttributesCompatParcelizer:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_3b

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->read:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->read:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_3b

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->RemoteActionCompatParcelizer:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->RemoteActionCompatParcelizer:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_3b

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->IconCompatParcelizer:J

    iget-wide p0, p1, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->IconCompatParcelizer:J

    cmp-long p0, v1, p0

    if-nez p0, :cond_3b

    return v0

    :cond_3b
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 6

    .line 89
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->write:J

    invoke-static {v0, v1}, Lo/setFormatMetadata;->AudioAttributesCompatParcelizer(J)I

    move-result v0

    .line 90
    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->AudioAttributesCompatParcelizer:J

    invoke-static {v1, v2}, Lo/setFormatMetadata;->AudioAttributesCompatParcelizer(J)I

    move-result v1

    .line 91
    iget-wide v2, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->read:J

    invoke-static {v2, v3}, Lo/setFormatMetadata;->AudioAttributesCompatParcelizer(J)I

    move-result v2

    .line 92
    iget-wide v3, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->RemoteActionCompatParcelizer:J

    invoke-static {v3, v4}, Lo/setFormatMetadata;->AudioAttributesCompatParcelizer(J)I

    move-result v3

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 93
    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->IconCompatParcelizer:J

    invoke-static {v1, v2}, Lo/setFormatMetadata;->AudioAttributesCompatParcelizer(J)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Motion photo metadata: photoStartPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->write:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", photoSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->AudioAttributesCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", photoPresentationTimestampUs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->read:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", videoStartPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->RemoteActionCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", videoSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->IconCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 115
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->write:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 116
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->AudioAttributesCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 117
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->read:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 118
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->RemoteActionCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 119
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;->IconCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata.AnonymousClass1 (androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata$1)
.class final Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;
    .registers 3

    .line 132
    new-instance v0, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;
    .registers 1

    .line 137
    new-array p0, p0, [Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 128
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata$1;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 128
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata$1;->RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/mp4/MotionPhotoMetadata;

    move-result-object p0

    return-object p0
.end method
