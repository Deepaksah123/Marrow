###### Class com.facebook.Profile (com.facebook.Profile)
.class public final Lcom/facebook/Profile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/Profile$AudioAttributesCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BE\u0008\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bB\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\n\u0010\rB\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0096\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001eR\u0013\u0010!\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001eR\u0013\u0010 \u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u001eR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001e"
    }
    d2 = {
        "Lcom/facebook/Profile;",
        "Landroid/os/Parcelable;",
        "",
        "p0",
        "p1",
        "p2",
        "p3",
        "p4",
        "Landroid/net/Uri;",
        "p5",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V",
        "Lorg/json/JSONObject;",
        "(Lorg/json/JSONObject;)V",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "",
        "describeContents",
        "()I",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "AudioAttributesCompatParcelizer",
        "()Lorg/json/JSONObject;",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "write",
        "Ljava/lang/String;",
        "RemoteActionCompatParcelizer",
        "IconCompatParcelizer",
        "read",
        "AudioAttributesImplApi21Parcelizer",
        "Landroid/net/Uri;",
        "MediaBrowserCompatCustomActionResultReceiver",
        "AudioAttributesImplBaseParcelizer"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final AudioAttributesCompatParcelizer:Lcom/facebook/Profile$AudioAttributesCompatParcelizer;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/Profile;",
            ">;"
        }
    .end annotation
.end field

.field private static final read:Ljava/lang/String;


# instance fields
.field private final AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

.field private final AudioAttributesImplBaseParcelizer:Ljava/lang/String;

.field private final IconCompatParcelizer:Ljava/lang/String;

.field private final MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private final RemoteActionCompatParcelizer:Ljava/lang/String;

.field private final write:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/facebook/Profile$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/Profile$AudioAttributesCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/facebook/Profile;->AudioAttributesCompatParcelizer:Lcom/facebook/Profile$AudioAttributesCompatParcelizer;

    .line 208
    const-string v0, ""

    const-string v1, "Profile"

    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, Lcom/facebook/Profile;->read:Ljava/lang/String;

    .line 279
    new-instance v0, Lcom/facebook/Profile$IconCompatParcelizer;

    invoke-direct {v0}, Lcom/facebook/Profile$IconCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/facebook/Profile;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    .line 186
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->write:Ljava/lang/String;

    .line 187
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 188
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 189
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 190
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_29

    const/4 p1, 0x0

    goto :goto_2d

    .line 191
    :cond_29
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_2d
    iput-object p1, p0, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/Profile;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V
    .registers 8

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "id"

    invoke-static {p1, v0}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->write(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    iput-object p1, p0, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    .line 98
    iput-object p2, p0, Lcom/facebook/Profile;->write:Ljava/lang/String;

    .line 99
    iput-object p3, p0, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 100
    iput-object p4, p0, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 101
    iput-object p5, p0, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 102
    iput-object p6, p0, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    .line 176
    const-string v0, "first_name"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->write:Ljava/lang/String;

    .line 177
    const-string v0, "middle_name"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 178
    const-string v0, "last_name"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 179
    const-string v0, "name"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    .line 180
    const-string v0, "link_uri"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3a

    goto :goto_3e

    .line 181
    :cond_3a
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    :goto_3e
    iput-object v1, p0, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    return-void
.end method

.method public static final IconCompatParcelizer()V
    .registers 1
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 280
    sget-object v0, Lcom/facebook/Profile;->AudioAttributesCompatParcelizer:Lcom/facebook/Profile$AudioAttributesCompatParcelizer;

    invoke-virtual {v0}, Lcom/facebook/Profile$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method public static final synthetic read()Ljava/lang/String;
    .registers 1

    .line 35
    sget-object v0, Lcom/facebook/Profile;->read:Ljava/lang/String;

    return-object v0
.end method

.method public static final write()Lcom/facebook/Profile;
    .registers 1
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 281
    invoke-static {}, Lcom/facebook/Profile$AudioAttributesCompatParcelizer;->IconCompatParcelizer()Lcom/facebook/Profile;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lorg/json/JSONObject;
    .registers 4

    .line 157
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 159
    :try_start_5
    const-string v1, "id"

    iget-object v2, p0, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 160
    const-string v1, "first_name"

    iget-object v2, p0, Lcom/facebook/Profile;->write:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 161
    const-string v1, "middle_name"

    iget-object v2, p0, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    const-string v1, "last_name"

    iget-object v2, p0, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    const-string v1, "name"

    iget-object v2, p0, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 164
    iget-object p0, p0, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    if-eqz p0, :cond_35

    .line 165
    const-string v1, "link_uri"

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_35
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_35} :catch_36

    :cond_35
    return-object v0

    :catch_36
    const/4 p0, 0x0

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 6

    .line 120
    move-object v0, p0

    check-cast v0, Lcom/facebook/Profile;

    const/4 v0, 0x1

    if-ne p0, p1, :cond_7

    return v0

    .line 123
    :cond_7
    instance-of v1, p1, Lcom/facebook/Profile;

    const/4 v2, 0x0

    if-nez v1, :cond_d

    return v2

    .line 132
    :cond_d
    iget-object v1, p0, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    if-nez v1, :cond_18

    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    if-eqz v3, :cond_23

    :cond_18
    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_91

    :cond_23
    iget-object v1, p0, Lcom/facebook/Profile;->write:Ljava/lang/String;

    if-nez v1, :cond_2e

    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->write:Ljava/lang/String;

    if-eqz v3, :cond_39

    :cond_2e
    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->write:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_91

    :cond_39
    iget-object v1, p0, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    if-nez v1, :cond_44

    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    if-eqz v3, :cond_4f

    :cond_44
    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_91

    :cond_4f
    iget-object v1, p0, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-nez v1, :cond_5a

    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz v3, :cond_65

    :cond_5a
    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_91

    :cond_65
    iget-object v1, p0, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    if-nez v1, :cond_70

    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    if-eqz v3, :cond_7b

    :cond_70
    move-object v3, p1

    check-cast v3, Lcom/facebook/Profile;

    iget-object v3, v3, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_91

    :cond_7b
    iget-object p0, p0, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    if-nez p0, :cond_86

    move-object v1, p1

    check-cast v1, Lcom/facebook/Profile;

    iget-object v1, v1, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    if-eqz v1, :cond_90

    :cond_86
    check-cast p1, Lcom/facebook/Profile;

    iget-object p1, p1, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    invoke-static {p0, p1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_91

    :cond_90
    return v0

    :cond_91
    return v2
.end method

.method public final hashCode()I
    .registers 3

    .line 137
    iget-object v0, p0, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    add-int/lit16 v0, v0, 0x20f

    .line 138
    iget-object v1, p0, Lcom/facebook/Profile;->write:Ljava/lang/String;

    if-eqz v1, :cond_17

    mul-int/lit8 v0, v0, 0x1f

    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 141
    :cond_17
    iget-object v1, p0, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    if-eqz v1, :cond_22

    mul-int/lit8 v0, v0, 0x1f

    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 144
    :cond_22
    iget-object v1, p0, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    if-eqz v1, :cond_2d

    mul-int/lit8 v0, v0, 0x1f

    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 147
    :cond_2d
    iget-object v1, p0, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    if-eqz v1, :cond_38

    mul-int/lit8 v0, v0, 0x1f

    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 150
    :cond_38
    iget-object p0, p0, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    if-eqz p0, :cond_43

    mul-int/lit8 v0, v0, 0x1f

    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    :cond_43
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, ""

    invoke-static {p1, p2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    iget-object p2, p0, Lcom/facebook/Profile;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 200
    iget-object p2, p0, Lcom/facebook/Profile;->write:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 201
    iget-object p2, p0, Lcom/facebook/Profile;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 202
    iget-object p2, p0, Lcom/facebook/Profile;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 203
    iget-object p2, p0, Lcom/facebook/Profile;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 204
    iget-object p0, p0, Lcom/facebook/Profile;->AudioAttributesImplApi21Parcelizer:Landroid/net/Uri;

    if-eqz p0, :cond_27

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_28

    :cond_27
    const/4 p0, 0x0

    :goto_28
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.facebook.Profile.Companion (com.facebook.Profile$AudioAttributesCompatParcelizer)
.class public final Lcom/facebook/Profile$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/Profile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u0007\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\nR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b8\u0006\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0005\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010"
    }
    d2 = {
        "Lcom/facebook/Profile$AudioAttributesCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "",
        "AudioAttributesCompatParcelizer",
        "Lcom/facebook/Profile;",
        "IconCompatParcelizer",
        "()Lcom/facebook/Profile;",
        "p0",
        "(Lcom/facebook/Profile;)V",
        "Landroid/os/Parcelable$Creator;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;",
        "",
        "read",
        "Ljava/lang/String;"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 207
    invoke-direct {p0}, Lcom/facebook/Profile$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

.method public static IconCompatParcelizer()Lcom/facebook/Profile;
    .registers 1
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 223
    sget-object v0, Lo/lambdaonPlayerErrorChanged42;->RemoteActionCompatParcelizer:Lo/lambdaonPlayerErrorChanged42$RemoteActionCompatParcelizer;

    invoke-virtual {v0}, Lo/lambdaonPlayerErrorChanged42$RemoteActionCompatParcelizer;->read()Lo/lambdaonPlayerErrorChanged42;

    move-result-object v0

    invoke-virtual {v0}, Lo/lambdaonPlayerErrorChanged42;->IconCompatParcelizer()Lcom/facebook/Profile;

    move-result-object v0

    return-object v0
.end method

.method public static IconCompatParcelizer(Lcom/facebook/Profile;)V
    .registers 2
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 234
    sget-object v0, Lo/lambdaonPlayerErrorChanged42;->RemoteActionCompatParcelizer:Lo/lambdaonPlayerErrorChanged42$RemoteActionCompatParcelizer;

    invoke-virtual {v0}, Lo/lambdaonPlayerErrorChanged42$RemoteActionCompatParcelizer;->read()Lo/lambdaonPlayerErrorChanged42;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/lambdaonPlayerErrorChanged42;->IconCompatParcelizer(Lcom/facebook/Profile;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 244
    sget-object v0, Lcom/facebook/AccessToken;->RemoteActionCompatParcelizer:Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;

    invoke-static {}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->read()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_25

    .line 245
    sget-object v1, Lcom/facebook/AccessToken;->RemoteActionCompatParcelizer:Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;

    invoke-static {}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Z

    move-result v1

    if-nez v1, :cond_17

    .line 246
    check-cast p0, Lcom/facebook/Profile$AudioAttributesCompatParcelizer;

    const/4 p0, 0x0

    invoke-static {p0}, Lcom/facebook/Profile$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Lcom/facebook/Profile;)V

    return-void

    .line 250
    :cond_17
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem()Ljava/lang/String;

    move-result-object p0

    .line 251
    new-instance v0, Lcom/facebook/Profile$AudioAttributesCompatParcelizer$IconCompatParcelizer;

    invoke-direct {v0}, Lcom/facebook/Profile$AudioAttributesCompatParcelizer$IconCompatParcelizer;-><init>()V

    check-cast v0, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker$write;

    .line 249
    invoke-static {p0, v0}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->read(Ljava/lang/String;Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker$write;)V

    :cond_25
    return-void
.end method

###### Class com.facebook.Profile.Companion.IconCompatParcelizer (com.facebook.Profile$AudioAttributesCompatParcelizer$IconCompatParcelizer)
.class public final Lcom/facebook/Profile$AudioAttributesCompatParcelizer$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/Profile$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lorg/json/JSONObject;)V
    .registers 10

    const/4 p0, 0x0

    if-eqz p1, :cond_b

    .line 253
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto :goto_c

    :cond_b
    move-object v2, p0

    :goto_c
    if-nez v2, :cond_12

    .line 255
    invoke-static {}, Lcom/facebook/Profile;->read()Ljava/lang/String;

    return-void

    .line 258
    :cond_12
    const-string v0, "link"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 262
    const-string v1, "first_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 263
    const-string v1, "middle_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 264
    const-string v1, "last_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 265
    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v0, :cond_36

    .line 266
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    :cond_36
    move-object v7, p0

    .line 260
    new-instance p0, Lcom/facebook/Profile;

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/facebook/Profile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V

    .line 267
    sget-object p1, Lcom/facebook/Profile;->AudioAttributesCompatParcelizer:Lcom/facebook/Profile$AudioAttributesCompatParcelizer;

    invoke-static {p0}, Lcom/facebook/Profile$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Lcom/facebook/Profile;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/lambdaonMetadata50;)V
    .registers 2

    .line 271
    invoke-static {}, Lcom/facebook/Profile;->read()Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method

###### Class com.facebook.Profile.IconCompatParcelizer (com.facebook.Profile$IconCompatParcelizer)
.class public final Lcom/facebook/Profile$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/Profile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/facebook/Profile;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Lcom/facebook/Profile;
    .registers 1

    .line 285
    new-array p0, p0, [Lcom/facebook/Profile;

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Lcom/facebook/Profile;
    .registers 3

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    new-instance v0, Lcom/facebook/Profile;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/Profile;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 279
    invoke-static {p1}, Lcom/facebook/Profile$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Lcom/facebook/Profile;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 279
    invoke-static {p1}, Lcom/facebook/Profile$IconCompatParcelizer;->AudioAttributesCompatParcelizer(I)[Lcom/facebook/Profile;

    move-result-object p0

    return-object p0
.end method
