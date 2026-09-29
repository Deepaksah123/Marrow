###### Class androidx.media3.extractor.metadata.vorbis.VorbisComment (androidx.media3.extractor.metadata.vorbis.VorbisComment)
.class public final Landroidx/media3/extractor/metadata/vorbis/VorbisComment;
.super Landroidx/media3/extractor/metadata/flac/VorbisComment;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/vorbis/VorbisComment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 38
    new-instance v0, Landroidx/media3/extractor/metadata/vorbis/VorbisComment$4;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/vorbis/VorbisComment$4;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/vorbis/VorbisComment;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 2

    .line 35
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/flac/VorbisComment;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    .line 31
    invoke-direct {p0, p1, p2}, Landroidx/media3/extractor/metadata/flac/VorbisComment;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.vorbis.VorbisComment.AnonymousClass4 (androidx.media3.extractor.metadata.vorbis.VorbisComment$4)
.class final Landroidx/media3/extractor/metadata/vorbis/VorbisComment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/vorbis/VorbisComment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/vorbis/VorbisComment;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/vorbis/VorbisComment;
    .registers 2

    .line 43
    new-instance v0, Landroidx/media3/extractor/metadata/vorbis/VorbisComment;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/vorbis/VorbisComment;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static read(I)[Landroidx/media3/extractor/metadata/vorbis/VorbisComment;
    .registers 1

    .line 48
    new-array p0, p0, [Landroidx/media3/extractor/metadata/vorbis/VorbisComment;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 39
    invoke-static {p1}, Landroidx/media3/extractor/metadata/vorbis/VorbisComment$4;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/vorbis/VorbisComment;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 39
    invoke-static {p1}, Landroidx/media3/extractor/metadata/vorbis/VorbisComment$4;->read(I)[Landroidx/media3/extractor/metadata/vorbis/VorbisComment;

    move-result-object p0

    return-object p0
.end method
