###### Class com.clevertap.android.sdk.CTInboxStyleConfig (com.clevertap.android.sdk.CTInboxStyleConfig)
.class public Lcom/clevertap/android/sdk/CTInboxStyleConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/clevertap/android/sdk/CTInboxStyleConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

.field private AudioAttributesImplBaseParcelizer:Ljava/lang/String;

.field private IconCompatParcelizer:Ljava/lang/String;

.field private MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private MediaBrowserCompatItemReceiver:Ljava/lang/String;

.field private MediaBrowserCompatMediaItem:Ljava/lang/String;

.field private MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

.field private MediaDescriptionCompat:[Ljava/lang/String;

.field private RemoteActionCompatParcelizer:Ljava/lang/String;

.field private read:Ljava/lang/String;

.field private write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 17
    new-instance v0, Lcom/clevertap/android/sdk/CTInboxStyleConfig$3;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/CTInboxStyleConfig$3;-><init>()V

    sput-object v0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const-string v0, "#FFFFFF"

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 60
    const-string v1, "App Inbox"

    iput-object v1, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->IconCompatParcelizer:Ljava/lang/String;

    .line 61
    const-string v1, "#333333"

    iput-object v1, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    .line 62
    const-string v2, "#D3D4DA"

    iput-object v2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 63
    iput-object v1, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->read:Ljava/lang/String;

    .line 64
    const-string v1, "#1C84FE"

    iput-object v1, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 65
    const-string v2, "#808080"

    iput-object v2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    .line 66
    iput-object v1, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 67
    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    const/4 v0, 0x0

    .line 68
    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaDescriptionCompat:[Ljava/lang/String;

    .line 69
    const-string v0, "No Message(s) to show"

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 70
    const-string v0, "#000000"

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 71
    const-string v0, "ALL"

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->write:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->IconCompatParcelizer:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaDescriptionCompat:[Ljava/lang/String;

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->read:Ljava/lang/String;

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    .line 101
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->write:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 138
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Ljava/lang/String;
    .registers 1

    .line 177
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Ljava/lang/String;
    .registers 1

    .line 229
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Ljava/lang/String;
    .registers 1

    .line 190
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 125
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->write:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Ljava/lang/String;
    .registers 1

    .line 216
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()Ljava/lang/String;
    .registers 1

    .line 203
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatMediaItem()Ljava/lang/String;
    .registers 1

    .line 242
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()Z
    .registers 1

    .line 292
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaDescriptionCompat:[Ljava/lang/String;

    if-eqz p0, :cond_9

    array-length p0, p0

    if-lez p0, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public final MediaDescriptionCompat()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 255
    iget-object v0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaDescriptionCompat:[Ljava/lang/String;

    if-nez v0, :cond_a

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_a
    new-instance v0, Ljava/util/ArrayList;

    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaDescriptionCompat:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final MediaMetadataCompat()Ljava/lang/String;
    .registers 1

    .line 279
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 112
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->read:Ljava/lang/String;

    return-object p0
.end method

.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()Ljava/lang/String;
    .registers 1

    .line 164
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->IconCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 151
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 297
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 298
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 299
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 300
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 301
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaDescriptionCompat:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 302
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 303
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 304
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 305
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplApi21Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 306
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 307
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 308
    iget-object p2, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 309
    iget-object p0, p0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;->write:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.clevertap.android.sdk.CTInboxStyleConfig.AnonymousClass3 (com.clevertap.android.sdk.CTInboxStyleConfig$3)
.class final Lcom/clevertap/android/sdk/CTInboxStyleConfig$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/CTInboxStyleConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/CTInboxStyleConfig;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static write(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/CTInboxStyleConfig;
    .registers 2

    .line 21
    new-instance v0, Lcom/clevertap/android/sdk/CTInboxStyleConfig;

    invoke-direct {v0, p0}, Lcom/clevertap/android/sdk/CTInboxStyleConfig;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static write(I)[Lcom/clevertap/android/sdk/CTInboxStyleConfig;
    .registers 1

    .line 26
    new-array p0, p0, [Lcom/clevertap/android/sdk/CTInboxStyleConfig;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 18
    invoke-static {p1}, Lcom/clevertap/android/sdk/CTInboxStyleConfig$3;->write(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/CTInboxStyleConfig;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 18
    invoke-static {p1}, Lcom/clevertap/android/sdk/CTInboxStyleConfig$3;->write(I)[Lcom/clevertap/android/sdk/CTInboxStyleConfig;

    move-result-object p0

    return-object p0
.end method
