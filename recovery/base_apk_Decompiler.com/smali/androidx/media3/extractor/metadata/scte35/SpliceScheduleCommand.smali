###### Class androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand (androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand)
.class public final Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;
.super Landroidx/media3/extractor/metadata/scte35/SpliceCommand;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;,
        Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final IconCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 264
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$3;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$3;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 6

    .line 235
    invoke-direct {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceCommand;-><init>()V

    .line 236
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 237
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_d
    if-ge v2, v0, :cond_19

    .line 239
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->read(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    .line 241
    :cond_19
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;->IconCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 29
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;",
            ">;)V"
        }
    .end annotation

    .line 231
    invoke-direct {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceCommand;-><init>()V

    .line 232
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;->IconCompatParcelizer:Ljava/util/List;

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Lo/AsPropertyTypeDeserializer;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;
    .registers 5

    .line 245
    invoke-virtual {p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v0

    .line 246
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_a
    if-ge v2, v0, :cond_16

    .line 248
    invoke-static {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->IconCompatParcelizer(Lo/AsPropertyTypeDeserializer;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    .line 250
    :cond_16
    new-instance p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;

    invoke-direct {p0, v1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;-><init>(Ljava/util/List;)V

    return-object p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 257
    iget-object p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    .line 258
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    :goto_a
    if-ge v0, p2, :cond_1a

    .line 260
    iget-object v1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;

    invoke-static {v1, p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->IconCompatParcelizer(Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;Landroid/os/Parcel;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_1a
    return-void
.end method

###### Class androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.AnonymousClass3 (androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$3)
.class final Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;
    .registers 1

    .line 274
    new-array p0, p0, [Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;

    return-object p0
.end method

.method private static read(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;
    .registers 3

    .line 269
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 265
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$3;->read(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 265
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$3;->IconCompatParcelizer(I)[Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.AudioAttributesCompatParcelizer (androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$AudioAttributesCompatParcelizer)
.class public final Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field public final AudioAttributesCompatParcelizer:J

.field public final IconCompatParcelizer:I


# direct methods
.method private constructor <init>(IJ)V
    .registers 4

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    iput p1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    .line 215
    iput-wide p2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:J

    return-void
.end method

.method synthetic constructor <init>(IJB)V
    .registers 5

    .line 208
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;-><init>(IJ)V

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;
    .registers 1

    .line 208
    invoke-static {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;
    .registers 5

    .line 219
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;-><init>(IJ)V

    return-object v0
.end method

.method static synthetic read(Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;Landroid/os/Parcel;)V
    .registers 2

    .line 208
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;->write(Landroid/os/Parcel;)V

    return-void
.end method

.method private write(Landroid/os/Parcel;)V
    .registers 4

    .line 223
    iget v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;->IconCompatParcelizer:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 224
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.IconCompatParcelizer (androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand$IconCompatParcelizer)
.class public final Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;",
            ">;"
        }
    .end annotation
.end field

.field public final AudioAttributesImplApi21Parcelizer:Z

.field public final AudioAttributesImplApi26Parcelizer:J

.field public final AudioAttributesImplBaseParcelizer:Z

.field public final IconCompatParcelizer:I

.field public final MediaBrowserCompatCustomActionResultReceiver:Z

.field public final MediaBrowserCompatItemReceiver:I

.field public final MediaBrowserCompatMediaItem:J

.field public final RemoteActionCompatParcelizer:I

.field public final read:Z

.field public final write:J


# direct methods
.method private constructor <init>(JZZZLjava/util/List;JZJIII)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZZ",
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;",
            ">;JZJIII)V"
        }
    .end annotation

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-wide p1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:J

    .line 99
    iput-boolean p3, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    .line 100
    iput-boolean p4, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 101
    iput-boolean p5, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Z

    .line 102
    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/List;

    .line 103
    iput-wide p7, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatMediaItem:J

    .line 104
    iput-boolean p9, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->read:Z

    .line 105
    iput-wide p10, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->write:J

    .line 106
    iput p12, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    .line 107
    iput p13, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 108
    iput p14, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 8

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:J

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_13

    move v0, v2

    goto :goto_14

    :cond_13
    move v0, v1

    :goto_14
    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_1e

    move v0, v2

    goto :goto_1f

    :cond_1e
    move v0, v1

    :goto_1f
    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_29

    move v0, v2

    goto :goto_2a

    :cond_29
    move v0, v1

    :goto_2a
    iput-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Z

    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 117
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v1

    :goto_36
    if-ge v4, v0, :cond_42

    .line 119
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_36

    .line 121
    :cond_42
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/List;

    .line 122
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatMediaItem:J

    .line 123
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v2, :cond_55

    move v1, v2

    :cond_55
    iput-boolean v1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->read:Z

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->write:J

    .line 125
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    .line 126
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->IconCompatParcelizer:I

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Landroid/os/Parcel;)V
    .registers 5

    .line 185
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 186
    iget-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 187
    iget-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 188
    iget-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 189
    iget-object v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 190
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x0

    :goto_21
    if-ge v1, v0, :cond_31

    .line 192
    iget-object v2, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;

    invoke-static {v2, p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;->read(Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;Landroid/os/Parcel;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_21

    .line 194
    :cond_31
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatMediaItem:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 195
    iget-boolean v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->read:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 196
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->write:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 197
    iget v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 198
    iget v0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 199
    iget p0, p0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->IconCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method static synthetic IconCompatParcelizer(Lo/AsPropertyTypeDeserializer;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;
    .registers 1

    .line 32
    invoke-static {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->write(Lo/AsPropertyTypeDeserializer;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method static synthetic IconCompatParcelizer(Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;Landroid/os/Parcel;)V
    .registers 2

    .line 32
    invoke-direct {p0, p1}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)V

    return-void
.end method

.method static synthetic read(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;
    .registers 1

    .line 32
    invoke-static {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;->write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;
    .registers 2

    .line 203
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;

    invoke-direct {v0, p0}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(Lo/AsPropertyTypeDeserializer;)Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;
    .registers 23

    .line 131
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onMediaButtonEvent()J

    move-result-wide v1

    .line 133
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    const/4 v3, 0x0

    if-nez v0, :cond_f

    move v5, v3

    goto :goto_10

    :cond_f
    const/4 v5, 0x1

    .line 137
    :goto_10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez v5, :cond_a6

    .line 144
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v8

    and-int/lit16 v9, v8, 0x80

    if-eqz v9, :cond_21

    const/4 v9, 0x1

    goto :goto_22

    :cond_21
    move v9, v3

    :goto_22
    and-int/lit8 v10, v8, 0x40

    if-eqz v10, :cond_28

    const/4 v10, 0x1

    goto :goto_29

    :cond_28
    move v10, v3

    :goto_29
    const/16 v11, 0x20

    and-int/2addr v8, v11

    if-eqz v8, :cond_30

    const/4 v8, 0x1

    goto :goto_31

    :cond_30
    move v8, v3

    :goto_31
    if-eqz v10, :cond_38

    .line 149
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onMediaButtonEvent()J

    move-result-wide v12

    goto :goto_3d

    :cond_38
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    :goto_3d
    if-nez v10, :cond_61

    .line 152
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v0

    .line 153
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v15, v3

    :goto_49
    if-ge v15, v0, :cond_60

    .line 155
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v4

    .line 156
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onMediaButtonEvent()J

    move-result-wide v6

    .line 157
    new-instance v11, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;

    invoke-direct {v11, v4, v6, v7, v3}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$AudioAttributesCompatParcelizer;-><init>(IJB)V

    invoke-virtual {v14, v11}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    const/16 v11, 0x20

    goto :goto_49

    :cond_60
    move-object v0, v14

    :cond_61
    if-eqz v8, :cond_85

    .line 161
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v4

    int-to-long v6, v4

    const-wide/16 v14, 0x80

    and-long/2addr v14, v6

    const-wide/16 v17, 0x0

    cmp-long v4, v14, v17

    if-eqz v4, :cond_72

    const/4 v3, 0x1

    .line 163
    :cond_72
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onMediaButtonEvent()J

    move-result-wide v14

    const-wide/16 v16, 0x1

    and-long v6, v6, v16

    const/16 v4, 0x20

    shl-long/2addr v6, v4

    or-long/2addr v6, v14

    const-wide/16 v14, 0x3e8

    mul-long/2addr v6, v14

    const-wide/16 v14, 0x5a

    .line 164
    div-long/2addr v6, v14

    goto :goto_8a

    :cond_85
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 166
    :goto_8a
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPrepare()I

    move-result v4

    .line 167
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v8

    .line 168
    invoke-virtual/range {p0 .. p0}, Lo/AsPropertyTypeDeserializer;->onPlayFromMediaId()I

    move-result v11

    move-wide/from16 v17, v6

    move v14, v11

    move-object v6, v0

    move/from16 v19, v9

    move v9, v3

    move-wide/from16 v20, v12

    move v12, v4

    move v13, v8

    move/from16 v4, v19

    move-wide/from16 v7, v20

    goto :goto_b7

    :cond_a6
    move-object v6, v0

    move v4, v3

    move v9, v4

    move v10, v9

    move v12, v10

    move v13, v12

    move v14, v13

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 170
    :goto_b7
    new-instance v15, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;

    move-object v0, v15

    move v3, v5

    move v5, v10

    move-wide/from16 v10, v17

    invoke-direct/range {v0 .. v14}, Landroidx/media3/extractor/metadata/scte35/SpliceScheduleCommand$IconCompatParcelizer;-><init>(JZZZLjava/util/List;JZJIII)V

    return-object v15
.end method
