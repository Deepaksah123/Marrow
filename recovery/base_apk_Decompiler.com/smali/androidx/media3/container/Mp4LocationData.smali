###### Class androidx.media3.container.Mp4LocationData (androidx.media3.container.Mp4LocationData)
.class public final Landroidx/media3/container/Mp4LocationData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/container/Mp4LocationData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final RemoteActionCompatParcelizer:F

.field public final read:F


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 93
    new-instance v0, Landroidx/media3/container/Mp4LocationData$4;

    invoke-direct {v0}, Landroidx/media3/container/Mp4LocationData$4;-><init>()V

    sput-object v0, Landroidx/media3/container/Mp4LocationData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(FF)V
    .registers 5

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x3d4c0000    # -90.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_1d

    const/high16 v0, 0x42b40000    # 90.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_1d

    const/high16 v0, -0x3ccc0000    # -180.0f

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_1d

    const/high16 v0, 0x43340000    # 180.0f

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_1d

    const/4 v0, 0x1

    goto :goto_1e

    :cond_1d
    const/4 v0, 0x0

    .line 43
    :goto_1e
    const-string v1, "Invalid latitude or longitude"

    invoke-static {v0, v1}, Lo/buildTypeSerializer;->write(ZLjava/lang/Object;)V

    .line 46
    iput p1, p0, Landroidx/media3/container/Mp4LocationData;->RemoteActionCompatParcelizer:F

    .line 47
    iput p2, p0, Landroidx/media3/container/Mp4LocationData;->read:F

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Landroidx/media3/container/Mp4LocationData;->RemoteActionCompatParcelizer:F

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    iput p1, p0, Landroidx/media3/container/Mp4LocationData;->read:F

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .registers 3

    .line 30
    invoke-direct {p0, p1}, Landroidx/media3/container/Mp4LocationData;-><init>(Landroid/os/Parcel;)V

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
    if-eqz p1, :cond_23

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_23

    .line 63
    check-cast p1, Landroidx/media3/container/Mp4LocationData;

    .line 64
    iget v1, p0, Landroidx/media3/container/Mp4LocationData;->RemoteActionCompatParcelizer:F

    iget v2, p1, Landroidx/media3/container/Mp4LocationData;->RemoteActionCompatParcelizer:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_23

    iget p0, p0, Landroidx/media3/container/Mp4LocationData;->read:F

    iget p1, p1, Landroidx/media3/container/Mp4LocationData;->read:F

    cmpl-float p0, p0, p1

    if-nez p0, :cond_23

    return v0

    :cond_23
    const/4 p0, 0x0

    return p0
.end method

.method public final hashCode()I
    .registers 2

    .line 70
    iget v0, p0, Landroidx/media3/container/Mp4LocationData;->RemoteActionCompatParcelizer:F

    invoke-static {v0}, Lo/parseMdtaMetadataEntryFromIlst;->read(F)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 71
    iget p0, p0, Landroidx/media3/container/Mp4LocationData;->read:F

    invoke-static {p0}, Lo/parseMdtaMetadataEntryFromIlst;->read(F)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "xyz: latitude="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/media3/container/Mp4LocationData;->RemoteActionCompatParcelizer:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroidx/media3/container/Mp4LocationData;->read:F

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 89
    iget p2, p0, Landroidx/media3/container/Mp4LocationData;->RemoteActionCompatParcelizer:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 90
    iget p0, p0, Landroidx/media3/container/Mp4LocationData;->read:F

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method

###### Class androidx.media3.container.Mp4LocationData.AnonymousClass4 (androidx.media3.container.Mp4LocationData$4)
.class final Landroidx/media3/container/Mp4LocationData$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/container/Mp4LocationData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/container/Mp4LocationData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(I)[Landroidx/media3/container/Mp4LocationData;
    .registers 1

    .line 103
    new-array p0, p0, [Landroidx/media3/container/Mp4LocationData;

    return-object p0
.end method

.method private static read(Landroid/os/Parcel;)Landroidx/media3/container/Mp4LocationData;
    .registers 3

    .line 98
    new-instance v0, Landroidx/media3/container/Mp4LocationData;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/media3/container/Mp4LocationData;-><init>(Landroid/os/Parcel;B)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 94
    invoke-static {p1}, Landroidx/media3/container/Mp4LocationData$4;->read(Landroid/os/Parcel;)Landroidx/media3/container/Mp4LocationData;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 94
    invoke-static {p1}, Landroidx/media3/container/Mp4LocationData$4;->IconCompatParcelizer(I)[Landroidx/media3/container/Mp4LocationData;

    move-result-object p0

    return-object p0
.end method
