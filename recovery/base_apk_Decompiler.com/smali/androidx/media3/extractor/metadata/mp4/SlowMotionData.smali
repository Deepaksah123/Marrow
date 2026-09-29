###### Class androidx.media3.extractor.metadata.mp4.SlowMotionData (androidx.media3.extractor.metadata.mp4.SlowMotionData)
.class public final Landroidx/media3/extractor/metadata/mp4/SlowMotionData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/mp4/SlowMotionData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final RemoteActionCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 176
    new-instance v0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$5;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$5;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;",
            ">;)V"
        }
    .end annotation

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;->RemoteActionCompatParcelizer:Ljava/util/List;

    .line 141
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;->write(Ljava/util/List;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    return-void
.end method

.method private static write(Ljava/util/List;)Z
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;",
            ">;)Z"
        }
    .end annotation

    .line 192
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    return v1

    .line 195
    :cond_8
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    iget-wide v2, v0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    const/4 v0, 0x1

    move v4, v0

    .line 196
    :goto_12
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_30

    .line 197
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    iget-wide v5, v5, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    cmp-long v2, v5, v2

    if-gez v2, :cond_25

    return v0

    .line 200
    :cond_25
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    iget-wide v2, v2, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    :cond_30
    return v1
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 4

    if-ne p0, p1, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    if-eqz p1, :cond_1b

    .line 154
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_1b

    .line 157
    check-cast p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;

    .line 158
    iget-object p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;->RemoteActionCompatParcelizer:Ljava/util/List;

    iget-object p1, p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 1

    .line 163
    iget-object p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SlowMotion: segments="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 173
    iget-object p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.mp4.SlowMotionData.AnonymousClass5 (androidx.media3.extractor.metadata.mp4.SlowMotionData$5)
.class final Landroidx/media3/extractor/metadata/mp4/SlowMotionData$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/mp4/SlowMotionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/mp4/SlowMotionData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/mp4/SlowMotionData;
    .registers 3

    .line 180
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 181
    const-class v1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 182
    new-instance p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;

    invoke-direct {p0, v0}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static write(I)[Landroidx/media3/extractor/metadata/mp4/SlowMotionData;
    .registers 1

    .line 187
    new-array p0, p0, [Landroidx/media3/extractor/metadata/mp4/SlowMotionData;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 177
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$5;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/mp4/SlowMotionData;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 177
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$5;->write(I)[Landroidx/media3/extractor/metadata/mp4/SlowMotionData;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment (androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment)
.class public final Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/mp4/SlowMotionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Segment"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:J

.field public final RemoteActionCompatParcelizer:I

.field public final write:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 39
    new-instance v0, Lo/getEnumClass;

    invoke-direct {v0}, Lo/getEnumClass;-><init>()V

    .line 113
    new-instance v0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment$3;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment$3;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJI)V
    .registers 7

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    cmp-long v0, p1, p3

    if-gez v0, :cond_9

    const/4 v0, 0x1

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    .line 69
    :goto_a
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Z)V

    .line 70
    iput-wide p1, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    .line 71
    iput-wide p3, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    .line 72
    iput p5, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->RemoteActionCompatParcelizer:I

    return-void
.end method

.method public static synthetic write(Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;)I
    .registers 7

    .line 41
    invoke-static {}, Lo/checkNonNegative;->write()Lo/checkNonNegative;

    move-result-object v0

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    .line 42
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/checkNonNegative;->IconCompatParcelizer(JJ)Lo/checkNonNegative;

    move-result-object v0

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    .line 43
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/checkNonNegative;->IconCompatParcelizer(JJ)Lo/checkNonNegative;

    move-result-object v0

    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->RemoteActionCompatParcelizer:I

    iget p1, p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->RemoteActionCompatParcelizer:I

    .line 44
    invoke-virtual {v0, p0, p1}, Lo/checkNonNegative;->AudioAttributesCompatParcelizer(II)Lo/checkNonNegative;

    move-result-object p0

    .line 45
    invoke-virtual {p0}, Lo/checkNonNegative;->read()I

    move-result p0

    return p0
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
    if-eqz p1, :cond_29

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_29

    .line 90
    check-cast p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    .line 91
    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_29

    iget-wide v1, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    iget-wide v3, p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_29

    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->RemoteActionCompatParcelizer:I

    iget p1, p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->RemoteActionCompatParcelizer:I

    if-ne p0, p1, :cond_29

    return v0

    :cond_29
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 5

    .line 98
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    iget-wide v2, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->RemoteActionCompatParcelizer:I

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lo/parseSmta;->read([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 5

    .line 77
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    .line 79
    iget-wide v2, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->RemoteActionCompatParcelizer:I

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 77
    const-string v0, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d"

    invoke-static {v0, p0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 108
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->AudioAttributesCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 109
    iget-wide v0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 110
    iget p0, p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.AnonymousClass3 (androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment$3)
.class final Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;
    .registers 1

    .line 126
    new-array p0, p0, [Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;
    .registers 7

    .line 118
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    .line 119
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    .line 120
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 121
    new-instance p0, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;-><init>(JJI)V

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 114
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment$3;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 114
    invoke-static {p1}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment$3;->AudioAttributesCompatParcelizer(I)[Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getEnumClass (o.getEnumClass)
.class public final synthetic Lo/getEnumClass;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 0
    check-cast p1, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    check-cast p2, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;

    invoke-static {p1, p2}, Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;->write(Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;Landroidx/media3/extractor/metadata/mp4/SlowMotionData$Segment;)I

    move-result p0

    return p0
.end method
