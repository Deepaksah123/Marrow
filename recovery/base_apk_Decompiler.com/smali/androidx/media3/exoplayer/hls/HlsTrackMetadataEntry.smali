###### Class androidx.media3.exoplayer.hls.HlsTrackMetadataEntry (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry)
.class public final Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final IconCompatParcelizer:Ljava/lang/String;

.field public final RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 251
    new-instance v0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$3;

    invoke-direct {v0}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$3;-><init>()V

    sput-object v0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 6

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 196
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->IconCompatParcelizer:Ljava/lang/String;

    .line 197
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 198
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_19
    if-ge v2, v0, :cond_2d

    .line 200
    const-class v3, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_19

    .line 202
    :cond_2d
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->read:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;",
            ">;)V"
        }
    .end annotation

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 190
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->IconCompatParcelizer:Ljava/lang/String;

    .line 191
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->read:Ljava/util/List;

    return-void
.end method


# virtual methods
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
    if-eqz p1, :cond_31

    .line 215
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_31

    .line 219
    check-cast p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    .line 220
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->IconCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->IconCompatParcelizer:Ljava/lang/String;

    .line 221
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->read:Ljava/util/List;

    iget-object p1, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->read:Ljava/util/List;

    .line 222
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_31

    return v0

    :cond_31
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 4

    .line 227
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->RemoteActionCompatParcelizer:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_b

    :cond_a
    move v0, v1

    .line 228
    :goto_b
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->IconCompatParcelizer:Ljava/lang/String;

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_13
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 229
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->read:Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HlsTrackMetadataEntry"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz v1, :cond_2b

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_2d

    :cond_2b
    const-string p0, ""

    :goto_2d
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 6

    .line 242
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 243
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 244
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->read:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    .line 245
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    move v1, v0

    :goto_15
    if-ge v1, p2, :cond_25

    .line 247
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;->read:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_25
    return-void
.end method

###### Class androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.AnonymousClass3 (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry$3)
.class final Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;
    .registers 2

    .line 255
    new-instance v0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(I)[Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;
    .registers 1

    .line 260
    new-array p0, p0, [Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 252
    invoke-static {p1}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$3;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 252
    invoke-static {p1}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$3;->write(I)[Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry$VariantInfo)
.class public final Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VariantInfo"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field public final AudioAttributesImplBaseParcelizer:Ljava/lang/String;

.field public final IconCompatParcelizer:Ljava/lang/String;

.field public final RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final read:I

.field public final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 148
    new-instance v0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo$3;

    invoke-direct {v0}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo$3;-><init>()V

    sput-object v0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 7

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->read:I

    .line 87
    iput p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->write:I

    .line 88
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 89
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 90
    iput-object p5, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 91
    iput-object p6, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->IconCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->read:I

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->write:I

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->IconCompatParcelizer:Ljava/lang/String;

    return-void
.end method


# virtual methods
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
    if-eqz p1, :cond_47

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_47

    .line 111
    check-cast p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;

    .line 112
    iget v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->read:I

    iget v2, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->read:I

    if-ne v1, v2, :cond_47

    iget v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->write:I

    iget v2, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->write:I

    if-ne v1, v2, :cond_47

    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 114
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_47

    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 115
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_47

    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v2, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 116
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_47

    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->IconCompatParcelizer:Ljava/lang/String;

    iget-object p1, p1, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->IconCompatParcelizer:Ljava/lang/String;

    .line 117
    invoke-static {p0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_47

    return v0

    :cond_47
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 7

    .line 122
    iget v0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->read:I

    .line 123
    iget v1, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->write:I

    .line 124
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_f

    :cond_e
    move v2, v3

    .line 125
    :goto_f
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz v4, :cond_18

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_19

    :cond_18
    move v4, v3

    .line 126
    :goto_19
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    if-eqz v5, :cond_22

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_23

    :cond_22
    move v5, v3

    .line 127
    :goto_23
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->IconCompatParcelizer:Ljava/lang/String;

    if-eqz p0, :cond_2b

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :cond_2b
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v5

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 140
    iget p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->read:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    iget p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 142
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 143
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 144
    iget-object p2, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo.AnonymousClass3 (androidx.media3.exoplayer.hls.HlsTrackMetadataEntry$VariantInfo$3)
.class final Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;
    .registers 2

    .line 152
    new-instance v0, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;

    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(I)[Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;
    .registers 1

    .line 157
    new-array p0, p0, [Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 149
    invoke-static {p1}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo$3;->write(Landroid/os/Parcel;)Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 149
    invoke-static {p1}, Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo$3;->write(I)[Landroidx/media3/exoplayer/hls/HlsTrackMetadataEntry$VariantInfo;

    move-result-object p0

    return-object p0
.end method
