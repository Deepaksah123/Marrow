###### Class androidx.media3.extractor.metadata.id3.Id3Frame (androidx.media3.extractor.metadata.id3.Id3Frame)
.class public abstract Landroidx/media3/extractor/metadata/id3/Id3Frame;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# instance fields
.field public final MediaBrowserCompatItemReceiver:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    .line 34
    iget-object p0, p0, Landroidx/media3/extractor/metadata/id3/Id3Frame;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    return-object p0
.end method
