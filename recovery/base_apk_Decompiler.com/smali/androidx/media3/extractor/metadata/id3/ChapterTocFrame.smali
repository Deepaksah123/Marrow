###### Class androidx.media3.extractor.metadata.id3.ChapterTocFrame (androidx.media3.extractor.metadata.id3.ChapterTocFrame)
.class public final Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;
.super Landroidx/media3/extractor/metadata/id3/Id3Frame;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private final IconCompatParcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

.field public final RemoteActionCompatParcelizer:[Ljava/lang/String;

.field public final read:Z

.field public final write:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 112
    new-instance v0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame$2;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame$2;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 6

    .line 53
    const-string v0, "CTOC"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1b

    move v0, v1

    goto :goto_1c

    :cond_1b
    move v0, v2

    :goto_1c
    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->write:Z

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_25

    goto :goto_26

    :cond_25
    move v1, v2

    :goto_26
    iput-boolean v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->read:Z

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 59
    new-array v1, v0, [Landroidx/media3/extractor/metadata/id3/Id3Frame;

    iput-object v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->IconCompatParcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    :goto_3c
    if-ge v2, v0, :cond_51

    .line 61
    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->IconCompatParcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    const-class v3, Landroidx/media3/extractor/metadata/id3/Id3Frame;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroidx/media3/extractor/metadata/id3/Id3Frame;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3c

    :cond_51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Landroidx/media3/extractor/metadata/id3/Id3Frame;)V
    .registers 7

    .line 44
    const-string v0, "CTOC"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 45
    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 46
    iput-boolean p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->write:Z

    .line 47
    iput-boolean p3, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->read:Z

    .line 48
    iput-object p4, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    .line 49
    iput-object p5, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->IconCompatParcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_3d

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_3d

    .line 83
    check-cast p1, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;

    .line 84
    iget-boolean v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->write:Z

    iget-boolean v2, p1, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->write:Z

    if-ne v1, v2, :cond_3d

    iget-boolean v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->read:Z

    iget-boolean v2, p1, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->read:Z

    if-ne v1, v2, :cond_3d

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 86
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    .line 87
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3d

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->IconCompatParcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    iget-object p1, p1, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->IconCompatParcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    .line 88
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3d

    return v0

    :cond_3d
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 3

    .line 94
    iget-boolean v0, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->write:Z

    .line 95
    iget-boolean v1, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->read:Z

    .line 96
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    goto :goto_e

    :cond_d
    const/4 p0, 0x0

    :goto_e
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, p0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 6

    .line 102
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 103
    iget-boolean p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->write:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 104
    iget-boolean p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->read:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    .line 105
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->RemoteActionCompatParcelizer:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 106
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->IconCompatParcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;->IconCompatParcelizer:[Landroidx/media3/extractor/metadata/id3/Id3Frame;

    array-length p2, p0

    const/4 v0, 0x0

    move v1, v0

    :goto_21
    if-ge v1, p2, :cond_2b

    aget-object v2, p0, v1

    .line 108
    invoke-virtual {p1, v2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_21

    :cond_2b
    return-void
.end method

###### Class androidx.media3.extractor.metadata.id3.ChapterTocFrame.AnonymousClass2 (androidx.media3.extractor.metadata.id3.ChapterTocFrame$2)
.class final Landroidx/media3/extractor/metadata/id3/ChapterTocFrame$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;
    .registers 2

    .line 117
    new-instance v0, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;
    .registers 1

    .line 122
    new-array p0, p0, [Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 113
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame$2;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 113
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/ChapterTocFrame$2;->IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/id3/ChapterTocFrame;

    move-result-object p0

    return-object p0
.end method
