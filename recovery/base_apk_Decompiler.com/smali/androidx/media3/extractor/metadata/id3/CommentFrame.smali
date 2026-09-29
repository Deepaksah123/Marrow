###### Class androidx.media3.extractor.metadata.id3.CommentFrame (androidx.media3.extractor.metadata.id3.CommentFrame)
.class public final Landroidx/media3/extractor/metadata/id3/CommentFrame;
.super Landroidx/media3/extractor/metadata/id3/Id3Frame;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/id3/CommentFrame;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final read:Ljava/lang/String;

.field public final write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 87
    new-instance v0, Landroidx/media3/extractor/metadata/id3/CommentFrame$2;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/id3/CommentFrame$2;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 44
    const-string v0, "COMM"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->write:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->read:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    .line 37
    const-string v0, "COMM"

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/id3/Id3Frame;-><init>(Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->write:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 40
    iput-object p3, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->read:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_31

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_31

    .line 58
    check-cast p1, Landroidx/media3/extractor/metadata/id3/CommentFrame;

    .line 59
    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/CommentFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->write:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/extractor/metadata/id3/CommentFrame;->write:Ljava/lang/String;

    .line 60
    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->read:Ljava/lang/String;

    iget-object p1, p1, Landroidx/media3/extractor/metadata/id3/CommentFrame;->read:Ljava/lang/String;

    .line 61
    invoke-static {p0, p1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_31

    return v0

    :cond_31
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 4

    .line 67
    iget-object v0, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->write:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_b

    :cond_a
    move v0, v1

    .line 68
    :goto_b
    iget-object v2, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_15

    :cond_14
    move v2, v1

    .line 69
    :goto_15
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->read:Ljava/lang/String;

    if-eqz p0, :cond_1d

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1d
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->write:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->read:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 82
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget-object p2, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/CommentFrame;->read:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.id3.CommentFrame.AnonymousClass2 (androidx.media3.extractor.metadata.id3.CommentFrame$2)
.class final Landroidx/media3/extractor/metadata/id3/CommentFrame$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/id3/CommentFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/id3/CommentFrame;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/CommentFrame;
    .registers 2

    .line 92
    new-instance v0, Landroidx/media3/extractor/metadata/id3/CommentFrame;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/id3/CommentFrame;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static read(I)[Landroidx/media3/extractor/metadata/id3/CommentFrame;
    .registers 1

    .line 97
    new-array p0, p0, [Landroidx/media3/extractor/metadata/id3/CommentFrame;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 88
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/CommentFrame$2;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/id3/CommentFrame;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 88
    invoke-static {p1}, Landroidx/media3/extractor/metadata/id3/CommentFrame$2;->read(I)[Landroidx/media3/extractor/metadata/id3/CommentFrame;

    move-result-object p0

    return-object p0
.end method
