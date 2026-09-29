###### Class android.support.v4.media.session.ParcelableVolumeInfo (android.support.v4.media.session.ParcelableVolumeInfo)
.class public Landroid/support/v4/media/session/ParcelableVolumeInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/session/ParcelableVolumeInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public AudioAttributesCompatParcelizer:I

.field public IconCompatParcelizer:I

.field public RemoteActionCompatParcelizer:I

.field public read:I

.field public write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 67
    new-instance v0, Landroid/support/v4/media/session/ParcelableVolumeInfo$5;

    invoke-direct {v0}, Landroid/support/v4/media/session/ParcelableVolumeInfo$5;-><init>()V

    sput-object v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->AudioAttributesCompatParcelizer:I

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->IconCompatParcelizer:I

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->read:I

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->RemoteActionCompatParcelizer:I

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->write:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 59
    iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 61
    iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->read:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    iget p0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->write:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class android.support.v4.media.session.ParcelableVolumeInfo.AnonymousClass5 (android.support.v4.media.session.ParcelableVolumeInfo$5)
.class final Landroid/support/v4/media/session/ParcelableVolumeInfo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/ParcelableVolumeInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/session/ParcelableVolumeInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/session/ParcelableVolumeInfo;
    .registers 2

    .line 71
    new-instance v0, Landroid/support/v4/media/session/ParcelableVolumeInfo;

    invoke-direct {v0, p0}, Landroid/support/v4/media/session/ParcelableVolumeInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(I)[Landroid/support/v4/media/session/ParcelableVolumeInfo;
    .registers 1

    .line 76
    new-array p0, p0, [Landroid/support/v4/media/session/ParcelableVolumeInfo;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 68
    invoke-static {p1}, Landroid/support/v4/media/session/ParcelableVolumeInfo$5;->IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/session/ParcelableVolumeInfo;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 68
    invoke-static {p1}, Landroid/support/v4/media/session/ParcelableVolumeInfo$5;->write(I)[Landroid/support/v4/media/session/ParcelableVolumeInfo;

    move-result-object p0

    return-object p0
.end method
