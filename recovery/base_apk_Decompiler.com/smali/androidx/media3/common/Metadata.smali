###### Class androidx.media3.common.Metadata (androidx.media3.common.Metadata)
.class public final Landroidx/media3/common/Metadata;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/common/Metadata$Entry;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/common/Metadata;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final read:[Landroidx/media3/common/Metadata$Entry;

.field public final write:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 210
    new-instance v0, Landroidx/media3/common/Metadata$3;

    invoke-direct {v0}, Landroidx/media3/common/Metadata$3;-><init>()V

    sput-object v0, Landroidx/media3/common/Metadata;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Landroidx/media3/common/Metadata$Entry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 100
    new-array v0, v0, [Landroidx/media3/common/Metadata$Entry;

    invoke-interface {p3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Landroidx/media3/common/Metadata$Entry;

    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/common/Metadata;-><init>(J[Landroidx/media3/common/Metadata$Entry;)V

    return-void
.end method

.method private varargs constructor <init>(J[Landroidx/media3/common/Metadata$Entry;)V
    .registers 4

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-wide p1, p0, Landroidx/media3/common/Metadata;->write:J

    .line 85
    iput-object p3, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 5

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-array v0, v0, [Landroidx/media3/common/Metadata$Entry;

    iput-object v0, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    const/4 v0, 0x0

    .line 105
    :goto_c
    iget-object v1, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    array-length v2, v1

    if-ge v0, v2, :cond_22

    .line 106
    const-class v2, Landroidx/media3/common/Metadata$Entry;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroidx/media3/common/Metadata$Entry;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    .line 108
    :cond_22
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/media3/common/Metadata;->write:J

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/media3/common/Metadata$Entry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 92
    new-array v0, v0, [Landroidx/media3/common/Metadata$Entry;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroidx/media3/common/Metadata$Entry;

    invoke-direct {p0, p1}, Landroidx/media3/common/Metadata;-><init>([Landroidx/media3/common/Metadata$Entry;)V

    return-void
.end method

.method public varargs constructor <init>([Landroidx/media3/common/Metadata$Entry;)V
    .registers 4

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/common/Metadata;-><init>(J[Landroidx/media3/common/Metadata$Entry;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(J)Landroidx/media3/common/Metadata;
    .registers 5

    .line 162
    iget-wide v0, p0, Landroidx/media3/common/Metadata;->write:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_7

    return-object p0

    .line 165
    :cond_7
    new-instance v0, Landroidx/media3/common/Metadata;

    iget-object p0, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    invoke-direct {v0, p1, p2, p0}, Landroidx/media3/common/Metadata;-><init>(J[Landroidx/media3/common/Metadata$Entry;)V

    return-object v0
.end method

.method public final IconCompatParcelizer(I)Landroidx/media3/common/Metadata$Entry;
    .registers 2

    .line 123
    iget-object p0, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    aget-object p0, p0, p1

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Landroidx/media3/common/Metadata;)Landroidx/media3/common/Metadata;
    .registers 2

    if-nez p1, :cond_3

    return-object p0

    .line 138
    :cond_3
    iget-object p1, p1, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    invoke-virtual {p0, p1}, Landroidx/media3/common/Metadata;->read([Landroidx/media3/common/Metadata$Entry;)Landroidx/media3/common/Metadata;

    move-result-object p0

    return-object p0
.end method

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
    if-eqz p1, :cond_25

    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_25

    .line 176
    check-cast p1, Landroidx/media3/common/Metadata;

    .line 177
    iget-object v1, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    iget-object v2, p1, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    iget-wide v1, p0, Landroidx/media3/common/Metadata;->write:J

    iget-wide p0, p1, Landroidx/media3/common/Metadata;->write:J

    cmp-long p0, v1, p0

    if-nez p0, :cond_25

    return v0

    :cond_25
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 4

    .line 182
    iget-object v0, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 183
    iget-wide v1, p0, Landroidx/media3/common/Metadata;->write:J

    invoke-static {v1, v2}, Lo/setFormatMetadata;->AudioAttributesCompatParcelizer(J)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final varargs read([Landroidx/media3/common/Metadata$Entry;)Landroidx/media3/common/Metadata;
    .registers 5

    .line 148
    array-length v0, p1

    if-nez v0, :cond_4

    return-object p0

    .line 151
    :cond_4
    iget-wide v0, p0, Landroidx/media3/common/Metadata;->write:J

    iget-object p0, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    .line 152
    new-instance v2, Landroidx/media3/common/Metadata;

    invoke-static {p0, p1}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Landroidx/media3/common/Metadata$Entry;

    invoke-direct {v2, v0, v1, p0}, Landroidx/media3/common/Metadata;-><init>(J[Landroidx/media3/common/Metadata$Entry;)V

    return-object v2
.end method

.method public final toString()Ljava/lang/String;
    .registers 6

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "entries="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    .line 190
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    iget-wide v1, p0, Landroidx/media3/common/Metadata;->write:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_1e

    const-string p0, ""

    goto :goto_2e

    :cond_1e
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", presentationTimeUs="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Landroidx/media3/common/Metadata;->write:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_2e
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()I
    .registers 1

    .line 113
    iget-object p0, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    array-length p0, p0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 7

    .line 203
    iget-object p2, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    array-length p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 204
    iget-object p2, p0, Landroidx/media3/common/Metadata;->read:[Landroidx/media3/common/Metadata$Entry;

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_b
    if-ge v2, v0, :cond_15

    aget-object v3, p2, v2

    .line 205
    invoke-virtual {p1, v3, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    .line 207
    :cond_15
    iget-wide v0, p0, Landroidx/media3/common/Metadata;->write:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

###### Class androidx.media3.common.Metadata.AnonymousClass3 (androidx.media3.common.Metadata$3)
.class final Landroidx/media3/common/Metadata$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/common/Metadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/common/Metadata;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Landroidx/media3/common/Metadata;
    .registers 1

    .line 219
    new-array p0, p0, [Landroidx/media3/common/Metadata;

    return-object p0
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/common/Metadata;
    .registers 2

    .line 214
    new-instance v0, Landroidx/media3/common/Metadata;

    invoke-direct {v0, p0}, Landroidx/media3/common/Metadata;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 211
    invoke-static {p1}, Landroidx/media3/common/Metadata$3;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/common/Metadata;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 211
    invoke-static {p1}, Landroidx/media3/common/Metadata$3;->AudioAttributesCompatParcelizer(I)[Landroidx/media3/common/Metadata;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.common.Metadata.Entry (androidx.media3.common.Metadata$Entry)
.class public interface abstract Landroidx/media3/common/Metadata$Entry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/common/Metadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Entry"
.end annotation


# virtual methods
.method public AudioAttributesCompatParcelizer(Lo/getSchema$RemoteActionCompatParcelizer;)V
    .registers 2

    return-void
.end method

.method public RemoteActionCompatParcelizer()[B
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public read()Lo/format;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method
