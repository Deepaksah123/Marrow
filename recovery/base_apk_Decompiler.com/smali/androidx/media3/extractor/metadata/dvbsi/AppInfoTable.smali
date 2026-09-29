###### Class androidx.media3.extractor.metadata.dvbsi.AppInfoTable (androidx.media3.extractor.metadata.dvbsi.AppInfoTable)
.class public final Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Metadata$Entry;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final RemoteActionCompatParcelizer:I

.field public final write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 69
    new-instance v0, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable$4;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable$4;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .registers 3

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p1, p0, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;->RemoteActionCompatParcelizer:I

    .line 50
    iput-object p2, p0, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;->write:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ait(controlCode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;->write:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 65
    iget-object p2, p0, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    iget p0, p0, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.media3.extractor.metadata.dvbsi.AppInfoTable.AnonymousClass4 (androidx.media3.extractor.metadata.dvbsi.AppInfoTable$4)
.class final Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;
    .registers 1

    .line 80
    new-array p0, p0, [Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;

    return-object p0
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;
    .registers 3

    .line 73
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 74
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    .line 75
    new-instance v1, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;

    invoke-direct {v1, p0, v0}, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;-><init>(ILjava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 70
    invoke-static {p1}, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable$4;->IconCompatParcelizer(Landroid/os/Parcel;)Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 70
    invoke-static {p1}, Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable$4;->AudioAttributesCompatParcelizer(I)[Landroidx/media3/extractor/metadata/dvbsi/AppInfoTable;

    move-result-object p0

    return-object p0
.end method
