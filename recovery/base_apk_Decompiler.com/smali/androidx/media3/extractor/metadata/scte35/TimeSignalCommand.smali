###### Class androidx.media3.extractor.metadata.scte35.TimeSignalCommand (androidx.media3.extractor.metadata.scte35.TimeSignalCommand)
.class public final Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;
.super Landroidx/media3/extractor/metadata/scte35/SpliceCommand;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:J

.field public final write:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 84
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand$3;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand$3;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(JJ)V
    .registers 5

    .line 34
    invoke-direct {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceCommand;-><init>()V

    .line 35
    iput-wide p1, p0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->write:J

    .line 36
    iput-wide p3, p0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->AudioAttributesCompatParcelizer:J

    return-void
.end method

.method synthetic constructor <init>(JJB)V
    .registers 6

    .line 26
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;-><init>(JJ)V

    return-void
.end method

.method static AudioAttributesCompatParcelizer(Lo/AsPropertyTypeDeserializer;J)J
    .registers 9

    .line 56
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x80

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_21

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    .line 60
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->onMediaButtonEvent()J

    move-result-wide v2

    or-long/2addr v0, v2

    add-long/2addr v0, p1

    const-wide p0, 0x1ffffffffL

    and-long/2addr p0, v0

    return-wide p0

    :cond_21
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p0
.end method

.method public static IconCompatParcelizer(Lo/AsPropertyTypeDeserializer;JLo/MinimalClassNameIdResolver;)Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;
    .registers 5

    .line 41
    invoke-static {p0, p1, p2}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->AudioAttributesCompatParcelizer(Lo/AsPropertyTypeDeserializer;J)J

    move-result-wide p0

    .line 42
    invoke-virtual {p3, p0, p1}, Lo/MinimalClassNameIdResolver;->write(J)J

    move-result-wide p2

    .line 43
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;

    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;-><init>(JJ)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .registers 4

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SCTE-35 TimeSignalCommand { ptsTime="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->write:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", playbackPositionUs= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->AudioAttributesCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " }"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 80
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->write:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 81
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;->AudioAttributesCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.scte35.TimeSignalCommand.AnonymousClass3 (androidx.media3.extractor.metadata.scte35.TimeSignalCommand$3)
.class final Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;
    .registers 8

    .line 89
    new-instance v6, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;-><init>(JJB)V

    return-object v6
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;
    .registers 1

    .line 94
    new-array p0, p0, [Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 85
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand$3;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 85
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand$3;->RemoteActionCompatParcelizer(I)[Landroidx/media3/extractor/metadata/scte35/TimeSignalCommand;

    move-result-object p0

    return-object p0
.end method
