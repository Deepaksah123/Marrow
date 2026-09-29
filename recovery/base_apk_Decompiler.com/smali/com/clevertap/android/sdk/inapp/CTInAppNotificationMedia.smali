###### Class com.clevertap.android.sdk.inapp.CTInAppNotificationMedia (com.clevertap.android.sdk.inapp.CTInAppNotificationMedia)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0001 B3\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\t\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00122\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0019H\u0096\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u000eR\"\u0010\u001e\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001dR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u001d\u001a\u0004\u0008 \u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001dR\u001a\u0010\u0015\u001a\u00020\u00078\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\"\u0010\u000e"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
        "Landroid/os/Parcelable;",
        "",
        "p0",
        "p1",
        "p2",
        "p3",
        "",
        "p4",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "describeContents",
        "()I",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "",
        "read",
        "()Z",
        "AudioAttributesCompatParcelizer",
        "AudioAttributesImplApi21Parcelizer",
        "AudioAttributesImplBaseParcelizer",
        "MediaBrowserCompatCustomActionResultReceiver",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "Ljava/lang/String;",
        "RemoteActionCompatParcelizer",
        "()Ljava/lang/String;",
        "write",
        "(Ljava/lang/String;)V",
        "IconCompatParcelizer",
        "AudioAttributesImplApi26Parcelizer",
        "I"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
            ">;"
        }
    .end annotation
.end field

.field public static final write:Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private final AudioAttributesImplApi26Parcelizer:I

.field private final IconCompatParcelizer:Ljava/lang/String;

.field private final RemoteActionCompatParcelizer:Ljava/lang/String;

.field private final read:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->write:Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;

    .line 98
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$read;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$read;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_c

    move-object v0, v1

    :cond_c
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_15

    move-object v0, v1

    :cond_15
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1e

    goto :goto_1f

    :cond_1e
    move-object v1, v0

    :goto_1f
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplApi26Parcelizer:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 99
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 7

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    .line 26
    iput-object p3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read:Ljava/lang/String;

    .line 27
    iput-object p4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 28
    iput p5, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplApi26Parcelizer:I

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Z
    .registers 2

    .line 56
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lo/TestGroupLSModel;->IconCompatParcelizer(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_16

    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    const-string v0, "image/gif"

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()Z
    .registers 3

    .line 60
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lo/TestGroupLSModel;->IconCompatParcelizer(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    const-string v1, "image"

    invoke-static {v0, v1}, Lo/TestGroupLSModel;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    const-string v0, "image/gif"

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_20
    const/4 p0, 0x0

    return p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Z
    .registers 2

    .line 64
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lo/TestGroupLSModel;->IconCompatParcelizer(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_16

    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    const-string v0, "video"

    invoke-static {p0, v0}, Lo/TestGroupLSModel;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public final IconCompatParcelizer()I
    .registers 1

    .line 15
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplApi26Parcelizer:I

    return p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Z
    .registers 2

    .line 68
    invoke-virtual {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplBaseParcelizer()Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read()Z

    move-result p0

    if-nez p0, :cond_e

    const/4 p0, 0x0

    return p0

    :cond_e
    const/4 p0, 0x1

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 11
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 73
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_10

    :cond_f
    const/4 v2, 0x0

    :goto_10
    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_18

    return v2

    .line 75
    :cond_18
    const-string v1, ""

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    .line 77
    iget v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplApi26Parcelizer:I

    iget v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplApi26Parcelizer:I

    if-eq v1, v3, :cond_26

    return v2

    .line 78
    :cond_26
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    return v2

    .line 79
    :cond_31
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3c

    return v2

    .line 80
    :cond_3c
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    return v2

    .line 81
    :cond_47
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object p1, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-static {p0, p1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_52

    return v2

    :cond_52
    return v0
.end method

.method public final hashCode()I
    .registers 5

    .line 87
    iget v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplApi26Parcelizer:I

    .line 88
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 89
    iget-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    .line 90
    iget-object v3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    .line 91
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz p0, :cond_1d

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    goto :goto_1e

    :cond_1d
    const/4 p0, 0x0

    :goto_1e
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, p0

    return v0
.end method

.method public final read()Z
    .registers 2

    .line 52
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lo/TestGroupLSModel;->IconCompatParcelizer(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_16

    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    const-string v0, "audio"

    invoke-static {p0, v0}, Lo/TestGroupLSModel;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 13
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read:Ljava/lang/String;

    return-object p0
.end method

.method public final write(Ljava/lang/String;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, ""

    invoke-static {p1, p2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    iget-object p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    iget-object p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->read:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 47
    iget-object p2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    iget p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppNotificationMedia.read (com.clevertap.android.sdk.inapp.CTInAppNotificationMedia$read)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;
    .registers 3

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0
.end method

.method private static write(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;
    .registers 1

    .line 104
    new-array p0, p0, [Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 98
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$read;->IconCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 98
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$read;->write(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    move-result-object p0

    return-object p0
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppNotificationMedia.Companion (com.clevertap.android.sdk.inapp.CTInAppNotificationMedia$write)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "write"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b8\u0006\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;",
        "",
        "<init>",
        "()V",
        "Lorg/json/JSONObject;",
        "p0",
        "",
        "p1",
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
        "IconCompatParcelizer",
        "(Lorg/json/JSONObject;I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;",
        "Landroid/os/Parcelable$Creator;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 127
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia$write;-><init>()V

    return-void
.end method

.method public static IconCompatParcelizer(Lorg/json/JSONObject;I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;
    .registers 9
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    const-string v0, "content_type"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 111
    invoke-static {v3}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    move-object v0, v3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lo/TestGroupLSModel;->IconCompatParcelizer(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_19

    return-object v1

    .line 114
    :cond_19
    const-string v0, "url"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 117
    invoke-static {v2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lo/TestGroupLSModel;->IconCompatParcelizer(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4e

    .line 118
    const-string v0, "image"

    invoke-static {v3, v0}, Lo/TestGroupLSModel;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4e

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "key"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_4f

    :cond_4e
    move-object v5, v1

    .line 122
    :goto_4f
    const-string v0, "alt_text"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 126
    invoke-static {v4}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 123
    new-instance p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object p0
.end method
