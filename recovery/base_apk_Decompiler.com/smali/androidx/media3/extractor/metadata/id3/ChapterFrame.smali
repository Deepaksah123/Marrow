###### Class androidx.media3.extractor.metadata.id3.ChapterFrame (androidx.media3.extractor.metadata.id3.ChapterFrame)
.class public final Landroidx/media3/extractor/metadata/id3/ChapterFrame;
.super Landroidx/media3/extractor/metadata/id3/Id3Frame;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/id3/ChapterFrame;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:I

.field private final AudioAttributesImplApi21Parcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

.field public final IconCompatParcelizer:J

.field public final RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final read:J

.field public final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 131
    new-instance v0, Landroidx/media3/extractor/metadata/id3/ChapterFrame$4;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/id3/ChapterFrame$4;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 6

    .line 62
    const-string v0, "CHAP"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesCompatParcelizer:I

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->write:I

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->IconCompatParcelizer:J

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->read:J

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 69
    new-array v1, v0, [Landroidx/media3/extractor/metadata/id3/Id3Frame;

    iput-object v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesImplApi21Parcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    const/4 v1, 0x0

    :goto_32
    if-ge v1, v0, :cond_47

    .line 71
    iget-object v2, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesImplApi21Parcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    const-class v3, Landroidx/media3/extractor/metadata/id3/Id3Frame;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroidx/media3/extractor/metadata/id3/Id3Frame;

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_32

    :cond_47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIJJ[Landroidx/media3/extractor/metadata/id3/Id3Frame;)V
    .registers 10

    .line 52
    const-string v0, "CHAP"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 53
    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 54
    iput p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesCompatParcelizer:I

    .line 55
    iput p3, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->write:I

    .line 56
    iput-wide p4, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->IconCompatParcelizer:J

    .line 57
    iput-wide p6, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->read:J

    .line 58
    iput-object p8, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesImplApi21Parcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

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
    if-eqz p1, :cond_43

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_43

    .line 93
    check-cast p1, Landroidx/media3/extractor/metadata/id3/ChapterFrame;

    .line 94
    iget v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesCompatParcelizer:I

    iget v2, p1, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesCompatParcelizer:I

    if-ne v1, v2, :cond_43

    iget v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->write:I

    iget v2, p1, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->write:I

    if-ne v1, v2, :cond_43

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->IconCompatParcelizer:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->IconCompatParcelizer:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_43

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->read:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->read:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_43

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 98
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesImplApi21Parcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    iget-object p1, p1, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesImplApi21Parcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    .line 99
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_43

    return v0

    :cond_43
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 6

    .line 105
    iget v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesCompatParcelizer:I

    .line 106
    iget v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->write:I

    .line 107
    iget-wide v2, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->IconCompatParcelizer:J

    long-to-int v2, v2

    .line 108
    iget-wide v3, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->read:J

    long-to-int v3, v3

    .line 109
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz p0, :cond_13

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    goto :goto_14

    :cond_13
    const/4 p0, 0x0

    :goto_14
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, p0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 6

    .line 115
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 116
    iget p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    iget p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 118
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->IconCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 119
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->read:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 120
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesImplApi21Parcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;->AudioAttributesImplApi21Parcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    array-length p2, p0

    const/4 v0, 0x0

    move v1, v0

    :goto_24
    if-ge v1, p2, :cond_2e

    aget-object v2, p0, v1

    .line 122
    invoke-virtual {p1, v2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_24

    :cond_2e
    return-void
.end method

###### Class androidx.media3.extractor.metadata.id3.ChapterFrame.AnonymousClass4 (androidx.media3.extractor.metadata.id3.ChapterFrame$4)
.class final Landroidx/media3/extractor/metadata/id3/ChapterFrame$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/id3/ChapterFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/id3/ChapterFrame;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/ChapterFrame;
    .registers 2

    .line 136
    new-instance v0, Landroidx/media3/extractor/metadata/id3/ChapterFrame;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/id3/ChapterFrame;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(I)[Landroidx/media3/extractor/metadata/id3/ChapterFrame;
    .registers 1

    .line 141
    new-array p0, p0, [Landroidx/media3/extractor/metadata/id3/ChapterFrame;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 132
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/ChapterFrame$4;->write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/ChapterFrame;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 132
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/ChapterFrame$4;->write(I)[Landroidx/media3/extractor/metadata/id3/ChapterFrame;

    move-result-object p0

    return-object p0
.end method
