###### Class androidx.versionedparcelable.ParcelImpl (androidx.versionedparcelable.ParcelImpl)
.class public Landroidx/versionedparcelable/ParcelImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final RemoteActionCompatParcelizer:Lo/getApplicationInfo;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 60
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl$4;

    invoke-direct {v0}, Landroidx/versionedparcelable/ParcelImpl$4;-><init>()V

    sput-object v0, Landroidx/versionedparcelable/ParcelImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Lo/getApplicationBanner;

    invoke-direct {v0, p1}, Lo/getApplicationBanner;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v0}, Lo/getApplicationBanner;->MediaBrowserCompatCustomActionResultReceiver()Lo/getApplicationInfo;

    move-result-object p1

    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->RemoteActionCompatParcelizer:Lo/getApplicationInfo;

    return-void
.end method

.method public constructor <init>(Lo/getApplicationInfo;)V
    .registers 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->RemoteActionCompatParcelizer:Lo/getApplicationInfo;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/getApplicationInfo;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lo/getApplicationInfo;",
            ">()TT;"
        }
    .end annotation

    .line 46
    iget-object p0, p0, Landroidx/versionedparcelable/ParcelImpl;->RemoteActionCompatParcelizer:Lo/getApplicationInfo;

    return-object p0
.end method

.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 56
    new-instance p2, Lo/getApplicationBanner;

    invoke-direct {p2, p1}, Lo/getApplicationBanner;-><init>(Landroid/os/Parcel;)V

    .line 57
    iget-object p0, p0, Landroidx/versionedparcelable/ParcelImpl;->RemoteActionCompatParcelizer:Lo/getApplicationInfo;

    invoke-virtual {p2, p0}, Lo/getApplicationBanner;->AudioAttributesCompatParcelizer(Lo/getApplicationInfo;)V

    return-void
.end method

###### Class androidx.versionedparcelable.ParcelImpl.AnonymousClass4 (androidx.versionedparcelable.ParcelImpl$4)
.class final Landroidx/versionedparcelable/ParcelImpl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/versionedparcelable/ParcelImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/versionedparcelable/ParcelImpl;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/versionedparcelable/ParcelImpl;
    .registers 2

    .line 63
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    invoke-direct {v0, p0}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(I)[Landroidx/versionedparcelable/ParcelImpl;
    .registers 1

    .line 68
    new-array p0, p0, [Landroidx/versionedparcelable/ParcelImpl;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 60
    invoke-static {p1}, Landroidx/versionedparcelable/ParcelImpl$4;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/versionedparcelable/ParcelImpl;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 60
    invoke-static {p1}, Landroidx/versionedparcelable/ParcelImpl$4;->write(I)[Landroidx/versionedparcelable/ParcelImpl;

    move-result-object p0

    return-object p0
.end method
