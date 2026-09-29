###### Class com.clevertap.android.sdk.inapp.CTInAppNotificationButton (com.clevertap.android.sdk.inapp.CTInAppNotificationButton)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$IconCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0096\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\nR\u0017\u0010\u0019\u001a\u00020\u00148\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0017\u001a\u00020\u00148\u0001X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00148\u0001X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00148\u0001X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0001X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u0018R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u001e8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001f"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;",
        "Landroid/os/Parcelable;",
        "Lorg/json/JSONObject;",
        "p0",
        "<init>",
        "(Lorg/json/JSONObject;)V",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "",
        "describeContents",
        "()I",
        "p1",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "",
        "AudioAttributesImplBaseParcelizer",
        "Ljava/lang/String;",
        "read",
        "()Ljava/lang/String;",
        "IconCompatParcelizer",
        "write",
        "RemoteActionCompatParcelizer",
        "AudioAttributesCompatParcelizer",
        "AudioAttributesImplApi26Parcelizer",
        "Lcom/clevertap/android/sdk/inapp/CTInAppAction;",
        "Lcom/clevertap/android/sdk/inapp/CTInAppAction;"
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
            "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;",
            ">;"
        }
    .end annotation
.end field

.field public static final IconCompatParcelizer:Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$IconCompatParcelizer;


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private final AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

.field private final AudioAttributesImplBaseParcelizer:Ljava/lang/String;

.field private final RemoteActionCompatParcelizer:Ljava/lang/String;

.field public final read:Lcom/clevertap/android/sdk/inapp/CTInAppAction;

.field private final write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$IconCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$IconCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->IconCompatParcelizer:Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$IconCompatParcelizer;

    .line 89
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$RemoteActionCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 5

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_c

    move-object v0, v1

    :cond_c
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_16

    const-string v0, "#0000FF"

    :cond_16
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "#FFFFFF"

    if-nez v0, :cond_21

    move-object v0, v2

    :cond_21
    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->write:Ljava/lang/String;

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2a

    goto :goto_2b

    :cond_2a
    move-object v2, v0

    :goto_2b
    iput-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_34

    goto :goto_35

    :cond_34
    move-object v1, v0

    :goto_35
    iput-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 39
    const-class v0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->read:Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 90
    invoke-direct {p0, p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 26
    const-string v0, "color"

    const-string v1, "#0000FF"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 27
    const-string v0, "bg"

    const-string v1, "#FFFFFF"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->write:Ljava/lang/String;

    .line 28
    const-string v0, "border"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 29
    const-string v0, "radius"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 30
    sget-object v0, Lcom/clevertap/android/sdk/inapp/CTInAppAction;->CREATOR:Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;

    const-string v0, "actions"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppAction$IconCompatParcelizer;->IconCompatParcelizer(Lorg/json/JSONObject;)Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    move-result-object p1

    iput-object p1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->read:Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 19
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 13
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->write:Ljava/lang/String;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 15
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->RemoteActionCompatParcelizer:Ljava/lang/String;

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

    .line 61
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

    .line 63
    :cond_18
    const-string v1, ""

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;

    .line 65
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->write:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->write:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    .line 66
    :cond_2a
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    return v2

    .line 67
    :cond_35
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    return v2

    .line 68
    :cond_40
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4b

    return v2

    .line 69
    :cond_4b
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_56

    return v2

    .line 70
    :cond_56
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->read:Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    iget-object p1, p1, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->read:Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    invoke-static {p0, p1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_61

    return v2

    :cond_61
    return v0
.end method

.method public final hashCode()I
    .registers 6

    .line 76
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->write:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 77
    iget-object v1, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 78
    iget-object v2, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    .line 79
    iget-object v3, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    .line 80
    iget-object v4, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    .line 81
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->read:Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    if-eqz p0, :cond_27

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    goto :goto_28

    :cond_27
    const/4 p0, 0x0

    :goto_28
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, p0

    return v0
.end method

.method public final read()Ljava/lang/String;
    .registers 1

    .line 11
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 17
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->write:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    iget-object p0, p0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;->read:Lcom/clevertap/android/sdk/inapp/CTInAppAction;

    check-cast p0, Landroid/os/Parcelable;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppNotificationButton.Companion (com.clevertap.android.sdk.inapp.CTInAppNotificationButton$IconCompatParcelizer)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$IconCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;",
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

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 87
    invoke-direct {p0}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$IconCompatParcelizer;-><init>()V

    return-void
.end method

###### Class com.clevertap.android.sdk.inapp.CTInAppNotificationButton.RemoteActionCompatParcelizer (com.clevertap.android.sdk.inapp.CTInAppNotificationButton$RemoteActionCompatParcelizer)
.class public final Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;
    .registers 3

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    new-instance v0, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0
.end method

.method private static write(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;
    .registers 1

    .line 95
    new-array p0, p0, [Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 89
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 89
    invoke-static {p1}, Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton$RemoteActionCompatParcelizer;->write(I)[Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;

    move-result-object p0

    return-object p0
.end method
